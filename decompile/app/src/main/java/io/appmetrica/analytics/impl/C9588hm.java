package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Intent;
import androidx.appcompat.widget.ActivityChooserModel;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* renamed from: io.appmetrica.analytics.impl.hm */
/* loaded from: classes5.dex */
public final class C9588hm {

    /* renamed from: a */
    public final C9816r0 f8313a;

    /* renamed from: b */
    public final C8909Fn f8314b;

    /* renamed from: c */
    public final C9765p f8315c;

    /* renamed from: d */
    public final C9461ck f8316d;

    /* renamed from: e */
    public final C8989J5 f8317e;

    /* renamed from: f */
    public final C9401aa f8318f;

    public C9588hm(C9816r0 c9816r0, C8909Fn c8909Fn, C9765p c9765p, C9461ck c9461ck, C8989J5 c8989j5, C9401aa c9401aa) {
        this.f8313a = c9816r0;
        this.f8314b = c8909Fn;
        this.f8315c = c9765p;
        this.f8316d = c9461ck;
        this.f8317e = c8989j5;
        this.f8318f = c9401aa;
    }

    /* renamed from: a */
    public static Intent m6260a(Activity activity) {
        return (Intent) SystemServiceUtils.accessSystemServiceSafely(activity, "getting intent", ActivityChooserModel.ATTRIBUTE_ACTIVITY, new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.hm$$ExternalSyntheticLambda0
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return C9588hm.m6261b((Activity) obj);
            }
        });
    }

    /* renamed from: b */
    public static final Intent m6261b(Activity activity) {
        return activity.getIntent();
    }

    public C9588hm(C9816r0 c9816r0, C8909Fn c8909Fn) {
        this(c9816r0, c8909Fn, C9820r4.m6725i().m6727a(), C9820r4.m6725i().m6739m(), C9820r4.m6725i().m6733f(), C9820r4.m6725i().m6735h());
    }
}
