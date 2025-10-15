package com.fasterxml.jackson.core.p022io;

import com.fasterxml.jackson.core.util.ByteArrayBuilder;
import com.fasterxml.jackson.core.util.TextBuffer;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes8.dex */
public final class JsonStringEncoder {
    public static final int MAX_BYTE_BUFFER_SIZE = 32000;
    public static final int MAX_CHAR_BUFFER_SIZE = 32000;
    public static final int MIN_BYTE_BUFFER_SIZE = 24;
    public static final int MIN_CHAR_BUFFER_SIZE = 16;
    public static final int SURR1_FIRST = 55296;
    public static final int SURR1_LAST = 56319;
    public static final int SURR2_FIRST = 56320;
    public static final int SURR2_LAST = 57343;

    /* renamed from: HC */
    public static final char[] f622HC = CharTypes.copyHexChars(true);

    /* renamed from: HB */
    public static final byte[] f621HB = CharTypes.copyHexBytes(true);
    public static final JsonStringEncoder instance = new JsonStringEncoder();

    public static JsonStringEncoder getInstance() {
        return instance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
    
        if (r10 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
    
        r7 = _appendNumeric(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        r7 = _appendNamed(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        r10 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        if (r10 <= r1.length) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        r10 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        if (r10 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0042, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r5 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        r5 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        r1 = r5.finishCurrentSegment();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r6 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        r6 = _qbuf();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char[] quoteAsString(String str) {
        int i;
        int length = str.length();
        char[] cArrFinishCurrentSegment = new char[_initialCharBufSize(length)];
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length2 = iArr.length;
        TextBuffer textBufferFromInitial = null;
        int i2 = 0;
        int i3 = 0;
        char[] cArr_qbuf = null;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            while (true) {
                char cCharAt = str.charAt(i2);
                if (cCharAt < length2 && iArr[cCharAt] != 0) {
                    break;
                }
                if (i3 >= cArrFinishCurrentSegment.length) {
                    if (textBufferFromInitial == null) {
                        textBufferFromInitial = TextBuffer.fromInitial(cArrFinishCurrentSegment);
                    }
                    cArrFinishCurrentSegment = textBufferFromInitial.finishCurrentSegment();
                    i3 = 0;
                }
                int i4 = i3 + 1;
                cArrFinishCurrentSegment[i3] = cCharAt;
                i2++;
                if (i2 >= length) {
                    i3 = i4;
                    break loop0;
                }
                i3 = i4;
            }
            i2 = i;
        }
        if (textBufferFromInitial == null) {
            return Arrays.copyOfRange(cArrFinishCurrentSegment, 0, i3);
        }
        textBufferFromInitial.setCurrentLength(i3);
        return textBufferFromInitial.contentsAsArray();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        r6 = _qbuf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0031, code lost:
    
        r9 = r7 + 1;
        r7 = r13.charAt(r7);
        r10 = r2[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
    
        if (r10 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r7 = _appendNumeric(r7, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r7 = _appendNamed(r10, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r10 = r8 + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (r10 <= r1.length) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r10 = r1.length - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r10 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0050, code lost:
    
        if (r4 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        r4 = com.fasterxml.jackson.core.util.TextBuffer.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        r1 = r4.finishCurrentSegment();
        r7 = r7 - r10;
        java.lang.System.arraycopy(r6, r10, r1, 0, r7);
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
    
        java.lang.System.arraycopy(r6, 0, r1, r8, r7);
        r8 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public char[] quoteAsString(CharSequence charSequence) {
        int i;
        if (charSequence instanceof String) {
            return quoteAsString((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArrFinishCurrentSegment = new char[_initialCharBufSize(length)];
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length2 = iArr.length;
        TextBuffer textBufferFromInitial = null;
        char[] cArr_qbuf = null;
        int i2 = 0;
        int i3 = 0;
        loop0: while (true) {
            if (i2 >= length) {
                break;
            }
            while (true) {
                char cCharAt = charSequence.charAt(i2);
                if (cCharAt < length2 && iArr[cCharAt] != 0) {
                    break;
                }
                if (i3 >= cArrFinishCurrentSegment.length) {
                    if (textBufferFromInitial == null) {
                        textBufferFromInitial = TextBuffer.fromInitial(cArrFinishCurrentSegment);
                    }
                    cArrFinishCurrentSegment = textBufferFromInitial.finishCurrentSegment();
                    i3 = 0;
                }
                int i4 = i3 + 1;
                cArrFinishCurrentSegment[i3] = cCharAt;
                i2++;
                if (i2 >= length) {
                    i3 = i4;
                    break loop0;
                }
                i3 = i4;
            }
            i2 = i;
        }
        if (textBufferFromInitial == null) {
            return Arrays.copyOfRange(cArrFinishCurrentSegment, 0, i3);
        }
        textBufferFromInitial.setCurrentLength(i3);
        return textBufferFromInitial.contentsAsArray();
    }

    public void quoteAsString(CharSequence charSequence, StringBuilder sb) {
        int i_appendNamed;
        int[] iArr = CharTypes.get7BitOutputEscapes();
        int length = iArr.length;
        int length2 = charSequence.length();
        char[] cArr_qbuf = null;
        int i = 0;
        while (i < length2) {
            do {
                char cCharAt = charSequence.charAt(i);
                if (cCharAt >= length || iArr[cCharAt] == 0) {
                    sb.append(cCharAt);
                    i++;
                } else {
                    if (cArr_qbuf == null) {
                        cArr_qbuf = _qbuf();
                    }
                    int i2 = i + 1;
                    char cCharAt2 = charSequence.charAt(i);
                    int i3 = iArr[cCharAt2];
                    if (i3 < 0) {
                        i_appendNamed = _appendNumeric(cCharAt2, cArr_qbuf);
                    } else {
                        i_appendNamed = _appendNamed(i3, cArr_qbuf);
                    }
                    sb.append(cArr_qbuf, 0, i_appendNamed);
                    i = i2;
                }
            } while (i < length2);
            return;
        }
    }

    public byte[] quoteAsUTF8(String str) {
        int i;
        int i2;
        int i3;
        int length = str.length();
        byte[] bArrFinishCurrentSegment = new byte[_initialByteBufSize(length)];
        ByteArrayBuilder byteArrayBuilderFromInitial = null;
        int i4 = 0;
        int i_appendByte = 0;
        loop0: while (true) {
            if (i4 >= length) {
                break;
            }
            int[] iArr = CharTypes.get7BitOutputEscapes();
            while (true) {
                char cCharAt = str.charAt(i4);
                if (cCharAt > 127 || iArr[cCharAt] != 0) {
                    break;
                }
                if (i_appendByte >= bArrFinishCurrentSegment.length) {
                    if (byteArrayBuilderFromInitial == null) {
                        byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i_appendByte);
                    }
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i_appendByte = 0;
                }
                int i5 = i_appendByte + 1;
                bArrFinishCurrentSegment[i_appendByte] = (byte) cCharAt;
                i4++;
                if (i4 >= length) {
                    i_appendByte = i5;
                    break loop0;
                }
                i_appendByte = i5;
            }
            if (byteArrayBuilderFromInitial == null) {
                byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i_appendByte);
            }
            if (i_appendByte >= bArrFinishCurrentSegment.length) {
                bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                i_appendByte = 0;
            }
            int i6 = i4 + 1;
            char cCharAt2 = str.charAt(i4);
            if (cCharAt2 <= 127) {
                i_appendByte = _appendByte(cCharAt2, iArr[cCharAt2], byteArrayBuilderFromInitial, i_appendByte);
                bArrFinishCurrentSegment = byteArrayBuilderFromInitial.getCurrentSegment();
            } else {
                if (cCharAt2 <= 2047) {
                    i3 = i_appendByte + 1;
                    bArrFinishCurrentSegment[i_appendByte] = (byte) ((cCharAt2 >> 6) | 192);
                    i2 = (cCharAt2 & '?') | 128;
                } else {
                    if (cCharAt2 < 55296 || cCharAt2 > 57343) {
                        int i7 = i_appendByte + 1;
                        bArrFinishCurrentSegment[i_appendByte] = (byte) ((cCharAt2 >> '\f') | 224);
                        if (i7 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i7 = 0;
                        }
                        bArrFinishCurrentSegment[i7] = (byte) (((cCharAt2 >> 6) & 63) | 128);
                        i = i7 + 1;
                        i2 = (cCharAt2 & '?') | 128;
                    } else {
                        if (cCharAt2 > 56319) {
                            _illegal(cCharAt2);
                        }
                        if (i6 >= length) {
                            _illegal(cCharAt2);
                        }
                        int i8 = i4 + 2;
                        int i_convert = _convert(cCharAt2, str.charAt(i6));
                        if (i_convert > 1114111) {
                            _illegal(i_convert);
                        }
                        int i9 = i_appendByte + 1;
                        bArrFinishCurrentSegment[i_appendByte] = (byte) ((i_convert >> 18) | 240);
                        if (i9 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i9 = 0;
                        }
                        int i10 = i9 + 1;
                        bArrFinishCurrentSegment[i9] = (byte) (((i_convert >> 12) & 63) | 128);
                        if (i10 >= bArrFinishCurrentSegment.length) {
                            bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                            i10 = 0;
                        }
                        int i11 = i10 + 1;
                        bArrFinishCurrentSegment[i10] = (byte) (((i_convert >> 6) & 63) | 128);
                        i2 = (i_convert & 63) | 128;
                        i = i11;
                        i6 = i8;
                    }
                    i3 = i;
                }
                if (i3 >= bArrFinishCurrentSegment.length) {
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i3 = 0;
                }
                bArrFinishCurrentSegment[i3] = (byte) i2;
                i_appendByte = i3 + 1;
            }
            i4 = i6;
        }
        if (byteArrayBuilderFromInitial == null) {
            return Arrays.copyOfRange(bArrFinishCurrentSegment, 0, i_appendByte);
        }
        return byteArrayBuilderFromInitial.completeAndCoalesce(i_appendByte);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] encodeAsUTF8(String str) {
        int i;
        int i2;
        int length = str.length();
        int i_initialByteBufSize = _initialByteBufSize(length);
        byte[] bArrFinishCurrentSegment = new byte[i_initialByteBufSize];
        ByteArrayBuilder byteArrayBuilderFromInitial = null;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            int i5 = i3 + 1;
            int iCharAt = str.charAt(i3);
            while (iCharAt <= 127) {
                if (i4 >= i_initialByteBufSize) {
                    if (byteArrayBuilderFromInitial == null) {
                        byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i4);
                    }
                    byte[] bArrFinishCurrentSegment2 = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i4 = 0;
                    bArrFinishCurrentSegment = bArrFinishCurrentSegment2;
                    i_initialByteBufSize = bArrFinishCurrentSegment2.length;
                }
                int i6 = i4 + 1;
                bArrFinishCurrentSegment[i4] = (byte) iCharAt;
                if (i5 >= length) {
                    i4 = i6;
                    break loop0;
                }
                int iCharAt2 = str.charAt(i5);
                i5++;
                iCharAt = iCharAt2;
                i4 = i6;
            }
            if (byteArrayBuilderFromInitial == null) {
                byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i4);
            }
            if (i4 >= i_initialByteBufSize) {
                bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                i_initialByteBufSize = bArrFinishCurrentSegment.length;
                i4 = 0;
            }
            if (iCharAt < 2048) {
                i = i4 + 1;
                bArrFinishCurrentSegment[i4] = (byte) ((iCharAt >> 6) | 192);
            } else if (iCharAt < 55296 || iCharAt > 57343) {
                int i7 = i4 + 1;
                bArrFinishCurrentSegment[i4] = (byte) ((iCharAt >> 12) | 224);
                if (i7 >= i_initialByteBufSize) {
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i_initialByteBufSize = bArrFinishCurrentSegment.length;
                    i7 = 0;
                }
                bArrFinishCurrentSegment[i7] = (byte) (((iCharAt >> 6) & 63) | 128);
                i = i7 + 1;
            } else {
                if (iCharAt > 56319) {
                    _illegal(iCharAt);
                }
                if (i5 >= length) {
                    _illegal(iCharAt);
                }
                int i8 = i5 + 1;
                int i_convert = _convert(iCharAt, str.charAt(i5));
                if (i_convert > 1114111) {
                    _illegal(i_convert);
                }
                int i9 = i4 + 1;
                bArrFinishCurrentSegment[i4] = (byte) ((i_convert >> 18) | 240);
                if (i9 >= i_initialByteBufSize) {
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i_initialByteBufSize = bArrFinishCurrentSegment.length;
                    i9 = 0;
                }
                int i10 = i9 + 1;
                bArrFinishCurrentSegment[i9] = (byte) (((i_convert >> 12) & 63) | 128);
                if (i10 >= i_initialByteBufSize) {
                    byte[] bArrFinishCurrentSegment3 = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i10 = 0;
                    bArrFinishCurrentSegment = bArrFinishCurrentSegment3;
                    i_initialByteBufSize = bArrFinishCurrentSegment3.length;
                }
                int i11 = i10 + 1;
                bArrFinishCurrentSegment[i10] = (byte) (((i_convert >> 6) & 63) | 128);
                i2 = i_convert;
                i3 = i8;
                i = i11;
                if (i < i_initialByteBufSize) {
                    byte[] bArrFinishCurrentSegment4 = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i = 0;
                    bArrFinishCurrentSegment = bArrFinishCurrentSegment4;
                    i_initialByteBufSize = bArrFinishCurrentSegment4.length;
                }
                bArrFinishCurrentSegment[i] = (byte) ((i2 & 63) | 128);
                i4 = i + 1;
            }
            i2 = iCharAt;
            i3 = i5;
            if (i < i_initialByteBufSize) {
            }
            bArrFinishCurrentSegment[i] = (byte) ((i2 & 63) | 128);
            i4 = i + 1;
        }
        if (byteArrayBuilderFromInitial == null) {
            return Arrays.copyOfRange(bArrFinishCurrentSegment, 0, i4);
        }
        return byteArrayBuilderFromInitial.completeAndCoalesce(i4);
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public byte[] encodeAsUTF8(CharSequence charSequence) {
        int i;
        int i2;
        int length = charSequence.length();
        int i_initialByteBufSize = _initialByteBufSize(length);
        byte[] bArrFinishCurrentSegment = new byte[i_initialByteBufSize];
        ByteArrayBuilder byteArrayBuilderFromInitial = null;
        int i3 = 0;
        int i4 = 0;
        loop0: while (true) {
            if (i3 >= length) {
                break;
            }
            int i5 = i3 + 1;
            int iCharAt = charSequence.charAt(i3);
            while (iCharAt <= 127) {
                if (i4 >= i_initialByteBufSize) {
                    if (byteArrayBuilderFromInitial == null) {
                        byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i4);
                    }
                    byte[] bArrFinishCurrentSegment2 = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i4 = 0;
                    bArrFinishCurrentSegment = bArrFinishCurrentSegment2;
                    i_initialByteBufSize = bArrFinishCurrentSegment2.length;
                }
                int i6 = i4 + 1;
                bArrFinishCurrentSegment[i4] = (byte) iCharAt;
                if (i5 >= length) {
                    i4 = i6;
                    break loop0;
                }
                int iCharAt2 = charSequence.charAt(i5);
                i5++;
                iCharAt = iCharAt2;
                i4 = i6;
            }
            if (byteArrayBuilderFromInitial == null) {
                byteArrayBuilderFromInitial = ByteArrayBuilder.fromInitial(bArrFinishCurrentSegment, i4);
            }
            if (i4 >= i_initialByteBufSize) {
                bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                i_initialByteBufSize = bArrFinishCurrentSegment.length;
                i4 = 0;
            }
            if (iCharAt < 2048) {
                i = i4 + 1;
                bArrFinishCurrentSegment[i4] = (byte) ((iCharAt >> 6) | 192);
            } else if (iCharAt < 55296 || iCharAt > 57343) {
                int i7 = i4 + 1;
                bArrFinishCurrentSegment[i4] = (byte) ((iCharAt >> 12) | 224);
                if (i7 >= i_initialByteBufSize) {
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i_initialByteBufSize = bArrFinishCurrentSegment.length;
                    i7 = 0;
                }
                bArrFinishCurrentSegment[i7] = (byte) (((iCharAt >> 6) & 63) | 128);
                i = i7 + 1;
            } else {
                if (iCharAt > 56319) {
                    _illegal(iCharAt);
                }
                if (i5 >= length) {
                    _illegal(iCharAt);
                }
                int i8 = i5 + 1;
                int i_convert = _convert(iCharAt, charSequence.charAt(i5));
                if (i_convert > 1114111) {
                    _illegal(i_convert);
                }
                int i9 = i4 + 1;
                bArrFinishCurrentSegment[i4] = (byte) ((i_convert >> 18) | 240);
                if (i9 >= i_initialByteBufSize) {
                    bArrFinishCurrentSegment = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i_initialByteBufSize = bArrFinishCurrentSegment.length;
                    i9 = 0;
                }
                int i10 = i9 + 1;
                bArrFinishCurrentSegment[i9] = (byte) (((i_convert >> 12) & 63) | 128);
                if (i10 >= i_initialByteBufSize) {
                    byte[] bArrFinishCurrentSegment3 = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i10 = 0;
                    bArrFinishCurrentSegment = bArrFinishCurrentSegment3;
                    i_initialByteBufSize = bArrFinishCurrentSegment3.length;
                }
                int i11 = i10 + 1;
                bArrFinishCurrentSegment[i10] = (byte) (((i_convert >> 6) & 63) | 128);
                i2 = i_convert;
                i3 = i8;
                i = i11;
                if (i < i_initialByteBufSize) {
                    byte[] bArrFinishCurrentSegment4 = byteArrayBuilderFromInitial.finishCurrentSegment();
                    i = 0;
                    bArrFinishCurrentSegment = bArrFinishCurrentSegment4;
                    i_initialByteBufSize = bArrFinishCurrentSegment4.length;
                }
                bArrFinishCurrentSegment[i] = (byte) ((i2 & 63) | 128);
                i4 = i + 1;
            }
            i2 = iCharAt;
            i3 = i5;
            if (i < i_initialByteBufSize) {
            }
            bArrFinishCurrentSegment[i] = (byte) ((i2 & 63) | 128);
            i4 = i + 1;
        }
        if (byteArrayBuilderFromInitial == null) {
            return Arrays.copyOfRange(bArrFinishCurrentSegment, 0, i4);
        }
        return byteArrayBuilderFromInitial.completeAndCoalesce(i4);
    }

    public final char[] _qbuf() {
        return new char[]{'\\', 0, '0', '0', 0, 0};
    }

    public final int _appendNumeric(int i, char[] cArr) {
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        char[] cArr2 = f622HC;
        cArr[4] = cArr2[i >> 4];
        cArr[5] = cArr2[i & 15];
        return 6;
    }

    public final int _appendNamed(int i, char[] cArr) {
        cArr[1] = (char) i;
        return 2;
    }

    public final int _appendByte(int i, int i2, ByteArrayBuilder byteArrayBuilder, int i3) {
        byteArrayBuilder.setCurrentSegmentLength(i3);
        byteArrayBuilder.append(92);
        if (i2 < 0) {
            byteArrayBuilder.append(117);
            if (i > 255) {
                byte[] bArr = f621HB;
                byteArrayBuilder.append(bArr[i >> 12]);
                byteArrayBuilder.append(bArr[(i >> 8) & 15]);
                i &= 255;
            } else {
                byteArrayBuilder.append(48);
                byteArrayBuilder.append(48);
            }
            byte[] bArr2 = f621HB;
            byteArrayBuilder.append(bArr2[i >> 4]);
            byteArrayBuilder.append(bArr2[i & 15]);
        } else {
            byteArrayBuilder.append((byte) i2);
        }
        return byteArrayBuilder.getCurrentSegmentLength();
    }

    public static int _convert(int i, int i2) {
        if (i2 >= 56320 && i2 <= 57343) {
            return ((i - 55296) << 10) + 65536 + (i2 - 56320);
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(i2) + "; illegal combination");
    }

    public static void _illegal(int i) {
        throw new IllegalArgumentException(UTF8Writer.illegalSurrogateDesc(i));
    }

    public static int _initialCharBufSize(int i) {
        return Math.min(Math.max(16, i + Math.min((i >> 3) + 6, 1000)), 32000);
    }

    public static int _initialByteBufSize(int i) {
        return Math.min(Math.max(24, i + 6 + (i >> 1)), 32000);
    }
}
