package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.di */
/* loaded from: classes8.dex */
public final class C9484di extends MessageNano {

    /* renamed from: f */
    public static final int f7956f = 0;

    /* renamed from: g */
    public static final int f7957g = 1;

    /* renamed from: h */
    public static final int f7958h = 2;

    /* renamed from: i */
    public static volatile C9484di[] f7959i;

    /* renamed from: a */
    public byte[] f7960a;

    /* renamed from: b */
    public long f7961b;

    /* renamed from: c */
    public int f7962c;

    /* renamed from: d */
    public byte[] f7963d;

    /* renamed from: e */
    public long f7964e;

    public C9484di() {
        m6029a();
    }

    /* renamed from: b */
    public static C9484di[] m6028b() {
        if (f7959i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7959i == null) {
                        f7959i = new C9484di[0];
                    }
                } finally {
                }
            }
        }
        return f7959i;
    }

    /* renamed from: a */
    public final C9484di m6029a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7960a = bArr;
        this.f7961b = 0L;
        this.f7962c = 0;
        this.f7963d = bArr;
        this.f7964e = 0L;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7960a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7960a);
        }
        long j = this.f7961b;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        int i = this.f7962c;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        if (!Arrays.equals(this.f7963d, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f7963d);
        }
        long j2 = this.f7964e;
        return j2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt64Size(5, j2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f7960a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7960a);
        }
        long j = this.f7961b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        int i = this.f7962c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!Arrays.equals(this.f7963d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f7963d);
        }
        long j2 = this.f7964e;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(5, j2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9484di mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7960a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                this.f7961b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f7962c = int32;
                }
            } else if (tag == 34) {
                this.f7963d = codedInputByteBufferNano.readBytes();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7964e = codedInputByteBufferNano.readUInt64();
            }
        }
    }

    /* renamed from: b */
    public static C9484di m6027b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9484di().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9484di m6026a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9484di) MessageNano.mergeFrom(new C9484di(), bArr);
    }
}
