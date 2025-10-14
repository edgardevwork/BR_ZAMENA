package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.StreamReadCapability;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.p022io.CharTypes;
import com.fasterxml.jackson.core.p022io.IOContext;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.JacksonFeatureSet;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class ReaderBasedJsonParser extends ParserBase {
    public boolean _bufferRecyclable;
    public final int _hashSeed;
    public char[] _inputBuffer;
    public int _nameStartCol;
    public long _nameStartOffset;
    public int _nameStartRow;
    public ObjectCodec _objectCodec;
    public Reader _reader;
    public final CharsToNameCanonicalizer _symbols;
    public boolean _tokenIncomplete;
    public static final int FEAT_MASK_TRAILING_COMMA = JsonParser.Feature.ALLOW_TRAILING_COMMA.getMask();
    public static final int FEAT_MASK_LEADING_ZEROS = JsonParser.Feature.ALLOW_NUMERIC_LEADING_ZEROS.getMask();
    public static final int FEAT_MASK_NON_NUM_NUMBERS = JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS.getMask();
    public static final int FEAT_MASK_ALLOW_MISSING = JsonParser.Feature.ALLOW_MISSING_VALUES.getMask();
    public static final int FEAT_MASK_ALLOW_SINGLE_QUOTES = JsonParser.Feature.ALLOW_SINGLE_QUOTES.getMask();
    public static final int FEAT_MASK_ALLOW_UNQUOTED_NAMES = JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES.getMask();
    public static final int FEAT_MASK_ALLOW_JAVA_COMMENTS = JsonParser.Feature.ALLOW_COMMENTS.getMask();
    public static final int FEAT_MASK_ALLOW_YAML_COMMENTS = JsonParser.Feature.ALLOW_YAML_COMMENTS.getMask();
    public static final int[] _icLatin1 = CharTypes.getInputCodeLatin1();

    public ReaderBasedJsonParser(IOContext iOContext, int i, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer, char[] cArr, int i2, int i3, boolean z) {
        super(iOContext, i);
        this._reader = reader;
        this._objectCodec = objectCodec;
        this._inputBuffer = cArr;
        this._inputPtr = i2;
        this._inputEnd = i3;
        this._currInputRowStart = i2;
        this._currInputProcessed = -i2;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = z;
    }

    public ReaderBasedJsonParser(IOContext iOContext, int i, Reader reader, ObjectCodec objectCodec, CharsToNameCanonicalizer charsToNameCanonicalizer) {
        super(iOContext, i);
        this._reader = reader;
        this._inputBuffer = iOContext.allocTokenBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._objectCodec = objectCodec;
        this._symbols = charsToNameCanonicalizer;
        this._hashSeed = charsToNameCanonicalizer.hashSeed();
        this._bufferRecyclable = true;
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
    public int releaseBuffered(Writer writer) throws IOException {
        int i = this._inputEnd;
        int i2 = this._inputPtr;
        int i3 = i - i2;
        if (i3 < 1) {
            return 0;
        }
        this._inputPtr = i2 + i3;
        writer.write(this._inputBuffer, i2, i3);
        return i3;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public Object getInputSource() {
        return this._reader;
    }

    @Deprecated
    public char getNextChar(String str) throws IOException {
        return getNextChar(str, null);
    }

    public char getNextChar(String str, JsonToken jsonToken) throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(str, jsonToken);
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        return cArr[i];
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _closeInput() throws IOException {
        if (this._reader != null) {
            if (this._ioContext.isResourceManaged() || isEnabled(JsonParser.Feature.AUTO_CLOSE_SOURCE)) {
                this._reader.close();
            }
            this._reader = null;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public void _releaseBuffers() throws IOException {
        char[] cArr;
        super._releaseBuffers();
        this._symbols.release();
        if (!this._bufferRecyclable || (cArr = this._inputBuffer) == null) {
            return;
        }
        this._inputBuffer = null;
        this._ioContext.releaseTokenBuffer(cArr);
    }

    public void _loadMoreGuaranteed() throws IOException {
        if (_loadMore()) {
            return;
        }
        _reportInvalidEOF();
    }

    public boolean _loadMore() throws IOException {
        Reader reader = this._reader;
        if (reader != null) {
            char[] cArr = this._inputBuffer;
            int i = reader.read(cArr, 0, cArr.length);
            if (i > 0) {
                int i2 = this._inputEnd;
                long j = i2;
                this._currInputProcessed += j;
                this._currInputRowStart -= i2;
                this._nameStartOffset -= j;
                this._inputPtr = 0;
                this._inputEnd = i;
                return true;
            }
            _closeInput();
            if (i == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this._inputEnd);
            }
        }
        return false;
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getText() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
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
    public final String getValueAsString() throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(null);
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final String getValueAsString(String str) throws IOException {
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_STRING) {
            if (this._tokenIncomplete) {
                this._tokenIncomplete = false;
                _finishString();
            }
            return this._textBuffer.contentsAsString();
        }
        if (jsonToken == JsonToken.FIELD_NAME) {
            return getCurrentName();
        }
        return super.getValueAsString(str);
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
    public final char[] getTextCharacters() throws IOException {
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
    public final int getTextLength() throws IOException {
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

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0011, code lost:
    
        if (r0 != 8) goto L33;
     */
    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int getTextOffset() throws IOException {
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
        byte[] bArr;
        JsonToken jsonToken = this._currToken;
        if (jsonToken == JsonToken.VALUE_EMBEDDED_OBJECT && (bArr = this._binaryValue) != null) {
            return bArr;
        }
        if (jsonToken != JsonToken.VALUE_STRING) {
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

    /* JADX WARN: Code restructure failed: missing block: B:138:0x0123, code lost:
    
        r16._tokenIncomplete = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0125, code lost:
    
        if (r7 <= 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0127, code lost:
    
        r8 = r8 + r7;
        r18.write(r19, 0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x012b, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x003c  */
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
            char[] cArr = this._inputBuffer;
            int i5 = this._inputPtr;
            this._inputPtr = i5 + 1;
            char c = cArr[i5];
            if (c > ' ') {
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c);
                if (iDecodeBase64Char4 < 0) {
                    if (c == '\"') {
                        break;
                    }
                    iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, c, 0);
                    if (iDecodeBase64Char4 < 0) {
                    }
                    if (i3 > length) {
                    }
                    if (this._inputPtr >= this._inputEnd) {
                    }
                    char[] cArr2 = this._inputBuffer;
                    int i6 = this._inputPtr;
                    this._inputPtr = i6 + 1;
                    char c2 = cArr2[i6];
                    iDecodeBase64Char = base64Variant.decodeBase64Char(c2);
                    if (iDecodeBase64Char < 0) {
                    }
                    int i7 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                    if (this._inputPtr >= this._inputEnd) {
                    }
                    char[] cArr3 = this._inputBuffer;
                    int i8 = this._inputPtr;
                    this._inputPtr = i8 + 1;
                    char c3 = cArr3[i8];
                    iDecodeBase64Char2 = base64Variant.decodeBase64Char(c3);
                    if (iDecodeBase64Char2 < 0) {
                    }
                    int i9 = (i7 << 6) | iDecodeBase64Char2;
                    if (this._inputPtr >= this._inputEnd) {
                    }
                    char[] cArr4 = this._inputBuffer;
                    int i10 = this._inputPtr;
                    this._inputPtr = i10 + 1;
                    char c4 = cArr4[i10];
                    iDecodeBase64Char3 = base64Variant.decodeBase64Char(c4);
                    if (iDecodeBase64Char3 >= 0) {
                    }
                    int i11 = (i9 << 6) | iDecodeBase64Char3;
                    bArr[i3] = (byte) (i11 >> 16);
                    int i12 = i3 + 2;
                    bArr[i3 + 1] = (byte) (i11 >> 8);
                    i3 += 3;
                    bArr[i12] = (byte) i11;
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
                    char[] cArr22 = this._inputBuffer;
                    int i62 = this._inputPtr;
                    this._inputPtr = i62 + 1;
                    char c22 = cArr22[i62];
                    iDecodeBase64Char = base64Variant.decodeBase64Char(c22);
                    if (iDecodeBase64Char < 0) {
                        iDecodeBase64Char = _decodeBase64Escape(base64Variant, c22, 1);
                    }
                    int i72 = (iDecodeBase64Char4 << 6) | iDecodeBase64Char;
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    char[] cArr32 = this._inputBuffer;
                    int i82 = this._inputPtr;
                    this._inputPtr = i82 + 1;
                    char c32 = cArr32[i82];
                    iDecodeBase64Char2 = base64Variant.decodeBase64Char(c32);
                    if (iDecodeBase64Char2 < 0) {
                        if (iDecodeBase64Char2 != -2) {
                            if (c32 == '\"') {
                                int i13 = i3 + 1;
                                bArr[i3] = (byte) (i72 >> 4);
                                if (base64Variant.usesPadding()) {
                                    this._inputPtr--;
                                    _handleBase64MissingPadding(base64Variant);
                                }
                                i3 = i13;
                            } else {
                                iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, c32, 2);
                            }
                        }
                        if (iDecodeBase64Char2 == -2) {
                            if (this._inputPtr >= this._inputEnd) {
                                _loadMoreGuaranteed();
                            }
                            char[] cArr5 = this._inputBuffer;
                            int i14 = this._inputPtr;
                            this._inputPtr = i14 + 1;
                            char c5 = cArr5[i14];
                            if (!base64Variant.usesPaddingChar(c5) && _decodeBase64Escape(base64Variant, c5, i2) != -2) {
                                throw reportInvalidBase64Char(base64Variant, c5, i2, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                            }
                            bArr[i3] = (byte) (i72 >> 4);
                            i3++;
                        }
                    }
                    int i92 = (i72 << 6) | iDecodeBase64Char2;
                    if (this._inputPtr >= this._inputEnd) {
                        _loadMoreGuaranteed();
                    }
                    char[] cArr42 = this._inputBuffer;
                    int i102 = this._inputPtr;
                    this._inputPtr = i102 + 1;
                    char c42 = cArr42[i102];
                    iDecodeBase64Char3 = base64Variant.decodeBase64Char(c42);
                    if (iDecodeBase64Char3 >= 0) {
                        if (iDecodeBase64Char3 == -2) {
                            i = 3;
                        } else if (c42 == '\"') {
                            int i15 = i3 + 1;
                            bArr[i3] = (byte) (i92 >> 10);
                            i3 += 2;
                            bArr[i15] = (byte) (i92 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                        } else {
                            i = 3;
                            iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, c42, 3);
                        }
                        if (iDecodeBase64Char3 == -2) {
                            int i16 = i3 + 1;
                            bArr[i3] = (byte) (i92 >> 10);
                            i3 += 2;
                            bArr[i16] = (byte) (i92 >> 2);
                        }
                        i2 = i;
                    } else {
                        i = 3;
                    }
                    int i112 = (i92 << 6) | iDecodeBase64Char3;
                    bArr[i3] = (byte) (i112 >> 16);
                    int i122 = i3 + 2;
                    bArr[i3 + 1] = (byte) (i112 >> 8);
                    i3 += 3;
                    bArr[i122] = (byte) i112;
                    i2 = i;
                }
            }
            i = i2;
            i2 = i;
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserMinimalBase, com.fasterxml.jackson.core.JsonParser
    public final JsonToken nextToken() throws IOException {
        JsonToken jsonToken_handleOddValue;
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
        if (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125) {
            _closeScope(i_skipWSOrEnd);
            return this._currToken;
        }
        if (this._parsingContext.expectComma()) {
            i_skipWSOrEnd = _skipComma(i_skipWSOrEnd);
            if ((this._features & FEAT_MASK_TRAILING_COMMA) != 0 && (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125)) {
                _closeScope(i_skipWSOrEnd);
                return this._currToken;
            }
        }
        boolean zInObject = this._parsingContext.inObject();
        if (zInObject) {
            _updateNameLocation();
            this._parsingContext.setCurrentName(i_skipWSOrEnd == 34 ? _parseName() : _handleOddName(i_skipWSOrEnd));
            this._currToken = jsonToken2;
            i_skipWSOrEnd = _skipColon();
        }
        _updateLocation();
        if (i_skipWSOrEnd == 34) {
            this._tokenIncomplete = true;
            jsonToken_handleOddValue = JsonToken.VALUE_STRING;
        } else if (i_skipWSOrEnd != 43) {
            if (i_skipWSOrEnd == 91) {
                if (!zInObject) {
                    this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
                }
                jsonToken_handleOddValue = JsonToken.START_ARRAY;
            } else if (i_skipWSOrEnd == 102) {
                _matchFalse();
                jsonToken_handleOddValue = JsonToken.VALUE_FALSE;
            } else if (i_skipWSOrEnd == 110) {
                _matchNull();
                jsonToken_handleOddValue = JsonToken.VALUE_NULL;
            } else if (i_skipWSOrEnd == 116) {
                _matchTrue();
                jsonToken_handleOddValue = JsonToken.VALUE_TRUE;
            } else if (i_skipWSOrEnd == 123) {
                if (!zInObject) {
                    this._parsingContext = this._parsingContext.createChildObjectContext(this._tokenInputRow, this._tokenInputCol);
                }
                jsonToken_handleOddValue = JsonToken.START_OBJECT;
            } else if (i_skipWSOrEnd == 125) {
                _reportUnexpectedChar(i_skipWSOrEnd, "expected a value");
                _matchTrue();
                jsonToken_handleOddValue = JsonToken.VALUE_TRUE;
            } else if (i_skipWSOrEnd == 45) {
                jsonToken_handleOddValue = _parseSignedNumber(true);
            } else if (i_skipWSOrEnd == 46) {
                jsonToken_handleOddValue = _parseFloatThatStartsWithPeriod(false);
            } else {
                switch (i_skipWSOrEnd) {
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
                        jsonToken_handleOddValue = _parseUnsignedNumber(i_skipWSOrEnd);
                        break;
                    default:
                        jsonToken_handleOddValue = _handleOddValue(i_skipWSOrEnd);
                        break;
                }
            }
        } else if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonToken_handleOddValue = _parseSignedNumber(false);
        } else {
            jsonToken_handleOddValue = _handleOddValue(i_skipWSOrEnd);
        }
        if (zInObject) {
            this._nextToken = jsonToken_handleOddValue;
            return this._currToken;
        }
        this._currToken = jsonToken_handleOddValue;
        return jsonToken_handleOddValue;
    }

    public final JsonToken _nextAfterName() {
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
        if (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125) {
            _closeScope(i_skipWSOrEnd);
            return false;
        }
        if (this._parsingContext.expectComma()) {
            i_skipWSOrEnd = _skipComma(i_skipWSOrEnd);
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
            char[] cArrAsQuotedChars = serializableString.asQuotedChars();
            int length = cArrAsQuotedChars.length;
            int i2 = this._inputPtr;
            if (i2 + length + 4 < this._inputEnd) {
                int i3 = length + i2;
                if (this._inputBuffer[i3] == '\"') {
                    while (i2 != i3) {
                        if (cArrAsQuotedChars[i] == this._inputBuffer[i2]) {
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
        return _isNextTokenNameMaybe(i_skipWSOrEnd, serializableString.getValue());
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public String nextFieldName() throws IOException {
        JsonToken jsonToken_handleOddValue;
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
        if (i_skipWSOrEnd == 93 || i_skipWSOrEnd == 125) {
            _closeScope(i_skipWSOrEnd);
            return null;
        }
        if (this._parsingContext.expectComma()) {
            i_skipWSOrEnd = _skipComma(i_skipWSOrEnd);
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
        String str_parseName = i_skipWSOrEnd == 34 ? _parseName() : _handleOddName(i_skipWSOrEnd);
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
                jsonToken_handleOddValue = JsonToken.START_ARRAY;
            } else if (i_skipColon == 102) {
                _matchFalse();
                jsonToken_handleOddValue = JsonToken.VALUE_FALSE;
            } else if (i_skipColon == 110) {
                _matchNull();
                jsonToken_handleOddValue = JsonToken.VALUE_NULL;
            } else if (i_skipColon == 116) {
                _matchTrue();
                jsonToken_handleOddValue = JsonToken.VALUE_TRUE;
            } else if (i_skipColon == 123) {
                jsonToken_handleOddValue = JsonToken.START_OBJECT;
            } else if (i_skipColon == 45) {
                jsonToken_handleOddValue = _parseSignedNumber(true);
            } else if (i_skipColon == 46) {
                jsonToken_handleOddValue = _parseFloatThatStartsWithPeriod(false);
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
                        jsonToken_handleOddValue = _parseUnsignedNumber(i_skipColon);
                        break;
                    default:
                        jsonToken_handleOddValue = _handleOddValue(i_skipColon);
                        break;
                }
            }
        } else if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonToken_handleOddValue = _parseSignedNumber(false);
        } else {
            jsonToken_handleOddValue = _handleOddValue(i_skipColon);
        }
        this._nextToken = jsonToken_handleOddValue;
        return str_parseName;
    }

    public final void _isNextTokenNameYes(int i) throws IOException {
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
                this._nextToken = _handleOddValue(i);
                return;
            }
        }
        if (i == 91) {
            this._nextToken = JsonToken.START_ARRAY;
            return;
        }
        if (i == 102) {
            _matchToken("false", 1);
            this._nextToken = JsonToken.VALUE_FALSE;
            return;
        }
        if (i == 110) {
            _matchToken("null", 1);
            this._nextToken = JsonToken.VALUE_NULL;
            return;
        }
        if (i == 116) {
            _matchToken("true", 1);
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
            this._nextToken = _parseFloatThatStartsWithPeriod(false);
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
                this._nextToken = _handleOddValue(i);
                break;
        }
    }

    public boolean _isNextTokenNameMaybe(int i, String str) throws IOException {
        JsonToken jsonToken_handleOddValue;
        String str_parseName = i == 34 ? _parseName() : _handleOddName(i);
        this._parsingContext.setCurrentName(str_parseName);
        this._currToken = JsonToken.FIELD_NAME;
        int i_skipColon = _skipColon();
        _updateLocation();
        if (i_skipColon == 34) {
            this._tokenIncomplete = true;
            this._nextToken = JsonToken.VALUE_STRING;
            return str.equals(str_parseName);
        }
        if (i_skipColon != 43) {
            if (i_skipColon == 91) {
                jsonToken_handleOddValue = JsonToken.START_ARRAY;
            } else if (i_skipColon == 102) {
                _matchFalse();
                jsonToken_handleOddValue = JsonToken.VALUE_FALSE;
            } else if (i_skipColon == 110) {
                _matchNull();
                jsonToken_handleOddValue = JsonToken.VALUE_NULL;
            } else if (i_skipColon == 116) {
                _matchTrue();
                jsonToken_handleOddValue = JsonToken.VALUE_TRUE;
            } else if (i_skipColon == 123) {
                jsonToken_handleOddValue = JsonToken.START_OBJECT;
            } else if (i_skipColon == 45) {
                jsonToken_handleOddValue = _parseSignedNumber(true);
            } else if (i_skipColon == 46) {
                jsonToken_handleOddValue = _parseFloatThatStartsWithPeriod(false);
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
                        jsonToken_handleOddValue = _parseUnsignedNumber(i_skipColon);
                        break;
                    default:
                        jsonToken_handleOddValue = _handleOddValue(i_skipColon);
                        break;
                }
            }
        } else if (isEnabled(JsonReadFeature.ALLOW_LEADING_PLUS_SIGN_FOR_NUMBERS.mappedFeature())) {
            jsonToken_handleOddValue = _parseSignedNumber(false);
        } else {
            jsonToken_handleOddValue = _handleOddValue(i_skipColon);
        }
        this._nextToken = jsonToken_handleOddValue;
        return str.equals(str_parseName);
    }

    public final JsonToken _nextTokenNotInObject(int i) throws IOException {
        if (i == 34) {
            this._tokenIncomplete = true;
            JsonToken jsonToken = JsonToken.VALUE_STRING;
            this._currToken = jsonToken;
            return jsonToken;
        }
        if (i == 91) {
            this._parsingContext = this._parsingContext.createChildArrayContext(this._tokenInputRow, this._tokenInputCol);
            JsonToken jsonToken2 = JsonToken.START_ARRAY;
            this._currToken = jsonToken2;
            return jsonToken2;
        }
        if (i == 102) {
            _matchToken("false", 1);
            JsonToken jsonToken3 = JsonToken.VALUE_FALSE;
            this._currToken = jsonToken3;
            return jsonToken3;
        }
        if (i == 110) {
            _matchToken("null", 1);
            JsonToken jsonToken4 = JsonToken.VALUE_NULL;
            this._currToken = jsonToken4;
            return jsonToken4;
        }
        if (i == 116) {
            _matchToken("true", 1);
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
        switch (i) {
            case 44:
                if (!this._parsingContext.inRoot() && (this._features & FEAT_MASK_ALLOW_MISSING) != 0) {
                    this._inputPtr--;
                    JsonToken jsonToken7 = JsonToken.VALUE_NULL;
                    this._currToken = jsonToken7;
                    return jsonToken7;
                }
                break;
            case 45:
                JsonToken jsonToken_parseSignedNumber = _parseSignedNumber(true);
                this._currToken = jsonToken_parseSignedNumber;
                return jsonToken_parseSignedNumber;
            case 46:
                JsonToken jsonToken_parseFloatThatStartsWithPeriod = _parseFloatThatStartsWithPeriod(false);
                this._currToken = jsonToken_parseFloatThatStartsWithPeriod;
                return jsonToken_parseFloatThatStartsWithPeriod;
            default:
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
                }
        }
        JsonToken jsonToken_handleOddValue = _handleOddValue(i);
        this._currToken = jsonToken_handleOddValue;
        return jsonToken_handleOddValue;
    }

    @Override // com.fasterxml.jackson.core.JsonParser
    public final String nextTextValue() throws IOException {
        if (this._currToken == JsonToken.FIELD_NAME) {
            this._nameCopied = false;
            JsonToken jsonToken = this._nextToken;
            this._nextToken = null;
            this._currToken = jsonToken;
            if (jsonToken == JsonToken.VALUE_STRING) {
                if (this._tokenIncomplete) {
                    this._tokenIncomplete = false;
                    _finishString();
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
    public final int nextIntValue(int i) throws IOException {
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
    public final long nextLongValue(long j) throws IOException {
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
    public final Boolean nextBooleanValue() throws IOException {
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
        if (jsonTokenNextToken != null) {
            int iM1012id = jsonTokenNextToken.m1012id();
            if (iM1012id == 9) {
                return Boolean.TRUE;
            }
            if (iM1012id == 10) {
                return Boolean.FALSE;
            }
        }
        return null;
    }

    @Deprecated
    public final JsonToken _parseFloatThatStartsWithPeriod() throws IOException {
        return _parseFloatThatStartsWithPeriod(false);
    }

    public final JsonToken _parseFloatThatStartsWithPeriod(boolean z) throws IOException {
        if (!isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleOddValue(46);
        }
        int i = this._inputPtr;
        int i2 = i - 1;
        if (z) {
            i2 = i - 2;
        }
        return _parseFloat(46, i2, i, z, 0);
    }

    public final JsonToken _parseUnsignedNumber(int i) throws IOException {
        int i2 = this._inputPtr;
        int i3 = i2 - 1;
        int i4 = this._inputEnd;
        if (i == 48) {
            return _parseNumber2(false, i3);
        }
        int i5 = 1;
        while (i2 < i4) {
            int i6 = i2 + 1;
            char c = this._inputBuffer[i2];
            if (c < '0' || c > '9') {
                if (c == '.' || c == 'e' || c == 'E') {
                    this._inputPtr = i6;
                    return _parseFloat(c, i3, i6, false, i5);
                }
                this._inputPtr = i2;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i3, i2 - i3);
                return resetInt(false, i5);
            }
            i5++;
            i2 = i6;
        }
        this._inputPtr = i3;
        return _parseNumber2(false, i3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public final com.fasterxml.jackson.core.JsonToken _parseFloat(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v18 ??, r10v12 ??, r10v6 ??, r10v5 ??, r10v3 ??, r10v10 ??, r10v9 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    public final JsonToken _parseSignedNumber(boolean z) throws IOException {
        int i = this._inputPtr;
        int i2 = z ? i - 1 : i;
        int i3 = this._inputEnd;
        if (i >= i3) {
            return _parseNumber2(z, i2);
        }
        int i4 = i + 1;
        char c = this._inputBuffer[i];
        if (c > '9' || c < '0') {
            this._inputPtr = i4;
            if (c == '.') {
                return _parseFloatThatStartsWithPeriod(z);
            }
            return _handleInvalidNumberStart(c, z, true);
        }
        if (c == '0') {
            return _parseNumber2(z, i2);
        }
        int i5 = 1;
        while (i4 < i3) {
            int i6 = i4 + 1;
            char c2 = this._inputBuffer[i4];
            if (c2 < '0' || c2 > '9') {
                if (c2 == '.' || c2 == 'e' || c2 == 'E') {
                    this._inputPtr = i6;
                    return _parseFloat(c2, i2, i6, z, i5);
                }
                this._inputPtr = i4;
                if (this._parsingContext.inRoot()) {
                    _verifyRootSpace(c2);
                }
                this._textBuffer.resetWithShared(this._inputBuffer, i2, i4 - i2);
                return resetInt(z, i5);
            }
            i5++;
            i4 = i6;
        }
        return _parseNumber2(z, i2);
    }

    public final JsonToken _parseNumber2(boolean z, int i) throws IOException {
        int i2;
        char nextChar;
        boolean z2;
        int i3;
        char nextChar2;
        if (z) {
            i++;
        }
        this._inputPtr = i;
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        if (z) {
            cArrEmptyAndGetCurrentSegment[0] = '-';
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i4 = this._inputPtr;
        if (i4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            this._inputPtr = i4 + 1;
            nextChar = cArr[i4];
        } else {
            nextChar = getNextChar("No digit following minus sign", JsonToken.VALUE_NUMBER_INT);
        }
        if (nextChar == '0') {
            nextChar = _verifyNoLeadingZeroes();
        }
        int i5 = 0;
        while (nextChar >= '0' && nextChar <= '9') {
            i5++;
            if (i2 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i6 = i2 + 1;
            cArrEmptyAndGetCurrentSegment[i2] = nextChar;
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                nextChar = 0;
                i2 = i6;
                z2 = true;
                break;
            }
            char[] cArr2 = this._inputBuffer;
            int i7 = this._inputPtr;
            this._inputPtr = i7 + 1;
            nextChar = cArr2[i7];
            i2 = i6;
        }
        z2 = false;
        if (i5 == 0 && !isEnabled(JsonReadFeature.ALLOW_LEADING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
            return _handleInvalidNumberStart(nextChar, z);
        }
        int i8 = -1;
        if (nextChar == '.') {
            if (i2 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            cArrEmptyAndGetCurrentSegment[i2] = nextChar;
            i2++;
            i3 = 0;
            while (true) {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    z2 = true;
                    break;
                }
                char[] cArr3 = this._inputBuffer;
                int i9 = this._inputPtr;
                this._inputPtr = i9 + 1;
                nextChar = cArr3[i9];
                if (nextChar < '0' || nextChar > '9') {
                    break;
                }
                i3++;
                if (i2 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i2 = 0;
                }
                cArrEmptyAndGetCurrentSegment[i2] = nextChar;
                i2++;
            }
            if (i3 == 0 && !isEnabled(JsonReadFeature.ALLOW_TRAILING_DECIMAL_POINT_FOR_NUMBERS.mappedFeature())) {
                _reportUnexpectedNumberChar(nextChar, "Decimal point not followed by a digit");
            }
        } else {
            i3 = -1;
        }
        if (nextChar == 'e' || nextChar == 'E') {
            if (i2 >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                i2 = 0;
            }
            int i10 = i2 + 1;
            cArrEmptyAndGetCurrentSegment[i2] = nextChar;
            int i11 = this._inputPtr;
            if (i11 < this._inputEnd) {
                char[] cArr4 = this._inputBuffer;
                this._inputPtr = i11 + 1;
                nextChar2 = cArr4[i11];
            } else {
                nextChar2 = getNextChar("expected a digit for number exponent", JsonToken.VALUE_NUMBER_FLOAT);
            }
            if (nextChar2 == '-' || nextChar2 == '+') {
                if (i10 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i10 = 0;
                }
                int i12 = i10 + 1;
                cArrEmptyAndGetCurrentSegment[i10] = nextChar2;
                int i13 = this._inputPtr;
                if (i13 < this._inputEnd) {
                    char[] cArr5 = this._inputBuffer;
                    this._inputPtr = i13 + 1;
                    nextChar2 = cArr5[i13];
                } else {
                    nextChar2 = getNextChar("expected a digit for number exponent", JsonToken.VALUE_NUMBER_FLOAT);
                }
                i10 = i12;
            }
            int i14 = 0;
            nextChar = nextChar2;
            while (nextChar <= '9' && nextChar >= '0') {
                i14++;
                if (i10 >= cArrEmptyAndGetCurrentSegment.length) {
                    cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                    i10 = 0;
                }
                i2 = i10 + 1;
                cArrEmptyAndGetCurrentSegment[i10] = nextChar;
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    i8 = i14;
                    z2 = true;
                    break;
                }
                char[] cArr6 = this._inputBuffer;
                int i15 = this._inputPtr;
                this._inputPtr = i15 + 1;
                nextChar = cArr6[i15];
                i10 = i2;
            }
            i2 = i10;
            i8 = i14;
            if (i8 == 0) {
                _reportUnexpectedNumberChar(nextChar, "Exponent indicator not followed by a digit");
            }
        }
        if (!z2) {
            this._inputPtr--;
            if (this._parsingContext.inRoot()) {
                _verifyRootSpace(nextChar);
            }
        }
        this._textBuffer.setCurrentLength(i2);
        if (i3 < 0 && i8 < 0) {
            return resetInt(z, i5);
        }
        return resetFloat(z, i5, i3, i8);
    }

    public final char _verifyNoLeadingZeroes() throws IOException {
        char c;
        int i = this._inputPtr;
        if (i >= this._inputEnd || ((c = this._inputBuffer[i]) >= '0' && c <= '9')) {
            return _verifyNLZ2();
        }
        return '0';
    }

    public final char _verifyNLZ2() throws IOException {
        char c;
        if ((this._inputPtr >= this._inputEnd && !_loadMore()) || (c = this._inputBuffer[this._inputPtr]) < '0' || c > '9') {
            return '0';
        }
        if ((this._features & FEAT_MASK_LEADING_ZEROS) == 0) {
            reportInvalidNumber("Leading zeroes not allowed");
        }
        this._inputPtr++;
        if (c == '0') {
            do {
                if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                    break;
                }
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                c = cArr[i];
                if (c < '0' || c > '9') {
                    return '0';
                }
                this._inputPtr = i + 1;
            } while (c == '0');
        }
        return c;
    }

    public JsonToken _handleInvalidNumberStart(int i, boolean z) throws IOException {
        return _handleInvalidNumberStart(i, z, false);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public com.fasterxml.jackson.core.JsonToken _handleInvalidNumberStart(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:405)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:79)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:401)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:389)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:339)
        */

    public final void _verifyRootSpace(int i) throws IOException {
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

    public final String _parseName() throws IOException {
        int i = this._inputPtr;
        int i2 = this._hashSeed;
        int[] iArr = _icLatin1;
        while (true) {
            if (i >= this._inputEnd) {
                break;
            }
            char[] cArr = this._inputBuffer;
            char c = cArr[i];
            if (c >= iArr.length || iArr[c] == 0) {
                i2 = (i2 * 33) + c;
                i++;
            } else if (c == '\"') {
                int i3 = this._inputPtr;
                this._inputPtr = i + 1;
                return this._symbols.findSymbol(cArr, i3, i - i3, i2);
            }
        }
        int i4 = this._inputPtr;
        this._inputPtr = i;
        return _parseName2(i4, i2, 34);
    }

    public final String _parseName2(int i, int i2, int i3) throws IOException {
        this._textBuffer.resetWithShared(this._inputBuffer, i, this._inputPtr - i);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in field name", JsonToken.FIELD_NAME);
            }
            char[] cArr = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c_decodeEscaped = cArr[i4];
            if (c_decodeEscaped <= '\\') {
                if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped <= i3) {
                    if (c_decodeEscaped == i3) {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        TextBuffer textBuffer = this._textBuffer;
                        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i2);
                    }
                    if (c_decodeEscaped < ' ') {
                        _throwUnquotedSpace(c_decodeEscaped, "name");
                    }
                }
            }
            i2 = (i2 * 33) + c_decodeEscaped;
            int i5 = currentSegmentSize + 1;
            currentSegment[currentSegmentSize] = c_decodeEscaped;
            if (i5 >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            } else {
                currentSegmentSize = i5;
            }
        }
    }

    public String _handleOddName(int i) throws IOException {
        boolean zIsJavaIdentifierPart;
        if (i == 39 && (this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _parseAposName();
        }
        if ((this._features & FEAT_MASK_ALLOW_UNQUOTED_NAMES) == 0) {
            _reportUnexpectedChar(i, "was expecting double-quote to start field name");
        }
        int[] inputCodeLatin1JsNames = CharTypes.getInputCodeLatin1JsNames();
        int length = inputCodeLatin1JsNames.length;
        if (i < length) {
            zIsJavaIdentifierPart = inputCodeLatin1JsNames[i] == 0;
        } else {
            zIsJavaIdentifierPart = Character.isJavaIdentifierPart((char) i);
        }
        if (!zIsJavaIdentifierPart) {
            _reportUnexpectedChar(i, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        }
        int i2 = this._inputPtr;
        int i3 = this._hashSeed;
        int i4 = this._inputEnd;
        if (i2 < i4) {
            do {
                char[] cArr = this._inputBuffer;
                char c = cArr[i2];
                if (c < length) {
                    if (inputCodeLatin1JsNames[c] != 0) {
                        int i5 = this._inputPtr - 1;
                        this._inputPtr = i2;
                        return this._symbols.findSymbol(cArr, i5, i2 - i5, i3);
                    }
                } else if (!Character.isJavaIdentifierPart(c)) {
                    int i6 = this._inputPtr - 1;
                    this._inputPtr = i2;
                    return this._symbols.findSymbol(this._inputBuffer, i6, i2 - i6, i3);
                }
                i3 = (i3 * 33) + c;
                i2++;
            } while (i2 < i4);
        }
        int i7 = this._inputPtr - 1;
        this._inputPtr = i2;
        return _handleOddName2(i7, i3, inputCodeLatin1JsNames);
    }

    public String _parseAposName() throws IOException {
        int i = this._inputPtr;
        int i2 = this._hashSeed;
        int i3 = this._inputEnd;
        if (i < i3) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            do {
                char[] cArr = this._inputBuffer;
                char c = cArr[i];
                if (c == '\'') {
                    int i4 = this._inputPtr;
                    this._inputPtr = i + 1;
                    return this._symbols.findSymbol(cArr, i4, i - i4, i2);
                }
                if (c < length && iArr[c] != 0) {
                    break;
                }
                i2 = (i2 * 33) + c;
                i++;
            } while (i < i3);
        }
        int i5 = this._inputPtr;
        this._inputPtr = i;
        return _parseName2(i5, i2, 39);
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonToken _handleOddValue(int i) throws IOException {
        if (i != 39) {
            if (i == 73) {
                _matchToken("Infinity", 1);
                if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                    return resetAsNaN("Infinity", Double.POSITIVE_INFINITY);
                }
                _reportError("Non-standard token 'Infinity': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            } else if (i == 78) {
                _matchToken("NaN", 1);
                if ((this._features & FEAT_MASK_NON_NUM_NUMBERS) != 0) {
                    return resetAsNaN("NaN", Double.NaN);
                }
                _reportError("Non-standard token 'NaN': enable `JsonReadFeature.ALLOW_NON_NUMERIC_NUMBERS` to allow");
            } else if (i != 93) {
                if (i == 43) {
                    if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                        _reportInvalidEOFInValue(JsonToken.VALUE_NUMBER_INT);
                    }
                    char[] cArr = this._inputBuffer;
                    int i2 = this._inputPtr;
                    this._inputPtr = i2 + 1;
                    return _handleInvalidNumberStart(cArr[i2], false, true);
                }
                if (i == 44) {
                    if (!this._parsingContext.inRoot() && (this._features & FEAT_MASK_ALLOW_MISSING) != 0) {
                        this._inputPtr--;
                        return JsonToken.VALUE_NULL;
                    }
                }
            } else if (this._parsingContext.inArray()) {
            }
        } else if ((this._features & FEAT_MASK_ALLOW_SINGLE_QUOTES) != 0) {
            return _handleApos();
        }
        if (Character.isJavaIdentifierStart(i)) {
            _reportInvalidToken("" + ((char) i), _validJsonTokenList());
        }
        _reportUnexpectedChar(i, "expected a valid value " + _validJsonValueList());
        return null;
    }

    public JsonToken _handleApos() throws IOException {
        char[] cArrEmptyAndGetCurrentSegment = this._textBuffer.emptyAndGetCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c_decodeEscaped = cArr[i];
            if (c_decodeEscaped <= '\\') {
                if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped <= '\'') {
                    if (c_decodeEscaped == '\'') {
                        this._textBuffer.setCurrentLength(currentSegmentSize);
                        return JsonToken.VALUE_STRING;
                    }
                    if (c_decodeEscaped < ' ') {
                        _throwUnquotedSpace(c_decodeEscaped, "string value");
                    }
                }
            }
            if (currentSegmentSize >= cArrEmptyAndGetCurrentSegment.length) {
                cArrEmptyAndGetCurrentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            cArrEmptyAndGetCurrentSegment[currentSegmentSize] = c_decodeEscaped;
            currentSegmentSize++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0069 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0061 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String _handleOddName2(int i, int i2, int[] iArr) throws IOException {
        int i3;
        this._textBuffer.resetWithShared(this._inputBuffer, i, this._inputPtr - i);
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char c = this._inputBuffer[this._inputPtr];
            if (c < length) {
                if (iArr[c] != 0) {
                    break;
                }
                this._inputPtr++;
                i2 = (i2 * 33) + c;
                i3 = currentSegmentSize + 1;
                currentSegment[currentSegmentSize] = c;
                if (i3 < currentSegment.length) {
                    currentSegment = this._textBuffer.finishCurrentSegment();
                    currentSegmentSize = 0;
                } else {
                    currentSegmentSize = i3;
                }
            } else {
                if (!Character.isJavaIdentifierPart(c)) {
                    break;
                }
                this._inputPtr++;
                i2 = (i2 * 33) + c;
                i3 = currentSegmentSize + 1;
                currentSegment[currentSegmentSize] = c;
                if (i3 < currentSegment.length) {
                }
            }
        }
        this._textBuffer.setCurrentLength(currentSegmentSize);
        TextBuffer textBuffer = this._textBuffer;
        return this._symbols.findSymbol(textBuffer.getTextBuffer(), textBuffer.getTextOffset(), textBuffer.size(), i2);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public final void _finishString() throws IOException {
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        if (i < i2) {
            int[] iArr = _icLatin1;
            int length = iArr.length;
            while (true) {
                char[] cArr = this._inputBuffer;
                char c = cArr[i];
                if (c >= length || iArr[c] == 0) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } else if (c == '\"') {
                    TextBuffer textBuffer = this._textBuffer;
                    int i3 = this._inputPtr;
                    textBuffer.resetWithShared(cArr, i3, i - i3);
                    this._inputPtr = i + 1;
                    return;
                }
            }
        }
        TextBuffer textBuffer2 = this._textBuffer;
        char[] cArr2 = this._inputBuffer;
        int i4 = this._inputPtr;
        textBuffer2.resetWithCopy(cArr2, i4, i - i4);
        this._inputPtr = i;
        _finishString2();
    }

    public void _finishString2() throws IOException {
        char[] currentSegment = this._textBuffer.getCurrentSegment();
        int currentSegmentSize = this._textBuffer.getCurrentSegmentSize();
        int[] iArr = _icLatin1;
        int length = iArr.length;
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c_decodeEscaped = cArr[i];
            if (c_decodeEscaped < length && iArr[c_decodeEscaped] != 0) {
                if (c_decodeEscaped == '\"') {
                    this._textBuffer.setCurrentLength(currentSegmentSize);
                    return;
                } else if (c_decodeEscaped == '\\') {
                    c_decodeEscaped = _decodeEscaped();
                } else if (c_decodeEscaped < ' ') {
                    _throwUnquotedSpace(c_decodeEscaped, "string value");
                }
            }
            if (currentSegmentSize >= currentSegment.length) {
                currentSegment = this._textBuffer.finishCurrentSegment();
                currentSegmentSize = 0;
            }
            currentSegment[currentSegmentSize] = c_decodeEscaped;
            currentSegmentSize++;
        }
    }

    public final void _skipString() throws IOException {
        this._tokenIncomplete = false;
        int i = this._inputPtr;
        int i2 = this._inputEnd;
        char[] cArr = this._inputBuffer;
        while (true) {
            if (i >= i2) {
                this._inputPtr = i;
                if (!_loadMore()) {
                    _reportInvalidEOF(": was expecting closing quote for a string value", JsonToken.VALUE_STRING);
                }
                i = this._inputPtr;
                i2 = this._inputEnd;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c <= '\\') {
                if (c == '\\') {
                    this._inputPtr = i3;
                    _decodeEscaped();
                    i = this._inputPtr;
                    i2 = this._inputEnd;
                } else if (c <= '\"') {
                    if (c == '\"') {
                        this._inputPtr = i3;
                        return;
                    } else if (c < ' ') {
                        this._inputPtr = i3;
                        _throwUnquotedSpace(c, "string value");
                    }
                }
            }
            i = i3;
        }
    }

    public final void _skipCR() throws IOException {
        if (this._inputPtr < this._inputEnd || _loadMore()) {
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            if (cArr[i] == '\n') {
                this._inputPtr = i + 1;
            }
        }
        this._currInputRow++;
        this._currInputRowStart = this._inputPtr;
    }

    public final int _skipColon() throws IOException {
        int i = this._inputPtr;
        if (i + 4 >= this._inputEnd) {
            return _skipColon2(false);
        }
        char[] cArr = this._inputBuffer;
        char c = cArr[i];
        if (c == ':') {
            int i2 = i + 1;
            this._inputPtr = i2;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 == '/' || c2 == '#') {
                    return _skipColon2(true);
                }
                this._inputPtr = i + 2;
                return c2;
            }
            if (c2 == ' ' || c2 == '\t') {
                int i3 = i + 2;
                this._inputPtr = i3;
                char c3 = cArr[i3];
                if (c3 > ' ') {
                    if (c3 == '/' || c3 == '#') {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i + 3;
                    return c3;
                }
            }
            return _skipColon2(true);
        }
        if (c == ' ' || c == '\t') {
            int i4 = i + 1;
            this._inputPtr = i4;
            c = cArr[i4];
        }
        if (c == ':') {
            int i5 = this._inputPtr;
            int i6 = i5 + 1;
            this._inputPtr = i6;
            char c4 = cArr[i6];
            if (c4 > ' ') {
                if (c4 == '/' || c4 == '#') {
                    return _skipColon2(true);
                }
                this._inputPtr = i5 + 2;
                return c4;
            }
            if (c4 == ' ' || c4 == '\t') {
                int i7 = i5 + 2;
                this._inputPtr = i7;
                char c5 = cArr[i7];
                if (c5 > ' ') {
                    if (c5 == '/' || c5 == '#') {
                        return _skipColon2(true);
                    }
                    this._inputPtr = i5 + 3;
                    return c5;
                }
            }
            return _skipColon2(true);
        }
        return _skipColon2(false);
    }

    public final int _skipColon2(boolean z) throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                int i2 = i + 1;
                this._inputPtr = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        _skipComment();
                    } else if (c != '#' || !_skipYAMLComment()) {
                        if (z) {
                            return c;
                        }
                        if (c != ':') {
                            _reportUnexpectedChar(c, "was expecting a colon to separate field name and value");
                        }
                        z = true;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i2;
                    } else if (c == '\r') {
                        _skipCR();
                    } else if (c != '\t') {
                        _throwInvalidSpace(c);
                    }
                }
            } else {
                _reportInvalidEOF(" within/between " + this._parsingContext.typeDesc() + " entries", null);
                return -1;
            }
        }
    }

    public final int _skipColonFast(int i) throws IOException {
        char[] cArr = this._inputBuffer;
        int i2 = i + 1;
        char c = cArr[i];
        if (c == ':') {
            int i3 = i + 2;
            char c2 = cArr[i2];
            if (c2 > ' ') {
                if (c2 != '/' && c2 != '#') {
                    this._inputPtr = i3;
                    return c2;
                }
            } else if (c2 == ' ' || c2 == '\t') {
                int i4 = i + 3;
                char c3 = cArr[i3];
                if (c3 > ' ' && c3 != '/' && c3 != '#') {
                    this._inputPtr = i4;
                    return c3;
                }
                i3 = i4;
            }
            this._inputPtr = i3 - 1;
            return _skipColon2(true);
        }
        if (c == ' ' || c == '\t') {
            c = cArr[i2];
            i2 = i + 2;
        }
        boolean z = c == ':';
        if (z) {
            int i5 = i2 + 1;
            char c4 = cArr[i2];
            if (c4 > ' ') {
                if (c4 != '/' && c4 != '#') {
                    this._inputPtr = i5;
                    return c4;
                }
            } else if (c4 == ' ' || c4 == '\t') {
                i2 += 2;
                char c5 = cArr[i5];
                if (c5 > ' ' && c5 != '/' && c5 != '#') {
                    this._inputPtr = i2;
                    return c5;
                }
            }
            i2 = i5;
        }
        this._inputPtr = i2 - 1;
        return _skipColon2(z);
    }

    public final int _skipComma(int i) throws IOException {
        if (i != 44) {
            _reportUnexpectedChar(i, "was expecting comma to separate " + this._parsingContext.typeDesc() + " entries");
        }
        while (true) {
            int i2 = this._inputPtr;
            if (i2 < this._inputEnd) {
                char[] cArr = this._inputBuffer;
                int i3 = i2 + 1;
                this._inputPtr = i3;
                char c = cArr[i2];
                if (c > ' ') {
                    if (c != '/' && c != '#') {
                        return c;
                    }
                    this._inputPtr = i2;
                    return _skipAfterComma2();
                }
                if (c < ' ') {
                    if (c == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i3;
                    } else if (c == '\r') {
                        _skipCR();
                    } else if (c != '\t') {
                        _throwInvalidSpace(c);
                    }
                }
            } else {
                return _skipAfterComma2();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x004f, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int _skipAfterComma2() throws IOException {
        while (true) {
            if (this._inputPtr < this._inputEnd || _loadMore()) {
                char[] cArr = this._inputBuffer;
                int i = this._inputPtr;
                int i2 = i + 1;
                this._inputPtr = i2;
                char c = cArr[i];
                if (c > ' ') {
                    if (c == '/') {
                        _skipComment();
                    } else if (c != '#' || !_skipYAMLComment()) {
                        break;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i2;
                    } else if (c == '\r') {
                        _skipCR();
                    } else if (c != '\t') {
                        _throwInvalidSpace(c);
                    }
                }
            } else {
                throw _constructError("Unexpected end-of-input within/between " + this._parsingContext.typeDesc() + " entries");
            }
        }
    }

    public final int _skipWSOrEnd() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            return _eofAsNextChar();
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        int i2 = i + 1;
        this._inputPtr = i2;
        char c = cArr[i];
        if (c > ' ') {
            if (c != '/' && c != '#') {
                return c;
            }
            this._inputPtr = i;
            return _skipWSOrEnd2();
        }
        if (c != ' ') {
            if (c == '\n') {
                this._currInputRow++;
                this._currInputRowStart = i2;
            } else if (c == '\r') {
                _skipCR();
            } else if (c != '\t') {
                _throwInvalidSpace(c);
            }
        }
        while (true) {
            int i3 = this._inputPtr;
            if (i3 < this._inputEnd) {
                char[] cArr2 = this._inputBuffer;
                int i4 = i3 + 1;
                this._inputPtr = i4;
                char c2 = cArr2[i3];
                if (c2 > ' ') {
                    if (c2 != '/' && c2 != '#') {
                        return c2;
                    }
                    this._inputPtr = i3;
                    return _skipWSOrEnd2();
                }
                if (c2 != ' ') {
                    if (c2 == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i4;
                    } else if (c2 == '\r') {
                        _skipCR();
                    } else if (c2 != '\t') {
                        _throwInvalidSpace(c2);
                    }
                }
            } else {
                return _skipWSOrEnd2();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0032, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int _skipWSOrEnd2() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return _eofAsNextChar();
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            char c = cArr[i];
            if (c > ' ') {
                if (c == '/') {
                    _skipComment();
                } else if (c != '#' || !_skipYAMLComment()) {
                    break;
                }
            } else if (c != ' ') {
                if (c == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                } else if (c == '\r') {
                    _skipCR();
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
                }
            }
        }
    }

    public final void _skipComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_JAVA_COMMENTS) == 0) {
            _reportUnexpectedChar(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in a comment", null);
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c = cArr[i];
        if (c == '/') {
            _skipLine();
        } else if (c == '*') {
            _skipCComment();
        } else {
            _reportUnexpectedChar(c, "was expecting either '*' or '/' for a comment");
        }
    }

    public final void _skipCComment() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                break;
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            char c = cArr[i];
            if (c <= '*') {
                if (c == '*') {
                    if (i2 >= this._inputEnd && !_loadMore()) {
                        break;
                    }
                    char[] cArr2 = this._inputBuffer;
                    int i3 = this._inputPtr;
                    if (cArr2[i3] == '/') {
                        this._inputPtr = i3 + 1;
                        return;
                    }
                } else if (c < ' ') {
                    if (c == '\n') {
                        this._currInputRow++;
                        this._currInputRowStart = i2;
                    } else if (c == '\r') {
                        _skipCR();
                    } else if (c != '\t') {
                        _throwInvalidSpace(c);
                    }
                }
            }
        }
        _reportInvalidEOF(" in a comment", null);
    }

    public final boolean _skipYAMLComment() throws IOException {
        if ((this._features & FEAT_MASK_ALLOW_YAML_COMMENTS) == 0) {
            return false;
        }
        _skipLine();
        return true;
    }

    public final void _skipLine() throws IOException {
        while (true) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                return;
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = i + 1;
            this._inputPtr = i2;
            char c = cArr[i];
            if (c < ' ') {
                if (c == '\n') {
                    this._currInputRow++;
                    this._currInputRowStart = i2;
                    return;
                } else if (c == '\r') {
                    _skipCR();
                    return;
                } else if (c != '\t') {
                    _throwInvalidSpace(c);
                }
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase
    public char _decodeEscaped() throws IOException {
        if (this._inputPtr >= this._inputEnd && !_loadMore()) {
            _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
        }
        char[] cArr = this._inputBuffer;
        int i = this._inputPtr;
        this._inputPtr = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            return _handleUnrecognizedCharacterEscape(c);
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this._inputPtr >= this._inputEnd && !_loadMore()) {
                _reportInvalidEOF(" in character escape sequence", JsonToken.VALUE_STRING);
            }
            char[] cArr2 = this._inputBuffer;
            int i4 = this._inputPtr;
            this._inputPtr = i4 + 1;
            char c2 = cArr2[i4];
            int iCharToHex = CharTypes.charToHex(c2);
            if (iCharToHex < 0) {
                _reportUnexpectedChar(c2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | iCharToHex;
        }
        return (char) i2;
    }

    private final void _matchTrue() throws IOException {
        int i;
        char c;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i2] == 'r' && cArr[i2 + 1] == 'u' && cArr[i2 + 2] == 'e' && ((c = cArr[(i = i2 + 3)]) < '0' || c == ']' || c == '}')) {
                this._inputPtr = i;
                return;
            }
        }
        _matchToken("true", 1);
    }

    private final void _matchFalse() throws IOException {
        int i;
        char c;
        int i2 = this._inputPtr;
        if (i2 + 4 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i2] == 'a' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 's' && cArr[i2 + 3] == 'e' && ((c = cArr[(i = i2 + 4)]) < '0' || c == ']' || c == '}')) {
                this._inputPtr = i;
                return;
            }
        }
        _matchToken("false", 1);
    }

    private final void _matchNull() throws IOException {
        int i;
        char c;
        int i2 = this._inputPtr;
        if (i2 + 3 < this._inputEnd) {
            char[] cArr = this._inputBuffer;
            if (cArr[i2] == 'u' && cArr[i2 + 1] == 'l' && cArr[i2 + 2] == 'l' && ((c = cArr[(i = i2 + 3)]) < '0' || c == ']' || c == '}')) {
                this._inputPtr = i;
                return;
            }
        }
        _matchToken("null", 1);
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
        char c = this._inputBuffer[i2];
        if (c < '0' || c == ']' || c == '}') {
            return;
        }
        _checkMatchEnd(str, i, c);
    }

    public final void _matchToken2(String str, int i) throws IOException {
        int i2;
        char c;
        int length = str.length();
        do {
            if ((this._inputPtr >= this._inputEnd && !_loadMore()) || this._inputBuffer[this._inputPtr] != str.charAt(i)) {
                _reportInvalidToken(str.substring(0, i));
            }
            i2 = this._inputPtr + 1;
            this._inputPtr = i2;
            i++;
        } while (i < length);
        if ((i2 < this._inputEnd || _loadMore()) && (c = this._inputBuffer[this._inputPtr]) >= '0' && c != ']' && c != '}') {
            _checkMatchEnd(str, i, c);
        }
    }

    public final void _checkMatchEnd(String str, int i, int i2) throws IOException {
        if (Character.isJavaIdentifierPart((char) i2)) {
            _reportInvalidToken(str.substring(0, i));
        }
    }

    public byte[] _decodeBase64(Base64Variant base64Variant) throws IOException {
        ByteArrayBuilder byteArrayBuilder_getByteArrayBuilder = _getByteArrayBuilder();
        while (true) {
            if (this._inputPtr >= this._inputEnd) {
                _loadMoreGuaranteed();
            }
            char[] cArr = this._inputBuffer;
            int i = this._inputPtr;
            this._inputPtr = i + 1;
            char c = cArr[i];
            if (c > ' ') {
                int iDecodeBase64Char = base64Variant.decodeBase64Char(c);
                if (iDecodeBase64Char < 0) {
                    if (c == '\"') {
                        return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                    }
                    iDecodeBase64Char = _decodeBase64Escape(base64Variant, c, 0);
                    if (iDecodeBase64Char < 0) {
                        continue;
                    }
                }
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr2 = this._inputBuffer;
                int i2 = this._inputPtr;
                this._inputPtr = i2 + 1;
                char c2 = cArr2[i2];
                int iDecodeBase64Char2 = base64Variant.decodeBase64Char(c2);
                if (iDecodeBase64Char2 < 0) {
                    iDecodeBase64Char2 = _decodeBase64Escape(base64Variant, c2, 1);
                }
                int i3 = (iDecodeBase64Char << 6) | iDecodeBase64Char2;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr3 = this._inputBuffer;
                int i4 = this._inputPtr;
                this._inputPtr = i4 + 1;
                char c3 = cArr3[i4];
                int iDecodeBase64Char3 = base64Variant.decodeBase64Char(c3);
                if (iDecodeBase64Char3 < 0) {
                    if (iDecodeBase64Char3 != -2) {
                        if (c3 == '\"') {
                            byteArrayBuilder_getByteArrayBuilder.append(i3 >> 4);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char3 = _decodeBase64Escape(base64Variant, c3, 2);
                    }
                    if (iDecodeBase64Char3 == -2) {
                        if (this._inputPtr >= this._inputEnd) {
                            _loadMoreGuaranteed();
                        }
                        char[] cArr4 = this._inputBuffer;
                        int i5 = this._inputPtr;
                        this._inputPtr = i5 + 1;
                        char c4 = cArr4[i5];
                        if (!base64Variant.usesPaddingChar(c4) && _decodeBase64Escape(base64Variant, c4, 3) != -2) {
                            throw reportInvalidBase64Char(base64Variant, c4, 3, "expected padding character '" + base64Variant.getPaddingChar() + "'");
                        }
                        byteArrayBuilder_getByteArrayBuilder.append(i3 >> 4);
                    }
                }
                int i6 = (i3 << 6) | iDecodeBase64Char3;
                if (this._inputPtr >= this._inputEnd) {
                    _loadMoreGuaranteed();
                }
                char[] cArr5 = this._inputBuffer;
                int i7 = this._inputPtr;
                this._inputPtr = i7 + 1;
                char c5 = cArr5[i7];
                int iDecodeBase64Char4 = base64Variant.decodeBase64Char(c5);
                if (iDecodeBase64Char4 < 0) {
                    if (iDecodeBase64Char4 != -2) {
                        if (c5 == '\"') {
                            byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i6 >> 2);
                            if (base64Variant.usesPadding()) {
                                this._inputPtr--;
                                _handleBase64MissingPadding(base64Variant);
                            }
                            return byteArrayBuilder_getByteArrayBuilder.toByteArray();
                        }
                        iDecodeBase64Char4 = _decodeBase64Escape(base64Variant, c5, 3);
                    }
                    if (iDecodeBase64Char4 == -2) {
                        byteArrayBuilder_getByteArrayBuilder.appendTwoBytes(i6 >> 2);
                    }
                }
                byteArrayBuilder_getByteArrayBuilder.appendThreeBytes((i6 << 6) | iDecodeBase64Char4);
            }
        }
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getTokenLocation() {
        if (this._currToken == JsonToken.FIELD_NAME) {
            return new JsonLocation(_contentReference(), -1L, this._currInputProcessed + (this._nameStartOffset - 1), this._nameStartRow, this._nameStartCol);
        }
        return new JsonLocation(_contentReference(), -1L, this._tokenInputTotal - 1, this._tokenInputRow, this._tokenInputCol);
    }

    @Override // com.fasterxml.jackson.core.base.ParserBase, com.fasterxml.jackson.core.JsonParser
    public JsonLocation getCurrentLocation() {
        return new JsonLocation(_contentReference(), -1L, this._inputPtr + this._currInputProcessed, this._currInputRow, (this._inputPtr - this._currInputRowStart) + 1);
    }

    public final void _updateLocation() {
        int i = this._inputPtr;
        this._tokenInputTotal = this._currInputProcessed + i;
        this._tokenInputRow = this._currInputRow;
        this._tokenInputCol = i - this._currInputRowStart;
    }

    public final void _updateNameLocation() {
        int i = this._inputPtr;
        this._nameStartOffset = i;
        this._nameStartRow = this._currInputRow;
        this._nameStartCol = i - this._currInputRowStart;
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
            char c = this._inputBuffer[this._inputPtr];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this._inputPtr++;
            sb.append(c);
            if (sb.length() >= 256) {
                sb.append("...");
                break;
            }
        }
        _reportError("Unrecognized token '%s': was expecting %s", sb, str2);
    }

    public final void _closeScope(int i) throws JsonParseException {
        if (i == 93) {
            _updateLocation();
            if (!this._parsingContext.inArray()) {
                _reportMismatchedEndMarker(i, '}');
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_ARRAY;
        }
        if (i == 125) {
            _updateLocation();
            if (!this._parsingContext.inObject()) {
                _reportMismatchedEndMarker(i, AbstractJsonLexerKt.END_LIST);
            }
            this._parsingContext = this._parsingContext.clearAndGetParent();
            this._currToken = JsonToken.END_OBJECT;
        }
    }
}
