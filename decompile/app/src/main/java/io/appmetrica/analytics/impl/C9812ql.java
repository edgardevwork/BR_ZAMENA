package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ql */
/* loaded from: classes6.dex */
public final class C9812ql extends MessageNano {

    /* renamed from: c */
    public static volatile C9812ql[] f8960c;

    /* renamed from: a */
    public String f8961a;

    /* renamed from: b */
    public C9787pl f8962b;

    public C9812ql() {
        m6717a();
    }

    /* renamed from: b */
    public static C9812ql[] m6716b() {
        if (f8960c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8960c == null) {
                        f8960c = new C9812ql[0];
                    }
                } finally {
                }
            }
        }
        return f8960c;
    }

    /* renamed from: a */
    public final C9812ql m6717a() {
        this.f8961a = "";
        this.f8962b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f8961a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f8961a);
        }
        C9787pl c9787pl = this.f8962b;
        return c9787pl != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c9787pl) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8961a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8961a);
        }
        C9787pl c9787pl = this.f8962b;
        if (c9787pl != null) {
            codedOutputByteBufferNano.writeMessage(2, c9787pl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9812ql mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8961a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f8962b == null) {
                    this.f8962b = new C9787pl();
                }
                codedInputByteBufferNano.readMessage(this.f8962b);
            }
        }
    }

    /* renamed from: b */
    public static C9812ql m6715b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9812ql().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9812ql m6714a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9812ql) MessageNano.mergeFrom(new C9812ql(), bArr);
    }
}
