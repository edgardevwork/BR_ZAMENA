package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.v2 */
/* loaded from: classes5.dex */
public final class C9918v2 extends MessageNano {

    /* renamed from: c */
    public static final int f9204c = 1;

    /* renamed from: d */
    public static final int f9205d = 2;

    /* renamed from: e */
    public static final int f9206e = 3;

    /* renamed from: f */
    public static volatile C9918v2[] f9207f;

    /* renamed from: a */
    public C9893u2[] f9208a;

    /* renamed from: b */
    public boolean f9209b;

    public C9918v2() {
        m6878a();
    }

    /* renamed from: b */
    public static C9918v2[] m6877b() {
        if (f9207f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9207f == null) {
                        f9207f = new C9918v2[0];
                    }
                } finally {
                }
            }
        }
        return f9207f;
    }

    /* renamed from: a */
    public final C9918v2 m6878a() {
        this.f9208a = C9893u2.m6848b();
        this.f9209b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9893u2[] c9893u2Arr = this.f9208a;
        if (c9893u2Arr != null && c9893u2Arr.length > 0) {
            int i = 0;
            while (true) {
                C9893u2[] c9893u2Arr2 = this.f9208a;
                if (i >= c9893u2Arr2.length) {
                    break;
                }
                C9893u2 c9893u2 = c9893u2Arr2[i];
                if (c9893u2 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c9893u2) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return CodedOutputByteBufferNano.computeBoolSize(2, this.f9209b) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9893u2[] c9893u2Arr = this.f9208a;
        if (c9893u2Arr != null && c9893u2Arr.length > 0) {
            int i = 0;
            while (true) {
                C9893u2[] c9893u2Arr2 = this.f9208a;
                if (i >= c9893u2Arr2.length) {
                    break;
                }
                C9893u2 c9893u2 = c9893u2Arr2[i];
                if (c9893u2 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c9893u2);
                }
                i++;
            }
        }
        codedOutputByteBufferNano.writeBool(2, this.f9209b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9918v2 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C9893u2[] c9893u2Arr = this.f9208a;
                int length = c9893u2Arr == null ? 0 : c9893u2Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9893u2[] c9893u2Arr2 = new C9893u2[i];
                if (length != 0) {
                    System.arraycopy(c9893u2Arr, 0, c9893u2Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9893u2 c9893u2 = new C9893u2();
                    c9893u2Arr2[length] = c9893u2;
                    codedInputByteBufferNano.readMessage(c9893u2);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9893u2 c9893u22 = new C9893u2();
                c9893u2Arr2[length] = c9893u22;
                codedInputByteBufferNano.readMessage(c9893u22);
                this.f9208a = c9893u2Arr2;
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9209b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C9918v2 m6876b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9918v2().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9918v2 m6875a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9918v2) MessageNano.mergeFrom(new C9918v2(), bArr);
    }
}
