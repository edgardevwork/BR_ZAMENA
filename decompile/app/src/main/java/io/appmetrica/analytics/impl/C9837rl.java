package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.rl */
/* loaded from: classes6.dex */
public final class C9837rl extends MessageNano {

    /* renamed from: b */
    public static volatile C9837rl[] f9021b;

    /* renamed from: a */
    public C9812ql[] f9022a;

    public C9837rl() {
        m6781a();
    }

    /* renamed from: b */
    public static C9837rl[] m6780b() {
        if (f9021b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9021b == null) {
                        f9021b = new C9837rl[0];
                    }
                } finally {
                }
            }
        }
        return f9021b;
    }

    /* renamed from: a */
    public final C9837rl m6781a() {
        this.f9022a = C9812ql.m6716b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9812ql[] c9812qlArr = this.f9022a;
        if (c9812qlArr != null && c9812qlArr.length > 0) {
            int i = 0;
            while (true) {
                C9812ql[] c9812qlArr2 = this.f9022a;
                if (i >= c9812qlArr2.length) {
                    break;
                }
                C9812ql c9812ql = c9812qlArr2[i];
                if (c9812ql != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c9812ql) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9812ql[] c9812qlArr = this.f9022a;
        if (c9812qlArr != null && c9812qlArr.length > 0) {
            int i = 0;
            while (true) {
                C9812ql[] c9812qlArr2 = this.f9022a;
                if (i >= c9812qlArr2.length) {
                    break;
                }
                C9812ql c9812ql = c9812qlArr2[i];
                if (c9812ql != null) {
                    codedOutputByteBufferNano.writeMessage(1, c9812ql);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9837rl mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 10) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 10);
                C9812ql[] c9812qlArr = this.f9022a;
                int length = c9812qlArr == null ? 0 : c9812qlArr.length;
                int i = repeatedFieldArrayLength + length;
                C9812ql[] c9812qlArr2 = new C9812ql[i];
                if (length != 0) {
                    System.arraycopy(c9812qlArr, 0, c9812qlArr2, 0, length);
                }
                while (length < i - 1) {
                    C9812ql c9812ql = new C9812ql();
                    c9812qlArr2[length] = c9812ql;
                    codedInputByteBufferNano.readMessage(c9812ql);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9812ql c9812ql2 = new C9812ql();
                c9812qlArr2[length] = c9812ql2;
                codedInputByteBufferNano.readMessage(c9812ql2);
                this.f9022a = c9812qlArr2;
            }
        }
    }

    /* renamed from: b */
    public static C9837rl m6779b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9837rl().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9837rl m6778a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9837rl) MessageNano.mergeFrom(new C9837rl(), bArr);
    }
}
