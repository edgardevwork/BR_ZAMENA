package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.protobuf.nano.CodedInputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.InternalNano;
import io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import io.appmetrica.analytics.protobuf.nano.WireFormatNano;
import java.io.IOException;

/* renamed from: io.appmetrica.analytics.impl.f9 */
/* loaded from: classes8.dex */
public final class C9525f9 extends MessageNano {

    /* renamed from: d */
    public static final int f8086d = 0;

    /* renamed from: e */
    public static final int f8087e = 1;

    /* renamed from: f */
    public static final int f8088f = 2;

    /* renamed from: g */
    public static final int f8089g = 3;

    /* renamed from: h */
    public static final int f8090h = 4;

    /* renamed from: i */
    public static final int f8091i = 5;

    /* renamed from: j */
    public static final int f8092j = 6;

    /* renamed from: k */
    public static final int f8093k = 7;

    /* renamed from: l */
    public static final int f8094l = 8;

    /* renamed from: m */
    public static final int f8095m = 9;

    /* renamed from: n */
    public static final int f8096n = 10;

    /* renamed from: o */
    public static final int f8097o = 11;

    /* renamed from: p */
    public static final int f8098p = 12;

    /* renamed from: q */
    public static volatile C9525f9[] f8099q;

    /* renamed from: a */
    public long f8100a;

    /* renamed from: b */
    public C9500e9 f8101b;

    /* renamed from: c */
    public C9475d9[] f8102c;

    public C9525f9() {
        m6110a();
    }

    /* renamed from: b */
    public static C9525f9[] m6109b() {
        if (f8099q == null) {
            synchronized (InternalNano.LAZY_INIT_LOCK) {
                try {
                    if (f8099q == null) {
                        f8099q = new C9525f9[0];
                    }
                } finally {
                }
            }
        }
        return f8099q;
    }

    /* renamed from: a */
    public final C9525f9 m6110a() {
        this.f8100a = 0L;
        this.f8101b = null;
        this.f8102c = C9475d9.m6020b();
        this.cachedSize = -1;
        return this;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final int computeSerializedSize() {
        int iComputeUInt64Size = CodedOutputByteBufferNano.computeUInt64Size(1, this.f8100a) + super.computeSerializedSize();
        C9500e9 c9500e9 = this.f8101b;
        if (c9500e9 != null) {
            iComputeUInt64Size += CodedOutputByteBufferNano.computeMessageSize(2, c9500e9);
        }
        C9475d9[] c9475d9Arr = this.f8102c;
        if (c9475d9Arr != null && c9475d9Arr.length > 0) {
            int i = 0;
            while (true) {
                C9475d9[] c9475d9Arr2 = this.f8102c;
                if (i >= c9475d9Arr2.length) {
                    break;
                }
                C9475d9 c9475d9 = c9475d9Arr2[i];
                if (c9475d9 != null) {
                    iComputeUInt64Size = CodedOutputByteBufferNano.computeMessageSize(3, c9475d9) + iComputeUInt64Size;
                }
                i++;
            }
        }
        return iComputeUInt64Size;
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
        codedOutputByteBufferNano.writeUInt64(1, this.f8100a);
        C9500e9 c9500e9 = this.f8101b;
        if (c9500e9 != null) {
            codedOutputByteBufferNano.writeMessage(2, c9500e9);
        }
        C9475d9[] c9475d9Arr = this.f8102c;
        if (c9475d9Arr != null && c9475d9Arr.length > 0) {
            int i = 0;
            while (true) {
                C9475d9[] c9475d9Arr2 = this.f8102c;
                if (i >= c9475d9Arr2.length) {
                    break;
                }
                C9475d9 c9475d9 = c9475d9Arr2[i];
                if (c9475d9 != null) {
                    codedOutputByteBufferNano.writeMessage(3, c9475d9);
                }
                i++;
            }
        }
        super.writeTo(codedOutputByteBufferNano);
    }

    @Override // io.appmetrica.analytics.protobuf.nano.MessageNano
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9525f9 mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        while (true) {
            int tag = codedInputByteBufferNano.readTag();
            if (tag == 0) {
                return this;
            }
            if (tag == 8) {
                this.f8100a = codedInputByteBufferNano.readUInt64();
            } else if (tag == 18) {
                if (this.f8101b == null) {
                    this.f8101b = new C9500e9();
                }
                codedInputByteBufferNano.readMessage(this.f8101b);
            } else if (tag != 26) {
                if (!WireFormatNano.parseUnknownField(codedInputByteBufferNano, tag)) {
                    return this;
                }
            } else {
                int repeatedFieldArrayLength = WireFormatNano.getRepeatedFieldArrayLength(codedInputByteBufferNano, 26);
                C9475d9[] c9475d9Arr = this.f8102c;
                int length = c9475d9Arr == null ? 0 : c9475d9Arr.length;
                int i = repeatedFieldArrayLength + length;
                C9475d9[] c9475d9Arr2 = new C9475d9[i];
                if (length != 0) {
                    System.arraycopy(c9475d9Arr, 0, c9475d9Arr2, 0, length);
                }
                while (length < i - 1) {
                    C9475d9 c9475d9 = new C9475d9();
                    c9475d9Arr2[length] = c9475d9;
                    codedInputByteBufferNano.readMessage(c9475d9);
                    codedInputByteBufferNano.readTag();
                    length++;
                }
                C9475d9 c9475d92 = new C9475d9();
                c9475d9Arr2[length] = c9475d92;
                codedInputByteBufferNano.readMessage(c9475d92);
                this.f8102c = c9475d9Arr2;
            }
        }
    }

    /* renamed from: b */
    public static C9525f9 m6108b(CodedInputByteBufferNano codedInputByteBufferNano) throws IOException {
        return new C9525f9().mergeFrom(codedInputByteBufferNano);
    }

    /* renamed from: a */
    public static C9525f9 m6107a(byte[] bArr) throws InvalidProtocolBufferNanoException {
        return (C9525f9) MessageNano.mergeFrom(new C9525f9(), bArr);
    }
}
