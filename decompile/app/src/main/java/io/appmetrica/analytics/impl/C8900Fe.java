package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Fe */
/* loaded from: classes7.dex */
public final class C8900Fe extends MessageNano {

    /* renamed from: c */
    public static final int f6588c = 0;

    /* renamed from: d */
    public static final int f6589d = 1;

    /* renamed from: e */
    public static final int f6590e = 2;

    /* renamed from: f */
    public static final int f6591f = 3;

    /* renamed from: g */
    public static volatile C8900Fe[] f6592g;

    /* renamed from: a */
    public C8850De f6593a;

    /* renamed from: b */
    public C8875Ee[] f6594b;

    public C8900Fe() {
        m5144a();
    }

    /* renamed from: b */
    public static C8900Fe[] m5143b() {
        if (f6592g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6592g == null) {
                        f6592g = new C8900Fe[0];
                    }
                } finally {
                }
            }
        }
        return f6592g;
    }

    /* renamed from: a */
    public final C8900Fe m5144a() {
        this.f6593a = null;
        this.f6594b = C8875Ee.m5117b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C8850De c8850De = this.f6593a;
        if (c8850De != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c8850De);
        }
        C8875Ee[] c8875EeArr = this.f6594b;
        if (c8875EeArr != null && c8875EeArr.length > 0) {
            int i = 0;
            while (true) {
                C8875Ee[] c8875EeArr2 = this.f6594b;
                if (i >= c8875EeArr2.length) {
                    break;
                }
                C8875Ee c8875Ee = c8875EeArr2[i];
                if (c8875Ee != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c8875Ee) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C8850De c8850De = this.f6593a;
        if (c8850De != null) {
            codedOutputByteBufferNano.writeMessage(1, c8850De);
        }
        C8875Ee[] c8875EeArr = this.f6594b;
        if (c8875EeArr != null && c8875EeArr.length > 0) {
            int i = 0;
            while (true) {
                C8875Ee[] c8875EeArr2 = this.f6594b;
                if (i >= c8875EeArr2.length) {
                    break;
                }
                C8875Ee c8875Ee = c8875EeArr2[i];
                if (c8875Ee != null) {
                    codedOutputByteBufferNano.writeMessage(2, c8875Ee);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8900Fe mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f6593a == null) {
                    this.f6593a = new C8850De();
                }
                codedInputByteBufferNano.readMessage(this.f6593a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C8875Ee[] c8875EeArr = this.f6594b;
                int length = c8875EeArr == null ? 0 : c8875EeArr.length;
                int i = repeatedFieldArrayLength + length;
                C8875Ee[] c8875EeArr2 = new C8875Ee[i];
                if (length != 0) {
                    System.arraycopy(c8875EeArr, 0, c8875EeArr2, 0, length);
                }
                while (length < i - 1) {
                    C8875Ee c8875Ee = new C8875Ee();
                    c8875EeArr2[length] = c8875Ee;
                    codedInputByteBufferNano.readMessage(c8875Ee);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C8875Ee c8875Ee2 = new C8875Ee();
                c8875EeArr2[length] = c8875Ee2;
                codedInputByteBufferNano.readMessage(c8875Ee2);
                this.f6594b = c8875EeArr2;
            }
        }
    }

    /* renamed from: b */
    public static C8900Fe m5142b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8900Fe().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C8900Fe m5141a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8900Fe) MessageNano.mergeFrom(new C8900Fe(), bArr);
    }
}
