package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.H8 */
/* loaded from: classes7.dex */
public final class C8944H8 extends MessageNano {

    /* renamed from: c */
    public static volatile C8944H8[] f6705c;

    /* renamed from: a */
    public String f6706a;

    /* renamed from: b */
    public byte[] f6707b;

    public C8944H8() {
        m5240a();
    }

    /* renamed from: b */
    public static C8944H8[] m5239b() {
        if (f6705c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6705c == null) {
                        f6705c = new C8944H8[0];
                    }
                } finally {
                }
            }
        }
        return f6705c;
    }

    /* renamed from: a */
    public final C8944H8 m5240a() {
        this.f6706a = "";
        this.f6707b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f6706a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6706a);
        }
        return !Arrays.equals(this.f6707b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f6707b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6706a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6706a);
        }
        if (!Arrays.equals(this.f6707b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f6707b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8944H8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f6706a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f6707b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C8944H8 m5238b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8944H8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C8944H8 m5237a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8944H8) MessageNano.mergeFrom(new C8944H8(), bArr);
    }
}
