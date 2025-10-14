package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.X9 */
/* loaded from: classes6.dex */
public final class C9328X9 {

    /* renamed from: c */
    public static volatile C9328X9 f7479c;

    /* renamed from: a */
    public final Context f7480a;

    /* renamed from: b */
    public final HashMap f7481b = new HashMap();

    public C9328X9(Context context) {
        this.f7480a = context;
    }

    /* renamed from: a */
    public static C9328X9 m5742a(Context context) {
        if (f7479c == null) {
            synchronized (C9328X9.class) {
                try {
                    if (f7479c == null) {
                        f7479c = new C9328X9(context);
                    }
                } finally {
                }
            }
        }
        return f7479c;
    }

    /* renamed from: a */
    public final C9900u9 m5743a(String str) {
        if (!this.f7481b.containsKey(str)) {
            synchronized (this) {
                try {
                    if (!this.f7481b.containsKey(str)) {
                        this.f7481b.put(str, new C9900u9(this.f7480a, str));
                    }
                } finally {
                }
            }
        }
        return (C9900u9) this.f7481b.get(str);
    }
}
