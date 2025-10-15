package androidx.compose.foundation.pager;

import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.FinalSnappingItem;
import androidx.compose.foundation.gestures.snapping.LazyListSnapLayoutInfoProviderKt;
import androidx.compose.foundation.gestures.snapping.SnapFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider;
import androidx.compose.foundation.gestures.snapping.SnapPositionInLayoutKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.pager.PageSize;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.p003ui.semantics.SemanticsModifierKt;
import androidx.compose.p003ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p003ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.profileinstaller.ProfileVerifier;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Pager.kt */
@Metadata(m7104d1 = {"\u0000 \u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aØ\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f21\u0010 \u001a-\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b$¢\u0006\u0002\b%H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a.\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\b2\u0006\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.2\u0006\u00100\u001a\u00020/H\u0002\u001aØ\u0001\u00101\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u00102\u001a\u0002032\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00012\b\b\u0002\u0010\u0017\u001a\u00020\u00012%\b\u0002\u0010\u0018\u001a\u001f\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u00192\b\b\u0002\u0010\u001e\u001a\u00020\u001f21\u0010 \u001a-\u0012\u0004\u0012\u00020\"\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00060!¢\u0006\u0002\b$¢\u0006\u0002\b%H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105\u001a\u0017\u00106\u001a\u00020\u00062\f\u00107\u001a\b\u0012\u0004\u0012\u00020908H\u0082\b\u001a\f\u0010:\u001a\u00020/*\u00020\bH\u0002\u001a\f\u0010;\u001a\u00020\u0001*\u00020\bH\u0002\u001a!\u0010<\u001a\u00020\n*\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010>\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006?"}, m7105d2 = {"DEBUG", "", "LowVelocityAnimationDefaultDuration", "", "PagerDebugEnable", "HorizontalPager", "", "state", "Landroidx/compose/foundation/pager/PagerState;", "modifier", "Landroidx/compose/ui/Modifier;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "pageSize", "Landroidx/compose/foundation/pager/PageSize;", "beyondBoundsPageCount", "pageSpacing", "Landroidx/compose/ui/unit/Dp;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "flingBehavior", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "userScrollEnabled", "reverseLayout", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.INDEX, "", "pageNestedScrollConnection", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", Const.PAGE_KEY, "Landroidx/compose/runtime/Composable;", "Lkotlin/ExtensionFunctionType;", "HorizontalPager-xYaah8o", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "SnapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapLayoutInfoProvider;", "pagerState", "pagerSnapDistance", "Landroidx/compose/foundation/pager/PagerSnapDistance;", "decayAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "snapPositionalThreshold", "VerticalPager", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "VerticalPager-xYaah8o", "(Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/foundation/pager/PageSize;IFLandroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "debugLog", "generateMsg", "Lkotlin/Function0;", "", "dragGestureDelta", "isScrollingForward", "pagerSemantics", "isVertical", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;ZLandroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "foundation_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nPager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,967:1\n154#2:968\n154#2:969\n154#2:977\n154#2:978\n36#3:970\n36#3:979\n25#3:990\n1116#4,6:971\n1116#4,6:980\n1116#4,3:991\n1119#4,3:997\n487#5,4:986\n491#5,2:994\n495#5:1000\n487#6:996\n*S KotlinDebug\n*F\n+ 1 Pager.kt\nandroidx/compose/foundation/pager/PagerKt\n*L\n112#1:968\n115#1:969\n192#1:977\n195#1:978\n121#1:970\n201#1:979\n913#1:990\n121#1:971,6\n201#1:980,6\n913#1:991,3\n913#1:997,3\n913#1:986,4\n913#1:994,2\n913#1:1000\n913#1:996\n*E\n"})
/* loaded from: classes2.dex */
public final class PagerKt {
    private static final boolean DEBUG = false;
    private static final int LowVelocityAnimationDefaultDuration = 500;
    public static final boolean PagerDebugEnable = false;

    private static final void debugLog(Function0<String> function0) {
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: HorizontalPager-xYaah8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8350HorizontalPagerxYaah8o(@NotNull final PagerState pagerState, @Nullable Modifier modifier, @Nullable PaddingValues paddingValues, @Nullable PageSize pageSize, int i, float f, @Nullable Alignment.Vertical vertical, @Nullable SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, @Nullable Function1<? super Integer, ? extends Object> function1, @Nullable NestedScrollConnection nestedScrollConnection, @NotNull final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        Alignment.Vertical centerVertically;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        PageSize pageSize2;
        int i20;
        boolean z3;
        int i21;
        SnapFlingBehavior snapFlingBehaviorFlingBehavior;
        NestedScrollConnection nestedScrollConnection2;
        SnapFlingBehavior snapFlingBehavior2;
        Function1<? super Integer, ? extends Object> function12;
        Alignment.Vertical vertical2;
        int i22;
        float f3;
        PaddingValues paddingValues3;
        Modifier modifier3;
        boolean z4;
        int i23;
        Composer composer2;
        final Modifier modifier4;
        final PaddingValues paddingValues4;
        final PageSize pageSize3;
        final int i24;
        final float f4;
        final Alignment.Vertical vertical3;
        final SnapFlingBehavior snapFlingBehavior3;
        final boolean z5;
        final Function1<? super Integer, ? extends Object> function13;
        final boolean z6;
        final NestedScrollConnection nestedScrollConnection3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1491175841);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i25 = i4 & 2;
        if (i25 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 896) == 0) {
                    paddingValues2 = paddingValues;
                    i5 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        i5 |= composerStartRestartGroup.changed(pageSize) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= CpioConstants.C_ISBLK;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 458752) == 0) {
                            i5 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                        centerVertically = vertical;
                    } else {
                        centerVertically = vertical;
                        if ((i2 & 3670016) == 0) {
                            i5 |= composerStartRestartGroup.changed(centerVertically) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 29360128) == 0) {
                        i5 |= ((i4 & 128) == 0 && composerStartRestartGroup.changed(snapFlingBehavior)) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                        if ((i2 & 234881024) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changed(z) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 1879048192) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 14) == 0) {
                            i17 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                            i17 |= 16;
                        }
                        i19 = i17;
                        if ((i4 & 4096) != 0) {
                            i19 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i19 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
                        }
                        if (i18 != 2048 || (i15 & 1533916891) != 306783378 || (i19 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i25 == 0 ? Modifier.INSTANCE : modifier2;
                                PaddingValues paddingValuesM8116PaddingValues0680j_4 = i6 == 0 ? PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0)) : paddingValues2;
                                pageSize2 = i7 == 0 ? PageSize.Fill.INSTANCE : pageSize;
                                int i26 = i8 == 0 ? 0 : i;
                                float fM13666constructorimpl = i9 == 0 ? C2046Dp.m13666constructorimpl(0) : f2;
                                if (i10 != 0) {
                                    centerVertically = Alignment.INSTANCE.getCenterVertically();
                                }
                                if ((i4 & 128) == 0) {
                                    i20 = i19;
                                    z3 = false;
                                    i21 = i18;
                                    snapFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, null, 0.0f, composerStartRestartGroup, (i15 & 14) | 2097152, 62);
                                    i15 &= -29360129;
                                } else {
                                    i20 = i19;
                                    z3 = false;
                                    i21 = i18;
                                    snapFlingBehaviorFlingBehavior = snapFlingBehavior;
                                }
                                boolean z7 = i12 == 0 ? true : z;
                                if (i14 == 0) {
                                    z3 = z2;
                                }
                                Function1<? super Integer, ? extends Object> function14 = i16 == 0 ? null : function1;
                                if (i21 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    boolean zChanged = composerStartRestartGroup.changed(pagerState);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, Orientation.Horizontal);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    snapFlingBehavior2 = snapFlingBehaviorFlingBehavior;
                                    function12 = function14;
                                    nestedScrollConnection2 = (NestedScrollConnection) objRememberedValue;
                                    i19 = i20 & (-113);
                                    vertical2 = centerVertically;
                                    i22 = i26;
                                } else {
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapFlingBehavior2 = snapFlingBehaviorFlingBehavior;
                                    function12 = function14;
                                    vertical2 = centerVertically;
                                    i22 = i26;
                                    i19 = i20;
                                }
                                f3 = fM13666constructorimpl;
                                paddingValues3 = paddingValuesM8116PaddingValues0680j_4;
                                modifier3 = modifier5;
                                int i27 = i15;
                                z4 = z7;
                                i23 = i27;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 128) != 0) {
                                    i15 &= -29360129;
                                }
                                if (i18 != 0) {
                                    i19 &= -113;
                                }
                                pageSize2 = pageSize;
                                i22 = i;
                                snapFlingBehavior2 = snapFlingBehavior;
                                z3 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                modifier3 = modifier2;
                                f3 = f2;
                                paddingValues3 = paddingValues2;
                                vertical2 = centerVertically;
                                i23 = i15;
                                z4 = z;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1491175841, i23, i19, "androidx.compose.foundation.pager.HorizontalPager (Pager.kt:124)");
                            }
                            Orientation orientation = Orientation.Horizontal;
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            composer2 = composerStartRestartGroup;
                            int i28 = i23 >> 6;
                            int i29 = ((i23 >> 3) & 14) | CpioConstants.C_ISBLK | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i28 & 458752) | (i28 & 3670016);
                            int i30 = i23 << 9;
                            LazyLayoutPagerKt.m8345Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, orientation, snapFlingBehavior2, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, centerHorizontally, vertical2, function4, composer2, i29 | (29360128 & i30) | (i30 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 9) & 7168) | ((i19 << 3) & 112) | 392 | ((i19 << 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            paddingValues4 = paddingValues3;
                            pageSize3 = pageSize2;
                            i24 = i22;
                            f4 = f3;
                            vertical3 = vertical2;
                            snapFlingBehavior3 = snapFlingBehavior2;
                            z5 = z4;
                            function13 = function12;
                            z6 = z3;
                            nestedScrollConnection3 = nestedScrollConnection2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i24 = i;
                            z5 = z;
                            function13 = function1;
                            modifier4 = modifier2;
                            f4 = f2;
                            paddingValues4 = paddingValues2;
                            vertical3 = centerVertically;
                            composer2 = composerStartRestartGroup;
                            pageSize3 = pageSize;
                            snapFlingBehavior3 = snapFlingBehavior;
                            z6 = z2;
                            nestedScrollConnection3 = nestedScrollConnection;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$HorizontalPager$2
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

                                public final void invoke(@Nullable Composer composer3, int i31) {
                                    PagerKt.m8350HorizontalPagerxYaah8o(pagerState, modifier4, paddingValues4, pageSize3, i24, f4, vertical3, snapFlingBehavior3, z5, z6, function13, nestedScrollConnection3, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    i19 = i17;
                    if ((i4 & 4096) != 0) {
                    }
                    if (i18 != 2048) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i25 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 != 0) {
                            }
                            if ((i4 & 128) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            f3 = fM13666constructorimpl;
                            paddingValues3 = paddingValuesM8116PaddingValues0680j_4;
                            modifier3 = modifier5;
                            int i272 = i15;
                            z4 = z7;
                            i23 = i272;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Orientation orientation2 = Orientation.Horizontal;
                            Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
                            composer2 = composerStartRestartGroup;
                            int i282 = i23 >> 6;
                            int i292 = ((i23 >> 3) & 14) | CpioConstants.C_ISBLK | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i282 & 458752) | (i282 & 3670016);
                            int i302 = i23 << 9;
                            LazyLayoutPagerKt.m8345Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, orientation2, snapFlingBehavior2, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, centerHorizontally2, vertical2, function4, composer2, i292 | (29360128 & i302) | (i302 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 9) & 7168) | ((i19 << 3) & 112) | 392 | ((i19 << 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            paddingValues4 = paddingValues3;
                            pageSize3 = pageSize2;
                            i24 = i22;
                            f4 = f3;
                            vertical3 = vertical2;
                            snapFlingBehavior3 = snapFlingBehavior2;
                            z5 = z4;
                            function13 = function12;
                            z6 = z3;
                            nestedScrollConnection3 = nestedScrollConnection2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                i19 = i17;
                if ((i4 & 4096) != 0) {
                }
                if (i18 != 2048) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            i19 = i17;
            if ((i4 & 4096) != 0) {
            }
            if (i18 != 2048) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        i19 = i17;
        if ((i4 & 4096) != 0) {
        }
        if (i18 != 2048) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:207:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    @Composable
    @ExperimentalFoundationApi
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: VerticalPager-xYaah8o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m8351VerticalPagerxYaah8o(@NotNull final PagerState pagerState, @Nullable Modifier modifier, @Nullable PaddingValues paddingValues, @Nullable PageSize pageSize, int i, float f, @Nullable Alignment.Horizontal horizontal, @Nullable SnapFlingBehavior snapFlingBehavior, boolean z, boolean z2, @Nullable Function1<? super Integer, ? extends Object> function1, @Nullable NestedScrollConnection nestedScrollConnection, @NotNull final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, @Nullable Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        Modifier modifier2;
        int i6;
        PaddingValues paddingValues2;
        int i7;
        int i8;
        int i9;
        float f2;
        int i10;
        Alignment.Horizontal centerHorizontally;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        PageSize pageSize2;
        int i20;
        boolean z3;
        int i21;
        SnapFlingBehavior snapFlingBehaviorFlingBehavior;
        NestedScrollConnection nestedScrollConnection2;
        SnapFlingBehavior snapFlingBehavior2;
        Function1<? super Integer, ? extends Object> function12;
        Alignment.Horizontal horizontal2;
        int i22;
        float f3;
        PaddingValues paddingValues3;
        Modifier modifier3;
        boolean z4;
        int i23;
        Composer composer2;
        final Modifier modifier4;
        final PaddingValues paddingValues4;
        final PageSize pageSize3;
        final int i24;
        final float f4;
        final Alignment.Horizontal horizontal3;
        final SnapFlingBehavior snapFlingBehavior3;
        final boolean z5;
        final Function1<? super Integer, ? extends Object> function13;
        final boolean z6;
        final NestedScrollConnection nestedScrollConnection3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1457068767);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i5 = (composerStartRestartGroup.changed(pagerState) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        int i25 = i4 & 2;
        if (i25 != 0) {
            i5 |= 48;
        } else {
            if ((i2 & 112) == 0) {
                modifier2 = modifier;
                i5 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i6 = i4 & 4;
            if (i6 == 0) {
                i5 |= 384;
            } else {
                if ((i2 & 896) == 0) {
                    paddingValues2 = paddingValues;
                    i5 |= composerStartRestartGroup.changed(paddingValues2) ? 256 : 128;
                }
                i7 = i4 & 8;
                if (i7 != 0) {
                    i5 |= 3072;
                } else {
                    if ((i2 & 7168) == 0) {
                        i5 |= composerStartRestartGroup.changed(pageSize) ? 2048 : 1024;
                    }
                    i8 = i4 & 16;
                    if (i8 == 0) {
                        i5 |= CpioConstants.C_ISBLK;
                    } else if ((i2 & 57344) == 0) {
                        i5 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
                    }
                    i9 = i4 & 32;
                    if (i9 == 0) {
                        i5 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                        f2 = f;
                    } else {
                        f2 = f;
                        if ((i2 & 458752) == 0) {
                            i5 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                        }
                    }
                    i10 = i4 & 64;
                    if (i10 == 0) {
                        i5 |= 1572864;
                        centerHorizontally = horizontal;
                    } else {
                        centerHorizontally = horizontal;
                        if ((i2 & 3670016) == 0) {
                            i5 |= composerStartRestartGroup.changed(centerHorizontally) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 29360128) == 0) {
                        i5 |= ((i4 & 128) == 0 && composerStartRestartGroup.changed(snapFlingBehavior)) ? 8388608 : 4194304;
                    }
                    i11 = i4 & 256;
                    if (i11 != 0) {
                        if ((i2 & 234881024) == 0) {
                            i12 = i11;
                            i5 |= composerStartRestartGroup.changed(z) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                        }
                        i13 = i4 & 512;
                        if (i13 != 0) {
                            i15 = i5 | 805306368;
                            i14 = i13;
                        } else {
                            if ((i2 & 1879048192) == 0) {
                                i14 = i13;
                                i5 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                            } else {
                                i14 = i13;
                            }
                            i15 = i5;
                        }
                        i16 = i4 & 1024;
                        if (i16 != 0) {
                            i17 = i3 | 6;
                        } else if ((i3 & 14) == 0) {
                            i17 = i3 | (composerStartRestartGroup.changedInstance(function1) ? 4 : 2);
                        } else {
                            i17 = i3;
                        }
                        i18 = i4 & 2048;
                        if (i18 != 0) {
                            i17 |= 16;
                        }
                        i19 = i17;
                        if ((i4 & 4096) != 0) {
                            i19 |= 384;
                        } else if ((i3 & 896) == 0) {
                            i19 |= composerStartRestartGroup.changedInstance(function4) ? 256 : 128;
                        }
                        if (i18 != 2048 || (i15 & 1533916891) != 306783378 || (i19 & 731) != 146 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier5 = i25 == 0 ? Modifier.INSTANCE : modifier2;
                                PaddingValues paddingValuesM8116PaddingValues0680j_4 = i6 == 0 ? PaddingKt.m8116PaddingValues0680j_4(C2046Dp.m13666constructorimpl(0)) : paddingValues2;
                                pageSize2 = i7 == 0 ? PageSize.Fill.INSTANCE : pageSize;
                                int i26 = i8 == 0 ? 0 : i;
                                float fM13666constructorimpl = i9 == 0 ? C2046Dp.m13666constructorimpl(0) : f2;
                                if (i10 != 0) {
                                    centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                }
                                if ((i4 & 128) == 0) {
                                    i20 = i19;
                                    z3 = false;
                                    i21 = i18;
                                    snapFlingBehaviorFlingBehavior = PagerDefaults.INSTANCE.flingBehavior(pagerState, null, null, null, null, 0.0f, composerStartRestartGroup, (i15 & 14) | 2097152, 62);
                                    i15 &= -29360129;
                                } else {
                                    i20 = i19;
                                    z3 = false;
                                    i21 = i18;
                                    snapFlingBehaviorFlingBehavior = snapFlingBehavior;
                                }
                                boolean z7 = i12 == 0 ? true : z;
                                if (i14 == 0) {
                                    z3 = z2;
                                }
                                Function1<? super Integer, ? extends Object> function14 = i16 == 0 ? null : function1;
                                if (i21 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                                    boolean zChanged = composerStartRestartGroup.changed(pagerState);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = PagerDefaults.INSTANCE.pageNestedScrollConnection(pagerState, Orientation.Vertical);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    snapFlingBehavior2 = snapFlingBehaviorFlingBehavior;
                                    function12 = function14;
                                    nestedScrollConnection2 = (NestedScrollConnection) objRememberedValue;
                                    i19 = i20 & (-113);
                                    horizontal2 = centerHorizontally;
                                    i22 = i26;
                                } else {
                                    nestedScrollConnection2 = nestedScrollConnection;
                                    snapFlingBehavior2 = snapFlingBehaviorFlingBehavior;
                                    function12 = function14;
                                    horizontal2 = centerHorizontally;
                                    i22 = i26;
                                    i19 = i20;
                                }
                                f3 = fM13666constructorimpl;
                                paddingValues3 = paddingValuesM8116PaddingValues0680j_4;
                                modifier3 = modifier5;
                                int i27 = i15;
                                z4 = z7;
                                i23 = i27;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i4 & 128) != 0) {
                                    i15 &= -29360129;
                                }
                                if (i18 != 0) {
                                    i19 &= -113;
                                }
                                pageSize2 = pageSize;
                                i22 = i;
                                snapFlingBehavior2 = snapFlingBehavior;
                                z3 = z2;
                                function12 = function1;
                                nestedScrollConnection2 = nestedScrollConnection;
                                modifier3 = modifier2;
                                f3 = f2;
                                paddingValues3 = paddingValues2;
                                horizontal2 = centerHorizontally;
                                i23 = i15;
                                z4 = z;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1457068767, i23, i19, "androidx.compose.foundation.pager.VerticalPager (Pager.kt:204)");
                            }
                            Orientation orientation = Orientation.Vertical;
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            composer2 = composerStartRestartGroup;
                            int i28 = i23 >> 6;
                            int i29 = ((i23 >> 3) & 14) | CpioConstants.C_ISBLK | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i28 & 458752) | (i28 & 3670016);
                            int i30 = i23 << 9;
                            LazyLayoutPagerKt.m8345Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, orientation, snapFlingBehavior2, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, horizontal2, centerVertically, function4, composer2, i29 | (29360128 & i30) | (i30 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 12) & 896) | ((i19 << 3) & 112) | 3080 | ((i19 << 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier4 = modifier3;
                            paddingValues4 = paddingValues3;
                            pageSize3 = pageSize2;
                            i24 = i22;
                            f4 = f3;
                            horizontal3 = horizontal2;
                            snapFlingBehavior3 = snapFlingBehavior2;
                            z5 = z4;
                            function13 = function12;
                            z6 = z3;
                            nestedScrollConnection3 = nestedScrollConnection2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            i24 = i;
                            z5 = z;
                            function13 = function1;
                            nestedScrollConnection3 = nestedScrollConnection;
                            modifier4 = modifier2;
                            f4 = f2;
                            paddingValues4 = paddingValues2;
                            horizontal3 = centerHorizontally;
                            composer2 = composerStartRestartGroup;
                            pageSize3 = pageSize;
                            snapFlingBehavior3 = snapFlingBehavior;
                            z6 = z2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt$VerticalPager$2
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

                                public final void invoke(@Nullable Composer composer3, int i31) {
                                    PagerKt.m8351VerticalPagerxYaah8o(pagerState, modifier4, paddingValues4, pageSize3, i24, f4, horizontal3, snapFlingBehavior3, z5, z6, function13, nestedScrollConnection3, function4, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i5 |= 100663296;
                    i12 = i11;
                    i13 = i4 & 512;
                    if (i13 != 0) {
                    }
                    i16 = i4 & 1024;
                    if (i16 != 0) {
                    }
                    i18 = i4 & 2048;
                    if (i18 != 0) {
                    }
                    i19 = i17;
                    if ((i4 & 4096) != 0) {
                    }
                    if (i18 != 2048) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i25 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i7 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (i9 == 0) {
                            }
                            if (i10 != 0) {
                            }
                            if ((i4 & 128) == 0) {
                            }
                            if (i12 == 0) {
                            }
                            if (i14 == 0) {
                            }
                            if (i16 == 0) {
                            }
                            if (i21 == 0) {
                            }
                            f3 = fM13666constructorimpl;
                            paddingValues3 = paddingValuesM8116PaddingValues0680j_4;
                            modifier3 = modifier5;
                            int i272 = i15;
                            z4 = z7;
                            i23 = i272;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Orientation orientation2 = Orientation.Vertical;
                            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                            composer2 = composerStartRestartGroup;
                            int i282 = i23 >> 6;
                            int i292 = ((i23 >> 3) & 14) | CpioConstants.C_ISBLK | ((i23 << 3) & 112) | (i23 & 896) | ((i23 >> 18) & 7168) | (i282 & 458752) | (i282 & 3670016);
                            int i302 = i23 << 9;
                            LazyLayoutPagerKt.m8345Pagerfs30GE4(modifier3, pagerState, paddingValues3, z3, orientation2, snapFlingBehavior2, z4, i22, f3, pageSize2, nestedScrollConnection2, function12, horizontal2, centerVertically2, function4, composer2, i292 | (29360128 & i302) | (i302 & 234881024) | ((i23 << 18) & 1879048192), ((i23 >> 12) & 896) | ((i19 << 3) & 112) | 3080 | ((i19 << 6) & 57344), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                            paddingValues4 = paddingValues3;
                            pageSize3 = pageSize2;
                            i24 = i22;
                            f4 = f3;
                            horizontal3 = horizontal2;
                            snapFlingBehavior3 = snapFlingBehavior2;
                            z5 = z4;
                            function13 = function12;
                            z6 = z3;
                            nestedScrollConnection3 = nestedScrollConnection2;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i4 & 16;
                if (i8 == 0) {
                }
                i9 = i4 & 32;
                if (i9 == 0) {
                }
                i10 = i4 & 64;
                if (i10 == 0) {
                }
                if ((i2 & 29360128) == 0) {
                }
                i11 = i4 & 256;
                if (i11 != 0) {
                }
                i12 = i11;
                i13 = i4 & 512;
                if (i13 != 0) {
                }
                i16 = i4 & 1024;
                if (i16 != 0) {
                }
                i18 = i4 & 2048;
                if (i18 != 0) {
                }
                i19 = i17;
                if ((i4 & 4096) != 0) {
                }
                if (i18 != 2048) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            paddingValues2 = paddingValues;
            i7 = i4 & 8;
            if (i7 != 0) {
            }
            i8 = i4 & 16;
            if (i8 == 0) {
            }
            i9 = i4 & 32;
            if (i9 == 0) {
            }
            i10 = i4 & 64;
            if (i10 == 0) {
            }
            if ((i2 & 29360128) == 0) {
            }
            i11 = i4 & 256;
            if (i11 != 0) {
            }
            i12 = i11;
            i13 = i4 & 512;
            if (i13 != 0) {
            }
            i16 = i4 & 1024;
            if (i16 != 0) {
            }
            i18 = i4 & 2048;
            if (i18 != 0) {
            }
            i19 = i17;
            if ((i4 & 4096) != 0) {
            }
            if (i18 != 2048) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i6 = i4 & 4;
        if (i6 == 0) {
        }
        paddingValues2 = paddingValues;
        i7 = i4 & 8;
        if (i7 != 0) {
        }
        i8 = i4 & 16;
        if (i8 == 0) {
        }
        i9 = i4 & 32;
        if (i9 == 0) {
        }
        i10 = i4 & 64;
        if (i10 == 0) {
        }
        if ((i2 & 29360128) == 0) {
        }
        i11 = i4 & 256;
        if (i11 != 0) {
        }
        i12 = i11;
        i13 = i4 & 512;
        if (i13 != 0) {
        }
        i16 = i4 & 1024;
        if (i16 != 0) {
        }
        i18 = i4 & 2048;
        if (i18 != 0) {
        }
        i19 = i17;
        if ((i4 & 4096) != 0) {
        }
        if (i18 != 2048) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapLayoutInfoProvider SnapLayoutInfoProvider(final PagerState pagerState, final PagerSnapDistance pagerSnapDistance, final DecayAnimationSpec<Float> decayAnimationSpec, final float f) {
        return new SnapLayoutInfoProvider() { // from class: androidx.compose.foundation.pager.PagerKt.SnapLayoutInfoProvider.1
            public final boolean isValidDistance(float f2) {
                return (f2 == Float.POSITIVE_INFINITY || f2 == Float.NEGATIVE_INFINITY) ? false : true;
            }

            @NotNull
            public final PagerLayoutInfo getLayoutInfo() {
                return pagerState.getLayoutInfo();
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateSnappingOffset(float currentVelocity) {
                Pair<Float, Float> pairSearchForSnappingBounds = searchForSnappingBounds();
                float fFloatValue = pairSearchForSnappingBounds.component1().floatValue();
                float fFloatValue2 = pairSearchForSnappingBounds.component2().floatValue();
                boolean zIsScrollingForward = PagerKt.isScrollingForward(pagerState);
                float fDragGestureDelta = (PagerKt.dragGestureDelta(pagerState) / getLayoutInfo().getPageSize()) - ((int) r3);
                int iCalculateFinalSnappingItem = LazyListSnapLayoutInfoProviderKt.calculateFinalSnappingItem(pagerState.getDensity(), currentVelocity);
                FinalSnappingItem.Companion companion = FinalSnappingItem.INSTANCE;
                if (FinalSnappingItem.m7991equalsimpl0(iCalculateFinalSnappingItem, companion.m7995getClosestItembbeMdSM())) {
                    fFloatValue = Math.abs(fDragGestureDelta) > f ? fFloatValue2 : fFloatValue2;
                } else if (!FinalSnappingItem.m7991equalsimpl0(iCalculateFinalSnappingItem, companion.m7996getNextItembbeMdSM())) {
                    if (!FinalSnappingItem.m7991equalsimpl0(iCalculateFinalSnappingItem, companion.m7997getPreviousItembbeMdSM())) {
                        fFloatValue = 0.0f;
                    }
                }
                if (isValidDistance(fFloatValue)) {
                    return fFloatValue;
                }
                return 0.0f;
            }

            @Override // androidx.compose.foundation.gestures.snapping.SnapLayoutInfoProvider
            public float calculateApproachOffset(float initialVelocity) {
                int firstVisiblePage;
                int pageSize$foundation_release = pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
                float fCalculateTargetValue = DecayAnimationSpecKt.calculateTargetValue(decayAnimationSpec, 0.0f, initialVelocity);
                if (initialVelocity < 0.0f) {
                    firstVisiblePage = pagerState.getFirstVisiblePage() + 1;
                } else {
                    firstVisiblePage = pagerState.getFirstVisiblePage();
                }
                int iCoerceAtLeast = RangesKt___RangesKt.coerceAtLeast(Math.abs((RangesKt___RangesKt.coerceIn(pagerSnapDistance.calculateTargetPage(firstVisiblePage, RangesKt___RangesKt.coerceIn(((int) (fCalculateTargetValue / pageSize$foundation_release)) + firstVisiblePage, 0, pagerState.getPageCount()), initialVelocity, pagerState.getPageSize$foundation_release(), pagerState.getPageSpacing$foundation_release()), 0, pagerState.getPageCount()) - firstVisiblePage) * pageSize$foundation_release) - pageSize$foundation_release, 0);
                if (iCoerceAtLeast == 0) {
                    return iCoerceAtLeast;
                }
                return Math.signum(initialVelocity) * iCoerceAtLeast;
            }

            private final Pair<Float, Float> searchForSnappingBounds() {
                int pageSize$foundation_release = pagerState.getPageSize$foundation_release() + pagerState.getPageSpacing$foundation_release();
                int currentPage = pagerState.getCurrentPage();
                int iCalculateCurrentPageLayoutOffset = PagerMeasurePolicyKt.calculateCurrentPageLayoutOffset(pagerState, pageSize$foundation_release);
                int size = getLayoutInfo().getVisiblePagesInfo().size() / 2;
                int i = iCalculateCurrentPageLayoutOffset;
                float f2 = Float.NEGATIVE_INFINITY;
                float f3 = Float.POSITIVE_INFINITY;
                for (int i2 = currentPage; i2 >= RangesKt___RangesKt.coerceAtLeast(currentPage - size, 0); i2--) {
                    float fCalculateDistanceToDesiredSnapPosition = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), i, i2, PagerStateKt.getSnapAlignmentStartToStart());
                    if (fCalculateDistanceToDesiredSnapPosition <= 0.0f && fCalculateDistanceToDesiredSnapPosition > f2) {
                        f2 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition >= 0.0f && fCalculateDistanceToDesiredSnapPosition < f3) {
                        f3 = fCalculateDistanceToDesiredSnapPosition;
                    }
                    i -= pageSize$foundation_release;
                }
                int i3 = iCalculateCurrentPageLayoutOffset + pageSize$foundation_release;
                for (int i4 = currentPage + 1; i4 <= RangesKt___RangesKt.coerceAtMost(currentPage + size, pagerState.getPageCount() - 1); i4++) {
                    float fCalculateDistanceToDesiredSnapPosition2 = SnapPositionInLayoutKt.calculateDistanceToDesiredSnapPosition(PagerLayoutInfoKt.getMainAxisViewportSize(getLayoutInfo()), getLayoutInfo().getBeforeContentPadding(), getLayoutInfo().getAfterContentPadding(), getLayoutInfo().getPageSize(), i3, i4, PagerStateKt.getSnapAlignmentStartToStart());
                    if (fCalculateDistanceToDesiredSnapPosition2 >= 0.0f && fCalculateDistanceToDesiredSnapPosition2 < f3) {
                        f3 = fCalculateDistanceToDesiredSnapPosition2;
                    }
                    if (fCalculateDistanceToDesiredSnapPosition2 <= 0.0f && fCalculateDistanceToDesiredSnapPosition2 > f2) {
                        f2 = fCalculateDistanceToDesiredSnapPosition2;
                    }
                    i3 += pageSize$foundation_release;
                }
                if (f2 == Float.NEGATIVE_INFINITY) {
                    f2 = f3;
                }
                if (f3 == Float.POSITIVE_INFINITY) {
                    f3 = f2;
                }
                return TuplesKt.m7112to(Float.valueOf(f2), Float.valueOf(f3));
            }
        };
    }

    @Composable
    @NotNull
    public static final Modifier pagerSemantics(@NotNull Modifier modifier, @NotNull final PagerState pagerState, final boolean z, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1509835088);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1509835088, i, -1, "androidx.compose.foundation.pager.pagerSemantics (Pager.kt:911)");
        }
        composer.startReplaceableGroup(773894976);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer));
            composer.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
            objRememberedValue = compositionScopedCoroutineScopeCanceller;
        }
        composer.endReplaceableGroup();
        final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
        composer.endReplaceableGroup();
        Modifier modifierThen = modifier.then(SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, new Function1<SemanticsPropertyReceiver, Unit>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                invoke2(semanticsPropertyReceiver);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull SemanticsPropertyReceiver semanticsPropertyReceiver) {
                if (z) {
                    final PagerState pagerState2 = pagerState;
                    final CoroutineScope coroutineScope2 = coroutineScope;
                    SemanticsPropertiesKt.pageUp$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState2, coroutineScope2));
                        }
                    }, 1, null);
                    final PagerState pagerState3 = pagerState;
                    final CoroutineScope coroutineScope3 = coroutineScope;
                    SemanticsPropertiesKt.pageDown$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // kotlin.jvm.functions.Function0
                        @NotNull
                        public final Boolean invoke() {
                            return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState3, coroutineScope3));
                        }
                    }, 1, null);
                    return;
                }
                final PagerState pagerState4 = pagerState;
                final CoroutineScope coroutineScope4 = coroutineScope;
                SemanticsPropertiesKt.pageLeft$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performBackwardPaging(pagerState4, coroutineScope4));
                    }
                }, 1, null);
                final PagerState pagerState5 = pagerState;
                final CoroutineScope coroutineScope5 = coroutineScope;
                SemanticsPropertiesKt.pageRight$default(semanticsPropertyReceiver, null, new Function0<Boolean>() { // from class: androidx.compose.foundation.pager.PagerKt.pagerSemantics.1.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final Boolean invoke() {
                        return Boolean.valueOf(PagerKt.pagerSemantics$performForwardPaging(pagerState5, coroutineScope5));
                    }
                }, 1, null);
            }
        }, 1, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return modifierThen;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performForwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollForward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performForwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean pagerSemantics$performBackwardPaging(PagerState pagerState, CoroutineScope coroutineScope) {
        if (!pagerState.getCanScrollBackward()) {
            return false;
        }
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new PagerKt$pagerSemantics$performBackwardPaging$1(pagerState, null), 3, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isScrollingForward(PagerState pagerState) {
        return dragGestureDelta(pagerState) < 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float dragGestureDelta(PagerState pagerState) {
        if (pagerState.getLayoutInfo().getOrientation() == Orientation.Horizontal) {
            return Offset.m11099getXimpl(pagerState.m8360getUpDownDifferenceF1C5BW0$foundation_release());
        }
        return Offset.m11100getYimpl(pagerState.m8360getUpDownDifferenceF1C5BW0$foundation_release());
    }
}
