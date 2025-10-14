package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Z8 */
/* loaded from: classes5.dex */
public final class C9375Z8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9375Z8[] f7626c;

    /* renamed from: a */
    public String f7627a;

    /* renamed from: b */
    public long f7628b;

    public C9375Z8() {
        m5805a();
    }

    /* renamed from: b */
    public static C9375Z8[] m5804b() {
        if (f7626c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7626c == null) {
                        f7626c = new C9375Z8[0];
                    }
                } finally {
                }
            }
        }
        return f7626c;
    }

    /* renamed from: a */
    public final C9375Z8 m5805a() {
        this.f7627a = "";
        this.f7628b = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(2, this.f7628b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7627a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7627a);
        codedOutputByteBufferNano.writeUInt64(2, this.f7628b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9375Z8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7627a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7628b = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: b */
    public static C9375Z8 m5803b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9375Z8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9375Z8 m5802a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9375Z8) MessageNano.mergeFrom(new C9375Z8(), bArr);
    }
}
