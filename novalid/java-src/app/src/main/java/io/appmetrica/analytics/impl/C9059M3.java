package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.M3 */
/* loaded from: classes6.dex */
public final class C9059M3 extends MessageNano {

    /* renamed from: c */
    public static volatile C9059M3[] f6958c;

    /* renamed from: a */
    public C9107O3 f6959a;

    /* renamed from: b */
    public int f6960b;

    public C9059M3() {
        m5373a();
    }

    /* renamed from: b */
    public static C9059M3[] m5372b() {
        if (f6958c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6958c == null) {
                        f6958c = new C9059M3[0];
                    }
                } finally {
                }
            }
        }
        return f6958c;
    }

    /* renamed from: a */
    public final C9059M3 m5373a() {
        this.f6959a = null;
        this.f6960b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9107O3 c9107o3 = this.f6959a;
        if (c9107o3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9107o3);
        }
        int i = this.f6960b;
        return i != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9107O3 c9107o3 = this.f6959a;
        if (c9107o3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9107o3);
        }
        int i = this.f6960b;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(2, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9059M3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f6959a == null) {
                    this.f6959a = new C9107O3();
                }
                codedInputByteBufferNano.readMessage(this.f6959a);
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f6960b = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C9059M3 m5371b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9059M3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9059M3 m5370a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9059M3) MessageNano.mergeFrom(new C9059M3(), bArr);
    }
}
