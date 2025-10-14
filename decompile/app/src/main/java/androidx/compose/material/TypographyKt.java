package androidx.compose.material;

import androidx.compose.p003ui.text.TextStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.style.LineHeightStyle;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: Typography.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, m7105d2 = {"DefaultLineHeightStyle", "Landroidx/compose/ui/text/style/LineHeightStyle;", "getDefaultLineHeightStyle", "()Landroidx/compose/ui/text/style/LineHeightStyle;", "DefaultTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getDefaultTextStyle", "()Landroidx/compose/ui/text/TextStyle;", "LocalTypography", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material/Typography;", "getLocalTypography", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "withDefaultFontFamily", "default", "Landroidx/compose/ui/text/font/FontFamily;", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class TypographyKt {

    @NotNull
    private static final LineHeightStyle DefaultLineHeightStyle;

    @NotNull
    private static final TextStyle DefaultTextStyle;

    @NotNull
    private static final ProvidableCompositionLocal<Typography> LocalTypography;

    public static final TextStyle withDefaultFontFamily(TextStyle textStyle, FontFamily fontFamily) {
        if (textStyle.getFontFamily() != null) {
            return textStyle;
        }
        return textStyle.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyle.spanStyle.m13124getColor0d7_KjU() : 0L, (15695871 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : fontFamily, (15695871 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyle.platformStyle : null, (15695871 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15695871 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
    }

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.Alignment.INSTANCE.m13535getCenterPIaL0Z0(), LineHeightStyle.Trim.INSTANCE.m13550getNoneEVpEnUU(), null);
        DefaultLineHeightStyle = lineHeightStyle;
        TextStyle textStyle = TextStyle.INSTANCE.getDefault();
        DefaultTextStyle = textStyle.m13191copyp1EtxEg((15695871 & 1) != 0 ? textStyle.spanStyle.m13124getColor0d7_KjU() : 0L, (15695871 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (15695871 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15695871 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (15695871 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (15695871 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : null, (15695871 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15695871 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (15695871 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (15695871 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15695871 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15695871 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (15695871 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15695871 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15695871 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15695871 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : 0, (15695871 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : 0, (15695871 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (15695871 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15695871 & 524288) != 0 ? textStyle.platformStyle : DefaultPlatformTextStyle_androidKt.defaultPlatformTextStyle(), (15695871 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (15695871 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : 0, (15695871 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : 0, (15695871 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
        LocalTypography = CompositionLocalKt.staticCompositionLocalOf(new Function0<Typography>() { // from class: androidx.compose.material.TypographyKt$LocalTypography$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final Typography invoke() {
                return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
            }
        });
    }

    @NotNull
    public static final LineHeightStyle getDefaultLineHeightStyle() {
        return DefaultLineHeightStyle;
    }

    @NotNull
    public static final TextStyle getDefaultTextStyle() {
        return DefaultTextStyle;
    }

    @NotNull
    public static final ProvidableCompositionLocal<Typography> getLocalTypography() {
        return LocalTypography;
    }
}
