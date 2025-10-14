package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Button.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J:\u0010\u001f\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'J0\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010.JD\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020\u00042\b\b\u0002\u0010+\u001a\u00020\u00042\b\b\u0002\u0010,\u001a\u00020\u00042\b\b\u0002\u0010/\u001a\u00020\u00042\b\b\u0002\u00100\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u00102J0\u00103\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b4\u00105J0\u00106\u001a\u00020 2\b\b\u0002\u0010!\u001a\u00020\"2\b\b\u0002\u0010#\u001a\u00020\"2\b\b\u0002\u0010%\u001a\u00020\"H\u0007ø\u0001\u0000¢\u0006\u0004\b7\u00105R\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0011\u0010\rR\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0013\u0010\rR\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0017\u0010\rR\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\nR\u0016\u0010\u001a\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001b\u001a\u00020\u001c8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00068"}, m7105d2 = {"Landroidx/compose/material/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "OutlinedBorderOpacity", "", "OutlinedBorderSize", "getOutlinedBorderSize-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "outlinedBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "buttonColors", "Landroidx/compose/material/ButtonColors;", TtmlNode.ATTR_TTS_BACKGROUND_COLOR, "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledBackgroundColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "elevation", "Landroidx/compose/material/ButtonElevation;", "defaultElevation", "pressedElevation", "disabledElevation", "elevation-yajeYGU", "(FFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "hoveredElevation", "focusedElevation", "elevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonElevation;", "outlinedButtonColors", "outlinedButtonColors-RGew2ao", "(JJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material/ButtonColors;", "textButtonColors", "textButtonColors-RGew2ao", "material_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,617:1\n154#2:618\n154#2:619\n154#2:620\n154#2:621\n154#2:622\n154#2:623\n154#2:624\n154#2:625\n154#2:626\n154#2:627\n154#2:637\n154#2:638\n154#2:639\n154#2:640\n154#2:641\n154#2:642\n154#2:643\n154#2:644\n83#3,3:628\n1116#4,6:631\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonDefaults\n*L\n346#1:618\n347#1:619\n348#1:620\n353#1:621\n354#1:622\n372#1:623\n373#1:624\n374#1:625\n375#1:626\n376#1:627\n294#1:637\n295#1:638\n311#1:639\n317#1:640\n324#1:641\n331#1:642\n469#1:643\n480#1:644\n378#1:628,3\n378#1:631,6\n*E\n"})
/* loaded from: classes.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;

    @NotNull
    private static final PaddingValues ContentPadding;

    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;
    public static final float OutlinedBorderOpacity = 0.12f;
    private static final float OutlinedBorderSize;

    @NotNull
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    private ButtonDefaults() {
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    /* renamed from: getMinWidth-D9Ej5fM, reason: not valid java name */
    public final float m8817getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM, reason: not valid java name */
    public final float m8816getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getIconSize-D9Ej5fM, reason: not valid java name */
    public final float m8814getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM, reason: not valid java name */
    public final float m8815getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    @Composable
    @NotNull
    /* renamed from: buttonColors-ro_MJ88, reason: not valid java name */
    public final ButtonColors m8811buttonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        long jM11385compositeOverOWjLjI;
        composer.startReplaceableGroup(1870371134);
        long jM8846getPrimary0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU() : j;
        long jM8864contentColorForek8zF_U = (i2 & 2) != 0 ? ColorsKt.m8864contentColorForek8zF_U(jM8846getPrimary0d7_KjU, composer, i & 14) : j2;
        if ((i2 & 4) != 0) {
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            jM11385compositeOverOWjLjI = ColorKt.m11385compositeOverOWjLjI(Color.m11339copywmQWz5c$default(materialTheme.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), materialTheme.getColors(composer, 6).m8850getSurface0d7_KjU());
        } else {
            jM11385compositeOverOWjLjI = j3;
        }
        long jM11339copywmQWz5c$default = (i2 & 8) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1870371134, i, -1, "androidx.compose.material.ButtonDefaults.buttonColors (Button.kt:411)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM8846getPrimary0d7_KjU, jM8864contentColorForek8zF_U, jM11385compositeOverOWjLjI, jM11339copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m8819outlinedButtonColorsRGew2ao(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-2124406093);
        long jM8850getSurface0d7_KjU = (i2 & 1) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8850getSurface0d7_KjU() : j;
        long jM8846getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU() : j2;
        long jM11339copywmQWz5c$default = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2124406093, i, -1, "androidx.compose.material.ButtonDefaults.outlinedButtonColors (Button.kt:432)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM8850getSurface0d7_KjU, jM8846getPrimary0d7_KjU, jM8850getSurface0d7_KjU, jM11339copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    @Composable
    @NotNull
    /* renamed from: textButtonColors-RGew2ao, reason: not valid java name */
    public final ButtonColors m8820textButtonColorsRGew2ao(long j, long j2, long j3, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(182742216);
        long jM11375getTransparent0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11375getTransparent0d7_KjU() : j;
        long jM8846getPrimary0d7_KjU = (i2 & 2) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m8846getPrimary0d7_KjU() : j2;
        long jM11339copywmQWz5c$default = (i2 & 4) != 0 ? Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(182742216, i, -1, "androidx.compose.material.ButtonDefaults.textButtonColors (Button.kt:453)");
        }
        DefaultButtonColors defaultButtonColors = new DefaultButtonColors(jM11375getTransparent0d7_KjU, jM8846getPrimary0d7_KjU, jM11375getTransparent0d7_KjU, jM11339copywmQWz5c$default, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors;
    }

    /* renamed from: getOutlinedBorderSize-D9Ej5fM, reason: not valid java name */
    public final float m8818getOutlinedBorderSizeD9Ej5fM() {
        return OutlinedBorderSize;
    }

    @Composable
    @JvmName(name = "getOutlinedBorder")
    @NotNull
    public final BorderStroke getOutlinedBorder(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2091313033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2091313033, i, -1, "androidx.compose.material.ButtonDefaults.<get-outlinedBorder> (Button.kt:475)");
        }
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(OutlinedBorderSize, Color.m11339copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m8845getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM7798BorderStrokecXLIe8U;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use another overload of elevation")
    @Composable
    /* renamed from: elevation-yajeYGU, reason: not valid java name */
    public final /* synthetic */ ButtonElevation m8813elevationyajeYGU(float f, float f2, float f3, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1428576874);
        float fM13666constructorimpl = (i2 & 1) != 0 ? C2046Dp.m13666constructorimpl(2) : f;
        float fM13666constructorimpl2 = (i2 & 2) != 0 ? C2046Dp.m13666constructorimpl(8) : f2;
        float fM13666constructorimpl3 = (i2 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : f3;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1428576874, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:348)");
        }
        float f4 = 4;
        ButtonElevation buttonElevationM8812elevationR_JCAzs = m8812elevationR_JCAzs(fM13666constructorimpl, fM13666constructorimpl2, fM13666constructorimpl3, C2046Dp.m13666constructorimpl(f4), C2046Dp.m13666constructorimpl(f4), composer, (i & 14) | 27648 | (i & 112) | (i & 896) | ((i << 6) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevationM8812elevationR_JCAzs;
    }

    @Composable
    @NotNull
    /* renamed from: elevation-R_JCAzs, reason: not valid java name */
    public final ButtonElevation m8812elevationR_JCAzs(float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-737170518);
        float fM13666constructorimpl = (i2 & 1) != 0 ? C2046Dp.m13666constructorimpl(2) : f;
        float fM13666constructorimpl2 = (i2 & 2) != 0 ? C2046Dp.m13666constructorimpl(8) : f2;
        float fM13666constructorimpl3 = (i2 & 4) != 0 ? C2046Dp.m13666constructorimpl(0) : f3;
        float fM13666constructorimpl4 = (i2 & 8) != 0 ? C2046Dp.m13666constructorimpl(4) : f4;
        float fM13666constructorimpl5 = (i2 & 16) != 0 ? C2046Dp.m13666constructorimpl(4) : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-737170518, i, -1, "androidx.compose.material.ButtonDefaults.elevation (Button.kt:376)");
        }
        Object[] objArr = {C2046Dp.m13664boximpl(fM13666constructorimpl), C2046Dp.m13664boximpl(fM13666constructorimpl2), C2046Dp.m13664boximpl(fM13666constructorimpl3), C2046Dp.m13664boximpl(fM13666constructorimpl4), C2046Dp.m13664boximpl(fM13666constructorimpl5)};
        composer.startReplaceableGroup(-568225417);
        boolean zChanged = false;
        for (int i3 = 0; i3 < 5; i3++) {
            zChanged |= composer.changed(objArr[i3]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new DefaultButtonElevation(fM13666constructorimpl, fM13666constructorimpl2, fM13666constructorimpl3, fM13666constructorimpl4, fM13666constructorimpl5, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        DefaultButtonElevation defaultButtonElevation = (DefaultButtonElevation) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonElevation;
    }

    static {
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(16);
        ButtonHorizontalPadding = fM13666constructorimpl;
        float f = 8;
        float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(f);
        ButtonVerticalPadding = fM13666constructorimpl2;
        PaddingValues paddingValuesM8119PaddingValuesa9UjIt4 = PaddingKt.m8119PaddingValuesa9UjIt4(fM13666constructorimpl, fM13666constructorimpl2, fM13666constructorimpl, fM13666constructorimpl2);
        ContentPadding = paddingValuesM8119PaddingValuesa9UjIt4;
        MinWidth = C2046Dp.m13666constructorimpl(64);
        MinHeight = C2046Dp.m13666constructorimpl(36);
        IconSize = C2046Dp.m13666constructorimpl(18);
        IconSpacing = C2046Dp.m13666constructorimpl(f);
        OutlinedBorderSize = C2046Dp.m13666constructorimpl(1);
        float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(f);
        TextButtonHorizontalPadding = fM13666constructorimpl3;
        TextButtonContentPadding = PaddingKt.m8119PaddingValuesa9UjIt4(fM13666constructorimpl3, paddingValuesM8119PaddingValuesa9UjIt4.getTop(), fM13666constructorimpl3, paddingValuesM8119PaddingValuesa9UjIt4.getBottom());
    }
}
