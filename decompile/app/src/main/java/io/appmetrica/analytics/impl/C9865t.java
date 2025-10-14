package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.t */
/* loaded from: classes6.dex */
public final class C9865t extends MessageNano {

    /* renamed from: l */
    public static final int f9057l = 0;

    /* renamed from: m */
    public static final int f9058m = 1;

    /* renamed from: n */
    public static final int f9059n = 2;

    /* renamed from: o */
    public static final int f9060o = 3;

    /* renamed from: p */
    public static final int f9061p = 4;

    /* renamed from: q */
    public static final int f9062q = 5;

    /* renamed from: r */
    public static final int f9063r = 6;

    /* renamed from: s */
    public static volatile C9865t[] f9064s;

    /* renamed from: t */
    public static byte[] f9065t;

    /* renamed from: u */
    public static volatile boolean f9066u;

    /* renamed from: a */
    public byte[] f9067a;

    /* renamed from: b */
    public C9840s f9068b;

    /* renamed from: c */
    public byte[] f9069c;

    /* renamed from: d */
    public int f9070d;

    /* renamed from: e */
    public byte[] f9071e;

    /* renamed from: f */
    public byte[] f9072f;

    /* renamed from: g */
    public byte[] f9073g;

    /* renamed from: h */
    public byte[] f9074h;

    /* renamed from: i */
    public byte[] f9075i;

    /* renamed from: j */
    public byte[] f9076j;

    /* renamed from: k */
    public byte[] f9077k;

    public C9865t() {
        if (!f9066u) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (!f9066u) {
                        f9065t = InternalNano.bytesDefaultValue("manual");
                        f9066u = true;
                    }
                } finally {
                }
            }
        }
        m6813a();
    }

    /* renamed from: b */
    public static C9865t[] m6812b() {
        if (f9064s == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9064s == null) {
                        f9064s = new C9865t[0];
                    }
                } finally {
                }
            }
        }
        return f9064s;
    }

    /* renamed from: a */
    public final C9865t m6813a() {
        this.f9067a = (byte[]) f9065t.clone();
        this.f9068b = null;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f9069c = bArr;
        this.f9070d = 0;
        this.f9071e = bArr;
        this.f9072f = bArr;
        this.f9073g = bArr;
        this.f9074h = bArr;
        this.f9075i = bArr;
        this.f9076j = bArr;
        this.f9077k = bArr;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f9067a, f9065t)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f9067a);
        }
        C9840s c9840s = this.f9068b;
        if (c9840s != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9840s);
        }
        byte[] bArr = this.f9069c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f9069c);
        }
        int i = this.f9070d;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(4, i);
        }
        if (!Arrays.equals(this.f9071e, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f9071e);
        }
        if (!Arrays.equals(this.f9072f, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(6, this.f9072f);
        }
        if (!Arrays.equals(this.f9073g, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(7, this.f9073g);
        }
        if (!Arrays.equals(this.f9074h, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(8, this.f9074h);
        }
        if (!Arrays.equals(this.f9075i, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(9, this.f9075i);
        }
        if (!Arrays.equals(this.f9076j, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(10, this.f9076j);
        }
        return !Arrays.equals(this.f9077k, bArr2) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(11, this.f9077k) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f9067a, f9065t)) {
            codedOutputByteBufferNano.writeBytes(1, this.f9067a);
        }
        C9840s c9840s = this.f9068b;
        if (c9840s != null) {
            codedOutputByteBufferNano.writeMessage(2, c9840s);
        }
        byte[] bArr = this.f9069c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f9069c);
        }
        int i = this.f9070d;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(4, i);
        }
        if (!Arrays.equals(this.f9071e, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f9071e);
        }
        if (!Arrays.equals(this.f9072f, bArr2)) {
            codedOutputByteBufferNano.writeBytes(6, this.f9072f);
        }
        if (!Arrays.equals(this.f9073g, bArr2)) {
            codedOutputByteBufferNano.writeBytes(7, this.f9073g);
        }
        if (!Arrays.equals(this.f9074h, bArr2)) {
            codedOutputByteBufferNano.writeBytes(8, this.f9074h);
        }
        if (!Arrays.equals(this.f9075i, bArr2)) {
            codedOutputByteBufferNano.writeBytes(9, this.f9075i);
        }
        if (!Arrays.equals(this.f9076j, bArr2)) {
            codedOutputByteBufferNano.writeBytes(10, this.f9076j);
        }
        if (!Arrays.equals(this.f9077k, bArr2)) {
            codedOutputByteBufferNano.writeBytes(11, this.f9077k);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9865t m6811b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9865t().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9865t mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 10:
                    this.f9067a = codedInputByteBufferNano.readBytes();
                    break;
                case 18:
                    if (this.f9068b == null) {
                        this.f9068b = new C9840s();
                    }
                    codedInputByteBufferNano.readMessage(this.f9068b);
                    break;
                case 26:
                    this.f9069c = codedInputByteBufferNano.readBytes();
                    break;
                case 32:
                    int int32 = codedInputByteBufferNano.readInt32();
                    switch (int32) {
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            this.f9070d = int32;
                            break;
                    }
                case 42:
                    this.f9071e = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    this.f9072f = codedInputByteBufferNano.readBytes();
                    break;
                case 58:
                    this.f9073g = codedInputByteBufferNano.readBytes();
                    break;
                case 66:
                    this.f9074h = codedInputByteBufferNano.readBytes();
                    break;
                case 74:
                    this.f9075i = codedInputByteBufferNano.readBytes();
                    break;
                case 82:
                    this.f9076j = codedInputByteBufferNano.readBytes();
                    break;
                case 90:
                    this.f9077k = codedInputByteBufferNano.readBytes();
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
    public static C9865t m6810a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9865t) MessageNano.mergeFrom(new C9865t(), bArr);
    }
}
