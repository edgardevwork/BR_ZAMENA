package org.apache.ivy.plugins.parser;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DefaultModuleDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.ResourceHelper;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.StringUtils;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes5.dex */
public abstract class AbstractModuleDescriptorParser implements ModuleDescriptorParser {
    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, boolean z) throws IOException, ParseException {
        return parseDescriptor(parserSettings, url, new URLResource(url), z);
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public String getType() {
        return ClientConfigurationFields.IVY;
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public Artifact getMetadataArtifact(ModuleRevisionId moduleRevisionId, Resource resource) {
        return DefaultArtifact.newIvyArtifact(moduleRevisionId, new Date(resource.getLastModified()));
    }

    /* loaded from: classes6.dex */
    public static abstract class AbstractParser extends DefaultHandler {
        public static final String DEFAULT_CONF_MAPPING = "*->*";
        public String defaultConf;
        public String defaultConfMapping;
        public DefaultDependencyDescriptor defaultConfMappingDescriptor;
        public List<String> errors = new ArrayList();

        /* renamed from: md */
        public DefaultModuleDescriptor f9996md;
        public ModuleDescriptorParser parser;
        public Resource res;

        public AbstractParser(ModuleDescriptorParser moduleDescriptorParser) {
            this.parser = moduleDescriptorParser;
        }

        public ModuleDescriptorParser getModuleDescriptorParser() {
            return this.parser;
        }

        public void checkErrors() throws ParseException {
            if (!this.errors.isEmpty()) {
                throw new ParseException(this.errors.toString(), 0);
            }
        }

        public void setResource(Resource resource) {
            this.res = resource;
            DefaultModuleDescriptor defaultModuleDescriptor = new DefaultModuleDescriptor(this.parser, resource);
            this.f9996md = defaultModuleDescriptor;
            defaultModuleDescriptor.setLastModified(ResourceHelper.getLastModifiedOrDefault(resource));
        }

        public Resource getResource() {
            return this.res;
        }

        public String getDefaultConfMapping() {
            return this.defaultConfMapping;
        }

        public void setDefaultConfMapping(String str) {
            this.defaultConfMapping = str;
            getMd().setDefaultConfMapping(str);
        }

        public void parseDepsConfs(String str, DefaultDependencyDescriptor defaultDependencyDescriptor) {
            parseDepsConfs(str, defaultDependencyDescriptor, this.defaultConfMapping != null);
        }

        public void parseDepsConfs(String str, DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            parseDepsConfs(str, defaultDependencyDescriptor, z, true);
        }

        public void parseDepsConfs(String str, DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z, boolean z2) {
            if (str == null) {
                return;
            }
            parseDepsConfs(str.trim().split("\\s*;\\s*"), defaultDependencyDescriptor, z, z2);
        }

        public void parseDepsConfs(String[] strArr, DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            parseDepsConfs(strArr, defaultDependencyDescriptor, z, true);
        }

        public void parseDepsConfs(String[] strArr, DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z, boolean z2) {
            String strTrim;
            replaceConfigurationWildcards(this.f9996md);
            for (String str : strArr) {
                String[] strArrSplit = str.split("->");
                int length = strArrSplit.length;
                if (length == 1) {
                    for (String str2 : StringUtils.splitToArray(strArrSplit[0])) {
                        if (z) {
                            String[] dependencyConfigurations = getDefaultConfMappingDescriptor().getDependencyConfigurations(str2);
                            if (dependencyConfigurations.length > 0) {
                                for (String str3 : dependencyConfigurations) {
                                    if (z2) {
                                        strTrim = evaluateCondition(str3.trim(), defaultDependencyDescriptor);
                                    } else {
                                        strTrim = str3.trim();
                                    }
                                    if (strTrim != null) {
                                        defaultDependencyDescriptor.addDependencyConfiguration(str2, strTrim);
                                    }
                                }
                            } else {
                                defaultDependencyDescriptor.addDependencyConfiguration(str2, str2);
                            }
                        } else {
                            defaultDependencyDescriptor.addDependencyConfiguration(str2, str2);
                        }
                    }
                } else if (length == 2) {
                    for (String str4 : StringUtils.splitToArray(strArrSplit[0])) {
                        for (String strEvaluateCondition : StringUtils.splitToArray(strArrSplit[1])) {
                            if (z2) {
                                strEvaluateCondition = evaluateCondition(strEvaluateCondition, defaultDependencyDescriptor);
                            }
                            if (strEvaluateCondition != null) {
                                defaultDependencyDescriptor.addDependencyConfiguration(str4, strEvaluateCondition);
                            }
                        }
                    }
                } else {
                    addError("invalid conf " + str + " for " + defaultDependencyDescriptor);
                }
            }
            if (this.f9996md.isMappingOverride()) {
                addExtendingConfigurations(strArr, defaultDependencyDescriptor, z);
            }
        }

        public final String evaluateCondition(String str, DefaultDependencyDescriptor defaultDependencyDescriptor) {
            if (str.charAt(0) != '[') {
                return str;
            }
            int iIndexOf = str.indexOf(93);
            if (iIndexOf == -1) {
                addError("invalid conf " + str + " for " + defaultDependencyDescriptor);
                return null;
            }
            String strSubstring = str.substring(1, iIndexOf);
            int iIndexOf2 = strSubstring.indexOf("!=");
            String str2 = IvyPatternHelper.ORGANISATION_KEY;
            if (iIndexOf2 == -1) {
                int iIndexOf3 = strSubstring.indexOf(61);
                if (iIndexOf3 == -1) {
                    addError("invalid conf " + str + " for " + defaultDependencyDescriptor.getDependencyRevisionId());
                    return null;
                }
                String strTrim = strSubstring.substring(0, iIndexOf3).trim();
                String strTrim2 = strSubstring.substring(iIndexOf3 + 1).trim();
                if (!strTrim.equals("org") && !strTrim.equals(IvyPatternHelper.ORGANISATION_KEY2)) {
                    str2 = strTrim;
                }
                if (!strTrim2.equals(defaultDependencyDescriptor.getAttribute(str2))) {
                    return null;
                }
            } else {
                String strTrim3 = strSubstring.substring(0, iIndexOf2).trim();
                String strTrim4 = strSubstring.substring(iIndexOf2 + 2).trim();
                if (!strTrim3.equals("org") && !strTrim3.equals(IvyPatternHelper.ORGANISATION_KEY2)) {
                    str2 = strTrim3;
                }
                if (strTrim4.equals(defaultDependencyDescriptor.getAttribute(str2))) {
                    return null;
                }
            }
            return str.substring(iIndexOf + 1);
        }

        public final void addExtendingConfigurations(String[] strArr, DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            for (String str : strArr) {
                addExtendingConfigurations(str, defaultDependencyDescriptor, z);
            }
        }

        public final void addExtendingConfigurations(String str, DefaultDependencyDescriptor defaultDependencyDescriptor, boolean z) {
            HashSet hashSet = new HashSet();
            for (Configuration configuration : this.f9996md.getConfigurations()) {
                for (String str2 : configuration.getExtends()) {
                    if (str.equals(str2)) {
                        String name = configuration.getName();
                        hashSet.add(name);
                        addExtendingConfigurations(name, defaultDependencyDescriptor, z);
                    }
                }
            }
            parseDepsConfs((String[]) hashSet.toArray(new String[hashSet.size()]), defaultDependencyDescriptor, z);
        }

        public DependencyDescriptor getDefaultConfMappingDescriptor() {
            if (this.defaultConfMappingDescriptor == null) {
                DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(ModuleRevisionId.newInstance("", "", ""), false);
                this.defaultConfMappingDescriptor = defaultDependencyDescriptor;
                parseDepsConfs(this.defaultConfMapping, defaultDependencyDescriptor, false, false);
            }
            return this.defaultConfMappingDescriptor;
        }

        public void addError(String str) {
            if (this.res != null) {
                this.errors.add(str + " in " + this.res + org.apache.commons.lang3.StringUtils.f9903LF);
                return;
            }
            this.errors.add(str + org.apache.commons.lang3.StringUtils.f9903LF);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public void warning(SAXParseException sAXParseException) {
            Message.warn("xml parsing: " + getLocationString(sAXParseException) + ": " + sAXParseException.getMessage());
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public void error(SAXParseException sAXParseException) {
            addError("xml parsing: " + getLocationString(sAXParseException) + ": " + sAXParseException.getMessage());
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ErrorHandler
        public void fatalError(SAXParseException sAXParseException) throws SAXException {
            addError("[Fatal Error] " + getLocationString(sAXParseException) + ": " + sAXParseException.getMessage());
        }

        public final String getLocationString(SAXParseException sAXParseException) {
            StringBuilder sb = new StringBuilder();
            String systemId = sAXParseException.getSystemId();
            if (systemId != null) {
                int iLastIndexOf = systemId.lastIndexOf(47);
                if (iLastIndexOf != -1) {
                    systemId = systemId.substring(iLastIndexOf + 1);
                }
                sb.append(systemId);
            } else if (getResource() != null) {
                sb.append(getResource().toString());
            }
            sb.append(':');
            sb.append(sAXParseException.getLineNumber());
            sb.append(':');
            sb.append(sAXParseException.getColumnNumber());
            return sb.toString();
        }

        public String getDefaultConf() {
            String str = this.defaultConf;
            if (str != null) {
                return str;
            }
            String str2 = this.defaultConfMapping;
            return str2 != null ? str2 : DEFAULT_CONF_MAPPING;
        }

        public void setDefaultConf(String str) {
            this.defaultConf = str;
            getMd().setDefaultConf(str);
        }

        public ModuleDescriptor getModuleDescriptor() throws ParseException {
            checkErrors();
            return this.f9996md;
        }

        public Date getDefaultPubDate() {
            return new Date(this.f9996md.getLastModified());
        }

        public final void replaceConfigurationWildcards(ModuleDescriptor moduleDescriptor) {
            for (Configuration configuration : moduleDescriptor.getConfigurations()) {
                configuration.replaceWildcards(moduleDescriptor);
            }
        }

        public void setMd(DefaultModuleDescriptor defaultModuleDescriptor) {
            this.f9996md = defaultModuleDescriptor;
        }

        public DefaultModuleDescriptor getMd() {
            return this.f9996md;
        }
    }
}
