package com.fasterxml.jackson.core.json.async;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.json.JsonReadContext;
import com.fasterxml.jackson.core.p022io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;

/* loaded from: classes6.dex */
public abstract class NonBlockingJsonParserBase extends ParserBase {
    public static final int MAJOR_ARRAY_ELEMENT_FIRST = 5;
    public static final int MAJOR_ARRAY_ELEMENT_NEXT = 6;
    public static final int MAJOR_CLOSED = 7;
    public static final int MAJOR_INITIAL = 0;
    public static final int MAJOR_OBJECT_FIELD_FIRST = 2;
    public static final int MAJOR_OBJECT_FIELD_NEXT = 3;
    public static final int MAJOR_OBJECT_VALUE = 4;
    public static final int MAJOR_ROOT = 1;
    public static final int MINOR_COMMENT_C = 53;
    public static final int MINOR_COMMENT_CLOSING_ASTERISK = 52;
    public static final int MINOR_COMMENT_CPP = 54;
    public static final int MINOR_COMMENT_LEADING_SLASH = 51;
    public static final int MINOR_COMMENT_YAML = 55;
    public static final int MINOR_FIELD_APOS_NAME = 9;
    public static final int MINOR_FIELD_LEADING_COMMA = 5;
    public static final int MINOR_FIELD_LEADING_WS = 4;
    public static final int MINOR_FIELD_NAME = 7;
    public static final int MINOR_FIELD_NAME_ESCAPE = 8;
    public static final int MINOR_FIELD_UNQUOTED_NAME = 10;
    public static final int MINOR_NUMBER_EXPONENT_DIGITS = 32;
    public static final int MINOR_NUMBER_EXPONENT_MARKER = 31;
    public static final int MINOR_NUMBER_FRACTION_DIGITS = 30;
    public static final int MINOR_NUMBER_INTEGER_DIGITS = 26;
    public static final int MINOR_NUMBER_MINUS = 23;
    public static final int MINOR_NUMBER_MINUSZERO = 25;
    public static final int MINOR_NUMBER_PLUS = 22;
    public static final int MINOR_NUMBER_ZERO = 24;
    public static final int MINOR_ROOT_BOM = 1;
    public static final int MINOR_ROOT_GOT_SEPARATOR = 3;
    public static final int MINOR_ROOT_NEED_SEPARATOR = 2;
    public static final int MINOR_VALUE_APOS_STRING = 45;
    public static final int MINOR_VALUE_EXPECTING_COLON = 14;
    public static final int MINOR_VALUE_EXPECTING_COMMA = 13;
    public static final int MINOR_VALUE_LEADING_WS = 12;
    public static final int MINOR_VALUE_STRING = 40;
    public static final int MINOR_VALUE_STRING_ESCAPE = 41;
    public static final int MINOR_VALUE_STRING_UTF8_2 = 42;
    public static final int MINOR_VALUE_STRING_UTF8_3 = 43;
    public static final int MINOR_VALUE_STRING_UTF8_4 = 44;
    public static final int MINOR_VALUE_TOKEN_ERROR = 50;
    public static final int MINOR_VALUE_TOKEN_FALSE = 18;
    public static final int MINOR_VALUE_TOKEN_NON_STD = 19;
    public static final int MINOR_VALUE_TOKEN_NULL = 16;
    public static final int MINOR_VALUE_TOKEN_TRUE = 17;
    public static final int MINOR_VALUE_WS_AFTER_COMMA = 15;
    public static final int NON_STD_TOKEN_INFINITY = 1;
    public static final int NON_STD_TOKEN_MINUS_INFINITY = 3;
    public static final int NON_STD_TOKEN_NAN = 0;
    public static final int NON_STD_TOKEN_PLUS_INFINITY = 2;
    public int _currBufferStart;
    public int _currInputRowAlt;
    public boolean _endOfInput;
    public int _majorState;
    public int _majorStateAfterValue;
    public int _minorState;
    public int _minorStateAfterSplit;
    public int _nonStdTokenType;
    public int _pending32;
    public int _pendingBytes;
    public int _quad1;
    public int[] _quadBuffer;
    public int _quadLength;
    public int _quoted32;
    public int _quotedDigits;
    public final ByteQuadsCanonicalizer _symbols;
    public static final String[] NON_STD_TOKENS = {"NaN", "Infinity", "+Infinity", "-Infinity"};
    public static final double[] NON_STD_TOKEN_VALUES = {Double.NaN, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY, Double.NEGATIVE_INFINITY};

    public static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean canParseAsync() {
        return true;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public abstract int releaseBuffered(OutputStream outputStream) throws IOException;

    public NonBlockingJsonParserBase(IOContext iOContext, int i, ByteQuadsCanonicalizer byteQuadsCanonicalizer) {
        super(iOContext, i);
        this._quadBuffer = new int[8];
        this._endOfInput = false;
        this._currBufferStart = 0;
        this._currInputRowAlt = 1;
        this._symbols = byteQuadsCanonicalizer;
        this._currToken = null;
        this._majorState = 0;
        this._majorStateAfterValue = 1;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        throw new UnsupportedOperationException("Can not use ObjectMapper with non-blocking parser");
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return ParserBase.JSON_READ_CAPABILITIES;
    }

    public ByteQuadsCanonicalizer symbolTableForTests() {
        return this._symbols;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        super._releaseBuffers();
        this._symbols.release();
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        this._currBufferStart = 0;
        this._inputEnd = 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public boolean hasTextCharacters() {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.hasTextAsCharacters();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return this._nameCopied;
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_contentReference(), this._currInputProcessed + (this._inputPtr - this._currBufferStart), -1L, Math.max(this._currInputRow, this._currInputRowAlt), (this._inputPtr - this._currInputRowStart) + 1);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        return new JsonLocation(_contentReference(), this._tokenInputTotal, -1L, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        return _getText2(jsonToken);
    }

    public final String _getText2(JsonToken jsonToken) {
        int iM1012id;
        if (jsonToken == null || (iM1012id = jsonToken.m1012id()) == -1) {
            return null;
        }
        if (iM1012id == 5) {
            return this._parsingContext.getCurrentName();
        }
        if (iM1012id == 6 || iM1012id == 7 || iM1012id == 8) {
            return this._textBuffer.contentsAsString();
        }
        return jsonToken.asString();
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            String currentName = this._parsingContext.getCurrentName();
            writer.write(currentName);
            return currentName.length();
        }
        if (jsonToken == null) {
            return 0;
        }
        if (jsonToken.isNumeric()) {
            return this._textBuffer.contentsToWriter(writer);
        }
        if (jsonToken == JsonToken.NOT_AVAILABLE) {
            _reportError("Current token not available: can not call this method");
        }
        char[] cArrAsCharArray = jsonToken.asCharArray();
        writer.write(cArrAsCharArray);
        return cArrAsCharArray.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int iM1012id = jsonToken.m1012id();
        if (iM1012id != 5) {
            if (iM1012id == 6 || iM1012id == 7 || iM1012id == 8) {
                return this._textBuffer.getTextBuffer();
            }
            return this._currToken.asCharArray();
        }
        if (!this._nameCopied) {
            String currentName = this._parsingContext.getCurrentName();
            int length = currentName.length();
            char[] cArr = this._nameCopyBuffer;
            if (cArr == null) {
                this._nameCopyBuffer = this._ioContext.allocNameCopyBuffer(length);
            } else if (cArr.length < length) {
                this._nameCopyBuffer = new char[length];
            }
            currentName.getChars(0, length, this._nameCopyBuffer, 0);
            this._nameCopied = true;
        }
        return this._nameCopyBuffer;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextLength() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iM1012id = jsonToken.m1012id();
        if (iM1012id == 5) {
            return this._parsingContext.getCurrentName().length();
        }
        if (iM1012id == 6 || iM1012id == 7 || iM1012id == 8) {
            return this._textBuffer.size();
        }
        return this._currToken.asCharArray().length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getTextOffset() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return 0;
        }
        int iM1012id = jsonToken.m1012id();
        if (iM1012id == 6 || iM1012id == 7 || iM1012id == 8) {
            return this._textBuffer.getTextOffset();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING) {
            _reportError("Current token (%s) not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary", jsonToken);
        }
        if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        byte[] binaryValue = getBinaryValue(base64Variant);
        outputStream.write(binaryValue);
        return binaryValue.length;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getEmbeddedObject() throws IOException {
        if (this._currToken == JsonToken.VALUE_EMBEDDED_OBJECT) {
            return this._binaryValue;
        }
        return null;
    }

    public final JsonToken _startArrayScope() throws IOException {
        this._parsingContext = this._parsingContext.createChildArrayContext(-1, -1);
        this._majorState = 5;
        this._majorStateAfterValue = 6;
        JsonToken jsonToken = JsonToken.START_ARRAY;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _startObjectScope() throws IOException {
        this._parsingContext = this._parsingContext.createChildObjectContext(-1, -1);
        this._majorState = 2;
        this._majorStateAfterValue = 3;
        JsonToken jsonToken = JsonToken.START_OBJECT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _closeArrayScope() throws IOException {
        int i;
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        if (parent.inObject()) {
            i = 3;
        } else {
            i = parent.inArray() ? 6 : 1;
        }
        this._majorState = i;
        this._majorStateAfterValue = i;
        JsonToken jsonToken = JsonToken.END_ARRAY;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _closeObjectScope() throws IOException {
        int i;
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, AbstractJsonLexerKt.END_LIST);
        }
        JsonReadContext parent = this._parsingContext.getParent();
        this._parsingContext = parent;
        if (parent.inObject()) {
            i = 3;
        } else {
            i = parent.inArray() ? 6 : 1;
        }
        this._majorState = i;
        this._majorStateAfterValue = i;
        JsonToken jsonToken = JsonToken.END_OBJECT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final String _findName(int i, int i2) throws JsonParseException {
        int i_padLastQuad = _padLastQuad(i, i2);
        String strFindName = this._symbols.findName(i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i_padLastQuad;
        return _addName(iArr, 1, i2);
    }

    public final String _findName(int i, int i2, int i3) throws JsonParseException {
        int i_padLastQuad = _padLastQuad(i2, i3);
        String strFindName = this._symbols.findName(i, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i_padLastQuad;
        return _addName(iArr, 2, i3);
    }

    public final String _findName(int i, int i2, int i3, int i4) throws JsonParseException {
        int i_padLastQuad = _padLastQuad(i3, i4);
        String strFindName = this._symbols.findName(i, i2, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(i_padLastQuad, i4);
        return _addName(iArr, 3, i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00b9 A[PHI: r5 r14
  0x00b9: PHI (r5v17 int) = (r5v16 int), (r5v28 int) binds: [B:85:0x0082, B:94:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r14v6 int) = (r14v5 int), (r14v15 int) binds: [B:85:0x0082, B:94:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String _addName(int[] iArr, int i, int i2) throws JsonParseException {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = ((i << 2) - 4) + i2;
        if (i2 < 4) {
            int i9 = i - 1;
            i3 = iArr[i9];
            iArr[i9] = i3 << ((4 - i2) << 3);
        } else {
            i3 = 0;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i10 = 0;
        int i11 = 0;
        while (i10 < i8) {
            int i12 = iArr[i10 >> 2] >> ((3 - (i10 & 3)) << 3);
            int i13 = i12 & 255;
            int i14 = i10 + 1;
            if (i13 > 127) {
                if ((i12 & 224) == 192) {
                    i4 = i12 & 31;
                } else {
                    if ((i12 & 240) == 224) {
                        i4 = i12 & 15;
                        i5 = 2;
                    } else if ((i12 & SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER) == 240) {
                        i4 = i12 & 7;
                        i5 = 3;
                    } else {
                        _reportInvalidInitial(i13);
                        i4 = 1;
                    }
                    if (i14 + i5 > i8) {
                        _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
                    }
                    i6 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                    i14 = i10 + 2;
                    if ((i6 & 192) != 128) {
                        _reportInvalidOther(i6);
                    }
                    int i15 = (i4 << 6) | (i6 & 63);
                    if (i5 <= 1) {
                        int i16 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                        i14 = i10 + 3;
                        if ((i16 & 192) != 128) {
                            _reportInvalidOther(i16);
                        }
                        int i17 = (i15 << 6) | (i16 & 63);
                        if (i5 > 2) {
                            int i18 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                            i14 = i10 + 4;
                            if ((i18 & 192) != 128) {
                                _reportInvalidOther(i18 & 255);
                            }
                            i15 = (i17 << 6) | (i18 & 63);
                            i13 = i15;
                            i7 = 2;
                            if (i5 > i7) {
                                int i19 = i13 - 65536;
                                if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                                    cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
                                }
                                cArrEmptyAndGetCurrentSegment[i11] = (char) ((i19 >> 10) + 55296);
                                i13 = (i19 & 1023) | 56320;
                                i11++;
                            }
                        } else {
                            i13 = i17;
                            i7 = 2;
                            if (i5 > i7) {
                            }
                        }
                    } else {
                        i13 = i15;
                        i7 = 2;
                        if (i5 > i7) {
                        }
                    }
                }
                i5 = 1;
                if (i14 + i5 > i8) {
                }
                i6 = iArr[i14 >> 2] >> ((3 - (i14 & 3)) << 3);
                i14 = i10 + 2;
                if ((i6 & 192) != 128) {
                }
                int i152 = (i4 << 6) | (i6 & 63);
                if (i5 <= 1) {
                }
            }
            i10 = i14;
            if (i11 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.expandCurrentSegment();
            }
            cArrEmptyAndGetCurrentSegment[i11] = (char) i13;
            i11++;
        }
        String str = new String(cArrEmptyAndGetCurrentSegment, 0, i11);
        if (i2 < 4) {
            iArr[i - 1] = i3;
        }
        return this._symbols.addName(str, iArr, i);
    }

    public final JsonToken _eofAsNextToken() throws IOException {
        this._majorState = 7;
        if (!this._parsingContext.inRoot()) {
            _handleEOF();
        }
        close();
        this._currToken = null;
        return null;
    }

    public final JsonToken _fieldComplete(String str) throws IOException {
        this._majorState = 4;
        this._parsingContext.setCurrentName(str);
        JsonToken jsonToken = JsonToken.FIELD_NAME;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueComplete(JsonToken jsonToken) throws IOException {
        this._majorState = this._majorStateAfterValue;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueCompleteInt(int i, String str) throws IOException {
        this._textBuffer.resetWithString(str);
        this._intLength = str.length();
        this._numTypesValid = 1;
        this._numberInt = i;
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_INT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final JsonToken _valueNonStdNumberComplete(int i) throws IOException {
        String str = NON_STD_TOKENS[i];
        this._textBuffer.resetWithString(str);
        if (!isEnabled(JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS)) {
            _reportError("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        this._intLength = 0;
        this._numTypesValid = 8;
        this._numberDouble = NON_STD_TOKEN_VALUES[i];
        this._majorState = this._majorStateAfterValue;
        JsonToken jsonToken = JsonToken.VALUE_NUMBER_FLOAT;
        this._currToken = jsonToken;
        return jsonToken;
    }

    public final String _nonStdToken(int i) {
        return NON_STD_TOKENS[i];
    }

    public final void _updateTokenLocation() {
        this._tokenInputRow = Math.max(this._currInputRow, this._currInputRowAlt);
        this._tokenInputCol = this._inputPtr - this._currInputRowStart;
        this._tokenInputTotal = this._currInputProcessed + (r0 - this._currBufferStart);
    }

    public void _reportInvalidChar(int i) throws JsonParseException {
        if (i < 32) {
            _throwInvalidSpace(i);
        }
        _reportInvalidInitial(i);
    }

    public void _reportInvalidInitial(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 start byte 0x" + Integer.toHexString(i));
    }

    public void _reportInvalidOther(int i, int i2) throws JsonParseException {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    public void _reportInvalidOther(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }
}
