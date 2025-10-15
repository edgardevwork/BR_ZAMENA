package com.sdkit.paylib.paylibnative.p033ui.rootcontainer.bottomsheet;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sdkit.paylib.paylibnative.p033ui.utils.ext.AbstractC8370g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.osgi.p063p2.P2CompositeParser;
import ru.rustore.sdk.billingclient.C11403R;

@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\"\u0010#J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\u000bJ?\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\n\u0010\u0014JG\u0010\n\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\n\u0010\u001aJ/\u0010\n\u001a\u00020\u00192\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\n\u0010\u001bJ7\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\n\u0010\u001fR\u0016\u0010!\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 ¨\u0006$"}, m7105d2 = {"Lcom/sdkit/paylib/paylibnative/ui/rootcontainer/bottomsheet/BottomSheetWithHandleBehavior;", "Landroid/view/ViewGroup;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", P2CompositeParser.ChildHandler.CHILD, "Landroid/view/MotionEvent;", "event", "", "a", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/ViewGroup;Landroid/view/MotionEvent;)Z", "b", "coordinatorLayout", "Landroid/view/View;", "directTargetChild", "target", "", "axes", "type", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;II)Z", "dx", "dy", "", "consumed", "", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/ViewGroup;Landroid/view/View;II[II)V", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/ViewGroup;Landroid/view/View;I)V", "", "velocityX", "velocityY", "(Landroidx/coordinatorlayout/widget/CoordinatorLayout;Landroid/view/ViewGroup;Landroid/view/View;FF)Z", "Z", "shouldHandleTouches", SegmentConstantPool.INITSTRING, "()V", "com-sdkit-assistant_paylib_native"}, m7106k = 1, m7107mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class BottomSheetWithHandleBehavior<V extends ViewGroup> extends BottomSheetBehavior<V> {

    /* renamed from: a, reason: from kotlin metadata */
    public boolean shouldHandleTouches;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, ViewGroup child, View target, int type) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean onTouchEvent(CoordinatorLayout parent, ViewGroup child, MotionEvent event) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        return this.shouldHandleTouches && super.onTouchEvent(parent, child, event);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, ViewGroup child, View target, int dx, int dy, int[] consumed, int type) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(consumed, "consumed");
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onInterceptTouchEvent(CoordinatorLayout parent, ViewGroup child, MotionEvent event) {
        List listListOf;
        boolean z;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() == 0) {
            Point point = new Point(MathKt__MathJVMKt.roundToInt(event.getRawX()), MathKt__MathJVMKt.roundToInt(event.getRawY()));
            View viewFindViewById = child.findViewById(C11403R.id.bottom_sheet_handle);
            View viewFindViewById2 = child.findViewById(C11403R.id.bottom_sheet_default_handle);
            if (viewFindViewById == null || (listListOf = CollectionsKt__CollectionsKt.listOfNotNull((Object[]) new View[]{viewFindViewById, viewFindViewById2})) == null) {
                listListOf = CollectionsKt__CollectionsJVMKt.listOf(child);
            }
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listListOf, 10));
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC8370g.m3465a((View) it.next()));
            }
            if (arrayList.isEmpty()) {
                z = false;
                this.shouldHandleTouches = z;
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (((Rect) it2.next()).contains(point.x, point.y)) {
                        z = true;
                        break;
                    }
                }
                z = false;
                this.shouldHandleTouches = z;
            }
        }
        if (event.getAction() == 1) {
            this.shouldHandleTouches = false;
        }
        return this.shouldHandleTouches && super.onInterceptTouchEvent(parent, child, event);
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, ViewGroup child, View target, float velocityX, float velocityY) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, ViewGroup child, View directTargetChild, View target, int axes, int type) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
        Intrinsics.checkNotNullParameter(child, "child");
        Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
        Intrinsics.checkNotNullParameter(target, "target");
        return false;
    }
}
