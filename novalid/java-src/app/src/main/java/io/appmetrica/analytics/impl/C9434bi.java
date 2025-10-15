package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.bi */
/* loaded from: classes8.dex */
public final class C9434bi extends MessageNano {

    /* renamed from: c */
    public static final int f7786c = 0;

    /* renamed from: d */
    public static final int f7787d = 1;

    /* renamed from: e */
    public static final int f7788e = 2;

    /* renamed from: f */
    public static final int f7789f = 3;

    /* renamed from: g */
    public static final int f7790g = 4;

    /* renamed from: h */
    public static volatile C9434bi[] f7791h;

    /* renamed from: a */
    public int f7792a;

    /* renamed from: b */
    public int f7793b;

    public C9434bi() {
        m5921a();
    }

    /* renamed from: b */
    public static C9434bi[] m5920b() {
        if (f7791h == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7791h == null) {
                        f7791h = new C9434bi[0];
                    }
                } finally {
                }
            }
        }
        return f7791h;
    }

    /* renamed from: a */
    public final C9434bi m5921a() {
        this.f7792a = 0;
        this.f7793b = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f7792a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeUInt32Size(1, i);
        }
        int i2 = this.f7793b;
        return i2 != 0 ? iComputeSerializedSize + CodedOutputByteBufferNano.computeInt32Size(2, i2) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f7792a;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(1, i);
        }
        int i2 = this.f7793b;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeInt32(2, i2);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9434bi mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f7792a = codedInputByteBufferNano.readUInt32();
            } else if (tag != 16) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4) {
                    this.f7793b = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C9434bi m5919b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9434bi().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9434bi m5918a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9434bi) MessageNano.mergeFrom(new C9434bi(), bArr);
    }
}
