package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q7 */
/* loaded from: classes6.dex */
public final class C9798q7 extends MessageNano {

    /* renamed from: d */
    public static volatile C9798q7[] f8931d;

    /* renamed from: a */
    public long f8932a;

    /* renamed from: b */
    public long f8933b;

    /* renamed from: c */
    public int f8934c;

    public C9798q7() {
        m6698a();
    }

    /* renamed from: b */
    public static C9798q7[] m6697b() {
        if (f8931d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8931d == null) {
                        f8931d = new C9798q7[0];
                    }
                } finally {
                }
            }
        }
        return f8931d;
    }

    /* renamed from: a */
    public final C9798q7 m6698a() {
        this.f8932a = -1L;
        this.f8933b = -1L;
        this.f8934c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f8932a;
        if (j != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        long j2 = this.f8933b;
        if (j2 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(2, j2);
        }
        int i = this.f8934c;
        return i != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f8932a;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        long j2 = this.f8933b;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(2, j2);
        }
        int i = this.f8934c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9798q7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f8932a = codedInputByteBufferNano.readInt64();
            } else if (tag == 16) {
                this.f8933b = codedInputByteBufferNano.readInt64();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f8934c = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C9798q7 m6696b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9798q7().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9798q7 m6695a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9798q7) MessageNano.mergeFrom(new C9798q7(), bArr);
    }
}
