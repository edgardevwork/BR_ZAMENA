package androidx.compose.foundation.text.selection;

import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.drawscope.CanvasDrawScope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AndroidSelectionHandles.android.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m7105d2 = {"Landroidx/compose/foundation/text/selection/HandleImageCache;", "", "()V", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "getCanvas", "()Landroidx/compose/ui/graphics/Canvas;", "setCanvas", "(Landroidx/compose/ui/graphics/Canvas;)V", "canvasDrawScope", "Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "getCanvasDrawScope", "()Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;", "setCanvasDrawScope", "(Landroidx/compose/ui/graphics/drawscope/CanvasDrawScope;)V", "imageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "getImageBitmap", "()Landroidx/compose/ui/graphics/ImageBitmap;", "setImageBitmap", "(Landroidx/compose/ui/graphics/ImageBitmap;)V", "foundation_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class HandleImageCache {

    @NotNull
    public static final HandleImageCache INSTANCE = new HandleImageCache();

    @Nullable
    public static Canvas canvas;

    @Nullable
    public static CanvasDrawScope canvasDrawScope;

    @Nullable
    public static ImageBitmap imageBitmap;

    @Nullable
    public final ImageBitmap getImageBitmap() {
        return imageBitmap;
    }

    public final void setImageBitmap(@Nullable ImageBitmap imageBitmap2) {
        imageBitmap = imageBitmap2;
    }

    @Nullable
    public final Canvas getCanvas() {
        return canvas;
    }

    public final void setCanvas(@Nullable Canvas canvas2) {
        canvas = canvas2;
    }

    @Nullable
    public final CanvasDrawScope getCanvasDrawScope() {
        return canvasDrawScope;
    }

    public final void setCanvasDrawScope(@Nullable CanvasDrawScope canvasDrawScope2) {
        canvasDrawScope = canvasDrawScope2;
    }
}
