package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.Y8 */
/* loaded from: classes5.dex */
public final class C9351Y8 extends MessageNano {

    /* renamed from: j */
    public static final int f7563j = 0;

    /* renamed from: k */
    public static final int f7564k = 1;

    /* renamed from: l */
    public static final int f7565l = 2;

    /* renamed from: m */
    public static volatile C9351Y8[] f7566m;

    /* renamed from: a */
    public double f7567a;

    /* renamed from: b */
    public double f7568b;

    /* renamed from: c */
    public long f7569c;

    /* renamed from: d */
    public int f7570d;

    /* renamed from: e */
    public int f7571e;

    /* renamed from: f */
    public int f7572f;

    /* renamed from: g */
    public int f7573g;

    /* renamed from: h */
    public int f7574h;

    /* renamed from: i */
    public String f7575i;

    public C9351Y8() {
        m5780a();
    }

    /* renamed from: b */
    public static C9351Y8[] m5779b() {
        if (f7566m == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f7566m == null) {
                        f7566m = new C9351Y8[0];
                    }
                } finally {
                }
            }
        }
        return f7566m;
    }

    /* renamed from: a */
    public final C9351Y8 m5780a() {
        this.f7567a = 0.0d;
        this.f7568b = 0.0d;
        this.f7569c = 0L;
        this.f7570d = 0;
        this.f7571e = 0;
        this.f7572f = 0;
        this.f7573g = 0;
        this.f7574h = 0;
        this.f7575i = "";
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeDoubleSize = CodedOutputByteBufferNano.computeDoubleSize(2, this.f7568b) + CodedOutputByteBufferNano.computeDoubleSize(1, this.f7567a) + super.computeSerializedSize();
        long j = this.f7569c;
        if (j != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt64Size(3, j);
        }
        int i = this.f7570d;
        if (i != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(4, i);
        }
        int i2 = this.f7571e;
        if (i2 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(5, i2);
        }
        int i3 = this.f7572f;
        if (i3 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeUInt32Size(6, i3);
        }
        int i4 = this.f7573g;
        if (i4 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(7, i4);
        }
        int i5 = this.f7574h;
        if (i5 != 0) {
            iComputeDoubleSize += CodedOutputByteBufferNano.computeInt32Size(8, i5);
        }
        return !this.f7575i.equals("") ? iComputeDoubleSize + CodedOutputByteBufferNano.computeStringSize(9, this.f7575i) : iComputeDoubleSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeDouble(1, this.f7567a);
        codedOutputByteBufferNano.writeDouble(2, this.f7568b);
        long j = this.f7569c;
        if (j != 0) {
            codedOutputByteBufferNano.writeUInt64(3, j);
        }
        int i = this.f7570d;
        if (i != 0) {
            codedOutputByteBufferNano.writeUInt32(4, i);
        }
        int i2 = this.f7571e;
        if (i2 != 0) {
            codedOutputByteBufferNano.writeUInt32(5, i2);
        }
        int i3 = this.f7572f;
        if (i3 != 0) {
            codedOutputByteBufferNano.writeUInt32(6, i3);
        }
        int i4 = this.f7573g;
        if (i4 != 0) {
            codedOutputByteBufferNano.writeInt32(7, i4);
        }
        int i5 = this.f7574h;
        if (i5 != 0) {
            codedOutputByteBufferNano.writeInt32(8, i5);
        }
        if (!this.f7575i.equals("")) {
            codedOutputByteBufferNano.writeString(9, this.f7575i);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    /* renamed from: b */
    public static C9351Y8 m5778b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9351Y8().mergeFrom(codedInputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9351Y8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 9) {
                this.f7567a = codedInputByteBufferNano.readDouble();
            } else if (tag == 17) {
                this.f7568b = codedInputByteBufferNano.readDouble();
            } else if (tag == 24) {
                this.f7569c = codedInputByteBufferNano.readUInt64();
            } else if (tag == 32) {
                this.f7570d = codedInputByteBufferNano.readUInt32();
            } else if (tag == 40) {
                this.f7571e = codedInputByteBufferNano.readUInt32();
            } else if (tag == 48) {
                this.f7572f = codedInputByteBufferNano.readUInt32();
            } else if (tag == 56) {
                this.f7573g = codedInputByteBufferNano.readInt32();
            } else if (tag == 64) {
                int int32 = codedInputByteBufferNano.readInt32();
                if (int32 == 0 || int32 == 1 || int32 == 2) {
                    this.f7574h = int32;
                }
            } else if (tag != 74) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f7575i = codedInputByteBufferNano.readString();
            }
        }
    }

    /* renamed from: a */
    public static C9351Y8 m5777a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9351Y8) MessageNano.mergeFrom(new C9351Y8(), bArr);
    }
}
