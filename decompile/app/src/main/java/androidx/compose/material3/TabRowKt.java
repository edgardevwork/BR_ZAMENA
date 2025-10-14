package androidx.compose.material3;

import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.SelectableGroupKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ClipKt;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.Measurable;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.layout.MeasureResult;
import androidx.compose.p003ui.layout.MeasureScope;
import androidx.compose.p003ui.layout.MultiContentMeasurePolicy;
import androidx.compose.p003ui.layout.MultiContentMeasurePolicyKt;
import androidx.compose.p003ui.layout.Placeable;
import androidx.compose.p003ui.layout.SubcomposeLayoutKt;
import androidx.compose.p003ui.layout.SubcomposeMeasureScope;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.comparisons.ComparisonsKt___ComparisonsJvmKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TabRow.kt */
@Metadata(m7104d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\u001a¤\u0001\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012.\b\u0002\u0010\u0012\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u00192\u0013\b\u0002\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0080\u0001\u0010\u001f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u0019¢\u0006\u0002\b!2\u0013\b\u0002\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b\"\u0010#\u001a\u009a\u0001\u0010$\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012.\b\u0002\u0010\u0012\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u00192\u0013\b\u0002\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b%\u0010&\u001a \u0001\u0010'\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2,\u0010\u0012\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u00192\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012\u0013\b\u0002\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0006\u0010\f\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a¤\u0001\u0010*\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00012.\b\u0002\u0010\u0012\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u00192\u0013\b\u0002\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001e\u001a\u0080\u0001\u0010,\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u001e\b\u0002\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u0019¢\u0006\u0002\b!2\u0013\b\u0002\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010#\u001a\u0090\u0001\u0010.\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2.\b\u0002\u0010\u0012\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u00192\u0013\b\u0002\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u0019H\u0007ø\u0001\u0000¢\u0006\u0004\b/\u0010#\u001an\u00100\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u001c\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u0019¢\u0006\u0002\b!2\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b1\u00102\u001a~\u00103\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2,\u0010\u0012\u001a(\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\f\b\u0016\u0012\b\b\u0017\u0012\u0004\b\b(\u0018\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0002\b\u00192\u0011\u0010\u001a\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u00192\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\u00070\u001b¢\u0006\u0002\b\u0019H\u0003ø\u0001\u0000¢\u0006\u0004\b4\u00102\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m7105d2 = {"ScrollableTabRowMinimumTabWidth", "Landroidx/compose/ui/unit/Dp;", "F", "ScrollableTabRowScrollSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "PrimaryScrollableTabRow", "", "selectedTabIndex", "", "modifier", "Landroidx/compose/ui/Modifier;", "scrollState", "Landroidx/compose/foundation/ScrollState;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "edgePadding", "indicator", "Lkotlin/Function1;", "", "Landroidx/compose/material3/TabPosition;", "Lkotlin/ParameterName;", "name", "tabPositions", "Landroidx/compose/runtime/Composable;", "divider", "Lkotlin/Function0;", "tabs", "PrimaryScrollableTabRow-qhFBPw4", "(ILandroidx/compose/ui/Modifier;Landroidx/compose/foundation/ScrollState;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PrimaryTabRow", "Landroidx/compose/material3/TabIndicatorScope;", "Lkotlin/ExtensionFunctionType;", "PrimaryTabRow-pAZo6Ak", "(ILandroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRow", "ScrollableTabRow-sKfQg0A", "(ILandroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "ScrollableTabRowImp", "ScrollableTabRowImp-qhFBPw4", "(ILkotlin/jvm/functions/Function3;Landroidx/compose/ui/Modifier;JJFLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/ScrollState;Landroidx/compose/runtime/Composer;II)V", "SecondaryScrollableTabRow", "SecondaryScrollableTabRow-qhFBPw4", "SecondaryTabRow", "SecondaryTabRow-pAZo6Ak", "TabRow", "TabRow-pAZo6Ak", "TabRowImpl", "TabRowImpl-DTcfvLk", "(Landroidx/compose/ui/Modifier;JJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "TabRowWithSubcomposeImpl", "TabRowWithSubcomposeImpl-DTcfvLk", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1223:1\n154#2:1224\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material3/TabRowKt\n*L\n1214#1:1224\n*E\n"})
/* loaded from: classes2.dex */
public final class TabRowKt {
    private static final float ScrollableTabRowMinimumTabWidth = C2046Dp.m13666constructorimpl(90);

    @NotNull
    private static final AnimationSpec<Float> ScrollableTabRowScrollSpec = AnimationSpecKt.tween$default(250, 0, EasingKt.getFastOutSlowInEasing(), 2, null);

    /* JADX WARN: Removed duplicated region for block: B:100:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0106  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: PrimaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9926PrimaryTabRowpAZo6Ak(final int i, @Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long primaryContainerColor;
        long j3;
        int i5;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier2;
        long primaryContentColor;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2M9335getLambda1$material3_release;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1884787284);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primaryContainerColor = j;
                    int i8 = composerStartRestartGroup.changed(primaryContainerColor) ? 256 : 128;
                    i4 |= i8;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i8;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i9 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                    i4 |= i9;
                } else {
                    j3 = j2;
                }
                i4 |= i9;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    function32 = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) == 0) {
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    primaryContentColor = j3;
                                }
                                function3ComposableLambda = i5 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2021049253, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                                        invoke(tabIndicatorScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull TabIndicatorScope tabIndicatorScope, @Nullable Composer composer2, int i10) {
                                        int i11;
                                        if ((i10 & 6) == 0) {
                                            i11 = ((i10 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2) | i10;
                                        } else {
                                            i11 = i10;
                                        }
                                        if ((i11 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-2021049253, i11, -1, "androidx.compose.material3.PrimaryTabRow.<anonymous> (TabRow.kt:153)");
                                            }
                                            TabRowDefaults.INSTANCE.m9922PrimaryIndicator10LGxhE(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, true), C2046Dp.INSTANCE.m13686getUnspecifiedD9Ej5fM(), 0.0f, 0L, null, composer2, 196656, 28);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }) : function32;
                                if (i6 == 0) {
                                    function2M9335getLambda1$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m9335getLambda1$material3_release();
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1884787284, i4, -1, "androidx.compose.material3.PrimaryTabRow (TabRow.kt:165)");
                                }
                                m9932TabRowImplDTcfvLk(modifier2, primaryContainerColor, primaryContentColor, function3ComposableLambda, function2M9335getLambda1$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                function32 = function3ComposableLambda;
                                function23 = function2M9335getLambda1$material3_release;
                                j3 = primaryContentColor;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier2 = modifier;
                                primaryContentColor = j3;
                                function3ComposableLambda = function32;
                            }
                            function2M9335getLambda1$material3_release = function23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m9932TabRowImplDTcfvLk(modifier2, primaryContainerColor, primaryContentColor, function3ComposableLambda, function2M9335getLambda1$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            function32 = function3ComposableLambda;
                            function23 = function2M9335getLambda1$material3_release;
                            j3 = primaryContentColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final long j4 = primaryContainerColor;
                            final long j5 = j3;
                            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    TabRowKt.m9926PrimaryTabRowpAZo6Ak(i, modifier4, j4, j5, function33, function24, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 1572864;
                    if ((i4 & 599187) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                                function2M9335getLambda1$material3_release = function23;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m9932TabRowImplDTcfvLk(modifier2, primaryContainerColor, primaryContentColor, function3ComposableLambda, function2M9335getLambda1$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            function32 = function3ComposableLambda;
                            function23 = function2M9335getLambda1$material3_release;
                            j3 = primaryContentColor;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) != 0) {
                }
                if ((i4 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) != 0) {
            }
            if ((i4 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) != 0) {
        }
        if ((i4 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0106  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: SecondaryTabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9930SecondaryTabRowpAZo6Ak(final int i, @Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long secondaryContainerColor;
        long j3;
        int i5;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier2;
        long secondaryContentColor;
        Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2M9336getLambda2$material3_release;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1909540706);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    secondaryContainerColor = j;
                    int i8 = composerStartRestartGroup.changed(secondaryContainerColor) ? 256 : 128;
                    i4 |= i8;
                } else {
                    secondaryContainerColor = j;
                }
                i4 |= i8;
            } else {
                secondaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i9 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                    i4 |= i9;
                } else {
                    j3 = j2;
                }
                i4 |= i9;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    function32 = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    secondaryContainerColor = TabRowDefaults.INSTANCE.getSecondaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) == 0) {
                                    secondaryContentColor = TabRowDefaults.INSTANCE.getSecondaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    secondaryContentColor = j3;
                                }
                                function3ComposableLambda = i5 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 286693261, true, new Function3<TabIndicatorScope, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(TabIndicatorScope tabIndicatorScope, Composer composer2, Integer num) {
                                        invoke(tabIndicatorScope, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull TabIndicatorScope tabIndicatorScope, @Nullable Composer composer2, int i10) {
                                        if ((i10 & 6) == 0) {
                                            i10 |= (i10 & 8) == 0 ? composer2.changed(tabIndicatorScope) : composer2.changedInstance(tabIndicatorScope) ? 4 : 2;
                                        }
                                        if ((i10 & 19) != 18 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(286693261, i10, -1, "androidx.compose.material3.SecondaryTabRow.<anonymous> (TabRow.kt:210)");
                                            }
                                            TabRowDefaults.INSTANCE.m9923SecondaryIndicator9IZ8Weo(tabIndicatorScope.tabIndicatorOffset(Modifier.INSTANCE, i, false), 0.0f, 0L, composer2, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }) : function32;
                                if (i6 == 0) {
                                    function2M9336getLambda2$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m9336getLambda2$material3_release();
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1909540706, i4, -1, "androidx.compose.material3.SecondaryTabRow (TabRow.kt:218)");
                                }
                                m9932TabRowImplDTcfvLk(modifier2, secondaryContainerColor, secondaryContentColor, function3ComposableLambda, function2M9336getLambda2$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                function32 = function3ComposableLambda;
                                function23 = function2M9336getLambda2$material3_release;
                                j3 = secondaryContentColor;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier2 = modifier;
                                secondaryContentColor = j3;
                                function3ComposableLambda = function32;
                            }
                            function2M9336getLambda2$material3_release = function23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m9932TabRowImplDTcfvLk(modifier2, secondaryContainerColor, secondaryContentColor, function3ComposableLambda, function2M9336getLambda2$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            function32 = function3ComposableLambda;
                            function23 = function2M9336getLambda2$material3_release;
                            j3 = secondaryContentColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final long j4 = secondaryContainerColor;
                            final long j5 = j3;
                            final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function33 = function32;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryTabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    TabRowKt.m9930SecondaryTabRowpAZo6Ak(i, modifier4, j4, j5, function33, function24, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 1572864;
                    if ((i4 & 599187) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                                function2M9336getLambda2$material3_release = function23;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m9932TabRowImplDTcfvLk(modifier2, secondaryContainerColor, secondaryContentColor, function3ComposableLambda, function2M9336getLambda2$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            function32 = function3ComposableLambda;
                            function23 = function2M9336getLambda2$material3_release;
                            j3 = secondaryContentColor;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) != 0) {
                }
                if ((i4 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) != 0) {
            }
            if ((i4 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) != 0) {
        }
        if ((i4 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0106  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRow-pAZo6Ak, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9931TabRowpAZo6Ak(final int i, @Nullable Modifier modifier, long j, long j2, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long primaryContainerColor;
        long j3;
        int i5;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        Function2<? super Composer, ? super Integer, Unit> function23;
        Modifier modifier2;
        long primaryContentColor;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2M9337getLambda3$material3_release;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1199178586);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primaryContainerColor = j;
                    int i8 = composerStartRestartGroup.changed(primaryContainerColor) ? 256 : 128;
                    i4 |= i8;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i8;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    j3 = j2;
                    int i9 = composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                    i4 |= i9;
                } else {
                    j3 = j2;
                }
                i4 |= i9;
            } else {
                j3 = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    function32 = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        function23 = function2;
                        i4 |= composerStartRestartGroup.changedInstance(function23) ? 131072 : 65536;
                    }
                    if ((i3 & 64) != 0) {
                        if ((i2 & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                        }
                        if ((i4 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                modifier2 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) == 0) {
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                    i4 &= -7169;
                                } else {
                                    primaryContentColor = j3;
                                }
                                function3ComposableLambda = i5 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -2052073983, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(3);
                                    }

                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer2, Integer num) {
                                        invoke((List<TabPosition>) list, composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer2, int i10) {
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2052073983, i10, -1, "androidx.compose.material3.TabRow.<anonymous> (TabRow.kt:302)");
                                        }
                                        if (i < list.size()) {
                                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                            tabRowDefaults.m9923SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer2, 3072, 6);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }) : function32;
                                if (i6 == 0) {
                                    function2M9337getLambda3$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m9337getLambda3$material3_release();
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1199178586, i4, -1, "androidx.compose.material3.TabRow (TabRow.kt:312)");
                                }
                                m9933TabRowWithSubcomposeImplDTcfvLk(modifier2, primaryContainerColor, primaryContentColor, function3ComposableLambda, function2M9337getLambda3$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier2;
                                function32 = function3ComposableLambda;
                                function23 = function2M9337getLambda3$material3_release;
                                j3 = primaryContentColor;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier2 = modifier;
                                primaryContentColor = j3;
                                function3ComposableLambda = function32;
                            }
                            function2M9337getLambda3$material3_release = function23;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m9933TabRowWithSubcomposeImplDTcfvLk(modifier2, primaryContainerColor, primaryContentColor, function3ComposableLambda, function2M9337getLambda3$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            function32 = function3ComposableLambda;
                            function23 = function2M9337getLambda3$material3_release;
                            j3 = primaryContentColor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final Modifier modifier4 = modifier3;
                            final long j4 = primaryContainerColor;
                            final long j5 = j3;
                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function23;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRow$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(@Nullable Composer composer2, int i10) {
                                    TabRowKt.m9931TabRowpAZo6Ak(i, modifier4, j4, j5, function33, function24, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 1572864;
                    if ((i4 & 599187) != 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i7 == 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) == 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                                function2M9337getLambda3$material3_release = function23;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            m9933TabRowWithSubcomposeImplDTcfvLk(modifier2, primaryContainerColor, primaryContentColor, function3ComposableLambda, function2M9337getLambda3$material3_release, function22, composerStartRestartGroup, (i4 >> 3) & 524286);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            function32 = function3ComposableLambda;
                            function23 = function2M9337getLambda3$material3_release;
                            j3 = primaryContentColor;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function23 = function2;
                if ((i3 & 64) != 0) {
                }
                if ((i4 & 599187) != 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function32 = function3;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function23 = function2;
            if ((i3 & 64) != 0) {
            }
            if ((i4 & 599187) != 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function23 = function2;
        if ((i3 & 64) != 0) {
        }
        if ((i4 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRowImpl-DTcfvLk, reason: not valid java name */
    public static final void m9932TabRowImplDTcfvLk(final Modifier modifier, final long j, final long j2, final Function3<? super TabIndicatorScope, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1757425411);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1757425411, i2, -1, "androidx.compose.material3.TabRowImpl (TabRow.kt:365)");
            }
            int i3 = i2 << 3;
            SurfaceKt.m9876SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -65106680, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i4) {
                    if ((i4 & 3) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-65106680, i4, -1, "androidx.compose.material3.TabRowImpl.<anonymous> (TabRow.kt:371)");
                        }
                        composer2.startReplaceableGroup(474062752);
                        Object objRememberedValue = composer2.rememberedValue();
                        Composer.Companion companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new TabRowKt$TabRowImpl$1$scope$1$1();
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        final TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$1 = (TabRowKt$TabRowImpl$1$scope$1$1) objRememberedValue;
                        composer2.endReplaceableGroup();
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function23 = function22;
                        Function2<Composer, Integer, Unit> function24 = function2;
                        final Function3<TabIndicatorScope, Composer, Integer, Unit> function32 = function3;
                        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Function2[]{function23, function24, ComposableLambdaKt.composableLambda(composer2, 1236693605, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1.1
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

                            @Composable
                            public final void invoke(@Nullable Composer composer3, int i5) {
                                if ((i5 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1236693605, i5, -1, "androidx.compose.material3.TabRowImpl.<anonymous>.<anonymous> (TabRow.kt:414)");
                                }
                                function32.invoke(tabRowKt$TabRowImpl$1$scope$1$1, composer3, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        })});
                        composer2.startReplaceableGroup(474064303);
                        Object objRememberedValue2 = composer2.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new MultiContentMeasurePolicy() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1
                                @Override // androidx.compose.p003ui.layout.MultiContentMeasurePolicy
                                @NotNull
                                /* renamed from: measure-3p2s80s */
                                public final MeasureResult mo9545measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull List<? extends List<? extends Measurable>> list, long j3) {
                                    MeasureScope measureScope2 = measureScope;
                                    List<? extends Measurable> list2 = list.get(0);
                                    List<? extends Measurable> list3 = list.get(1);
                                    int i5 = 2;
                                    List<? extends Measurable> list4 = list.get(2);
                                    int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j3);
                                    int size = list2.size();
                                    final Ref.IntRef intRef = new Ref.IntRef();
                                    if (size > 0) {
                                        intRef.element = iM13622getMaxWidthimpl / size;
                                    }
                                    Integer numValueOf = 0;
                                    int size2 = list2.size();
                                    for (int i6 = 0; i6 < size2; i6++) {
                                        numValueOf = Integer.valueOf(Math.max(list2.get(i6).maxIntrinsicHeight(intRef.element), numValueOf.intValue()));
                                    }
                                    final int iIntValue = numValueOf.intValue();
                                    TabRowKt$TabRowImpl$1$scope$1$1 tabRowKt$TabRowImpl$1$scope$1$12 = tabRowKt$TabRowImpl$1$scope$1$1;
                                    ArrayList arrayList = new ArrayList(size);
                                    int i7 = 0;
                                    while (i7 < size) {
                                        arrayList.add(new TabPosition(C2046Dp.m13666constructorimpl(measureScope2.mo7871toDpu2uoSUM(intRef.element) * i7), measureScope2.mo7871toDpu2uoSUM(intRef.element), ((C2046Dp) ComparisonsKt___ComparisonsJvmKt.maxOf(C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(measureScope2.mo7871toDpu2uoSUM(Math.min(list2.get(i7).maxIntrinsicWidth(iIntValue), intRef.element)) - C2046Dp.m13666constructorimpl(TabKt.getHorizontalTextPadding() * i5))), C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(24)))).m13680unboximpl(), null));
                                        i7++;
                                        measureScope2 = measureScope;
                                        i5 = 2;
                                    }
                                    tabRowKt$TabRowImpl$1$scope$1$12.setTabPositions(arrayList);
                                    final ArrayList arrayList2 = new ArrayList(list2.size());
                                    int size3 = list2.size();
                                    for (int i8 = 0; i8 < size3; i8++) {
                                        Measurable measurable = list2.get(i8);
                                        int i9 = intRef.element;
                                        arrayList2.add(measurable.mo12610measureBRTryo0(Constraints.m13612copyZbe2FdA(j3, i9, i9, iIntValue, iIntValue)));
                                    }
                                    final ArrayList arrayList3 = new ArrayList(list3.size());
                                    int size4 = list3.size();
                                    for (int i10 = 0; i10 < size4; i10++) {
                                        arrayList3.add(list3.get(i10).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j3, 0, 0, 0, 0, 11, null)));
                                    }
                                    final ArrayList arrayList4 = new ArrayList(list4.size());
                                    int size5 = list4.size();
                                    for (int i11 = 0; i11 < size5; i11++) {
                                        Measurable measurable2 = list4.get(i11);
                                        int i12 = intRef.element;
                                        arrayList4.add(measurable2.mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j3, i12, i12, 0, iIntValue, 4, null)));
                                    }
                                    return MeasureScope.layout$default(measureScope, iM13622getMaxWidthimpl, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$1$2$1.2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(1);
                                        }

                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                            invoke2(placementScope);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                            List<Placeable> list5 = arrayList2;
                                            Ref.IntRef intRef2 = intRef;
                                            int size6 = list5.size();
                                            for (int i13 = 0; i13 < size6; i13++) {
                                                Placeable.PlacementScope.placeRelative$default(placementScope, list5.get(i13), i13 * intRef2.element, 0, 0.0f, 4, null);
                                            }
                                            List<Placeable> list6 = arrayList3;
                                            int i14 = iIntValue;
                                            int size7 = list6.size();
                                            for (int i15 = 0; i15 < size7; i15++) {
                                                Placeable placeable = list6.get(i15);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable, 0, i14 - placeable.getHeight(), 0.0f, 4, null);
                                            }
                                            List<Placeable> list7 = arrayList4;
                                            int i16 = iIntValue;
                                            int size8 = list7.size();
                                            for (int i17 = 0; i17 < size8; i17++) {
                                                Placeable placeable2 = list7.get(i17);
                                                Placeable.PlacementScope.placeRelative$default(placementScope, placeable2, 0, i16 - placeable2.getHeight(), 0.0f, 4, null);
                                            }
                                        }
                                    }, 4, null);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue2);
                        }
                        MultiContentMeasurePolicy multiContentMeasurePolicy = (MultiContentMeasurePolicy) objRememberedValue2;
                        composer2.endReplaceableGroup();
                        composer2.startReplaceableGroup(1399185516);
                        Function2<Composer, Integer, Unit> function2CombineAsVirtualLayouts = LayoutKt.combineAsVirtualLayouts(listListOf);
                        composer2.startReplaceableGroup(1157296644);
                        boolean zChanged = composer2.changed(multiContentMeasurePolicy);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceableGroup();
                        MeasurePolicy measurePolicy = (MeasurePolicy) objRememberedValue3;
                        composer2.startReplaceableGroup(-1323940314);
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierFillMaxWidth$default);
                        if (!(composer2.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composer2);
                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composer2)), composer2, 0);
                        composer2.startReplaceableGroup(2058660585);
                        function2CombineAsVirtualLayouts.invoke(composer2, 0);
                        composer2.endReplaceableGroup();
                        composer2.endNode();
                        composer2.endReplaceableGroup();
                        composer2.endReplaceableGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    TabRowKt.m9932TabRowImplDTcfvLk(modifier, j, j2, function3, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: TabRowWithSubcomposeImpl-DTcfvLk, reason: not valid java name */
    public static final void m9933TabRowWithSubcomposeImplDTcfvLk(final Modifier modifier, final long j, final long j2, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, final Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-160898917);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function3) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function22) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-160898917, i2, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl (TabRow.kt:582)");
            }
            int i3 = i2 << 3;
            SurfaceKt.m9876SurfaceT9BRK9s(SelectableGroupKt.selectableGroup(modifier), null, j, j2, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1617702432, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                @Composable
                public final void invoke(@Nullable Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1617702432, i4, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous> (TabRow.kt:588)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composer2.startReplaceableGroup(-1028159188);
                    boolean zChanged = composer2.changed(function22) | composer2.changed(function2) | composer2.changed(function3);
                    final Function2<Composer, Integer, Unit> function23 = function22;
                    final Function2<Composer, Integer, Unit> function24 = function2;
                    final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                return m9939invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                            }

                            @NotNull
                            /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                            public final MeasureResult m9939invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j3) {
                                final int iM13622getMaxWidthimpl = Constraints.m13622getMaxWidthimpl(j3);
                                List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function23);
                                int size = listSubcompose.size();
                                final Ref.IntRef intRef = new Ref.IntRef();
                                if (size > 0) {
                                    intRef.element = iM13622getMaxWidthimpl / size;
                                }
                                Integer numValueOf = 0;
                                int size2 = listSubcompose.size();
                                for (int i5 = 0; i5 < size2; i5++) {
                                    numValueOf = Integer.valueOf(Math.max(listSubcompose.get(i5).maxIntrinsicHeight(intRef.element), numValueOf.intValue()));
                                }
                                final int iIntValue = numValueOf.intValue();
                                final ArrayList arrayList = new ArrayList(listSubcompose.size());
                                int size3 = listSubcompose.size();
                                for (int i6 = 0; i6 < size3; i6++) {
                                    Measurable measurable = listSubcompose.get(i6);
                                    int i7 = intRef.element;
                                    arrayList.add(measurable.mo12610measureBRTryo0(Constraints.m13612copyZbe2FdA(j3, i7, i7, iIntValue, iIntValue)));
                                }
                                final ArrayList arrayList2 = new ArrayList(size);
                                for (int i8 = 0; i8 < size; i8++) {
                                    arrayList2.add(new TabPosition(C2046Dp.m13666constructorimpl(subcomposeMeasureScope.mo7871toDpu2uoSUM(intRef.element) * i8), subcomposeMeasureScope.mo7871toDpu2uoSUM(intRef.element), ((C2046Dp) ComparisonsKt___ComparisonsJvmKt.maxOf(C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(subcomposeMeasureScope.mo7871toDpu2uoSUM(Math.min(listSubcompose.get(i8).maxIntrinsicWidth(iIntValue), intRef.element)) - C2046Dp.m13666constructorimpl(TabKt.getHorizontalTextPadding() * 2))), C2046Dp.m13664boximpl(C2046Dp.m13666constructorimpl(24)))).m13680unboximpl(), null));
                                }
                                final Function2<Composer, Integer, Unit> function25 = function24;
                                final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                return MeasureScope.layout$default(subcomposeMeasureScope, iM13622getMaxWidthimpl, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$1$1$1.1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                        invoke2(placementScope);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                        List<Placeable> list = arrayList;
                                        Ref.IntRef intRef2 = intRef;
                                        int size4 = list.size();
                                        for (int i9 = 0; i9 < size4; i9++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, list.get(i9), i9 * intRef2.element, 0, 0.0f, 4, null);
                                        }
                                        List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function25);
                                        long j4 = j3;
                                        int i10 = iIntValue;
                                        int size5 = listSubcompose2.size();
                                        for (int i11 = 0; i11 < size5; i11++) {
                                            Placeable placeableMo12610measureBRTryo0 = listSubcompose2.get(i11).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, 0, 0, 0, 0, 11, null));
                                            Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo0, 0, i10 - placeableMo12610measureBRTryo0.getHeight(), 0.0f, 4, null);
                                        }
                                        SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                        TabSlots tabSlots = TabSlots.Indicator;
                                        final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                        final List<TabPosition> list2 = arrayList2;
                                        List<Measurable> listSubcompose3 = subcomposeMeasureScope2.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(1621992604, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.TabRowWithSubcomposeImpl.1.1.1.1.3
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

                                            @Composable
                                            public final void invoke(@Nullable Composer composer3, int i12) {
                                                if ((i12 & 3) == 2 && composer3.getSkipping()) {
                                                    composer3.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(1621992604, i12, -1, "androidx.compose.material3.TabRowWithSubcomposeImpl.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:631)");
                                                }
                                                function34.invoke(list2, composer3, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }));
                                        int i12 = iM13622getMaxWidthimpl;
                                        int i13 = iIntValue;
                                        int size6 = listSubcompose3.size();
                                        for (int i14 = 0; i14 < size6; i14++) {
                                            Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i14).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(i12, i13)), 0, 0, 0.0f, 4, null);
                                        }
                                    }
                                }, 4, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceableGroup();
                    SubcomposeLayoutKt.SubcomposeLayout(modifierFillMaxWidth$default, (Function2) objRememberedValue, composer2, 6, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }), composerStartRestartGroup, (i3 & 896) | 12582912 | (i3 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$TabRowWithSubcomposeImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    TabRowKt.m9933TabRowWithSubcomposeImplDTcfvLk(modifier, j, j2, function3, function2, function22, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: PrimaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9925PrimaryScrollableTabRowqhFBPw4(final int i, @Nullable Modifier modifier, @Nullable ScrollState scrollState, long j, long j2, float f, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long primaryContainerColor;
        long primaryContentColor;
        int i5;
        float f2;
        int i6;
        int i7;
        ScrollState scrollStateRememberScrollState;
        Function2<? super Composer, ? super Integer, Unit> function2M9338getLambda4$material3_release;
        Modifier modifier2;
        ScrollState scrollState2;
        float f3;
        long j3;
        long j4;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        Composer composer2;
        final Modifier modifier3;
        final ScrollState scrollState3;
        final long j5;
        final long j6;
        final float f4;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1763241113);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(scrollState)) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    primaryContainerColor = j;
                    int i9 = composerStartRestartGroup.changed(primaryContainerColor) ? 2048 : 1024;
                    i4 |= i9;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i9;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & CpioConstants.C_ISBLK) != 0) {
                if ((i3 & 16) == 0) {
                    primaryContentColor = j2;
                    int i10 = composerStartRestartGroup.changed(primaryContentColor) ? 16384 : 8192;
                    i4 |= i10;
                } else {
                    primaryContentColor = j2;
                }
                i4 |= i10;
            } else {
                primaryContentColor = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else {
                if ((196608 & i2) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if ((i3 & 256) == 0) {
                    if ((i2 & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) == 0) {
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                i4 &= -897;
                            } else {
                                scrollStateRememberScrollState = scrollState;
                            }
                            if ((i3 & 8) != 0) {
                                primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                i4 &= -57345;
                            }
                            float fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = i5 == 0 ? TabRowDefaults.INSTANCE.m9924getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f2;
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda = i6 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, 438091970, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                    invoke((List<TabPosition>) list, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer3, int i11) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(438091970, i11, -1, "androidx.compose.material3.PrimaryScrollableTabRow.<anonymous> (TabRow.kt:682)");
                                    }
                                    if (i < list.size()) {
                                        State<C2046Dp> stateM7677animateDpAsStateAjpBEmI = AnimateAsStateKt.m7677animateDpAsStateAjpBEmI(list.get(i).getContentWidth(), null, null, null, composer3, 0, 14);
                                        TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                        tabRowDefaults.m9922PrimaryIndicator10LGxhE(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), invoke$lambda$0(stateM7677animateDpAsStateAjpBEmI), 0.0f, 0L, null, composer3, ProfileVerifier.CompilationStatus.f342xf2722a21, 28);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                private static final float invoke$lambda$0(State<C2046Dp> state) {
                                    return state.getValue().m13680unboximpl();
                                }
                            }) : function3;
                            function2M9338getLambda4$material3_release = i7 == 0 ? ComposableSingletons$TabRowKt.INSTANCE.m9338getLambda4$material3_release() : function2;
                            modifier2 = modifier4;
                            scrollState2 = scrollStateRememberScrollState;
                            f3 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            j3 = primaryContainerColor;
                            j4 = primaryContentColor;
                            function32 = function3ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            modifier2 = modifier;
                            scrollState2 = scrollState;
                            function32 = function3;
                            function2M9338getLambda4$material3_release = function2;
                            j3 = primaryContainerColor;
                            j4 = primaryContentColor;
                            f3 = f2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1763241113, i4, -1, "androidx.compose.material3.PrimaryScrollableTabRow (TabRow.kt:694)");
                        }
                        int i11 = i4 >> 3;
                        composer2 = composerStartRestartGroup;
                        m9928ScrollableTabRowImpqhFBPw4(i, function32, modifier2, j3, j4, f3, function2M9338getLambda4$material3_release, function22, scrollState2, composerStartRestartGroup, (i4 & 14) | ((i4 >> 15) & 112) | ((i4 << 3) & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i11) | (i11 & 29360128) | ((i4 << 18) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        scrollState3 = scrollState2;
                        j5 = j3;
                        j6 = j4;
                        f4 = f3;
                        function33 = function32;
                        function23 = function2M9338getLambda4$material3_release;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scrollState3 = scrollState;
                        function33 = function3;
                        j5 = primaryContainerColor;
                        j6 = primaryContentColor;
                        f4 = f2;
                        composer2 = composerStartRestartGroup;
                        function23 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$PrimaryScrollableTabRow$2
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

                            public final void invoke(@Nullable Composer composer3, int i12) {
                                TabRowKt.m9925PrimaryScrollableTabRowqhFBPw4(i, modifier3, scrollState3, j5, j6, f4, function33, function23, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 100663296;
                if ((i4 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if ((i3 & 4) == 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        modifier2 = modifier4;
                        scrollState2 = scrollStateRememberScrollState;
                        f3 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                        j3 = primaryContainerColor;
                        j4 = primaryContentColor;
                        function32 = function3ComposableLambda;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i112 = i4 >> 3;
                        composer2 = composerStartRestartGroup;
                        m9928ScrollableTabRowImpqhFBPw4(i, function32, modifier2, j3, j4, f3, function2M9338getLambda4$material3_release, function22, scrollState2, composerStartRestartGroup, (i4 & 14) | ((i4 >> 15) & 112) | ((i4 << 3) & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i112) | (i112 & 29360128) | ((i4 << 18) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        scrollState3 = scrollState2;
                        j5 = j3;
                        j6 = j4;
                        f4 = f3;
                        function33 = function32;
                        function23 = function2M9338getLambda4$material3_release;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & CpioConstants.C_ISBLK) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: SecondaryScrollableTabRow-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9929SecondaryScrollableTabRowqhFBPw4(final int i, @Nullable Modifier modifier, @Nullable ScrollState scrollState, long j, long j2, float f, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long secondaryContainerColor;
        long secondaryContentColor;
        int i5;
        float f2;
        int i6;
        int i7;
        ScrollState scrollStateRememberScrollState;
        Function2<? super Composer, ? super Integer, Unit> function2M9339getLambda5$material3_release;
        Modifier modifier2;
        ScrollState scrollState2;
        float f3;
        long j3;
        long j4;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        Composer composer2;
        final Modifier modifier3;
        final ScrollState scrollState3;
        final long j5;
        final long j6;
        final float f4;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1821940917);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                i4 |= ((i3 & 4) == 0 && composerStartRestartGroup.changed(scrollState)) ? 256 : 128;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    secondaryContainerColor = j;
                    int i9 = composerStartRestartGroup.changed(secondaryContainerColor) ? 2048 : 1024;
                    i4 |= i9;
                } else {
                    secondaryContainerColor = j;
                }
                i4 |= i9;
            } else {
                secondaryContainerColor = j;
            }
            if ((i2 & CpioConstants.C_ISBLK) != 0) {
                if ((i3 & 16) == 0) {
                    secondaryContentColor = j2;
                    int i10 = composerStartRestartGroup.changed(secondaryContentColor) ? 16384 : 8192;
                    i4 |= i10;
                } else {
                    secondaryContentColor = j2;
                }
                i4 |= i10;
            } else {
                secondaryContentColor = j2;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
            } else {
                if ((196608 & i2) == 0) {
                    f2 = f;
                    i4 |= composerStartRestartGroup.changed(f2) ? 131072 : 65536;
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                } else if ((i2 & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                } else if ((i2 & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function2) ? 8388608 : 4194304;
                }
                if ((i3 & 256) == 0) {
                    if ((i2 & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function22) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                    }
                    if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                            if ((i3 & 4) == 0) {
                                scrollStateRememberScrollState = ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1);
                                i4 &= -897;
                            } else {
                                scrollStateRememberScrollState = scrollState;
                            }
                            if ((i3 & 8) != 0) {
                                secondaryContainerColor = TabRowDefaults.INSTANCE.getSecondaryContainerColor(composerStartRestartGroup, 6);
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                secondaryContentColor = TabRowDefaults.INSTANCE.getSecondaryContentColor(composerStartRestartGroup, 6);
                                i4 &= -57345;
                            }
                            float fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = i5 == 0 ? TabRowDefaults.INSTANCE.m9924getScrollableTabRowEdgeStartPaddingD9Ej5fM() : f2;
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda = i6 == 0 ? ComposableLambdaKt.composableLambda(composerStartRestartGroup, -115843248, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                    invoke((List<TabPosition>) list, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                @Composable
                                public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer3, int i11) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-115843248, i11, -1, "androidx.compose.material3.SecondaryScrollableTabRow.<anonymous> (TabRow.kt:754)");
                                    }
                                    TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                    tabRowDefaults.m9923SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }) : function3;
                            function2M9339getLambda5$material3_release = i7 == 0 ? ComposableSingletons$TabRowKt.INSTANCE.m9339getLambda5$material3_release() : function2;
                            modifier2 = modifier4;
                            scrollState2 = scrollStateRememberScrollState;
                            f3 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            j3 = secondaryContainerColor;
                            j4 = secondaryContentColor;
                            function32 = function3ComposableLambda;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 4) != 0) {
                                i4 &= -897;
                            }
                            if ((i3 & 8) != 0) {
                                i4 &= -7169;
                            }
                            if ((i3 & 16) != 0) {
                                i4 &= -57345;
                            }
                            modifier2 = modifier;
                            scrollState2 = scrollState;
                            function32 = function3;
                            function2M9339getLambda5$material3_release = function2;
                            j3 = secondaryContainerColor;
                            j4 = secondaryContentColor;
                            f3 = f2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1821940917, i4, -1, "androidx.compose.material3.SecondaryScrollableTabRow (TabRow.kt:762)");
                        }
                        int i11 = i4 >> 3;
                        composer2 = composerStartRestartGroup;
                        m9928ScrollableTabRowImpqhFBPw4(i, function32, modifier2, j3, j4, f3, function2M9339getLambda5$material3_release, function22, scrollState2, composerStartRestartGroup, (i4 & 14) | ((i4 >> 15) & 112) | ((i4 << 3) & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i11) | (i11 & 29360128) | ((i4 << 18) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        scrollState3 = scrollState2;
                        j5 = j3;
                        j6 = j4;
                        f4 = f3;
                        function33 = function32;
                        function23 = function2M9339getLambda5$material3_release;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier;
                        scrollState3 = scrollState;
                        function33 = function3;
                        j5 = secondaryContainerColor;
                        j6 = secondaryContentColor;
                        f4 = f2;
                        composer2 = composerStartRestartGroup;
                        function23 = function2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$SecondaryScrollableTabRow$2
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

                            public final void invoke(@Nullable Composer composer3, int i12) {
                                TabRowKt.m9929SecondaryScrollableTabRowqhFBPw4(i, modifier3, scrollState3, j5, j6, f4, function33, function23, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 100663296;
                if ((i4 & 38347923) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i2 & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if ((i3 & 4) == 0) {
                        }
                        if ((i3 & 8) != 0) {
                        }
                        if ((i3 & 16) != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        modifier2 = modifier4;
                        scrollState2 = scrollStateRememberScrollState;
                        f3 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                        j3 = secondaryContainerColor;
                        j4 = secondaryContentColor;
                        function32 = function3ComposableLambda;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i112 = i4 >> 3;
                        composer2 = composerStartRestartGroup;
                        m9928ScrollableTabRowImpqhFBPw4(i, function32, modifier2, j3, j4, f3, function2M9339getLambda5$material3_release, function22, scrollState2, composerStartRestartGroup, (i4 & 14) | ((i4 >> 15) & 112) | ((i4 << 3) & 896) | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i112) | (i112 & 29360128) | ((i4 << 18) & 234881024), 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier2;
                        scrollState3 = scrollState2;
                        j5 = j3;
                        j6 = j4;
                        f4 = f3;
                        function33 = function32;
                        function23 = function2M9339getLambda5$material3_release;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f2 = f;
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 384) == 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        if ((i2 & CpioConstants.C_ISBLK) != 0) {
        }
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        f2 = f;
        i6 = i3 & 64;
        if (i6 != 0) {
        }
        i7 = i3 & 128;
        if (i7 != 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010a  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRow-sKfQg0A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9927ScrollableTabRowsKfQg0A(final int i, @Nullable Modifier modifier, long j, long j2, float f, @Nullable Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @NotNull final Function2<? super Composer, ? super Integer, Unit> function22, @Nullable Composer composer, final int i2, final int i3) {
        int i4;
        long primaryContainerColor;
        long primaryContentColor;
        int i5;
        float fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        int i6;
        Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3ComposableLambda;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function2M9340getLambda6$material3_release;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        final long j3;
        final long j4;
        final float f2;
        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-497821003);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i8 = i3 & 2;
        if (i8 != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            if ((i2 & 384) != 0) {
                if ((i3 & 4) == 0) {
                    primaryContainerColor = j;
                    int i9 = composerStartRestartGroup.changed(primaryContainerColor) ? 256 : 128;
                    i4 |= i9;
                } else {
                    primaryContainerColor = j;
                }
                i4 |= i9;
            } else {
                primaryContainerColor = j;
            }
            if ((i2 & 3072) != 0) {
                if ((i3 & 8) == 0) {
                    primaryContentColor = j2;
                    int i10 = composerStartRestartGroup.changed(primaryContentColor) ? 2048 : 1024;
                    i4 |= i10;
                } else {
                    primaryContentColor = j2;
                }
                i4 |= i10;
            } else {
                primaryContentColor = j2;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= CpioConstants.C_ISBLK;
            } else {
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                    i4 |= composerStartRestartGroup.changed(fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        function3ComposableLambda = function3;
                        i4 |= composerStartRestartGroup.changedInstance(function3ComposableLambda) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) != 0) {
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        if ((i4 & 4793491) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                if ((i3 & 4) != 0) {
                                    primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                    primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                }
                                if (i5 != 0) {
                                    fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m9924getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                }
                                if (i6 != 0) {
                                    function3ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -913748678, true, new Function3<List<? extends TabPosition>, Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(List<? extends TabPosition> list, Composer composer3, Integer num) {
                                            invoke((List<TabPosition>) list, composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@NotNull List<TabPosition> list, @Nullable Composer composer3, int i11) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-913748678, i11, -1, "androidx.compose.material3.ScrollableTabRow.<anonymous> (TabRow.kt:820)");
                                            }
                                            TabRowDefaults tabRowDefaults = TabRowDefaults.INSTANCE;
                                            tabRowDefaults.m9923SecondaryIndicator9IZ8Weo(tabRowDefaults.tabIndicatorOffset(Modifier.INSTANCE, list.get(i)), 0.0f, 0L, composer3, 3072, 6);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    });
                                }
                                if (i7 == 0) {
                                    modifier2 = modifier4;
                                    function2M9340getLambda6$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m9340getLambda6$material3_release();
                                } else {
                                    function2M9340getLambda6$material3_release = function2;
                                    modifier2 = modifier4;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i3 & 4) != 0) {
                                    i4 &= -897;
                                }
                                if ((i3 & 8) != 0) {
                                    i4 &= -7169;
                                }
                                modifier2 = modifier;
                                function2M9340getLambda6$material3_release = function2;
                            }
                            long j5 = primaryContainerColor;
                            long j6 = primaryContentColor;
                            float f3 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function3ComposableLambda;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-497821003, i4, -1, "androidx.compose.material3.ScrollableTabRow (TabRow.kt:828)");
                            }
                            int i11 = i4 << 3;
                            composer2 = composerStartRestartGroup;
                            m9928ScrollableTabRowImpqhFBPw4(i, function33, modifier2, j5, j6, f3, function2M9340getLambda6$material3_release, function22, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i11 & 896) | (i11 & 7168) | (57344 & i11) | (i11 & 458752) | (3670016 & i4) | (i4 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            j3 = j5;
                            j4 = j6;
                            f2 = f3;
                            function32 = function33;
                            function23 = function2M9340getLambda6$material3_release;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier;
                            j3 = primaryContainerColor;
                            j4 = primaryContentColor;
                            f2 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            function32 = function3ComposableLambda;
                            composer2 = composerStartRestartGroup;
                            function23 = function2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRow$2
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

                                public final void invoke(@Nullable Composer composer3, int i12) {
                                    TabRowKt.m9927ScrollableTabRowsKfQg0A(i, modifier3, j3, j4, f2, function32, function23, function22, composer3, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 12582912;
                    if ((i4 & 4793491) != 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i2 & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if ((i3 & 4) != 0) {
                            }
                            if ((i3 & 8) != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if (i6 != 0) {
                            }
                            if (i7 == 0) {
                            }
                            long j52 = primaryContainerColor;
                            long j62 = primaryContentColor;
                            float f32 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                            Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function332 = function3ComposableLambda;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            int i112 = i4 << 3;
                            composer2 = composerStartRestartGroup;
                            m9928ScrollableTabRowImpqhFBPw4(i, function332, modifier2, j52, j62, f32, function2M9340getLambda6$material3_release, function22, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), composerStartRestartGroup, (i4 & 14) | ((i4 >> 12) & 112) | (i112 & 896) | (i112 & 7168) | (57344 & i112) | (i112 & 458752) | (3670016 & i4) | (i4 & 29360128), 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier2;
                            j3 = j52;
                            j4 = j62;
                            f2 = f32;
                            function32 = function332;
                            function23 = function2M9340getLambda6$material3_release;
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function3ComposableLambda = function3;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) != 0) {
                }
                if ((i4 & 4793491) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            function3ComposableLambda = function3;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) != 0) {
            }
            if ((i4 & 4793491) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 384) != 0) {
        }
        if ((i2 & 3072) != 0) {
        }
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        function3ComposableLambda = function3;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) != 0) {
        }
        if ((i4 & 4793491) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00f9  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_]]")
    /* renamed from: ScrollableTabRowImp-qhFBPw4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9928ScrollableTabRowImpqhFBPw4(final int i, final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function3, Modifier modifier, long j, long j2, float f, Function2<? super Composer, ? super Integer, Unit> function2, final Function2<? super Composer, ? super Integer, Unit> function22, final ScrollState scrollState, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        long primaryContainerColor;
        long primaryContentColor;
        int i6;
        float fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function2M9341getLambda7$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function23;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1696166011);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function3) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i2 & 3072) == 0) {
                    if ((i3 & 8) == 0) {
                        primaryContainerColor = j;
                        int i8 = composerStartRestartGroup.changed(primaryContainerColor) ? 2048 : 1024;
                        i4 |= i8;
                    } else {
                        primaryContainerColor = j;
                    }
                    i4 |= i8;
                } else {
                    primaryContainerColor = j;
                }
                if ((i2 & CpioConstants.C_ISBLK) == 0) {
                    if ((i3 & 16) == 0) {
                        primaryContentColor = j2;
                        int i9 = composerStartRestartGroup.changed(primaryContentColor) ? 16384 : 8192;
                        i4 |= i9;
                    } else {
                        primaryContentColor = j2;
                    }
                    i4 |= i9;
                } else {
                    primaryContentColor = j2;
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                } else {
                    if ((196608 & i2) == 0) {
                        fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                        i4 |= composerStartRestartGroup.changed(fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                    } else if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function2) ? 1048576 : 524288;
                    }
                    if ((i3 & 128) == 0) {
                        i4 |= 12582912;
                    } else {
                        if ((i2 & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function22) ? 8388608 : 4194304;
                        }
                        if ((i3 & 256) == 0) {
                            if ((i2 & 100663296) == 0) {
                                i4 |= composerStartRestartGroup.changed(scrollState) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
                            }
                            if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i2 & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 8) != 0) {
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        i4 &= -57345;
                                    }
                                } else {
                                    if (i5 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i3 & 8) != 0) {
                                        primaryContainerColor = TabRowDefaults.INSTANCE.getPrimaryContainerColor(composerStartRestartGroup, 6);
                                        i4 &= -7169;
                                    }
                                    if ((i3 & 16) != 0) {
                                        primaryContentColor = TabRowDefaults.INSTANCE.getPrimaryContentColor(composerStartRestartGroup, 6);
                                        i4 &= -57345;
                                    }
                                    if (i6 != 0) {
                                        fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = TabRowDefaults.INSTANCE.m9924getScrollableTabRowEdgeStartPaddingD9Ej5fM();
                                    }
                                    if (i7 == 0) {
                                        function2M9341getLambda7$material3_release = ComposableSingletons$TabRowKt.INSTANCE.m9341getLambda7$material3_release();
                                    }
                                    final float f2 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1696166011, i4, -1, "androidx.compose.material3.ScrollableTabRowImp (TabRow.kt:855)");
                                    }
                                    final Function2<? super Composer, ? super Integer, Unit> function24 = function2M9341getLambda7$material3_release;
                                    int i10 = ((i4 >> 6) & 14) | 12582912;
                                    int i11 = i4 >> 3;
                                    SurfaceKt.m9876SurfaceT9BRK9s(modifier2, null, primaryContainerColor, primaryContentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1178901494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        /* JADX WARN: Multi-variable type inference failed */
                                        {
                                            super(2);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                            invoke(composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                        @Composable
                                        public final void invoke(@Nullable Composer composer2, int i12) {
                                            if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1178901494, i12, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous> (TabRow.kt:861)");
                                                }
                                                composer2.startReplaceableGroup(773894976);
                                                composer2.startReplaceableGroup(-492369756);
                                                Object objRememberedValue = composer2.rememberedValue();
                                                Composer.Companion companion = Composer.INSTANCE;
                                                if (objRememberedValue == companion.getEmpty()) {
                                                    Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                                    composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                    objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                                }
                                                composer2.endReplaceableGroup();
                                                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                                composer2.endReplaceableGroup();
                                                composer2.startReplaceableGroup(121290627);
                                                boolean zChanged = composer2.changed(scrollState) | composer2.changed(coroutineScope);
                                                ScrollState scrollState2 = scrollState;
                                                Object objRememberedValue2 = composer2.rememberedValue();
                                                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                                    objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                    composer2.updateRememberedValue(objRememberedValue2);
                                                }
                                                final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                                composer2.endReplaceableGroup();
                                                Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                                composer2.startReplaceableGroup(121291080);
                                                boolean zChanged2 = composer2.changed(f2) | composer2.changed(function22) | composer2.changed(function24) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                                                final float f3 = f2;
                                                final Function2<Composer, Integer, Unit> function25 = function22;
                                                final Function2<Composer, Integer, Unit> function26 = function24;
                                                final int i13 = i;
                                                final Function3<List<TabPosition>, Composer, Integer, Unit> function32 = function3;
                                                Object objRememberedValue3 = composer2.rememberedValue();
                                                if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                                    objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1$1$1
                                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        {
                                                            super(2);
                                                        }

                                                        @Override // kotlin.jvm.functions.Function2
                                                        public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                            return m9937invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                        }

                                                        @NotNull
                                                        /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                        public final MeasureResult m9937invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j3) {
                                                            int iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                            final int iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(f3);
                                                            List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                            Integer numValueOf = 0;
                                                            int size = listSubcompose.size();
                                                            for (int i14 = 0; i14 < size; i14++) {
                                                                numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                            }
                                                            final int iIntValue = numValueOf.intValue();
                                                            long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j3, iMo7868roundToPx0680j_4, 0, iIntValue, iIntValue, 2, null);
                                                            final ArrayList arrayList = new ArrayList();
                                                            final ArrayList arrayList2 = new ArrayList();
                                                            int size2 = listSubcompose.size();
                                                            for (int i15 = 0; i15 < size2; i15++) {
                                                                Measurable measurable = listSubcompose.get(i15);
                                                                Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(jM13613copyZbe2FdA$default);
                                                                float fM13666constructorimpl = C2046Dp.m13666constructorimpl(subcomposeMeasureScope.mo7871toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo12610measureBRTryo0.getHeight()), placeableMo12610measureBRTryo0.getWidth())) - C2046Dp.m13666constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                                arrayList.add(placeableMo12610measureBRTryo0);
                                                                arrayList2.add(C2046Dp.m13664boximpl(fM13666constructorimpl));
                                                            }
                                                            Integer numValueOf2 = Integer.valueOf(iMo7868roundToPx0680j_42 * 2);
                                                            int size3 = arrayList.size();
                                                            for (int i16 = 0; i16 < size3; i16++) {
                                                                numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                            }
                                                            final int iIntValue2 = numValueOf2.intValue();
                                                            final Function2<Composer, Integer, Unit> function27 = function26;
                                                            final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                            final int i17 = i13;
                                                            final Function3<List<TabPosition>, Composer, Integer, Unit> function33 = function32;
                                                            return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1$1$1.2
                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                /* JADX WARN: Multi-variable type inference failed */
                                                                {
                                                                    super(1);
                                                                }

                                                                @Override // kotlin.jvm.functions.Function1
                                                                public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                    invoke2(placementScope);
                                                                    return Unit.INSTANCE;
                                                                }

                                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                                public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                                    final ArrayList arrayList3 = new ArrayList();
                                                                    int width = iMo7868roundToPx0680j_42;
                                                                    List<Placeable> list = arrayList;
                                                                    SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                    List<C2046Dp> list2 = arrayList2;
                                                                    int size4 = list.size();
                                                                    for (int i18 = 0; i18 < size4; i18++) {
                                                                        Placeable placeable = list.get(i18);
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                        arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo7871toDpu2uoSUM(width), subcomposeMeasureScope2.mo7871toDpu2uoSUM(placeable.getWidth()), list2.get(i18).m13680unboximpl(), null));
                                                                        width += placeable.getWidth();
                                                                    }
                                                                    List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                    long j4 = j3;
                                                                    int i19 = iIntValue2;
                                                                    int i20 = iIntValue;
                                                                    int i21 = 0;
                                                                    for (int size5 = listSubcompose2.size(); i21 < size5; size5 = size5) {
                                                                        Placeable placeableMo12610measureBRTryo02 = listSubcompose2.get(i21).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, i19, i19, 0, 0, 8, null));
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, 0, i20 - placeableMo12610measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                        i21++;
                                                                    }
                                                                    SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                    TabSlots tabSlots = TabSlots.Indicator;
                                                                    final Function3<List<TabPosition>, Composer, Integer, Unit> function34 = function33;
                                                                    List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(358596038, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowImp.1.1.1.2.3
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

                                                                        @Composable
                                                                        public final void invoke(@Nullable Composer composer3, int i22) {
                                                                            if ((i22 & 3) == 2 && composer3.getSkipping()) {
                                                                                composer3.skipToGroupEnd();
                                                                                return;
                                                                            }
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventStart(358596038, i22, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:942)");
                                                                            }
                                                                            function34.invoke(arrayList3, composer3, 0);
                                                                            if (ComposerKt.isTraceInProgress()) {
                                                                                ComposerKt.traceEventEnd();
                                                                            }
                                                                        }
                                                                    }));
                                                                    int i22 = iIntValue2;
                                                                    int i23 = iIntValue;
                                                                    int size6 = listSubcompose3.size();
                                                                    for (int i24 = 0; i24 < size6; i24++) {
                                                                        Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i24).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                                    }
                                                                    scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo7868roundToPx0680j_42, arrayList3, i17);
                                                                }
                                                            }, 4, null);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(objRememberedValue3);
                                                }
                                                composer2.endReplaceableGroup();
                                                SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer2, 0, 0);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                    return;
                                                }
                                                return;
                                            }
                                            composer2.skipToGroupEnd();
                                        }
                                    }), composerStartRestartGroup, i10 | (i11 & 896) | (i11 & 7168), 114);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f2;
                                    function23 = function2M9341getLambda7$material3_release;
                                }
                                function2M9341getLambda7$material3_release = function2;
                                final float f22 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function242 = function2M9341getLambda7$material3_release;
                                int i102 = ((i4 >> 6) & 14) | 12582912;
                                int i112 = i4 >> 3;
                                SurfaceKt.m9876SurfaceT9BRK9s(modifier2, null, primaryContainerColor, primaryContentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1178901494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1178901494, i12, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous> (TabRow.kt:861)");
                                            }
                                            composer2.startReplaceableGroup(773894976);
                                            composer2.startReplaceableGroup(-492369756);
                                            Object objRememberedValue = composer2.rememberedValue();
                                            Composer.Companion companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            composer2.endReplaceableGroup();
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                            composer2.endReplaceableGroup();
                                            composer2.startReplaceableGroup(121290627);
                                            boolean zChanged = composer2.changed(scrollState) | composer2.changed(coroutineScope);
                                            ScrollState scrollState2 = scrollState;
                                            Object objRememberedValue2 = composer2.rememberedValue();
                                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                                objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                composer2.updateRememberedValue(objRememberedValue2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                            composer2.endReplaceableGroup();
                                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                            composer2.startReplaceableGroup(121291080);
                                            boolean zChanged2 = composer2.changed(f22) | composer2.changed(function22) | composer2.changed(function242) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                                            final float f3 = f22;
                                            final Function2<? super Composer, ? super Integer, Unit> function25 = function22;
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function242;
                                            final int i13 = i;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                                objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return m9937invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    @NotNull
                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m9937invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j3) {
                                                        int iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                        final int iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(f3);
                                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function25);
                                                        Integer numValueOf = 0;
                                                        int size = listSubcompose.size();
                                                        for (int i14 = 0; i14 < size; i14++) {
                                                            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                        }
                                                        final int iIntValue = numValueOf.intValue();
                                                        long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j3, iMo7868roundToPx0680j_4, 0, iIntValue, iIntValue, 2, null);
                                                        final List<Placeable> arrayList = new ArrayList();
                                                        final List<C2046Dp> arrayList2 = new ArrayList();
                                                        int size2 = listSubcompose.size();
                                                        for (int i15 = 0; i15 < size2; i15++) {
                                                            Measurable measurable = listSubcompose.get(i15);
                                                            Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(jM13613copyZbe2FdA$default);
                                                            float fM13666constructorimpl = C2046Dp.m13666constructorimpl(subcomposeMeasureScope.mo7871toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo12610measureBRTryo0.getHeight()), placeableMo12610measureBRTryo0.getWidth())) - C2046Dp.m13666constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                            arrayList.add(placeableMo12610measureBRTryo0);
                                                            arrayList2.add(C2046Dp.m13664boximpl(fM13666constructorimpl));
                                                        }
                                                        Integer numValueOf2 = Integer.valueOf(iMo7868roundToPx0680j_42 * 2);
                                                        int size3 = arrayList.size();
                                                        for (int i16 = 0; i16 < size3; i16++) {
                                                            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                        }
                                                        final int iIntValue2 = numValueOf2.intValue();
                                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i17 = i13;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                                        return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1$1$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                                int width = iMo7868roundToPx0680j_42;
                                                                List<Placeable> list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                List<C2046Dp> list2 = arrayList2;
                                                                int size4 = list.size();
                                                                for (int i18 = 0; i18 < size4; i18++) {
                                                                    Placeable placeable = list.get(i18);
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo7871toDpu2uoSUM(width), subcomposeMeasureScope2.mo7871toDpu2uoSUM(placeable.getWidth()), list2.get(i18).m13680unboximpl(), null));
                                                                    width += placeable.getWidth();
                                                                }
                                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                long j4 = j3;
                                                                int i19 = iIntValue2;
                                                                int i20 = iIntValue;
                                                                int i21 = 0;
                                                                for (int size5 = listSubcompose2.size(); i21 < size5; size5 = size5) {
                                                                    Placeable placeableMo12610measureBRTryo02 = listSubcompose2.get(i21).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j4, i19, i19, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, 0, i20 - placeableMo12610measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                    i21++;
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(358596038, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowImp.1.1.1.2.3
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

                                                                    @Composable
                                                                    public final void invoke(@Nullable Composer composer3, int i22) {
                                                                        if ((i22 & 3) == 2 && composer3.getSkipping()) {
                                                                            composer3.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(358596038, i22, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:942)");
                                                                        }
                                                                        function34.invoke(arrayList3, composer3, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }));
                                                                int i22 = iIntValue2;
                                                                int i23 = iIntValue;
                                                                int size6 = listSubcompose3.size();
                                                                for (int i24 = 0; i24 < size6; i24++) {
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i24).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo7868roundToPx0680j_42, arrayList3, i17);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceableGroup();
                                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer2, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, i102 | (i112 & 896) | (i112 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f22;
                                function23 = function2M9341getLambda7$material3_release;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                function23 = function2;
                            }
                            final Modifier modifier3 = modifier2;
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final long j3 = primaryContainerColor;
                                final long j4 = primaryContentColor;
                                final float f3 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                final Function2<? super Composer, ? super Integer, Unit> function25 = function23;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        TabRowKt.m9928ScrollableTabRowImpqhFBPw4(i, function3, modifier3, j3, j4, f3, function25, function22, scrollState, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i4 |= 100663296;
                        if ((i4 & 38347923) == 38347922) {
                            composerStartRestartGroup.startDefaults();
                            if ((i2 & 1) == 0) {
                                if (i5 != 0) {
                                }
                                if ((i3 & 8) != 0) {
                                }
                                if ((i3 & 16) != 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 == 0) {
                                    function2M9341getLambda7$material3_release = function2;
                                }
                                final float f222 = fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                final Function2<? super Composer, ? super Integer, Unit> function2422 = function2M9341getLambda7$material3_release;
                                int i1022 = ((i4 >> 6) & 14) | 12582912;
                                int i1122 = i4 >> 3;
                                SurfaceKt.m9876SurfaceT9BRK9s(modifier2, null, primaryContainerColor, primaryContentColor, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1178901494, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                        invoke(composer2, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
                                    @Composable
                                    public final void invoke(@Nullable Composer composer2, int i12) {
                                        if ((i12 & 3) != 2 || !composer2.getSkipping()) {
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1178901494, i12, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous> (TabRow.kt:861)");
                                            }
                                            composer2.startReplaceableGroup(773894976);
                                            composer2.startReplaceableGroup(-492369756);
                                            Object objRememberedValue = composer2.rememberedValue();
                                            Composer.Companion companion = Composer.INSTANCE;
                                            if (objRememberedValue == companion.getEmpty()) {
                                                Object compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2));
                                                composer2.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                                objRememberedValue = compositionScopedCoroutineScopeCanceller;
                                            }
                                            composer2.endReplaceableGroup();
                                            CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue).getCoroutineScope();
                                            composer2.endReplaceableGroup();
                                            composer2.startReplaceableGroup(121290627);
                                            boolean zChanged = composer2.changed(scrollState) | composer2.changed(coroutineScope);
                                            ScrollState scrollState2 = scrollState;
                                            Object objRememberedValue2 = composer2.rememberedValue();
                                            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                                                objRememberedValue2 = new ScrollableTabData(scrollState2, coroutineScope);
                                                composer2.updateRememberedValue(objRememberedValue2);
                                            }
                                            final ScrollableTabData scrollableTabData = (ScrollableTabData) objRememberedValue2;
                                            composer2.endReplaceableGroup();
                                            Modifier modifierClipToBounds = ClipKt.clipToBounds(SelectableGroupKt.selectableGroup(ScrollKt.horizontalScroll$default(SizeKt.wrapContentSize$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Alignment.INSTANCE.getCenterStart(), false, 2, null), scrollState, false, null, false, 14, null)));
                                            composer2.startReplaceableGroup(121291080);
                                            boolean zChanged2 = composer2.changed(f222) | composer2.changed(function22) | composer2.changed(function2422) | composer2.changed(function3) | composer2.changedInstance(scrollableTabData) | composer2.changed(i);
                                            final float f32 = f222;
                                            final Function2<? super Composer, ? super Integer, Unit> function252 = function22;
                                            final Function2<? super Composer, ? super Integer, Unit> function26 = function2422;
                                            final int i13 = i;
                                            final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function32 = function3;
                                            Object objRememberedValue3 = composer2.rememberedValue();
                                            if (zChanged2 || objRememberedValue3 == companion.getEmpty()) {
                                                objRememberedValue3 = new Function2<SubcomposeMeasureScope, Constraints, MeasureResult>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1$1$1
                                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                    /* JADX WARN: Multi-variable type inference failed */
                                                    {
                                                        super(2);
                                                    }

                                                    @Override // kotlin.jvm.functions.Function2
                                                    public /* bridge */ /* synthetic */ MeasureResult invoke(SubcomposeMeasureScope subcomposeMeasureScope, Constraints constraints) {
                                                        return m9937invoke0kLqBqw(subcomposeMeasureScope, constraints.getValue());
                                                    }

                                                    @NotNull
                                                    /* renamed from: invoke-0kLqBqw, reason: not valid java name */
                                                    public final MeasureResult m9937invoke0kLqBqw(@NotNull final SubcomposeMeasureScope subcomposeMeasureScope, final long j32) {
                                                        int iMo7868roundToPx0680j_4 = subcomposeMeasureScope.mo7868roundToPx0680j_4(TabRowKt.ScrollableTabRowMinimumTabWidth);
                                                        final int iMo7868roundToPx0680j_42 = subcomposeMeasureScope.mo7868roundToPx0680j_4(f32);
                                                        List<Measurable> listSubcompose = subcomposeMeasureScope.subcompose(TabSlots.Tabs, function252);
                                                        Integer numValueOf = 0;
                                                        int size = listSubcompose.size();
                                                        for (int i14 = 0; i14 < size; i14++) {
                                                            numValueOf = Integer.valueOf(Math.max(numValueOf.intValue(), listSubcompose.get(i14).maxIntrinsicHeight(Integer.MAX_VALUE)));
                                                        }
                                                        final int iIntValue = numValueOf.intValue();
                                                        long jM13613copyZbe2FdA$default = Constraints.m13613copyZbe2FdA$default(j32, iMo7868roundToPx0680j_4, 0, iIntValue, iIntValue, 2, null);
                                                        final List<Placeable> arrayList = new ArrayList();
                                                        final List<C2046Dp> arrayList2 = new ArrayList();
                                                        int size2 = listSubcompose.size();
                                                        for (int i15 = 0; i15 < size2; i15++) {
                                                            Measurable measurable = listSubcompose.get(i15);
                                                            Placeable placeableMo12610measureBRTryo0 = measurable.mo12610measureBRTryo0(jM13613copyZbe2FdA$default);
                                                            float fM13666constructorimpl = C2046Dp.m13666constructorimpl(subcomposeMeasureScope.mo7871toDpu2uoSUM(Math.min(measurable.maxIntrinsicWidth(placeableMo12610measureBRTryo0.getHeight()), placeableMo12610measureBRTryo0.getWidth())) - C2046Dp.m13666constructorimpl(TabKt.getHorizontalTextPadding() * 2));
                                                            arrayList.add(placeableMo12610measureBRTryo0);
                                                            arrayList2.add(C2046Dp.m13664boximpl(fM13666constructorimpl));
                                                        }
                                                        Integer numValueOf2 = Integer.valueOf(iMo7868roundToPx0680j_42 * 2);
                                                        int size3 = arrayList.size();
                                                        for (int i16 = 0; i16 < size3; i16++) {
                                                            numValueOf2 = Integer.valueOf(numValueOf2.intValue() + ((Placeable) arrayList.get(i16)).getWidth());
                                                        }
                                                        final int iIntValue2 = numValueOf2.intValue();
                                                        final Function2<? super Composer, ? super Integer, Unit> function27 = function26;
                                                        final ScrollableTabData scrollableTabData2 = scrollableTabData;
                                                        final int i17 = i13;
                                                        final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function33 = function32;
                                                        return MeasureScope.layout$default(subcomposeMeasureScope, iIntValue2, iIntValue, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material3.TabRowKt$ScrollableTabRowImp$1$1$1.2
                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            /* JADX WARN: Multi-variable type inference failed */
                                                            {
                                                                super(1);
                                                            }

                                                            @Override // kotlin.jvm.functions.Function1
                                                            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                                                                invoke2(placementScope);
                                                                return Unit.INSTANCE;
                                                            }

                                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                            public final void invoke2(@NotNull Placeable.PlacementScope placementScope) {
                                                                final List<TabPosition> arrayList3 = new ArrayList();
                                                                int width = iMo7868roundToPx0680j_42;
                                                                List<Placeable> list = arrayList;
                                                                SubcomposeMeasureScope subcomposeMeasureScope2 = subcomposeMeasureScope;
                                                                List<C2046Dp> list2 = arrayList2;
                                                                int size4 = list.size();
                                                                for (int i18 = 0; i18 < size4; i18++) {
                                                                    Placeable placeable = list.get(i18);
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeable, width, 0, 0.0f, 4, null);
                                                                    arrayList3.add(new TabPosition(subcomposeMeasureScope2.mo7871toDpu2uoSUM(width), subcomposeMeasureScope2.mo7871toDpu2uoSUM(placeable.getWidth()), list2.get(i18).m13680unboximpl(), null));
                                                                    width += placeable.getWidth();
                                                                }
                                                                List<Measurable> listSubcompose2 = subcomposeMeasureScope.subcompose(TabSlots.Divider, function27);
                                                                long j42 = j32;
                                                                int i19 = iIntValue2;
                                                                int i20 = iIntValue;
                                                                int i21 = 0;
                                                                for (int size5 = listSubcompose2.size(); i21 < size5; size5 = size5) {
                                                                    Placeable placeableMo12610measureBRTryo02 = listSubcompose2.get(i21).mo12610measureBRTryo0(Constraints.m13613copyZbe2FdA$default(j42, i19, i19, 0, 0, 8, null));
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, placeableMo12610measureBRTryo02, 0, i20 - placeableMo12610measureBRTryo02.getHeight(), 0.0f, 4, null);
                                                                    i21++;
                                                                }
                                                                SubcomposeMeasureScope subcomposeMeasureScope3 = subcomposeMeasureScope;
                                                                TabSlots tabSlots = TabSlots.Indicator;
                                                                final Function3<? super List<TabPosition>, ? super Composer, ? super Integer, Unit> function34 = function33;
                                                                List<Measurable> listSubcompose3 = subcomposeMeasureScope3.subcompose(tabSlots, ComposableLambdaKt.composableLambdaInstance(358596038, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.TabRowKt.ScrollableTabRowImp.1.1.1.2.3
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

                                                                    @Composable
                                                                    public final void invoke(@Nullable Composer composer3, int i22) {
                                                                        if ((i22 & 3) == 2 && composer3.getSkipping()) {
                                                                            composer3.skipToGroupEnd();
                                                                            return;
                                                                        }
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventStart(358596038, i22, -1, "androidx.compose.material3.ScrollableTabRowImp.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TabRow.kt:942)");
                                                                        }
                                                                        function34.invoke(arrayList3, composer3, 0);
                                                                        if (ComposerKt.isTraceInProgress()) {
                                                                            ComposerKt.traceEventEnd();
                                                                        }
                                                                    }
                                                                }));
                                                                int i22 = iIntValue2;
                                                                int i23 = iIntValue;
                                                                int size6 = listSubcompose3.size();
                                                                for (int i24 = 0; i24 < size6; i24++) {
                                                                    Placeable.PlacementScope.placeRelative$default(placementScope, listSubcompose3.get(i24).mo12610measureBRTryo0(Constraints.INSTANCE.m13630fixedJhjzzOo(i22, i23)), 0, 0, 0.0f, 4, null);
                                                                }
                                                                scrollableTabData2.onLaidOut(subcomposeMeasureScope, iMo7868roundToPx0680j_42, arrayList3, i17);
                                                            }
                                                        }, 4, null);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue3);
                                            }
                                            composer2.endReplaceableGroup();
                                            SubcomposeLayoutKt.SubcomposeLayout(modifierClipToBounds, (Function2) objRememberedValue3, composer2, 0, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                                return;
                                            }
                                            return;
                                        }
                                        composer2.skipToGroupEnd();
                                    }
                                }), composerStartRestartGroup, i1022 | (i1122 & 896) | (i1122 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f222;
                                function23 = function2M9341getLambda7$material3_release;
                            }
                        }
                        final Modifier modifier32 = modifier2;
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & 256) == 0) {
                    }
                    if ((i4 & 38347923) == 38347922) {
                    }
                    final Modifier modifier322 = modifier2;
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                if ((i3 & 128) == 0) {
                }
                if ((i3 & 256) == 0) {
                }
                if ((i4 & 38347923) == 38347922) {
                }
                final Modifier modifier3222 = modifier2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            if ((i2 & 3072) == 0) {
            }
            if ((i2 & CpioConstants.C_ISBLK) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            if ((i3 & 128) == 0) {
            }
            if ((i3 & 256) == 0) {
            }
            if ((i4 & 38347923) == 38347922) {
            }
            final Modifier modifier32222 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        modifier2 = modifier;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & CpioConstants.C_ISBLK) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        fM9924getScrollableTabRowEdgeStartPaddingD9Ej5fM = f;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
        }
        final Modifier modifier322222 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
