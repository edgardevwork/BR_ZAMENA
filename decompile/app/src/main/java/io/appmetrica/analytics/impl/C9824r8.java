package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r8 */
/* loaded from: classes6.dex */
public final class C9824r8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9824r8[] f8985c;

    /* renamed from: a */
    public C9699m8 f8986a;

    /* renamed from: b */
    public C9749o8 f8987b;

    public C9824r8() {
        m6746a();
    }

    /* renamed from: b */
    public static C9824r8[] m6745b() {
        if (f8985c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8985c == null) {
                        f8985c = new C9824r8[0];
                    }
                } finally {
                }
            }
        }
        return f8985c;
    }

    /* renamed from: a */
    public final C9824r8 m6746a() {
        this.f8986a = null;
        this.f8987b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9699m8 c9699m8 = this.f8986a;
        if (c9699m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9699m8);
        }
        C9749o8 c9749o8 = this.f8987b;
        return c9749o8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c9749o8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9699m8 c9699m8 = this.f8986a;
        if (c9699m8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9699m8);
        }
        C9749o8 c9749o8 = this.f8987b;
        if (c9749o8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9749o8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9824r8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f8986a == null) {
                    this.f8986a = new C9699m8();
                }
                codedInputByteBufferNano.readMessage(this.f8986a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f8987b == null) {
                    this.f8987b = new C9749o8();
                }
                codedInputByteBufferNano.readMessage(this.f8987b);
            }
        }
    }

    /* renamed from: b */
    public static C9824r8 m6744b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9824r8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9824r8 m6743a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9824r8) MessageNano.mergeFrom(new C9824r8(), bArr);
    }
}
