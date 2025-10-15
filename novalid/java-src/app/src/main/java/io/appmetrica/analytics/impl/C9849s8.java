package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.s8 */
/* loaded from: classes6.dex */
public final class C9849s8 extends MessageNano {

    /* renamed from: b */
    public static volatile C9849s8[] f9040b;

    /* renamed from: a */
    public C9774p8 f9041a;

    public C9849s8() {
        m6797a();
    }

    /* renamed from: b */
    public static C9849s8[] m6796b() {
        if (f9040b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9040b == null) {
                        f9040b = new C9849s8[0];
                    }
                } finally {
                }
            }
        }
        return f9040b;
    }

    /* renamed from: a */
    public final C9849s8 m6797a() {
        this.f9041a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9774p8 c9774p8 = this.f9041a;
        return c9774p8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c9774p8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9774p8 c9774p8 = this.f9041a;
        if (c9774p8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9774p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9849s8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f9041a == null) {
                    this.f9041a = new C9774p8();
                }
                codedInputByteBufferNano.readMessage(this.f9041a);
            }
        }
    }

    /* renamed from: b */
    public static C9849s8 m6795b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9849s8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9849s8 m6794a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9849s8) MessageNano.mergeFrom(new C9849s8(), bArr);
    }
}
