package ru.rustore.sdk.billingclient.impl.domain.model;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8031b;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.billingclient.BuildConfig;

/* renamed from: ru.rustore.sdk.billingclient.impl.domain.model.e */
/* loaded from: classes5.dex */
public final class C11508e {

    /* renamed from: a */
    public final String f10490a;

    /* renamed from: b */
    public final String f10491b;

    /* renamed from: c */
    public final String f10492c;

    public C11508e(String type) {
        Intrinsics.checkNotNullParameter(BuildConfig.SDK_NAME, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter("8.0.0", "version");
        this.f10490a = BuildConfig.SDK_NAME;
        this.f10491b = type;
        this.f10492c = "8.0.0";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11508e)) {
            return false;
        }
        C11508e c11508e = (C11508e) obj;
        return Intrinsics.areEqual(this.f10490a, c11508e.f10490a) && Intrinsics.areEqual(this.f10491b, c11508e.f10491b) && Intrinsics.areEqual(this.f10492c, c11508e.f10492c);
    }

    public final int hashCode() {
        return this.f10492c.hashCode() + C8031b.m1429a(this.f10491b, this.f10490a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkInfo(name=");
        sb.append((Object) ("SdkName(value=" + this.f10490a + ')'));
        sb.append(", type=");
        sb.append((Object) ("SdkType(value=" + this.f10491b + ')'));
        sb.append(", version=");
        sb.append((Object) ("SdkVersion(value=" + this.f10492c + ')'));
        sb.append(')');
        return sb.toString();
    }
}
