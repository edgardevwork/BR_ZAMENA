package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f6 */
/* loaded from: classes8.dex */
public final class C9522f6 extends MessageNano {

    /* renamed from: g */
    public static volatile C9522f6[] f8058g;

    /* renamed from: a */
    public String f8059a;

    /* renamed from: b */
    public int f8060b;

    /* renamed from: c */
    public long f8061c;

    /* renamed from: d */
    public String f8062d;

    /* renamed from: e */
    public int f8063e;

    /* renamed from: f */
    public C9497e6[] f8064f;

    public C9522f6() {
        m6084a();
    }

    /* renamed from: b */
    public static C9522f6[] m6083b() {
        if (f8058g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8058g == null) {
                        f8058g = new C9522f6[0];
                    }
                } finally {
                }
            }
        }
        return f8058g;
    }

    /* renamed from: a */
    public final C9522f6 m6084a() {
        this.f8059a = "";
        this.f8060b = 0;
        this.f8061c = 0L;
        this.f8062d = "";
        this.f8063e = 0;
        this.f8064f = C9497e6.m6040b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSInt64Size = CodedOutputByteBufferNano.computeSInt64Size(3, this.f8061c) + CodedOutputByteBufferNano.computeSInt32Size(2, this.f8060b) + CodedOutputByteBufferNano.computeStringSize(1, this.f8059a) + super.computeSerializedSize();
        if (!this.f8062d.equals("")) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f8062d);
        }
        int i = this.f8063e;
        if (i != 0) {
            iComputeSInt64Size += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        C9497e6[] c9497e6Arr = this.f8064f;
        if (c9497e6Arr != null && c9497e6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C9497e6[] c9497e6Arr2 = this.f8064f;
                if (i2 >= c9497e6Arr2.length) {
                    break;
                }
                C9497e6 c9497e6 = c9497e6Arr2[i2];
                if (c9497e6 != null) {
                    iComputeSInt64Size = CodedOutputByteBufferNano.computeMessageSize(6, c9497e6) + iComputeSInt64Size;
                }
                i2++;
            }
        }
        return iComputeSInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeString(1, this.f8059a);
        codedOutputByteBufferNano.writeSInt32(2, this.f8060b);
        codedOutputByteBufferNano.writeSInt64(3, this.f8061c);
        if (!this.f8062d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f8062d);
        }
        int i = this.f8063e;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        C9497e6[] c9497e6Arr = this.f8064f;
        if (c9497e6Arr != null && c9497e6Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C9497e6[] c9497e6Arr2 = this.f8064f;
                if (i2 >= c9497e6Arr2.length) {
                    break;
                }
                C9497e6 c9497e6 = c9497e6Arr2[i2];
                if (c9497e6 != null) {
                    codedOutputByteBufferNano.writeMessage(6, c9497e6);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9522f6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8059a = codedInputByteBufferNano.readString();
            } else if (tag == 16) {
                this.f8060b = codedInputByteBufferNano.readSInt32();
            } else if (tag == 24) {
                this.f8061c = codedInputByteBufferNano.readSInt64();
            } else if (tag == 34) {
                this.f8062d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f8063e = codedInputByteBufferNano.readUInt32();
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                C9497e6[] c9497e6Arr = this.f8064f;
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
                this.f8064f = c9497e6Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C9522f6 m6082b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9522f6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9522f6 m6081a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9522f6) MessageNano.mergeFrom(new C9522f6(), bArr);
    }
}
