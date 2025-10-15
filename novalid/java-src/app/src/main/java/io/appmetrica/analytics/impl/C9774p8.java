package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: io.appmetrica.analytics.impl.p8 */
/* loaded from: classes6.dex */
public final class C9774p8 extends MessageNano {

    /* renamed from: e */
    public static volatile C9774p8[] f8885e;

    /* renamed from: a */
    public byte[] f8886a;

    /* renamed from: b */
    public C9499e8 f8887b;

    /* renamed from: c */
    public byte[] f8888c;

    /* renamed from: d */
    public C9649k8 f8889d;

    public C9774p8() {
        m6630a();
    }

    /* renamed from: b */
    public static C9774p8[] m6629b() {
        if (f8885e == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8885e == null) {
                        f8885e = new C9774p8[0];
                    }
                } finally {
                }
            }
        }
        return f8885e;
    }

    /* renamed from: a */
    public final C9774p8 m6630a() {
        byte[] bArr = WireFormatNano.EMPTY_BYTES;
        this.f8886a = bArr;
        this.f8887b = null;
        this.f8888c = bArr;
        this.f8889d = null;
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        byte[] bArr = this.f8886a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(1, this.f8886a);
        }
        C9499e8 c9499e8 = this.f8887b;
        if (c9499e8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(2, c9499e8);
        }
        if (!Arrays.equals(this.f8888c, bArr2)) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeBytesSize(3, this.f8888c);
        }
        C9649k8 c9649k8 = this.f8889d;
        return c9649k8 != null ? iComputeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(4, c9649k8) : iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        byte[] bArr = this.f8886a;
        byte[] bArr2 = WireFormatNano.EMPTY_BYTES;
        if (!Arrays.equals(bArr, bArr2)) {
            codedOutputByteBufferNano.writeBytes(1, this.f8886a);
        }
        C9499e8 c9499e8 = this.f8887b;
        if (c9499e8 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9499e8);
        }
        if (!Arrays.equals(this.f8888c, bArr2)) {
            codedOutputByteBufferNano.writeBytes(3, this.f8888c);
        }
        C9649k8 c9649k8 = this.f8889d;
        if (c9649k8 != null) {
            codedOutputByteBufferNano.writeMessage(4, c9649k8);
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9774p8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                this.f8886a = codedInputByteBufferNano.readBytes();
            } else if (tag == 18) {
                if (this.f8887b == null) {
                    this.f8887b = new C9499e8();
                }
                codedInputByteBufferNano.readMessage(this.f8887b);
            } else if (tag == 26) {
                this.f8888c = codedInputByteBufferNano.readBytes();
            } else if (tag != 34) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                if (this.f8889d == null) {
                    this.f8889d = new C9649k8();
                }
                codedInputByteBufferNano.readMessage(this.f8889d);
            }
        }
    }

    /* renamed from: b */
    public static C9774p8 m6628b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9774p8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9774p8 m6627a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9774p8) MessageNano.mergeFrom(new C9774p8(), bArr);
    }
}
