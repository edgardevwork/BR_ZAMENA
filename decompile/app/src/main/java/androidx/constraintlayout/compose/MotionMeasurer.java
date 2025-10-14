package androidx.constraintlayout.compose;

import android.graphics.Matrix;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathEffect;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.motion.widget.Key;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MotionLayout.kt */
@Metadata(m7104d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0016J4\u0010\f\u001a\u00020\n2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0012\u0010\u0017\u001a\u00020\n2\n\u0010\r\u001a\u00060\u000ej\u0002`\u000fJ&\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010 \u001a\u00020\u0004J(\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010%2\u0006\u0010\u0014\u001a\u00020\u0004J;\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b.\u0010/J\u001d\u00100\u001a\u0002012\u0006\u0010,\u001a\u00020-H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b2\u00103Jc\u00104\u001a\u0002052\u0006\u0010,\u001a\u00020-2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010:\u001a\u00020;ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b<\u0010=Je\u0010>\u001a\u00020\n2\u0006\u0010,\u001a\u00020-2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020#2\b\u0010\u0005\u001a\u0004\u0018\u00010%2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*2\u0006\u0010'\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010?\u001a\u000201H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b@\u0010AJ\u0011\u0010B\u001a\u00020\n*\u00020CH\u0007¢\u0006\u0002\u0010DJ1\u0010E\u001a\u00020\n*\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\bL\u0010MJI\u0010N\u001a\u00020\n*\u00020F2\u0006\u0010O\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010Q\u001a\u00020H2\u0006\u0010R\u001a\u00020H2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020\u0019H\u0002ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\bS\u0010TR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006U"}, m7105d2 = {"Landroidx/constraintlayout/compose/MotionMeasurer;", "Landroidx/constraintlayout/compose/Measurer;", "()V", Key.MOTIONPROGRESS, "", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Landroidx/constraintlayout/core/state/Transition;", "getTransition", "()Landroidx/constraintlayout/core/state/Transition;", "clearConstraintSets", "", "computeLayoutResult", "encodeKeyFrames", "json", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "location", "", "types", "", "progress", CatchStreamerKeys.COUNT_KEY, "", "encodeRoot", "getCustomColor", "Landroidx/compose/ui/graphics/Color;", "id", "", "name", "getCustomColor-WaAFU9c", "(Ljava/lang/String;Ljava/lang/String;)J", "getCustomFloat", "getProgress", "initWith", TtmlNode.START, "Landroidx/constraintlayout/compose/ConstraintSet;", "end", "Landroidx/constraintlayout/compose/Transition;", "measureConstraintSet", "optimizationLevel", "constraintSet", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measureConstraintSet--hBUhpc", "(ILandroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;J)V", "needsRemeasure", "", "needsRemeasure-BRTryo0", "(J)Z", "performInterpolationMeasure", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "constraintSetStart", "constraintSetEnd", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "performInterpolationMeasure-OQbXsTc", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFLandroidx/compose/ui/layout/MeasureScope;)J", "recalculateInterpolation", "remeasure", "recalculateInterpolation-36Wf7g4", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/ConstraintSet;Landroidx/constraintlayout/compose/Transition;Ljava/util/List;IFZ)V", "drawDebug", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;Landroidx/compose/runtime/Composer;I)V", "drawFrame", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", TypedValues.AttributesType.S_FRAME, "Landroidx/constraintlayout/core/state/WidgetFrame;", "pathEffect", "Landroidx/compose/ui/graphics/PathEffect;", "color", "drawFrame-g2O1Hgs", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "drawFrameDebug", "parentWidth", "parentHeight", "startFrame", "endFrame", "drawFrameDebug-PE3pjmc", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;FFLandroidx/constraintlayout/core/state/WidgetFrame;Landroidx/constraintlayout/core/state/WidgetFrame;Landroidx/compose/ui/graphics/PathEffect;J)V", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
@PublishedApi
/* loaded from: classes2.dex */
public final class MotionMeasurer extends Measurer {
    public float motionProgress;

    @NotNull
    public final androidx.constraintlayout.core.state.Transition transition = new androidx.constraintlayout.core.state.Transition();

    /* compiled from: MotionLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionMeasurer$drawDebug$2 */
    /* loaded from: classes3.dex */
    public static final class C21242 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ BoxScope $this_drawDebug;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21242(BoxScope boxScope, int i) {
            super(2);
            boxScope = boxScope;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            MotionMeasurer.this.drawDebug(boxScope, composer, i | 1);
        }
    }

    @NotNull
    public final androidx.constraintlayout.core.state.Transition getTransition() {
        return this.transition;
    }

    /* renamed from: getProgress, reason: from getter */
    public final float getMotionProgress() {
        return this.motionProgress;
    }

    /* renamed from: measureConstraintSet--hBUhpc */
    public final void m14010measureConstraintSethBUhpc(int optimizationLevel, ConstraintSet constraintSet, List<? extends Measurable> measurables, long constraints) throws NumberFormatException {
        String string;
        getState().reset();
        constraintSet.applyTo(getState(), measurables);
        getState().apply(getRoot());
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(children, "root.children");
        int size = children.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                children.get(i).setAnimated(true);
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        m13979applyRootSizeBRTryo0(constraints);
        getRoot().updateHierarchy();
        if (MotionLayoutKt.DEBUG) {
            getRoot().setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children2 = getRoot().getChildren();
            Intrinsics.checkNotNullExpressionValue(children2, "root.children");
            for (ConstraintWidget constraintWidget : children2) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                Object layoutId = measurable == null ? null : LayoutIdKt.getLayoutId(measurable);
                String str = "NOTAG";
                if (layoutId != null && (string = layoutId.toString()) != null) {
                    str = string;
                }
                constraintWidget.setDebugName(str);
            }
        }
        ArrayList<ConstraintWidget> children3 = getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(children3, "root.children");
        for (ConstraintWidget constraintWidget2 : children3) {
            Object companionWidget2 = constraintWidget2.getCompanionWidget();
            Measurable measurable2 = companionWidget2 instanceof Measurable ? (Measurable) companionWidget2 : null;
            Object layoutId2 = measurable2 == null ? null : LayoutIdKt.getLayoutId(measurable2);
            if (layoutId2 == null) {
                layoutId2 = measurable2 == null ? null : ConstraintLayoutTagKt.getConstraintLayoutId(measurable2);
            }
            constraintWidget2.stringId = layoutId2 == null ? null : layoutId2.toString();
        }
        getRoot().setOptimizationLevel(optimizationLevel);
        getRoot().measure(0, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006c  */
    /* renamed from: performInterpolationMeasure-OQbXsTc */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long m14012performInterpolationMeasureOQbXsTc(long constraints, @NotNull LayoutDirection layoutDirection, @NotNull ConstraintSet constraintSetStart, @NotNull ConstraintSet constraintSetEnd, @Nullable Transition transition, @NotNull List<? extends Measurable> measurables, int optimizationLevel, float progress, @NotNull MeasureScope measureScope) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(constraintSetStart, "constraintSetStart");
        Intrinsics.checkNotNullParameter(constraintSetEnd, "constraintSetEnd");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        setDensity(measureScope);
        setMeasureScope(measureScope);
        boolean zM14011needsRemeasureBRTryo0 = m14011needsRemeasureBRTryo0(constraints);
        if (this.motionProgress == progress) {
            LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
            Integer numValueOf = layoutInformationReceiver == null ? null : Integer.valueOf(layoutInformationReceiver.getForcedWidth());
            if (numValueOf == null || numValueOf.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver2 = getLayoutInformationReceiver();
                Integer numValueOf2 = layoutInformationReceiver2 != null ? Integer.valueOf(layoutInformationReceiver2.getForcedHeight()) : null;
                if (numValueOf2 != null && numValueOf2.intValue() == Integer.MIN_VALUE) {
                }
            } else if (zM14011needsRemeasureBRTryo0) {
                m14013recalculateInterpolation36Wf7g4(constraints, layoutDirection, constraintSetStart, constraintSetEnd, transition, measurables, optimizationLevel, progress, zM14011needsRemeasureBRTryo0);
            }
        }
        return IntSizeKt.IntSize(getRoot().getWidth(), getRoot().getHeight());
    }

    /* renamed from: needsRemeasure-BRTryo0 */
    public final boolean m14011needsRemeasureBRTryo0(long constraints) {
        WidgetFrame interpolated;
        Placeable placeable;
        if (this.transition.isEmpty() || getFrameCache().isEmpty()) {
            return true;
        }
        if ((Constraints.m13619getHasFixedHeightimpl(constraints) && !getState().sameFixedHeight(Constraints.m13621getMaxHeightimpl(constraints))) || (Constraints.m13620getHasFixedWidthimpl(constraints) && !getState().sameFixedWidth(Constraints.m13622getMaxWidthimpl(constraints)))) {
            return true;
        }
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(children, "root.children");
        int size = children.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                ConstraintWidget constraintWidget = children.get(i);
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                if (measurable != null && (interpolated = getTransition().getInterpolated(constraintWidget)) != null && (placeable = getPlaceables().get(measurable)) != null) {
                    int width = placeable.getWidth();
                    int height = placeable.getHeight();
                    if (width != interpolated.width() || height != interpolated.height()) {
                        return true;
                    }
                }
                if (i2 > size) {
                    break;
                }
                i = i2;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0128  */
    /* renamed from: recalculateInterpolation-36Wf7g4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m14013recalculateInterpolation36Wf7g4(long constraints, LayoutDirection layoutDirection, ConstraintSet constraintSetStart, ConstraintSet constraintSetEnd, Transition transition, List<? extends Measurable> measurables, int optimizationLevel, float progress, boolean remeasure) throws NumberFormatException {
        WidgetFrame interpolated;
        androidx.constraintlayout.core.state.Dimension dimensionMin;
        androidx.constraintlayout.core.state.Dimension dimensionMin2;
        this.motionProgress = progress;
        int i = 0;
        if (remeasure) {
            this.transition.clear();
            resetMeasureState$compose_release();
            getState().reset();
            State state = getState();
            if (Constraints.m13620getHasFixedWidthimpl(constraints)) {
                dimensionMin = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m13622getMaxWidthimpl(constraints));
            } else {
                dimensionMin = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m13624getMinWidthimpl(constraints));
            }
            state.width(dimensionMin);
            State state2 = getState();
            if (Constraints.m13619getHasFixedHeightimpl(constraints)) {
                dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Fixed(Constraints.m13621getMaxHeightimpl(constraints));
            } else {
                dimensionMin2 = androidx.constraintlayout.core.state.Dimension.Wrap().min(Constraints.m13623getMinHeightimpl(constraints));
            }
            state2.height(dimensionMin2);
            getState().m14015setRootIncomingConstraintsBRTryo0(constraints);
            getState().setLayoutDirection(layoutDirection);
            m14010measureConstraintSethBUhpc(optimizationLevel, constraintSetStart, measurables, constraints);
            this.transition.updateFrom(getRoot(), 0);
            m14010measureConstraintSethBUhpc(optimizationLevel, constraintSetEnd, measurables, constraints);
            this.transition.updateFrom(getRoot(), 1);
            if (transition != null) {
                transition.applyTo(this.transition, 0);
            }
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), progress);
        ArrayList<ConstraintWidget> children = getRoot().getChildren();
        Intrinsics.checkNotNullExpressionValue(children, "root.children");
        int size = children.size() - 1;
        if (size >= 0) {
            while (true) {
                int i2 = i + 1;
                ConstraintWidget constraintWidget = children.get(i);
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                if (measurable != null && (interpolated = getTransition().getInterpolated(constraintWidget)) != null) {
                    Placeable placeable = getPlaceables().get(measurable);
                    Integer numValueOf = placeable == null ? null : Integer.valueOf(placeable.getWidth());
                    Integer numValueOf2 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
                    if (placeable != null) {
                        int iWidth = interpolated.width();
                        if (numValueOf != null && numValueOf.intValue() == iWidth) {
                            int iHeight = interpolated.height();
                            if (numValueOf2 == null || numValueOf2.intValue() != iHeight) {
                                getPlaceables().put(measurable, measurable.mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(interpolated.width(), interpolated.height())));
                            }
                            getFrameCache().put(measurable, interpolated);
                        }
                    }
                }
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if ((layoutInformationReceiver != null ? layoutInformationReceiver.getLayoutInformationMode() : null) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    public final void encodeKeyFrames(StringBuilder json, float[] location, int[] types, int[] progress, int i) {
        if (i == 0) {
            return;
        }
        json.append("keyTypes : [");
        int i2 = 0;
        if (i > 0) {
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                int i5 = types[i3];
                StringBuilder sb = new StringBuilder();
                sb.append(' ');
                sb.append(i5);
                sb.append(',');
                json.append(sb.toString());
                if (i4 >= i) {
                    break;
                } else {
                    i3 = i4;
                }
            }
        }
        json.append("],\n");
        json.append("keyPos : [");
        int i6 = i * 2;
        if (i6 > 0) {
            int i7 = 0;
            while (true) {
                int i8 = i7 + 1;
                float f = location[i7];
                StringBuilder sb2 = new StringBuilder();
                sb2.append(' ');
                sb2.append(f);
                sb2.append(',');
                json.append(sb2.toString());
                if (i8 >= i6) {
                    break;
                } else {
                    i7 = i8;
                }
            }
        }
        json.append("],\n ");
        json.append("keyFrames : [");
        if (i > 0) {
            while (true) {
                int i9 = i2 + 1;
                int i10 = progress[i2];
                StringBuilder sb3 = new StringBuilder();
                sb3.append(' ');
                sb3.append(i10);
                sb3.append(',');
                json.append(sb3.toString());
                if (i9 >= i) {
                    break;
                } else {
                    i2 = i9;
                }
            }
        }
        json.append("],\n ");
    }

    public final void encodeRoot(@NotNull StringBuilder json) {
        Intrinsics.checkNotNullParameter(json, "json");
        json.append("  root: {");
        json.append("interpolated: { left:  0,");
        json.append("  top:  0,");
        json.append("  right:   " + getRoot().getWidth() + " ,");
        json.append("  bottom:  " + getRoot().getHeight() + " ,");
        json.append(" } }");
    }

    @Override // androidx.constraintlayout.compose.Measurer
    public void computeLayoutResult() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        encodeRoot(sb);
        int[] iArr = new int[50];
        int[] iArr2 = new int[50];
        float[] fArr = new float[100];
        Iterator<ConstraintWidget> it = getRoot().getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            WidgetFrame start = this.transition.getStart(next.stringId);
            WidgetFrame end = this.transition.getEnd(next.stringId);
            WidgetFrame interpolated = this.transition.getInterpolated(next.stringId);
            float[] path = this.transition.getPath(next.stringId);
            int keyFrames = this.transition.getKeyFrames(next.stringId, fArr, iArr, iArr2);
            sb.append(' ' + ((Object) next.stringId) + ": {");
            sb.append(" interpolated : ");
            interpolated.serialize(sb, true);
            sb.append(", start : ");
            start.serialize(sb);
            sb.append(", end : ");
            end.serialize(sb);
            encodeKeyFrames(sb, fArr, iArr, iArr2, keyFrames);
            sb.append(" path : [");
            Intrinsics.checkNotNullExpressionValue(path, "path");
            int length = path.length;
            int i = 0;
            while (i < length) {
                float f = path[i];
                i++;
                sb.append(' ' + f + " ,");
            }
            sb.append(" ] ");
            sb.append("}, ");
        }
        sb.append(" }");
        LayoutInformationReceiver layoutInformationReceiver = getLayoutInformationReceiver();
        if (layoutInformationReceiver == null) {
            return;
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        layoutInformationReceiver.setLayoutInformation(string);
    }

    /* compiled from: MotionLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.MotionMeasurer$drawDebug$1 */
    /* loaded from: classes3.dex */
    public static final class C21231 extends Lambda implements Function1<DrawScope, Unit> {
        public C21231() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
            Iterator<ConstraintWidget> it = MotionMeasurer.this.getRoot().getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                WidgetFrame startFrame = MotionMeasurer.this.getTransition().getStart(next);
                WidgetFrame endFrame = MotionMeasurer.this.getTransition().getEnd(next);
                MotionMeasurer motionMeasurer = MotionMeasurer.this;
                Canvas.getDrawContext().getTransform().translate(2.0f, 2.0f);
                float fM11168getWidthimpl = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                float fM11165getHeightimpl = Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc());
                Intrinsics.checkNotNullExpressionValue(startFrame, "startFrame");
                Intrinsics.checkNotNullExpressionValue(endFrame, "endFrame");
                Color.Companion companion = Color.INSTANCE;
                motionMeasurer.m14008drawFrameDebugPE3pjmc(Canvas, fM11168getWidthimpl, fM11165getHeightimpl, startFrame, endFrame, pathEffectDashPathEffect, companion.m11377getWhite0d7_KjU());
                Canvas.getDrawContext().getTransform().translate(-2.0f, -2.0f);
                MotionMeasurer.this.m14008drawFrameDebugPE3pjmc(Canvas, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), startFrame, endFrame, pathEffectDashPathEffect, companion.m11367getBlue0d7_KjU());
            }
        }
    }

    @Composable
    public final void drawDebug(@NotNull BoxScope boxScope, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(436942847);
        CanvasKt.Canvas(boxScope.matchParentSize(Modifier.INSTANCE), new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.MotionMeasurer.drawDebug.1
            public C21231() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                PathEffect pathEffectDashPathEffect = PathEffect.INSTANCE.dashPathEffect(new float[]{10.0f, 10.0f}, 0.0f);
                Iterator<ConstraintWidget> it = MotionMeasurer.this.getRoot().getChildren().iterator();
                while (it.hasNext()) {
                    ConstraintWidget next = it.next();
                    WidgetFrame startFrame = MotionMeasurer.this.getTransition().getStart(next);
                    WidgetFrame endFrame = MotionMeasurer.this.getTransition().getEnd(next);
                    MotionMeasurer motionMeasurer = MotionMeasurer.this;
                    Canvas.getDrawContext().getTransform().translate(2.0f, 2.0f);
                    float fM11168getWidthimpl = Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc());
                    float fM11165getHeightimpl = Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc());
                    Intrinsics.checkNotNullExpressionValue(startFrame, "startFrame");
                    Intrinsics.checkNotNullExpressionValue(endFrame, "endFrame");
                    Color.Companion companion = Color.INSTANCE;
                    motionMeasurer.m14008drawFrameDebugPE3pjmc(Canvas, fM11168getWidthimpl, fM11165getHeightimpl, startFrame, endFrame, pathEffectDashPathEffect, companion.m11377getWhite0d7_KjU());
                    Canvas.getDrawContext().getTransform().translate(-2.0f, -2.0f);
                    MotionMeasurer.this.m14008drawFrameDebugPE3pjmc(Canvas, Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()), startFrame, endFrame, pathEffectDashPathEffect, companion.m11367getBlue0d7_KjU());
                }
            }
        }, composerStartRestartGroup, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.MotionMeasurer.drawDebug.2
            public final /* synthetic */ int $$changed;
            public final /* synthetic */ BoxScope $this_drawDebug;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C21242(BoxScope boxScope2, int i2) {
                super(2);
                boxScope = boxScope2;
                i = i2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                MotionMeasurer.this.drawDebug(boxScope, composer2, i | 1);
            }
        });
    }

    /* renamed from: drawFrameDebug-PE3pjmc */
    public final void m14008drawFrameDebugPE3pjmc(DrawScope drawScope, float f, float f2, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, PathEffect pathEffect, long j) {
        m14007drawFrameg2O1Hgs(drawScope, widgetFrame, pathEffect, j);
        m14007drawFrameg2O1Hgs(drawScope, widgetFrame2, pathEffect, j);
        int numberKeyPositions = this.transition.getNumberKeyPositions(widgetFrame);
        new MotionRenderDebug(23.0f).draw(AndroidCanvas_androidKt.getNativeCanvas(drawScope.getDrawContext().getCanvas()), this.transition.getMotion(widgetFrame.widget.stringId), 1000, 1, (int) f, (int) f2);
        if (numberKeyPositions == 0) {
            return;
        }
        float[] fArr = new float[numberKeyPositions];
        float[] fArr2 = new float[numberKeyPositions];
        float[] fArr3 = new float[numberKeyPositions];
        this.transition.fillKeyPositions(widgetFrame, fArr, fArr2, fArr3);
        widgetFrame.centerX();
        widgetFrame.centerY();
        int i = numberKeyPositions - 1;
        if (i < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            float f3 = fArr3[i2] / 100.0f;
            float f4 = 1 - f3;
            float fWidth = (widgetFrame.width() * f4) + (widgetFrame2.width() * f3);
            float fHeight = (f4 * widgetFrame.height()) + (f3 * widgetFrame2.height());
            float f5 = (fArr[i2] * f) + (fWidth / 2.0f);
            float f6 = (fArr2[i2] * f2) + (fHeight / 2.0f);
            Path Path = AndroidPath_androidKt.Path();
            Path.moveTo(f5 - 20.0f, f6);
            Path.lineTo(f5, f6 + 20.0f);
            Path.lineTo(f5 + 20.0f, f6);
            Path.lineTo(f5, f6 - 20.0f);
            Path.close();
            DrawScope.m11880drawPathLG529CI$default(drawScope, Path, j, 1.0f, new Stroke(3.0f, 0.0f, 0, 0, null, 30, null), null, 0, 48, null);
            if (i2 == i) {
                return;
            } else {
                i2 = i3;
            }
        }
    }

    /* renamed from: drawFrame-g2O1Hgs */
    public final void m14007drawFrameg2O1Hgs(DrawScope drawScope, WidgetFrame widgetFrame, PathEffect pathEffect, long j) {
        if (widgetFrame.isDefaultTransform()) {
            DrawScope.m11884drawRectnJ9OG0$default(drawScope, j, OffsetKt.Offset(widgetFrame.left, widgetFrame.top), SizeKt.Size(widgetFrame.width(), widgetFrame.height()), 0.0f, new Stroke(3.0f, 0.0f, 0, 0, pathEffect, 14, null), null, 0, 104, null);
            return;
        }
        Matrix matrix = new Matrix();
        if (!Float.isNaN(widgetFrame.rotationZ)) {
            matrix.preRotate(widgetFrame.rotationZ, widgetFrame.centerX(), widgetFrame.centerY());
        }
        matrix.preScale(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX, Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY, widgetFrame.centerX(), widgetFrame.centerY());
        int i = widgetFrame.left;
        int i2 = widgetFrame.top;
        int i3 = widgetFrame.right;
        int i4 = widgetFrame.bottom;
        float[] fArr = {i, i2, i3, i2, i3, i4, i, i4};
        matrix.mapPoints(fArr);
        DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[0], fArr[1]), OffsetKt.Offset(fArr[2], fArr[3]), 3.0f, 0, pathEffect, 0.0f, null, 0, TarConstants.XSTAR_MULTIVOLUME_OFFSET, null);
        DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[2], fArr[3]), OffsetKt.Offset(fArr[4], fArr[5]), 3.0f, 0, pathEffect, 0.0f, null, 0, TarConstants.XSTAR_MULTIVOLUME_OFFSET, null);
        DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[4], fArr[5]), OffsetKt.Offset(fArr[6], fArr[7]), 3.0f, 0, pathEffect, 0.0f, null, 0, TarConstants.XSTAR_MULTIVOLUME_OFFSET, null);
        DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, OffsetKt.Offset(fArr[6], fArr[7]), OffsetKt.Offset(fArr[0], fArr[1]), 3.0f, 0, pathEffect, 0.0f, null, 0, TarConstants.XSTAR_MULTIVOLUME_OFFSET, null);
    }

    /* renamed from: getCustomColor-WaAFU9c */
    public final long m14009getCustomColorWaAFU9c(@NotNull String id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.transition.contains(id)) {
            return Color.INSTANCE.m11366getBlack0d7_KjU();
        }
        this.transition.interpolate(getRoot().getWidth(), getRoot().getHeight(), this.motionProgress);
        return ColorKt.Color(this.transition.getInterpolated(id).getCustomColor(name));
    }

    public final float getCustomFloat(@NotNull String id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        if (!this.transition.contains(id)) {
            return 0.0f;
        }
        WidgetFrame start = this.transition.getStart(id);
        WidgetFrame end = this.transition.getEnd(id);
        float customFloat = start.getCustomFloat(name);
        float customFloat2 = end.getCustomFloat(name);
        float f = this.motionProgress;
        return ((1.0f - f) * customFloat) + (f * customFloat2);
    }

    public final void clearConstraintSets() {
        this.transition.clear();
        getFrameCache().clear();
    }

    public final void initWith(@NotNull ConstraintSet constraintSet, @NotNull ConstraintSet end, @Nullable Transition transition, float progress) {
        Intrinsics.checkNotNullParameter(constraintSet, "start");
        Intrinsics.checkNotNullParameter(end, "end");
        clearConstraintSets();
        constraintSet.applyTo(this.transition, 0);
        end.applyTo(this.transition, 1);
        this.transition.interpolate(0, 0, progress);
        if (transition == null) {
            return;
        }
        transition.applyTo(this.transition, 0);
    }
}
