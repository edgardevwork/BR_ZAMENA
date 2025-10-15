package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.grid.LazyGridSpanLayoutProvider;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.ConstraintsKt;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.media3.common.C2732C;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyGrid.kt */
@Metadata(m7104d1 = {"\u0000p\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a~\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00010\u0015¢\u0006\u0002\b\u0017H\u0001¢\u0006\u0002\u0010\u0018\u001av\u0010\u0019\u001a\u0019\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001a¢\u0006\u0002\b\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010!\u001a\u00020\"H\u0003¢\u0006\u0002\u0010#¨\u0006$"}, m7105d2 = {"LazyGrid", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/grid/LazyGridState;", "slots", "Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/grid/LazyGridScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyGridMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/grid/LazyGridItemProvider;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/grid/LazyGridSlotsProvider;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyGrid.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,376:1\n154#2:377\n487#3,4:378\n491#3,2:386\n495#3:392\n25#4:382\n83#4,3:395\n1116#5,3:383\n1119#5,3:389\n1116#5,6:398\n487#6:388\n74#7:393\n74#7:394\n*S KotlinDebug\n*F\n+ 1 LazyGrid.kt\nandroidx/compose/foundation/lazy/grid/LazyGridKt\n*L\n63#1:377\n85#1:378,4\n85#1:386,2\n85#1:392\n85#1:382\n168#1:395,3\n85#1:383,3\n85#1:389,3\n168#1:398,6\n85#1:388\n117#1:393\n125#1:394\n*E\n"})
/* loaded from: classes3.dex */
public final class LazyGridKt {

    /* compiled from: LazyGrid.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    /* renamed from: androidx.compose.foundation.lazy.grid.LazyGridKt$LazyGrid$1 */
    /* loaded from: classes4.dex */
    public static final class C06921 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ int $$changed1;
        public final /* synthetic */ int $$default;
        public final /* synthetic */ Function1<LazyGridScope, Unit> $content;
        public final /* synthetic */ PaddingValues $contentPadding;
        public final /* synthetic */ FlingBehavior $flingBehavior;
        public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
        public final /* synthetic */ boolean $isVertical;
        public final /* synthetic */ boolean $reverseLayout;
        public final /* synthetic */ LazyGridSlotsProvider $slots;
        public final /* synthetic */ LazyGridState $state;
        public final /* synthetic */ boolean $userScrollEnabled;
        public final /* synthetic */ Arrangement.Vertical $verticalArrangement;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C06921(LazyGridState lazyGridState, LazyGridSlotsProvider lazyGridSlotsProvider, PaddingValues paddingValues, boolean z, boolean z2, FlingBehavior flingBehavior, boolean z3, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Function1<? super LazyGridScope, Unit> function1, int i, int i2, int i3) {
            super(2);
            lazyGridState = lazyGridState;
            lazyGridSlotsProvider = lazyGridSlotsProvider;
            paddingValues = paddingValues;
            z = z;
            z = z2;
            flingBehavior = flingBehavior;
            z = z3;
            vertical = vertical;
            horizontal = horizontal;
            function1 = function1;
            i = i;
            i = i2;
            i = i3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            LazyGridKt.LazyGrid(modifier, lazyGridState, lazyGridSlotsProvider, paddingValues, z, z, flingBehavior, z, vertical, horizontal, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyGrid(@Nullable Modifier modifier, @NotNull LazyGridState lazyGridState, @NotNull LazyGridSlotsProvider lazyGridSlotsProvider, @Nullable PaddingValues paddingValues, boolean z, boolean z2, @Nullable FlingBehavior flingBehavior, boolean z3, @NotNull Arrangement.Vertical vertical, @NotNull Arrangement.Horizontal horizontal, @NotNull Function1<? super LazyGridScope, Unit> function1, @Nullable Composer composer, int i, int i2, int i3) {
        Modifier modifier2;
        int i4;
        PaddingValues paddingValues2;
        int i5;
        int i6;
        int i7;
        FlingBehavior flingBehavior2;
        Modifier modifier3;
        boolean z4;
        PaddingValues paddingValues3;
        int i8;
        Object objRememberedValue;
        Composer composer2;
        boolean z5;
        Modifier modifier4;
        PaddingValues paddingValues4;
        FlingBehavior flingBehavior3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-649686062);
        int i9 = i3 & 1;
        if (i9 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 14) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 112) == 0) {
            i4 |= composerStartRestartGroup.changed(lazyGridState) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 896) == 0) {
            i4 |= composerStartRestartGroup.changed(lazyGridSlotsProvider) ? 256 : 128;
        }
        int i10 = i3 & 8;
        if (i10 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 7168) == 0) {
                paddingValues2 = paddingValues;
                i4 |= composerStartRestartGroup.changed(paddingValues2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else if ((i & 57344) == 0) {
                i4 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            if ((i3 & 32) == 0) {
                i6 = ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else {
                if ((i & 458752) == 0) {
                    i6 = composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                if ((i & 3670016) == 0) {
                    i4 |= ((i3 & 64) == 0 && composerStartRestartGroup.changed(flingBehavior)) ? 1048576 : 524288;
                }
                if ((i3 & 128) != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 29360128) == 0) {
                        i4 |= composerStartRestartGroup.changed(z3) ? 8388608 : 4194304;
                    }
                    if ((i3 & 256) == 0) {
                        i4 |= 100663296;
                    } else {
                        if ((234881024 & i) == 0) {
                            i4 |= composerStartRestartGroup.changed(vertical) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        if ((i3 & 512) == 0) {
                            if ((1879048192 & i) == 0) {
                                i4 |= composerStartRestartGroup.changed(horizontal) ? 536870912 : 268435456;
                            }
                            if ((i3 & 1024) == 0) {
                                i7 = i2 | 6;
                            } else if ((i2 & 14) == 0) {
                                i7 = i2 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                            } else {
                                i7 = i2;
                            }
                            if ((i4 & 1533916891) == 306783378 || (i7 & 11) != 2 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                                    PaddingValues paddingValuesM8116PaddingValues0680j_4 = i10 == 0 ? PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0)) : paddingValues2;
                                    boolean z6 = i5 == 0 ? z : false;
                                    if ((i3 & 64) == 0) {
                                        i4 &= -3670017;
                                        modifier3 = modifier5;
                                        z4 = z6;
                                        paddingValues3 = paddingValuesM8116PaddingValues0680j_4;
                                        flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composerStartRestartGroup, 6);
                                    } else {
                                        flingBehavior2 = flingBehavior;
                                        modifier3 = modifier5;
                                        z4 = z6;
                                        paddingValues3 = paddingValuesM8116PaddingValues0680j_4;
                                    }
                                    i8 = i4;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 64) != 0) {
                                        i4 &= -3670017;
                                    }
                                    flingBehavior2 = flingBehavior;
                                    modifier3 = modifier2;
                                    i8 = i4;
                                    paddingValues3 = paddingValues2;
                                    z4 = z;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-649686062, i8, i7, "androidx.compose.foundation.lazy.grid.LazyGrid (LazyGrid.kt:77)");
                                }
                                ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                                OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composerStartRestartGroup, 6);
                                int i11 = i8 >> 3;
                                int i12 = i11 & 14;
                                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState, function1, composerStartRestartGroup, ((i7 << 3) & 112) | i12);
                                int i13 = i8 >> 9;
                                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState, z4, composerStartRestartGroup, (i13 & 112) | i12);
                                composerStartRestartGroup.startReplaceableGroup(773894976);
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                    composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                composerStartRestartGroup.endReplaceableGroup();
                                int i14 = i8;
                                boolean z7 = z4;
                                Modifier modifier6 = modifier3;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda, lazyGridState, lazyGridSlotsProvider, paddingValues3, z4, z2, horizontal, vertical, coroutineScope, composerStartRestartGroup, (i8 & 112) | C2732C.BUFFER_FLAG_FIRST_SAMPLE | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i13 & 3670016) | (i11 & 29360128));
                                lazyGridState.setVertical$foundation_release(z2);
                                Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                                composer2 = composerStartRestartGroup;
                                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda, ScrollableKt.scrollable$default(OverscrollKt.overscroll(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier6.then(lazyGridState.getRemeasurementModifier()).then(lazyGridState.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda, lazyLayoutSemanticStateRememberLazyGridSemanticState, orientation, z3, z7, composerStartRestartGroup, (i13 & 57344) | ((i14 << 3) & 458752)), orientation), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState, composerStartRestartGroup, i12), lazyGridState.getBeyondBoundsInfo(), z7, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z3, composerStartRestartGroup, (MutableVector.$stable << 6) | (i11 & 7168) | (i11 & 3670016)), overscrollEffect), lazyGridState, orientation, overscrollEffect, z3, scrollableDefaults.reverseDirection((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z7), flingBehavior2, lazyGridState.getInternalInteractionSource(), null, 128, null), lazyGridState.getPrefetchState(), function2RememberLazyGridMeasurePolicy, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                z5 = z7;
                                modifier4 = modifier6;
                                paddingValues4 = paddingValues3;
                                flingBehavior3 = flingBehavior2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                z5 = z;
                                modifier4 = modifier2;
                                paddingValues4 = paddingValues2;
                                composer2 = composerStartRestartGroup;
                                flingBehavior3 = flingBehavior;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt.LazyGrid.1
                                    public final /* synthetic */ int $$changed;
                                    public final /* synthetic */ int $$changed1;
                                    public final /* synthetic */ int $$default;
                                    public final /* synthetic */ Function1<LazyGridScope, Unit> $content;
                                    public final /* synthetic */ PaddingValues $contentPadding;
                                    public final /* synthetic */ FlingBehavior $flingBehavior;
                                    public final /* synthetic */ Arrangement.Horizontal $horizontalArrangement;
                                    public final /* synthetic */ boolean $isVertical;
                                    public final /* synthetic */ boolean $reverseLayout;
                                    public final /* synthetic */ LazyGridSlotsProvider $slots;
                                    public final /* synthetic */ LazyGridState $state;
                                    public final /* synthetic */ boolean $userScrollEnabled;
                                    public final /* synthetic */ Arrangement.Vertical $verticalArrangement;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    public C06921(LazyGridState lazyGridState2, LazyGridSlotsProvider lazyGridSlotsProvider2, PaddingValues paddingValues42, boolean z52, boolean z22, FlingBehavior flingBehavior32, boolean z32, Arrangement.Vertical vertical2, Arrangement.Horizontal horizontal2, Function1<? super LazyGridScope, Unit> function12, int i15, int i22, int i32) {
                                        super(2);
                                        lazyGridState = lazyGridState2;
                                        lazyGridSlotsProvider = lazyGridSlotsProvider2;
                                        paddingValues = paddingValues42;
                                        z = z52;
                                        z = z22;
                                        flingBehavior = flingBehavior32;
                                        z = z32;
                                        vertical = vertical2;
                                        horizontal = horizontal2;
                                        function1 = function12;
                                        i = i15;
                                        i = i22;
                                        i = i32;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer3, int i15) {
                                        LazyGridKt.LazyGrid(modifier, lazyGridState, lazyGridSlotsProvider, paddingValues, z, z, flingBehavior, z, vertical, horizontal, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i), i);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 805306368;
                        if ((i32 & 1024) == 0) {
                        }
                        if ((i4 & 1533916891) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i15 & 1) != 0) {
                                if (i9 == 0) {
                                }
                                if (i10 == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if ((i32 & 64) == 0) {
                                }
                                i8 = i4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                ScrollableDefaults scrollableDefaults2 = ScrollableDefaults.INSTANCE;
                                OverscrollEffect overscrollEffect2 = scrollableDefaults2.overscrollEffect(composerStartRestartGroup, 6);
                                int i112 = i8 >> 3;
                                int i122 = i112 & 14;
                                Function0<LazyGridItemProvider> function0RememberLazyGridItemProviderLambda2 = LazyGridItemProviderKt.rememberLazyGridItemProviderLambda(lazyGridState2, function12, composerStartRestartGroup, ((i7 << 3) & 112) | i122);
                                int i132 = i8 >> 9;
                                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyGridSemanticState2 = LazySemanticsKt.rememberLazyGridSemanticState(lazyGridState2, z4, composerStartRestartGroup, (i132 & 112) | i122);
                                composerStartRestartGroup.startReplaceableGroup(773894976);
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                composerStartRestartGroup.endReplaceableGroup();
                                int i142 = i8;
                                boolean z72 = z4;
                                Modifier modifier62 = modifier3;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyGridMeasurePolicy2 = rememberLazyGridMeasurePolicy(function0RememberLazyGridItemProviderLambda2, lazyGridState2, lazyGridSlotsProvider2, paddingValues3, z4, z22, horizontal2, vertical2, coroutineScope2, composerStartRestartGroup, (i8 & 112) | C2732C.BUFFER_FLAG_FIRST_SAMPLE | (i8 & 896) | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | (i132 & 3670016) | (i112 & 29360128));
                                lazyGridState2.setVertical$foundation_release(z22);
                                Orientation orientation2 = !z22 ? Orientation.Vertical : Orientation.Horizontal;
                                composer2 = composerStartRestartGroup;
                                LazyLayoutKt.LazyLayout(function0RememberLazyGridItemProviderLambda2, ScrollableKt.scrollable$default(OverscrollKt.overscroll(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier62.then(lazyGridState2.getRemeasurementModifier()).then(lazyGridState2.getAwaitLayoutModifier()), function0RememberLazyGridItemProviderLambda2, lazyLayoutSemanticStateRememberLazyGridSemanticState2, orientation2, z32, z72, composerStartRestartGroup, (i132 & 57344) | ((i142 << 3) & 458752)), orientation2), LazyGridBeyondBoundsModifierKt.rememberLazyGridBeyondBoundsState(lazyGridState2, composerStartRestartGroup, i122), lazyGridState2.getBeyondBoundsInfo(), z72, (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z32, composerStartRestartGroup, (MutableVector.$stable << 6) | (i112 & 7168) | (i112 & 3670016)), overscrollEffect2), lazyGridState2, orientation2, overscrollEffect2, z32, scrollableDefaults2.reverseDirection((LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z72), flingBehavior2, lazyGridState2.getInternalInteractionSource(), null, 128, null), lazyGridState2.getPrefetchState(), function2RememberLazyGridMeasurePolicy2, composer2, 0, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z52 = z72;
                                modifier4 = modifier62;
                                paddingValues42 = paddingValues3;
                                flingBehavior32 = flingBehavior2;
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i32 & 512) == 0) {
                    }
                    if ((i32 & 1024) == 0) {
                    }
                    if ((i4 & 1533916891) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i32 & 256) == 0) {
                }
                if ((i32 & 512) == 0) {
                }
                if ((i32 & 1024) == 0) {
                }
                if ((i4 & 1533916891) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 |= i6;
            if ((i15 & 3670016) == 0) {
            }
            if ((i32 & 128) != 0) {
            }
            if ((i32 & 256) == 0) {
            }
            if ((i32 & 512) == 0) {
            }
            if ((i32 & 1024) == 0) {
            }
            if ((i4 & 1533916891) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        paddingValues2 = paddingValues;
        i5 = i32 & 16;
        if (i5 == 0) {
        }
        if ((i32 & 32) == 0) {
        }
        i4 |= i6;
        if ((i15 & 3670016) == 0) {
        }
        if ((i32 & 128) != 0) {
        }
        if ((i32 & 256) == 0) {
        }
        if ((i32 & 512) == 0) {
        }
        if ((i32 & 1024) == 0) {
        }
        if ((i4 & 1533916891) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @Composable
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyGridMeasurePolicy(final Function0<? extends LazyGridItemProvider> function0, final LazyGridState lazyGridState, final LazyGridSlotsProvider lazyGridSlotsProvider, final PaddingValues paddingValues, final boolean z, final boolean z2, final Arrangement.Horizontal horizontal, final Arrangement.Vertical vertical, final CoroutineScope coroutineScope, Composer composer, int i) {
        composer.startReplaceableGroup(-2068958445);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2068958445, i, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridMeasurePolicy (LazyGrid.kt:167)");
        }
        Object[] objArr = {lazyGridState, lazyGridSlotsProvider, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal, vertical};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i2 = 0; i2 < 7; i2++) {
            zChanged |= composer.changed(objArr[i2]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2<LazyLayoutMeasureScope, Constraints, LazyGridMeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyGridMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m8259invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                /* JADX WARN: Type inference failed for: r34v0, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider] */
                /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1, androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider] */
                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyGridMeasureResult m8259invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int iMo7868roundToPx0680j_4;
                    int iMo7868roundToPx0680j_42;
                    int i3;
                    float spacing;
                    int iM13622getMaxWidthimpl;
                    long jIntOffset;
                    int firstVisibleItemScrollOffset;
                    int lineIndexOfItem;
                    CheckScrollableContainerConstraintsKt.m7799checkScrollableContainerConstraintsK40F9xA(j, z2 ? Orientation.Vertical : Orientation.Horizontal);
                    if (z2) {
                        iMo7868roundToPx0680j_4 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(paddingValues.mo8074calculateLeftPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        iMo7868roundToPx0680j_4 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(PaddingKt.calculateStartPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    if (z2) {
                        iMo7868roundToPx0680j_42 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(paddingValues.mo8075calculateRightPaddingu2uoSUM(lazyLayoutMeasureScope.getLayoutDirection()));
                    } else {
                        iMo7868roundToPx0680j_42 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(PaddingKt.calculateEndPadding(paddingValues, lazyLayoutMeasureScope.getLayoutDirection()));
                    }
                    int iMo7868roundToPx0680j_43 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(paddingValues.getTop());
                    int iMo7868roundToPx0680j_44 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(paddingValues.getBottom());
                    final int i4 = iMo7868roundToPx0680j_43 + iMo7868roundToPx0680j_44;
                    final int i5 = iMo7868roundToPx0680j_4 + iMo7868roundToPx0680j_42;
                    boolean z3 = z2;
                    int i6 = z3 ? i4 : i5;
                    if (z3 && !z) {
                        i3 = iMo7868roundToPx0680j_43;
                    } else if (z3 && z) {
                        i3 = iMo7868roundToPx0680j_44;
                    } else {
                        i3 = (z3 || z) ? iMo7868roundToPx0680j_42 : iMo7868roundToPx0680j_4;
                    }
                    final int i7 = i6 - i3;
                    long jM13638offsetNN6EwU = ConstraintsKt.m13638offsetNN6EwU(j, -i5, -i4);
                    final LazyGridItemProvider lazyGridItemProviderInvoke = function0.invoke();
                    final LazyGridSpanLayoutProvider spanLayoutProvider = lazyGridItemProviderInvoke.getSpanLayoutProvider();
                    final LazyGridSlots lazyGridSlotsMo8248invoke0kLqBqw = lazyGridSlotsProvider.mo8248invoke0kLqBqw(lazyLayoutMeasureScope, j);
                    int length = lazyGridSlotsMo8248invoke0kLqBqw.getSizes().length;
                    spanLayoutProvider.setSlotsPerLine(length);
                    lazyGridState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    lazyGridState.setSlotsPerLine$foundation_release(length);
                    if (z2) {
                        Arrangement.Vertical vertical2 = vertical;
                        if (vertical2 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical2.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal2 = horizontal;
                        if (horizontal2 == null) {
                            throw new IllegalArgumentException("null horizontalArrangement when isVertical == false".toString());
                        }
                        spacing = horizontal2.getSpacing();
                    }
                    final int iMo7868roundToPx0680j_45 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(spacing);
                    final int itemCount = lazyGridItemProviderInvoke.getItemCount();
                    if (z2) {
                        iM13622getMaxWidthimpl = Constraints.m13621getMaxHeightimpl(j) - i4;
                    } else {
                        iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j) - i5;
                    }
                    int i8 = iM13622getMaxWidthimpl;
                    if (!z || i8 > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(iMo7868roundToPx0680j_4, iMo7868roundToPx0680j_43);
                    } else {
                        boolean z4 = z2;
                        if (!z4) {
                            iMo7868roundToPx0680j_4 += i8;
                        }
                        if (z4) {
                            iMo7868roundToPx0680j_43 += i8;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(iMo7868roundToPx0680j_4, iMo7868roundToPx0680j_43);
                    }
                    final long j2 = jIntOffset;
                    final LazyGridState lazyGridState2 = lazyGridState;
                    final boolean z5 = z2;
                    final boolean z6 = z;
                    final int i9 = i3;
                    final ?? r34 = new LazyGridMeasuredItemProvider(lazyGridItemProviderInvoke, lazyLayoutMeasureScope, iMo7868roundToPx0680j_45, lazyGridState2, z5, z6, i9, i7, j2) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ LazyGridState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$state = lazyGridState2;
                            this.$isVertical = z5;
                            this.$reverseLayout = z6;
                            this.$beforeContentPadding = i9;
                            this.$afterContentPadding = i7;
                            this.$visualItemOffset = j2;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredItemProvider
                        @NotNull
                        public LazyGridMeasuredItem createItem(int index, @NotNull Object key, @Nullable Object contentType, int crossAxisSize, int mainAxisSpacing, @NotNull List<? extends Placeable> placeables) {
                            return new LazyGridMeasuredItem(index, key, this.$isVertical, crossAxisSize, mainAxisSpacing, this.$reverseLayout, this.$this_null.getLayoutDirection(), this.$beforeContentPadding, this.$afterContentPadding, placeables, this.$visualItemOffset, contentType, this.$state.getPlacementAnimator(), null);
                        }
                    };
                    final boolean z7 = z2;
                    final ?? r9 = new LazyGridMeasuredLineProvider(z7, lazyGridSlotsMo8248invoke0kLqBqw, itemCount, iMo7868roundToPx0680j_45, r34, spanLayoutProvider) { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1$measuredLineProvider$1
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ LazyGridSlots $resolvedSlots;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(z7, lazyGridSlotsMo8248invoke0kLqBqw, itemCount, iMo7868roundToPx0680j_45, r34, spanLayoutProvider);
                            this.$isVertical = z7;
                            this.$resolvedSlots = lazyGridSlotsMo8248invoke0kLqBqw;
                        }

                        @Override // androidx.compose.foundation.lazy.grid.LazyGridMeasuredLineProvider
                        @NotNull
                        public LazyGridMeasuredLine createLine(int index, @NotNull LazyGridMeasuredItem[] items, @NotNull List<GridItemSpan> spans, int mainAxisSpacing) {
                            return new LazyGridMeasuredLine(index, items, this.$resolvedSlots, spans, this.$isVertical, mainAxisSpacing);
                        }
                    };
                    lazyGridState.setPrefetchInfoRetriever$foundation_release(new Function1<Integer, ArrayList<Pair<? extends Integer, ? extends Constraints>>>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ ArrayList<Pair<? extends Integer, ? extends Constraints>> invoke(Integer num) {
                            return invoke(num.intValue());
                        }

                        @NotNull
                        public final ArrayList<Pair<Integer, Constraints>> invoke(int i10) {
                            LazyGridSpanLayoutProvider.LineConfiguration lineConfiguration = spanLayoutProvider.getLineConfiguration(i10);
                            int firstItemIndex = lineConfiguration.getFirstItemIndex();
                            ArrayList<Pair<Integer, Constraints>> arrayList = new ArrayList<>(lineConfiguration.getSpans().size());
                            List<GridItemSpan> spans = lineConfiguration.getSpans();
                            C0696xaa796ba c0696xaa796ba = r9;
                            int size = spans.size();
                            int i11 = 0;
                            for (int i12 = 0; i12 < size; i12++) {
                                int iM8244getCurrentLineSpanimpl = GridItemSpan.m8244getCurrentLineSpanimpl(spans.get(i12).getPackedValue());
                                arrayList.add(TuplesKt.m7112to(Integer.valueOf(firstItemIndex), Constraints.m13610boximpl(c0696xaa796ba.m8266childConstraintsJhjzzOo$foundation_release(i11, iM8244getCurrentLineSpanimpl))));
                                firstItemIndex++;
                                i11 += iM8244getCurrentLineSpanimpl;
                            }
                            return arrayList;
                        }
                    });
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyGridState lazyGridState3 = lazyGridState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyGridState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyGridItemProviderInvoke, lazyGridState3.getFirstVisibleItemIndex());
                            if (iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release < itemCount || itemCount <= 0) {
                                int lineIndexOfItem2 = spanLayoutProvider.getLineIndexOfItem(iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release);
                                firstVisibleItemScrollOffset = lazyGridState3.getFirstVisibleItemScrollOffset();
                                lineIndexOfItem = lineIndexOfItem2;
                            } else {
                                lineIndexOfItem = spanLayoutProvider.getLineIndexOfItem(itemCount - 1);
                                firstVisibleItemScrollOffset = 0;
                            }
                            Unit unit = Unit.INSTANCE;
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            snapshotCreateNonObservableSnapshot.dispose();
                            LazyGridMeasureResult lazyGridMeasureResultM8261measureLazyGridW2FL7xs = LazyGridMeasureKt.m8261measureLazyGridW2FL7xs(itemCount, r9, r34, i8, i3, i7, iMo7868roundToPx0680j_45, lineIndexOfItem, firstVisibleItemScrollOffset, lazyGridState.getScrollToBeConsumed(), jM13638offsetNN6EwU, z2, vertical, horizontal, z, lazyLayoutMeasureScope, lazyGridState.getPlacementAnimator(), spanLayoutProvider, LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyGridItemProviderInvoke, lazyGridState.getPinnedItems(), lazyGridState.getBeyondBoundsInfo()), coroutineScope, lazyGridState.m8268getPlacementScopeInvalidatorzYiylxw$foundation_release(), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridKt$rememberLazyGridMeasurePolicy$1$1.3
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                    return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                }

                                @NotNull
                                public final MeasureResult invoke(int i10, int i11, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1) {
                                    return lazyLayoutMeasureScope.layout(ConstraintsKt.m13636constrainWidthK40F9xA(j, i10 + i5), ConstraintsKt.m13635constrainHeightK40F9xA(j, i11 + i4), MapsKt__MapsKt.emptyMap(), function1);
                                }
                            });
                            LazyGridState.applyMeasureResult$foundation_release$default(lazyGridState, lazyGridMeasureResultM8261measureLazyGridW2FL7xs, false, 2, null);
                            return lazyGridMeasureResultM8261measureLazyGridW2FL7xs;
                        } catch (Throwable th) {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th2;
                    }
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2 = (Function2) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return function2;
    }
}
