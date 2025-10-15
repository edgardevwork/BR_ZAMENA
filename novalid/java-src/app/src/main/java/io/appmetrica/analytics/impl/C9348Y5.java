package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Y5 */
/* loaded from: classes5.dex */
public final class C9348Y5 extends MessageNano {

    /* renamed from: c */
    public static volatile C9348Y5[] f7560c;

    /* renamed from: a */
    public byte[] f7561a;

    /* renamed from: b */
    public byte[] f7562b;

    public C9348Y5() {
        m5775a();
    }

    /* renamed from: b */
    public static C9348Y5[] m5774b() {
        if (f7560c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7560c == null) {
                        f7560c = new C9348Y5[0];
                    }
                } finally {
                }
            }
        }
        return f7560c;
    }

    /* renamed from: a */
    public final C9348Y5 m5775a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7561a = bArr;
        this.f7562b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7561a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7561a);
        }
        return !Arrays.equals(this.f7562b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7562b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f7561a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7561a);
        }
        if (!Arrays.equals(this.f7562b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7562b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9348Y5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7561a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7562b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9348Y5 m5773b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9348Y5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9348Y5 m5772a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9348Y5) MessageNano.mergeFrom(new C9348Y5(), bArr);
    }
}
