package com.fasterxml.jackson.core.format;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.format.InputAccessor;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes8.dex */
public class DataFormatDetector {
    public static final int DEFAULT_MAX_INPUT_LOOKAHEAD = 64;
    public final JsonFactory[] _detectors;
    public final int _maxInputLookahead;
    public final MatchStrength _minimalMatch;
    public final MatchStrength _optimalMatch;

    public DataFormatDetector(JsonFactory... jsonFactoryArr) {
        this(jsonFactoryArr, MatchStrength.SOLID_MATCH, MatchStrength.WEAK_MATCH, 64);
    }

    public DataFormatDetector(Collection<JsonFactory> collection) {
        this((JsonFactory[]) collection.toArray(new JsonFactory[0]));
    }

    public DataFormatDetector(JsonFactory[] jsonFactoryArr, MatchStrength matchStrength, MatchStrength matchStrength2, int i) {
        this._detectors = jsonFactoryArr;
        this._optimalMatch = matchStrength;
        this._minimalMatch = matchStrength2;
        this._maxInputLookahead = i;
    }

    public DataFormatDetector withOptimalMatch(MatchStrength matchStrength) {
        return matchStrength == this._optimalMatch ? this : new DataFormatDetector(this._detectors, matchStrength, this._minimalMatch, this._maxInputLookahead);
    }

    public DataFormatDetector withMinimalMatch(MatchStrength matchStrength) {
        return matchStrength == this._minimalMatch ? this : new DataFormatDetector(this._detectors, this._optimalMatch, matchStrength, this._maxInputLookahead);
    }

    public DataFormatDetector withMaxInputLookahead(int i) {
        return i == this._maxInputLookahead ? this : new DataFormatDetector(this._detectors, this._optimalMatch, this._minimalMatch, i);
    }

    public DataFormatMatcher findFormat(InputStream inputStream) throws IOException {
        return _findFormat(new InputAccessor.Std(inputStream, new byte[this._maxInputLookahead]));
    }

    public DataFormatMatcher findFormat(byte[] bArr) throws IOException {
        return _findFormat(new InputAccessor.Std(bArr));
    }

    public DataFormatMatcher findFormat(byte[] bArr, int i, int i2) throws IOException {
        return _findFormat(new InputAccessor.Std(bArr, i, i2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractJsonLexerKt.BEGIN_LIST);
        JsonFactory[] jsonFactoryArr = this._detectors;
        int length = jsonFactoryArr.length;
        if (length > 0) {
            sb.append(jsonFactoryArr[0].getFormatName());
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(this._detectors[i].getFormatName());
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public final DataFormatMatcher _findFormat(InputAccessor.Std std) throws IOException {
        JsonFactory[] jsonFactoryArr = this._detectors;
        int length = jsonFactoryArr.length;
        JsonFactory jsonFactory = null;
        int i = 0;
        MatchStrength matchStrength = null;
        while (true) {
            if (i >= length) {
                break;
            }
            JsonFactory jsonFactory2 = jsonFactoryArr[i];
            std.reset();
            MatchStrength matchStrengthHasFormat = jsonFactory2.hasFormat(std);
            if (matchStrengthHasFormat != null && matchStrengthHasFormat.ordinal() >= this._minimalMatch.ordinal() && (jsonFactory == null || matchStrength.ordinal() < matchStrengthHasFormat.ordinal())) {
                if (matchStrengthHasFormat.ordinal() >= this._optimalMatch.ordinal()) {
                    jsonFactory = jsonFactory2;
                    matchStrength = matchStrengthHasFormat;
                    break;
                }
                jsonFactory = jsonFactory2;
                matchStrength = matchStrengthHasFormat;
            }
            i++;
        }
        return std.createMatcher(jsonFactory, matchStrength);
    }
}
