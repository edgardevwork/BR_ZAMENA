package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.material3.ColorSchemeKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.SolidColor;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Carousel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final class CarouselDefaults {
    public static final int $stable = 0;
    public static final float BgAlpha = 0.25f;

    @NotNull
    public static final CarouselDefaults INSTANCE = new CarouselDefaults();

    @Composable
    @NotNull
    public final CarouselColors colors(@NotNull Brush thumbBrush, @Nullable Brush brush, @NotNull Brush backgroundBrush, @Nullable Brush brush2, @Nullable Composer composer, int i, int i2) {
        Intrinsics.checkNotNullParameter(thumbBrush, "thumbBrush");
        Intrinsics.checkNotNullParameter(backgroundBrush, "backgroundBrush");
        composer.startReplaceableGroup(1759234069);
        if ((i2 & 2) != 0) {
            brush = thumbBrush;
        }
        if ((i2 & 8) != 0) {
            brush2 = backgroundBrush;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1759234069, i, -1, "com.blackhub.bronline.game.ui.widget.scroll.CarouselDefaults.colors (Carousel.kt:412)");
        }
        DefaultCarousalColors defaultCarousalColors = new DefaultCarousalColors(thumbBrush, brush, backgroundBrush, brush2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCarousalColors;
    }

    @Composable
    @NotNull
    /* renamed from: colors-ro_MJ88, reason: not valid java name */
    public final CarouselColors m15105colorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(630929265);
        long secondary = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary() : j;
        long j5 = (i2 & 2) != 0 ? secondary : j2;
        long jM11339copywmQWz5c$default = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(ColorSchemeKt.m9292contentColorForek8zF_U(secondary, composer, i & 14), 0.25f, 0.0f, 0.0f, 0.0f, 14, null) : j3;
        long j6 = (i2 & 8) != 0 ? jM11339copywmQWz5c$default : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(630929265, i, -1, "com.blackhub.bronline.game.ui.widget.scroll.CarouselDefaults.colors (Carousel.kt:425)");
        }
        DefaultCarousalColors defaultCarousalColors = new DefaultCarousalColors(new SolidColor(secondary, null), new SolidColor(j5, null), new SolidColor(jM11339copywmQWz5c$default, null), new SolidColor(j6, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCarousalColors;
    }
}

