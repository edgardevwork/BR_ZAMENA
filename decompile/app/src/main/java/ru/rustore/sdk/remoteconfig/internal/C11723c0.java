package ru.rustore.sdk.remoteconfig.internal;

import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.c0 */
/* loaded from: classes5.dex */
public final class C11723c0 {

    /* renamed from: a */
    public final URL f10893a;

    /* renamed from: b */
    public final int f10894b;

    /* renamed from: c */
    public final String f10895c;

    public C11723c0(URL requestUrl, int i, String responseBody) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        this.f10893a = requestUrl;
        this.f10894b = i;
        this.f10895c = responseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11723c0)) {
            return false;
        }
        C11723c0 c11723c0 = (C11723c0) obj;
        return Intrinsics.areEqual(this.f10893a, c11723c0.f10893a) && this.f10894b == c11723c0.f10894b && Intrinsics.areEqual(this.f10895c, c11723c0.f10895c);
    }

    public final int hashCode() {
        return this.f10895c.hashCode() + ((Integer.hashCode(this.f10894b) + (this.f10893a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "NetworkConfigRequestResult(requestUrl=" + this.f10893a + ", responseCode=" + this.f10894b + ", responseBody=" + this.f10895c + ')';
    }
}
