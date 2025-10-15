package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.hn */
/* loaded from: classes8.dex */
public final class C9589hn extends MessageNano {

    /* renamed from: b */
    public static volatile C9589hn[] f8319b;

    /* renamed from: a */
    public C9514en[] f8320a;

    public C9589hn() {
        m6265a();
    }

    /* renamed from: b */
    public static C9589hn[] m6264b() {
        if (f8319b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8319b == null) {
                        f8319b = new C9589hn[0];
                    }
                } finally {
                }
            }
        }
        return f8319b;
    }

    /* renamed from: a */
    public final C9589hn m6265a() {
        this.f8320a = C9514en.m6072b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9514en[] c9514enArr = this.f8320a;
        if (c9514enArr != null && c9514enArr.length > 0) {
            int i = 0;
            while (true) {
                C9514en[] c9514enArr2 = this.f8320a;
                if (i >= c9514enArr2.length) {
                    break;
                }
                C9514en c9514en = c9514enArr2[i];
                if (c9514en != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(1, c9514en) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9514en[] c9514enArr = this.f8320a;
        if (c9514enArr != null && c9514enArr.length > 0) {
            int i = 0;
            while (true) {
                C9514en[] c9514enArr2 = this.f8320a;
                if (i >= c9514enArr2.length) {
                    break;
                }
                C9514en c9514en = c9514enArr2[i];
                if (c9514en != null) {
                    codedOutputByteBufferNano.writeMessage(1, c9514en);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9589hn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
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
                C9514en[] c9514enArr = this.f8320a;
                int length = c9514enArr == null ? 0 : c9514enArr.length;
                int i = repeatedFieldArrayLength + length;
                C9514en[] c9514enArr2 = new C9514en[i];
                if (length != 0) {
                    System.arraycopy(c9514enArr, 0, c9514enArr2, 0, length);
                }
                while (length < i - 1) {
                    C9514en c9514en = new C9514en();
                    c9514enArr2[length] = c9514en;
                    codedInputByteBufferNano.readMessage(c9514en);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9514en c9514en2 = new C9514en();
                c9514enArr2[length] = c9514en2;
                codedInputByteBufferNano.readMessage(c9514en2);
                this.f8320a = c9514enArr2;
            }
        }
    }

    /* renamed from: b */
    public static C9589hn m6263b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9589hn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9589hn m6262a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9589hn) MessageNano.mergeFrom(new C9589hn(), bArr);
    }
}
