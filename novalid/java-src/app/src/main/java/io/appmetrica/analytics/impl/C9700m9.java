package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.m9 */
/* loaded from: classes6.dex */
public final class C9700m9 extends MessageNano {

    /* renamed from: b */
    public static volatile C9700m9[] f8644b;

    /* renamed from: a */
    public byte[] f8645a;

    public C9700m9() {
        m6483a();
    }

    /* renamed from: b */
    public static C9700m9[] m6482b() {
        if (f8644b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8644b == null) {
                        f8644b = new C9700m9[0];
                    }
                } finally {
                }
            }
        }
        return f8644b;
    }

    /* renamed from: a */
    public final C9700m9 m6483a() {
        this.f8645a = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        return !Arrays.equals(this.f8645a, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(1, this.f8645a) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f8645a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8645a);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9700m9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                this.f8645a = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9700m9 m6481b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9700m9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9700m9 m6480a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9700m9) MessageNano.mergeFrom(new C9700m9(), bArr);
    }
}
