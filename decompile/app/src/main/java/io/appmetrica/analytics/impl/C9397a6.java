package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.a6 */
/* loaded from: classes5.dex */
public final class C9397a6 extends MessageNano {

    /* renamed from: k */
    public static final int f7670k = 0;

    /* renamed from: l */
    public static final int f7671l = 1;

    /* renamed from: m */
    public static volatile C9397a6[] f7672m;

    /* renamed from: n */
    public static byte[] f7673n;

    /* renamed from: o */
    public static volatile boolean f7674o;

    /* renamed from: a */
    public C9547g6 f7675a;

    /* renamed from: b */
    public C9300W5 f7676b;

    /* renamed from: c */
    public String f7677c;

    /* renamed from: d */
    public int f7678d;

    /* renamed from: e */
    public C9497e6[] f7679e;

    /* renamed from: f */
    public int f7680f;

    /* renamed from: g */
    public C9372Z5 f7681g;

    /* renamed from: h */
    public byte[] f7682h;

    /* renamed from: i */
    public byte[] f7683i;

    /* renamed from: j */
    public C9348Y5[] f7684j;

    public C9397a6() {
        if (!f7674o) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f7674o) {
                        f7673n = InternalNano.bytesDefaultValue("JVM");
                        f7674o = true;
                    }
                } finally {
                }
            }
        }
        m5834a();
    }

    /* renamed from: b */
    public static C9397a6[] m5833b() {
        if (f7672m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7672m == null) {
                        f7672m = new C9397a6[0];
                    }
                } finally {
                }
            }
        }
        return f7672m;
    }

    /* renamed from: a */
    public final C9397a6 m5834a() {
        this.f7675a = null;
        this.f7676b = null;
        this.f7677c = "";
        this.f7678d = -1;
        this.f7679e = C9497e6.m6040b();
        this.f7680f = 0;
        this.f7681g = null;
        this.f7682h = (byte[]) f7673n.clone();
        this.f7683i = WireFormatNano.EMPTY_BYTES;
        this.f7684j = C9348Y5.m5774b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9547g6 c9547g6 = this.f7675a;
        if (c9547g6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9547g6);
        }
        C9300W5 c9300w5 = this.f7676b;
        if (c9300w5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9300w5);
        }
        if (!this.f7677c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7677c);
        }
        int i = this.f7678d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C9497e6[] c9497e6Arr = this.f7679e;
        int i2 = 0;
        if (c9497e6Arr != null && c9497e6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C9497e6[] c9497e6Arr2 = this.f7679e;
                if (i3 >= c9497e6Arr2.length) {
                    break;
                }
                C9497e6 c9497e6 = c9497e6Arr2[i3];
                if (c9497e6 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(5, c9497e6) + iComputeSerializedSize;
                }
                i3++;
            }
        }
        int i4 = this.f7680f;
        if (i4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        C9372Z5 c9372z5 = this.f7681g;
        if (c9372z5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(7, c9372z5);
        }
        if (!Arrays.equals(this.f7682h, f7673n)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f7682h);
        }
        if (!Arrays.equals(this.f7683i, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7683i);
        }
        C9348Y5[] c9348y5Arr = this.f7684j;
        if (c9348y5Arr != null && c9348y5Arr.length > 0) {
            while (true) {
                C9348Y5[] c9348y5Arr2 = this.f7684j;
                if (i2 >= c9348y5Arr2.length) {
                    break;
                }
                C9348Y5 c9348y5 = c9348y5Arr2[i2];
                if (c9348y5 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c9348y5) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9547g6 c9547g6 = this.f7675a;
        if (c9547g6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9547g6);
        }
        C9300W5 c9300w5 = this.f7676b;
        if (c9300w5 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9300w5);
        }
        if (!this.f7677c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7677c);
        }
        int i = this.f7678d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C9497e6[] c9497e6Arr = this.f7679e;
        int i2 = 0;
        if (c9497e6Arr != null && c9497e6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C9497e6[] c9497e6Arr2 = this.f7679e;
                if (i3 >= c9497e6Arr2.length) {
                    break;
                }
                C9497e6 c9497e6 = c9497e6Arr2[i3];
                if (c9497e6 != null) {
                    codedOutputByteBufferNano.writeMessage(5, c9497e6);
                }
                i3++;
            }
        }
        int i4 = this.f7680f;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        C9372Z5 c9372z5 = this.f7681g;
        if (c9372z5 != null) {
            codedOutputByteBufferNano.writeMessage(7, c9372z5);
        }
        if (!Arrays.equals(this.f7682h, f7673n)) {
            codedOutputByteBufferNano.writeBytes(8, this.f7682h);
        }
        if (!Arrays.equals(this.f7683i, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7683i);
        }
        C9348Y5[] c9348y5Arr = this.f7684j;
        if (c9348y5Arr != null && c9348y5Arr.length > 0) {
            while (true) {
                C9348Y5[] c9348y5Arr2 = this.f7684j;
                if (i2 >= c9348y5Arr2.length) {
                    break;
                }
                C9348Y5 c9348y5 = c9348y5Arr2[i2];
                if (c9348y5 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c9348y5);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9397a6 m5832b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9397a6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9397a6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f7675a == null) {
                        this.f7675a = new C9547g6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7675a);
                    break;
                case 18:
                    if (this.f7676b == null) {
                        this.f7676b = new C9300W5();
                    }
                    codedInputByteBufferNano.readMessage(this.f7676b);
                    break;
                case 26:
                    this.f7677c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f7678d = int32;
                        break;
                    }
                    break;
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C9497e6[] c9497e6Arr = this.f7679e;
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
                    this.f7679e = c9497e6Arr2;
                    break;
                case 48:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f7680f = int322;
                        break;
                    }
                    break;
                case 58:
                    if (this.f7681g == null) {
                        this.f7681g = new C9372Z5();
                    }
                    codedInputByteBufferNano.readMessage(this.f7681g);
                    break;
                case 66:
                    this.f7682h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f7683i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                    C9348Y5[] c9348y5Arr = this.f7684j;
                    int length2 = c9348y5Arr == null ? 0 : c9348y5Arr.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    C9348Y5[] c9348y5Arr2 = new C9348Y5[i2];
                    if (length2 != 0) {
                        System.arraycopy(c9348y5Arr, 0, c9348y5Arr2, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        C9348Y5 c9348y5 = new C9348Y5();
                        c9348y5Arr2[length2] = c9348y5;
                        codedInputByteBufferNano.readMessage(c9348y5);
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    C9348Y5 c9348y52 = new C9348Y5();
                    c9348y5Arr2[length2] = c9348y52;
                    codedInputByteBufferNano.readMessage(c9348y52);
                    this.f7684j = c9348y5Arr2;
                    break;
                default:
                    if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                        return this;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public static C9397a6 m5831a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9397a6) MessageNano.mergeFrom(new C9397a6(), bArr);
    }
}
