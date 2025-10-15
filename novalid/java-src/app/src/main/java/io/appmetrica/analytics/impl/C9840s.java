package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s */
/* loaded from: classes6.dex */
public final class C9840s extends MessageNano {

    /* renamed from: c */
    public static volatile C9840s[] f9026c;

    /* renamed from: a */
    public long f9027a;

    /* renamed from: b */
    public int f9028b;

    public C9840s() {
        m6788a();
    }

    /* renamed from: b */
    public static C9840s[] m6787b() {
        if (f9026c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9026c == null) {
                        f9026c = new C9840s[0];
                    }
                } finally {
                }
            }
        }
        return f9026c;
    }

    /* renamed from: a */
    public final C9840s m6788a() {
        this.f9027a = 0L;
        this.f9028b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f9027a;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        int i = this.f9028b;
        return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f9027a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        int i = this.f9028b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9840s mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f9027a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9028b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C9840s m6786b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9840s().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9840s m6785a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9840s) MessageNano.mergeFrom(new C9840s(), bArr);
    }
}
