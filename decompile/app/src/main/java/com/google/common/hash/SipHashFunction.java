package com.google.common.hash;

import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.nio.ByteBuffer;
import javax.annotation.CheckForNull;

@Immutable
@ElementTypesAreNonnullByDefault
/* loaded from: classes5.dex */
public final class SipHashFunction extends AbstractHashFunction implements Serializable {
    public static final HashFunction SIP_HASH_24 = new SipHashFunction(2, 4, 506097522914230528L, 1084818905618843912L);
    public static final long serialVersionUID = 0;

    /* renamed from: c */
    public final int f833c;

    /* renamed from: d */
    public final int f834d;

    /* renamed from: k0 */
    public final long f835k0;

    /* renamed from: k1 */
    public final long f836k1;

    @Override // com.google.common.hash.HashFunction
    public int bits() {
        return 64;
    }

    public SipHashFunction(int c, int d, long k0, long k1) {
        Preconditions.checkArgument(c > 0, "The number of SipRound iterations (c=%s) during Compression must be positive.", c);
        Preconditions.checkArgument(d > 0, "The number of SipRound iterations (d=%s) during Finalization must be positive.", d);
        this.f833c = c;
        this.f834d = d;
        this.f835k0 = k0;
        this.f836k1 = k1;
    }

    @Override // com.google.common.hash.HashFunction
    public Hasher newHasher() {
        return new SipHasher(this.f833c, this.f834d, this.f835k0, this.f836k1);
    }

    public String toString() {
        return "Hashing.sipHash" + this.f833c + "" + this.f834d + "(" + this.f835k0 + ", " + this.f836k1 + ")";
    }

    public boolean equals(@CheckForNull Object object) {
        if (!(object instanceof SipHashFunction)) {
            return false;
        }
        SipHashFunction sipHashFunction = (SipHashFunction) object;
        return this.f833c == sipHashFunction.f833c && this.f834d == sipHashFunction.f834d && this.f835k0 == sipHashFunction.f835k0 && this.f836k1 == sipHashFunction.f836k1;
    }

    public int hashCode() {
        return (int) ((((SipHashFunction.class.hashCode() ^ this.f833c) ^ this.f834d) ^ this.f835k0) ^ this.f836k1);
    }

    /* loaded from: classes8.dex */
    public static final class SipHasher extends AbstractStreamingHasher {
        public static final int CHUNK_SIZE = 8;

        /* renamed from: b */
        public long f837b;

        /* renamed from: c */
        public final int f838c;

        /* renamed from: d */
        public final int f839d;
        public long finalM;

        /* renamed from: v0 */
        public long f840v0;

        /* renamed from: v1 */
        public long f841v1;

        /* renamed from: v2 */
        public long f842v2;

        /* renamed from: v3 */
        public long f843v3;

        public SipHasher(int c, int d, long k0, long k1) {
            super(8);
            this.f837b = 0L;
            this.finalM = 0L;
            this.f838c = c;
            this.f839d = d;
            this.f840v0 = 8317987319222330741L ^ k0;
            this.f841v1 = 7237128888997146477L ^ k1;
            this.f842v2 = 7816392313619706465L ^ k0;
            this.f843v3 = 8387220255154660723L ^ k1;
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void process(ByteBuffer buffer) {
            this.f837b += 8;
            processM(buffer.getLong());
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public void processRemaining(ByteBuffer buffer) {
            this.f837b += buffer.remaining();
            int i = 0;
            while (buffer.hasRemaining()) {
                this.finalM ^= (buffer.get() & 255) << i;
                i += 8;
            }
        }

        @Override // com.google.common.hash.AbstractStreamingHasher
        public HashCode makeHash() {
            long j = this.finalM ^ (this.f837b << 56);
            this.finalM = j;
            processM(j);
            this.f842v2 ^= 255;
            sipRound(this.f839d);
            return HashCode.fromLong(((this.f840v0 ^ this.f841v1) ^ this.f842v2) ^ this.f843v3);
        }

        public final void processM(long m) {
            this.f843v3 ^= m;
            sipRound(this.f838c);
            this.f840v0 = m ^ this.f840v0;
        }

        public final void sipRound(int iterations) {
            for (int i = 0; i < iterations; i++) {
                long j = this.f840v0;
                long j2 = this.f841v1;
                this.f840v0 = j + j2;
                this.f842v2 += this.f843v3;
                this.f841v1 = Long.rotateLeft(j2, 13);
                long jRotateLeft = Long.rotateLeft(this.f843v3, 16);
                long j3 = this.f841v1;
                long j4 = this.f840v0;
                this.f841v1 = j3 ^ j4;
                this.f843v3 = jRotateLeft ^ this.f842v2;
                long jRotateLeft2 = Long.rotateLeft(j4, 32);
                long j5 = this.f842v2;
                long j6 = this.f841v1;
                this.f842v2 = j5 + j6;
                this.f840v0 = jRotateLeft2 + this.f843v3;
                this.f841v1 = Long.rotateLeft(j6, 17);
                long jRotateLeft3 = Long.rotateLeft(this.f843v3, 21);
                long j7 = this.f841v1;
                long j8 = this.f842v2;
                this.f841v1 = j7 ^ j8;
                this.f843v3 = jRotateLeft3 ^ this.f840v0;
                this.f842v2 = Long.rotateLeft(j8, 32);
            }
        }
    }
}
