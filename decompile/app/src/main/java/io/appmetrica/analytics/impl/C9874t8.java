package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.t8 */
/* loaded from: classes6.dex */
public final class C9874t8 extends MessageNano {

    /* renamed from: g */
    public static final int f9090g = 0;

    /* renamed from: h */
    public static final int f9091h = 1;

    /* renamed from: i */
    public static final int f9092i = 2;

    /* renamed from: j */
    public static final int f9093j = 3;

    /* renamed from: k */
    public static final int f9094k = 4;

    /* renamed from: l */
    public static final int f9095l = 5;

    /* renamed from: m */
    public static final int f9096m = 6;

    /* renamed from: n */
    public static final int f9097n = 7;

    /* renamed from: o */
    public static volatile C9874t8[] f9098o;

    /* renamed from: a */
    public int f9099a;

    /* renamed from: b */
    public C9849s8 f9100b;

    /* renamed from: c */
    public C9799q8 f9101c;

    /* renamed from: d */
    public C9824r8 f9102d;

    /* renamed from: e */
    public C9449c8 f9103e;

    /* renamed from: f */
    public C9599i8 f9104f;

    public C9874t8() {
        m6821a();
    }

    /* renamed from: b */
    public static C9874t8[] m6820b() {
        if (f9098o == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f9098o == null) {
                        f9098o = new C9874t8[0];
                    }
                } finally {
                }
            }
        }
        return f9098o;
    }

    /* renamed from: a */
    public final C9874t8 m6821a() {
        this.f9099a = 0;
        this.f9100b = null;
        this.f9101c = null;
        this.f9102d = null;
        this.f9103e = null;
        this.f9104f = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        int i = this.f9099a;
        if (i != 0) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeInt32Size(1, i);
        }
        C9849s8 c9849s8 = this.f9100b;
        if (c9849s8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9849s8);
        }
        C9799q8 c9799q8 = this.f9101c;
        if (c9799q8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(3, c9799q8);
        }
        C9824r8 c9824r8 = this.f9102d;
        if (c9824r8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(4, c9824r8);
        }
        C9449c8 c9449c8 = this.f9103e;
        if (c9449c8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(5, c9449c8);
        }
        C9599i8 c9599i8 = this.f9104f;
        return c9599i8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(6, c9599i8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        int i = this.f9099a;
        if (i != 0) {
            codedOutputByteBufferNano.writeInt32(1, i);
        }
        C9849s8 c9849s8 = this.f9100b;
        if (c9849s8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9849s8);
        }
        C9799q8 c9799q8 = this.f9101c;
        if (c9799q8 != null) {
            codedOutputByteBufferNano.writeMessage(3, c9799q8);
        }
        C9824r8 c9824r8 = this.f9102d;
        if (c9824r8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c9824r8);
        }
        C9449c8 c9449c8 = this.f9103e;
        if (c9449c8 != null) {
            codedOutputByteBufferNano.writeMessage(5, c9449c8);
        }
        C9599i8 c9599i8 = this.f9104f;
        if (c9599i8 != null) {
            codedOutputByteBufferNano.writeMessage(6, c9599i8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a */
    public final C9874t8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                int int32 = codedInputByteBufferNano.readInt32();
                switch (int32) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        this.f9099a = int32;
                        break;
                }
            } else if (tag == 18) {
                if (this.f9100b == null) {
                    this.f9100b = new C9849s8();
                }
                codedInputByteBufferNano.readMessage(this.f9100b);
            } else if (tag == 26) {
                if (this.f9101c == null) {
                    this.f9101c = new C9799q8();
                }
                codedInputByteBufferNano.readMessage(this.f9101c);
            } else if (tag == 34) {
                if (this.f9102d == null) {
                    this.f9102d = new C9824r8();
                }
                codedInputByteBufferNano.readMessage(this.f9102d);
            } else if (tag == 42) {
                if (this.f9103e == null) {
                    this.f9103e = new C9449c8();
                }
                codedInputByteBufferNano.readMessage(this.f9103e);
            } else if (tag != 50) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f9104f == null) {
                    this.f9104f = new C9599i8();
                }
                codedInputByteBufferNano.readMessage(this.f9104f);
            }
        }
    }

    /* renamed from: b */
    public static C9874t8 m6819b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9874t8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9874t8 m6818a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9874t8) MessageNano.mergeFrom(new C9874t8(), bArr);
    }
}
