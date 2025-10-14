package org.apache.commons.p059io;

import java.nio.charset.Charset;
import java.util.Objects;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public enum StandardLineSeparator {
    CR("\r"),
    CRLF("\r\n"),
    LF(StringUtils.f9903LF);

    public final String lineSeparator;

    StandardLineSeparator(String str) {
        Objects.requireNonNull(str, "lineSeparator");
        this.lineSeparator = str;
    }

    public byte[] getBytes(Charset charset) {
        return this.lineSeparator.getBytes(charset);
    }

    public String getString() {
        return this.lineSeparator;
    }
}
