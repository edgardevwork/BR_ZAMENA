package org.apache.ivy.plugins.parser.xml;

import androidx.constraintlayout.motion.widget.MotionScene;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import javax.xml.parsers.ParserConfigurationException;
import kotlinx.serialization.json.JsonKt;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ExtendsDescriptor;
import org.apache.ivy.core.module.descriptor.InheritableItem;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.namespace.NameSpaceHelper;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.file.FileResource;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.XMLHelper;
import org.apache.ivy.util.extendable.ExtendableItemHelper;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;
import org.jfrog.filespecs.properties.PropertiesParser;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.LexicalHandler;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes6.dex */
public final class XmlModuleDescriptorUpdater {
    public static String LINE_SEPARATOR = System.lineSeparator();

    public interface ItemPrinter {
        void print(ModuleDescriptor moduleDescriptor, Object obj, PrintWriter printWriter);
    }

    public static void update(URL url, File file, UpdateOptions updateOptions) throws SAXException, IOException {
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            update(url, fileOutputStream, updateOptions);
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                Message.warn("failed to close a stream : " + e.toString());
            }
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                Message.warn("failed to close a stream : " + e2.toString());
            }
            throw th;
        }
    }

    public static void update(URL url, OutputStream outputStream, UpdateOptions updateOptions) throws SAXException, IOException {
        InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(url);
        try {
            update(url, inputStreamOpenStream, outputStream, updateOptions);
            try {
                inputStreamOpenStream.close();
            } catch (IOException e) {
                Message.warn("failed to close a stream : " + e.toString());
            }
            try {
                outputStream.close();
            } catch (IOException e2) {
                Message.warn("failed to close a stream : " + e2.toString());
            }
        } finally {
        }
    }

    public static void update(InputStream inputStream, Resource resource, File file, UpdateOptions updateOptions) throws SAXException, IOException {
        URL url;
        if (file.getParentFile() != null) {
            file.getParentFile().mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (resource instanceof URLResource) {
                url = ((URLResource) resource).getURL();
            } else {
                url = resource instanceof FileResource ? ((FileResource) resource).getFile().toURI().toURL() : null;
            }
            update(url, inputStream, fileOutputStream, updateOptions);
            try {
                inputStream.close();
            } catch (IOException e) {
                Message.warn("failed to close a stream : " + e.toString());
            }
            try {
                fileOutputStream.close();
            } catch (IOException e2) {
                Message.warn("failed to close a stream : " + e2.toString());
            }
        } finally {
        }
    }

    public static class UpdaterHandler extends DefaultHandler implements LexicalHandler {
        public static final int CONFIGURATIONS_POSITION;
        public static final int DEPENDENCIES_POSITION;
        public static final Collection<String> INFO_ELEMENTS;
        public static final List<String> MODULE_ELEMENTS;
        public static final Collection<String> STD_ATTS = Arrays.asList(IvyPatternHelper.ORGANISATION_KEY, "module", IvyPatternHelper.BRANCH_KEY, IvyPatternHelper.REVISION_KEY, "status", "publication", "namespace");
        public final List<String> confs;
        public final boolean generateRevConstraint;
        public boolean indenting;

        /* renamed from: ns */
        public final Namespace f9999ns;
        public final UpdateOptions options;
        public final PrintWriter out;
        public final Date pubdate;
        public final URL relativePathCtx;
        public final boolean replaceInclude;
        public final Map<ModuleRevisionId, String> resolvedBranches;
        public final Map<ModuleRevisionId, String> resolvedRevisions;
        public final String revision;
        public final ParserSettings settings;
        public final String status;
        public boolean inHeader = true;
        public String organisation = null;
        public String defaultConf = null;
        public String defaultConfMapping = null;
        public Boolean confMappingOverride = null;
        public String justOpen = null;
        public StringBuilder currentIndent = new StringBuilder();
        public List<String> indentLevels = new ArrayList();
        public boolean hasDescription = false;
        public boolean mergedConfigurations = false;
        public boolean mergedDependencies = false;
        public String newDefaultConf = null;
        public Stack<String> context = new Stack<>();
        public Stack<ExtendedBuffer> buffers = new Stack<>();
        public Stack<ExtendedBuffer> confAttributeBuffers = new Stack<>();

        @Override // org.xml.sax.ext.LexicalHandler
        public void endCDATA() throws SAXException {
        }

        @Override // org.xml.sax.ext.LexicalHandler
        public void endDTD() throws SAXException {
        }

        @Override // org.xml.sax.ext.LexicalHandler
        public void endEntity(String str) throws SAXException {
        }

        @Override // org.xml.sax.ext.LexicalHandler
        public void startCDATA() throws SAXException {
        }

        @Override // org.xml.sax.ext.LexicalHandler
        public void startDTD(String str, String str2, String str3) throws SAXException {
        }

        @Override // org.xml.sax.ext.LexicalHandler
        public void startEntity(String str) throws SAXException {
        }

        static {
            List<String> listAsList = Arrays.asList("info", "configurations", ClientConfigurationFields.PUBLICATIONS, "dependencies", "conflicts");
            MODULE_ELEMENTS = listAsList;
            CONFIGURATIONS_POSITION = listAsList.indexOf("configurations");
            DEPENDENCIES_POSITION = listAsList.indexOf("dependencies");
            INFO_ELEMENTS = Arrays.asList("extends", "ivyauthor", "license", "repository", "description");
        }

        public UpdaterHandler(URL url, PrintWriter printWriter, UpdateOptions updateOptions) {
            this.options = updateOptions;
            this.settings = updateOptions.getSettings();
            this.out = printWriter;
            this.resolvedRevisions = updateOptions.getResolvedRevisions();
            this.resolvedBranches = updateOptions.getResolvedBranches();
            this.status = updateOptions.getStatus();
            this.revision = updateOptions.getRevision();
            this.pubdate = updateOptions.getPubdate();
            this.f9999ns = updateOptions.getNamespace();
            this.replaceInclude = updateOptions.isReplaceInclude();
            this.generateRevConstraint = updateOptions.isGenerateRevConstraint();
            this.relativePathCtx = url;
            if (updateOptions.getConfsToExclude() != null) {
                this.confs = Arrays.asList(updateOptions.getConfsToExclude());
            } else {
                this.confs = Collections.emptyList();
            }
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws MalformedURLException, SAXException {
            String str4;
            int i = 0;
            this.inHeader = false;
            endIndent();
            if (this.justOpen != null) {
                write(">");
            }
            flushMergedElementsBefore(str3);
            if (this.options.isMerge() && (("exclude".equals(str2) || "override".equals(str2) || "conflict".equals(str2)) && "ivy-module/dependencies".equals(getContext()))) {
                writeInheritedDependencies(this.options.getMergedDescriptor());
                this.out.println();
                this.out.print(getIndent());
            }
            this.context.push(str3);
            String context = getContext();
            if ("info".equals(str3)) {
                infoStarted(attributes);
            } else if (this.replaceInclude && MotionScene.INCLUDE_TAG.equals(str3) && this.context.contains("configurations")) {
                includeStarted(attributes);
            } else if ("ivy-module/info/extends".equals(context)) {
                if (this.options.isMerge()) {
                    ExtendsDescriptor[] inheritedDescriptors = this.options.getMergedDescriptor().getInheritedDescriptors();
                    int length = inheritedDescriptors.length;
                    while (i < length) {
                        ModuleDescriptor parentMd = inheritedDescriptors[i].getParentMd();
                        if (parentMd instanceof DefaultModuleDescriptor) {
                            DefaultModuleDescriptor defaultModuleDescriptor = (DefaultModuleDescriptor) parentMd;
                            if (defaultModuleDescriptor.getDefaultConf() != null) {
                                this.defaultConf = defaultModuleDescriptor.getDefaultConf();
                            }
                            if (defaultModuleDescriptor.getDefaultConfMapping() != null) {
                                this.defaultConfMapping = defaultModuleDescriptor.getDefaultConfMapping();
                            }
                            if (defaultModuleDescriptor.isMappingOverride()) {
                                this.confMappingOverride = Boolean.TRUE;
                            }
                        }
                        i++;
                    }
                }
                startExtends(attributes);
            } else if ("ivy-module/dependencies/dependency".equals(context)) {
                startElementInDependency(attributes);
            } else if ("ivy-module/configurations/conf".equals(context)) {
                startElementInConfigurationsConf(str3, attributes);
            } else if ("dependencies".equals(str3) || "configurations".equals(str3)) {
                startElementWithConfAttributes(str3, attributes);
            } else if ("ivy-module/publications/artifact/conf".equals(context) || "ivy-module/dependencies/dependency/conf".equals(context) || "ivy-module/dependencies/dependency/artifact/conf".equals(context)) {
                this.buffers.push(new ExtendedBuffer(getContext()));
                this.confAttributeBuffers.peek().setDefaultPrint(false);
                if (!this.confs.contains(substitute(this.settings, attributes.getValue("name")))) {
                    this.confAttributeBuffers.peek().setPrint(true);
                    this.buffers.peek().setPrint(true);
                    write("<" + str3);
                    while (i < attributes.getLength()) {
                        write(" " + attributes.getQName(i) + "=\"" + substitute(this.settings, attributes.getValue(i)) + "\"");
                        i++;
                    }
                }
            } else if ("ivy-module/publications/artifact".equals(context)) {
                ExtendedBuffer extendedBuffer = new ExtendedBuffer(getContext());
                this.buffers.push(extendedBuffer);
                this.confAttributeBuffers.push(extendedBuffer);
                write("<" + str3);
                extendedBuffer.setDefaultPrint(attributes.getValue(IvyPatternHelper.CONF_KEY) == null && ((str4 = this.newDefaultConf) == null || !str4.isEmpty()));
                while (i < attributes.getLength()) {
                    String qName = attributes.getQName(i);
                    if (IvyPatternHelper.CONF_KEY.equals(qName)) {
                        String strRemoveConfigurationsFromList = removeConfigurationsFromList(substitute(this.settings, attributes.getValue(IvyPatternHelper.CONF_KEY)));
                        if (!strRemoveConfigurationsFromList.isEmpty()) {
                            write(" " + qName + "=\"" + strRemoveConfigurationsFromList + "\"");
                            this.buffers.peek().setPrint(true);
                        }
                    } else {
                        write(" " + qName + "=\"" + substitute(this.settings, attributes.getValue(i)) + "\"");
                    }
                    i++;
                }
            } else if ("ivy-module/dependencies/dependency/artifact".equals(context)) {
                ExtendedBuffer extendedBuffer2 = new ExtendedBuffer(getContext());
                this.buffers.push(extendedBuffer2);
                this.confAttributeBuffers.push(extendedBuffer2);
                write("<" + str3);
                extendedBuffer2.setDefaultPrint(attributes.getValue(IvyPatternHelper.CONF_KEY) == null);
                while (i < attributes.getLength()) {
                    String qName2 = attributes.getQName(i);
                    if (IvyPatternHelper.CONF_KEY.equals(qName2)) {
                        String strRemoveConfigurationsFromList2 = removeConfigurationsFromList(substitute(this.settings, attributes.getValue(IvyPatternHelper.CONF_KEY)));
                        if (!strRemoveConfigurationsFromList2.isEmpty()) {
                            write(" " + qName2 + "=\"" + strRemoveConfigurationsFromList2 + "\"");
                            this.buffers.peek().setPrint(true);
                        }
                    } else {
                        write(" " + qName2 + "=\"" + substitute(this.settings, attributes.getValue(i)) + "\"");
                    }
                    i++;
                }
            } else if ("ivy-module/publications".equals(context)) {
                startPublications(attributes);
            } else {
                if (this.options.isMerge() && context.startsWith("ivy-module/info")) {
                    ModuleDescriptor mergedDescriptor = this.options.getMergedDescriptor();
                    if (context.equals("ivy-module/info/description")) {
                        this.hasDescription = true;
                    } else if (!INFO_ELEMENTS.contains(str3)) {
                        writeInheritedDescription(mergedDescriptor);
                    }
                }
                write("<" + str3);
                while (i < attributes.getLength()) {
                    write(" " + attributes.getQName(i) + "=\"" + substitute(this.settings, attributes.getValue(i)) + "\"");
                    i++;
                }
            }
            this.justOpen = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x00b2 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void startExtends(Attributes attributes) {
            String strSubstitute;
            if (this.options.isMerge()) {
                write("<!-- ");
            }
            write("<extends");
            String strSubstitute2 = substitute(this.settings, attributes.getValue(IvyPatternHelper.ORGANISATION_KEY));
            String strSubstitute3 = substitute(this.settings, attributes.getValue("module"));
            ModuleId moduleId = new ModuleId(strSubstitute2, strSubstitute3);
            for (int i = 0; i < attributes.getLength(); i++) {
                String qName = attributes.getQName(i);
                qName.hashCode();
                switch (qName) {
                    case "module":
                        strSubstitute = strSubstitute3;
                        break;
                    case "revision":
                        ModuleDescriptor mergedDescriptor = this.options.getMergedDescriptor();
                        String str = null;
                        if (mergedDescriptor != null) {
                            for (ExtendsDescriptor extendsDescriptor : mergedDescriptor.getInheritedDescriptors()) {
                                ModuleRevisionId resolvedParentRevisionId = extendsDescriptor.getResolvedParentRevisionId();
                                if (moduleId.equals(resolvedParentRevisionId.getModuleId())) {
                                    String revision = resolvedParentRevisionId.getRevision();
                                    if (revision != null) {
                                        strSubstitute = revision;
                                        if (strSubstitute == null) {
                                            strSubstitute = substitute(this.settings, attributes.getValue(i));
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        str = revision;
                                    }
                                }
                            }
                            strSubstitute = str;
                            if (strSubstitute == null) {
                            }
                        } else {
                            strSubstitute = str;
                            if (strSubstitute == null) {
                            }
                        }
                    case "organisation":
                        strSubstitute = strSubstitute2;
                        break;
                    default:
                        strSubstitute = substitute(this.settings, attributes.getValue(i));
                        break;
                }
                write(" " + qName + "=\"" + strSubstitute + "\"");
            }
        }

        public final void startElementInConfigurationsConf(String str, Attributes attributes) {
            this.buffers.push(new ExtendedBuffer(getContext()));
            if (this.confs.contains(substitute(this.settings, attributes.getValue("name")))) {
                return;
            }
            this.buffers.peek().setPrint(true);
            String strSubstitute = substitute(this.settings, attributes.getValue("extends"));
            if (strSubstitute != null) {
                for (String str2 : StringUtils.splitToArray(strSubstitute)) {
                    if (this.confs.contains(str2)) {
                        throw new IllegalArgumentException("Cannot exclude a configuration which is extended.");
                    }
                }
            }
            write("<" + str);
            for (int i = 0; i < attributes.getLength(); i++) {
                write(" " + attributes.getQName(i) + "=\"" + substitute(this.settings, attributes.getValue(i)) + "\"");
            }
        }

        public final void startElementWithConfAttributes(String str, Attributes attributes) {
            write("<" + str);
            for (int i = 0; i < attributes.getLength(); i++) {
                String qName = attributes.getQName(i);
                if ("defaultconf".equals(qName) || "defaultconfmapping".equals(qName)) {
                    String strRemoveConfigurationsFromMapping = removeConfigurationsFromMapping(substitute(this.settings, attributes.getValue(qName)));
                    if (!strRemoveConfigurationsFromMapping.isEmpty()) {
                        write(" " + qName + "=\"" + strRemoveConfigurationsFromMapping + "\"");
                    }
                } else {
                    write(" " + qName + "=\"" + substitute(this.settings, attributes.getValue(i)) + "\"");
                }
            }
            if (this.defaultConf != null && attributes.getValue("defaultconf") == null) {
                String strRemoveConfigurationsFromMapping2 = removeConfigurationsFromMapping(this.defaultConf);
                if (!strRemoveConfigurationsFromMapping2.isEmpty()) {
                    write(" defaultconf=\"" + strRemoveConfigurationsFromMapping2 + "\"");
                }
            }
            if (this.defaultConfMapping != null && attributes.getValue("defaultconfmapping") == null) {
                String strRemoveConfigurationsFromMapping3 = removeConfigurationsFromMapping(this.defaultConfMapping);
                if (!strRemoveConfigurationsFromMapping3.isEmpty()) {
                    write(" defaultconfmapping=\"" + strRemoveConfigurationsFromMapping3 + "\"");
                }
            }
            if (this.confMappingOverride == null || attributes.getValue("confmappingoverride") != null) {
                return;
            }
            write(" confmappingoverride=\"" + this.confMappingOverride.toString() + "\"");
        }

        public final void startPublications(Attributes attributes) {
            write("<publications");
            for (int i = 0; i < attributes.getLength(); i++) {
                String qName = attributes.getQName(i);
                if ("defaultconf".equals(qName)) {
                    String strRemoveConfigurationsFromList = removeConfigurationsFromList(substitute(this.settings, attributes.getValue("defaultconf")));
                    this.newDefaultConf = strRemoveConfigurationsFromList;
                    if (!strRemoveConfigurationsFromList.isEmpty()) {
                        write(" " + qName + "=\"" + this.newDefaultConf + "\"");
                    }
                } else {
                    write(" " + qName + "=\"" + substitute(this.settings, attributes.getValue(i)) + "\"");
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00f2  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x019c A[PHI: r10
  0x019c: PHI (r10v12 java.lang.String) = (r10v9 java.lang.String), (r10v9 java.lang.String), (r10v10 java.lang.String), (r10v13 java.lang.String) binds: [B:66:0x01d1, B:68:0x01db, B:64:0x01a3, B:61:0x0185] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void startElementInDependency(Attributes attributes) {
            char c;
            String str;
            String str2;
            String str3;
            String str4;
            String str5 = "rev";
            String str6 = "name";
            ExtendedBuffer extendedBuffer = new ExtendedBuffer(getContext());
            this.buffers.push(extendedBuffer);
            this.confAttributeBuffers.push(extendedBuffer);
            extendedBuffer.setDefaultPrint(StringUtils.isNullOrEmpty(attributes.getValue(IvyPatternHelper.CONF_KEY)));
            write("<dependency");
            String strSubstitute = substitute(this.settings, attributes.getValue("org"));
            if (strSubstitute == null) {
                strSubstitute = this.organisation;
            }
            String strSubstitute2 = substitute(this.settings, attributes.getValue("name"));
            String strSubstitute3 = substitute(this.settings, attributes.getValue(IvyPatternHelper.BRANCH_KEY));
            String strSubstitute4 = substitute(this.settings, attributes.getValue("branchConstraint"));
            if (strSubstitute4 == null) {
                strSubstitute4 = strSubstitute3;
            }
            if (strSubstitute3 == null) {
                ModuleId moduleIdNewInstance = ModuleId.newInstance(strSubstitute, strSubstitute2);
                Namespace namespace = this.f9999ns;
                if (namespace != null) {
                    moduleIdNewInstance = NameSpaceHelper.transform(moduleIdNewInstance, namespace.getToSystemTransformer());
                }
                Iterator<ModuleRevisionId> it = this.resolvedRevisions.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ModuleRevisionId next = it.next();
                    if (next.getModuleId().equals(moduleIdNewInstance)) {
                        strSubstitute3 = next.getBranch();
                        break;
                    }
                }
            }
            String strSubstitute5 = substitute(this.settings, attributes.getValue("rev"));
            String strSubstitute6 = substitute(this.settings, attributes.getValue("revConstraint"));
            ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(strSubstitute, strSubstitute2, strSubstitute3, strSubstitute5, ExtendableItemHelper.getExtraAttributes(this.settings, attributes, XmlModuleDescriptorParser.DEPENDENCY_REGULAR_ATTRIBUTES));
            Namespace namespace2 = this.f9999ns;
            if (namespace2 != null) {
                moduleRevisionIdNewInstance = namespace2.getToSystemTransformer().transform(moduleRevisionIdNewInstance);
            }
            String str7 = this.resolvedBranches.get(moduleRevisionIdNewInstance);
            int i = 0;
            while (i < attributes.getLength()) {
                String qName = attributes.getQName(i);
                qName.hashCode();
                int i2 = i;
                switch (qName.hashCode()) {
                    case -1381030494:
                        if (!qName.equals(IvyPatternHelper.BRANCH_KEY)) {
                            c = 65535;
                            break;
                        } else {
                            c = 0;
                            break;
                        }
                    case 110308:
                        if (qName.equals("org")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 112803:
                        if (qName.equals(str5)) {
                            c = 2;
                            break;
                        }
                        break;
                    case 3059492:
                        if (qName.equals(IvyPatternHelper.CONF_KEY)) {
                            c = 3;
                            break;
                        }
                        break;
                    case 3373707:
                        if (qName.equals(str6)) {
                            c = 4;
                            break;
                        }
                        break;
                    case 1280473824:
                        if (qName.equals("revConstraint")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 1358361887:
                        if (qName.equals("branchConstraint")) {
                            c = 6;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        str = str6;
                        str2 = strSubstitute6;
                        str3 = str5;
                        if (str7 != null) {
                            write(" branch=\"" + str7 + "\"");
                            break;
                        } else if (!this.resolvedBranches.containsKey(moduleRevisionIdNewInstance)) {
                            write(" branch=\"" + moduleRevisionIdNewInstance.getBranch() + "\"");
                            break;
                        }
                        break;
                    case 1:
                        str = str6;
                        str2 = strSubstitute6;
                        str3 = str5;
                        write(" org=\"" + moduleRevisionIdNewInstance.getOrganisation() + "\"");
                        break;
                    case 2:
                        String str8 = strSubstitute6;
                        str3 = str5;
                        String str9 = this.resolvedRevisions.get(moduleRevisionIdNewInstance);
                        str2 = str8;
                        if (str9 == null) {
                            write(" rev=\"" + moduleRevisionIdNewInstance.getRevision() + "\"");
                            str = str6;
                            break;
                        } else {
                            str = str6;
                            write(" rev=\"" + str9 + "\"");
                            if (attributes.getIndex("branchConstraint") == -1 && strSubstitute4 != null) {
                                write(" branchConstraint=\"" + strSubstitute4 + "\"");
                            }
                            if (this.generateRevConstraint && attributes.getIndex("revConstraint") == -1 && !str9.equals(moduleRevisionIdNewInstance.getRevision())) {
                                write(" revConstraint=\"" + moduleRevisionIdNewInstance.getRevision() + "\"");
                                break;
                            }
                        }
                        break;
                    case 3:
                        str4 = strSubstitute6;
                        String strSubstitute7 = substitute(this.settings, attributes.getValue(IvyPatternHelper.CONF_KEY));
                        if (!strSubstitute7.isEmpty()) {
                            String strRemoveConfigurationsFromMapping = removeConfigurationsFromMapping(strSubstitute7);
                            if (strRemoveConfigurationsFromMapping.isEmpty()) {
                                str3 = str5;
                            } else {
                                StringBuilder sb = new StringBuilder();
                                str3 = str5;
                                sb.append(" conf=\"");
                                sb.append(strRemoveConfigurationsFromMapping);
                                sb.append("\"");
                                write(sb.toString());
                                this.buffers.peek().setPrint(true);
                            }
                            str = str6;
                            str2 = str4;
                            break;
                        }
                    case 4:
                        str4 = strSubstitute6;
                        write(" name=\"" + moduleRevisionIdNewInstance.getName() + "\"");
                        str3 = str5;
                        str = str6;
                        str2 = str4;
                        break;
                    case 5:
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(" revConstraint=\"");
                        str4 = strSubstitute6;
                        sb2.append(str4);
                        sb2.append("\"");
                        write(sb2.toString());
                        str3 = str5;
                        str = str6;
                        str2 = str4;
                        break;
                    case 6:
                        write(" branchConstraint=\"" + strSubstitute4 + "\"");
                        str = str6;
                        str2 = strSubstitute6;
                        str3 = str5;
                        break;
                    default:
                        write(" " + qName + "=\"" + substitute(this.settings, attributes.getValue(qName)) + "\"");
                        str = str6;
                        str2 = strSubstitute6;
                        str3 = str5;
                        break;
                }
                i = i2 + 1;
                str5 = str3;
                strSubstitute6 = str2;
                str6 = str;
            }
            if (attributes.getIndex(IvyPatternHelper.BRANCH_KEY) == -1) {
                if (!StringUtils.isNullOrEmpty(str7)) {
                    write(" branch=\"" + str7 + "\"");
                    return;
                }
                if (!this.options.isUpdateBranch() || moduleRevisionIdNewInstance.getBranch() == null) {
                    return;
                }
                write(" branch=\"" + moduleRevisionIdNewInstance.getBranch() + "\"");
            }
        }

        public final void includeStarted(Attributes attributes) throws MalformedURLException, SAXException {
            URL url;
            final ExtendedBuffer extendedBuffer = new ExtendedBuffer(getContext());
            this.buffers.push(extendedBuffer);
            try {
                ParserSettings parserSettings = this.settings;
                if (parserSettings == null) {
                    String value = attributes.getValue(PomReader.PomProfileElement.FILE);
                    if (value == null) {
                        url = new URL(attributes.getValue("url"));
                    } else {
                        url = Checks.checkAbsolute(value, "settings.include").toURI().toURL();
                    }
                } else {
                    url = parserSettings.getRelativeUrlResolver().getURL(this.relativePathCtx, this.settings.substitute(attributes.getValue(PomReader.PomProfileElement.FILE)), this.settings.substitute(attributes.getValue("url")));
                }
                XMLHelper.parse(url, null, new DefaultHandler() { // from class: org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorUpdater.UpdaterHandler.1
                    public boolean insideConfigurations = false;
                    public boolean doIndent = false;

                    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                    public void startElement(String str, String str2, String str3, Attributes attributes2) throws SAXException {
                        if ("configurations".equals(str3)) {
                            this.insideConfigurations = true;
                            UpdaterHandler updaterHandler = UpdaterHandler.this;
                            String strSubstitute = updaterHandler.substitute(updaterHandler.settings, attributes2.getValue("defaultconf"));
                            if (strSubstitute != null) {
                                UpdaterHandler.this.defaultConf = strSubstitute;
                            }
                            UpdaterHandler updaterHandler2 = UpdaterHandler.this;
                            String strSubstitute2 = updaterHandler2.substitute(updaterHandler2.settings, attributes2.getValue("defaultconfmapping"));
                            if (strSubstitute2 != null) {
                                UpdaterHandler.this.defaultConfMapping = strSubstitute2;
                            }
                            UpdaterHandler updaterHandler3 = UpdaterHandler.this;
                            String strSubstitute3 = updaterHandler3.substitute(updaterHandler3.settings, attributes2.getValue("confmappingoverride"));
                            if (strSubstitute3 != null) {
                                UpdaterHandler.this.confMappingOverride = Boolean.valueOf(strSubstitute3);
                                return;
                            }
                            return;
                        }
                        if (IvyPatternHelper.CONF_KEY.equals(str3) && this.insideConfigurations) {
                            UpdaterHandler updaterHandler4 = UpdaterHandler.this;
                            if (UpdaterHandler.this.confs.contains(updaterHandler4.substitute(updaterHandler4.settings, attributes2.getValue("name")))) {
                                return;
                            }
                            extendedBuffer.setPrint(true);
                            if (this.doIndent) {
                                UpdaterHandler.this.write("/>\n\t\t");
                            }
                            UpdaterHandler updaterHandler5 = UpdaterHandler.this;
                            String strSubstitute4 = updaterHandler5.substitute(updaterHandler5.settings, attributes2.getValue("extends"));
                            if (strSubstitute4 != null) {
                                for (String str4 : StringUtils.splitToArray(strSubstitute4)) {
                                    if (UpdaterHandler.this.confs.contains(str4)) {
                                        throw new IllegalArgumentException("Cannot exclude a configuration which is extended.");
                                    }
                                }
                            }
                            UpdaterHandler.this.write("<" + str3);
                            for (int i = 0; i < attributes2.getLength(); i++) {
                                UpdaterHandler updaterHandler6 = UpdaterHandler.this;
                                StringBuilder sb = new StringBuilder();
                                sb.append(" ");
                                sb.append(attributes2.getQName(i));
                                sb.append("=\"");
                                UpdaterHandler updaterHandler7 = UpdaterHandler.this;
                                sb.append(updaterHandler7.substitute(updaterHandler7.settings, attributes2.getValue(i)));
                                sb.append("\"");
                                updaterHandler6.write(sb.toString());
                            }
                            this.doIndent = true;
                        }
                    }

                    @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                    public void endElement(String str, String str2, String str3) throws SAXException {
                        if ("configurations".equals(str3)) {
                            this.insideConfigurations = false;
                        }
                    }
                });
            } catch (Exception e) {
                Message.warn("exception occurred while importing configurations: " + e.getMessage());
                throw new SAXException(e);
            }
        }

        public final void infoStarted(Attributes attributes) {
            String strSubstitute;
            String strSubstitute2;
            String strSubstitute3;
            String strSubstitute4;
            Map<String, String> linkedHashMap;
            Namespace namespace;
            String strSubstitute5 = substitute(this.settings, attributes.getValue("module"));
            if (this.options.isMerge()) {
                ModuleDescriptor mergedDescriptor = this.options.getMergedDescriptor();
                ModuleRevisionId moduleRevisionId = mergedDescriptor.getModuleRevisionId();
                this.organisation = moduleRevisionId.getOrganisation();
                strSubstitute2 = moduleRevisionId.getBranch();
                strSubstitute = moduleRevisionId.getRevision();
                strSubstitute3 = mergedDescriptor.getStatus();
                strSubstitute4 = (!(mergedDescriptor instanceof DefaultModuleDescriptor) || (namespace = ((DefaultModuleDescriptor) mergedDescriptor).getNamespace()) == null) ? null : namespace.getName();
                if (strSubstitute4 == null) {
                    strSubstitute4 = attributes.getValue("namespace");
                }
                linkedHashMap = mergedDescriptor.getQualifiedExtraAttributes();
            } else {
                this.organisation = substitute(this.settings, attributes.getValue(IvyPatternHelper.ORGANISATION_KEY));
                strSubstitute = substitute(this.settings, attributes.getValue(IvyPatternHelper.REVISION_KEY));
                strSubstitute2 = substitute(this.settings, attributes.getValue(IvyPatternHelper.BRANCH_KEY));
                strSubstitute3 = substitute(this.settings, attributes.getValue("status"));
                strSubstitute4 = substitute(this.settings, attributes.getValue("namespace"));
                linkedHashMap = new LinkedHashMap<>(attributes.getLength());
                for (int i = 0; i < attributes.getLength(); i++) {
                    String qName = attributes.getQName(i);
                    if (!STD_ATTS.contains(qName)) {
                        linkedHashMap.put(qName, substitute(this.settings, attributes.getValue(i)));
                    }
                }
            }
            String str = this.revision;
            if (str != null) {
                strSubstitute = str;
            }
            if (this.options.getBranch() != null) {
                strSubstitute2 = this.options.getBranch();
            }
            String str2 = this.status;
            if (str2 != null) {
                strSubstitute3 = str2;
            }
            ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(this.organisation, strSubstitute5, strSubstitute2, strSubstitute, ExtendableItemHelper.getExtraAttributes(this.settings, attributes, (List<String>) Arrays.asList(IvyPatternHelper.ORGANISATION_KEY, "module", IvyPatternHelper.REVISION_KEY, "status", "publication", "namespace")));
            Namespace namespace2 = this.f9999ns;
            if (namespace2 != null) {
                moduleRevisionIdNewInstance = namespace2.getToSystemTransformer().transform(moduleRevisionIdNewInstance);
            }
            write("<info");
            if (this.organisation != null) {
                write(" organisation=\"" + XMLHelper.escape(moduleRevisionIdNewInstance.getOrganisation()) + "\"");
            }
            write(" module=\"" + XMLHelper.escape(moduleRevisionIdNewInstance.getName()) + "\"");
            if (strSubstitute2 != null) {
                write(" branch=\"" + XMLHelper.escape(moduleRevisionIdNewInstance.getBranch()) + "\"");
            }
            if (moduleRevisionIdNewInstance.getRevision() != null) {
                write(" revision=\"" + XMLHelper.escape(moduleRevisionIdNewInstance.getRevision()) + "\"");
            }
            write(" status=\"" + XMLHelper.escape(strSubstitute3) + "\"");
            if (this.pubdate != null) {
                write(" publication=\"" + DateUtil.format(this.pubdate) + "\"");
            } else if (attributes.getValue("publication") != null) {
                write(" publication=\"" + substitute(this.settings, attributes.getValue("publication")) + "\"");
            }
            if (strSubstitute4 != null) {
                write(" namespace=\"" + strSubstitute4 + "\"");
            }
            for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
                write(" " + entry.getKey() + "=\"" + entry.getValue() + "\"");
            }
        }

        public final void write(String str) {
            getWriter().print(str);
        }

        public final PrintWriter getWriter() {
            return this.buffers.isEmpty() ? this.out : this.buffers.peek().getWriter();
        }

        public final String getContext() {
            Stack<String> stack = this.context;
            return StringUtils.joinArray((String[]) stack.toArray(new String[stack.size()]), "/");
        }

        public final String substitute(ParserSettings parserSettings, String str) {
            if (parserSettings != null) {
                str = parserSettings.substitute(str);
            }
            return XMLHelper.escape(str);
        }

        public final String removeConfigurationsFromMapping(String str) {
            StringBuilder sb = new StringBuilder();
            String[] strArrSplit = str.trim().split("\\s*;\\s*");
            int length = strArrSplit.length;
            int i = 0;
            String str2 = "";
            int i2 = 0;
            while (i2 < length) {
                String str3 = strArrSplit[i2];
                String[] strArrSplit2 = str3.split("->");
                ArrayList<String> arrayList = new ArrayList();
                String[] strArrSplitToArray = StringUtils.splitToArray(strArrSplit2[i]);
                int length2 = strArrSplitToArray.length;
                for (int i3 = i; i3 < length2; i3++) {
                    String str4 = strArrSplitToArray[i3];
                    if (!this.confs.contains(str4)) {
                        arrayList.add(str4);
                    }
                }
                if (!arrayList.isEmpty()) {
                    sb.append(str2);
                    String str5 = str3.contains(", ") ? ", " : ",";
                    String str6 = "";
                    for (String str7 : arrayList) {
                        sb.append(str6);
                        sb.append(str7);
                        str6 = str5;
                    }
                    if (strArrSplit2.length == 2) {
                        sb.append("->");
                        sb.append(StringUtils.joinArray(StringUtils.splitToArray(strArrSplit2[1]), str6));
                    }
                    str2 = PropertiesParser.PROPS_SEPARATOR;
                }
                i2++;
                i = 0;
            }
            return sb.toString();
        }

        public final String removeConfigurationsFromList(String str) {
            StringBuilder sb = new StringBuilder();
            String str2 = str.contains(", ") ? ", " : ",";
            String str3 = "";
            for (String str4 : StringUtils.splitToArray(str)) {
                if (!this.confs.contains(str4)) {
                    sb.append(str3);
                    sb.append(str4);
                    str3 = str2;
                }
            }
            return sb.toString();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void ignorableWhitespace(char[] cArr, int i, int i2) throws SAXException {
            characters(cArr, i, i2);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i, int i2) throws SAXException {
            if (this.justOpen != null) {
                write(">");
                this.justOpen = null;
            }
            write(XMLHelper.escape(String.valueOf(cArr, i, i2)));
            int i3 = i2 + i;
            while (i < i3) {
                char c = cArr[i];
                if (c == '\r' || c == '\n') {
                    this.currentIndent.setLength(0);
                    this.indenting = true;
                } else if (this.indenting) {
                    if (Character.isWhitespace(c)) {
                        this.currentIndent.append(c);
                    } else {
                        endIndent();
                    }
                }
                i++;
            }
        }

        public final void endIndent() {
            if (this.indenting) {
                setIndent(this.context.size() - 1, this.currentIndent.toString());
                this.indenting = false;
            }
        }

        public final void setIndent(int i, String str) {
            fillIndents(i);
            this.indentLevels.set(i, str);
        }

        public final void fillIndents(int i) {
            if (this.indentLevels.isEmpty()) {
                this.indentLevels.add(JsonKt.defaultIndent);
            }
            String str = this.indentLevels.get(0);
            for (int size = this.indentLevels.size(); size <= i; size++) {
                this.indentLevels.add(this.indentLevels.get(size - 1) + str);
            }
        }

        public final String getIndent() {
            int size = this.context.size() - 1;
            fillIndents(size);
            return this.indentLevels.get(size);
        }

        public final void writeInheritedItems(ModuleDescriptor moduleDescriptor, InheritableItem[] inheritableItemArr, ItemPrinter itemPrinter, String str, boolean z) {
            PrintWriter writer = getWriter();
            Map<ModuleRevisionId, List<InheritableItem>> mapCollateInheritedItems = collateInheritedItems(moduleDescriptor, inheritableItemArr);
            boolean z2 = !mapCollateInheritedItems.isEmpty();
            if (z2 && z) {
                if (this.currentIndent.length() == 0) {
                    writer.print(getIndent());
                }
                String str2 = this.defaultConf;
                String strRemoveConfigurationsFromMapping = str2 == null ? "" : removeConfigurationsFromMapping(str2);
                String str3 = this.defaultConfMapping;
                String strRemoveConfigurationsFromMapping2 = str3 == null ? "" : removeConfigurationsFromMapping(str3);
                writer.print(String.format("<%s%s%s%s>", str, strRemoveConfigurationsFromMapping.isEmpty() ? "" : " defaultconf=\"" + strRemoveConfigurationsFromMapping + "\"", strRemoveConfigurationsFromMapping2.isEmpty() ? "" : " defaultconfmapping=\"" + strRemoveConfigurationsFromMapping2 + "\"", this.confMappingOverride != null ? " confmappingoverride=\"" + this.confMappingOverride + "\"" : ""));
                this.context.push(str);
                this.justOpen = null;
            }
            for (Map.Entry<ModuleRevisionId, List<InheritableItem>> entry : mapCollateInheritedItems.entrySet()) {
                if (this.justOpen != null) {
                    writer.println(">");
                    this.justOpen = null;
                }
                writeInheritanceComment(str, entry.getKey());
                for (InheritableItem inheritableItem : entry.getValue()) {
                    writer.print(getIndent());
                    itemPrinter.print(moduleDescriptor, inheritableItem, writer);
                }
            }
            if (z2) {
                if (z) {
                    this.context.pop();
                    writer.println(getIndent() + "</" + str + ">");
                    writer.println();
                }
                writer.print(this.currentIndent);
            }
        }

        public final void writeInheritanceComment(String str, Object obj) {
            PrintWriter writer = getWriter();
            writer.println();
            writer.println(getIndent() + "<!-- " + str + " inherited from " + obj + " -->");
        }

        public final Map<ModuleRevisionId, List<InheritableItem>> collateInheritedItems(ModuleDescriptor moduleDescriptor, InheritableItem[] inheritableItemArr) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (InheritableItem inheritableItem : inheritableItemArr) {
                ModuleRevisionId sourceModule = inheritableItem.getSourceModule();
                if (sourceModule != null && !sourceModule.getModuleId().equals(moduleDescriptor.getModuleRevisionId().getModuleId())) {
                    List arrayList = (List) linkedHashMap.get(sourceModule);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(sourceModule, arrayList);
                    }
                    arrayList.add(inheritableItem);
                }
            }
            return linkedHashMap;
        }

        public final void writeInheritedDescription(ModuleDescriptor moduleDescriptor) {
            if (this.hasDescription) {
                return;
            }
            this.hasDescription = true;
            String description = moduleDescriptor.getDescription();
            if (StringUtils.isNullOrEmpty(description)) {
                return;
            }
            PrintWriter writer = getWriter();
            if (this.justOpen != null) {
                writer.println(">");
            }
            writeInheritanceComment("description", "parent");
            writer.println(getIndent() + "<description>" + XMLHelper.escape(description) + "</description>");
            writer.print(this.currentIndent);
            this.justOpen = null;
        }

        public final void writeInheritedConfigurations(ModuleDescriptor moduleDescriptor) {
            if (this.mergedConfigurations) {
                return;
            }
            this.mergedConfigurations = true;
            writeInheritedItems(moduleDescriptor, moduleDescriptor.getConfigurations(), ConfigurationPrinter.INSTANCE, "configurations", false);
        }

        public final void writeInheritedDependencies(ModuleDescriptor moduleDescriptor) {
            if (this.mergedDependencies) {
                return;
            }
            this.mergedDependencies = true;
            writeInheritedItems(moduleDescriptor, moduleDescriptor.getDependencies(), DependencyPrinter.INSTANCE, "dependencies", false);
        }

        public final void flushMergedElementsBefore(String str) {
            int iIndexOf;
            if (this.options.isMerge() && this.context.size() == 1 && "ivy-module".equals(this.context.peek())) {
                if (this.mergedConfigurations && this.mergedDependencies) {
                    return;
                }
                if (str == null) {
                    iIndexOf = MODULE_ELEMENTS.size();
                } else {
                    iIndexOf = MODULE_ELEMENTS.indexOf(str);
                }
                ModuleDescriptor mergedDescriptor = this.options.getMergedDescriptor();
                if (!this.mergedConfigurations && iIndexOf > CONFIGURATIONS_POSITION && mergedDescriptor.getConfigurations().length > 0) {
                    this.mergedConfigurations = true;
                    writeInheritedItems(mergedDescriptor, mergedDescriptor.getConfigurations(), ConfigurationPrinter.INSTANCE, "configurations", true);
                }
                if (this.mergedDependencies || iIndexOf <= DEPENDENCIES_POSITION || mergedDescriptor.getDependencies().length <= 0) {
                    return;
                }
                this.mergedDependencies = true;
                writeInheritedItems(mergedDescriptor, mergedDescriptor.getDependencies(), DependencyPrinter.INSTANCE, "dependencies", true);
            }
        }

        public final void flushAllMergedElements() {
            flushMergedElementsBefore(null);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) throws SAXException {
            ModuleDescriptor mergedDescriptor;
            String context = getContext();
            if (this.options.isMerge()) {
                mergedDescriptor = this.options.getMergedDescriptor();
                context.hashCode();
                switch (context) {
                    case "ivy-module/configurations":
                        writeInheritedConfigurations(mergedDescriptor);
                        break;
                    case "ivy-module":
                        flushAllMergedElements();
                        break;
                    case "ivy-module/info":
                        writeInheritedDescription(mergedDescriptor);
                        break;
                    case "ivy-module/dependencies":
                        writeInheritedDependencies(mergedDescriptor);
                        break;
                }
            }
            if (str3.equals(this.justOpen)) {
                write("/>");
            } else {
                write("</" + str3 + ">");
            }
            if (!this.buffers.isEmpty()) {
                ExtendedBuffer extendedBufferPeek = this.buffers.peek();
                if (extendedBufferPeek.getContext().equals(context)) {
                    this.buffers.pop();
                    if (extendedBufferPeek.isPrint()) {
                        write(extendedBufferPeek.toString());
                    }
                }
            }
            if (!this.confAttributeBuffers.isEmpty() && this.confAttributeBuffers.peek().getContext().equals(context)) {
                this.confAttributeBuffers.pop();
            }
            if (this.options.isMerge() && "ivy-module/info/extends".equals(context)) {
                write(" -->");
            }
            this.justOpen = null;
            this.context.pop();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() throws SAXException {
            this.out.print(XmlModuleDescriptorUpdater.LINE_SEPARATOR);
            this.out.flush();
            this.out.close();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) throws SAXException {
            write("<?");
            write(str);
            write(" ");
            write(str2);
            write("?>");
            write(XmlModuleDescriptorUpdater.LINE_SEPARATOR);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) throws SAXException {
            throw sAXParseException;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) throws SAXException {
            throw sAXParseException;
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) throws SAXException {
            throw sAXParseException;
        }

        @Override // org.xml.sax.ext.LexicalHandler
        public void comment(char[] cArr, int i, int i2) throws SAXException {
            if (this.justOpen != null) {
                write(">");
                this.justOpen = null;
            }
            write("<!--");
            write(String.valueOf(cArr, i, i2));
            write("-->");
            if (this.inHeader) {
                write(XmlModuleDescriptorUpdater.LINE_SEPARATOR);
            }
        }
    }

    public static void update(URL url, InputStream inputStream, OutputStream outputStream, UpdateOptions updateOptions) throws SAXException, IOException {
        PrintWriter printWriter = new PrintWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
        printWriter.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
        printWriter.write(LINE_SEPARATOR);
        try {
            UpdaterHandler updaterHandler = new UpdaterHandler(url, printWriter, updateOptions);
            InputSource inputSource = new InputSource(new BufferedInputStream(inputStream));
            if (url != null) {
                inputSource.setSystemId(url.toExternalForm());
            }
            XMLHelper.parse(inputSource, (URL) null, updaterHandler, updaterHandler);
        } catch (ParserConfigurationException e) {
            throw new IllegalStateException("impossible to update Ivy files: parser problem", e);
        }
    }

    public static class ExtendedBuffer {
        public String context;
        public Boolean print = null;
        public boolean defaultPrint = false;
        public StringWriter buffer = new StringWriter();
        public PrintWriter writer = new PrintWriter(this.buffer);

        public ExtendedBuffer(String str) {
            this.context = null;
            this.context = str;
        }

        public boolean isPrint() {
            Boolean bool = this.print;
            if (bool == null) {
                return this.defaultPrint;
            }
            return bool.booleanValue();
        }

        public void setPrint(boolean z) {
            this.print = Boolean.valueOf(z);
        }

        public void setDefaultPrint(boolean z) {
            this.defaultPrint = z;
        }

        public PrintWriter getWriter() {
            return this.writer;
        }

        public String getContext() {
            return this.context;
        }

        public String toString() {
            this.writer.flush();
            return this.buffer.toString();
        }
    }

    /* loaded from: classes5.dex */
    public static class DependencyPrinter implements ItemPrinter {
        public static final DependencyPrinter INSTANCE = new DependencyPrinter();

        @Override // org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorUpdater.ItemPrinter
        public void print(ModuleDescriptor moduleDescriptor, Object obj, PrintWriter printWriter) {
            XmlModuleDescriptorWriter.printDependency(moduleDescriptor, (DependencyDescriptor) obj, printWriter);
        }
    }

    /* loaded from: classes5.dex */
    public static class ConfigurationPrinter implements ItemPrinter {
        public static final ConfigurationPrinter INSTANCE = new ConfigurationPrinter();

        @Override // org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorUpdater.ItemPrinter
        public void print(ModuleDescriptor moduleDescriptor, Object obj, PrintWriter printWriter) {
            XmlModuleDescriptorWriter.printConfiguration((Configuration) obj, printWriter);
        }
    }
}
