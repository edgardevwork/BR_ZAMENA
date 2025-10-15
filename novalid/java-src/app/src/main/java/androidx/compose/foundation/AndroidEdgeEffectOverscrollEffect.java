package androidx.compose.foundation;

import android.content.Context;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.p003ui.input.pointer.PointerId;
import androidx.compose.p003ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p003ui.layout.OnRemeasuredModifierKt;
import androidx.compose.p003ui.platform.InspectableValueKt;
import androidx.compose.p003ui.platform.InspectorInfo;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.p003ui.unit.Velocity;
import androidx.compose.p003ui.unit.VelocityKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidOverscroll.android.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u00105\u001a\u00020+H\u0002J?\u00106\u001a\u00020+2\u0006\u00107\u001a\u0002082\"\u00109\u001a\u001e\b\u0001\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u0002080;\u0012\u0006\u0012\u0004\u0018\u00010<0:H\u0096@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J6\u0010?\u001a\u00020/2\u0006\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020B2\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0)H\u0016ø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\b\u0010F\u001a\u00020+H\u0002J\"\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bK\u0010LJ\"\u0010M\u001a\u00020H2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bN\u0010LJ\"\u0010O\u001a\u00020H2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bP\u0010LJ\"\u0010Q\u001a\u00020H2\u0006\u0010I\u001a\u00020/2\u0006\u0010J\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bR\u0010LJ\u001a\u0010S\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020/H\u0002ø\u0001\u0000¢\u0006\u0004\bT\u0010UJ\b\u0010V\u001a\u00020\u001eH\u0002J \u0010W\u001a\u00020\u001e*\u00020X2\u0006\u0010Y\u001a\u00020\t2\n\u0010Z\u001a\u00060[j\u0002`\\H\u0002J \u0010]\u001a\u00020\u001e*\u00020X2\u0006\u0010^\u001a\u00020\t2\n\u0010Z\u001a\u00060[j\u0002`\\H\u0002J\n\u0010_\u001a\u00020+*\u00020XJ \u0010`\u001a\u00020\u001e*\u00020X2\u0006\u0010a\u001a\u00020\t2\n\u0010Z\u001a\u00060[j\u0002`\\H\u0002J \u0010b\u001a\u00020\u001e*\u00020X2\u0006\u0010c\u001a\u00020\t2\n\u0010Z\u001a\u00060[j\u0002`\\H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\u00020\u000fX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u0012X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R+\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\r8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\u001d\u001a\u00020\u001e8\u0000@\u0000X\u0081\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010\"R\u000e\u0010&\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010(\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u0016\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006d"}, m7105d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "context", "Landroid/content/Context;", "overscrollConfig", "Landroidx/compose/foundation/OverscrollConfiguration;", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "allEffects", "", "Landroid/widget/EdgeEffect;", "bottomEffect", "bottomEffectNegation", "consumeCount", "", "containerSize", "Landroidx/compose/ui/geometry/Size;", "J", "effectModifier", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "<set-?>", "invalidateCount", "getInvalidateCount", "()I", "setInvalidateCount", "(I)V", "invalidateCount$delegate", "Landroidx/compose/runtime/MutableIntState;", "invalidationEnabled", "", "getInvalidationEnabled$foundation_release$annotations", "()V", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "isInProgress", "leftEffect", "leftEffectNegation", "onNewSize", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/IntSize;", "", "pointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "pointerPosition", "Landroidx/compose/ui/geometry/Offset;", "rightEffect", "rightEffectNegation", "scrollCycleInProgress", "topEffect", "topEffectNegation", "animateToRelease", "applyToFling", "velocity", "Landroidx/compose/ui/unit/Velocity;", "performFling", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToScroll", "delta", "source", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "invalidateOverscroll", "pullBottom", "", "scroll", "displacement", "pullBottom-0a9Yr6o", "(JJ)F", "pullLeft", "pullLeft-0a9Yr6o", "pullRight", "pullRight-0a9Yr6o", "pullTop", "pullTop-0a9Yr6o", "releaseOppositeOverscroll", "releaseOppositeOverscroll-k-4lQ0M", "(J)Z", "stopOverscrollAnimation", "drawBottom", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "bottom", "canvas", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "drawLeft", TtmlNode.LEFT, "drawOverscroll", "drawRight", TtmlNode.RIGHT, "drawTop", "top", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAndroidOverscroll.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,595:1\n33#2,6:596\n101#2,2:606\n33#2,6:608\n103#2:614\n33#2,6:616\n135#3:602\n75#4:603\n108#4,2:604\n246#5:615\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.android.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n125#1:596,6\n270#1:606,2\n270#1:608,6\n270#1:614\n451#1:616,6\n345#1:602\n130#1:603\n130#1:604,2\n355#1:615\n*E\n"})
/* loaded from: classes4.dex */
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {
    public static final int $stable = 0;

    @NotNull
    private final List<EdgeEffect> allEffects;

    @NotNull
    private final EdgeEffect bottomEffect;

    @NotNull
    private final EdgeEffect bottomEffectNegation;
    private int consumeCount;
    private long containerSize;

    @NotNull
    private final Modifier effectModifier;

    /* renamed from: invalidateCount$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableIntState invalidateCount;
    private boolean invalidationEnabled;

    @NotNull
    private final EdgeEffect leftEffect;

    @NotNull
    private final EdgeEffect leftEffectNegation;

    @NotNull
    private final Function1<IntSize, Unit> onNewSize;

    @NotNull
    private final OverscrollConfiguration overscrollConfig;

    @Nullable
    private PointerId pointerId;

    @Nullable
    private Offset pointerPosition;

    @NotNull
    private final EdgeEffect rightEffect;

    @NotNull
    private final EdgeEffect rightEffectNegation;
    private boolean scrollCycleInProgress;

    @NotNull
    private final EdgeEffect topEffect;

    @NotNull
    private final EdgeEffect topEffectNegation;

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context, @NotNull OverscrollConfiguration overscrollConfiguration) {
        this.overscrollConfig = overscrollConfiguration;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffectCreate = edgeEffectCompat.create(context, null);
        this.topEffect = edgeEffectCreate;
        EdgeEffect edgeEffectCreate2 = edgeEffectCompat.create(context, null);
        this.bottomEffect = edgeEffectCreate2;
        EdgeEffect edgeEffectCreate3 = edgeEffectCompat.create(context, null);
        this.leftEffect = edgeEffectCreate3;
        EdgeEffect edgeEffectCreate4 = edgeEffectCompat.create(context, null);
        this.rightEffect = edgeEffectCreate4;
        List<EdgeEffect> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EdgeEffect[]{edgeEffectCreate3, edgeEffectCreate, edgeEffectCreate4, edgeEffectCreate2});
        this.allEffects = listListOf;
        this.topEffectNegation = edgeEffectCompat.create(context, null);
        this.bottomEffectNegation = edgeEffectCompat.create(context, null);
        this.leftEffectNegation = edgeEffectCompat.create(context, null);
        this.rightEffectNegation = edgeEffectCompat.create(context, null);
        int size = listListOf.size();
        for (int i = 0; i < size; i++) {
            listListOf.get(i).setColor(ColorKt.m11394toArgb8_81llA(this.overscrollConfig.getGlowColor()));
        }
        this.consumeCount = -1;
        this.invalidateCount = SnapshotIntStateKt.mutableIntStateOf(0);
        this.invalidationEnabled = true;
        this.containerSize = Size.INSTANCE.m11177getZeroNHjbRc();
        Function1<IntSize, Unit> function1 = new Function1<IntSize, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$onNewSize$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(IntSize intSize) {
                m7753invokeozmzZPI(intSize.getPackedValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke-ozmzZPI, reason: not valid java name */
            public final void m7753invokeozmzZPI(long j) {
                boolean z = !Size.m11164equalsimpl0(IntSizeKt.m13846toSizeozmzZPI(j), this.this$0.containerSize);
                this.this$0.containerSize = IntSizeKt.m13846toSizeozmzZPI(j);
                if (z) {
                    this.this$0.topEffect.setSize(IntSize.m13836getWidthimpl(j), IntSize.m13835getHeightimpl(j));
                    this.this$0.bottomEffect.setSize(IntSize.m13836getWidthimpl(j), IntSize.m13835getHeightimpl(j));
                    this.this$0.leftEffect.setSize(IntSize.m13835getHeightimpl(j), IntSize.m13836getWidthimpl(j));
                    this.this$0.rightEffect.setSize(IntSize.m13835getHeightimpl(j), IntSize.m13836getWidthimpl(j));
                    this.this$0.topEffectNegation.setSize(IntSize.m13836getWidthimpl(j), IntSize.m13835getHeightimpl(j));
                    this.this$0.bottomEffectNegation.setSize(IntSize.m13836getWidthimpl(j), IntSize.m13835getHeightimpl(j));
                    this.this$0.leftEffectNegation.setSize(IntSize.m13835getHeightimpl(j), IntSize.m13836getWidthimpl(j));
                    this.this$0.rightEffectNegation.setSize(IntSize.m13835getHeightimpl(j), IntSize.m13836getWidthimpl(j));
                }
                if (z) {
                    this.this$0.invalidateOverscroll();
                    this.this$0.animateToRelease();
                }
            }
        };
        this.onNewSize = function1;
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE.then(AndroidOverscroll_androidKt.StretchOverscrollNonClippingLayer), Unit.INSTANCE, new AndroidEdgeEffectOverscrollEffect$effectModifier$1(this, null)), function1).then(new DrawOverscrollModifier(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(this.this$0);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    private final int getInvalidateCount() {
        return this.invalidateCount.getIntValue();
    }

    private final void setInvalidateCount(int i) {
        this.invalidateCount.setIntValue(i);
    }

    /* renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z) {
        this.invalidationEnabled = z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013a A[ADDED_TO_REGION] */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long mo7752applyToScrollRhakbz0(long delta, int source, @NotNull Function1<? super Offset, Offset> performScroll) {
        float fM7749pullTop0a9Yr6o;
        boolean z;
        boolean z2;
        float fM7747pullLeft0a9Yr6o;
        if (Size.m11170isEmptyimpl(this.containerSize)) {
            return performScroll.invoke(Offset.m11088boximpl(delta)).getPackedValue();
        }
        boolean z3 = true;
        if (!this.scrollCycleInProgress) {
            stopOverscrollAnimation();
            this.scrollCycleInProgress = true;
        }
        Offset offset = this.pointerPosition;
        long packedValue = offset != null ? offset.getPackedValue() : SizeKt.m11178getCenteruvyYCjk(this.containerSize);
        float f = 0.0f;
        if (Offset.m11100getYimpl(delta) == 0.0f) {
            fM7749pullTop0a9Yr6o = 0.0f;
        } else {
            EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat.getDistanceCompat(this.topEffect) != 0.0f) {
                fM7749pullTop0a9Yr6o = m7749pullTop0a9Yr6o(delta, packedValue);
                if (edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f) {
                    this.topEffect.onRelease();
                }
            } else if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) != 0.0f) {
                fM7749pullTop0a9Yr6o = m7746pullBottom0a9Yr6o(delta, packedValue);
                if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
                    this.bottomEffect.onRelease();
                }
            }
        }
        if (Offset.m11099getXimpl(delta) != 0.0f) {
            EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat2.getDistanceCompat(this.leftEffect) != 0.0f) {
                fM7747pullLeft0a9Yr6o = m7747pullLeft0a9Yr6o(delta, packedValue);
                if (edgeEffectCompat2.getDistanceCompat(this.leftEffect) == 0.0f) {
                    this.leftEffect.onRelease();
                }
            } else if (edgeEffectCompat2.getDistanceCompat(this.rightEffect) != 0.0f) {
                fM7747pullLeft0a9Yr6o = m7748pullRight0a9Yr6o(delta, packedValue);
                if (edgeEffectCompat2.getDistanceCompat(this.rightEffect) == 0.0f) {
                    this.rightEffect.onRelease();
                }
            }
            f = fM7747pullLeft0a9Yr6o;
        }
        long jOffset = OffsetKt.Offset(f, fM7749pullTop0a9Yr6o);
        if (!Offset.m11096equalsimpl0(jOffset, Offset.INSTANCE.m11115getZeroF1C5BW0())) {
            invalidateOverscroll();
        }
        long jM11103minusMKHz9U = Offset.m11103minusMKHz9U(delta, jOffset);
        long packedValue2 = performScroll.invoke(Offset.m11088boximpl(jM11103minusMKHz9U)).getPackedValue();
        long jM11103minusMKHz9U2 = Offset.m11103minusMKHz9U(jM11103minusMKHz9U, packedValue2);
        boolean z4 = false;
        if (NestedScrollSource.m12373equalsimpl0(source, NestedScrollSource.INSTANCE.m12378getDragWNlRxjI())) {
            if (Offset.m11099getXimpl(jM11103minusMKHz9U2) > 0.5f) {
                m7747pullLeft0a9Yr6o(jM11103minusMKHz9U2, packedValue);
            } else if (Offset.m11099getXimpl(jM11103minusMKHz9U2) < -0.5f) {
                m7748pullRight0a9Yr6o(jM11103minusMKHz9U2, packedValue);
            } else {
                z = false;
                if (Offset.m11100getYimpl(jM11103minusMKHz9U2) <= 0.5f) {
                    m7749pullTop0a9Yr6o(jM11103minusMKHz9U2, packedValue);
                } else if (Offset.m11100getYimpl(jM11103minusMKHz9U2) < -0.5f) {
                    m7746pullBottom0a9Yr6o(jM11103minusMKHz9U2, packedValue);
                } else {
                    z2 = false;
                    if (!z && !z2) {
                        z3 = false;
                    }
                    z4 = z3;
                }
                z2 = true;
                if (!z) {
                    z3 = false;
                }
                z4 = z3;
            }
            z = true;
            if (Offset.m11100getYimpl(jM11103minusMKHz9U2) <= 0.5f) {
            }
            z2 = true;
            if (!z) {
            }
            z4 = z3;
        }
        if (m7750releaseOppositeOverscrollk4lQ0M(delta) || z4) {
            invalidateOverscroll();
        }
        return Offset.m11104plusMKHz9U(jOffset, packedValue2);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @Nullable
    /* renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object mo7751applyToFlingBMRW4eQ(long j, @NotNull Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        AndroidEdgeEffectOverscrollEffect$applyToFling$1 androidEdgeEffectOverscrollEffect$applyToFling$1;
        float fM13901getXimpl;
        float fM13902getYimpl;
        long jM13904minusAH228Gc;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long jM13904minusAH228Gc2;
        if (continuation instanceof AndroidEdgeEffectOverscrollEffect$applyToFling$1) {
            androidEdgeEffectOverscrollEffect$applyToFling$1 = (AndroidEdgeEffectOverscrollEffect$applyToFling$1) continuation;
            int i = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = i - Integer.MIN_VALUE;
            } else {
                androidEdgeEffectOverscrollEffect$applyToFling$1 = new AndroidEdgeEffectOverscrollEffect$applyToFling$1(this, continuation);
            }
        }
        Object objInvoke = androidEdgeEffectOverscrollEffect$applyToFling$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = androidEdgeEffectOverscrollEffect$applyToFling$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jM13904minusAH228Gc = androidEdgeEffectOverscrollEffect$applyToFling$1.J$0;
            androidEdgeEffectOverscrollEffect = (AndroidEdgeEffectOverscrollEffect) androidEdgeEffectOverscrollEffect$applyToFling$1.L$0;
            ResultKt.throwOnFailure(objInvoke);
            jM13904minusAH228Gc2 = Velocity.m13904minusAH228Gc(jM13904minusAH228Gc, ((Velocity) objInvoke).getPackedValue());
            androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
            if (Velocity.m13901getXimpl(jM13904minusAH228Gc2) <= 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.leftEffect, MathKt__MathJVMKt.roundToInt(Velocity.m13901getXimpl(jM13904minusAH228Gc2)));
            } else if (Velocity.m13901getXimpl(jM13904minusAH228Gc2) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.rightEffect, -MathKt__MathJVMKt.roundToInt(Velocity.m13901getXimpl(jM13904minusAH228Gc2)));
            }
            if (Velocity.m13902getYimpl(jM13904minusAH228Gc2) <= 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.topEffect, MathKt__MathJVMKt.roundToInt(Velocity.m13902getYimpl(jM13904minusAH228Gc2)));
            } else if (Velocity.m13902getYimpl(jM13904minusAH228Gc2) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.bottomEffect, -MathKt__MathJVMKt.roundToInt(Velocity.m13902getYimpl(jM13904minusAH228Gc2)));
            }
            if (!Velocity.m13900equalsimpl0(jM13904minusAH228Gc2, Velocity.INSTANCE.m13912getZero9UxMQ8M())) {
                androidEdgeEffectOverscrollEffect.invalidateOverscroll();
            }
            androidEdgeEffectOverscrollEffect.animateToRelease();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objInvoke);
        if (Size.m11170isEmptyimpl(this.containerSize)) {
            Velocity velocityM13892boximpl = Velocity.m13892boximpl(j);
            androidEdgeEffectOverscrollEffect$applyToFling$1.label = 1;
            if (function2.invoke(velocityM13892boximpl, androidEdgeEffectOverscrollEffect$applyToFling$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (Velocity.m13901getXimpl(j) > 0.0f) {
            EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat.getDistanceCompat(this.leftEffect) != 0.0f) {
                edgeEffectCompat.onAbsorbCompat(this.leftEffect, MathKt__MathJVMKt.roundToInt(Velocity.m13901getXimpl(j)));
                fM13901getXimpl = Velocity.m13901getXimpl(j);
            } else if (Velocity.m13901getXimpl(j) < 0.0f) {
                EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
                if (edgeEffectCompat2.getDistanceCompat(this.rightEffect) == 0.0f) {
                    fM13901getXimpl = 0.0f;
                } else {
                    edgeEffectCompat2.onAbsorbCompat(this.rightEffect, -MathKt__MathJVMKt.roundToInt(Velocity.m13901getXimpl(j)));
                    fM13901getXimpl = Velocity.m13901getXimpl(j);
                }
            }
            if (Velocity.m13902getYimpl(j) > 0.0f) {
                EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.INSTANCE;
                if (edgeEffectCompat3.getDistanceCompat(this.topEffect) != 0.0f) {
                    edgeEffectCompat3.onAbsorbCompat(this.topEffect, MathKt__MathJVMKt.roundToInt(Velocity.m13902getYimpl(j)));
                    fM13902getYimpl = Velocity.m13902getYimpl(j);
                } else if (Velocity.m13902getYimpl(j) < 0.0f) {
                    EdgeEffectCompat edgeEffectCompat4 = EdgeEffectCompat.INSTANCE;
                    if (edgeEffectCompat4.getDistanceCompat(this.bottomEffect) == 0.0f) {
                        fM13902getYimpl = 0.0f;
                    } else {
                        edgeEffectCompat4.onAbsorbCompat(this.bottomEffect, -MathKt__MathJVMKt.roundToInt(Velocity.m13902getYimpl(j)));
                        fM13902getYimpl = Velocity.m13902getYimpl(j);
                    }
                }
                long jVelocity = VelocityKt.Velocity(fM13901getXimpl, fM13902getYimpl);
                if (!Velocity.m13900equalsimpl0(jVelocity, Velocity.INSTANCE.m13912getZero9UxMQ8M())) {
                    invalidateOverscroll();
                }
                jM13904minusAH228Gc = Velocity.m13904minusAH228Gc(j, jVelocity);
                Velocity velocityM13892boximpl2 = Velocity.m13892boximpl(jM13904minusAH228Gc);
                androidEdgeEffectOverscrollEffect$applyToFling$1.L$0 = this;
                androidEdgeEffectOverscrollEffect$applyToFling$1.J$0 = jM13904minusAH228Gc;
                androidEdgeEffectOverscrollEffect$applyToFling$1.label = 2;
                objInvoke = function2.invoke(velocityM13892boximpl2, androidEdgeEffectOverscrollEffect$applyToFling$1);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
                androidEdgeEffectOverscrollEffect = this;
            }
        }
        jM13904minusAH228Gc2 = Velocity.m13904minusAH228Gc(jM13904minusAH228Gc, ((Velocity) objInvoke).getPackedValue());
        androidEdgeEffectOverscrollEffect.scrollCycleInProgress = false;
        if (Velocity.m13901getXimpl(jM13904minusAH228Gc2) <= 0.0f) {
        }
        if (Velocity.m13902getYimpl(jM13904minusAH228Gc2) <= 0.0f) {
        }
        if (!Velocity.m13900equalsimpl0(jM13904minusAH228Gc2, Velocity.INSTANCE.m13912getZero9UxMQ8M())) {
        }
        androidEdgeEffectOverscrollEffect.animateToRelease();
        return Unit.INSTANCE;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    private final boolean stopOverscrollAnimation() {
        boolean z;
        long jM11178getCenteruvyYCjk = SizeKt.m11178getCenteruvyYCjk(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f) {
            z = false;
        } else {
            m7747pullLeft0a9Yr6o(Offset.INSTANCE.m11115getZeroF1C5BW0(), jM11178getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffect) != 0.0f) {
            m7748pullRight0a9Yr6o(Offset.INSTANCE.m11115getZeroF1C5BW0(), jM11178getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffect) != 0.0f) {
            m7749pullTop0a9Yr6o(Offset.INSTANCE.m11115getZeroF1C5BW0(), jM11178getCenteruvyYCjk);
            z = true;
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f) {
            return z;
        }
        m7746pullBottom0a9Yr6o(Offset.INSTANCE.m11115getZeroF1C5BW0(), jM11178getCenteruvyYCjk);
        return true;
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    public final void drawOverscroll(@NotNull DrawScope drawScope) {
        boolean zDrawLeft;
        if (Size.m11170isEmptyimpl(this.containerSize)) {
            return;
        }
        Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.consumeCount = getInvalidateCount();
        android.graphics.Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        if (edgeEffectCompat.getDistanceCompat(this.leftEffectNegation) != 0.0f) {
            drawRight(drawScope, this.leftEffectNegation, nativeCanvas);
            this.leftEffectNegation.finish();
        }
        if (this.leftEffect.isFinished()) {
            zDrawLeft = false;
        } else {
            zDrawLeft = drawLeft(drawScope, this.leftEffect, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(this.leftEffectNegation, edgeEffectCompat.getDistanceCompat(this.leftEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.topEffectNegation) != 0.0f) {
            drawBottom(drawScope, this.topEffectNegation, nativeCanvas);
            this.topEffectNegation.finish();
        }
        if (!this.topEffect.isFinished()) {
            zDrawLeft = drawTop(drawScope, this.topEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.topEffectNegation, edgeEffectCompat.getDistanceCompat(this.topEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.rightEffectNegation) != 0.0f) {
            drawLeft(drawScope, this.rightEffectNegation, nativeCanvas);
            this.rightEffectNegation.finish();
        }
        if (!this.rightEffect.isFinished()) {
            zDrawLeft = drawRight(drawScope, this.rightEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.rightEffectNegation, edgeEffectCompat.getDistanceCompat(this.rightEffect), 0.0f);
        }
        if (edgeEffectCompat.getDistanceCompat(this.bottomEffectNegation) != 0.0f) {
            drawTop(drawScope, this.bottomEffectNegation, nativeCanvas);
            this.bottomEffectNegation.finish();
        }
        if (!this.bottomEffect.isFinished()) {
            boolean z = drawBottom(drawScope, this.bottomEffect, nativeCanvas) || zDrawLeft;
            edgeEffectCompat.onPullDistanceCompat(this.bottomEffectNegation, edgeEffectCompat.getDistanceCompat(this.bottomEffect), 0.0f);
            zDrawLeft = z;
        }
        if (zDrawLeft) {
            invalidateOverscroll();
        }
    }

    private final boolean drawLeft(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m11165getHeightimpl(this.containerSize), drawScope.mo7874toPx0680j_4(this.overscrollConfig.getDrawPadding().mo8074calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawTop(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(0.0f, drawScope.mo7874toPx0680j_4(this.overscrollConfig.getDrawPadding().getTop()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawRight(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        int iRoundToInt = MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(this.containerSize));
        float fMo8075calculateRightPaddingu2uoSUM = this.overscrollConfig.getDrawPadding().mo8075calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-iRoundToInt) + drawScope.mo7874toPx0680j_4(fMo8075calculateRightPaddingu2uoSUM));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    private final boolean drawBottom(DrawScope drawScope, EdgeEffect edgeEffect, android.graphics.Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m11168getWidthimpl(this.containerSize), (-Size.m11165getHeightimpl(this.containerSize)) + drawScope.mo7874toPx0680j_4(this.overscrollConfig.getDrawPadding().getBottom()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invalidateOverscroll() {
        if (this.invalidationEnabled && this.consumeCount == getInvalidateCount()) {
            setInvalidateCount(getInvalidateCount() + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void animateToRelease() {
        List<EdgeEffect> list = this.allEffects;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            EdgeEffect edgeEffect = list.get(i);
            edgeEffect.onRelease();
            z = edgeEffect.isFinished() || z;
        }
        if (z) {
            invalidateOverscroll();
        }
    }

    /* renamed from: releaseOppositeOverscroll-k-4lQ0M, reason: not valid java name */
    private final boolean m7750releaseOppositeOverscrollk4lQ0M(long delta) {
        boolean zIsFinished;
        if (this.leftEffect.isFinished() || Offset.m11099getXimpl(delta) >= 0.0f) {
            zIsFinished = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.leftEffect, Offset.m11099getXimpl(delta));
            zIsFinished = this.leftEffect.isFinished();
        }
        if (!this.rightEffect.isFinished() && Offset.m11099getXimpl(delta) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.rightEffect, Offset.m11099getXimpl(delta));
            zIsFinished = zIsFinished || this.rightEffect.isFinished();
        }
        if (!this.topEffect.isFinished() && Offset.m11100getYimpl(delta) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.topEffect, Offset.m11100getYimpl(delta));
            zIsFinished = zIsFinished || this.topEffect.isFinished();
        }
        if (this.bottomEffect.isFinished() || Offset.m11100getYimpl(delta) <= 0.0f) {
            return zIsFinished;
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(this.bottomEffect, Offset.m11100getYimpl(delta));
        return zIsFinished || this.bottomEffect.isFinished();
    }

    /* renamed from: pullTop-0a9Yr6o, reason: not valid java name */
    private final float m7749pullTop0a9Yr6o(long scroll, long displacement) {
        float fM11099getXimpl = Offset.m11099getXimpl(displacement) / Size.m11168getWidthimpl(this.containerSize);
        float fM11100getYimpl = Offset.m11100getYimpl(scroll) / Size.m11165getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.topEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(this.topEffect, fM11100getYimpl, fM11099getXimpl) * Size.m11165getHeightimpl(this.containerSize) : Offset.m11100getYimpl(scroll);
    }

    /* renamed from: pullBottom-0a9Yr6o, reason: not valid java name */
    private final float m7746pullBottom0a9Yr6o(long scroll, long displacement) {
        float fM11099getXimpl = Offset.m11099getXimpl(displacement) / Size.m11168getWidthimpl(this.containerSize);
        float fM11100getYimpl = Offset.m11100getYimpl(scroll) / Size.m11165getHeightimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.bottomEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(this.bottomEffect, -fM11100getYimpl, 1 - fM11099getXimpl)) * Size.m11165getHeightimpl(this.containerSize) : Offset.m11100getYimpl(scroll);
    }

    /* renamed from: pullLeft-0a9Yr6o, reason: not valid java name */
    private final float m7747pullLeft0a9Yr6o(long scroll, long displacement) {
        float fM11100getYimpl = Offset.m11100getYimpl(displacement) / Size.m11165getHeightimpl(this.containerSize);
        float fM11099getXimpl = Offset.m11099getXimpl(scroll) / Size.m11168getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.leftEffect) == 0.0f ? edgeEffectCompat.onPullDistanceCompat(this.leftEffect, fM11099getXimpl, 1 - fM11100getYimpl) * Size.m11168getWidthimpl(this.containerSize) : Offset.m11099getXimpl(scroll);
    }

    /* renamed from: pullRight-0a9Yr6o, reason: not valid java name */
    private final float m7748pullRight0a9Yr6o(long scroll, long displacement) {
        float fM11100getYimpl = Offset.m11100getYimpl(displacement) / Size.m11165getHeightimpl(this.containerSize);
        float fM11099getXimpl = Offset.m11099getXimpl(scroll) / Size.m11168getWidthimpl(this.containerSize);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        return edgeEffectCompat.getDistanceCompat(this.rightEffect) == 0.0f ? (-edgeEffectCompat.onPullDistanceCompat(this.rightEffect, -fM11099getXimpl, fM11100getYimpl)) * Size.m11168getWidthimpl(this.containerSize) : Offset.m11099getXimpl(scroll);
    }
}
