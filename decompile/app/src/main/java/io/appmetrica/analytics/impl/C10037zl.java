package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.zl */
/* loaded from: classes5.dex */
public final class C10037zl extends MessageNano {

    /* renamed from: b */
    public static volatile C10037zl[] f9407b;

    /* renamed from: a */
    public int f9408a;

    public C10037zl() {
        m7009a();
    }

    /* renamed from: b */
    public static C10037zl[] m7008b() {
        if (f9407b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9407b == null) {
                        f9407b = new C10037zl[0];
                    }
                } finally {
                }
            }
        }
        return f9407b;
    }

    /* renamed from: a */
    public final C10037zl m7009a() {
        this.f9408a = 86400;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f9408a;
        return i != 86400 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(1, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f9408a;
        if (i != 86400) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C10037zl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9408a = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: b */
    public static C10037zl m7007b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C10037zl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C10037zl m7006a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C10037zl) MessageNano.mergeFrom(new C10037zl(), bArr);
    }
}
