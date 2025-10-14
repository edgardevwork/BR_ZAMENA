package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.X1 */
/* loaded from: classes5.dex */
public final class C9320X1 extends MessageNano {

    /* renamed from: c */
    public static final int f7424c = 0;

    /* renamed from: d */
    public static final int f7425d = 1;

    /* renamed from: e */
    public static final int f7426e = 2;

    /* renamed from: f */
    public static final int f7427f = 3;

    /* renamed from: g */
    public static final int f7428g = 4;

    /* renamed from: h */
    public static final int f7429h = 5;

    /* renamed from: i */
    public static final int f7430i = -1;

    /* renamed from: j */
    public static final int f7431j = 0;

    /* renamed from: k */
    public static final int f7432k = 1;

    /* renamed from: l */
    public static volatile C9320X1[] f7433l;

    /* renamed from: a */
    public int f7434a;

    /* renamed from: b */
    public int f7435b;

    public C9320X1() {
        m5724a();
    }

    /* renamed from: b */
    public static C9320X1[] m5723b() {
        if (f7433l == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7433l == null) {
                        f7433l = new C9320X1[0];
                    }
                } finally {
                }
            }
        }
        return f7433l;
    }

    /* renamed from: a */
    public final C9320X1 m5724a() {
        this.f7434a = 0;
        this.f7435b = -1;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f7435b) + CodedOutputByteBufferNano.computeInt32Size(2, this.f7434a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt32(2, this.f7434a);
        codedOutputByteBufferNano.writeInt32(3, this.f7435b);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9320X1 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 16) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3 || int32 == 4 || int32 == 5) {
                    this.f7434a = int32;
                }
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int322 = codedInputByteBufferNano.readInt32();
                if (int322 == -1 || int322 == 0 || int322 == 1) {
                    this.f7435b = int322;
                }
            }
        }
    }

    /* renamed from: b */
    public static C9320X1 m5722b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9320X1().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9320X1 m5721a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9320X1) MessageNano.mergeFrom(new C9320X1(), bArr);
    }
}
