package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.X5 */
/* loaded from: classes5.dex */
public final class C9324X5 extends MessageNano {

    /* renamed from: d */
    public static volatile C9324X5[] f7464d;

    /* renamed from: a */
    public C9300W5 f7465a;

    /* renamed from: b */
    public String f7466b;

    /* renamed from: c */
    public int f7467c;

    public C9324X5() {
        m5735a();
    }

    /* renamed from: b */
    public static C9324X5[] m5734b() {
        if (f7464d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7464d == null) {
                        f7464d = new C9324X5[0];
                    }
                } finally {
                }
            }
        }
        return f7464d;
    }

    /* renamed from: a */
    public final C9324X5 m5735a() {
        this.f7465a = null;
        this.f7466b = "";
        this.f7467c = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9300W5 c9300w5 = this.f7465a;
        if (c9300w5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9300w5);
        }
        if (!this.f7466b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7466b);
        }
        int i = this.f7467c;
        return i != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(3, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9300W5 c9300w5 = this.f7465a;
        if (c9300w5 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9300w5);
        }
        if (!this.f7466b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7466b);
        }
        int i = this.f7467c;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9324X5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f7465a == null) {
                    this.f7465a = new C9300W5();
                }
                codedInputByteBufferNano.readMessage(this.f7465a);
            } else if (tag == 18) {
                this.f7466b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f7467c = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C9324X5 m5733b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9324X5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9324X5 m5732a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9324X5) MessageNano.mergeFrom(new C9324X5(), bArr);
    }
}
