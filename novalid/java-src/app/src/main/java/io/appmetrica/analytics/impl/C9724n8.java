package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.n8 */
/* loaded from: classes6.dex */
public final class C9724n8 extends MessageNano {

    /* renamed from: b */
    public static volatile C9724n8[] f8717b;

    /* renamed from: a */
    public byte[] f8718a;

    public C9724n8() {
        m6502a();
    }

    /* renamed from: b */
    public static C9724n8[] m6501b() {
        if (f8717b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8717b == null) {
                        f8717b = new C9724n8[0];
                    }
                } finally {
                }
            }
        }
        return f8717b;
    }

    /* renamed from: a */
    public final C9724n8 m6502a() {
        this.f8718a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f8718a, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f8718a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f8718a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8718a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9724n8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8718a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9724n8 m6500b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9724n8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9724n8 m6499a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9724n8) MessageNano.mergeFrom(new C9724n8(), bArr);
    }
}
