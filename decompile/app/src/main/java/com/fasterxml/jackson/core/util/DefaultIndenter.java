package com.fasterxml.jackson.core.util;

import com.bumptech.glide.load.engine.GlideException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes6.dex */
public class DefaultIndenter extends DefaultPrettyPrinter.NopIndenter {
    public static final int INDENT_LEVELS = 16;
    public static final DefaultIndenter SYSTEM_LINEFEED_INSTANCE;
    public static final String SYS_LF;
    public static final long serialVersionUID = 1;
    public final int charsPerLevel;
    public final String eol;
    public final char[] indents;

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public boolean isInline() {
        return false;
    }

    static {
        String property;
        try {
            property = System.getProperty("line.separator");
        } catch (Throwable unused) {
            property = StringUtils.f9903LF;
        }
        SYS_LF = property;
        SYSTEM_LINEFEED_INSTANCE = new DefaultIndenter(GlideException.IndentedAppendable.INDENT, property);
    }

    public DefaultIndenter() {
        this(GlideException.IndentedAppendable.INDENT, SYS_LF);
    }

    public DefaultIndenter(String str, String str2) {
        this.charsPerLevel = str.length();
        this.indents = new char[str.length() * 16];
        int length = 0;
        for (int i = 0; i < 16; i++) {
            str.getChars(0, str.length(), this.indents, length);
            length += str.length();
        }
        this.eol = str2;
    }

    public DefaultIndenter withLinefeed(String str) {
        return str.equals(this.eol) ? this : new DefaultIndenter(getIndent(), str);
    }

    public DefaultIndenter withIndent(String str) {
        return str.equals(getIndent()) ? this : new DefaultIndenter(str, this.eol);
    }

    @Override // com.fasterxml.jackson.core.util.DefaultPrettyPrinter.NopIndenter, com.fasterxml.jackson.core.util.DefaultPrettyPrinter.Indenter
    public void writeIndentation(JsonGenerator jsonGenerator, int i) throws IOException {
        jsonGenerator.writeRaw(this.eol);
        if (i <= 0) {
            return;
        }
        int length = i * this.charsPerLevel;
        while (true) {
            char[] cArr = this.indents;
            if (length > cArr.length) {
                jsonGenerator.writeRaw(cArr, 0, cArr.length);
                length -= this.indents.length;
            } else {
                jsonGenerator.writeRaw(cArr, 0, length);
                return;
            }
        }
    }

    public String getEol() {
        return this.eol;
    }

    public String getIndent() {
        return new String(this.indents, 0, this.charsPerLevel);
    }
}
