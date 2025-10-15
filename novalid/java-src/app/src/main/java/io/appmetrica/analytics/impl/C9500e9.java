package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e9 */
/* loaded from: classes8.dex */
public final class C9500e9 extends MessageNano {

    /* renamed from: d */
    public static final int f7996d = 0;

    /* renamed from: e */
    public static final int f7997e = 1;

    /* renamed from: f */
    public static final int f7998f = 2;

    /* renamed from: g */
    public static volatile C9500e9[] f7999g;

    /* renamed from: a */
    public C9575h9 f8000a;

    /* renamed from: b */
    public String f8001b;

    /* renamed from: c */
    public int f8002c;

    public C9500e9() {
        m6053a();
    }

    /* renamed from: b */
    public static C9500e9[] m6052b() {
        if (f7999g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7999g == null) {
                        f7999g = new C9500e9[0];
                    }
                } finally {
                }
            }
        }
        return f7999g;
    }

    /* renamed from: a */
    public final C9500e9 m6053a() {
        this.f8000a = null;
        this.f8001b = "";
        this.f8002c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9575h9 c9575h9 = this.f8000a;
        if (c9575h9 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9575h9);
        }
        int iComputeStringSize = CodedOutputByteBufferNano.computeStringSize(2, this.f8001b) + iComputeSerializedSize;
        int i = this.f8002c;
        return i != 0 ? iComputeStringSize + CodedOutputByteBufferNano.computeInt32Size(5, i) : iComputeStringSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9575h9 c9575h9 = this.f8000a;
        if (c9575h9 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9575h9);
        }
        codedOutputByteBufferNano.writeString(2, this.f8001b);
        int i = this.f8002c;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(5, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9500e9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f8000a == null) {
                    this.f8000a = new C9575h9();
                }
                codedInputByteBufferNano.readMessage(this.f8000a);
            } else if (tag == 18) {
                this.f8001b = codedInputByteBufferNano.readString();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f8002c = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C9500e9 m6051b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9500e9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9500e9 m6050a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9500e9) MessageNano.mergeFrom(new C9500e9(), bArr);
    }
}
