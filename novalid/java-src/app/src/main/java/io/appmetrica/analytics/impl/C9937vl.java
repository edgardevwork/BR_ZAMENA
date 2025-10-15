package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vl */
/* loaded from: classes5.dex */
public final class C9937vl extends MessageNano {

    /* renamed from: b */
    public static volatile C9937vl[] f9234b;

    /* renamed from: a */
    public long f9235a;

    public C9937vl() {
        m6904a();
    }

    /* renamed from: b */
    public static C9937vl[] m6903b() {
        if (f9234b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9234b == null) {
                        f9234b = new C9937vl[0];
                    }
                } finally {
                }
            }
        }
        return f9234b;
    }

    /* renamed from: a */
    public final C9937vl m6904a() {
        this.f9235a = 864000000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f9235a;
        return j != 864000000 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt64Size(1, j) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f9235a;
        if (j != 864000000) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9937vl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f9235a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: b */
    public static C9937vl m6902b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9937vl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9937vl m6901a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9937vl) MessageNano.mergeFrom(new C9937vl(), bArr);
    }
}
