package com.fasterxml.jackson.core.json;

import androidx.exifinterface.media.ExifInterface;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.fasterxml.jackson.core.p022io.CharTypes;
import com.fasterxml.jackson.core.p022io.IOContext;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.apache.commons.compress.compressors.snappy.SnappyCompressorOutputStream;

/* loaded from: classes6.dex */
public class UTF8StreamJsonParser extends ParserBase {
    public static final byte BYTE_LF = 10;
    public boolean _bufferRecyclable;
    public byte[] _inputBuffer;
    public InputStream _inputStream;
    public int _nameStartCol;
    public int _nameStartOffset;
    public int _nameStartRow;
    public ObjectCodec _objectCodec;
    public int _quad1;
    public int[] _quadBuffer;
    public final ByteQuadsCanonicalizer _symbols;
    public boolean _tokenIncomplete;
    public static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    public static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    public static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    public static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] _icUTF8 = CharTypes.getInputCodeUtf8();
    public static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    private static final int _padLastQuad(int i, int i2) {
        return i2 == 4 ? i : i | ((-1) << (i2 << 3));
    }

    @Deprecated
    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, boolean z) {
        this(iOContext, i, inputStream, objectCodec, byteQuadsCanonicalizer, bArr, i2, i3, 0, z);
    }

    public UTF8StreamJsonParser(IOContext iOContext, int i, InputStream inputStream, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, byte[] bArr, int i2, int i3, int i4, boolean z) {
        super(iOContext, i);
        this._quadBuffer = new int[16];
        this._inputStream = inputStream;
        this._objectCodec = objectCodec;
        this._symbols = byteQuadsCanonicalizer;
        this._inputBuffer = bArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2 - i4;
        this._currInputProcessed = (-i2) + i4;
        this._bufferRecyclable = z;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public ObjectCodec getCodec() {
        return this._objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void setCodec(ObjectCodec objectCodec) {
        this._objectCodec = objectCodec;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public JacksonFeatureSet<StreamReadCapability> getReadCapabilities() {
        return ParserBase.JSON_READ_CAPABILITIES;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int releaseBuffered(OutputStream outputStream) throws IOException {
        int i = this._inputEnd;
        int i2 = this._inputPtr;
        int i3 = i - i2;
        if (i3 < 1) {
            return 0;
        }
        this._inputPtr = i2 + i3;
        outputStream.write(this._inputBuffer, i2, i3);
        return i3;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._inputStream;
    }

    public final boolean _loadMore() throws IOException {
        byte[] bArr;
        int length;
        InputStream inputStream = this._inputStream;
        if (inputStream == null || (length = (bArr = this._inputBuffer).length) == 0) {
            return false;
        }
        int i = inputStream.read(bArr, 0, length);
        if (i > 0) {
            int i2 = this._inputEnd;
            this._currInputProcessed += i2;
            this._currInputRowStart -= i2;
            this._nameStartOffset -= i2;
            this._inputPtr = 0;
            this._inputEnd = i;
            return true;
        }
        _closeInput();
        if (i == 0) {
            throw new IOException("InputStream.read() returned 0 characters when trying to read " + this._inputBuffer.length + " bytes");
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._inputStream != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._inputStream.close();
            }
            this._inputStream = null;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        byte[] bArr;
        byte[] bArr2;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (bArr = this._inputBuffer) == null || bArr == (bArr2 = ParserMinimalBase.NO_BYTES)) {
            return;
        }
        this._inputBuffer = bArr2;
        this._ioContext.releaseReadIOBuffer(bArr);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        }
        return _getText2(jsonToken);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int getText(Writer writer) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
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
        char[] cArrAsCharArray = jsonToken.asCharArray();
        writer.write(cArrAsCharArray);
        return cArrAsCharArray.length;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
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
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                return _finishAndReturnString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            int i = this._numTypesValid;
            if ((i & 1) == 0) {
                if (i == 0) {
                    return _parseIntValue();
                }
                if ((i & 1) == 0) {
                    convertNumberToInt();
                }
            }
            return this._numberInt;
        }
        return super.getValueAsInt(0);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public int getValueAsInt(int i) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT || jsonToken == JsonToken.VALUE_NUMBER_FLOAT) {
            int i2 = this._numTypesValid;
            if ((i2 & 1) == 0) {
                if (i2 == 0) {
                    return _parseIntValue();
                }
                if ((i2 & 1) == 0) {
                    convertNumberToInt();
                }
            }
            return this._numberInt;
        }
        return super.getValueAsInt(i);
    }

    public final String _getText2(JsonToken jsonToken) {
        if (jsonToken == null) {
            return null;
        }
        int iM1012id = jsonToken.m1012id();
        if (iM1012id == 5) {
            return this._parsingContext.getCurrentName();
        }
        if (iM1012id == 6 || iM1012id == 7 || iM1012id == 8) {
            return this._textBuffer.contentsAsString();
        }
        return jsonToken.asString();
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public char[] getTextCharacters() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == null) {
            return null;
        }
        int iM1012id = jsonToken.m1012id();
        if (iM1012id == 5) {
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
        if (iM1012id != 6) {
            if (iM1012id != 7 && iM1012id != 8) {
                return this._currToken.asCharArray();
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.getTextBuffer();
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
        if (iM1012id != 6) {
            if (iM1012id != 7 && iM1012id != 8) {
                return this._currToken.asCharArray().length;
            }
        } else if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
        return this._textBuffer.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 8) goto L16;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int getTextOffset() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != null) {
            int iM1012id = jsonToken.m1012id();
            if (iM1012id != 6) {
                if (iM1012id != 7) {
                }
            } else if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.getTextOffset();
        }
        return 0;
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public byte[] getBinaryValue(Base64Variant base64Variant) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken != JsonToken.VALUE_STRING && (jsonToken != JsonToken.VALUE_EMBEDDED_OBJECT || this._binaryValue == null)) {
            _reportError("Current token (" + this._currToken + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
        }
        if (this._tokenIncomplete) {
            try {
                this._binaryValue = _decodeBase64(base64Variant);
                this._tokenIncomplete = false;
            } catch (IllegalArgumentException e) {
                throw _constructError("Failed to decode VALUE_STRING as base64 (" + base64Variant + "): " + e.getMessage());
            }
        } else if (this._binaryValue == null) {
            ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
            _decodeBase64(getText(), byteArrayBuilder_getByteArrayBuilder, base64Variant);
            this._binaryValue = byteArrayBuilder_getByteArrayBuilder.toByteArray();
        }
        return this._binaryValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int readBinaryValue(Base64Variant base64Variant, OutputStream outputStream) throws IOException {
        if (!this._tokenIncomplete || this._currToken != JsonToken.VALUE_STRING) {
            byte[] binaryValue = getBinaryValue(base64Variant);
            outputStream.write(binaryValue);
            return binaryValue.length;
        }
        byte[] bArrAllocBase64Buffer = this._ioContext.allocBase64Buffer();
        try {
            return _readBinary(base64Variant, outputStream, bArrAllocBase64Buffer);
        } finally {
            this._ioContext.releaseBase64Buffer(bArrAllocBase64Buffer);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _readBinary(Base64Variant base64Variant, OutputStream outputStream, byte[] bArr) throws IOException {
        int i;
        int iDecodeBase64Char;
        int iDecodeBase64Char2;
        int iDecodeBase64Char3;
        int i2 = 3;
        int length = bArr.length - 3;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            int i6 = bArr2[i5] & 255;
            if (i6 > 32) {
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i6);
                if (iDecodeBase64Char4 < 0) {
                    if (i6 == 34) {
                        break;
                    }
                    iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i6, 0);
                    if (iDecodeBase64Char4 < 0) {
                    }
                    if (i3 > length) {
                    }
                    if (this._inputPtr >= this._inputEnd) {
                    }
                    byte[] bArr3 = this._inputBuffer;
                    int i7 = this._inputPtr;
                    this._inputPtr = i7 + 1;
                    int i8 = bArr3[i7] & 255;
                    iDecodeBase64Char = base64Variant.decodeBase64Char(i8);
                    if (iDecodeBase64Char < 0) {
                    }
                    int i9 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                    if (this._inputPtr >= this._inputEnd) {
                    }
                    byte[] bArr4 = this._inputBuffer;
                    int i10 = this._inputPtr;
                    this._inputPtr = i10 + 1;
                    int i11 = bArr4[i10] & 255;
                    iDecodeBase64Char2 = base64Variant.decodeBase64Char(i11);
                    if (iDecodeBase64Char2 < 0) {
                    }
                    int i12 = (i9 << 6) | iDecodeBase64Char2;
                    if (this._inputPtr >= this._inputEnd) {
                    }
                    byte[] bArr5 = this._inputBuffer;
                    int i13 = this._inputPtr;
                    this._inputPtr = i13 + 1;
                    int i14 = bArr5[i13] & 255;
                    iDecodeBase64Char3 = base64Variant.decodeBase64Char(i14);
                    if (iDecodeBase64Char3 >= 0) {
                    }
                    int i15 = (i12 << 6) | iDecodeBase64Char3;
                    bArr[i3] = (byte) (i15 >> 16);
                    int i16 = i3 + 2;
                    bArr[i3 + 1] = (byte) (i15 >> 8);
                    i3 += 3;
                    bArr[i16] = (byte) i15;
                    i2 = i;
                } else {
                    if (i3 > length) {
                        i4 += i3;
                        outputStream.write(bArr, 0, i3);
                        i3 = 0;
                    }
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    byte[] bArr32 = this._inputBuffer;
                    int i72 = this._inputPtr;
                    this._inputPtr = i72 + 1;
                    int i82 = bArr32[i72] & 255;
                    iDecodeBase64Char = base64Variant.decodeBase64Char(i82);
                    if (iDecodeBase64Char < 0) {
                        iDecodeBase64Char = _decodeBase64Escape(base64Variant, i82, 1);
                    }
                    int i92 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    byte[] bArr42 = this._inputBuffer;
                    int i102 = this._inputPtr;
                    this._inputPtr = i102 + 1;
                    int i112 = bArr42[i102] & 255;
                    iDecodeBase64Char2 = base64Variant.decodeBase64Char(i112);
                    if (iDecodeBase64Char2 < 0) {
                        if (iDecodeBase64Char2 != -2) {
                            if (i112 == 34) {
                                int i17 = i3 + 1;
                                bArr[i3] = (byte) (i92 >> 4);
                                if (base64Variant.usesPadding()) {
                                    this._inputPtr--;
                                    _handleBase64MissingPadding(base64Variant);
                                }
                                i3 = i17;
                            } else {
                                iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i112, 2);
                            }
                        }
                        if (iDecodeBase64Char2 == -2) {
                            if (this._inputPtr >= this._inputEnd) {
                                _loadMoreGuaranteed();
                            }
                            byte[] bArr6 = this._inputBuffer;
                            int i18 = this._inputPtr;
                            this._inputPtr = i18 + 1;
                            int i19 = bArr6[i18] & 255;
                            if (!base64Variant.usesPaddingChar(i19) && _decodeBase64Escape(base64Variant, i19, i2) != -2) {
                                throw reportInvalidBase64Char(base64Variant, i19, i2, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                            }
                            bArr[i3] = (byte) (i92 >> 4);
                            i3++;
                        }
                    }
                    int i122 = (i92 << 6) | iDecodeBase64Char2;
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    byte[] bArr52 = this._inputBuffer;
                    int i132 = this._inputPtr;
                    this._inputPtr = i132 + 1;
                    int i142 = bArr52[i132] & 255;
                    iDecodeBase64Char3 = base64Variant.decodeBase64Char(i142);
                    if (iDecodeBase64Char3 >= 0) {
                        if (iDecodeBase64Char3 == -2) {
                            i = 3;
                        } else if (i142 == 34) {
                            int i20 = i3 + 1;
                            bArr[i3] = (byte) (i122 >> 10);
                            i3 += 2;
                            bArr[i20] = (byte) (i122 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            i = 3;
                            iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i142, 3);
                        }
                        if (iDecodeBase64Char3 == -2) {
                            int i21 = i3 + 1;
                            bArr[i3] = (byte) (i122 >> 10);
                            i3 += 2;
                            bArr[i21] = (byte) (i122 >> 2);
                        }
                        i2 = i;
                    } else {
                        i = 3;
                    }
                    int i152 = (i122 << 6) | iDecodeBase64Char3;
                    bArr[i3] = (byte) (i152 >> 16);
                    int i162 = i3 + 2;
                    bArr[i3 + 1] = (byte) (i152 >> 8);
                    i3 += 3;
                    bArr[i162] = (byte) i152;
                    i2 = i;
                }
            }
            i = i2;
            i2 = i;
        }
        this._tokenIncomplete = false;
        if (i3 <= 0) {
            return i4;
        }
        int i22 = i4 + i3;
        outputStream.write(bArr, 0, i3);
        return i22;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public JsonToken nextToken() throws IOException {
        JsonToken jsonToken_handleUnexpectedValue;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            return _nextAfterName();
        }
        this._numTypesValid = 0;
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (i_skipWSOrEnd == 93) {
            _closeArrayScope();
            JsonToken jsonToken3 = JsonToken.END_ARRAY;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i_skipWSOrEnd == 125) {
            _closeObjectScope();
            JsonToken jsonToken4 = JsonToken.END_OBJECT;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWSOrEnd != 44) {
                _reportUnexpectedChar(i_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125)) {
                return _closeScope(i_skipWSOrEnd);
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            return _nextTokenNotInObject(i_skipWSOrEnd);
        }
        _updateNameLocation();
        this._parsingContext.setCurrentName(_parseName(i_skipWSOrEnd));
        this._currToken = jsonToken2;
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return this._currToken;
        }
        if (i_skipColon != 43) {
            if (i_skipColon == 91) {
                jsonToken_handleUnexpectedValue = JsonToken.START_ARRAY;
            } else if (i_skipColon == 102) {
                _matchFalse();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_FALSE;
            } else if (i_skipColon == 110) {
                _matchNull();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_NULL;
            } else if (i_skipColon == 116) {
                _matchTrue();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_TRUE;
            } else if (i_skipColon == 123) {
                jsonToken_handleUnexpectedValue = JsonToken.START_OBJECT;
            } else if (i_skipColon == 45) {
                jsonToken_handleUnexpectedValue = _parseSignedNumber(true);
            } else if (i_skipColon == 46) {
                jsonToken_handleUnexpectedValue = _parseFloatThatStartsWithPeriod(false, false);
            } else {
                switch (i_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken_handleUnexpectedValue = _parseUnsignedNumber(i_skipColon);
                        break;
                    default:
                        jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i_skipColon);
                        break;
                }
            }
        } else if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonToken_handleUnexpectedValue = _parseSignedNumber(false);
        } else {
            jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i_skipColon);
        }
        this._nextToken = jsonToken_handleUnexpectedValue;
        return this._currToken;
    }

    private final JsonToken _nextTokenNotInObject(int i) throws IOException {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i == 43) {
            if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                JsonToken jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i);
                this._currToken = jsonToken_handleUnexpectedValue;
                return jsonToken_handleUnexpectedValue;
            }
            JsonToken jsonToken_parseSignedNumber = _parseSignedNumber(false);
            this._currToken = jsonToken_parseSignedNumber;
            return jsonToken_parseSignedNumber;
        }
        if (i == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            _matchFalse();
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            _matchNull();
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            _matchTrue();
            JsonToken jsonToken5 = JsonToken.VALUE_TRUE;
            this._currToken = jsonToken5;
            return jsonToken5;
        }
        if (i == 123) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken6 = JsonToken.START_OBJECT;
            this._currToken = jsonToken6;
            return jsonToken6;
        }
        if (i == 45) {
            JsonToken jsonToken_parseSignedNumber2 = _parseSignedNumber(true);
            this._currToken = jsonToken_parseSignedNumber2;
            return jsonToken_parseSignedNumber2;
        }
        if (i == 46) {
            JsonToken jsonToken_parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod(false, false);
            this._currToken = jsonToken_parseFloatThatStartsWithPeriod;
            return jsonToken_parseFloatThatStartsWithPeriod;
        }
        switch (i) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                JsonToken jsonToken_parseUnsignedNumber = _parseUnsignedNumber(i);
                this._currToken = jsonToken_parseUnsignedNumber;
                return jsonToken_parseUnsignedNumber;
            default:
                JsonToken jsonToken_handleUnexpectedValue2 = _handleUnexpectedValue(i);
                this._currToken = jsonToken_handleUnexpectedValue2;
                return jsonToken_handleUnexpectedValue2;
        }
    }

    private final JsonToken _nextAfterName() {
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        this._currToken = jsonToken;
        return jsonToken;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public void finishToken() throws IOException {
        if (this._tokenIncomplete) {
            this._tokenIncomplete = false;
            _finishString();
        }
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public boolean nextFieldName(SerializableString serializableString) throws IOException {
        int i = 0;
        this._numTypesValid = 0;
        if (this._currToken == JsonToken.FIELD_NAME) {
            _nextAfterName();
            return false;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return false;
        }
        this._binaryValue = null;
        if (i_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return false;
        }
        if (i_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return false;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWSOrEnd != 44) {
                _reportUnexpectedChar(i_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125)) {
                _closeScope(i_skipWSOrEnd);
                return false;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(i_skipWSOrEnd);
            return false;
        }
        _updateNameLocation();
        if (i_skipWSOrEnd == 34) {
            byte[] bArrAsQuotedUTF8 = serializableString.asQuotedUTF8();
            int length = bArrAsQuotedUTF8.length;
            int i2 = this._inputPtr;
            if (i2 + length + 4 < this._inputEnd) {
                int i3 = length + i2;
                if (this._inputBuffer[i3] == 34) {
                    while (i2 != i3) {
                        if (bArrAsQuotedUTF8[i] == this._inputBuffer[i2]) {
                            i++;
                            i2++;
                        }
                    }
                    this._parsingContext.setCurrentName(serializableString.getValue());
                    _isNextTokenNameYes(_skipColonFast(i2 + 1));
                    return true;
                }
            }
        }
        return _isNextTokenNameMaybe(i_skipWSOrEnd, serializableString);
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonToken_handleUnexpectedValue;
        this._numTypesValid = 0;
        JsonToken jsonToken = this._currToken;
        JsonToken jsonToken2 = JsonToken.FIELD_NAME;
        if (jsonToken == jsonToken2) {
            _nextAfterName();
            return null;
        }
        if (this._tokenIncomplete) {
            _skipString();
        }
        int i_skipWSOrEnd = _skipWSOrEnd();
        if (i_skipWSOrEnd < 0) {
            close();
            this._currToken = null;
            return null;
        }
        this._binaryValue = null;
        if (i_skipWSOrEnd == 93) {
            _closeArrayScope();
            this._currToken = JsonToken.END_ARRAY;
            return null;
        }
        if (i_skipWSOrEnd == 125) {
            _closeObjectScope();
            this._currToken = JsonToken.END_OBJECT;
            return null;
        }
        if (this._parsingContext.expectComma()) {
            if (i_skipWSOrEnd != 44) {
                _reportUnexpectedChar(i_skipWSOrEnd, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
            }
            i_skipWSOrEnd = _skipWS();
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125)) {
                _closeScope(i_skipWSOrEnd);
                return null;
            }
        }
        if (!this._parsingContext.inObject()) {
            _updateLocation();
            _nextTokenNotInObject(i_skipWSOrEnd);
            return null;
        }
        _updateNameLocation();
        String str_parseName = _parseName(i_skipWSOrEnd);
        this._parsingContext.setCurrentName(str_parseName);
        this._currToken = jsonToken2;
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str_parseName;
        }
        if (i_skipColon != 43) {
            if (i_skipColon == 91) {
                jsonToken_handleUnexpectedValue = JsonToken.START_ARRAY;
            } else if (i_skipColon == 102) {
                _matchFalse();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_FALSE;
            } else if (i_skipColon == 110) {
                _matchNull();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_NULL;
            } else if (i_skipColon == 116) {
                _matchTrue();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_TRUE;
            } else if (i_skipColon == 123) {
                jsonToken_handleUnexpectedValue = JsonToken.START_OBJECT;
            } else if (i_skipColon == 45) {
                jsonToken_handleUnexpectedValue = _parseSignedNumber(true);
            } else if (i_skipColon == 46) {
                jsonToken_handleUnexpectedValue = _parseFloatThatStartsWithPeriod(false, false);
            } else {
                switch (i_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken_handleUnexpectedValue = _parseUnsignedNumber(i_skipColon);
                        break;
                    default:
                        jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i_skipColon);
                        break;
                }
            }
        } else if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonToken_handleUnexpectedValue = _parseSignedNumber(false);
        } else {
            jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i_skipColon);
        }
        this._nextToken = jsonToken_handleUnexpectedValue;
        return str_parseName;
    }

    private final int _skipColonFast(int i) throws IOException {
        byte[] bArr = this._inputBuffer;
        int i2 = i + 1;
        byte b = bArr[i];
        if (b == 58) {
            int i3 = i + 2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 != 47 && b2 != 35) {
                    this._inputPtr = i3;
                    return b2;
                }
            } else if (b2 == 32 || b2 == 9) {
                int i4 = i + 3;
                byte b3 = bArr[i3];
                if (b3 > 32 && b3 != 47 && b3 != 35) {
                    this._inputPtr = i4;
                    return b3;
                }
                i3 = i4;
            }
            this._inputPtr = i3 - 1;
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            b = bArr[i2];
            i2 = i + 2;
        }
        if (b == 58) {
            int i5 = i2 + 1;
            byte b4 = bArr[i2];
            if (b4 > 32) {
                if (b4 != 47 && b4 != 35) {
                    this._inputPtr = i5;
                    return b4;
                }
            } else if (b4 == 32 || b4 == 9) {
                int i6 = i2 + 2;
                byte b5 = bArr[i5];
                if (b5 > 32 && b5 != 47 && b5 != 35) {
                    this._inputPtr = i6;
                    return b5;
                }
                i5 = i6;
            }
            this._inputPtr = i5 - 1;
            return _skipColon2(true);
        }
        this._inputPtr = i2 - 1;
        return _skipColon2(false);
    }

    private final void _isNextTokenNameYes(int i) throws IOException {
        this._currToken = JsonToken.FIELD_NAME;
        _updateLocation();
        if (i == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return;
        }
        if (i == 43) {
            if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
                this._nextToken = _parseSignedNumber(false);
                return;
            } else {
                this._nextToken = _handleUnexpectedValue(i);
                return;
            }
        }
        if (i == 91) {
            this._nextToken = JsonToken.START_ARRAY;
            return;
        }
        if (i == 102) {
            _matchFalse();
            this._nextToken = JsonToken.VALUE_FALSE;
            return;
        }
        if (i == 110) {
            _matchNull();
            this._nextToken = JsonToken.VALUE_NULL;
            return;
        }
        if (i == 116) {
            _matchTrue();
            this._nextToken = JsonToken.VALUE_TRUE;
            return;
        }
        if (i == 123) {
            this._nextToken = JsonToken.START_OBJECT;
            return;
        }
        if (i == 45) {
            this._nextToken = _parseSignedNumber(true);
            return;
        }
        if (i == 46) {
            this._nextToken = _parseFloatThatStartsWithPeriod(false, false);
            return;
        }
        switch (i) {
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
                this._nextToken = _parseUnsignedNumber(i);
                break;
            default:
                this._nextToken = _handleUnexpectedValue(i);
                break;
        }
    }

    public final boolean _isNextTokenNameMaybe(int i, SerializableString serializableString) throws IOException {
        JsonToken jsonToken_handleUnexpectedValue;
        String str_parseName = _parseName(i);
        this._parsingContext.setCurrentName(str_parseName);
        boolean zEquals = str_parseName.equals(serializableString.getValue());
        this._currToken = JsonToken.FIELD_NAME;
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return zEquals;
        }
        if (i_skipColon != 43) {
            if (i_skipColon == 91) {
                jsonToken_handleUnexpectedValue = JsonToken.START_ARRAY;
            } else if (i_skipColon == 102) {
                _matchFalse();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_FALSE;
            } else if (i_skipColon == 110) {
                _matchNull();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_NULL;
            } else if (i_skipColon == 116) {
                _matchTrue();
                jsonToken_handleUnexpectedValue = JsonToken.VALUE_TRUE;
            } else if (i_skipColon == 123) {
                jsonToken_handleUnexpectedValue = JsonToken.START_OBJECT;
            } else if (i_skipColon == 45) {
                jsonToken_handleUnexpectedValue = _parseSignedNumber(true);
            } else if (i_skipColon == 46) {
                jsonToken_handleUnexpectedValue = _parseFloatThatStartsWithPeriod(false, false);
            } else {
                switch (i_skipColon) {
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        jsonToken_handleUnexpectedValue = _parseUnsignedNumber(i_skipColon);
                        break;
                    default:
                        jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i_skipColon);
                        break;
                }
            }
        } else if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonToken_handleUnexpectedValue = _parseSignedNumber(false);
        } else {
            jsonToken_handleUnexpectedValue = _handleUnexpectedValue(i_skipColon);
        }
        this._nextToken = jsonToken_handleUnexpectedValue;
        return zEquals;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextTextValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    return _finishAndReturnString();
                }
                return this._textBuffer.contentsAsString();
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        if (nextToken() == JsonToken.VALUE_STRING) {
            return getText();
        }
        return null;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public int nextIntValue(int i) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getIntValue() : i;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getIntValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return i;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public long nextLongValue(long j) throws IOException {
        if (this._currToken != JsonToken.FIELD_NAME) {
            return nextToken() == JsonToken.VALUE_NUMBER_INT ? getLongValue() : j;
        }
        this._nameCopied = false;
        JsonToken jsonToken = this._nextToken;
        this._nextToken = null;
        this._currToken = jsonToken;
        if (jsonToken == JsonToken.VALUE_NUMBER_INT) {
            return getLongValue();
        }
        if (jsonToken == JsonToken.START_ARRAY) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
        } else if (jsonToken == JsonToken.START_OBJECT) {
            this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
        }
        return j;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Boolean nextBooleanValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_TRUE) {
                return Boolean.TRUE;
            }
            if (jsonToken == JsonToken.VALUE_FALSE) {
                return Boolean.FALSE;
            }
            if (jsonToken == JsonToken.START_ARRAY) {
                this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            } else if (jsonToken == JsonToken.START_OBJECT) {
                this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
            }
            return null;
        }
        JsonToken jsonTokenNextToken = nextToken();
        if (jsonTokenNextToken == JsonToken.VALUE_TRUE) {
            return Boolean.TRUE;
        }
        if (jsonTokenNextToken == JsonToken.VALUE_FALSE) {
            return Boolean.FALSE;
        }
        return null;
    }

    @Deprecated
    public final JsonToken _parseFloatThatStartsWithPeriod() throws IOException {
        return _parseFloatThatStartsWithPeriod(false, false);
    }

    public final JsonToken _parseFloatThatStartsWithPeriod(boolean z, boolean z2) throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleUnexpectedValue(46);
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i = 0;
        if (z) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i = 1;
        }
        return _parseFloat(cArrEmptyAndGetCurrentSegment, i, 46, z, 0);
    }

    public JsonToken _parseUnsignedNumber(int i) throws IOException {
        int i2;
        int i3;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (i == 48) {
            i = _verifyNoLeadingZeroes();
        }
        cArrEmptyAndGetCurrentSegment[0] = (char) i;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - 1);
        int i4 = 1;
        int i5 = 1;
        while (true) {
            i2 = this._inputPtr;
            if (i2 >= iMin) {
                return _parseNumber2(cArrEmptyAndGetCurrentSegment, i4, false, i5);
            }
            byte[] bArr = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i3 = bArr[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i5++;
            cArrEmptyAndGetCurrentSegment[i4] = (char) i3;
            i4++;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return _parseFloat(cArrEmptyAndGetCurrentSegment, i4, i3, false, i5);
        }
        this._inputPtr = i2;
        this._textBuffer.setCurrentLength(i4);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i3);
        }
        return resetInt(false, i5);
    }

    private final JsonToken _parseSignedNumber(boolean z) throws IOException {
        int i;
        int i2;
        int i3;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int i4 = 1;
        int i5 = 0;
        if (z) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i5 = 1;
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i6 = this._inputPtr;
        this._inputPtr = i6 + 1;
        int i_verifyNoLeadingZeroes = bArr[i6] & 255;
        if (i_verifyNoLeadingZeroes <= 48) {
            if (i_verifyNoLeadingZeroes != 48) {
                if (i_verifyNoLeadingZeroes == 46) {
                    return _parseFloatThatStartsWithPeriod(z, true);
                }
                return _handleInvalidNumberStart(i_verifyNoLeadingZeroes, z, true);
            }
            i_verifyNoLeadingZeroes = _verifyNoLeadingZeroes();
        } else if (i_verifyNoLeadingZeroes > 57) {
            return _handleInvalidNumberStart(i_verifyNoLeadingZeroes, z, true);
        }
        int i7 = i5 + 1;
        cArrEmptyAndGetCurrentSegment[i5] = (char) i_verifyNoLeadingZeroes;
        int iMin = Math.min(this._inputEnd, (this._inputPtr + cArrEmptyAndGetCurrentSegment.length) - i7);
        while (true) {
            i = i7;
            i2 = this._inputPtr;
            if (i2 >= iMin) {
                return _parseNumber2(cArrEmptyAndGetCurrentSegment, i, z, i4);
            }
            byte[] bArr2 = this._inputBuffer;
            this._inputPtr = i2 + 1;
            i3 = bArr2[i2] & 255;
            if (i3 < 48 || i3 > 57) {
                break;
            }
            i4++;
            i7 = i + 1;
            cArrEmptyAndGetCurrentSegment[i] = (char) i3;
        }
        if (i3 == 46 || i3 == 101 || i3 == 69) {
            return _parseFloat(cArrEmptyAndGetCurrentSegment, i, i3, z, i4);
        }
        this._inputPtr = i2;
        this._textBuffer.setCurrentLength(i);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(i3);
        }
        return resetInt(z, i4);
    }

    public final JsonToken _parseNumber2(char[] cArr, int i, boolean z, int i2) throws IOException {
        int i3;
        int i4;
        char[] cArrFinishCurrentSegment = cArr;
        int i5 = i;
        int i6 = i2;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                this._textBuffer.setCurrentLength(i5);
                return resetInt(z, i6);
            }
            byte[] bArr = this._inputBuffer;
            i3 = this._inputPtr;
            this._inputPtr = i3 + 1;
            i4 = bArr[i3] & 255;
            if (i4 > 57 || i4 < 48) {
                break;
            }
            if (i5 >= cArrFinishCurrentSegment.length) {
                i5 = 0;
                cArrFinishCurrentSegment = this._textBuffer.finishCurrentSegment();
            }
            cArrFinishCurrentSegment[i5] = (char) i4;
            i6++;
            i5++;
        }
        if (i4 == 46 || i4 == 101 || i4 == 69) {
            return _parseFloat(cArrFinishCurrentSegment, i5, i4, z, i6);
        }
        this._inputPtr = i3;
        this._textBuffer.setCurrentLength(i5);
        if (this._parsingContext.inRoot()) {
            _verifyRootSpace(this._inputBuffer[this._inputPtr] & 255);
        }
        return resetInt(z, i6);
    }

    public final int _verifyNoLeadingZeroes() throws IOException {
        int i;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (i = this._inputBuffer[this._inputPtr] & 255) < 48 || i > 57) {
            return 48;
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (i == 48) {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                i = bArr[i2] & 255;
                if (i < 48 || i > 57) {
                    return 48;
                }
                this._inputPtr = i2 + 1;
            } while (i == 48);
        }
        return i;
    }

    private final JsonToken _parseFloat(char[] cArr, int i, int i2, boolean z, int i3) throws IOException {
        int i4;
        boolean z2;
        int i5 = 0;
        if (i2 == 46) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            cArr[i] = (char) i2;
            i++;
            i4 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                byte[] bArr = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                i2 = bArr[i6] & 255;
                if (i2 < 48 || i2 > 57) {
                    break;
                }
                i4++;
                if (i >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i = 0;
                }
                cArr[i] = (char) i2;
                i++;
            }
            z2 = false;
            if (i4 == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                _reportUnexpectedNumberChar(i2, "Decimal point not followed by a digit");
            }
        } else {
            i4 = 0;
            z2 = false;
        }
        if (i2 == 101 || i2 == 69) {
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i7 = i + 1;
            cArr[i] = (char) i2;
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr2 = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            int i9 = bArr2[i8] & 255;
            if (i9 == 45 || i9 == 43) {
                if (i7 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i7 = 0;
                }
                int i10 = i7 + 1;
                cArr[i7] = (char) i9;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                i9 = bArr3[i11] & 255;
                i7 = i10;
            }
            i2 = i9;
            int i12 = 0;
            while (i2 >= 48 && i2 <= 57) {
                i12++;
                if (i7 >= cArr.length) {
                    cArr = this._textBuffer.finishCurrentSegment();
                    i7 = 0;
                }
                int i13 = i7 + 1;
                cArr[i7] = (char) i2;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i5 = i12;
                    z2 = true;
                    i = i13;
                    break;
                }
                byte[] bArr4 = this._inputBuffer;
                int i14 = this._inputPtr;
                this._inputPtr = i14 + 1;
                i2 = bArr4[i14] & 255;
                i7 = i13;
            }
            i5 = i12;
            i = i7;
            if (i5 == 0) {
                _reportUnexpectedNumberChar(i2, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(i2);
            }
        }
        this._textBuffer.setCurrentLength(i);
        return resetFloat(z, i3, i4, i5);
    }

    private final void _verifyRootSpace(int i) throws IOException {
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        if (i != 9) {
            if (i == 10) {
                this._currInputRow++;
                this._currInputRowStart = i3;
            } else if (i == 13) {
                this._inputPtr = i2;
            } else if (i != 32) {
                _reportMissingRootWS(i);
            }
        }
    }

    public final String _parseName(int i) throws IOException {
        if (i != 34) {
            return _handleOddName(i);
        }
        int i2 = this._inputPtr;
        if (i2 + 13 > this._inputEnd) {
            return slowParseName();
        }
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            if (i4 == 34) {
                return "";
            }
            return parseName(0, i4, 0);
        }
        int i5 = i2 + 2;
        this._inputPtr = i5;
        int i6 = bArr[i3] & 255;
        if (iArr[i6] != 0) {
            if (i6 == 34) {
                return findName(i4, 1);
            }
            return parseName(i4, i6, 1);
        }
        int i7 = i6 | (i4 << 8);
        int i8 = i2 + 3;
        this._inputPtr = i8;
        int i9 = bArr[i5] & 255;
        if (iArr[i9] != 0) {
            if (i9 == 34) {
                return findName(i7, 2);
            }
            return parseName(i7, i9, 2);
        }
        int i10 = (i7 << 8) | i9;
        int i11 = i2 + 4;
        this._inputPtr = i11;
        int i12 = bArr[i8] & 255;
        if (iArr[i12] != 0) {
            if (i12 == 34) {
                return findName(i10, 3);
            }
            return parseName(i10, i12, 3);
        }
        int i13 = (i10 << 8) | i12;
        this._inputPtr = i2 + 5;
        int i14 = bArr[i11] & 255;
        if (iArr[i14] == 0) {
            this._quad1 = i13;
            return parseMediumName(i14);
        }
        if (i14 == 34) {
            return findName(i13, 4);
        }
        return parseName(i13, i14, 4);
    }

    public final String parseMediumName(int i) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        int i4 = bArr[i2] & 255;
        if (iArr[i4] != 0) {
            if (i4 == 34) {
                return findName(this._quad1, i, 1);
            }
            return parseName(this._quad1, i, i4, 1);
        }
        int i5 = (i << 8) | i4;
        int i6 = i2 + 2;
        this._inputPtr = i6;
        int i7 = bArr[i3] & 255;
        if (iArr[i7] != 0) {
            if (i7 == 34) {
                return findName(this._quad1, i5, 2);
            }
            return parseName(this._quad1, i5, i7, 2);
        }
        int i8 = (i5 << 8) | i7;
        int i9 = i2 + 3;
        this._inputPtr = i9;
        int i10 = bArr[i6] & 255;
        if (iArr[i10] != 0) {
            if (i10 == 34) {
                return findName(this._quad1, i8, 3);
            }
            return parseName(this._quad1, i8, i10, 3);
        }
        int i11 = (i8 << 8) | i10;
        this._inputPtr = i2 + 4;
        int i12 = bArr[i9] & 255;
        if (iArr[i12] == 0) {
            return parseMediumName2(i12, i11);
        }
        if (i12 == 34) {
            return findName(this._quad1, i11, 4);
        }
        return parseName(this._quad1, i11, i12, 4);
    }

    public final String parseMediumName2(int i, int i2) throws IOException {
        byte[] bArr = this._inputBuffer;
        int[] iArr = _icLatin1;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        int i5 = bArr[i3] & 255;
        if (iArr[i5] != 0) {
            if (i5 == 34) {
                return findName(this._quad1, i2, i, 1);
            }
            return parseName(this._quad1, i2, i, i5, 1);
        }
        int i6 = (i << 8) | i5;
        int i7 = i3 + 2;
        this._inputPtr = i7;
        int i8 = bArr[i4] & 255;
        if (iArr[i8] != 0) {
            if (i8 == 34) {
                return findName(this._quad1, i2, i6, 2);
            }
            return parseName(this._quad1, i2, i6, i8, 2);
        }
        int i9 = (i6 << 8) | i8;
        int i10 = i3 + 3;
        this._inputPtr = i10;
        int i11 = bArr[i7] & 255;
        if (iArr[i11] != 0) {
            if (i11 == 34) {
                return findName(this._quad1, i2, i9, 3);
            }
            return parseName(this._quad1, i2, i9, i11, 3);
        }
        int i12 = (i9 << 8) | i11;
        this._inputPtr = i3 + 4;
        int i13 = bArr[i10] & 255;
        if (iArr[i13] == 0) {
            return parseLongName(i13, i2, i12);
        }
        if (i13 == 34) {
            return findName(this._quad1, i2, i12, 4);
        }
        return parseName(this._quad1, i2, i12, i13, 4);
    }

    public final String parseLongName(int i, int i2, int i3) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = this._quad1;
        iArr[1] = i2;
        iArr[2] = i3;
        byte[] bArr = this._inputBuffer;
        int[] iArr2 = _icLatin1;
        int i4 = i;
        int i5 = 3;
        while (true) {
            int i6 = this._inputPtr;
            if (i6 + 4 <= this._inputEnd) {
                int i7 = i6 + 1;
                this._inputPtr = i7;
                int i8 = bArr[i6] & 255;
                if (iArr2[i8] != 0) {
                    if (i8 == 34) {
                        return findName(this._quadBuffer, i5, i4, 1);
                    }
                    return parseEscapedName(this._quadBuffer, i5, i4, i8, 1);
                }
                int i9 = (i4 << 8) | i8;
                int i10 = i6 + 2;
                this._inputPtr = i10;
                int i11 = bArr[i7] & 255;
                if (iArr2[i11] != 0) {
                    if (i11 == 34) {
                        return findName(this._quadBuffer, i5, i9, 2);
                    }
                    return parseEscapedName(this._quadBuffer, i5, i9, i11, 2);
                }
                int i12 = (i9 << 8) | i11;
                int i13 = i6 + 3;
                this._inputPtr = i13;
                int i14 = bArr[i10] & 255;
                if (iArr2[i14] != 0) {
                    if (i14 == 34) {
                        return findName(this._quadBuffer, i5, i12, 3);
                    }
                    return parseEscapedName(this._quadBuffer, i5, i12, i14, 3);
                }
                int i15 = (i12 << 8) | i14;
                this._inputPtr = i6 + 4;
                int i16 = bArr[i13] & 255;
                if (iArr2[i16] != 0) {
                    if (i16 == 34) {
                        return findName(this._quadBuffer, i5, i15, 4);
                    }
                    return parseEscapedName(this._quadBuffer, i5, i15, i16, 4);
                }
                int[] iArr3 = this._quadBuffer;
                if (i5 >= iArr3.length) {
                    this._quadBuffer = ParserBase.growArrayBy(iArr3, i5);
                }
                this._quadBuffer[i5] = i15;
                i4 = i16;
                i5++;
            } else {
                return parseEscapedName(this._quadBuffer, i5, 0, i4, 0);
            }
        }
    }

    public String slowParseName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing '\"' for name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 34) {
            return "";
        }
        return parseEscapedName(this._quadBuffer, 0, 0, i2, 0);
    }

    private final String parseName(int i, int i2, int i3) throws IOException {
        return parseEscapedName(this._quadBuffer, 0, i, i2, i3);
    }

    private final String parseName(int i, int i2, int i3, int i4) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        return parseEscapedName(iArr, 1, i2, i3, i4);
    }

    private final String parseName(int i, int i2, int i3, int i4, int i5) throws IOException {
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        return parseEscapedName(iArr, 2, i3, i4, i5);
    }

    public final String parseEscapedName(int[] iArr, int i, int i2, int i3, int i4) throws IOException {
        int[] iArr2 = _icLatin1;
        while (true) {
            if (iArr2[i3] != 0) {
                if (i3 == 34) {
                    break;
                }
                if (i3 != 92) {
                    _throwUnquotedSpace(i3, "name");
                } else {
                    i3 = _decodeEscaped();
                }
                if (i3 > 127) {
                    int i5 = 0;
                    if (i4 >= 4) {
                        if (i >= iArr.length) {
                            iArr = ParserBase.growArrayBy(iArr, iArr.length);
                            this._quadBuffer = iArr;
                        }
                        iArr[i] = i2;
                        i++;
                        i2 = 0;
                        i4 = 0;
                    }
                    if (i3 < 2048) {
                        i2 = (i2 << 8) | (i3 >> 6) | 192;
                        i4++;
                    } else {
                        int i6 = (i2 << 8) | (i3 >> 12) | 224;
                        int i7 = i4 + 1;
                        if (i7 >= 4) {
                            if (i >= iArr.length) {
                                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                                this._quadBuffer = iArr;
                            }
                            iArr[i] = i6;
                            i++;
                            i7 = 0;
                        } else {
                            i5 = i6;
                        }
                        i2 = (i5 << 8) | ((i3 >> 6) & 63) | 128;
                        i4 = i7 + 1;
                    }
                    i3 = (i3 & 63) | 128;
                }
            }
            if (i4 < 4) {
                i4++;
                i2 = (i2 << 8) | i3;
            } else {
                if (i >= iArr.length) {
                    iArr = ParserBase.growArrayBy(iArr, iArr.length);
                    this._quadBuffer = iArr;
                }
                iArr[i] = i2;
                i2 = i3;
                i++;
                i4 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i8 = this._inputPtr;
            this._inputPtr = i8 + 1;
            i3 = bArr[i8] & 255;
        }
        if (i4 > 0) {
            if (i >= iArr.length) {
                iArr = ParserBase.growArrayBy(iArr, iArr.length);
                this._quadBuffer = iArr;
            }
            iArr[i] = _padLastQuad(i2, i4);
            i++;
        }
        String strFindName = this._symbols.findName(iArr, i);
        return strFindName == null ? addName(iArr, i, i4) : strFindName;
    }

    public String _handleOddName(int i) throws IOException {
        if (i == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar((char) _decodeCharForError(i), "was expecting double-quote to start field name");
        }
        int[] inputCodeUtf8JsNames = CharTypes.getInputCodeUtf8JsNames();
        if (inputCodeUtf8JsNames[i] != 0) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int[] iArrGrowArrayBy = this._quadBuffer;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i2 < 4) {
                i2++;
                i4 = i | (i4 << 8);
            } else {
                if (i3 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i3] = i4;
                i4 = i;
                i3++;
                i2 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr = this._inputBuffer;
            int i5 = this._inputPtr;
            i = bArr[i5] & 255;
            if (inputCodeUtf8JsNames[i] != 0) {
                break;
            }
            this._inputPtr = i5 + 1;
        }
        if (i2 > 0) {
            if (i3 >= iArrGrowArrayBy.length) {
                iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                this._quadBuffer = iArrGrowArrayBy;
            }
            iArrGrowArrayBy[i3] = i4;
            i3++;
        }
        String strFindName = this._symbols.findName(iArrGrowArrayBy, i3);
        return strFindName == null ? addName(iArrGrowArrayBy, i3, i2) : strFindName;
    }

    public String _parseAposName() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(": was expecting closing ''' for field name", JsonToken.FIELD_NAME);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i_decodeEscaped = bArr[i] & 255;
        if (i_decodeEscaped == 39) {
            return "";
        }
        int[] iArrGrowArrayBy = this._quadBuffer;
        int[] iArr = _icLatin1;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i_decodeEscaped != 39) {
            if (iArr[i_decodeEscaped] != 0 && i_decodeEscaped != 34) {
                if (i_decodeEscaped != 92) {
                    _throwUnquotedSpace(i_decodeEscaped, "name");
                } else {
                    i_decodeEscaped = _decodeEscaped();
                }
                if (i_decodeEscaped > 127) {
                    if (i2 >= 4) {
                        if (i3 >= iArrGrowArrayBy.length) {
                            iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                            this._quadBuffer = iArrGrowArrayBy;
                        }
                        iArrGrowArrayBy[i3] = i4;
                        i4 = 0;
                        i3++;
                        i2 = 0;
                    }
                    if (i_decodeEscaped < 2048) {
                        i4 = (i4 << 8) | (i_decodeEscaped >> 6) | 192;
                        i2++;
                    } else {
                        int i5 = (i4 << 8) | (i_decodeEscaped >> 12) | 224;
                        int i6 = i2 + 1;
                        if (i6 >= 4) {
                            if (i3 >= iArrGrowArrayBy.length) {
                                iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                                this._quadBuffer = iArrGrowArrayBy;
                            }
                            iArrGrowArrayBy[i3] = i5;
                            i5 = 0;
                            i3++;
                            i6 = 0;
                        }
                        i4 = (i5 << 8) | ((i_decodeEscaped >> 6) & 63) | 128;
                        i2 = i6 + 1;
                    }
                    i_decodeEscaped = (i_decodeEscaped & 63) | 128;
                }
            }
            if (i2 < 4) {
                i2++;
                i4 = i_decodeEscaped | (i4 << 8);
            } else {
                if (i3 >= iArrGrowArrayBy.length) {
                    iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                    this._quadBuffer = iArrGrowArrayBy;
                }
                iArrGrowArrayBy[i3] = i4;
                i4 = i_decodeEscaped;
                i3++;
                i2 = 1;
            }
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            byte[] bArr2 = this._inputBuffer;
            int i7 = this._inputPtr;
            this._inputPtr = i7 + 1;
            i_decodeEscaped = bArr2[i7] & 255;
        }
        if (i2 > 0) {
            if (i3 >= iArrGrowArrayBy.length) {
                iArrGrowArrayBy = ParserBase.growArrayBy(iArrGrowArrayBy, iArrGrowArrayBy.length);
                this._quadBuffer = iArrGrowArrayBy;
            }
            iArrGrowArrayBy[i3] = _padLastQuad(i4, i2);
            i3++;
        }
        String strFindName = this._symbols.findName(iArrGrowArrayBy, i3);
        return strFindName == null ? addName(iArrGrowArrayBy, i3, i2) : strFindName;
    }

    private final String findName(int i, int i2) throws JsonParseException {
        int i_padLastQuad = _padLastQuad(i, i2);
        String strFindName = this._symbols.findName(i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i_padLastQuad;
        return addName(iArr, 1, i2);
    }

    private final String findName(int i, int i2, int i3) throws JsonParseException {
        int i_padLastQuad = _padLastQuad(i2, i3);
        String strFindName = this._symbols.findName(i, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i_padLastQuad;
        return addName(iArr, 2, i3);
    }

    private final String findName(int i, int i2, int i3, int i4) throws JsonParseException {
        int i_padLastQuad = _padLastQuad(i3, i4);
        String strFindName = this._symbols.findName(i, i2, i_padLastQuad);
        if (strFindName != null) {
            return strFindName;
        }
        int[] iArr = this._quadBuffer;
        iArr[0] = i;
        iArr[1] = i2;
        iArr[2] = _padLastQuad(i_padLastQuad, i4);
        return addName(iArr, 3, i4);
    }

    private final String findName(int[] iArr, int i, int i2, int i3) throws JsonParseException {
        if (i >= iArr.length) {
            iArr = ParserBase.growArrayBy(iArr, iArr.length);
            this._quadBuffer = iArr;
        }
        int i4 = i + 1;
        iArr[i] = _padLastQuad(i2, i3);
        String strFindName = this._symbols.findName(iArr, i4);
        return strFindName == null ? addName(iArr, i4, i3) : strFindName;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[PHI: r5 r14
  0x00b9: PHI (r5v17 int) = (r5v16 int), (r5v28 int) binds: [B:28:0x0082, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]
  0x00b9: PHI (r14v6 int) = (r14v5 int), (r14v15 int) binds: [B:28:0x0082, B:37:0x00b4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final String addName(int[] iArr, int i, int i2) throws JsonParseException {
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

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _finishString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                cArrEmptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this._inputPtr = i + 1;
                this._textBuffer.setCurrentLength(i2);
                return;
            }
        }
        this._inputPtr = i;
        _finishString2(cArrEmptyAndGetCurrentSegment, i2);
    }

    public String _finishAndReturnString() throws IOException {
        int i = this._inputPtr;
        if (i >= this._inputEnd) {
            _loadMoreGuaranteed();
            i = this._inputPtr;
        }
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        int iMin = Math.min(this._inputEnd, cArrEmptyAndGetCurrentSegment.length + i);
        byte[] bArr = this._inputBuffer;
        int i2 = 0;
        while (true) {
            if (i >= iMin) {
                break;
            }
            int i3 = bArr[i] & 255;
            if (iArr[i3] == 0) {
                i++;
                cArrEmptyAndGetCurrentSegment[i2] = (char) i3;
                i2++;
            } else if (i3 == 34) {
                this._inputPtr = i + 1;
                return this._textBuffer.setCurrentAndReturn(i2);
            }
        }
        this._inputPtr = i;
        _finishString2(cArrEmptyAndGetCurrentSegment, i2);
        return this._textBuffer.contentsAsString();
    }

    public final void _finishString2(char[] cArr, int i) throws IOException {
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i2 = this._inputPtr;
            if (i2 >= this._inputEnd) {
                _loadMoreGuaranteed();
                i2 = this._inputPtr;
            }
            int i3 = 0;
            if (i >= cArr.length) {
                cArr = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int iMin = Math.min(this._inputEnd, (cArr.length - i) + i2);
            while (true) {
                if (i2 < iMin) {
                    int i4 = i2 + 1;
                    int i_decodeEscaped = bArr[i2] & 255;
                    int i5 = iArr[i_decodeEscaped];
                    if (i5 != 0) {
                        this._inputPtr = i4;
                        if (i_decodeEscaped != 34) {
                            if (i5 == 1) {
                                i_decodeEscaped = _decodeEscaped();
                            } else if (i5 == 2) {
                                i_decodeEscaped = _decodeUtf8_2(i_decodeEscaped);
                            } else if (i5 == 3) {
                                i_decodeEscaped = this._inputEnd - i4 >= 2 ? _decodeUtf8_3fast(i_decodeEscaped) : _decodeUtf8_3(i_decodeEscaped);
                            } else if (i5 == 4) {
                                int i_decodeUtf8_4 = _decodeUtf8_4(i_decodeEscaped);
                                int i6 = i + 1;
                                cArr[i] = (char) ((i_decodeUtf8_4 >> 10) | 55296);
                                if (i6 >= cArr.length) {
                                    cArr = this._textBuffer.finishCurrentSegment();
                                    i = 0;
                                } else {
                                    i = i6;
                                }
                                i_decodeEscaped = (i_decodeUtf8_4 & 1023) | 56320;
                            } else if (i_decodeEscaped < 32) {
                                _throwUnquotedSpace(i_decodeEscaped, "string value");
                            } else {
                                _reportInvalidChar(i_decodeEscaped);
                            }
                            if (i >= cArr.length) {
                                cArr = this._textBuffer.finishCurrentSegment();
                            } else {
                                i3 = i;
                            }
                            i = i3 + 1;
                            cArr[i3] = (char) i_decodeEscaped;
                        } else {
                            this._textBuffer.setCurrentLength(i);
                            return;
                        }
                    } else {
                        cArr[i] = (char) i_decodeEscaped;
                        i2 = i4;
                        i++;
                    }
                } else {
                    this._inputPtr = i2;
                    break;
                }
            }
        }
    }

    public void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        while (true) {
            int i = this._inputPtr;
            int i2 = this._inputEnd;
            if (i >= i2) {
                _loadMoreGuaranteed();
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    int i4 = bArr[i] & 255;
                    int i5 = iArr[i4];
                    if (i5 != 0) {
                        this._inputPtr = i3;
                        if (i4 == 34) {
                            return;
                        }
                        if (i5 == 1) {
                            _decodeEscaped();
                        } else if (i5 == 2) {
                            _skipUtf8_2();
                        } else if (i5 == 3) {
                            _skipUtf8_3();
                        } else if (i5 == 4) {
                            _skipUtf8_4(i4);
                        } else if (i4 < 32) {
                            _throwUnquotedSpace(i4, "string value");
                        } else {
                            _reportInvalidChar(i4);
                        }
                    } else {
                        i = i3;
                    }
                } else {
                    this._inputPtr = i;
                    break;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x001b, code lost:
    
        if (r4 != 44) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3._parsingContext.inArray() == false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0051, code lost:
    
        if (r3._parsingContext.inRoot() != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        if ((r3._features & com.fasterxml.jackson.core.json.UTF8StreamJsonParser.FEAT_MASK_ALLOW_MISSING) == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005a, code lost:
    
        r3._inputPtr--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
    
        return com.fasterxml.jackson.core.JsonToken.VALUE_NULL;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken _handleUnexpectedValue(int i) throws IOException {
        if (i == 39) {
            if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
                return _handleApos();
            }
        } else if (i == 73) {
            _matchToken("Infinity", 1);
            if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                return resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        } else if (i != 78) {
            if (i != 93) {
                if (i != 125) {
                    if (i == 43) {
                        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                            _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                        }
                        byte[] bArr = this._inputBuffer;
                        int i2 = this._inputPtr;
                        this._inputPtr = i2 + 1;
                        return _handleInvalidNumberStart(bArr[i2] & 255, false, true);
                    }
                }
            }
            _reportUnexpectedChar(i, "expected a value");
            if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            }
        } else {
            _matchToken("NaN", 1);
            if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                return resetAsNaN("NaN", Double.NaN);
            }
            _reportError("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
        }
        if (Character.isJavaIdentifierStart(i)) {
            _reportInvalidToken("" + ((char) i), _validJsonTokenList());
        }
        _reportUnexpectedChar(i, "expected a valid value " + _validJsonValueList());
        return null;
    }

    public JsonToken _handleApos() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int[] iArr = _icUTF8;
        byte[] bArr = this._inputBuffer;
        int i = 0;
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            if (i >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i = 0;
            }
            int i2 = this._inputEnd;
            int length = this._inputPtr + (cArrEmptyAndGetCurrentSegment.length - i);
            if (length < i2) {
                i2 = length;
            }
            while (true) {
                int i3 = this._inputPtr;
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    this._inputPtr = i4;
                    int i_decodeEscaped = bArr[i3] & 255;
                    if (i_decodeEscaped != 39) {
                        int i5 = iArr[i_decodeEscaped];
                        if (i5 == 0 || i_decodeEscaped == 34) {
                            cArrEmptyAndGetCurrentSegment[i] = (char) i_decodeEscaped;
                            i++;
                        } else {
                            if (i5 == 1) {
                                i_decodeEscaped = _decodeEscaped();
                            } else if (i5 == 2) {
                                i_decodeEscaped = _decodeUtf8_2(i_decodeEscaped);
                            } else if (i5 != 3) {
                                if (i5 == 4) {
                                    int i_decodeUtf8_4 = _decodeUtf8_4(i_decodeEscaped);
                                    int i6 = i + 1;
                                    cArrEmptyAndGetCurrentSegment[i] = (char) ((i_decodeUtf8_4 >> 10) | 55296);
                                    if (i6 >= cArrEmptyAndGetCurrentSegment.length) {
                                        cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                        i = 0;
                                    } else {
                                        i = i6;
                                    }
                                    i_decodeEscaped = 56320 | (i_decodeUtf8_4 & 1023);
                                } else {
                                    if (i_decodeEscaped < 32) {
                                        _throwUnquotedSpace(i_decodeEscaped, "string value");
                                    }
                                    _reportInvalidChar(i_decodeEscaped);
                                }
                            } else if (this._inputEnd - i4 >= 2) {
                                i_decodeEscaped = _decodeUtf8_3fast(i_decodeEscaped);
                            } else {
                                i_decodeEscaped = _decodeUtf8_3(i_decodeEscaped);
                            }
                            if (i >= cArrEmptyAndGetCurrentSegment.length) {
                                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                                i = 0;
                            }
                            cArrEmptyAndGetCurrentSegment[i] = (char) i_decodeEscaped;
                            i++;
                        }
                    } else {
                        this._textBuffer.setCurrentLength(i);
                        return JsonToken.VALUE_STRING;
                    }
                }
            }
        }
    }

    public JsonToken _handleInvalidNumberStart(int i, boolean z) throws IOException {
        return _handleInvalidNumberStart(i, z, false);
    }

    public JsonToken _handleInvalidNumberStart(int i, boolean z, boolean z2) throws IOException {
        String str;
        while (i == 73) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_FLOAT);
            }
            byte[] bArr = this._inputBuffer;
            int i2 = this._inputPtr;
            this._inputPtr = i2 + 1;
            i = bArr[i2];
            if (i != 78) {
                if (i != 110) {
                    break;
                }
                str = z ? "-Infinity" : "+Infinity";
            } else {
                str = z ? "-INF" : "+INF";
            }
            _matchToken(str, 3);
            if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                return resetAsNaN(str, z ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY);
            }
            _reportError("Non-standard token '%s': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow", str);
        }
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature()) && z2 && !z) {
            _reportUnexpectedNumberChar(43, "JSON spec does not allow numbers to have plus signs: enable `JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS` to allow");
        }
        _reportUnexpectedNumberChar(i, z ? "expected digit (0-9) to follow minus sign, for valid numeric value" : "expected digit (0-9) for valid numeric value");
        return null;
    }

    public final void _matchTrue() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 114) {
                int i4 = i2 + 2;
                if (bArr[i3] == 117) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 101 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("true", 1);
    }

    public final void _matchFalse() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 97) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 115) {
                        int i6 = i2 + 4;
                        if (bArr[i5] == 101 && ((i = bArr[i6] & 255) < 48 || i == 93 || i == 125)) {
                            this._inputPtr = i6;
                            return;
                        }
                    }
                }
            }
        }
        _matchToken2("false", 1);
    }

    public final void _matchNull() throws IOException {
        int i;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            byte[] bArr = this._inputBuffer;
            int i3 = i2 + 1;
            if (bArr[i2] == 117) {
                int i4 = i2 + 2;
                if (bArr[i3] == 108) {
                    int i5 = i2 + 3;
                    if (bArr[i4] == 108 && ((i = bArr[i5] & 255) < 48 || i == 93 || i == 125)) {
                        this._inputPtr = i5;
                        return;
                    }
                }
            }
        }
        _matchToken2("null", 1);
    }

    public final void _matchToken(String str, int i) throws IOException {
        int i2;
        int length = str.length();
        if (this._inputPtr + length >= this._inputEnd) {
            _matchToken2(str, i);
            return;
        }
        do {
            if (this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            i2 = this._inputPtr + 1;
            this._inputPtr = i2;
            i++;
        } while (i < length);
        int i3 = this._inputBuffer[i2] & 255;
        if (i3 < 48 || i3 == 93 || i3 == 125) {
            return;
        }
        _checkMatchEnd(str, i, i3);
    }

    private final void _matchToken2(String str, int i) throws IOException {
        int i2;
        int i3;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            i2 = this._inputPtr + 1;
            this._inputPtr = i2;
            i++;
        } while (i < length);
        if ((i2 < this._inputEnd || _loadMore()) && (i3 = this._inputBuffer[this._inputPtr] & 255) >= 48 && i3 != 93 && i3 != 125) {
            _checkMatchEnd(str, i, i3);
        }
    }

    private final void _checkMatchEnd(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) _decodeCharForError(i2))) {
            _reportInvalidToken(str.substring(0, i));
        }
    }

    private final int _skipWS() throws IOException {
        while (true) {
            int i = this._inputPtr;
            if (i < this._inputEnd) {
                byte[] bArr = this._inputBuffer;
                int i2 = i + 1;
                this._inputPtr = i2;
                int i3 = bArr[i] & 255;
                if (i3 > 32) {
                    if (i3 != 47 && i3 != 35) {
                        return i3;
                    }
                    this._inputPtr = i;
                    return _skipWS2();
                }
                if (i3 != 32) {
                    if (i3 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i2;
                    } else if (i3 == 13) {
                        _skipCR();
                    } else if (i3 != 9) {
                        _throwInvalidSpace(i3);
                    }
                }
            } else {
                return _skipWS2();
            }
        }
    }

    public final int _skipWS2() throws IOException {
        int i;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                i = bArr[i2] & 255;
                if (i > 32) {
                    if (i == 47) {
                        _skipComment();
                    } else if (i != 35 || !_skipYAMLComment()) {
                        break;
                    }
                } else if (i != 32) {
                    if (i == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i3;
                    } else if (i == 13) {
                        _skipCR();
                    } else if (i != 9) {
                        _throwInvalidSpace(i);
                    }
                }
            } else {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
        }
        return i;
    }

    private final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        int i3 = bArr[i] & 255;
        if (i3 > 32) {
            if (i3 != 47 && i3 != 35) {
                return i3;
            }
            this._inputPtr = i;
            return _skipWSOrEnd2();
        }
        if (i3 != 32) {
            if (i3 == 10) {
                this._currInputRow++;
                this._currInputRowStart = i2;
            } else if (i3 == 13) {
                _skipCR();
            } else if (i3 != 9) {
                _throwInvalidSpace(i3);
            }
        }
        while (true) {
            int i4 = this._inputPtr;
            if (i4 < this._inputEnd) {
                byte[] bArr2 = this._inputBuffer;
                int i5 = i4 + 1;
                this._inputPtr = i5;
                int i6 = bArr2[i4] & 255;
                if (i6 > 32) {
                    if (i6 != 47 && i6 != 35) {
                        return i6;
                    }
                    this._inputPtr = i4;
                    return _skipWSOrEnd2();
                }
                if (i6 != 32) {
                    if (i6 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i5;
                    } else if (i6 == 13) {
                        _skipCR();
                    } else if (i6 != 9) {
                        _throwInvalidSpace(i6);
                    }
                }
            } else {
                return _skipWSOrEnd2();
            }
        }
    }

    private final int _skipWSOrEnd2() throws IOException {
        int i;
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i2 = this._inputPtr;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                i = bArr[i2] & 255;
                if (i > 32) {
                    if (i == 47) {
                        _skipComment();
                    } else if (i != 35 || !_skipYAMLComment()) {
                        break;
                    }
                } else if (i != 32) {
                    if (i == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i3;
                    } else if (i == 13) {
                        _skipCR();
                    } else if (i != 9) {
                        _throwInvalidSpace(i);
                    }
                }
            } else {
                return _eofAsNextChar();
            }
        }
        return i;
    }

    private final int _skipColon() throws IOException {
        int i = this._inputPtr;
        if (i + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        byte[] bArr = this._inputBuffer;
        byte b = bArr[i];
        if (b == 58) {
            int i2 = i + 1;
            this._inputPtr = i2;
            byte b2 = bArr[i2];
            if (b2 > 32) {
                if (b2 == 47 || b2 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i + 2;
                return b2;
            }
            if (b2 == 32 || b2 == 9) {
                int i3 = i + 2;
                this._inputPtr = i3;
                byte b3 = bArr[i3];
                if (b3 > 32) {
                    if (b3 == 47 || b3 == 35) {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i + 3;
                    return b3;
                }
            }
            return _skipColon2(true);
        }
        if (b == 32 || b == 9) {
            int i4 = i + 1;
            this._inputPtr = i4;
            b = bArr[i4];
        }
        if (b == 58) {
            int i5 = this._inputPtr;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            byte b4 = bArr[i6];
            if (b4 > 32) {
                if (b4 == 47 || b4 == 35) {
                    return _skipColon2(true);
                }
                this._inputPtr = i5 + 2;
                return b4;
            }
            if (b4 == 32 || b4 == 9) {
                int i7 = i5 + 2;
                this._inputPtr = i7;
                byte b5 = bArr[i7];
                if (b5 > 32) {
                    if (b5 == 47 || b5 == 35) {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i5 + 3;
                    return b5;
                }
            }
            return _skipColon2(true);
        }
        return _skipColon2(false);
    }

    private final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                byte[] bArr = this._inputBuffer;
                int i = this._inputPtr;
                int i2 = i + 1;
                this._inputPtr = i2;
                int i3 = bArr[i] & 255;
                if (i3 > 32) {
                    if (i3 == 47) {
                        _skipComment();
                    } else if (i3 != 35 || !_skipYAMLComment()) {
                        if (z) {
                            return i3;
                        }
                        if (i3 != 58) {
                            _reportUnexpectedChar(i3, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (i3 != 32) {
                    if (i3 == 10) {
                        this._currInputRow++;
                        this._currInputRowStart = i2;
                    } else if (i3 == 13) {
                        _skipCR();
                    } else if (i3 != 9) {
                        _throwInvalidSpace(i3);
                    }
                }
            } else {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
        }
    }

    private final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        int i2 = bArr[i] & 255;
        if (i2 == 47) {
            _skipLine();
        } else if (i2 == 42) {
            _skipCComment();
        } else {
            _reportUnexpectedChar(i2, "was expecting either '*' or '/' for a comment");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        _reportInvalidEOF(" in a comment", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0049, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void _skipCComment() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & 255;
            int i4 = inputCodeComment[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    _skipUtf8_2();
                } else if (i4 == 3) {
                    _skipUtf8_3();
                } else if (i4 == 4) {
                    _skipUtf8_4(i3);
                } else if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                } else if (i4 == 13) {
                    _skipCR();
                } else if (i4 == 42) {
                    if (i2 >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    byte[] bArr2 = this._inputBuffer;
                    int i5 = this._inputPtr;
                    if (bArr2[i5] == 47) {
                        this._inputPtr = i5 + 1;
                        return;
                    }
                } else {
                    _reportInvalidChar(i3);
                }
            }
        }
    }

    private final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    private final void _skipLine() throws IOException {
        int[] inputCodeComment = CharTypes.getInputCodeComment();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            int i3 = bArr[i] & 255;
            int i4 = inputCodeComment[i3];
            if (i4 != 0) {
                if (i4 == 2) {
                    _skipUtf8_2();
                } else if (i4 == 3) {
                    _skipUtf8_3();
                } else if (i4 == 4) {
                    _skipUtf8_4(i3);
                } else if (i4 == 10) {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                    return;
                } else if (i4 == 13) {
                    _skipCR();
                    return;
                } else if (i4 != 42 && i4 < 0) {
                    _reportInvalidChar(i3);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        byte b = bArr[i];
        if (b == 34 || b == 47 || b == 92) {
            return (char) b;
        }
        if (b == 98) {
            return '\b';
        }
        if (b == 102) {
            return '\f';
        }
        if (b == 110) {
            return '\n';
        }
        if (b == 114) {
            return '\r';
        }
        if (b == 116) {
            return '\t';
        }
        if (b != 117) {
            return _handleUnrecognizedCharacterEscape((char) _decodeCharForError(b));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            byte[] bArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            byte b2 = bArr2[i4];
            int iCharToHex = CharTypes.charToHex(b2);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(b2 & 255, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iCharToHex;
        }
        return (char) i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int _decodeCharForError(int i) throws IOException {
        char c;
        int iNextByte;
        int i2 = i & 255;
        if (i2 <= 127) {
            return i2;
        }
        if ((i & 224) != 192) {
            if ((i & 240) == 224) {
                i2 = i & 15;
                c = 2;
            } else if ((i & SnappyCompressorOutputStream.THREE_SIZE_BYTE_MARKER) == 240) {
                i2 = i & 7;
                c = 3;
            } else {
                _reportInvalidInitial(i & 255);
            }
            iNextByte = nextByte();
            if ((iNextByte & 192) != 128) {
                _reportInvalidOther(iNextByte & 255);
            }
            int i3 = (i2 << 6) | (iNextByte & 63);
            if (c > 1) {
                return i3;
            }
            int iNextByte2 = nextByte();
            if ((iNextByte2 & 192) != 128) {
                _reportInvalidOther(iNextByte2 & 255);
            }
            int i4 = (i3 << 6) | (iNextByte2 & 63);
            if (c <= 2) {
                return i4;
            }
            int iNextByte3 = nextByte();
            if ((iNextByte3 & 192) != 128) {
                _reportInvalidOther(iNextByte3 & 255);
            }
            return (i4 << 6) | (iNextByte3 & 63);
        }
        i2 = i & 31;
        c = 1;
        iNextByte = nextByte();
        if ((iNextByte & 192) != 128) {
        }
        int i32 = (i2 << 6) | (iNextByte & 63);
        if (c > 1) {
        }
    }

    private final int _decodeUtf8_2(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b & 255, i3);
        }
        return ((i & 31) << 6) | (b & 63);
    }

    private final int _decodeUtf8_3(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b2 = bArr2[i6];
        if ((b2 & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    public final int _decodeUtf8_3fast(int i) throws IOException {
        int i2 = i & 15;
        byte[] bArr = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b = bArr[i3];
        if ((b & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b & 255, i4);
        }
        int i5 = (i2 << 6) | (b & 63);
        byte[] bArr2 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b2 = bArr2[i6];
        if ((b2 & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b2 & 255, i7);
        }
        return (i5 << 6) | (b2 & 63);
    }

    private final int _decodeUtf8_4(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b & 255, i3);
        }
        int i4 = ((i & 7) << 6) | (b & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i5 = this._inputPtr;
        int i6 = i5 + 1;
        this._inputPtr = i6;
        byte b2 = bArr2[i5];
        if ((b2 & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b2 & 255, i6);
        }
        int i7 = (i4 << 6) | (b2 & 63);
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i8 = this._inputPtr;
        int i9 = i8 + 1;
        this._inputPtr = i9;
        byte b3 = bArr3[i8];
        if ((b3 & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b3 & 255, i9);
        }
        return ((i7 << 6) | (b3 & 63)) - 65536;
    }

    private final void _skipUtf8_2() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b & 255, i2);
        }
    }

    private final void _skipUtf8_3() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        byte b = bArr[i];
        if ((b & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b & 255, i2);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i3 = this._inputPtr;
        int i4 = i3 + 1;
        this._inputPtr = i4;
        byte b2 = bArr2[i3];
        if ((b2 & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b2 & 255, i4);
        }
    }

    public final void _skipUtf8_4(int i) throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i2 = this._inputPtr;
        int i3 = i2 + 1;
        this._inputPtr = i3;
        byte b = bArr[i2];
        if ((b & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b & 255, i3);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        int i5 = i4 + 1;
        this._inputPtr = i5;
        byte b2 = bArr2[i4];
        if ((b2 & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b2 & 255, i5);
        }
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr3 = this._inputBuffer;
        int i6 = this._inputPtr;
        int i7 = i6 + 1;
        this._inputPtr = i7;
        byte b3 = bArr3[i6];
        if ((b3 & ExifInterface.MARKER_SOF0) != 128) {
            _reportInvalidOther(b3 & 255, i7);
        }
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            if (bArr[i] == 10) {
                this._inputPtr = i + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public final int nextByte() throws IOException {
        if (this._inputPtr >= this._inputEnd) {
            _loadMoreGuaranteed();
        }
        byte[] bArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return bArr[i] & 255;
    }

    public void _reportInvalidToken(String str, int i) throws IOException {
        this._inputPtr = i;
        _reportInvalidToken(str, _validJsonTokenList());
    }

    public void _reportInvalidToken(String str) throws IOException {
        _reportInvalidToken(str, _validJsonTokenList());
    }

    public void _reportInvalidToken(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c_decodeCharForError = (char) _decodeCharForError(bArr[i]);
            if (!Character.isJavaIdentifierPart(c_decodeCharForError)) {
                break;
            }
            sb.append(c_decodeCharForError);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
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

    public void _reportInvalidOther(int i) throws JsonParseException {
        _reportError("Invalid UTF-8 middle byte 0x" + Integer.toHexString(i));
    }

    public void _reportInvalidOther(int i, int i2) throws JsonParseException {
        this._inputPtr = i2;
        _reportInvalidOther(i);
    }

    public final byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            int i2 = bArr[i] & 255;
            if (i2 > 32) {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(i2);
                if (iDecodeBase64Char < 0) {
                    if (i2 == 34) {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, i2, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr2 = this._inputBuffer;
                int i3 = this._inputPtr;
                this._inputPtr = i3 + 1;
                int i4 = bArr2[i3] & 255;
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(i4);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, i4, 1);
                }
                int i5 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr3 = this._inputBuffer;
                int i6 = this._inputPtr;
                this._inputPtr = i6 + 1;
                int i7 = bArr3[i6] & 255;
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(i7);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (i7 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.append(i5 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, i7, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        byte[] bArr4 = this._inputBuffer;
                        int i8 = this._inputPtr;
                        this._inputPtr = i8 + 1;
                        int i9 = bArr4[i8] & 255;
                        if (!base64Variant.usesPaddingChar(i9) && _decodeBase64Escape(base64Variant, i9, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, i9, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i5 >> 4);
                    }
                }
                int i10 = (i5 << 6) | iDecodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                byte[] bArr5 = this._inputBuffer;
                int i11 = this._inputPtr;
                this._inputPtr = i11 + 1;
                int i12 = bArr5[i11] & 255;
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(i12);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (i12 == 34) {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i10 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, i12, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i10 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i10 << 6) | iDecodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), this._currInputProcessed + (this._nameStartOffset - 1), -1L, this._nameStartRow, this._nameStartCol);
        }
        return new JsonLocation(_contentReference(), this._tokenInputTotal - 1, -1L, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_contentReference(), this._currInputProcessed + this._inputPtr, -1L, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    private final void _updateLocation() {
        this._tokenInputRow = this._currInputRow;
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i;
        this._tokenInputCol = i - this._currInputRowStart;
    }

    private final void _updateNameLocation() {
        this._nameStartRow = this._currInputRow;
        int i = this._inputPtr;
        this._nameStartOffset = i;
        this._nameStartCol = i - this._currInputRowStart;
    }

    public final JsonToken _closeScope(int i) throws JsonParseException {
        if (i == 125) {
            _closeObjectScope();
            JsonToken jsonToken = JsonToken.END_OBJECT;
            this._currToken = jsonToken;
            return jsonToken;
        }
        _closeArrayScope();
        JsonToken jsonToken2 = JsonToken.END_ARRAY;
        this._currToken = jsonToken2;
        return jsonToken2;
    }

    public final void _closeArrayScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inArray()) {
            _reportMismatchedEndMarker(93, '}');
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }

    public final void _closeObjectScope() throws JsonParseException {
        _updateLocation();
        if (!this._parsingContext.inObject()) {
            _reportMismatchedEndMarker(125, AbstractJsonLexerKt.END_LIST);
        }
        this._parsingContext = this._parsingContext.clearAndGetParent();
    }
}
