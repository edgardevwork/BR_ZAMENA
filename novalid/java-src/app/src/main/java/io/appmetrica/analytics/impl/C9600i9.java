package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.i9 */
/* loaded from: classes8.dex */
public final class C9600i9 extends MessageNano {

    /* renamed from: f */
    public static final int f8351f = -1;

    /* renamed from: g */
    public static final int f8352g = 0;

    /* renamed from: h */
    public static final int f8353h = 1;

    /* renamed from: i */
    public static volatile C9600i9[] f8354i;

    /* renamed from: a */
    public C9525f9[] f8355a;

    /* renamed from: b */
    public C9400a9 f8356b;

    /* renamed from: c */
    public C9327X8[] f8357c;

    /* renamed from: d */
    public C9550g9[] f8358d;

    /* renamed from: e */
    public String[] f8359e;

    public C9600i9() {
        m6286a();
    }

    /* renamed from: b */
    public static C9600i9[] m6285b() {
        if (f8354i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8354i == null) {
                        f8354i = new C9600i9[0];
                    }
                } finally {
                }
            }
        }
        return f8354i;
    }

    /* renamed from: a */
    public final C9600i9 m6286a() {
        this.f8355a = C9525f9.m6109b();
        this.f8356b = null;
        this.f8357c = C9327X8.m5739b();
        this.f8358d = C9550g9.m6174b();
        this.f8359e = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9525f9[] c9525f9Arr = this.f8355a;
        int i = 0;
        if (c9525f9Arr != null && c9525f9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C9525f9[] c9525f9Arr2 = this.f8355a;
                if (i2 >= c9525f9Arr2.length) {
                    break;
                }
                C9525f9 c9525f9 = c9525f9Arr2[i2];
                if (c9525f9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(3, c9525f9) + iComputeSerializedSize;
                }
                i2++;
            }
        }
        C9400a9 c9400a9 = this.f8356b;
        if (c9400a9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c9400a9);
        }
        C9327X8[] c9327x8Arr = this.f8357c;
        if (c9327x8Arr != null && c9327x8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C9327X8[] c9327x8Arr2 = this.f8357c;
                if (i3 >= c9327x8Arr2.length) {
                    break;
                }
                C9327X8 c9327x8 = c9327x8Arr2[i3];
                if (c9327x8 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(7, c9327x8) + iComputeSerializedSize;
                }
                i3++;
            }
        }
        C9550g9[] c9550g9Arr = this.f8358d;
        if (c9550g9Arr != null && c9550g9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C9550g9[] c9550g9Arr2 = this.f8358d;
                if (i4 >= c9550g9Arr2.length) {
                    break;
                }
                C9550g9 c9550g9 = c9550g9Arr2[i4];
                if (c9550g9 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(10, c9550g9) + iComputeSerializedSize;
                }
                i4++;
            }
        }
        String[] strArr = this.f8359e;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int iComputeStringSizeNoTag = 0;
        int i5 = 0;
        while (true) {
            String[] strArr2 = this.f8359e;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i5;
            }
            String str = strArr2[i];
            if (str != null) {
                i5++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9525f9[] c9525f9Arr = this.f8355a;
        int i = 0;
        if (c9525f9Arr != null && c9525f9Arr.length > 0) {
            int i2 = 0;
            while (true) {
                C9525f9[] c9525f9Arr2 = this.f8355a;
                if (i2 >= c9525f9Arr2.length) {
                    break;
                }
                C9525f9 c9525f9 = c9525f9Arr2[i2];
                if (c9525f9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c9525f9);
                }
                i2++;
            }
        }
        C9400a9 c9400a9 = this.f8356b;
        if (c9400a9 != null) {
            codedOutputByteBufferNano.writeMessage(4, c9400a9);
        }
        C9327X8[] c9327x8Arr = this.f8357c;
        if (c9327x8Arr != null && c9327x8Arr.length > 0) {
            int i3 = 0;
            while (true) {
                C9327X8[] c9327x8Arr2 = this.f8357c;
                if (i3 >= c9327x8Arr2.length) {
                    break;
                }
                C9327X8 c9327x8 = c9327x8Arr2[i3];
                if (c9327x8 != null) {
                    codedOutputByteBufferNano.writeMessage(7, c9327x8);
                }
                i3++;
            }
        }
        C9550g9[] c9550g9Arr = this.f8358d;
        if (c9550g9Arr != null && c9550g9Arr.length > 0) {
            int i4 = 0;
            while (true) {
                C9550g9[] c9550g9Arr2 = this.f8358d;
                if (i4 >= c9550g9Arr2.length) {
                    break;
                }
                C9550g9 c9550g9 = c9550g9Arr2[i4];
                if (c9550g9 != null) {
                    codedOutputByteBufferNano.writeMessage(10, c9550g9);
                }
                i4++;
            }
        }
        String[] strArr = this.f8359e;
        if (strArr != null && strArr.length > 0) {
            while (true) {
                String[] strArr2 = this.f8359e;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(11, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9600i9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 26) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C9525f9[] c9525f9Arr = this.f8355a;
                int length = c9525f9Arr == null ? 0 : c9525f9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9525f9[] c9525f9Arr2 = new C9525f9[i];
                if (length != 0) {
                    System.arraycopy(c9525f9Arr, 0, c9525f9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9525f9 c9525f9 = new C9525f9();
                    c9525f9Arr2[length] = c9525f9;
                    codedInputByteBufferNano.readMessage(c9525f9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9525f9 c9525f92 = new C9525f9();
                c9525f9Arr2[length] = c9525f92;
                codedInputByteBufferNano.readMessage(c9525f92);
                this.f8355a = c9525f9Arr2;
            } else if (tag == 34) {
                if (this.f8356b == null) {
                    this.f8356b = new C9400a9();
                }
                codedInputByteBufferNano.readMessage(this.f8356b);
            } else if (tag == 58) {
                int repeatedFieldArrayLength2 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 58);
                C9327X8[] c9327x8Arr = this.f8357c;
                int length2 = c9327x8Arr == null ? 0 : c9327x8Arr.length;
                int i2 = repeatedFieldArrayLength2 + length2;
                C9327X8[] c9327x8Arr2 = new C9327X8[i2];
                if (length2 != 0) {
                    System.arraycopy(c9327x8Arr, 0, c9327x8Arr2, 0, length2);
                }
                while (length2 < i2 - 1) {
                    C9327X8 c9327x8 = new C9327X8();
                    c9327x8Arr2[length2] = c9327x8;
                    codedInputByteBufferNano.readMessage(c9327x8);
                    codedInputByteBufferNano.readTag();
                    length2++;
                }
                C9327X8 c9327x82 = new C9327X8();
                c9327x8Arr2[length2] = c9327x82;
                codedInputByteBufferNano.readMessage(c9327x82);
                this.f8357c = c9327x8Arr2;
            } else if (tag == 82) {
                int repeatedFieldArrayLength3 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 82);
                C9550g9[] c9550g9Arr = this.f8358d;
                int length3 = c9550g9Arr == null ? 0 : c9550g9Arr.length;
                int i3 = repeatedFieldArrayLength3 + length3;
                C9550g9[] c9550g9Arr2 = new C9550g9[i3];
                if (length3 != 0) {
                    System.arraycopy(c9550g9Arr, 0, c9550g9Arr2, 0, length3);
                }
                while (length3 < i3 - 1) {
                    C9550g9 c9550g9 = new C9550g9();
                    c9550g9Arr2[length3] = c9550g9;
                    codedInputByteBufferNano.readMessage(c9550g9);
                    codedInputByteBufferNano.readTag();
                    length3++;
                }
                C9550g9 c9550g92 = new C9550g9();
                c9550g9Arr2[length3] = c9550g92;
                codedInputByteBufferNano.readMessage(c9550g92);
                this.f8358d = c9550g9Arr2;
            } else if (tag != 90) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength4 = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 90);
                String[] strArr = this.f8359e;
                int length4 = strArr == null ? 0 : strArr.length;
                int i4 = repeatedFieldArrayLength4 + length4;
                String[] strArr2 = new String[i4];
                if (length4 != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length4);
                }
                while (length4 < i4 - 1) {
                    strArr2[length4] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length4++;
                }
                strArr2[length4] = codedInputByteBufferNano.readString();
                this.f8359e = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C9600i9 m6284b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9600i9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9600i9 m6283a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9600i9) MessageNano.mergeFrom(new C9600i9(), bArr);
    }
}
