package org.apache.ivy.osgi.p063p2;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.osgi.core.BundleCapability;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.BundleRequirement;
import org.apache.ivy.osgi.core.ExportPackage;
import org.apache.ivy.osgi.core.ManifestParser;
import org.apache.ivy.osgi.p063p2.PropertiesParser;
import org.apache.ivy.osgi.util.DelegatingHandler;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.osgi.util.VersionRange;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.XMLHelper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes5.dex */
public class P2MetadataParser implements XMLInputParser {
    public int logLevel = 2;
    public final P2Descriptor p2Descriptor;

    public P2MetadataParser(P2Descriptor p2Descriptor) {
        this.p2Descriptor = p2Descriptor;
    }

    public void setLogLevel(int i) {
        this.logLevel = i;
    }

    @Override // org.apache.ivy.osgi.p063p2.XMLInputParser
    public void parse(InputStream inputStream) throws SAXException, IOException, ParseException {
        try {
            XMLHelper.parse(inputStream, (URL) null, new RepositoryHandler(this.p2Descriptor), (LexicalHandler) null);
        } catch (ParserConfigurationException e) {
            throw new SAXException(e);
        }
    }

    public class RepositoryHandler extends DelegatingHandler {
        public static final String REPOSITORY = "repository";

        public RepositoryHandler(final P2Descriptor p2Descriptor) {
            super("repository");
            addChild(P2MetadataParser.this.new UnitsHandler(), new DelegatingHandler.ChildElementHandler<UnitsHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.RepositoryHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(UnitsHandler unitsHandler) {
                    Iterator<BundleInfo> it = unitsHandler.bundles.iterator();
                    while (it.hasNext()) {
                        p2Descriptor.addBundle(it.next());
                    }
                }
            });
            addChild(P2MetadataParser.this.new ReferencesHandler(), new DelegatingHandler.ChildElementHandler<ReferencesHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.RepositoryHandler.2
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ReferencesHandler referencesHandler) {
                }
            });
        }
    }

    public class ReferencesHandler extends DelegatingHandler {
        public static final String REFERENCES = "references";
        public static final String SIZE = "size";
        public List<URI> repositoryUris;

        public ReferencesHandler() {
            super(REFERENCES);
            addChild(P2MetadataParser.this.new RepositoryReferenceHandler(), new DelegatingHandler.ChildElementHandler<RepositoryReferenceHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.ReferencesHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(RepositoryReferenceHandler repositoryReferenceHandler) {
                    ReferencesHandler.this.repositoryUris.add(repositoryReferenceHandler.uri);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.repositoryUris = new ArrayList(Integer.parseInt(attributes.getValue("size")));
        }
    }

    public class RepositoryReferenceHandler extends DelegatingHandler {
        public static final String REPOSITORY = "repository";
        public static final String URI = "uri";
        public static final String URL = "url";
        public URI uri;

        public RepositoryReferenceHandler() {
            super("repository");
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            String value = attributes.getValue("uri");
            String value2 = attributes.getValue("url");
            if (value != null) {
                try {
                    this.uri = new URI(value);
                } catch (URISyntaxException e) {
                    throw new SAXParseException("Invalid uri attribute " + value + "(" + e.getMessage() + ")", getLocator());
                }
            }
            if (this.uri == null || value2 == null) {
                return;
            }
            try {
                this.uri = new URI(value2);
            } catch (URISyntaxException e2) {
                throw new SAXParseException("Invalid url attribute " + value2 + "(" + e2.getMessage() + ")", getLocator());
            }
        }
    }

    public class UnitsHandler extends DelegatingHandler {
        public static final String SIZE = "size";
        public static final String UNITS = "units";
        public List<BundleInfo> bundles;

        public UnitsHandler() {
            super(UNITS);
            addChild(P2MetadataParser.this.new UnitHandler(), new DelegatingHandler.ChildElementHandler<UnitHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitsHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(UnitHandler unitHandler) {
                    BundleInfo bundleInfo = unitHandler.bundleInfo;
                    if (bundleInfo == null || bundleInfo.getCapabilities().isEmpty()) {
                        return;
                    }
                    UnitsHandler.this.bundles.add(unitHandler.bundleInfo);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.bundles = new ArrayList(Integer.parseInt(attributes.getValue("size")));
        }
    }

    public class UnitHandler extends DelegatingHandler {
        public static final String CATEGORY_PROPERTY = "org.eclipse.equinox.p2.type.category";

        /* renamed from: ID */
        public static final String f9979ID = "id";
        public static final String UNIT = "unit";
        public static final String VERSION = "version";
        public BundleInfo bundleInfo;

        public UnitHandler() {
            super(UNIT);
            addChild(new PropertiesParser.PropertiesHandler(CATEGORY_PROPERTY), new DelegatingHandler.ChildElementHandler<PropertiesParser.PropertiesHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(PropertiesParser.PropertiesHandler propertiesHandler) {
                    String str = propertiesHandler.properties.get(UnitHandler.CATEGORY_PROPERTY);
                    if (str == null || !Boolean.valueOf(str).booleanValue()) {
                        return;
                    }
                    propertiesHandler.getParent().skip();
                    UnitHandler.this.bundleInfo = null;
                }
            });
            addChild(P2MetadataParser.this.new ProvidesHandler(), new DelegatingHandler.ChildElementHandler<ProvidesHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitHandler.2
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ProvidesHandler providesHandler) {
                    if ("source".equals(providesHandler.eclipseType)) {
                        UnitHandler.this.bundleInfo.setSource(true);
                        String symbolicName = UnitHandler.this.bundleInfo.getSymbolicName();
                        if (symbolicName.endsWith(".source")) {
                            UnitHandler.this.bundleInfo.setSymbolicNameTarget(symbolicName.substring(0, symbolicName.length() - 7));
                            BundleInfo bundleInfo = UnitHandler.this.bundleInfo;
                            bundleInfo.setVersionTarget(bundleInfo.getVersion());
                        }
                    }
                    Iterator<BundleCapability> it = providesHandler.capabilities.iterator();
                    while (it.hasNext()) {
                        UnitHandler.this.bundleInfo.addCapability(it.next());
                    }
                }
            });
            addChild(new FilterHandler(), new DelegatingHandler.ChildElementHandler<FilterHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitHandler.3
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(FilterHandler filterHandler) {
                }
            });
            addChild(P2MetadataParser.this.new RequiresHandler(), new DelegatingHandler.ChildElementHandler<RequiresHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitHandler.4
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(RequiresHandler requiresHandler) {
                    Iterator<BundleRequirement> it = requiresHandler.requirements.iterator();
                    while (it.hasNext()) {
                        UnitHandler.this.bundleInfo.addRequirement(it.next());
                    }
                }
            });
            addChild(P2MetadataParser.this.new HostRequirementsHandler(), new DelegatingHandler.ChildElementHandler<HostRequirementsHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitHandler.5
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(HostRequirementsHandler hostRequirementsHandler) {
                }
            });
            addChild(P2MetadataParser.this.new MetaRequirementsHandler(), new DelegatingHandler.ChildElementHandler<MetaRequirementsHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitHandler.6
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(MetaRequirementsHandler metaRequirementsHandler) {
                }
            });
            addChild(P2MetadataParser.this.new ArtifactsHandler(), new DelegatingHandler.ChildElementHandler<ArtifactsHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitHandler.7
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ArtifactsHandler artifactsHandler) {
                }
            });
            addChild(P2MetadataParser.this.new TouchpointDataHandler(), new DelegatingHandler.ChildElementHandler<TouchpointDataHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.UnitHandler.8
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(TouchpointDataHandler touchpointDataHandler) throws SAXParseException {
                    String str;
                    Boolean bool = touchpointDataHandler.zipped;
                    if (bool != null) {
                        UnitHandler.this.bundleInfo.setHasInnerClasspath(bool.booleanValue());
                    }
                    if (UnitHandler.this.bundleInfo.isSource() && (str = touchpointDataHandler.manifest) != null) {
                        try {
                            BundleInfo manifest = ManifestParser.parseManifest(ManifestParser.formatLines(str.trim()));
                            if (!manifest.isSource()) {
                                if (P2MetadataParser.this.logLevel >= 3) {
                                    Message.verbose("The Manifest of the source bundle " + UnitHandler.this.bundleInfo.getSymbolicName() + " is not declaring being a source.");
                                    return;
                                }
                                return;
                            }
                            String symbolicNameTarget = manifest.getSymbolicNameTarget();
                            if (symbolicNameTarget == null) {
                                if (P2MetadataParser.this.logLevel >= 3) {
                                    Message.verbose("The Manifest of the source bundle " + UnitHandler.this.bundleInfo.getSymbolicName() + " is not declaring a target symbolic name.");
                                    return;
                                }
                                return;
                            }
                            Version versionTarget = manifest.getVersionTarget();
                            if (versionTarget == null) {
                                if (P2MetadataParser.this.logLevel >= 3) {
                                    Message.verbose("The Manifest of the source bundle " + UnitHandler.this.bundleInfo.getSymbolicName() + " is not declaring a target version.");
                                    return;
                                }
                                return;
                            }
                            UnitHandler.this.bundleInfo.setSymbolicNameTarget(symbolicNameTarget);
                            UnitHandler.this.bundleInfo.setVersionTarget(versionTarget);
                        } catch (IOException e) {
                            if (P2MetadataParser.this.logLevel >= 3) {
                                Message.verbose("The Manifest of the source bundle " + UnitHandler.this.bundleInfo.getSymbolicName() + " could not be parsed", e);
                            }
                        } catch (ParseException e2) {
                            if (P2MetadataParser.this.logLevel >= 3) {
                                Message.verbose("The Manifest of the source bundle " + UnitHandler.this.bundleInfo.getSymbolicName() + " is ill formed", e2);
                            }
                        }
                    }
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.bundleInfo = new BundleInfo(attributes.getValue("id"), new Version(attributes.getValue("version")));
        }
    }

    public static class FilterHandler extends DelegatingHandler {
        public static final String FILTER = "filter";

        public FilterHandler() {
            super("filter");
            setBufferingChar(true);
        }
    }

    public static String namespace2Type(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("java.package")) {
            return BundleInfo.PACKAGE_TYPE;
        }
        if (str.equals("osgi.bundle")) {
            return BundleInfo.BUNDLE_TYPE;
        }
        return null;
    }

    public class ProvidesHandler extends DelegatingHandler {
        public static final String PROVIDES = "provides";
        public static final String SIZE = "size";
        public List<BundleCapability> capabilities;
        public String eclipseType;

        public ProvidesHandler() {
            super(PROVIDES);
            addChild(new ProvidedHandler(), new DelegatingHandler.ChildElementHandler<ProvidedHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.ProvidesHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ProvidedHandler providedHandler) {
                    BundleCapability bundleCapability;
                    if (!providedHandler.namespace.equals("org.eclipse.equinox.p2.eclipse.type")) {
                        String strNamespace2Type = P2MetadataParser.namespace2Type(providedHandler.namespace);
                        if (strNamespace2Type == null) {
                            if (P2MetadataParser.this.logLevel >= 4) {
                                Message.debug("Unsupported provided capability " + providedHandler.namespace + " " + providedHandler.name + " " + providedHandler.version);
                                return;
                            }
                            return;
                        }
                        if (BundleInfo.PACKAGE_TYPE.equals(strNamespace2Type)) {
                            bundleCapability = new ExportPackage(providedHandler.name, providedHandler.version);
                        } else {
                            bundleCapability = new BundleCapability(strNamespace2Type, providedHandler.name, providedHandler.version);
                        }
                        ProvidesHandler.this.capabilities.add(bundleCapability);
                        return;
                    }
                    ProvidesHandler.this.eclipseType = providedHandler.name;
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.capabilities = new ArrayList(Integer.parseInt(attributes.getValue("size")));
        }
    }

    public static class ProvidedHandler extends DelegatingHandler {
        public static final String NAME = "name";
        public static final String NAMESPACE = "namespace";
        public static final String PROVIDED = "provided";
        public static final String VERSION = "version";
        public String name;
        public String namespace;
        public Version version;

        public ProvidedHandler() {
            super(PROVIDED);
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.namespace = attributes.getValue("namespace");
            this.name = attributes.getValue("name");
            this.version = new Version(attributes.getValue("version"));
        }
    }

    public abstract class AbstractRequirementHandler extends DelegatingHandler {
        public static final String SIZE = "size";
        public List<BundleRequirement> requirements;

        public AbstractRequirementHandler(String str) {
            super(str);
            addChild(P2MetadataParser.this.new RequiredHandler(), new DelegatingHandler.ChildElementHandler<RequiredHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.AbstractRequirementHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(RequiredHandler requiredHandler) {
                    String str2 = requiredHandler.name;
                    VersionRange versionRange = requiredHandler.range;
                    String strNamespace2Type = P2MetadataParser.namespace2Type(requiredHandler.namespace);
                    if (strNamespace2Type == null) {
                        if (P2MetadataParser.this.logLevel >= 4) {
                            Message.debug("Unsupported required capability " + requiredHandler.namespace + " " + str2 + " " + versionRange);
                            return;
                        }
                        return;
                    }
                    AbstractRequirementHandler.this.requirements.add(new BundleRequirement(strNamespace2Type, str2, versionRange, requiredHandler.optional ? "optional" : null));
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.requirements = new ArrayList(Integer.parseInt(attributes.getValue("size")));
        }
    }

    /* loaded from: classes8.dex */
    public class RequiresHandler extends AbstractRequirementHandler {
        public static final String REQUIRES = "requires";

        public RequiresHandler() {
            super("requires");
        }
    }

    public class RequiredHandler extends DelegatingHandler {
        public static final String NAME = "name";
        public static final String NAMESPACE = "namespace";
        public static final String OPTIONAL = "optional";
        public static final String RANGE = "range";
        public static final String REQUIRED = "required";
        public String name;
        public String namespace;
        public boolean optional;
        public VersionRange range;

        public RequiredHandler() {
            super("required");
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXParseException {
            this.namespace = attributes.getValue("namespace");
            this.name = attributes.getValue("name");
            try {
                this.range = new VersionRange(attributes.getValue(RANGE));
                this.optional = getOptionalBooleanAttribute(attributes, "optional", Boolean.FALSE).booleanValue();
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* loaded from: classes8.dex */
    public class HostRequirementsHandler extends AbstractRequirementHandler {
        public static final String HOST_REQUIREMENTS = "hostRequirements";

        public HostRequirementsHandler() {
            super(HOST_REQUIREMENTS);
        }
    }

    /* loaded from: classes8.dex */
    public class MetaRequirementsHandler extends AbstractRequirementHandler {
        public static final String META_REQUIREMENTS = "metaRequirements";

        public MetaRequirementsHandler() {
            super(META_REQUIREMENTS);
        }
    }

    public class ArtifactsHandler extends DelegatingHandler {
        public static final String ARTIFACTS = "artifacts";
        public static final String SIZE = "size";
        public List<P2Artifact> artifacts;

        public ArtifactsHandler() {
            super("artifacts");
            addChild(P2MetadataParser.this.new ArtifactHandler(), new DelegatingHandler.ChildElementHandler<ArtifactHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.ArtifactsHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ArtifactHandler artifactHandler) {
                    ArtifactsHandler.this.artifacts.add(artifactHandler.artifact);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.artifacts = new ArrayList(Integer.parseInt(attributes.getValue("size")));
        }
    }

    public class ArtifactHandler extends DelegatingHandler {
        public static final String ARTIFACT = "artifact";
        public static final String CLASSIFIER = "classifier";

        /* renamed from: ID */
        public static final String f9978ID = "id";
        public static final String VERSION = "version";
        public P2Artifact artifact;

        public ArtifactHandler() {
            super("artifact");
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            String value = attributes.getValue("id");
            String value2 = attributes.getValue("version");
            this.artifact = new P2Artifact(value, new Version(value2), attributes.getValue("classifier"));
        }
    }

    public class TouchpointDataHandler extends DelegatingHandler {
        public static final String TOUCHPOINTDATA = "touchpointData";
        public String manifest;
        public Boolean zipped;

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
        }

        public TouchpointDataHandler() {
            super(TOUCHPOINTDATA);
            addChild(P2MetadataParser.this.new InstructionsHandler(), new DelegatingHandler.ChildElementHandler<InstructionsHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.TouchpointDataHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(InstructionsHandler instructionsHandler) {
                    TouchpointDataHandler touchpointDataHandler = TouchpointDataHandler.this;
                    touchpointDataHandler.manifest = instructionsHandler.manifest;
                    touchpointDataHandler.zipped = instructionsHandler.zipped;
                }
            });
        }
    }

    public class InstructionsHandler extends DelegatingHandler {
        public static final String INSTRUCTIONS = "instructions";
        public String manifest;
        public Boolean zipped;

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
        }

        public InstructionsHandler() {
            super(INSTRUCTIONS);
            addChild(P2MetadataParser.this.new InstructionHandler(), new DelegatingHandler.ChildElementHandler<InstructionHandler>() { // from class: org.apache.ivy.osgi.p2.P2MetadataParser.InstructionsHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(InstructionHandler instructionHandler) {
                    InstructionsHandler instructionsHandler = InstructionsHandler.this;
                    instructionsHandler.manifest = null;
                    instructionsHandler.zipped = null;
                    String strTrim = instructionHandler.getBufferedChars().trim();
                    if ("manifest".equals(instructionHandler.key)) {
                        InstructionsHandler.this.manifest = strTrim;
                    } else {
                        if (!"zipped".equals(instructionHandler.key) || strTrim.length() == 0) {
                            return;
                        }
                        InstructionsHandler.this.zipped = Boolean.valueOf(strTrim);
                    }
                }
            });
        }
    }

    public class InstructionHandler extends DelegatingHandler {
        public static final String INSTRUCTION = "instruction";
        public static final String KEY = "key";
        public String key;

        public InstructionHandler() {
            super(INSTRUCTION);
            setBufferingChar(true);
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            this.key = attributes.getValue("key");
        }
    }
}
