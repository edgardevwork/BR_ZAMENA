package androidx.compose.p003ui.graphics;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidColorFilter.android.kt */
@Metadata(m7104d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0000\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u00042\n\u0010\b\u001a\u00060\u0001j\u0002`\u0002H\u0000¢\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\u00060\u0001j\u0002`\u00022\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\b\u0010\u0016\u001a\u00020\u0017H\u0000\u001a\b\u0010\u0018\u001a\u00020\u0017H\u0000\u001a\n\u0010\u0019\u001a\u00020\u0001*\u00020\u001a\u001a\n\u0010\u001b\u001a\u00020\u001a*\u00020\u0001*\f\b\u0000\u0010\u001c\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001d"}, m7105d2 = {"actualColorMatrixColorFilter", "Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/NativeColorFilter;", "colorMatrix", "Landroidx/compose/ui/graphics/ColorMatrix;", "actualColorMatrixColorFilter-jHG-Opc", "([F)Landroid/graphics/ColorFilter;", "actualColorMatrixFromFilter", "filter", "(Landroid/graphics/ColorFilter;)[F", "actualLightingColorFilter", "multiply", "Landroidx/compose/ui/graphics/Color;", "add", "actualLightingColorFilter--OWjLjI", "(JJ)Landroid/graphics/ColorFilter;", "actualTintColorFilter", "color", "blendMode", "Landroidx/compose/ui/graphics/BlendMode;", "actualTintColorFilter-xETnrds", "(JI)Landroid/graphics/ColorFilter;", "supportsColorMatrixQuery", "", "supportsLightingColorFilterQuery", "asAndroidColorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "asComposeColorFilter", "NativeColorFilter", "ui-graphics_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class AndroidColorFilter_androidKt {
    @NotNull
    public static final ColorFilter asAndroidColorFilter(@NotNull ColorFilter colorFilter) {
        return colorFilter.getNativeColorFilter();
    }

    @NotNull
    public static final ColorFilter asComposeColorFilter(@NotNull ColorFilter colorFilter) {
        ColorFilter colorFilter2;
        if (29 <= Build.VERSION.SDK_INT && AndroidColorFilter_androidKt$$ExternalSyntheticApiModelOutline0.m150m(colorFilter)) {
            return BlendModeColorFilterHelper.INSTANCE.createBlendModeColorFilter(AndroidColorFilter_androidKt$$ExternalSyntheticApiModelOutline1.m151m(colorFilter));
        }
        if ((colorFilter instanceof LightingColorFilter) && supportsLightingColorFilterQuery()) {
            LightingColorFilter lightingColorFilter = (LightingColorFilter) colorFilter;
            colorFilter2 = new LightingColorFilter(ColorKt.Color(lightingColorFilter.getColorMultiply()), ColorKt.Color(lightingColorFilter.getColorAdd()), colorFilter, null);
        } else if ((colorFilter instanceof ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            colorFilter2 = new ColorMatrixColorFilter(null, colorFilter, null);
        } else {
            colorFilter2 = new ColorFilter(colorFilter);
        }
        return colorFilter2;
    }

    @NotNull
    /* renamed from: actualTintColorFilter-xETnrds */
    public static final ColorFilter m11206actualTintColorFilterxETnrds(long j, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            return BlendModeColorFilterHelper.INSTANCE.m11286BlendModeColorFilterxETnrds(j, i);
        }
        return new PorterDuffColorFilter(ColorKt.m11394toArgb8_81llA(j), AndroidBlendMode_androidKt.m11192toPorterDuffModes9anfk8(i));
    }

    @NotNull
    /* renamed from: actualColorMatrixColorFilter-jHG-Opc */
    public static final ColorFilter m11204actualColorMatrixColorFilterjHGOpc(@NotNull float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    @NotNull
    /* renamed from: actualLightingColorFilter--OWjLjI */
    public static final ColorFilter m11205actualLightingColorFilterOWjLjI(long j, long j2) {
        return new LightingColorFilter(ColorKt.m11394toArgb8_81llA(j), ColorKt.m11394toArgb8_81llA(j2));
    }

    @NotNull
    public static final float[] actualColorMatrixFromFilter(@NotNull ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && supportsColorMatrixQuery()) {
            return ColorMatrixFilterHelper.INSTANCE.m11420getColorMatrix8unuwjk((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    public static final boolean supportsColorMatrixQuery() {
        return 26 <= Build.VERSION.SDK_INT;
    }

    public static final boolean supportsLightingColorFilterQuery() {
        return 26 <= Build.VERSION.SDK_INT;
    }
}
