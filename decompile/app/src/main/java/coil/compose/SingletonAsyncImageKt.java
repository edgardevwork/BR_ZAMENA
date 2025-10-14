package coil.compose;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.Modifier;
import androidx.compose.p003ui.graphics.ColorFilter;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.compose.AsyncImagePainter;
import com.blackhub.bronline.game.core.constants.Other;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingletonAsyncImage.kt */
@Metadata(m7104d1 = {"\u0000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0095\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001aÓ\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\"\u0010#\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006$"}, m7105d2 = {"AsyncImage", "", "model", "", "contentDescription", "", "modifier", "Landroidx/compose/ui/Modifier;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "alignment", "Landroidx/compose/ui/Alignment;", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "alpha", "", "colorFilter", "Landroidx/compose/ui/graphics/ColorFilter;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "AsyncImage-3HmZ8SU", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;II)V", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", Other.FALLBACK, "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "AsyncImage-ylYTKUw", "(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment;Landroidx/compose/ui/layout/ContentScale;FLandroidx/compose/ui/graphics/ColorFilter;ILandroidx/compose/runtime/Composer;III)V", "coil-compose-singleton_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class SingletonAsyncImageKt {
    @Composable
    /* renamed from: AsyncImage-ylYTKUw, reason: not valid java name */
    public static final void m14280AsyncImageylYTKUw(@Nullable Object obj, @Nullable String str, @Nullable Modifier modifier, @Nullable Painter painter, @Nullable Painter painter2, @Nullable Painter painter3, @Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function12, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function13, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, int i2, int i3, int i4) {
        composer.startReplaceableGroup(2027616330);
        Modifier modifier2 = (i4 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Painter painter4 = (i4 & 8) != 0 ? null : painter;
        Painter painter5 = (i4 & 16) != 0 ? null : painter2;
        Painter painter6 = (i4 & 32) != 0 ? painter5 : painter3;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i4 & 64) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i4 & 128) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i4 & 256) != 0 ? null : function13;
        Alignment center = (i4 & 512) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i4 & 1024) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i4 & 2048) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i4 & 4096) != 0 ? null : colorFilter;
        int iM11891getDefaultFilterQualityfv9h1I = (i4 & 8192) != 0 ? DrawScope.INSTANCE.m11891getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2027616330, i2, i3, "coil.compose.AsyncImage (SingletonAsyncImage.kt:60)");
        }
        int i5 = i2 << 3;
        int i6 = i3 << 3;
        AsyncImageKt.m14253AsyncImageQ4Kwu38(obj, str, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer, 6), modifier2, painter4, painter5, painter6, function14, function15, function16, center, fit, f2, colorFilter2, iM11891getDefaultFilterQualityfv9h1I, composer, (i2 & 112) | 2392584 | (i5 & 7168) | (29360128 & i5) | (234881024 & i5) | (i5 & 1879048192), ((i2 >> 27) & 14) | (i6 & 112) | (i6 & 896) | (i6 & 7168) | (i6 & 57344), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    /* renamed from: AsyncImage-3HmZ8SU, reason: not valid java name */
    public static final void m14279AsyncImage3HmZ8SU(@Nullable Object obj, @Nullable String str, @Nullable Modifier modifier, @Nullable Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, @Nullable Function1<? super AsyncImagePainter.State, Unit> function12, @Nullable Alignment alignment, @Nullable ContentScale contentScale, float f, @Nullable ColorFilter colorFilter, int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-941517612);
        Modifier modifier2 = (i3 & 4) != 0 ? Modifier.INSTANCE : modifier;
        Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> defaultTransform = (i3 & 8) != 0 ? AsyncImagePainter.INSTANCE.getDefaultTransform() : function1;
        Function1<? super AsyncImagePainter.State, Unit> function13 = (i3 & 16) != 0 ? null : function12;
        Alignment center = (i3 & 32) != 0 ? Alignment.INSTANCE.getCenter() : alignment;
        ContentScale fit = (i3 & 64) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        float f2 = (i3 & 128) != 0 ? 1.0f : f;
        ColorFilter colorFilter2 = (i3 & 256) != 0 ? null : colorFilter;
        int iM11891getDefaultFilterQualityfv9h1I = (i3 & 512) != 0 ? DrawScope.INSTANCE.m11891getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-941517612, i2, -1, "coil.compose.AsyncImage (SingletonAsyncImage.kt:113)");
        }
        int i4 = i2 << 3;
        AsyncImageKt.m14252AsyncImageMvsnxeU(obj, str, ImageLoaderProvidableCompositionLocal.getCurrent(LocalImageLoaderKt.getLocalImageLoader(), composer, 6), modifier2, defaultTransform, function13, center, fit, f2, colorFilter2, iM11891getDefaultFilterQualityfv9h1I, composer, (i2 & 112) | 520 | (i4 & 7168) | (57344 & i4) | (458752 & i4) | (3670016 & i4) | (29360128 & i4) | (234881024 & i4) | (i4 & 1879048192), (i2 >> 27) & 14, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
