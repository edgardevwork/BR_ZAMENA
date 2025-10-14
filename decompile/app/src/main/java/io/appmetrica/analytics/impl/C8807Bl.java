package io.appmetrica.analytics.impl;

import androidx.media3.extractor.p007ts.H262Reader;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import org.apache.commons.compress.archivers.arj.ArjArchiveInputStream;
import org.apache.commons.compress.compressors.bzip2.BZip2Constants;

/* renamed from: io.appmetrica.analytics.impl.Bl */
/* loaded from: classes7.dex */
public final class C8807Bl extends MessageNano {

    /* renamed from: E */
    public static final int f6382E = -1;

    /* renamed from: F */
    public static final int f6383F = 0;

    /* renamed from: G */
    public static final int f6384G = 1;

    /* renamed from: H */
    public static volatile C8807Bl[] f6385H;

    /* renamed from: A */
    public C9837rl f6386A;

    /* renamed from: B */
    public C10037zl f6387B;

    /* renamed from: C */
    public C9987xl[] f6388C;

    /* renamed from: D */
    public C9937vl f6389D;

    /* renamed from: a */
    public String f6390a;

    /* renamed from: b */
    public long f6391b;

    /* renamed from: c */
    public String[] f6392c;

    /* renamed from: d */
    public String f6393d;

    /* renamed from: e */
    public String f6394e;

    /* renamed from: f */
    public String[] f6395f;

    /* renamed from: g */
    public String[] f6396g;

    /* renamed from: h */
    public C9912ul[] f6397h;

    /* renamed from: i */
    public C9962wl f6398i;

    /* renamed from: j */
    public String f6399j;

    /* renamed from: k */
    public String f6400k;

    /* renamed from: l */
    public String f6401l;

    /* renamed from: m */
    public boolean f6402m;

    /* renamed from: n */
    public String f6403n;

    /* renamed from: o */
    public String[] f6404o;

    /* renamed from: p */
    public C8782Al f6405p;

    /* renamed from: q */
    public boolean f6406q;

    /* renamed from: r */
    public String f6407r;

    /* renamed from: s */
    public long f6408s;

    /* renamed from: t */
    public long f6409t;

    /* renamed from: u */
    public boolean f6410u;

    /* renamed from: v */
    public C10012yl f6411v;

    /* renamed from: w */
    public int f6412w;

    /* renamed from: x */
    public int f6413x;

    /* renamed from: y */
    public C9887tl f6414y;

    /* renamed from: z */
    public C9862sl f6415z;

    public C8807Bl() {
        m5007a();
    }

    /* renamed from: b */
    public static C8807Bl[] m5006b() {
        if (f6385H == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6385H == null) {
                        f6385H = new C8807Bl[0];
                    }
                } finally {
                }
            }
        }
        return f6385H;
    }

    /* renamed from: a */
    public final C8807Bl m5007a() {
        this.f6390a = "";
        this.f6391b = 0L;
        String[] strArr = WireFormatNano.EMPTY_STRING_ARRAY;
        this.f6392c = strArr;
        this.f6393d = "";
        this.f6394e = "";
        this.f6395f = strArr;
        this.f6396g = strArr;
        this.f6397h = C9912ul.m6865b();
        this.f6398i = null;
        this.f6399j = "";
        this.f6400k = "";
        this.f6401l = "";
        this.f6402m = false;
        this.f6403n = "";
        this.f6404o = strArr;
        this.f6405p = null;
        this.f6406q = false;
        this.f6407r = "";
        this.f6408s = 0L;
        this.f6409t = 0L;
        this.f6410u = false;
        this.f6411v = null;
        this.f6412w = 600;
        this.f6413x = 1;
        this.f6414y = null;
        this.f6415z = null;
        this.f6386A = null;
        this.f6387B = null;
        this.f6388C = C9987xl.m6975b();
        this.f6389D = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f6390a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6390a);
        }
        int iComputeInt64Size = CodedOutputByteBufferNano.computeInt64Size(2, this.f6391b) + iComputeSerializedSize;
        String[] strArr = this.f6392c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            int iComputeStringSizeNoTag = 0;
            int i3 = 0;
            while (true) {
                String[] strArr2 = this.f6392c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    i3++;
                    iComputeStringSizeNoTag += CodedOutputByteBufferNano.computeStringSizeNoTag(str);
                }
                i2++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag + i3;
        }
        if (!this.f6393d.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(4, this.f6393d);
        }
        if (!this.f6394e.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(5, this.f6394e);
        }
        String[] strArr3 = this.f6395f;
        if (strArr3 != null && strArr3.length > 0) {
            int i4 = 0;
            int iComputeStringSizeNoTag2 = 0;
            int i5 = 0;
            while (true) {
                String[] strArr4 = this.f6395f;
                if (i4 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i4];
                if (str2 != null) {
                    i5++;
                    iComputeStringSizeNoTag2 += CodedOutputByteBufferNano.computeStringSizeNoTag(str2);
                }
                i4++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag2 + i5;
        }
        String[] strArr5 = this.f6396g;
        if (strArr5 != null && strArr5.length > 0) {
            int i6 = 0;
            int iComputeStringSizeNoTag3 = 0;
            int i7 = 0;
            while (true) {
                String[] strArr6 = this.f6396g;
                if (i6 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i6];
                if (str3 != null) {
                    i7++;
                    iComputeStringSizeNoTag3 += CodedOutputByteBufferNano.computeStringSizeNoTag(str3);
                }
                i6++;
            }
            iComputeInt64Size = iComputeInt64Size + iComputeStringSizeNoTag3 + i7;
        }
        C9912ul[] c9912ulArr = this.f6397h;
        if (c9912ulArr != null && c9912ulArr.length > 0) {
            int i8 = 0;
            while (true) {
                C9912ul[] c9912ulArr2 = this.f6397h;
                if (i8 >= c9912ulArr2.length) {
                    break;
                }
                C9912ul c9912ul = c9912ulArr2[i8];
                if (c9912ul != null) {
                    iComputeInt64Size = CodedOutputByteBufferNano.computeMessageSize(8, c9912ul) + iComputeInt64Size;
                }
                i8++;
            }
        }
        C9962wl c9962wl = this.f6398i;
        if (c9962wl != null) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeMessageSize(9, c9962wl);
        }
        if (!this.f6399j.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(10, this.f6399j);
        }
        if (!this.f6400k.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(11, this.f6400k);
        }
        if (!this.f6401l.equals("")) {
            iComputeInt64Size += CodedOutputByteBufferNano.computeStringSize(12, this.f6401l);
        }
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(13, this.f6402m) + iComputeInt64Size;
        if (!this.f6403n.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(14, this.f6403n);
        }
        String[] strArr7 = this.f6404o;
        if (strArr7 != null && strArr7.length > 0) {
            int i9 = 0;
            int iComputeStringSizeNoTag4 = 0;
            int i10 = 0;
            while (true) {
                String[] strArr8 = this.f6404o;
                if (i9 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i9];
                if (str4 != null) {
                    i10++;
                    iComputeStringSizeNoTag4 += CodedOutputByteBufferNano.computeStringSizeNoTag(str4);
                }
                i9++;
            }
            iComputeBoolSize = iComputeBoolSize + iComputeStringSizeNoTag4 + i10;
        }
        C8782Al c8782Al = this.f6405p;
        if (c8782Al != null) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeMessageSize(16, c8782Al);
        }
        boolean z = this.f6406q;
        if (z) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        if (!this.f6407r.equals("")) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeStringSize(20, this.f6407r);
        }
        int iComputeInt64Size2 = CodedOutputByteBufferNano.computeInt64Size(22, this.f6409t) + CodedOutputByteBufferNano.computeInt64Size(21, this.f6408s) + iComputeBoolSize;
        boolean z2 = this.f6410u;
        if (z2) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeBoolSize(23, z2);
        }
        C10012yl c10012yl = this.f6411v;
        if (c10012yl != null) {
            iComputeInt64Size2 += CodedOutputByteBufferNano.computeMessageSize(24, c10012yl);
        }
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(26, this.f6413x) + CodedOutputByteBufferNano.computeInt32Size(25, this.f6412w) + iComputeInt64Size2;
        C9887tl c9887tl = this.f6414y;
        if (c9887tl != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(27, c9887tl);
        }
        C9862sl c9862sl = this.f6415z;
        if (c9862sl != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(28, c9862sl);
        }
        C9837rl c9837rl = this.f6386A;
        if (c9837rl != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(29, c9837rl);
        }
        C10037zl c10037zl = this.f6387B;
        if (c10037zl != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(30, c10037zl);
        }
        C9987xl[] c9987xlArr = this.f6388C;
        if (c9987xlArr != null && c9987xlArr.length > 0) {
            while (true) {
                C9987xl[] c9987xlArr2 = this.f6388C;
                if (i >= c9987xlArr2.length) {
                    break;
                }
                C9987xl c9987xl = c9987xlArr2[i];
                if (c9987xl != null) {
                    iComputeInt32Size = CodedOutputByteBufferNano.computeMessageSize(31, c9987xl) + iComputeInt32Size;
                }
                i++;
            }
        }
        C9937vl c9937vl = this.f6389D;
        return c9937vl != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(32, c9937vl) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6390a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6390a);
        }
        codedOutputByteBufferNano.writeInt64(2, this.f6391b);
        String[] strArr = this.f6392c;
        int i = 0;
        if (strArr != null && strArr.length > 0) {
            int i2 = 0;
            while (true) {
                String[] strArr2 = this.f6392c;
                if (i2 >= strArr2.length) {
                    break;
                }
                String str = strArr2[i2];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i2++;
            }
        }
        if (!this.f6393d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f6393d);
        }
        if (!this.f6394e.equals("")) {
            codedOutputByteBufferNano.writeString(5, this.f6394e);
        }
        String[] strArr3 = this.f6395f;
        if (strArr3 != null && strArr3.length > 0) {
            int i3 = 0;
            while (true) {
                String[] strArr4 = this.f6395f;
                if (i3 >= strArr4.length) {
                    break;
                }
                String str2 = strArr4[i3];
                if (str2 != null) {
                    codedOutputByteBufferNano.writeString(6, str2);
                }
                i3++;
            }
        }
        String[] strArr5 = this.f6396g;
        if (strArr5 != null && strArr5.length > 0) {
            int i4 = 0;
            while (true) {
                String[] strArr6 = this.f6396g;
                if (i4 >= strArr6.length) {
                    break;
                }
                String str3 = strArr6[i4];
                if (str3 != null) {
                    codedOutputByteBufferNano.writeString(7, str3);
                }
                i4++;
            }
        }
        C9912ul[] c9912ulArr = this.f6397h;
        if (c9912ulArr != null && c9912ulArr.length > 0) {
            int i5 = 0;
            while (true) {
                C9912ul[] c9912ulArr2 = this.f6397h;
                if (i5 >= c9912ulArr2.length) {
                    break;
                }
                C9912ul c9912ul = c9912ulArr2[i5];
                if (c9912ul != null) {
                    codedOutputByteBufferNano.writeMessage(8, c9912ul);
                }
                i5++;
            }
        }
        C9962wl c9962wl = this.f6398i;
        if (c9962wl != null) {
            codedOutputByteBufferNano.writeMessage(9, c9962wl);
        }
        if (!this.f6399j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f6399j);
        }
        if (!this.f6400k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f6400k);
        }
        if (!this.f6401l.equals("")) {
            codedOutputByteBufferNano.writeString(12, this.f6401l);
        }
        codedOutputByteBufferNano.writeBool(13, this.f6402m);
        if (!this.f6403n.equals("")) {
            codedOutputByteBufferNano.writeString(14, this.f6403n);
        }
        String[] strArr7 = this.f6404o;
        if (strArr7 != null && strArr7.length > 0) {
            int i6 = 0;
            while (true) {
                String[] strArr8 = this.f6404o;
                if (i6 >= strArr8.length) {
                    break;
                }
                String str4 = strArr8[i6];
                if (str4 != null) {
                    codedOutputByteBufferNano.writeString(15, str4);
                }
                i6++;
            }
        }
        C8782Al c8782Al = this.f6405p;
        if (c8782Al != null) {
            codedOutputByteBufferNano.writeMessage(16, c8782Al);
        }
        boolean z = this.f6406q;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        if (!this.f6407r.equals("")) {
            codedOutputByteBufferNano.writeString(20, this.f6407r);
        }
        codedOutputByteBufferNano.writeInt64(21, this.f6408s);
        codedOutputByteBufferNano.writeInt64(22, this.f6409t);
        boolean z2 = this.f6410u;
        if (z2) {
            codedOutputByteBufferNano.writeBool(23, z2);
        }
        C10012yl c10012yl = this.f6411v;
        if (c10012yl != null) {
            codedOutputByteBufferNano.writeMessage(24, c10012yl);
        }
        codedOutputByteBufferNano.writeInt32(25, this.f6412w);
        codedOutputByteBufferNano.writeInt32(26, this.f6413x);
        C9887tl c9887tl = this.f6414y;
        if (c9887tl != null) {
            codedOutputByteBufferNano.writeMessage(27, c9887tl);
        }
        C9862sl c9862sl = this.f6415z;
        if (c9862sl != null) {
            codedOutputByteBufferNano.writeMessage(28, c9862sl);
        }
        C9837rl c9837rl = this.f6386A;
        if (c9837rl != null) {
            codedOutputByteBufferNano.writeMessage(29, c9837rl);
        }
        C10037zl c10037zl = this.f6387B;
        if (c10037zl != null) {
            codedOutputByteBufferNano.writeMessage(30, c10037zl);
        }
        C9987xl[] c9987xlArr = this.f6388C;
        if (c9987xlArr != null && c9987xlArr.length > 0) {
            while (true) {
                C9987xl[] c9987xlArr2 = this.f6388C;
                if (i >= c9987xlArr2.length) {
                    break;
                }
                C9987xl c9987xl = c9987xlArr2[i];
                if (c9987xl != null) {
                    codedOutputByteBufferNano.writeMessage(31, c9987xl);
                }
                i++;
            }
        }
        C9937vl c9937vl = this.f6389D;
        if (c9937vl != null) {
            codedOutputByteBufferNano.writeMessage(32, c9937vl);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C8807Bl m5005b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8807Bl().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8807Bl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f6390a = codedInputByteBufferNano.readString();
                    break;
                case 16:
                    this.f6391b = codedInputByteBufferNano.readInt64();
                    break;
                case 26:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                    String[] strArr = this.f6392c;
                    int length = strArr == null ? 0 : strArr.length;
                    int i = repeatedFieldArrayLength + length;
                    String[] strArr2 = new String[i];
                    if (length != 0) {
                        System.arraycopy(strArr, 0, strArr2, 0, length);
                    }
                    while (length < i - 1) {
                        strArr2[length] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    strArr2[length] = codedInputByteBufferNano.readString();
                    this.f6392c = strArr2;
                    break;
                case 34:
                    this.f6393d = codedInputByteBufferNano.readString();
                    break;
                case 42:
                    this.f6394e = codedInputByteBufferNano.readString();
                    break;
                case 50:
                    int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 50);
                    String[] strArr3 = this.f6395f;
                    int length2 = strArr3 == null ? 0 : strArr3.length;
                    int i2 = repeatedFieldArrayLength2 + length2;
                    String[] strArr4 = new String[i2];
                    if (length2 != 0) {
                        System.arraycopy(strArr3, 0, strArr4, 0, length2);
                    }
                    while (length2 < i2 - 1) {
                        strArr4[length2] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length2++;
                    }
                    strArr4[length2] = codedInputByteBufferNano.readString();
                    this.f6395f = strArr4;
                    break;
                case 58:
                    int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                    String[] strArr5 = this.f6396g;
                    int length3 = strArr5 == null ? 0 : strArr5.length;
                    int i3 = repeatedFieldArrayLength3 + length3;
                    String[] strArr6 = new String[i3];
                    if (length3 != 0) {
                        System.arraycopy(strArr5, 0, strArr6, 0, length3);
                    }
                    while (length3 < i3 - 1) {
                        strArr6[length3] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length3++;
                    }
                    strArr6[length3] = codedInputByteBufferNano.readString();
                    this.f6396g = strArr6;
                    break;
                case 66:
                    int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 66);
                    C9912ul[] c9912ulArr = this.f6397h;
                    int length4 = c9912ulArr == null ? 0 : c9912ulArr.length;
                    int i4 = repeatedFieldArrayLength4 + length4;
                    C9912ul[] c9912ulArr2 = new C9912ul[i4];
                    if (length4 != 0) {
                        System.arraycopy(c9912ulArr, 0, c9912ulArr2, 0, length4);
                    }
                    while (length4 < i4 - 1) {
                        C9912ul c9912ul = new C9912ul();
                        c9912ulArr2[length4] = c9912ul;
                        codedInputByteBufferNano.readMessage(c9912ul);
                        codedInputByteBufferNano.readTag();
                        length4++;
                    }
                    C9912ul c9912ul2 = new C9912ul();
                    c9912ulArr2[length4] = c9912ul2;
                    codedInputByteBufferNano.readMessage(c9912ul2);
                    this.f6397h = c9912ulArr2;
                    break;
                case 74:
                    if (this.f6398i == null) {
                        this.f6398i = new C9962wl();
                    }
                    codedInputByteBufferNano.readMessage(this.f6398i);
                    break;
                case 82:
                    this.f6399j = codedInputByteBufferNano.readString();
                    break;
                case 90:
                    this.f6400k = codedInputByteBufferNano.readString();
                    break;
                case 98:
                    this.f6401l = codedInputByteBufferNano.readString();
                    break;
                case 104:
                    this.f6402m = codedInputByteBufferNano.readBool();
                    break;
                case 114:
                    this.f6403n = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    int repeatedFieldArrayLength5 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 122);
                    String[] strArr7 = this.f6404o;
                    int length5 = strArr7 == null ? 0 : strArr7.length;
                    int i5 = repeatedFieldArrayLength5 + length5;
                    String[] strArr8 = new String[i5];
                    if (length5 != 0) {
                        System.arraycopy(strArr7, 0, strArr8, 0, length5);
                    }
                    while (length5 < i5 - 1) {
                        strArr8[length5] = codedInputByteBufferNano.readString();
                        codedInputByteBufferNano.readTag();
                        length5++;
                    }
                    strArr8[length5] = codedInputByteBufferNano.readString();
                    this.f6404o = strArr8;
                    break;
                case 130:
                    if (this.f6405p == null) {
                        this.f6405p = new C8782Al();
                    }
                    codedInputByteBufferNano.readMessage(this.f6405p);
                    break;
                case 136:
                    this.f6406q = codedInputByteBufferNano.readBool();
                    break;
                case 162:
                    this.f6407r = codedInputByteBufferNano.readString();
                    break;
                case 168:
                    this.f6408s = codedInputByteBufferNano.readInt64();
                    break;
                case 176:
                    this.f6409t = codedInputByteBufferNano.readInt64();
                    break;
                case H262Reader.START_GROUP /* 184 */:
                    this.f6410u = codedInputByteBufferNano.readBool();
                    break;
                case 194:
                    if (this.f6411v == null) {
                        this.f6411v = new C10012yl();
                    }
                    codedInputByteBufferNano.readMessage(this.f6411v);
                    break;
                case 200:
                    this.f6412w = codedInputByteBufferNano.readInt32();
                    break;
                case 208:
                    this.f6413x = codedInputByteBufferNano.readInt32();
                    break;
                case 218:
                    if (this.f6414y == null) {
                        this.f6414y = new C9887tl();
                    }
                    codedInputByteBufferNano.readMessage(this.f6414y);
                    break;
                case 226:
                    if (this.f6415z == null) {
                        this.f6415z = new C9862sl();
                    }
                    codedInputByteBufferNano.readMessage(this.f6415z);
                    break;
                case ArjArchiveInputStream.ARJ_MAGIC_2 /* 234 */:
                    if (this.f6386A == null) {
                        this.f6386A = new C9837rl();
                    }
                    codedInputByteBufferNano.readMessage(this.f6386A);
                    break;
                case 242:
                    if (this.f6387B == null) {
                        this.f6387B = new C10037zl();
                    }
                    codedInputByteBufferNano.readMessage(this.f6387B);
                    break;
                case 250:
                    int repeatedFieldArrayLength6 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 250);
                    C9987xl[] c9987xlArr = this.f6388C;
                    int length6 = c9987xlArr == null ? 0 : c9987xlArr.length;
                    int i6 = repeatedFieldArrayLength6 + length6;
                    C9987xl[] c9987xlArr2 = new C9987xl[i6];
                    if (length6 != 0) {
                        System.arraycopy(c9987xlArr, 0, c9987xlArr2, 0, length6);
                    }
                    while (length6 < i6 - 1) {
                        C9987xl c9987xl = new C9987xl();
                        c9987xlArr2[length6] = c9987xl;
                        codedInputByteBufferNano.readMessage(c9987xl);
                        codedInputByteBufferNano.readTag();
                        length6++;
                    }
                    C9987xl c9987xl2 = new C9987xl();
                    c9987xlArr2[length6] = c9987xl2;
                    codedInputByteBufferNano.readMessage(c9987xl2);
                    this.f6388C = c9987xlArr2;
                    break;
                case BZip2Constants.MAX_ALPHA_SIZE /* 258 */:
                    if (this.f6389D == null) {
                        this.f6389D = new C9937vl();
                    }
                    codedInputByteBufferNano.readMessage(this.f6389D);
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
    public static C8807Bl m5004a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8807Bl) MessageNano.mergeFrom(new C8807Bl(), bArr);
    }
}
