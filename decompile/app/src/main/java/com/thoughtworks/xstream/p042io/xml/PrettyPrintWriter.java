package com.thoughtworks.xstream.p042io.xml;

import com.thoughtworks.xstream.core.util.FastStack;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.p042io.StreamException;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import java.io.IOException;
import java.io.Writer;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes7.dex */
public class PrettyPrintWriter extends AbstractXmlWriter {
    public static int XML_1_0 = 0;
    public static int XML_1_1 = 1;
    public static int XML_QUIRKS = -1;
    public int depth;
    public final FastStack elementStack;
    public final char[] lineIndenter;
    public final int mode;
    public String newLine;
    public boolean readyForNewLine;
    public boolean tagInProgress;
    public boolean tagIsEmpty;
    public final QuickWriter writer;
    public static final char[] NULL = "&#x0;".toCharArray();
    public static final char[] AMP = "&amp;".toCharArray();

    /* renamed from: LT */
    public static final char[] f5913LT = "&lt;".toCharArray();

    /* renamed from: GT */
    public static final char[] f5912GT = "&gt;".toCharArray();

    /* renamed from: CR */
    public static final char[] f5911CR = "&#xd;".toCharArray();
    public static final char[] QUOT = "&quot;".toCharArray();
    public static final char[] APOS = "&apos;".toCharArray();
    public static final char[] CLOSE = "</".toCharArray();

    public PrettyPrintWriter(Writer writer, int i, char[] cArr, NameCoder nameCoder, String str) {
        super(nameCoder);
        this.elementStack = new FastStack(16);
        this.writer = new QuickWriter(writer);
        this.lineIndenter = cArr;
        this.newLine = str;
        this.mode = i;
        if (i < XML_QUIRKS || i > XML_1_1) {
            throw new IllegalArgumentException("Not a valid XML mode");
        }
    }

    public PrettyPrintWriter(Writer writer, char[] cArr, String str, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(writer, XML_QUIRKS, cArr, xmlFriendlyReplacer, str);
    }

    public PrettyPrintWriter(Writer writer, int i, char[] cArr, NameCoder nameCoder) {
        this(writer, i, cArr, nameCoder, StringUtils.f9903LF);
    }

    public PrettyPrintWriter(Writer writer, int i, char[] cArr, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(writer, i, cArr, xmlFriendlyReplacer, StringUtils.f9903LF);
    }

    public PrettyPrintWriter(Writer writer, char[] cArr, String str) {
        this(writer, cArr, str, new XmlFriendlyReplacer());
    }

    public PrettyPrintWriter(Writer writer, int i, char[] cArr) {
        this(writer, i, cArr, new XmlFriendlyNameCoder());
    }

    public PrettyPrintWriter(Writer writer, char[] cArr) {
        this(writer, XML_QUIRKS, cArr);
    }

    public PrettyPrintWriter(Writer writer, String str, String str2) {
        this(writer, str.toCharArray(), str2);
    }

    public PrettyPrintWriter(Writer writer, int i, String str) {
        this(writer, i, str.toCharArray());
    }

    public PrettyPrintWriter(Writer writer, String str) {
        this(writer, str.toCharArray());
    }

    public PrettyPrintWriter(Writer writer, int i, NameCoder nameCoder) {
        this(writer, i, new char[]{' ', ' '}, nameCoder);
    }

    public PrettyPrintWriter(Writer writer, int i, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(writer, i, new char[]{' ', ' '}, xmlFriendlyReplacer);
    }

    public PrettyPrintWriter(Writer writer, NameCoder nameCoder) {
        this(writer, XML_QUIRKS, new char[]{' ', ' '}, nameCoder, StringUtils.f9903LF);
    }

    public PrettyPrintWriter(Writer writer, XmlFriendlyReplacer xmlFriendlyReplacer) {
        this(writer, new char[]{' ', ' '}, StringUtils.f9903LF, xmlFriendlyReplacer);
    }

    public PrettyPrintWriter(Writer writer, int i) {
        this(writer, i, new char[]{' ', ' '});
    }

    public PrettyPrintWriter(Writer writer) {
        this(writer, new char[]{' ', ' '});
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void startNode(String str) throws IOException {
        String strEncodeNode = encodeNode(str);
        this.tagIsEmpty = false;
        finishTag();
        this.writer.write('<');
        this.writer.write(strEncodeNode);
        this.elementStack.push(strEncodeNode);
        this.tagInProgress = true;
        this.depth++;
        this.readyForNewLine = true;
        this.tagIsEmpty = true;
    }

    @Override // com.thoughtworks.xstream.p042io.AbstractWriter, com.thoughtworks.xstream.p042io.ExtendedHierarchicalStreamWriter
    public void startNode(String str, Class cls) throws IOException {
        startNode(str);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void setValue(String str) throws IOException {
        this.readyForNewLine = false;
        this.tagIsEmpty = false;
        finishTag();
        writeText(this.writer, str);
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void addAttribute(String str, String str2) throws IOException {
        this.writer.write(' ');
        this.writer.write(encodeAttribute(str));
        this.writer.write('=');
        this.writer.write('\"');
        writeAttributeValue(this.writer, str2);
        this.writer.write('\"');
    }

    public void writeAttributeValue(QuickWriter quickWriter, String str) throws IOException {
        writeText(str, true);
    }

    public void writeText(QuickWriter quickWriter, String str) throws IOException {
        writeText(str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void writeText(String str, boolean z) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != 0) {
                if (cCharAt == '\r') {
                    this.writer.write(f5911CR);
                } else if (cCharAt == '\"') {
                    this.writer.write(QUOT);
                } else if (cCharAt == '<') {
                    this.writer.write(f5913LT);
                } else if (cCharAt == '>') {
                    this.writer.write(f5912GT);
                } else if (cCharAt == '\t' || cCharAt == '\n') {
                    if (!z) {
                        this.writer.write(cCharAt);
                    } else if (Character.isDefined(cCharAt) && !Character.isISOControl(cCharAt)) {
                        if (this.mode != XML_QUIRKS && cCharAt > 55295 && cCharAt < 57344) {
                            StringBuffer stringBuffer = new StringBuffer();
                            stringBuffer.append("Invalid character 0x");
                            stringBuffer.append(Integer.toHexString(cCharAt));
                            stringBuffer.append(" in XML stream");
                            throw new StreamException(stringBuffer.toString());
                        }
                        this.writer.write(cCharAt);
                    } else {
                        int i2 = this.mode;
                        if (i2 == XML_1_0 && (cCharAt < '\t' || cCharAt == 11 || cCharAt == '\f' || cCharAt == 14 || (cCharAt >= 15 && cCharAt <= 31))) {
                            StringBuffer stringBuffer2 = new StringBuffer();
                            stringBuffer2.append("Invalid character 0x");
                            stringBuffer2.append(Integer.toHexString(cCharAt));
                            stringBuffer2.append(" in XML 1.0 stream");
                            throw new StreamException(stringBuffer2.toString());
                        }
                        if (i2 != XML_QUIRKS && (cCharAt == 65534 || cCharAt == 65535)) {
                            StringBuffer stringBuffer3 = new StringBuffer();
                            stringBuffer3.append("Invalid character 0x");
                            stringBuffer3.append(Integer.toHexString(cCharAt));
                            stringBuffer3.append(" in XML stream");
                            throw new StreamException(stringBuffer3.toString());
                        }
                        this.writer.write("&#x");
                        this.writer.write(Integer.toHexString(cCharAt));
                        this.writer.write(';');
                    }
                } else if (cCharAt == '&') {
                    this.writer.write(AMP);
                } else if (cCharAt == '\'') {
                    this.writer.write(APOS);
                }
            } else if (this.mode == XML_QUIRKS) {
                this.writer.write(NULL);
            } else {
                throw new StreamException("Invalid character 0x0 in XML stream");
            }
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void endNode() throws IOException {
        this.depth--;
        if (this.tagIsEmpty) {
            this.writer.write('/');
            this.readyForNewLine = false;
            finishTag();
            this.elementStack.popSilently();
        } else {
            finishTag();
            this.writer.write(CLOSE);
            this.writer.write((String) this.elementStack.pop());
            this.writer.write('>');
        }
        this.readyForNewLine = true;
        if (this.depth == 0) {
            this.writer.flush();
        }
    }

    public final void finishTag() throws IOException {
        if (this.tagInProgress) {
            this.writer.write('>');
        }
        this.tagInProgress = false;
        if (this.readyForNewLine) {
            endOfLine();
        }
        this.readyForNewLine = false;
        this.tagIsEmpty = false;
    }

    public void endOfLine() throws IOException {
        this.writer.write(getNewLine());
        for (int i = 0; i < this.depth; i++) {
            this.writer.write(this.lineIndenter);
        }
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void flush() throws IOException {
        this.writer.flush();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void close() throws IOException {
        this.writer.close();
    }

    public String getNewLine() {
        return this.newLine;
    }
}
