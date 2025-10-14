package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g6 */
/* loaded from: classes8.dex */
public final class C9547g6 extends MessageNano {

    /* renamed from: f */
    public static volatile C9547g6[] f8165f;

    /* renamed from: a */
    public String f8166a;

    /* renamed from: b */
    public String f8167b;

    /* renamed from: c */
    public C9497e6[] f8168c;

    /* renamed from: d */
    public C9547g6 f8169d;

    /* renamed from: e */
    public C9547g6[] f8170e;

    public C9547g6() {
        m6160a();
    }

    /* renamed from: b */
    public static C9547g6[] m6159b() {
        if (f8165f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8165f == null) {
                        f8165f = new C9547g6[0];
                    }
                } finally {
                }
            }
        }
        return f8165f;
    }

    /* renamed from: a */
    public final C9547g6 m6160a() {
        this.f8166a = "";
        this.f8167b = "";
        this.f8168c = C9497e6.m6040b();
        this.f8169d = null;
        this.f8170e = m6159b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(1, this.f8166a) + super.computeSerializedSize();
        if (!this.f8167b.equals("")) {
            iComputeStringSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8167b);
        }
        C9497e6[] c9497e6Arr = this.f8168c;
        int i = 0;
        if (c9497e6Arr != null && c9497e6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C9497e6[] c9497e6Arr2 = this.f8168c;
                if (i2 >= c9497e6Arr2.length) {
                    break;
                }
                C9497e6 c9497e6 = c9497e6Arr2[i2];
                if (c9497e6 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(3, c9497e6) + iComputeStringSize;
                }
                i2++;
            }
        }
        C9547g6 c9547g6 = this.f8169d;
        if (c9547g6 != null) {
            iComputeStringSize += CodedOutputByteBufferNano.computeMessageSize(4, c9547g6);
        }
        C9547g6[] c9547g6Arr = this.f8170e;
        if (c9547g6Arr != null && c9547g6Arr.length > 0) {
            while (true) {
                C9547g6[] c9547g6Arr2 = this.f8170e;
                if (i >= c9547g6Arr2.length) {
                    break;
                }
                C9547g6 c9547g62 = c9547g6Arr2[i];
                if (c9547g62 != null) {
                    iComputeStringSize = CodedOutputByteBufferNano.computeMessageSize(5, c9547g62) + iComputeStringSize;
                }
                i++;
            }
        }
        return iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f8166a);
        if (!this.f8167b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8167b);
        }
        C9497e6[] c9497e6Arr = this.f8168c;
        int i = 0;
        if (c9497e6Arr != null && c9497e6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C9497e6[] c9497e6Arr2 = this.f8168c;
                if (i2 >= c9497e6Arr2.length) {
                    break;
                }
                C9497e6 c9497e6 = c9497e6Arr2[i2];
                if (c9497e6 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c9497e6);
                }
                i2++;
            }
        }
        C9547g6 c9547g6 = this.f8169d;
        if (c9547g6 != null) {
            codedOutputByteBufferNano.writeMessage(4, c9547g6);
        }
        C9547g6[] c9547g6Arr = this.f8170e;
        if (c9547g6Arr != null && c9547g6Arr.length > 0) {
            while (true) {
                C9547g6[] c9547g6Arr2 = this.f8170e;
                if (i >= c9547g6Arr2.length) {
                    break;
                }
                C9547g6 c9547g62 = c9547g6Arr2[i];
                if (c9547g62 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c9547g62);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9547g6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8166a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f8167b = codedInputByteBufferNano.readString();
            } else if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C9497e6[] c9497e6Arr = this.f8168c;
                int length = c9497e6Arr == null ? 0 : c9497e6Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9497e6[] c9497e6Arr2 = new C9497e6[i];
                if (length != 0) {
                    System.arraycopy(c9497e6Arr, 0, c9497e6Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9497e6 c9497e6 = new C9497e6();
                    c9497e6Arr2[length] = c9497e6;
                    codedInputByteBufferNano.readMessage(c9497e6);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9497e6 c9497e62 = new C9497e6();
                c9497e6Arr2[length] = c9497e62;
                codedInputByteBufferNano.readMessage(c9497e62);
                this.f8168c = c9497e6Arr2;
            } else if (tag == 34) {
                if (this.f8169d == null) {
                    this.f8169d = new C9547g6();
                }
                codedInputByteBufferNano.readMessage(this.f8169d);
            } else if (tag != 42) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                C9547g6[] c9547g6Arr = this.f8170e;
                int length2 = c9547g6Arr == null ? 0 : c9547g6Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C9547g6[] c9547g6Arr2 = new C9547g6[i2];
                if (length2 != 0) {
                    System.arraycopy(c9547g6Arr, 0, c9547g6Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C9547g6 c9547g6 = new C9547g6();
                    c9547g6Arr2[length2] = c9547g6;
                    codedInputByteBufferNano.readMessage(c9547g6);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C9547g6 c9547g62 = new C9547g6();
                c9547g6Arr2[length2] = c9547g62;
                codedInputByteBufferNano.readMessage(c9547g62);
                this.f8170e = c9547g6Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C9547g6 m6158b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9547g6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9547g6 m6157a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9547g6) MessageNano.mergeFrom(new C9547g6(), bArr);
    }
}
