package io.appmetrica.analytics.impl;

import androidx.media3.extractor.text.cea.Cea708Decoder;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.o7 */
/* loaded from: classes6.dex */
public final class C9748o7 extends MessageNano {

    /* renamed from: s */
    public static volatile C9748o7[] f8805s;

    /* renamed from: a */
    public int f8806a;

    /* renamed from: b */
    public String f8807b;

    /* renamed from: c */
    public String f8808c;

    /* renamed from: d */
    public long f8809d;

    /* renamed from: e */
    public C9773p7 f8810e;

    /* renamed from: f */
    public String f8811f;

    /* renamed from: g */
    public String f8812g;

    /* renamed from: h */
    public long f8813h;

    /* renamed from: i */
    public int f8814i;

    /* renamed from: j */
    public int f8815j;

    /* renamed from: k */
    public String f8816k;

    /* renamed from: l */
    public int f8817l;

    /* renamed from: m */
    public String f8818m;

    /* renamed from: n */
    public int f8819n;

    /* renamed from: o */
    public int f8820o;

    /* renamed from: p */
    public int f8821p;

    /* renamed from: q */
    public int f8822q;

    /* renamed from: r */
    public byte[] f8823r;

    public C9748o7() {
        m6581a();
    }

    /* renamed from: b */
    public static C9748o7[] m6580b() {
        if (f8805s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8805s == null) {
                        f8805s = new C9748o7[0];
                    }
                } finally {
                }
            }
        }
        return f8805s;
    }

    /* renamed from: a */
    public final C9748o7 m6581a() {
        this.f8806a = -1;
        this.f8807b = "";
        this.f8808c = "";
        this.f8809d = -1L;
        this.f8810e = null;
        this.f8811f = "";
        this.f8812g = "";
        this.f8813h = -1L;
        this.f8814i = -1;
        this.f8815j = -1;
        this.f8816k = "";
        this.f8817l = -1;
        this.f8818m = "";
        this.f8819n = -1;
        this.f8820o = -1;
        this.f8821p = -1;
        this.f8822q = -1;
        this.f8823r = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f8806a;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (!this.f8807b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f8807b);
        }
        if (!this.f8808c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f8808c);
        }
        long j = this.f8809d;
        if (j != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(4, j);
        }
        C9773p7 c9773p7 = this.f8810e;
        if (c9773p7 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c9773p7);
        }
        if (!this.f8811f.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(6, this.f8811f);
        }
        if (!this.f8812g.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(7, this.f8812g);
        }
        long j2 = this.f8813h;
        if (j2 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j2);
        }
        int i2 = this.f8814i;
        if (i2 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(9, i2);
        }
        int i3 = this.f8815j;
        if (i3 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        if (!this.f8816k.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(11, this.f8816k);
        }
        int i4 = this.f8817l;
        if (i4 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(12, i4);
        }
        if (!this.f8818m.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(13, this.f8818m);
        }
        int i5 = this.f8819n;
        if (i5 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(14, i5);
        }
        int i6 = this.f8820o;
        if (i6 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(15, i6);
        }
        int i7 = this.f8821p;
        if (i7 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(16, i7);
        }
        int i8 = this.f8822q;
        if (i8 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(17, i8);
        }
        return !Arrays.equals(this.f8823r, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(18, this.f8823r) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f8806a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (!this.f8807b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f8807b);
        }
        if (!this.f8808c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f8808c);
        }
        long j = this.f8809d;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(4, j);
        }
        C9773p7 c9773p7 = this.f8810e;
        if (c9773p7 != null) {
            codedOutputByteBufferNano.writeMessage(5, c9773p7);
        }
        if (!this.f8811f.equals("")) {
            codedOutputByteBufferNano.writeString(6, this.f8811f);
        }
        if (!this.f8812g.equals("")) {
            codedOutputByteBufferNano.writeString(7, this.f8812g);
        }
        long j2 = this.f8813h;
        if (j2 != -1) {
            codedOutputByteBufferNano.writeInt64(8, j2);
        }
        int i2 = this.f8814i;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(9, i2);
        }
        int i3 = this.f8815j;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(10, i3);
        }
        if (!this.f8816k.equals("")) {
            codedOutputByteBufferNano.writeString(11, this.f8816k);
        }
        int i4 = this.f8817l;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(12, i4);
        }
        if (!this.f8818m.equals("")) {
            codedOutputByteBufferNano.writeString(13, this.f8818m);
        }
        int i5 = this.f8819n;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(14, i5);
        }
        int i6 = this.f8820o;
        if (i6 != -1) {
            codedOutputByteBufferNano.writeInt32(15, i6);
        }
        int i7 = this.f8821p;
        if (i7 != -1) {
            codedOutputByteBufferNano.writeInt32(16, i7);
        }
        int i8 = this.f8822q;
        if (i8 != -1) {
            codedOutputByteBufferNano.writeInt32(17, i8);
        }
        if (!Arrays.equals(this.f8823r, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(18, this.f8823r);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9748o7 m6579b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9748o7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9748o7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f8806a = codedInputByteBufferNano.readInt32();
                    break;
                case 18:
                    this.f8807b = codedInputByteBufferNano.readString();
                    break;
                case 26:
                    this.f8808c = codedInputByteBufferNano.readString();
                    break;
                case 32:
                    this.f8809d = codedInputByteBufferNano.readInt64();
                    break;
                case 42:
                    if (this.f8810e == null) {
                        this.f8810e = new C9773p7();
                    }
                    codedInputByteBufferNano.readMessage(this.f8810e);
                    break;
                case 50:
                    this.f8811f = codedInputByteBufferNano.readString();
                    break;
                case 58:
                    this.f8812g = codedInputByteBufferNano.readString();
                    break;
                case 64:
                    this.f8813h = codedInputByteBufferNano.readInt64();
                    break;
                case 72:
                    this.f8814i = codedInputByteBufferNano.readInt32();
                    break;
                case 80:
                    this.f8815j = codedInputByteBufferNano.readInt32();
                    break;
                case 90:
                    this.f8816k = codedInputByteBufferNano.readString();
                    break;
                case 96:
                    this.f8817l = codedInputByteBufferNano.readInt32();
                    break;
                case 106:
                    this.f8818m = codedInputByteBufferNano.readString();
                    break;
                case 112:
                    this.f8819n = codedInputByteBufferNano.readInt32();
                    break;
                case 120:
                    this.f8820o = codedInputByteBufferNano.readInt32();
                    break;
                case 128:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f8821p = int32;
                        break;
                    }
                    break;
                case 136:
                    this.f8822q = codedInputByteBufferNano.readInt32();
                    break;
                case Cea708Decoder.COMMAND_SPL /* 146 */:
                    this.f8823r = codedInputByteBufferNano.readBytes();
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
    public static C9748o7 m6578a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9748o7) MessageNano.mergeFrom(new C9748o7(), bArr);
    }
}
