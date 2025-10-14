package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.d8 */
/* loaded from: classes8.dex */
public final class C9474d8 extends MessageNano {

    /* renamed from: e */
    public static volatile C9474d8[] f7900e;

    /* renamed from: a */
    public C9699m8 f7901a;

    /* renamed from: b */
    public C9749o8 f7902b;

    /* renamed from: c */
    public C9524f8 f7903c;

    /* renamed from: d */
    public C9674l8 f7904d;

    public C9474d8() {
        m6016a();
    }

    /* renamed from: b */
    public static C9474d8[] m6015b() {
        if (f7900e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7900e == null) {
                        f7900e = new C9474d8[0];
                    }
                } finally {
                }
            }
        }
        return f7900e;
    }

    /* renamed from: a */
    public final C9474d8 m6016a() {
        this.f7901a = null;
        this.f7902b = null;
        this.f7903c = null;
        this.f7904d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9699m8 c9699m8 = this.f7901a;
        if (c9699m8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9699m8);
        }
        C9749o8 c9749o8 = this.f7902b;
        if (c9749o8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9749o8);
        }
        C9524f8 c9524f8 = this.f7903c;
        if (c9524f8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c9524f8);
        }
        C9674l8 c9674l8 = this.f7904d;
        return c9674l8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c9674l8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9699m8 c9699m8 = this.f7901a;
        if (c9699m8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9699m8);
        }
        C9749o8 c9749o8 = this.f7902b;
        if (c9749o8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9749o8);
        }
        C9524f8 c9524f8 = this.f7903c;
        if (c9524f8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c9524f8);
        }
        C9674l8 c9674l8 = this.f7904d;
        if (c9674l8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c9674l8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9474d8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f7901a == null) {
                    this.f7901a = new C9699m8();
                }
                codedInputByteBufferNano.readMessage(this.f7901a);
            } else if (tag == 18) {
                if (this.f7902b == null) {
                    this.f7902b = new C9749o8();
                }
                codedInputByteBufferNano.readMessage(this.f7902b);
            } else if (tag == 26) {
                if (this.f7903c == null) {
                    this.f7903c = new C9524f8();
                }
                codedInputByteBufferNano.readMessage(this.f7903c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f7904d == null) {
                    this.f7904d = new C9674l8();
                }
                codedInputByteBufferNano.readMessage(this.f7904d);
            }
        }
    }

    /* renamed from: b */
    public static C9474d8 m6014b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9474d8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9474d8 m6013a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9474d8) MessageNano.mergeFrom(new C9474d8(), bArr);
    }
}
