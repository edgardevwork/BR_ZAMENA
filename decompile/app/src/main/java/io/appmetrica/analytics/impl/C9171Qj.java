package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Qj */
/* loaded from: classes6.dex */
public final class C9171Qj extends MessageNano {

    /* renamed from: b */
    public static volatile C9171Qj[] f7170b;

    /* renamed from: a */
    public C9194Rj[] f7171a;

    public C9171Qj() {
        m5508a();
    }

    /* renamed from: b */
    public static C9171Qj[] m5507b() {
        if (f7170b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7170b == null) {
                        f7170b = new C9171Qj[0];
                    }
                } finally {
                }
            }
        }
        return f7170b;
    }

    /* renamed from: a */
    public final C9171Qj m5508a() {
        this.f7171a = C9194Rj.m5528b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9194Rj[] c9194RjArr = this.f7171a;
        if (c9194RjArr != null && c9194RjArr.length > 0) {
            int i = 0;
            while (true) {
                C9194Rj[] c9194RjArr2 = this.f7171a;
                if (i >= c9194RjArr2.length) {
                    break;
                }
                C9194Rj c9194Rj = c9194RjArr2[i];
                if (c9194Rj != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c9194Rj) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9194Rj[] c9194RjArr = this.f7171a;
        if (c9194RjArr != null && c9194RjArr.length > 0) {
            int i = 0;
            while (true) {
                C9194Rj[] c9194RjArr2 = this.f7171a;
                if (i >= c9194RjArr2.length) {
                    break;
                }
                C9194Rj c9194Rj = c9194RjArr2[i];
                if (c9194Rj != null) {
                    codedOutputByteBufferNano.writeMessage(1, c9194Rj);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9171Qj mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C9194Rj[] c9194RjArr = this.f7171a;
                int length = c9194RjArr == null ? 0 : c9194RjArr.length;
                int i = repeatedFieldArrayLength + length;
                C9194Rj[] c9194RjArr2 = new C9194Rj[i];
                if (length != 0) {
                    System.arraycopy(c9194RjArr, 0, c9194RjArr2, 0, length);
                }
                while (length < i - 1) {
                    C9194Rj c9194Rj = new C9194Rj();
                    c9194RjArr2[length] = c9194Rj;
                    codedInputByteBufferNano.readMessage(c9194Rj);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9194Rj c9194Rj2 = new C9194Rj();
                c9194RjArr2[length] = c9194Rj2;
                codedInputByteBufferNano.readMessage(c9194Rj2);
                this.f7171a = c9194RjArr2;
            }
        }
    }

    /* renamed from: b */
    public static C9171Qj m5506b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9171Qj().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9171Qj m5505a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9171Qj) MessageNano.mergeFrom(new C9171Qj(), bArr);
    }
}
