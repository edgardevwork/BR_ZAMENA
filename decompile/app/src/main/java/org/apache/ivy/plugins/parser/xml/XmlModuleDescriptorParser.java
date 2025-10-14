package org.apache.ivy.plugins.parser.xml;

import androidx.constraintlayout.motion.widget.MotionScene;
import com.caverock.androidsvg.SVG;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.ConfigurationAware;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DefaultDependencyArtifactDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultExcludeRule;
import org.apache.ivy.core.module.descriptor.DefaultExtendsDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultIncludeRule;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyArtifactDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ExcludeRule;
import org.apache.ivy.core.module.descriptor.ExtraInfoHolder;
import org.apache.ivy.core.module.descriptor.IncludeRule;
import org.apache.ivy.core.module.descriptor.License;
import org.apache.ivy.core.module.descriptor.MDArtifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.descriptor.OverrideDependencyDescriptorMediator;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolveEngine;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.conflict.FixedConflictManager;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.namespace.NameSpaceHelper;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.AbstractModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ModuleDescriptorParserRegistry;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.file.FileResource;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.FileUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.XMLHelper;
import org.apache.ivy.util.extendable.ExtendableItemHelper;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes8.dex */
public class XmlModuleDescriptorParser extends AbstractModuleDescriptorParser {
    public static final List<String> DEPENDENCY_REGULAR_ATTRIBUTES = Arrays.asList("org", "name", IvyPatternHelper.BRANCH_KEY, "branchConstraint", "rev", "revConstraint", "force", "transitive", "changing", IvyPatternHelper.CONF_KEY);
    public static final XmlModuleDescriptorParser INSTANCE = new XmlModuleDescriptorParser();

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public boolean accept(Resource resource) {
        return true;
    }

    public static XmlModuleDescriptorParser getInstance() {
        return INSTANCE;
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, Resource resource, boolean z) throws IOException, ParseException {
        Parser parserNewParser = newParser(parserSettings);
        parserNewParser.setValidate(z);
        parserNewParser.setResource(resource);
        parserNewParser.setInput(url);
        parserNewParser.parse();
        return parserNewParser.getModuleDescriptor();
    }

    public ModuleDescriptor parseDescriptor(ParserSettings parserSettings, InputStream inputStream, Resource resource, boolean z) throws ParseException {
        Parser parserNewParser = newParser(parserSettings);
        parserNewParser.setValidate(z);
        parserNewParser.setResource(resource);
        parserNewParser.setInput(inputStream);
        parserNewParser.parse();
        return parserNewParser.getModuleDescriptor();
    }

    public Parser newParser(ParserSettings parserSettings) {
        return new Parser(this, parserSettings);
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public void toIvyFile(InputStream inputStream, Resource resource, File file, ModuleDescriptor moduleDescriptor) throws IOException, ParseException {
        try {
            try {
                XmlModuleDescriptorUpdater.update(inputStream, resource, file, new UpdateOptions().setSettings(IvyContext.getContext().getSettings()).setStatus(moduleDescriptor.getStatus()).setRevision(moduleDescriptor.getResolvedModuleRevisionId().getRevision()).setPubdate(moduleDescriptor.getResolvedPublicationDate()).setUpdateBranch(false).setNamespace(moduleDescriptor instanceof DefaultModuleDescriptor ? ((DefaultModuleDescriptor) moduleDescriptor).getNamespace() : null));
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (SAXException e) {
                ParseException parseException = new ParseException("exception occurred while parsing " + resource, 0);
                parseException.initCause(e);
                throw parseException;
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th;
        }
    }

    /* loaded from: classes5.dex */
    public static class Parser extends AbstractModuleDescriptorParser.AbstractParser {
        public static final List<String> ALLOWED_VERSIONS = Arrays.asList("1.0", "1.1", "1.2", "1.3", SVG.VERSION, "2.0", "2.1", "2.2", "2.3", "2.4");
        public MDArtifact artifact;
        public boolean artifactsDeclared;
        public StringBuilder buffer;
        public String conf;
        public ConfigurationAware confAware;

        /* renamed from: dd */
        public DefaultDependencyDescriptor f9998dd;
        public PatternMatcher defaultMatcher;
        public InputStream descriptorInput;
        public URL descriptorURL;
        public String descriptorVersion;
        public Stack<ExtraInfoHolder> extraInfoStack;
        public String[] publicationsDefaultConf;
        public ParserSettings settings;
        public int state;
        public boolean validate;

        /* loaded from: classes6.dex */
        public static final class State {
            public static final int ARTIFACT_EXCLUDE = 7;
            public static final int ARTIFACT_INCLUDE = 6;
            public static final int CONF = 2;
            public static final int CONFLICT = 8;
            public static final int DEP = 4;
            public static final int DEPS = 10;
            public static final int DEP_ARTIFACT = 5;
            public static final int DESCRIPTION = 11;
            public static final int EXCLUDE = 9;
            public static final int EXTRA_INFO = 12;
            public static final int INFO = 1;
            public static final int NONE = 0;
            public static final int PUB = 3;
        }

        public static String mergeValue(String str, String str2) {
            return str2 == null ? str : str2;
        }

        @Override // org.apache.ivy.plugins.parser.AbstractModuleDescriptorParser.AbstractParser, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public /* bridge */ /* synthetic */ void error(SAXParseException sAXParseException) {
            super.error(sAXParseException);
        }

        @Override // org.apache.ivy.plugins.parser.AbstractModuleDescriptorParser.AbstractParser, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public /* bridge */ /* synthetic */ void fatalError(SAXParseException sAXParseException) throws SAXException {
            super.fatalError(sAXParseException);
        }

        @Override // org.apache.ivy.plugins.parser.AbstractModuleDescriptorParser.AbstractParser
        public /* bridge */ /* synthetic */ ModuleDescriptor getModuleDescriptor() throws ParseException {
            return super.getModuleDescriptor();
        }

        @Override // org.apache.ivy.plugins.parser.AbstractModuleDescriptorParser.AbstractParser
        public /* bridge */ /* synthetic */ ModuleDescriptorParser getModuleDescriptorParser() {
            return super.getModuleDescriptorParser();
        }

        @Override // org.apache.ivy.plugins.parser.AbstractModuleDescriptorParser.AbstractParser
        public /* bridge */ /* synthetic */ void setResource(Resource resource) {
            super.setResource(resource);
        }

        @Override // org.apache.ivy.plugins.parser.AbstractModuleDescriptorParser.AbstractParser, org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public /* bridge */ /* synthetic */ void warning(SAXParseException sAXParseException) {
            super.warning(sAXParseException);
        }

        public Parser(ModuleDescriptorParser moduleDescriptorParser, ParserSettings parserSettings) {
            super(moduleDescriptorParser);
            this.validate = true;
            this.state = 0;
            this.artifactsDeclared = false;
            this.extraInfoStack = new Stack<>();
            this.settings = parserSettings;
        }

        public void setInput(InputStream inputStream) {
            this.descriptorInput = inputStream;
        }

        public void setInput(URL url) {
            this.descriptorURL = url;
        }

        public void setValidate(boolean z) {
            this.validate = z;
        }

        public void parse() throws ParseException {
            try {
                URL schemaURL = this.validate ? getSchemaURL() : null;
                URL url = this.descriptorURL;
                if (url != null) {
                    XMLHelper.parse(url, schemaURL, this);
                } else {
                    XMLHelper.parse(this.descriptorInput, schemaURL, this, (LexicalHandler) null);
                }
                checkConfigurations();
                replaceConfigurationWildcards();
                getMd().setModuleArtifact(DefaultArtifact.newIvyArtifact(getMd().getResolvedModuleRevisionId(), getMd().getPublicationDate()));
                if (!this.artifactsDeclared) {
                    for (String str : getMd().getConfigurationsNames()) {
                        getMd().addArtifact(str, new MDArtifact(getMd(), getMd().getModuleRevisionId().getName(), "jar", "jar"));
                    }
                }
                getMd().check();
            } catch (ParserConfigurationException e) {
                throw new IllegalStateException(e.getMessage() + " in " + this.descriptorURL, e);
            } catch (Exception e2) {
                checkErrors();
                ParseException parseException = new ParseException(e2.getMessage() + " in " + this.descriptorURL, 0);
                parseException.initCause(e2);
                throw parseException;
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
            int i;
            try {
                int i2 = 0;
                if (this.state == 11) {
                    StringBuilder buffer = getBuffer();
                    buffer.append("<");
                    buffer.append(str3);
                    while (i2 < attributes.getLength()) {
                        getBuffer().append(" ");
                        getBuffer().append(attributes.getQName(i2));
                        getBuffer().append("=\"");
                        getBuffer().append(attributes.getValue(i2));
                        getBuffer().append("\"");
                        i2++;
                    }
                    getBuffer().append(">");
                    return;
                }
                if ("ivy-module".equals(str3)) {
                    ivyModuleStarted(attributes);
                    return;
                }
                if ("info".equals(str3)) {
                    infoStarted(attributes);
                    return;
                }
                if (this.state == 1 && "extends".equals(str3)) {
                    extendsStarted(attributes);
                    return;
                }
                String str4 = "name";
                if (this.state == 1 && "license".equals(str3)) {
                    getMd().addLicense(new License(this.settings.substitute(attributes.getValue("name")), this.settings.substitute(attributes.getValue("url"))));
                    return;
                }
                if (this.state == 1 && "description".equals(str3)) {
                    getMd().setHomePage(this.settings.substitute(attributes.getValue("homepage")));
                    this.state = 11;
                    this.buffer = new StringBuilder();
                    return;
                }
                if (this.state == 1 && "ivyauthor".equals(str3)) {
                    return;
                }
                if (this.state == 1 && "repository".equals(str3)) {
                    return;
                }
                int i3 = this.state;
                if (i3 != 12 && (i3 != 1 || !isOtherNamespace(str3))) {
                    if ("configurations".equals(str3)) {
                        configurationStarted(attributes);
                        return;
                    }
                    if (ClientConfigurationFields.PUBLICATIONS.equals(str3)) {
                        publicationsStarted(attributes);
                        return;
                    }
                    if ("dependencies".equals(str3)) {
                        dependenciesStarted(attributes);
                        return;
                    }
                    if ("conflicts".equals(str3)) {
                        if (!this.descriptorVersion.startsWith("1.")) {
                            Message.deprecated("using conflicts section is deprecated: please use hints section instead. Ivy file URL: " + this.descriptorURL);
                        }
                        this.state = 8;
                        checkConfigurations();
                        return;
                    }
                    if ("artifact".equals(str3)) {
                        artifactStarted(str3, attributes);
                        return;
                    }
                    if (MotionScene.INCLUDE_TAG.equals(str3) && this.state == 4) {
                        addIncludeRule(str3, attributes);
                        return;
                    }
                    if ("exclude".equals(str3) && this.state == 4) {
                        addExcludeRule(str3, attributes);
                        return;
                    }
                    if ("exclude".equals(str3) && this.state == 10) {
                        this.state = 9;
                        parseRule(str3, attributes);
                        getMd().addExcludeRule((ExcludeRule) this.confAware);
                        return;
                    }
                    if ("dependency".equals(str3)) {
                        dependencyStarted(attributes);
                        return;
                    }
                    if (IvyPatternHelper.CONF_KEY.equals(str3)) {
                        confStarted(attributes);
                        return;
                    }
                    if ("mapped".equals(str3)) {
                        this.f9998dd.addDependencyConfiguration(this.conf, this.settings.substitute(attributes.getValue("name")));
                        return;
                    }
                    if (("conflict".equals(str3) && this.state == 10) || ("manager".equals(str3) && this.state == 8)) {
                        if (this.state != 8) {
                            str4 = "manager";
                        }
                        managerStarted(attributes, str4);
                        return;
                    }
                    if ("override".equals(str3) && this.state == 10) {
                        mediationOverrideStarted(attributes);
                        return;
                    }
                    if (MotionScene.INCLUDE_TAG.equals(str3) && this.state == 2) {
                        includeConfStarted(attributes);
                        return;
                    }
                    if (!this.validate || (i = this.state) == 12 || i == 11) {
                        return;
                    }
                    addError("unknown tag " + str3);
                    return;
                }
                this.buffer = new StringBuilder();
                this.state = 12;
                ExtraInfoHolder extraInfoHolder = new ExtraInfoHolder();
                extraInfoHolder.setName(str3);
                while (i2 < attributes.getLength()) {
                    extraInfoHolder.getAttributes().put(attributes.getQName(i2), attributes.getValue(i2));
                    i2++;
                }
                this.extraInfoStack.push(extraInfoHolder);
            } catch (Exception e) {
                if (e instanceof SAXException) {
                    throw ((SAXException) e);
                }
                throw new SAXException("Problem occurred while parsing ivy file: " + e.getMessage(), e);
            }
        }

        public String getDefaultParentLocation() {
            return "../ivy.xml";
        }

        /* JADX WARN: Removed duplicated region for block: B:70:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x00f9  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0115  */
        /* JADX WARN: Removed duplicated region for block: B:88:0x00db A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void extendsStarted(Attributes attributes) throws ParseException {
            ModuleDescriptor parentModuleOnFilesystem;
            IOException e;
            boolean z;
            String strSubstitute = this.settings.substitute(attributes.getValue(IvyPatternHelper.ORGANISATION_KEY));
            String strSubstitute2 = this.settings.substitute(attributes.getValue("module"));
            String workingRevision = attributes.getValue(IvyPatternHelper.REVISION_KEY) == null ? Ivy.getWorkingRevision() : this.settings.substitute(attributes.getValue(IvyPatternHelper.REVISION_KEY));
            String defaultParentLocation = attributes.getValue("location") == null ? getDefaultParentLocation() : this.settings.substitute(attributes.getValue("location"));
            List<String> listAsList = Arrays.asList((attributes.getValue("extendType") == null ? "all" : this.settings.substitute(attributes.getValue("extendType").toLowerCase(Locale.US))).split(","));
            ModuleId moduleId = new ModuleId(strSubstitute, strSubstitute2);
            ModuleRevisionId moduleRevisionId = new ModuleRevisionId(moduleId, workingRevision);
            ModuleDescriptor otherIvyFile = null;
            try {
                parentModuleOnFilesystem = parseParentModuleOnFilesystem(defaultParentLocation);
                if (parentModuleOnFilesystem != null) {
                    try {
                        ModuleId moduleId2 = parentModuleOnFilesystem.getResolvedModuleRevisionId().getModuleId();
                        if (moduleId2.equals(moduleId)) {
                            otherIvyFile = parentModuleOnFilesystem;
                        } else {
                            Message.info("Found a parent module with unexpected ModuleRevisionId at source location " + defaultParentLocation + "! Expected: " + moduleId + ". Found: " + moduleId2 + ". This parent module will be ignored.");
                        }
                        z = otherIvyFile != null;
                    } catch (IOException e2) {
                        e = e2;
                        Message.warn("Unable to parse included ivy file " + defaultParentLocation, e);
                        z = false;
                        otherIvyFile = parentModuleOnFilesystem;
                        if (otherIvyFile == null) {
                        }
                        if (otherIvyFile != null) {
                        }
                    }
                }
            } catch (IOException e3) {
                parentModuleOnFilesystem = null;
                e = e3;
            }
            if (otherIvyFile == null) {
                try {
                    otherIvyFile = parseOtherIvyFile(moduleRevisionId);
                } catch (ParseException e4) {
                    Message.warn("Unable to parse included ivy file for " + moduleRevisionId.toString(), e4);
                }
            }
            if (otherIvyFile != null) {
                throw new ParseException("Unable to parse included ivy file for " + moduleRevisionId.toString(), 0);
            }
            getMd().addInheritedDescriptor(new DefaultExtendsDescriptor(otherIvyFile, defaultParentLocation, (String[]) listAsList.toArray(new String[listAsList.size()]), z));
            mergeWithOtherModuleDescriptor(listAsList, otherIvyFile);
        }

        public void mergeWithOtherModuleDescriptor(List<String> list, ModuleDescriptor moduleDescriptor) {
            if (list.contains("all")) {
                mergeAll(moduleDescriptor);
                return;
            }
            if (list.contains("info")) {
                mergeInfo(moduleDescriptor);
            }
            if (list.contains("configurations")) {
                mergeConfigurations(moduleDescriptor);
            }
            if (list.contains("dependencies")) {
                mergeDependencies(moduleDescriptor.getDependencies());
            }
            if (list.contains("description")) {
                mergeDescription(moduleDescriptor.getDescription());
            }
            if (list.contains(PomReader.LICENSES)) {
                mergeLicenses(moduleDescriptor.getLicenses());
            }
            if (list.contains("excludes")) {
                mergeExcludes(moduleDescriptor.getAllExcludeRules());
            }
        }

        public void mergeAll(ModuleDescriptor moduleDescriptor) {
            mergeInfo(moduleDescriptor);
            mergeConfigurations(moduleDescriptor);
            mergeDependencies(moduleDescriptor.getDependencies());
            mergeDescription(moduleDescriptor.getDescription());
            mergeLicenses(moduleDescriptor.getLicenses());
            mergeExcludes(moduleDescriptor.getAllExcludeRules());
        }

        public void mergeInfo(ModuleDescriptor moduleDescriptor) {
            ModuleRevisionId moduleRevisionId = moduleDescriptor.getModuleRevisionId();
            DefaultModuleDescriptor md = getMd();
            ModuleRevisionId moduleRevisionId2 = md.getModuleRevisionId();
            ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(mergeValue(moduleRevisionId.getOrganisation(), moduleRevisionId2.getOrganisation()), moduleRevisionId2.getName(), mergeValue(moduleRevisionId.getBranch(), moduleRevisionId2.getBranch()), mergeRevisionValue(moduleRevisionId.getRevision(), moduleRevisionId2.getRevision()), mergeValues(moduleRevisionId.getQualifiedExtraAttributes(), moduleRevisionId2.getQualifiedExtraAttributes()));
            md.setModuleRevisionId(moduleRevisionIdNewInstance);
            md.setResolvedModuleRevisionId(moduleRevisionIdNewInstance);
            md.setStatus(mergeValue(moduleDescriptor.getStatus(), md.getStatus()));
            if (md.getNamespace() == null && (moduleDescriptor instanceof DefaultModuleDescriptor)) {
                md.setNamespace(((DefaultModuleDescriptor) moduleDescriptor).getNamespace());
            }
            md.getExtraInfos().addAll(moduleDescriptor.getExtraInfos());
        }

        public static String mergeRevisionValue(String str, String str2) {
            return (str2 == null || str2.equals(Ivy.getWorkingRevision())) ? str : str2;
        }

        public static Map<String, String> mergeValues(Map<String, String> map, Map<String, String> map2) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map.size() + map2.size());
            linkedHashMap.putAll(map);
            linkedHashMap.putAll(map2);
            return linkedHashMap;
        }

        public void mergeConfigurations(ModuleDescriptor moduleDescriptor) {
            ModuleRevisionId moduleRevisionId = moduleDescriptor.getModuleRevisionId();
            for (Configuration configuration : moduleDescriptor.getConfigurations()) {
                Message.debug("Merging configuration with: " + configuration.getName());
                getMd().addConfiguration(new Configuration(configuration, moduleRevisionId));
            }
            if (moduleDescriptor instanceof DefaultModuleDescriptor) {
                DefaultModuleDescriptor defaultModuleDescriptor = (DefaultModuleDescriptor) moduleDescriptor;
                setDefaultConfMapping(defaultModuleDescriptor.getDefaultConfMapping());
                setDefaultConf(defaultModuleDescriptor.getDefaultConf());
                getMd().setMappingOverride(defaultModuleDescriptor.isMappingOverride());
            }
        }

        public void mergeDependencies(DependencyDescriptor[] dependencyDescriptorArr) {
            DefaultModuleDescriptor md = getMd();
            for (DependencyDescriptor dependencyDescriptor : dependencyDescriptorArr) {
                Message.debug("Merging dependency with: " + dependencyDescriptor.getDependencyRevisionId().toString());
                md.addDependency(dependencyDescriptor);
            }
        }

        public void mergeDescription(String str) {
            if (StringUtils.isNullOrEmpty(getMd().getDescription())) {
                getMd().setDescription(str);
            }
        }

        public void mergeLicenses(License[] licenseArr) {
            for (License license : licenseArr) {
                getMd().addLicense(license);
            }
        }

        public void mergeExcludes(ExcludeRule[] excludeRuleArr) {
            for (ExcludeRule excludeRule : excludeRuleArr) {
                getMd().addExcludeRule(excludeRule);
            }
        }

        public final ModuleDescriptor parseParentModuleOnFilesystem(String str) throws IOException, ParseException {
            if (!PomReader.PomProfileElement.FILE.equals(this.descriptorURL.getProtocol())) {
                return null;
            }
            File file = new File(str);
            if (!file.isAbsolute()) {
                URL url = this.settings.getRelativeUrlResolver().getURL(this.descriptorURL, str);
                try {
                    file = new File(new URI(url.toExternalForm()));
                } catch (URISyntaxException unused) {
                    file = new File(url.getPath());
                }
            }
            File fileNormalize = FileUtil.normalize(file.getAbsolutePath());
            if (!fileNormalize.exists()) {
                Message.verbose("Parent module doesn't exist on the filesystem: " + fileNormalize.getAbsolutePath());
                return null;
            }
            FileResource fileResource = new FileResource(null, fileNormalize);
            return ModuleDescriptorParserRegistry.getInstance().getParser(fileResource).parseDescriptor(getSettings(), fileNormalize.toURI().toURL(), fileResource, isValidate());
        }

        public ModuleDescriptor parseOtherIvyFile(ModuleRevisionId moduleRevisionId) throws ParseException {
            Message.debug("Trying to parse included ivy file by asking repository for module :" + moduleRevisionId.toString());
            DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(moduleRevisionId, true);
            ResolveData resolveData = IvyContext.getContext().getResolveData();
            if (resolveData == null) {
                ResolveEngine resolveEngine = IvyContext.getContext().getIvy().getResolveEngine();
                ResolveOptions resolveOptions = new ResolveOptions();
                resolveOptions.setDownload(false);
                resolveData = new ResolveData(resolveEngine, resolveOptions);
            }
            ResolvedModuleRevision dependency = getSettings().getResolver(moduleRevisionId).getDependency(NameSpaceHelper.toSystem(defaultDependencyDescriptor, getSettings().getContextNamespace()), resolveData);
            if (dependency == null) {
                throw new ParseException("Unable to find " + moduleRevisionId.toString(), 0);
            }
            return dependency.getDescriptor();
        }

        public void publicationsStarted(Attributes attributes) {
            this.state = 3;
            this.artifactsDeclared = true;
            checkConfigurations();
            String strSubstitute = this.settings.substitute(attributes.getValue("defaultconf"));
            if (strSubstitute != null) {
                setPublicationsDefaultConf(strSubstitute);
            }
        }

        public void setPublicationsDefaultConf(String str) {
            this.publicationsDefaultConf = str == null ? null : StringUtils.splitToArray(str);
        }

        public boolean isOtherNamespace(String str) {
            return str.contains(io.appmetrica.analytics.coreutils.internal.StringUtils.PROCESS_POSTFIX_DELIMITER);
        }

        public void managerStarted(Attributes attributes, String str) {
            ConflictManager fixedConflictManager;
            PatternMatcher matcher;
            String strSubstitute = this.settings.substitute(attributes.getValue("org"));
            if (strSubstitute == null) {
                strSubstitute = "*";
            }
            String strSubstitute2 = this.settings.substitute(attributes.getValue("module"));
            String str2 = strSubstitute2 != null ? strSubstitute2 : "*";
            String strSubstitute3 = this.settings.substitute(attributes.getValue(str));
            String strSubstitute4 = this.settings.substitute(attributes.getValue("rev"));
            if (strSubstitute4 != null) {
                fixedConflictManager = new FixedConflictManager(StringUtils.splitToArray(strSubstitute4));
            } else if (strSubstitute3 != null) {
                ConflictManager conflictManager = this.settings.getConflictManager(strSubstitute3);
                if (conflictManager == null) {
                    addError("unknown conflict manager: " + strSubstitute3);
                    return;
                }
                fixedConflictManager = conflictManager;
            } else {
                addError("bad conflict manager: no manager nor rev");
                return;
            }
            String strSubstitute5 = this.settings.substitute(attributes.getValue("matcher"));
            if (strSubstitute5 == null) {
                matcher = this.defaultMatcher;
            } else {
                matcher = this.settings.getMatcher(strSubstitute5);
            }
            if (matcher == null) {
                addError("unknown matcher: " + strSubstitute5);
                return;
            }
            getMd().addConflictManager(new ModuleId(strSubstitute, str2), matcher, fixedConflictManager);
        }

        public void mediationOverrideStarted(Attributes attributes) {
            PatternMatcher matcher;
            String strSubstitute = this.settings.substitute(attributes.getValue("org"));
            if (strSubstitute == null) {
                strSubstitute = "*";
            }
            String strSubstitute2 = this.settings.substitute(attributes.getValue("module"));
            String str = strSubstitute2 != null ? strSubstitute2 : "*";
            String strSubstitute3 = this.settings.substitute(attributes.getValue("rev"));
            String strSubstitute4 = this.settings.substitute(attributes.getValue(IvyPatternHelper.BRANCH_KEY));
            String strSubstitute5 = this.settings.substitute(attributes.getValue("matcher"));
            if (strSubstitute5 == null) {
                matcher = this.defaultMatcher;
            } else {
                matcher = this.settings.getMatcher(strSubstitute5);
            }
            if (matcher == null) {
                addError("unknown matcher: " + strSubstitute5);
                return;
            }
            getMd().addDependencyDescriptorMediator(new ModuleId(strSubstitute, str), matcher, new OverrideDependencyDescriptorMediator(strSubstitute4, strSubstitute3));
        }

        public void includeConfStarted(Attributes attributes) throws ParserConfigurationException, SAXException, IOException, ParseException {
            URL url = this.settings.getRelativeUrlResolver().getURL(this.descriptorURL, this.settings.substitute(attributes.getValue(PomReader.PomProfileElement.FILE)), this.settings.substitute(attributes.getValue("url")));
            if (url == null) {
                throw new SAXException("include tag must have a file or an url attribute");
            }
            Parser parser = new Parser(getModuleDescriptorParser(), this.settings);
            parser.setInput(url);
            parser.setMd(new DefaultModuleDescriptor(getModuleDescriptorParser(), new URLResource(url)));
            XMLHelper.parse(url, null, parser);
            for (Configuration configuration : parser.getModuleDescriptor().getConfigurations()) {
                getMd().addConfiguration(configuration);
            }
            if (parser.getDefaultConfMapping() != null) {
                Message.debug("setting default conf mapping from imported configurations file: " + parser.getDefaultConfMapping());
                setDefaultConfMapping(parser.getDefaultConfMapping());
            }
            if (parser.getDefaultConf() != null) {
                Message.debug("setting default conf from imported configurations file: " + parser.getDefaultConf());
                setDefaultConf(parser.getDefaultConf());
            }
            if (parser.getMd().isMappingOverride()) {
                Message.debug("enabling mapping-override from imported configurations file");
                getMd().setMappingOverride(true);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void confStarted(Attributes attributes) {
            String strSubstitute = this.settings.substitute(attributes.getValue("name"));
            switch (this.state) {
                case 2:
                    String strSubstitute2 = this.settings.substitute(attributes.getValue("visibility"));
                    String strSubstitute3 = this.settings.substitute(attributes.getValue("extends"));
                    boolean z = (attributes.getValue("transitive") == null || Boolean.valueOf(attributes.getValue("transitive")).booleanValue()) ? 1 : 0;
                    String value = attributes.getValue("deprecated");
                    if (strSubstitute2 == null) {
                        strSubstitute2 = "public";
                    }
                    Configuration configuration = new Configuration(strSubstitute, Configuration.Visibility.getVisibility(strSubstitute2), this.settings.substitute(attributes.getValue("description")), strSubstitute3 == null ? null : strSubstitute3.split(","), z, value);
                    ExtendableItemHelper.fillExtraAttributes(this.settings, configuration, attributes, (List<String>) Arrays.asList("name", "visibility", "extends", "transitive", "description", "deprecated"));
                    getMd().addConfiguration(configuration);
                    break;
                case 3:
                    if ("*".equals(strSubstitute)) {
                        String[] configurationsNames = getMd().getConfigurationsNames();
                        int length = configurationsNames.length;
                        while (i < length) {
                            String str = configurationsNames[i];
                            this.artifact.addConfiguration(str);
                            getMd().addArtifact(str, this.artifact);
                            i++;
                        }
                        break;
                    } else {
                        this.artifact.addConfiguration(strSubstitute);
                        getMd().addArtifact(strSubstitute, this.artifact);
                        break;
                    }
                case 4:
                    this.conf = strSubstitute;
                    String strSubstitute4 = this.settings.substitute(attributes.getValue("mapped"));
                    if (strSubstitute4 != null) {
                        String[] strArrSplitToArray = StringUtils.splitToArray(strSubstitute4);
                        int length2 = strArrSplitToArray.length;
                        while (i < length2) {
                            this.f9998dd.addDependencyConfiguration(strSubstitute, strArrSplitToArray[i]);
                            i++;
                        }
                        break;
                    }
                    break;
                case 5:
                case 6:
                case 7:
                    addConfiguration(strSubstitute);
                    break;
                default:
                    if (this.validate) {
                        addError("conf tag found in invalid tag: " + this.state);
                        break;
                    }
                    break;
            }
        }

        public void dependencyStarted(Attributes attributes) {
            ModuleRevisionId moduleRevisionIdNewInstance;
            this.state = 4;
            String strSubstitute = this.settings.substitute(attributes.getValue("org"));
            if (strSubstitute == null) {
                strSubstitute = getMd().getModuleRevisionId().getOrganisation();
            }
            String str = strSubstitute;
            boolean zBooleanValue = Boolean.valueOf(this.settings.substitute(attributes.getValue("force"))).booleanValue();
            boolean zBooleanValue2 = Boolean.valueOf(this.settings.substitute(attributes.getValue("changing"))).booleanValue();
            boolean z = this.settings.substitute(attributes.getValue("transitive")) == null || Boolean.valueOf(attributes.getValue("transitive")).booleanValue();
            String strSubstitute2 = this.settings.substitute(attributes.getValue("name"));
            String strSubstitute3 = this.settings.substitute(attributes.getValue(IvyPatternHelper.BRANCH_KEY));
            String strSubstitute4 = this.settings.substitute(attributes.getValue("branchConstraint"));
            String strSubstitute5 = this.settings.substitute(attributes.getValue("rev"));
            String strSubstitute6 = this.settings.substitute(attributes.getValue("revConstraint"));
            Map<String, String> extraAttributes = ExtendableItemHelper.getExtraAttributes(this.settings, attributes, XmlModuleDescriptorParser.DEPENDENCY_REGULAR_ATTRIBUTES);
            ModuleRevisionId moduleRevisionIdNewInstance2 = ModuleRevisionId.newInstance(str, strSubstitute2, strSubstitute3, strSubstitute5, extraAttributes);
            if (strSubstitute6 == null && strSubstitute4 == null) {
                moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(str, strSubstitute2, strSubstitute3, strSubstitute5, extraAttributes, false);
            } else if (strSubstitute4 == null) {
                moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(str, strSubstitute2, null, strSubstitute6, extraAttributes, false);
            } else {
                moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(str, strSubstitute2, strSubstitute4, strSubstitute6, extraAttributes);
            }
            this.f9998dd = new DefaultDependencyDescriptor(getMd(), moduleRevisionIdNewInstance2, moduleRevisionIdNewInstance, zBooleanValue, zBooleanValue2, z);
            getMd().addDependency(this.f9998dd);
            String strSubstitute7 = this.settings.substitute(attributes.getValue(IvyPatternHelper.CONF_KEY));
            if (strSubstitute7 == null || strSubstitute7.length() <= 0) {
                return;
            }
            parseDepsConfs(strSubstitute7, this.f9998dd);
        }

        public void artifactStarted(String str, Attributes attributes) throws MalformedURLException {
            int i = this.state;
            if (i != 3) {
                if (i == 4) {
                    addDependencyArtifacts(str, attributes);
                    return;
                } else {
                    if (this.validate) {
                        addError("artifact tag found in invalid tag: " + this.state);
                        return;
                    }
                    return;
                }
            }
            String strSubstitute = this.settings.substitute(attributes.getValue("name"));
            if (strSubstitute == null) {
                strSubstitute = getMd().getModuleRevisionId().getName();
            }
            String str2 = strSubstitute;
            String strSubstitute2 = this.settings.substitute(attributes.getValue("type"));
            if (strSubstitute2 == null) {
                strSubstitute2 = "jar";
            }
            String str3 = strSubstitute2;
            String strSubstitute3 = this.settings.substitute(attributes.getValue(IvyPatternHelper.EXT_KEY));
            String str4 = strSubstitute3 == null ? str3 : strSubstitute3;
            String strSubstitute4 = this.settings.substitute(attributes.getValue("url"));
            this.artifact = new MDArtifact(getMd(), str2, str3, str4, strSubstitute4 == null ? null : new URL(strSubstitute4), ExtendableItemHelper.getExtraAttributes(this.settings, attributes, (List<String>) Arrays.asList(IvyPatternHelper.EXT_KEY, "type", "name", IvyPatternHelper.CONF_KEY)));
            String strSubstitute5 = this.settings.substitute(attributes.getValue(IvyPatternHelper.CONF_KEY));
            if (strSubstitute5 == null || strSubstitute5.length() <= 0) {
                return;
            }
            for (String str5 : "*".equals(strSubstitute5) ? getMd().getConfigurationsNames() : StringUtils.splitToArray(strSubstitute5)) {
                this.artifact.addConfiguration(str5);
                getMd().addArtifact(str5, this.artifact);
            }
        }

        public void dependenciesStarted(Attributes attributes) {
            this.state = 10;
            String strSubstitute = this.settings.substitute(attributes.getValue("defaultconf"));
            if (strSubstitute != null) {
                setDefaultConf(strSubstitute);
            }
            String strSubstitute2 = this.settings.substitute(attributes.getValue("defaultconfmapping"));
            if (strSubstitute2 != null) {
                setDefaultConfMapping(strSubstitute2);
            }
            String strSubstitute3 = this.settings.substitute(attributes.getValue("confmappingoverride"));
            if (strSubstitute3 != null) {
                getMd().setMappingOverride(Boolean.valueOf(strSubstitute3).booleanValue());
            }
            checkConfigurations();
        }

        public void configurationStarted(Attributes attributes) {
            this.state = 2;
            setDefaultConfMapping(this.settings.substitute(attributes.getValue("defaultconfmapping")));
            setDefaultConf(this.settings.substitute(attributes.getValue("defaultconf")));
            getMd().setMappingOverride(Boolean.valueOf(this.settings.substitute(attributes.getValue("confmappingoverride"))).booleanValue());
        }

        public void infoStarted(Attributes attributes) {
            this.state = 1;
            getMd().setModuleRevisionId(ModuleRevisionId.newInstance(this.settings.substitute(attributes.getValue(IvyPatternHelper.ORGANISATION_KEY)), this.settings.substitute(attributes.getValue("module")), this.settings.substitute(attributes.getValue(IvyPatternHelper.BRANCH_KEY)), this.settings.substitute(attributes.getValue(IvyPatternHelper.REVISION_KEY)), ExtendableItemHelper.getExtraAttributes(this.settings, attributes, (List<String>) Arrays.asList(IvyPatternHelper.ORGANISATION_KEY, "module", IvyPatternHelper.REVISION_KEY, "status", "publication", IvyPatternHelper.BRANCH_KEY, "namespace", "default", "resolver"))));
            String strSubstitute = this.settings.substitute(attributes.getValue("namespace"));
            if (strSubstitute != null) {
                Namespace namespace = this.settings.getNamespace(strSubstitute);
                if (namespace == null) {
                    Message.warn("namespace not found for " + getMd().getModuleRevisionId() + ": " + strSubstitute);
                } else {
                    getMd().setNamespace(namespace);
                }
            }
            String strSubstitute2 = this.settings.substitute(attributes.getValue("status"));
            DefaultModuleDescriptor md = getMd();
            if (strSubstitute2 == null) {
                strSubstitute2 = this.settings.getStatusManager().getDefaultStatus();
            }
            md.setStatus(strSubstitute2);
            getMd().setDefault(Boolean.valueOf(this.settings.substitute(attributes.getValue("default"))).booleanValue());
            String strSubstitute3 = this.settings.substitute(attributes.getValue("publication"));
            if (strSubstitute3 != null && strSubstitute3.length() > 0) {
                try {
                    getMd().setPublicationDate(DateUtil.parse(strSubstitute3));
                    return;
                } catch (ParseException unused) {
                    addError("invalid publication date format: " + strSubstitute3);
                    getMd().setPublicationDate(getDefaultPubDate());
                    return;
                }
            }
            getMd().setPublicationDate(getDefaultPubDate());
        }

        public void ivyModuleStarted(Attributes attributes) throws SAXException {
            String value = attributes.getValue("version");
            this.descriptorVersion = value;
            List<String> list = ALLOWED_VERSIONS;
            int iIndexOf = list.indexOf(value);
            if (iIndexOf == -1) {
                addError("invalid version " + this.descriptorVersion);
                throw new SAXException("invalid version " + this.descriptorVersion);
            }
            if (iIndexOf >= list.indexOf("1.3")) {
                Message.debug("post 1.3 ivy file: using exact as default matcher");
                this.defaultMatcher = this.settings.getMatcher(PatternMatcher.EXACT);
            } else {
                Message.debug("pre 1.3 ivy file: using exactOrRegexp as default matcher");
                this.defaultMatcher = this.settings.getMatcher(PatternMatcher.EXACT_OR_REGEXP);
            }
            for (int i = 0; i < attributes.getLength(); i++) {
                if (attributes.getQName(i).startsWith("xmlns:")) {
                    getMd().addExtraAttributeNamespace(attributes.getQName(i).substring(6), attributes.getValue(i));
                }
            }
        }

        public void addDependencyArtifacts(String str, Attributes attributes) throws MalformedURLException {
            this.state = 5;
            parseRule(str, attributes);
        }

        public void addIncludeRule(String str, Attributes attributes) throws MalformedURLException {
            this.state = 6;
            parseRule(str, attributes);
        }

        public void addExcludeRule(String str, Attributes attributes) throws MalformedURLException {
            this.state = 7;
            parseRule(str, attributes);
        }

        public void parseRule(String str, Attributes attributes) throws MalformedURLException {
            String str2;
            String strSubstitute = this.settings.substitute(attributes.getValue("name"));
            if (strSubstitute == null && (strSubstitute = this.settings.substitute(attributes.getValue("artifact"))) == null) {
                strSubstitute = "artifact".equals(str) ? this.f9998dd.getDependencyId().getName() : "*";
            }
            String str3 = strSubstitute;
            String strSubstitute2 = this.settings.substitute(attributes.getValue("type"));
            if (strSubstitute2 == null) {
                str2 = "artifact".equals(str) ? "jar" : "*";
            } else {
                str2 = strSubstitute2;
            }
            String strSubstitute3 = this.settings.substitute(attributes.getValue(IvyPatternHelper.EXT_KEY));
            String str4 = strSubstitute3 == null ? str2 : strSubstitute3;
            int i = this.state;
            if (i == 5) {
                String strSubstitute4 = this.settings.substitute(attributes.getValue("url"));
                this.confAware = new DefaultDependencyArtifactDescriptor(this.f9998dd, str3, str2, str4, strSubstitute4 == null ? null : new URL(strSubstitute4), ExtendableItemHelper.getExtraAttributes(this.settings, attributes, (List<String>) Arrays.asList("name", "type", IvyPatternHelper.EXT_KEY, "url", IvyPatternHelper.CONF_KEY)));
            } else if (i == 6) {
                PatternMatcher patternMatcher = getPatternMatcher(attributes.getValue("matcher"));
                String strSubstitute5 = this.settings.substitute(attributes.getValue("org"));
                if (strSubstitute5 == null) {
                    strSubstitute5 = "*";
                }
                String strSubstitute6 = this.settings.substitute(attributes.getValue("module"));
                if (strSubstitute6 == null) {
                    strSubstitute6 = "*";
                }
                this.confAware = new DefaultIncludeRule(new ArtifactId(new ModuleId(strSubstitute5, strSubstitute6), str3, str2, str4), patternMatcher, ExtendableItemHelper.getExtraAttributes(this.settings, attributes, (List<String>) Arrays.asList("org", "module", "name", "type", IvyPatternHelper.EXT_KEY, "matcher", IvyPatternHelper.CONF_KEY)));
            } else {
                PatternMatcher patternMatcher2 = getPatternMatcher(attributes.getValue("matcher"));
                String strSubstitute7 = this.settings.substitute(attributes.getValue("org"));
                if (strSubstitute7 == null) {
                    strSubstitute7 = "*";
                }
                String strSubstitute8 = this.settings.substitute(attributes.getValue("module"));
                if (strSubstitute8 == null) {
                    strSubstitute8 = "*";
                }
                this.confAware = new DefaultExcludeRule(new ArtifactId(new ModuleId(strSubstitute7, strSubstitute8), str3, str2, str4), patternMatcher2, ExtendableItemHelper.getExtraAttributes(this.settings, attributes, (List<String>) Arrays.asList("org", "module", "name", "type", IvyPatternHelper.EXT_KEY, "matcher", IvyPatternHelper.CONF_KEY)));
            }
            String strSubstitute9 = this.settings.substitute(attributes.getValue(IvyPatternHelper.CONF_KEY));
            if (strSubstitute9 == null || strSubstitute9.length() <= 0) {
                return;
            }
            for (String str5 : "*".equals(strSubstitute9) ? getMd().getConfigurationsNames() : StringUtils.splitToArray(strSubstitute9)) {
                addConfiguration(str5);
            }
        }

        public void addConfiguration(String str) {
            this.confAware.addConfiguration(str);
            if (this.state == 9) {
                return;
            }
            ConfigurationAware configurationAware = this.confAware;
            if (configurationAware instanceof DependencyArtifactDescriptor) {
                this.f9998dd.addDependencyArtifact(str, (DependencyArtifactDescriptor) configurationAware);
            } else if (configurationAware instanceof IncludeRule) {
                this.f9998dd.addIncludeRule(str, (IncludeRule) configurationAware);
            } else if (configurationAware instanceof ExcludeRule) {
                this.f9998dd.addExcludeRule(str, (ExcludeRule) configurationAware);
            }
        }

        public PatternMatcher getPatternMatcher(String str) {
            PatternMatcher matcher;
            String strSubstitute = this.settings.substitute(str);
            if (strSubstitute == null) {
                matcher = this.defaultMatcher;
            } else {
                matcher = this.settings.getMatcher(strSubstitute);
            }
            if (matcher != null) {
                return matcher;
            }
            throw new IllegalArgumentException("unknown matcher " + strSubstitute);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            StringBuilder sb = this.buffer;
            if (sb != null) {
                sb.append(cArr, i, i2);
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            int i = 0;
            if (this.state == 3 && "artifact".equals(str3) && this.artifact.getConfigurations().length == 0) {
                String[] configurationsNames = this.publicationsDefaultConf;
                if (configurationsNames == null) {
                    configurationsNames = getMd().getConfigurationsNames();
                }
                int length = configurationsNames.length;
                while (i < length) {
                    String str4 = configurationsNames[i];
                    this.artifact.addConfiguration(str4);
                    getMd().addArtifact(str4, this.artifact);
                    i++;
                }
                return;
            }
            if ("configurations".equals(str3)) {
                checkConfigurations();
                return;
            }
            if ((this.state == 5 && "artifact".equals(str3)) || ((this.state == 6 && MotionScene.INCLUDE_TAG.equals(str3)) || (this.state == 7 && "exclude".equals(str3)))) {
                this.state = 4;
                if (this.confAware.getConfigurations().length == 0) {
                    String[] configurationsNames2 = getMd().getConfigurationsNames();
                    int length2 = configurationsNames2.length;
                    while (i < length2) {
                        addConfiguration(configurationsNames2[i]);
                        i++;
                    }
                }
                this.confAware = null;
                return;
            }
            if ("exclude".equals(str3) && this.state == 9) {
                if (this.confAware.getConfigurations().length == 0) {
                    String[] configurationsNames3 = getMd().getConfigurationsNames();
                    int length3 = configurationsNames3.length;
                    while (i < length3) {
                        addConfiguration(configurationsNames3[i]);
                        i++;
                    }
                }
                this.confAware = null;
                this.state = 10;
                return;
            }
            if ("dependency".equals(str3) && this.state == 4) {
                if (this.f9998dd.getModuleConfigurations().length == 0) {
                    parseDepsConfs(getDefaultConf(), this.f9998dd);
                }
                this.state = 10;
                return;
            }
            if ("dependencies".equals(str3) && this.state == 10) {
                this.state = 0;
                return;
            }
            if (this.state == 1 && "info".equals(str3)) {
                this.state = 0;
                return;
            }
            if (this.state == 11 && "description".equals(str3)) {
                DefaultModuleDescriptor md = getMd();
                StringBuilder sb = this.buffer;
                md.setDescription(sb != null ? sb.toString().trim() : "");
                this.buffer = null;
                this.state = 1;
                return;
            }
            int i2 = this.state;
            if (i2 == 12) {
                StringBuilder sb2 = this.buffer;
                String string = sb2 != null ? sb2.toString() : "";
                this.buffer = null;
                ExtraInfoHolder extraInfoHolderPop = this.extraInfoStack.pop();
                extraInfoHolderPop.setContent(string);
                if (this.extraInfoStack.isEmpty()) {
                    getMd().addExtraInfo(extraInfoHolderPop);
                    this.state = 1;
                    return;
                } else {
                    this.extraInfoStack.peek().getNestedExtraInfoHolder().add(extraInfoHolderPop);
                    return;
                }
            }
            if (i2 == 11) {
                if (this.buffer.toString().endsWith("<" + str3 + ">")) {
                    StringBuilder sb3 = this.buffer;
                    sb3.deleteCharAt(sb3.length() - 1);
                    this.buffer.append("/>");
                } else {
                    StringBuilder sb4 = this.buffer;
                    sb4.append("</");
                    sb4.append(str3);
                    sb4.append(">");
                }
            }
        }

        public void checkConfigurations() {
            if (getMd().getConfigurations().length == 0) {
                getMd().addConfiguration(new Configuration("default"));
            }
        }

        public void replaceConfigurationWildcards() {
            for (Configuration configuration : getMd().getConfigurations()) {
                configuration.replaceWildcards(getMd());
            }
        }

        public ParserSettings getSettings() {
            return this.settings;
        }

        public URL getDescriptorURL() {
            return this.descriptorURL;
        }

        public InputStream getDescriptorInput() {
            return this.descriptorInput;
        }

        public int getState() {
            return this.state;
        }

        public void setState(int i) {
            this.state = i;
        }

        public PatternMatcher getDefaultMatcher() {
            return this.defaultMatcher;
        }

        public DefaultDependencyDescriptor getDd() {
            return this.f9998dd;
        }

        public void setDd(DefaultDependencyDescriptor defaultDependencyDescriptor) {
            this.f9998dd = defaultDependencyDescriptor;
        }

        public ConfigurationAware getConfAware() {
            return this.confAware;
        }

        public void setConfAware(ConfigurationAware configurationAware) {
            this.confAware = configurationAware;
        }

        public MDArtifact getArtifact() {
            return this.artifact;
        }

        public void setArtifact(MDArtifact mDArtifact) {
            this.artifact = mDArtifact;
        }

        public String getConf() {
            return this.conf;
        }

        public void setConf(String str) {
            this.conf = str;
        }

        public boolean isArtifactsDeclared() {
            return this.artifactsDeclared;
        }

        public void setArtifactsDeclared(boolean z) {
            this.artifactsDeclared = z;
        }

        public StringBuilder getBuffer() {
            return this.buffer;
        }

        public void setBuffer(StringBuilder sb) {
            this.buffer = sb;
        }

        public String getDescriptorVersion() {
            return this.descriptorVersion;
        }

        public void setDescriptorVersion(String str) {
            this.descriptorVersion = str;
        }

        public String[] getPublicationsDefaultConf() {
            return this.publicationsDefaultConf;
        }

        public void setPublicationsDefaultConf(String[] strArr) {
            this.publicationsDefaultConf = strArr;
        }

        public boolean isValidate() {
            return this.validate;
        }

        public URL getSchemaURL() {
            return getClass().getResource("ivy.xsd");
        }
    }

    public String toString() {
        return "ivy parser";
    }
}
