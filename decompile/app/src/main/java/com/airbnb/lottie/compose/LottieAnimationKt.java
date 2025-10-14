package com.airbnb.lottie.compose;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Typeface;
import androidx.annotation.FloatRange;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.geometry.SizeKt;
import androidx.compose.p003ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.p003ui.graphics.Canvas;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.layout.ScaleFactor;
import androidx.compose.p003ui.unit.IntOffset;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.RenderMode;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottieAnimation.kt */
@Metadata(m7104d1 = {"\u0000z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aÁ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\b\b\u0002\u0010\u001e\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u001f\u001añ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\n2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\b\b\u0002\u0010$\u001a\u00020\u00062\b\b\u0002\u0010%\u001a\u00020&2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010'\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00192\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010(\u001a\u009b\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\u001dH\u0007¢\u0006\u0002\u0010)\u001a\u001f\u0010*\u001a\u00020+*\u00020,2\u0006\u0010-\u001a\u00020.H\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b/\u00100\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00061²\u0006\f\u00102\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0004\u001a\u00020\u0006X\u008a\u0084\u0002"}, m7105d2 = {"LottieAnimation", "", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "Lkotlin/Function0;", "", "modifier", "Landroidx/compose/ui/Modifier;", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "clipToCompositionBounds", "clipTextToBoundingBox", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "safeMode", "(Lcom/airbnb/lottie/LottieComposition;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;ZLandroidx/compose/runtime/Composer;III)V", "isPlaying", "restartOnPlay", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "iterations", "", "reverseOnRepeat", "(Lcom/airbnb/lottie/LottieComposition;Landroidx/compose/ui/Modifier;ZZLcom/airbnb/lottie/compose/LottieClipSpec;FIZZZLcom/airbnb/lottie/RenderMode;ZZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLjava/util/Map;ZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;IIII)V", "(Lcom/airbnb/lottie/LottieComposition;FLandroidx/compose/ui/Modifier;ZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;ZZLcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)V", ScriptTagPayloadReader.KEY_TIMES, "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release", "setDynamicProperties"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLottieAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottieAnimation.kt\ncom/airbnb/lottie/compose/LottieAnimationKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,245:1\n1116#2,6:246\n1116#2,6:252\n1116#2,6:258\n1116#2,6:264\n1116#2,6:270\n81#3:276\n107#3,2:277\n81#3:279\n*S KotlinDebug\n*F\n+ 1 LottieAnimation.kt\ncom/airbnb/lottie/compose/LottieAnimationKt\n*L\n96#1:246,6\n97#1:252,6\n98#1:258,6\n165#1:264,6\n224#1:270,6\n98#1:276\n98#1:277,2\n213#1:279\n*E\n"})
/* loaded from: classes.dex */
public final class LottieAnimationKt {
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @JvmOverloads
    public static final void LottieAnimation(@Nullable final LottieComposition lottieComposition, @NotNull final Function0<Float> progress, @Nullable Modifier modifier, boolean z, boolean z2, boolean z3, @Nullable RenderMode renderMode, boolean z4, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable Alignment alignment, @Nullable ContentScale contentScale, boolean z5, boolean z6, @Nullable Map<String, ? extends Typeface> map, @Nullable AsyncUpdates asyncUpdates, boolean z7, @Nullable Composer composer, final int i, final int i2, final int i3) {
        Intrinsics.checkNotNullParameter(progress, "progress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-674272918);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        boolean z8 = (i3 & 8) != 0 ? false : z;
        boolean z9 = (i3 & 16) != 0 ? false : z2;
        boolean z10 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z11 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i3 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        boolean z12 = (i3 & 2048) != 0 ? true : z5;
        boolean z13 = (i3 & 4096) != 0 ? false : z6;
        Map<String, ? extends Typeface> map2 = (i3 & 8192) != 0 ? null : map;
        AsyncUpdates asyncUpdates2 = (i3 & 16384) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        boolean z14 = (32768 & i3) != 0 ? false : z7;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-674272918, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:94)");
        }
        composerStartRestartGroup.startReplaceableGroup(185152052);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new LottieDrawable();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final LottieDrawable lottieDrawable = (LottieDrawable) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152099);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Matrix();
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final Matrix matrix = (Matrix) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152179);
        boolean zChanged = composerStartRestartGroup.changed(lottieComposition);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        final MutableState mutableState = (MutableState) objRememberedValue3;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(185152231);
        if (lottieComposition == null || lottieComposition.getDuration() == 0.0f) {
            final Modifier modifier3 = modifier2;
            BoxKt.Box(modifier3, composerStartRestartGroup, (i >> 6) & 14);
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                final boolean z15 = z8;
                final boolean z16 = z9;
                final boolean z17 = z10;
                final RenderMode renderMode3 = renderMode2;
                final boolean z18 = z11;
                final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
                final Alignment alignment2 = center;
                final ContentScale contentScale2 = fit;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final Map<String, ? extends Typeface> map3 = map2;
                final AsyncUpdates asyncUpdates3 = asyncUpdates2;
                final boolean z21 = z14;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@Nullable Composer composer2, int i4) {
                        LottieAnimationKt.LottieAnimation(lottieComposition, progress, modifier3, z15, z16, z17, renderMode3, z18, lottieDynamicProperties3, alignment2, contentScale2, z19, z20, map3, asyncUpdates3, z21, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                    }
                });
                return;
            }
            return;
        }
        composerStartRestartGroup.endReplaceableGroup();
        final Rect bounds = lottieComposition.getBounds();
        final ContentScale contentScale3 = fit;
        final Alignment alignment3 = center;
        final boolean z22 = z10;
        final boolean z23 = z14;
        final RenderMode renderMode4 = renderMode2;
        final AsyncUpdates asyncUpdates4 = asyncUpdates2;
        final Modifier modifier4 = modifier2;
        final Map<String, ? extends Typeface> map4 = map2;
        final LottieDynamicProperties lottieDynamicProperties4 = lottieDynamicProperties2;
        final boolean z24 = z8;
        final boolean z25 = z9;
        final boolean z26 = z11;
        final boolean z27 = z12;
        final boolean z28 = z13;
        CanvasKt.Canvas(LottieAnimationSizeNodeKt.lottieSize(modifier2, bounds.width(), bounds.height()), new Function1<DrawScope, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                invoke2(drawScope);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull DrawScope Canvas) {
                Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
                Rect rect = bounds;
                ContentScale contentScale4 = contentScale3;
                Alignment alignment4 = alignment3;
                Matrix matrix2 = matrix;
                LottieDrawable lottieDrawable2 = lottieDrawable;
                boolean z29 = z22;
                boolean z30 = z23;
                RenderMode renderMode5 = renderMode4;
                AsyncUpdates asyncUpdates5 = asyncUpdates4;
                LottieComposition lottieComposition2 = lottieComposition;
                Map<String, Typeface> map5 = map4;
                LottieDynamicProperties lottieDynamicProperties5 = lottieDynamicProperties4;
                boolean z31 = z24;
                boolean z32 = z25;
                boolean z33 = z26;
                boolean z34 = z27;
                boolean z35 = z28;
                Function0<Float> function0 = progress;
                MutableState<LottieDynamicProperties> mutableState2 = mutableState;
                Canvas canvas = Canvas.getDrawContext().getCanvas();
                long jSize = SizeKt.Size(rect.width(), rect.height());
                long jIntSize = IntSizeKt.IntSize(MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(Canvas.mo11889getSizeNHjbRc())), MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(Canvas.mo11889getSizeNHjbRc())));
                long jMo12601computeScaleFactorH7hwNQA = contentScale4.mo12601computeScaleFactorH7hwNQA(jSize, Canvas.mo11889getSizeNHjbRc());
                long jMo10976alignKFBX0sM = alignment4.mo10976alignKFBX0sM(LottieAnimationKt.m14307timesUQTWf7w(jSize, jMo12601computeScaleFactorH7hwNQA), jIntSize, Canvas.getLayoutDirection());
                matrix2.reset();
                matrix2.preTranslate(IntOffset.m13794getXimpl(jMo10976alignKFBX0sM), IntOffset.m13795getYimpl(jMo10976alignKFBX0sM));
                matrix2.preScale(ScaleFactor.m12680getScaleXimpl(jMo12601computeScaleFactorH7hwNQA), ScaleFactor.m12681getScaleYimpl(jMo12601computeScaleFactorH7hwNQA));
                lottieDrawable2.enableMergePathsForKitKatAndAbove(z29);
                lottieDrawable2.setSafeMode(z30);
                lottieDrawable2.setRenderMode(renderMode5);
                lottieDrawable2.setAsyncUpdates(asyncUpdates5);
                lottieDrawable2.setComposition(lottieComposition2);
                lottieDrawable2.setFontMap(map5);
                if (lottieDynamicProperties5 != LottieAnimationKt.LottieAnimation$lambda$3(mutableState2)) {
                    LottieDynamicProperties lottieDynamicPropertiesLottieAnimation$lambda$3 = LottieAnimationKt.LottieAnimation$lambda$3(mutableState2);
                    if (lottieDynamicPropertiesLottieAnimation$lambda$3 != null) {
                        lottieDynamicPropertiesLottieAnimation$lambda$3.removeFrom$lottie_compose_release(lottieDrawable2);
                    }
                    if (lottieDynamicProperties5 != null) {
                        lottieDynamicProperties5.addTo$lottie_compose_release(lottieDrawable2);
                    }
                    LottieAnimationKt.LottieAnimation$lambda$4(mutableState2, lottieDynamicProperties5);
                }
                lottieDrawable2.setOutlineMasksAndMattes(z31);
                lottieDrawable2.setApplyingOpacityToLayersEnabled(z32);
                lottieDrawable2.setMaintainOriginalImageBounds(z33);
                lottieDrawable2.setClipToCompositionBounds(z34);
                lottieDrawable2.setClipTextToBoundingBox(z35);
                lottieDrawable2.setProgress(function0.invoke().floatValue());
                lottieDrawable2.setBounds(0, 0, rect.width(), rect.height());
                lottieDrawable2.draw(AndroidCanvas_androidKt.getNativeCanvas(canvas), matrix2);
            }
        }, composerStartRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final boolean z29 = z8;
            final boolean z30 = z9;
            final boolean z31 = z10;
            final RenderMode renderMode5 = renderMode2;
            final boolean z32 = z11;
            final LottieDynamicProperties lottieDynamicProperties5 = lottieDynamicProperties2;
            final Alignment alignment4 = center;
            final ContentScale contentScale4 = fit;
            final boolean z33 = z12;
            final boolean z34 = z13;
            final Map<String, ? extends Typeface> map5 = map2;
            final AsyncUpdates asyncUpdates5 = asyncUpdates2;
            final boolean z35 = z14;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    LottieAnimationKt.LottieAnimation(lottieComposition, progress, modifier4, z29, z30, z31, renderMode5, z32, lottieDynamicProperties5, alignment4, contentScale4, z33, z34, map5, asyncUpdates5, z35, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(message = "Pass progress as a lambda instead of a float. This overload will be removed in the next release.")
    @Composable
    public static final void LottieAnimation(@Nullable final LottieComposition lottieComposition, @FloatRange(from = 0.0d, m9to = 1.0d) final float f, @Nullable Modifier modifier, boolean z, boolean z2, boolean z3, @Nullable RenderMode renderMode, boolean z4, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable Alignment alignment, @Nullable ContentScale contentScale, boolean z5, boolean z6, @Nullable AsyncUpdates asyncUpdates, @Nullable Composer composer, final int i, final int i2, final int i3) {
        Composer composerStartRestartGroup = composer.startRestartGroup(847508402);
        final Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z7 = (i3 & 8) != 0 ? false : z;
        boolean z8 = (i3 & 16) != 0 ? false : z2;
        boolean z9 = (i3 & 32) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 64) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z10 = (i3 & 128) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 256) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i3 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        boolean z11 = (i3 & 2048) != 0 ? true : z5;
        boolean z12 = (i3 & 4096) != 0 ? false : z6;
        AsyncUpdates asyncUpdates2 = (i3 & 8192) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(847508402, i, i2, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:161)");
        }
        composerStartRestartGroup.startReplaceableGroup(185155112);
        boolean z13 = (((i & 112) ^ 48) > 32 && composerStartRestartGroup.changed(f)) || (i & 48) == 32;
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (z13 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$4$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(f);
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        composerStartRestartGroup.endReplaceableGroup();
        LottieAnimation(lottieComposition, (Function0) objRememberedValue, modifier2, z7, z8, z9, renderMode2, z10, lottieDynamicProperties2, center, fit, z11, false, null, asyncUpdates2, z12, composerStartRestartGroup, (i & 896) | 134217736 | (i & 7168) | (i & 57344) | (i & 458752) | (i & 3670016) | (i & 29360128) | (i & 1879048192), (i2 & 126) | ((i2 << 3) & 57344) | ((i2 << 9) & 458752), 12288);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z14 = z8;
            final boolean z15 = z9;
            final RenderMode renderMode3 = renderMode2;
            final boolean z16 = z10;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            final Alignment alignment2 = center;
            final ContentScale contentScale2 = fit;
            final boolean z17 = z11;
            final boolean z18 = z12;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i4) {
                    LottieAnimationKt.LottieAnimation(lottieComposition, f, modifier2, z7, z14, z15, renderMode3, z16, lottieDynamicProperties3, alignment2, contentScale2, z17, z18, asyncUpdates3, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @JvmOverloads
    public static final void LottieAnimation(@Nullable final LottieComposition lottieComposition, @Nullable Modifier modifier, boolean z, boolean z2, @Nullable LottieClipSpec lottieClipSpec, float f, int i, boolean z3, boolean z4, boolean z5, @Nullable RenderMode renderMode, boolean z6, boolean z7, @Nullable LottieDynamicProperties lottieDynamicProperties, @Nullable Alignment alignment, @Nullable ContentScale contentScale, boolean z8, boolean z9, @Nullable Map<String, ? extends Typeface> map, boolean z10, @Nullable AsyncUpdates asyncUpdates, @Nullable Composer composer, final int i2, final int i3, final int i4, final int i5) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1151869807);
        final Modifier modifier2 = (i5 & 2) != 0 ? Modifier.INSTANCE : modifier;
        final boolean z11 = (i5 & 4) != 0 ? true : z;
        boolean z12 = (i5 & 8) != 0 ? true : z2;
        LottieClipSpec lottieClipSpec2 = (i5 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i5 & 32) != 0 ? 1.0f : f;
        int i6 = (i5 & 64) != 0 ? 1 : i;
        boolean z13 = (i5 & 128) != 0 ? false : z3;
        boolean z14 = (i5 & 256) != 0 ? false : z4;
        boolean z15 = (i5 & 512) != 0 ? false : z5;
        RenderMode renderMode2 = (i5 & 1024) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z16 = (i5 & 2048) != 0 ? false : z6;
        boolean z17 = (i5 & 4096) != 0 ? false : z7;
        LottieDynamicProperties lottieDynamicProperties2 = (i5 & 8192) != 0 ? null : lottieDynamicProperties;
        Alignment center = (i5 & 16384) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (32768 & i5) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        boolean z18 = (65536 & i5) != 0 ? true : z8;
        boolean z19 = (131072 & i5) != 0 ? false : z9;
        Map<String, ? extends Typeface> map2 = (262144 & i5) != 0 ? null : map;
        boolean z20 = (524288 & i5) != 0 ? false : z10;
        AsyncUpdates asyncUpdates2 = (1048576 & i5) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1151869807, i2, i3, "com.airbnb.lottie.compose.LottieAnimation (LottieAnimation.kt:211)");
        }
        int i7 = i2 >> 3;
        final LottieAnimationState lottieAnimationStateAnimateLottieCompositionAsState = AnimateLottieCompositionAsStateKt.animateLottieCompositionAsState(lottieComposition, z11, z12, z16, lottieClipSpec2, f2, i6, null, false, false, composerStartRestartGroup, (i7 & 896) | (i7 & 112) | 8 | ((i3 << 6) & 7168) | (i2 & 57344) | (i2 & 458752) | (i2 & 3670016), 896);
        composerStartRestartGroup.startReplaceableGroup(185157078);
        boolean zChanged = composerStartRestartGroup.changed(lottieAnimationStateAnimateLottieCompositionAsState);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<Float>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt$LottieAnimation$6$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @NotNull
                public final Float invoke() {
                    return Float.valueOf(LottieAnimationKt.LottieAnimation$lambda$6(lottieAnimationStateAnimateLottieCompositionAsState));
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        Function0 function0 = (Function0) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        int i8 = i2 >> 12;
        int i9 = ((i2 << 3) & 896) | 134217736 | (i8 & 7168) | (i8 & 57344) | (i8 & 458752) | ((i3 << 18) & 3670016);
        int i10 = i3 << 15;
        int i11 = i9 | (29360128 & i10) | (i10 & 1879048192);
        int i12 = i3 >> 15;
        LottieAnimation(lottieComposition, function0, modifier2, z13, z14, z15, renderMode2, z17, lottieDynamicProperties2, center, fit, z18, z19, map2, asyncUpdates2, z20, composerStartRestartGroup, i11, (i12 & 896) | (i12 & 14) | 4096 | (i12 & 112) | (57344 & (i4 << 12)) | ((i3 >> 12) & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final boolean z21 = z12;
            final LottieClipSpec lottieClipSpec3 = lottieClipSpec2;
            final float f3 = f2;
            final int i13 = i6;
            final boolean z22 = z13;
            final boolean z23 = z14;
            final boolean z24 = z15;
            final RenderMode renderMode3 = renderMode2;
            final boolean z25 = z16;
            final boolean z26 = z17;
            final LottieDynamicProperties lottieDynamicProperties3 = lottieDynamicProperties2;
            final Alignment alignment2 = center;
            final ContentScale contentScale2 = fit;
            final boolean z27 = z18;
            final boolean z28 = z19;
            final Map<String, ? extends Typeface> map3 = map2;
            final boolean z29 = z20;
            final AsyncUpdates asyncUpdates3 = asyncUpdates2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationKt.LottieAnimation.7
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(@Nullable Composer composer2, int i14) {
                    LottieAnimationKt.LottieAnimation(lottieComposition, modifier2, z11, z21, lottieClipSpec3, f3, i13, z22, z23, z24, renderMode3, z25, z26, lottieDynamicProperties3, alignment2, contentScale2, z27, z28, map3, z29, asyncUpdates3, composer2, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), RecomposeScopeImplKt.updateChangedFlags(i3), RecomposeScopeImplKt.updateChangedFlags(i4), i5);
                }
            });
        }
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m14307timesUQTWf7w(long j, long j2) {
        return IntSizeKt.IntSize((int) (Size.m11168getWidthimpl(j) * ScaleFactor.m12680getScaleXimpl(j2)), (int) (Size.m11165getHeightimpl(j) * ScaleFactor.m12681getScaleYimpl(j2)));
    }

    public static final LottieDynamicProperties LottieAnimation$lambda$3(MutableState<LottieDynamicProperties> mutableState) {
        return mutableState.getValue();
    }

    public static final void LottieAnimation$lambda$4(MutableState<LottieDynamicProperties> mutableState, LottieDynamicProperties lottieDynamicProperties) {
        mutableState.setValue(lottieDynamicProperties);
    }

    public static final float LottieAnimation$lambda$6(LottieAnimationState lottieAnimationState) {
        return lottieAnimationState.getValue().floatValue();
    }
}
