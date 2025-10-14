package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.xl */
/* loaded from: classes5.dex */
public final class C9987xl extends MessageNano {

    /* renamed from: c */
    public static volatile C9987xl[] f9327c;

    /* renamed from: a */
    public String f9328a;

    /* renamed from: b */
    public byte[] f9329b;

    public C9987xl() {
        m6976a();
    }

    /* renamed from: b */
    public static C9987xl[] m6975b() {
        if (f9327c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9327c == null) {
                        f9327c = new C9987xl[0];
                    }
                } finally {
                }
            }
        }
        return f9327c;
    }

    /* renamed from: a */
    public final C9987xl m6976a() {
        this.f9328a = "";
        this.f9329b = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f9328a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9328a);
        }
        return !Arrays.equals(this.f9329b, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(2, this.f9329b) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f9328a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9328a);
        }
        if (!Arrays.equals(this.f9329b, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(2, this.f9329b);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9987xl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f9328a = codedInputByteBufferNano.readString();
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9329b = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9987xl m6974b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9987xl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9987xl m6973a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9987xl) MessageNano.mergeFrom(new C9987xl(), bArr);
    }
}
