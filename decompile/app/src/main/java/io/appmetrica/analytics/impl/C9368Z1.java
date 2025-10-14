package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Z1 */
/* loaded from: classes5.dex */
public final class C9368Z1 extends MessageNano {

    /* renamed from: d */
    public static volatile C9368Z1[] f7611d;

    /* renamed from: a */
    public C9344Y1[] f7612a;

    /* renamed from: b */
    public C9320X1 f7613b;

    /* renamed from: c */
    public String[] f7614c;

    public C9368Z1() {
        m5792a();
    }

    /* renamed from: b */
    public static C9368Z1[] m5791b() {
        if (f7611d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7611d == null) {
                        f7611d = new C9368Z1[0];
                    }
                } finally {
                }
            }
        }
        return f7611d;
    }

    /* renamed from: a */
    public final C9368Z1 m5792a() {
        this.f7612a = C9344Y1.m5765b();
        this.f7613b = null;
        this.f7614c = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9344Y1[] c9344y1Arr = this.f7612a;
        int i = 0;
        if (c9344y1Arr != null && c9344y1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C9344Y1[] c9344y1Arr2 = this.f7612a;
                if (i2 >= c9344y1Arr2.length) {
                    break;
                }
                C9344Y1 c9344y1 = c9344y1Arr2[i2];
                if (c9344y1 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c9344y1) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        C9320X1 c9320x1 = this.f7613b;
        if (c9320x1 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9320x1);
        }
        String[] strArr = this.f7614c;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i3 = 0;
        while (true) {
            String[] strArr2 = this.f7614c;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i3;
            }
            String str = strArr2[i];
            if (str != null) {
                i3++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9344Y1[] c9344y1Arr = this.f7612a;
        int i = 0;
        if (c9344y1Arr != null && c9344y1Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C9344Y1[] c9344y1Arr2 = this.f7612a;
                if (i2 >= c9344y1Arr2.length) {
                    break;
                }
                C9344Y1 c9344y1 = c9344y1Arr2[i2];
                if (c9344y1 != null) {
                    codedOutputByteBufferNano.writeMessage(1, c9344y1);
                }
                i2++;
            }
        }
        C9320X1 c9320x1 = this.f7613b;
        if (c9320x1 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9320x1);
        }
        String[] strArr = this.f7614c;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f7614c;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(3, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9368Z1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C9344Y1[] c9344y1Arr = this.f7612a;
                int length = c9344y1Arr == null ? 0 : c9344y1Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9344Y1[] c9344y1Arr2 = new C9344Y1[i];
                if (length != 0) {
                    System.arraycopy(c9344y1Arr, 0, c9344y1Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9344Y1 c9344y1 = new C9344Y1();
                    c9344y1Arr2[length] = c9344y1;
                    codedInputByteBufferNano.readMessage(c9344y1);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9344Y1 c9344y12 = new C9344Y1();
                c9344y1Arr2[length] = c9344y12;
                codedInputByteBufferNano.readMessage(c9344y12);
                this.f7612a = c9344y1Arr2;
            } else if (tag == 18) {
                if (this.f7613b == null) {
                    this.f7613b = new C9320X1();
                }
                codedInputByteBufferNano.readMessage(this.f7613b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                String[] strArr = this.f7614c;
                int length2 = strArr == null ? 0 : strArr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                String[] strArr2 = new String[i2];
                if (length2 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    strArr2[length2] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                strArr2[length2] = codedInputByteBufferNano.readString();
                this.f7614c = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C9368Z1 m5790b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9368Z1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9368Z1 m5789a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9368Z1) MessageNano.mergeFrom(new C9368Z1(), bArr);
    }
}
