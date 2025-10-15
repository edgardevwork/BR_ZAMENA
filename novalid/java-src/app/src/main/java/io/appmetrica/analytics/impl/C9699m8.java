package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m8 */
/* loaded from: classes6.dex */
public final class C9699m8 extends MessageNano {

    /* renamed from: h */
    public static volatile C9699m8[] f8636h;

    /* renamed from: a */
    public byte[] f8637a;

    /* renamed from: b */
    public byte[] f8638b;

    /* renamed from: c */
    public C9499e8 f8639c;

    /* renamed from: d */
    public C9649k8 f8640d;

    /* renamed from: e */
    public C9674l8 f8641e;

    /* renamed from: f */
    public C9674l8 f8642f;

    /* renamed from: g */
    public C9724n8[] f8643g;

    public C9699m8() {
        m6478a();
    }

    /* renamed from: b */
    public static C9699m8[] m6477b() {
        if (f8636h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8636h == null) {
                        f8636h = new C9699m8[0];
                    }
                } finally {
                }
            }
        }
        return f8636h;
    }

    /* renamed from: a */
    public final C9699m8 m6478a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8637a = bArr;
        this.f8638b = bArr;
        this.f8639c = null;
        this.f8640d = null;
        this.f8641e = null;
        this.f8642f = null;
        this.f8643g = C9724n8.m6501b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8637a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8637a);
        }
        if (!Arrays.equals(this.f8638b, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(2, this.f8638b);
        }
        C9499e8 c9499e8 = this.f8639c;
        if (c9499e8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c9499e8);
        }
        C9649k8 c9649k8 = this.f8640d;
        if (c9649k8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c9649k8);
        }
        C9674l8 c9674l8 = this.f8641e;
        if (c9674l8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c9674l8);
        }
        C9674l8 c9674l82 = this.f8642f;
        if (c9674l82 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(6, c9674l82);
        }
        C9724n8[] c9724n8Arr = this.f8643g;
        if (c9724n8Arr != null && c9724n8Arr.length > 0) {
            int i = 0;
            while (true) {
                C9724n8[] c9724n8Arr2 = this.f8643g;
                if (i >= c9724n8Arr2.length) {
                    break;
                }
                C9724n8 c9724n8 = c9724n8Arr2[i];
                if (c9724n8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c9724n8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8637a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8637a);
        }
        if (!Arrays.equals(this.f8638b, bArr2)) {
            codedOutputByteBufferNano.writeBytes(2, this.f8638b);
        }
        C9499e8 c9499e8 = this.f8639c;
        if (c9499e8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c9499e8);
        }
        C9649k8 c9649k8 = this.f8640d;
        if (c9649k8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c9649k8);
        }
        C9674l8 c9674l8 = this.f8641e;
        if (c9674l8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c9674l8);
        }
        C9674l8 c9674l82 = this.f8642f;
        if (c9674l82 != null) {
            codedOutputByteBufferNano.writeMessage(6, c9674l82);
        }
        C9724n8[] c9724n8Arr = this.f8643g;
        if (c9724n8Arr != null && c9724n8Arr.length > 0) {
            int i = 0;
            while (true) {
                C9724n8[] c9724n8Arr2 = this.f8643g;
                if (i >= c9724n8Arr2.length) {
                    break;
                }
                C9724n8 c9724n8 = c9724n8Arr2[i];
                if (c9724n8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c9724n8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9699m8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8637a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                this.f8638b = codedInputByteBufferNano.readBytes();
            } else if (tag == 26) {
                if (this.f8639c == null) {
                    this.f8639c = new C9499e8();
                }
                codedInputByteBufferNano.readMessage(this.f8639c);
            } else if (tag == 34) {
                if (this.f8640d == null) {
                    this.f8640d = new C9649k8();
                }
                codedInputByteBufferNano.readMessage(this.f8640d);
            } else if (tag == 42) {
                if (this.f8641e == null) {
                    this.f8641e = new C9674l8();
                }
                codedInputByteBufferNano.readMessage(this.f8641e);
            } else if (tag == 50) {
                if (this.f8642f == null) {
                    this.f8642f = new C9674l8();
                }
                codedInputByteBufferNano.readMessage(this.f8642f);
            } else if (tag != 58) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C9724n8[] c9724n8Arr = this.f8643g;
                int length = c9724n8Arr == null ? 0 : c9724n8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9724n8[] c9724n8Arr2 = new C9724n8[i];
                if (length != 0) {
                    System.arraycopy(c9724n8Arr, 0, c9724n8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9724n8 c9724n8 = new C9724n8();
                    c9724n8Arr2[length] = c9724n8;
                    codedInputByteBufferNano.readMessage(c9724n8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9724n8 c9724n82 = new C9724n8();
                c9724n8Arr2[length] = c9724n82;
                codedInputByteBufferNano.readMessage(c9724n82);
                this.f8643g = c9724n8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C9699m8 m6476b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9699m8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9699m8 m6475a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9699m8) MessageNano.mergeFrom(new C9699m8(), bArr);
    }
}
