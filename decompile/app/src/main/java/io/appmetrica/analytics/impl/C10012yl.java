package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.yl */
/* loaded from: classes5.dex */
public final class C10012yl extends MessageNano {

    /* renamed from: c */
    public static volatile C10012yl[] f9370c;

    /* renamed from: a */
    public long f9371a;

    /* renamed from: b */
    public long f9372b;

    public C10012yl() {
        m7001a();
    }

    /* renamed from: b */
    public static C10012yl[] m7000b() {
        if (f9370c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9370c == null) {
                        f9370c = new C10012yl[0];
                    }
                } finally {
                }
            }
        }
        return f9370c;
    }

    /* renamed from: a */
    public final C10012yl m7001a() {
        this.f9371a = 86400L;
        this.f9372b = 432000L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(2, this.f9372b) + CodedOutputByteBufferNano.computeInt64Size(1, this.f9371a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f9371a);
        codedOutputByteBufferNano.writeInt64(2, this.f9372b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10012yl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f9371a = codedInputByteBufferNano.readInt64();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9372b = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: b */
    public static C10012yl m6999b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C10012yl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C10012yl m6998a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C10012yl) MessageNano.mergeFrom(new C10012yl(), bArr);
    }
}
