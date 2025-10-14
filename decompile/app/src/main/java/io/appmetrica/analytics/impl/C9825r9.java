package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.r9 */
/* loaded from: classes6.dex */
public final class C9825r9 extends MessageNano {

    /* renamed from: e */
    public static volatile C9825r9[] f8988e;

    /* renamed from: a */
    public boolean f8989a;

    /* renamed from: b */
    public int f8990b;

    /* renamed from: c */
    public int f8991c;

    /* renamed from: d */
    public int[] f8992d;

    public C9825r9() {
        m6751a();
    }

    /* renamed from: b */
    public static C9825r9[] m6750b() {
        if (f8988e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8988e == null) {
                        f8988e = new C9825r9[0];
                    }
                } finally {
                }
            }
        }
        return f8988e;
    }

    /* renamed from: a */
    public final C9825r9 m6751a() {
        this.f8989a = false;
        this.f8990b = 0;
        this.f8991c = 0;
        this.f8992d = WireFormatNano.EMPTY_INT_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt32Size = CodedOutputByteBufferNano.computeUInt32Size(3, this.f8991c) + CodedOutputByteBufferNano.computeUInt32Size(2, this.f8990b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f8989a) + super.computeSerializedSize();
        int[] iArr = this.f8992d;
        if (iArr == null || iArr.length <= 0) {
            return iComputeUInt32Size;
        }
        int i = 0;
        int iComputeInt32SizeNoTag = 0;
        while (true) {
            int[] iArr2 = this.f8992d;
            if (i >= iArr2.length) {
                return iComputeUInt32Size + iComputeInt32SizeNoTag + iArr2.length;
            }
            iComputeInt32SizeNoTag += CodedOutputByteBufferNano.computeInt32SizeNoTag(iArr2[i]);
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f8989a);
        codedOutputByteBufferNano.writeUInt32(2, this.f8990b);
        codedOutputByteBufferNano.writeUInt32(3, this.f8991c);
        int[] iArr = this.f8992d;
        if (iArr != null && iArr.length > 0) {
            int i = 0;
            while (true) {
                int[] iArr2 = this.f8992d;
                if (i >= iArr2.length) {
                    break;
                }
                codedOutputByteBufferNano.writeInt32(4, iArr2[i]);
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9825r9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f8989a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f8990b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 24) {
                this.f8991c = codedInputByteBufferNano.readUInt32();
            } else if (tag == 32) {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 32);
                int[] iArr = this.f8992d;
                int length = iArr == null ? 0 : iArr.length;
                int i = repeatedFieldArrayLength + length;
                int[] iArr2 = new int[i];
                if (length != 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                }
                while (length < i - 1) {
                    iArr2[length] = codedInputByteBufferNano.readInt32();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                iArr2[length] = codedInputByteBufferNano.readInt32();
                this.f8992d = iArr2;
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int iPushLimit = codedInputByteBufferNano.pushLimit(codedInputByteBufferNano.readRawVarint32());
                int position = codedInputByteBufferNano.getPosition();
                int i2 = 0;
                while (codedInputByteBufferNano.getBytesUntilLimit() > 0) {
                    codedInputByteBufferNano.readInt32();
                    i2++;
                }
                codedInputByteBufferNano.rewindToPosition(position);
                int[] iArr3 = this.f8992d;
                int length2 = iArr3 == null ? 0 : iArr3.length;
                int i3 = i2 + length2;
                int[] iArr4 = new int[i3];
                if (length2 != 0) {
                    System.arraycopy(iArr3, 0, iArr4, 0, length2);
                }
                while (length2 < i3) {
                    iArr4[length2] = codedInputByteBufferNano.readInt32();
                    length2++;
                }
                this.f8992d = iArr4;
                codedInputByteBufferNano.popLimit(iPushLimit);
            }
        }
    }

    /* renamed from: b */
    public static C9825r9 m6749b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9825r9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9825r9 m6748a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9825r9) MessageNano.mergeFrom(new C9825r9(), bArr);
    }
}
