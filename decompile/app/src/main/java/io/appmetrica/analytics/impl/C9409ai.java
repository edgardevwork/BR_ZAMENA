package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.ai */
/* loaded from: classes5.dex */
public final class C9409ai extends MessageNano {

    /* renamed from: e */
    public static volatile C9409ai[] f7726e;

    /* renamed from: a */
    public long f7727a;

    /* renamed from: b */
    public C9434bi f7728b;

    /* renamed from: c */
    public int f7729c;

    /* renamed from: d */
    public byte[] f7730d;

    public C9409ai() {
        m5860a();
    }

    /* renamed from: b */
    public static C9409ai[] m5859b() {
        if (f7726e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7726e == null) {
                        f7726e = new C9409ai[0];
                    }
                } finally {
                }
            }
        }
        return f7726e;
    }

    /* renamed from: a */
    public final C9409ai m5860a() {
        this.f7727a = 0L;
        this.f7728b = null;
        this.f7729c = 0;
        this.f7730d = WireFormatNano.EMPTY_BYTES;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        long j = this.f7727a;
        if (j != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt64Size(1, j);
        }
        C9434bi c9434bi = this.f7728b;
        if (c9434bi != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9434bi);
        }
        int i = this.f7729c;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(3, i);
        }
        return !Arrays.equals(this.f7730d, WireFormatNano.EMPTY_BYTES) ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBytesSize(4, this.f7730d) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        long j = this.f7727a;
        if (j != 0) {
            codedOutputByteBufferNano.writeInt64(1, j);
        }
        C9434bi c9434bi = this.f7728b;
        if (c9434bi != null) {
            codedOutputByteBufferNano.writeMessage(2, c9434bi);
        }
        int i = this.f7729c;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(3, i);
        }
        if (!Arrays.equals(this.f7730d, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(4, this.f7730d);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9409ai mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f7727a = codedInputByteBufferNano.readInt64();
            } else if (tag == 18) {
                if (this.f7728b == null) {
                    this.f7728b = new C9434bi();
                }
                codedInputByteBufferNano.readMessage(this.f7728b);
            } else if (tag == 24) {
                this.f7729c = codedInputByteBufferNano.readUInt32();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7730d = codedInputByteBufferNano.readBytes();
            }
        }
    }

    /* renamed from: b */
    public static C9409ai m5858b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9409ai().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9409ai m5857a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9409ai) MessageNano.mergeFrom(new C9409ai(), bArr);
    }
}
