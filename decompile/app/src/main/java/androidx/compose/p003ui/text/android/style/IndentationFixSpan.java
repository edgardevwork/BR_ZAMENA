package androidx.compose.p003ui.text.android.style;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import androidx.compose.p003ui.text.android.TextLayoutKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* compiled from: IndentationFixSpan.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002Jp\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0014H\u0016¨\u0006\u0019"}, m7105d2 = {"Landroidx/compose/ui/text/android/style/IndentationFixSpan;", "Landroid/text/style/LeadingMarginSpan;", "()V", "drawLeadingMargin", "", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", TtmlNode.LEFT, "", "dir", "top", "baseline", "bottom", "text", "", TtmlNode.START, "end", "first", "", TtmlNode.TAG_LAYOUT, "Landroid/text/Layout;", "getLeadingMargin", "firstLine", "ui-text_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class IndentationFixSpan implements LeadingMarginSpan {
    public static final int $stable = 0;

    @Override // android.text.style.LeadingMarginSpan
    public int getLeadingMargin(boolean firstLine) {
        return 0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public void drawLeadingMargin(@Nullable Canvas canvas, @Nullable Paint paint, int left, int dir, int top, int baseline, int bottom, @Nullable CharSequence text, int start, int end, boolean first, @Nullable Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(start)) != layout.getLineCount() - 1 || !TextLayoutKt.isLineEllipsized(layout, lineForOffset)) {
            return;
        }
        float ellipsizedLeftPadding = IndentationFixSpanKt.getEllipsizedLeftPadding(layout, lineForOffset, paint) + IndentationFixSpanKt.getEllipsizedRightPadding(layout, lineForOffset, paint);
        if (ellipsizedLeftPadding == 0.0f) {
            return;
        }
        Intrinsics.checkNotNull(canvas);
        canvas.translate(ellipsizedLeftPadding, 0.0f);
    }
}
