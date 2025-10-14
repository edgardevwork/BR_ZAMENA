package androidx.compose.p003ui.text.android.style;

import android.graphics.Paint;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: LineHeightStyleSpan.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m7105d2 = {"lineHeight", "", "Landroid/graphics/Paint$FontMetricsInt;", "ui-text_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class LineHeightStyleSpanKt {
    public static final int lineHeight(@NotNull Paint.FontMetricsInt fontMetricsInt) {
        return fontMetricsInt.descent - fontMetricsInt.ascent;
    }
}
