package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.q8 */
/* loaded from: classes6.dex */
public final class C9799q8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9799q8[] f8935c;

    /* renamed from: a */
    public C9699m8 f8936a;

    /* renamed from: b */
    public C9774p8 f8937b;

    public C9799q8() {
        m6703a();
    }

    /* renamed from: b */
    public static C9799q8[] m6702b() {
        if (f8935c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8935c == null) {
                        f8935c = new C9799q8[0];
                    }
                } finally {
                }
            }
        }
        return f8935c;
    }

    /* renamed from: a */
    public final C9799q8 m6703a() {
        this.f8936a = null;
        this.f8937b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9699m8 c9699m8 = this.f8936a;
        if (c9699m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9699m8);
        }
        C9774p8 c9774p8 = this.f8937b;
        return c9774p8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c9774p8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9699m8 c9699m8 = this.f8936a;
        if (c9699m8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9699m8);
        }
        C9774p8 c9774p8 = this.f8937b;
        if (c9774p8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9774p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9799q8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f8936a == null) {
                    this.f8936a = new C9699m8();
                }
                codedInputByteBufferNano.readMessage(this.f8936a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f8937b == null) {
                    this.f8937b = new C9774p8();
                }
                codedInputByteBufferNano.readMessage(this.f8937b);
            }
        }
    }

    /* renamed from: b */
    public static C9799q8 m6701b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9799q8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9799q8 m6700a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9799q8) MessageNano.mergeFrom(new C9799q8(), bArr);
    }
}
