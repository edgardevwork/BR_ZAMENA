package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.tl */
/* loaded from: classes5.dex */
public final class C9887tl extends MessageNano {

    /* renamed from: b */
    public static volatile C9887tl[] f9133b;

    /* renamed from: a */
    public long f9134a;

    public C9887tl() {
        m6838a();
    }

    /* renamed from: b */
    public static C9887tl[] m6837b() {
        if (f9133b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9133b == null) {
                        f9133b = new C9887tl[0];
                    }
                } finally {
                }
            }
        }
        return f9133b;
    }

    /* renamed from: a */
    public final C9887tl m6838a() {
        this.f9134a = 10000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f9134a;
        return j != 10000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f9134a;
        if (j != 10000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9887tl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9134a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: b */
    public static C9887tl m6836b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9887tl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9887tl m6835a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9887tl) MessageNano.mergeFrom(new C9887tl(), bArr);
    }
}
