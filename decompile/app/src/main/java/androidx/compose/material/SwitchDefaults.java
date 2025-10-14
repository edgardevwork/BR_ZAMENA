package androidx.compose.material;

import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Switch.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002Jv\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u0006H\u0007ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0013"}, m7105d2 = {"Landroidx/compose/material/SwitchDefaults;", "", "()V", "colors", "Landroidx/compose/material/SwitchColors;", "checkedThumbColor", "Landroidx/compose/ui/graphics/Color;", "checkedTrackColor", "checkedTrackAlpha", "", "uncheckedThumbColor", "uncheckedTrackColor", "uncheckedTrackAlpha", "disabledCheckedThumbColor", "disabledCheckedTrackColor", "disabledUncheckedThumbColor", "disabledUncheckedTrackColor", "colors-SQMK_m0", "(JJFJJFJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material/SwitchColors;", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class SwitchDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SwitchDefaults INSTANCE = new SwitchDefaults();

    private SwitchDefaults() {
    }

    @Composable
    @NotNull
    /* renamed from: colors-SQMK_m0, reason: not valid java name */
    public final SwitchColors m9037colorsSQMK_m0(long j, long j2, float f, long j3, long j4, float f2, long j5, long j6, long j7, long j8, @Nullable Composer composer, int i, int i2, int i3) {
        float f3;
        long jM11385compositeOverOWjLjI;
        long j9;
        long jM11385compositeOverOWjLjI2;
        long j10;
        int i4;
        long jM11385compositeOverOWjLjI3;
        composer.startReplaceableGroup(-1032127534);
        long jM8849getSecondaryVariant0d7_KjU = (i3 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8849getSecondaryVariant0d7_KjU() : j;
        long j11 = (i3 & 2) != 0 ? jM8849getSecondaryVariant0d7_KjU : j2;
        float f4 = (i3 & 4) != 0 ? 0.54f : f;
        long jM8850getSurface0d7_KjU = (i3 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU() : j3;
        long jM8845getOnSurface0d7_KjU = (i3 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU() : j4;
        float f5 = (i3 & 32) != 0 ? 0.38f : f2;
        if ((i3 & 64) != 0) {
            f3 = f4;
            jM11385compositeOverOWjLjI = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(jM8849getSecondaryVariant0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU());
        } else {
            f3 = f4;
            jM11385compositeOverOWjLjI = j5;
        }
        if ((i3 & 128) != 0) {
            j9 = jM8849getSecondaryVariant0d7_KjU;
            jM11385compositeOverOWjLjI2 = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(j11, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU());
        } else {
            j9 = jM8849getSecondaryVariant0d7_KjU;
            jM11385compositeOverOWjLjI2 = j6;
        }
        if ((i3 & 256) != 0) {
            i4 = 6;
            j10 = jM11385compositeOverOWjLjI;
            jM11385compositeOverOWjLjI3 = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(jM8850getSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU());
        } else {
            j10 = jM11385compositeOverOWjLjI;
            i4 = 6;
            jM11385compositeOverOWjLjI3 = j7;
        }
        long jM11385compositeOverOWjLjI4 = (i3 & 512) != 0 ? ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(jM8845getOnSurface0d7_KjU, ContentAlpha.INSTANCE.getDisabled(composer, i4), 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU()) : j8;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1032127534, i, i2, "androidx.compose.material.SwitchDefaults.colors (Switch.kt:340)");
        }
        DefaultSwitchColors defaultSwitchColors = new DefaultSwitchColors(j9, Color.m11339copywmQWz5c$default(j11, f3, 0.0f, 0.0f, 0.0f, 14, null), jM8850getSurface0d7_KjU, Color.m11339copywmQWz5c$default(jM8845getOnSurface0d7_KjU, f5, 0.0f, 0.0f, 0.0f, 14, null), j10, Color.m11339copywmQWz5c$default(jM11385compositeOverOWjLjI2, f3, 0.0f, 0.0f, 0.0f, 14, null), jM11385compositeOverOWjLjI3, Color.m11339copywmQWz5c$default(jM11385compositeOverOWjLjI4, f5, 0.0f, 0.0f, 0.0f, 14, null), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultSwitchColors;
    }
}
