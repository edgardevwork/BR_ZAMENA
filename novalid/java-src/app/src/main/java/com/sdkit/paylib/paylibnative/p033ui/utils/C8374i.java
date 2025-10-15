package com.sdkit.paylib.paylibnative.p033ui.utils;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.utils.i */
/* loaded from: classes6.dex */
public final class C8374i extends ViewOutlineProvider {

    /* renamed from: a */
    public final float f3686a;

    public C8374i(float f) {
        this.f3686a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f3686a);
    }
}
