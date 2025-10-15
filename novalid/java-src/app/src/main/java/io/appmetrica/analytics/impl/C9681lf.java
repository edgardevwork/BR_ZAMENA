package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.lf */
/* loaded from: classes6.dex */
public final class C9681lf extends MessageNano {

    /* renamed from: e */
    public static final int f8583e = 0;

    /* renamed from: f */
    public static final int f8584f = 1;

    /* renamed from: g */
    public static final int f8585g = 2;

    /* renamed from: h */
    public static volatile C9681lf[] f8586h;

    /* renamed from: a */
    public byte[] f8587a;

    /* renamed from: b */
    public long f8588b;

    /* renamed from: c */
    public long f8589c;

    /* renamed from: d */
    public int f8590d;

    public C9681lf() {
        m6398a();
    }

    /* renamed from: b */
    public static C9681lf[] m6397b() {
        if (f8586h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8586h == null) {
                        f8586h = new C9681lf[0];
                    }
                } finally {
                }
            }
        }
        return f8586h;
    }

    /* renamed from: a */
    public final C9681lf m6398a() {
        this.f8587a = WireFormatNano.EMPTY_BYTES;
        this.f8588b = 0L;
        this.f8589c = 0L;
        this.f8590d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(1, this.f8587a) + super.computeSerializedSize();
        long j = this.f8588b;
        if (j != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f8589c;
        if (j2 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f8590d;
        return i != 0 ? iComputeBytesSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f8587a);
        long j = this.f8588b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f8589c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f8590d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9681lf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8587a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f8588b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f8589c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f8590d = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C9681lf m6396b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9681lf().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9681lf m6395a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9681lf) MessageNano.mergeFrom(new C9681lf(), bArr);
    }
}
