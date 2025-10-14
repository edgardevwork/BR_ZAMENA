package com.blackhub.bronline.game.core.extension;

import android.annotation.SuppressLint;
import android.content.res.Configuration;
import android.graphics.BlurMaskFilter;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransitionKt;
import androidx.compose.animation.core.RepeatMode;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.p003ui.ComposedModifierKt;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.draw.CacheDrawScope;
import androidx.compose.p003ui.draw.DrawModifierKt;
import androidx.compose.p003ui.draw.DrawResult;
import androidx.compose.p003ui.geometry.CornerRadiusKt;
import androidx.compose.p003ui.geometry.OffsetKt;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.AndroidPaint_androidKt;
import androidx.compose.p003ui.graphics.AndroidPath_androidKt;
import androidx.compose.p003ui.graphics.Brush;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.Color;
import androidx.compose.p003ui.graphics.ColorKt;
import androidx.compose.p003ui.graphics.Paint;
import androidx.compose.p003ui.graphics.Path;
import androidx.compose.p003ui.graphics.PathEffect;
import androidx.compose.p003ui.graphics.Shadow;
import androidx.compose.p003ui.graphics.StampedPathEffectStyle;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.drawscope.DrawStyle;
import androidx.compose.p003ui.graphics.drawscope.Stroke;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.platform.CompositionLocalsKt;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.p003ui.text.PlatformSpanStyle;
import androidx.compose.p003ui.text.SpanStyle;
import androidx.compose.p003ui.text.font.FontFamily;
import androidx.compose.p003ui.text.font.FontStyle;
import androidx.compose.p003ui.text.font.FontSynthesis;
import androidx.compose.p003ui.text.font.FontWeight;
import androidx.compose.p003ui.text.intl.LocaleList;
import androidx.compose.p003ui.text.style.BaselineShift;
import androidx.compose.p003ui.text.style.TextDecoration;
import androidx.compose.p003ui.text.style.TextGeometricTransform;
import androidx.compose.p003ui.unit.C2046Dp;
import androidx.compose.p003ui.unit.Density;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ComposeExtension.kt */
@Metadata(m7104d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a&\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a&\u0010\u0007\u001a\u00020\u0001*\u0004\u0018\u00010\u00022\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0002\b\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001aN\u0010\b\u001a\u00020\t*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0016\u0010\u0015\u001a\u00020\r*\u00020\u000fH\u0007ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a$\u0010\u0018\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u00022\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0007\u001a\u0011\u0010\u001b\u001a\u00020\u000f*\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001ad\u0010\u001e\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u001f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010!\u001a\u00020\u000f2\b\b\u0002\u0010\"\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a<\u0010%\u001a\u00020\t*\u00020\t2\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u001c2\b\b\u0002\u0010)\u001a\u00020\r2\b\b\u0002\u0010*\u001a\u00020\u001c\u001a,\u0010+\u001a\u00020\t*\u00020\t2\u0006\u0010,\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u000fø\u0001\u0000¢\u0006\u0004\b.\u0010/\u001a\n\u00100\u001a\u000201*\u000202\u001a\u0011\u00103\u001a\u00020\u000f*\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u001a\u0011\u00104\u001a\u00020\u000f*\u00020\u001cH\u0007¢\u0006\u0002\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00065"}, m7105d2 = {"IfFalse", "", "", "func", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Ljava/lang/Boolean;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "IfTrue", "coloredShadow", "Landroidx/compose/ui/Modifier;", "color", "Landroidx/compose/ui/graphics/Color;", "alpha", "", "borderRadius", "Landroidx/compose/ui/unit/Dp;", "shadowRadius", "offsetY", "offsetX", "coloredShadow-PRYyx80", "(Landroidx/compose/ui/Modifier;JFFFFF)Landroidx/compose/ui/Modifier;", "dpToPx", "dpToPx-8Feqmps", "(FLandroidx/compose/runtime/Composer;I)F", "noRippleClickable", "isEnable", "onClick", "pxToDp", "", "(ILandroidx/compose/runtime/Composer;I)F", "shadow", "transparency", "blurRadius", "spread", "modifier", "shadow-o6VuwKU", "(Landroidx/compose/ui/Modifier;JFFFFFFLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;", "shimmerLoadingAnimation", "isShowShimmer", "isLightModeActive", "widthOfShadowBrush", "angleOfAxisY", "durationMillis", "stampedBorder", "strokeWidth", "cornerRadiusDp", "stampedBorder-aa2Vgzc", "(Landroidx/compose/ui/Modifier;FJF)Landroidx/compose/ui/Modifier;", "toAnnotatedString", "Landroidx/compose/ui/text/AnnotatedString;", "Landroid/text/Spanned;", "toHorizontalPercentDp", "toVerticalPercentSwDp", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nComposeExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeExtension.kt\ncom/blackhub/bronline/game/core/extension/ComposeExtensionKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnnotatedString.kt\nandroidx/compose/ui/text/AnnotatedStringKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,321:1\n74#2:322\n74#2:324\n74#2:337\n74#2:341\n1#3:323\n1099#4:325\n13309#5,2:326\n154#6:328\n154#6:329\n154#6:330\n154#6:331\n154#6:332\n154#6:333\n154#6:334\n154#6:335\n154#6:336\n154#6:338\n154#6:342\n92#7:339\n75#7:340\n92#7:343\n75#7:344\n*S KotlinDebug\n*F\n+ 1 ComposeExtension.kt\ncom/blackhub/bronline/game/core/extension/ComposeExtensionKt\n*L\n52#1:322\n55#1:324\n229#1:337\n239#1:341\n57#1:325\n60#1:326,2\n130#1:328\n131#1:329\n132#1:330\n133#1:331\n166#1:332\n167#1:333\n168#1:334\n169#1:335\n170#1:336\n229#1:338\n239#1:342\n230#1:339\n230#1:340\n240#1:343\n240#1:344\n*E\n"})
/* loaded from: classes2.dex */
public final class ComposeExtensionKt {

    /* compiled from: ComposeExtension.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$IfFalse$1 */
    public static final class C35291 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $func;
        public final /* synthetic */ Boolean $this_IfFalse;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C35291(Boolean bool, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
            super(2);
            bool = bool;
            function2 = function2;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ComposeExtensionKt.IfFalse(bool, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    /* compiled from: ComposeExtension.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$IfTrue$1 */
    public static final class C35301 extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int $$changed;
        public final /* synthetic */ Function2<Composer, Integer, Unit> $func;
        public final /* synthetic */ Boolean $this_IfTrue;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C35301(Boolean bool, Function2<? super Composer, ? super Integer, Unit> function2, int i) {
            super(2);
            bool = bool;
            function2 = function2;
            i = i;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(@Nullable Composer composer, int i) {
            ComposeExtensionKt.IfTrue(bool, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        }
    }

    @Composable
    /* renamed from: dpToPx-8Feqmps */
    public static final float m14409dpToPx8Feqmps(float f, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-3840204);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-3840204, i, -1, "com.blackhub.bronline.game.core.extension.dpToPx (ComposeExtension.kt:51)");
        }
        float fMo7874toPx0680j_4 = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo7874toPx0680j_4(f);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fMo7874toPx0680j_4;
    }

    @Composable
    public static final float pxToDp(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-2002864317);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2002864317, i2, -1, "com.blackhub.bronline.game.core.extension.pxToDp (ComposeExtension.kt:54)");
        }
        float fMo7871toDpu2uoSUM = ((Density) composer.consume(CompositionLocalsKt.getLocalDensity())).mo7871toDpu2uoSUM(i);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fMo7871toDpu2uoSUM;
    }

    @NotNull
    /* renamed from: stampedBorder-aa2Vgzc */
    public static final Modifier m14412stampedBorderaa2Vgzc(@NotNull Modifier stampedBorder, final float f, final long j, final float f2) {
        Intrinsics.checkNotNullParameter(stampedBorder, "$this$stampedBorder");
        return ComposedModifierKt.composed$default(stampedBorder, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$stampedBorder$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(882943718);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(882943718, i, -1, "com.blackhub.bronline.game.core.extension.stampedBorder.<anonymous> (ComposeExtension.kt:92)");
                }
                Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                final float fMo7874toPx0680j_4 = density.mo7874toPx0680j_4(f);
                final float fMo7874toPx0680j_42 = density.mo7874toPx0680j_4(f2);
                final Path Path = AndroidPath_androidKt.Path();
                Path.lineTo(20.0f, 0.0f);
                Path.lineTo(20.0f, 20.0f);
                Path.lineTo(0.0f, 20.0f);
                Path.close();
                Modifier.Companion companion = Modifier.INSTANCE;
                final long j2 = j;
                Modifier modifierThen = composed.then(DrawModifierKt.drawWithCache(companion, new Function1<CacheDrawScope, DrawResult>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$stampedBorder$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    @NotNull
                    public final DrawResult invoke(@NotNull CacheDrawScope drawWithCache) {
                        Intrinsics.checkNotNullParameter(drawWithCache, "$this$drawWithCache");
                        final float f3 = fMo7874toPx0680j_4;
                        final Path path = Path;
                        final float f4 = fMo7874toPx0680j_42;
                        final long j3 = j2;
                        return drawWithCache.onDrawBehind(new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt.stampedBorder.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                                invoke2(drawScope);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull DrawScope onDrawBehind) {
                                Intrinsics.checkNotNullParameter(onDrawBehind, "$this$onDrawBehind");
                                Stroke stroke = new Stroke(f3, 0.0f, 0, 0, PathEffect.INSTANCE.m11614stampedPathEffect7aD1DOk(path, 30.0f, 0.0f, StampedPathEffectStyle.INSTANCE.m11684getTranslateYpspkwk()), 14, null);
                                DrawScope.m11886drawRoundRectuAw5IA$default(onDrawBehind, j3, 0L, 0L, CornerRadiusKt.CornerRadius$default(f4, 0.0f, 2, null), stroke, 0.0f, null, 0, 230, null);
                            }
                        });
                    }
                }));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    @NotNull
    /* renamed from: coloredShadow-PRYyx80 */
    public static final Modifier m14407coloredShadowPRYyx80(@NotNull Modifier coloredShadow, final long j, final float f, final float f2, final float f3, final float f4, final float f5) {
        Intrinsics.checkNotNullParameter(coloredShadow, "$this$coloredShadow");
        return ComposedModifierKt.composed$default(coloredShadow, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$coloredShadow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
                return invoke(modifier, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1976406872);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1976406872, i, -1, "com.blackhub.bronline.game.core.extension.coloredShadow.<anonymous> (ComposeExtension.kt:134)");
                }
                final int iM11394toArgb8_81llA = ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j, f, 0.0f, 0.0f, 0.0f, 14, null));
                final int iM11394toArgb8_81llA2 = ColorKt.m11394toArgb8_81llA(Color.m11339copywmQWz5c$default(j, 0.0f, 0.0f, 0.0f, 0.0f, 14, null));
                composer.startReplaceableGroup(113415086);
                boolean zChanged = composer.changed(iM11394toArgb8_81llA2) | composer.changed(f3) | composer.changed(f5) | composer.changed(f4) | composer.changed(iM11394toArgb8_81llA) | composer.changed(f2);
                final float f6 = f3;
                final float f7 = f5;
                final float f8 = f4;
                final float f9 = f2;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$coloredShadow$1$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                            invoke2(drawScope);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull DrawScope drawBehind) {
                            Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                            int i2 = iM11394toArgb8_81llA2;
                            float f10 = f6;
                            float f11 = f7;
                            float f12 = f8;
                            int i3 = iM11394toArgb8_81llA;
                            float f13 = f9;
                            Canvas canvas = drawBehind.getDrawContext().getCanvas();
                            Paint Paint = AndroidPaint_androidKt.Paint();
                            android.graphics.Paint internalPaint = Paint.getInternalPaint();
                            internalPaint.setColor(i2);
                            internalPaint.setShadowLayer(drawBehind.mo7874toPx0680j_4(f10), drawBehind.mo7874toPx0680j_4(f11), drawBehind.mo7874toPx0680j_4(f12), i3);
                            canvas.drawRoundRect(0.0f, 0.0f, Size.m11168getWidthimpl(drawBehind.mo11889getSizeNHjbRc()), Size.m11165getHeightimpl(drawBehind.mo11889getSizeNHjbRc()), drawBehind.mo7874toPx0680j_4(f13), drawBehind.mo7874toPx0680j_4(f13), Paint);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceableGroup();
                Modifier modifierDrawBehind = DrawModifierKt.drawBehind(composed, (Function1) objRememberedValue);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierDrawBehind;
            }
        }, 1, null);
    }

    @NotNull
    /* renamed from: shadow-o6VuwKU */
    public static final Modifier m14410shadowo6VuwKU(@NotNull Modifier shadow, final long j, final float f, final float f2, final float f3, final float f4, final float f5, final float f6, @NotNull Modifier modifier) {
        Intrinsics.checkNotNullParameter(shadow, "$this$shadow");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        return shadow.then(DrawModifierKt.drawBehind(modifier, new Function1<DrawScope, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$shadow$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope drawBehind) {
                Intrinsics.checkNotNullParameter(drawBehind, "$this$drawBehind");
                float f7 = f6;
                float f8 = f5;
                float f9 = f4;
                float f10 = f3;
                long j2 = j;
                float f11 = f;
                float f12 = f2;
                Canvas canvas = drawBehind.getDrawContext().getCanvas();
                Paint Paint = AndroidPaint_androidKt.Paint();
                android.graphics.Paint internalPaint = Paint.getInternalPaint();
                float fMo7874toPx0680j_4 = drawBehind.mo7874toPx0680j_4(f7);
                float f13 = 0.0f - fMo7874toPx0680j_4;
                float fMo7874toPx0680j_42 = drawBehind.mo7874toPx0680j_4(f8) + f13;
                float fMo7874toPx0680j_43 = f13 + drawBehind.mo7874toPx0680j_4(f9);
                float fM11168getWidthimpl = Size.m11168getWidthimpl(drawBehind.mo11889getSizeNHjbRc()) + fMo7874toPx0680j_4;
                float fM11165getHeightimpl = Size.m11165getHeightimpl(drawBehind.mo11889getSizeNHjbRc()) + fMo7874toPx0680j_4;
                if (!C2046Dp.m13671equalsimpl0(f10, C2046Dp.m13666constructorimpl(0))) {
                    internalPaint.setMaskFilter(new BlurMaskFilter(drawBehind.mo7874toPx0680j_4(f10), BlurMaskFilter.Blur.NORMAL));
                }
                internalPaint.setColor(ColorKt.m11394toArgb8_81llA(ColorKt.Color$default(Color.m11346getRedimpl(j2), Color.m11345getGreenimpl(j2), Color.m11343getBlueimpl(j2), RangesKt___RangesKt.coerceIn(Color.m11342getAlphaimpl(j2) * f11, 0.0f, 1.0f), null, 16, null)));
                canvas.drawRoundRect(fMo7874toPx0680j_42, fMo7874toPx0680j_43, fM11168getWidthimpl, fM11165getHeightimpl, drawBehind.mo7874toPx0680j_4(f12), drawBehind.mo7874toPx0680j_4(f12), Paint);
            }
        }));
    }

    /* compiled from: ComposeExtension.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nComposeExtension.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposeExtension.kt\ncom/blackhub/bronline/game/core/extension/ComposeExtensionKt$noRippleClickable$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,321:1\n1116#2,6:322\n1116#2,6:328\n*S KotlinDebug\n*F\n+ 1 ComposeExtension.kt\ncom/blackhub/bronline/game/core/extension/ComposeExtensionKt$noRippleClickable$1\n*L\n214#1:322,6\n217#1:328,6\n*E\n"})
    /* renamed from: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$noRippleClickable$1 */
    public static final class C35311 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ boolean $isEnable;
        public final /* synthetic */ Function0<Unit> $onClick;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35311(boolean z, Function0<Unit> function0) {
            super(3);
            z = z;
            function0 = function0;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(1376618216);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1376618216, i, -1, "com.blackhub.bronline.game.core.extension.noRippleClickable.<anonymous> (ComposeExtension.kt:211)");
            }
            composer.startReplaceableGroup(-1072492232);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(objRememberedValue);
            }
            MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            composer.endReplaceableGroup();
            boolean z = z;
            composer.startReplaceableGroup(-1072492118);
            boolean zChanged = composer.changed(function0);
            final Function0<Unit> function0 = function0;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$noRippleClickable$1$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        function0.invoke();
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceableGroup();
            Modifier modifierThen = composed.then(ClickableKt.m7803clickableO2vRcR0$default(composed, mutableInteractionSource, null, z, null, null, (Function0) objRememberedValue2, 24, null));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierThen;
        }
    }

    @SuppressLint({"ModifierFactoryUnreferencedReceiver"})
    @NotNull
    public static final Modifier noRippleClickable(@NotNull Modifier modifier, boolean z, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt.noRippleClickable.1
            public final /* synthetic */ boolean $isEnable;
            public final /* synthetic */ Function0<Unit> $onClick;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C35311(boolean z2, Function0<Unit> onClick2) {
                super(3);
                z = z2;
                function0 = onClick2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(1376618216);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1376618216, i, -1, "com.blackhub.bronline.game.core.extension.noRippleClickable.<anonymous> (ComposeExtension.kt:211)");
                }
                composer.startReplaceableGroup(-1072492232);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composer.updateRememberedValue(objRememberedValue);
                }
                MutableInteractionSource mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                composer.endReplaceableGroup();
                boolean z2 = z;
                composer.startReplaceableGroup(-1072492118);
                boolean zChanged = composer.changed(function0);
                final Function0<Unit> function0 = function0;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0<Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$noRippleClickable$1$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            function0.invoke();
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceableGroup();
                Modifier modifierThen = composed.then(ClickableKt.m7803clickableO2vRcR0$default(composed, mutableInteractionSource, null, z2, null, null, (Function0) objRememberedValue2, 24, null));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierThen;
            }
        }, 1, null);
    }

    public static /* synthetic */ Modifier noRippleClickable$default(Modifier modifier, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return noRippleClickable(modifier, z, function0);
    }

    @Composable
    public static final float toVerticalPercentSwDp(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(519005832);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(519005832, i2, -1, "com.blackhub.bronline.game.core.extension.toVerticalPercentSwDp (ComposeExtension.kt:227)");
        }
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).smallestScreenWidthDp) * i) / 100);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fM13666constructorimpl;
    }

    @Composable
    public static final float toHorizontalPercentDp(int i, @Nullable Composer composer, int i2) {
        composer.startReplaceableGroup(-494074758);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-494074758, i2, -1, "com.blackhub.bronline.game.core.extension.toHorizontalPercentDp (ComposeExtension.kt:237)");
        }
        float fM13666constructorimpl = C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(C2046Dp.m13666constructorimpl(((Configuration) composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration())).screenHeightDp) * i) / 100);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return fM13666constructorimpl;
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void IfTrue(@Nullable Boolean bool, @NotNull Function2<? super Composer, ? super Integer, Unit> func, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(func, "func");
        Composer composerStartRestartGroup = composer.startRestartGroup(1878034798);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(func) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1878034798, i2, -1, "com.blackhub.bronline.game.core.extension.IfTrue (ComposeExtension.kt:244)");
            }
            if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                func.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt.IfTrue.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $func;
                public final /* synthetic */ Boolean $this_IfTrue;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C35301(Boolean bool2, Function2<? super Composer, ? super Integer, Unit> func2, int i3) {
                    super(2);
                    bool = bool2;
                    function2 = func2;
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    ComposeExtensionKt.IfTrue(bool, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void IfFalse(@Nullable Boolean bool, @NotNull Function2<? super Composer, ? super Integer, Unit> func, @Nullable Composer composer, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(func, "func");
        Composer composerStartRestartGroup = composer.startRestartGroup(962945985);
        if ((i & 14) == 0) {
            i2 = (composerStartRestartGroup.changed(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(func) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(962945985, i2, -1, "com.blackhub.bronline.game.core.extension.IfFalse (ComposeExtension.kt:252)");
            }
            if (Intrinsics.areEqual(bool, Boolean.FALSE)) {
                func.invoke(composerStartRestartGroup, Integer.valueOf((i2 >> 3) & 14));
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt.IfFalse.1
                public final /* synthetic */ int $$changed;
                public final /* synthetic */ Function2<Composer, Integer, Unit> $func;
                public final /* synthetic */ Boolean $this_IfFalse;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C35291(Boolean bool2, Function2<? super Composer, ? super Integer, Unit> func2, int i3) {
                    super(2);
                    bool = bool2;
                    function2 = func2;
                    i = i3;
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i3) {
                    ComposeExtensionKt.IfFalse(bool, function2, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
                }
            });
        }
    }

    public static /* synthetic */ Modifier shimmerLoadingAnimation$default(Modifier modifier, boolean z, boolean z2, int i, float f, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = false;
        }
        if ((i3 & 2) != 0) {
            z2 = true;
        }
        boolean z3 = z2;
        if ((i3 & 4) != 0) {
            i = 500;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            f = 270.0f;
        }
        float f2 = f;
        if ((i3 & 16) != 0) {
            i2 = 1000;
        }
        return shimmerLoadingAnimation(modifier, z, z3, i4, f2, i2);
    }

    /* compiled from: ComposeExtension.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, m7105d2 = {"<anonymous>", "Landroidx/compose/ui/Modifier;", "invoke", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* renamed from: com.blackhub.bronline.game.core.extension.ComposeExtensionKt$shimmerLoadingAnimation$1 */
    public static final class C35321 extends Lambda implements Function3<Modifier, Composer, Integer, Modifier> {
        public final /* synthetic */ float $angleOfAxisY;
        public final /* synthetic */ int $durationMillis;
        public final /* synthetic */ boolean $isLightModeActive;
        public final /* synthetic */ int $widthOfShadowBrush;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C35321(boolean z, int i, int i2, float f) {
            super(3);
            z = z;
            i = i;
            i = i2;
            f = f;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
            return invoke(modifier, composer, num.intValue());
        }

        @Composable
        @NotNull
        public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
            List listListOf;
            Intrinsics.checkNotNullParameter(composed, "$this$composed");
            composer.startReplaceableGroup(43186338);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(43186338, i, -1, "com.blackhub.bronline.game.core.extension.shimmerLoadingAnimation.<anonymous> (ComposeExtension.kt:271)");
            }
            if (z) {
                long jM11377getWhite0d7_KjU = Color.INSTANCE.m11377getWhite0d7_KjU();
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
            } else {
                long jM11366getBlack0d7_KjU = Color.INSTANCE.m11366getBlack0d7_KjU();
                listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
            }
            List list = listListOf;
            State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("", composer, 6, 0), 0.0f, i + r2, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "Shimmer loading animation", composer, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
            Modifier modifierBackground$default = BackgroundKt.background$default(composed, Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, list, OffsetKt.Offset(stateAnimateFloat.getValue().floatValue() - i, 0.0f), OffsetKt.Offset(stateAnimateFloat.getValue().floatValue(), f), 0, 8, (Object) null), null, 0.0f, 6, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceableGroup();
            return modifierBackground$default;
        }
    }

    @NotNull
    public static final Modifier shimmerLoadingAnimation(@NotNull Modifier modifier, boolean z, boolean z2, int i, float f, int i2) {
        Intrinsics.checkNotNullParameter(modifier, "<this>");
        return !z ? modifier : ComposedModifierKt.composed$default(modifier, null, new Function3<Modifier, Composer, Integer, Modifier>() { // from class: com.blackhub.bronline.game.core.extension.ComposeExtensionKt.shimmerLoadingAnimation.1
            public final /* synthetic */ float $angleOfAxisY;
            public final /* synthetic */ int $durationMillis;
            public final /* synthetic */ boolean $isLightModeActive;
            public final /* synthetic */ int $widthOfShadowBrush;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C35321(boolean z22, int i22, int i3, float f2) {
                super(3);
                z = z22;
                i = i22;
                i = i3;
                f = f2;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier2, Composer composer, Integer num) {
                return invoke(modifier2, composer, num.intValue());
            }

            @Composable
            @NotNull
            public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i3) {
                List listListOf;
                Intrinsics.checkNotNullParameter(composed, "$this$composed");
                composer.startReplaceableGroup(43186338);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(43186338, i3, -1, "com.blackhub.bronline.game.core.extension.shimmerLoadingAnimation.<anonymous> (ComposeExtension.kt:271)");
                }
                if (z) {
                    long jM11377getWhite0d7_KjU = Color.INSTANCE.m11377getWhite0d7_KjU();
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11377getWhite0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
                } else {
                    long jM11366getBlack0d7_KjU = Color.INSTANCE.m11366getBlack0d7_KjU();
                    listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Color[]{Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.5f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.3f, 0.0f, 0.0f, 0.0f, 14, null)), Color.m11330boximpl(Color.m11339copywmQWz5c$default(jM11366getBlack0d7_KjU, 0.0f, 0.0f, 0.0f, 0.0f, 14, null))});
                }
                List list = listListOf;
                State<Float> stateAnimateFloat = InfiniteTransitionKt.animateFloat(InfiniteTransitionKt.rememberInfiniteTransition("", composer, 6, 0), 0.0f, i + r2, AnimationSpecKt.m7688infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween$default(i, 0, EasingKt.getLinearEasing(), 2, null), RepeatMode.Restart, 0L, 4, null), "Shimmer loading animation", composer, InfiniteTransition.$stable | 24624 | (InfiniteRepeatableSpec.$stable << 9), 0);
                Modifier modifierBackground$default = BackgroundKt.background$default(composed, Brush.Companion.m11291linearGradientmHitzGk$default(Brush.INSTANCE, list, OffsetKt.Offset(stateAnimateFloat.getValue().floatValue() - i, 0.0f), OffsetKt.Offset(stateAnimateFloat.getValue().floatValue(), f), 0, 8, (Object) null), null, 0.0f, 6, null);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return modifierBackground$default;
            }
        }, 1, null);
    }

    @NotNull
    public static final AnnotatedString toAnnotatedString(@NotNull Spanned spanned) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        builder.append(spanned.toString());
        Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        for (Object obj : spans) {
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65531, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 2) {
                    builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65527, (DefaultConstructorMarker) null), spanStart, spanEnd);
                } else if (style == 3) {
                    builder.addStyle(new SpanStyle(0L, 0L, FontWeight.INSTANCE.getBold(), FontStyle.m13271boximpl(FontStyle.INSTANCE.m13280getItalic_LCdwA()), (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65523, (DefaultConstructorMarker) null), spanStart, spanEnd);
                }
            } else if (obj instanceof UnderlineSpan) {
                builder.addStyle(new SpanStyle(0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 61439, (DefaultConstructorMarker) null), spanStart, spanEnd);
            } else if (obj instanceof ForegroundColorSpan) {
                builder.addStyle(new SpanStyle(ColorKt.Color(((ForegroundColorSpan) obj).getForegroundColor()), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawStyle) null, 65534, (DefaultConstructorMarker) null), spanStart, spanEnd);
            }
        }
        return builder.toAnnotatedString();
    }
}
