package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.vb */
/* loaded from: classes5.dex */
public final class C9927vb extends MessageNano {

    /* renamed from: f */
    public static volatile C9927vb[] f9221f;

    /* renamed from: a */
    public String f9222a;

    /* renamed from: b */
    public String f9223b;

    /* renamed from: c */
    public boolean f9224c;

    /* renamed from: d */
    public String f9225d;

    /* renamed from: e */
    public String f9226e;

    public C9927vb() {
        m6893a();
    }

    /* renamed from: b */
    public static C9927vb[] m6892b() {
        if (f9221f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9221f == null) {
                        f9221f = new C9927vb[0];
                    }
                } finally {
                }
            }
        }
        return f9221f;
    }

    /* renamed from: a */
    public final C9927vb m6893a() {
        this.f9222a = "";
        this.f9223b = "";
        this.f9224c = false;
        this.f9225d = "";
        this.f9226e = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f9222a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f9222a);
        }
        if (!this.f9223b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(19, this.f9223b);
        }
        boolean z = this.f9224c;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(22, z);
        }
        if (!this.f9225d.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(25, this.f9225d);
        }
        return !this.f9226e.equals("") ? iComputeSerializedSize + CodedOutputByteBufferNano.computeStringSize(26, this.f9226e) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f9222a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f9222a);
        }
        if (!this.f9223b.equals("")) {
            codedOutputByteBufferNano.writeString(19, this.f9223b);
        }
        boolean z = this.f9224c;
        if (z) {
            codedOutputByteBufferNano.writeBool(22, z);
        }
        if (!this.f9225d.equals("")) {
            codedOutputByteBufferNano.writeString(25, this.f9225d);
        }
        if (!this.f9226e.equals("")) {
            codedOutputByteBufferNano.writeString(26, this.f9226e);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9927vb mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f9222a = codedInputByteBufferNano.readString();
            } else if (tag == 154) {
                this.f9223b = codedInputByteBufferNano.readString();
            } else if (tag == 176) {
                this.f9224c = codedInputByteBufferNano.readBool();
            } else if (tag == 202) {
                this.f9225d = codedInputByteBufferNano.readString();
            } else if (tag != 210) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f9226e = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: b */
    public static C9927vb m6891b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9927vb().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9927vb m6890a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9927vb) MessageNano.mergeFrom(new C9927vb(), bArr);
    }
}
