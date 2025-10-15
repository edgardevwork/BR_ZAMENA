package com.sdkit.paylib.paylibnative.p033ui.utils;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.ReadOnlyProperty;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.k */
/* loaded from: classes6.dex */
public abstract class AbstractC8376k {
    /* renamed from: a */
    public static final ReadOnlyProperty m3482a(Fragment fragment, Function1 viewBindingFactory) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(viewBindingFactory, "viewBindingFactory");
        return new FragmentViewBindingDelegate(fragment, viewBindingFactory);
    }
}
