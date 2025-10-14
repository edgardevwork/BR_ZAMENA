package com.airbnb.lottie.compose;

import android.graphics.Typeface;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.layout.ScaleFactor;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.media3.extractor.flv.ScriptTagPayloadReader;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.RenderMode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LottiePainter.kt */
@Metadata(m7104d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0097\u0001\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u00020\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0082\u0002ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m7105d2 = {"rememberLottiePainter", "Lcom/airbnb/lottie/compose/LottiePainter;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "progress", "", "outlineMasksAndMattes", "", "applyOpacityToLayers", "enableMergePaths", "renderMode", "Lcom/airbnb/lottie/RenderMode;", "maintainOriginalImageBounds", "dynamicProperties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "clipToCompositionBounds", "clipTextToBoundingBox", "fontMap", "", "", "Landroid/graphics/Typeface;", "asyncUpdates", "Lcom/airbnb/lottie/AsyncUpdates;", "(Lcom/airbnb/lottie/LottieComposition;FZZZLcom/airbnb/lottie/RenderMode;ZLcom/airbnb/lottie/compose/LottieDynamicProperties;ZZLjava/util/Map;Lcom/airbnb/lottie/AsyncUpdates;Landroidx/compose/runtime/Composer;III)Lcom/airbnb/lottie/compose/LottiePainter;", ScriptTagPayloadReader.KEY_TIMES, "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "scale", "Landroidx/compose/ui/layout/ScaleFactor;", "times-UQTWf7w", "(JJ)J", "lottie-compose_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nLottiePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LottiePainter.kt\ncom/airbnb/lottie/compose/LottiePainterKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,133:1\n1116#2,6:134\n*S KotlinDebug\n*F\n+ 1 LottiePainter.kt\ncom/airbnb/lottie/compose/LottiePainterKt\n*L\n42#1:134,6\n*E\n"})
/* loaded from: classes.dex */
public final class LottiePainterKt {
    @Composable
    @NotNull
    public static final LottiePainter rememberLottiePainter(@Nullable LottieComposition lottieComposition, float f, boolean z, boolean z2, boolean z3, @Nullable RenderMode renderMode, boolean z4, @Nullable LottieDynamicProperties lottieDynamicProperties, boolean z5, boolean z6, @Nullable Map<String, ? extends Typeface> map, @Nullable AsyncUpdates asyncUpdates, @Nullable Composer composer, int i, int i2, int i3) {
        AsyncUpdates asyncUpdates2;
        composer.startReplaceableGroup(-1760390310);
        LottieComposition lottieComposition2 = (i3 & 1) != 0 ? null : lottieComposition;
        float f2 = (i3 & 2) != 0 ? 0.0f : f;
        boolean z7 = (i3 & 4) != 0 ? false : z;
        boolean z8 = (i3 & 8) != 0 ? false : z2;
        boolean z9 = (i3 & 16) != 0 ? false : z3;
        RenderMode renderMode2 = (i3 & 32) != 0 ? RenderMode.AUTOMATIC : renderMode;
        boolean z10 = (i3 & 64) != 0 ? false : z4;
        LottieDynamicProperties lottieDynamicProperties2 = (i3 & 128) != 0 ? null : lottieDynamicProperties;
        boolean z11 = (i3 & 256) != 0 ? true : z5;
        boolean z12 = (i3 & 512) == 0 ? z6 : false;
        Map<String, ? extends Typeface> map2 = (i3 & 1024) == 0 ? map : null;
        AsyncUpdates asyncUpdates3 = (i3 & 2048) != 0 ? AsyncUpdates.AUTOMATIC : asyncUpdates;
        if (ComposerKt.isTraceInProgress()) {
            asyncUpdates2 = asyncUpdates3;
            ComposerKt.traceEventStart(-1760390310, i, i2, "com.airbnb.lottie.compose.rememberLottiePainter (LottiePainter.kt:40)");
        } else {
            asyncUpdates2 = asyncUpdates3;
        }
        composer.startReplaceableGroup(1356844485);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LottiePainter(null, 0.0f, false, false, false, null, false, null, false, false, null, null, UnixStat.PERM_MASK, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        LottiePainter lottiePainter = (LottiePainter) objRememberedValue;
        composer.endReplaceableGroup();
        lottiePainter.setComposition$lottie_compose_release(lottieComposition2);
        lottiePainter.setProgress$lottie_compose_release(f2);
        lottiePainter.setOutlineMasksAndMattes$lottie_compose_release(z7);
        lottiePainter.setApplyOpacityToLayers$lottie_compose_release(z8);
        lottiePainter.setEnableMergePaths$lottie_compose_release(z9);
        lottiePainter.setRenderMode$lottie_compose_release(renderMode2);
        lottiePainter.setMaintainOriginalImageBounds$lottie_compose_release(z10);
        lottiePainter.setDynamicProperties$lottie_compose_release(lottieDynamicProperties2);
        lottiePainter.setClipToCompositionBounds$lottie_compose_release(z11);
        lottiePainter.setClipTextToBoundingBox$lottie_compose_release(z12);
        lottiePainter.setFontMap$lottie_compose_release(map2);
        lottiePainter.setAsyncUpdates$lottie_compose_release(asyncUpdates2);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottiePainter;
    }

    /* renamed from: times-UQTWf7w, reason: not valid java name */
    public static final long m14351timesUQTWf7w(long j, long j2) {
        return IntSizeKt.IntSize((int) (Size.m11168getWidthimpl(j) * ScaleFactor.m12680getScaleXimpl(j2)), (int) (Size.m11165getHeightimpl(j) * ScaleFactor.m12681getScaleYimpl(j2)));
    }
}
