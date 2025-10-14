package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c8 */
/* loaded from: classes8.dex */
public final class C9449c8 extends MessageNano {

    /* renamed from: b */
    public static volatile C9449c8[] f7835b;

    /* renamed from: a */
    public C9474d8 f7836a;

    public C9449c8() {
        m5953a();
    }

    /* renamed from: b */
    public static C9449c8[] m5952b() {
        if (f7835b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7835b == null) {
                        f7835b = new C9449c8[0];
                    }
                } finally {
                }
            }
        }
        return f7835b;
    }

    /* renamed from: a */
    public final C9449c8 m5953a() {
        this.f7836a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9474d8 c9474d8 = this.f7836a;
        return c9474d8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c9474d8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9474d8 c9474d8 = this.f7836a;
        if (c9474d8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9474d8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9449c8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f7836a == null) {
                    this.f7836a = new C9474d8();
                }
                codedInputByteBufferNano.readMessage(this.f7836a);
            }
        }
    }

    /* renamed from: b */
    public static C9449c8 m5951b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9449c8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9449c8 m5950a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9449c8) MessageNano.mergeFrom(new C9449c8(), bArr);
    }
}
