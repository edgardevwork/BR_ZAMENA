package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.s3 */
/* loaded from: classes6.dex */
public class C9844s3 implements InterfaceC9869t3 {

    /* renamed from: a */
    public final int f9034a;

    public C9844s3(int i) {
        this.f9034a = i;
    }

    /* renamed from: a */
    public static InterfaceC9869t3 m6790a(InterfaceC9869t3... interfaceC9869t3Arr) {
        return new C9844s3(m6791b(interfaceC9869t3Arr));
    }

    /* renamed from: b */
    public static int m6791b(InterfaceC9869t3... interfaceC9869t3Arr) {
        int bytesTruncated = 0;
        for (InterfaceC9869t3 interfaceC9869t3 : interfaceC9869t3Arr) {
            if (interfaceC9869t3 != null) {
                bytesTruncated = interfaceC9869t3.getBytesTruncated() + bytesTruncated;
            }
        }
        return bytesTruncated;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC9869t3
    public final int getBytesTruncated() {
        return this.f9034a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f9034a + '}';
    }
}
