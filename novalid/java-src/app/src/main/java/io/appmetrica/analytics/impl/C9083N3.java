package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.N3 */
/* loaded from: classes6.dex */
public final class C9083N3 extends MessageNano {

    /* renamed from: c */
    public static volatile C9083N3[] f7009c;

    /* renamed from: a */
    public String f7010a;

    /* renamed from: b */
    public String f7011b;

    public C9083N3() {
        m5429a();
    }

    /* renamed from: b */
    public static C9083N3[] m5428b() {
        if (f7009c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7009c == null) {
                        f7009c = new C9083N3[0];
                    }
                } finally {
                }
            }
        }
        return f7009c;
    }

    /* renamed from: a */
    public final C9083N3 m5429a() {
        this.f7010a = "";
        this.f7011b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f7010a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7010a);
        }
        return !this.f7011b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f7011b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f7010a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7010a);
        }
        if (!this.f7011b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7011b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9083N3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7010a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7011b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C9083N3 m5427b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9083N3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9083N3 m5426a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9083N3) MessageNano.mergeFrom(new C9083N3(), bArr);
    }
}
