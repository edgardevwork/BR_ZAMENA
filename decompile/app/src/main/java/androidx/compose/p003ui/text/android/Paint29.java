package androidx.compose.p003ui.text.android;

import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* compiled from: PaintExtensions.kt */
@RequiresApi(29)
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, m7105d2 = {"Landroidx/compose/ui/text/android/Paint29;", "", "()V", "getTextBounds", "", "paint", "Landroid/graphics/Paint;", "text", "", TtmlNode.START, "", "end", "rect", "Landroid/graphics/Rect;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class Paint29 {

    @NotNull
    public static final Paint29 INSTANCE = new Paint29();

    @JvmStatic
    @DoNotInline
    public static final void getTextBounds(@NotNull Paint paint, @NotNull CharSequence text, int start, int end, @NotNull Rect rect) {
        paint.getTextBounds(text, start, end, rect);
    }
}
