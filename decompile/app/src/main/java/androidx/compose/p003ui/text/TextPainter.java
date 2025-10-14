package androidx.compose.p003ui.text;

import androidx.compose.p003ui.geometry.Offset;
import androidx.compose.p003ui.geometry.Rect;
import androidx.compose.p003ui.geometry.RectKt;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Fill;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextForegroundStyle;
import androidx.compose.p003ui.text.style.TextOverflow;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: TextPainter.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, m7105d2 = {"Landroidx/compose/ui/text/TextPainter;", "", "()V", "paint", "", "canvas", "Landroidx/compose/ui/graphics/Canvas;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class TextPainter {
    public static final int $stable = 0;

    @NotNull
    public static final TextPainter INSTANCE = new TextPainter();

    private TextPainter() {
    }

    public final void paint(@NotNull Canvas canvas, @NotNull TextLayoutResult textLayoutResult) {
        long jM11366getBlack0d7_KjU;
        boolean z = textLayoutResult.getHasVisualOverflow() && !TextOverflow.m13600equalsimpl0(textLayoutResult.getLayoutInput().getOverflow(), TextOverflow.INSTANCE.m13609getVisiblegIe3tQ8());
        if (z) {
            Rect rectM11139Recttz77jQw = RectKt.m11139Recttz77jQw(Offset.INSTANCE.m11115getZeroF1C5BW0(), SizeKt.Size(IntSize.m13836getWidthimpl(textLayoutResult.getSize()), IntSize.m13835getHeightimpl(textLayoutResult.getSize())));
            canvas.save();
            Canvas.m11313clipRectmtrdDE$default(canvas, rectM11139Recttz77jQw, 0, 2, null);
        }
        SpanStyle spanStyle = textLayoutResult.getLayoutInput().getStyle().getSpanStyle();
        TextDecoration textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = TextDecoration.INSTANCE.getNone();
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.getNone();
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            Brush brush = spanStyle.getBrush();
            if (brush == null) {
                if (spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE) {
                    jM11366getBlack0d7_KjU = spanStyle.getTextForegroundStyle().mo13456getColor0d7_KjU();
                } else {
                    jM11366getBlack0d7_KjU = Color.INSTANCE.m11366getBlack0d7_KjU();
                }
                textLayoutResult.getMultiParagraph().m13044paintLG529CI(canvas, (32 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : jM11366getBlack0d7_KjU, (32 & 4) != 0 ? null : shadow2, (32 & 8) != 0 ? null : textDecoration2, (32 & 16) == 0 ? drawStyle2 : null, (32 & 32) != 0 ? DrawScope.INSTANCE.m11890getDefaultBlendMode0nO6VwU() : 0);
            } else {
                textLayoutResult.getMultiParagraph().m13046painthn5TExg(canvas, brush, (64 & 4) != 0 ? Float.NaN : spanStyle.getTextForegroundStyle() != TextForegroundStyle.Unspecified.INSTANCE ? spanStyle.getTextForegroundStyle().getAlpha() : 1.0f, (64 & 8) != 0 ? null : shadow2, (64 & 16) != 0 ? null : textDecoration2, (64 & 32) != 0 ? null : drawStyle2, (64 & 64) != 0 ? DrawScope.INSTANCE.m11890getDefaultBlendMode0nO6VwU() : 0);
            }
            if (z) {
                canvas.restore();
            }
        } catch (Throwable th) {
            if (z) {
                canvas.restore();
            }
            throw th;
        }
    }
}
