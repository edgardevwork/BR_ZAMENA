package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Rj */
/* loaded from: classes6.dex */
public final class C9194Rj extends MessageNano {

    /* renamed from: c */
    public static volatile C9194Rj[] f7208c;

    /* renamed from: a */
    public byte[] f7209a;

    /* renamed from: b */
    public byte[] f7210b;

    public C9194Rj() {
        m5529a();
    }

    /* renamed from: b */
    public static C9194Rj[] m5528b() {
        if (f7208c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7208c == null) {
                        f7208c = new C9194Rj[0];
                    }
                } finally {
                }
            }
        }
        return f7208c;
    }

    /* renamed from: a */
    public final C9194Rj m5529a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7209a = bArr;
        this.f7210b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7209a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7209a);
        }
        return !Arrays.equals(this.f7210b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7210b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f7209a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7209a);
        }
        if (!Arrays.equals(this.f7210b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7210b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9194Rj mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7209a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7210b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9194Rj m5527b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9194Rj().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9194Rj m5526a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9194Rj) MessageNano.mergeFrom(new C9194Rj(), bArr);
    }
}
