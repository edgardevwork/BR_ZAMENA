package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.I8 */
/* loaded from: classes6.dex */
public final class C8968I8 extends MessageNano {

    /* renamed from: b */
    public static volatile C8968I8[] f6774b;

    /* renamed from: a */
    public C8944H8[] f6775a;

    public C8968I8() {
        m5263a();
    }

    /* renamed from: b */
    public static C8968I8[] m5262b() {
        if (f6774b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6774b == null) {
                        f6774b = new C8968I8[0];
                    }
                } finally {
                }
            }
        }
        return f6774b;
    }

    /* renamed from: a */
    public final C8968I8 m5263a() {
        this.f6775a = C8944H8.m5239b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C8944H8[] c8944h8Arr = this.f6775a;
        if (c8944h8Arr != null && c8944h8Arr.length > 0) {
            int i = 0;
            while (true) {
                C8944H8[] c8944h8Arr2 = this.f6775a;
                if (i >= c8944h8Arr2.length) {
                    break;
                }
                C8944H8 c8944h8 = c8944h8Arr2[i];
                if (c8944h8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c8944h8) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C8944H8[] c8944h8Arr = this.f6775a;
        if (c8944h8Arr != null && c8944h8Arr.length > 0) {
            int i = 0;
            while (true) {
                C8944H8[] c8944h8Arr2 = this.f6775a;
                if (i >= c8944h8Arr2.length) {
                    break;
                }
                C8944H8 c8944h8 = c8944h8Arr2[i];
                if (c8944h8 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c8944h8);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8968I8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C8944H8[] c8944h8Arr = this.f6775a;
                int length = c8944h8Arr == null ? 0 : c8944h8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C8944H8[] c8944h8Arr2 = new C8944H8[i];
                if (length != 0) {
                    System.arraycopy(c8944h8Arr, 0, c8944h8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C8944H8 c8944h8 = new C8944H8();
                    c8944h8Arr2[length] = c8944h8;
                    codedInputByteBufferNano.readMessage(c8944h8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C8944H8 c8944h82 = new C8944H8();
                c8944h8Arr2[length] = c8944h82;
                codedInputByteBufferNano.readMessage(c8944h82);
                this.f6775a = c8944h8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C8968I8 m5261b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8968I8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C8968I8 m5260a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8968I8) MessageNano.mergeFrom(new C8968I8(), bArr);
    }
}
