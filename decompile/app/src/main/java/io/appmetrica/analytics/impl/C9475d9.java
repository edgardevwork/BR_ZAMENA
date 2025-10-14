package io.appmetrica.analytics.impl;

import androidx.media3.extractor.p007ts.H262Reader;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.d9 */
/* loaded from: classes8.dex */
public final class C9475d9 extends MessageNano {

    /* renamed from: A */
    public static final int f7905A = 17;

    /* renamed from: B */
    public static final int f7906B = 18;

    /* renamed from: C */
    public static final int f7907C = 19;

    /* renamed from: D */
    public static final int f7908D = 20;

    /* renamed from: E */
    public static final int f7909E = 21;

    /* renamed from: F */
    public static final int f7910F = 25;

    /* renamed from: G */
    public static final int f7911G = 26;

    /* renamed from: H */
    public static final int f7912H = 27;

    /* renamed from: I */
    public static final int f7913I = 29;

    /* renamed from: J */
    public static final int f7914J = 35;

    /* renamed from: K */
    public static final int f7915K = 38;

    /* renamed from: L */
    public static final int f7916L = 40;

    /* renamed from: M */
    public static final int f7917M = 42;

    /* renamed from: N */
    public static final int f7918N = 0;

    /* renamed from: O */
    public static final int f7919O = 1;

    /* renamed from: P */
    public static final int f7920P = 2;

    /* renamed from: Q */
    public static final int f7921Q = 0;

    /* renamed from: R */
    public static final int f7922R = 1;

    /* renamed from: S */
    public static volatile C9475d9[] f7923S = null;

    /* renamed from: t */
    public static final int f7924t = 1;

    /* renamed from: u */
    public static final int f7925u = 2;

    /* renamed from: v */
    public static final int f7926v = 4;

    /* renamed from: w */
    public static final int f7927w = 5;

    /* renamed from: x */
    public static final int f7928x = 7;

    /* renamed from: y */
    public static final int f7929y = 13;

    /* renamed from: z */
    public static final int f7930z = 16;

    /* renamed from: a */
    public long f7931a;

    /* renamed from: b */
    public long f7932b;

    /* renamed from: c */
    public int f7933c;

    /* renamed from: d */
    public String f7934d;

    /* renamed from: e */
    public byte[] f7935e;

    /* renamed from: f */
    public C9351Y8 f7936f;

    /* renamed from: g */
    public C9450c9 f7937g;

    /* renamed from: h */
    public String f7938h;

    /* renamed from: i */
    public int f7939i;

    /* renamed from: j */
    public int f7940j;

    /* renamed from: k */
    public int f7941k;

    /* renamed from: l */
    public byte[] f7942l;

    /* renamed from: m */
    public int f7943m;

    /* renamed from: n */
    public long f7944n;

    /* renamed from: o */
    public long f7945o;

    /* renamed from: p */
    public int f7946p;

    /* renamed from: q */
    public boolean f7947q;

    /* renamed from: r */
    public long f7948r;

    /* renamed from: s */
    public C9425b9[] f7949s;

    public C9475d9() {
        m6021a();
    }

    /* renamed from: b */
    public static C9475d9[] m6020b() {
        if (f7923S == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7923S == null) {
                        f7923S = new C9475d9[0];
                    }
                } finally {
                }
            }
        }
        return f7923S;
    }

    /* renamed from: a */
    public final C9475d9 m6021a() {
        this.f7931a = 0L;
        this.f7932b = 0L;
        this.f7933c = 0;
        this.f7934d = "";
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f7935e = bArr;
        this.f7936f = null;
        this.f7937g = null;
        this.f7938h = "";
        this.f7939i = 0;
        this.f7940j = 0;
        this.f7941k = -1;
        this.f7942l = bArr;
        this.f7943m = -1;
        this.f7944n = 0L;
        this.f7945o = 0L;
        this.f7946p = 0;
        this.f7947q = false;
        this.f7948r = 1L;
        this.f7949s = C9425b9.m5908b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f7933c) + CodedOutputByteBufferNano.computeUInt64Size(2, this.f7932b) + CodedOutputByteBufferNano.computeUInt64Size(1, this.f7931a) + super.computeSerializedSize();
        if (!this.f7934d.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(4, this.f7934d);
        }
        byte[] bArr = this.f7935e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(5, this.f7935e);
        }
        C9351Y8 c9351y8 = this.f7936f;
        if (c9351y8 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(6, c9351y8);
        }
        C9450c9 c9450c9 = this.f7937g;
        if (c9450c9 != null) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeMessageSize(7, c9450c9);
        }
        if (!this.f7938h.equals("")) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeStringSize(8, this.f7938h);
        }
        int i = this.f7939i;
        if (i != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt32Size(10, i);
        }
        int i2 = this.f7940j;
        if (i2 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(12, i2);
        }
        int i3 = this.f7941k;
        if (i3 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(13, i3);
        }
        if (!Arrays.equals(this.f7942l, bArr2)) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBytesSize(14, this.f7942l);
        }
        int i4 = this.f7943m;
        if (i4 != -1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(15, i4);
        }
        long j = this.f7944n;
        if (j != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(16, j);
        }
        long j2 = this.f7945o;
        if (j2 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(17, j2);
        }
        int i5 = this.f7946p;
        if (i5 != 0) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeInt32Size(22, i5);
        }
        boolean z = this.f7947q;
        if (z) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeBoolSize(23, z);
        }
        long j3 = this.f7948r;
        if (j3 != 1) {
            iComputeUInt32Size += CodedOutputByteBufferNano.computeUInt64Size(24, j3);
        }
        C9425b9[] c9425b9Arr = this.f7949s;
        if (c9425b9Arr != null && c9425b9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C9425b9[] c9425b9Arr2 = this.f7949s;
                if (i6 >= c9425b9Arr2.length) {
                    break;
                }
                C9425b9 c9425b9 = c9425b9Arr2[i6];
                if (c9425b9 != null) {
                    iComputeUInt32Size = CodedOutputByteBufferNano.computeMessageSize(25, c9425b9) + iComputeUInt32Size;
                }
                i6++;
            }
        }
        return iComputeUInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f7931a);
        codedOutputByteBufferNano.writeUInt64(2, this.f7932b);
        codedOutputByteBufferNano.writeUInt32(3, this.f7933c);
        if (!this.f7934d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7934d);
        }
        byte[] bArr = this.f7935e;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f7935e);
        }
        C9351Y8 c9351y8 = this.f7936f;
        if (c9351y8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c9351y8);
        }
        C9450c9 c9450c9 = this.f7937g;
        if (c9450c9 != null) {
            codedOutputByteBufferNano.writeMessage(7, c9450c9);
        }
        if (!this.f7938h.equals("")) {
            codedOutputByteBufferNano.writeString(8, this.f7938h);
        }
        int i = this.f7939i;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(10, i);
        }
        int i2 = this.f7940j;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(12, i2);
        }
        int i3 = this.f7941k;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(13, i3);
        }
        if (!Arrays.equals(this.f7942l, bArr2)) {
            codedOutputByteBufferNano.writeBytes(14, this.f7942l);
        }
        int i4 = this.f7943m;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i4);
        }
        long j = this.f7944n;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(16, j);
        }
        long j2 = this.f7945o;
        if (j2 != 0) {
            codedOutputByteBufferNano.writeUInt64(17, j2);
        }
        int i5 = this.f7946p;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(22, i5);
        }
        boolean z = this.f7947q;
        if (z) {
            codedOutputByteBufferNano.writeBool(23, z);
        }
        long j3 = this.f7948r;
        if (j3 != 1) {
            codedOutputByteBufferNano.writeUInt64(24, j3);
        }
        C9425b9[] c9425b9Arr = this.f7949s;
        if (c9425b9Arr != null && c9425b9Arr.length > 0) {
            int i6 = 0;
            while (true) {
                C9425b9[] c9425b9Arr2 = this.f7949s;
                if (i6 >= c9425b9Arr2.length) {
                    break;
                }
                C9425b9 c9425b9 = c9425b9Arr2[i6];
                if (c9425b9 != null) {
                    codedOutputByteBufferNano.writeMessage(25, c9425b9);
                }
                i6++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9475d9 m6019b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9475d9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9475d9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f7931a = codedInputByteBufferNano.readUInt64();
                    break;
                case 16:
                    this.f7932b = codedInputByteBufferNano.readUInt64();
                    break;
                case 24:
                    this.f7933c = codedInputByteBufferNano.readUInt32();
                    break;
                case 34:
                    this.f7934d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f7935e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f7936f == null) {
                        this.f7936f = new C9351Y8();
                    }
                    codedInputByteBufferNano.readMessage(this.f7936f);
                    break;
                case 58:
                    if (this.f7937g == null) {
                        this.f7937g = new C9450c9();
                    }
                    codedInputByteBufferNano.readMessage(this.f7937g);
                    break;
                case 66:
                    this.f7938h = codedInputByteBufferNano.readString();
                    break;
                case 80:
                    this.f7939i = codedInputByteBufferNano.readUInt32();
                    break;
                case 96:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2) {
                        break;
                    } else {
                        this.f7940j = int32;
                        break;
                    }
                    break;
                case 104:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != -1 && int322 != 0 && int322 != 1) {
                        break;
                    } else {
                        this.f7941k = int322;
                        break;
                    }
                case 114:
                    this.f7942l = codedInputByteBufferNano.readBytes();
                    break;
                case 120:
                    int int323 = codedInputByteBufferNano.readInt32();
                    if (int323 != -1 && int323 != 0 && int323 != 1) {
                        break;
                    } else {
                        this.f7943m = int323;
                        break;
                    }
                case 128:
                    this.f7944n = codedInputByteBufferNano.readUInt64();
                    break;
                case 136:
                    this.f7945o = codedInputByteBufferNano.readUInt64();
                    break;
                case 176:
                    int int324 = codedInputByteBufferNano.readInt32();
                    if (int324 != 0 && int324 != 1) {
                        break;
                    } else {
                        this.f7946p = int324;
                        break;
                    }
                    break;
                case H262Reader.START_GROUP /* 184 */:
                    this.f7947q = codedInputByteBufferNano.readBool();
                    break;
                case 192:
                    this.f7948r = codedInputByteBufferNano.readUInt64();
                    break;
                case 202:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 202);
                    C9425b9[] c9425b9Arr = this.f7949s;
                    int length = c9425b9Arr == null ? 0 : c9425b9Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C9425b9[] c9425b9Arr2 = new C9425b9[i];
                    if (length != 0) {
                        System.arraycopy(c9425b9Arr, 0, c9425b9Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C9425b9 c9425b9 = new C9425b9();
                        c9425b9Arr2[length] = c9425b9;
                        codedInputByteBufferNano.readMessage(c9425b9);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C9425b9 c9425b92 = new C9425b9();
                    c9425b9Arr2[length] = c9425b92;
                    codedInputByteBufferNano.readMessage(c9425b92);
                    this.f7949s = c9425b9Arr2;
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
    public static C9475d9 m6018a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9475d9) MessageNano.mergeFrom(new C9475d9(), bArr);
    }
}
