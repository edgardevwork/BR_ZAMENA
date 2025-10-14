package androidx.compose.foundation;

import android.graphics.Rect;
import android.view.View;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RectListNode.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0002\u0010\bJ\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0007H\u0002J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H&J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0006H\u0016J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u0002J\u0016\u0010\u001c\u001a\u00020\u00172\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H&R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m7105d2 = {"Landroidx/compose/foundation/RectListNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "rect", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/geometry/Rect;", "(Lkotlin/jvm/functions/Function1;)V", "androidRect", "Landroid/graphics/Rect;", "getRect", "()Lkotlin/jvm/functions/Function1;", "setRect", SVG.View.NODE_NAME, "Landroid/view/View;", "getView", "()Landroid/view/View;", "calcBounds", "layoutCoordinates", "currentRects", "Landroidx/compose/runtime/collection/MutableVector;", "onDetach", "", "onGloballyPositioned", "coordinates", "replaceRect", "newRect", "updateRects", "rects", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRectListNode.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,99:1\n1#2:100\n728#3,2:101\n*S KotlinDebug\n*F\n+ 1 RectListNode.android.kt\nandroidx/compose/foundation/RectListNode\n*L\n69#1:101,2\n*E\n"})
/* loaded from: classes3.dex */
public abstract class RectListNode extends Modifier.Node implements GlobalPositionAwareModifierNode, CompositionLocalConsumerModifierNode {
    public static final int $stable = 8;

    @Nullable
    private Rect androidRect;

    @Nullable
    private Function1<? super LayoutCoordinates, androidx.compose.p003ui.geometry.Rect> rect;

    @NotNull
    public abstract MutableVector<Rect> currentRects();

    public abstract void updateRects(@NotNull MutableVector<Rect> rects);

    @Nullable
    public Function1<LayoutCoordinates, androidx.compose.p003ui.geometry.Rect> getRect() {
        return this.rect;
    }

    public void setRect(@Nullable Function1<? super LayoutCoordinates, androidx.compose.p003ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    public RectListNode(@Nullable Function1<? super LayoutCoordinates, androidx.compose.p003ui.geometry.Rect> function1) {
        this.rect = function1;
    }

    @NotNull
    public final View getView() {
        return (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(this, AndroidCompositionLocals_androidKt.getLocalView());
    }

    @Override // androidx.compose.p003ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Rect rectCalcBounds;
        if (getRect() == null) {
            androidx.compose.p003ui.geometry.Rect rectBoundsInRoot = LayoutCoordinatesKt.boundsInRoot(coordinates);
            rectCalcBounds = new Rect(MathKt__MathJVMKt.roundToInt(rectBoundsInRoot.getLeft()), MathKt__MathJVMKt.roundToInt(rectBoundsInRoot.getTop()), MathKt__MathJVMKt.roundToInt(rectBoundsInRoot.getRight()), MathKt__MathJVMKt.roundToInt(rectBoundsInRoot.getBottom()));
        } else {
            Function1<LayoutCoordinates, androidx.compose.p003ui.geometry.Rect> rect = getRect();
            Intrinsics.checkNotNull(rect);
            rectCalcBounds = calcBounds(coordinates, rect.invoke(coordinates));
        }
        replaceRect(rectCalcBounds);
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        super.onDetach();
        replaceRect(null);
    }

    private final void replaceRect(Rect newRect) {
        MutableVector<Rect> mutableVectorCurrentRects = currentRects();
        Rect rect = this.androidRect;
        if (rect != null) {
            mutableVectorCurrentRects.remove(rect);
        }
        if (newRect != null && !newRect.isEmpty()) {
            mutableVectorCurrentRects.add(newRect);
        }
        updateRects(mutableVectorCurrentRects);
        this.androidRect = newRect;
    }

    private final Rect calcBounds(LayoutCoordinates layoutCoordinates, androidx.compose.p003ui.geometry.Rect rect) {
        LayoutCoordinates layoutCoordinatesFindRootCoordinates = LayoutCoordinatesKt.findRootCoordinates(layoutCoordinates);
        long jMo12618localPositionOfR5De75A = layoutCoordinatesFindRootCoordinates.mo12618localPositionOfR5De75A(layoutCoordinates, rect.m11134getTopLeftF1C5BW0());
        long jMo12618localPositionOfR5De75A2 = layoutCoordinatesFindRootCoordinates.mo12618localPositionOfR5De75A(layoutCoordinates, rect.m11135getTopRightF1C5BW0());
        long jMo12618localPositionOfR5De75A3 = layoutCoordinatesFindRootCoordinates.mo12618localPositionOfR5De75A(layoutCoordinates, rect.m11127getBottomLeftF1C5BW0());
        long jMo12618localPositionOfR5De75A4 = layoutCoordinatesFindRootCoordinates.mo12618localPositionOfR5De75A(layoutCoordinates, rect.m11128getBottomRightF1C5BW0());
        return new Rect(MathKt__MathJVMKt.roundToInt(ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m11099getXimpl(jMo12618localPositionOfR5De75A), Offset.m11099getXimpl(jMo12618localPositionOfR5De75A2), Offset.m11099getXimpl(jMo12618localPositionOfR5De75A3), Offset.m11099getXimpl(jMo12618localPositionOfR5De75A4))), MathKt__MathJVMKt.roundToInt(ComparisonsKt___ComparisonsJvmKt.minOf(Offset.m11100getYimpl(jMo12618localPositionOfR5De75A), Offset.m11100getYimpl(jMo12618localPositionOfR5De75A2), Offset.m11100getYimpl(jMo12618localPositionOfR5De75A3), Offset.m11100getYimpl(jMo12618localPositionOfR5De75A4))), MathKt__MathJVMKt.roundToInt(ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m11099getXimpl(jMo12618localPositionOfR5De75A), Offset.m11099getXimpl(jMo12618localPositionOfR5De75A2), Offset.m11099getXimpl(jMo12618localPositionOfR5De75A3), Offset.m11099getXimpl(jMo12618localPositionOfR5De75A4))), MathKt__MathJVMKt.roundToInt(ComparisonsKt___ComparisonsJvmKt.maxOf(Offset.m11100getYimpl(jMo12618localPositionOfR5De75A), Offset.m11100getYimpl(jMo12618localPositionOfR5De75A2), Offset.m11100getYimpl(jMo12618localPositionOfR5De75A3), Offset.m11100getYimpl(jMo12618localPositionOfR5De75A4))));
    }
}
