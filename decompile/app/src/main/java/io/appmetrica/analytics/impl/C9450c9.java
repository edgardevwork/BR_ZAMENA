package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.c9 */
/* loaded from: classes8.dex */
public final class C9450c9 extends MessageNano {

    /* renamed from: c */
    public static volatile C9450c9[] f7837c;

    /* renamed from: a */
    public int f7838a;

    /* renamed from: b */
    public String f7839b;

    public C9450c9() {
        m5958a();
    }

    /* renamed from: b */
    public static C9450c9[] m5957b() {
        if (f7837c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7837c == null) {
                        f7837c = new C9450c9[0];
                    }
                } finally {
                }
            }
        }
        return f7837c;
    }

    /* renamed from: a */
    public final C9450c9 m5958a() {
        this.f7838a = 2;
        this.f7839b = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f7838a;
        if (i != 2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(3, i);
        }
        return !this.f7839b.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(4, this.f7839b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f7838a;
        if (i != 2) {
            codedOutputByteBufferNano.writeInt32(3, i);
        }
        if (!this.f7839b.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7839b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9450c9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 24) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 11:
                    case 12:
                        this.f7838a = int32;
                        break;
                }
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7839b = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C9450c9 m5956b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9450c9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9450c9 m5955a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9450c9) MessageNano.mergeFrom(new C9450c9(), bArr);
    }
}
