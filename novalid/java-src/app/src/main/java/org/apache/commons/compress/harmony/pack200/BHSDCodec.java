package org.apache.commons.compress.harmony.pack200;

import com.fasterxml.jackson.core.base.ParserMinimalBase;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntToLongFunction;
import org.apache.commons.compress.utils.ExactMath;

/* loaded from: classes6.dex */
public final class BHSDCodec extends Codec {

    /* renamed from: b */
    public final int f9864b;
    public long cardinality;

    /* renamed from: d */
    public final int f9865d;

    /* renamed from: h */
    public final int f9866h;

    /* renamed from: l */
    public final int f9867l;
    public final long largest;
    public final long[] powers;

    /* renamed from: s */
    public final int f9868s;
    public final long smallest;

    public BHSDCodec(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public BHSDCodec(int i, int i2, int i3) {
        this(i, i2, i3, 0);
    }

    public BHSDCodec(int i, final int i2, int i3, int i4) {
        if (i < 1 || i > 5) {
            throw new IllegalArgumentException("1<=b<=5");
        }
        if (i2 < 1 || i2 > 256) {
            throw new IllegalArgumentException("1<=h<=256");
        }
        if (i3 < 0 || i3 > 2) {
            throw new IllegalArgumentException("0<=s<=2");
        }
        if (i4 < 0 || i4 > 1) {
            throw new IllegalArgumentException("0<=d<=1");
        }
        if (i == 1 && i2 != 256) {
            throw new IllegalArgumentException("b=1 -> h=256");
        }
        if (i2 == 256 && i == 5) {
            throw new IllegalArgumentException("h=256 -> b!=5");
        }
        this.f9864b = i;
        this.f9866h = i2;
        this.f9868s = i3;
        this.f9865d = i4;
        this.f9867l = 256 - i2;
        if (i2 == 1) {
            this.cardinality = (i * 255) + 1;
        } else {
            this.cardinality = (long) (((long) ((r11 * (1.0d - Math.pow(r0, r2))) / (1 - i2))) + Math.pow(i2, i));
        }
        this.smallest = calculateSmallest();
        this.largest = calculateLargest();
        long[] jArr = new long[i];
        this.powers = jArr;
        Arrays.setAll(jArr, new IntToLongFunction() { // from class: org.apache.commons.compress.harmony.pack200.BHSDCodec$$ExternalSyntheticLambda0
            @Override // java.util.function.IntToLongFunction
            public final long applyAsLong(int i5) {
                return BHSDCodec.lambda$new$0(i2, i5);
            }
        });
    }

    public static /* synthetic */ long lambda$new$0(int i, int i2) {
        return (long) Math.pow(i, i2);
    }

    public long cardinality() {
        return this.cardinality;
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int decode(InputStream inputStream) throws Pack200Exception, IOException {
        if (this.f9865d != 0) {
            throw new Pack200Exception("Delta encoding used without passing in last value; this is a coding error");
        }
        return decode(inputStream, 0L);
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int decode(InputStream inputStream, long j) throws Pack200Exception, IOException {
        long j2;
        int i = 0;
        long j3 = 0;
        do {
            j2 = inputStream.read();
            this.lastBandLength++;
            j3 += this.powers[i] * j2;
            i++;
            if (j2 < this.f9867l) {
                break;
            }
        } while (i < this.f9864b);
        if (j2 == -1) {
            throw new EOFException("End of stream reached whilst decoding");
        }
        if (isSigned()) {
            int i2 = this.f9868s;
            long j4 = (1 << i2) - 1;
            j3 = (j3 & j4) == j4 ? ~(j3 >>> i2) : j3 - (j3 >>> i2);
        }
        if (isDelta()) {
            j3 += j;
        }
        return (int) j3;
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int[] decodeInts(int i, InputStream inputStream) throws Pack200Exception, IOException {
        int[] iArrDecodeInts = super.decodeInts(i, inputStream);
        if (isDelta()) {
            for (int i2 = 0; i2 < iArrDecodeInts.length; i2++) {
                while (true) {
                    int i3 = iArrDecodeInts[i2];
                    if (i3 <= this.largest) {
                        break;
                    }
                    iArrDecodeInts[i2] = (int) (i3 - this.cardinality);
                }
                while (true) {
                    int i4 = iArrDecodeInts[i2];
                    if (i4 < this.smallest) {
                        iArrDecodeInts[i2] = ExactMath.add(i4, this.cardinality);
                    }
                }
            }
        }
        return iArrDecodeInts;
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public int[] decodeInts(int i, InputStream inputStream, int i2) throws Pack200Exception, IOException {
        int[] iArrDecodeInts = super.decodeInts(i, inputStream, i2);
        if (isDelta()) {
            for (int i3 = 0; i3 < iArrDecodeInts.length; i3++) {
                while (true) {
                    int i4 = iArrDecodeInts[i3];
                    if (i4 <= this.largest) {
                        break;
                    }
                    iArrDecodeInts[i3] = (int) (i4 - this.cardinality);
                }
                while (true) {
                    int i5 = iArrDecodeInts[i3];
                    if (i5 < this.smallest) {
                        iArrDecodeInts[i3] = ExactMath.add(i5, this.cardinality);
                    }
                }
            }
        }
        return iArrDecodeInts;
    }

    public boolean encodes(long j) {
        return j >= this.smallest && j <= this.largest;
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public byte[] encode(int i, int i2) throws Pack200Exception {
        long j;
        long jMin = i;
        if (!encodes(jMin)) {
            throw new Pack200Exception("The codec " + this + " does not encode the value " + i);
        }
        if (isDelta()) {
            jMin -= i2;
        }
        if (isSigned()) {
            if (jMin < ParserMinimalBase.MIN_INT_L) {
                jMin += 4294967296L;
            } else if (jMin > ParserMinimalBase.MAX_INT_L) {
                jMin -= 4294967296L;
            }
            if (jMin < 0) {
                jMin = ((-jMin) << this.f9868s) - 1;
            } else {
                int i3 = this.f9868s;
                jMin = i3 == 1 ? jMin << i3 : jMin + ((jMin - (jMin % 3)) / 3);
            }
        } else if (jMin < 0) {
            jMin += Math.min(this.cardinality, 4294967296L);
        }
        if (jMin < 0) {
            throw new Pack200Exception("unable to encode");
        }
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < this.f9864b; i4++) {
            if (jMin < this.f9867l) {
                j = jMin;
            } else {
                j = jMin % this.f9866h;
                while (j < this.f9867l) {
                    j += this.f9866h;
                }
            }
            arrayList.add(Byte.valueOf((byte) j));
            if (j < this.f9867l) {
                break;
            }
            jMin = (jMin - j) / this.f9866h;
        }
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i5 = 0; i5 < size; i5++) {
            bArr[i5] = ((Byte) arrayList.get(i5)).byteValue();
        }
        return bArr;
    }

    @Override // org.apache.commons.compress.harmony.pack200.Codec
    public byte[] encode(int i) throws Pack200Exception {
        return encode(i, 0);
    }

    public boolean isDelta() {
        return this.f9865d != 0;
    }

    public boolean isSigned() {
        return this.f9868s != 0;
    }

    public long largest() {
        return this.largest;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long calculateLargest() {
        long jCardinality;
        long jCardinality2;
        if (this.f9865d == 1) {
            return new BHSDCodec(this.f9864b, this.f9866h).largest();
        }
        int i = this.f9868s;
        if (i == 0) {
            jCardinality2 = cardinality();
        } else {
            if (i != 1) {
                if (i == 2) {
                    jCardinality = ((cardinality() * 3) / 4) - 1;
                    return Math.min((this.f9868s != 0 ? 4294967294L : ParserMinimalBase.MAX_INT_L) - 1, jCardinality);
                }
                throw new Error("Unknown s value");
            }
            jCardinality2 = cardinality() / 2;
        }
        jCardinality = jCardinality2 - 1;
        return Math.min((this.f9868s != 0 ? 4294967294L : ParserMinimalBase.MAX_INT_L) - 1, jCardinality);
    }

    public long smallest() {
        return this.smallest;
    }

    public final long calculateSmallest() {
        if (this.f9865d != 1 && isSigned()) {
            return Math.max(ParserMinimalBase.MIN_INT_L, (-cardinality()) / (1 << this.f9868s));
        }
        if (this.cardinality >= 4294967296L) {
            return ParserMinimalBase.MIN_INT_L;
        }
        return 0L;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(11);
        sb.append('(');
        sb.append(this.f9864b);
        sb.append(',');
        sb.append(this.f9866h);
        if (this.f9868s != 0 || this.f9865d != 0) {
            sb.append(',');
            sb.append(this.f9868s);
        }
        if (this.f9865d != 0) {
            sb.append(',');
            sb.append(this.f9865d);
        }
        sb.append(')');
        return sb.toString();
    }

    public int getB() {
        return this.f9864b;
    }

    public int getH() {
        return this.f9866h;
    }

    public int getS() {
        return this.f9868s;
    }

    public int getL() {
        return this.f9867l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BHSDCodec)) {
            return false;
        }
        BHSDCodec bHSDCodec = (BHSDCodec) obj;
        return bHSDCodec.f9864b == this.f9864b && bHSDCodec.f9866h == this.f9866h && bHSDCodec.f9868s == this.f9868s && bHSDCodec.f9865d == this.f9865d;
    }

    public int hashCode() {
        return (((((this.f9864b * 37) + this.f9866h) * 37) + this.f9868s) * 37) + this.f9865d;
    }
}
