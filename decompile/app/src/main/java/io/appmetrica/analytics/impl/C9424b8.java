package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.b8 */
/* loaded from: classes5.dex */
public final class C9424b8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9424b8[] f7772c;

    /* renamed from: a */
    public byte[] f7773a;

    /* renamed from: b */
    public C9524f8 f7774b;

    public C9424b8() {
        m5904a();
    }

    /* renamed from: b */
    public static C9424b8[] m5903b() {
        if (f7772c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7772c == null) {
                        f7772c = new C9424b8[0];
                    }
                } finally {
                }
            }
        }
        return f7772c;
    }

    /* renamed from: a */
    public final C9424b8 m5904a() {
        this.f7773a = WireFormatNano.EMPTY_BYTES;
        this.f7774b = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f7773a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f7773a);
        }
        C9524f8 c9524f8 = this.f7774b;
        return c9524f8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(2, c9524f8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f7773a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f7773a);
        }
        C9524f8 c9524f8 = this.f7774b;
        if (c9524f8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9524f8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9424b8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7773a = codedInputByteBufferNano.readBytes();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f7774b == null) {
                    this.f7774b = new C9524f8();
                }
                codedInputByteBufferNano.readMessage(this.f7774b);
            }
        }
    }

    /* renamed from: b */
    public static C9424b8 m5902b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9424b8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9424b8 m5901a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9424b8) MessageNano.mergeFrom(new C9424b8(), bArr);
    }
}
