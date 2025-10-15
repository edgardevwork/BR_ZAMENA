package ru.rustore.sdk.billingclient.impl.data.model;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8032c;
import com.sdkit.paylib.paylibdomain.impl.entity.C8054b;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.billingclient.impl.data.model.a */
/* loaded from: classes5.dex */
public final class C11453a {

    /* renamed from: a */
    public final URL f10237a;

    /* renamed from: b */
    public final int f10238b;

    /* renamed from: c */
    public final String f10239c;

    public C11453a(URL requestUrl, int i, String responseBody) {
        Intrinsics.checkNotNullParameter(requestUrl, "requestUrl");
        Intrinsics.checkNotNullParameter(responseBody, "responseBody");
        this.f10237a = requestUrl;
        this.f10238b = i;
        this.f10239c = responseBody;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11453a)) {
            return false;
        }
        C11453a c11453a = (C11453a) obj;
        return Intrinsics.areEqual(this.f10237a, c11453a.f10237a) && this.f10238b == c11453a.f10238b && Intrinsics.areEqual(this.f10239c, c11453a.f10239c);
    }

    public final int hashCode() {
        return this.f10239c.hashCode() + C8054b.m1525a(this.f10238b, this.f10237a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkRequestResult(requestUrl=");
        sb.append(this.f10237a);
        sb.append(", responseCode=");
        sb.append(this.f10238b);
        sb.append(", responseBody=");
        return C8032c.m1430a(sb, this.f10239c, ')');
    }
}
