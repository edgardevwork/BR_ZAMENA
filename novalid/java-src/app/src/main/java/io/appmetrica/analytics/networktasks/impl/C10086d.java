package io.appmetrica.analytics.networktasks.impl;

import io.appmetrica.analytics.networktasks.internal.NetworkTask;

/* renamed from: io.appmetrica.analytics.networktasks.impl.d */
/* loaded from: classes7.dex */
public final class C10086d {

    /* renamed from: a */
    public final NetworkTask f9560a;

    /* renamed from: b */
    public final String f9561b;

    public C10086d(NetworkTask networkTask) {
        this.f9560a = networkTask;
        this.f9561b = networkTask.description();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10086d.class != obj.getClass()) {
            return false;
        }
        return this.f9561b.equals(((C10086d) obj).f9561b);
    }

    public final int hashCode() {
        return this.f9561b.hashCode();
    }
}
