package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.ul */
/* loaded from: classes5.dex */
public final class C9912ul extends MessageNano {

    /* renamed from: c */
    public static volatile C9912ul[] f9196c;

    /* renamed from: a */
    public String f9197a;

    /* renamed from: b */
    public String[] f9198b;

    public C9912ul() {
        m6866a();
    }

    /* renamed from: b */
    public static C9912ul[] m6865b() {
        if (f9196c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9196c == null) {
                        f9196c = new C9912ul[0];
                    }
                } finally {
                }
            }
        }
        return f9196c;
    }

    /* renamed from: a */
    public final C9912ul m6866a() {
        this.f9197a = "";
        this.f9198b = WireFormatNano.EMPTY_STRING_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f9197a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9197a);
        }
        String[] strArr = this.f9198b;
        if (strArr == null || strArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeStringSizeNoTag = 0;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.f9198b;
            if (i >= strArr2.length) {
                return iComputeSerializedSize + iComputeStringSizeNoTag + i2;
            }
            String str = strArr2[i];
            if (str != null) {
                i2++;
                iComputeStringSizeNoTag = CodedOutputByteBufferNano.computeStringSizeNoTag(str) + iComputeStringSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f9197a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9197a);
        }
        String[] strArr = this.f9198b;
        if (strArr != null && strArr.length > 0) {
            int i = 0;
            while (true) {
                String[] strArr2 = this.f9198b;
                if (i >= strArr2.length) {
                    break;
                }
                String str = strArr2[i];
                if (str != null) {
                    codedOutputByteBufferNano.writeString(2, str);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9912ul mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f9197a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                String[] strArr = this.f9198b;
                int length = strArr == null ? 0 : strArr.length;
                int i = repeatedFieldArrayLength + length;
                String[] strArr2 = new String[i];
                if (length != 0) {
                    System.arraycopy(strArr, 0, strArr2, 0, length);
                }
                while (length < i - 1) {
                    strArr2[length] = codedInputByteBufferNano.readString();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                strArr2[length] = codedInputByteBufferNano.readString();
                this.f9198b = strArr2;
            }
        }
    }

    /* renamed from: b */
    public static C9912ul m6864b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9912ul().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9912ul m6863a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9912ul) MessageNano.mergeFrom(new C9912ul(), bArr);
    }
}
