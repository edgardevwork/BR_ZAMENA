package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Y1 */
/* loaded from: classes5.dex */
public final class C9344Y1 extends MessageNano {

    /* renamed from: c */
    public static volatile C9344Y1[] f7546c;

    /* renamed from: a */
    public String f7547a;

    /* renamed from: b */
    public boolean f7548b;

    public C9344Y1() {
        m5766a();
    }

    /* renamed from: b */
    public static C9344Y1[] m5765b() {
        if (f7546c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7546c == null) {
                        f7546c = new C9344Y1[0];
                    }
                } finally {
                }
            }
        }
        return f7546c;
    }

    /* renamed from: a */
    public final C9344Y1 m5766a() {
        this.f7547a = "";
        this.f7548b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f7548b) + CodedOutputByteBufferNano.computeStringSize(1, this.f7547a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f7547a);
        codedOutputByteBufferNano.writeBool(2, this.f7548b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9344Y1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7547a = codedInputByteBufferNano.readString();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7548b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C9344Y1 m5764b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9344Y1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9344Y1 m5763a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9344Y1) MessageNano.mergeFrom(new C9344Y1(), bArr);
    }
}
