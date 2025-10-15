package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.h9 */
/* loaded from: classes8.dex */
public final class C9575h9 extends MessageNano {

    /* renamed from: e */
    public static volatile C9575h9[] f8259e;

    /* renamed from: a */
    public long f8260a;

    /* renamed from: b */
    public int f8261b;

    /* renamed from: c */
    public long f8262c;

    /* renamed from: d */
    public boolean f8263d;

    public C9575h9() {
        m6241a();
    }

    /* renamed from: b */
    public static C9575h9[] m6240b() {
        if (f8259e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8259e == null) {
                        f8259e = new C9575h9[0];
                    }
                } finally {
                }
            }
        }
        return f8259e;
    }

    /* renamed from: a */
    public final C9575h9 m6241a() {
        this.f8260a = 0L;
        this.f8261b = 0;
        this.f8262c = 0L;
        this.f8263d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt32Size = CodedOutputByteBufferNano.computeSInt32Size(2, this.f8261b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f8260a) + super.computeSerializedSize();
        long j = this.f8262c;
        if (j != 0) {
            iComputeSInt32Size += CodedOutputByteBufferNano.computeInt64Size(3, j);
        }
        boolean z = this.f8263d;
        return z ? iComputeSInt32Size + CodedOutputByteBufferNano.computeBoolSize(4, z) : iComputeSInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f8260a);
        codedOutputByteBufferNano.writeSInt32(2, this.f8261b);
        long j = this.f8262c;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(3, j);
        }
        boolean z = this.f8263d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9575h9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f8260a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 16) {
                this.f8261b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f8262c = codedInputByteBufferNano.readInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8263d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C9575h9 m6239b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9575h9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9575h9 m6238a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9575h9) MessageNano.mergeFrom(new C9575h9(), bArr);
    }
}
