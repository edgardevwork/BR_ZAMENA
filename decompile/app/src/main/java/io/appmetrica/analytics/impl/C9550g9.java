package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.g9 */
/* loaded from: classes8.dex */
public final class C9550g9 extends MessageNano {

    /* renamed from: e */
    public static volatile C9550g9[] f8184e;

    /* renamed from: a */
    public int f8185a;

    /* renamed from: b */
    public int f8186b;

    /* renamed from: c */
    public String f8187c;

    /* renamed from: d */
    public boolean f8188d;

    public C9550g9() {
        m6175a();
    }

    /* renamed from: b */
    public static C9550g9[] m6174b() {
        if (f8184e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8184e == null) {
                        f8184e = new C9550g9[0];
                    }
                } finally {
                }
            }
        }
        return f8184e;
    }

    /* renamed from: a */
    public final C9550g9 m6175a() {
        this.f8185a = 0;
        this.f8186b = 0;
        this.f8187c = "";
        this.f8188d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f8185a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.f8186b;
        if (i2 != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(2, i2);
        }
        if (!this.f8187c.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(3, this.f8187c);
        }
        boolean z = this.f8188d;
        return z ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f8185a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.f8186b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(2, i2);
        }
        if (!this.f8187c.equals("")) {
            codedOutputByteBufferNano.writeString(3, this.f8187c);
        }
        boolean z = this.f8188d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9550g9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f8185a = codedInputByteBufferNano.readUInt32();
            } else if (tag == 16) {
                this.f8186b = codedInputByteBufferNano.readUInt32();
            } else if (tag == 26) {
                this.f8187c = codedInputByteBufferNano.readString();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8188d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C9550g9 m6173b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9550g9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9550g9 m6172a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9550g9) MessageNano.mergeFrom(new C9550g9(), bArr);
    }
}
