package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.P3 */
/* loaded from: classes6.dex */
public final class C9131P3 extends MessageNano {

    /* renamed from: c */
    public static final int f7074c = 0;

    /* renamed from: d */
    public static final int f7075d = 1;

    /* renamed from: e */
    public static final int f7076e = 2;

    /* renamed from: f */
    public static final int f7077f = 3;

    /* renamed from: g */
    public static volatile C9131P3[] f7078g;

    /* renamed from: a */
    public C9059M3 f7079a;

    /* renamed from: b */
    public C9059M3[] f7080b;

    public C9131P3() {
        m5475a();
    }

    /* renamed from: b */
    public static C9131P3[] m5474b() {
        if (f7078g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7078g == null) {
                        f7078g = new C9131P3[0];
                    }
                } finally {
                }
            }
        }
        return f7078g;
    }

    /* renamed from: a */
    public final C9131P3 m5475a() {
        this.f7079a = null;
        this.f7080b = C9059M3.m5372b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9059M3 c9059m3 = this.f7079a;
        if (c9059m3 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9059m3);
        }
        C9059M3[] c9059m3Arr = this.f7080b;
        if (c9059m3Arr != null && c9059m3Arr.length > 0) {
            int i = 0;
            while (true) {
                C9059M3[] c9059m3Arr2 = this.f7080b;
                if (i >= c9059m3Arr2.length) {
                    break;
                }
                C9059M3 c9059m32 = c9059m3Arr2[i];
                if (c9059m32 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c9059m32) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9059M3 c9059m3 = this.f7079a;
        if (c9059m3 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9059m3);
        }
        C9059M3[] c9059m3Arr = this.f7080b;
        if (c9059m3Arr != null && c9059m3Arr.length > 0) {
            int i = 0;
            while (true) {
                C9059M3[] c9059m3Arr2 = this.f7080b;
                if (i >= c9059m3Arr2.length) {
                    break;
                }
                C9059M3 c9059m32 = c9059m3Arr2[i];
                if (c9059m32 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c9059m32);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9131P3 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f7079a == null) {
                    this.f7079a = new C9059M3();
                }
                codedInputByteBufferNano.readMessage(this.f7079a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C9059M3[] c9059m3Arr = this.f7080b;
                int length = c9059m3Arr == null ? 0 : c9059m3Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9059M3[] c9059m3Arr2 = new C9059M3[i];
                if (length != 0) {
                    System.arraycopy(c9059m3Arr, 0, c9059m3Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9059M3 c9059m3 = new C9059M3();
                    c9059m3Arr2[length] = c9059m3;
                    codedInputByteBufferNano.readMessage(c9059m3);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9059M3 c9059m32 = new C9059M3();
                c9059m3Arr2[length] = c9059m32;
                codedInputByteBufferNano.readMessage(c9059m32);
                this.f7080b = c9059m3Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C9131P3 m5473b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9131P3().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9131P3 m5472a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9131P3) MessageNano.mergeFrom(new C9131P3(), bArr);
    }
}
