package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.u2 */
/* loaded from: classes5.dex */
public final class C9893u2 extends MessageNano {

    /* renamed from: f */
    public static volatile C9893u2[] f9155f;

    /* renamed from: a */
    public int f9156a;

    /* renamed from: b */
    public String f9157b;

    /* renamed from: c */
    public String f9158c;

    /* renamed from: d */
    public long f9159d;

    /* renamed from: e */
    public long f9160e;

    public C9893u2() {
        m6849a();
    }

    /* renamed from: b */
    public static C9893u2[] m6848b() {
        if (f9155f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9155f == null) {
                        f9155f = new C9893u2[0];
                    }
                } finally {
                }
            }
        }
        return f9155f;
    }

    /* renamed from: a */
    public final C9893u2 m6849a() {
        this.f9156a = 1;
        this.f9157b = "";
        this.f9158c = "";
        this.f9159d = 0L;
        this.f9160e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeUInt64Size(5, this.f9160e) + CodedOutputByteBufferNano.computeUInt64Size(4, this.f9159d) + CodedOutputByteBufferNano.computeStringSize(3, this.f9158c) + CodedOutputByteBufferNano.computeStringSize(2, this.f9157b) + CodedOutputByteBufferNano.computeInt32Size(1, this.f9156a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(1, this.f9156a);
        codedOutputByteBufferNano.writeString(2, this.f9157b);
        codedOutputByteBufferNano.writeString(3, this.f9158c);
        codedOutputByteBufferNano.writeUInt64(4, this.f9159d);
        codedOutputByteBufferNano.writeUInt64(5, this.f9160e);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9893u2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f9156a = int32;
                }
            } else if (tag == 18) {
                this.f9157b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                this.f9158c = codedInputByteBufferNano.readString();
            } else if (tag == 32) {
                this.f9159d = codedInputByteBufferNano.readUInt64();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9160e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: b */
    public static C9893u2 m6847b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9893u2().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9893u2 m6846a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9893u2) MessageNano.mergeFrom(new C9893u2(), bArr);
    }
}
