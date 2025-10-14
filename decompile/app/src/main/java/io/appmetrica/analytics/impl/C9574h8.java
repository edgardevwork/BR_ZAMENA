package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h8 */
/* loaded from: classes8.dex */
public final class C9574h8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9574h8[] f8256c;

    /* renamed from: a */
    public int f8257a;

    /* renamed from: b */
    public C9474d8 f8258b;

    public C9574h8() {
        m6236a();
    }

    /* renamed from: b */
    public static C9574h8[] m6235b() {
        if (f8256c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8256c == null) {
                        f8256c = new C9574h8[0];
                    }
                } finally {
                }
            }
        }
        return f8256c;
    }

    /* renamed from: a */
    public final C9574h8 m6236a() {
        this.f8257a = 0;
        this.f8258b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f8257a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        C9474d8 c9474d8 = this.f8258b;
        return c9474d8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c9474d8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f8257a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        C9474d8 c9474d8 = this.f8258b;
        if (c9474d8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9474d8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9574h8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f8257a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f8258b == null) {
                    this.f8258b = new C9474d8();
                }
                codedInputByteBufferNano.readMessage(this.f8258b);
            }
        }
    }

    /* renamed from: b */
    public static C9574h8 m6234b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9574h8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9574h8 m6233a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9574h8) MessageNano.mergeFrom(new C9574h8(), bArr);
    }
}
