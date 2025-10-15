package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.b6 */
/* loaded from: classes5.dex */
public final class C9422b6 extends MessageNano {

    /* renamed from: b */
    public static volatile C9422b6[] f7767b;

    /* renamed from: a */
    public String f7768a;

    public C9422b6() {
        m5897a();
    }

    /* renamed from: b */
    public static C9422b6[] m5896b() {
        if (f7767b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7767b == null) {
                        f7767b = new C9422b6[0];
                    }
                } finally {
                }
            }
        }
        return f7767b;
    }

    /* renamed from: a */
    public final C9422b6 m5897a() {
        this.f7768a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeStringSize(1, this.f7768a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7768a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9422b6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f7768a = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C9422b6 m5895b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9422b6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9422b6 m5894a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9422b6) MessageNano.mergeFrom(new C9422b6(), bArr);
    }
}
