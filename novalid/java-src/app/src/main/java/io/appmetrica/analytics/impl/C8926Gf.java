package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Gf */
/* loaded from: classes7.dex */
public final class C8926Gf extends MessageNano {

    /* renamed from: e */
    public static final int f6667e = 0;

    /* renamed from: f */
    public static final int f6668f = 1;

    /* renamed from: g */
    public static final int f6669g = 2;

    /* renamed from: h */
    public static volatile C8926Gf[] f6670h;

    /* renamed from: a */
    public String f6671a;

    /* renamed from: b */
    public long f6672b;

    /* renamed from: c */
    public long f6673c;

    /* renamed from: d */
    public int f6674d;

    public C8926Gf() {
        m5229a();
    }

    /* renamed from: b */
    public static C8926Gf[] m5228b() {
        if (f6670h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6670h == null) {
                        f6670h = new C8926Gf[0];
                    }
                } finally {
                }
            }
        }
        return f6670h;
    }

    /* renamed from: a */
    public final C8926Gf m5229a() {
        this.f6671a = "";
        this.f6672b = 0L;
        this.f6673c = 0L;
        this.f6674d = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f6671a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6671a);
        }
        long j = this.f6672b;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(2, j);
        }
        long j2 = this.f6673c;
        if (j2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt64Size(3, j2);
        }
        int i = this.f6674d;
        return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(4, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6671a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6671a);
        }
        long j = this.f6672b;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(2, j);
        }
        long j2 = this.f6673c;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j2);
        }
        int i = this.f6674d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8926Gf mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f6671a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f6672b = codedInputByteBufferNano.readUInt64();
            } else if (tag == 24) {
                this.f6673c = codedInputByteBufferNano.readUInt64();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f6674d = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C8926Gf m5227b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8926Gf().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C8926Gf m5226a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8926Gf) MessageNano.mergeFrom(new C8926Gf(), bArr);
    }
}
