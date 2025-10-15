package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.e6 */
/* loaded from: classes8.dex */
public final class C9497e6 extends MessageNano {

    /* renamed from: g */
    public static volatile C9497e6[] f7986g;

    /* renamed from: a */
    public String f7987a;

    /* renamed from: b */
    public String f7988b;

    /* renamed from: c */
    public int f7989c;

    /* renamed from: d */
    public String f7990d;

    /* renamed from: e */
    public boolean f7991e;

    /* renamed from: f */
    public int f7992f;

    public C9497e6() {
        m6041a();
    }

    /* renamed from: b */
    public static C9497e6[] m6040b() {
        if (f7986g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7986g == null) {
                        f7986g = new C9497e6[0];
                    }
                } finally {
                }
            }
        }
        return f7986g;
    }

    /* renamed from: a */
    public final C9497e6 m6041a() {
        this.f7987a = "";
        this.f7988b = "";
        this.f7989c = -1;
        this.f7990d = "";
        this.f7991e = false;
        this.f7992f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f7987a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f7987a);
        }
        if (!this.f7988b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f7988b);
        }
        int i = this.f7989c;
        if (i != -1) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeSInt32Size(3, i);
        }
        if (!this.f7990d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(4, this.f7990d);
        }
        boolean z = this.f7991e;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i2 = this.f7992f;
        return i2 != -1 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeSInt32Size(6, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f7987a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f7987a);
        }
        if (!this.f7988b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f7988b);
        }
        int i = this.f7989c;
        if (i != -1) {
            codedOutputByteBufferNano.writeSInt32(3, i);
        }
        if (!this.f7990d.equals("")) {
            codedOutputByteBufferNano.writeString(4, this.f7990d);
        }
        boolean z = this.f7991e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i2 = this.f7992f;
        if (i2 != -1) {
            codedOutputByteBufferNano.writeSInt32(6, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9497e6 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f7987a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f7988b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f7989c = codedInputByteBufferNano.readSInt32();
            } else if (tag == 34) {
                this.f7990d = codedInputByteBufferNano.readString();
            } else if (tag == 40) {
                this.f7991e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7992f = codedInputByteBufferNano.readSInt32();
            }
        }
    }

    /* renamed from: b */
    public static C9497e6 m6039b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9497e6().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9497e6 m6038a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9497e6) MessageNano.mergeFrom(new C9497e6(), bArr);
    }
}
