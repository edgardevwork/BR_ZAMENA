package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i8 */
/* loaded from: classes8.dex */
public final class C9599i8 extends MessageNano {

    /* renamed from: b */
    public static volatile C9599i8[] f8349b;

    /* renamed from: a */
    public C9549g8 f8350a;

    public C9599i8() {
        m6281a();
    }

    /* renamed from: b */
    public static C9599i8[] m6280b() {
        if (f8349b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8349b == null) {
                        f8349b = new C9599i8[0];
                    }
                } finally {
                }
            }
        }
        return f8349b;
    }

    /* renamed from: a */
    public final C9599i8 m6281a() {
        this.f8350a = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9549g8 c9549g8 = this.f8350a;
        return c9549g8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, c9549g8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9549g8 c9549g8 = this.f8350a;
        if (c9549g8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9549g8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9599i8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                if (this.f8350a == null) {
                    this.f8350a = new C9549g8();
                }
                codedInputByteBufferNano.readMessage(this.f8350a);
            }
        }
    }

    /* renamed from: b */
    public static C9599i8 m6279b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9599i8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9599i8 m6278a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9599i8) MessageNano.mergeFrom(new C9599i8(), bArr);
    }
}
