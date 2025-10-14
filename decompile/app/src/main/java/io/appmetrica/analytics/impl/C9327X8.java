package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.X8 */
/* loaded from: classes5.dex */
public final class C9327X8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9327X8[] f7476c;

    /* renamed from: a */
    public String f7477a;

    /* renamed from: b */
    public String f7478b;

    public C9327X8() {
        m5740a();
    }

    /* renamed from: b */
    public static C9327X8[] m5739b() {
        if (f7476c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7476c == null) {
                        f7476c = new C9327X8[0];
                    }
                } finally {
                }
            }
        }
        return f7476c;
    }

    /* renamed from: a */
    public final C9327X8 m5740a() {
        this.f7477a = "";
        this.f7478b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(2, this.f7478b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7477a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7477a);
        codedOutputByteBufferNano.writeString(2, this.f7478b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9327X8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7477a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7478b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C9327X8 m5738b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9327X8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9327X8 m5737a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9327X8) MessageNano.mergeFrom(new C9327X8(), bArr);
    }
}
