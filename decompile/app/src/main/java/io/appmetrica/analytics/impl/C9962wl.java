package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.wl */
/* loaded from: classes5.dex */
public final class C9962wl extends MessageNano {

    /* renamed from: g */
    public static volatile C9962wl[] f9278g;

    /* renamed from: a */
    public boolean f9279a;

    /* renamed from: b */
    public boolean f9280b;

    /* renamed from: c */
    public boolean f9281c;

    /* renamed from: d */
    public boolean f9282d;

    /* renamed from: e */
    public boolean f9283e;

    /* renamed from: f */
    public int f9284f;

    public C9962wl() {
        m6931a();
    }

    /* renamed from: b */
    public static C9962wl[] m6930b() {
        if (f9278g == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9278g == null) {
                        f9278g = new C9962wl[0];
                    }
                } finally {
                }
            }
        }
        return f9278g;
    }

    /* renamed from: a */
    public final C9962wl m6931a() {
        this.f9279a = false;
        this.f9280b = false;
        this.f9281c = false;
        this.f9282d = false;
        this.f9283e = false;
        this.f9284f = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeBoolSize = CodedOutputByteBufferNano.computeBoolSize(4, this.f9282d) + CodedOutputByteBufferNano.computeBoolSize(3, this.f9281c) + CodedOutputByteBufferNano.computeBoolSize(2, this.f9280b) + CodedOutputByteBufferNano.computeBoolSize(1, this.f9279a) + super.computeSerializedSize();
        boolean z = this.f9283e;
        if (z) {
            iComputeBoolSize += CodedOutputByteBufferNano.computeBoolSize(5, z);
        }
        int i = this.f9284f;
        return i != -1 ? iComputeBoolSize + CodedOutputByteBufferNano.computeInt32Size(6, i) : iComputeBoolSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeBool(1, this.f9279a);
        codedOutputByteBufferNano.writeBool(2, this.f9280b);
        codedOutputByteBufferNano.writeBool(3, this.f9281c);
        codedOutputByteBufferNano.writeBool(4, this.f9282d);
        boolean z = this.f9283e;
        if (z) {
            codedOutputByteBufferNano.writeBool(5, z);
        }
        int i = this.f9284f;
        if (i != -1) {
            codedOutputByteBufferNano.writeInt32(6, i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9962wl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f9279a = codedInputByteBufferNano.readBool();
            } else if (tag == 16) {
                this.f9280b = codedInputByteBufferNano.readBool();
            } else if (tag == 24) {
                this.f9281c = codedInputByteBufferNano.readBool();
            } else if (tag == 32) {
                this.f9282d = codedInputByteBufferNano.readBool();
            } else if (tag == 40) {
                this.f9283e = codedInputByteBufferNano.readBool();
            } else if (tag != 48) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == -1 || int32 == 0 || int32 == 1) {
                    this.f9284f = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C9962wl m6929b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9962wl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9962wl m6928a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9962wl) MessageNano.mergeFrom(new C9962wl(), bArr);
    }
}
