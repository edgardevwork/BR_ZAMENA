package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.y9 */
/* loaded from: classes5.dex */
public final class C10000y9 extends MessageNano {

    /* renamed from: c */
    public static final int f9353c = 0;

    /* renamed from: d */
    public static final int f9354d = 1;

    /* renamed from: e */
    public static final int f9355e = 2;

    /* renamed from: f */
    public static final int f9356f = 3;

    /* renamed from: g */
    public static final int f9357g = 4;

    /* renamed from: h */
    public static final int f9358h = 5;

    /* renamed from: i */
    public static final int f9359i = 6;

    /* renamed from: j */
    public static volatile C10000y9[] f9360j;

    /* renamed from: a */
    public int f9361a;

    /* renamed from: b */
    public byte[] f9362b;

    public C10000y9() {
        m6993a();
    }

    /* renamed from: b */
    public static C10000y9[] m6992b() {
        if (f9360j == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9360j == null) {
                        f9360j = new C10000y9[0];
                    }
                } finally {
                }
            }
        }
        return f9360j;
    }

    /* renamed from: a */
    public final C10000y9 m6993a() {
        this.f9361a = 0;
        this.f9362b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f9361a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !Arrays.equals(this.f9362b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f9362b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f9361a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!Arrays.equals(this.f9362b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f9362b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10000y9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        this.f9361a = int32;
                        break;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9362b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C10000y9 m6991b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C10000y9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C10000y9 m6990a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C10000y9) MessageNano.mergeFrom(new C10000y9(), bArr);
    }
}
