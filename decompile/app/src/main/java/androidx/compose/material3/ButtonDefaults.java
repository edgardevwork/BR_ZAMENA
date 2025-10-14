package androidx.compose.material3;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.tokens.ElevatedButtonTokens;
import androidx.compose.material3.tokens.FilledButtonTokens;
import androidx.compose.material3.tokens.FilledTonalButtonTokens;
import androidx.compose.material3.tokens.OutlinedButtonTokens;
import androidx.compose.material3.tokens.TextButtonTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Button.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010:\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010:\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bA\u0010BJD\u0010C\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bJ\u0010KJ\r\u0010L\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010L\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bM\u0010BJD\u0010N\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bO\u0010KJ\r\u0010P\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010P\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bQ\u0010BJD\u0010R\u001a\u00020D2\b\b\u0002\u0010E\u001a\u00020\u00042\b\b\u0002\u0010F\u001a\u00020\u00042\b\b\u0002\u0010G\u001a\u00020\u00042\b\b\u0002\u0010H\u001a\u00020\u00042\b\b\u0002\u0010I\u001a\u00020\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\bS\u0010KJ\r\u0010T\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010T\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bU\u0010BJ\r\u0010V\u001a\u00020.H\u0007¢\u0006\u0002\u0010;J:\u0010V\u001a\u00020.2\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\b\b\u0002\u0010?\u001a\u00020=2\b\b\u0002\u0010@\u001a\u00020=H\u0007ø\u0001\u0000¢\u0006\u0004\bW\u0010BR\u0016\u0010\u0003\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0012\u0010\u0010R\u0019\u0010\u0013\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0014\u0010\u0010R\u0019\u0010\u0015\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0005\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u0016\u0010\u0019\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u0016\u0010\u001c\u001a\u00020\u0004X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0005R\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020$8G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010'\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b(\u0010 R\u0011\u0010)\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010+\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b,\u0010 R\u0018\u0010-\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0018\u00102\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R\u0018\u00104\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b5\u00101R\u0018\u00106\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b7\u00101R\u0018\u00108\u001a\u00020.*\u00020/8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b9\u00101\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006X"}, m7105d2 = {"Landroidx/compose/material3/ButtonDefaults;", "", "()V", "ButtonHorizontalPadding", "Landroidx/compose/ui/unit/Dp;", "F", "ButtonVerticalPadding", "ButtonWithIconContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "getButtonWithIconContentPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "ButtonWithIconHorizontalStartPadding", "ContentPadding", "getContentPadding", "IconSize", "getIconSize-D9Ej5fM", "()F", "IconSpacing", "getIconSpacing-D9Ej5fM", "MinHeight", "getMinHeight-D9Ej5fM", "MinWidth", "getMinWidth-D9Ej5fM", "TextButtonContentPadding", "getTextButtonContentPadding", "TextButtonHorizontalPadding", "TextButtonWithIconContentPadding", "getTextButtonWithIconContentPadding", "TextButtonWithIconHorizontalEndPadding", "elevatedShape", "Landroidx/compose/ui/graphics/Shape;", "getElevatedShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "filledTonalShape", "getFilledTonalShape", "outlinedButtonBorder", "Landroidx/compose/foundation/BorderStroke;", "getOutlinedButtonBorder", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/BorderStroke;", "outlinedShape", "getOutlinedShape", "shape", "getShape", "textShape", "getTextShape", "defaultButtonColors", "Landroidx/compose/material3/ButtonColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultButtonColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/ButtonColors;", "defaultElevatedButtonColors", "getDefaultElevatedButtonColors$material3_release", "defaultFilledTonalButtonColors", "getDefaultFilledTonalButtonColors$material3_release", "defaultOutlinedButtonColors", "getDefaultOutlinedButtonColors$material3_release", "defaultTextButtonColors", "getDefaultTextButtonColors$material3_release", "buttonColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/ButtonColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "contentColor", "disabledContainerColor", "disabledContentColor", "buttonColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonColors;", "buttonElevation", "Landroidx/compose/material3/ButtonElevation;", "defaultElevation", "pressedElevation", "focusedElevation", "hoveredElevation", "disabledElevation", "buttonElevation-R_JCAzs", "(FFFFFLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/ButtonElevation;", "elevatedButtonColors", "elevatedButtonColors-ro_MJ88", "elevatedButtonElevation", "elevatedButtonElevation-R_JCAzs", "filledTonalButtonColors", "filledTonalButtonColors-ro_MJ88", "filledTonalButtonElevation", "filledTonalButtonElevation-R_JCAzs", "outlinedButtonColors", "outlinedButtonColors-ro_MJ88", "textButtonColors", "textButtonColors-ro_MJ88", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1068:1\n154#2:1069\n154#2:1070\n154#2:1071\n154#2:1072\n154#2:1073\n154#2:1074\n154#2:1075\n154#2:1076\n154#2:1077\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material3/ButtonDefaults\n*L\n825#1:1069\n450#1:1070\n451#1:1071\n470#1:1072\n481#1:1073\n496#1:1074\n511#1:1075\n517#1:1076\n525#1:1077\n*E\n"})
/* loaded from: classes3.dex */
public final class ButtonDefaults {
    public static final int $stable = 0;
    private static final float ButtonHorizontalPadding;
    private static final float ButtonVerticalPadding;

    @NotNull
    private static final PaddingValues ButtonWithIconContentPadding;
    private static final float ButtonWithIconHorizontalStartPadding;

    @NotNull
    private static final PaddingValues ContentPadding;

    @NotNull
    public static final ButtonDefaults INSTANCE = new ButtonDefaults();
    private static final float IconSize;
    private static final float IconSpacing;
    private static final float MinHeight;
    private static final float MinWidth;

    @NotNull
    private static final PaddingValues TextButtonContentPadding;
    private static final float TextButtonHorizontalPadding;

    @NotNull
    private static final PaddingValues TextButtonWithIconContentPadding;
    private static final float TextButtonWithIconHorizontalEndPadding;

    private ButtonDefaults() {
    }

    @NotNull
    public final PaddingValues getContentPadding() {
        return ContentPadding;
    }

    @NotNull
    public final PaddingValues getButtonWithIconContentPadding() {
        return ButtonWithIconContentPadding;
    }

    @NotNull
    public final PaddingValues getTextButtonContentPadding() {
        return TextButtonContentPadding;
    }

    @NotNull
    public final PaddingValues getTextButtonWithIconContentPadding() {
        return TextButtonWithIconContentPadding;
    }

    /* renamed from: getMinWidth-D9Ej5fM */
    public final float m9175getMinWidthD9Ej5fM() {
        return MinWidth;
    }

    /* renamed from: getMinHeight-D9Ej5fM */
    public final float m9174getMinHeightD9Ej5fM() {
        return MinHeight;
    }

    /* renamed from: getIconSize-D9Ej5fM */
    public final float m9172getIconSizeD9Ej5fM() {
        return IconSize;
    }

    /* renamed from: getIconSpacing-D9Ej5fM */
    public final float m9173getIconSpacingD9Ej5fM() {
        return IconSpacing;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1234923021);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1234923021, i, -1, "androidx.compose.material3.ButtonDefaults.<get-shape> (Button.kt:527)");
        }
        Shape value = ShapesKt.getValue(FilledButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getElevatedShape")
    @NotNull
    public final Shape getElevatedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2143958791);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143958791, i, -1, "androidx.compose.material3.ButtonDefaults.<get-elevatedShape> (Button.kt:530)");
        }
        Shape value = ShapesKt.getValue(ElevatedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getFilledTonalShape")
    @NotNull
    public final Shape getFilledTonalShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-886584987);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-886584987, i, -1, "androidx.compose.material3.ButtonDefaults.<get-filledTonalShape> (Button.kt:533)");
        }
        Shape value = ShapesKt.getValue(FilledTonalButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getOutlinedShape")
    @NotNull
    public final Shape getOutlinedShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2045213065);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2045213065, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedShape> (Button.kt:536)");
        }
        Shape value = ShapesKt.getValue(OutlinedButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getTextShape")
    @NotNull
    public final Shape getTextShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-349121587);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-349121587, i, -1, "androidx.compose.material3.ButtonDefaults.<get-textShape> (Button.kt:539)");
        }
        Shape value = ShapesKt.getValue(TextButtonTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @NotNull
    public final ButtonColors buttonColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1449248637);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1449248637, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:546)");
        }
        ButtonColors defaultButtonColors$material3_release = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultButtonColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: buttonColors-ro_MJ88 */
    public final ButtonColors m9166buttonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-339300779);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339300779, i, -1, "androidx.compose.material3.ButtonDefaults.buttonColors (Button.kt:563)");
        }
        ButtonColors buttonColorsM9161copyjRlVdoo = getDefaultButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9161copyjRlVdoo(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColorsM9161copyjRlVdoo;
    }

    @NotNull
    public final ButtonColors getDefaultButtonColors$material3_release(@NotNull ColorScheme colorScheme) {
        ButtonColors defaultButtonColorsCached = colorScheme.getDefaultButtonColorsCached();
        if (defaultButtonColorsCached != null) {
            return defaultButtonColorsCached;
        }
        FilledButtonTokens filledButtonTokens = FilledButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getLabelTextColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    @Composable
    @NotNull
    public final ButtonColors elevatedButtonColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2025043443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2025043443, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:589)");
        }
        ButtonColors defaultElevatedButtonColors$material3_release = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultElevatedButtonColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedButtonColors-ro_MJ88 */
    public final ButtonColors m9168elevatedButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1507908383);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1507908383, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonColors (Button.kt:606)");
        }
        ButtonColors buttonColorsM9161copyjRlVdoo = getDefaultElevatedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9161copyjRlVdoo(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColorsM9161copyjRlVdoo;
    }

    @NotNull
    public final ButtonColors getDefaultElevatedButtonColors$material3_release(@NotNull ColorScheme colorScheme) {
        ButtonColors defaultElevatedButtonColorsCached = colorScheme.getDefaultElevatedButtonColorsCached();
        if (defaultElevatedButtonColorsCached != null) {
            return defaultElevatedButtonColorsCached;
        }
        ElevatedButtonTokens elevatedButtonTokens = ElevatedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getLabelTextColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, elevatedButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultElevatedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    @Composable
    @NotNull
    public final ButtonColors filledTonalButtonColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(824987837);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(824987837, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:632)");
        }
        ButtonColors defaultFilledTonalButtonColors$material3_release = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultFilledTonalButtonColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: filledTonalButtonColors-ro_MJ88 */
    public final ButtonColors m9170filledTonalButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1670757653);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1670757653, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonColors (Button.kt:649)");
        }
        ButtonColors buttonColorsM9161copyjRlVdoo = getDefaultFilledTonalButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9161copyjRlVdoo(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColorsM9161copyjRlVdoo;
    }

    @NotNull
    public final ButtonColors getDefaultFilledTonalButtonColors$material3_release(@NotNull ColorScheme colorScheme) {
        ButtonColors defaultFilledTonalButtonColorsCached = colorScheme.getDefaultFilledTonalButtonColorsCached();
        if (defaultFilledTonalButtonColorsCached != null) {
            return defaultFilledTonalButtonColorsCached;
        }
        FilledTonalButtonTokens filledTonalButtonTokens = FilledTonalButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getLabelTextColor()), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledContainerColor()), 0.12f, 0.0f, 0.0f, 0.0f, 14, null), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, filledTonalButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultFilledTonalButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    @Composable
    @NotNull
    public final ButtonColors outlinedButtonColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1344886725);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1344886725, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:675)");
        }
        ButtonColors defaultOutlinedButtonColors$material3_release = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultOutlinedButtonColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: outlinedButtonColors-ro_MJ88 */
    public final ButtonColors m9176outlinedButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1778526249);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1778526249, i, -1, "androidx.compose.material3.ButtonDefaults.outlinedButtonColors (Button.kt:692)");
        }
        ButtonColors buttonColorsM9161copyjRlVdoo = getDefaultOutlinedButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9161copyjRlVdoo(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColorsM9161copyjRlVdoo;
    }

    @NotNull
    public final ButtonColors getDefaultOutlinedButtonColors$material3_release(@NotNull ColorScheme colorScheme) {
        ButtonColors defaultOutlinedButtonColorsCached = colorScheme.getDefaultOutlinedButtonColorsCached();
        if (defaultOutlinedButtonColorsCached != null) {
            return defaultOutlinedButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM11375getTransparent0d7_KjU = companion.m11375getTransparent0d7_KjU();
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM11375getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getLabelTextColor()), companion.m11375getTransparent0d7_KjU(), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, outlinedButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultOutlinedButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    @Composable
    @NotNull
    public final ButtonColors textButtonColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1880341584);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1880341584, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:717)");
        }
        ButtonColors defaultTextButtonColors$material3_release = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextButtonColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: textButtonColors-ro_MJ88 */
    public final ButtonColors m9177textButtonColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1402274782);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1402274782, i, -1, "androidx.compose.material3.ButtonDefaults.textButtonColors (Button.kt:734)");
        }
        ButtonColors buttonColorsM9161copyjRlVdoo = getDefaultTextButtonColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9161copyjRlVdoo(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonColorsM9161copyjRlVdoo;
    }

    @NotNull
    public final ButtonColors getDefaultTextButtonColors$material3_release(@NotNull ColorScheme colorScheme) {
        ButtonColors defaultTextButtonColorsCached = colorScheme.getDefaultTextButtonColorsCached();
        if (defaultTextButtonColorsCached != null) {
            return defaultTextButtonColorsCached;
        }
        Color.Companion companion = Color.INSTANCE;
        long jM11375getTransparent0d7_KjU = companion.m11375getTransparent0d7_KjU();
        TextButtonTokens textButtonTokens = TextButtonTokens.INSTANCE;
        ButtonColors buttonColors = new ButtonColors(jM11375getTransparent0d7_KjU, ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getLabelTextColor()), companion.m11375getTransparent0d7_KjU(), Color.m11339copywmQWz5c$default(ColorSchemeKt.fromToken(colorScheme, textButtonTokens.getDisabledLabelTextColor()), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), null);
        colorScheme.setDefaultTextButtonColorsCached$material3_release(buttonColors);
        return buttonColors;
    }

    @Composable
    @NotNull
    /* renamed from: buttonElevation-R_JCAzs */
    public final ButtonElevation m9167buttonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1827791191);
        float fM10441getContainerElevationD9Ej5fM = (i2 & 1) != 0 ? FilledButtonTokens.INSTANCE.m10441getContainerElevationD9Ej5fM() : f;
        float fM10447getPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? FilledButtonTokens.INSTANCE.m10447getPressedContainerElevationD9Ej5fM() : f2;
        float fM10444getFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? FilledButtonTokens.INSTANCE.m10444getFocusContainerElevationD9Ej5fM() : f3;
        float fM10445getHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? FilledButtonTokens.INSTANCE.m10445getHoverContainerElevationD9Ej5fM() : f4;
        float fM10443getDisabledContainerElevationD9Ej5fM = (i2 & 16) != 0 ? FilledButtonTokens.INSTANCE.m10443getDisabledContainerElevationD9Ej5fM() : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1827791191, i, -1, "androidx.compose.material3.ButtonDefaults.buttonElevation (Button.kt:772)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM10441getContainerElevationD9Ej5fM, fM10447getPressedContainerElevationD9Ej5fM, fM10444getFocusContainerElevationD9Ej5fM, fM10445getHoverContainerElevationD9Ej5fM, fM10443getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    @NotNull
    /* renamed from: elevatedButtonElevation-R_JCAzs */
    public final ButtonElevation m9169elevatedButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1065482445);
        float fM10357getContainerElevationD9Ej5fM = (i2 & 1) != 0 ? ElevatedButtonTokens.INSTANCE.m10357getContainerElevationD9Ej5fM() : f;
        float fM10363getPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? ElevatedButtonTokens.INSTANCE.m10363getPressedContainerElevationD9Ej5fM() : f2;
        float fM10360getFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? ElevatedButtonTokens.INSTANCE.m10360getFocusContainerElevationD9Ej5fM() : f3;
        float fM10361getHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? ElevatedButtonTokens.INSTANCE.m10361getHoverContainerElevationD9Ej5fM() : f4;
        float fM10359getDisabledContainerElevationD9Ej5fM = (i2 & 16) != 0 ? ElevatedButtonTokens.INSTANCE.m10359getDisabledContainerElevationD9Ej5fM() : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1065482445, i, -1, "androidx.compose.material3.ButtonDefaults.elevatedButtonElevation (Button.kt:798)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM10357getContainerElevationD9Ej5fM, fM10363getPressedContainerElevationD9Ej5fM, fM10360getFocusContainerElevationD9Ej5fM, fM10361getHoverContainerElevationD9Ej5fM, fM10359getDisabledContainerElevationD9Ej5fM, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    @NotNull
    /* renamed from: filledTonalButtonElevation-R_JCAzs */
    public final ButtonElevation m9171filledTonalButtonElevationR_JCAzs(float f, float f2, float f3, float f4, float f5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(5982871);
        float fM10464getContainerElevationD9Ej5fM = (i2 & 1) != 0 ? FilledTonalButtonTokens.INSTANCE.m10464getContainerElevationD9Ej5fM() : f;
        float fM10470getPressedContainerElevationD9Ej5fM = (i2 & 2) != 0 ? FilledTonalButtonTokens.INSTANCE.m10470getPressedContainerElevationD9Ej5fM() : f2;
        float fM10467getFocusContainerElevationD9Ej5fM = (i2 & 4) != 0 ? FilledTonalButtonTokens.INSTANCE.m10467getFocusContainerElevationD9Ej5fM() : f3;
        float fM10468getHoverContainerElevationD9Ej5fM = (i2 & 8) != 0 ? FilledTonalButtonTokens.INSTANCE.m10468getHoverContainerElevationD9Ej5fM() : f4;
        float fM13666constructorimpl = (i2 & 16) != 0 ? C2046Dp.m13666constructorimpl(0) : f5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(5982871, i, -1, "androidx.compose.material3.ButtonDefaults.filledTonalButtonElevation (Button.kt:825)");
        }
        ButtonElevation buttonElevation = new ButtonElevation(fM10464getContainerElevationD9Ej5fM, fM10470getPressedContainerElevationD9Ej5fM, fM10467getFocusContainerElevationD9Ej5fM, fM10468getHoverContainerElevationD9Ej5fM, fM13666constructorimpl, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return buttonElevation;
    }

    @Composable
    @JvmName(name = "getOutlinedButtonBorder")
    @NotNull
    public final BorderStroke getOutlinedButtonBorder(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-563957672);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-563957672, i, -1, "androidx.compose.material3.ButtonDefaults.<get-outlinedButtonBorder> (Button.kt:836)");
        }
        OutlinedButtonTokens outlinedButtonTokens = OutlinedButtonTokens.INSTANCE;
        BorderStroke borderStrokeM7798BorderStrokecXLIe8U = BorderStrokeKt.m7798BorderStrokecXLIe8U(outlinedButtonTokens.m10549getOutlineWidthD9Ej5fM(), ColorSchemeKt.getValue(outlinedButtonTokens.getOutlineColor(), composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return borderStrokeM7798BorderStrokecXLIe8U;
    }

    static {
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(24);
        ButtonHorizontalPadding = fM13666constructorimpl;
        float f = 8;
        float fM13666constructorimpl2 = C2046Dp.m13666constructorimpl(f);
        ButtonVerticalPadding = fM13666constructorimpl2;
        PaddingValues paddingValuesM8119PaddingValuesa9UjIt4 = PaddingKt.m8119PaddingValuesa9UjIt4(fM13666constructorimpl, fM13666constructorimpl2, fM13666constructorimpl, fM13666constructorimpl2);
        ContentPadding = paddingValuesM8119PaddingValuesa9UjIt4;
        float f2 = 16;
        float fM13666constructorimpl3 = C2046Dp.m13666constructorimpl(f2);
        ButtonWithIconHorizontalStartPadding = fM13666constructorimpl3;
        ButtonWithIconContentPadding = PaddingKt.m8119PaddingValuesa9UjIt4(fM13666constructorimpl3, fM13666constructorimpl2, fM13666constructorimpl, fM13666constructorimpl2);
        float fM13666constructorimpl4 = C2046Dp.m13666constructorimpl(12);
        TextButtonHorizontalPadding = fM13666constructorimpl4;
        TextButtonContentPadding = PaddingKt.m8119PaddingValuesa9UjIt4(fM13666constructorimpl4, paddingValuesM8119PaddingValuesa9UjIt4.getTop(), fM13666constructorimpl4, paddingValuesM8119PaddingValuesa9UjIt4.getBottom());
        float fM13666constructorimpl5 = C2046Dp.m13666constructorimpl(f2);
        TextButtonWithIconHorizontalEndPadding = fM13666constructorimpl5;
        TextButtonWithIconContentPadding = PaddingKt.m8119PaddingValuesa9UjIt4(fM13666constructorimpl4, paddingValuesM8119PaddingValuesa9UjIt4.getTop(), fM13666constructorimpl5, paddingValuesM8119PaddingValuesa9UjIt4.getBottom());
        MinWidth = C2046Dp.m13666constructorimpl(58);
        MinHeight = C2046Dp.m13666constructorimpl(40);
        IconSize = FilledButtonTokens.INSTANCE.m10446getIconSizeD9Ej5fM();
        IconSpacing = C2046Dp.m13666constructorimpl(f);
    }
}
