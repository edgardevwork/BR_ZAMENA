package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.pl */
/* loaded from: classes6.dex */
public final class C9787pl extends MessageNano {

    /* renamed from: b */
    public static volatile C9787pl[] f8906b;

    /* renamed from: a */
    public String f8907a;

    public C9787pl() {
        m6656a();
    }

    /* renamed from: b */
    public static C9787pl[] m6655b() {
        if (f8906b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8906b == null) {
                        f8906b = new C9787pl[0];
                    }
                } finally {
                }
            }
        }
        return f8906b;
    }

    /* renamed from: a */
    public final C9787pl m6656a() {
        this.f8907a = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !this.f8907a.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(1, this.f8907a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f8907a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f8907a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9787pl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8907a = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C9787pl m6654b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9787pl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9787pl m6653a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9787pl) MessageNano.mergeFrom(new C9787pl(), bArr);
    }
}
