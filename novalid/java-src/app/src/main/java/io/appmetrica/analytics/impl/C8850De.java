package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.De */
/* loaded from: classes7.dex */
public final class C8850De extends MessageNano {

    /* renamed from: f */
    public static volatile C8850De[] f6463f;

    /* renamed from: a */
    public String f6464a;

    /* renamed from: b */
    public String f6465b;

    /* renamed from: c */
    public boolean f6466c;

    /* renamed from: d */
    public boolean f6467d;

    /* renamed from: e */
    public int f6468e;

    public C8850De() {
        m5066a();
    }

    /* renamed from: b */
    public static C8850De[] m5065b() {
        if (f6463f == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6463f == null) {
                        f6463f = new C8850De[0];
                    }
                } finally {
                }
            }
        }
        return f6463f;
    }

    /* renamed from: a */
    public final C8850De m5066a() {
        this.f6464a = "";
        this.f6465b = "";
        this.f6466c = false;
        this.f6467d = false;
        this.f6468e = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f6464a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6464a);
        }
        if (!this.f6465b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6465b);
        }
        boolean z = this.f6466c;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(3, z);
        }
        boolean z2 = this.f6467d;
        if (z2) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(4, z2);
        }
        return CodedOutputByteBufferNano.computeInt32Size(5, this.f6468e) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6464a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6464a);
        }
        if (!this.f6465b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6465b);
        }
        boolean z = this.f6466c;
        if (z) {
            codedOutputByteBufferNano.writeBool(3, z);
        }
        boolean z2 = this.f6467d;
        if (z2) {
            codedOutputByteBufferNano.writeBool(4, z2);
        }
        codedOutputByteBufferNano.writeInt32(5, this.f6468e);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8850De mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f6464a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f6465b = codedInputByteBufferNano.readString();
            } else if (tag == 24) {
                this.f6466c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f6467d = codedInputByteBufferNano.readBool();
            } else if (tag != 40) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f6468e = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C8850De m5064b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8850De().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C8850De m5063a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8850De) MessageNano.mergeFrom(new C8850De(), bArr);
    }
}
