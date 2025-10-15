package com.blackhub.bronline.game.p019ui.widget.scroll;

import androidx.compose.p003ui.graphics.Brush;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Carousel.kt */
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/widget/scroll/CarouselColors;", "", "backgroundBrush", "Landroidx/compose/ui/graphics/Brush;", "isScrollInProgress", "", "thumbBrush", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface CarouselColors {
    @NotNull
    Brush backgroundBrush(boolean isScrollInProgress);

    @NotNull
    Brush thumbBrush(boolean isScrollInProgress);
}
