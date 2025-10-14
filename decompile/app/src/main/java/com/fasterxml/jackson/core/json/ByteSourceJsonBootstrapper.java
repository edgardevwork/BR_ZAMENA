package com.fasterxml.jackson.core.json;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.format.InputAccessor;
import com.fasterxml.jackson.core.format.MatchStrength;
import com.fasterxml.jackson.core.p022io.IOContext;
import com.fasterxml.jackson.core.p022io.MergedStream;
import com.fasterxml.jackson.core.p022io.UTF32Reader;
import com.fasterxml.jackson.core.sym.ByteQuadsCanonicalizer;
import com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer;
import java.io.ByteArrayInputStream;
import java.io.CharConversionException;
import java.io.DataInput;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* loaded from: classes8.dex */
public final class ByteSourceJsonBootstrapper {
    public static final byte UTF8_BOM_1 = -17;
    public static final byte UTF8_BOM_2 = -69;
    public static final byte UTF8_BOM_3 = -65;
    public boolean _bigEndian;
    public final boolean _bufferRecyclable;
    public int _bytesPerChar;
    public final IOContext _context;
    public final InputStream _in;
    public final byte[] _inputBuffer;
    public int _inputEnd;
    public int _inputPtr;

    public ByteSourceJsonBootstrapper(IOContext iOContext, InputStream inputStream) {
        this._bigEndian = true;
        this._context = iOContext;
        this._in = inputStream;
        this._inputBuffer = iOContext.allocReadIOBuffer();
        this._inputPtr = 0;
        this._inputEnd = 0;
        this._bufferRecyclable = true;
    }

    public ByteSourceJsonBootstrapper(IOContext iOContext, byte[] bArr, int i, int i2) {
        this._bigEndian = true;
        this._context = iOContext;
        this._in = null;
        this._inputBuffer = bArr;
        this._inputPtr = i;
        this._inputEnd = i + i2;
        this._bufferRecyclable = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JsonEncoding detectEncoding() throws IOException {
        JsonEncoding jsonEncoding;
        if (ensureLoaded(4)) {
            byte[] bArr = this._inputBuffer;
            int i = this._inputPtr;
            int i2 = (bArr[i + 3] & 255) | (bArr[i] << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
            if (!handleBOM(i2) && !checkUTF32(i2) && !checkUTF16(i2 >>> 16)) {
                jsonEncoding = JsonEncoding.UTF8;
            } else {
                int i3 = this._bytesPerChar;
                if (i3 == 1) {
                    jsonEncoding = JsonEncoding.UTF8;
                } else if (i3 == 2) {
                    jsonEncoding = this._bigEndian ? JsonEncoding.UTF16_BE : JsonEncoding.UTF16_LE;
                } else if (i3 == 4) {
                    jsonEncoding = this._bigEndian ? JsonEncoding.UTF32_BE : JsonEncoding.UTF32_LE;
                } else {
                    throw new RuntimeException("Internal error");
                }
            }
        } else {
            if (ensureLoaded(2)) {
                byte[] bArr2 = this._inputBuffer;
                int i4 = this._inputPtr;
                if (checkUTF16((bArr2[i4 + 1] & 255) | ((bArr2[i4] & 255) << 8))) {
                }
            }
            jsonEncoding = JsonEncoding.UTF8;
        }
        this._context.setEncoding(jsonEncoding);
        return jsonEncoding;
    }

    public static int skipUTF8BOM(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 239) {
            return unsignedByte;
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 187) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte2) + " following 0xEF; should get 0xBB as part of UTF-8 BOM");
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 != 191) {
            throw new IOException("Unexpected byte 0x" + Integer.toHexString(unsignedByte3) + " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM");
        }
        return dataInput.readUnsignedByte();
    }

    public Reader constructReader() throws IOException {
        JsonEncoding encoding = this._context.getEncoding();
        int iBits = encoding.bits();
        if (iBits != 8 && iBits != 16) {
            if (iBits == 32) {
                IOContext iOContext = this._context;
                return new UTF32Reader(iOContext, this._in, this._inputBuffer, this._inputPtr, this._inputEnd, iOContext.getEncoding().isBigEndian());
            }
            throw new RuntimeException("Internal error");
        }
        InputStream mergedStream = this._in;
        if (mergedStream == null) {
            mergedStream = new ByteArrayInputStream(this._inputBuffer, this._inputPtr, this._inputEnd);
        } else if (this._inputPtr < this._inputEnd) {
            mergedStream = new MergedStream(this._context, mergedStream, this._inputBuffer, this._inputPtr, this._inputEnd);
        }
        return new InputStreamReader(mergedStream, encoding.getJavaName());
    }

    public JsonParser constructParser(int i, ObjectCodec objectCodec, ByteQuadsCanonicalizer byteQuadsCanonicalizer, CharsToNameCanonicalizer charsToNameCanonicalizer, int i2) throws IOException {
        int i3 = this._inputPtr;
        JsonEncoding jsonEncodingDetectEncoding = detectEncoding();
        int i4 = this._inputPtr - i3;
        if (jsonEncodingDetectEncoding == JsonEncoding.UTF8 && JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2)) {
            return new UTF8StreamJsonParser(this._context, i, this._in, objectCodec, byteQuadsCanonicalizer.makeChild(i2), this._inputBuffer, this._inputPtr, this._inputEnd, i4, this._bufferRecyclable);
        }
        return new ReaderBasedJsonParser(this._context, i, constructReader(), objectCodec, charsToNameCanonicalizer.makeChild(i2));
    }

    public static MatchStrength hasJSONFormat(InputAccessor inputAccessor) throws IOException {
        if (!inputAccessor.hasMoreBytes()) {
            return MatchStrength.INCONCLUSIVE;
        }
        byte bNextByte = inputAccessor.nextByte();
        if (bNextByte == -17) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -69) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != -65) {
                return MatchStrength.NO_MATCH;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            bNextByte = inputAccessor.nextByte();
        }
        int iSkipSpace = skipSpace(inputAccessor, bNextByte);
        if (iSkipSpace < 0) {
            return MatchStrength.INCONCLUSIVE;
        }
        if (iSkipSpace == 123) {
            int iSkipSpace2 = skipSpace(inputAccessor);
            if (iSkipSpace2 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iSkipSpace2 == 34 || iSkipSpace2 == 125) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.NO_MATCH;
        }
        if (iSkipSpace == 91) {
            int iSkipSpace3 = skipSpace(inputAccessor);
            if (iSkipSpace3 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (iSkipSpace3 == 93 || iSkipSpace3 == 91) {
                return MatchStrength.SOLID_MATCH;
            }
            return MatchStrength.SOLID_MATCH;
        }
        MatchStrength matchStrength = MatchStrength.WEAK_MATCH;
        if (iSkipSpace == 34) {
            return matchStrength;
        }
        if (iSkipSpace <= 57 && iSkipSpace >= 48) {
            return matchStrength;
        }
        if (iSkipSpace == 45) {
            int iSkipSpace4 = skipSpace(inputAccessor);
            if (iSkipSpace4 < 0) {
                return MatchStrength.INCONCLUSIVE;
            }
            return (iSkipSpace4 > 57 || iSkipSpace4 < 48) ? MatchStrength.NO_MATCH : matchStrength;
        }
        if (iSkipSpace == 110) {
            return tryMatch(inputAccessor, "ull", matchStrength);
        }
        if (iSkipSpace == 116) {
            return tryMatch(inputAccessor, "rue", matchStrength);
        }
        if (iSkipSpace == 102) {
            return tryMatch(inputAccessor, "alse", matchStrength);
        }
        return MatchStrength.NO_MATCH;
    }

    public static MatchStrength tryMatch(InputAccessor inputAccessor, String str, MatchStrength matchStrength) throws IOException {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!inputAccessor.hasMoreBytes()) {
                return MatchStrength.INCONCLUSIVE;
            }
            if (inputAccessor.nextByte() != str.charAt(i)) {
                return MatchStrength.NO_MATCH;
            }
        }
        return matchStrength;
    }

    public static int skipSpace(InputAccessor inputAccessor) throws IOException {
        if (inputAccessor.hasMoreBytes()) {
            return skipSpace(inputAccessor, inputAccessor.nextByte());
        }
        return -1;
    }

    public static int skipSpace(InputAccessor inputAccessor, byte b) throws IOException {
        while (true) {
            int i = b & 255;
            if (i != 32 && i != 13 && i != 10 && i != 9) {
                return i;
            }
            if (!inputAccessor.hasMoreBytes()) {
                return -1;
            }
            b = inputAccessor.nextByte();
        }
    }

    public final boolean handleBOM(int i) throws IOException {
        if (i == -16842752) {
            reportWeirdUCS4("3412");
        } else {
            if (i == -131072) {
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                this._bigEndian = false;
                return true;
            }
            if (i == 65279) {
                this._bigEndian = true;
                this._inputPtr += 4;
                this._bytesPerChar = 4;
                return true;
            }
            if (i == 65534) {
                reportWeirdUCS4("2143");
            }
        }
        int i2 = i >>> 16;
        if (i2 == 65279) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = true;
            return true;
        }
        if (i2 == 65534) {
            this._inputPtr += 2;
            this._bytesPerChar = 2;
            this._bigEndian = false;
            return true;
        }
        if ((i >>> 8) != 15711167) {
            return false;
        }
        this._inputPtr += 3;
        this._bytesPerChar = 1;
        this._bigEndian = true;
        return true;
    }

    public final boolean checkUTF32(int i) throws IOException {
        if ((i >> 8) == 0) {
            this._bigEndian = true;
        } else if ((16777215 & i) == 0) {
            this._bigEndian = false;
        } else if (((-16711681) & i) == 0) {
            reportWeirdUCS4("3412");
        } else {
            if ((i & (-65281)) != 0) {
                return false;
            }
            reportWeirdUCS4("2143");
        }
        this._bytesPerChar = 4;
        return true;
    }

    public final boolean checkUTF16(int i) {
        if ((65280 & i) == 0) {
            this._bigEndian = true;
        } else {
            if ((i & 255) != 0) {
                return false;
            }
            this._bigEndian = false;
        }
        this._bytesPerChar = 2;
        return true;
    }

    public final void reportWeirdUCS4(String str) throws IOException {
        throw new CharConversionException("Unsupported UCS-4 endianness (" + str + ") detected");
    }

    public boolean ensureLoaded(int i) throws IOException {
        int i2;
        int i3 = this._inputEnd - this._inputPtr;
        while (i3 < i) {
            InputStream inputStream = this._in;
            if (inputStream == null) {
                i2 = -1;
            } else {
                byte[] bArr = this._inputBuffer;
                int i4 = this._inputEnd;
                i2 = inputStream.read(bArr, i4, bArr.length - i4);
            }
            if (i2 < 1) {
                return false;
            }
            this._inputEnd += i2;
            i3 += i2;
        }
        return true;
    }
}
