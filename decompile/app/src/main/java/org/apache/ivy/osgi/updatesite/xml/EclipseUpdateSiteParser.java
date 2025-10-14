package org.apache.ivy.osgi.updatesite.xml;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.osgi.util.DelegatingHandler;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.util.StringUtils;
import org.apache.ivy.util.XMLHelper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes5.dex */
public class EclipseUpdateSiteParser {
    public static UpdateSite parse(InputStream inputStream) throws SAXException, IOException {
        SiteHandler siteHandler = new SiteHandler();
        try {
            XMLHelper.parse(inputStream, (URL) null, siteHandler, (LexicalHandler) null);
            return siteHandler.updatesite;
        } catch (ParserConfigurationException e) {
            throw new SAXException(e);
        }
    }

    public static class SiteHandler extends DelegatingHandler {
        public static final String ASSOCIATE_SITES_URL = "associateSitesURL";
        public static final String DIGEST_URL = "digestURL";
        public static final String MIRRORS_URL = "mirrorsURL";
        public static final String PACK200 = "pack200";
        public static final String SITE = "site";
        public static final String URL = "url";
        public UpdateSite updatesite;

        public SiteHandler() {
            super("site");
            addChild(new FeatureHandler(), new DelegatingHandler.ChildElementHandler<FeatureHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser.SiteHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(FeatureHandler featureHandler) {
                    SiteHandler.this.updatesite.addFeature(featureHandler.feature);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.updatesite = new UpdateSite();
            String value = attributes.getValue("url");
            if (!StringUtils.isNullOrEmpty(value)) {
                if (!value.endsWith("/") && !value.endsWith(File.separator)) {
                    value = value + "/";
                }
                try {
                    this.updatesite.setUri(new URI(value));
                } catch (URISyntaxException e) {
                    throw new RuntimeException("illegal url", e);
                }
            }
            String value2 = attributes.getValue(MIRRORS_URL);
            if (!StringUtils.isNullOrEmpty(value2)) {
                this.updatesite.setMirrorsURL(value2);
            }
            String value3 = attributes.getValue("pack200");
            if (value3 != null && Boolean.parseBoolean(value3)) {
                this.updatesite.setPack200(true);
            }
            String value4 = attributes.getValue(DIGEST_URL);
            if (value4 != null) {
                try {
                    this.updatesite.setDigestUri(new URI(value4));
                } catch (URISyntaxException e2) {
                    throw new RuntimeException("illegal url", e2);
                }
            }
            String value5 = attributes.getValue(ASSOCIATE_SITES_URL);
            if (value5 != null) {
                this.updatesite.setAssociateSitesURL(value5);
            }
        }
    }

    public static class FeatureHandler extends DelegatingHandler {
        public static final String ARCH = "arch";
        public static final String FEATURE = "feature";

        /* renamed from: ID */
        public static final String f9984ID = "id";
        public static final String LABEL = "label";

        /* renamed from: NL */
        public static final String f9985NL = "nl";

        /* renamed from: OS */
        public static final String f9986OS = "os";
        public static final String PATCH = "patch";
        public static final String TYPE = "type";
        public static final String URL = "url";
        public static final String VERSION = "version";

        /* renamed from: WS */
        public static final String f9987WS = "ws";
        public EclipseFeature feature;

        public FeatureHandler() {
            super("feature");
            addChild(new CategoryHandler(), new DelegatingHandler.ChildElementHandler<CategoryHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser.FeatureHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(CategoryHandler categoryHandler) {
                    FeatureHandler.this.feature.addCategory(categoryHandler.name);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.feature = new EclipseFeature(attributes.getValue("id"), new Version(attributes.getValue("version")));
            String value = attributes.getValue("url");
            if (value != null) {
                this.feature.setURL(value);
            }
            this.feature.setType(attributes.getValue("type"));
            this.feature.setLabel(attributes.getValue("label"));
            this.feature.setOS(attributes.getValue("os"));
            this.feature.setWS(attributes.getValue("ws"));
            this.feature.setNL(attributes.getValue("nl"));
            this.feature.setArch(attributes.getValue("arch"));
            this.feature.setPatch(attributes.getValue(PATCH));
        }
    }

    public static class CategoryHandler extends DelegatingHandler {
        public static final String CATEGORY = "category";
        public static final String NAME = "name";
        public String name;

        public CategoryHandler() {
            super(CATEGORY);
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.name = attributes.getValue("name");
        }
    }
}
