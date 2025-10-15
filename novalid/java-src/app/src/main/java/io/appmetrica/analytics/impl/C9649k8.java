package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.k8 */
/* loaded from: classes6.dex */
public final class C9649k8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9649k8[] f8504c;

    /* renamed from: a */
    public C9624j8[] f8505a;

    /* renamed from: b */
    public int f8506b;

    public C9649k8() {
        m6330a();
    }

    /* renamed from: b */
    public static C9649k8[] m6329b() {
        if (f8504c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8504c == null) {
                        f8504c = new C9649k8[0];
                    }
                } finally {
                }
            }
        }
        return f8504c;
    }

    /* renamed from: a */
    public final C9649k8 m6330a() {
        this.f8505a = C9624j8.m6305b();
        this.f8506b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9624j8[] c9624j8Arr = this.f8505a;
        if (c9624j8Arr != null && c9624j8Arr.length > 0) {
            int i = 0;
            while (true) {
                C9624j8[] c9624j8Arr2 = this.f8505a;
                if (i >= c9624j8Arr2.length) {
                    break;
                }
                C9624j8 c9624j8 = c9624j8Arr2[i];
                if (c9624j8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c9624j8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        int i2 = this.f8506b;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeUInt32Size(2, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9624j8[] c9624j8Arr = this.f8505a;
        if (c9624j8Arr != null && c9624j8Arr.length > 0) {
            int i = 0;
            while (true) {
                C9624j8[] c9624j8Arr2 = this.f8505a;
                if (i >= c9624j8Arr2.length) {
                    break;
                }
                C9624j8 c9624j8 = c9624j8Arr2[i];
                if (c9624j8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c9624j8);
                }
                i++;
            }
        }
        int i2 = this.f8506b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9649k8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C9624j8[] c9624j8Arr = this.f8505a;
                int length = c9624j8Arr == null ? 0 : c9624j8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9624j8[] c9624j8Arr2 = new C9624j8[i];
                if (length != 0) {
                    System.arraycopy(c9624j8Arr, 0, c9624j8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9624j8 c9624j8 = new C9624j8();
                    c9624j8Arr2[length] = c9624j8;
                    codedInputByteBufferNano.readMessage(c9624j8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9624j8 c9624j82 = new C9624j8();
                c9624j8Arr2[length] = c9624j82;
                codedInputByteBufferNano.readMessage(c9624j82);
                this.f8505a = c9624j8Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8506b = codedInputByteBufferNano.readUInt32();
            }
        }
    }

    /* renamed from: b */
    public static C9649k8 m6328b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9649k8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9649k8 m6327a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9649k8) MessageNano.mergeFrom(new C9649k8(), bArr);
    }
}
