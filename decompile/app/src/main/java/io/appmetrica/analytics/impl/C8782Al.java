package io.appmetrica.analytics.impl;

import androidx.work.WorkRequest;
import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Al */
/* loaded from: classes7.dex */
public final class C8782Al extends MessageNano {

    /* renamed from: b */
    public static volatile C8782Al[] f6348b;

    /* renamed from: a */
    public long f6349a;

    public C8782Al() {
        m4976a();
    }

    /* renamed from: b */
    public static C8782Al[] m4975b() {
        if (f6348b == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6348b == null) {
                        f6348b = new C8782Al[0];
                    }
                } finally {
                }
            }
        }
        return f6348b;
    }

    /* renamed from: a */
    public final C8782Al m4976a() {
        this.f6349a = WorkRequest.MAX_BACKOFF_MILLIS;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        return CodedOutputByteBufferNano.computeInt64Size(1, this.f6349a) + super.computeSerializedSize();
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeInt64(1, this.f6349a);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8782Al mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag != 8) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f6349a = codedInputByteBufferNano.readInt64();
            }
        }
    }

    /* renamed from: b */
    public static C8782Al m4974b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8782Al().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C8782Al m4973a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8782Al) MessageNano.mergeFrom(new C8782Al(), bArr);
    }
}
