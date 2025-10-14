package androidx.compose.p003ui.graphics;

import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.util.MathHelpersKt;
import androidx.compose.runtime.Stable;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: Shadow.kt */
@Metadata(m7104d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m7105d2 = {"lerp", "Landroidx/compose/ui/graphics/Shadow;", TtmlNode.START, "stop", "fraction", "", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class ShadowKt {
    @Stable
    @NotNull
    public static final Shadow lerp(@NotNull Shadow shadow, @NotNull Shadow shadow2, float f) {
        return new Shadow(ColorKt.m11391lerpjxsXWHM(shadow.getColor(), shadow2.getColor(), f), OffsetKt.m11122lerpWko1d7g(shadow.getOffset(), shadow2.getOffset(), f), MathHelpersKt.lerp(shadow.getBlurRadius(), shadow2.getBlurRadius(), f), null);
    }
}
