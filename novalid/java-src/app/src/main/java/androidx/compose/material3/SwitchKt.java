package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.InteractionSource;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.selection.ToggleableKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SwitchTokens;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.layout.LayoutKt;
import androidx.compose.p003ui.layout.MeasurePolicy;
import androidx.compose.p003ui.node.ComposeUiNode;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.semantics.Role;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.profileinstaller.ProfileVerifier;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Switch.kt */
@Metadata(m7104d1 = {"\u0000^\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aj\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u00112\b\b\u0002\u0010\u001a\u001a\u00020\u001b2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010\u001e\u001ay\u0010\u001f\u001a\u00020\u000f*\u00020 2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"2\u0013\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0017¢\u0006\u0002\b\u00182\u0006\u0010\u001c\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0004H\u0003ø\u0001\u0000¢\u0006\u0004\b)\u0010*\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0010\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0016\u0010\u0007\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\b\u0010\t\"\u0010\u0010\n\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0010\u0010\u000b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0005\"\u0016\u0010\f\u001a\u00020\u0004X\u0080\u0004¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\r\u0010\t\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006+²\u0006\n\u0010,\u001a\u00020\u0011X\u008a\u0084\u0002"}, m7105d2 = {"AnimationSpec", "Landroidx/compose/animation/core/TweenSpec;", "", "SwitchHeight", "Landroidx/compose/ui/unit/Dp;", "F", "SwitchWidth", "ThumbDiameter", "getThumbDiameter", "()F", "ThumbPadding", "ThumbPathLength", "UncheckedThumbDiameter", "getUncheckedThumbDiameter", "Switch", "", "checked", "", "onCheckedChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "thumbContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "enabled", "colors", "Landroidx/compose/material3/SwitchColors;", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/SwitchColors;Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/runtime/Composer;II)V", "SwitchImpl", "Landroidx/compose/foundation/layout/BoxScope;", "thumbValue", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/interaction/InteractionSource;", "thumbShape", "Landroidx/compose/ui/graphics/Shape;", "uncheckedThumbDiameter", "minBound", "maxBound", "SwitchImpl-0DmnUew", "(Landroidx/compose/foundation/layout/BoxScope;ZZLandroidx/compose/material3/SwitchColors;Landroidx/compose/runtime/State;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/interaction/InteractionSource;Landroidx/compose/ui/graphics/Shape;FFFLandroidx/compose/runtime/Composer;II)V", "material3_release", "isPressed"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Composer.kt\nandroidx/compose/runtime/Updater\n+ 12 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,573:1\n1116#2,6:574\n1116#2,6:585\n1116#2,6:591\n1116#2,3:602\n1119#2,3:608\n1116#2,6:612\n1116#2,6:618\n1116#2,6:707\n58#3:580\n75#3:581\n58#3:665\n58#3:666\n81#3:667\n88#3:668\n51#3:669\n58#3:671\n75#3:713\n58#3:759\n75#3:760\n58#3:761\n74#4:582\n74#4:584\n74#4:664\n74#4:670\n1#5:583\n487#6,4:597\n491#6,2:605\n495#6:611\n25#7:601\n456#7,8:641\n464#7,3:655\n467#7,3:659\n456#7,8:689\n464#7,3:703\n456#7,8:730\n464#7,3:744\n467#7,3:748\n467#7,3:753\n487#8:607\n68#9,6:624\n74#9:658\n78#9:663\n68#9,6:672\n74#9:706\n69#9,5:714\n74#9:747\n78#9:752\n78#9:757\n78#10,11:630\n91#10:662\n78#10,11:678\n78#10,11:719\n91#10:751\n91#10:756\n3737#11,6:649\n3737#11,6:697\n3737#11,6:738\n81#12:758\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n98#1:574,6\n109#1:585,6\n114#1:591,6\n115#1:602,3\n115#1:608,3\n117#1:612,6\n122#1:618,6\n229#1:707,6\n106#1:580\n106#1:581\n195#1:665\n196#1:666\n196#1:667\n195#1:668\n195#1:669\n202#1:671\n234#1:713\n256#1:759\n256#1:760\n257#1:761\n107#1:582\n108#1:584\n191#1:664\n200#1:670\n115#1:597,4\n115#1:605,2\n115#1:611\n115#1:601\n146#1:641,8\n146#1:655,3\n146#1:659,3\n223#1:689,8\n223#1:703,3\n226#1:730,8\n226#1:744,3\n226#1:748,3\n223#1:753,3\n115#1:607\n146#1:624,6\n146#1:658\n146#1:663\n223#1:672,6\n223#1:706\n226#1:714,5\n226#1:747\n226#1:752\n223#1:757\n146#1:630,11\n146#1:662\n223#1:678,11\n226#1:719,11\n226#1:751\n223#1:756\n146#1:649,6\n223#1:697,6\n226#1:738,6\n189#1:758\n*E\n"})
/* loaded from: classes2.dex */
public final class SwitchKt {

    @NotNull
    private static final TweenSpec<Float> AnimationSpec;
    private static final float SwitchHeight;
    private static final float SwitchWidth;
    private static final float ThumbDiameter;
    private static final float ThumbPadding;
    private static final float ThumbPathLength;
    private static final float UncheckedThumbDiameter;

    /* JADX WARN: Removed duplicated region for block: B:102:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0116  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Switch(final boolean z, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, boolean z2, @Nullable SwitchColors switchColors, @Nullable MutableInteractionSource mutableInteractionSource, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i5;
        boolean z3;
        SwitchColors switchColorsColors;
        int i6;
        MutableInteractionSource mutableInteractionSource2;
        int i7;
        Function2<? super Composer, ? super Integer, Unit> function23;
        boolean z4;
        SwitchColors switchColors2;
        MutableInteractionSource mutableInteractionSource3;
        Modifier modifier3;
        final float fMo7874toPx0680j_4;
        final float fMo7874toPx0680j_42;
        boolean zChanged;
        Object objRememberedValue;
        final float fFloatValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        final Animatable animatable;
        Object objRememberedValue3;
        final CoroutineScope coroutineScope;
        boolean zChangedInstance;
        Object objRememberedValue4;
        boolean zChangedInstance2;
        Object objRememberedValue5;
        Animatable animatable2;
        ?? r8;
        Modifier modifierM8367toggleableO2vRcR0;
        int currentCompositeKeyHash;
        Composer composerM10870constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Function2<? super Composer, ? super Integer, Unit> function24;
        final boolean z5;
        final SwitchColors switchColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1580463220);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function22 = function2;
                    i3 |= composerStartRestartGroup.changedInstance(function22) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        z3 = z2;
                        i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
                    }
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            switchColorsColors = switchColors;
                            int i9 = composerStartRestartGroup.changed(switchColorsColors) ? 131072 : 65536;
                            i3 |= i9;
                        } else {
                            switchColorsColors = switchColors;
                        }
                        i3 |= i9;
                    } else {
                        switchColorsColors = switchColors;
                    }
                    i6 = i2 & 64;
                    if (i6 != 0) {
                        if ((1572864 & i) == 0) {
                            mutableInteractionSource2 = mutableInteractionSource;
                            i3 |= composerStartRestartGroup.changed(mutableInteractionSource2) ? 1048576 : 524288;
                        }
                        if ((i3 & 599187) == 599186 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            function24 = function22;
                            z5 = z3;
                            switchColors3 = switchColorsColors;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            composer2 = composerStartRestartGroup;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    function22 = null;
                                }
                                if (i5 != 0) {
                                    z3 = true;
                                }
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                    switchColorsColors = SwitchDefaults.INSTANCE.colors(composerStartRestartGroup, 6);
                                }
                                if (i6 == 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-1221651002);
                                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    modifier3 = modifier4;
                                    i7 = i3;
                                    mutableInteractionSource3 = (MutableInteractionSource) objRememberedValue6;
                                    function23 = function22;
                                    z4 = z3;
                                    switchColors2 = switchColorsColors;
                                } else {
                                    i7 = i3;
                                    function23 = function22;
                                    z4 = z3;
                                    switchColors2 = switchColorsColors;
                                    mutableInteractionSource3 = mutableInteractionSource2;
                                    modifier3 = modifier4;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                i7 = i3;
                                function23 = function22;
                                z4 = z3;
                                switchColors2 = switchColorsColors;
                                mutableInteractionSource3 = mutableInteractionSource2;
                                modifier3 = modifier;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1580463220, i7, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                            }
                            float f = function23 != null ? UncheckedThumbDiameter : ThumbDiameter;
                            float f2 = SwitchHeight;
                            float fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f2 - f) / 2);
                            fMo7874toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(fM13666constructorimpl);
                            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            float f3 = ThumbPathLength;
                            fMo7874toPx0680j_42 = density.mo7874toPx0680j_4(f3);
                            composerStartRestartGroup.startReplaceableGroup(-1221650579);
                            zChanged = composerStartRestartGroup.changed(fMo7874toPx0680j_4) | composerStartRestartGroup.changed(fMo7874toPx0680j_42);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<Boolean, Float>() { // from class: androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @NotNull
                                    public final Float invoke(boolean z6) {
                                        return Float.valueOf(z6 ? fMo7874toPx0680j_42 : fMo7874toPx0680j_4);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Float invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            fFloatValue = ((Number) ((Function1) objRememberedValue).invoke(Boolean.valueOf(z))).floatValue();
                            composerStartRestartGroup.startReplaceableGroup(-1221650404);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 != companion.getEmpty()) {
                                objRememberedValue2 = AnimatableKt.Animatable$default(fFloatValue, 0.0f, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            animatable = (Animatable) objRememberedValue2;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(773894976);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup));
                                composerStartRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                                objRememberedValue3 = compositionScopedCoroutineScopeCanceller;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-1221650310);
                            zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fMo7874toPx0680j_4);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material3.SwitchKt$Switch$2$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        Animatable.updateBounds$default(animatable, Float.valueOf(fMo7874toPx0680j_4), null, 2, null);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                            Boolean boolValueOf = Boolean.valueOf(z);
                            composerStartRestartGroup.startReplaceableGroup(-1221650133);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changedInstance(coroutineScope);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.SwitchKt$Switch$3$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    /* compiled from: Switch.kt */
                                    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                    @DebugMetadata(m7119c = "androidx.compose.material3.SwitchKt$Switch$3$1$1", m7120f = "Switch.kt", m7121i = {}, m7122l = {125}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                    /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$1$1 */
                                    /* loaded from: classes2.dex */
                                    public static final class C16411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                        public final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;
                                        public final /* synthetic */ float $targetValue;
                                        public int label;

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        public C16411(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super C16411> continuation) {
                                            super(2, continuation);
                                            this.$offset = animatable;
                                            this.$targetValue = f;
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @NotNull
                                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                            return new C16411(this.$offset, this.$targetValue, continuation);
                                        }

                                        @Override // kotlin.jvm.functions.Function2
                                        @Nullable
                                        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                            return ((C16411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                        }

                                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                        @Nullable
                                        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                            int i = this.label;
                                            if (i == 0) {
                                                ResultKt.throwOnFailure(obj);
                                                Animatable<Float, AnimationVector1D> animatable = this.$offset;
                                                Float fBoxFloat = Boxing.boxFloat(this.$targetValue);
                                                TweenSpec tweenSpec = SwitchKt.AnimationSpec;
                                                this.label = 1;
                                                if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpec, null, null, this, 12, null) == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                            } else {
                                                if (i != 1) {
                                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                }
                                                ResultKt.throwOnFailure(obj);
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    @NotNull
                                    public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                        float fFloatValue2 = animatable.getTargetValue().floatValue();
                                        float f4 = fFloatValue;
                                        if (fFloatValue2 != f4) {
                                            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16411(animatable, f4, null), 3, null);
                                        }
                                        return new DisposableEffectResult() { // from class: androidx.compose.material3.SwitchKt$Switch$3$1$invoke$$inlined$onDispose$1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                            }
                                        };
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.DisposableEffect(boolValueOf, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, i7 & 14);
                            if (function1 == null) {
                                r8 = 0;
                                animatable2 = animatable;
                                modifierM8367toggleableO2vRcR0 = ToggleableKt.m8367toggleableO2vRcR0(Modifier.INSTANCE, z, mutableInteractionSource3, null, z4, Role.m12986boximpl(Role.INSTANCE.m12998getSwitcho7Vup1c()), function1);
                            } else {
                                animatable2 = animatable;
                                r8 = 0;
                                modifierM8367toggleableO2vRcR0 = Modifier.INSTANCE;
                            }
                            Modifier modifierThen = modifier3.then(function1 == null ? InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE) : Modifier.INSTANCE).then(modifierM8367toggleableO2vRcR0);
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            Modifier modifierM8166requiredSizeVpY3zN4 = SizeKt.m8166requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifierThen, companion2.getCenter(), r8, 2, null), SwitchWidth, f2);
                            composerStartRestartGroup.startReplaceableGroup(733328855);
                            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), r8, composerStartRestartGroup, r8);
                            composerStartRestartGroup.startReplaceableGroup(-1323940314);
                            currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r8);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
                            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM8166requiredSizeVpY3zN4);
                            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.useNode();
                            } else {
                                composerStartRestartGroup.createNode(constructor);
                            }
                            composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (!composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((int) r8));
                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                            int i10 = i7 >> 6;
                            int i11 = ((i7 << 3) & 112) | 6 | (i10 & 896) | (i10 & 7168) | ((i7 << 6) & 458752) | (3670016 & i7);
                            modifier2 = modifier3;
                            composer2 = composerStartRestartGroup;
                            m9909SwitchImpl0DmnUew(BoxScopeInstance.INSTANCE, z, z4, switchColors2, animatable2.asState(), function23, mutableInteractionSource3, ShapesKt.getValue(SwitchTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6), f, fM13666constructorimpl, f3, composer2, i11, 6);
                            composer2.endReplaceableGroup();
                            composer2.endNode();
                            composer2.endReplaceableGroup();
                            composer2.endReplaceableGroup();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function24 = function23;
                            z5 = z4;
                            switchColors3 = switchColors2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final MutableInteractionSource mutableInteractionSource4 = mutableInteractionSource3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt.Switch.5
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
                                    SwitchKt.Switch(z, function1, modifier2, function24, z5, switchColors3, mutableInteractionSource4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 1572864;
                    mutableInteractionSource2 = mutableInteractionSource;
                    if ((i3 & 599187) == 599186) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if (i8 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 != 0) {
                            }
                            if ((i2 & 32) != 0) {
                            }
                            if (i6 == 0) {
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            float f4 = function23 != null ? UncheckedThumbDiameter : ThumbDiameter;
                            float f22 = SwitchHeight;
                            float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(f22 - f4) / 2);
                            fMo7874toPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(fM13666constructorimpl2);
                            Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                            float f32 = ThumbPathLength;
                            fMo7874toPx0680j_42 = density2.mo7874toPx0680j_4(f32);
                            composerStartRestartGroup.startReplaceableGroup(-1221650579);
                            zChanged = composerStartRestartGroup.changed(fMo7874toPx0680j_4) | composerStartRestartGroup.changed(fMo7874toPx0680j_42);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue = new Function1<Boolean, Float>() { // from class: androidx.compose.material3.SwitchKt$Switch$valueToOffset$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(1);
                                    }

                                    @NotNull
                                    public final Float invoke(boolean z6) {
                                        return Float.valueOf(z6 ? fMo7874toPx0680j_42 : fMo7874toPx0680j_4);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Float invoke(Boolean bool) {
                                        return invoke(bool.booleanValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                composerStartRestartGroup.endReplaceableGroup();
                                fFloatValue = ((Number) ((Function1) objRememberedValue).invoke(Boolean.valueOf(z))).floatValue();
                                composerStartRestartGroup.startReplaceableGroup(-1221650404);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue2 != companion.getEmpty()) {
                                }
                                animatable = (Animatable) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(773894976);
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objRememberedValue3).getCoroutineScope();
                                composerStartRestartGroup.endReplaceableGroup();
                                composerStartRestartGroup.startReplaceableGroup(-1221650310);
                                zChangedInstance = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fMo7874toPx0680j_4);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance) {
                                    objRememberedValue4 = new Function0<Unit>() { // from class: androidx.compose.material3.SwitchKt$Switch$2$1
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public /* bridge */ /* synthetic */ Unit invoke() {
                                            invoke2();
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2() {
                                            Animatable.updateBounds$default(animatable, Float.valueOf(fMo7874toPx0680j_4), null, 2, null);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.SideEffect((Function0) objRememberedValue4, composerStartRestartGroup, 0);
                                    Boolean boolValueOf2 = Boolean.valueOf(z);
                                    composerStartRestartGroup.startReplaceableGroup(-1221650133);
                                    zChangedInstance2 = composerStartRestartGroup.changedInstance(animatable) | composerStartRestartGroup.changed(fFloatValue) | composerStartRestartGroup.changedInstance(coroutineScope);
                                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance2) {
                                        objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.material3.SwitchKt$Switch$3$1
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(1);
                                            }

                                            /* compiled from: Switch.kt */
                                            @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
                                            @DebugMetadata(m7119c = "androidx.compose.material3.SwitchKt$Switch$3$1$1", m7120f = "Switch.kt", m7121i = {}, m7122l = {125}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
                                            /* renamed from: androidx.compose.material3.SwitchKt$Switch$3$1$1 */
                                            /* loaded from: classes2.dex */
                                            public static final class C16411 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                                public final /* synthetic */ Animatable<Float, AnimationVector1D> $offset;
                                                public final /* synthetic */ float $targetValue;
                                                public int label;

                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                public C16411(Animatable<Float, AnimationVector1D> animatable, float f, Continuation<? super C16411> continuation) {
                                                    super(2, continuation);
                                                    this.$offset = animatable;
                                                    this.$targetValue = f;
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @NotNull
                                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                                    return new C16411(this.$offset, this.$targetValue, continuation);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                @Nullable
                                                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
                                                    return ((C16411) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                                }

                                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                @Nullable
                                                public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
                                                    Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                                    int i = this.label;
                                                    if (i == 0) {
                                                        ResultKt.throwOnFailure(obj);
                                                        Animatable<Float, AnimationVector1D> animatable = this.$offset;
                                                        Float fBoxFloat = Boxing.boxFloat(this.$targetValue);
                                                        TweenSpec tweenSpec = SwitchKt.AnimationSpec;
                                                        this.label = 1;
                                                        if (Animatable.animateTo$default(animatable, fBoxFloat, tweenSpec, null, null, this, 12, null) == coroutine_suspended) {
                                                            return coroutine_suspended;
                                                        }
                                                    } else {
                                                        if (i != 1) {
                                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                                        }
                                                        ResultKt.throwOnFailure(obj);
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            @NotNull
                                            public final DisposableEffectResult invoke(@NotNull DisposableEffectScope disposableEffectScope) {
                                                float fFloatValue2 = animatable.getTargetValue().floatValue();
                                                float f42 = fFloatValue;
                                                if (fFloatValue2 != f42) {
                                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C16411(animatable, f42, null), 3, null);
                                                }
                                                return new DisposableEffectResult() { // from class: androidx.compose.material3.SwitchKt$Switch$3$1$invoke$$inlined$onDispose$1
                                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                                    public void dispose() {
                                                    }
                                                };
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        EffectsKt.DisposableEffect(boolValueOf2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, i7 & 14);
                                        if (function1 == null) {
                                        }
                                        Modifier modifierThen2 = modifier3.then(function1 == null ? InteractiveComponentSizeKt.minimumInteractiveComponentSize(Modifier.INSTANCE) : Modifier.INSTANCE).then(modifierM8367toggleableO2vRcR0);
                                        Alignment.Companion companion22 = Alignment.INSTANCE;
                                        Modifier modifierM8166requiredSizeVpY3zN42 = SizeKt.m8166requiredSizeVpY3zN4(SizeKt.wrapContentSize$default(modifierThen2, companion22.getCenter(), r8, 2, null), SwitchWidth, f22);
                                        composerStartRestartGroup.startReplaceableGroup(733328855);
                                        MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion22.getTopStart(), r8, composerStartRestartGroup, r8);
                                        composerStartRestartGroup.startReplaceableGroup(-1323940314);
                                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, r8);
                                        CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor2 = companion32.getConstructor();
                                        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM8166requiredSizeVpY3zN42);
                                        if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
                                        Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                                        Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap2, companion32.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                                        if (!composerM10870constructorimpl.getInserting()) {
                                            composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, Integer.valueOf((int) r8));
                                            composerStartRestartGroup.startReplaceableGroup(2058660585);
                                            int i102 = i7 >> 6;
                                            int i112 = ((i7 << 3) & 112) | 6 | (i102 & 896) | (i102 & 7168) | ((i7 << 6) & 458752) | (3670016 & i7);
                                            modifier2 = modifier3;
                                            composer2 = composerStartRestartGroup;
                                            m9909SwitchImpl0DmnUew(BoxScopeInstance.INSTANCE, z, z4, switchColors2, animatable2.asState(), function23, mutableInteractionSource3, ShapesKt.getValue(SwitchTokens.INSTANCE.getHandleShape(), composerStartRestartGroup, 6), f4, fM13666constructorimpl2, f32, composer2, i112, 6);
                                            composer2.endReplaceableGroup();
                                            composer2.endNode();
                                            composer2.endReplaceableGroup();
                                            composer2.endReplaceableGroup();
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function24 = function23;
                                            z5 = z4;
                                            switchColors3 = switchColors2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z3 = z2;
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 != 0) {
                }
                mutableInteractionSource2 = mutableInteractionSource;
                if ((i3 & 599187) == 599186) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function22 = function2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z3 = z2;
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 != 0) {
            }
            mutableInteractionSource2 = mutableInteractionSource;
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function22 = function2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z3 = z2;
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 != 0) {
        }
        mutableInteractionSource2 = mutableInteractionSource;
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SwitchImpl-0DmnUew, reason: not valid java name */
    public static final void m9909SwitchImpl0DmnUew(final BoxScope boxScope, final boolean z, final boolean z2, final SwitchColors switchColors, final State<Float> state, final Function2<? super Composer, ? super Integer, Unit> function2, final InteractionSource interactionSource, final Shape shape, final float f, final float f2, final float f3, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        float fM13666constructorimpl;
        final float fFloatValue;
        float fM10719getTrackOutlineWidthD9Ej5fM;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1968109941);
        if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(boxScope) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(switchColors) ? 2048 : 1024;
        }
        if ((i & CpioConstants.C_ISBLK) == 0) {
            i3 |= composerStartRestartGroup.changed(state) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= composerStartRestartGroup.changed(interactionSource) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= composerStartRestartGroup.changed(shape) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= composerStartRestartGroup.changed(f) ? 67108864 : NTLMEngineImpl.FLAG_REQUEST_VERSION;
        }
        if ((i & 805306368) == 0) {
            i3 |= composerStartRestartGroup.changed(f2) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (composerStartRestartGroup.changed(f3) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) != 306783378 || (i4 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1968109941, i3, i4, "androidx.compose.material3.SwitchImpl (Switch.kt:186)");
            }
            long jM9906trackColorWaAFU9c$material3_release = switchColors.m9906trackColorWaAFU9c$material3_release(z2, z);
            State<Boolean> stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(interactionSource, composerStartRestartGroup, (i3 >> 18) & 14);
            int i5 = i3;
            float fMo7870toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo7870toDpu2uoSUM(state.getValue().floatValue());
            if (SwitchImpl_0DmnUew$lambda$8(stateCollectIsPressedAsState)) {
                fM13666constructorimpl = SwitchTokens.INSTANCE.m10713getPressedHandleWidthD9Ej5fM();
            } else {
                fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(ThumbDiameter - f) * (C2046Dp.m13666constructorimpl(fMo7870toDpu2uoSUM - f2) / C2046Dp.m13666constructorimpl(f3 - f2))) + f);
            }
            composerStartRestartGroup.startReplaceableGroup(-993794132);
            if (SwitchImpl_0DmnUew$lambda$8(stateCollectIsPressedAsState)) {
                Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                if (!z) {
                    fM10719getTrackOutlineWidthD9Ej5fM = SwitchTokens.INSTANCE.m10719getTrackOutlineWidthD9Ej5fM();
                } else {
                    fM10719getTrackOutlineWidthD9Ej5fM = C2046Dp.m13666constructorimpl(ThumbPathLength - SwitchTokens.INSTANCE.m10719getTrackOutlineWidthD9Ej5fM());
                }
                fFloatValue = density.mo7874toPx0680j_4(fM10719getTrackOutlineWidthD9Ej5fM);
            } else {
                fFloatValue = state.getValue().floatValue();
            }
            composerStartRestartGroup.endReplaceableGroup();
            SwitchTokens switchTokens = SwitchTokens.INSTANCE;
            Shape value = ShapesKt.getValue(switchTokens.getTrackShape(), composerStartRestartGroup, 6);
            Modifier.Companion companion = Modifier.INSTANCE;
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Modifier modifierM7770backgroundbw27NRU = BackgroundKt.m7770backgroundbw27NRU(BorderKt.m7782borderxT4_qwU(SizeKt.m8158height3ABfNKs(SizeKt.m8177width3ABfNKs(boxScope.align(companion, companion2.getCenter()), SwitchWidth), SwitchHeight), switchTokens.m10719getTrackOutlineWidthD9Ej5fM(), switchColors.m9886borderColorWaAFU9c$material3_release(z2, z), value), jM9906trackColorWaAFU9c$material3_release, value);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion2.getTopStart(), false, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl, measurePolicyRememberBoxMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM10870constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM10870constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            long jM9905thumbColorWaAFU9c$material3_release = switchColors.m9905thumbColorWaAFU9c$material3_release(z2, z);
            Modifier modifierAlign = boxScopeInstance.align(companion, companion2.getCenterStart());
            composerStartRestartGroup.startReplaceableGroup(1420969929);
            boolean zChanged = composerStartRestartGroup.changed(fFloatValue);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<Density, IntOffset>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ IntOffset invoke(Density density2) {
                        return IntOffset.m13785boximpl(m9911invokeBjo55l4(density2));
                    }

                    /* renamed from: invoke-Bjo55l4, reason: not valid java name */
                    public final long m9911invokeBjo55l4(@NotNull Density density2) {
                        return IntOffsetKt.IntOffset(MathKt__MathJVMKt.roundToInt(fFloatValue), 0);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM7770backgroundbw27NRU2 = BackgroundKt.m7770backgroundbw27NRU(SizeKt.m8164requiredSize3ABfNKs(IndicationKt.indication(OffsetKt.offset(modifierAlign, (Function1) objRememberedValue), interactionSource, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(switchTokens.m10717getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), fM13666constructorimpl), jM9905thumbColorWaAFU9c$material3_release, shape);
            Alignment center = companion2.getCenter();
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyRememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(center, false, composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf2 = LayoutKt.modifierMaterializerOf(modifierM7770backgroundbw27NRU2);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM10870constructorimpl2 = Updater.m10870constructorimpl(composerStartRestartGroup);
            Updater.m10877setimpl(composerM10870constructorimpl2, measurePolicyRememberBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m10877setimpl(composerM10870constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM10870constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM10870constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM10870constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM10870constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            function3ModifierMaterializerOf2.invoke(SkippableUpdater.m10861boximpl(SkippableUpdater.m10862constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            composerStartRestartGroup.startReplaceableGroup(1420970455);
            if (function2 != null) {
                CompositionLocalKt.CompositionLocalProvider(ContentColorKt.getLocalContentColor().provides(Color.m11330boximpl(switchColors.m9904iconColorWaAFU9c$material3_release(z2, z))), function2, composerStartRestartGroup, ProvidedValue.$stable | ((i5 >> 12) & 112));
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SwitchKt$SwitchImpl$2
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

                public final void invoke(@Nullable Composer composer2, int i6) {
                    SwitchKt.m9909SwitchImpl0DmnUew(boxScope, z, z2, switchColors, state, function2, interactionSource, shape, f, f2, f3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2));
                }
            });
        }
    }

    static {
        SwitchTokens switchTokens = SwitchTokens.INSTANCE;
        float fM10715getSelectedHandleWidthD9Ej5fM = switchTokens.m10715getSelectedHandleWidthD9Ej5fM();
        ThumbDiameter = fM10715getSelectedHandleWidthD9Ej5fM;
        UncheckedThumbDiameter = switchTokens.m10722getUnselectedHandleWidthD9Ej5fM();
        float fM10720getTrackWidthD9Ej5fM = switchTokens.m10720getTrackWidthD9Ej5fM();
        SwitchWidth = fM10720getTrackWidthD9Ej5fM;
        float fM10718getTrackHeightD9Ej5fM = switchTokens.m10718getTrackHeightD9Ej5fM();
        SwitchHeight = fM10718getTrackHeightD9Ej5fM;
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(fM10718getTrackHeightD9Ej5fM - fM10715getSelectedHandleWidthD9Ej5fM) / 2);
        ThumbPadding = fM13666constructorimpl;
        ThumbPathLength = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(fM10720getTrackWidthD9Ej5fM - fM10715getSelectedHandleWidthD9Ej5fM) - fM13666constructorimpl);
        AnimationSpec = new TweenSpec<>(100, 0, null, 6, null);
    }

    public static final float getThumbDiameter() {
        return ThumbDiameter;
    }

    public static final float getUncheckedThumbDiameter() {
        return UncheckedThumbDiameter;
    }

    private static final boolean SwitchImpl_0DmnUew$lambda$8(State<Boolean> state) {
        return state.getValue().booleanValue();
    }
}
