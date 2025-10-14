package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.g8 */
/* loaded from: classes8.dex */
public final class C9549g8 extends MessageNano {

    /* renamed from: f */
    public static volatile C9549g8[] f8178f;

    /* renamed from: a */
    public byte[] f8179a;

    /* renamed from: b */
    public byte[] f8180b;

    /* renamed from: c */
    public C9649k8 f8181c;

    /* renamed from: d */
    public C9574h8[] f8182d;

    /* renamed from: e */
    public int f8183e;

    public C9549g8() {
        m6170a();
    }

    /* renamed from: b */
    public static C9549g8[] m6169b() {
        if (f8178f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8178f == null) {
                        f8178f = new C9549g8[0];
                    }
                } finally {
                }
            }
        }
        return f8178f;
    }

    /* renamed from: a */
    public final C9549g8 m6170a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8179a = bArr;
        this.f8180b = bArr;
        this.f8181c = null;
        this.f8182d = C9574h8.m6235b();
        this.f8183e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8179a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8179a);
        }
        if (!Arrays.equals(this.f8180b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8180b);
        }
        C9649k8 c9649k8 = this.f8181c;
        if (c9649k8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c9649k8);
        }
        C9574h8[] c9574h8Arr = this.f8182d;
        if (c9574h8Arr != null && c9574h8Arr.length > 0) {
            int i = 0;
            while (true) {
                C9574h8[] c9574h8Arr2 = this.f8182d;
                if (i >= c9574h8Arr2.length) {
                    break;
                }
                C9574h8 c9574h8 = c9574h8Arr2[i];
                if (c9574h8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(4, c9574h8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.f8183e;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(5, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8179a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8179a);
        }
        if (!Arrays.equals(this.f8180b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8180b);
        }
        C9649k8 c9649k8 = this.f8181c;
        if (c9649k8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c9649k8);
        }
        C9574h8[] c9574h8Arr = this.f8182d;
        if (c9574h8Arr != null && c9574h8Arr.length > 0) {
            int i = 0;
            while (true) {
                C9574h8[] c9574h8Arr2 = this.f8182d;
                if (i >= c9574h8Arr2.length) {
                    break;
                }
                C9574h8 c9574h8 = c9574h8Arr2[i];
                if (c9574h8 != null) {
                    codedOutputByteBufferNano.writeMessage(4, c9574h8);
                }
                i++;
            }
        }
        int i2 = this.f8183e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9549g8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8179a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f8180b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f8181c == null) {
                    this.f8181c = new C9649k8();
                }
                codedInputByteBufferNano.readMessage(this.f8181c);
            } else if (tag == 34) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 34);
                C9574h8[] c9574h8Arr = this.f8182d;
                int length = c9574h8Arr == null ? 0 : c9574h8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9574h8[] c9574h8Arr2 = new C9574h8[i];
                if (length != 0) {
                    System.arraycopy(c9574h8Arr, 0, c9574h8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9574h8 c9574h8 = new C9574h8();
                    c9574h8Arr2[length] = c9574h8;
                    codedInputByteBufferNano.readMessage(c9574h8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9574h8 c9574h82 = new C9574h8();
                c9574h8Arr2[length] = c9574h82;
                codedInputByteBufferNano.readMessage(c9574h82);
                this.f8182d = c9574h8Arr2;
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8183e = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: b */
    public static C9549g8 m6168b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9549g8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9549g8 m6167a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9549g8) MessageNano.mergeFrom(new C9549g8(), bArr);
    }
}
