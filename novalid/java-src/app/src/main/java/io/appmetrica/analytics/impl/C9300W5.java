package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.W5 */
/* loaded from: classes5.dex */
public final class C9300W5 extends MessageNano {

    /* renamed from: d */
    public static volatile C9300W5[] f7390d;

    /* renamed from: a */
    public C9522f6 f7391a;

    /* renamed from: b */
    public C9522f6[] f7392b;

    /* renamed from: c */
    public String f7393c;

    public C9300W5() {
        m5707a();
    }

    /* renamed from: b */
    public static C9300W5[] m5706b() {
        if (f7390d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7390d == null) {
                        f7390d = new C9300W5[0];
                    }
                } finally {
                }
            }
        }
        return f7390d;
    }

    /* renamed from: a */
    public final C9300W5 m5707a() {
        this.f7391a = null;
        this.f7392b = C9522f6.m6083b();
        this.f7393c = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9522f6 c9522f6 = this.f7391a;
        if (c9522f6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9522f6);
        }
        C9522f6[] c9522f6Arr = this.f7392b;
        if (c9522f6Arr != null && c9522f6Arr.length > 0) {
            int i = 0;
            while (true) {
                C9522f6[] c9522f6Arr2 = this.f7392b;
                if (i >= c9522f6Arr2.length) {
                    break;
                }
                C9522f6 c9522f62 = c9522f6Arr2[i];
                if (c9522f62 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c9522f62) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return !this.f7393c.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(3, this.f7393c) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9522f6 c9522f6 = this.f7391a;
        if (c9522f6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9522f6);
        }
        C9522f6[] c9522f6Arr = this.f7392b;
        if (c9522f6Arr != null && c9522f6Arr.length > 0) {
            int i = 0;
            while (true) {
                C9522f6[] c9522f6Arr2 = this.f7392b;
                if (i >= c9522f6Arr2.length) {
                    break;
                }
                C9522f6 c9522f62 = c9522f6Arr2[i];
                if (c9522f62 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c9522f62);
                }
                i++;
            }
        }
        if (!this.f7393c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7393c);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9300W5 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f7391a == null) {
                    this.f7391a = new C9522f6();
                }
                codedInputByteBufferNano.readMessage(this.f7391a);
            } else if (tag == 18) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C9522f6[] c9522f6Arr = this.f7392b;
                int length = c9522f6Arr == null ? 0 : c9522f6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9522f6[] c9522f6Arr2 = new C9522f6[i];
                if (length != 0) {
                    System.arraycopy(c9522f6Arr, 0, c9522f6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9522f6 c9522f6 = new C9522f6();
                    c9522f6Arr2[length] = c9522f6;
                    codedInputByteBufferNano.readMessage(c9522f6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9522f6 c9522f62 = new C9522f6();
                c9522f6Arr2[length] = c9522f62;
                codedInputByteBufferNano.readMessage(c9522f62);
                this.f7392b = c9522f6Arr2;
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7393c = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C9300W5 m5705b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9300W5().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9300W5 m5704a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9300W5) MessageNano.mergeFrom(new C9300W5(), bArr);
    }
}
