package com.blackhub.bronline.game.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UIContainer.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class UIContainer extends FrameLayout {
    public static final int $stable = 8;
    public int currentLayoutId;

    @Nullable
    public Stack<Integer> mBackstack;

    @NotNull
    public ArrayList<UILayout> mLayouts;

    public final int getCurrentLayoutId() {
        return this.currentLayoutId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIContainer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mLayouts = new ArrayList<>();
        this.currentLayoutId = -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mLayouts = new ArrayList<>();
        this.currentLayoutId = -1;
        this.mLayouts = new ArrayList<>();
        this.mBackstack = new Stack<>();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UIContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.mLayouts = new ArrayList<>();
        this.currentLayoutId = -1;
        this.mLayouts = new ArrayList<>();
        this.mBackstack = new Stack<>();
    }

    public final void showLayout(int id) {
        UILayout uILayout;
        UILayout uILayout2;
        int i = this.currentLayoutId;
        if (i == id) {
            UILayout uILayout3 = this.mLayouts.get(id);
            if (uILayout3 != null) {
                uILayout3.onLayoutShown();
                return;
            }
            return;
        }
        if (i != -1 && (uILayout2 = this.mLayouts.get(i)) != null) {
            uILayout2.onLayoutClose();
        }
        removeAllViews();
        if (id == -1 || (uILayout = this.mLayouts.get(id)) == null) {
            return;
        }
        if (uILayout.getView() == null) {
            Object systemService = getContext().getSystemService("layout_inflater");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
            uILayout.onCreateView((LayoutInflater) systemService, this);
        } else {
            if (uILayout.getView().getParent() != null) {
                ViewParent parent = uILayout.getView().getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
                ((ViewGroup) parent).removeView(uILayout.getView());
            }
            addView(uILayout.getView());
        }
        uILayout.onLayoutShown();
    }

    @Nullable
    public final UILayout getLayout(int id) {
        if (this.mLayouts.size() > id) {
            return this.mLayouts.get(id);
        }
        return null;
    }

    public final void addLayout(int id, @Nullable UILayout layout) {
        while (this.mLayouts.size() < id) {
            this.mLayouts.add(null);
        }
        this.mLayouts.add(id, layout);
        if (layout != null) {
            layout.setParent(this);
        }
        Object systemService = getContext().getSystemService("layout_inflater");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        LayoutInflater layoutInflater = (LayoutInflater) systemService;
        if (layout != null) {
            layout.onCreateView(layoutInflater, this);
        }
    }

    public final void setCurrentLayout(int id) {
        Stack<Integer> stack;
        int i = this.currentLayoutId;
        if (i != -1 && (stack = this.mBackstack) != null) {
            stack.push(Integer.valueOf(i));
        }
        showLayout(id);
        this.currentLayoutId = id;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        UILayout uILayout;
        super.onDetachedFromWindow();
        int i = this.currentLayoutId;
        if (i == -1 || (uILayout = this.mLayouts.get(i)) == null) {
            return;
        }
        uILayout.onLayoutClose();
    }
}

