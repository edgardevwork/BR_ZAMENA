package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e8 */
/* loaded from: classes8.dex */
public final class C9499e8 extends MessageNano {

    /* renamed from: b */
    public static volatile C9499e8[] f7994b;

    /* renamed from: a */
    public byte[][] f7995a;

    public C9499e8() {
        m6048a();
    }

    /* renamed from: b */
    public static C9499e8[] m6047b() {
        if (f7994b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7994b == null) {
                        f7994b = new C9499e8[0];
                    }
                } finally {
                }
            }
        }
        return f7994b;
    }

    /* renamed from: a */
    public final C9499e8 m6048a() {
        this.f7995a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f7995a;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeBytesSizeNoTag = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.f7995a;
            if (i >= bArr2.length) {
                return iComputeSerializedSize + iComputeBytesSizeNoTag + i2;
            }
            byte[] bArr3 = bArr2[i];
            if (bArr3 != null) {
                i2++;
                iComputeBytesSizeNoTag = CodedOutputByteBufferNano.computeBytesSizeNoTag(bArr3) + iComputeBytesSizeNoTag;
            }
            i++;
        }
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[][] bArr = this.f7995a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f7995a;
                if (i >= bArr2.length) {
                    break;
                }
                byte[] bArr3 = bArr2[i];
                if (bArr3 != null) {
                    codedOutputByteBufferNano.writeBytes(1, bArr3);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9499e8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                byte[][] bArr = this.f7995a;
                int length = bArr == null ? 0 : bArr.length;
                int i = repeatedFieldArrayLength + length;
                byte[][] bArr2 = new byte[i][];
                if (length != 0) {
                    System.arraycopy(bArr, 0, bArr2, 0, length);
                }
                while (length < i - 1) {
                    bArr2[length] = codedInputByteBufferNano.readBytes();
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                bArr2[length] = codedInputByteBufferNano.readBytes();
                this.f7995a = bArr2;
            }
        }
    }

    /* renamed from: b */
    public static C9499e8 m6046b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9499e8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9499e8 m6045a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9499e8) MessageNano.mergeFrom(new C9499e8(), bArr);
    }
}
