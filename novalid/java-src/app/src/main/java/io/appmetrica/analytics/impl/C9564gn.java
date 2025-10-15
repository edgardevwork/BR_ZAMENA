package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.gn */
/* loaded from: classes8.dex */
public final class C9564gn extends MessageNano {

    /* renamed from: e */
    public static volatile C9564gn[] f8216e;

    /* renamed from: a */
    public byte[] f8217a;

    /* renamed from: b */
    public double f8218b;

    /* renamed from: c */
    public double f8219c;

    /* renamed from: d */
    public boolean f8220d;

    public C9564gn() {
        m6196a();
    }

    /* renamed from: b */
    public static C9564gn[] m6195b() {
        if (f8216e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8216e == null) {
                        f8216e = new C9564gn[0];
                    }
                } finally {
                }
            }
        }
        return f8216e;
    }

    /* renamed from: a */
    public final C9564gn m6196a() {
        this.f8217a = WireFormatNano.EMPTY_BYTES;
        this.f8218b = 0.0d;
        this.f8219c = 0.0d;
        this.f8220d = false;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        if (!Arrays.equals(this.f8217a, WireFormatNano.EMPTY_BYTES)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8217a);
        }
        if (Double.doubleToLongBits(this.f8218b) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(2, this.f8218b);
        }
        if (Double.doubleToLongBits(this.f8219c) != Double.doubleToLongBits(0.0d)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeDoubleSize(3, this.f8219c);
        }
        boolean z = this.f8220d;
        return z ? iComputeSerializedSize + CodedOutputByteBufferNano.computeBoolSize(4, z) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        if (!Arrays.equals(this.f8217a, WireFormatNano.EMPTY_BYTES)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8217a);
        }
        if (Double.doubleToLongBits(this.f8218b) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(2, this.f8218b);
        }
        if (Double.doubleToLongBits(this.f8219c) != Double.doubleToLongBits(0.0d)) {
            codedOutputByteBufferNano.writeDouble(3, this.f8219c);
        }
        boolean z = this.f8220d;
        if (z) {
            codedOutputByteBufferNano.writeBool(4, z);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9564gn mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8217a = codedInputByteBufferNano.readBytes();
            } else if (tag == 17) {
                this.f8218b = codedInputByteBufferNano.readDouble();
            } else if (tag == 25) {
                this.f8219c = codedInputByteBufferNano.readDouble();
            } else if (tag != 32) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                this.f8220d = codedInputByteBufferNano.readBool();
            }
        }
    }

    /* renamed from: b */
    public static C9564gn m6194b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9564gn().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9564gn m6193a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9564gn) MessageNano.mergeFrom(new C9564gn(), bArr);
    }
}
