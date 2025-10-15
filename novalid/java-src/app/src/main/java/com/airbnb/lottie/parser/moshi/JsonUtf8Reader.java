package com.airbnb.lottie.parser.moshi;

import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.apache.http.message.BasicHeaderValueFormatter;

/* loaded from: classes2.dex */
public final class JsonUtf8Reader extends JsonReader {
    public static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    public static final int NUMBER_CHAR_DECIMAL = 3;
    public static final int NUMBER_CHAR_DIGIT = 2;
    public static final int NUMBER_CHAR_EXP_DIGIT = 7;
    public static final int NUMBER_CHAR_EXP_E = 5;
    public static final int NUMBER_CHAR_EXP_SIGN = 6;
    public static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    public static final int NUMBER_CHAR_NONE = 0;
    public static final int NUMBER_CHAR_SIGN = 1;
    public static final int PEEKED_BEGIN_ARRAY = 3;
    public static final int PEEKED_BEGIN_OBJECT = 1;
    public static final int PEEKED_BUFFERED = 11;
    public static final int PEEKED_BUFFERED_NAME = 15;
    public static final int PEEKED_DOUBLE_QUOTED = 9;
    public static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    public static final int PEEKED_END_ARRAY = 4;
    public static final int PEEKED_END_OBJECT = 2;
    public static final int PEEKED_EOF = 18;
    public static final int PEEKED_FALSE = 6;
    public static final int PEEKED_LONG = 16;
    public static final int PEEKED_NONE = 0;
    public static final int PEEKED_NULL = 7;
    public static final int PEEKED_NUMBER = 17;
    public static final int PEEKED_SINGLE_QUOTED = 8;
    public static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    public static final int PEEKED_TRUE = 5;
    public static final int PEEKED_UNQUOTED = 10;
    public static final int PEEKED_UNQUOTED_NAME = 14;
    public final Buffer buffer;
    public int peeked = 0;
    public long peekedLong;
    public int peekedNumberLength;

    @Nullable
    public String peekedString;
    public final BufferedSource source;
    public static final ByteString SINGLE_QUOTE_OR_SLASH = ByteString.encodeUtf8("'\\");
    public static final ByteString DOUBLE_QUOTE_OR_SLASH = ByteString.encodeUtf8(BasicHeaderValueFormatter.UNSAFE_CHARS);
    public static final ByteString UNQUOTED_STRING_TERMINALS = ByteString.encodeUtf8("{}[]:, \n\t\r\f/\\;#=");
    public static final ByteString LINEFEED_OR_CARRIAGE_RETURN = ByteString.encodeUtf8("\n\r");
    public static final ByteString CLOSING_BLOCK_COMMENT = ByteString.encodeUtf8("*/");

    public JsonUtf8Reader(BufferedSource bufferedSource) {
        if (bufferedSource == null) {
            throw new NullPointerException("source == null");
        }
        this.source = bufferedSource;
        this.buffer = bufferedSource.getBufferField();
        pushScope(6);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 3) {
            pushScope(1);
            this.pathIndices[this.stackSize - 1] = 0;
            this.peeked = 0;
        } else {
            throw new JsonDataException("Expected BEGIN_ARRAY but was " + peek() + " at path " + getPath());
        }
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endArray() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 4) {
            int i = this.stackSize;
            this.stackSize = i - 1;
            int[] iArr = this.pathIndices;
            int i2 = i - 2;
            iArr[i2] = iArr[i2] + 1;
            this.peeked = 0;
            return;
        }
        throw new JsonDataException("Expected END_ARRAY but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void beginObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 1) {
            pushScope(3);
            this.peeked = 0;
            return;
        }
        throw new JsonDataException("Expected BEGIN_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void endObject() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 2) {
            int i = this.stackSize;
            int i2 = i - 1;
            this.stackSize = i2;
            this.pathNames[i2] = null;
            int[] iArr = this.pathIndices;
            int i3 = i - 2;
            iArr[i3] = iArr[i3] + 1;
            this.peeked = 0;
            return;
        }
        throw new JsonDataException("Expected END_OBJECT but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean hasNext() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        return (iDoPeek == 2 || iDoPeek == 4 || iDoPeek == 18) ? false : true;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public JsonReader.Token peek() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        switch (iDoPeek) {
            case 1:
                return JsonReader.Token.BEGIN_OBJECT;
            case 2:
                return JsonReader.Token.END_OBJECT;
            case 3:
                return JsonReader.Token.BEGIN_ARRAY;
            case 4:
                return JsonReader.Token.END_ARRAY;
            case 5:
            case 6:
                return JsonReader.Token.BOOLEAN;
            case 7:
                return JsonReader.Token.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonReader.Token.STRING;
            case 12:
            case 13:
            case 14:
            case 15:
                return JsonReader.Token.NAME;
            case 16:
            case 17:
                return JsonReader.Token.NUMBER;
            case 18:
                return JsonReader.Token.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public final int doPeek() throws IOException {
        int[] iArr = this.scopes;
        int i = this.stackSize;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iNextNonWhitespace = nextNonWhitespace(true);
            this.buffer.readByte();
            if (iNextNonWhitespace != 44) {
                if (iNextNonWhitespace != 59) {
                    if (iNextNonWhitespace == 93) {
                        this.peeked = 4;
                        return 4;
                    }
                    throw syntaxError("Unterminated array");
                }
                checkLenient();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5) {
                    int iNextNonWhitespace2 = nextNonWhitespace(true);
                    this.buffer.readByte();
                    if (iNextNonWhitespace2 != 44) {
                        if (iNextNonWhitespace2 != 59) {
                            if (iNextNonWhitespace2 == 125) {
                                this.peeked = 2;
                                return 2;
                            }
                            throw syntaxError("Unterminated object");
                        }
                        checkLenient();
                    }
                }
                int iNextNonWhitespace3 = nextNonWhitespace(true);
                if (iNextNonWhitespace3 == 34) {
                    this.buffer.readByte();
                    this.peeked = 13;
                    return 13;
                }
                if (iNextNonWhitespace3 == 39) {
                    this.buffer.readByte();
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (iNextNonWhitespace3 != 125) {
                    checkLenient();
                    if (isLiteral((char) iNextNonWhitespace3)) {
                        this.peeked = 14;
                        return 14;
                    }
                    throw syntaxError("Expected name");
                }
                if (i2 != 5) {
                    this.buffer.readByte();
                    this.peeked = 2;
                    return 2;
                }
                throw syntaxError("Expected name");
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iNextNonWhitespace4 = nextNonWhitespace(true);
                this.buffer.readByte();
                if (iNextNonWhitespace4 != 58) {
                    if (iNextNonWhitespace4 == 61) {
                        checkLenient();
                        if (this.source.request(1L) && this.buffer.getByte(0L) == 62) {
                            this.buffer.readByte();
                        }
                    } else {
                        throw syntaxError("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                iArr[i - 1] = 7;
            } else if (i2 == 7) {
                if (nextNonWhitespace(false) == -1) {
                    this.peeked = 18;
                    return 18;
                }
                checkLenient();
            } else if (i2 == 8) {
                throw new IllegalStateException("JsonReader is closed");
            }
        }
        int iNextNonWhitespace5 = nextNonWhitespace(true);
        if (iNextNonWhitespace5 == 34) {
            this.buffer.readByte();
            this.peeked = 9;
            return 9;
        }
        if (iNextNonWhitespace5 == 39) {
            checkLenient();
            this.buffer.readByte();
            this.peeked = 8;
            return 8;
        }
        if (iNextNonWhitespace5 != 44 && iNextNonWhitespace5 != 59) {
            if (iNextNonWhitespace5 == 91) {
                this.buffer.readByte();
                this.peeked = 3;
                return 3;
            }
            if (iNextNonWhitespace5 != 93) {
                if (iNextNonWhitespace5 == 123) {
                    this.buffer.readByte();
                    this.peeked = 1;
                    return 1;
                }
                int iPeekKeyword = peekKeyword();
                if (iPeekKeyword != 0) {
                    return iPeekKeyword;
                }
                int iPeekNumber = peekNumber();
                if (iPeekNumber != 0) {
                    return iPeekNumber;
                }
                if (!isLiteral(this.buffer.getByte(0L))) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i2 == 1) {
                this.buffer.readByte();
                this.peeked = 4;
                return 4;
            }
        }
        if (i2 == 1 || i2 == 2) {
            checkLenient();
            this.peeked = 7;
            return 7;
        }
        throw syntaxError("Unexpected value");
    }

    public final int peekKeyword() throws IOException {
        String str;
        String str2;
        int i;
        byte b = this.buffer.getByte(0L);
        if (b == 116 || b == 84) {
            str = "true";
            str2 = "TRUE";
            i = 5;
        } else if (b == 102 || b == 70) {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (b != 110 && b != 78) {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        int i2 = 1;
        while (i2 < length) {
            int i3 = i2 + 1;
            if (!this.source.request(i3)) {
                return 0;
            }
            byte b2 = this.buffer.getByte(i2);
            if (b2 != str.charAt(i2) && b2 != str2.charAt(i2)) {
                return 0;
            }
            i2 = i3;
        }
        if (this.source.request(length + 1) && isLiteral(this.buffer.getByte(length))) {
            return 0;
        }
        this.buffer.skip(length);
        this.peeked = i;
        return i;
    }

    public final int peekNumber() throws IOException {
        byte b;
        char c;
        boolean z = true;
        long j = 0;
        int i = 0;
        char c2 = 0;
        boolean z2 = false;
        boolean z3 = true;
        while (true) {
            int i2 = i + 1;
            if (!this.source.request(i2)) {
                break;
            }
            b = this.buffer.getByte(i);
            if (b != 43) {
                if (b == 69 || b == 101) {
                    if (c2 != 2 && c2 != 4) {
                        return 0;
                    }
                    c2 = 5;
                } else if (b == 45) {
                    c = 6;
                    if (c2 == 0) {
                        c2 = 1;
                        z2 = true;
                    } else if (c2 != 5) {
                        return 0;
                    }
                } else if (b != 46) {
                    if (b < 48 || b > 57) {
                        break;
                    }
                    if (c2 == z || c2 == 0) {
                        j = -(b - 48);
                        c2 = 2;
                    } else if (c2 == 2) {
                        if (j == 0) {
                            return 0;
                        }
                        long j2 = (10 * j) - (b - 48);
                        z3 &= j > -922337203685477580L || (j == -922337203685477580L && j2 < j);
                        j = j2;
                    } else if (c2 == 3) {
                        c2 = 4;
                    } else if (c2 == 5 || c2 == 6) {
                        c2 = 7;
                    }
                } else {
                    if (c2 != 2) {
                        return 0;
                    }
                    c2 = 3;
                }
                i = i2;
                z = true;
            } else {
                c = 6;
                if (c2 != 5) {
                    return 0;
                }
            }
            c2 = c;
            i = i2;
            z = true;
        }
        if (isLiteral(b)) {
            return 0;
        }
        if (c2 == 2 && z3 && ((j != Long.MIN_VALUE || z2) && (j != 0 || !z2))) {
            if (!z2) {
                j = -j;
            }
            this.peekedLong = j;
            this.buffer.skip(i);
            this.peeked = 16;
            return 16;
        }
        if (c2 != 2 && c2 != 4 && c2 != 7) {
            return 0;
        }
        this.peekedNumberLength = i;
        this.peeked = 17;
        return 17;
    }

    public final boolean isLiteral(int i) throws IOException {
        if (i == 9 || i == 10 || i == 12 || i == 13 || i == 32) {
            return false;
        }
        if (i != 35) {
            if (i == 44) {
                return false;
            }
            if (i != 47 && i != 61) {
                if (i == 123 || i == 125 || i == 58) {
                    return false;
                }
                if (i != 59) {
                    switch (i) {
                        case 91:
                        case 93:
                            return false;
                        case 92:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextName() throws IOException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            strNextQuotedValue = nextUnquotedValue();
        } else if (iDoPeek == 13) {
            strNextQuotedValue = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 12) {
            strNextQuotedValue = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 15) {
            strNextQuotedValue = this.peekedString;
        } else {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = strNextQuotedValue;
        return strNextQuotedValue;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int selectName(JsonReader.Options options) throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek < 12 || iDoPeek > 15) {
            return -1;
        }
        if (iDoPeek == 15) {
            return findName(this.peekedString, options);
        }
        int iSelect = this.source.select(options.doubleQuoteSuffix);
        if (iSelect != -1) {
            this.peeked = 0;
            this.pathNames[this.stackSize - 1] = options.strings[iSelect];
            return iSelect;
        }
        String str = this.pathNames[this.stackSize - 1];
        String strNextName = nextName();
        int iFindName = findName(strNextName, options);
        if (iFindName == -1) {
            this.peeked = 15;
            this.peekedString = strNextName;
            this.pathNames[this.stackSize - 1] = str;
        }
        return iFindName;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipName() throws IOException {
        if (this.failOnUnknown) {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 14) {
            skipUnquotedValue();
        } else if (iDoPeek == 13) {
            skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 12) {
            skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (iDoPeek != 15) {
            throw new JsonDataException("Expected a name but was " + peek() + " at path " + getPath());
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = "null";
    }

    public final int findName(String str, JsonReader.Options options) {
        int length = options.strings.length;
        for (int i = 0; i < length; i++) {
            if (str.equals(options.strings[i])) {
                this.peeked = 0;
                this.pathNames[this.stackSize - 1] = str;
                return i;
            }
        }
        return -1;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public String nextString() throws IOException {
        String utf8;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 10) {
            utf8 = nextUnquotedValue();
        } else if (iDoPeek == 9) {
            utf8 = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 8) {
            utf8 = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 11) {
            utf8 = this.peekedString;
            this.peekedString = null;
        } else if (iDoPeek == 16) {
            utf8 = Long.toString(this.peekedLong);
        } else if (iDoPeek == 17) {
            utf8 = this.buffer.readUtf8(this.peekedNumberLength);
        } else {
            throw new JsonDataException("Expected a string but was " + peek() + " at path " + getPath());
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i = this.stackSize - 1;
        iArr[i] = iArr[i] + 1;
        return utf8;
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public boolean nextBoolean() throws IOException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iDoPeek == 6) {
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new JsonDataException("Expected a boolean but was " + peek() + " at path " + getPath());
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public double nextDouble() throws IOException, NumberFormatException {
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 16) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i = this.stackSize - 1;
            iArr[i] = iArr[i] + 1;
            return this.peekedLong;
        }
        if (iDoPeek == 17) {
            this.peekedString = this.buffer.readUtf8(this.peekedNumberLength);
        } else if (iDoPeek == 9) {
            this.peekedString = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 8) {
            this.peekedString = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
        } else if (iDoPeek == 10) {
            this.peekedString = nextUnquotedValue();
        } else if (iDoPeek != 11) {
            throw new JsonDataException("Expected a double but was " + peek() + " at path " + getPath());
        }
        this.peeked = 11;
        try {
            double d = Double.parseDouble(this.peekedString);
            if (!this.lenient && (Double.isNaN(d) || Double.isInfinite(d))) {
                throw new JsonEncodingException("JSON forbids NaN and infinities: " + d + " at path " + getPath());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return d;
        } catch (NumberFormatException unused) {
            throw new JsonDataException("Expected a double but was " + this.peekedString + " at path " + getPath());
        }
    }

    public final String nextQuotedValue(ByteString byteString) throws IOException {
        StringBuilder sb = null;
        while (true) {
            long jIndexOfElement = this.source.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.getByte(jIndexOfElement) != 92) {
                if (sb == null) {
                    String utf8 = this.buffer.readUtf8(jIndexOfElement);
                    this.buffer.readByte();
                    return utf8;
                }
                sb.append(this.buffer.readUtf8(jIndexOfElement));
                this.buffer.readByte();
                return sb.toString();
            }
            if (sb == null) {
                sb = new StringBuilder();
            }
            sb.append(this.buffer.readUtf8(jIndexOfElement));
            this.buffer.readByte();
            sb.append(readEscapeCharacter());
        }
    }

    public final String nextUnquotedValue() throws IOException {
        long jIndexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
        return jIndexOfElement != -1 ? this.buffer.readUtf8(jIndexOfElement) : this.buffer.readUtf8();
    }

    public final void skipQuotedValue(ByteString byteString) throws IOException {
        while (true) {
            long jIndexOfElement = this.source.indexOfElement(byteString);
            if (jIndexOfElement == -1) {
                throw syntaxError("Unterminated string");
            }
            if (this.buffer.getByte(jIndexOfElement) == 92) {
                this.buffer.skip(jIndexOfElement + 1);
                readEscapeCharacter();
            } else {
                this.buffer.skip(jIndexOfElement + 1);
                return;
            }
        }
    }

    public final void skipUnquotedValue() throws IOException {
        long jIndexOfElement = this.source.indexOfElement(UNQUOTED_STRING_TERMINALS);
        Buffer buffer = this.buffer;
        if (jIndexOfElement == -1) {
            jIndexOfElement = buffer.size();
        }
        buffer.skip(jIndexOfElement);
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public int nextInt() throws IOException, NumberFormatException {
        String strNextQuotedValue;
        int iDoPeek = this.peeked;
        if (iDoPeek == 0) {
            iDoPeek = doPeek();
        }
        if (iDoPeek == 16) {
            long j = this.peekedLong;
            int i = (int) j;
            if (j != i) {
                throw new JsonDataException("Expected an int but was " + this.peekedLong + " at path " + getPath());
            }
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iDoPeek == 17) {
            this.peekedString = this.buffer.readUtf8(this.peekedNumberLength);
        } else if (iDoPeek == 9 || iDoPeek == 8) {
            if (iDoPeek == 9) {
                strNextQuotedValue = nextQuotedValue(DOUBLE_QUOTE_OR_SLASH);
            } else {
                strNextQuotedValue = nextQuotedValue(SINGLE_QUOTE_OR_SLASH);
            }
            this.peekedString = strNextQuotedValue;
            try {
                int i3 = Integer.parseInt(strNextQuotedValue);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (NumberFormatException unused) {
            }
        } else if (iDoPeek != 11) {
            throw new JsonDataException("Expected an int but was " + peek() + " at path " + getPath());
        }
        this.peeked = 11;
        try {
            double d = Double.parseDouble(this.peekedString);
            int i5 = (int) d;
            if (i5 != d) {
                throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i6 = this.stackSize - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        } catch (NumberFormatException unused2) {
            throw new JsonDataException("Expected an int but was " + this.peekedString + " at path " + getPath());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.scopes[0] = 8;
        this.stackSize = 1;
        this.buffer.clear();
        this.source.close();
    }

    @Override // com.airbnb.lottie.parser.moshi.JsonReader
    public void skipValue() throws IOException {
        if (this.failOnUnknown) {
            throw new JsonDataException("Cannot skip unexpected " + peek() + " at " + getPath());
        }
        int i = 0;
        do {
            int iDoPeek = this.peeked;
            if (iDoPeek == 0) {
                iDoPeek = doPeek();
            }
            if (iDoPeek == 3) {
                pushScope(1);
            } else if (iDoPeek == 1) {
                pushScope(3);
            } else {
                if (iDoPeek == 4) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (iDoPeek == 2) {
                    i--;
                    if (i < 0) {
                        throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                    }
                    this.stackSize--;
                } else if (iDoPeek == 14 || iDoPeek == 10) {
                    skipUnquotedValue();
                } else if (iDoPeek == 9 || iDoPeek == 13) {
                    skipQuotedValue(DOUBLE_QUOTE_OR_SLASH);
                } else if (iDoPeek == 8 || iDoPeek == 12) {
                    skipQuotedValue(SINGLE_QUOTE_OR_SLASH);
                } else if (iDoPeek == 17) {
                    this.buffer.skip(this.peekedNumberLength);
                } else if (iDoPeek == 18) {
                    throw new JsonDataException("Expected a value but was " + peek() + " at path " + getPath());
                }
                this.peeked = 0;
            }
            i++;
            this.peeked = 0;
        } while (i != 0);
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        iArr[i3] = iArr[i3] + 1;
        this.pathNames[i2 - 1] = "null";
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0025, code lost:
    
        r6.buffer.skip(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x002d, code lost:
    
        if (r2 != 47) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0037, code lost:
    
        if (r6.source.request(2) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0039, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x003a, code lost:
    
        checkLenient();
        r3 = r6.buffer.getByte(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0047, code lost:
    
        if (r3 == 42) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0049, code lost:
    
        if (r3 == 47) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x004b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x004c, code lost:
    
        r6.buffer.readByte();
        r6.buffer.readByte();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x005a, code lost:
    
        r6.buffer.readByte();
        r6.buffer.readByte();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0068, code lost:
    
        if (skipToEndOfBlockComment() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0071, code lost:
    
        throw syntaxError("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0074, code lost:
    
        if (r2 != 35) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0076, code lost:
    
        checkLenient();
        skipToEndOfLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x007d, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int nextNonWhitespace(boolean z) throws IOException {
        while (true) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (!this.source.request(i2)) {
                    if (z) {
                        throw new EOFException("End of input");
                    }
                    return -1;
                }
                byte b = this.buffer.getByte(i);
                if (b != 10 && b != 32 && b != 13 && b != 9) {
                    break;
                }
                i = i2;
            }
        }
    }

    public final void checkLenient() throws IOException {
        if (!this.lenient) {
            throw syntaxError("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    public final void skipToEndOfLine() throws IOException {
        long jIndexOfElement = this.source.indexOfElement(LINEFEED_OR_CARRIAGE_RETURN);
        Buffer buffer = this.buffer;
        buffer.skip(jIndexOfElement != -1 ? jIndexOfElement + 1 : buffer.size());
    }

    public final boolean skipToEndOfBlockComment() throws IOException {
        long jIndexOf = this.source.indexOf(CLOSING_BLOCK_COMMENT);
        boolean z = jIndexOf != -1;
        Buffer buffer = this.buffer;
        buffer.skip(z ? jIndexOf + r1.size() : buffer.size());
        return z;
    }

    public String toString() {
        return "JsonReader(" + this.source + ")";
    }

    public final char readEscapeCharacter() throws IOException {
        int i;
        if (!this.source.request(1L)) {
            throw syntaxError("Unterminated escape sequence");
        }
        byte b = this.buffer.readByte();
        if (b == 10 || b == 34 || b == 39 || b == 47 || b == 92) {
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
        if (b == 117) {
            if (!this.source.request(4L)) {
                throw new EOFException("Unterminated escape sequence at path " + getPath());
            }
            char c = 0;
            for (int i2 = 0; i2 < 4; i2++) {
                byte b2 = this.buffer.getByte(i2);
                char c2 = (char) (c << 4);
                if (b2 >= 48 && b2 <= 57) {
                    i = b2 - 48;
                } else if (b2 >= 97 && b2 <= 102) {
                    i = b2 - 87;
                } else {
                    if (b2 < 65 || b2 > 70) {
                        throw syntaxError("\\u" + this.buffer.readUtf8(4L));
                    }
                    i = b2 + ExifInterface.MARKER_SOF9;
                }
                c = (char) (c2 + i);
            }
            this.buffer.skip(4L);
            return c;
        }
        if (this.lenient) {
            return (char) b;
        }
        throw syntaxError("Invalid escape sequence: \\" + ((char) b));
    }
}
