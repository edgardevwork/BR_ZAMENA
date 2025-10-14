package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f8 */
/* loaded from: classes8.dex */
public final class C9524f8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9524f8[] f8083c;

    /* renamed from: a */
    public long f8084a;

    /* renamed from: b */
    public int f8085b;

    public C9524f8() {
        m6105a();
    }

    /* renamed from: b */
    public static C9524f8[] m6104b() {
        if (f8083c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8083c == null) {
                        f8083c = new C9524f8[0];
                    }
                } finally {
                }
            }
        }
        return f8083c;
    }

    /* renamed from: a */
    public final C9524f8 m6105a() {
        this.f8084a = 0L;
        this.f8085b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f8084a;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i = this.f8085b;
        return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f8084a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i = this.f8085b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9524f8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f8084a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8085b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C9524f8 m6103b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9524f8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9524f8 m6102a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9524f8) MessageNano.mergeFrom(new C9524f8(), bArr);
    }
}
