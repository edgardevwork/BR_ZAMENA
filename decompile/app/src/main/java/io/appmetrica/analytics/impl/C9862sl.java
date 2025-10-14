package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.sl */
/* loaded from: classes6.dex */
public final class C9862sl extends MessageNano {

    /* renamed from: c */
    public static volatile C9862sl[] f9053c;

    /* renamed from: a */
    public int f9054a;

    /* renamed from: b */
    public int f9055b;

    public C9862sl() {
        m6808a();
    }

    /* renamed from: b */
    public static C9862sl[] m6807b() {
        if (f9053c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9053c == null) {
                        f9053c = new C9862sl[0];
                    }
                } finally {
                }
            }
        }
        return f9053c;
    }

    /* renamed from: a */
    public final C9862sl m6808a() {
        this.f9054a = 86400;
        this.f9055b = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f9054a;
        if (i != 86400) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        int i2 = this.f9055b;
        return i2 != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f9054a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        int i2 = this.f9055b;
        if (i2 != 86400) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9862sl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f9054a = codedInputByteBufferNano.readInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9055b = codedInputByteBufferNano.readInt32();
            }
        }
    }

    /* renamed from: b */
    public static C9862sl m6806b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9862sl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9862sl m6805a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9862sl) MessageNano.mergeFrom(new C9862sl(), bArr);
    }
}
