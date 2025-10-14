package org.apache.ivy.osgi.p063p2;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.osgi.filter.OSGiFilter;
import org.apache.ivy.osgi.filter.OSGiFilterParser;
import org.apache.ivy.osgi.p063p2.PropertiesParser;
import org.apache.ivy.osgi.util.DelegatingHandler;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.util.XMLHelper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes5.dex */
public class P2ArtifactParser implements XMLInputParser {
    public final P2Descriptor p2Descriptor;
    public final String repoUrl;

    public P2ArtifactParser(P2Descriptor p2Descriptor, String str) {
        this.p2Descriptor = p2Descriptor;
        this.repoUrl = str;
    }

    @Override // org.apache.ivy.osgi.p063p2.XMLInputParser
    public void parse(InputStream inputStream) throws SAXException, IOException, ParseException {
        try {
            XMLHelper.parse(inputStream, (URL) null, new RepositoryHandler(this.p2Descriptor, this.repoUrl), (LexicalHandler) null);
        } catch (ParserConfigurationException e) {
            throw new SAXException(e);
        }
    }

    public static class RepositoryHandler extends DelegatingHandler {
        public static final String REPOSITORY = "repository";
        public Map<OSGiFilter, String> artifactPatterns;

        public RepositoryHandler(P2Descriptor p2Descriptor, String str) {
            super("repository");
            this.artifactPatterns = new LinkedHashMap();
            addChild(new MappingsHandler(), new DelegatingHandler.ChildElementHandler<MappingsHandler>() { // from class: org.apache.ivy.osgi.p2.P2ArtifactParser.RepositoryHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(MappingsHandler mappingsHandler) {
                    for (Map.Entry<String, String> entry : mappingsHandler.outputByFilter.entrySet()) {
                        try {
                            RepositoryHandler.this.artifactPatterns.put(OSGiFilterParser.parse(entry.getKey()), entry.getValue());
                        } catch (ParseException unused) {
                            throw new IllegalStateException();
                        }
                    }
                }
            });
            addChild(new ArtifactsHandler(p2Descriptor, this.artifactPatterns, str), new DelegatingHandler.ChildElementHandler<ArtifactsHandler>() { // from class: org.apache.ivy.osgi.p2.P2ArtifactParser.RepositoryHandler.2
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ArtifactsHandler artifactsHandler) {
                }
            });
        }
    }

    public static class MappingsHandler extends DelegatingHandler {
        public static final String MAPPINGS = "mappings";
        public static final String SIZE = "size";
        public Map<String, String> outputByFilter;

        public MappingsHandler() {
            super(MAPPINGS);
            addChild(new RuleHandler(), new DelegatingHandler.ChildElementHandler<RuleHandler>() { // from class: org.apache.ivy.osgi.p2.P2ArtifactParser.MappingsHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(RuleHandler ruleHandler) {
                    MappingsHandler.this.outputByFilter.put(ruleHandler.filter, ruleHandler.output);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.outputByFilter = new LinkedHashMap(Integer.parseInt(attributes.getValue("size")));
        }
    }

    public static class RuleHandler extends DelegatingHandler {
        public static final String FILTER = "filter";
        public static final String OUTPUT = "output";
        public static final String RULE = "rule";
        public String filter;
        public String output;

        public RuleHandler() {
            super(RULE);
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.filter = attributes.getValue("filter");
            this.output = attributes.getValue(OUTPUT);
        }
    }

    public static class ArtifactsHandler extends DelegatingHandler {
        public static final String ARTIFACTS = "artifacts";

        public ArtifactsHandler(final P2Descriptor p2Descriptor, final Map<OSGiFilter, String> map, final String str) {
            super("artifacts");
            addChild(new ArtifactHandler(), new DelegatingHandler.ChildElementHandler<ArtifactHandler>() { // from class: org.apache.ivy.osgi.p2.P2ArtifactParser.ArtifactsHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ArtifactHandler artifactHandler) throws SAXParseException, URISyntaxException {
                    String pattern = getPattern(artifactHandler.p2Artifact, artifactHandler.properties);
                    if (pattern != null) {
                        String strReplaceAll = pattern.replaceAll("\\$\\{repoUrl\\}", str).replaceAll("\\$\\{id\\}", artifactHandler.p2Artifact.getId()).replaceAll("\\$\\{version\\}", artifactHandler.p2Artifact.getVersion().toString());
                        try {
                            p2Descriptor.addArtifactUrl(artifactHandler.p2Artifact.getClassifier(), artifactHandler.p2Artifact.getId(), artifactHandler.p2Artifact.getVersion(), new URL(strReplaceAll).toURI(), (String) artifactHandler.properties.get("format"));
                        } catch (MalformedURLException | URISyntaxException e) {
                            throw new SAXParseException("Incorrect artifact url '" + strReplaceAll + "' (" + e.getMessage() + ")", ArtifactsHandler.this.getLocator(), e);
                        }
                    }
                }

                public final String getPattern(P2Artifact p2Artifact, Map<String, String> map2) {
                    HashMap map3 = new HashMap(map2);
                    map3.put("classifier", p2Artifact.getClassifier());
                    for (Map.Entry entry : map.entrySet()) {
                        if (((OSGiFilter) entry.getKey()).eval(map3)) {
                            return (String) entry.getValue();
                        }
                    }
                    return null;
                }
            });
        }
    }

    public static class ArtifactHandler extends DelegatingHandler {
        public static final String ARTIFACT = "artifact";
        public static final String CLASSIFIER = "classifier";

        /* renamed from: ID */
        public static final String f9977ID = "id";
        public static final String VERSION = "version";
        public P2Artifact p2Artifact;
        public Map<String, String> properties;

        public ArtifactHandler() {
            super("artifact");
            addChild(new PropertiesParser.PropertiesHandler(new String[0]), new DelegatingHandler.ChildElementHandler<PropertiesParser.PropertiesHandler>() { // from class: org.apache.ivy.osgi.p2.P2ArtifactParser.ArtifactHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(PropertiesParser.PropertiesHandler propertiesHandler) {
                    ArtifactHandler.this.properties = propertiesHandler.properties;
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.p2Artifact = new P2Artifact(attributes.getValue("id"), new Version(attributes.getValue("version")), attributes.getValue("classifier"));
        }
    }
}
