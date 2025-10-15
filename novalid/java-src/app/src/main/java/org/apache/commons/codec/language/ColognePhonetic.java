package org.apache.commons.codec.language;

import io.ktor.util.date.GMTDateParser;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;

/* loaded from: classes5.dex */
public class ColognePhonetic implements StringEncoder {
    public static final char CHAR_IGNORE = '-';
    public static final char[] AEIJOUY = {'A', 'E', 'I', 'J', 'O', 'U', GMTDateParser.YEAR};
    public static final char[] CSZ = {'C', 'S', 'Z'};
    public static final char[] FPVW = {'F', 'P', 'V', 'W'};
    public static final char[] GKQ = {'G', 'K', 'Q'};
    public static final char[] CKQ = {'C', 'K', 'Q'};
    public static final char[] AHKLOQRUX = {'A', 'H', 'K', 'L', 'O', 'Q', 'R', 'U', 'X'};

    /* renamed from: SZ */
    public static final char[] f9824SZ = {'S', 'Z'};
    public static final char[] AHKOQUX = {'A', 'H', 'K', 'O', 'Q', 'U', 'X'};
    public static final char[] DTX = {'D', 'T', 'X'};

    public abstract class CologneBuffer {
        public final char[] data;
        public int length;

        public abstract char[] copyData(int i, int i2);

        public CologneBuffer(char[] cArr) {
            this.length = 0;
            this.data = cArr;
            this.length = cArr.length;
        }

        public CologneBuffer(int i) {
            this.length = 0;
            this.data = new char[i];
            this.length = 0;
        }

        public int length() {
            return this.length;
        }

        public String toString() {
            return new String(copyData(0, this.length));
        }
    }

    /* loaded from: classes8.dex */
    public class CologneOutputBuffer extends CologneBuffer {
        public char lastCode;

        public CologneOutputBuffer(int i) {
            super(i);
            this.lastCode = '/';
        }

        public void put(char c) {
            if (c != '-' && this.lastCode != c && (c != '0' || this.length == 0)) {
                char[] cArr = this.data;
                int i = this.length;
                cArr[i] = c;
                this.length = i + 1;
            }
            this.lastCode = c;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i, int i2) {
            char[] cArr = new char[i2];
            System.arraycopy(this.data, i, cArr, 0, i2);
            return cArr;
        }
    }

    /* loaded from: classes8.dex */
    public class CologneInputBuffer extends CologneBuffer {
        public CologneInputBuffer(char[] cArr) {
            super(cArr);
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i, int i2) {
            char[] cArr = new char[i2];
            char[] cArr2 = this.data;
            System.arraycopy(cArr2, (cArr2.length - this.length) + i, cArr, 0, i2);
            return cArr;
        }

        public char getNextChar() {
            return this.data[getNextPos()];
        }

        public int getNextPos() {
            return this.data.length - this.length;
        }

        public char removeNext() {
            this.length--;
            return getNextChar();
        }
    }

    public static boolean arrayContains(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    public String colognePhonetic(String str) {
        if (str == null) {
            return null;
        }
        CologneInputBuffer cologneInputBuffer = new CologneInputBuffer(preprocess(str));
        CologneOutputBuffer cologneOutputBuffer = new CologneOutputBuffer(cologneInputBuffer.length() * 2);
        char c = '-';
        while (cologneInputBuffer.length() > 0) {
            char cRemoveNext = cologneInputBuffer.removeNext();
            char nextChar = cologneInputBuffer.length() > 0 ? cologneInputBuffer.getNextChar() : '-';
            if (cRemoveNext >= 'A' && cRemoveNext <= 'Z') {
                if (arrayContains(AEIJOUY, cRemoveNext)) {
                    cologneOutputBuffer.put('0');
                } else if (cRemoveNext == 'B' || (cRemoveNext == 'P' && nextChar != 'H')) {
                    cologneOutputBuffer.put('1');
                } else if ((cRemoveNext == 'D' || cRemoveNext == 'T') && !arrayContains(CSZ, nextChar)) {
                    cologneOutputBuffer.put('2');
                } else if (arrayContains(FPVW, cRemoveNext)) {
                    cologneOutputBuffer.put('3');
                } else if (arrayContains(GKQ, cRemoveNext)) {
                    cologneOutputBuffer.put('4');
                } else if (cRemoveNext == 'X' && !arrayContains(CKQ, c)) {
                    cologneOutputBuffer.put('4');
                    cologneOutputBuffer.put('8');
                } else if (cRemoveNext == 'S' || cRemoveNext == 'Z') {
                    cologneOutputBuffer.put('8');
                } else if (cRemoveNext == 'C') {
                    if (cologneOutputBuffer.length() == 0) {
                        if (arrayContains(AHKLOQRUX, nextChar)) {
                            cologneOutputBuffer.put('4');
                        } else {
                            cologneOutputBuffer.put('8');
                        }
                    } else if (arrayContains(f9824SZ, c) || !arrayContains(AHKOQUX, nextChar)) {
                        cologneOutputBuffer.put('8');
                    } else {
                        cologneOutputBuffer.put('4');
                    }
                } else if (arrayContains(DTX, cRemoveNext)) {
                    cologneOutputBuffer.put('8');
                } else if (cRemoveNext == 'R') {
                    cologneOutputBuffer.put('7');
                } else if (cRemoveNext == 'L') {
                    cologneOutputBuffer.put('5');
                } else if (cRemoveNext == 'M' || cRemoveNext == 'N') {
                    cologneOutputBuffer.put('6');
                } else if (cRemoveNext == 'H') {
                    cologneOutputBuffer.put('-');
                }
                c = cRemoveNext;
            }
        }
        return cologneOutputBuffer.toString();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (!(obj instanceof String)) {
            throw new EncoderException("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + ".");
        }
        return encode((String) obj);
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return colognePhonetic(str);
    }

    public boolean isEncodeEqual(String str, String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }

    public final char[] preprocess(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (c == 196) {
                charArray[i] = 'A';
            } else if (c == 214) {
                charArray[i] = 'O';
            } else if (c == 220) {
                charArray[i] = 'U';
            }
        }
        return charArray;
    }
}
