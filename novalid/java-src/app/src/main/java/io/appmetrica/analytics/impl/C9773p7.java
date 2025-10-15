package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.p7 */
/* loaded from: classes6.dex */
public final class C9773p7 extends MessageNano {

    /* renamed from: k */
    public static volatile C9773p7[] f8874k;

    /* renamed from: a */
    public int f8875a;

    /* renamed from: b */
    public double f8876b;

    /* renamed from: c */
    public double f8877c;

    /* renamed from: d */
    public int f8878d;

    /* renamed from: e */
    public int f8879e;

    /* renamed from: f */
    public int f8880f;

    /* renamed from: g */
    public int f8881g;

    /* renamed from: h */
    public long f8882h;

    /* renamed from: i */
    public String f8883i;

    /* renamed from: j */
    public String f8884j;

    public C9773p7() {
        m6625a();
    }

    /* renamed from: b */
    public static C9773p7[] m6624b() {
        if (f8874k == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8874k == null) {
                        f8874k = new C9773p7[0];
                    }
                } finally {
                }
            }
        }
        return f8874k;
    }

    /* renamed from: a */
    public final C9773p7 m6625a() {
        this.f8875a = -1;
        this.f8876b = -1.0d;
        this.f8877c = -1.0d;
        this.f8878d = -1;
        this.f8879e = -1;
        this.f8880f = -1;
        this.f8881g = -1;
        this.f8882h = -1L;
        this.f8883i = "";
        this.f8884j = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f8875a;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        if (Double.doubleToLongBits(this.f8876b) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f8876b);
        }
        if (Double.doubleToLongBits(this.f8877c) != Double.doubleToLongBits(-1.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f8877c);
        }
        int i2 = this.f8878d;
        if (i2 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i2);
        }
        int i3 = this.f8879e;
        if (i3 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(5, i3);
        }
        int i4 = this.f8880f;
        if (i4 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(6, i4);
        }
        int i5 = this.f8881g;
        if (i5 != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(7, i5);
        }
        long j = this.f8882h;
        if (j != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(8, j);
        }
        if (!this.f8883i.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(9, this.f8883i);
        }
        return !this.f8884j.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(10, this.f8884j) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f8875a;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        if (Double.doubleToLongBits(this.f8876b) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f8876b);
        }
        if (Double.doubleToLongBits(this.f8877c) != Double.doubleToLongBits(-1.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f8877c);
        }
        int i2 = this.f8878d;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeInt32(4, i2);
        }
        int i3 = this.f8879e;
        if (i3 != -1) {
            codedOutputByteBufferNano.writeInt32(5, i3);
        }
        int i4 = this.f8880f;
        if (i4 != -1) {
            codedOutputByteBufferNano.writeInt32(6, i4);
        }
        int i5 = this.f8881g;
        if (i5 != -1) {
            codedOutputByteBufferNano.writeInt32(7, i5);
        }
        long j = this.f8882h;
        if (j != -1) {
            codedOutputByteBufferNano.writeInt64(8, j);
        }
        if (!this.f8883i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f8883i);
        }
        if (!this.f8884j.equals("")) {
            codedOutputByteBufferNano.writeString(10, this.f8884j);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9773p7 m6623b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9773p7().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9773p7 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != -1 && int32 != 0 && int32 != 1) {
                        break;
                    } else {
                        this.f8875a = int32;
                        break;
                    }
                    break;
                case 17:
                    this.f8876b = codedInputByteBufferNano.readDouble();
                    break;
                case 25:
                    this.f8877c = codedInputByteBufferNano.readDouble();
                    break;
                case 32:
                    this.f8878d = codedInputByteBufferNano.readInt32();
                    break;
                case 40:
                    this.f8879e = codedInputByteBufferNano.readInt32();
                    break;
                case 48:
                    this.f8880f = codedInputByteBufferNano.readInt32();
                    break;
                case 56:
                    this.f8881g = codedInputByteBufferNano.readInt32();
                    break;
                case 64:
                    this.f8882h = codedInputByteBufferNano.readInt64();
                    break;
                case 74:
                    this.f8883i = codedInputByteBufferNano.readString();
                    break;
                case 82:
                    this.f8884j = codedInputByteBufferNano.readString();
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
    public static C9773p7 m6622a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9773p7) MessageNano.mergeFrom(new C9773p7(), bArr);
    }
}
