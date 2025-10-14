package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.r */
/* loaded from: classes7.dex */
public final class C9815r {

    /* renamed from: a */
    public final WeakHashMap f8963a = new WeakHashMap();

    /* renamed from: a */
    public final boolean m6721a(Activity activity, EnumC9790q enumC9790q) {
        if (activity != null && this.f8963a.get(activity) == enumC9790q) {
            return false;
        }
        if (activity == null) {
            return true;
        }
        this.f8963a.put(activity, enumC9790q);
        return true;
    }
}
