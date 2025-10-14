package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.en */
/* loaded from: classes8.dex */
public final class C9514en extends MessageNano {

    /* renamed from: e */
    public static final int f8031e = 0;

    /* renamed from: f */
    public static final int f8032f = 1;

    /* renamed from: g */
    public static final int f8033g = 2;

    /* renamed from: h */
    public static final int f8034h = 3;

    /* renamed from: i */
    public static volatile C9514en[] f8035i;

    /* renamed from: a */
    public byte[] f8036a;

    /* renamed from: b */
    public int f8037b;

    /* renamed from: c */
    public C9539fn f8038c;

    /* renamed from: d */
    public C9564gn f8039d;

    public C9514en() {
        m6073a();
    }

    /* renamed from: b */
    public static C9514en[] m6072b() {
        if (f8035i == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8035i == null) {
                        f8035i = new C9514en[0];
                    }
                } finally {
                }
            }
        }
        return f8035i;
    }

    /* renamed from: a */
    public final C9514en m6073a() {
        this.f8036a = WireFormatNano.EMPTY_BYTES;
        this.f8037b = 0;
        this.f8038c = null;
        this.f8039d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeInt32Size = CodedOutputByteBufferNano.computeInt32Size(2, this.f8037b) + CodedOutputByteBufferNano.computeBytesSize(1, this.f8036a) + super.computeSerializedSize();
        C9539fn c9539fn = this.f8038c;
        if (c9539fn != null) {
            iComputeInt32Size += CodedOutputByteBufferNano.computeMessageSize(3, c9539fn);
        }
        C9564gn c9564gn = this.f8039d;
        return c9564gn != null ? iComputeInt32Size + CodedOutputByteBufferNano.computeMessageSize(4, c9564gn) : iComputeInt32Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBytes(1, this.f8036a);
        codedOutputByteBufferNano.writeInt32(2, this.f8037b);
        C9539fn c9539fn = this.f8038c;
        if (c9539fn != null) {
            codedOutputByteBufferNano.writeMessage(3, c9539fn);
        }
        C9564gn c9564gn = this.f8039d;
        if (c9564gn != null) {
            codedOutputByteBufferNano.writeMessage(4, c9564gn);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9514en mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8036a = codedInputByteBufferNano.readBytes();
            } else if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f8037b = int32;
                }
            } else if (tag == 26) {
                if (this.f8038c == null) {
                    this.f8038c = new C9539fn();
                }
                codedInputByteBufferNano.readMessage(this.f8038c);
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f8039d == null) {
                    this.f8039d = new C9564gn();
                }
                codedInputByteBufferNano.readMessage(this.f8039d);
            }
        }
    }

    /* renamed from: b */
    public static C9514en m6071b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9514en().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9514en m6070a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9514en) MessageNano.mergeFrom(new C9514en(), bArr);
    }
}
