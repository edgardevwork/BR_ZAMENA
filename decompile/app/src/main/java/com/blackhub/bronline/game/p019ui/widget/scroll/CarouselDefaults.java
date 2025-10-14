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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J1\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\fJ:\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselDefaults;", "", "()V", "BgAlpha", "", "colors", "Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselColors;", "thumbBrush", "Landroidx/compose/ui/graphics/Brush;", "scrollingThumbBrush", "backgroundBrush", "scrollingBackgroundBrush", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/runtime/Composer;II)Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselColors;", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "scrollingThumbColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "scrollingBackgroundColor", "colors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselColors;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
