package org.apache.ivy.osgi.obr.xml;

import java.io.OutputStream;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Set;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.osgi.core.BundleArtifact;
import org.apache.ivy.osgi.core.BundleCapability;
import org.apache.ivy.osgi.core.BundleInfo;
import org.apache.ivy.osgi.core.BundleRequirement;
import org.apache.ivy.osgi.core.ExportPackage;
import org.apache.ivy.osgi.core.ManifestParser;
import org.apache.ivy.osgi.obr.xml.OBRXMLParser;
import org.apache.ivy.osgi.repo.ManifestAndLocation;
import org.apache.ivy.osgi.util.Version;
import org.apache.ivy.osgi.util.VersionRange;
import org.apache.ivy.util.Message;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: classes5.dex */
public class OBRXMLWriter {
    public static ContentHandler newHandler(OutputStream outputStream, String str, boolean z) throws TransformerConfigurationException, IllegalArgumentException {
        SAXTransformerFactory sAXTransformerFactory = (SAXTransformerFactory) TransformerFactory.newInstance();
        TransformerHandler transformerHandlerNewTransformerHandler = sAXTransformerFactory.newTransformerHandler();
        Transformer transformerNewTransformer = sAXTransformerFactory.newTransformer();
        StreamResult streamResult = new StreamResult(outputStream);
        transformerNewTransformer.setOutputProperty("encoding", str);
        transformerNewTransformer.setOutputProperty("indent", z ? BooleanUtils.YES : "no");
        transformerHandlerNewTransformerHandler.setResult(streamResult);
        return transformerHandlerNewTransformerHandler;
    }

    public static void writeManifests(Iterable<ManifestAndLocation> iterable, ContentHandler contentHandler, boolean z) throws SAXException {
        int i = z ? 4 : 1;
        contentHandler.startDocument();
        contentHandler.startElement("", "repository", "repository", new AttributesImpl());
        int i2 = 0;
        int i3 = 0;
        for (ManifestAndLocation manifestAndLocation : iterable) {
            try {
                BundleInfo manifest = ManifestParser.parseManifest(manifestAndLocation.getManifest());
                manifest.addArtifact(new BundleArtifact(false, manifestAndLocation.getUri(), null));
                if (manifestAndLocation.getSourceURI() != null) {
                    manifest.addArtifact(new BundleArtifact(true, manifestAndLocation.getSourceURI(), null));
                }
                i2++;
                saxBundleInfo(manifest, contentHandler);
            } catch (ParseException e) {
                i3++;
                IvyContext.getContext().getMessageLogger().log("Rejected " + manifestAndLocation.getUri() + ": " + e.getMessage(), i);
            }
        }
        contentHandler.endElement("", "repository", "repository");
        contentHandler.endDocument();
        StringBuilder sb = new StringBuilder();
        sb.append(i2);
        sb.append(" bundle");
        sb.append(i2 > 1 ? "s" : "");
        sb.append(" added, ");
        sb.append(i3);
        sb.append(" bundle");
        sb.append(i3 > 1 ? "s" : "");
        sb.append(" rejected.");
        Message.info(sb.toString());
    }

    public static void writeBundles(Iterable<BundleInfo> iterable, ContentHandler contentHandler) throws SAXException {
        contentHandler.startDocument();
        contentHandler.startElement("", "repository", "repository", new AttributesImpl());
        Iterator<BundleInfo> it = iterable.iterator();
        while (it.hasNext()) {
            saxBundleInfo(it.next(), contentHandler);
        }
        contentHandler.endElement("", "repository", "repository");
        contentHandler.endDocument();
    }

    public static void saxBundleInfo(BundleInfo bundleInfo, ContentHandler contentHandler) throws SAXException {
        AttributesImpl attributesImpl = new AttributesImpl();
        addAttr(attributesImpl, OBRXMLParser.ResourceHandler.SYMBOLIC_NAME, bundleInfo.getSymbolicName());
        addAttr(attributesImpl, "version", bundleInfo.getRawVersion());
        Iterator<BundleArtifact> it = bundleInfo.getArtifacts().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!it.next().isSource()) {
                addAttr(attributesImpl, "uri", bundleInfo.getArtifacts().get(0).getUri().toString());
                break;
            }
        }
        contentHandler.startElement("", OBRXMLParser.ResourceHandler.RESOURCE, OBRXMLParser.ResourceHandler.RESOURCE, attributesImpl);
        Iterator<BundleArtifact> it2 = bundleInfo.getArtifacts().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            BundleArtifact next = it2.next();
            if (next.isSource()) {
                startElement(contentHandler, "source");
                characters(contentHandler, next.getUri().toString());
                endElement(contentHandler, "source");
                break;
            }
        }
        Iterator<BundleCapability> it3 = bundleInfo.getCapabilities().iterator();
        while (it3.hasNext()) {
            saxCapability(it3.next(), contentHandler);
        }
        Iterator<BundleRequirement> it4 = bundleInfo.getRequirements().iterator();
        while (it4.hasNext()) {
            saxRequirement(it4.next(), contentHandler);
        }
        contentHandler.endElement("", OBRXMLParser.ResourceHandler.RESOURCE, OBRXMLParser.ResourceHandler.RESOURCE);
        contentHandler.characters(StringUtils.f9903LF.toCharArray(), 0, 1);
    }

    public static void saxCapability(BundleCapability bundleCapability, ContentHandler contentHandler) throws SAXException {
        AttributesImpl attributesImpl = new AttributesImpl();
        String type = bundleCapability.getType();
        addAttr(attributesImpl, "name", type);
        contentHandler.startElement("", OBRXMLParser.CapabilityHandler.CAPABILITY, OBRXMLParser.CapabilityHandler.CAPABILITY, attributesImpl);
        type.hashCode();
        if (!type.equals(BundleInfo.PACKAGE_TYPE)) {
            if (type.equals("service")) {
                saxCapabilityProperty("service", bundleCapability.getName(), contentHandler);
                Version rawVersion = bundleCapability.getRawVersion();
                if (rawVersion != null) {
                    saxCapabilityProperty("version", rawVersion.toString(), contentHandler);
                }
            }
        } else {
            saxCapabilityProperty(BundleInfo.PACKAGE_TYPE, bundleCapability.getName(), contentHandler);
            Version rawVersion2 = bundleCapability.getRawVersion();
            if (rawVersion2 != null) {
                saxCapabilityProperty("version", rawVersion2.toString(), contentHandler);
            }
            Set<String> uses = ((ExportPackage) bundleCapability).getUses();
            if (uses != null && !uses.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (String str : uses) {
                    if (sb.length() != 0) {
                        sb.append(',');
                    }
                    sb.append(str);
                }
                saxCapabilityProperty("uses", sb.toString(), contentHandler);
            }
        }
        contentHandler.endElement("", OBRXMLParser.CapabilityHandler.CAPABILITY, OBRXMLParser.CapabilityHandler.CAPABILITY);
        contentHandler.characters(StringUtils.f9903LF.toCharArray(), 0, 1);
    }

    public static void saxCapabilityProperty(String str, String str2, ContentHandler contentHandler) throws SAXException {
        saxCapabilityProperty(str, null, str2, contentHandler);
    }

    public static void saxCapabilityProperty(String str, String str2, String str3, ContentHandler contentHandler) throws SAXException {
        AttributesImpl attributesImpl = new AttributesImpl();
        addAttr(attributesImpl, "n", str);
        if (str2 != null) {
            addAttr(attributesImpl, "t", str2);
        }
        addAttr(attributesImpl, "v", str3);
        contentHandler.startElement("", "p", "p", attributesImpl);
        contentHandler.endElement("", "p", "p");
        contentHandler.characters(StringUtils.f9903LF.toCharArray(), 0, 1);
    }

    public static void saxRequirement(BundleRequirement bundleRequirement, ContentHandler contentHandler) throws SAXException {
        AttributesImpl attributesImpl = new AttributesImpl();
        addAttr(attributesImpl, "name", bundleRequirement.getType());
        if ("optional".equals(bundleRequirement.getResolution())) {
            addAttr(attributesImpl, "optional", Boolean.TRUE.toString());
        }
        addAttr(attributesImpl, "filter", buildFilter(bundleRequirement));
        contentHandler.startElement("", OBRXMLParser.RequireHandler.REQUIRE, OBRXMLParser.RequireHandler.REQUIRE, attributesImpl);
        contentHandler.endElement("", OBRXMLParser.RequireHandler.REQUIRE, OBRXMLParser.RequireHandler.REQUIRE);
        contentHandler.characters(StringUtils.f9903LF.toCharArray(), 0, 1);
    }

    public static String buildFilter(BundleRequirement bundleRequirement) {
        StringBuilder sb = new StringBuilder();
        VersionRange version = bundleRequirement.getVersion();
        if (version != null) {
            appendVersion(sb, version);
        }
        sb.append('(');
        sb.append(bundleRequirement.getType());
        sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
        sb.append(bundleRequirement.getName());
        sb.append(')');
        if (version != null) {
            sb.append(')');
        }
        return sb.toString();
    }

    public static void appendVersion(StringBuilder sb, VersionRange versionRange) {
        sb.append("(&");
        Version startVersion = versionRange.getStartVersion();
        if (startVersion != null) {
            if (!versionRange.isStartExclusive()) {
                sb.append("(version>=");
                sb.append(startVersion.toString());
                sb.append(')');
            } else {
                sb.append("(!");
                sb.append("(version<=");
                sb.append(startVersion.toString());
                sb.append("))");
            }
        }
        Version endVersion = versionRange.getEndVersion();
        if (endVersion != null) {
            if (!versionRange.isEndExclusive()) {
                sb.append("(version<=");
                sb.append(endVersion.toString());
                sb.append(')');
            } else {
                sb.append("(!");
                sb.append("(version>=");
                sb.append(endVersion.toString());
                sb.append("))");
            }
        }
    }

    public static void addAttr(AttributesImpl attributesImpl, String str, String str2) {
        if (str2 != null) {
            attributesImpl.addAttribute("", str, str, "CDATA", str2);
        }
    }

    public static void addAttr(AttributesImpl attributesImpl, String str, Object obj) {
        if (obj != null) {
            attributesImpl.addAttribute("", str, str, "CDATA", obj.toString());
        }
    }

    public static void startElement(ContentHandler contentHandler, String str) throws SAXException {
        contentHandler.startElement("", str, str, new AttributesImpl());
    }

    public static void endElement(ContentHandler contentHandler, String str) throws SAXException {
        contentHandler.endElement("", str, str);
    }

    public static void characters(ContentHandler contentHandler, String str) throws SAXException {
        char[] charArray = str.toCharArray();
        contentHandler.characters(charArray, 0, charArray.length);
    }
}
