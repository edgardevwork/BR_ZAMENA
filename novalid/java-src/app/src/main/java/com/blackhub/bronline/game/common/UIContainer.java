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
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0017\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0016H\u0014J\u000e\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tJ\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0002R\u001e\u0010\f\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0011\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0013`\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/UIContainer;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "currentLayoutId", "getCurrentLayoutId", "()I", "mBackstack", "Ljava/util/Stack;", "mLayouts", "Ljava/util/ArrayList;", "Lcom/blackhub/bronline/game/common/UILayout;", "Lkotlin/collections/ArrayList;", "addLayout", "", "id", TtmlNode.TAG_LAYOUT, "getLayout", "onDetachedFromWindow", "setCurrentLayout", "showLayout", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
