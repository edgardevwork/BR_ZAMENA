package io.github.xstream.mxparser;

import com.blackhub.bronline.launcher.LauncherConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import kotlin.jvm.internal.CharCompanionObject;
import kotlin.text.Typography;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.text.ExtendedMessageFormat;
import org.xmlpull.p066v1.XmlPullParser;
import org.xmlpull.p066v1.XmlPullParserException;

/* loaded from: classes7.dex */
public class MXParser implements XmlPullParser {
    public static final String FEATURE_NAMES_INTERNED = "http://xmlpull.org/v1/doc/features.html#names-interned";
    public static final String FEATURE_XML_ROUNDTRIP = "http://xmlpull.org/v1/doc/features.html#xml-roundtrip";
    public static final int LOOKUP_MAX = 1024;
    public static final char LOOKUP_MAX_CHAR = 1024;
    public static final String PROPERTY_LOCATION = "http://xmlpull.org/v1/doc/properties.html#location";
    public static final String PROPERTY_XMLDECL_CONTENT = "http://xmlpull.org/v1/doc/properties.html#xmldecl-content";
    public static final String PROPERTY_XMLDECL_STANDALONE = "http://xmlpull.org/v1/doc/properties.html#xmldecl-standalone";
    public static final String PROPERTY_XMLDECL_VERSION = "http://xmlpull.org/v1/doc/properties.html#xmldecl-version";
    public static final int READ_CHUNK_SIZE = 8192;
    public static final boolean TRACE_SIZING = false;
    public static final String XMLNS_URI = "http://www.w3.org/2000/xmlns/";
    public static final String XML_URI = "http://www.w3.org/XML/1998/namespace";
    public static boolean noUnicode4;
    public boolean allStringsInterned;
    public int attributeCount;
    public String[] attributeName;
    public int[] attributeNameHash;
    public String[] attributePrefix;
    public String[] attributeUri;
    public String[] attributeValue;
    public char[] buf;
    public int bufAbsoluteStart;
    public int bufEnd;
    public int bufSoftLimit;
    public int bufStart;
    public char[] charRefOneCharBuf;
    public int columnNumber;
    public int depth;
    public String[] elName;
    public int[] elNamespaceCount;
    public String[] elPrefix;
    public char[][] elRawName;
    public int[] elRawNameEnd;
    public int[] elRawNameLine;
    public String[] elUri;
    public boolean emptyElementTag;
    public int entityEnd;
    public String[] entityName;
    public char[][] entityNameBuf;
    public int[] entityNameHash;
    public String entityRefName;
    public String[] entityReplacement;
    public char[][] entityReplacementBuf;
    public int eventType;
    public String inputEncoding;
    public int lineNumber;
    public String location;
    public int namespaceEnd;
    public String[] namespacePrefix;
    public int[] namespacePrefixHash;
    public String[] namespaceUri;
    public boolean pastEndTag;

    /* renamed from: pc */
    public char[] f9672pc;
    public int pcEnd;
    public int pcStart;
    public int pos;
    public int posEnd;
    public int posStart;
    public boolean preventBufferCompaction;
    public boolean processNamespaces;
    public boolean reachedEnd;
    public Reader reader;
    public boolean roundtripSupported;
    public boolean seenAmpersand;
    public boolean seenDocdecl;
    public boolean seenEndTag;
    public boolean seenMarkup;
    public boolean seenRoot;
    public boolean seenStartTag;
    public String text;
    public boolean tokenize;
    public boolean usePC;
    public String xmlDeclContent;
    public Boolean xmlDeclStandalone;
    public String xmlDeclVersion;
    public static final char[] VERSION = "version".toCharArray();
    public static final char[] NCODING = "ncoding".toCharArray();
    public static final char[] TANDALONE = "tandalone".toCharArray();
    public static final char[] YES = BooleanUtils.YES.toCharArray();

    /* renamed from: NO */
    public static final char[] f9671NO = "no".toCharArray();
    public static boolean[] lookupNameStartChar = new boolean[1024];
    public static boolean[] lookupNameChar = new boolean[1024];
    public int bufLoadFactor = 95;
    public float bufferLoadFactor = 95 / 100.0f;

    public final boolean isS(char c) {
        return c == ' ' || c == '\n' || c == '\r' || c == '\t';
    }

    public final void resetStringCache() {
    }

    public final String newString(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2);
    }

    public final String newStringIntern(char[] cArr, int i, int i2) {
        return new String(cArr, i, i2).intern();
    }

    public final void ensureElementsCapacity() {
        String[] strArr = this.elName;
        int length = strArr != null ? strArr.length : 0;
        int i = this.depth;
        if (i + 1 >= length) {
            int i2 = (i >= 7 ? i * 2 : 8) + 2;
            boolean z = length > 0;
            String[] strArr2 = new String[i2];
            if (z) {
                System.arraycopy(strArr, 0, strArr2, 0, length);
            }
            this.elName = strArr2;
            String[] strArr3 = new String[i2];
            if (z) {
                System.arraycopy(this.elPrefix, 0, strArr3, 0, length);
            }
            this.elPrefix = strArr3;
            String[] strArr4 = new String[i2];
            if (z) {
                System.arraycopy(this.elUri, 0, strArr4, 0, length);
            }
            this.elUri = strArr4;
            int[] iArr = new int[i2];
            if (z) {
                System.arraycopy(this.elNamespaceCount, 0, iArr, 0, length);
            } else {
                iArr[0] = 0;
            }
            this.elNamespaceCount = iArr;
            int[] iArr2 = new int[i2];
            if (z) {
                System.arraycopy(this.elRawNameEnd, 0, iArr2, 0, length);
            }
            this.elRawNameEnd = iArr2;
            int[] iArr3 = new int[i2];
            if (z) {
                System.arraycopy(this.elRawNameLine, 0, iArr3, 0, length);
            }
            this.elRawNameLine = iArr3;
            char[][] cArr = new char[i2][];
            if (z) {
                System.arraycopy(this.elRawName, 0, cArr, 0, length);
            }
            this.elRawName = cArr;
        }
    }

    public final void ensureAttributesCapacity(int i) {
        String[] strArr = this.attributeName;
        int length = strArr != null ? strArr.length : 0;
        if (i >= length) {
            int i2 = i > 7 ? i * 2 : 8;
            boolean z = length > 0;
            String[] strArr2 = new String[i2];
            if (z) {
                System.arraycopy(strArr, 0, strArr2, 0, length);
            }
            this.attributeName = strArr2;
            String[] strArr3 = new String[i2];
            if (z) {
                System.arraycopy(this.attributePrefix, 0, strArr3, 0, length);
            }
            this.attributePrefix = strArr3;
            String[] strArr4 = new String[i2];
            if (z) {
                System.arraycopy(this.attributeUri, 0, strArr4, 0, length);
            }
            this.attributeUri = strArr4;
            String[] strArr5 = new String[i2];
            if (z) {
                System.arraycopy(this.attributeValue, 0, strArr5, 0, length);
            }
            this.attributeValue = strArr5;
            if (this.allStringsInterned) {
                return;
            }
            int[] iArr = new int[i2];
            if (z) {
                System.arraycopy(this.attributeNameHash, 0, iArr, 0, length);
            }
            this.attributeNameHash = iArr;
        }
    }

    public final void ensureNamespacesCapacity(int i) {
        String[] strArr = this.namespacePrefix;
        if (i >= (strArr != null ? strArr.length : 0)) {
            int i2 = i > 7 ? i * 2 : 8;
            String[] strArr2 = new String[i2];
            String[] strArr3 = new String[i2];
            if (strArr != null) {
                System.arraycopy(strArr, 0, strArr2, 0, this.namespaceEnd);
                System.arraycopy(this.namespaceUri, 0, strArr3, 0, this.namespaceEnd);
            }
            this.namespacePrefix = strArr2;
            this.namespaceUri = strArr3;
            if (this.allStringsInterned) {
                return;
            }
            int[] iArr = new int[i2];
            int[] iArr2 = this.namespacePrefixHash;
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr, 0, this.namespaceEnd);
            }
            this.namespacePrefixHash = iArr;
        }
    }

    public static final int fastHash(char[] cArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = (cArr[i] << 7) + cArr[(i + i2) - 1];
        if (i2 > 16) {
            i3 = (i3 << 7) + cArr[(i2 / 4) + i];
        }
        return i2 > 8 ? (i3 << 7) + cArr[i + (i2 / 2)] : i3;
    }

    public final void ensureEntityCapacity() {
        char[][] cArr = this.entityReplacementBuf;
        int length = cArr != null ? cArr.length : 0;
        int i = this.entityEnd;
        if (i >= length) {
            int i2 = i > 7 ? i * 2 : 8;
            String[] strArr = new String[i2];
            char[][] cArr2 = new char[i2][];
            String[] strArr2 = new String[i2];
            char[][] cArr3 = new char[i2][];
            String[] strArr3 = this.entityName;
            if (strArr3 != null) {
                System.arraycopy(strArr3, 0, strArr, 0, i);
                System.arraycopy(this.entityNameBuf, 0, cArr2, 0, this.entityEnd);
                System.arraycopy(this.entityReplacement, 0, strArr2, 0, this.entityEnd);
                System.arraycopy(this.entityReplacementBuf, 0, cArr3, 0, this.entityEnd);
            }
            this.entityName = strArr;
            this.entityNameBuf = cArr2;
            this.entityReplacement = strArr2;
            this.entityReplacementBuf = cArr3;
            if (this.allStringsInterned) {
                return;
            }
            int[] iArr = new int[i2];
            int[] iArr2 = this.entityNameHash;
            if (iArr2 != null) {
                System.arraycopy(iArr2, 0, iArr, 0, this.entityEnd);
            }
            this.entityNameHash = iArr;
        }
    }

    public final void reset() {
        this.location = null;
        this.lineNumber = 1;
        this.columnNumber = 1;
        this.seenRoot = false;
        this.reachedEnd = false;
        this.eventType = 0;
        this.emptyElementTag = false;
        this.depth = 0;
        this.attributeCount = 0;
        this.namespaceEnd = 0;
        this.entityEnd = 0;
        this.reader = null;
        this.inputEncoding = null;
        this.preventBufferCompaction = false;
        this.bufAbsoluteStart = 0;
        this.bufStart = 0;
        this.bufEnd = 0;
        this.posEnd = 0;
        this.posStart = 0;
        this.pos = 0;
        this.pcStart = 0;
        this.pcEnd = 0;
        this.usePC = false;
        this.seenStartTag = false;
        this.seenEndTag = false;
        this.pastEndTag = false;
        this.seenAmpersand = false;
        this.seenMarkup = false;
        this.seenDocdecl = false;
        this.xmlDeclVersion = null;
        this.xmlDeclStandalone = null;
        this.xmlDeclContent = null;
        resetStringCache();
    }

    public MXParser() {
        this.buf = new char[Runtime.getRuntime().freeMemory() > 1000000 ? 8192 : 256];
        this.bufSoftLimit = ((int) (this.bufferLoadFactor * r0.length)) / 100;
        this.f9672pc = new char[Runtime.getRuntime().freeMemory() <= 1000000 ? 64 : 8192];
        this.charRefOneCharBuf = new char[1];
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public void setFeature(String str, boolean z) throws XmlPullParserException {
        if (str == null) {
            throw new IllegalArgumentException("feature name should not be null");
        }
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            if (this.eventType != 0) {
                throw new XmlPullParserException("namespace processing feature can only be changed before parsing", this, null);
            }
            this.processNamespaces = z;
        } else if (FEATURE_NAMES_INTERNED.equals(str)) {
            if (z) {
                throw new XmlPullParserException("interning names in this implementation is not supported");
            }
        } else if (XmlPullParser.FEATURE_PROCESS_DOCDECL.equals(str)) {
            if (z) {
                throw new XmlPullParserException("processing DOCDECL is not supported");
            }
        } else {
            if (FEATURE_XML_ROUNDTRIP.equals(str)) {
                this.roundtripSupported = z;
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("unsupported feature ");
            stringBuffer.append(str);
            throw new XmlPullParserException(stringBuffer.toString());
        }
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public boolean getFeature(String str) {
        if (str == null) {
            throw new IllegalArgumentException("feature name should not be null");
        }
        if (XmlPullParser.FEATURE_PROCESS_NAMESPACES.equals(str)) {
            return this.processNamespaces;
        }
        if (FEATURE_NAMES_INTERNED.equals(str) || XmlPullParser.FEATURE_PROCESS_DOCDECL.equals(str) || !FEATURE_XML_ROUNDTRIP.equals(str)) {
            return false;
        }
        return this.roundtripSupported;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public void setProperty(String str, Object obj) throws XmlPullParserException {
        if (PROPERTY_LOCATION.equals(str)) {
            this.location = (String) obj;
            return;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unsupported property: '");
        stringBuffer.append(str);
        stringBuffer.append("'");
        throw new XmlPullParserException(stringBuffer.toString());
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public Object getProperty(String str) {
        if (str == null) {
            throw new IllegalArgumentException("property name should not be null");
        }
        if (PROPERTY_XMLDECL_VERSION.equals(str)) {
            return this.xmlDeclVersion;
        }
        if (PROPERTY_XMLDECL_STANDALONE.equals(str)) {
            return this.xmlDeclStandalone;
        }
        if (PROPERTY_XMLDECL_CONTENT.equals(str)) {
            return this.xmlDeclContent;
        }
        if (PROPERTY_LOCATION.equals(str)) {
            return this.location;
        }
        return null;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public void setInput(Reader reader) throws XmlPullParserException {
        reset();
        this.reader = reader;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public void setInput(InputStream inputStream, String str) throws XmlPullParserException {
        InputStreamReader inputStreamReader;
        if (inputStream == null) {
            throw new IllegalArgumentException("input stream can not be null");
        }
        try {
            if (str != null) {
                inputStreamReader = new InputStreamReader(inputStream, str);
            } else {
                inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            }
            setInput(inputStreamReader);
            this.inputEncoding = str;
        } catch (UnsupportedEncodingException e) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("could not create reader for encoding ");
            stringBuffer.append(str);
            stringBuffer.append(" : ");
            stringBuffer.append(e);
            throw new XmlPullParserException(stringBuffer.toString(), this, e);
        }
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getInputEncoding() {
        return this.inputEncoding;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public void defineEntityReplacementText(String str, String str2) throws XmlPullParserException {
        if (!str2.startsWith("&#") && this.entityName != null && str2.length() > 1) {
            String strSubstring = str2.substring(1, str2.length() - 1);
            int i = 0;
            while (true) {
                String[] strArr = this.entityName;
                if (i >= strArr.length) {
                    break;
                }
                String str3 = strArr[i];
                if (str3 != null && str3.equals(strSubstring)) {
                    str2 = this.entityReplacement[i];
                }
                i++;
            }
        }
        ensureEntityCapacity();
        this.entityName[this.entityEnd] = newString(str.toCharArray(), 0, str.length());
        this.entityNameBuf[this.entityEnd] = str.toCharArray();
        String[] strArr2 = this.entityReplacement;
        int i2 = this.entityEnd;
        strArr2[i2] = str2;
        this.entityReplacementBuf[i2] = str2.toCharArray();
        if (!this.allStringsInterned) {
            int[] iArr = this.entityNameHash;
            int i3 = this.entityEnd;
            char[] cArr = this.entityNameBuf[i3];
            iArr[i3] = fastHash(cArr, 0, cArr.length);
        }
        this.entityEnd++;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int getNamespaceCount(int i) throws XmlPullParserException {
        if (!this.processNamespaces || i == 0) {
            return 0;
        }
        if (i < 0 || i > this.depth) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("allowed namespace depth 0..");
            stringBuffer.append(this.depth);
            stringBuffer.append(" not ");
            stringBuffer.append(i);
            throw new IllegalArgumentException(stringBuffer.toString());
        }
        return this.elNamespaceCount[i];
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getNamespacePrefix(int i) throws XmlPullParserException {
        if (i < this.namespaceEnd) {
            return this.namespacePrefix[i];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("position ");
        stringBuffer.append(i);
        stringBuffer.append(" exceeded number of available namespaces ");
        stringBuffer.append(this.namespaceEnd);
        throw new XmlPullParserException(stringBuffer.toString());
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getNamespaceUri(int i) throws XmlPullParserException {
        if (i < this.namespaceEnd) {
            return this.namespaceUri[i];
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("position ");
        stringBuffer.append(i);
        stringBuffer.append(" exceeded number of available namespaces ");
        stringBuffer.append(this.namespaceEnd);
        throw new XmlPullParserException(stringBuffer.toString());
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getNamespace(String str) {
        if (str != null) {
            for (int i = this.namespaceEnd - 1; i >= 0; i--) {
                if (str.equals(this.namespacePrefix[i])) {
                    return this.namespaceUri[i];
                }
            }
            if ("xml".equals(str)) {
                return XML_URI;
            }
            if ("xmlns".equals(str)) {
                return XMLNS_URI;
            }
            return null;
        }
        for (int i2 = this.namespaceEnd - 1; i2 >= 0; i2--) {
            if (this.namespacePrefix[i2] == null) {
                return this.namespaceUri[i2];
            }
        }
        return null;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int getDepth() {
        return this.depth;
    }

    public static int findFragment(int i, char[] cArr, int i2, int i3) {
        if (i2 < i) {
            return i > i3 ? i3 : i;
        }
        if (i3 - i2 > 65) {
            i2 = i3 - 10;
        }
        int i4 = i2 + 1;
        while (true) {
            i4--;
            if (i4 <= i || i3 - i4 > 65 || (cArr[i4] == '<' && i2 - i4 > 10)) {
                break;
            }
        }
        return i4;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getPositionDescription() {
        String string;
        int i = this.posStart;
        int i2 = this.pos;
        if (i <= i2) {
            int iFindFragment = findFragment(0, this.buf, i, i2);
            int i3 = this.pos;
            str = iFindFragment < i3 ? new String(this.buf, iFindFragment, i3 - iFindFragment) : null;
            if (this.bufAbsoluteStart > 0 || iFindFragment > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("...");
                stringBuffer.append(str);
                str = stringBuffer.toString();
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append(" ");
        stringBuffer2.append(XmlPullParser.TYPES[this.eventType]);
        if (str != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" seen ");
            stringBuffer3.append(printable(str));
            stringBuffer3.append("...");
            string = stringBuffer3.toString();
        } else {
            string = "";
        }
        stringBuffer2.append(string);
        stringBuffer2.append(" ");
        String str = this.location;
        stringBuffer2.append(str != null ? str : "");
        stringBuffer2.append("@");
        stringBuffer2.append(getLineNumber());
        stringBuffer2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        stringBuffer2.append(getColumnNumber());
        return stringBuffer2.toString();
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int getLineNumber() {
        return this.lineNumber;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int getColumnNumber() {
        return this.columnNumber;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public boolean isWhitespace() throws XmlPullParserException {
        int i = this.eventType;
        if (i != 4 && i != 5) {
            if (i == 7) {
                return true;
            }
            throw new XmlPullParserException("no content available to check for white spaces");
        }
        if (this.usePC) {
            for (int i2 = this.pcStart; i2 < this.pcEnd; i2++) {
                if (!isS(this.f9672pc[i2])) {
                    return false;
                }
            }
            return true;
        }
        for (int i3 = this.posStart; i3 < this.posEnd; i3++) {
            if (!isS(this.buf[i3])) {
                return false;
            }
        }
        return true;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getText() {
        int i = this.eventType;
        if (i == 0 || i == 1) {
            return null;
        }
        if (i == 6) {
            return this.text;
        }
        if (this.text == null) {
            if (!this.usePC || i == 2 || i == 3) {
                char[] cArr = this.buf;
                int i2 = this.posStart;
                this.text = new String(cArr, i2, this.posEnd - i2);
            } else {
                char[] cArr2 = this.f9672pc;
                int i3 = this.pcStart;
                this.text = new String(cArr2, i3, this.pcEnd - i3);
            }
        }
        return this.text;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public char[] getTextCharacters(int[] iArr) {
        int i = this.eventType;
        if (i == 4) {
            if (this.usePC) {
                int i2 = this.pcStart;
                iArr[0] = i2;
                iArr[1] = this.pcEnd - i2;
                return this.f9672pc;
            }
            int i3 = this.posStart;
            iArr[0] = i3;
            iArr[1] = this.posEnd - i3;
            return this.buf;
        }
        if (i == 2 || i == 3 || i == 5 || i == 9 || i == 6 || i == 8 || i == 7 || i == 10) {
            int i4 = this.posStart;
            iArr[0] = i4;
            iArr[1] = this.posEnd - i4;
            return this.buf;
        }
        if (i == 0 || i == 1) {
            iArr[1] = -1;
            iArr[0] = -1;
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("unknown text eventType: ");
        stringBuffer.append(this.eventType);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getNamespace() {
        int i = this.eventType;
        if (i == 2) {
            return this.processNamespaces ? this.elUri[this.depth] : "";
        }
        if (i == 3) {
            return this.processNamespaces ? this.elUri[this.depth] : "";
        }
        return null;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getName() {
        int i = this.eventType;
        if (i == 2) {
            return this.elName[this.depth];
        }
        if (i == 3) {
            return this.elName[this.depth];
        }
        if (i != 6) {
            return null;
        }
        if (this.entityRefName == null) {
            char[] cArr = this.buf;
            int i2 = this.posStart;
            this.entityRefName = newString(cArr, i2, this.posEnd - i2);
        }
        return this.entityRefName;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getPrefix() {
        int i = this.eventType;
        if (i == 2) {
            return this.elPrefix[this.depth];
        }
        if (i == 3) {
            return this.elPrefix[this.depth];
        }
        return null;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public boolean isEmptyElementTag() throws XmlPullParserException {
        if (this.eventType != 2) {
            throw new XmlPullParserException("parser must be on START_TAG to check for empty element", this, null);
        }
        return this.emptyElementTag;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int getAttributeCount() {
        if (this.eventType != 2) {
            return -1;
        }
        return this.attributeCount;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getAttributeNamespace(int i) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        }
        if (!this.processNamespaces) {
            return "";
        }
        if (i < 0 || i >= this.attributeCount) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        return this.attributeUri[i];
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getAttributeName(int i) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        }
        if (i < 0 || i >= this.attributeCount) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        return this.attributeName[i];
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getAttributePrefix(int i) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        }
        if (!this.processNamespaces) {
            return null;
        }
        if (i < 0 || i >= this.attributeCount) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        return this.attributePrefix[i];
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getAttributeType(int i) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        }
        if (i < 0 || i >= this.attributeCount) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        return "CDATA";
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public boolean isAttributeDefault(int i) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        }
        if (i >= 0 && i < this.attributeCount) {
            return false;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("attribute position must be 0..");
        stringBuffer.append(this.attributeCount - 1);
        stringBuffer.append(" and not ");
        stringBuffer.append(i);
        throw new IndexOutOfBoundsException(stringBuffer.toString());
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getAttributeValue(int i) {
        if (this.eventType != 2) {
            throw new IndexOutOfBoundsException("only START_TAG can have attributes");
        }
        if (i < 0 || i >= this.attributeCount) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute position must be 0..");
            stringBuffer.append(this.attributeCount - 1);
            stringBuffer.append(" and not ");
            stringBuffer.append(i);
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        return this.attributeValue[i];
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String getAttributeValue(String str, String str2) {
        if (this.eventType != 2) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("only START_TAG can have attributes");
            stringBuffer.append(getPositionDescription());
            throw new IndexOutOfBoundsException(stringBuffer.toString());
        }
        if (str2 == null) {
            throw new IllegalArgumentException("attribute name can not be null");
        }
        int i = 0;
        if (this.processNamespaces) {
            if (str == null) {
                str = "";
            }
            while (i < this.attributeCount) {
                String str3 = this.attributeUri[i];
                if ((str == str3 || str.equals(str3)) && str2.equals(this.attributeName[i])) {
                    return this.attributeValue[i];
                }
                i++;
            }
        } else {
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                throw new IllegalArgumentException("when namespaces processing is disabled attribute namespace must be null");
            }
            while (i < this.attributeCount) {
                if (str2.equals(this.attributeName[i])) {
                    return this.attributeValue[i];
                }
                i++;
            }
        }
        return null;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int getEventType() throws XmlPullParserException {
        return this.eventType;
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public void require(int i, String str, String str2) throws XmlPullParserException, IOException {
        String string;
        String string2;
        String string3;
        String string4;
        if (!this.processNamespaces && str != null) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("processing namespaces must be enabled on parser (or factory) to have possible namespaces declared on elements");
            stringBuffer.append(" (position:");
            stringBuffer.append(getPositionDescription());
            stringBuffer.append(")");
            throw new XmlPullParserException(stringBuffer.toString());
        }
        if (i == getEventType() && ((str == null || str.equals(getNamespace())) && (str2 == null || str2.equals(getName())))) {
            return;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("expected event ");
        String[] strArr = XmlPullParser.TYPES;
        stringBuffer2.append(strArr[i]);
        String string5 = "";
        if (str2 != null) {
            StringBuffer stringBuffer3 = new StringBuffer();
            stringBuffer3.append(" with name '");
            stringBuffer3.append(str2);
            stringBuffer3.append("'");
            string = stringBuffer3.toString();
        } else {
            string = "";
        }
        stringBuffer2.append(string);
        stringBuffer2.append((str == null || str2 == null) ? "" : " and");
        if (str != null) {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(" with namespace '");
            stringBuffer4.append(str);
            stringBuffer4.append("'");
            string2 = stringBuffer4.toString();
        } else {
            string2 = "";
        }
        stringBuffer2.append(string2);
        stringBuffer2.append(" but got");
        if (i != getEventType()) {
            StringBuffer stringBuffer5 = new StringBuffer();
            stringBuffer5.append(" ");
            stringBuffer5.append(strArr[getEventType()]);
            string3 = stringBuffer5.toString();
        } else {
            string3 = "";
        }
        stringBuffer2.append(string3);
        if (str2 == null || getName() == null || str2.equals(getName())) {
            string4 = "";
        } else {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(" name '");
            stringBuffer6.append(getName());
            stringBuffer6.append("'");
            string4 = stringBuffer6.toString();
        }
        stringBuffer2.append(string4);
        stringBuffer2.append((str == null || str2 == null || getName() == null || str2.equals(getName()) || getNamespace() == null || str.equals(getNamespace())) ? "" : " and");
        if (str != null && getNamespace() != null && !str.equals(getNamespace())) {
            StringBuffer stringBuffer7 = new StringBuffer();
            stringBuffer7.append(" namespace '");
            stringBuffer7.append(getNamespace());
            stringBuffer7.append("'");
            string5 = stringBuffer7.toString();
        }
        stringBuffer2.append(string5);
        stringBuffer2.append(" (position:");
        stringBuffer2.append(getPositionDescription());
        stringBuffer2.append(")");
        throw new XmlPullParserException(stringBuffer2.toString());
    }

    public void skipSubTree() throws XmlPullParserException, IOException {
        require(2, null, null);
        int i = 1;
        while (i > 0) {
            int next = next();
            if (next == 3) {
                i--;
            } else if (next == 2) {
                i++;
            }
        }
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public String nextText() throws XmlPullParserException, IOException {
        if (getEventType() != 2) {
            throw new XmlPullParserException("parser must be on START_TAG to read next text", this, null);
        }
        int next = next();
        if (next != 4) {
            if (next == 3) {
                return "";
            }
            throw new XmlPullParserException("parser must be on START_TAG or TEXT to read text", this, null);
        }
        String text = getText();
        if (next() == 3) {
            return text;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("TEXT must be immediately followed by END_TAG and not ");
        stringBuffer.append(XmlPullParser.TYPES[getEventType()]);
        throw new XmlPullParserException(stringBuffer.toString(), this, null);
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int nextTag() throws XmlPullParserException, IOException {
        next();
        if (this.eventType == 4 && isWhitespace()) {
            next();
        }
        int i = this.eventType;
        if (i == 2 || i == 3) {
            return i;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("expected START_TAG or END_TAG not ");
        stringBuffer.append(XmlPullParser.TYPES[getEventType()]);
        throw new XmlPullParserException(stringBuffer.toString(), this, null);
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int next() throws XmlPullParserException, IOException {
        this.tokenize = false;
        return nextImpl();
    }

    @Override // org.xmlpull.p066v1.XmlPullParser
    public int nextToken() throws XmlPullParserException, IOException {
        this.tokenize = true;
        return nextImpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int nextImpl() throws XmlPullParserException, IOException, NumberFormatException {
        char cMore;
        this.text = null;
        this.pcStart = 0;
        this.pcEnd = 0;
        this.usePC = false;
        this.bufStart = this.posEnd;
        if (this.pastEndTag) {
            this.pastEndTag = false;
            int i = this.depth - 1;
            this.depth = i;
            this.namespaceEnd = this.elNamespaceCount[i];
        }
        if (this.emptyElementTag) {
            this.emptyElementTag = false;
            this.pastEndTag = true;
            this.eventType = 3;
            return 3;
        }
        if (this.depth > 0) {
            if (this.seenStartTag) {
                this.seenStartTag = false;
                int startTag = parseStartTag();
                this.eventType = startTag;
                return startTag;
            }
            if (this.seenEndTag) {
                this.seenEndTag = false;
                int endTag = parseEndTag();
                this.eventType = endTag;
                return endTag;
            }
            if (this.seenMarkup) {
                this.seenMarkup = false;
                cMore = '<';
            } else if (this.seenAmpersand) {
                this.seenAmpersand = false;
                cMore = '&';
            } else {
                cMore = more();
            }
            this.posStart = this.pos - 1;
            boolean z = false;
            boolean z2 = false;
            while (true) {
                if (cMore == '<') {
                    if (z && this.tokenize) {
                        this.seenMarkup = true;
                        this.eventType = 4;
                        return 4;
                    }
                    char cMore2 = more();
                    if (cMore2 == '/') {
                        if (!this.tokenize && z) {
                            this.seenEndTag = true;
                            this.eventType = 4;
                            return 4;
                        }
                        int endTag2 = parseEndTag();
                        this.eventType = endTag2;
                        return endTag2;
                    }
                    if (cMore2 == '!') {
                        char cMore3 = more();
                        if (cMore3 == '-') {
                            parseComment();
                            if (this.tokenize) {
                                this.eventType = 9;
                                return 9;
                            }
                            if (this.usePC || !z) {
                                this.posStart = this.pos;
                            } else {
                                z2 = true;
                            }
                        } else {
                            if (cMore3 != '[') {
                                StringBuffer stringBuffer = new StringBuffer();
                                stringBuffer.append("unexpected character in markup ");
                                stringBuffer.append(printable(cMore3));
                                throw new XmlPullParserException(stringBuffer.toString(), this, null);
                            }
                            parseCDSect(z);
                            if (this.tokenize) {
                                this.eventType = 5;
                                return 5;
                            }
                            if (this.posEnd - this.posStart > 0) {
                                if (!this.usePC) {
                                    z = true;
                                    z2 = true;
                                }
                            }
                        }
                        cMore = more();
                    } else if (cMore2 == '?') {
                        parsePI();
                        if (this.tokenize) {
                            this.eventType = 8;
                            return 8;
                        }
                        if (this.usePC || !z) {
                            this.posStart = this.pos;
                        }
                        cMore = more();
                    } else {
                        if (!isNameStartChar(cMore2)) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("unexpected character in markup ");
                            stringBuffer2.append(printable(cMore2));
                            throw new XmlPullParserException(stringBuffer2.toString(), this, null);
                        }
                        if (!this.tokenize && z) {
                            this.seenStartTag = true;
                            this.eventType = 4;
                            return 4;
                        }
                        int startTag2 = parseStartTag();
                        this.eventType = startTag2;
                        return startTag2;
                    }
                } else if (cMore == '&') {
                    if (this.tokenize && z) {
                        this.seenAmpersand = true;
                        this.eventType = 4;
                        return 4;
                    }
                    int i2 = this.posStart;
                    int i3 = this.bufAbsoluteStart;
                    int i4 = i2 + i3;
                    int i5 = this.posEnd + i3;
                    char[] entityRef = parseEntityRef();
                    if (this.tokenize) {
                        this.eventType = 6;
                        return 6;
                    }
                    if (entityRef == null) {
                        if (this.entityRefName == null) {
                            char[] cArr = this.buf;
                            int i6 = this.posStart;
                            this.entityRefName = newString(cArr, i6, this.posEnd - i6);
                        }
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("could not resolve entity named '");
                        stringBuffer3.append(printable(this.entityRefName));
                        stringBuffer3.append("'");
                        throw new XmlPullParserException(stringBuffer3.toString(), this, null);
                    }
                    int i7 = this.bufAbsoluteStart;
                    this.posStart = i4 - i7;
                    this.posEnd = i5 - i7;
                    if (!this.usePC) {
                        if (z) {
                            joinPC();
                            z2 = false;
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                    for (char c : entityRef) {
                        int i8 = this.pcEnd;
                        if (i8 >= this.f9672pc.length) {
                            ensurePC(i8);
                        }
                        char[] cArr2 = this.f9672pc;
                        int i9 = this.pcEnd;
                        this.pcEnd = i9 + 1;
                        cArr2[i9] = c;
                    }
                } else {
                    if (z2) {
                        joinPC();
                        z2 = false;
                    }
                    boolean z3 = (this.tokenize && this.roundtripSupported) ? false : true;
                    boolean z4 = false;
                    boolean z5 = false;
                    boolean z6 = false;
                    do {
                        if (cMore != ']') {
                            if (z4 && cMore == '>') {
                                throw new XmlPullParserException("characters ]]> are not allowed in content", this, null);
                            }
                            if (z5) {
                                z4 = false;
                                z5 = false;
                            }
                        } else if (z5) {
                            z4 = true;
                        } else {
                            z5 = true;
                        }
                        if (z3) {
                            if (cMore == '\r') {
                                int i10 = this.pos - 1;
                                this.posEnd = i10;
                                if (!this.usePC) {
                                    if (i10 > this.posStart) {
                                        joinPC();
                                    } else {
                                        this.usePC = true;
                                        this.pcEnd = 0;
                                        this.pcStart = 0;
                                    }
                                }
                                int i11 = this.pcEnd;
                                if (i11 >= this.f9672pc.length) {
                                    ensurePC(i11);
                                }
                                char[] cArr3 = this.f9672pc;
                                int i12 = this.pcEnd;
                                this.pcEnd = i12 + 1;
                                cArr3[i12] = '\n';
                                z6 = true;
                            } else {
                                if (cMore == '\n') {
                                    if (!z6 && this.usePC) {
                                        int i13 = this.pcEnd;
                                        if (i13 >= this.f9672pc.length) {
                                            ensurePC(i13);
                                        }
                                        char[] cArr4 = this.f9672pc;
                                        int i14 = this.pcEnd;
                                        this.pcEnd = i14 + 1;
                                        cArr4[i14] = '\n';
                                    }
                                } else if (this.usePC) {
                                    int i15 = this.pcEnd;
                                    if (i15 >= this.f9672pc.length) {
                                        ensurePC(i15);
                                    }
                                    char[] cArr5 = this.f9672pc;
                                    int i16 = this.pcEnd;
                                    this.pcEnd = i16 + 1;
                                    cArr5[i16] = cMore;
                                }
                                z6 = false;
                            }
                        }
                        cMore = more();
                        if (cMore == '<') {
                            break;
                        }
                    } while (cMore != '&');
                    this.posEnd = this.pos - 1;
                    z = true;
                }
                z = true;
                cMore = more();
            }
        } else {
            if (this.seenRoot) {
                return parseEpilog();
            }
            return parseProlog();
        }
    }

    public final int parseProlog() throws XmlPullParserException, IOException {
        char cMore;
        if (this.seenMarkup) {
            cMore = this.buf[this.pos - 1];
        } else {
            cMore = more();
        }
        if (this.eventType == 0) {
            if (cMore == 65534) {
                throw new XmlPullParserException("first character in input was UNICODE noncharacter (0xFFFE)- input requires int swapping", this, null);
            }
            if (cMore == 65279) {
                cMore = more();
            }
        }
        this.seenMarkup = false;
        this.posStart = this.pos - 1;
        boolean z = this.tokenize && !this.roundtripSupported;
        boolean z2 = false;
        boolean z3 = false;
        while (true) {
            if (cMore == '<') {
                if (z2 && this.tokenize) {
                    this.posEnd = this.pos - 1;
                    this.seenMarkup = true;
                    this.eventType = 7;
                    return 7;
                }
                char cMore2 = more();
                if (cMore2 == '?') {
                    boolean pi = parsePI();
                    if (this.tokenize) {
                        if (pi) {
                            this.eventType = 0;
                            return 0;
                        }
                        this.eventType = 8;
                        return 8;
                    }
                } else {
                    if (cMore2 != '!') {
                        if (cMore2 == '/') {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("expected start tag name and not ");
                            stringBuffer.append(printable(cMore2));
                            throw new XmlPullParserException(stringBuffer.toString(), this, null);
                        }
                        if (!isNameStartChar(cMore2)) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("expected start tag name and not ");
                            stringBuffer2.append(printable(cMore2));
                            throw new XmlPullParserException(stringBuffer2.toString(), this, null);
                        }
                        this.seenRoot = true;
                        return parseStartTag();
                    }
                    char cMore3 = more();
                    if (cMore3 == 'D') {
                        if (this.seenDocdecl) {
                            throw new XmlPullParserException("only one docdecl allowed in XML document", this, null);
                        }
                        this.seenDocdecl = true;
                        parseDocdecl();
                        if (this.tokenize) {
                            this.eventType = 10;
                            return 10;
                        }
                    } else if (cMore3 == '-') {
                        parseComment();
                        if (this.tokenize) {
                            this.eventType = 9;
                            return 9;
                        }
                    } else {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("unexpected markup <!");
                        stringBuffer3.append(printable(cMore3));
                        throw new XmlPullParserException(stringBuffer3.toString(), this, null);
                    }
                }
            } else {
                if (!isS(cMore)) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("only whitespace content allowed before start tag and not ");
                    stringBuffer4.append(printable(cMore));
                    throw new XmlPullParserException(stringBuffer4.toString(), this, null);
                }
                if (!z) {
                    z2 = true;
                } else if (cMore == '\r') {
                    if (!this.usePC) {
                        int i = this.pos - 1;
                        this.posEnd = i;
                        if (i > this.posStart) {
                            joinPC();
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                    int i2 = this.pcEnd;
                    if (i2 >= this.f9672pc.length) {
                        ensurePC(i2);
                    }
                    char[] cArr = this.f9672pc;
                    int i3 = this.pcEnd;
                    this.pcEnd = i3 + 1;
                    cArr[i3] = '\n';
                    z2 = true;
                    z3 = true;
                } else {
                    if (cMore == '\n') {
                        if (!z3 && this.usePC) {
                            int i4 = this.pcEnd;
                            if (i4 >= this.f9672pc.length) {
                                ensurePC(i4);
                            }
                            char[] cArr2 = this.f9672pc;
                            int i5 = this.pcEnd;
                            this.pcEnd = i5 + 1;
                            cArr2[i5] = '\n';
                        }
                    } else if (this.usePC) {
                        int i6 = this.pcEnd;
                        if (i6 >= this.f9672pc.length) {
                            ensurePC(i6);
                        }
                        char[] cArr3 = this.f9672pc;
                        int i7 = this.pcEnd;
                        this.pcEnd = i7 + 1;
                        cArr3[i7] = cMore;
                    }
                    z2 = true;
                    z3 = false;
                }
            }
            cMore = more();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int parseEpilog() throws XmlPullParserException, IOException {
        char cMore;
        if (this.eventType == 1) {
            throw new XmlPullParserException("already reached end of XML input", this, null);
        }
        if (this.reachedEnd) {
            this.eventType = 1;
            return 1;
        }
        boolean z = false;
        boolean z2 = this.tokenize && !this.roundtripSupported;
        try {
            if (this.seenMarkup) {
                cMore = this.buf[this.pos - 1];
            } else {
                cMore = more();
            }
            this.seenMarkup = false;
            this.posStart = this.pos - 1;
            if (!this.reachedEnd) {
                boolean z3 = false;
                boolean z4 = false;
                do {
                    if (cMore == '<') {
                        if (z3) {
                            try {
                                if (this.tokenize) {
                                    this.posEnd = this.pos - 1;
                                    this.seenMarkup = true;
                                    this.eventType = 7;
                                    return 7;
                                }
                            } catch (EOFException unused) {
                                z = z3;
                                this.reachedEnd = true;
                                if (!this.tokenize) {
                                }
                                this.eventType = 1;
                                return 1;
                            }
                        }
                        char cMore2 = more();
                        if (this.reachedEnd) {
                            break;
                        }
                        if (cMore2 == '?') {
                            parsePI();
                            if (this.tokenize) {
                                this.eventType = 8;
                                return 8;
                            }
                        } else {
                            if (cMore2 != '!') {
                                if (cMore2 == '/') {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    stringBuffer.append("end tag not allowed in epilog but got ");
                                    stringBuffer.append(printable(cMore2));
                                    throw new XmlPullParserException(stringBuffer.toString(), this, null);
                                }
                                if (isNameStartChar(cMore2)) {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append("start tag not allowed in epilog but got ");
                                    stringBuffer2.append(printable(cMore2));
                                    throw new XmlPullParserException(stringBuffer2.toString(), this, null);
                                }
                                StringBuffer stringBuffer3 = new StringBuffer();
                                stringBuffer3.append("in epilog expected ignorable content and not ");
                                stringBuffer3.append(printable(cMore2));
                                throw new XmlPullParserException(stringBuffer3.toString(), this, null);
                            }
                            char cMore3 = more();
                            if (this.reachedEnd) {
                                break;
                            }
                            if (cMore3 == 'D') {
                                parseDocdecl();
                                if (this.tokenize) {
                                    this.eventType = 10;
                                    return 10;
                                }
                            } else if (cMore3 == '-') {
                                parseComment();
                                if (this.tokenize) {
                                    this.eventType = 9;
                                    return 9;
                                }
                            } else {
                                StringBuffer stringBuffer4 = new StringBuffer();
                                stringBuffer4.append("unexpected markup <!");
                                stringBuffer4.append(printable(cMore3));
                                throw new XmlPullParserException(stringBuffer4.toString(), this, null);
                            }
                        }
                        cMore = more();
                    } else {
                        if (!isS(cMore)) {
                            StringBuffer stringBuffer5 = new StringBuffer();
                            stringBuffer5.append("in epilog non whitespace content is not allowed but got ");
                            stringBuffer5.append(printable(cMore));
                            throw new XmlPullParserException(stringBuffer5.toString(), this, null);
                        }
                        if (!z2) {
                            z3 = true;
                        } else if (cMore == '\r') {
                            try {
                                if (!this.usePC) {
                                    int i = this.pos - 1;
                                    this.posEnd = i;
                                    if (i > this.posStart) {
                                        joinPC();
                                    } else {
                                        this.usePC = true;
                                        this.pcEnd = 0;
                                        this.pcStart = 0;
                                    }
                                }
                                int i2 = this.pcEnd;
                                if (i2 >= this.f9672pc.length) {
                                    ensurePC(i2);
                                }
                                char[] cArr = this.f9672pc;
                                int i3 = this.pcEnd;
                                this.pcEnd = i3 + 1;
                                cArr[i3] = '\n';
                                z3 = true;
                                z4 = true;
                            } catch (EOFException unused2) {
                                z = true;
                                this.reachedEnd = true;
                                if (!this.tokenize) {
                                }
                                this.eventType = 1;
                                return 1;
                            }
                        } else {
                            if (cMore == '\n') {
                                if (!z4 && this.usePC) {
                                    int i4 = this.pcEnd;
                                    if (i4 >= this.f9672pc.length) {
                                        ensurePC(i4);
                                    }
                                    char[] cArr2 = this.f9672pc;
                                    int i5 = this.pcEnd;
                                    this.pcEnd = i5 + 1;
                                    cArr2[i5] = '\n';
                                }
                            } else if (this.usePC) {
                                int i6 = this.pcEnd;
                                if (i6 >= this.f9672pc.length) {
                                    ensurePC(i6);
                                }
                                char[] cArr3 = this.f9672pc;
                                int i7 = this.pcEnd;
                                this.pcEnd = i7 + 1;
                                cArr3[i7] = cMore;
                            }
                            z3 = true;
                            z4 = false;
                        }
                        cMore = more();
                    }
                } while (!this.reachedEnd);
                z = z3;
            }
        } catch (EOFException unused3) {
        }
        if (!this.tokenize && z) {
            this.posEnd = this.pos;
            this.eventType = 7;
            return 7;
        }
        this.eventType = 1;
        return 1;
    }

    public int parseEndTag() throws XmlPullParserException, IOException {
        char cMore;
        char cMore2 = more();
        if (!isNameStartChar(cMore2)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected name start and not ");
            stringBuffer.append(printable(cMore2));
            throw new XmlPullParserException(stringBuffer.toString(), this, null);
        }
        int i = this.pos;
        this.posStart = i - 3;
        int i2 = this.bufAbsoluteStart + (i - 1);
        do {
            cMore = more();
        } while (isNameChar(cMore));
        int i3 = i2 - this.bufAbsoluteStart;
        int i4 = (this.pos - 1) - i3;
        char[][] cArr = this.elRawName;
        int i5 = this.depth;
        char[] cArr2 = cArr[i5];
        int i6 = this.elRawNameEnd[i5];
        if (i6 != i4) {
            String str = new String(cArr2, 0, i6);
            String str2 = new String(this.buf, i3, i4);
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("end tag name </");
            stringBuffer2.append(str2);
            stringBuffer2.append("> must match start tag name <");
            stringBuffer2.append(str);
            stringBuffer2.append("> from line ");
            stringBuffer2.append(this.elRawNameLine[this.depth]);
            throw new XmlPullParserException(stringBuffer2.toString(), this, null);
        }
        int i7 = 0;
        while (i7 < i4) {
            int i8 = i3 + 1;
            if (this.buf[i3] != cArr2[i7]) {
                String str3 = new String(cArr2, 0, i4);
                String str4 = new String(this.buf, (i8 - i7) - 1, i4);
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("end tag name </");
                stringBuffer3.append(str4);
                stringBuffer3.append("> must be the same as start tag <");
                stringBuffer3.append(str3);
                stringBuffer3.append("> from line ");
                stringBuffer3.append(this.elRawNameLine[this.depth]);
                throw new XmlPullParserException(stringBuffer3.toString(), this, null);
            }
            i7++;
            i3 = i8;
        }
        while (isS(cMore)) {
            cMore = more();
        }
        if (cMore != '>') {
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("expected > to finish end tag not ");
            stringBuffer4.append(printable(cMore));
            stringBuffer4.append(" from line ");
            stringBuffer4.append(this.elRawNameLine[this.depth]);
            throw new XmlPullParserException(stringBuffer4.toString(), this, null);
        }
        this.posEnd = this.pos;
        this.pastEndTag = true;
        this.eventType = 3;
        return 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00bf A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01da A[LOOP:5: B:82:0x01da->B:100:0x022e, LOOP_START, PHI: r1
  0x01da: PHI (r1v1 int) = (r1v0 int), (r1v2 int) binds: [B:37:0x00df, B:100:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int parseStartTag() throws XmlPullParserException, IOException, NumberFormatException {
        String strNewString;
        int i = 1;
        this.depth++;
        int i2 = this.pos;
        this.posStart = i2 - 2;
        this.emptyElementTag = false;
        this.attributeCount = 0;
        int i3 = (i2 - 1) + this.bufAbsoluteStart;
        if (this.buf[i2 - 1] == ':' && this.processNamespaces) {
            throw new XmlPullParserException("when namespaces processing enabled colon can not be at element name start", this, null);
        }
        int i4 = -1;
        while (true) {
            char cMore = more();
            if (isNameChar(cMore)) {
                if (cMore == ':' && this.processNamespaces) {
                    if (i4 != -1) {
                        throw new XmlPullParserException("only one colon is allowed in name of element when namespaces are enabled", this, null);
                    }
                    i4 = (this.pos - 1) + this.bufAbsoluteStart;
                }
            } else {
                ensureElementsCapacity();
                int i5 = this.pos - 1;
                int i6 = this.bufAbsoluteStart;
                int i7 = i5 - (i3 - i6);
                char[][] cArr = this.elRawName;
                int i8 = this.depth;
                char[] cArr2 = cArr[i8];
                if (cArr2 == null || cArr2.length < i7) {
                    cArr[i8] = new char[i7 * 2];
                }
                System.arraycopy(this.buf, i3 - i6, cArr[i8], 0, i7);
                int[] iArr = this.elRawNameEnd;
                int i9 = this.depth;
                iArr[i9] = i7;
                this.elRawNameLine[i9] = this.lineNumber;
                if (this.processNamespaces) {
                    if (i4 != -1) {
                        String[] strArr = this.elPrefix;
                        strNewString = newString(this.buf, i3 - this.bufAbsoluteStart, i4 - i3);
                        strArr[i9] = strNewString;
                        String[] strArr2 = this.elName;
                        int i10 = this.depth;
                        char[] cArr3 = this.buf;
                        int i11 = this.bufAbsoluteStart;
                        strArr2[i10] = newString(cArr3, (i4 + 1) - i11, (this.pos - 2) - (i4 - i11));
                        while (true) {
                            if (!isS(cMore)) {
                                cMore = more();
                            } else {
                                if (cMore == '>') {
                                    break;
                                }
                                if (cMore == '/') {
                                    if (this.emptyElementTag) {
                                        throw new XmlPullParserException("repeated / in tag declaration", this, null);
                                    }
                                    this.emptyElementTag = true;
                                    char cMore2 = more();
                                    if (cMore2 != '>') {
                                        StringBuffer stringBuffer = new StringBuffer();
                                        stringBuffer.append("expected > to end empty tag not ");
                                        stringBuffer.append(printable(cMore2));
                                        throw new XmlPullParserException(stringBuffer.toString(), this, null);
                                    }
                                } else if (isNameStartChar(cMore)) {
                                    parseAttribute();
                                    cMore = more();
                                } else {
                                    StringBuffer stringBuffer2 = new StringBuffer();
                                    stringBuffer2.append("start tag unexpected character ");
                                    stringBuffer2.append(printable(cMore));
                                    throw new XmlPullParserException(stringBuffer2.toString(), this, null);
                                }
                            }
                        }
                        if (!this.processNamespaces) {
                            String namespace = getNamespace(strNewString);
                            if (namespace == null) {
                                if (strNewString == null) {
                                    namespace = "";
                                } else {
                                    StringBuffer stringBuffer3 = new StringBuffer();
                                    stringBuffer3.append("could not determine namespace bound to element prefix ");
                                    stringBuffer3.append(strNewString);
                                    throw new XmlPullParserException(stringBuffer3.toString(), this, null);
                                }
                            }
                            this.elUri[this.depth] = namespace;
                            for (int i12 = 0; i12 < this.attributeCount; i12++) {
                                String str = this.attributePrefix[i12];
                                if (str == null) {
                                    this.attributeUri[i12] = "";
                                } else {
                                    String namespace2 = getNamespace(str);
                                    if (namespace2 == null) {
                                        StringBuffer stringBuffer4 = new StringBuffer();
                                        stringBuffer4.append("could not determine namespace bound to attribute prefix ");
                                        stringBuffer4.append(str);
                                        throw new XmlPullParserException(stringBuffer4.toString(), this, null);
                                    }
                                    this.attributeUri[i12] = namespace2;
                                }
                            }
                            while (i < this.attributeCount) {
                                for (int i13 = 0; i13 < i; i13++) {
                                    String[] strArr3 = this.attributeUri;
                                    if (strArr3[i13] == strArr3[i]) {
                                        if (this.allStringsInterned) {
                                            Object[] objArr = this.attributeName;
                                            if (!objArr[i13].equals(objArr[i])) {
                                            }
                                            String string = this.attributeName[i13];
                                            if (this.attributeUri[i13] != null) {
                                                StringBuffer stringBuffer5 = new StringBuffer();
                                                stringBuffer5.append(this.attributeUri[i13]);
                                                stringBuffer5.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                                                stringBuffer5.append(string);
                                                string = stringBuffer5.toString();
                                            }
                                            String string2 = this.attributeName[i];
                                            if (this.attributeUri[i] != null) {
                                                StringBuffer stringBuffer6 = new StringBuffer();
                                                stringBuffer6.append(this.attributeUri[i]);
                                                stringBuffer6.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                                                stringBuffer6.append(string2);
                                                string2 = stringBuffer6.toString();
                                            }
                                            StringBuffer stringBuffer7 = new StringBuffer();
                                            stringBuffer7.append("duplicated attributes ");
                                            stringBuffer7.append(string);
                                            stringBuffer7.append(" and ");
                                            stringBuffer7.append(string2);
                                            throw new XmlPullParserException(stringBuffer7.toString(), this, null);
                                        }
                                        if (this.allStringsInterned) {
                                            continue;
                                        } else {
                                            int[] iArr2 = this.attributeNameHash;
                                            if (iArr2[i13] == iArr2[i]) {
                                                Object[] objArr2 = this.attributeName;
                                                if (objArr2[i13].equals(objArr2[i])) {
                                                    String string3 = this.attributeName[i13];
                                                    if (this.attributeUri[i13] != null) {
                                                    }
                                                    String string22 = this.attributeName[i];
                                                    if (this.attributeUri[i] != null) {
                                                    }
                                                    StringBuffer stringBuffer72 = new StringBuffer();
                                                    stringBuffer72.append("duplicated attributes ");
                                                    stringBuffer72.append(string3);
                                                    stringBuffer72.append(" and ");
                                                    stringBuffer72.append(string22);
                                                    throw new XmlPullParserException(stringBuffer72.toString(), this, null);
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    }
                                }
                                i++;
                            }
                        } else {
                            while (i < this.attributeCount) {
                                for (int i14 = 0; i14 < i; i14++) {
                                    if (this.allStringsInterned) {
                                        Object[] objArr3 = this.attributeName;
                                        if (!objArr3[i14].equals(objArr3[i])) {
                                            if (!this.allStringsInterned) {
                                                int[] iArr3 = this.attributeNameHash;
                                                if (iArr3[i14] == iArr3[i]) {
                                                    Object[] objArr4 = this.attributeName;
                                                    if (!objArr4[i14].equals(objArr4[i])) {
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    String[] strArr4 = this.attributeName;
                                    String str2 = strArr4[i14];
                                    String str3 = strArr4[i];
                                    StringBuffer stringBuffer8 = new StringBuffer();
                                    stringBuffer8.append("duplicated attributes ");
                                    stringBuffer8.append(str2);
                                    stringBuffer8.append(" and ");
                                    stringBuffer8.append(str3);
                                    throw new XmlPullParserException(stringBuffer8.toString(), this, null);
                                }
                                i++;
                            }
                        }
                        this.elNamespaceCount[this.depth] = this.namespaceEnd;
                        this.posEnd = this.pos;
                        this.eventType = 2;
                        return 2;
                    }
                    this.elPrefix[i9] = null;
                    this.elName[i9] = newString(this.buf, i3 - this.bufAbsoluteStart, i7);
                } else {
                    this.elName[i9] = newString(this.buf, i3 - this.bufAbsoluteStart, i7);
                }
                strNewString = null;
                while (true) {
                    if (!isS(cMore)) {
                    }
                }
                if (!this.processNamespaces) {
                }
                this.elNamespaceCount[this.depth] = this.namespaceEnd;
                this.posEnd = this.pos;
                this.eventType = 2;
                return 2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final char parseAttribute() throws XmlPullParserException, IOException, NumberFormatException {
        String strNewString;
        String strNewStringIntern;
        String string;
        int i = this.posStart;
        int i2 = this.bufAbsoluteStart;
        int i3 = i + i2;
        int i4 = this.pos;
        int i5 = (i4 - 1) + i2;
        char c = this.buf[i4 - 1];
        if (c == ':' && this.processNamespaces) {
            throw new XmlPullParserException("when namespaces processing enabled colon can not be at attribute name start", this, null);
        }
        boolean z = this.processNamespaces && c == 'x';
        char cMore = more();
        int iHashCode = -1;
        int i6 = 0;
        int i7 = -1;
        while (isNameChar(cMore)) {
            if (this.processNamespaces) {
                if (z && i6 < 5) {
                    i6++;
                    if (i6 == 1) {
                        if (cMore != 'm') {
                            z = false;
                        }
                    } else if (i6 == 2) {
                        if (cMore != 'l') {
                        }
                    } else if (i6 == 3) {
                        if (cMore != 'n') {
                        }
                    } else if (i6 == 4) {
                        if (cMore != 's') {
                        }
                    } else if (i6 == 5 && cMore != ':') {
                        throw new XmlPullParserException("after xmlns in attribute name must be colonwhen namespaces are enabled", this, null);
                    }
                }
                if (cMore != ':') {
                    continue;
                } else {
                    if (i7 != -1) {
                        throw new XmlPullParserException("only one colon is allowed in attribute name when namespaces are enabled", this, null);
                    }
                    i7 = this.bufAbsoluteStart + (this.pos - 1);
                }
            }
            cMore = more();
        }
        ensureAttributesCapacity(this.attributeCount);
        if (this.processNamespaces) {
            if (i6 < 4) {
                z = false;
            }
            if (!z) {
                if (i7 != -1) {
                    this.attributePrefix[this.attributeCount] = newString(this.buf, i5 - this.bufAbsoluteStart, i7 - i5);
                    int i8 = this.pos - 2;
                    int i9 = this.bufAbsoluteStart;
                    String[] strArr = this.attributeName;
                    int i10 = this.attributeCount;
                    strNewString = newString(this.buf, (i7 - i9) + 1, i8 - (i7 - i9));
                    strArr[i10] = strNewString;
                } else {
                    String[] strArr2 = this.attributePrefix;
                    int i11 = this.attributeCount;
                    strArr2[i11] = null;
                    String[] strArr3 = this.attributeName;
                    char[] cArr = this.buf;
                    int i12 = this.bufAbsoluteStart;
                    strNewString = newString(cArr, i5 - i12, (this.pos - 1) - (i5 - i12));
                    strArr3[i11] = strNewString;
                }
                if (!this.allStringsInterned) {
                    this.attributeNameHash[this.attributeCount] = strNewString.hashCode();
                }
            } else if (i7 != -1) {
                int i13 = this.pos - 2;
                int i14 = this.bufAbsoluteStart;
                int i15 = i13 - (i7 - i14);
                if (i15 == 0) {
                    throw new XmlPullParserException("namespace prefix is required after xmlns:  when namespaces are enabled", this, null);
                }
                strNewString = newString(this.buf, (i7 - i14) + 1, i15);
            } else {
                strNewString = null;
            }
        } else {
            String[] strArr4 = this.attributeName;
            int i16 = this.attributeCount;
            char[] cArr2 = this.buf;
            int i17 = this.bufAbsoluteStart;
            strNewString = newString(cArr2, i5 - i17, (this.pos - 1) - (i5 - i17));
            strArr4[i16] = strNewString;
            if (!this.allStringsInterned) {
                this.attributeNameHash[this.attributeCount] = strNewString.hashCode();
            }
        }
        while (isS(cMore)) {
            cMore = more();
        }
        if (cMore != '=') {
            throw new XmlPullParserException("expected = after attribute name", this, null);
        }
        char cMore2 = more();
        while (isS(cMore2)) {
            cMore2 = more();
        }
        if (cMore2 != '\"' && cMore2 != '\'') {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("attribute value must start with quotation or apostrophe not ");
            stringBuffer.append(printable(cMore2));
            throw new XmlPullParserException(stringBuffer.toString(), this, null);
        }
        this.usePC = false;
        this.pcStart = this.pcEnd;
        this.posStart = this.pos;
        boolean z2 = false;
        while (true) {
            char cMore3 = more();
            if (cMore3 == cMore2) {
                if (this.processNamespaces && z) {
                    if (!this.usePC) {
                        char[] cArr3 = this.buf;
                        int i18 = this.posStart;
                        strNewStringIntern = newStringIntern(cArr3, i18, (this.pos - 1) - i18);
                    } else {
                        char[] cArr4 = this.f9672pc;
                        int i19 = this.pcStart;
                        strNewStringIntern = newStringIntern(cArr4, i19, this.pcEnd - i19);
                    }
                    ensureNamespacesCapacity(this.namespaceEnd);
                    if (i7 != iHashCode) {
                        if (strNewStringIntern.length() == 0) {
                            throw new XmlPullParserException("non-default namespace can not be declared to be empty string", this, null);
                        }
                        String[] strArr5 = this.namespacePrefix;
                        int i20 = this.namespaceEnd;
                        strArr5[i20] = strNewString;
                        if (!this.allStringsInterned) {
                            int[] iArr = this.namespacePrefixHash;
                            iHashCode = strNewString.hashCode();
                            iArr[i20] = iHashCode;
                        }
                    } else {
                        String[] strArr6 = this.namespacePrefix;
                        int i21 = this.namespaceEnd;
                        strArr6[i21] = null;
                        if (!this.allStringsInterned) {
                            this.namespacePrefixHash[i21] = iHashCode;
                        }
                    }
                    this.namespaceUri[this.namespaceEnd] = strNewStringIntern;
                    int i22 = this.elNamespaceCount[this.depth - 1];
                    for (int i23 = r7 - 1; i23 >= i22; i23--) {
                        boolean z3 = this.allStringsInterned;
                        if (((z3 || strNewString == null) && this.namespacePrefix[i23] == strNewString) || (!z3 && strNewString != null && this.namespacePrefixHash[i23] == iHashCode && strNewString.equals(this.namespacePrefix[i23]))) {
                            if (strNewString != null) {
                                StringBuffer stringBuffer2 = new StringBuffer();
                                stringBuffer2.append("'");
                                stringBuffer2.append(strNewString);
                                stringBuffer2.append("'");
                                string = stringBuffer2.toString();
                            } else {
                                string = "default";
                            }
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("duplicated namespace declaration for ");
                            stringBuffer3.append(string);
                            stringBuffer3.append(" prefix");
                            throw new XmlPullParserException(stringBuffer3.toString(), this, null);
                        }
                    }
                    this.namespaceEnd++;
                } else {
                    if (!this.usePC) {
                        String[] strArr7 = this.attributeValue;
                        int i24 = this.attributeCount;
                        char[] cArr5 = this.buf;
                        int i25 = this.posStart;
                        strArr7[i24] = new String(cArr5, i25, (this.pos - 1) - i25);
                    } else {
                        String[] strArr8 = this.attributeValue;
                        int i26 = this.attributeCount;
                        char[] cArr6 = this.f9672pc;
                        int i27 = this.pcStart;
                        strArr8[i26] = new String(cArr6, i27, this.pcEnd - i27);
                    }
                    this.attributeCount++;
                }
                this.posStart = i3 - this.bufAbsoluteStart;
                return cMore3;
            }
            if (cMore3 == '<') {
                throw new XmlPullParserException("markup not allowed inside attribute value - illegal < ", this, null);
            }
            if (cMore3 == '&') {
                int i28 = this.pos - 1;
                this.posEnd = i28;
                if (!this.usePC) {
                    if (i28 > this.posStart) {
                        joinPC();
                    } else {
                        this.usePC = true;
                        this.pcEnd = 0;
                        this.pcStart = 0;
                    }
                }
                char[] entityRef = parseEntityRef();
                if (entityRef == null) {
                    if (this.entityRefName == null) {
                        char[] cArr7 = this.buf;
                        int i29 = this.posStart;
                        this.entityRefName = newString(cArr7, i29, this.posEnd - i29);
                    }
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("could not resolve entity named '");
                    stringBuffer4.append(printable(this.entityRefName));
                    stringBuffer4.append("'");
                    throw new XmlPullParserException(stringBuffer4.toString(), this, null);
                }
                for (char c2 : entityRef) {
                    int i30 = this.pcEnd;
                    if (i30 >= this.f9672pc.length) {
                        ensurePC(i30);
                    }
                    char[] cArr8 = this.f9672pc;
                    int i31 = this.pcEnd;
                    this.pcEnd = i31 + 1;
                    cArr8[i31] = c2;
                }
            } else if (cMore3 == '\t' || cMore3 == '\n' || cMore3 == '\r') {
                if (!this.usePC) {
                    int i32 = this.pos - 1;
                    this.posEnd = i32;
                    if (i32 > this.posStart) {
                        joinPC();
                    } else {
                        this.usePC = true;
                        this.pcStart = 0;
                        this.pcEnd = 0;
                    }
                }
                int i33 = this.pcEnd;
                if (i33 >= this.f9672pc.length) {
                    ensurePC(i33);
                }
                if (cMore3 != '\n' || !z2) {
                    char[] cArr9 = this.f9672pc;
                    int i34 = this.pcEnd;
                    this.pcEnd = i34 + 1;
                    cArr9[i34] = ' ';
                }
            } else if (this.usePC) {
                int i35 = this.pcEnd;
                if (i35 >= this.f9672pc.length) {
                    ensurePC(i35);
                }
                char[] cArr10 = this.f9672pc;
                int i36 = this.pcEnd;
                this.pcEnd = i36 + 1;
                cArr10[i36] = cMore3;
            }
            z2 = cMore3 == '\r';
            iHashCode = -1;
        }
    }

    public final char[] parseEntityRef() throws XmlPullParserException, IOException, NumberFormatException {
        char cMore;
        char cMore2;
        this.entityRefName = null;
        this.posStart = this.pos;
        char cMore3 = more();
        if (cMore3 == '#') {
            char cMore4 = more();
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = cMore4 == 'x';
            if (z) {
                while (true) {
                    cMore2 = more();
                    if (cMore2 >= '0' && cMore2 <= '9') {
                        stringBuffer.append(cMore2);
                    } else if (cMore2 >= 'a' && cMore2 <= 'f') {
                        stringBuffer.append(cMore2);
                    } else {
                        if (cMore2 < 'A' || cMore2 > 'F') {
                            break;
                        }
                        stringBuffer.append(cMore2);
                    }
                }
                if (cMore2 != ';') {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append("character reference (with hex value) may not contain ");
                    stringBuffer2.append(printable(cMore2));
                    throw new XmlPullParserException(stringBuffer2.toString(), this, null);
                }
            } else {
                while (cMore4 >= '0' && cMore4 <= '9') {
                    stringBuffer.append(cMore4);
                    cMore4 = more();
                }
                if (cMore4 != ';') {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append("character reference (with decimal value) may not contain ");
                    stringBuffer3.append(printable(cMore4));
                    throw new XmlPullParserException(stringBuffer3.toString(), this, null);
                }
            }
            this.posEnd = this.pos - 1;
            if (!noUnicode4) {
                try {
                    this.charRefOneCharBuf = Character.toChars(Integer.parseInt(stringBuffer.toString(), z ? 16 : 10));
                } catch (IllegalArgumentException unused) {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append("character reference (with ");
                    stringBuffer4.append(z ? "hex" : "decimal");
                    stringBuffer4.append(" value ");
                    stringBuffer4.append(stringBuffer.toString());
                    stringBuffer4.append(") is invalid");
                    throw new XmlPullParserException(stringBuffer4.toString(), this, null);
                } catch (NoSuchMethodError unused2) {
                    noUnicode4 = true;
                }
            }
            if (noUnicode4) {
                int i = Integer.parseInt(stringBuffer.toString(), z ? 16 : 10);
                if (i > 65535) {
                    StringBuffer stringBuffer5 = new StringBuffer();
                    stringBuffer5.append("Unicode character reference (with ");
                    stringBuffer5.append(z ? "hex" : "decimal");
                    stringBuffer5.append(" value ");
                    stringBuffer5.append(stringBuffer.toString());
                    stringBuffer5.append(") is not supported in this runtime");
                    throw new XmlPullParserException(stringBuffer5.toString(), this, null);
                }
                this.charRefOneCharBuf = new char[]{(char) i};
            }
            if (this.tokenize) {
                char[] cArr = this.charRefOneCharBuf;
                this.text = newString(cArr, 0, cArr.length);
            }
            return this.charRefOneCharBuf;
        }
        if (!isNameStartChar(cMore3)) {
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append("entity reference names can not start with character '");
            stringBuffer6.append(printable(cMore3));
            stringBuffer6.append("'");
            throw new XmlPullParserException(stringBuffer6.toString(), this, null);
        }
        do {
            cMore = more();
            if (cMore == ';') {
                int i2 = this.pos - 1;
                this.posEnd = i2;
                int i3 = this.posStart;
                int i4 = i2 - i3;
                if (i4 == 2) {
                    char[] cArr2 = this.buf;
                    if (cArr2[i3] == 'l' && cArr2[i3 + 1] == 't') {
                        if (this.tokenize) {
                            this.text = "<";
                        }
                        char[] cArr3 = this.charRefOneCharBuf;
                        cArr3[0] = '<';
                        return cArr3;
                    }
                }
                if (i4 == 3) {
                    char[] cArr4 = this.buf;
                    if (cArr4[i3] == 'a' && cArr4[i3 + 1] == 'm' && cArr4[i3 + 2] == 'p') {
                        if (this.tokenize) {
                            this.text = "&";
                        }
                        char[] cArr5 = this.charRefOneCharBuf;
                        cArr5[0] = '&';
                        return cArr5;
                    }
                }
                if (i4 == 2) {
                    char[] cArr6 = this.buf;
                    if (cArr6[i3] == 'g' && cArr6[i3 + 1] == 't') {
                        if (this.tokenize) {
                            this.text = ">";
                        }
                        char[] cArr7 = this.charRefOneCharBuf;
                        cArr7[0] = '>';
                        return cArr7;
                    }
                }
                if (i4 == 4) {
                    char[] cArr8 = this.buf;
                    if (cArr8[i3] == 'a' && cArr8[i3 + 1] == 'p' && cArr8[i3 + 2] == 'o' && cArr8[i3 + 3] == 's') {
                        if (this.tokenize) {
                            this.text = "'";
                        }
                        char[] cArr9 = this.charRefOneCharBuf;
                        cArr9[0] = ExtendedMessageFormat.QUOTE;
                        return cArr9;
                    }
                }
                if (i4 == 4) {
                    char[] cArr10 = this.buf;
                    if (cArr10[i3] == 'q' && cArr10[i3 + 1] == 'u' && cArr10[i3 + 2] == 'o' && cArr10[i3 + 3] == 't') {
                        if (this.tokenize) {
                            this.text = "\"";
                        }
                        char[] cArr11 = this.charRefOneCharBuf;
                        cArr11[0] = '\"';
                        return cArr11;
                    }
                }
                char[] cArrLookupEntityReplacement = lookupEntityReplacement(i4);
                if (cArrLookupEntityReplacement != null) {
                    return cArrLookupEntityReplacement;
                }
                if (this.tokenize) {
                    this.text = null;
                }
                return null;
            }
        } while (isNameChar(cMore));
        StringBuffer stringBuffer7 = new StringBuffer();
        stringBuffer7.append("entity reference name can not contain character ");
        stringBuffer7.append(printable(cMore));
        stringBuffer7.append("'");
        throw new XmlPullParserException(stringBuffer7.toString(), this, null);
    }

    public final char[] lookupEntityReplacement(int i) {
        if (!this.allStringsInterned) {
            char[] cArr = this.buf;
            int i2 = this.posStart;
            int iFastHash = fastHash(cArr, i2, this.posEnd - i2);
            for (int i3 = this.entityEnd - 1; i3 >= 0; i3--) {
                if (iFastHash == this.entityNameHash[i3]) {
                    char[] cArr2 = this.entityNameBuf[i3];
                    if (i == cArr2.length) {
                        for (int i4 = 0; i4 < i; i4++) {
                            if (this.buf[this.posStart + i4] != cArr2[i4]) {
                                break;
                            }
                        }
                        if (this.tokenize) {
                            this.text = this.entityReplacement[i3];
                        }
                        return this.entityReplacementBuf[i3];
                    }
                    continue;
                }
            }
            return null;
        }
        char[] cArr3 = this.buf;
        int i5 = this.posStart;
        this.entityRefName = newString(cArr3, i5, this.posEnd - i5);
        for (int i6 = this.entityEnd - 1; i6 >= 0; i6--) {
            if (this.entityRefName == this.entityName[i6]) {
                if (this.tokenize) {
                    this.text = this.entityReplacement[i6];
                }
                return this.entityReplacementBuf[i6];
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void parseComment() throws XmlPullParserException, IOException {
        boolean z;
        if (more() != '-') {
            throw new XmlPullParserException("expected <!-- for comment start", this, null);
        }
        boolean z2 = this.tokenize;
        if (z2) {
            this.posStart = this.pos;
        }
        int i = this.lineNumber;
        int i2 = this.columnNumber - 4;
        if (z2) {
            try {
                z = !this.roundtripSupported;
            } catch (EOFException e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("comment started on line ");
                stringBuffer.append(i);
                stringBuffer.append(" and column ");
                stringBuffer.append(i2);
                stringBuffer.append(" was not closed");
                throw new XmlPullParserException(stringBuffer.toString(), this, e);
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            char cMore = more();
            if (cMore == 65535) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append("no more data available");
                stringBuffer2.append(getPositionDescription());
                throw new EOFException(stringBuffer2.toString());
            }
            if (z3 && cMore != '>') {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("in comment after two dashes (--) next character must be > not ");
                stringBuffer3.append(printable(cMore));
                throw new XmlPullParserException(stringBuffer3.toString(), this, null);
            }
            if (cMore == '-') {
                if (z4) {
                    z3 = true;
                } else {
                    z4 = true;
                }
            } else {
                if (cMore == '>' && z3) {
                    if (this.tokenize) {
                        this.posEnd = this.pos - 3;
                        if (this.usePC) {
                            this.pcEnd -= 2;
                            return;
                        }
                        return;
                    }
                    return;
                }
                z4 = false;
            }
            if (z) {
                if (cMore == '\r') {
                    if (!this.usePC) {
                        int i3 = this.pos - 1;
                        this.posEnd = i3;
                        if (i3 > this.posStart) {
                            joinPC();
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                    int i4 = this.pcEnd;
                    if (i4 >= this.f9672pc.length) {
                        ensurePC(i4);
                    }
                    char[] cArr = this.f9672pc;
                    int i5 = this.pcEnd;
                    this.pcEnd = i5 + 1;
                    cArr[i5] = '\n';
                    z5 = true;
                } else {
                    if (cMore == '\n') {
                        if (!z5 && this.usePC) {
                            int i6 = this.pcEnd;
                            if (i6 >= this.f9672pc.length) {
                                ensurePC(i6);
                            }
                            char[] cArr2 = this.f9672pc;
                            int i7 = this.pcEnd;
                            this.pcEnd = i7 + 1;
                            cArr2[i7] = '\n';
                        }
                    } else if (this.usePC) {
                        int i8 = this.pcEnd;
                        if (i8 >= this.f9672pc.length) {
                            ensurePC(i8);
                        }
                        char[] cArr3 = this.f9672pc;
                        int i9 = this.pcEnd;
                        this.pcEnd = i9 + 1;
                        cArr3[i9] = cMore;
                    }
                    z5 = false;
                }
            }
        }
    }

    public final boolean parsePI() throws XmlPullParserException, IOException {
        char[] cArr;
        char c;
        char c2;
        char c3;
        int i;
        boolean z = this.tokenize;
        if (z) {
            this.posStart = this.pos;
        }
        int i2 = this.lineNumber;
        int i3 = this.columnNumber - 2;
        int i4 = this.pos;
        boolean z2 = false;
        int i5 = 1;
        boolean z3 = z && !this.roundtripSupported;
        try {
            char cMore = more();
            Throwable th = null;
            if (isS(cMore)) {
                throw new XmlPullParserException("processing instruction PITarget must be exactly after <? and not white space character", this, null);
            }
            int i6 = -1;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = -1;
            while (cMore != 65535) {
                if (cMore == '?') {
                    if (i7 == 0) {
                        throw new XmlPullParserException("processing instruction PITarget name not found", this, th);
                    }
                    i8 = i5;
                } else if (cMore != '>') {
                    if (i10 == i6 && isS(cMore)) {
                        i10 = this.pos - 1;
                        if (i10 - i4 == 3 && (((c = (cArr = this.buf)[i4]) == 'x' || c == 'X') && (((c2 = cArr[i4 + 1]) == 'm' || c2 == 'M') && ((c3 = cArr[i4 + 2]) == 'l' || c3 == 'L')))) {
                            if (i4 > 3) {
                                throw new XmlPullParserException("processing instruction can not have PITarget with reserved xml name", this, null);
                            }
                            if (c != 'x' && c2 != 'm' && c3 != 'l') {
                                throw new XmlPullParserException("XMLDecl must have xml name in lowercase", this, null);
                            }
                            parseXmlDecl(cMore);
                            if (this.tokenize) {
                                this.posEnd = this.pos - 2;
                            }
                            int i11 = i4 + 3;
                            this.xmlDeclContent = newString(this.buf, i11, (this.pos - 2) - i11);
                            return true;
                        }
                    }
                    i8 = 0;
                } else {
                    if (i8 != 0) {
                        int i12 = this.pos;
                        if (this.tokenize) {
                            this.posEnd = i12 - 2;
                            if (z3) {
                                this.pcEnd -= i5;
                            }
                        }
                        return z2;
                    }
                    if (i7 == 0) {
                        throw new XmlPullParserException("processing instruction PITarget name not found", this, th);
                    }
                }
                if (!z3) {
                    z2 = false;
                    i = 1;
                } else if (cMore == '\r') {
                    if (this.usePC) {
                        z2 = false;
                        i = 1;
                    } else {
                        i = 1;
                        int i13 = this.pos - 1;
                        this.posEnd = i13;
                        if (i13 > this.posStart) {
                            joinPC();
                            z2 = false;
                        } else {
                            this.usePC = true;
                            z2 = false;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                    int i14 = this.pcEnd;
                    if (i14 >= this.f9672pc.length) {
                        ensurePC(i14);
                    }
                    char[] cArr2 = this.f9672pc;
                    int i15 = this.pcEnd;
                    this.pcEnd = i15 + 1;
                    cArr2[i15] = '\n';
                    i9 = i;
                } else {
                    z2 = false;
                    i = 1;
                    if (cMore == '\n') {
                        if (i9 == 0 && this.usePC) {
                            int i16 = this.pcEnd;
                            if (i16 >= this.f9672pc.length) {
                                ensurePC(i16);
                            }
                            char[] cArr3 = this.f9672pc;
                            int i17 = this.pcEnd;
                            this.pcEnd = i17 + 1;
                            cArr3[i17] = '\n';
                        }
                    } else if (this.usePC) {
                        int i18 = this.pcEnd;
                        if (i18 >= this.f9672pc.length) {
                            ensurePC(i18);
                        }
                        char[] cArr4 = this.f9672pc;
                        int i19 = this.pcEnd;
                        this.pcEnd = i19 + 1;
                        cArr4[i19] = cMore;
                    }
                    i9 = 0;
                }
                cMore = more();
                i5 = i;
                i7 = i5;
                i6 = -1;
                th = null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("no more data available");
            stringBuffer.append(getPositionDescription());
            throw new EOFException(stringBuffer.toString());
        } catch (EOFException e) {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("processing instruction started on line ");
            stringBuffer2.append(i2);
            stringBuffer2.append(" and column ");
            stringBuffer2.append(i3);
            stringBuffer2.append(" was not closed");
            throw new XmlPullParserException(stringBuffer2.toString(), this, e);
        }
    }

    static {
        setNameStart(':');
        for (char c = 'A'; c <= 'Z'; c = (char) (c + 1)) {
            setNameStart(c);
        }
        setNameStart(LauncherConstants.UNDERSCORE_CHAR);
        for (char c2 = 'a'; c2 <= 'z'; c2 = (char) (c2 + 1)) {
            setNameStart(c2);
        }
        for (char c3 = 192; c3 <= 767; c3 = (char) (c3 + 1)) {
            setNameStart(c3);
        }
        for (char c4 = 880; c4 <= 893; c4 = (char) (c4 + 1)) {
            setNameStart(c4);
        }
        for (char c5 = 895; c5 < 1024; c5 = (char) (c5 + 1)) {
            setNameStart(c5);
        }
        setName('-');
        setName('.');
        for (char c6 = '0'; c6 <= '9'; c6 = (char) (c6 + 1)) {
            setName(c6);
        }
        setName(Typography.middleDot);
        for (char c7 = 768; c7 <= 879; c7 = (char) (c7 + 1)) {
            setName(c7);
        }
    }

    public final void parseXmlDecl(char c) throws XmlPullParserException, IOException {
        this.preventBufferCompaction = true;
        this.bufStart = 0;
        char cSkipS = skipS(requireInput(skipS(c), VERSION));
        if (cSkipS != '=') {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("expected equals sign (=) after version and not ");
            stringBuffer.append(printable(cSkipS));
            throw new XmlPullParserException(stringBuffer.toString(), this, null);
        }
        char cSkipS2 = skipS(more());
        if (cSkipS2 != '\'' && cSkipS2 != '\"') {
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append("expected apostrophe (') or quotation mark (\") after version and not ");
            stringBuffer2.append(printable(cSkipS2));
            throw new XmlPullParserException(stringBuffer2.toString(), this, null);
        }
        int i = this.pos;
        char cMore = more();
        while (cMore != cSkipS2) {
            if ((cMore < 'a' || cMore > 'z') && ((cMore < 'A' || cMore > 'Z') && ((cMore < '0' || cMore > '9') && cMore != '_' && cMore != '.' && cMore != ':' && cMore != '-'))) {
                StringBuffer stringBuffer3 = new StringBuffer();
                stringBuffer3.append("<?xml version value expected to be in ([a-zA-Z0-9_.:] | '-') not ");
                stringBuffer3.append(printable(cMore));
                throw new XmlPullParserException(stringBuffer3.toString(), this, null);
            }
            cMore = more();
        }
        parseXmlDeclWithVersion(i, this.pos - 1);
        this.preventBufferCompaction = false;
    }

    public final void parseXmlDeclWithVersion(int i, int i2) throws XmlPullParserException, IOException {
        char cRequireInput;
        int i3 = i2 - i;
        if (i3 == 3) {
            char[] cArr = this.buf;
            if (cArr[i] == '1' && cArr[i + 1] == '.' && cArr[i + 2] == '0') {
                this.xmlDeclVersion = newString(cArr, i, i3);
                char cSkipS = skipS(more());
                if (cSkipS == 'e') {
                    char cSkipS2 = skipS(requireInput(more(), NCODING));
                    if (cSkipS2 != '=') {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("expected equals sign (=) after encoding and not ");
                        stringBuffer.append(printable(cSkipS2));
                        throw new XmlPullParserException(stringBuffer.toString(), this, null);
                    }
                    char cSkipS3 = skipS(more());
                    if (cSkipS3 != '\'' && cSkipS3 != '\"') {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("expected apostrophe (') or quotation mark (\") after encoding and not ");
                        stringBuffer2.append(printable(cSkipS3));
                        throw new XmlPullParserException(stringBuffer2.toString(), this, null);
                    }
                    int i4 = this.pos;
                    char cMore = more();
                    if ((cMore < 'a' || cMore > 'z') && (cMore < 'A' || cMore > 'Z')) {
                        StringBuffer stringBuffer3 = new StringBuffer();
                        stringBuffer3.append("<?xml encoding name expected to start with [A-Za-z] not ");
                        stringBuffer3.append(printable(cMore));
                        throw new XmlPullParserException(stringBuffer3.toString(), this, null);
                    }
                    char cMore2 = more();
                    while (cMore2 != cSkipS3) {
                        if ((cMore2 < 'a' || cMore2 > 'z') && ((cMore2 < 'A' || cMore2 > 'Z') && ((cMore2 < '0' || cMore2 > '9') && cMore2 != '.' && cMore2 != '_' && cMore2 != '-'))) {
                            StringBuffer stringBuffer4 = new StringBuffer();
                            stringBuffer4.append("<?xml encoding value expected to be in ([A-Za-z0-9._] | '-') not ");
                            stringBuffer4.append(printable(cMore2));
                            throw new XmlPullParserException(stringBuffer4.toString(), this, null);
                        }
                        cMore2 = more();
                    }
                    this.inputEncoding = newString(this.buf, i4, (this.pos - 1) - i4);
                    cSkipS = more();
                }
                char cSkipS4 = skipS(cSkipS);
                if (cSkipS4 == 's') {
                    char cSkipS5 = skipS(requireInput(more(), TANDALONE));
                    if (cSkipS5 != '=') {
                        StringBuffer stringBuffer5 = new StringBuffer();
                        stringBuffer5.append("expected equals sign (=) after standalone and not ");
                        stringBuffer5.append(printable(cSkipS5));
                        throw new XmlPullParserException(stringBuffer5.toString(), this, null);
                    }
                    char cSkipS6 = skipS(more());
                    if (cSkipS6 != '\'' && cSkipS6 != '\"') {
                        StringBuffer stringBuffer6 = new StringBuffer();
                        stringBuffer6.append("expected apostrophe (') or quotation mark (\") after encoding and not ");
                        stringBuffer6.append(printable(cSkipS6));
                        throw new XmlPullParserException(stringBuffer6.toString(), this, null);
                    }
                    char cMore3 = more();
                    if (cMore3 == 'y') {
                        cRequireInput = requireInput(cMore3, YES);
                        this.xmlDeclStandalone = Boolean.TRUE;
                    } else if (cMore3 == 'n') {
                        cRequireInput = requireInput(cMore3, f9671NO);
                        this.xmlDeclStandalone = Boolean.FALSE;
                    } else {
                        StringBuffer stringBuffer7 = new StringBuffer();
                        stringBuffer7.append("expected 'yes' or 'no' after standalone and not ");
                        stringBuffer7.append(printable(cMore3));
                        throw new XmlPullParserException(stringBuffer7.toString(), this, null);
                    }
                    if (cRequireInput != cSkipS6) {
                        StringBuffer stringBuffer8 = new StringBuffer();
                        stringBuffer8.append("expected ");
                        stringBuffer8.append(cSkipS6);
                        stringBuffer8.append(" after standalone value not ");
                        stringBuffer8.append(printable(cRequireInput));
                        throw new XmlPullParserException(stringBuffer8.toString(), this, null);
                    }
                    cSkipS4 = more();
                }
                char cSkipS7 = skipS(cSkipS4);
                if (cSkipS7 != '?') {
                    StringBuffer stringBuffer9 = new StringBuffer();
                    stringBuffer9.append("expected ?> as last part of <?xml not ");
                    stringBuffer9.append(printable(cSkipS7));
                    throw new XmlPullParserException(stringBuffer9.toString(), this, null);
                }
                char cMore4 = more();
                if (cMore4 == '>') {
                    return;
                }
                StringBuffer stringBuffer10 = new StringBuffer();
                stringBuffer10.append("expected ?> as last part of <?xml not ");
                stringBuffer10.append(printable(cMore4));
                throw new XmlPullParserException(stringBuffer10.toString(), this, null);
            }
        }
        StringBuffer stringBuffer11 = new StringBuffer();
        stringBuffer11.append("only 1.0 is supported as <?xml version not '");
        stringBuffer11.append(printable(new String(this.buf, i, i3)));
        stringBuffer11.append("'");
        throw new XmlPullParserException(stringBuffer11.toString(), this, null);
    }

    public final void parseDocdecl() throws XmlPullParserException, IOException {
        if (more() != 'O') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, null);
        }
        if (more() != 'C') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, null);
        }
        if (more() != 'T') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, null);
        }
        if (more() != 'Y') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, null);
        }
        if (more() != 'P') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, null);
        }
        if (more() != 'E') {
            throw new XmlPullParserException("expected <!DOCTYPE", this, null);
        }
        this.posStart = this.pos;
        boolean z = this.tokenize && !this.roundtripSupported;
        int i = 0;
        boolean z2 = false;
        while (true) {
            char cMore = more();
            if (cMore == '[') {
                i++;
            }
            if (cMore == ']') {
                i--;
            }
            if (cMore == '>' && i == 0) {
                this.posEnd = this.pos - 1;
                return;
            }
            if (z) {
                if (cMore == '\r') {
                    if (!this.usePC) {
                        int i2 = this.pos - 1;
                        this.posEnd = i2;
                        if (i2 > this.posStart) {
                            joinPC();
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                    int i3 = this.pcEnd;
                    if (i3 >= this.f9672pc.length) {
                        ensurePC(i3);
                    }
                    char[] cArr = this.f9672pc;
                    int i4 = this.pcEnd;
                    this.pcEnd = i4 + 1;
                    cArr[i4] = '\n';
                    z2 = true;
                } else {
                    if (cMore == '\n') {
                        if (!z2 && this.usePC) {
                            int i5 = this.pcEnd;
                            if (i5 >= this.f9672pc.length) {
                                ensurePC(i5);
                            }
                            char[] cArr2 = this.f9672pc;
                            int i6 = this.pcEnd;
                            this.pcEnd = i6 + 1;
                            cArr2[i6] = '\n';
                        }
                    } else if (this.usePC) {
                        int i7 = this.pcEnd;
                        if (i7 >= this.f9672pc.length) {
                            ensurePC(i7);
                        }
                        char[] cArr3 = this.f9672pc;
                        int i8 = this.pcEnd;
                        this.pcEnd = i8 + 1;
                        cArr3[i8] = cMore;
                    }
                    z2 = false;
                }
            }
        }
    }

    public final void parseCDSect(boolean z) throws XmlPullParserException, IOException {
        if (more() != 'C') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, null);
        }
        if (more() != 'D') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, null);
        }
        if (more() != 'A') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, null);
        }
        if (more() != 'T') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, null);
        }
        if (more() != 'A') {
            throw new XmlPullParserException("expected <[CDATA[ for comment start", this, null);
        }
        if (more() != '[') {
            throw new XmlPullParserException("expected <![CDATA[ for comment start", this, null);
        }
        int i = this.pos + this.bufAbsoluteStart;
        int i2 = this.lineNumber;
        int i3 = this.columnNumber;
        boolean z2 = (this.tokenize && this.roundtripSupported) ? false : true;
        if (z2 && z) {
            try {
                if (!this.usePC) {
                    if (this.posEnd > this.posStart) {
                        joinPC();
                    } else {
                        this.usePC = true;
                        this.pcEnd = 0;
                        this.pcStart = 0;
                    }
                }
            } catch (EOFException e) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("CDATA section started on line ");
                stringBuffer.append(i2);
                stringBuffer.append(" and column ");
                stringBuffer.append(i3);
                stringBuffer.append(" was not closed");
                throw new XmlPullParserException(stringBuffer.toString(), this, e);
            }
        }
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (true) {
            char cMore = more();
            if (cMore != ']') {
                if (cMore == '>') {
                    if (z3 && z4) {
                        break;
                    }
                } else if (z3) {
                }
                z3 = false;
                z4 = false;
            } else if (z3) {
                z4 = true;
            } else {
                z3 = true;
            }
            if (z2) {
                if (cMore == '\r') {
                    int i4 = i - this.bufAbsoluteStart;
                    this.posStart = i4;
                    int i5 = this.pos - 1;
                    this.posEnd = i5;
                    if (!this.usePC) {
                        if (i5 > i4) {
                            joinPC();
                        } else {
                            this.usePC = true;
                            this.pcEnd = 0;
                            this.pcStart = 0;
                        }
                    }
                    int i6 = this.pcEnd;
                    if (i6 >= this.f9672pc.length) {
                        ensurePC(i6);
                    }
                    char[] cArr = this.f9672pc;
                    int i7 = this.pcEnd;
                    this.pcEnd = i7 + 1;
                    cArr[i7] = '\n';
                    z5 = true;
                } else {
                    if (cMore == '\n') {
                        if (!z5 && this.usePC) {
                            int i8 = this.pcEnd;
                            if (i8 >= this.f9672pc.length) {
                                ensurePC(i8);
                            }
                            char[] cArr2 = this.f9672pc;
                            int i9 = this.pcEnd;
                            this.pcEnd = i9 + 1;
                            cArr2[i9] = '\n';
                        }
                    } else if (this.usePC) {
                        int i10 = this.pcEnd;
                        if (i10 >= this.f9672pc.length) {
                            ensurePC(i10);
                        }
                        char[] cArr3 = this.f9672pc;
                        int i11 = this.pcEnd;
                        this.pcEnd = i11 + 1;
                        cArr3[i11] = cMore;
                    }
                    z5 = false;
                }
            }
        }
        if (z2 && this.usePC) {
            this.pcEnd -= 2;
        }
        this.posStart = i - this.bufAbsoluteStart;
        this.posEnd = this.pos - 3;
    }

    public final void fillBuf() throws XmlPullParserException, IOException {
        char[] cArr;
        char[] cArr2;
        int i;
        if (this.reader == null) {
            throw new XmlPullParserException("reader must be set before parsing is started");
        }
        int i2 = this.bufEnd;
        int i3 = this.bufSoftLimit;
        if (i2 > i3) {
            if (!this.preventBufferCompaction && ((i = this.bufStart) > i3 || i >= this.buf.length / 2)) {
                char[] cArr3 = this.buf;
                System.arraycopy(cArr3, i, cArr3, 0, i2 - i);
            } else {
                char[] cArr4 = this.buf;
                char[] cArr5 = new char[cArr4.length * 2];
                int i4 = this.bufStart;
                System.arraycopy(cArr4, i4, cArr5, 0, i2 - i4);
                this.buf = cArr5;
                if (this.bufLoadFactor > 0) {
                    this.bufSoftLimit = (int) (this.bufferLoadFactor * cArr5.length);
                }
            }
            int i5 = this.bufEnd;
            int i6 = this.bufStart;
            this.bufEnd = i5 - i6;
            this.pos -= i6;
            this.posStart -= i6;
            this.posEnd -= i6;
            this.bufAbsoluteStart += i6;
            this.bufStart = 0;
        }
        int i7 = this.reader.read(this.buf, this.bufEnd, Math.min(this.buf.length - this.bufEnd, 8192));
        if (i7 > 0) {
            this.bufEnd += i7;
            return;
        }
        if (i7 == -1) {
            if (this.bufAbsoluteStart == 0 && this.pos == 0) {
                throw new EOFException("input contained no data");
            }
            if (this.seenRoot && this.depth == 0) {
                this.reachedEnd = true;
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            int i8 = this.depth;
            if (i8 > 0) {
                char[][] cArr6 = this.elRawName;
                if (cArr6 == null || cArr6[i8] == null) {
                    char[] cArr7 = this.buf;
                    int i9 = this.posStart;
                    String str = new String(cArr7, i9 + 1, (this.pos - i9) - 1);
                    stringBuffer.append(" - expected the opening tag <");
                    stringBuffer.append(str);
                    stringBuffer.append("...>");
                } else {
                    stringBuffer.append(" - expected end tag");
                    if (this.depth > 1) {
                        stringBuffer.append("s");
                    }
                    stringBuffer.append(" ");
                    for (int i10 = this.depth; i10 > 0; i10--) {
                        char[][] cArr8 = this.elRawName;
                        if (cArr8 == null || (cArr2 = cArr8[i10]) == null) {
                            char[] cArr9 = this.buf;
                            int i11 = this.posStart;
                            String str2 = new String(cArr9, i11 + 1, (this.pos - i11) - 1);
                            stringBuffer.append(" - expected the opening tag <");
                            stringBuffer.append(str2);
                            stringBuffer.append("...>");
                        } else {
                            String str3 = new String(cArr2, 0, this.elRawNameEnd[i10]);
                            stringBuffer.append("</");
                            stringBuffer.append(str3);
                            stringBuffer.append('>');
                        }
                    }
                    stringBuffer.append(" to close");
                    for (int i12 = this.depth; i12 > 0; i12--) {
                        if (i12 != this.depth) {
                            stringBuffer.append(" and");
                        }
                        char[][] cArr10 = this.elRawName;
                        if (cArr10 == null || (cArr = cArr10[i12]) == null) {
                            String str4 = new String(cArr10[i12], 0, this.elRawNameEnd[i12]);
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append(" start tag <");
                            stringBuffer2.append(str4);
                            stringBuffer2.append(">");
                            stringBuffer.append(stringBuffer2.toString());
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append(" from line ");
                            stringBuffer3.append(this.elRawNameLine[i12]);
                            stringBuffer.append(stringBuffer3.toString());
                        } else {
                            String str5 = new String(cArr, 0, this.elRawNameEnd[i12]);
                            stringBuffer.append(" start tag <");
                            stringBuffer.append(str5);
                            stringBuffer.append(">");
                            stringBuffer.append(" from line ");
                            stringBuffer.append(this.elRawNameLine[i12]);
                        }
                    }
                    stringBuffer.append(", parser stopped on");
                }
            }
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append("no more data available");
            stringBuffer4.append(stringBuffer.toString());
            stringBuffer4.append(getPositionDescription());
            throw new EOFException(stringBuffer4.toString());
        }
        StringBuffer stringBuffer5 = new StringBuffer();
        stringBuffer5.append("error reading input, returned ");
        stringBuffer5.append(i7);
        throw new IOException(stringBuffer5.toString());
    }

    public final char more() throws XmlPullParserException, IOException {
        if (this.pos >= this.bufEnd) {
            fillBuf();
            if (this.reachedEnd) {
                return CharCompanionObject.MAX_VALUE;
            }
        }
        char[] cArr = this.buf;
        int i = this.pos;
        this.pos = i + 1;
        char c = cArr[i];
        if (c == '\n') {
            this.lineNumber++;
            this.columnNumber = 1;
        } else {
            this.columnNumber++;
        }
        return c;
    }

    public final void ensurePC(int i) {
        char[] cArr = new char[i > 8192 ? i * 2 : 16384];
        System.arraycopy(this.f9672pc, 0, cArr, 0, this.pcEnd);
        this.f9672pc = cArr;
    }

    public final void joinPC() {
        int i = this.posEnd - this.posStart;
        int i2 = this.pcEnd + i + 1;
        if (i2 >= this.f9672pc.length) {
            ensurePC(i2);
        }
        System.arraycopy(this.buf, this.posStart, this.f9672pc, this.pcEnd, i);
        this.pcEnd += i;
        this.usePC = true;
    }

    public final char requireInput(char c, char[] cArr) throws XmlPullParserException, IOException {
        for (int i = 0; i < cArr.length; i++) {
            if (c != cArr[i]) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("expected ");
                stringBuffer.append(printable(cArr[i]));
                stringBuffer.append(" in ");
                stringBuffer.append(new String(cArr));
                stringBuffer.append(" and not ");
                stringBuffer.append(printable(c));
                throw new XmlPullParserException(stringBuffer.toString(), this, null);
            }
            c = more();
        }
        return c;
    }

    public final char requireNextS() throws XmlPullParserException, IOException {
        char cMore = more();
        if (!isS(cMore)) {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("white space is required and not ");
            stringBuffer.append(printable(cMore));
            throw new XmlPullParserException(stringBuffer.toString(), this, null);
        }
        return skipS(cMore);
    }

    public final char skipS(char c) throws XmlPullParserException, IOException {
        while (isS(c)) {
            c = more();
        }
        return c;
    }

    public static final void setName(char c) {
        lookupNameChar[c] = true;
    }

    public static final void setNameStart(char c) {
        lookupNameStartChar[c] = true;
        setName(c);
    }

    public final boolean isNameStartChar(char c) {
        if (c < 1024) {
            return lookupNameStartChar[c];
        }
        return c <= 8231 || (c >= 8234 && c <= 8591) || (c >= 10240 && c <= 65519);
    }

    public final boolean isNameChar(char c) {
        if (c < 1024) {
            return lookupNameChar[c];
        }
        return c <= 8231 || (c >= 8234 && c <= 8591) || (c >= 10240 && c <= 65519);
    }

    public final String printable(char c) {
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\'') {
            return "\\'";
        }
        if (c > 127 || c < ' ') {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("\\u");
            stringBuffer.append(Integer.toHexString(c));
            return stringBuffer.toString();
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("");
        stringBuffer2.append(c);
        return stringBuffer2.toString();
    }

    public final String printable(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length + 10);
        for (int i = 0; i < length; i++) {
            stringBuffer.append(printable(str.charAt(i)));
        }
        return stringBuffer.toString();
    }
}
