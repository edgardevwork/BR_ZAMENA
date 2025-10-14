package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.p022io.MergedStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes8.dex */
public class DataFormatMatcher {
    public final byte[] _bufferedData;
    public final int _bufferedLength;
    public final int _bufferedStart;
    public final JsonFactory _match;
    public final MatchStrength _matchStrength;
    public final InputStream _originalStream;

    public DataFormatMatcher(InputStream inputStream, byte[] bArr, int i, int i2, JsonFactory jsonFactory, MatchStrength matchStrength) {
        this._originalStream = inputStream;
        this._bufferedData = bArr;
        this._bufferedStart = i;
        this._bufferedLength = i2;
        this._match = jsonFactory;
        this._matchStrength = matchStrength;
        if ((i | i2) < 0 || i + i2 > bArr.length) {
            throw new IllegalArgumentException(String.format("Illegal start/length (%d/%d) wrt input array of %d bytes", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(bArr.length)));
        }
    }

    public boolean hasMatch() {
        return this._match != null;
    }

    public MatchStrength getMatchStrength() {
        MatchStrength matchStrength = this._matchStrength;
        return matchStrength == null ? MatchStrength.INCONCLUSIVE : matchStrength;
    }

    public JsonFactory getMatch() {
        return this._match;
    }

    public String getMatchedFormatName() {
        if (hasMatch()) {
            return getMatch().getFormatName();
        }
        return null;
    }

    public JsonParser createParserWithMatch() throws IOException {
        JsonFactory jsonFactory = this._match;
        if (jsonFactory == null) {
            return null;
        }
        if (this._originalStream == null) {
            return jsonFactory.createParser(this._bufferedData, this._bufferedStart, this._bufferedLength);
        }
        return jsonFactory.createParser(getDataStream());
    }

    public InputStream getDataStream() {
        if (this._originalStream == null) {
            return new ByteArrayInputStream(this._bufferedData, this._bufferedStart, this._bufferedLength);
        }
        return new MergedStream(null, this._originalStream, this._bufferedData, this._bufferedStart, this._bufferedLength);
    }
}
