package io.appmetrica.analytics.impl;

import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.a9 */
/* loaded from: classes5.dex */
public final class C9400a9 extends MessageNano {

    /* renamed from: n */
    public static volatile C9400a9[] f7705n;

    /* renamed from: a */
    public String f7706a;

    /* renamed from: b */
    public String f7707b;

    /* renamed from: c */
    public String f7708c;

    /* renamed from: d */
    public int f7709d;

    /* renamed from: e */
    public String f7710e;

    /* renamed from: f */
    public String f7711f;

    /* renamed from: g */
    public boolean f7712g;

    /* renamed from: h */
    public int f7713h;

    /* renamed from: i */
    public String f7714i;

    /* renamed from: j */
    public String f7715j;

    /* renamed from: k */
    public int f7716k;

    /* renamed from: l */
    public C9375Z8[] f7717l;

    /* renamed from: m */
    public String f7718m;

    public C9400a9() {
        m5851a();
    }

    /* renamed from: b */
    public static C9400a9[] m5850b() {
        if (f7705n == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7705n == null) {
                        f7705n = new C9400a9[0];
                    }
                } finally {
                }
            }
        }
        return f7705n;
    }

    /* renamed from: a */
    public final C9400a9 m5851a() {
        this.f7706a = "";
        this.f7707b = "";
        this.f7708c = "";
        this.f7709d = 0;
        this.f7710e = "";
        this.f7711f = "";
        this.f7712g = false;
        this.f7713h = 0;
        this.f7714i = "";
        this.f7715j = "";
        this.f7716k = 0;
        this.f7717l = C9375Z8.m5804b();
        this.f7718m = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f7706a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7706a);
        }
        if (!this.f7707b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7707b);
        }
        if (!this.f7708c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f7708c);
        }
        int i = this.f7709d;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(5, i);
        }
        if (!this.f7710e.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(10, this.f7710e);
        }
        if (!this.f7711f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(15, this.f7711f);
        }
        boolean z = this.f7712g;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(17, z);
        }
        int i2 = this.f7713h;
        if (i2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(18, i2);
        }
        if (!this.f7714i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f7714i);
        }
        if (!this.f7715j.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(21, this.f7715j);
        }
        int i3 = this.f7716k;
        if (i3 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(22, i3);
        }
        C9375Z8[] c9375z8Arr = this.f7717l;
        if (c9375z8Arr != null && c9375z8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C9375Z8[] c9375z8Arr2 = this.f7717l;
                if (i4 >= c9375z8Arr2.length) {
                    break;
                }
                C9375Z8 c9375z8 = c9375z8Arr2[i4];
                if (c9375z8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(23, c9375z8) + iComputeSerializedSize;
                }
                i4++;
            }
        }
        return !this.f7718m.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(24, this.f7718m) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f7706a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7706a);
        }
        if (!this.f7707b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7707b);
        }
        if (!this.f7708c.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7708c);
        }
        int i = this.f7709d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i);
        }
        if (!this.f7710e.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f7710e);
        }
        if (!this.f7711f.equals("")) {
            codedOutputByteBufferNano.writeString(15, this.f7711f);
        }
        boolean z = this.f7712g;
        if (z) {
            codedOutputByteBufferNano.writeBool(17, z);
        }
        int i2 = this.f7713h;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(18, i2);
        }
        if (!this.f7714i.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f7714i);
        }
        if (!this.f7715j.equals("")) {
            codedOutputByteBufferNano.writeString(21, this.f7715j);
        }
        int i3 = this.f7716k;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(22, i3);
        }
        C9375Z8[] c9375z8Arr = this.f7717l;
        if (c9375z8Arr != null && c9375z8Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C9375Z8[] c9375z8Arr2 = this.f7717l;
                if (i4 >= c9375z8Arr2.length) {
                    break;
                }
                C9375Z8 c9375z8 = c9375z8Arr2[i4];
                if (c9375z8 != null) {
                    codedOutputByteBufferNano.writeMessage(23, c9375z8);
                }
                i4++;
            }
        }
        if (!this.f7718m.equals("")) {
            codedOutputByteBufferNano.writeString(24, this.f7718m);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9400a9 m5849b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9400a9().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9400a9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f7706a = codedInputByteBufferNano.readString();
                    break;
                case 18:
                    this.f7707b = codedInputByteBufferNano.readString();
                    break;
                case 34:
                    this.f7708c = codedInputByteBufferNano.readString();
                    break;
                case 40:
                    this.f7709d = codedInputByteBufferNano.readUInt32();
                    break;
                case 82:
                    this.f7710e = codedInputByteBufferNano.readString();
                    break;
                case 122:
                    this.f7711f = codedInputByteBufferNano.readString();
                    break;
                case 136:
                    this.f7712g = codedInputByteBufferNano.readBool();
                    break;
                case Cea708Decoder.COMMAND_SPA /* 144 */:
                    this.f7713h = codedInputByteBufferNano.readUInt32();
                    break;
                case Cea708Decoder.COMMAND_DF2 /* 154 */:
                    this.f7714i = codedInputByteBufferNano.readString();
                    break;
                case 170:
                    this.f7715j = codedInputByteBufferNano.readString();
                    break;
                case 176:
                    this.f7716k = codedInputByteBufferNano.readUInt32();
                    break;
                case MatroskaExtractor.ID_PIXEL_HEIGHT /* 186 */:
                    int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, MatroskaExtractor.ID_PIXEL_HEIGHT);
                    C9375Z8[] c9375z8Arr = this.f7717l;
                    int length = c9375z8Arr == null ? 0 : c9375z8Arr.length;
                    int i = repeatedFieldArrayLength + length;
                    C9375Z8[] c9375z8Arr2 = new C9375Z8[i];
                    if (length != 0) {
                        System.arraycopy(c9375z8Arr, 0, c9375z8Arr2, 0, length);
                    }
                    while (length < i - 1) {
                        C9375Z8 c9375z8 = new C9375Z8();
                        c9375z8Arr2[length] = c9375z8;
                        codedInputByteBufferNano.readMessage(c9375z8);
                        codedInputByteBufferNano.readTag();
                        length++;
                    }
                    C9375Z8 c9375z82 = new C9375Z8();
                    c9375z8Arr2[length] = c9375z82;
                    codedInputByteBufferNano.readMessage(c9375z82);
                    this.f7717l = c9375z8Arr2;
                    break;
                case 194:
                    this.f7718m = codedInputByteBufferNano.readString();
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
    public static C9400a9 m5848a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9400a9) MessageNano.mergeFrom(new C9400a9(), bArr);
    }
}
