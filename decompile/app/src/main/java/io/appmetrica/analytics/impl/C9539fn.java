package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.fn */
/* loaded from: classes8.dex */
public final class C9539fn extends MessageNano {

    /* renamed from: c */
    public static volatile C9539fn[] f8149c;

    /* renamed from: a */
    public boolean f8150a;

    /* renamed from: b */
    public boolean f8151b;

    public C9539fn() {
        m6150a();
    }

    /* renamed from: b */
    public static C9539fn[] m6149b() {
        if (f8149c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8149c == null) {
                        f8149c = new C9539fn[0];
                    }
                } finally {
                }
            }
        }
        return f8149c;
    }

    /* renamed from: a */
    public final C9539fn m6150a() {
        this.f8150a = false;
        this.f8151b = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        boolean z = this.f8150a;
        if (z) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBoolSize(1, z);
        }
        boolean z2 = this.f8151b;
        return z2 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(2, z2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        boolean z = this.f8150a;
        if (z) {
            codedOutputByteBufferNano.writeBool(1, z);
        }
        boolean z2 = this.f8151b;
        if (z2) {
            codedOutputByteBufferNano.writeBool(2, z2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9539fn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f8150a = codedInputByteBufferNano.readBool();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8151b = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C9539fn m6148b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9539fn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9539fn m6147a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9539fn) MessageNano.mergeFrom(new C9539fn(), bArr);
    }
}
