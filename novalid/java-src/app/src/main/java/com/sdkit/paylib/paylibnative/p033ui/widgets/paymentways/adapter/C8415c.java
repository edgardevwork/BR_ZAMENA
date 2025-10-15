package com.sdkit.paylib.paylibnative.p033ui.widgets.paymentways.adapter;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.sdkit.paylib.paylibnative.ui.widgets.paymentways.adapter.c */
/* loaded from: classes6.dex */
public final class C8415c extends RecyclerView.ItemDecoration {

    /* renamed from: a */
    public final int f3893a;

    /* renamed from: b */
    public final int f3894b;

    public C8415c(int i, int i2) {
        this.f3893a = i;
        this.f3894b = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int i = this.f3893a;
        outRect.left = i;
        outRect.right = i;
        if (parent.getChildAdapterPosition(view) == 0) {
            outRect.top = this.f3894b;
        }
    }
}
