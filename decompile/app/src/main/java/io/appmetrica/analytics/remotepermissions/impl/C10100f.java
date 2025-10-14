package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.remotepermissions.impl.f */
/* loaded from: classes7.dex */
public final class C10100f extends MessageNano {

    /* renamed from: b */
    public static volatile C10100f[] f9662b;

    /* renamed from: a */
    public byte[][] f9663a;

    public C10100f() {
        m7072a();
    }

    /* renamed from: b */
    public static C10100f[] m7071b() {
        if (f9662b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9662b == null) {
                        f9662b = new C10100f[0];
                    }
                } finally {
                }
            }
        }
        return f9662b;
    }

    /* renamed from: a */
    public final C10100f m7072a() {
        this.f9663a = WireFormatNano.EMPTY_BYTES_ARRAY;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[][] bArr = this.f9663a;
        if (bArr == null || bArr.length <= 0) {
            return iComputeSerializedSize;
        }
        int i = 0;
        int iComputeBytesSizeNoTag = 0;
        int i2 = 0;
        while (true) {
            byte[][] bArr2 = this.f9663a;
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
        byte[][] bArr = this.f9663a;
        if (bArr != null && bArr.length > 0) {
            int i = 0;
            while (true) {
                byte[][] bArr2 = this.f9663a;
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
    public final C10100f mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                byte[][] bArr = this.f9663a;
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
                this.f9663a = bArr2;
            }
        }
    }

    /* renamed from: b */
    public static C10100f m7070b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C10100f().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C10100f m7069a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C10100f) MessageNano.mergeFrom(new C10100f(), bArr);
    }
}
