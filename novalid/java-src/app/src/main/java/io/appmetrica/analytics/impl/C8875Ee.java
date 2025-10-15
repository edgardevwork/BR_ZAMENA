package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Ee */
/* loaded from: classes7.dex */
public final class C8875Ee extends MessageNano {

    /* renamed from: d */
    public static volatile C8875Ee[] f6544d;

    /* renamed from: a */
    public String f6545a;

    /* renamed from: b */
    public String f6546b;

    /* renamed from: c */
    public int f6547c;

    public C8875Ee() {
        m5118a();
    }

    /* renamed from: b */
    public static C8875Ee[] m5117b() {
        if (f6544d == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f6544d == null) {
                        f6544d = new C8875Ee[0];
                    }
                } finally {
                }
            }
        }
        return f6544d;
    }

    /* renamed from: a */
    public final C8875Ee m5118a() {
        this.f6545a = "";
        this.f6546b = "";
        this.f6547c = 0;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!this.f6545a.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(1, this.f6545a);
        }
        if (!this.f6546b.equals("")) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeStringSize(2, this.f6546b);
        }
        return CodedOutputByteBufferNano.computeInt32Size(3, this.f6547c) + iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!this.f6545a.equals("")) {
            codedOutputByteBufferNano.writeString(1, this.f6545a);
        }
        if (!this.f6546b.equals("")) {
            codedOutputByteBufferNano.writeString(2, this.f6546b);
        }
        codedOutputByteBufferNano.writeInt32(3, this.f6547c);
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8875Ee mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f6545a = codedInputByteBufferNano.readString();
            } else if (tag == 18) {
                this.f6546b = codedInputByteBufferNano.readString();
            } else if (tag != 24) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2 || int32 == 3) {
                    this.f6547c = int32;
                }
            }
        }
    }

    /* renamed from: b */
    public static C8875Ee m5116b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C8875Ee().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C8875Ee m5115a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C8875Ee) MessageNano.mergeFrom(new C8875Ee(), bArr);
    }
}
