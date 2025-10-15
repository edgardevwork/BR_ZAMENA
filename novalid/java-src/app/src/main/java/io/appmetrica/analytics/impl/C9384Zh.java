package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.Zh */
/* loaded from: classes5.dex */
public final class C9384Zh extends MessageNano {

    /* renamed from: c */
    public static volatile C9384Zh[] f7647c;

    /* renamed from: a */
    public byte[] f7648a;

    /* renamed from: b */
    public byte[] f7649b;

    public C9384Zh() {
        m5818a();
    }

    /* renamed from: b */
    public static C9384Zh[] m5817b() {
        if (f7647c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7647c == null) {
                        f7647c = new C9384Zh[0];
                    }
                } finally {
                }
            }
        }
        return f7647c;
    }

    /* renamed from: a */
    public final C9384Zh m5818a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7648a = bArr;
        this.f7649b = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f7648a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7648a);
        }
        return !Arrays.equals(this.f7649b, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f7649b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f7648a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7648a);
        }
        if (!Arrays.equals(this.f7649b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f7649b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9384Zh mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7648a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7649b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9384Zh m5816b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9384Zh().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9384Zh m5815a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9384Zh) MessageNano.mergeFrom(new C9384Zh(), bArr);
    }
}
