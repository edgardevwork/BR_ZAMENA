package androidx.compose.material3;

import androidx.compose.animation.SplineBasedFloatDecayAnimationSpec_androidKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.TopAppBarLargeTokens;
import androidx.compose.material3.tokens.TopAppBarMediumTokens;
import androidx.compose.material3.tokens.TopAppBarSmallCenteredTokens;
import androidx.compose.material3.tokens.TopAppBarSmallTokens;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppBar.kt */
@StabilityInferred(parameters = 1)
@ExperimentalMaterial3Api
@Metadata(m7104d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\r\u0010\u0012\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0013JD\u0010\u0012\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010'H\u0007¢\u0006\u0002\u0010(JK\u0010)\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!2\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010'H\u0007¢\u0006\u0002\u0010(J\r\u0010*\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0013JD\u0010*\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001bJ\r\u0010,\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0013JD\u0010,\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001bJ'\u0010.\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\u001f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0007¢\u0006\u0002\u0010/JD\u00100\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b1\u0010\u001bJ\r\u00102\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0013JD\u00102\u001a\u00020\b2\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u0015H\u0007ø\u0001\u0000¢\u0006\u0004\b3\u0010\u001bR\u0011\u0010\u0003\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u00020\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u000e\u001a\u00020\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0010\u001a\u00020\b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00064"}, m7105d2 = {"Landroidx/compose/material3/TopAppBarDefaults;", "", "()V", "windowInsets", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "defaultCenterAlignedTopAppBarColors", "Landroidx/compose/material3/TopAppBarColors;", "Landroidx/compose/material3/ColorScheme;", "getDefaultCenterAlignedTopAppBarColors$material3_release", "(Landroidx/compose/material3/ColorScheme;)Landroidx/compose/material3/TopAppBarColors;", "defaultLargeTopAppBarColors", "getDefaultLargeTopAppBarColors$material3_release", "defaultMediumTopAppBarColors", "getDefaultMediumTopAppBarColors$material3_release", "defaultTopAppBarColors", "getDefaultTopAppBarColors$material3_release", "centerAlignedTopAppBarColors", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/material3/TopAppBarColors;", "containerColor", "Landroidx/compose/ui/graphics/Color;", "scrolledContainerColor", "navigationIconContentColor", "titleContentColor", "actionIconContentColor", "centerAlignedTopAppBarColors-zjMxDiM", "(JJJJJLandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarColors;", "enterAlwaysScrollBehavior", "Landroidx/compose/material3/TopAppBarScrollBehavior;", "state", "Landroidx/compose/material3/TopAppBarState;", "canScroll", "Lkotlin/Function0;", "", "snapAnimationSpec", "Landroidx/compose/animation/core/AnimationSpec;", "", "flingAnimationSpec", "Landroidx/compose/animation/core/DecayAnimationSpec;", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "exitUntilCollapsedScrollBehavior", "largeTopAppBarColors", "largeTopAppBarColors-zjMxDiM", "mediumTopAppBarColors", "mediumTopAppBarColors-zjMxDiM", "pinnedScrollBehavior", "(Landroidx/compose/material3/TopAppBarState;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)Landroidx/compose/material3/TopAppBarScrollBehavior;", "smallTopAppBarColors", "smallTopAppBarColors-zjMxDiM", "topAppBarColors", "topAppBarColors-zjMxDiM", "material3_release"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class TopAppBarDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final TopAppBarDefaults INSTANCE = new TopAppBarDefaults();

    private TopAppBarDefaults() {
    }

    @Composable
    @NotNull
    public final TopAppBarColors topAppBarColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1388520854);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1388520854, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:697)");
        }
        TopAppBarColors defaultTopAppBarColors$material3_release = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTopAppBarColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: topAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m10183topAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(2142919275);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2142919275, i, -1, "androidx.compose.material3.TopAppBarDefaults.topAppBarColors (AppBar.kt:717)");
        }
        TopAppBarColors topAppBarColorsM10173copyt635Npw = getDefaultTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m10173copyt635Npw(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColorsM10173copyt635Npw;
    }

    @NotNull
    public final TopAppBarColors getDefaultTopAppBarColors$material3_release(@NotNull ColorScheme colorScheme) {
        long jFromToken;
        TopAppBarColors defaultTopAppBarColorsCached = colorScheme.getDefaultTopAppBarColorsCached();
        if (defaultTopAppBarColorsCached == null) {
            TopAppBarSmallTokens topAppBarSmallTokens = TopAppBarSmallTokens.INSTANCE;
            long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getContainerColor());
            if (Color.m11341equalsimpl0(ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getContainerColor()), colorScheme.getSurface())) {
                jFromToken = ColorSchemeKt.m9301surfaceColorAtElevation3ABfNKs(colorScheme, topAppBarSmallTokens.m10763getOnScrollContainerElevationD9Ej5fM());
            } else {
                jFromToken = ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getContainerColor());
            }
            defaultTopAppBarColorsCached = new TopAppBarColors(jFromToken2, jFromToken, ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallTokens.getTrailingIconColor()), null);
            colorScheme.setDefaultTopAppBarColorsCached$material3_release(defaultTopAppBarColorsCached);
        }
        return defaultTopAppBarColorsCached;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use topAppBarColors instead.", replaceWith = @ReplaceWith(expression = "topAppBarColors(containerColor, scrolledContainerColor, navigationIconContentColor, titleContentColor, actionIconContentColor)", imports = {}))
    @Composable
    @NotNull
    /* renamed from: smallTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m10182smallTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1717201472);
        long value = (i2 & 1) != 0 ? ColorSchemeKt.getValue(TopAppBarSmallTokens.INSTANCE.getContainerColor(), composer, 6) : j;
        long jM9290applyTonalElevationRFCenO8 = (i2 & 2) != 0 ? ColorSchemeKt.m9290applyTonalElevationRFCenO8(MaterialTheme.INSTANCE.getColorScheme(composer, 6), value, TopAppBarSmallTokens.INSTANCE.m10763getOnScrollContainerElevationD9Ej5fM(), composer, ((i << 3) & 112) | 384) : j2;
        long value2 = (i2 & 4) != 0 ? ColorSchemeKt.getValue(TopAppBarSmallTokens.INSTANCE.getLeadingIconColor(), composer, 6) : j3;
        long value3 = (i2 & 8) != 0 ? ColorSchemeKt.getValue(TopAppBarSmallTokens.INSTANCE.getHeadlineColor(), composer, 6) : j4;
        long value4 = (i2 & 16) != 0 ? ColorSchemeKt.getValue(TopAppBarSmallTokens.INSTANCE.getTrailingIconColor(), composer, 6) : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1717201472, i, -1, "androidx.compose.material3.TopAppBarDefaults.smallTopAppBarColors (AppBar.kt:775)");
        }
        TopAppBarColors topAppBarColorsM10183topAppBarColorszjMxDiM = m10183topAppBarColorszjMxDiM(value, jM9290applyTonalElevationRFCenO8, value2, value3, value4, composer, i & 524286, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColorsM10183topAppBarColorszjMxDiM;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2143182847);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143182847, i, -1, "androidx.compose.material3.TopAppBarDefaults.<get-windowInsets> (AppBar.kt:788)");
        }
        WindowInsets systemBarsForVisualComponents = SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 6);
        WindowInsetsSides.Companion companion = WindowInsetsSides.INSTANCE;
        WindowInsets windowInsetsM8198onlybOOhFvg = WindowInsetsKt.m8198onlybOOhFvg(systemBarsForVisualComponents, WindowInsetsSides.m8209plusgK_yJZ4(companion.m8219getHorizontalJoeWqyM(), companion.m8223getTopJoeWqyM()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsM8198onlybOOhFvg;
    }

    @Composable
    @NotNull
    public final TopAppBarColors centerAlignedTopAppBarColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(513940029);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(513940029, i, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:798)");
        }
        TopAppBarColors defaultCenterAlignedTopAppBarColors$material3_release = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultCenterAlignedTopAppBarColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: centerAlignedTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m10179centerAlignedTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(1896017784);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1896017784, i, -1, "androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors (AppBar.kt:818)");
        }
        TopAppBarColors topAppBarColorsM10173copyt635Npw = getDefaultCenterAlignedTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m10173copyt635Npw(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColorsM10173copyt635Npw;
    }

    @NotNull
    public final TopAppBarColors getDefaultCenterAlignedTopAppBarColors$material3_release(@NotNull ColorScheme colorScheme) {
        long jFromToken;
        TopAppBarColors defaultCenterAlignedTopAppBarColorsCached = colorScheme.getDefaultCenterAlignedTopAppBarColorsCached();
        if (defaultCenterAlignedTopAppBarColorsCached == null) {
            TopAppBarSmallCenteredTokens topAppBarSmallCenteredTokens = TopAppBarSmallCenteredTokens.INSTANCE;
            long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getContainerColor());
            if (Color.m11341equalsimpl0(ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getContainerColor()), colorScheme.getSurface())) {
                jFromToken = ColorSchemeKt.m9301surfaceColorAtElevation3ABfNKs(colorScheme, TopAppBarSmallTokens.INSTANCE.m10763getOnScrollContainerElevationD9Ej5fM());
            } else {
                jFromToken = ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getContainerColor());
            }
            defaultCenterAlignedTopAppBarColorsCached = new TopAppBarColors(jFromToken2, jFromToken, ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarSmallCenteredTokens.getTrailingIconColor()), null);
            colorScheme.setDefaultCenterAlignedTopAppBarColorsCached$material3_release(defaultCenterAlignedTopAppBarColorsCached);
        }
        return defaultCenterAlignedTopAppBarColorsCached;
    }

    @Composable
    @NotNull
    public final TopAppBarColors mediumTopAppBarColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1268886463);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1268886463, i, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:853)");
        }
        TopAppBarColors defaultMediumTopAppBarColors$material3_release = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultMediumTopAppBarColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: mediumTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m10181mediumTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-582474442);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-582474442, i, -1, "androidx.compose.material3.TopAppBarDefaults.mediumTopAppBarColors (AppBar.kt:874)");
        }
        TopAppBarColors topAppBarColorsM10173copyt635Npw = getDefaultMediumTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m10173copyt635Npw(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColorsM10173copyt635Npw;
    }

    @NotNull
    public final TopAppBarColors getDefaultMediumTopAppBarColors$material3_release(@NotNull ColorScheme colorScheme) {
        long jFromToken;
        TopAppBarColors defaultMediumTopAppBarColorsCached = colorScheme.getDefaultMediumTopAppBarColorsCached();
        if (defaultMediumTopAppBarColorsCached == null) {
            TopAppBarMediumTokens topAppBarMediumTokens = TopAppBarMediumTokens.INSTANCE;
            long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getContainerColor());
            if (Color.m11341equalsimpl0(ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getContainerColor()), colorScheme.getSurface())) {
                jFromToken = ColorSchemeKt.m9301surfaceColorAtElevation3ABfNKs(colorScheme, TopAppBarSmallTokens.INSTANCE.m10763getOnScrollContainerElevationD9Ej5fM());
            } else {
                jFromToken = ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getContainerColor());
            }
            defaultMediumTopAppBarColorsCached = new TopAppBarColors(jFromToken2, jFromToken, ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarMediumTokens.getTrailingIconColor()), null);
            colorScheme.setDefaultMediumTopAppBarColorsCached$material3_release(defaultMediumTopAppBarColorsCached);
        }
        return defaultMediumTopAppBarColorsCached;
    }

    @Composable
    @NotNull
    public final TopAppBarColors largeTopAppBarColors(@Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1744932393);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1744932393, i, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:906)");
        }
        TopAppBarColors defaultLargeTopAppBarColors$material3_release = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultLargeTopAppBarColors$material3_release;
    }

    @Composable
    @NotNull
    /* renamed from: largeTopAppBarColors-zjMxDiM, reason: not valid java name */
    public final TopAppBarColors m10180largeTopAppBarColorszjMxDiM(long j, long j2, long j3, long j4, long j5, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1471507700);
        long jM11376getUnspecified0d7_KjU = (i2 & 1) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j;
        long jM11376getUnspecified0d7_KjU2 = (i2 & 2) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j2;
        long jM11376getUnspecified0d7_KjU3 = (i2 & 4) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j3;
        long jM11376getUnspecified0d7_KjU4 = (i2 & 8) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j4;
        long jM11376getUnspecified0d7_KjU5 = (i2 & 16) != 0 ? Color.INSTANCE.m11376getUnspecified0d7_KjU() : j5;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1471507700, i, -1, "androidx.compose.material3.TopAppBarDefaults.largeTopAppBarColors (AppBar.kt:927)");
        }
        TopAppBarColors topAppBarColorsM10173copyt635Npw = getDefaultLargeTopAppBarColors$material3_release(MaterialTheme.INSTANCE.getColorScheme(composer, 6)).m10173copyt635Npw(jM11376getUnspecified0d7_KjU, jM11376getUnspecified0d7_KjU2, jM11376getUnspecified0d7_KjU3, jM11376getUnspecified0d7_KjU4, jM11376getUnspecified0d7_KjU5);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarColorsM10173copyt635Npw;
    }

    @NotNull
    public final TopAppBarColors getDefaultLargeTopAppBarColors$material3_release(@NotNull ColorScheme colorScheme) {
        long jFromToken;
        TopAppBarColors defaultLargeTopAppBarColorsCached = colorScheme.getDefaultLargeTopAppBarColorsCached();
        if (defaultLargeTopAppBarColorsCached == null) {
            TopAppBarLargeTokens topAppBarLargeTokens = TopAppBarLargeTokens.INSTANCE;
            long jFromToken2 = ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getContainerColor());
            if (Color.m11341equalsimpl0(ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getContainerColor()), colorScheme.getSurface())) {
                jFromToken = ColorSchemeKt.m9301surfaceColorAtElevation3ABfNKs(colorScheme, TopAppBarSmallTokens.INSTANCE.m10763getOnScrollContainerElevationD9Ej5fM());
            } else {
                jFromToken = ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getContainerColor());
            }
            defaultLargeTopAppBarColorsCached = new TopAppBarColors(jFromToken2, jFromToken, ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getLeadingIconColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getHeadlineColor()), ColorSchemeKt.fromToken(colorScheme, topAppBarLargeTokens.getTrailingIconColor()), null);
            colorScheme.setDefaultLargeTopAppBarColorsCached$material3_release(defaultLargeTopAppBarColorsCached);
        }
        return defaultLargeTopAppBarColorsCached;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public final TopAppBarScrollBehavior pinnedScrollBehavior(@Nullable TopAppBarState topAppBarState, @Nullable Function0<Boolean> function0, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(286497075);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(286497075, i, -1, "androidx.compose.material3.TopAppBarDefaults.pinnedScrollBehavior (AppBar.kt:969)");
        }
        PinnedScrollBehavior pinnedScrollBehavior = new PinnedScrollBehavior(topAppBarState, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return pinnedScrollBehavior;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public final TopAppBarScrollBehavior enterAlwaysScrollBehavior(@Nullable TopAppBarState topAppBarState, @Nullable Function0<Boolean> function0, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(959086674);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(959086674, i, -1, "androidx.compose.material3.TopAppBarDefaults.enterAlwaysScrollBehavior (AppBar.kt:994)");
        }
        EnterAlwaysScrollBehavior enterAlwaysScrollBehavior = new EnterAlwaysScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return enterAlwaysScrollBehavior;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    public final TopAppBarScrollBehavior exitUntilCollapsedScrollBehavior(@Nullable TopAppBarState topAppBarState, @Nullable Function0<Boolean> function0, @Nullable AnimationSpec<Float> animationSpec, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-1757023234);
        if ((i2 & 1) != 0) {
            topAppBarState = AppBarKt.rememberTopAppBarState(0.0f, 0.0f, 0.0f, composer, 0, 7);
        }
        if ((i2 & 2) != 0) {
            function0 = new Function0<Boolean>() { // from class: androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior.1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Boolean invoke() {
                    return Boolean.TRUE;
                }
            };
        }
        if ((i2 & 4) != 0) {
            animationSpec = AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null);
        }
        if ((i2 & 8) != 0) {
            decayAnimationSpec = SplineBasedFloatDecayAnimationSpec_androidKt.rememberSplineBasedDecay(composer, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1757023234, i, -1, "androidx.compose.material3.TopAppBarDefaults.exitUntilCollapsedScrollBehavior (AppBar.kt:1027)");
        }
        ExitUntilCollapsedScrollBehavior exitUntilCollapsedScrollBehavior = new ExitUntilCollapsedScrollBehavior(topAppBarState, animationSpec, decayAnimationSpec, function0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return exitUntilCollapsedScrollBehavior;
    }
}
