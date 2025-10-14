package androidx.compose.material3;

import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.Shape;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.p003ui.unit.IntOffsetKt;
import androidx.compose.p003ui.unit.IntRect;
import androidx.compose.p003ui.unit.IntSize;
import androidx.compose.p003ui.unit.LayoutDirection;
import androidx.compose.p003ui.window.PopupPositionProvider;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Tooltip.kt */
@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u001c\u0010\u001e\u001a\u00020\u00192\b\b\u0002\u0010\u001a\u001a\u00020\u001bH\u0007ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0014H\u0007¢\u0006\u0002\u0010!J:\u0010 \u001a\u00020\u00142\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\bH\u0007ø\u0001\u0000¢\u0006\u0004\b&\u0010'R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\b8Gø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0013\u001a\u00020\u0014*\u00020\u00158@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, m7105d2 = {"Landroidx/compose/material3/TooltipDefaults;", "", "()V", "caretProperties", "Landroidx/compose/material3/CaretProperties;", "getCaretProperties", "()Landroidx/compose/material3/CaretProperties;", "plainTooltipContainerColor", "Landroidx/compose/ui/graphics/Color;", "getPlainTooltipContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "plainTooltipContainerShape", "Landroidx/compose/ui/graphics/Shape;", "getPlainTooltipContainerShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "plainTooltipContentColor", "getPlainTooltipContentColor", "richTooltipContainerShape", "getRichTooltipContainerShape", "defaultRichTooltipColors", "Landroidx/compose/material3/RichTooltipColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultRichTooltipColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/RichTooltipColors;", "rememberPlainTooltipPositionProvider", "Landroidx/compose/ui/window/PopupPositionProvider;", "spacingBetweenTooltipAndAnchor", "Landroidx/compose/ui/unit/Dp;", "rememberPlainTooltipPositionProvider-kHDZbjc", "(FLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/window/PopupPositionProvider;", "rememberRichTooltipPositionProvider", "rememberRichTooltipPositionProvider-kHDZbjc", "richTooltipColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/RichTooltipColors;", "containerColor", "contentColor", "titleContentColor", "actionContentColor", "richTooltipColors-ro_MJ88", "(JJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/RichTooltipColors;", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,719:1\n74#2:720\n74#2:727\n1116#3,6:721\n1116#3,6:728\n154#4:734\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipDefaults\n*L\n377#1:720\n412#1:727\n380#1:721,6\n415#1:728,6\n329#1:734\n*E\n"})
/* loaded from: classes.dex */
public final class TooltipDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final TooltipDefaults INSTANCE = new TooltipDefaults();

    @NotNull
    private static final CaretProperties caretProperties = new CaretProperties(C2046Dp.m13666constructorimpl(8), C2046Dp.m13666constructorimpl(16), null);

    private TooltipDefaults() {
    }

    @Composable
    @JvmName(name = "getPlainTooltipContainerShape")
    @NotNull
    public final Shape getPlainTooltipContainerShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(49570325);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(49570325, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerShape> (Tooltip.kt:304)");
        }
        Shape value = ShapesKt.getValue(PlainTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContainerColor")
    public final long getPlainTooltipContainerColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(102696215);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(102696215, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContainerColor> (Tooltip.kt:310)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getPlainTooltipContentColor")
    public final long getPlainTooltipContentColor(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1982928937);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1982928937, i, -1, "androidx.compose.material3.TooltipDefaults.<get-plainTooltipContentColor> (Tooltip.kt:316)");
        }
        long value = ColorSchemeKt.getValue(PlainTooltipTokens.INSTANCE.getSupportingTextColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @Composable
    @JvmName(name = "getRichTooltipContainerShape")
    @NotNull
    public final Shape getRichTooltipContainerShape(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1138709783);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1138709783, i, -1, "androidx.compose.material3.TooltipDefaults.<get-richTooltipContainerShape> (Tooltip.kt:322)");
        }
        Shape value = ShapesKt.getValue(RichTooltipTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return value;
    }

    @NotNull
    public final CaretProperties getCaretProperties() {
        return caretProperties;
    }

    @Composable
    @NotNull
    public final RichTooltipColors richTooltipColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1622312141);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1622312141, i, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:335)");
        }
        RichTooltipColors defaultRichTooltipColors$material3_release = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultRichTooltipColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: richTooltipColors-ro_MJ88 */
    public final RichTooltipColors m10166richTooltipColorsro_MJ88(long j, long j2, long j3, long j4, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1498555081);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1498555081, i, -1, "androidx.compose.material3.TooltipDefaults.richTooltipColors (Tooltip.kt:347)");
        }
        RichTooltipColors richTooltipColorsM9673copyjRlVdoo = getDefaultRichTooltipColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m9673copyjRlVdoo(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return richTooltipColorsM9673copyjRlVdoo;
    }

    @NotNull
    public final RichTooltipColors getDefaultRichTooltipColors$material3_release(@NotNull ColorScheme colorScheme) {
        RichTooltipColors defaultRichTooltipColorsCached = colorScheme.getDefaultRichTooltipColorsCached();
        if (defaultRichTooltipColorsCached != null) {
            return defaultRichTooltipColorsCached;
        }
        RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
        RichTooltipColors richTooltipColors = new RichTooltipColors(ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getContainerColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getSupportingTextColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getSubheadColor()), ColorSchemeKt.fromToken(colorScheme, richTooltipTokens.getActionLabelTextColor()), null);
        colorScheme.setDefaultRichTooltipColorsCached$material3_release(richTooltipColors);
        return richTooltipColors;
    }

    @Composable
    @NotNull
    /* renamed from: rememberPlainTooltipPositionProvider-kHDZbjc */
    public final PopupPositionProvider m10164rememberPlainTooltipPositionProviderkHDZbjc(float f, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1047866909);
        if ((i2 & 1) != 0) {
            f = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1047866909, i, -1, "androidx.compose.material3.TooltipDefaults.rememberPlainTooltipPositionProvider (Tooltip.kt:375)");
        }
        final int iMo7868roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo7868roundToPx0680j_4(f);
        composer.startReplaceableGroup(-2013870024);
        boolean zChanged = composer.changed(iMo7868roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberPlainTooltipPositionProvider$1$1
                @Override // androidx.compose.p003ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo8548calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
                    int left = anchorBounds.getLeft() + ((anchorBounds.getWidth() - IntSize.m13836getWidthimpl(popupContentSize)) / 2);
                    int top = (anchorBounds.getTop() - IntSize.m13835getHeightimpl(popupContentSize)) - iMo7868roundToPx0680j_4;
                    if (top < 0) {
                        top = iMo7868roundToPx0680j_4 + anchorBounds.getBottom();
                    }
                    return IntOffsetKt.IntOffset(left, top);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberPlainTooltipPositionProvider$1$1 tooltipDefaults$rememberPlainTooltipPositionProvider$1$1 = (TooltipDefaults$rememberPlainTooltipPositionProvider$1$1) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tooltipDefaults$rememberPlainTooltipPositionProvider$1$1;
    }

    @Composable
    @NotNull
    /* renamed from: rememberRichTooltipPositionProvider-kHDZbjc */
    public final PopupPositionProvider m10165rememberRichTooltipPositionProviderkHDZbjc(float f, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1538806795);
        if ((i2 & 1) != 0) {
            f = TooltipKt.getSpacingBetweenTooltipAndAnchor();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1538806795, i, -1, "androidx.compose.material3.TooltipDefaults.rememberRichTooltipPositionProvider (Tooltip.kt:410)");
        }
        final int iMo7868roundToPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo7868roundToPx0680j_4(f);
        composer.startReplaceableGroup(1605213924);
        boolean zChanged = composer.changed(iMo7868roundToPx0680j_4);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new PopupPositionProvider() { // from class: androidx.compose.material3.TooltipDefaults$rememberRichTooltipPositionProvider$1$1
                @Override // androidx.compose.p003ui.window.PopupPositionProvider
                /* renamed from: calculatePosition-llwVHH4 */
                public long mo8548calculatePositionllwVHH4(@NotNull IntRect anchorBounds, long windowSize, @NotNull LayoutDirection layoutDirection, long popupContentSize) {
                    int right = anchorBounds.getRight();
                    if (IntSize.m13836getWidthimpl(popupContentSize) + right > IntSize.m13836getWidthimpl(windowSize) && (right = anchorBounds.getLeft() - IntSize.m13836getWidthimpl(popupContentSize)) < 0) {
                        right = anchorBounds.getLeft() + ((anchorBounds.getWidth() - IntSize.m13836getWidthimpl(popupContentSize)) / 2);
                    }
                    int top = (anchorBounds.getTop() - IntSize.m13835getHeightimpl(popupContentSize)) - iMo7868roundToPx0680j_4;
                    if (top < 0) {
                        top = iMo7868roundToPx0680j_4 + anchorBounds.getBottom();
                    }
                    return IntOffsetKt.IntOffset(right, top);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        TooltipDefaults$rememberRichTooltipPositionProvider$1$1 tooltipDefaults$rememberRichTooltipPositionProvider$1$1 = (TooltipDefaults$rememberRichTooltipPositionProvider$1$1) objRememberedValue;
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return tooltipDefaults$rememberRichTooltipPositionProvider$1$1;
    }
}
