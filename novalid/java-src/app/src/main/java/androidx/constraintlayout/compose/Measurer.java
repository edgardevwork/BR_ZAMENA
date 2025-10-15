package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.GraphicsLayerScope;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.TransformOriginKt;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.AlignmentLineKt;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.LayoutIdKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.res.PainterResources_androidKt;
import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.input.VisualTransformation;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextAlign;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextDirection;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.text.style.TextIndent;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.unit.TextUnit;
import androidx.compose.p003ui.unit.TextUnitKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.state.WidgetFrame;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.Guideline;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.blackhub.bronline.game.gui.tuning.TuningConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ConstraintLayout.kt */
@Metadata(m7104d1 = {"\u0000ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0011\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010*J\u001d\u0010F\u001a\u00020D2\u0006\u0010G\u001a\u00020HH\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bI\u0010JJ\b\u0010K\u001a\u00020DH\u0016J\r\u0010L\u001a\u00020DH\u0007¢\u0006\u0002\u0010MJ\b\u0010N\u001a\u00020DH\u0016J)\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010R\u001a\u00020PH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bS\u0010TJ \u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020 2\u0006\u0010W\u001a\u00020 2\u0006\u0010X\u001a\u00020\u0005H\u0016J\u001c\u0010Y\u001a\u00020Z2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\\H\u0002J\u0018\u0010]\u001a\u00020D2\u0006\u0010^\u001a\u00020_2\u0006\u0010]\u001a\u00020`H\u0016JH\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020 2\u0006\u0010f\u001a\u00020 2\u0006\u0010g\u001a\u00020 2\u0006\u0010h\u001a\u00020b2\u0006\u0010i\u001a\u00020b2\u0006\u0010j\u001a\u00020 2\u0006\u0010k\u001a\u00020\u001dH\u0002J\u000e\u0010l\u001a\u00020D2\u0006\u0010m\u001a\u00020nJI\u0010o\u001a\u00020p2\u0006\u0010G\u001a\u00020H2\u0006\u0010q\u001a\u00020r2\u0006\u0010m\u001a\u00020n2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00180t2\u0006\u0010u\u001a\u00020 2\u0006\u0010/\u001a\u000200ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020DH\u0000¢\u0006\u0002\byJ\u001f\u0010z\u001a\u00020D*\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010]\u001a\u00020`H\u0002¢\u0006\u0002\u0010{J\u0019\u0010|\u001a\u00020D*\u00020}2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0002\u0010~J\u0019\u0010\u007f\u001a\u00020D*\u00030\u0080\u00012\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00180tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u000e0\rj\b\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f0\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010#\"\u0004\b(\u0010%R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u0010/\u001a\u000200X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R \u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u0002060\u0017X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010\u001bR\u0014\u00108\u001a\u000209X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001b\u0010<\u001a\u00020=8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b>\u0010?R\u000e\u0010B\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u0081\u0001"}, m7105d2 = {"Landroidx/constraintlayout/compose/Measurer;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measurer;", "Landroidx/constraintlayout/compose/DesignInfoProvider;", "()V", "computedLayoutResult", "", "density", "Landroidx/compose/ui/unit/Density;", "getDensity", "()Landroidx/compose/ui/unit/Density;", "setDensity", "(Landroidx/compose/ui/unit/Density;)V", "designElements", "Ljava/util/ArrayList;", "Landroidx/constraintlayout/compose/DesignElement;", "Lkotlin/collections/ArrayList;", "forcedScaleFactor", "", "getForcedScaleFactor", "()F", "setForcedScaleFactor", "(F)V", "frameCache", "", "Landroidx/compose/ui/layout/Measurable;", "Landroidx/constraintlayout/core/state/WidgetFrame;", "getFrameCache", "()Ljava/util/Map;", "heightConstraintsHolder", "", "lastMeasures", "", "", "layoutCurrentHeight", "getLayoutCurrentHeight", "()I", "setLayoutCurrentHeight", "(I)V", "layoutCurrentWidth", "getLayoutCurrentWidth", "setLayoutCurrentWidth", "layoutInformationReceiver", "Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "getLayoutInformationReceiver", "()Landroidx/constraintlayout/compose/LayoutInformationReceiver;", "setLayoutInformationReceiver", "(Landroidx/constraintlayout/compose/LayoutInformationReceiver;)V", "measureScope", "Landroidx/compose/ui/layout/MeasureScope;", "getMeasureScope", "()Landroidx/compose/ui/layout/MeasureScope;", "setMeasureScope", "(Landroidx/compose/ui/layout/MeasureScope;)V", "placeables", "Landroidx/compose/ui/layout/Placeable;", "getPlaceables", "root", "Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "getRoot", "()Landroidx/constraintlayout/core/widgets/ConstraintWidgetContainer;", "state", "Landroidx/constraintlayout/compose/State;", "getState", "()Landroidx/constraintlayout/compose/State;", "state$delegate", "Lkotlin/Lazy;", "widthConstraintsHolder", "addLayoutInformationReceiver", "", "layoutReceiver", "applyRootSize", "constraints", "Landroidx/compose/ui/unit/Constraints;", "applyRootSize-BRTryo0", "(J)V", "computeLayoutResult", "createDesignElements", "(Landroidx/compose/runtime/Composer;I)V", "didMeasures", "getColor", "Landroidx/compose/ui/graphics/Color;", "str", "defaultColor", "getColor-wrIjXm8", "(Ljava/lang/String;J)J", "getDesignInfo", "startX", "startY", "args", "getTextStyle", "Landroidx/compose/ui/text/TextStyle;", "params", "Ljava/util/HashMap;", "measure", "constraintWidget", "Landroidx/constraintlayout/core/widgets/ConstraintWidget;", "Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;", "obtainConstraints", "", "dimensionBehaviour", "Landroidx/constraintlayout/core/widgets/ConstraintWidget$DimensionBehaviour;", TypedValues.Custom.S_DIMENSION, "matchConstraintDefaultDimension", "measureStrategy", "otherDimensionResolved", "currentDimensionResolved", "rootMaxConstraint", "outConstraints", "parseDesignElements", "constraintSet", "Landroidx/constraintlayout/compose/ConstraintSet;", "performMeasure", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "measurables", "", "optimizationLevel", "performMeasure-DjhGOtQ", "(JLandroidx/compose/ui/unit/LayoutDirection;Landroidx/constraintlayout/compose/ConstraintSet;Ljava/util/List;ILandroidx/compose/ui/layout/MeasureScope;)J", "resetMeasureState", "resetMeasureState$compose_release", "copyFrom", "([Ljava/lang/Integer;Landroidx/constraintlayout/core/widgets/analyzer/BasicMeasure$Measure;)V", "drawDebugBounds", "Landroidx/compose/foundation/layout/BoxScope;", "(Landroidx/compose/foundation/layout/BoxScope;FLandroidx/compose/runtime/Composer;I)V", "performLayout", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "compose_release"}, m7106k = 1, m7107mv = {1, 5, 1}, m7109xi = 48)
@PublishedApi
/* loaded from: classes4.dex */
public class Measurer implements BasicMeasure.Measurer, DesignInfoProvider {

    @NotNull
    public String computedLayoutResult = "";
    public Density density;

    @NotNull
    public ArrayList<DesignElement> designElements;
    public float forcedScaleFactor;

    @NotNull
    public final Map<Measurable, WidgetFrame> frameCache;

    @NotNull
    public final int[] heightConstraintsHolder;

    @NotNull
    public final Map<Measurable, Integer[]> lastMeasures;
    public int layoutCurrentHeight;
    public int layoutCurrentWidth;

    @Nullable
    public LayoutInformationReceiver layoutInformationReceiver;
    public MeasureScope measureScope;

    @NotNull
    public final Map<Measurable, Placeable> placeables;

    @NotNull
    public final ConstraintWidgetContainer root;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    @NotNull
    public final Lazy state;

    @NotNull
    public final int[] widthConstraintsHolder;

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ConstraintWidget.DimensionBehaviour.values().length];
            iArr[ConstraintWidget.DimensionBehaviour.FIXED.ordinal()] = 1;
            iArr[ConstraintWidget.DimensionBehaviour.WRAP_CONTENT.ordinal()] = 2;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT.ordinal()] = 3;
            iArr[ConstraintWidget.DimensionBehaviour.MATCH_PARENT.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.Measurer$createDesignElements$3 */
    /* loaded from: classes3.dex */
    public static final class C21163 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21163(int i) {
            super(2);
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            Measurer.this.createDesignElements(composer, i | 1);
        }
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.Measurer$drawDebugBounds$2 */
    /* loaded from: classes3.dex */
    public static final class C21182 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ float $forcedScaleFactor;
        public final /* synthetic */ BoxScope $this_drawDebugBounds;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21182(BoxScope boxScope, float f, int i) {
            super(2);
            boxScope = boxScope;
            f = f;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            Measurer.this.drawDebugBounds(boxScope, f, composer, i | 1);
        }
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    public void didMeasures() {
    }

    public Measurer() {
        ConstraintWidgetContainer constraintWidgetContainer = new ConstraintWidgetContainer(0, 0);
        constraintWidgetContainer.setMeasurer(this);
        Unit unit = Unit.INSTANCE;
        this.root = constraintWidgetContainer;
        this.placeables = new LinkedHashMap();
        this.lastMeasures = new LinkedHashMap();
        this.frameCache = new LinkedHashMap();
        this.state = LazyKt__LazyJVMKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<State>() { // from class: androidx.constraintlayout.compose.Measurer$state$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final State invoke() {
                return new State(this.this$0.getDensity());
            }
        });
        this.widthConstraintsHolder = new int[2];
        this.heightConstraintsHolder = new int[2];
        this.forcedScaleFactor = Float.NaN;
        this.designElements = new ArrayList<>();
    }

    @Nullable
    public final LayoutInformationReceiver getLayoutInformationReceiver() {
        return this.layoutInformationReceiver;
    }

    public final void setLayoutInformationReceiver(@Nullable LayoutInformationReceiver layoutInformationReceiver) {
        this.layoutInformationReceiver = layoutInformationReceiver;
    }

    @NotNull
    public final ConstraintWidgetContainer getRoot() {
        return this.root;
    }

    @NotNull
    public final Map<Measurable, Placeable> getPlaceables() {
        return this.placeables;
    }

    @NotNull
    public final Map<Measurable, WidgetFrame> getFrameCache() {
        return this.frameCache;
    }

    @NotNull
    public final Density getDensity() {
        Density density = this.density;
        if (density != null) {
            return density;
        }
        Intrinsics.throwUninitializedPropertyAccessException("density");
        throw null;
    }

    public final void setDensity(@NotNull Density density) {
        Intrinsics.checkNotNullParameter(density, "<set-?>");
        this.density = density;
    }

    @NotNull
    public final MeasureScope getMeasureScope() {
        MeasureScope measureScope = this.measureScope;
        if (measureScope != null) {
            return measureScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("measureScope");
        throw null;
    }

    public final void setMeasureScope(@NotNull MeasureScope measureScope) {
        Intrinsics.checkNotNullParameter(measureScope, "<set-?>");
        this.measureScope = measureScope;
    }

    @NotNull
    public final State getState() {
        return (State) this.state.getValue();
    }

    public final float getForcedScaleFactor() {
        return this.forcedScaleFactor;
    }

    public final void setForcedScaleFactor(float f) {
        this.forcedScaleFactor = f;
    }

    public final int getLayoutCurrentWidth() {
        return this.layoutCurrentWidth;
    }

    public final void setLayoutCurrentWidth(int i) {
        this.layoutCurrentWidth = i;
    }

    public final int getLayoutCurrentHeight() {
        return this.layoutCurrentHeight;
    }

    public final void setLayoutCurrentHeight(int i) {
        this.layoutCurrentHeight = i;
    }

    @Override // androidx.constraintlayout.compose.DesignInfoProvider
    @NotNull
    public String getDesignInfo(int startX, int startY, @NotNull String args) {
        Intrinsics.checkNotNullParameter(args, "args");
        return ToolingUtilsKt.parseConstraintsToJson(this.root, getState(), startX, startY, args);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x010d  */
    @Override // androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measure(@NotNull ConstraintWidget constraintWidget, @NotNull BasicMeasure.Measure measure) {
        Integer num;
        Integer num2;
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(constraintWidget, "constraintWidget");
        Intrinsics.checkNotNullParameter(measure, "measure");
        Object companionWidget = constraintWidget.getCompanionWidget();
        if (companionWidget instanceof Measurable) {
            if (ConstraintLayoutKt.DEBUG) {
                Log.d("CCL", "Measuring " + LayoutIdKt.getLayoutId((Measurable) companionWidget) + " with: " + ConstraintLayoutKt.toDebugString(constraintWidget) + '\n' + ConstraintLayoutKt.toDebugString(measure));
            }
            Integer[] numArr = this.lastMeasures.get(companionWidget);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour = measure.horizontalBehavior;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour, "measure.horizontalBehavior");
            boolean z2 = false;
            obtainConstraints(dimensionBehaviour, measure.horizontalDimension, constraintWidget.mMatchConstraintDefaultWidth, measure.measureStrategy, ((numArr != null && (num = numArr[1]) != null) ? num.intValue() : 0) == constraintWidget.getHeight(), constraintWidget.isResolvedHorizontally(), Constraints.m13622getMaxWidthimpl(getState().getRootIncomingConstraints()), this.widthConstraintsHolder);
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = measure.verticalBehavior;
            Intrinsics.checkNotNullExpressionValue(dimensionBehaviour2, "measure.verticalBehavior");
            obtainConstraints(dimensionBehaviour2, measure.verticalDimension, constraintWidget.mMatchConstraintDefaultHeight, measure.measureStrategy, ((numArr != null && (num2 = numArr[0]) != null) ? num2.intValue() : 0) == constraintWidget.getWidth(), constraintWidget.isResolvedVertically(), Constraints.m13621getMaxHeightimpl(getState().getRootIncomingConstraints()), this.heightConstraintsHolder);
            int[] iArr = this.widthConstraintsHolder;
            int i = iArr[0];
            int i2 = iArr[1];
            int[] iArr2 = this.heightConstraintsHolder;
            long jConstraints = ConstraintsKt.Constraints(i, i2, iArr2[0], iArr2[1]);
            int i3 = measure.measureStrategy;
            if (i3 == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || i3 == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) {
                if (ConstraintLayoutKt.DEBUG) {
                    str = "CCL";
                    Log.d(str, "Measuring " + LayoutIdKt.getLayoutId((Measurable) companionWidget) + " with " + ((Object) Constraints.m13627toStringimpl(jConstraints)));
                } else {
                    str = "CCL";
                }
                Measurable measurable = (Measurable) companionWidget;
                Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(jConstraints);
                getPlaceables().put(companionWidget, placeableMo12610measureBRTryo0);
                constraintWidget.setMeasureRequested(false);
                if (ConstraintLayoutKt.DEBUG) {
                    Log.d(str, LayoutIdKt.getLayoutId(measurable) + " is size " + placeableMo12610measureBRTryo0.getWidth() + ' ' + placeableMo12610measureBRTryo0.getHeight());
                }
                Integer numValueOf = Integer.valueOf(placeableMo12610measureBRTryo0.getWidth());
                Integer numValueOf2 = Integer.valueOf(constraintWidget.mMatchConstraintMinWidth);
                if (numValueOf2.intValue() <= 0) {
                    numValueOf2 = null;
                }
                Integer numValueOf3 = Integer.valueOf(constraintWidget.mMatchConstraintMaxWidth);
                if (numValueOf3.intValue() <= 0) {
                    numValueOf3 = null;
                }
                int iIntValue = ((Number) RangesKt___RangesKt.coerceIn(numValueOf, numValueOf2, numValueOf3)).intValue();
                Integer numValueOf4 = Integer.valueOf(placeableMo12610measureBRTryo0.getHeight());
                Integer numValueOf5 = Integer.valueOf(constraintWidget.mMatchConstraintMinHeight);
                if (numValueOf5.intValue() <= 0) {
                    numValueOf5 = null;
                }
                Integer numValueOf6 = Integer.valueOf(constraintWidget.mMatchConstraintMaxHeight);
                if (numValueOf6.intValue() <= 0) {
                    numValueOf6 = null;
                }
                int iIntValue2 = ((Number) RangesKt___RangesKt.coerceIn(numValueOf4, numValueOf5, numValueOf6)).intValue();
                if (iIntValue != placeableMo12610measureBRTryo0.getWidth()) {
                    jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m13623getMinHeightimpl(jConstraints), Constraints.m13621getMaxHeightimpl(jConstraints));
                    z = true;
                } else {
                    z = false;
                }
                if (iIntValue2 != placeableMo12610measureBRTryo0.getHeight()) {
                    jConstraints = ConstraintsKt.Constraints(Constraints.m13624getMinWidthimpl(jConstraints), Constraints.m13622getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                    z = true;
                }
                if (z) {
                    if (ConstraintLayoutKt.DEBUG) {
                        Log.d(str, "Remeasuring coerced " + LayoutIdKt.getLayoutId(measurable) + " with " + ((Object) Constraints.m13627toStringimpl(jConstraints)));
                    }
                    getPlaceables().put(companionWidget, measurable.mo12610measureBRTryo0(jConstraints));
                    constraintWidget.setMeasureRequested(false);
                }
            } else {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = measure.horizontalBehavior;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                if (dimensionBehaviour3 != dimensionBehaviour4 || constraintWidget.mMatchConstraintDefaultWidth != 0 || measure.verticalBehavior != dimensionBehaviour4 || constraintWidget.mMatchConstraintDefaultHeight != 0) {
                }
            }
            Placeable placeable = this.placeables.get(companionWidget);
            Integer numValueOf7 = placeable == null ? null : Integer.valueOf(placeable.getWidth());
            measure.measuredWidth = numValueOf7 == null ? constraintWidget.getWidth() : numValueOf7.intValue();
            Integer numValueOf8 = placeable != null ? Integer.valueOf(placeable.getHeight()) : null;
            measure.measuredHeight = numValueOf8 == null ? constraintWidget.getHeight() : numValueOf8.intValue();
            int i4 = (placeable == null || !getState().isBaselineNeeded$compose_release(constraintWidget)) ? Integer.MIN_VALUE : placeable.get(AlignmentLineKt.getFirstBaseline());
            measure.measuredHasBaseline = i4 != Integer.MIN_VALUE;
            measure.measuredBaseline = i4;
            Map<Measurable, Integer[]> map = this.lastMeasures;
            Object obj = map.get(companionWidget);
            Object obj2 = obj;
            if (obj == null) {
                Integer[] numArr2 = {0, 0, Integer.MIN_VALUE};
                map.put(companionWidget, numArr2);
                obj2 = numArr2;
            }
            copyFrom((Integer[]) obj2, measure);
            if (measure.measuredWidth != measure.horizontalDimension || measure.measuredHeight != measure.verticalDimension) {
                z2 = true;
            }
            measure.measuredNeedsSolverPass = z2;
        }
    }

    public final void addLayoutInformationReceiver(@Nullable LayoutInformationReceiver layoutReceiver) {
        this.layoutInformationReceiver = layoutReceiver;
        if (layoutReceiver == null) {
            return;
        }
        layoutReceiver.setLayoutInformation(this.computedLayoutResult);
    }

    public void computeLayoutResult() {
        ConstraintWidget constraintWidget;
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        sb.append("  root: {");
        sb.append("interpolated: { left:  0,");
        sb.append("  top:  0,");
        sb.append("  right:   " + this.root.getWidth() + " ,");
        sb.append("  bottom:  " + this.root.getHeight() + " ,");
        sb.append(" } }");
        Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            Object companionWidget = next.getCompanionWidget();
            if (companionWidget instanceof Measurable) {
                WidgetFrame widgetFrame = null;
                if (next.stringId == null) {
                    Measurable measurable = (Measurable) companionWidget;
                    Object layoutId = LayoutIdKt.getLayoutId(measurable);
                    if (layoutId == null) {
                        layoutId = ConstraintLayoutTagKt.getConstraintLayoutId(measurable);
                    }
                    next.stringId = layoutId == null ? null : layoutId.toString();
                }
                WidgetFrame widgetFrame2 = this.frameCache.get(companionWidget);
                if (widgetFrame2 != null && (constraintWidget = widgetFrame2.widget) != null) {
                    widgetFrame = constraintWidget.frame;
                }
                if (widgetFrame != null) {
                    sb.append(' ' + ((Object) next.stringId) + ": {");
                    sb.append(" interpolated : ");
                    widgetFrame.serialize(sb, true);
                    sb.append("}, ");
                }
            } else if (next instanceof Guideline) {
                sb.append(' ' + ((Object) next.stringId) + ": {");
                Guideline guideline = (Guideline) next;
                if (guideline.getOrientation() == 0) {
                    sb.append(" type: 'hGuideline', ");
                } else {
                    sb.append(" type: 'vGuideline', ");
                }
                sb.append(" interpolated: ");
                sb.append(" { left: " + guideline.getX() + ", top: " + guideline.getY() + ", right: " + (guideline.getX() + guideline.getWidth()) + ", bottom: " + (guideline.getY() + guideline.getHeight()) + " }");
                sb.append("}, ");
            }
        }
        sb.append(" }");
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
        this.computedLayoutResult = string;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver == null) {
            return;
        }
        layoutInformationReceiver.setLayoutInformation(string);
    }

    public final boolean obtainConstraints(ConstraintWidget.DimensionBehaviour dimensionBehaviour, int i, int matchConstraintDefaultDimension, int measureStrategy, boolean otherDimensionResolved, boolean currentDimensionResolved, int rootMaxConstraint, int[] outConstraints) {
        int i2 = WhenMappings.$EnumSwitchMapping$0[dimensionBehaviour.ordinal()];
        if (i2 == 1) {
            outConstraints[0] = i;
            outConstraints[1] = i;
        } else {
            if (i2 == 2) {
                outConstraints[0] = 0;
                outConstraints[1] = rootMaxConstraint;
                return true;
            }
            if (i2 == 3) {
                if (ConstraintLayoutKt.DEBUG) {
                    Log.d("CCL", Intrinsics.stringPlus("Measure strategy ", Integer.valueOf(measureStrategy)));
                    Log.d("CCL", Intrinsics.stringPlus("DW ", Integer.valueOf(matchConstraintDefaultDimension)));
                    Log.d("CCL", Intrinsics.stringPlus("ODR ", Boolean.valueOf(otherDimensionResolved)));
                    Log.d("CCL", Intrinsics.stringPlus("IRH ", Boolean.valueOf(currentDimensionResolved)));
                }
                boolean z = currentDimensionResolved || ((measureStrategy == BasicMeasure.Measure.TRY_GIVEN_DIMENSIONS || measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS) && (measureStrategy == BasicMeasure.Measure.USE_GIVEN_DIMENSIONS || matchConstraintDefaultDimension != 1 || otherDimensionResolved));
                if (ConstraintLayoutKt.DEBUG) {
                    Log.d("CCL", Intrinsics.stringPlus("UD ", Boolean.valueOf(z)));
                }
                outConstraints[0] = z ? i : 0;
                if (!z) {
                    i = rootMaxConstraint;
                }
                outConstraints[1] = i;
                if (!z) {
                    return true;
                }
            } else if (i2 == 4) {
                outConstraints[0] = rootMaxConstraint;
                outConstraints[1] = rootMaxConstraint;
            } else {
                throw new IllegalStateException((dimensionBehaviour + " is not supported").toString());
            }
        }
        return false;
    }

    public final void copyFrom(Integer[] numArr, BasicMeasure.Measure measure) {
        numArr[0] = Integer.valueOf(measure.measuredWidth);
        numArr[1] = Integer.valueOf(measure.measuredHeight);
        numArr[2] = Integer.valueOf(measure.measuredBaseline);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: performMeasure-DjhGOtQ */
    public final long m13981performMeasureDjhGOtQ(long constraints, @NotNull LayoutDirection layoutDirection, @NotNull ConstraintSet constraintSet, @NotNull List<? extends Measurable> measurables, int optimizationLevel, @NotNull MeasureScope measureScope) throws NumberFormatException {
        androidx.constraintlayout.core.state.Dimension dimensionMin;
        androidx.constraintlayout.core.state.Dimension dimensionMin2;
        String string;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        Intrinsics.checkNotNullParameter(measureScope, "measureScope");
        setDensity(measureScope);
        setMeasureScope(measureScope);
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
        resetMeasureState$compose_release();
        if (constraintSet.isDirty(measurables)) {
            getState().reset();
            constraintSet.applyTo(getState(), measurables);
            ConstraintLayoutKt.buildMapping(getState(), measurables);
            getState().apply(this.root);
        } else {
            ConstraintLayoutKt.buildMapping(getState(), measurables);
        }
        m13979applyRootSizeBRTryo0(constraints);
        this.root.updateHierarchy();
        if (ConstraintLayoutKt.DEBUG) {
            this.root.setDebugName("ConstraintLayout");
            ArrayList<ConstraintWidget> children = this.root.getChildren();
            Intrinsics.checkNotNullExpressionValue(children, "root.children");
            for (ConstraintWidget constraintWidget : children) {
                Object companionWidget = constraintWidget.getCompanionWidget();
                Measurable measurable = companionWidget instanceof Measurable ? (Measurable) companionWidget : null;
                Object layoutId = measurable == null ? null : LayoutIdKt.getLayoutId(measurable);
                String str = "NOTAG";
                if (layoutId != null && (string = layoutId.toString()) != null) {
                    str = string;
                }
                constraintWidget.setDebugName(str);
            }
            Log.d("CCL", Intrinsics.stringPlus("ConstraintLayout is asked to measure with ", Constraints.m13627toStringimpl(constraints)));
            Log.d("CCL", ConstraintLayoutKt.toDebugString(this.root));
            Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget child = it.next();
                Intrinsics.checkNotNullExpressionValue(child, "child");
                Log.d("CCL", ConstraintLayoutKt.toDebugString(child));
            }
        }
        this.root.setOptimizationLevel(optimizationLevel);
        ConstraintWidgetContainer constraintWidgetContainer = this.root;
        constraintWidgetContainer.measure(constraintWidgetContainer.getOptimizationLevel(), 0, 0, 0, 0, 0, 0, 0, 0);
        Iterator<ConstraintWidget> it2 = this.root.getChildren().iterator();
        while (it2.hasNext()) {
            ConstraintWidget next = it2.next();
            Object companionWidget2 = next.getCompanionWidget();
            if (companionWidget2 instanceof Measurable) {
                Placeable placeable = this.placeables.get(companionWidget2);
                Integer numValueOf = placeable == null ? null : Integer.valueOf(placeable.getWidth());
                Integer numValueOf2 = placeable == null ? null : Integer.valueOf(placeable.getHeight());
                int width = next.getWidth();
                if (numValueOf != null && width == numValueOf.intValue()) {
                    int height = next.getHeight();
                    if (numValueOf2 != null && height == numValueOf2.intValue()) {
                    }
                }
                if (ConstraintLayoutKt.DEBUG) {
                    Log.d("CCL", "Final measurement for " + LayoutIdKt.getLayoutId((Measurable) companionWidget2) + " to confirm size " + next.getWidth() + ' ' + next.getHeight());
                }
                getPlaceables().put(companionWidget2, ((Measurable) companionWidget2).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(next.getWidth(), next.getHeight())));
            }
        }
        if (ConstraintLayoutKt.DEBUG) {
            Log.d("CCL", "ConstraintLayout is at the end " + this.root.getWidth() + ' ' + this.root.getHeight());
        }
        return IntSizeKt.IntSize(this.root.getWidth(), this.root.getHeight());
    }

    public final void resetMeasureState$compose_release() {
        this.placeables.clear();
        this.lastMeasures.clear();
        this.frameCache.clear();
    }

    /* renamed from: applyRootSize-BRTryo0 */
    public final void m13979applyRootSizeBRTryo0(long constraints) {
        this.root.setWidth(Constraints.m13622getMaxWidthimpl(constraints));
        this.root.setHeight(Constraints.m13621getMaxHeightimpl(constraints));
        this.forcedScaleFactor = Float.NaN;
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if (layoutInformationReceiver != null) {
            Integer numValueOf = layoutInformationReceiver == null ? null : Integer.valueOf(layoutInformationReceiver.getForcedWidth());
            if (numValueOf == null || numValueOf.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver2 = this.layoutInformationReceiver;
                Intrinsics.checkNotNull(layoutInformationReceiver2);
                int forcedWidth = layoutInformationReceiver2.getForcedWidth();
                if (forcedWidth > this.root.getWidth()) {
                    this.forcedScaleFactor = this.root.getWidth() / forcedWidth;
                } else {
                    this.forcedScaleFactor = 1.0f;
                }
                this.root.setWidth(forcedWidth);
            }
        }
        LayoutInformationReceiver layoutInformationReceiver3 = this.layoutInformationReceiver;
        if (layoutInformationReceiver3 != null) {
            Integer numValueOf2 = layoutInformationReceiver3 != null ? Integer.valueOf(layoutInformationReceiver3.getForcedHeight()) : null;
            if (numValueOf2 == null || numValueOf2.intValue() != Integer.MIN_VALUE) {
                LayoutInformationReceiver layoutInformationReceiver4 = this.layoutInformationReceiver;
                Intrinsics.checkNotNull(layoutInformationReceiver4);
                int forcedHeight = layoutInformationReceiver4.getForcedHeight();
                if (Float.isNaN(this.forcedScaleFactor)) {
                    this.forcedScaleFactor = 1.0f;
                }
                float height = forcedHeight > this.root.getHeight() ? this.root.getHeight() / forcedHeight : 1.0f;
                if (height < this.forcedScaleFactor) {
                    this.forcedScaleFactor = height;
                }
                this.root.setHeight(forcedHeight);
            }
        }
        this.layoutCurrentWidth = this.root.getWidth();
        this.layoutCurrentHeight = this.root.getHeight();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void performLayout(@NotNull Placeable.PlacementScope placementScope, @NotNull List<? extends Measurable> measurables) {
        Intrinsics.checkNotNullParameter(placementScope, "<this>");
        Intrinsics.checkNotNullParameter(measurables, "measurables");
        if (this.frameCache.isEmpty()) {
            Iterator<ConstraintWidget> it = this.root.getChildren().iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                Object companionWidget = next.getCompanionWidget();
                if (companionWidget instanceof Measurable) {
                    this.frameCache.put(companionWidget, new WidgetFrame(next.frame.update()));
                }
            }
        }
        int size = measurables.size() - 1;
        if (size >= 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                Measurable measurable = measurables.get(i);
                final WidgetFrame widgetFrame = getFrameCache().get(measurable);
                if (widgetFrame == null) {
                    return;
                }
                if (widgetFrame.isDefaultTransform()) {
                    WidgetFrame widgetFrame2 = getFrameCache().get(measurable);
                    Intrinsics.checkNotNull(widgetFrame2);
                    int i3 = widgetFrame2.left;
                    WidgetFrame widgetFrame3 = getFrameCache().get(measurable);
                    Intrinsics.checkNotNull(widgetFrame3);
                    int i4 = widgetFrame3.top;
                    Placeable placeable = getPlaceables().get(measurable);
                    if (placeable != null) {
                        Placeable.PlacementScope.m12661place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(i3, i4), 0.0f, 2, null);
                    }
                } else {
                    Function1<GraphicsLayerScope, Unit> function1 = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.constraintlayout.compose.Measurer$performLayout$1$layerBlock$1
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                            invoke2(graphicsLayerScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull GraphicsLayerScope graphicsLayerScope) {
                            Intrinsics.checkNotNullParameter(graphicsLayerScope, "$this$null");
                            if (!Float.isNaN(widgetFrame.pivotX) || !Float.isNaN(widgetFrame.pivotY)) {
                                graphicsLayerScope.mo11533setTransformOrigin__ExYCQ(TransformOriginKt.TransformOrigin(Float.isNaN(widgetFrame.pivotX) ? 0.5f : widgetFrame.pivotX, Float.isNaN(widgetFrame.pivotY) ? 0.5f : widgetFrame.pivotY));
                            }
                            if (!Float.isNaN(widgetFrame.rotationX)) {
                                graphicsLayerScope.setRotationX(widgetFrame.rotationX);
                            }
                            if (!Float.isNaN(widgetFrame.rotationY)) {
                                graphicsLayerScope.setRotationY(widgetFrame.rotationY);
                            }
                            if (!Float.isNaN(widgetFrame.rotationZ)) {
                                graphicsLayerScope.setRotationZ(widgetFrame.rotationZ);
                            }
                            if (!Float.isNaN(widgetFrame.translationX)) {
                                graphicsLayerScope.setTranslationX(widgetFrame.translationX);
                            }
                            if (!Float.isNaN(widgetFrame.translationY)) {
                                graphicsLayerScope.setTranslationY(widgetFrame.translationY);
                            }
                            if (!Float.isNaN(widgetFrame.translationZ)) {
                                graphicsLayerScope.setShadowElevation(widgetFrame.translationZ);
                            }
                            if (!Float.isNaN(widgetFrame.scaleX) || !Float.isNaN(widgetFrame.scaleY)) {
                                graphicsLayerScope.setScaleX(Float.isNaN(widgetFrame.scaleX) ? 1.0f : widgetFrame.scaleX);
                                graphicsLayerScope.setScaleY(Float.isNaN(widgetFrame.scaleY) ? 1.0f : widgetFrame.scaleY);
                            }
                            if (Float.isNaN(widgetFrame.alpha)) {
                                return;
                            }
                            graphicsLayerScope.setAlpha(widgetFrame.alpha);
                        }
                    };
                    WidgetFrame widgetFrame4 = getFrameCache().get(measurable);
                    Intrinsics.checkNotNull(widgetFrame4);
                    int i5 = widgetFrame4.left;
                    WidgetFrame widgetFrame5 = getFrameCache().get(measurable);
                    Intrinsics.checkNotNull(widgetFrame5);
                    int i6 = widgetFrame5.top;
                    float f = Float.isNaN(widgetFrame.translationZ) ? 0.0f : widgetFrame.translationZ;
                    Placeable placeable2 = getPlaceables().get(measurable);
                    if (placeable2 != null) {
                        placementScope.placeWithLayer(placeable2, i5, i6, f, function1);
                    }
                }
                if (i2 > size) {
                    break;
                } else {
                    i = i2;
                }
            }
        }
        LayoutInformationReceiver layoutInformationReceiver = this.layoutInformationReceiver;
        if ((layoutInformationReceiver == null ? null : layoutInformationReceiver.getLayoutInformationMode()) == LayoutInfoFlags.BOUNDS) {
            computeLayoutResult();
        }
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.Measurer$drawDebugBounds$1 */
    /* loaded from: classes3.dex */
    public static final class C21171 extends Lambda implements Function1<DrawScope, Unit> {
        public final /* synthetic */ float $forcedScaleFactor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21171(float f) {
            super(1);
            f = f;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
            invoke2(drawScope);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull DrawScope Canvas) {
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            float layoutCurrentWidth = Measurer.this.getLayoutCurrentWidth() * f;
            float layoutCurrentHeight = Measurer.this.getLayoutCurrentHeight() * f;
            float fM11168getWidthimpl = (Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) - layoutCurrentWidth) / 2.0f;
            float fM11165getHeightimpl = (Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) - layoutCurrentHeight) / 2.0f;
            Color.Companion companion = Color.INSTANCE;
            long jM11377getWhite0d7_KjU = companion.m11377getWhite0d7_KjU();
            float f = fM11168getWidthimpl + layoutCurrentWidth;
            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11377getWhite0d7_KjU, OffsetKt.Offset(fM11168getWidthimpl, fM11165getHeightimpl), OffsetKt.Offset(f, fM11165getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            long jOffset = OffsetKt.Offset(f, fM11165getHeightimpl);
            float f2 = fM11165getHeightimpl + layoutCurrentHeight;
            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11377getWhite0d7_KjU, jOffset, OffsetKt.Offset(f, f2), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11377getWhite0d7_KjU, OffsetKt.Offset(f, f2), OffsetKt.Offset(fM11168getWidthimpl, f2), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11377getWhite0d7_KjU, OffsetKt.Offset(fM11168getWidthimpl, f2), OffsetKt.Offset(fM11168getWidthimpl, fM11165getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            float f3 = 1;
            float f4 = fM11168getWidthimpl + f3;
            float f5 = fM11165getHeightimpl + f3;
            long jM11366getBlack0d7_KjU = companion.m11366getBlack0d7_KjU();
            float f6 = layoutCurrentWidth + f4;
            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11366getBlack0d7_KjU, OffsetKt.Offset(f4, f5), OffsetKt.Offset(f6, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            long jOffset2 = OffsetKt.Offset(f6, f5);
            float f7 = f5 + layoutCurrentHeight;
            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11366getBlack0d7_KjU, jOffset2, OffsetKt.Offset(f6, f7), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11366getBlack0d7_KjU, OffsetKt.Offset(f6, f7), OffsetKt.Offset(f4, f7), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11366getBlack0d7_KjU, OffsetKt.Offset(f4, f7), OffsetKt.Offset(f4, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
        }
    }

    @Composable
    public final void drawDebugBounds(@NotNull BoxScope boxScope, float f, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(boxScope, "<this>");
        Composer composerStartRestartGroup = composer.startRestartGroup(-756996390);
        CanvasKt.Canvas(boxScope.matchParentSize(Modifier.INSTANCE), new Function1<DrawScope, Unit>() { // from class: androidx.constraintlayout.compose.Measurer.drawDebugBounds.1
            public final /* synthetic */ float $forcedScaleFactor;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C21171(float f2) {
                super(1);
                f = f2;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                float layoutCurrentWidth = Measurer.this.getLayoutCurrentWidth() * f;
                float layoutCurrentHeight = Measurer.this.getLayoutCurrentHeight() * f;
                float fM11168getWidthimpl = (Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc()) - layoutCurrentWidth) / 2.0f;
                float fM11165getHeightimpl = (Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc()) - layoutCurrentHeight) / 2.0f;
                Color.Companion companion = Color.INSTANCE;
                long jM11377getWhite0d7_KjU = companion.m11377getWhite0d7_KjU();
                float f2 = fM11168getWidthimpl + layoutCurrentWidth;
                DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11377getWhite0d7_KjU, OffsetKt.Offset(fM11168getWidthimpl, fM11165getHeightimpl), OffsetKt.Offset(f2, fM11165getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                long jOffset = OffsetKt.Offset(f2, fM11165getHeightimpl);
                float f22 = fM11165getHeightimpl + layoutCurrentHeight;
                DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11377getWhite0d7_KjU, jOffset, OffsetKt.Offset(f2, f22), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11377getWhite0d7_KjU, OffsetKt.Offset(f2, f22), OffsetKt.Offset(fM11168getWidthimpl, f22), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11377getWhite0d7_KjU, OffsetKt.Offset(fM11168getWidthimpl, f22), OffsetKt.Offset(fM11168getWidthimpl, fM11165getHeightimpl), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                float f3 = 1;
                float f4 = fM11168getWidthimpl + f3;
                float f5 = fM11165getHeightimpl + f3;
                long jM11366getBlack0d7_KjU = companion.m11366getBlack0d7_KjU();
                float f6 = layoutCurrentWidth + f4;
                DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11366getBlack0d7_KjU, OffsetKt.Offset(f4, f5), OffsetKt.Offset(f6, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                long jOffset2 = OffsetKt.Offset(f6, f5);
                float f7 = f5 + layoutCurrentHeight;
                DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11366getBlack0d7_KjU, jOffset2, OffsetKt.Offset(f6, f7), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11366getBlack0d7_KjU, OffsetKt.Offset(f6, f7), OffsetKt.Offset(f4, f7), 0.0f, 0, null, 0.0f, null, 0, 504, null);
                DrawScope.m11876drawLineNGM6Ib0$default(Canvas, jM11366getBlack0d7_KjU, OffsetKt.Offset(f4, f7), OffsetKt.Offset(f4, f5), 0.0f, 0, null, 0.0f, null, 0, 504, null);
            }
        }, composerStartRestartGroup, 0);
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer.drawDebugBounds.2
            public final /* synthetic */ int $$changed;
            public final /* synthetic */ float $forcedScaleFactor;
            public final /* synthetic */ BoxScope $this_drawDebugBounds;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C21182(BoxScope boxScope2, float f2, int i2) {
                super(2);
                boxScope = boxScope2;
                f = f2;
                i = i2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                Measurer.this.drawDebugBounds(boxScope, f, composer2, i | 1);
            }
        });
    }

    /* renamed from: getColor-wrIjXm8$default */
    public static /* synthetic */ long m13978getColorwrIjXm8$default(Measurer measurer, String str, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColor-wrIjXm8");
        }
        if ((i & 2) != 0) {
            j = Color.INSTANCE.m11366getBlack0d7_KjU();
        }
        return measurer.m13980getColorwrIjXm8(str, j);
    }

    /* renamed from: getColor-wrIjXm8 */
    public final long m13980getColorwrIjXm8(String str, long defaultColor) {
        if (str != null && StringsKt__StringsKt.startsWith$default((CharSequence) str, '#', false, 2, (Object) null)) {
            String strSubstring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "(this as java.lang.String).substring(startIndex)");
            if (strSubstring.length() == 6) {
                strSubstring = Intrinsics.stringPlus(TuningConstants.DEFAULT_TRANSPARENCY, strSubstring);
            }
            try {
                return ColorKt.Color((int) Long.parseLong(strSubstring, 16));
            } catch (Exception unused) {
            }
        }
        return defaultColor;
    }

    public final TextStyle getTextStyle(HashMap<String, String> params) {
        String str = params.get("size");
        long jM13868getUnspecifiedXSAIIZE = TextUnit.INSTANCE.m13868getUnspecifiedXSAIIZE();
        if (str != null) {
            jM13868getUnspecifiedXSAIIZE = TextUnitKt.getSp(Float.parseFloat(str));
        }
        return new TextStyle(m13978getColorwrIjXm8$default(this, params.get("color"), 0L, 2, null), jM13868getUnspecifiedXSAIIZE, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, 262140, (DefaultConstructorMarker) null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0228  */
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void createDesignElements(@Nullable Composer composer, int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-186576797);
        Iterator<DesignElement> it = this.designElements.iterator();
        while (it.hasNext()) {
            DesignElement next = it.next();
            String id = next.getId();
            Function4<String, HashMap<String, String>, Composer, Integer, Unit> function4 = DesignElements.INSTANCE.getMap().get(next.getType());
            if (function4 != null) {
                composerStartRestartGroup.startReplaceableGroup(-186576600);
                function4.invoke(id, next.getParams(), composerStartRestartGroup, 64);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-186576534);
                String type = next.getType();
                switch (type.hashCode()) {
                    case -1377687758:
                        if (!type.equals("button")) {
                            composerStartRestartGroup.startReplaceableGroup(-186574342);
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        } else {
                            composerStartRestartGroup.startReplaceableGroup(-186576462);
                            String str = next.getParams().get("text");
                            if (str == null) {
                                str = "text";
                            }
                            BasicTextKt.m8399BasicTextBpD7jsM(str, PaddingKt.m8123padding3ABfNKs(BackgroundKt.m7771backgroundbw27NRU$default(ClipKt.clip(ConstraintLayoutTagKt.layoutId$default(Modifier.INSTANCE, id, null, 2, null), RoundedCornerShapeKt.RoundedCornerShape(20)), m13980getColorwrIjXm8(next.getParams().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.INSTANCE.m11372getLightGray0d7_KjU()), null, 2, null), C2046Dp.m13666constructorimpl(8)), getTextStyle(next.getParams()), null, 0, false, 0, composerStartRestartGroup, 32768, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        }
                    case -1031434259:
                        if (type.equals("textfield")) {
                            composerStartRestartGroup.startReplaceableGroup(-186575007);
                            String str2 = next.getParams().get("text");
                            if (str2 == null) {
                                str2 = "text";
                            }
                            BasicTextFieldKt.BasicTextField(str2, (Function1) C21152.INSTANCE, ConstraintLayoutTagKt.layoutId$default(Modifier.INSTANCE, id, null, 2, null), false, false, (TextStyle) null, (KeyboardOptions) null, (KeyboardActions) null, false, 0, (VisualTransformation) null, (Function1) null, (MutableInteractionSource) null, (Brush) null, (Function3) null, composerStartRestartGroup, 0, 0, 32760);
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                    case 97739:
                        if (type.equals("box")) {
                            composerStartRestartGroup.startReplaceableGroup(-186575900);
                            String str3 = next.getParams().get("text");
                            if (str3 == null) {
                                str3 = "";
                            }
                            long jM13980getColorwrIjXm8 = m13980getColorwrIjXm8(next.getParams().get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR), Color.INSTANCE.m11372getLightGray0d7_KjU());
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierM7771backgroundbw27NRU$default = BackgroundKt.m7771backgroundbw27NRU$default(ConstraintLayoutTagKt.layoutId$default(companion, id, null, 2, null), jM13980getColorwrIjXm8, null, 2, null);
                            composerStartRestartGroup.startReplaceableGroup(-1990474327);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1376089335);
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM7771backgroundbw27NRU$default);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            composerStartRestartGroup.disableReusing();
                            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, density, companion2.getSetDensity());
                            Updater.m10877setimpl(composerM10870constructorimpl, layoutDirection, companion2.getSetLayoutDirection());
                            composerStartRestartGroup.enableReusing();
                            function3MaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            composerStartRestartGroup.startReplaceableGroup(-1253629305);
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            BasicTextKt.m8399BasicTextBpD7jsM(str3, PaddingKt.m8123padding3ABfNKs(companion, C2046Dp.m13666constructorimpl(8)), getTextStyle(next.getParams()), null, 0, false, 0, composerStartRestartGroup, 32816, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                    case 3556653:
                        if (type.equals("text")) {
                            composerStartRestartGroup.startReplaceableGroup(-186575281);
                            String str4 = next.getParams().get("text");
                            if (str4 == null) {
                                str4 = "text";
                            }
                            BasicTextKt.m8399BasicTextBpD7jsM(str4, ConstraintLayoutTagKt.layoutId$default(Modifier.INSTANCE, id, null, 2, null), getTextStyle(next.getParams()), null, 0, false, 0, composerStartRestartGroup, 32768, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                    case 100313435:
                        if (type.equals("image")) {
                            composerStartRestartGroup.startReplaceableGroup(-186574667);
                            ImageKt.Image(PainterResources_androidKt.painterResource(android.R.drawable.ic_menu_gallery, composerStartRestartGroup, 0), "Placeholder Image", ConstraintLayoutTagKt.layoutId$default(Modifier.INSTANCE, id, null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composerStartRestartGroup, 56, 120);
                            composerStartRestartGroup.endReplaceableGroup();
                            break;
                        }
                        break;
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.constraintlayout.compose.Measurer.createDesignElements.3
            public final /* synthetic */ int $$changed;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C21163(int i2) {
                super(2);
                i = i2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(@Nullable Composer composer2, int i2) {
                Measurer.this.createDesignElements(composer2, i | 1);
            }
        });
    }

    /* compiled from: ConstraintLayout.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 5, 1}, m7109xi = 48)
    /* renamed from: androidx.constraintlayout.compose.Measurer$createDesignElements$2 */
    /* loaded from: classes3.dex */
    public static final class C21152 extends Lambda implements Function1<String, Unit> {
        public static final C21152 INSTANCE = ;

        /* renamed from: invoke */
        public final void invoke2(@NotNull String it) {
            Intrinsics.checkNotNullParameter(it, "it");
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(String str) {
            invoke2(str);
            return Unit.INSTANCE;
        }
    }

    public final void parseDesignElements(@NotNull ConstraintSet constraintSet) {
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        if (constraintSet instanceof JSONConstraintSet) {
            ((JSONConstraintSet) constraintSet).emitDesignElements(this.designElements);
        }
    }
}
