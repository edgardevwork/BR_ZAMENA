package org.apache.ivy.osgi.updatesite.xml;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.updatesite.UpdateSiteDescriptor;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.apache.ivy.osgi.util.DelegatingHandler;
import org.apache.ivy.util.XMLHelper;
import org.xml.sax.SAXException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes5.dex */
public class UpdateSiteDigestParser {
    public static UpdateSiteDescriptor parse(InputStream inputStream, UpdateSite updateSite) throws SAXException, IOException {
        DigestHandler digestHandler = new DigestHandler(updateSite);
        try {
            XMLHelper.parse(inputStream, (URL) null, digestHandler, (LexicalHandler) null);
            return digestHandler.repoDescriptor;
        } catch (ParserConfigurationException e) {
            throw new SAXException(e);
        }
    }

    public static class DigestHandler extends DelegatingHandler {
        public static final String DIGEST = "digest";
        public UpdateSiteDescriptor repoDescriptor;

        public DigestHandler(UpdateSite updateSite) {
            super(DIGEST);
            this.repoDescriptor = new UpdateSiteDescriptor(updateSite.getUri(), ExecutionEnvironmentProfileProvider.getInstance());
            addChild(new FeatureParser.FeatureHandler(), new DelegatingHandler.ChildElementHandler<FeatureParser.FeatureHandler>() { // from class: org.apache.ivy.osgi.updatesite.xml.UpdateSiteDigestParser.DigestHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(FeatureParser.FeatureHandler featureHandler) {
                    DigestHandler.this.repoDescriptor.addFeature(featureHandler.feature);
                }
            });
        }
    }
}
