package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b9 */
/* loaded from: classes5.dex */
public final class C9425b9 extends MessageNano {

    /* renamed from: c */
    public static volatile C9425b9[] f7775c;

    /* renamed from: a */
    public byte[] f7776a;

    /* renamed from: b */
    public byte[] f7777b;

    public C9425b9() {
        m5909a();
    }

    /* renamed from: b */
    public static C9425b9[] m5908b() {
        if (f7775c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7775c == null) {
                        f7775c = new C9425b9[0];
                    }
                } finally {
                }
            }
        }
        return f7775c;
    }

    /* renamed from: a */
    public final C9425b9 m5909a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7776a = bArr;
        this.f7777b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7776a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7776a);
        }
        return !Arrays.equals(this.f7777b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7777b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f7776a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7776a);
        }
        if (!Arrays.equals(this.f7777b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7777b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9425b9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7776a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7777b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9425b9 m5907b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9425b9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9425b9 m5906a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9425b9) MessageNano.mergeFrom(new C9425b9(), bArr);
    }
}
