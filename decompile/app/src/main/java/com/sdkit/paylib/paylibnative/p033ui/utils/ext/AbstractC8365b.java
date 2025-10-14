package com.sdkit.paylib.paylibnative.p033ui.utils.ext;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.b */
/* loaded from: classes5.dex */
public abstract class AbstractC8365b {
    /* renamed from: a */
    public static final void m3437a(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        String tag = fragment.getTag();
        int id = fragment.getId();
        FragmentManager recreateSelf$lambda$2 = fragment.getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(recreateSelf$lambda$2, "recreateSelf$lambda$2");
        FragmentTransaction fragmentTransactionBeginTransaction = recreateSelf$lambda$2.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction()");
        fragmentTransactionBeginTransaction.remove(fragment);
        fragmentTransactionBeginTransaction.commitNow();
        FragmentTransaction fragmentTransactionBeginTransaction2 = recreateSelf$lambda$2.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction2, "beginTransaction()");
        fragmentTransactionBeginTransaction2.add(id, fragment, tag);
        fragmentTransactionBeginTransaction2.commitNow();
    }

    /* renamed from: a */
    public static final void m3438a(Fragment fragment, Function0 onBackPressed) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        fragment.requireActivity().getOnBackPressedDispatcher().addCallback(fragment.getViewLifecycleOwner(), new C8366c(true, onBackPressed));
    }
}
