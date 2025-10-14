package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Carousel.kt */
@Immutable
/* loaded from: classes4.dex */
public final class DefaultCarousalColors implements CarouselColors {

    @NotNull
    public final Brush backgroundBrush;

    @NotNull
    public final Brush scrollingBackgroundBrush;

    @NotNull
    public final Brush scrollingThumbBrush;

    @NotNull
    public final Brush thumbBrush;

    public DefaultCarousalColors(@NotNull Brush thumbBrush, @NotNull Brush scrollingThumbBrush, @NotNull Brush backgroundBrush, @NotNull Brush scrollingBackgroundBrush) {
        Intrinsics.checkNotNullParameter(thumbBrush, "thumbBrush");
        Intrinsics.checkNotNullParameter(scrollingThumbBrush, "scrollingThumbBrush");
        Intrinsics.checkNotNullParameter(backgroundBrush, "backgroundBrush");
        Intrinsics.checkNotNullParameter(scrollingBackgroundBrush, "scrollingBackgroundBrush");
        this.thumbBrush = thumbBrush;
        this.scrollingThumbBrush = scrollingThumbBrush;
        this.backgroundBrush = backgroundBrush;
        this.scrollingBackgroundBrush = scrollingBackgroundBrush;
    }

    @Override // com.blackhub.bronline.game.p019ui.widget.scroll.CarouselColors
    @NotNull
    public Brush thumbBrush(boolean isScrollInProgress) {
        return isScrollInProgress ? this.thumbBrush : this.scrollingThumbBrush;
    }

    @Override // com.blackhub.bronline.game.p019ui.widget.scroll.CarouselColors
    @NotNull
    public Brush backgroundBrush(boolean isScrollInProgress) {
        return isScrollInProgress ? this.backgroundBrush : this.scrollingBackgroundBrush;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DefaultCarousalColors.class != other.getClass()) {
            return false;
        }
        DefaultCarousalColors defaultCarousalColors = (DefaultCarousalColors) other;
        return Intrinsics.areEqual(this.thumbBrush, defaultCarousalColors.thumbBrush) && Intrinsics.areEqual(this.scrollingThumbBrush, defaultCarousalColors.scrollingThumbBrush) && Intrinsics.areEqual(this.backgroundBrush, defaultCarousalColors.backgroundBrush) && Intrinsics.areEqual(this.scrollingBackgroundBrush, defaultCarousalColors.scrollingBackgroundBrush);
    }

    public int hashCode() {
        return (((((this.thumbBrush.hashCode() * 31) + this.scrollingThumbBrush.hashCode()) * 31) + this.backgroundBrush.hashCode()) * 31) + this.scrollingBackgroundBrush.hashCode();
    }
}

