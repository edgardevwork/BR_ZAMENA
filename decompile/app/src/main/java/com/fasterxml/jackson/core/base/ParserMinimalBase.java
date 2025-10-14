package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.exc.InputCoercionException;
import com.fasterxml.jackson.core.p022io.JsonEOFException;
import com.fasterxml.jackson.core.p022io.NumberInput;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.VersionUtil;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

/* loaded from: classes6.dex */
public abstract class ParserMinimalBase extends JsonParser {
    public static final BigDecimal BD_MAX_INT;
    public static final BigDecimal BD_MAX_LONG;
    public static final BigDecimal BD_MIN_INT;
    public static final BigDecimal BD_MIN_LONG;
    public static final BigInteger BI_MAX_INT;
    public static final BigInteger BI_MAX_LONG;
    public static final BigInteger BI_MIN_INT;
    public static final BigInteger BI_MIN_LONG;
    public static final char CHAR_NULL = 0;
    public static final int INT_0 = 48;
    public static final int INT_9 = 57;
    public static final int INT_APOS = 39;
    public static final int INT_ASTERISK = 42;
    public static final int INT_BACKSLASH = 92;
    public static final int INT_COLON = 58;
    public static final int INT_COMMA = 44;
    public static final int INT_CR = 13;
    public static final int INT_E = 69;
    public static final int INT_HASH = 35;
    public static final int INT_LBRACKET = 91;
    public static final int INT_LCURLY = 123;
    public static final int INT_LF = 10;
    public static final int INT_MINUS = 45;
    public static final int INT_PERIOD = 46;
    public static final int INT_PLUS = 43;
    public static final int INT_QUOTE = 34;
    public static final int INT_RBRACKET = 93;
    public static final int INT_RCURLY = 125;
    public static final int INT_SLASH = 47;
    public static final int INT_SPACE = 32;
    public static final int INT_TAB = 9;
    public static final int INT_e = 101;
    public static final int MAX_ERROR_TOKEN_LENGTH = 256;
    public static final double MAX_INT_D = 2.147483647E9d;
    public static final long MAX_INT_L = 2147483647L;
    public static final double MAX_LONG_D = 9.223372036854776E18d;
    public static final double MIN_INT_D = -2.147483648E9d;
    public static final long MIN_INT_L = -2147483648L;
    public static final double MIN_LONG_D = -9.223372036854776E18d;
    public static final byte[] NO_BYTES = new byte[0];
    public static final int[] NO_INTS = new int[0];
    public static final int NR_BIGDECIMAL = 16;
    public static final int NR_BIGINT = 4;
    public static final int NR_DOUBLE = 8;
    public static final int NR_FLOAT = 32;
    public static final int NR_INT = 1;
    public static final int NR_LONG = 2;
    public static final int NR_UNKNOWN = 0;
    public JsonToken _currToken;
    public JsonToken _lastClearedToken;

    public abstract void _handleEOF() throws JsonParseException;

    @Override // com.fasterxml.jackson.core.JsonParser, java.io.Closeable, java.lang.AutoCloseable
    public abstract void close() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract byte[] getBinaryValue(Base64Variant base64Variant) throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String getCurrentName() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonStreamContext getParsingContext();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract String getText() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract char[] getTextCharacters() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int getTextLength() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int getTextOffset() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract boolean hasTextCharacters();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract boolean isClosed();

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract JsonToken nextToken() throws IOException;

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract void overrideCurrentName(String str);

    static {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(MIN_INT_L);
        BI_MIN_INT = bigIntegerValueOf;
        BigInteger bigIntegerValueOf2 = BigInteger.valueOf(MAX_INT_L);
        BI_MAX_INT = bigIntegerValueOf2;
        BigInteger bigIntegerValueOf3 = BigInteger.valueOf(Long.MIN_VALUE);
        BI_MIN_LONG = bigIntegerValueOf3;
        BigInteger bigIntegerValueOf4 = BigInteger.valueOf(Long.MAX_VALUE);
        BI_MAX_LONG = bigIntegerValueOf4;
        BD_MIN_LONG = new BigDecimal(bigIntegerValueOf3);
        BD_MAX_LONG = new BigDecimal(bigIntegerValueOf4);
        BD_MIN_INT = new BigDecimal(bigIntegerValueOf);
        BD_MAX_INT = new BigDecimal(bigIntegerValueOf2);
    }

    public ParserMinimalBase() {
    }

    public ParserMinimalBase(int i) {
        super(i);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken currentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int currentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m1012id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getCurrentToken() {
        return this._currToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    @Deprecated
    public int getCurrentTokenId() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        return jsonToken.m1012id();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasCurrentToken() {
        return this._currToken != null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasTokenId(int i) {
        JsonToken jsonToken = this._currToken;
        return jsonToken == null ? i == 0 : jsonToken.m1012id() == i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean hasToken(JsonToken jsonToken) {
        return this._currToken == jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartArrayToken() {
        return this._currToken == JsonToken.START_ARRAY;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedStartObjectToken() {
        return this._currToken == JsonToken.START_OBJECT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean isExpectedNumberIntToken() {
        return this._currToken == JsonToken.VALUE_NUMBER_INT;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken nextValue() throws IOException {
        JsonToken jsonTokenNextToken = nextToken();
        return jsonTokenNextToken == JsonToken.FIELD_NAME ? nextToken() : jsonTokenNextToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonParser skipChildren() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.START_OBJECT && jsonToken != JsonToken.START_ARRAY) {
            return this;
        }
        int i = 1;
        while (true) {
            JsonToken jsonTokenNextToken = nextToken();
            if (jsonTokenNextToken == null) {
                _handleEOF();
                return this;
            }
            if (jsonTokenNextToken.isStructStart()) {
                i++;
            } else if (jsonTokenNextToken.isStructEnd()) {
                i--;
                if (i == 0) {
                    return this;
                }
            } else if (jsonTokenNextToken == JsonToken.NOT_AVAILABLE) {
                _reportError("Not enough content available for `skipChildren()`: non-blocking parser? (%s)", getClass().getName());
            }
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void clearCurrentToken() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            this._lastClearedToken = jsonToken;
            this._currToken = null;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JsonToken getLastClearedToken() {
        return this._lastClearedToken;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean getValueAsBoolean(boolean z) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            switch (jsonToken.m1012id()) {
                case 6:
                    String strTrim = getText().trim();
                    if ("true".equals(strTrim)) {
                        return true;
                    }
                    if ("false".equals(strTrim) || _hasTextualNull(strTrim)) {
                        return false;
                    }
                    break;
                case 7:
                    return getIntValue() != 0;
                case 9:
                    return true;
                case 10:
                case 11:
                    return false;
                case 12:
                    Object embeddedObject = getEmbeddedObject();
                    if (embeddedObject instanceof Boolean) {
                        return ((Boolean) embeddedObject).booleanValue();
                    }
                    break;
            }
        }
        return z;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        return getValueAsInt(0);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getIntValue();
        }
        if (jsonToken == null) {
            return i;
        }
        int iM1012id = jsonToken.m1012id();
        if (iM1012id == 6) {
            String text = getText();
            if (_hasTextualNull(text)) {
                return 0;
            }
            return NumberInput.parseAsInt(text, i);
        }
        switch (iM1012id) {
            case 9:
                return 1;
            case 10:
            case 11:
                return 0;
            case 12:
                Object embeddedObject = getEmbeddedObject();
                return embeddedObject instanceof Number ? ((Number) embeddedObject).intValue() : i;
            default:
                return i;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        return getValueAsLong(0L);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long getValueAsLong(long j) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            return getLongValue();
        }
        if (jsonToken == null) {
            return j;
        }
        int iM1012id = jsonToken.m1012id();
        if (iM1012id == 6) {
            String text = getText();
            if (_hasTextualNull(text)) {
                return 0L;
            }
            return NumberInput.parseAsLong(text, j);
        }
        switch (iM1012id) {
            case 9:
                return 1L;
            case 10:
            case 11:
                return 0L;
            case 12:
                Object embeddedObject = getEmbeddedObject();
                return embeddedObject instanceof Number ? ((Number) embeddedObject).longValue() : j;
            default:
                return j;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public double getValueAsDouble(double d) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return d;
        }
        switch (jsonToken.m1012id()) {
            case 6:
                String text = getText();
                if (_hasTextualNull(text)) {
                    return 0.0d;
                }
                return NumberInput.parseAsDouble(text, d);
            case 7:
            case 8:
                return getDoubleValue();
            case 9:
                return 1.0d;
            case 10:
            case 11:
                return 0.0d;
            case 12:
                Object embeddedObject = getEmbeddedObject();
                return embeddedObject instanceof Number ? ((Number) embeddedObject).doubleValue() : d;
            default:
                return d;
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        return getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return getText();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return (jsonToken == null || jsonToken == JsonToken.VALUE_NULL || !jsonToken.isScalarValue()) ? str : getText();
    }

    public void _decodeBase64(String str, ByteArrayBuilder byteArrayBuilder, Base64Variant base64Variant) throws IOException {
        try {
            base64Variant.decode(str, byteArrayBuilder);
        } catch (IllegalArgumentException e) {
            _reportError(e.getMessage());
        }
    }

    public boolean _hasTextualNull(String str) {
        return "null".equals(str);
    }

    public <T> T _reportUnexpectedNumberChar(int i, String str) throws JsonParseException {
        String str2 = String.format("Unexpected character (%s) in numeric value", _getCharDesc(i));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
        return null;
    }

    @Deprecated
    public void reportUnexpectedNumberChar(int i, String str) throws JsonParseException {
        _reportUnexpectedNumberChar(i, str);
    }

    public void reportInvalidNumber(String str) throws JsonParseException {
        _reportError("Invalid numeric value: " + str);
    }

    public void reportOverflowInt() throws IOException {
        reportOverflowInt(getText());
    }

    public void reportOverflowInt(String str) throws IOException {
        reportOverflowInt(str, currentToken());
    }

    public void reportOverflowInt(String str, JsonToken jsonToken) throws IOException {
        _reportInputCoercion(String.format("Numeric value (%s) out of range of int (%d - %s)", _longIntegerDesc(str), Integer.MIN_VALUE, Integer.MAX_VALUE), jsonToken, Integer.TYPE);
    }

    public void reportOverflowLong() throws IOException {
        reportOverflowLong(getText());
    }

    public void reportOverflowLong(String str) throws IOException {
        reportOverflowLong(str, currentToken());
    }

    public void reportOverflowLong(String str, JsonToken jsonToken) throws IOException {
        _reportInputCoercion(String.format("Numeric value (%s) out of range of long (%d - %s)", _longIntegerDesc(str), Long.MIN_VALUE, Long.MAX_VALUE), jsonToken, Long.TYPE);
    }

    public void _reportInputCoercion(String str, JsonToken jsonToken, Class<?> cls) throws InputCoercionException {
        throw new InputCoercionException(this, str, jsonToken, cls);
    }

    public String _longIntegerDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[Integer with %d digits]", Integer.valueOf(length));
    }

    public String _longNumberDesc(String str) {
        int length = str.length();
        if (length < 1000) {
            return str;
        }
        if (str.startsWith("-")) {
            length--;
        }
        return String.format("[number with %d characters]", Integer.valueOf(length));
    }

    public void _reportUnexpectedChar(int i, String str) throws JsonParseException {
        if (i < 0) {
            _reportInvalidEOF();
        }
        String str2 = String.format("Unexpected character (%s)", _getCharDesc(i));
        if (str != null) {
            str2 = str2 + ": " + str;
        }
        _reportError(str2);
    }

    public void _reportInvalidEOF() throws JsonParseException {
        _reportInvalidEOF(" in " + this._currToken, this._currToken);
    }

    public void _reportInvalidEOFInValue(JsonToken jsonToken) throws JsonParseException {
        String str;
        if (jsonToken == JsonToken.VALUE_STRING) {
            str = " in a String value";
        } else if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            str = " in a Number value";
        } else {
            str = " in a value";
        }
        _reportInvalidEOF(str, jsonToken);
    }

    public void _reportInvalidEOF(String str, JsonToken jsonToken) throws JsonParseException {
        throw new JsonEOFException(this, jsonToken, "Unexpected end-of-input" + str);
    }

    @Deprecated
    public void _reportInvalidEOFInValue() throws JsonParseException {
        _reportInvalidEOF(" in a value");
    }

    @Deprecated
    public void _reportInvalidEOF(String str) throws JsonParseException {
        throw new JsonEOFException(this, null, "Unexpected end-of-input" + str);
    }

    public void _reportMissingRootWS(int i) throws JsonParseException {
        _reportUnexpectedChar(i, "Expected space separating root-level values");
    }

    public void _throwInvalidSpace(int i) throws JsonParseException {
        _reportError("Illegal character (" + _getCharDesc((char) i) + "): only regular white space (\\r, \\n, \\t) is allowed between tokens");
    }

    public static final String _getCharDesc(int i) {
        char c = (char) i;
        if (Character.isISOControl(c)) {
            return "(CTRL-CHAR, code " + i + ")";
        }
        if (i > 255) {
            return "'" + c + "' (code " + i + " / 0x" + Integer.toHexString(i) + ")";
        }
        return "'" + c + "' (code " + i + ")";
    }

    public final void _reportError(String str) throws JsonParseException {
        throw _constructError(str);
    }

    public final void _reportError(String str, Object obj) throws JsonParseException {
        throw _constructError(String.format(str, obj));
    }

    public final void _reportError(String str, Object obj, Object obj2) throws JsonParseException {
        throw _constructError(String.format(str, obj, obj2));
    }

    public final void _wrapError(String str, Throwable th) throws JsonParseException {
        throw _constructError(str, th);
    }

    public final void _throwInternal() {
        VersionUtil.throwInternal();
    }

    public final JsonParseException _constructError(String str, Throwable th) {
        return new JsonParseException(this, str, th);
    }

    @Deprecated
    public static byte[] _asciiBytes(String str) {
        byte[] bArr = new byte[str.length()];
        int length = str.length();
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    @Deprecated
    public static String _ascii(byte[] bArr) {
        try {
            return new String(bArr, "US-ASCII");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
