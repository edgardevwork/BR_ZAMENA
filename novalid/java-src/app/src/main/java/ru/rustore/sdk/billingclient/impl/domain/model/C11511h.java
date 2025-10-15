package ru.rustore.sdk.billingclient.impl.domain.model;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.h */
/* loaded from: classes5.dex */
public final class C11511h {

    /* renamed from: a */
    public final C11513j f10496a;

    /* renamed from: b */
    public final boolean f10497b;

    /* renamed from: c */
    public final String f10498c;

    /* renamed from: d */
    public final C11510g f10499d;

    public C11511h(C11513j webPayToken, boolean z, String backendBaseUrl, C11510g c11510g) {
        Intrinsics.checkNotNullParameter(webPayToken, "webPayToken");
        Intrinsics.checkNotNullParameter(backendBaseUrl, "backendBaseUrl");
        this.f10496a = webPayToken;
        this.f10497b = z;
        this.f10498c = backendBaseUrl;
        this.f10499d = c11510g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11511h)) {
            return false;
        }
        C11511h c11511h = (C11511h) obj;
        return Intrinsics.areEqual(this.f10496a, c11511h.f10496a) && this.f10497b == c11511h.f10497b && Intrinsics.areEqual(this.f10498c, c11511h.f10498c) && Intrinsics.areEqual(this.f10499d, c11511h.f10499d);
    }

    public final int hashCode() {
        int iM1429a = C8031b.m1429a(this.f10498c, (C11507d.m7467a(this.f10497b) + (this.f10496a.hashCode() * 31)) * 31, 31);
        C11510g c11510g = this.f10499d;
        return iM1429a + (c11510g == null ? 0 : c11510g.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAuthorizationInfo(webPayToken=");
        sb.append(this.f10496a);
        sb.append(", sandboxInfo=");
        sb.append((Object) ("SandboxInfo(enabled=" + this.f10497b + ')'));
        sb.append(", backendBaseUrl=");
        sb.append((Object) ("Url(value=" + this.f10498c + ')'));
        sb.append(", userId=");
        sb.append(this.f10499d);
        sb.append(')');
        return sb.toString();
    }
}
