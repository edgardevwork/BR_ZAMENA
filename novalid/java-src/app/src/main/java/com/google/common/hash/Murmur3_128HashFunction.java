package com.google.common.hash;

import com.google.common.primitives.UnsignedBytes;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import javax.annotation.CheckForNull;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class Murmur3_128HashFunction extends AbstractHashFunction implements Serializable {
    public static final long serialVersionUID = 0;
    public final int seed;
    public static final HashFunction MURMUR3_128 = new Murmur3_128HashFunction(0);
    public static final HashFunction GOOD_FAST_HASH_128 = new Murmur3_128HashFunction(Hashing.GOOD_FAST_HASH_SEED);

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 128;
    }

    public Murmur3_128HashFunction(int seed) {
        this.seed = seed;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new Murmur3_128Hasher(this.seed);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.seed + ")";
    }

    public boolean equals(@CheckForNull Object object) {
        return (object instanceof Murmur3_128HashFunction) && this.seed == ((Murmur3_128HashFunction) object).seed;
    }

    public int hashCode() {
        return Murmur3_128HashFunction.class.hashCode() ^ this.seed;
    }

    /* loaded from: classes8.dex */
    public static final class Murmur3_128Hasher extends AbstractStreamingHasher {

        /* renamed from: C1 */
        public static final long f826C1 = -8663945395140668459L;

        /* renamed from: C2 */
        public static final long f827C2 = 5545529020109919103L;
        public static final int CHUNK_SIZE = 16;

        /* renamed from: h1 */
        public long f828h1;

        /* renamed from: h2 */
        public long f829h2;
        public int length;

        public static long fmix64(long k) {
            long j = (k ^ (k >>> 33)) * (-49064778989728563L);
            long j2 = (j ^ (j >>> 33)) * (-4265267296055464877L);
            return j2 ^ (j2 >>> 33);
        }

        public Murmur3_128Hasher(int seed) {
            super(16);
            long j = seed;
            this.f828h1 = j;
            this.f829h2 = j;
            this.length = 0;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer bb) {
            bmix64(bb.getLong(), bb.getLong());
            this.length += 16;
        }

        public final void bmix64(long k1, long k2) {
            long jMixK1 = mixK1(k1) ^ this.f828h1;
            this.f828h1 = jMixK1;
            long jRotateLeft = Long.rotateLeft(jMixK1, 27);
            long j = this.f829h2;
            this.f828h1 = ((jRotateLeft + j) * 5) + 1390208809;
            long jMixK2 = mixK2(k2) ^ j;
            this.f829h2 = jMixK2;
            this.f829h2 = ((Long.rotateLeft(jMixK2, 31) + this.f828h1) * 5) + 944331445;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer bb) {
            long j;
            long j2;
            long j3;
            long j4;
            long j5;
            long j6;
            long j7;
            this.length += bb.remaining();
            long j8 = 0;
            switch (bb.remaining()) {
                case 1:
                    j = 0;
                    j7 = j ^ UnsignedBytes.toInt(bb.get(0));
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 2:
                    j2 = 0;
                    j = j2 ^ (UnsignedBytes.toInt(bb.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(bb.get(0));
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 3:
                    j3 = 0;
                    j2 = (UnsignedBytes.toInt(bb.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(bb.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(bb.get(0));
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 4:
                    j4 = 0;
                    j3 = j4 ^ (UnsignedBytes.toInt(bb.get(3)) << 24);
                    j2 = (UnsignedBytes.toInt(bb.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(bb.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(bb.get(0));
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 5:
                    j5 = 0;
                    j4 = j5 ^ (UnsignedBytes.toInt(bb.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(bb.get(3)) << 24);
                    j2 = (UnsignedBytes.toInt(bb.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(bb.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(bb.get(0));
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 6:
                    j6 = 0;
                    j5 = (UnsignedBytes.toInt(bb.get(5)) << 40) ^ j6;
                    j4 = j5 ^ (UnsignedBytes.toInt(bb.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(bb.get(3)) << 24);
                    j2 = (UnsignedBytes.toInt(bb.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(bb.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(bb.get(0));
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 7:
                    j6 = UnsignedBytes.toInt(bb.get(6)) << 48;
                    j5 = (UnsignedBytes.toInt(bb.get(5)) << 40) ^ j6;
                    j4 = j5 ^ (UnsignedBytes.toInt(bb.get(4)) << 32);
                    j3 = j4 ^ (UnsignedBytes.toInt(bb.get(3)) << 24);
                    j2 = (UnsignedBytes.toInt(bb.get(2)) << 16) ^ j3;
                    j = j2 ^ (UnsignedBytes.toInt(bb.get(1)) << 8);
                    j7 = j ^ UnsignedBytes.toInt(bb.get(0));
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 8:
                    j7 = bb.getLong();
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 9:
                    j8 ^= UnsignedBytes.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 10:
                    j8 ^= UnsignedBytes.toInt(bb.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 11:
                    j8 ^= UnsignedBytes.toInt(bb.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(bb.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 12:
                    j8 ^= UnsignedBytes.toInt(bb.get(11)) << 24;
                    j8 ^= UnsignedBytes.toInt(bb.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(bb.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 13:
                    j8 ^= UnsignedBytes.toInt(bb.get(12)) << 32;
                    j8 ^= UnsignedBytes.toInt(bb.get(11)) << 24;
                    j8 ^= UnsignedBytes.toInt(bb.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(bb.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 14:
                    j8 ^= UnsignedBytes.toInt(bb.get(13)) << 40;
                    j8 ^= UnsignedBytes.toInt(bb.get(12)) << 32;
                    j8 ^= UnsignedBytes.toInt(bb.get(11)) << 24;
                    j8 ^= UnsignedBytes.toInt(bb.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(bb.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                case 15:
                    j8 = UnsignedBytes.toInt(bb.get(14)) << 48;
                    j8 ^= UnsignedBytes.toInt(bb.get(13)) << 40;
                    j8 ^= UnsignedBytes.toInt(bb.get(12)) << 32;
                    j8 ^= UnsignedBytes.toInt(bb.get(11)) << 24;
                    j8 ^= UnsignedBytes.toInt(bb.get(10)) << 16;
                    j8 ^= UnsignedBytes.toInt(bb.get(9)) << 8;
                    j8 ^= UnsignedBytes.toInt(bb.get(8));
                    j7 = bb.getLong();
                    this.f828h1 = mixK1(j7) ^ this.f828h1;
                    this.f829h2 ^= mixK2(j8);
                    return;
                default:
                    throw new AssertionError("Should never get here.");
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j = this.f828h1;
            int i = this.length;
            long j2 = j ^ i;
            long j3 = this.f829h2 ^ i;
            long j4 = j2 + j3;
            this.f828h1 = j4;
            this.f829h2 = j3 + j4;
            this.f828h1 = fmix64(j4);
            long jFmix64 = fmix64(this.f829h2);
            long j5 = this.f828h1 + jFmix64;
            this.f828h1 = j5;
            this.f829h2 = jFmix64 + j5;
            return HashCode.fromBytesNoCopy(ByteBuffer.wrap(new byte[16]).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f828h1).putLong(this.f829h2).array());
        }

        public static long mixK1(long k1) {
            return Long.rotateLeft(k1 * (-8663945395140668459L), 31) * 5545529020109919103L;
        }

        public static long mixK2(long k2) {
            return Long.rotateLeft(k2 * 5545529020109919103L, 33) * (-8663945395140668459L);
        }
    }
}
