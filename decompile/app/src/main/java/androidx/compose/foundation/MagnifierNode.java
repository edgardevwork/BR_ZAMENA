package androidx.compose.foundation;

import android.view.View;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.p003ui.layout.LayoutCoordinates;
import androidx.compose.p003ui.layout.LayoutCoordinatesKt;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNode;
import androidx.compose.p003ui.node.CompositionLocalConsumerModifierNodeKt;
import androidx.compose.p003ui.node.DrawModifierNode;
import androidx.compose.p003ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNode;
import androidx.compose.p003ui.node.ObserverModifierNodeKt;
import androidx.compose.p003ui.node.SemanticsModifierNode;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.DpSize;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.MonotonicFrameClockKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caverock.androidsvg.SVG;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Magnifier.android.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u0099\u0001\u0012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b\u0012\u001b\b\u0002\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u001a¢\u0006\u0002\u0010\u001bJ\b\u0010J\u001a\u00020\u000fH\u0016J\b\u0010K\u001a\u00020\u000fH\u0016J\u0010\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010O\u001a\u00020\u000fH\u0016J\b\u0010P\u001a\u00020\u000fH\u0002J\u0092\u0001\u0010Q\u001a\u00020\u000f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000b2\u0019\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00132\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b2\u0006\u0010\u0019\u001a\u00020\u001aø\u0001\u0000¢\u0006\u0004\bR\u0010SJ\b\u0010T\u001a\u00020\u000fH\u0002J\b\u0010U\u001a\u00020\u000fH\u0002J\f\u0010V\u001a\u00020\u000f*\u00020WH\u0016J\f\u0010X\u001a\u00020\u000f*\u00020YH\u0016R1\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\n8B@BX\u0082\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u0018\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010\u0015\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0010\u0010-\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0017\u001a\u00020\u0016X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u0010\u00100\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0002\n\u0000R-\u0010\f\u001a\u0015\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0002\b\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u00103\"\u0004\b4\u00105R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00103\"\u0004\b7\u00105R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0016\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0002\n\u0000R\"\u0010\u0014\u001a\u00020\u000eX\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0010\n\u0002\u0010@\u001a\u0004\b>\u0010\u001f\"\u0004\b?\u0010!R+\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\b\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00103\"\u0004\bB\u00105R\u0016\u0010C\u001a\u00020\nX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010@R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010%\"\u0004\bE\u0010'R\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010)\"\u0004\bI\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Z"}, m7105d2 = {"Landroidx/compose/foundation/MagnifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/CompositionLocalConsumerModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/node/ObserverModifierNode;", "sourceCenter", "Lkotlin/Function1;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/geometry/Offset;", "Lkotlin/ExtensionFunctionType;", "magnifierCenter", "onSizeChanged", "Landroidx/compose/ui/unit/DpSize;", "", "zoom", "", "useTextDefault", "", "size", "cornerRadius", "Landroidx/compose/ui/unit/Dp;", "elevation", "clippingEnabled", "platformMagnifierFactory", "Landroidx/compose/foundation/PlatformMagnifierFactory;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLandroidx/compose/foundation/PlatformMagnifierFactory;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "<set-?>", "anchorPositionInRoot", "getAnchorPositionInRoot-F1C5BW0", "()J", "setAnchorPositionInRoot-k-4lQ0M", "(J)V", "anchorPositionInRoot$delegate", "Landroidx/compose/runtime/MutableState;", "getClippingEnabled", "()Z", "setClippingEnabled", "(Z)V", "getCornerRadius-D9Ej5fM", "()F", "setCornerRadius-0680j_4", "(F)V", "F", "density", "getElevation-D9Ej5fM", "setElevation-0680j_4", "magnifier", "Landroidx/compose/foundation/PlatformMagnifier;", "getMagnifierCenter", "()Lkotlin/jvm/functions/Function1;", "setMagnifierCenter", "(Lkotlin/jvm/functions/Function1;)V", "getOnSizeChanged", "setOnSizeChanged", "getPlatformMagnifierFactory", "()Landroidx/compose/foundation/PlatformMagnifierFactory;", "setPlatformMagnifierFactory", "(Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "previousSize", "Landroidx/compose/ui/unit/IntSize;", "getSize-MYxV2XQ", "setSize-EaSLcWc", "J", "getSourceCenter", "setSourceCenter", "sourceCenterInRoot", "getUseTextDefault", "setUseTextDefault", SVG.View.NODE_NAME, "Landroid/view/View;", "getZoom", "setZoom", "onAttach", "onDetach", "onGloballyPositioned", "coordinates", "Landroidx/compose/ui/layout/LayoutCoordinates;", "onObservedReadsChanged", "recreateMagnifier", "update", "update-5F03MCQ", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;FZJFFZLkotlin/jvm/functions/Function1;Landroidx/compose/foundation/PlatformMagnifierFactory;)V", "updateMagnifier", "updateSizeIfNecessary", "applySemantics", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "draw", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n81#2:468\n107#2,2:469\n1#3:471\n*S KotlinDebug\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode\n*L\n295#1:468\n295#1:469,2\n*E\n"})
/* loaded from: classes3.dex */
public final class MagnifierNode extends Modifier.Node implements CompositionLocalConsumerModifierNode, GlobalPositionAwareModifierNode, DrawModifierNode, SemanticsModifierNode, ObserverModifierNode {
    public static final int $stable = 8;

    /* renamed from: anchorPositionInRoot$delegate, reason: from kotlin metadata */
    @NotNull
    private final MutableState anchorPositionInRoot;
    private boolean clippingEnabled;
    private float cornerRadius;

    @Nullable
    private Density density;
    private float elevation;

    @Nullable
    private PlatformMagnifier magnifier;

    @Nullable
    private Function1<? super Density, Offset> magnifierCenter;

    @Nullable
    private Function1<? super DpSize, Unit> onSizeChanged;

    @NotNull
    private PlatformMagnifierFactory platformMagnifierFactory;

    @Nullable
    private IntSize previousSize;
    private long size;

    @NotNull
    private Function1<? super Density, Offset> sourceCenter;
    private long sourceCenterInRoot;
    private boolean useTextDefault;

    @Nullable
    private View view;
    private float zoom;

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, function12, function13, f, z, j, f2, f3, z2, platformMagnifierFactory);
    }

    @NotNull
    public final Function1<Density, Offset> getSourceCenter() {
        return this.sourceCenter;
    }

    public final void setSourceCenter(@NotNull Function1<? super Density, Offset> function1) {
        this.sourceCenter = function1;
    }

    @Nullable
    public final Function1<Density, Offset> getMagnifierCenter() {
        return this.magnifierCenter;
    }

    public final void setMagnifierCenter(@Nullable Function1<? super Density, Offset> function1) {
        this.magnifierCenter = function1;
    }

    @Nullable
    public final Function1<DpSize, Unit> getOnSizeChanged() {
        return this.onSizeChanged;
    }

    public final void setOnSizeChanged(@Nullable Function1<? super DpSize, Unit> function1) {
        this.onSizeChanged = function1;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public final void setZoom(float f) {
        this.zoom = f;
    }

    public final boolean getUseTextDefault() {
        return this.useTextDefault;
    }

    public final void setUseTextDefault(boolean z) {
        this.useTextDefault = z;
    }

    public /* synthetic */ MagnifierNode(Function1 function1, Function1 function12, Function1 function13, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? null : function12, (i & 4) != 0 ? null : function13, (i & 8) != 0 ? Float.NaN : f, (i & 16) != 0 ? false : z, (i & 32) != 0 ? DpSize.INSTANCE.m13773getUnspecifiedMYxV2XQ() : j, (i & 64) != 0 ? C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM() : f2, (i & 128) != 0 ? C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM() : f3, (i & 256) != 0 ? true : z2, (i & 512) != 0 ? PlatformMagnifierFactory.INSTANCE.getForCurrentPlatform() : platformMagnifierFactory, null);
    }

    /* renamed from: getSize-MYxV2XQ, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* renamed from: setSize-EaSLcWc */
    public final void m7835setSizeEaSLcWc(long j) {
        this.size = j;
    }

    /* renamed from: getCornerRadius-D9Ej5fM, reason: from getter */
    public final float getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: setCornerRadius-0680j_4 */
    public final void m7833setCornerRadius0680j_4(float f) {
        this.cornerRadius = f;
    }

    /* renamed from: getElevation-D9Ej5fM, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* renamed from: setElevation-0680j_4 */
    public final void m7834setElevation0680j_4(float f) {
        this.elevation = f;
    }

    public final boolean getClippingEnabled() {
        return this.clippingEnabled;
    }

    public final void setClippingEnabled(boolean z) {
        this.clippingEnabled = z;
    }

    @NotNull
    public final PlatformMagnifierFactory getPlatformMagnifierFactory() {
        return this.platformMagnifierFactory;
    }

    public final void setPlatformMagnifierFactory(@NotNull PlatformMagnifierFactory platformMagnifierFactory) {
        this.platformMagnifierFactory = platformMagnifierFactory;
    }

    private MagnifierNode(Function1<? super Density, Offset> function1, Function1<? super Density, Offset> function12, Function1<? super DpSize, Unit> function13, float f, boolean z, long j, float f2, float f3, boolean z2, PlatformMagnifierFactory platformMagnifierFactory) {
        this.sourceCenter = function1;
        this.magnifierCenter = function12;
        this.onSizeChanged = function13;
        this.zoom = f;
        this.useTextDefault = z;
        this.size = j;
        this.cornerRadius = f2;
        this.elevation = f3;
        this.clippingEnabled = z2;
        this.platformMagnifierFactory = platformMagnifierFactory;
        Offset.Companion companion = Offset.INSTANCE;
        this.anchorPositionInRoot = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Offset.m11088boximpl(companion.m11114getUnspecifiedF1C5BW0()), null, 2, null);
        this.sourceCenterInRoot = companion.m11114getUnspecifiedF1C5BW0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getAnchorPositionInRoot-F1C5BW0 */
    private final long m7828getAnchorPositionInRootF1C5BW0() {
        return ((Offset) this.anchorPositionInRoot.getValue()).getPackedValue();
    }

    /* renamed from: setAnchorPositionInRoot-k-4lQ0M */
    private final void m7829setAnchorPositionInRootk4lQ0M(long j) {
        this.anchorPositionInRoot.setValue(Offset.m11088boximpl(j));
    }

    /* renamed from: update-5F03MCQ */
    public final void m7836update5F03MCQ(@NotNull Function1<? super Density, Offset> sourceCenter, @Nullable Function1<? super Density, Offset> magnifierCenter, float zoom, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, @Nullable Function1<? super DpSize, Unit> onSizeChanged, @NotNull PlatformMagnifierFactory platformMagnifierFactory) {
        float f = this.zoom;
        long j = this.size;
        float f2 = this.cornerRadius;
        float f3 = this.elevation;
        boolean z = this.clippingEnabled;
        PlatformMagnifierFactory platformMagnifierFactory2 = this.platformMagnifierFactory;
        this.sourceCenter = sourceCenter;
        this.magnifierCenter = magnifierCenter;
        this.zoom = zoom;
        this.useTextDefault = useTextDefault;
        this.size = size;
        this.cornerRadius = cornerRadius;
        this.elevation = elevation;
        this.clippingEnabled = clippingEnabled;
        this.onSizeChanged = onSizeChanged;
        this.platformMagnifierFactory = platformMagnifierFactory;
        if (this.magnifier == null || ((zoom != f && !platformMagnifierFactory.getCanUpdateZoom()) || !DpSize.m13761equalsimpl0(size, j) || !C2046Dp.m13671equalsimpl0(cornerRadius, f2) || !C2046Dp.m13671equalsimpl0(elevation, f3) || clippingEnabled != z || !Intrinsics.areEqual(platformMagnifierFactory, platformMagnifierFactory2))) {
            recreateMagnifier();
        }
        updateMagnifier();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onAttach() {
        onObservedReadsChanged();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        this.magnifier = null;
    }

    /* compiled from: Magnifier.android.kt */
    @Metadata(m7104d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m7105d2 = {"<anonymous>", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Magnifier.android.kt\nandroidx/compose/foundation/MagnifierNode$onObservedReadsChanged$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,467:1\n1#2:468\n*E\n"})
    /* renamed from: androidx.compose.foundation.MagnifierNode$onObservedReadsChanged$1 */
    /* loaded from: classes4.dex */
    public static final class C04101 extends Lambda implements Function0<Unit> {
        public C04101() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2() {
            View view = MagnifierNode.this.view;
            View view2 = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(MagnifierNode.this, AndroidCompositionLocals_androidKt.getLocalView());
            MagnifierNode.this.view = view2;
            Density density = MagnifierNode.this.density;
            Density density2 = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(MagnifierNode.this, CompositionLocalsKt.getLocalDensity());
            MagnifierNode.this.density = density2;
            if (MagnifierNode.this.magnifier == null || !Intrinsics.areEqual(view2, view) || !Intrinsics.areEqual(density2, density)) {
                MagnifierNode.this.recreateMagnifier();
            }
            MagnifierNode.this.updateMagnifier();
        }
    }

    @Override // androidx.compose.p003ui.node.ObserverModifierNode
    public void onObservedReadsChanged() {
        ObserverModifierNodeKt.observeReads(this, new Function0<Unit>() { // from class: androidx.compose.foundation.MagnifierNode.onObservedReadsChanged.1
            public C04101() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2() {
                View view = MagnifierNode.this.view;
                View view2 = (View) CompositionLocalConsumerModifierNodeKt.currentValueOf(MagnifierNode.this, AndroidCompositionLocals_androidKt.getLocalView());
                MagnifierNode.this.view = view2;
                Density density = MagnifierNode.this.density;
                Density density2 = (Density) CompositionLocalConsumerModifierNodeKt.currentValueOf(MagnifierNode.this, CompositionLocalsKt.getLocalDensity());
                MagnifierNode.this.density = density2;
                if (MagnifierNode.this.magnifier == null || !Intrinsics.areEqual(view2, view) || !Intrinsics.areEqual(density2, density)) {
                    MagnifierNode.this.recreateMagnifier();
                }
                MagnifierNode.this.updateMagnifier();
            }
        });
    }

    public final void recreateMagnifier() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier != null) {
            platformMagnifier.dismiss();
        }
        View view = this.view;
        if (view == null || (density = this.density) == null) {
            return;
        }
        this.magnifier = this.platformMagnifierFactory.mo7863createnHHXs2Y(view, this.useTextDefault, this.size, this.cornerRadius, this.elevation, this.clippingEnabled, density, this.zoom);
        updateSizeIfNecessary();
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateMagnifier() {
        Density density;
        long jM11114getUnspecifiedF1C5BW0;
        long jM11114getUnspecifiedF1C5BW02;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null) {
            return;
        }
        long packedValue = this.sourceCenter.invoke(density).getPackedValue();
        if (OffsetKt.m11118isSpecifiedk4lQ0M(m7828getAnchorPositionInRootF1C5BW0()) && OffsetKt.m11118isSpecifiedk4lQ0M(packedValue)) {
            jM11114getUnspecifiedF1C5BW0 = Offset.m11104plusMKHz9U(m7828getAnchorPositionInRootF1C5BW0(), packedValue);
        } else {
            jM11114getUnspecifiedF1C5BW0 = Offset.INSTANCE.m11114getUnspecifiedF1C5BW0();
        }
        this.sourceCenterInRoot = jM11114getUnspecifiedF1C5BW0;
        if (OffsetKt.m11118isSpecifiedk4lQ0M(jM11114getUnspecifiedF1C5BW0)) {
            Function1<? super Density, Offset> function1 = this.magnifierCenter;
            if (function1 != null) {
                Offset offsetM11088boximpl = Offset.m11088boximpl(function1.invoke(density).getPackedValue());
                if (!OffsetKt.m11118isSpecifiedk4lQ0M(offsetM11088boximpl.getPackedValue())) {
                    offsetM11088boximpl = null;
                }
                if (offsetM11088boximpl != null) {
                    jM11114getUnspecifiedF1C5BW02 = Offset.m11104plusMKHz9U(m7828getAnchorPositionInRootF1C5BW0(), offsetM11088boximpl.getPackedValue());
                } else {
                    jM11114getUnspecifiedF1C5BW02 = Offset.INSTANCE.m11114getUnspecifiedF1C5BW0();
                }
            }
            platformMagnifier.mo7862updateWko1d7g(this.sourceCenterInRoot, jM11114getUnspecifiedF1C5BW02, this.zoom);
            updateSizeIfNecessary();
            return;
        }
        platformMagnifier.dismiss();
    }

    private final void updateSizeIfNecessary() {
        Density density;
        PlatformMagnifier platformMagnifier = this.magnifier;
        if (platformMagnifier == null || (density = this.density) == null || IntSize.m13833equalsimpl(platformMagnifier.mo7861getSizeYbymL2g(), this.previousSize)) {
            return;
        }
        Function1<? super DpSize, Unit> function1 = this.onSizeChanged;
        if (function1 != null) {
            function1.invoke(DpSize.m13752boximpl(density.mo7872toDpSizekrfVVM(IntSizeKt.m13846toSizeozmzZPI(platformMagnifier.mo7861getSizeYbymL2g()))));
        }
        this.previousSize = IntSize.m13828boximpl(platformMagnifier.mo7861getSizeYbymL2g());
    }

    @Override // androidx.compose.p003ui.node.DrawModifierNode
    public void draw(@NotNull ContentDrawScope contentDrawScope) {
        contentDrawScope.drawContent();
        BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, null, new C04091(null), 3, null);
    }

    /* compiled from: Magnifier.android.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "androidx.compose.foundation.MagnifierNode$draw$1", m7120f = "Magnifier.android.kt", m7121i = {}, m7122l = {447}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: androidx.compose.foundation.MagnifierNode$draw$1 */
    /* loaded from: classes4.dex */
    public static final class C04091 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int label;

        public C04091(Continuation<? super C04091> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return MagnifierNode.this.new C04091(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((C04091) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: Magnifier.android.kt */
        @Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m7105d2 = {"<anonymous>", "", "it", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
        /* renamed from: androidx.compose.foundation.MagnifierNode$draw$1$1 */
        public static final class AnonymousClass1 extends Lambda implements Function1<Long, Unit> {
            public static final AnonymousClass1 INSTANCE = ;

            public final void invoke(long j) {
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Long l) {
                invoke(l.longValue());
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AnonymousClass1 anonymousClass1 = AnonymousClass1.INSTANCE;
                this.label = 1;
                if (MonotonicFrameClockKt.withFrameMillis(anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            PlatformMagnifier platformMagnifier = MagnifierNode.this.magnifier;
            if (platformMagnifier != null) {
                platformMagnifier.updateContent();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.p003ui.node.GlobalPositionAwareModifierNode
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        m7829setAnchorPositionInRootk4lQ0M(LayoutCoordinatesKt.positionInRoot(coordinates));
    }

    /* compiled from: Magnifier.android.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/geometry/Offset;", "invoke-F1C5BW0", "()J"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.MagnifierNode$applySemantics$1 */
    /* loaded from: classes4.dex */
    public static final class C04081 extends Lambda implements Function0<Offset> {
        public C04081() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Offset invoke() {
            return Offset.m11088boximpl(m7837invokeF1C5BW0());
        }

        /* renamed from: invoke-F1C5BW0 */
        public final long m7837invokeF1C5BW0() {
            return MagnifierNode.this.sourceCenterInRoot;
        }
    }

    @Override // androidx.compose.p003ui.node.SemanticsModifierNode
    public void applySemantics(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
        semanticsPropertyReceiver.set(Magnifier_androidKt.getMagnifierPositionInRoot(), new Function0<Offset>() { // from class: androidx.compose.foundation.MagnifierNode.applySemantics.1
            public C04081() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Offset invoke() {
                return Offset.m11088boximpl(m7837invokeF1C5BW0());
            }

            /* renamed from: invoke-F1C5BW0 */
            public final long m7837invokeF1C5BW0() {
                return MagnifierNode.this.sourceCenterInRoot;
            }
        });
    }
}
