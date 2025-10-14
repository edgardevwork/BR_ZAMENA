package org.apache.ivy.osgi.obr.xml;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.ivy.osgi.core.BundleArtifact;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.ExecutionEnvironmentProfileProvider;
import org.apache.ivy.osgi.filter.OSGiFilter;
import org.apache.ivy.osgi.filter.OSGiFilterParser;
import org.apache.ivy.osgi.repo.BundleRepoDescriptor;
import org.apache.ivy.osgi.util.DelegatingHandler;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.util.XMLHelper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.LexicalHandler;

/* loaded from: classes5.dex */
public class OBRXMLParser {
    public static BundleRepoDescriptor parse(URI uri, InputStream inputStream) throws SAXException, IOException {
        RepositoryHandler repositoryHandler = new RepositoryHandler(uri);
        try {
            XMLHelper.parse(inputStream, (URL) null, repositoryHandler, (LexicalHandler) null);
            return repositoryHandler.repo;
        } catch (ParserConfigurationException e) {
            throw new SAXException(e);
        }
    }

    /* loaded from: classes7.dex */
    public static class RepositoryHandler extends DelegatingHandler {
        public static final String LASTMODIFIED = "lastmodified";
        public static final String NAME = "name";
        public static final String REPOSITORY = "repository";
        public final URI baseUri;
        public BundleRepoDescriptor repo;

        public RepositoryHandler(URI uri) {
            super("repository");
            this.baseUri = uri;
            addChild(new ResourceHandler(), new DelegatingHandler.ChildElementHandler<ResourceHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.RepositoryHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ResourceHandler resourceHandler) {
                    RepositoryHandler.this.repo.addBundle(resourceHandler.bundleInfo);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) {
            BundleRepoDescriptor bundleRepoDescriptor = new BundleRepoDescriptor(this.baseUri, ExecutionEnvironmentProfileProvider.getInstance());
            this.repo = bundleRepoDescriptor;
            bundleRepoDescriptor.setName(attributes.getValue("name"));
            this.repo.setLastModified(attributes.getValue(LASTMODIFIED));
        }
    }

    public static class ResourceHandler extends DelegatingHandler {
        public static final String DEFAULT_VERSION = "1.0.0";

        /* renamed from: ID */
        public static final String f9975ID = "id";
        public static final String PRESENTATION_NAME = "presentationname";
        public static final String RESOURCE = "resource";
        public static final String SYMBOLIC_NAME = "symbolicname";
        public static final String URI = "uri";
        public static final String VERSION = "version";
        public BundleInfo bundleInfo;

        public ResourceHandler() {
            super(RESOURCE);
            setSkipOnError(true);
            addChild(new ResourceSourceHandler(), new DelegatingHandler.ChildElementHandler<ResourceSourceHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.ResourceHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ResourceSourceHandler resourceSourceHandler) {
                    String strTrim = resourceSourceHandler.getBufferedChars().trim();
                    if (!strTrim.endsWith(".jar")) {
                        ResourceHandler.this.log(1, "A source uri is suspect, it is not ending with .jar, it is probably a pointer to a download page. Ignoring it.");
                        return;
                    }
                    try {
                        ResourceHandler.this.bundleInfo.addArtifact(new BundleArtifact(true, new URI(strTrim), null));
                    } catch (URISyntaxException unused) {
                        ResourceHandler.this.log(1, "Incorrect uri " + strTrim + ". The source of " + ResourceHandler.this.bundleInfo.getSymbolicName() + " is then ignored.");
                    }
                }
            });
            addChild(new ResourceDescriptionHandler(), new DelegatingHandler.ChildElementHandler<ResourceDescriptionHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.ResourceHandler.2
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ResourceDescriptionHandler resourceDescriptionHandler) {
                    ResourceHandler.this.bundleInfo.setDescription(resourceDescriptionHandler.getBufferedChars().trim());
                }
            });
            addChild(new ResourceDocumentationHandler(), new DelegatingHandler.ChildElementHandler<ResourceDocumentationHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.ResourceHandler.3
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ResourceDocumentationHandler resourceDocumentationHandler) {
                    ResourceHandler.this.bundleInfo.setDocumentation(resourceDocumentationHandler.getBufferedChars().trim());
                }
            });
            addChild(new ResourceLicenseHandler(), new DelegatingHandler.ChildElementHandler<ResourceLicenseHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.ResourceHandler.4
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ResourceLicenseHandler resourceLicenseHandler) {
                    ResourceHandler.this.bundleInfo.setLicense(resourceLicenseHandler.getBufferedChars().trim());
                }
            });
            addChild(new ResourceSizeHandler(), new DelegatingHandler.ChildElementHandler<ResourceSizeHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.ResourceHandler.5
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ResourceSizeHandler resourceSizeHandler) {
                    String strTrim = resourceSizeHandler.getBufferedChars().trim();
                    try {
                        ResourceHandler.this.bundleInfo.setSize(Integer.valueOf(strTrim));
                    } catch (NumberFormatException unused) {
                        ResourceHandler.this.log(1, "Invalid size for the bundle " + ResourceHandler.this.bundleInfo.getSymbolicName() + ": " + strTrim + ". This size is then ignored.");
                    }
                }
            });
            addChild(new CapabilityHandler(), new DelegatingHandler.ChildElementHandler<CapabilityHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.ResourceHandler.6
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(CapabilityHandler capabilityHandler) throws SAXParseException {
                    try {
                        CapabilityAdapter.adapt(ResourceHandler.this.bundleInfo, capabilityHandler.capability);
                    } catch (ParseException e) {
                        throw new SAXParseException("Invalid capability: " + e.getMessage(), capabilityHandler.getLocator());
                    }
                }
            });
            addChild(new RequireHandler(), new DelegatingHandler.ChildElementHandler<RequireHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.ResourceHandler.7
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(RequireHandler requireHandler) throws SAXParseException {
                    try {
                        RequirementAdapter.adapt(ResourceHandler.this.bundleInfo, requireHandler.requirement);
                    } catch (ParseException e) {
                        throw new SAXParseException("Error in the requirement filter on the bundle: " + e.getMessage(), ResourceHandler.this.getLocator());
                    } catch (UnsupportedFilterException e2) {
                        throw new SAXParseException("Unsupported requirement filter: " + requireHandler.filter + " (" + e2.getMessage() + ")", ResourceHandler.this.getLocator());
                    }
                }
            });
            addChild(new ExtendHandler(), new DelegatingHandler.ChildElementHandler<ExtendHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.ResourceHandler.8
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(ExtendHandler extendHandler) throws SAXParseException {
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            String value = attributes.getValue(SYMBOLIC_NAME);
            if (value == null) {
                log(0, "Resource with no symbolic name, skipping it.");
                skip();
                return;
            }
            BundleInfo bundleInfo = new BundleInfo(value, new Version(getOptionalAttribute(attributes, "version", DEFAULT_VERSION)));
            this.bundleInfo = bundleInfo;
            bundleInfo.setPresentationName(attributes.getValue(PRESENTATION_NAME));
            String value2 = attributes.getValue("uri");
            if (value2 != null) {
                try {
                    this.bundleInfo.addArtifact(new BundleArtifact(false, new URI(value2), null));
                } catch (URISyntaxException unused) {
                    log(0, "Incorrect uri " + value2 + ". The resource " + value + " is then ignored.");
                    skip();
                    return;
                }
            }
            this.bundleInfo.setId(attributes.getValue("id"));
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public String getCurrentElementIdentifier() {
            return this.bundleInfo.getSymbolicName() + "/" + this.bundleInfo.getVersion();
        }
    }

    public static class ResourceSourceHandler extends DelegatingHandler {
        public static final String SOURCE = "source";

        public ResourceSourceHandler() {
            super("source");
            setBufferingChar(true);
        }
    }

    /* loaded from: classes7.dex */
    public static class ResourceDescriptionHandler extends DelegatingHandler {
        public static final String DESCRIPTION = "description";

        public ResourceDescriptionHandler() {
            super("description");
            setBufferingChar(true);
        }
    }

    /* loaded from: classes7.dex */
    public static class ResourceDocumentationHandler extends DelegatingHandler {
        public static final String DOCUMENTATION = "documentation";

        public ResourceDocumentationHandler() {
            super(DOCUMENTATION);
            setBufferingChar(true);
        }
    }

    public static class ResourceLicenseHandler extends DelegatingHandler {
        public static final String LICENSE = "license";

        public ResourceLicenseHandler() {
            super("license");
            setBufferingChar(true);
        }
    }

    public static class ResourceSizeHandler extends DelegatingHandler {
        public static final String SIZE = "size";

        public ResourceSizeHandler() {
            super("size");
            setBufferingChar(true);
        }
    }

    /* loaded from: classes7.dex */
    public static class CapabilityHandler extends DelegatingHandler {
        public static final String CAPABILITY = "capability";
        public static final String NAME = "name";
        public Capability capability;

        public CapabilityHandler() {
            super(CAPABILITY);
            addChild(new CapabilityPropertyHandler(), new DelegatingHandler.ChildElementHandler<CapabilityPropertyHandler>() { // from class: org.apache.ivy.osgi.obr.xml.OBRXMLParser.CapabilityHandler.1
                @Override // org.apache.ivy.osgi.util.DelegatingHandler.ChildElementHandler
                public void childHandled(CapabilityPropertyHandler capabilityPropertyHandler) {
                    CapabilityHandler.this.capability.addProperty(capabilityPropertyHandler.name, capabilityPropertyHandler.value, capabilityPropertyHandler.type);
                }
            });
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.capability = new Capability(getRequiredAttribute(attributes, "name"));
        }
    }

    /* loaded from: classes7.dex */
    public static class CapabilityPropertyHandler extends DelegatingHandler {
        public static final String CAPABILITY_PROPERTY = "p";
        public static final String NAME = "n";
        public static final String TYPE = "t";
        public static final String VALUE = "v";
        public String name;
        public String type;
        public String value;

        public CapabilityPropertyHandler() {
            super("p");
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            this.name = getRequiredAttribute(attributes, "n");
            this.value = getRequiredAttribute(attributes, "v");
            this.type = attributes.getValue("t");
        }
    }

    /* loaded from: classes7.dex */
    public static class AbstractRequirementHandler extends DelegatingHandler {
        public static final String FILTER = "filter";
        public static final String MULTIPLE = "multiple";
        public static final String NAME = "name";
        public static final String OPTIONAL = "optional";
        public OSGiFilter filter;
        public Requirement requirement;

        public AbstractRequirementHandler(String str) {
            super(str);
        }

        @Override // org.apache.ivy.osgi.util.DelegatingHandler
        public void handleAttributes(Attributes attributes) throws SAXException {
            String requiredAttribute = getRequiredAttribute(attributes, "name");
            String value = attributes.getValue("filter");
            this.filter = null;
            if (value != null) {
                try {
                    this.filter = OSGiFilterParser.parse(value);
                } catch (ParseException unused) {
                    throw new SAXParseException("Requirement with ill-formed filter: " + value, getLocator());
                }
            }
            Boolean optionalBooleanAttribute = getOptionalBooleanAttribute(attributes, "optional", null);
            Boolean optionalBooleanAttribute2 = getOptionalBooleanAttribute(attributes, MULTIPLE, null);
            Requirement requirement = new Requirement(requiredAttribute, this.filter);
            this.requirement = requirement;
            if (optionalBooleanAttribute != null) {
                requirement.setOptional(optionalBooleanAttribute.booleanValue());
            }
            if (optionalBooleanAttribute2 != null) {
                this.requirement.setMultiple(optionalBooleanAttribute2.booleanValue());
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class RequireHandler extends AbstractRequirementHandler {
        public static final String REQUIRE = "require";

        public RequireHandler() {
            super(REQUIRE);
        }
    }

    /* loaded from: classes8.dex */
    public static class ExtendHandler extends AbstractRequirementHandler {
        public static final String EXTEND = "extend";

        public ExtendHandler() {
            super(EXTEND);
        }
    }
}
