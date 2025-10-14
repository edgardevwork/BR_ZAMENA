package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.c6 */
/* loaded from: classes8.dex */
public final class C9447c6 extends MessageNano {

    /* renamed from: l */
    public static final int f7817l = 0;

    /* renamed from: m */
    public static final int f7818m = 1;

    /* renamed from: n */
    public static volatile C9447c6[] f7819n;

    /* renamed from: o */
    public static byte[] f7820o;

    /* renamed from: p */
    public static volatile boolean f7821p;

    /* renamed from: a */
    public C9547g6 f7822a;

    /* renamed from: b */
    public C9300W5 f7823b;

    /* renamed from: c */
    public String f7824c;

    /* renamed from: d */
    public int f7825d;

    /* renamed from: e */
    public C9497e6[] f7826e;

    /* renamed from: f */
    public String f7827f;

    /* renamed from: g */
    public int f7828g;

    /* renamed from: h */
    public C9422b6 f7829h;

    /* renamed from: i */
    public byte[] f7830i;

    /* renamed from: j */
    public byte[] f7831j;

    /* renamed from: k */
    public C9348Y5[] f7832k;

    public C9447c6() {
        if (!f7821p) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f7821p) {
                        f7820o = InternalNano.bytesDefaultValue("JVM");
                        f7821p = true;
                    }
                } finally {
                }
            }
        }
        m5948a();
    }

    /* renamed from: b */
    public static C9447c6[] m5947b() {
        if (f7819n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7819n == null) {
                        f7819n = new C9447c6[0];
                    }
                } finally {
                }
            }
        }
        return f7819n;
    }

    /* renamed from: a */
    public final C9447c6 m5948a() {
        this.f7822a = null;
        this.f7823b = null;
        this.f7824c = "";
        this.f7825d = -1;
        this.f7826e = C9497e6.m6040b();
        this.f7827f = "";
        this.f7828g = 0;
        this.f7829h = null;
        this.f7830i = (byte[]) f7820o.clone();
        this.f7831j = WireFormatNano.EMPTY_BYTES;
        this.f7832k = C9348Y5.m5774b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9547g6 c9547g6 = this.f7822a;
        if (c9547g6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9547g6);
        }
        C9300W5 c9300w5 = this.f7823b;
        if (c9300w5 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9300w5);
        }
        if (!this.f7824c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f7824c);
        }
        int i = this.f7825d;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        C9497e6[] c9497e6Arr = this.f7826e;
        int i2 = 0;
        if (c9497e6Arr != null && c9497e6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C9497e6[] c9497e6Arr2 = this.f7826e;
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
        if (!this.f7827f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f7827f);
        }
        int i4 = this.f7828g;
        if (i4 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        C9422b6 c9422b6 = this.f7829h;
        if (c9422b6 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(8, c9422b6);
        }
        if (!Arrays.equals(this.f7830i, f7820o)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f7830i);
        }
        if (!Arrays.equals(this.f7831j, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f7831j);
        }
        C9348Y5[] c9348y5Arr = this.f7832k;
        if (c9348y5Arr != null && c9348y5Arr.length > 0) {
            while (true) {
                C9348Y5[] c9348y5Arr2 = this.f7832k;
                if (i2 >= c9348y5Arr2.length) {
                    break;
                }
                C9348Y5 c9348y5 = c9348y5Arr2[i2];
                if (c9348y5 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(11, c9348y5) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9547g6 c9547g6 = this.f7822a;
        if (c9547g6 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9547g6);
        }
        C9300W5 c9300w5 = this.f7823b;
        if (c9300w5 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9300w5);
        }
        if (!this.f7824c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f7824c);
        }
        int i = this.f7825d;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        C9497e6[] c9497e6Arr = this.f7826e;
        int i2 = 0;
        if (c9497e6Arr != null && c9497e6Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C9497e6[] c9497e6Arr2 = this.f7826e;
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
        if (!this.f7827f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f7827f);
        }
        int i4 = this.f7828g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        C9422b6 c9422b6 = this.f7829h;
        if (c9422b6 != null) {
            codedOutputByteBufferNano.writeMessage(8, c9422b6);
        }
        if (!Arrays.equals(this.f7830i, f7820o)) {
            codedOutputByteBufferNano.writeBytes(9, this.f7830i);
        }
        if (!Arrays.equals(this.f7831j, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(10, this.f7831j);
        }
        C9348Y5[] c9348y5Arr = this.f7832k;
        if (c9348y5Arr != null && c9348y5Arr.length > 0) {
            while (true) {
                C9348Y5[] c9348y5Arr2 = this.f7832k;
                if (i2 >= c9348y5Arr2.length) {
                    break;
                }
                C9348Y5 c9348y5 = c9348y5Arr2[i2];
                if (c9348y5 != null) {
                    codedOutputByteBufferNano.writeMessage(11, c9348y5);
                }
                i2++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9447c6 m5946b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9447c6().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9447c6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    if (this.f7822a == null) {
                        this.f7822a = new C9547g6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7822a);
                    break;
                case 18:
                    if (this.f7823b == null) {
                        this.f7823b = new C9300W5();
                    }
                    codedInputByteBufferNano.readMessage(this.f7823b);
                    break;
                case 26:
                    this.f7824c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f7825d = int32;
                        break;
                    }
                case 42:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 42);
                    C9497e6[] c9497e6Arr = this.f7826e;
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
                    this.f7826e = c9497e6Arr2;
                    break;
                case 50:
                    this.f7827f = codedInputByteBufferNano.readString();
                    break;
                case 56:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f7828g = int322;
                        break;
                    }
                case 66:
                    if (this.f7829h == null) {
                        this.f7829h = new C9422b6();
                    }
                    codedInputByteBufferNano.readMessage(this.f7829h);
                    break;
                case 74:
                    this.f7830i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f7831j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                    C9348Y5[] c9348y5Arr = this.f7832k;
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
                    this.f7832k = c9348y5Arr2;
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
    public static C9447c6 m5945a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9447c6) MessageNano.mergeFrom(new C9447c6(), bArr);
    }
}
