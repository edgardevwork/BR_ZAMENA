package com.thoughtworks.xstream.p042io.json;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.p042io.json.AbstractJsonWriter;
import com.thoughtworks.xstream.p042io.naming.NameCoder;
import com.thoughtworks.xstream.p042io.naming.NoNameCoder;
import java.io.IOException;
import java.io.Writer;

/* loaded from: classes7.dex */
public class JsonWriter extends AbstractJsonWriter {
    public int depth;
    public final Format format;
    public boolean newLineProposed;
    public final QuickWriter writer;

    @Override // com.thoughtworks.xstream.p042io.AbstractWriter, com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public HierarchicalStreamWriter underlyingWriter() {
        return this;
    }

    public JsonWriter(Writer writer, char[] cArr, String str) {
        this(writer, 0, new Format(cArr, str.toCharArray(), Format.SPACE_AFTER_LABEL | Format.COMPACT_EMPTY_ELEMENT));
    }

    public JsonWriter(Writer writer, char[] cArr) {
        this(writer, 0, new Format(cArr, new char[]{'\n'}, Format.SPACE_AFTER_LABEL | Format.COMPACT_EMPTY_ELEMENT));
    }

    public JsonWriter(Writer writer, String str, String str2) {
        this(writer, 0, new Format(str.toCharArray(), str2.toCharArray(), Format.SPACE_AFTER_LABEL | Format.COMPACT_EMPTY_ELEMENT));
    }

    public JsonWriter(Writer writer, String str) {
        this(writer, 0, new Format(str.toCharArray(), new char[]{'\n'}, Format.SPACE_AFTER_LABEL | Format.COMPACT_EMPTY_ELEMENT));
    }

    public JsonWriter(Writer writer) {
        this(writer, 0, new Format(new char[]{' ', ' '}, new char[]{'\n'}, Format.SPACE_AFTER_LABEL | Format.COMPACT_EMPTY_ELEMENT));
    }

    public JsonWriter(Writer writer, char[] cArr, String str, int i) {
        this(writer, i, new Format(cArr, str.toCharArray(), Format.SPACE_AFTER_LABEL | Format.COMPACT_EMPTY_ELEMENT));
    }

    public JsonWriter(Writer writer, int i) {
        this(writer, i, new Format());
    }

    public JsonWriter(Writer writer, Format format) {
        this(writer, 0, format);
    }

    public JsonWriter(Writer writer, int i, Format format) {
        this(writer, i, format, 1024);
    }

    public JsonWriter(Writer writer, int i, Format format, int i2) {
        super(i, format.getNameCoder());
        this.writer = new QuickWriter(writer, i2);
        this.format = format;
        this.depth = (i & 1) == 0 ? -1 : 0;
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void flush() throws IOException {
        this.writer.flush();
    }

    @Override // com.thoughtworks.xstream.p042io.HierarchicalStreamWriter
    public void close() throws IOException {
        this.writer.close();
    }

    @Override // com.thoughtworks.xstream.p042io.json.AbstractJsonWriter
    public void startObject() throws IOException {
        if (this.newLineProposed) {
            writeNewLine();
        }
        this.writer.write('{');
        startNewLine();
    }

    @Override // com.thoughtworks.xstream.p042io.json.AbstractJsonWriter
    public void addLabel(String str) throws IOException {
        if (this.newLineProposed) {
            writeNewLine();
        }
        this.writer.write('\"');
        writeText(str);
        this.writer.write("\":");
        if ((this.format.mode() & Format.SPACE_AFTER_LABEL) != 0) {
            this.writer.write(' ');
        }
    }

    @Override // com.thoughtworks.xstream.p042io.json.AbstractJsonWriter
    public void addValue(String str, AbstractJsonWriter.Type type) throws IOException {
        if (this.newLineProposed) {
            writeNewLine();
        }
        if (type == AbstractJsonWriter.Type.STRING) {
            this.writer.write('\"');
        }
        writeText(str);
        if (type == AbstractJsonWriter.Type.STRING) {
            this.writer.write('\"');
        }
    }

    @Override // com.thoughtworks.xstream.p042io.json.AbstractJsonWriter
    public void startArray() throws IOException {
        if (this.newLineProposed) {
            writeNewLine();
        }
        this.writer.write("[");
        startNewLine();
    }

    @Override // com.thoughtworks.xstream.p042io.json.AbstractJsonWriter
    public void nextElement() throws IOException {
        this.writer.write(",");
        writeNewLine();
    }

    @Override // com.thoughtworks.xstream.p042io.json.AbstractJsonWriter
    public void endArray() throws IOException {
        endNewLine();
        this.writer.write("]");
    }

    @Override // com.thoughtworks.xstream.p042io.json.AbstractJsonWriter
    public void endObject() throws IOException {
        endNewLine();
        this.writer.write(WebvttCssParser.RULE_END);
    }

    public final void startNewLine() {
        int i = this.depth + 1;
        this.depth = i;
        if (i > 0) {
            this.newLineProposed = true;
        }
    }

    public final void endNewLine() throws IOException {
        int i = this.depth;
        this.depth = i - 1;
        if (i > 0) {
            if ((this.format.mode() & Format.COMPACT_EMPTY_ELEMENT) != 0 && this.newLineProposed) {
                this.newLineProposed = false;
            } else {
                writeNewLine();
            }
        }
    }

    public final void writeNewLine() throws IOException {
        int i = this.depth;
        this.writer.write(this.format.getNewLine());
        while (true) {
            int i2 = i - 1;
            if (i > 0) {
                this.writer.write(this.format.getLineIndenter());
                i = i2;
            } else {
                this.newLineProposed = false;
                return;
            }
        }
    }

    public final void writeText(String str) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\f') {
                if (cCharAt != '\r') {
                    if (cCharAt != '\"') {
                        if (cCharAt == '\\') {
                            this.writer.write("\\\\");
                        } else {
                            switch (cCharAt) {
                                case '\b':
                                    this.writer.write("\\b");
                                    break;
                                case '\t':
                                    this.writer.write("\\t");
                                    break;
                                case '\n':
                                    this.writer.write("\\n");
                                    break;
                                default:
                                    if (cCharAt > 31) {
                                        this.writer.write(cCharAt);
                                        break;
                                    } else {
                                        this.writer.write("\\u");
                                        StringBuffer stringBuffer = new StringBuffer();
                                        stringBuffer.append("000");
                                        stringBuffer.append(Integer.toHexString(cCharAt));
                                        this.writer.write(stringBuffer.toString().substring(r2.length() - 4));
                                        break;
                                    }
                            }
                        }
                    } else {
                        this.writer.write("\\\"");
                    }
                } else {
                    this.writer.write("\\r");
                }
            } else {
                this.writer.write("\\f");
            }
        }
    }

    /* loaded from: classes5.dex */
    public static class Format {
        public static int COMPACT_EMPTY_ELEMENT = 2;
        public static int SPACE_AFTER_LABEL = 1;
        public char[] lineIndenter;
        public final int mode;
        public final NameCoder nameCoder;
        public char[] newLine;

        public Format() {
            this(new char[]{' ', ' '}, new char[]{'\n'}, SPACE_AFTER_LABEL | COMPACT_EMPTY_ELEMENT);
        }

        public Format(char[] cArr, char[] cArr2, int i) {
            this(cArr, cArr2, i, new NoNameCoder());
        }

        public Format(char[] cArr, char[] cArr2, int i, NameCoder nameCoder) {
            this.lineIndenter = cArr;
            this.newLine = cArr2;
            this.mode = i;
            this.nameCoder = nameCoder;
        }

        public char[] getLineIndenter() {
            return this.lineIndenter;
        }

        public char[] getNewLine() {
            return this.newLine;
        }

        public int mode() {
            return this.mode;
        }

        public NameCoder getNameCoder() {
            return this.nameCoder;
        }
    }
}
