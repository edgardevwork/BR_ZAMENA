package com.sdkit.paylib.paylibnative.p033ui.utils.viewmodels;

import java.util.Map;
import javax.inject.Provider;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.viewmodels.a */
/* loaded from: classes6.dex */
public abstract class AbstractC8377a {

    /* renamed from: a */
    public final Map f3687a;

    /* renamed from: b */
    public final Map f3688b;

    public AbstractC8377a(Map withoutArgs, Map withAssisted) {
        Intrinsics.checkNotNullParameter(withoutArgs, "withoutArgs");
        Intrinsics.checkNotNullParameter(withAssisted, "withAssisted");
        this.f3687a = withoutArgs;
        this.f3688b = withAssisted;
    }

    /* renamed from: a */
    public Provider m3483a(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Provider provider = (Provider) this.f3687a.get(clazz);
        if (provider != null) {
            return provider;
        }
        throw new IllegalStateException("There is no ViewModel provider for ".concat(clazz.getSimpleName()).toString());
    }

    public /* synthetic */ AbstractC8377a(Map map, Map map2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? MapsKt__MapsKt.emptyMap() : map2);
    }
}
