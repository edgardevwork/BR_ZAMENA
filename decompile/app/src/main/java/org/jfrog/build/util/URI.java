package org.jfrog.build.util;

import java.util.BitSet;

/* loaded from: classes5.dex */
public class URI {
    public static final BitSet allowed_query;
    public static final BitSet alpha;
    public static final BitSet alphanum;
    public static final BitSet digit;
    public static final BitSet escaped;
    public static final BitSet hex;
    public static final BitSet mark;
    public static final BitSet percent;
    public static final BitSet reserved;
    public static final BitSet unreserved;
    public static final BitSet uric;

    static {
        BitSet bitSet = new BitSet(256);
        percent = bitSet;
        bitSet.set(37);
        digit = new BitSet(256);
        for (int i = 48; i <= 57; i++) {
            digit.set(i);
        }
        alpha = new BitSet(256);
        for (int i2 = 97; i2 <= 122; i2++) {
            alpha.set(i2);
        }
        for (int i3 = 65; i3 <= 90; i3++) {
            alpha.set(i3);
        }
        BitSet bitSet2 = new BitSet(256);
        alphanum = bitSet2;
        bitSet2.or(alpha);
        BitSet bitSet3 = digit;
        bitSet2.or(bitSet3);
        BitSet bitSet4 = new BitSet(256);
        hex = bitSet4;
        bitSet4.or(bitSet3);
        for (int i4 = 97; i4 <= 102; i4++) {
            hex.set(i4);
        }
        for (int i5 = 65; i5 <= 70; i5++) {
            hex.set(i5);
        }
        BitSet bitSet5 = new BitSet(256);
        escaped = bitSet5;
        bitSet5.or(percent);
        bitSet5.or(hex);
        BitSet bitSet6 = new BitSet(256);
        mark = bitSet6;
        bitSet6.set(45);
        bitSet6.set(95);
        bitSet6.set(46);
        bitSet6.set(33);
        bitSet6.set(126);
        bitSet6.set(42);
        bitSet6.set(39);
        bitSet6.set(40);
        bitSet6.set(41);
        BitSet bitSet7 = new BitSet(256);
        unreserved = bitSet7;
        bitSet7.or(alphanum);
        bitSet7.or(bitSet6);
        BitSet bitSet8 = new BitSet(256);
        reserved = bitSet8;
        bitSet8.set(59);
        bitSet8.set(47);
        bitSet8.set(63);
        bitSet8.set(58);
        bitSet8.set(64);
        bitSet8.set(38);
        bitSet8.set(61);
        bitSet8.set(43);
        bitSet8.set(36);
        bitSet8.set(44);
        BitSet bitSet9 = new BitSet(256);
        uric = bitSet9;
        bitSet9.or(bitSet8);
        bitSet9.or(bitSet7);
        bitSet9.or(bitSet5);
        BitSet bitSet10 = new BitSet(256);
        allowed_query = bitSet10;
        bitSet10.or(bitSet9);
        bitSet10.clear(37);
    }
}
