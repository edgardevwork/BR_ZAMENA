package androidx.compose.material;

import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: MaterialTextSelectionColors.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a*\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\"\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a2\u0010\u000b\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a*\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0015\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0001¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001b"}, m7105d2 = {"DefaultSelectionBackgroundAlpha", "", "DesiredContrastRatio", "MinimumSelectionBackgroundAlpha", "binarySearchForAccessibleSelectionColorAlpha", "selectionColor", "Landroidx/compose/ui/graphics/Color;", "textColor", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "binarySearchForAccessibleSelectionColorAlpha-ysEtTa8", "(JJJ)F", "calculateContrastRatio", "foreground", "background", "calculateContrastRatio--OWjLjI", "(JJ)F", "selectionColorAlpha", "calculateContrastRatio-nb2GgbA", "(JFJJ)F", "calculateSelectionBackgroundColor", "calculateSelectionBackgroundColor-ysEtTa8", "(JJJ)J", "rememberTextSelectionColors", "Landroidx/compose/foundation/text/selection/TextSelectionColors;", "colors", "Landroidx/compose/material/Colors;", "(Landroidx/compose/material/Colors;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/text/selection/TextSelectionColors;", "material_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nMaterialTextSelectionColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,242:1\n658#2:243\n646#2:244\n74#3:245\n67#4,3:246\n66#4:249\n1116#5,6:250\n*S KotlinDebug\n*F\n+ 1 MaterialTextSelectionColors.kt\nandroidx/compose/material/MaterialTextSelectionColorsKt\n*L\n43#1:243\n43#1:244\n44#1:245\n48#1:246,3\n48#1:249\n48#1:250,6\n*E\n"})
/* loaded from: classes.dex */
public final class MaterialTextSelectionColorsKt {
    private static final float DefaultSelectionBackgroundAlpha = 0.4f;
    private static final float DesiredContrastRatio = 4.5f;
    private static final float MinimumSelectionBackgroundAlpha = 0.2f;

    @Composable
    @NotNull
    public static final SelectionColors rememberTextSelectionColors(@NotNull Colors colors, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-721696685);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-721696685, i, -1, "androidx.compose.material.rememberTextSelectionColors (MaterialTextSelectionColors.kt:35)");
        }
        long jM8846getPrimary0d7_KjU = colors.m8846getPrimary0d7_KjU();
        long jM8839getBackground0d7_KjU = colors.m8839getBackground0d7_KjU();
        composer.startReplaceableGroup(35572910);
        long jM8863contentColorFor4WTKRHQ = ColorsKt.m8863contentColorFor4WTKRHQ(colors, jM8839getBackground0d7_KjU);
        if (jM8863contentColorFor4WTKRHQ == Color.INSTANCE.m11376getUnspecified0d7_KjU()) {
            jM8863contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m11350unboximpl();
        }
        long j = jM8863contentColorFor4WTKRHQ;
        composer.endReplaceableGroup();
        long jM11339copywmQWz5c$default = Color.m11339copywmQWz5c$default(j, ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null);
        Color colorM11330boximpl = Color.m11330boximpl(jM8846getPrimary0d7_KjU);
        Color colorM11330boximpl2 = Color.m11330boximpl(jM8839getBackground0d7_KjU);
        Color colorM11330boximpl3 = Color.m11330boximpl(jM11339copywmQWz5c$default);
        composer.startReplaceableGroup(1618982084);
        boolean zChanged = composer.changed(colorM11330boximpl) | composer.changed(colorM11330boximpl2) | composer.changed(colorM11330boximpl3);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SelectionColors(colors.m8846getPrimary0d7_KjU(), m8944calculateSelectionBackgroundColorysEtTa8(jM8846getPrimary0d7_KjU, jM11339copywmQWz5c$default, jM8839getBackground0d7_KjU), null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SelectionColors selectionColors = (SelectionColors) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return selectionColors;
    }

    /* renamed from: calculateSelectionBackgroundColor-ysEtTa8, reason: not valid java name */
    public static final long m8944calculateSelectionBackgroundColorysEtTa8(long j, long j2, long j3) {
        float fM8941binarySearchForAccessibleSelectionColorAlphaysEtTa8;
        float fM8943calculateContrastRationb2GgbA = m8943calculateContrastRationb2GgbA(j, 0.4f, j2, j3);
        float fM8943calculateContrastRationb2GgbA2 = m8943calculateContrastRationb2GgbA(j, 0.2f, j2, j3);
        if (fM8943calculateContrastRationb2GgbA >= 4.5f) {
            fM8941binarySearchForAccessibleSelectionColorAlphaysEtTa8 = 0.4f;
        } else {
            fM8941binarySearchForAccessibleSelectionColorAlphaysEtTa8 = fM8943calculateContrastRationb2GgbA2 < 4.5f ? 0.2f : m8941binarySearchForAccessibleSelectionColorAlphaysEtTa8(j, j2, j3);
        }
        return Color.m11339copywmQWz5c$default(j, fM8941binarySearchForAccessibleSelectionColorAlphaysEtTa8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* renamed from: binarySearchForAccessibleSelectionColorAlpha-ysEtTa8, reason: not valid java name */
    private static final float m8941binarySearchForAccessibleSelectionColorAlphaysEtTa8(long j, long j2, long j3) {
        float f = 0.2f;
        float f2 = 0.4f;
        float f3 = 0.4f;
        for (int i = 0; i < 7; i++) {
            float fM8943calculateContrastRationb2GgbA = (m8943calculateContrastRationb2GgbA(j, f2, j2, j3) / 4.5f) - 1.0f;
            if (0.0f <= fM8943calculateContrastRationb2GgbA && fM8943calculateContrastRationb2GgbA <= 0.01f) {
                break;
            }
            if (fM8943calculateContrastRationb2GgbA < 0.0f) {
                f3 = f2;
            } else {
                f = f2;
            }
            f2 = (f3 + f) / 2.0f;
        }
        return f2;
    }

    /* renamed from: calculateContrastRatio-nb2GgbA, reason: not valid java name */
    private static final float m8943calculateContrastRationb2GgbA(long j, float f, long j2, long j3) {
        long jM11385compositeOverOWjLjI = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null), j3);
        return m8942calculateContrastRatioOWjLjI(ColorKt.m11385compositeOverOWjLjI(j2, jM11385compositeOverOWjLjI), jM11385compositeOverOWjLjI);
    }

    /* renamed from: calculateContrastRatio--OWjLjI, reason: not valid java name */
    public static final float m8942calculateContrastRatioOWjLjI(long j, long j2) {
        float fM11392luminance8_81llA = ColorKt.m11392luminance8_81llA(j) + 0.05f;
        float fM11392luminance8_81llA2 = ColorKt.m11392luminance8_81llA(j2) + 0.05f;
        return Math.max(fM11392luminance8_81llA, fM11392luminance8_81llA2) / Math.min(fM11392luminance8_81llA, fM11392luminance8_81llA2);
    }
}
