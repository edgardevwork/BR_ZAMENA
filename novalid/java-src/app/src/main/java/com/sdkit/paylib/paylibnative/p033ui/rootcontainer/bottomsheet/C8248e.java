package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet;

import android.graphics.Outline;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.rootcontainer.bottomsheet.e */
/* loaded from: classes8.dex */
public final class C8248e extends ViewOutlineProvider {
    @Override // android.view.ViewOutlineProvider
    public void getOutline(View view, Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        float fApplyDimension = TypedValue.applyDimension(1, 16.0f, view.getContext().getResources().getDisplayMetrics());
        int width = view.getWidth();
        int height = view.getHeight() + ((int) fApplyDimension);
        if (outline != null) {
            outline.setRoundRect(0, 0, width, height, fApplyDimension);
        }
    }
}
