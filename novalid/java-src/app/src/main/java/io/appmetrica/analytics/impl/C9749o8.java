package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o8 */
/* loaded from: classes6.dex */
public final class C9749o8 extends MessageNano {

    /* renamed from: d */
    public static volatile C9749o8[] f8824d;

    /* renamed from: a */
    public byte[] f8825a;

    /* renamed from: b */
    public byte[] f8826b;

    /* renamed from: c */
    public C9774p8 f8827c;

    public C9749o8() {
        m6586a();
    }

    /* renamed from: b */
    public static C9749o8[] m6585b() {
        if (f8824d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8824d == null) {
                        f8824d = new C9749o8[0];
                    }
                } finally {
                }
            }
        }
        return f8824d;
    }

    /* renamed from: a */
    public final C9749o8 m6586a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8825a = bArr;
        this.f8826b = bArr;
        this.f8827c = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8825a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8825a);
        }
        if (!Arrays.equals(this.f8826b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8826b);
        }
        C9774p8 c9774p8 = this.f8827c;
        return c9774p8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(3, c9774p8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8825a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8825a);
        }
        if (!Arrays.equals(this.f8826b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8826b);
        }
        C9774p8 c9774p8 = this.f8827c;
        if (c9774p8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c9774p8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9749o8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8825a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f8826b = codedInputByteBufferNano.readBytes();
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f8827c == null) {
                    this.f8827c = new C9774p8();
                }
                codedInputByteBufferNano.readMessage(this.f8827c);
            }
        }
    }

    /* renamed from: b */
    public static C9749o8 m6584b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9749o8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9749o8 m6583a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9749o8) MessageNano.mergeFrom(new C9749o8(), bArr);
    }
}
