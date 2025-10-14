package ru.rustore.sdk.billingclient.impl.domain.model;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.c */
/* loaded from: classes5.dex */
public final class C11506c {

    /* renamed from: a */
    public final String f10486a;

    /* renamed from: b */
    public final boolean f10487b;

    /* renamed from: c */
    public final String f10488c;

    public C11506c(String payToken, boolean z, String backendBaseUrl) {
        Intrinsics.checkNotNullParameter(payToken, "payToken");
        Intrinsics.checkNotNullParameter(backendBaseUrl, "backendBaseUrl");
        this.f10486a = payToken;
        this.f10487b = z;
        this.f10488c = backendBaseUrl;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11506c)) {
            return false;
        }
        C11506c c11506c = (C11506c) obj;
        return Intrinsics.areEqual(this.f10486a, c11506c.f10486a) && this.f10487b == c11506c.f10487b && Intrinsics.areEqual(this.f10488c, c11506c.f10488c);
    }

    public final int hashCode() {
        return this.f10488c.hashCode() + ((C11507d.m7467a(this.f10487b) + (this.f10486a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RustoreAuthorizationInfo(payToken=");
        sb.append(this.f10486a);
        sb.append(", sandboxInfo=");
        sb.append((Object) ("SandboxInfo(enabled=" + this.f10487b + ')'));
        sb.append(", backendBaseUrl=");
        return C8032c.m1430a(sb, this.f10488c, ')');
    }
}
