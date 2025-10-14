package com.sdkit.paylib.paylibnative.p033ui.utils.ext;

import androidx.activity.OnBackPressedCallback;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.ext.c */
/* loaded from: classes6.dex */
public final class C8366c extends OnBackPressedCallback {

    /* renamed from: a */
    public final Function0 f3670a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8366c(boolean z, Function0 handler) {
        super(z);
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f3670a = handler;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        this.f3670a.invoke();
    }
}
