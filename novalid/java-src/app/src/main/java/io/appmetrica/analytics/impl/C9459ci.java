package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ci */
/* loaded from: classes8.dex */
public final class C9459ci extends MessageNano {

    /* renamed from: d */
    public static volatile C9459ci[] f7855d;

    /* renamed from: a */
    public boolean f7856a;

    /* renamed from: b */
    public C9434bi f7857b;

    /* renamed from: c */
    public C9409ai f7858c;

    public C9459ci() {
        m5992a();
    }

    /* renamed from: b */
    public static C9459ci[] m5991b() {
        if (f7855d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7855d == null) {
                        f7855d = new C9459ci[0];
                    }
                } finally {
                }
            }
        }
        return f7855d;
    }

    /* renamed from: a */
    public final C9459ci m5992a() {
        this.f7856a = false;
        this.f7857b = null;
        this.f7858c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z = this.f7856a;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        C9434bi c9434bi = this.f7857b;
        if (c9434bi != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9434bi);
        }
        C9409ai c9409ai = this.f7858c;
        return c9409ai != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c9409ai) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f7856a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        C9434bi c9434bi = this.f7857b;
        if (c9434bi != null) {
            codedOutputByteBufferNano.writeMessage(2, c9434bi);
        }
        C9409ai c9409ai = this.f7858c;
        if (c9409ai != null) {
            codedOutputByteBufferNano.writeMessage(3, c9409ai);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9459ci mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f7856a = codedInputByteBufferNano.readBool();
            } else if (tag == 18) {
                if (this.f7857b == null) {
                    this.f7857b = new C9434bi();
                }
                codedInputByteBufferNano.readMessage(this.f7857b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f7858c == null) {
                    this.f7858c = new C9409ai();
                }
                codedInputByteBufferNano.readMessage(this.f7858c);
            }
        }
    }

    /* renamed from: b */
    public static C9459ci m5990b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9459ci().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9459ci m5989a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9459ci) MessageNano.mergeFrom(new C9459ci(), bArr);
    }
}
