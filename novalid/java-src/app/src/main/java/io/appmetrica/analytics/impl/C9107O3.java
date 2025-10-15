package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.O3 */
/* loaded from: classes6.dex */
public final class C9107O3 extends MessageNano {

    /* renamed from: b */
    public static volatile C9107O3[] f7048b;

    /* renamed from: a */
    public C9083N3[] f7049a;

    public C9107O3() {
        m5451a();
    }

    /* renamed from: b */
    public static C9107O3[] m5450b() {
        if (f7048b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7048b == null) {
                        f7048b = new C9107O3[0];
                    }
                } finally {
                }
            }
        }
        return f7048b;
    }

    /* renamed from: a */
    public final C9107O3 m5451a() {
        this.f7049a = C9083N3.m5428b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9083N3[] c9083n3Arr = this.f7049a;
        if (c9083n3Arr != null && c9083n3Arr.length > 0) {
            int i = 0;
            while (true) {
                C9083N3[] c9083n3Arr2 = this.f7049a;
                if (i >= c9083n3Arr2.length) {
                    break;
                }
                C9083N3 c9083n3 = c9083n3Arr2[i];
                if (c9083n3 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c9083n3) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9083N3[] c9083n3Arr = this.f7049a;
        if (c9083n3Arr != null && c9083n3Arr.length > 0) {
            int i = 0;
            while (true) {
                C9083N3[] c9083n3Arr2 = this.f7049a;
                if (i >= c9083n3Arr2.length) {
                    break;
                }
                C9083N3 c9083n3 = c9083n3Arr2[i];
                if (c9083n3 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c9083n3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9107O3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C9083N3[] c9083n3Arr = this.f7049a;
                int length = c9083n3Arr == null ? 0 : c9083n3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9083N3[] c9083n3Arr2 = new C9083N3[i];
                if (length != 0) {
                    System.arraycopy(c9083n3Arr, 0, c9083n3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9083N3 c9083n3 = new C9083N3();
                    c9083n3Arr2[length] = c9083n3;
                    codedInputByteBufferNano.readMessage(c9083n3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9083N3 c9083n32 = new C9083N3();
                c9083n3Arr2[length] = c9083n32;
                codedInputByteBufferNano.readMessage(c9083n32);
                this.f7049a = c9083n3Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C9107O3 m5449b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9107O3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9107O3 m5448a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9107O3) MessageNano.mergeFrom(new C9107O3(), bArr);
    }
}
