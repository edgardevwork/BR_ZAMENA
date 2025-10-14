package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Z5 */
/* loaded from: classes5.dex */
public final class C9372Z5 extends MessageNano {

    /* renamed from: c */
    public static volatile C9372Z5[] f7620c;

    /* renamed from: a */
    public byte[] f7621a;

    /* renamed from: b */
    public C9472d6 f7622b;

    public C9372Z5() {
        m5800a();
    }

    /* renamed from: b */
    public static C9372Z5[] m5799b() {
        if (f7620c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7620c == null) {
                        f7620c = new C9372Z5[0];
                    }
                } finally {
                }
            }
        }
        return f7620c;
    }

    /* renamed from: a */
    public final C9372Z5 m5800a() {
        this.f7621a = WireFormatNano.EMPTY_BYTES;
        this.f7622b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7621a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7621a);
        }
        C9472d6 c9472d6 = this.f7622b;
        return c9472d6 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c9472d6) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f7621a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7621a);
        }
        C9472d6 c9472d6 = this.f7622b;
        if (c9472d6 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9472d6);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9372Z5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7621a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f7622b == null) {
                    this.f7622b = new C9472d6();
                }
                codedInputByteBufferNano.readMessage(this.f7622b);
            }
        }
    }

    /* renamed from: b */
    public static C9372Z5 m5798b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9372Z5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9372Z5 m5797a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9372Z5) MessageNano.mergeFrom(new C9372Z5(), bArr);
    }
}
