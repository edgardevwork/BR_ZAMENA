package androidx.compose.foundation.lazy;

import androidx.compose.foundation.CheckScrollableContainerConstraintsKt;
import androidx.compose.foundation.ClipScrollableContainerKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.OverscrollEffect;
import androidx.compose.foundation.OverscrollKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocalKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsStateKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticState;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
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
import androidx.profileinstaller.ProfileVerifier;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LazyList.kt */
@Metadata(m7104d1 = {"\u0000v\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0098\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0017\u0010\u0018\u001a\u0013\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010\u0019¢\u0006\u0002\b\u001bH\u0001¢\u0006\u0002\u0010\u001c\u001a\u008a\u0001\u0010\u001d\u001a\u0019\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001e¢\u0006\u0002\b\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0003¢\u0006\u0002\u0010%¨\u0006&"}, m7105d2 = {"LazyList", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "isVertical", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "userScrollEnabled", "beyondBoundsItemCount", "", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZLandroidx/compose/foundation/gestures/FlingBehavior;ZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "rememberLazyListMeasurePolicy", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/layout/LazyLayoutMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "itemProviderLambda", "Lkotlin/Function0;", "Landroidx/compose/foundation/lazy/LazyListItemProvider;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZZILandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/runtime/Composer;II)Lkotlin/jvm/functions/Function2;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLazyList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,353:1\n487#2,4:354\n491#2,2:362\n495#2:368\n25#3:358\n83#3,3:371\n1116#4,3:359\n1119#4,3:365\n1116#4,6:374\n487#5:364\n74#6:369\n74#6:370\n*S KotlinDebug\n*F\n+ 1 LazyList.kt\nandroidx/compose/foundation/lazy/LazyListKt\n*L\n84#1:354,4\n84#1:362,2\n84#1:368\n84#1:358\n168#1:371,3\n84#1:359,3\n84#1:365,3\n168#1:374,6\n84#1:364\n121#1:369\n129#1:370\n*E\n"})
/* loaded from: classes.dex */
public final class LazyListKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0122  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LazyList(@NotNull final Modifier modifier, @NotNull final LazyListState lazyListState, @NotNull final PaddingValues paddingValues, final boolean z, final boolean z2, @NotNull final FlingBehavior flingBehavior, final boolean z3, int i, @Nullable Alignment.Horizontal horizontal, @Nullable Arrangement.Vertical vertical, @Nullable Alignment.Vertical vertical2, @Nullable Arrangement.Horizontal horizontal2, @NotNull final Function1<? super LazyListScope, Unit> function1, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object objRememberedValue;
        Composer composer2;
        final Alignment.Horizontal horizontal3;
        final Arrangement.Vertical vertical3;
        final int i13;
        final Alignment.Vertical vertical4;
        final Arrangement.Horizontal horizontal4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(620764179);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 112) == 0) {
            i5 |= composerStartRestartGroup.changed(lazyListState) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 896) == 0) {
                i5 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 7168) == 0) {
                i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= CpioConstants.C_ISBLK;
            } else if ((i2 & 57344) == 0) {
                i5 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
            }
            if ((i4 & 32) != 0) {
                if ((i2 & 458752) == 0) {
                    i5 |= composerStartRestartGroup.changed(flingBehavior) ? 131072 : 65536;
                }
                if ((i4 & 64) != 0) {
                    i5 |= 1572864;
                } else if ((i2 & 3670016) == 0) {
                    i5 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                }
                i6 = i4 & 128;
                if (i6 != 0) {
                    i5 |= 12582912;
                } else if ((i2 & 29360128) == 0) {
                    i5 |= composerStartRestartGroup.changed(i) ? 8388608 : 4194304;
                }
                i7 = i4 & 256;
                if (i7 != 0) {
                    i5 |= 100663296;
                } else if ((i2 & 234881024) == 0) {
                    i5 |= composerStartRestartGroup.changed(horizontal) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                }
                i8 = i4 & 512;
                if (i8 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 1879048192) == 0) {
                    i5 |= composerStartRestartGroup.changed(vertical) ? 536870912 : 268435456;
                }
                i9 = i4 & 1024;
                if (i9 != 0) {
                    i10 = i3 | 6;
                } else if ((i3 & 14) == 0) {
                    i10 = i3 | (composerStartRestartGroup.changed(vertical2) ? 4 : 2);
                } else {
                    i10 = i3;
                }
                i11 = i4 & 2048;
                if (i11 != 0) {
                    i10 |= 48;
                } else if ((i3 & 112) == 0) {
                    i10 |= composerStartRestartGroup.changed(horizontal2) ? 32 : 16;
                }
                i12 = i10;
                if ((i4 & 4096) != 0) {
                    i12 |= 384;
                } else if ((i3 & 896) == 0) {
                    i12 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                }
                if ((1533916891 & i5) != 306783378 || (i12 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                    int i14 = i6 == 0 ? 0 : i;
                    Alignment.Horizontal horizontal5 = i7 == 0 ? null : horizontal;
                    Arrangement.Vertical vertical5 = i8 == 0 ? null : vertical;
                    Alignment.Vertical vertical6 = i9 == 0 ? null : vertical2;
                    Arrangement.Horizontal horizontal6 = i11 == 0 ? null : horizontal2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(620764179, i5, i12, "androidx.compose.foundation.lazy.LazyList (LazyList.kt:79)");
                    }
                    int i15 = (i5 >> 3) & 14;
                    Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i15 | ((i12 >> 3) & 112));
                    LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i15 | ((i5 >> 9) & 112));
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
                    lazyListState.setCoroutineScope$foundation_release(coroutineScope);
                    int i16 = i5 & 7168;
                    int i17 = i5 >> 6;
                    int i18 = i12 << 21;
                    int i19 = i5;
                    int i20 = i14;
                    Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal6, vertical5, composerStartRestartGroup, (65520 & i5) | (i17 & 458752) | (i17 & 3670016) | (i18 & 29360128) | (i18 & 234881024) | (1879048192 & i5), 0);
                    ScrollableDefaults scrollableDefaults = ScrollableDefaults.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    OverscrollEffect overscrollEffect = scrollableDefaults.overscrollEffect(composer2, 6);
                    Orientation orientation = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                    LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda, ScrollableKt.scrollable$default(OverscrollKt.overscroll(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda, lazyLayoutSemanticStateRememberLazyListSemanticState, orientation, z3, z, composer2, (i17 & 57344) | ((i19 << 6) & 458752)), orientation), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i20, composer2, i15 | ((i19 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z3, composer2, (MutableVector.$stable << 6) | i16 | (i19 & 3670016)), overscrollEffect), lazyListState, orientation, overscrollEffect, z3, scrollableDefaults.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation, z), flingBehavior, lazyListState.getInternalInteractionSource(), null, 128, null), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy, composer2, 0, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontal3 = horizontal5;
                    vertical3 = vertical5;
                    i13 = i20;
                    vertical4 = vertical6;
                    horizontal4 = horizontal6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    i13 = i;
                    vertical3 = vertical;
                    vertical4 = vertical2;
                    horizontal4 = horizontal2;
                    composer2 = composerStartRestartGroup;
                    horizontal3 = horizontal;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.lazy.LazyListKt.LazyList.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i21) {
                            LazyListKt.LazyList(modifier, lazyListState, paddingValues, z, z2, flingBehavior, z3, i13, horizontal3, vertical3, vertical4, horizontal4, function1, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                        }
                    });
                    return;
                }
                return;
            }
            i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            if ((i4 & 64) != 0) {
            }
            i6 = i4 & 128;
            if (i6 != 0) {
            }
            i7 = i4 & 256;
            if (i7 != 0) {
            }
            i8 = i4 & 512;
            if (i8 != 0) {
            }
            i9 = i4 & 1024;
            if (i9 != 0) {
            }
            i11 = i4 & 2048;
            if (i11 != 0) {
            }
            i12 = i10;
            if ((i4 & 4096) != 0) {
            }
            if ((1533916891 & i5) != 306783378) {
                if (i6 == 0) {
                }
                if (i7 == 0) {
                }
                if (i8 == 0) {
                }
                if (i9 == 0) {
                }
                if (i11 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i152 = (i5 >> 3) & 14;
                Function0<LazyListItemProvider> function0RememberLazyListItemProviderLambda2 = LazyListItemProviderKt.rememberLazyListItemProviderLambda(lazyListState, function1, composerStartRestartGroup, i152 | ((i12 >> 3) & 112));
                LazyLayoutSemanticState lazyLayoutSemanticStateRememberLazyListSemanticState2 = LazyListSemanticsKt.rememberLazyListSemanticState(lazyListState, z2, composerStartRestartGroup, i152 | ((i5 >> 9) & 112));
                composerStartRestartGroup.startReplaceableGroup(773894976);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceableGroup();
                CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                lazyListState.setCoroutineScope$foundation_release(coroutineScope2);
                int i162 = i5 & 7168;
                int i172 = i5 >> 6;
                int i182 = i12 << 21;
                int i192 = i5;
                int i202 = i14;
                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2RememberLazyListMeasurePolicy2 = rememberLazyListMeasurePolicy(function0RememberLazyListItemProviderLambda2, lazyListState, paddingValues, z, z2, i14, horizontal5, vertical6, horizontal6, vertical5, composerStartRestartGroup, (65520 & i5) | (i172 & 458752) | (i172 & 3670016) | (i182 & 29360128) | (i182 & 234881024) | (1879048192 & i5), 0);
                ScrollableDefaults scrollableDefaults2 = ScrollableDefaults.INSTANCE;
                composer2 = composerStartRestartGroup;
                OverscrollEffect overscrollEffect2 = scrollableDefaults2.overscrollEffect(composer2, 6);
                Orientation orientation2 = !z2 ? Orientation.Vertical : Orientation.Horizontal;
                LazyLayoutKt.LazyLayout(function0RememberLazyListItemProviderLambda2, ScrollableKt.scrollable$default(OverscrollKt.overscroll(LazyLayoutBeyondBoundsModifierLocalKt.lazyLayoutBeyondBoundsModifier(ClipScrollableContainerKt.clipScrollableContainer(LazyLayoutSemanticsKt.lazyLayoutSemantics(modifier.then(lazyListState.getRemeasurementModifier()).then(lazyListState.getAwaitLayoutModifier()), function0RememberLazyListItemProviderLambda2, lazyLayoutSemanticStateRememberLazyListSemanticState2, orientation2, z3, z, composer2, (i172 & 57344) | ((i192 << 6) & 458752)), orientation2), LazyListBeyondBoundsModifierKt.rememberLazyListBeyondBoundsState(lazyListState, i202, composer2, i152 | ((i192 >> 18) & 112)), lazyListState.getBeyondBoundsInfo(), z, (LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z3, composer2, (MutableVector.$stable << 6) | i162 | (i192 & 3670016)), overscrollEffect2), lazyListState, orientation2, overscrollEffect2, z3, scrollableDefaults2.reverseDirection((LayoutDirection) composer2.consume(CompositionLocalsKt.getLocalLayoutDirection()), orientation2, z), flingBehavior, lazyListState.getInternalInteractionSource(), null, 128, null), lazyListState.getPrefetchState(), function2RememberLazyListMeasurePolicy2, composer2, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontal3 = horizontal5;
                vertical3 = vertical5;
                i13 = i202;
                vertical4 = vertical6;
                horizontal4 = horizontal6;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) != 0) {
        }
        if ((i4 & 64) != 0) {
        }
        i6 = i4 & 128;
        if (i6 != 0) {
        }
        i7 = i4 & 256;
        if (i7 != 0) {
        }
        i8 = i4 & 512;
        if (i8 != 0) {
        }
        i9 = i4 & 1024;
        if (i9 != 0) {
        }
        i11 = i4 & 2048;
        if (i11 != 0) {
        }
        i12 = i10;
        if ((i4 & 4096) != 0) {
        }
        if ((1533916891 & i5) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    @Composable
    @ExperimentalFoundationApi
    private static final Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> rememberLazyListMeasurePolicy(final Function0<? extends LazyListItemProvider> function0, final LazyListState lazyListState, final PaddingValues paddingValues, final boolean z, final boolean z2, final int i, Alignment.Horizontal horizontal, Alignment.Vertical vertical, Arrangement.Horizontal horizontal2, Arrangement.Vertical vertical2, Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(183156450);
        final Alignment.Horizontal horizontal3 = (i3 & 64) != 0 ? null : horizontal;
        final Alignment.Vertical vertical3 = (i3 & 128) != 0 ? null : vertical;
        Arrangement.Horizontal horizontal4 = (i3 & 256) != 0 ? null : horizontal2;
        Arrangement.Vertical vertical4 = (i3 & 512) == 0 ? vertical2 : null;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(183156450, i2, -1, "androidx.compose.foundation.lazy.rememberLazyListMeasurePolicy (LazyList.kt:167)");
        }
        Object[] objArr = {lazyListState, paddingValues, Boolean.valueOf(z), Boolean.valueOf(z2), horizontal3, vertical3, horizontal4, vertical4};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i4 = 0; i4 < 8; i4++) {
            zChanged |= composer.changed(objArr[i4]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final Arrangement.Vertical vertical5 = vertical4;
            final Arrangement.Horizontal horizontal5 = horizontal4;
            objRememberedValue = new Function2<LazyLayoutMeasureScope, Constraints, LazyListMeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ LazyListMeasureResult invoke(LazyLayoutMeasureScope lazyLayoutMeasureScope, Constraints constraints) {
                    return m8228invoke0kLqBqw(lazyLayoutMeasureScope, constraints.getValue());
                }

                @NotNull
                /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                public final LazyListMeasureResult m8228invoke0kLqBqw(@NotNull final LazyLayoutMeasureScope lazyLayoutMeasureScope, final long j) {
                    int iMo7868roundToPx0680j_4;
                    int iMo7868roundToPx0680j_42;
                    int i5;
                    float spacing;
                    int iM13622getMaxWidthimpl;
                    long jIntOffset;
                    float scrollToBeConsumed;
                    boolean z3 = lazyListState.getHasLookaheadPassOccurred() || lazyLayoutMeasureScope.isLookingAhead();
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
                    final int i6 = iMo7868roundToPx0680j_43 + iMo7868roundToPx0680j_44;
                    final int i7 = iMo7868roundToPx0680j_4 + iMo7868roundToPx0680j_42;
                    boolean z4 = z2;
                    int i8 = z4 ? i6 : i7;
                    if (z4 && !z) {
                        i5 = iMo7868roundToPx0680j_43;
                    } else if (z4 && z) {
                        i5 = iMo7868roundToPx0680j_44;
                    } else {
                        i5 = (z4 || z) ? iMo7868roundToPx0680j_42 : iMo7868roundToPx0680j_4;
                    }
                    final int i9 = i8 - i5;
                    final long jM13638offsetNN6EwU = ConstraintsKt.m13638offsetNN6EwU(j, -i7, -i6);
                    lazyListState.setDensity$foundation_release(lazyLayoutMeasureScope);
                    final LazyListItemProvider lazyListItemProviderInvoke = function0.invoke();
                    lazyListItemProviderInvoke.getItemScope().setMaxSize(Constraints.m13622getMaxWidthimpl(jM13638offsetNN6EwU), Constraints.m13621getMaxHeightimpl(jM13638offsetNN6EwU));
                    if (z2) {
                        Arrangement.Vertical vertical6 = vertical5;
                        if (vertical6 == null) {
                            throw new IllegalArgumentException("null verticalArrangement when isVertical == true".toString());
                        }
                        spacing = vertical6.getSpacing();
                    } else {
                        Arrangement.Horizontal horizontal6 = horizontal5;
                        if (horizontal6 == null) {
                            throw new IllegalArgumentException("null horizontalAlignment when isVertical == false".toString());
                        }
                        spacing = horizontal6.getSpacing();
                    }
                    final int iMo7868roundToPx0680j_45 = lazyLayoutMeasureScope.mo7868roundToPx0680j_4(spacing);
                    final int itemCount = lazyListItemProviderInvoke.getItemCount();
                    if (z2) {
                        iM13622getMaxWidthimpl = Constraints.m13621getMaxHeightimpl(j) - i6;
                    } else {
                        iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j) - i7;
                    }
                    int i10 = iM13622getMaxWidthimpl;
                    if (!z || i10 > 0) {
                        jIntOffset = IntOffsetKt.IntOffset(iMo7868roundToPx0680j_4, iMo7868roundToPx0680j_43);
                    } else {
                        boolean z5 = z2;
                        if (!z5) {
                            iMo7868roundToPx0680j_4 += i10;
                        }
                        if (z5) {
                            iMo7868roundToPx0680j_43 += i10;
                        }
                        jIntOffset = IntOffsetKt.IntOffset(iMo7868roundToPx0680j_4, iMo7868roundToPx0680j_43);
                    }
                    final long j2 = jIntOffset;
                    final boolean z6 = z2;
                    final Alignment.Horizontal horizontal7 = horizontal3;
                    final Alignment.Vertical vertical7 = vertical3;
                    final boolean z7 = z;
                    final LazyListState lazyListState2 = lazyListState;
                    final int i11 = i5;
                    LazyListMeasuredItemProvider lazyListMeasuredItemProvider = new LazyListMeasuredItemProvider(jM13638offsetNN6EwU, z6, lazyListItemProviderInvoke, lazyLayoutMeasureScope, itemCount, iMo7868roundToPx0680j_45, horizontal7, vertical7, z7, i11, i9, j2, lazyListState2) { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1$measuredItemProvider$1
                        final /* synthetic */ int $afterContentPadding;
                        final /* synthetic */ int $beforeContentPadding;
                        final /* synthetic */ Alignment.Horizontal $horizontalAlignment;
                        final /* synthetic */ boolean $isVertical;
                        final /* synthetic */ int $itemsCount;
                        final /* synthetic */ boolean $reverseLayout;
                        final /* synthetic */ int $spaceBetweenItems;
                        final /* synthetic */ LazyListState $state;
                        final /* synthetic */ LazyLayoutMeasureScope $this_null;
                        final /* synthetic */ Alignment.Vertical $verticalAlignment;
                        final /* synthetic */ long $visualItemOffset;

                        {
                            this.$isVertical = z6;
                            this.$this_null = lazyLayoutMeasureScope;
                            this.$itemsCount = itemCount;
                            this.$spaceBetweenItems = iMo7868roundToPx0680j_45;
                            this.$horizontalAlignment = horizontal7;
                            this.$verticalAlignment = vertical7;
                            this.$reverseLayout = z7;
                            this.$beforeContentPadding = i11;
                            this.$afterContentPadding = i9;
                            this.$visualItemOffset = j2;
                            this.$state = lazyListState2;
                        }

                        @Override // androidx.compose.foundation.lazy.LazyListMeasuredItemProvider
                        @NotNull
                        public LazyListMeasuredItem createItem(int index, @NotNull Object key, @Nullable Object contentType, @NotNull List<? extends Placeable> placeables) {
                            return new LazyListMeasuredItem(index, placeables, this.$isVertical, this.$horizontalAlignment, this.$verticalAlignment, this.$this_null.getLayoutDirection(), this.$reverseLayout, this.$beforeContentPadding, this.$afterContentPadding, index == this.$itemsCount + (-1) ? 0 : this.$spaceBetweenItems, this.$visualItemOffset, key, contentType, this.$state.getItemAnimator(), null);
                        }
                    };
                    lazyListState.m8239setPremeasureConstraintsBRTryo0$foundation_release(lazyListMeasuredItemProvider.getChildConstraints());
                    Snapshot.Companion companion = Snapshot.INSTANCE;
                    LazyListState lazyListState3 = lazyListState;
                    Snapshot snapshotCreateNonObservableSnapshot = companion.createNonObservableSnapshot();
                    try {
                        Snapshot snapshotMakeCurrent = snapshotCreateNonObservableSnapshot.makeCurrent();
                        try {
                            int iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release = lazyListState3.updateScrollPositionIfTheFirstItemWasMoved$foundation_release(lazyListItemProviderInvoke, lazyListState3.getFirstVisibleItemIndex());
                            int firstVisibleItemScrollOffset = lazyListState3.getFirstVisibleItemScrollOffset();
                            Unit unit = Unit.INSTANCE;
                            snapshotCreateNonObservableSnapshot.dispose();
                            List<Integer> listCalculateLazyLayoutPinnedIndices = LazyLayoutBeyondBoundsStateKt.calculateLazyLayoutPinnedIndices(lazyListItemProviderInvoke, lazyListState.getPinnedItems(), lazyListState.getBeyondBoundsInfo());
                            if (lazyLayoutMeasureScope.isLookingAhead() || !z3) {
                                scrollToBeConsumed = lazyListState.getScrollToBeConsumed();
                            } else {
                                scrollToBeConsumed = lazyListState.getScrollDeltaBetweenPasses$foundation_release();
                            }
                            float f = scrollToBeConsumed;
                            boolean z8 = z2;
                            List<Integer> headerIndexes = lazyListItemProviderInvoke.getHeaderIndexes();
                            Arrangement.Vertical vertical8 = vertical5;
                            Arrangement.Horizontal horizontal8 = horizontal5;
                            boolean z9 = z;
                            LazyListItemAnimator itemAnimator = lazyListState.getItemAnimator();
                            int i12 = i;
                            boolean zIsLookingAhead = lazyLayoutMeasureScope.isLookingAhead();
                            LazyListMeasureResult postLookaheadLayoutInfo = lazyListState.getPostLookaheadLayoutInfo();
                            CoroutineScope coroutineScope = lazyListState.getCoroutineScope();
                            if (coroutineScope != null) {
                                LazyListMeasureResult lazyListMeasureResultM8232measureLazyList5IMabDg = LazyListMeasureKt.m8232measureLazyList5IMabDg(itemCount, lazyListMeasuredItemProvider, i10, i5, i9, iMo7868roundToPx0680j_45, iUpdateScrollPositionIfTheFirstItemWasMoved$foundation_release, firstVisibleItemScrollOffset, f, jM13638offsetNN6EwU, z8, headerIndexes, vertical8, horizontal8, z9, lazyLayoutMeasureScope, itemAnimator, i12, listCalculateLazyLayoutPinnedIndices, z3, zIsLookingAhead, postLookaheadLayoutInfo, coroutineScope, lazyListState.m8237getPlacementScopeInvalidatorzYiylxw$foundation_release(), new Function3<Integer, Integer, Function1<? super Placeable.PlacementScope, ? extends Unit>, MeasureResult>() { // from class: androidx.compose.foundation.lazy.LazyListKt$rememberLazyListMeasurePolicy$1$1.3
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ MeasureResult invoke(Integer num, Integer num2, Function1<? super Placeable.PlacementScope, ? extends Unit> function1) {
                                        return invoke(num.intValue(), num2.intValue(), (Function1<? super Placeable.PlacementScope, Unit>) function1);
                                    }

                                    @NotNull
                                    public final MeasureResult invoke(int i13, int i14, @NotNull Function1<? super Placeable.PlacementScope, Unit> function1) {
                                        return lazyLayoutMeasureScope.layout(ConstraintsKt.m13636constrainWidthK40F9xA(j, i13 + i7), ConstraintsKt.m13635constrainHeightK40F9xA(j, i14 + i6), MapsKt__MapsKt.emptyMap(), function1);
                                    }
                                });
                                LazyListState.applyMeasureResult$foundation_release$default(lazyListState, lazyListMeasureResultM8232measureLazyList5IMabDg, lazyLayoutMeasureScope.isLookingAhead(), false, 4, null);
                                return lazyListMeasureResultM8232measureLazyList5IMabDg;
                            }
                            throw new IllegalArgumentException("coroutineScope should be not null".toString());
                        } finally {
                            snapshotCreateNonObservableSnapshot.restoreCurrent(snapshotMakeCurrent);
                        }
                    } catch (Throwable th) {
                        snapshotCreateNonObservableSnapshot.dispose();
                        throw th;
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
