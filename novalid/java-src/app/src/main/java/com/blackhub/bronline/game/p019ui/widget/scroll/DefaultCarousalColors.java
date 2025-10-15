package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Carousel.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/widget/scroll/DefaultCarousalColors;", "Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselColors;", "thumbBrush", "Landroidx/compose/ui/graphics/Brush;", "scrollingThumbBrush", "backgroundBrush", "scrollingBackgroundBrush", "(Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;Landroidx/compose/ui/graphics/Brush;)V", "isScrollInProgress", "", "equals", "other", "", "hashCode", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
