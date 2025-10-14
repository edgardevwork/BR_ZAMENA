package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.l8 */
/* loaded from: classes6.dex */
public final class C9674l8 extends MessageNano {

    /* renamed from: c */
    public static volatile C9674l8[] f8545c;

    /* renamed from: a */
    public C9424b8 f8546a;

    /* renamed from: b */
    public C9424b8[] f8547b;

    public C9674l8() {
        m6359a();
    }

    /* renamed from: b */
    public static C9674l8[] m6358b() {
        if (f8545c == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8545c == null) {
                        f8545c = new C9674l8[0];
                    }
                } finally {
                }
            }
        }
        return f8545c;
    }

    /* renamed from: a */
    public final C9674l8 m6359a() {
        this.f8546a = null;
        this.f8547b = C9424b8.m5903b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeSerializedSize = super.computeSerializedSize();
        C9424b8 c9424b8 = this.f8546a;
        if (c9424b8 != null) {
            iComputeSerializedSize += CodedOutputByteBufferNano.computeMessageSize(1, c9424b8);
        }
        C9424b8[] c9424b8Arr = this.f8547b;
        if (c9424b8Arr != null && c9424b8Arr.length > 0) {
            int i = 0;
            while (true) {
                C9424b8[] c9424b8Arr2 = this.f8547b;
                if (i >= c9424b8Arr2.length) {
                    break;
                }
                C9424b8 c9424b82 = c9424b8Arr2[i];
                if (c9424b82 != null) {
                    iComputeSerializedSize = CodedOutputByteBufferNano.computeMessageSize(2, c9424b82) + iComputeSerializedSize;
                }
                i++;
            }
        }
        return iComputeSerializedSize;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        C9424b8 c9424b8 = this.f8546a;
        if (c9424b8 != null) {
            codedOutputByteBufferNano.writeMessage(1, c9424b8);
        }
        C9424b8[] c9424b8Arr = this.f8547b;
        if (c9424b8Arr != null && c9424b8Arr.length > 0) {
            int i = 0;
            while (true) {
                C9424b8[] c9424b8Arr2 = this.f8547b;
                if (i >= c9424b8Arr2.length) {
                    break;
                }
                C9424b8 c9424b82 = c9424b8Arr2[i];
                if (c9424b82 != null) {
                    codedOutputByteBufferNano.writeMessage(2, c9424b82);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9674l8 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 10) {
                if (this.f8546a == null) {
                    this.f8546a = new C9424b8();
                }
                codedInputByteBufferNano.readMessage(this.f8546a);
            } else if (tag != 18) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 18);
                C9424b8[] c9424b8Arr = this.f8547b;
                int length = c9424b8Arr == null ? 0 : c9424b8Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9424b8[] c9424b8Arr2 = new C9424b8[i];
                if (length != 0) {
                    System.arraycopy(c9424b8Arr, 0, c9424b8Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9424b8 c9424b8 = new C9424b8();
                    c9424b8Arr2[length] = c9424b8;
                    codedInputByteBufferNano.readMessage(c9424b8);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9424b8 c9424b82 = new C9424b8();
                c9424b8Arr2[length] = c9424b82;
                codedInputByteBufferNano.readMessage(c9424b82);
                this.f8547b = c9424b8Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C9674l8 m6357b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9674l8().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9674l8 m6356a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9674l8) MessageNano.mergeFrom(new C9674l8(), bArr);
    }
}
