package com.sdkit.paylib.paylibdesign.views.shimmers;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.facebook.shimmer.ShimmerFrameLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;

@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0014R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, m7105d2 = {"Lcom/sdkit/paylib/paylibdesign/views/shimmers/CompanionRegularShimmerLayout;", "Landroid/widget/FrameLayout;", "", "onFinishInflate", "Landroid/content/Context;", "a", "Landroid/content/Context;", "layoutContext", "Landroid/util/AttributeSet;", "b", "Landroid/util/AttributeSet;", "attributeSet", "", "c", "I", "defStyleAttr", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "d", "Lcom/facebook/shimmer/ShimmerFrameLayout;", "shimmerLayout", SegmentConstantPool.INITSTRING, "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com-sdkit-assistant_paylib_design"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CompanionRegularShimmerLayout extends FrameLayout {

    /* renamed from: a, reason: from kotlin metadata */
    public final Context layoutContext;

    /* renamed from: b, reason: from kotlin metadata */
    public final AttributeSet attributeSet;

    /* renamed from: c, reason: from kotlin metadata */
    public final int defStyleAttr;

    /* renamed from: d, reason: from kotlin metadata */
    public ShimmerFrameLayout shimmerLayout;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompanionRegularShimmerLayout(Context layoutContext) {
        this(layoutContext, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(layoutContext, "layoutContext");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        ShimmerFrameLayout shimmerFrameLayout = new ShimmerFrameLayout(this.layoutContext);
        shimmerFrameLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.shimmerLayout = shimmerFrameLayout;
        addView(shimmerFrameLayout);
        while (getChildAt(0) != null) {
            View childAt = getChildAt(0);
            ShimmerFrameLayout shimmerFrameLayout2 = this.shimmerLayout;
            ShimmerFrameLayout shimmerFrameLayout3 = null;
            if (shimmerFrameLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shimmerLayout");
                shimmerFrameLayout2 = null;
            }
            if (Intrinsics.areEqual(childAt, shimmerFrameLayout2)) {
                return;
            }
            View childAt2 = getChildAt(0);
            removeView(childAt2);
            ShimmerFrameLayout shimmerFrameLayout4 = this.shimmerLayout;
            if (shimmerFrameLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shimmerLayout");
            } else {
                shimmerFrameLayout3 = shimmerFrameLayout4;
            }
            shimmerFrameLayout3.addView(childAt2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CompanionRegularShimmerLayout(Context layoutContext, AttributeSet attributeSet) {
        this(layoutContext, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(layoutContext, "layoutContext");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CompanionRegularShimmerLayout(Context layoutContext, AttributeSet attributeSet, int i) {
        super(layoutContext, attributeSet, i);
        Intrinsics.checkNotNullParameter(layoutContext, "layoutContext");
        this.layoutContext = layoutContext;
        this.attributeSet = attributeSet;
        this.defStyleAttr = i;
    }

    public /* synthetic */ CompanionRegularShimmerLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
