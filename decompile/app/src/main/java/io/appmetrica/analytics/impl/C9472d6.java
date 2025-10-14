package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d6 */
/* loaded from: classes8.dex */
public final class C9472d6 extends MessageNano {

    /* renamed from: c */
    public static volatile C9472d6[] f7895c;

    /* renamed from: a */
    public int f7896a;

    /* renamed from: b */
    public String f7897b;

    public C9472d6() {
        m6009a();
    }

    /* renamed from: b */
    public static C9472d6[] m6008b() {
        if (f7895c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7895c == null) {
                        f7895c = new C9472d6[0];
                    }
                } finally {
                }
            }
        }
        return f7895c;
    }

    /* renamed from: a */
    public final C9472d6 m6009a() {
        this.f7896a = 0;
        this.f7897b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f7896a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        return !this.f7897b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(2, this.f7897b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f7896a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f7897b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7897b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9472d6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 3) {
                    this.f7896a = int32;
                }
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7897b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C9472d6 m6007b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9472d6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9472d6 m6006a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9472d6) MessageNano.mergeFrom(new C9472d6(), bArr);
    }
}
