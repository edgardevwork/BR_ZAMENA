package androidx.compose.p003ui.geometry;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: GeometryUtils.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0005"}, m7105d2 = {"toStringAsFixed", "", "", WebvttCssParser.VALUE_DIGITS, "", "ui-geometry_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes4.dex */
public final class GeometryUtilsKt {
    @NotNull
    public static final String toStringAsFixed(float f, int i) {
        int iMax = Math.max(i, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f2 = f * fPow;
        int i2 = (int) f2;
        if (f2 - i2 >= 0.5f) {
            i2++;
        }
        float f3 = i2 / fPow;
        if (iMax > 0) {
            return String.valueOf(f3);
        }
        return String.valueOf((int) f3);
    }
}
