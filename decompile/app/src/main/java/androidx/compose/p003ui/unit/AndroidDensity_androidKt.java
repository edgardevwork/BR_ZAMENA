package androidx.compose.p003ui.unit;

import android.content.Context;
import androidx.compose.p003ui.unit.fontscaling.FontScaleConverter;
import androidx.compose.p003ui.unit.fontscaling.FontScaleConverterFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidDensity.android.kt */
@Metadata(m7104d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m7105d2 = {"Density", "Landroidx/compose/ui/unit/Density;", "context", "Landroid/content/Context;", "ui-unit_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class AndroidDensity_androidKt {
    @NotNull
    public static final Density Density(@NotNull Context context) {
        FontScaleConverter fontScaleConverterForScale;
        float f = context.getResources().getConfiguration().fontScale;
        if (FontScalingKt.getDisableNonLinearFontScalingInCompose() || (fontScaleConverterForScale = FontScaleConverterFactory.INSTANCE.forScale(f)) == null) {
            fontScaleConverterForScale = new LinearFontScaleConverter(f);
        }
        return new DensityWithConverter(context.getResources().getDisplayMetrics().density, f, fontScaleConverterForScale);
    }
}
