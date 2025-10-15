package androidx.compose.p003ui.graphics;

import android.graphics.RenderEffect;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidRenderEffect.android.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m7105d2 = {"asComposeRenderEffect", "Landroidx/compose/ui/graphics/RenderEffect;", "Landroid/graphics/RenderEffect;", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class AndroidRenderEffect_androidKt {
    @NotNull
    public static final RenderEffect asComposeRenderEffect(@NotNull RenderEffect renderEffect) {
        return new AndroidRenderEffect(renderEffect);
    }
}
