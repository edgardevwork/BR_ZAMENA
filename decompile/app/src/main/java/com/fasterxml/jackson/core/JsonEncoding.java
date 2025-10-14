package com.fasterxml.jackson.core;

import org.apache.commons.p059io.input.XmlStreamReader;

/* loaded from: classes2.dex */
public enum JsonEncoding {
    UTF8("UTF-8", false, 8),
    UTF16_BE("UTF-16BE", true, 16),
    UTF16_LE("UTF-16LE", false, 16),
    UTF32_BE(XmlStreamReader.UTF_32BE, true, 32),
    UTF32_LE(XmlStreamReader.UTF_32LE, false, 32);

    public final boolean _bigEndian;
    public final int _bits;
    public final String _javaName;

    JsonEncoding(String str, boolean z, int i) {
        this._javaName = str;
        this._bigEndian = z;
        this._bits = i;
    }

    public String getJavaName() {
        return this._javaName;
    }

    public boolean isBigEndian() {
        return this._bigEndian;
    }

    public int bits() {
        return this._bits;
    }
}
