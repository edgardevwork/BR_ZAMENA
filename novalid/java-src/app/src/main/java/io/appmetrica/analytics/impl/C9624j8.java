package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.j8 */
/* loaded from: classes8.dex */
public final class C9624j8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9624j8[] f8416c;

    /* renamed from: a */
    public byte[] f8417a;

    /* renamed from: b */
    public byte[] f8418b;

    public C9624j8() {
        m6306a();
    }

    /* renamed from: b */
    public static C9624j8[] m6305b() {
        if (f8416c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8416c == null) {
                        f8416c = new C9624j8[0];
                    }
                } finally {
                }
            }
        }
        return f8416c;
    }

    /* renamed from: a */
    public final C9624j8 m6306a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8417a = bArr;
        this.f8418b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8417a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8417a);
        }
        return !Arrays.equals(this.f8418b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f8418b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8417a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8417a);
        }
        if (!Arrays.equals(this.f8418b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8418b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9624j8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8417a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8418b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9624j8 m6304b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9624j8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9624j8 m6303a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9624j8) MessageNano.mergeFrom(new C9624j8(), bArr);
    }
}
