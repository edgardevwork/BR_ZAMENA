package org.apache.ivy.plugins.parser.p064m2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.License;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.util.XMLHelper;
import org.apache.ivy.util.url.URLHandlerRegistry;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/* loaded from: classes6.dex */
public class PomReader {
    public static final String ARTIFACT_ID = "artifactId";
    public static final String CLASSIFIER = "classifier";
    public static final String DEPENDENCIES = "dependencies";
    public static final String DEPENDENCY = "dependency";
    public static final String DEPENDENCY_MGT = "dependencyManagement";
    public static final String DESCRIPTION = "description";
    public static final String DISTRIBUTION_MGT = "distributionManagement";
    public static final String EXCLUSION = "exclusion";
    public static final String EXCLUSIONS = "exclusions";
    public static final String GROUP_ID = "groupId";
    public static final String HOMEPAGE = "url";
    public static final String LICENSE = "license";
    public static final String LICENSES = "licenses";
    public static final String LICENSE_NAME = "name";
    public static final String LICENSE_URL = "url";
    public static final String MODEL = "model";
    public static final String OPTIONAL = "optional";
    public static final String PACKAGING = "packaging";
    public static final String PARENT = "parent";
    public static final String PLUGIN = "plugin";
    public static final String PLUGINS = "plugins";
    public static final String PROFILE = "profile";
    public static final String PROFILES_ELEMENT = "profiles";
    public static final String PROJECT = "project";
    public static final String PROPERTIES = "properties";
    public static final String RELOCATION = "relocation";
    public static final String SCOPE = "scope";
    public static final String TYPE = "type";
    public static final String VERSION = "version";
    public final Element parentElement;
    public final Element projectElement;
    public final Map<String, String> properties = new HashMap();

    public PomReader(URL url, Resource resource) throws SAXException, IOException {
        AddDTDFilterInputStream addDTDFilterInputStream = new AddDTDFilterInputStream(URLHandlerRegistry.getDefault().openStream(url));
        InputSource inputSource = new InputSource(addDTDFilterInputStream);
        inputSource.setSystemId(XMLHelper.toSystemId(url));
        try {
            Element documentElement = XMLHelper.parseToDom(inputSource, new EntityResolver() { // from class: org.apache.ivy.plugins.parser.m2.PomReader.1
                @Override // org.xml.sax.EntityResolver
                public InputSource resolveEntity(String str, String str2) throws SAXException, IOException {
                    if (str2 == null || !str2.endsWith("m2-entities.ent")) {
                        return null;
                    }
                    return new InputSource(PomReader.class.getResourceAsStream("m2-entities.ent"));
                }
            }).getDocumentElement();
            this.projectElement = documentElement;
            if (!PROJECT.equals(documentElement.getNodeName()) && !"model".equals(documentElement.getNodeName())) {
                throw new SAXParseException("project must be the root tag", resource.getName(), resource.getName(), 0, 0);
            }
            this.parentElement = getFirstChildElement(documentElement, "parent");
            try {
                addDTDFilterInputStream.close();
            } catch (IOException unused) {
            }
            for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
                setProperty("env." + entry.getKey(), entry.getValue());
            }
            Properties properties = System.getProperties();
            for (String str : properties.stringPropertyNames()) {
                setProperty(str, properties.getProperty(str));
            }
        } catch (Throwable th) {
            try {
                addDTDFilterInputStream.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    public boolean hasParent() {
        return this.parentElement != null;
    }

    public void setProperty(String str, String str2) {
        if (this.properties.containsKey(str) || str2 == null) {
            return;
        }
        this.properties.put(str, str2);
    }

    public String getGroupId() {
        String firstChildText = getFirstChildText(this.projectElement, GROUP_ID);
        if (firstChildText == null) {
            firstChildText = getFirstChildText(this.parentElement, GROUP_ID);
        }
        return replaceProps(firstChildText);
    }

    public String getParentGroupId() {
        String firstChildText = getFirstChildText(this.parentElement, GROUP_ID);
        if (firstChildText == null) {
            firstChildText = getFirstChildText(this.projectElement, GROUP_ID);
        }
        return replaceProps(firstChildText);
    }

    public String getArtifactId() {
        String firstChildText = getFirstChildText(this.projectElement, ARTIFACT_ID);
        if (firstChildText == null) {
            firstChildText = getFirstChildText(this.parentElement, ARTIFACT_ID);
        }
        return replaceProps(firstChildText);
    }

    public String getParentArtifactId() {
        String firstChildText = getFirstChildText(this.parentElement, ARTIFACT_ID);
        if (firstChildText == null) {
            firstChildText = getFirstChildText(this.projectElement, ARTIFACT_ID);
        }
        return replaceProps(firstChildText);
    }

    public String getVersion() {
        String firstChildText = getFirstChildText(this.projectElement, "version");
        if (firstChildText == null) {
            firstChildText = getFirstChildText(this.parentElement, "version");
        }
        return replaceProps(firstChildText);
    }

    public String getParentVersion() {
        String firstChildText = getFirstChildText(this.parentElement, "version");
        if (firstChildText == null) {
            firstChildText = getFirstChildText(this.projectElement, "version");
        }
        return replaceProps(firstChildText);
    }

    public String getPackaging() {
        String firstChildText = getFirstChildText(this.projectElement, PACKAGING);
        if (firstChildText == null) {
            return "jar";
        }
        return replaceProps(firstChildText);
    }

    public String getHomePage() {
        String firstChildText = getFirstChildText(this.projectElement, "url");
        return firstChildText == null ? "" : firstChildText;
    }

    public String getDescription() {
        String firstChildText = getFirstChildText(this.projectElement, "description");
        if (firstChildText == null) {
            firstChildText = "";
        }
        return firstChildText.trim();
    }

    public License[] getLicenses() {
        Element firstChildElement = getFirstChildElement(this.projectElement, LICENSES);
        if (firstChildElement == null) {
            return new License[0];
        }
        firstChildElement.normalize();
        ArrayList arrayList = new ArrayList();
        for (Element element : getAllChilds(firstChildElement)) {
            if ("license".equals(element.getNodeName())) {
                String firstChildText = getFirstChildText(element, "name");
                String firstChildText2 = getFirstChildText(element, "url");
                if (firstChildText != null || firstChildText2 != null) {
                    if (firstChildText == null) {
                        firstChildText = "Unknown License";
                    }
                    arrayList.add(new License(firstChildText, firstChildText2));
                }
            }
        }
        return (License[]) arrayList.toArray(new License[arrayList.size()]);
    }

    public ModuleRevisionId getRelocation() {
        Element firstChildElement = getFirstChildElement(getFirstChildElement(this.projectElement, DISTRIBUTION_MGT), RELOCATION);
        if (firstChildElement == null) {
            return null;
        }
        String firstChildText = getFirstChildText(firstChildElement, GROUP_ID);
        if (firstChildText == null) {
            firstChildText = getGroupId();
        }
        String firstChildText2 = getFirstChildText(firstChildElement, ARTIFACT_ID);
        if (firstChildText2 == null) {
            firstChildText2 = getArtifactId();
        }
        String firstChildText3 = getFirstChildText(firstChildElement, "version");
        if (firstChildText3 == null) {
            firstChildText3 = getVersion();
        }
        return ModuleRevisionId.newInstance(firstChildText, firstChildText2, firstChildText3);
    }

    public List<PomDependencyData> getDependencies() {
        return getDependencies(this.projectElement);
    }

    public final List<PomDependencyData> getDependencies(Element element) {
        Element firstChildElement = getFirstChildElement(element, "dependencies");
        if (firstChildElement == null) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        NodeList childNodes = firstChildElement.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if ((nodeItem instanceof Element) && "dependency".equals(nodeItem.getNodeName())) {
                linkedList.add(new PomDependencyData((Element) nodeItem));
            }
        }
        return linkedList;
    }

    public List<PomDependencyMgt> getDependencyMgt() {
        return getDependencyMgt(this.projectElement);
    }

    public final List<PomDependencyMgt> getDependencyMgt(Element element) {
        Element firstChildElement = getFirstChildElement(getFirstChildElement(element, DEPENDENCY_MGT), "dependencies");
        if (firstChildElement == null) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        NodeList childNodes = firstChildElement.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if ((nodeItem instanceof Element) && "dependency".equals(nodeItem.getNodeName())) {
                linkedList.add(new PomDependencyMgtElement((Element) nodeItem));
            }
        }
        return linkedList;
    }

    public List<PomProfileElement> getProfiles() {
        Element firstChildElement = getFirstChildElement(this.projectElement, PROFILES_ELEMENT);
        if (firstChildElement == null) {
            return Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        NodeList childNodes = firstChildElement.getChildNodes();
        int length = childNodes.getLength();
        for (int i = 0; i < length; i++) {
            Node nodeItem = childNodes.item(i);
            if ((nodeItem instanceof Element) && "profile".equals(nodeItem.getNodeName())) {
                linkedList.add(new PomProfileElement((Element) nodeItem));
            }
        }
        return linkedList;
    }

    /* loaded from: classes5.dex */
    public class PomDependencyMgtElement implements PomDependencyMgt {
        public final Element depElement;

        public PomDependencyMgtElement(PomReader pomReader, PomDependencyMgtElement pomDependencyMgtElement) {
            this(pomDependencyMgtElement.depElement);
        }

        public PomDependencyMgtElement(Element element) {
            this.depElement = element;
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getGroupId() {
            return PomReader.this.replaceProps(PomReader.getFirstChildText(this.depElement, PomReader.GROUP_ID));
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getArtifactId() {
            return PomReader.this.replaceProps(PomReader.getFirstChildText(this.depElement, PomReader.ARTIFACT_ID));
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getVersion() {
            return PomReader.this.replaceProps(PomReader.getFirstChildText(this.depElement, "version"));
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getScope() {
            return PomReader.this.replaceProps(PomReader.getFirstChildText(this.depElement, PomReader.SCOPE));
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public List<ModuleId> getExcludedModules() {
            Element firstChildElement = PomReader.getFirstChildElement(this.depElement, PomReader.EXCLUSIONS);
            if (firstChildElement == null) {
                return Collections.emptyList();
            }
            LinkedList linkedList = new LinkedList();
            NodeList childNodes = firstChildElement.getChildNodes();
            int length = childNodes.getLength();
            for (int i = 0; i < length; i++) {
                Node nodeItem = childNodes.item(i);
                if ((nodeItem instanceof Element) && PomReader.EXCLUSION.equals(nodeItem.getNodeName())) {
                    Element element = (Element) nodeItem;
                    String firstChildText = PomReader.getFirstChildText(element, PomReader.GROUP_ID);
                    String firstChildText2 = PomReader.getFirstChildText(element, PomReader.ARTIFACT_ID);
                    if (firstChildText != null && firstChildText2 != null) {
                        linkedList.add(ModuleId.newInstance(firstChildText, firstChildText2));
                    }
                }
            }
            return linkedList;
        }
    }

    public List<PomPluginElement> getPlugins() {
        return getPlugins(this.projectElement);
    }

    public final List<PomPluginElement> getPlugins(Element element) {
        Element firstChildElement = getFirstChildElement(getFirstChildElement(element, "build"), PLUGINS);
        if (firstChildElement == null) {
            return Collections.emptyList();
        }
        NodeList childNodes = firstChildElement.getChildNodes();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ((nodeItem instanceof Element) && "plugin".equals(nodeItem.getNodeName())) {
                linkedList.add(new PomPluginElement((Element) nodeItem));
            }
        }
        return linkedList;
    }

    public static Map<String, String> getProperties(Element element) {
        Element firstChildElement = getFirstChildElement(element, "properties");
        if (firstChildElement == null) {
            return Collections.emptyMap();
        }
        firstChildElement.normalize();
        HashMap map = new HashMap();
        for (Element element2 : getAllChilds(firstChildElement)) {
            map.put(element2.getNodeName(), getTextContent(element2));
        }
        return map;
    }

    /* loaded from: classes5.dex */
    public class PomPluginElement implements PomDependencyMgt {
        public Element pluginElement;

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getScope() {
            return null;
        }

        public PomPluginElement(Element element) {
            this.pluginElement = element;
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getGroupId() {
            return PomReader.this.replaceProps(PomReader.getFirstChildText(this.pluginElement, PomReader.GROUP_ID));
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getArtifactId() {
            return PomReader.this.replaceProps(PomReader.getFirstChildText(this.pluginElement, PomReader.ARTIFACT_ID));
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getVersion() {
            return PomReader.this.replaceProps(PomReader.getFirstChildText(this.pluginElement, "version"));
        }

        @Override // org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public List<ModuleId> getExcludedModules() {
            return Collections.emptyList();
        }
    }

    /* loaded from: classes8.dex */
    public class PomDependencyData extends PomDependencyMgtElement {
        public final Element depElement;

        public PomDependencyData(PomReader pomReader, PomDependencyData pomDependencyData) {
            this(pomDependencyData.depElement);
        }

        public PomDependencyData(Element element) {
            super(element);
            this.depElement = element;
        }

        @Override // org.apache.ivy.plugins.parser.m2.PomReader.PomDependencyMgtElement, org.apache.ivy.plugins.parser.p064m2.PomDependencyMgt
        public String getScope() {
            return emptyIsNull(PomReader.this.replaceProps(PomReader.getFirstChildText(this.depElement, PomReader.SCOPE)));
        }

        public String getClassifier() {
            return emptyIsNull(PomReader.this.replaceProps(PomReader.getFirstChildText(this.depElement, "classifier")));
        }

        public String getType() {
            return emptyIsNull(PomReader.this.replaceProps(PomReader.getFirstChildText(this.depElement, "type")));
        }

        public boolean isOptional() {
            return Boolean.parseBoolean(PomReader.getFirstChildText(this.depElement, "optional"));
        }

        public final String emptyIsNull(String str) {
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        }
    }

    public class PomProfileElement {
        public static final String ACTIVATION_ELEMENT = "activation";
        public static final String ACTIVE_BY_DEFAULT_ELEMENT = "activeByDefault";
        public static final String ARCH = "arch";
        public static final String EXISTS = "exists";
        public static final String FAMILY = "family";
        public static final String FILE = "file";
        public static final String ID_ELEMENT = "id";
        public static final String JDK = "jdk";
        public static final String MISSING = "missing";
        public static final String NAME = "name";

        /* renamed from: OS */
        public static final String f9997OS = "os";
        public static final String PROPERTY = "property";
        public static final String VALUE = "value";
        public static final String VERSION = "version";
        public final Element profileElement;

        public PomProfileElement(Element element) {
            this.profileElement = element;
        }

        public String getId() {
            return PomReader.getFirstChildText(this.profileElement, "id");
        }

        public boolean isActive() {
            return isActiveByDefault() || isActivatedByProperty() || isActiveByOS() || isActiveByJDK() || isActiveByFile();
        }

        public boolean isActiveByDefault() {
            return Boolean.parseBoolean(PomReader.getFirstChildText(PomReader.getFirstChildElement(this.profileElement, ACTIVATION_ELEMENT), ACTIVE_BY_DEFAULT_ELEMENT));
        }

        public boolean isActiveByOS() {
            Element firstChildElement;
            Element firstChildElement2 = PomReader.getFirstChildElement(this.profileElement, ACTIVATION_ELEMENT);
            if (firstChildElement2 == null || (firstChildElement = PomReader.getFirstChildElement(firstChildElement2, "os")) == null) {
                return false;
            }
            String property = System.getProperty("os.name");
            String firstChildText = PomReader.getFirstChildText(firstChildElement, "name");
            if (firstChildText != null && !property.equals(firstChildText.trim())) {
                return false;
            }
            String firstChildText2 = PomReader.getFirstChildText(firstChildElement, FAMILY);
            if (firstChildText2 != null && !property.contains(firstChildText2.trim())) {
                return false;
            }
            String firstChildText3 = PomReader.getFirstChildText(firstChildElement, "arch");
            if (firstChildText3 != null && !System.getProperty("os.arch").equals(firstChildText3.trim())) {
                return false;
            }
            String firstChildText4 = PomReader.getFirstChildText(firstChildElement, "version");
            if (firstChildText4 == null || System.getProperty("os.version").equals(firstChildText4.trim())) {
                return (firstChildText == null && firstChildText2 == null && firstChildText3 == null && firstChildText4 == null) ? false : true;
            }
            return false;
        }

        public boolean isActiveByJDK() {
            String firstChildText;
            Element firstChildElement = PomReader.getFirstChildElement(this.profileElement, ACTIVATION_ELEMENT);
            if (firstChildElement == null || (firstChildText = PomReader.getFirstChildText(firstChildElement, JDK)) == null) {
                return false;
            }
            boolean zStartsWith = firstChildText.trim().startsWith("!");
            if (zStartsWith) {
                firstChildText = firstChildText.substring(1);
            }
            return MavenVersionRangeParser.currentJavaVersionInRange(firstChildText.trim()) ^ zStartsWith;
        }

        public boolean isActiveByFile() {
            Element firstChildElement;
            Element firstChildElement2 = PomReader.getFirstChildElement(this.profileElement, ACTIVATION_ELEMENT);
            if (firstChildElement2 == null || (firstChildElement = PomReader.getFirstChildElement(firstChildElement2, FILE)) == null) {
                return false;
            }
            String firstChildText = PomReader.getFirstChildText(firstChildElement, MISSING);
            if (firstChildText != null && new File(firstChildText.trim()).exists()) {
                return false;
            }
            String firstChildText2 = PomReader.getFirstChildText(firstChildElement, EXISTS);
            if (firstChildText2 == null || new File(firstChildText2.trim()).exists()) {
                return (firstChildText == null && firstChildText2 == null) ? false : true;
            }
            return false;
        }

        public boolean isActivatedByProperty() {
            Element firstChildElement = PomReader.getFirstChildElement(PomReader.getFirstChildElement(this.profileElement, ACTIVATION_ELEMENT), "property");
            String firstChildText = PomReader.getFirstChildText(firstChildElement, "name");
            if (firstChildText == null || "".equals(firstChildText)) {
                return false;
            }
            boolean z = firstChildText.charAt(0) == '!';
            if (z) {
                firstChildText = firstChildText.substring(1);
            }
            if ("".equals(firstChildText)) {
                return false;
            }
            String firstChildText2 = PomReader.getFirstChildText(firstChildElement, "value");
            return ((firstChildText2 == null || "".equals(firstChildText2)) ? PomReader.this.properties.containsKey(firstChildText) : firstChildText2.equals(PomReader.this.properties.get(firstChildText))) ^ z;
        }

        public List<PomDependencyData> getDependencies() {
            return PomReader.this.getDependencies(this.profileElement);
        }

        public List<PomDependencyMgt> getDependencyMgt() {
            return PomReader.this.getDependencyMgt(this.profileElement);
        }

        public List<PomPluginElement> getPlugins() {
            return PomReader.this.getPlugins(this.profileElement);
        }

        public Map<String, String> getProfileProperties() {
            return PomReader.getProperties(this.profileElement);
        }
    }

    public Map<String, String> getPomProperties() {
        return new HashMap(getProperties(this.projectElement));
    }

    public final String replaceProps(String str) {
        if (str == null) {
            return null;
        }
        return IvyPatternHelper.substituteVariables(str, this.properties).trim();
    }

    public static String getTextContent(Element element) {
        StringBuilder sb = new StringBuilder();
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            short nodeType = nodeItem.getNodeType();
            if (nodeType == 3 || nodeType == 4) {
                sb.append(nodeItem.getNodeValue());
            }
        }
        return sb.toString();
    }

    public static String getFirstChildText(Element element, String str) {
        Element firstChildElement = getFirstChildElement(element, str);
        if (firstChildElement != null) {
            return getTextContent(firstChildElement);
        }
        return null;
    }

    public static Element getFirstChildElement(Element element, String str) {
        if (element == null) {
            return null;
        }
        NodeList childNodes = element.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node nodeItem = childNodes.item(i);
            if ((nodeItem instanceof Element) && str.equals(nodeItem.getNodeName())) {
                return (Element) nodeItem;
            }
        }
        return null;
    }

    public static List<Element> getAllChilds(Element element) {
        LinkedList linkedList = new LinkedList();
        if (element != null) {
            NodeList childNodes = element.getChildNodes();
            for (int i = 0; i < childNodes.getLength(); i++) {
                Node nodeItem = childNodes.item(i);
                if (nodeItem instanceof Element) {
                    linkedList.add((Element) nodeItem);
                }
            }
        }
        return linkedList;
    }

    public static final class AddDTDFilterInputStream extends FilterInputStream {
        public static final String DOCTYPE = "<!DOCTYPE project SYSTEM \"m2-entities.ent\">\n";
        public static final int MARK = 10000;
        public int count;
        public byte[] prefix;

        /* JADX WARN: Removed duplicated region for block: B:19:0x009b A[LOOP:0: B:18:0x0099->B:19:0x009b, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public AddDTDFilterInputStream(InputStream inputStream) throws IOException {
            int length;
            super(new BufferedInputStream(inputStream));
            this.prefix = DOCTYPE.getBytes();
            ((FilterInputStream) this).in.mark(10000);
            int i = ((FilterInputStream) this).in.read();
            int i2 = ((FilterInputStream) this).in.read();
            int i3 = ((FilterInputStream) this).in.read();
            if (i == 239 && i2 == 187 && i3 == 191) {
                ((FilterInputStream) this).in.mark(10000);
            } else {
                ((FilterInputStream) this).in.reset();
            }
            String line = new LineNumberReader(new InputStreamReader(((FilterInputStream) this).in, StandardCharsets.UTF_8), 100).readLine();
            if (line != null) {
                String strTrim = line.trim();
                if (strTrim.startsWith("<?xml ")) {
                    String strSubstring = strTrim.substring(0, strTrim.indexOf("?>") + 2);
                    this.prefix = (strSubstring + StringUtils.f9903LF + DOCTYPE).getBytes();
                    length = strSubstring.getBytes().length;
                }
                ((FilterInputStream) this).in.reset();
                for (int i4 = 0; i4 < length; i4++) {
                    ((FilterInputStream) this).in.read();
                }
            }
            this.prefix = new byte[0];
            length = 0;
            ((FilterInputStream) this).in.reset();
            while (i4 < length) {
            }
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int i = this.count;
            byte[] bArr = this.prefix;
            if (i < bArr.length) {
                this.count = i + 1;
                return bArr[i];
            }
            return super.read();
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3;
            bArr.getClass();
            if (i < 0 || i > bArr.length || i2 < 0 || (i3 = i + i2) > bArr.length || i3 < 0) {
                throw new IndexOutOfBoundsException();
            }
            int iMin = 0;
            if (i2 == 0) {
                return 0;
            }
            int i4 = this.count;
            byte[] bArr2 = this.prefix;
            if (i4 < bArr2.length) {
                iMin = Math.min(bArr2.length - i4, i2);
                System.arraycopy(this.prefix, this.count, bArr, i, iMin);
            }
            if (iMin < i2) {
                iMin += ((FilterInputStream) this).in.read(bArr, i + iMin, i2 - iMin);
            }
            this.count += iMin;
            return iMin;
        }
    }
}
