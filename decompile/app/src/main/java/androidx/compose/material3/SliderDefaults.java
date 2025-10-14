package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.ShadowKt;
import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.PointMode;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.graphics.StrokeCap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.compress.archivers.cpio.CpioConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Slider.kt */
@Stable
@Metadata(m7104d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JB\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J3\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0018J3\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u001bJ3\u0010\u0015\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u001eJ\r\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0002\u0010\u001fJv\u0010\u000e\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020!2\b\b\u0002\u0010#\u001a\u00020!2\b\b\u0002\u0010$\u001a\u00020!2\b\b\u0002\u0010%\u001a\u00020!2\b\b\u0002\u0010&\u001a\u00020!2\b\b\u0002\u0010'\u001a\u00020!2\b\b\u0002\u0010(\u001a\u00020!2\b\b\u0002\u0010)\u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020!H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010,JN\u0010-\u001a\u00020\t*\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u0002022\u0006\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010%\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0002ø\u0001\u0000¢\u0006\u0004\b4\u00105R\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00066"}, m7105d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "defaultSliderColors", "Landroidx/compose/material3/SliderColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultSliderColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/SliderColors;", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "rangeSliderState", "Landroidx/compose/material3/RangeSliderState;", "(Landroidx/compose/material3/RangeSliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "sliderState", "Landroidx/compose/material3/SliderState;", "(Landroidx/compose/material3/SliderState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/SliderColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "drawTrack", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "tickFractions", "", "activeRangeStart", "", "activeRangeEnd", "drawTrack-LUBghH0", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;[FFFJJJJ)V", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,2151:1\n1116#2,6:2152\n1116#2,6:2158\n1116#2,6:2166\n1116#2,6:2172\n1116#2,6:2178\n75#3:2164\n154#4:2165\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n*L\n988#1:2152,6\n989#1:2158,6\n1055#1:2166,6\n1133#1:2172,6\n1173#1:2178,6\n1017#1:2164\n1021#1:2165\n*E\n"})
/* loaded from: classes2.dex */
public final class SliderDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    private SliderDefaults() {
    }

    @Composable
    @NotNull
    public final SliderColors colors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1376295968);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1376295968, i, -1, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:886)");
        }
        SliderColors defaultSliderColors$material3_release = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSliderColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m9768colorsq0g_0yA(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, @Nullable Composer composer, int i, int i2, int i3) {
        composer.startReplaceableGroup(885588574);
        long jM11376getUnspecified0d7_KjU = (i3 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i3 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i3 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i3 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i3 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        long jM11376getUnspecified0d7_KjU6 = (i3 & 32) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j6;
        long jM11376getUnspecified0d7_KjU7 = (i3 & 64) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j7;
        long jM11376getUnspecified0d7_KjU8 = (i3 & 128) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j8;
        long jM11376getUnspecified0d7_KjU9 = (i3 & 256) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j9;
        long jM11376getUnspecified0d7_KjU10 = (i3 & 512) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i, i2, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:927)");
        }
        SliderColors sliderColorsM9751copyK518z4 = getDefaultSliderColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9751copyK518z4(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5, jM11376getUnspecified0d7_KjU6, jM11376getUnspecified0d7_KjU7, jM11376getUnspecified0d7_KjU8, jM11376getUnspecified0d7_KjU9, jM11376getUnspecified0d7_KjU10);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderColorsM9751copyK518z4;
    }

    @NotNull
    public final SliderColors getDefaultSliderColors$material3_release(@NotNull ColorScheme colorScheme) {
        SliderColors defaultSliderColorsCached = colorScheme.getDefaultSliderColorsCached();
        if (defaultSliderColorsCached != null) {
            return defaultSliderColorsCached;
        }
        SliderTokens sliderTokens = SliderTokens.INSTANCE;
        SliderColors sliderColors = new SliderColors(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getHandleColor()), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getActiveTrackColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getTickMarksActiveContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorSchemeKt.fromToken(colorScheme, sliderTokens.getInactiveTrackColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getTickMarksInactiveContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledHandleColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), colorScheme.getSurface()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledActiveTrackColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getTickMarksDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getDisabledInactiveTrackColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, sliderTokens.getTickMarksDisabledContainerColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultSliderColorsCached$material3_release(sliderColors);
        return sliderColors;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013a  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Thumb-9LiSoMs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9767Thumb9LiSoMs(@NotNull final MutableInteractionSource mutableInteractionSource, @Nullable Modifier modifier, @Nullable SliderColors sliderColors, boolean z, long j, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        int i5;
        long j2;
        long j3;
        int i6;
        boolean z3;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotStateList snapshotStateList;
        boolean z4;
        Object objRememberedValue2;
        final boolean z5;
        final Modifier modifier3;
        final SliderColors sliderColors3;
        final long j4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-290277409);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(mutableInteractionSource) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i8 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i8;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & CpioConstants.C_ISBLK) == 0) {
                        j2 = j;
                        i3 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= ProfileVerifier.CompilationStatus.f342xf2722a21;
                    } else if ((i & ProfileVerifier.CompilationStatus.f342xf2722a21) == 0) {
                        i3 |= composerStartRestartGroup.changed(this) ? 131072 : 65536;
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 4) != 0) {
                                i3 &= -897;
                            }
                        } else {
                            if (i7 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if ((i2 & 4) != 0) {
                                SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 15) & 14);
                                i3 &= -897;
                                sliderColors2 = sliderColorsColors;
                            }
                            if (i4 != 0) {
                                z2 = true;
                            }
                            if (i5 == 0) {
                                j3 = SliderKt.ThumbSize;
                                i6 = i3;
                                z3 = z2;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-290277409, i6, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:986)");
                            }
                            composerStartRestartGroup.startReplaceableGroup(-1142853013);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotStateList = (SnapshotStateList) objRememberedValue;
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-1142852924);
                            int i9 = i6 & 14;
                            z4 = i9 == 4;
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (z4 || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i9);
                            float fM13666constructorimpl = !(snapshotStateList.isEmpty() ^ true) ? SliderKt.ThumbPressedElevation : SliderKt.ThumbDefaultElevation;
                            SliderTokens sliderTokens = SliderTokens.INSTANCE;
                            Shape value = ShapesKt.getValue(sliderTokens.getHandleShape(), composerStartRestartGroup, 6);
                            long j5 = j3;
                            Modifier modifierHoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m8173size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(sliderTokens.m10693getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                            if (!z3) {
                                fM13666constructorimpl = C2046Dp.m13666constructorimpl(0);
                            }
                            SpacerKt.Spacer(BackgroundKt.m7770backgroundbw27NRU(ShadowKt.m11012shadows4CzXII$default(modifierHoverable$default, fM13666constructorimpl, value, false, 0L, 0L, 24, null), sliderColors2.m9762thumbColorvNxB06k$material3_release(z3), value), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z5 = z3;
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            j4 = j5;
                        }
                        i6 = i3;
                        z3 = z2;
                        j3 = j2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1142853013);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1142852924);
                        int i92 = i6 & 14;
                        if (i92 == 4) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                            objRememberedValue2 = new SliderDefaults$Thumb$1$1(mutableInteractionSource, snapshotStateList, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.LaunchedEffect(mutableInteractionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i92);
                            if (!(snapshotStateList.isEmpty() ^ true)) {
                            }
                            SliderTokens sliderTokens2 = SliderTokens.INSTANCE;
                            Shape value2 = ShapesKt.getValue(sliderTokens2.getHandleShape(), composerStartRestartGroup, 6);
                            long j52 = j3;
                            Modifier modifierHoverable$default2 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m8173size6HolHcs(modifier2, j3), mutableInteractionSource, RippleKt.m9113rememberRipple9IZ8Weo(false, C2046Dp.m13666constructorimpl(sliderTokens2.m10693getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), mutableInteractionSource, false, 2, null);
                            if (!z3) {
                            }
                            SpacerKt.Spacer(BackgroundKt.m7770backgroundbw27NRU(ShadowKt.m11012shadows4CzXII$default(modifierHoverable$default2, fM13666constructorimpl, value2, false, 0L, 0L, 24, null), sliderColors2.m9762thumbColorvNxB06k$material3_release(z3), value2), composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z5 = z3;
                            modifier3 = modifier2;
                            sliderColors3 = sliderColors2;
                            j4 = j52;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        sliderColors3 = sliderColors2;
                        z5 = z2;
                        j4 = j2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Thumb$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(2);
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(@Nullable Composer composer2, int i10) {
                                this.$tmp2_rcvr.m9767Thumb9LiSoMs(mutableInteractionSource, modifier3, sliderColors3, z5, j4, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= CpioConstants.C_ISBLK;
                j2 = j;
                if ((i2 & 32) == 0) {
                }
                if ((i3 & 74899) == 74898) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                        if (i7 != 0) {
                        }
                        if ((i2 & 4) != 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                            i6 = i3;
                            z3 = z2;
                            j3 = j2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceableGroup(-1142853013);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotStateList = (SnapshotStateList) objRememberedValue;
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1142852924);
                        int i922 = i6 & 14;
                        if (i922 == 4) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z4) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            j2 = j;
            if ((i2 & 32) == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        j2 = j;
        if ((i2 & 32) == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0180  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Use version that supports slider state")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(@NotNull final SliderPositions sliderPositions, @Nullable Modifier modifier, @Nullable SliderColors sliderColors, boolean z, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        final long jM9764trackColorWaAFU9c$material3_release;
        final long jM9764trackColorWaAFU9c$material3_release2;
        final long jM9763tickColorWaAFU9c$material3_release;
        final long jM9763tickColorWaAFU9c$material3_release2;
        Composer composer2;
        boolean zChanged;
        Object objRememberedValue;
        final SliderColors sliderColors3;
        final Modifier modifier4;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1546713545);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sliderPositions) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i6 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & CpioConstants.C_ISBLK) == 0) {
                    i3 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors;
                        }
                        if (i4 == 0) {
                            z3 = true;
                        }
                        SliderColors sliderColors4 = sliderColors2;
                        int i7 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1546713545, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1045)");
                        }
                        jM9764trackColorWaAFU9c$material3_release = sliderColors4.m9764trackColorWaAFU9c$material3_release(z3, false);
                        jM9764trackColorWaAFU9c$material3_release2 = sliderColors4.m9764trackColorWaAFU9c$material3_release(z3, true);
                        jM9763tickColorWaAFU9c$material3_release = sliderColors4.m9763tickColorWaAFU9c$material3_release(z3, false);
                        jM9763tickColorWaAFU9c$material3_release2 = sliderColors4.m9763tickColorWaAFU9c$material3_release(z3, true);
                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1134219991);
                        zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i7 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull DrawScope drawScope) {
                                    boolean z5 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                    long jOffset = OffsetKt.Offset(0.0f, Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0()));
                                    long jOffset2 = OffsetKt.Offset(Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc()), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0()));
                                    long j = z5 ? jOffset2 : jOffset;
                                    long j2 = z5 ? jOffset : jOffset2;
                                    float fMo7874toPx0680j_4 = drawScope.mo7874toPx0680j_4(SliderKt.TickSize);
                                    float fMo7874toPx0680j_42 = drawScope.mo7874toPx0680j_4(SliderKt.getTrackHeight());
                                    long j3 = jM9764trackColorWaAFU9c$material3_release;
                                    StrokeCap.Companion companion = StrokeCap.INSTANCE;
                                    long j4 = j2;
                                    long j5 = j;
                                    DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j3, j, j2, fMo7874toPx0680j_42, companion.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    DrawScope.m11876drawLineNGM6Ib0$default(drawScope, jM9764trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m11099getXimpl(j5) + ((Offset.m11099getXimpl(j4) - Offset.m11099getXimpl(j5)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0())), OffsetKt.Offset(Offset.m11099getXimpl(j5) + ((Offset.m11099getXimpl(j4) - Offset.m11099getXimpl(j5)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0())), fMo7874toPx0680j_42, companion.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    float[] tickFractions = sliderPositions.getTickFractions();
                                    SliderPositions sliderPositions2 = sliderPositions;
                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                    int length = tickFractions.length;
                                    for (int i8 = 0; i8 < length; i8++) {
                                        float f = tickFractions[i8];
                                        Boolean boolValueOf = Boolean.valueOf(f > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f < sliderPositions2.getActiveRange().getStart().floatValue());
                                        Object arrayList = linkedHashMap.get(boolValueOf);
                                        if (arrayList == null) {
                                            arrayList = new ArrayList();
                                            linkedHashMap.put(boolValueOf, arrayList);
                                        }
                                        ((List) arrayList).add(Float.valueOf(f));
                                    }
                                    long j6 = jM9763tickColorWaAFU9c$material3_release;
                                    long j7 = jM9763tickColorWaAFU9c$material3_release2;
                                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                                        boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                        List list = (List) entry.getValue();
                                        ArrayList arrayList2 = new ArrayList(list.size());
                                        int size = list.size();
                                        for (int i9 = 0; i9 < size; i9++) {
                                            arrayList2.add(Offset.m11088boximpl(OffsetKt.Offset(Offset.m11099getXimpl(OffsetKt.m11122lerpWko1d7g(j5, j4, ((Number) list.get(i9)).floatValue())), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0()))));
                                        }
                                        long j8 = j5;
                                        long j9 = j4;
                                        DrawScope.m11881drawPointsF8ZwMP8$default(drawScope, arrayList2, PointMode.INSTANCE.m11645getPointsr_lszbg(), zBooleanValue ? j6 : j7, fMo7874toPx0680j_4, StrokeCap.INSTANCE.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                        j7 = j7;
                                        j4 = j9;
                                        j5 = j8;
                                    }
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8158height3ABfNKs, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        sliderColors3 = sliderColors4;
                        modifier4 = modifier3;
                        z4 = z3;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                    z3 = z2;
                    SliderColors sliderColors42 = sliderColors2;
                    int i72 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    jM9764trackColorWaAFU9c$material3_release = sliderColors42.m9764trackColorWaAFU9c$material3_release(z3, false);
                    jM9764trackColorWaAFU9c$material3_release2 = sliderColors42.m9764trackColorWaAFU9c$material3_release(z3, true);
                    jM9763tickColorWaAFU9c$material3_release = sliderColors42.m9763tickColorWaAFU9c$material3_release(z3, false);
                    jM9763tickColorWaAFU9c$material3_release2 = sliderColors42.m9763tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134219991);
                    zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i72 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                        objRememberedValue = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope drawScope) {
                                boolean z5 = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
                                long jOffset = OffsetKt.Offset(0.0f, Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0()));
                                long jOffset2 = OffsetKt.Offset(Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc()), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0()));
                                long j = z5 ? jOffset2 : jOffset;
                                long j2 = z5 ? jOffset : jOffset2;
                                float fMo7874toPx0680j_4 = drawScope.mo7874toPx0680j_4(SliderKt.TickSize);
                                float fMo7874toPx0680j_42 = drawScope.mo7874toPx0680j_4(SliderKt.getTrackHeight());
                                long j3 = jM9764trackColorWaAFU9c$material3_release;
                                StrokeCap.Companion companion = StrokeCap.INSTANCE;
                                long j4 = j2;
                                long j5 = j;
                                DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j3, j, j2, fMo7874toPx0680j_42, companion.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                DrawScope.m11876drawLineNGM6Ib0$default(drawScope, jM9764trackColorWaAFU9c$material3_release2, OffsetKt.Offset(Offset.m11099getXimpl(j5) + ((Offset.m11099getXimpl(j4) - Offset.m11099getXimpl(j5)) * sliderPositions.getActiveRange().getStart().floatValue()), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0())), OffsetKt.Offset(Offset.m11099getXimpl(j5) + ((Offset.m11099getXimpl(j4) - Offset.m11099getXimpl(j5)) * sliderPositions.getActiveRange().getEndInclusive().floatValue()), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0())), fMo7874toPx0680j_42, companion.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                float[] tickFractions = sliderPositions.getTickFractions();
                                SliderPositions sliderPositions2 = sliderPositions;
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                int length = tickFractions.length;
                                for (int i8 = 0; i8 < length; i8++) {
                                    float f = tickFractions[i8];
                                    Boolean boolValueOf = Boolean.valueOf(f > sliderPositions2.getActiveRange().getEndInclusive().floatValue() || f < sliderPositions2.getActiveRange().getStart().floatValue());
                                    Object arrayList = linkedHashMap.get(boolValueOf);
                                    if (arrayList == null) {
                                        arrayList = new ArrayList();
                                        linkedHashMap.put(boolValueOf, arrayList);
                                    }
                                    ((List) arrayList).add(Float.valueOf(f));
                                }
                                long j6 = jM9763tickColorWaAFU9c$material3_release;
                                long j7 = jM9763tickColorWaAFU9c$material3_release2;
                                for (Map.Entry entry : linkedHashMap.entrySet()) {
                                    boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                                    List list = (List) entry.getValue();
                                    ArrayList arrayList2 = new ArrayList(list.size());
                                    int size = list.size();
                                    for (int i9 = 0; i9 < size; i9++) {
                                        arrayList2.add(Offset.m11088boximpl(OffsetKt.Offset(Offset.m11099getXimpl(OffsetKt.m11122lerpWko1d7g(j5, j4, ((Number) list.get(i9)).floatValue())), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0()))));
                                    }
                                    long j8 = j5;
                                    long j9 = j4;
                                    DrawScope.m11881drawPointsF8ZwMP8$default(drawScope, arrayList2, PointMode.INSTANCE.m11645getPointsr_lszbg(), zBooleanValue ? j6 : j7, fMo7874toPx0680j_4, StrokeCap.INSTANCE.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                                    j7 = j7;
                                    j4 = j9;
                                    j5 = j8;
                                }
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8158height3ABfNKs2, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        sliderColors3 = sliderColors42;
                        modifier4 = modifier3;
                        z4 = z3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    sliderColors3 = sliderColors2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i8) {
                            SliderDefaults.this.Track(sliderPositions, modifier4, sliderColors3, z4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 == 0) {
                        z3 = z2;
                    }
                    SliderColors sliderColors422 = sliderColors2;
                    int i722 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    jM9764trackColorWaAFU9c$material3_release = sliderColors422.m9764trackColorWaAFU9c$material3_release(z3, false);
                    jM9764trackColorWaAFU9c$material3_release2 = sliderColors422.m9764trackColorWaAFU9c$material3_release(z3, true);
                    jM9763tickColorWaAFU9c$material3_release = sliderColors422.m9763tickColorWaAFU9c$material3_release(z3, false);
                    jM9763tickColorWaAFU9c$material3_release2 = sliderColors422.m9763tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM8158height3ABfNKs22 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134219991);
                    zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i722 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017a  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterial3Api
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(@NotNull final SliderState sliderState, @Nullable Modifier modifier, @Nullable SliderColors sliderColors, boolean z, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        final long jM9764trackColorWaAFU9c$material3_release;
        final long jM9764trackColorWaAFU9c$material3_release2;
        final long jM9763tickColorWaAFU9c$material3_release;
        final long jM9763tickColorWaAFU9c$material3_release2;
        Composer composer2;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier4;
        final boolean z4;
        final SliderColors sliderColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(593554206);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(sliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i6 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & CpioConstants.C_ISBLK) == 0) {
                    i3 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors;
                        }
                        if (i4 == 0) {
                            z3 = true;
                        }
                        SliderColors sliderColors4 = sliderColors2;
                        int i7 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(593554206, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1123)");
                        }
                        jM9764trackColorWaAFU9c$material3_release = sliderColors4.m9764trackColorWaAFU9c$material3_release(z3, false);
                        jM9764trackColorWaAFU9c$material3_release2 = sliderColors4.m9764trackColorWaAFU9c$material3_release(z3, true);
                        jM9763tickColorWaAFU9c$material3_release = sliderColors4.m9763tickColorWaAFU9c$material3_release(z3, false);
                        jM9763tickColorWaAFU9c$material3_release2 = sliderColors4.m9763tickColorWaAFU9c$material3_release(z3, true);
                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1134216901);
                        Modifier modifier5 = modifier3;
                        zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i7 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull DrawScope drawScope) {
                                    SliderDefaults.INSTANCE.m9766drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM9764trackColorWaAFU9c$material3_release, jM9764trackColorWaAFU9c$material3_release2, jM9763tickColorWaAFU9c$material3_release, jM9763tickColorWaAFU9c$material3_release2);
                                }
                            };
                            composer2.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8158height3ABfNKs, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier5;
                        z4 = z3;
                        sliderColors3 = sliderColors4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                    z3 = z2;
                    SliderColors sliderColors42 = sliderColors2;
                    int i72 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    jM9764trackColorWaAFU9c$material3_release = sliderColors42.m9764trackColorWaAFU9c$material3_release(z3, false);
                    jM9764trackColorWaAFU9c$material3_release2 = sliderColors42.m9764trackColorWaAFU9c$material3_release(z3, true);
                    jM9763tickColorWaAFU9c$material3_release = sliderColors42.m9763tickColorWaAFU9c$material3_release(z3, false);
                    jM9763tickColorWaAFU9c$material3_release2 = sliderColors42.m9763tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134216901);
                    Modifier modifier52 = modifier3;
                    zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i72 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                        Function1<DrawScope, Unit> function12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$3$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m9766drawTrackLUBghH0(drawScope, sliderState.getTickFractions(), 0.0f, sliderState.getCoercedValueAsFraction$material3_release(), jM9764trackColorWaAFU9c$material3_release, jM9764trackColorWaAFU9c$material3_release2, jM9763tickColorWaAFU9c$material3_release, jM9763tickColorWaAFU9c$material3_release2);
                            }
                        };
                        composer2.updateRememberedValue(function12);
                        objRememberedValue = function12;
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8158height3ABfNKs2, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier52;
                        z4 = z3;
                        sliderColors3 = sliderColors42;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    sliderColors3 = sliderColors2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i8) {
                            SliderDefaults.this.Track(sliderState, modifier4, sliderColors3, z4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 == 0) {
                        z3 = z2;
                    }
                    SliderColors sliderColors422 = sliderColors2;
                    int i722 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    jM9764trackColorWaAFU9c$material3_release = sliderColors422.m9764trackColorWaAFU9c$material3_release(z3, false);
                    jM9764trackColorWaAFU9c$material3_release2 = sliderColors422.m9764trackColorWaAFU9c$material3_release(z3, true);
                    jM9763tickColorWaAFU9c$material3_release = sliderColors422.m9763tickColorWaAFU9c$material3_release(z3, false);
                    jM9763tickColorWaAFU9c$material3_release2 = sliderColors422.m9763tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM8158height3ABfNKs22 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134216901);
                    Modifier modifier522 = modifier3;
                    zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i722 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017a  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Track(@NotNull final RangeSliderState rangeSliderState, @Nullable Modifier modifier, @Nullable SliderColors sliderColors, boolean z, @Nullable Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i4;
        boolean z2;
        Modifier modifier3;
        boolean z3;
        final long jM9764trackColorWaAFU9c$material3_release;
        final long jM9764trackColorWaAFU9c$material3_release2;
        final long jM9763tickColorWaAFU9c$material3_release;
        final long jM9763tickColorWaAFU9c$material3_release2;
        Composer composer2;
        boolean zChanged;
        Object objRememberedValue;
        final Modifier modifier4;
        final boolean z4;
        final SliderColors sliderColors3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1617869097);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(rangeSliderState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i6 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    sliderColors2 = sliderColors;
                }
                i3 |= i6;
            } else {
                sliderColors2 = sliderColors;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= CpioConstants.C_ISBLK;
                } else if ((i & CpioConstants.C_ISBLK) == 0) {
                    i3 |= composerStartRestartGroup.changed(this) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                        if ((i2 & 4) != 0) {
                            SliderColors sliderColorsColors = colors(composerStartRestartGroup, (i3 >> 12) & 14);
                            i3 &= -897;
                            sliderColors2 = sliderColorsColors;
                        }
                        if (i4 == 0) {
                            z3 = true;
                        }
                        SliderColors sliderColors4 = sliderColors2;
                        int i7 = i3;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1617869097, i7, -1, "androidx.compose.material3.SliderDefaults.Track (Slider.kt:1163)");
                        }
                        jM9764trackColorWaAFU9c$material3_release = sliderColors4.m9764trackColorWaAFU9c$material3_release(z3, false);
                        jM9764trackColorWaAFU9c$material3_release2 = sliderColors4.m9764trackColorWaAFU9c$material3_release(z3, true);
                        jM9763tickColorWaAFU9c$material3_release = sliderColors4.m9763tickColorWaAFU9c$material3_release(z3, false);
                        jM9763tickColorWaAFU9c$material3_release2 = sliderColors4.m9763tickColorWaAFU9c$material3_release(z3, true);
                        Modifier modifierM8158height3ABfNKs = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                        composer2 = composerStartRestartGroup;
                        composer2.startReplaceableGroup(-1134215342);
                        Modifier modifier5 = modifier3;
                        zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i7 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                        objRememberedValue = composer2.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            Function1<DrawScope, Unit> function1 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                    invoke2(drawScope);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull DrawScope drawScope) {
                                    SliderDefaults.INSTANCE.m9766drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM9764trackColorWaAFU9c$material3_release, jM9764trackColorWaAFU9c$material3_release2, jM9763tickColorWaAFU9c$material3_release, jM9763tickColorWaAFU9c$material3_release2);
                                }
                            };
                            composer2.updateRememberedValue(function1);
                            objRememberedValue = function1;
                        }
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8158height3ABfNKs, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier5;
                        z4 = z3;
                        sliderColors3 = sliderColors4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 4) != 0) {
                            i3 &= -897;
                        }
                        modifier3 = modifier2;
                    }
                    z3 = z2;
                    SliderColors sliderColors42 = sliderColors2;
                    int i72 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    jM9764trackColorWaAFU9c$material3_release = sliderColors42.m9764trackColorWaAFU9c$material3_release(z3, false);
                    jM9764trackColorWaAFU9c$material3_release2 = sliderColors42.m9764trackColorWaAFU9c$material3_release(z3, true);
                    jM9763tickColorWaAFU9c$material3_release = sliderColors42.m9763tickColorWaAFU9c$material3_release(z3, false);
                    jM9763tickColorWaAFU9c$material3_release2 = sliderColors42.m9763tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM8158height3ABfNKs2 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134215342);
                    Modifier modifier52 = modifier3;
                    zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i72 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                        Function1<DrawScope, Unit> function12 = new Function1<DrawScope, Unit>() { // from class: androidx.compose.material3.SliderDefaults$Track$5$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope drawScope) {
                                SliderDefaults.INSTANCE.m9766drawTrackLUBghH0(drawScope, rangeSliderState.getTickFractions(), rangeSliderState.getCoercedActiveRangeStartAsFraction$material3_release(), rangeSliderState.getCoercedActiveRangeEndAsFraction$material3_release(), jM9764trackColorWaAFU9c$material3_release, jM9764trackColorWaAFU9c$material3_release2, jM9763tickColorWaAFU9c$material3_release, jM9763tickColorWaAFU9c$material3_release2);
                            }
                        };
                        composer2.updateRememberedValue(function12);
                        objRememberedValue = function12;
                        composer2.endReplaceableGroup();
                        CanvasKt.Canvas(modifierM8158height3ABfNKs2, (Function1) objRememberedValue, composer2, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier4 = modifier52;
                        z4 = z3;
                        sliderColors3 = sliderColors42;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    sliderColors3 = sliderColors2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.material3.SliderDefaults.Track.6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable Composer composer3, int i8) {
                            SliderDefaults.this.Track(rangeSliderState, modifier4, sliderColors3, z4, composer3, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) != 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 == 0) {
                    }
                    if ((i2 & 4) != 0) {
                    }
                    if (i4 == 0) {
                        z3 = z2;
                    }
                    SliderColors sliderColors422 = sliderColors2;
                    int i722 = i3;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    jM9764trackColorWaAFU9c$material3_release = sliderColors422.m9764trackColorWaAFU9c$material3_release(z3, false);
                    jM9764trackColorWaAFU9c$material3_release2 = sliderColors422.m9764trackColorWaAFU9c$material3_release(z3, true);
                    jM9763tickColorWaAFU9c$material3_release = sliderColors422.m9763tickColorWaAFU9c$material3_release(z3, false);
                    jM9763tickColorWaAFU9c$material3_release2 = sliderColors422.m9763tickColorWaAFU9c$material3_release(z3, true);
                    Modifier modifierM8158height3ABfNKs22 = SizeKt.m8158height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), SliderKt.getTrackHeight());
                    composer2 = composerStartRestartGroup;
                    composer2.startReplaceableGroup(-1134215342);
                    Modifier modifier522 = modifier3;
                    zChanged = composer2.changed(jM9764trackColorWaAFU9c$material3_release) | ((i722 & 14) == 4) | composer2.changed(jM9764trackColorWaAFU9c$material3_release2) | composer2.changed(jM9763tickColorWaAFU9c$material3_release) | composer2.changed(jM9763tickColorWaAFU9c$material3_release2);
                    objRememberedValue = composer2.rememberedValue();
                    if (zChanged) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: drawTrack-LUBghH0, reason: not valid java name */
    public final void m9766drawTrackLUBghH0(DrawScope drawScope, float[] fArr, float f, float f2, long j, long j2, long j3, long j4) {
        long j5;
        long j6;
        boolean z = drawScope.getLayoutDirection() == LayoutDirection.Rtl;
        long jOffset = OffsetKt.Offset(0.0f, Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0()));
        long jOffset2 = OffsetKt.Offset(Size.m11168getWidthimpl(drawScope.mo11889getSizeNHjbRc()), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0()));
        long j7 = z ? jOffset2 : jOffset;
        long j8 = z ? jOffset : jOffset2;
        float fMo7874toPx0680j_4 = drawScope.mo7874toPx0680j_4(SliderKt.TickSize);
        float fMo7874toPx0680j_42 = drawScope.mo7874toPx0680j_4(SliderKt.getTrackHeight());
        StrokeCap.Companion companion = StrokeCap.INSTANCE;
        long j9 = j8;
        long j10 = j7;
        DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j, j7, j8, fMo7874toPx0680j_42, companion.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        DrawScope.m11876drawLineNGM6Ib0$default(drawScope, j2, OffsetKt.Offset(Offset.m11099getXimpl(j10) + ((Offset.m11099getXimpl(j9) - Offset.m11099getXimpl(j10)) * f), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0())), OffsetKt.Offset(Offset.m11099getXimpl(j10) + ((Offset.m11099getXimpl(j9) - Offset.m11099getXimpl(j10)) * f2), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0())), fMo7874toPx0680j_42, companion.m11693getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            float f3 = fArr[i];
            if (f3 > f2 || f3 < f) {
                j5 = j9;
                j6 = j3;
            } else {
                j5 = j9;
                j6 = j4;
            }
            long j11 = j10;
            DrawScope.m11871drawCircleVaOC9Bg$default(drawScope, j6, fMo7874toPx0680j_4 / 2.0f, OffsetKt.Offset(Offset.m11099getXimpl(OffsetKt.m11122lerpWko1d7g(j11, j5, f3)), Offset.m11100getYimpl(drawScope.mo11888getCenterF1C5BW0())), 0.0f, null, null, 0, 120, null);
            i++;
            j10 = j11;
            j9 = j5;
        }
    }
}
