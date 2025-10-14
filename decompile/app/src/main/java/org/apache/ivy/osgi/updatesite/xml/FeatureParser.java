package org.apache.ivy.osgi.updatesite.xml;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.osgi.util.DelegatingHandler;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.util.XMLHelper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes5.dex */
public class FeatureParser {
    public static EclipseFeature parse(InputStream inputStream) throws SAXException, IOException {
        FeatureHandler featureHandler = new FeatureHandler();
        try {
            XMLHelper.parse(inputStream, (URL) null, featureHandler, (LexicalHandler) null);
            return featureHandler.feature;
        } catch (ParserConfigurationException e) {
            throw new SAXException(e);
        }
    }

    public static class FeatureHandler extends DelegatingHandler {
        public static final String APPLICATION = "application";
        public static final String ARCH = "arch";
        public static final String COLOCATION_AFFINITY = "colocation-affinity";
        public static final String EXCLUSIVE = "exclusive";
        public static final String FEATURE = "feature";

        /* renamed from: ID */
        public static final String f9988ID = "id";
        public static final String IMAGE = "image";
        public static final String LABEL = "label";

        /* renamed from: NL */
        public static final String f9989NL = "nl";

        /* renamed from: OS */
        public static final String f9990OS = "os";
        public static final String PLUGIN = "plugin";
        public static final String PRIMARY = "primary";
        public static final String PROVIDER_NAME = "provider-name";
        public static final String VERSION = "version";

        /* renamed from: WS */
        public static final String f9991WS = "ws";
        public EclipseFeature feature;

        public FeatureHandler() {
            super("feature");
            addChild(new DescriptionHandler(), new DelegatingHandler.ChildElementHandler<DescriptionHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.FeatureParser.FeatureHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(DescriptionHandler descriptionHandler) {
                    FeatureHandler.this.feature.setDescription(descriptionHandler.getBufferedChars().trim());
                }
            });
            addChild(new LicenseHandler(), new DelegatingHandler.ChildElementHandler<LicenseHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.FeatureParser.FeatureHandler.2
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(LicenseHandler licenseHandler) {
                    FeatureHandler.this.feature.setLicense(licenseHandler.getBufferedChars().trim());
                }
            });
            addChild(new CopyrightHandler(), new DelegatingHandler.ChildElementHandler<CopyrightHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.FeatureParser.FeatureHandler.3
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(CopyrightHandler copyrightHandler) {
                    FeatureHandler.this.feature.setCopyright(copyrightHandler.getBufferedChars().trim());
                }
            });
            addChild(new PluginHandler(), new DelegatingHandler.ChildElementHandler<PluginHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.FeatureParser.FeatureHandler.4
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(PluginHandler pluginHandler) {
                    FeatureHandler.this.feature.addPlugin(pluginHandler.plugin);
                }
            });
            addChild(new RequiresHandler(), new DelegatingHandler.ChildElementHandler<RequiresHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.FeatureParser.FeatureHandler.5
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(RequiresHandler requiresHandler) {
                    Iterator<Require> it = requiresHandler.requires.iterator();
                    while (it.hasNext()) {
                        FeatureHandler.this.feature.addRequire(it.next());
                    }
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            EclipseFeature eclipseFeature = new EclipseFeature(attributes.getValue("id"), new Version(attributes.getValue("version")));
            this.feature = eclipseFeature;
            eclipseFeature.setOS(attributes.getValue("os"));
            this.feature.setWS(attributes.getValue("ws"));
            this.feature.setNL(attributes.getValue("nl"));
            this.feature.setArch(attributes.getValue("arch"));
            this.feature.setApplication(attributes.getValue("application"));
            this.feature.setPlugin(attributes.getValue("plugin"));
            this.feature.setExclusive(Boolean.valueOf(attributes.getValue(EXCLUSIVE)).booleanValue());
            this.feature.setPrimary(Boolean.valueOf(attributes.getValue(PRIMARY)).booleanValue());
            this.feature.setColocationAffinity(attributes.getValue(COLOCATION_AFFINITY));
            this.feature.setProviderName(attributes.getValue(PROVIDER_NAME));
            this.feature.setLabel(attributes.getValue("label"));
            this.feature.setImage(attributes.getValue("image"));
        }
    }

    public static class PluginHandler extends DelegatingHandler {
        public static final String FILTER = "filter";
        public static final String FRAGMENT = "fragment";

        /* renamed from: ID */
        public static final String f9992ID = "id";
        public static final String PLUGIN = "plugin";
        public static final String UNPACK = "unpack";
        public static final String VERSION = "version";
        public EclipsePlugin plugin;

        public PluginHandler() {
            super("plugin");
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.plugin = new EclipsePlugin();
            String value = attributes.getValue("id");
            String value2 = attributes.getValue("version");
            this.plugin.setId(value);
            this.plugin.setVersion(new Version(value2));
            this.plugin.setUnpack(Boolean.valueOf(attributes.getValue(UNPACK)).booleanValue());
            this.plugin.setFragment(attributes.getValue(FRAGMENT));
            this.plugin.setFilter(attributes.getValue("filter"));
        }
    }

    public static class DescriptionHandler extends DelegatingHandler {
        public static final String DESCRIPTION = "description";

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
        }

        public DescriptionHandler() {
            super("description");
            setBufferingChar(true);
        }
    }

    public static class LicenseHandler extends DelegatingHandler {
        public static final String LICENSE = "license";

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
        }

        public LicenseHandler() {
            super("license");
            setBufferingChar(true);
        }
    }

    public static class CopyrightHandler extends DelegatingHandler {
        public static final String COPYRIGHT = "copyright";

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
        }

        public CopyrightHandler() {
            super(COPYRIGHT);
            setBufferingChar(true);
        }
    }

    public static class RequiresHandler extends DelegatingHandler {
        public static final String REQUIRES = "requires";
        public List<Require> requires;

        public RequiresHandler() {
            super("requires");
            this.requires = new ArrayList();
            addChild(new ImportHandler(), new DelegatingHandler.ChildElementHandler<ImportHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.FeatureParser.RequiresHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ImportHandler importHandler) {
                    RequiresHandler.this.requires.add(importHandler.require);
                }
            });
        }
    }

    public static class ImportHandler extends DelegatingHandler {
        public static final String FEATURE = "feature";
        public static final String FILTER = "filter";
        public static final String IMPORT = "import";
        public static final String MATCH = "match";
        public static final String PLUGIN = "plugin";
        public static final String VERSION = "version";
        public Require require;

        public ImportHandler() {
            super(IMPORT);
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.require = new Require();
            String value = attributes.getValue("version");
            this.require.setFeature(attributes.getValue("feature"));
            this.require.setPlugin(attributes.getValue("plugin"));
            this.require.setVersion(new Version(value));
            this.require.setMatch(attributes.getValue(MATCH));
            this.require.setFilter(attributes.getValue("filter"));
        }
    }
}
