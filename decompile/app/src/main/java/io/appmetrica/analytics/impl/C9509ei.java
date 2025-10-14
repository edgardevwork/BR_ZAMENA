package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ei */
/* loaded from: classes8.dex */
public final class C9509ei extends MessageNano {

    /* renamed from: l */
    public static final int f8013l = 0;

    /* renamed from: m */
    public static final int f8014m = 1;

    /* renamed from: n */
    public static final int f8015n = 2;

    /* renamed from: o */
    public static final int f8016o = 1;

    /* renamed from: p */
    public static final int f8017p = 2;

    /* renamed from: q */
    public static volatile C9509ei[] f8018q;

    /* renamed from: a */
    public int f8019a;

    /* renamed from: b */
    public byte[] f8020b;

    /* renamed from: c */
    public byte[] f8021c;

    /* renamed from: d */
    public byte[] f8022d;

    /* renamed from: e */
    public C9384Zh f8023e;

    /* renamed from: f */
    public long f8024f;

    /* renamed from: g */
    public boolean f8025g;

    /* renamed from: h */
    public int f8026h;

    /* renamed from: i */
    public int f8027i;

    /* renamed from: j */
    public C9484di f8028j;

    /* renamed from: k */
    public C9459ci f8029k;

    public C9509ei() {
        m6066a();
    }

    /* renamed from: b */
    public static C9509ei[] m6065b() {
        if (f8018q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8018q == null) {
                        f8018q = new C9509ei[0];
                    }
                } finally {
                }
            }
        }
        return f8018q;
    }

    /* renamed from: a */
    public final C9509ei m6066a() {
        this.f8019a = 1;
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8020b = bArr;
        this.f8021c = bArr;
        this.f8022d = bArr;
        this.f8023e = null;
        this.f8024f = 0L;
        this.f8025g = false;
        this.f8026h = 0;
        this.f8027i = 1;
        this.f8028j = null;
        this.f8029k = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f8019a;
        if (i != 1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int iComputeBytesSize = CodedOutputByteBufferNano.computeBytesSize(3, this.f8020b) + iComputeSerializedSize;
        byte[] bArr = this.f8021c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(4, this.f8021c);
        }
        if (!Arrays.equals(this.f8022d, bArr2)) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBytesSize(5, this.f8022d);
        }
        C9384Zh c9384Zh = this.f8023e;
        if (c9384Zh != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(6, c9384Zh);
        }
        long j = this.f8024f;
        if (j != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt64Size(7, j);
        }
        boolean z = this.f8025g;
        if (z) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeBoolSize(8, z);
        }
        int i2 = this.f8026h;
        if (i2 != 0) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(9, i2);
        }
        int i3 = this.f8027i;
        if (i3 != 1) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeInt32Size(10, i3);
        }
        C9484di c9484di = this.f8028j;
        if (c9484di != null) {
            iComputeBytesSize += CodedOutputByteBufferNano.computeMessageSize(11, c9484di);
        }
        C9459ci c9459ci = this.f8029k;
        return c9459ci != null ? iComputeBytesSize + CodedOutputByteBufferNano.computeMessageSize(12, c9459ci) : iComputeBytesSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f8019a;
        if (i != 1) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        codedOutputByteBufferNano.writeBytes(3, this.f8020b);
        byte[] bArr = this.f8021c;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(4, this.f8021c);
        }
        if (!Arrays.equals(this.f8022d, bArr2)) {
            codedOutputByteBufferNano.writeBytes(5, this.f8022d);
        }
        C9384Zh c9384Zh = this.f8023e;
        if (c9384Zh != null) {
            codedOutputByteBufferNano.writeMessage(6, c9384Zh);
        }
        long j = this.f8024f;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(7, j);
        }
        boolean z = this.f8025g;
        if (z) {
            codedOutputByteBufferNano.writeBool(8, z);
        }
        int i2 = this.f8026h;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(9, i2);
        }
        int i3 = this.f8027i;
        if (i3 != 1) {
            codedOutputByteBufferNano.writeInt32(10, i3);
        }
        C9484di c9484di = this.f8028j;
        if (c9484di != null) {
            codedOutputByteBufferNano.writeMessage(11, c9484di);
        }
        C9459ci c9459ci = this.f8029k;
        if (c9459ci != null) {
            codedOutputByteBufferNano.writeMessage(12, c9459ci);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9509ei m6064b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9509ei().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9509ei mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            switch (tag) {
                case 0:
                    return this;
                case 8:
                    this.f8019a = codedInputByteBufferNano.readUInt32();
                    break;
                case 26:
                    this.f8020b = codedInputByteBufferNano.readBytes();
                    break;
                case 34:
                    this.f8021c = codedInputByteBufferNano.readBytes();
                    break;
                case 42:
                    this.f8022d = codedInputByteBufferNano.readBytes();
                    break;
                case 50:
                    if (this.f8023e == null) {
                        this.f8023e = new C9384Zh();
                    }
                    codedInputByteBufferNano.readMessage(this.f8023e);
                    break;
                case 56:
                    this.f8024f = codedInputByteBufferNano.readInt64();
                    break;
                case 64:
                    this.f8025g = codedInputByteBufferNano.readBool();
                    break;
                case 72:
                    int int32 = codedInputByteBufferNano.readInt32();
                    if (int32 != 0 && int32 != 1 && int32 != 2) {
                        break;
                    } else {
                        this.f8026h = int32;
                        break;
                    }
                    break;
                case 80:
                    int int322 = codedInputByteBufferNano.readInt32();
                    if (int322 != 1 && int322 != 2) {
                        break;
                    } else {
                        this.f8027i = int322;
                        break;
                    }
                    break;
                case 90:
                    if (this.f8028j == null) {
                        this.f8028j = new C9484di();
                    }
                    codedInputByteBufferNano.readMessage(this.f8028j);
                    break;
                case 98:
                    if (this.f8029k == null) {
                        this.f8029k = new C9459ci();
                    }
                    codedInputByteBufferNano.readMessage(this.f8029k);
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
    public static C9509ei m6063a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9509ei) MessageNano.mergeFrom(new C9509ei(), bArr);
    }
}
