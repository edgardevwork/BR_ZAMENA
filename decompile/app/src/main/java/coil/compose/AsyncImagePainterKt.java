package coil.compose;

import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.ImageBitmap;
import androidx.compose.p003ui.graphics.drawscope.DrawScope;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.graphics.vector.ImageVector;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.platform.InspectionModeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.size.Dimension;
import coil.size.Dimensions;
import coil.transition.TransitionTarget;
import com.blackhub.bronline.game.core.constants.Other;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AsyncImagePainter.kt */
@Metadata(m7104d1 = {"\u0000}\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0001\u001ai\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f2\u0016\b\u0002\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a§\u0001\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u001a\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\b\b\u0002\u0010)\u001a\u00020(H\u0002\u001a\u0010\u0010*\u001a\u00020\u00122\u0006\u0010+\u001a\u00020,H\u0002\u001a\u001b\u0010-\u001a\u0004\u0018\u00010.*\u00020\u0005H\u0002ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b/\u00100\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u001b\u0010\u0003\u001a\u00020\u0004*\u00020\u00058BX\u0082\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u00061"}, m7105d2 = {"fakeTransitionTarget", "coil/compose/AsyncImagePainterKt$fakeTransitionTarget$1", "Lcoil/compose/AsyncImagePainterKt$fakeTransitionTarget$1;", "isPositive", "", "Landroidx/compose/ui/geometry/Size;", "isPositive-uvyYCjk", "(J)Z", "rememberAsyncImagePainter", "Lcoil/compose/AsyncImagePainter;", "model", "", "imageLoader", "Lcoil/ImageLoader;", "transform", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "onState", "", "contentScale", "Landroidx/compose/ui/layout/ContentScale;", "filterQuality", "Landroidx/compose/ui/graphics/FilterQuality;", "rememberAsyncImagePainter-5jETZwI", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", Other.FALLBACK, "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "rememberAsyncImagePainter-3HmZ8SU", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/graphics/painter/Painter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/layout/ContentScale;ILandroidx/compose/runtime/Composer;II)Lcoil/compose/AsyncImagePainter;", "unsupportedData", "", "name", "", "description", "validateRequest", "request", "Lcoil/request/ImageRequest;", "toSizeOrNull", "Lcoil/size/Size;", "toSizeOrNull-uvyYCjk", "(J)Lcoil/size/Size;", "coil-compose-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nAsyncImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,413:1\n25#2:414\n1097#3,6:415\n76#4:421\n1#5:422\n159#6:423\n*S KotlinDebug\n*F\n+ 1 AsyncImagePainter.kt\ncoil/compose/AsyncImagePainterKt\n*L\n141#1:414\n141#1:415,6\n146#1:421\n401#1:423\n*E\n"})
/* loaded from: classes3.dex */
public final class AsyncImagePainterKt {

    @NotNull
    public static final AsyncImagePainterKt$fakeTransitionTarget$1 fakeTransitionTarget = new TransitionTarget() { // from class: coil.compose.AsyncImagePainterKt$fakeTransitionTarget$1
        @Override // coil.transition.TransitionTarget
        @Nullable
        public Drawable getDrawable() {
            return null;
        }

        @Override // coil.transition.TransitionTarget
        public /* bridge */ /* synthetic */ View getView() {
            return (View) m14263getView();
        }

        @NotNull
        /* renamed from: getView, reason: collision with other method in class */
        public Void m14263getView() {
            throw new UnsupportedOperationException();
        }
    };

    @Composable
    @NotNull
    /* renamed from: rememberAsyncImagePainter-3HmZ8SU */
    public static final AsyncImagePainter m14260rememberAsyncImagePainter3HmZ8SU(@Nullable Object obj, @NotNull ImageLoader imageLoader, @Nullable Painter painter, @Nullable Painter painter2, @Nullable Painter painter3, @Nullable Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable Function1<? super AsyncImagePainter.State.Success, Unit> function12, @Nullable Function1<? super AsyncImagePainter.State.Error, Unit> function13, @Nullable ContentScale contentScale, int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(2140758544);
        Painter painter4 = (i3 & 4) != 0 ? null : painter;
        Painter painter5 = (i3 & 8) != 0 ? null : painter2;
        Painter painter6 = (i3 & 16) != 0 ? painter5 : painter3;
        Function1<? super AsyncImagePainter.State.Loading, Unit> function14 = (i3 & 32) != 0 ? null : function1;
        Function1<? super AsyncImagePainter.State.Success, Unit> function15 = (i3 & 64) != 0 ? null : function12;
        Function1<? super AsyncImagePainter.State.Error, Unit> function16 = (i3 & 128) == 0 ? function13 : null;
        ContentScale fit = (i3 & 256) != 0 ? ContentScale.INSTANCE.getFit() : contentScale;
        int iM11891getDefaultFilterQualityfv9h1I = (i3 & 512) != 0 ? DrawScope.INSTANCE.m11891getDefaultFilterQualityfv9h1I() : i;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2140758544, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:95)");
        }
        int i4 = i2 >> 12;
        AsyncImagePainter asyncImagePainterM14261rememberAsyncImagePainter5jETZwI = m14261rememberAsyncImagePainter5jETZwI(obj, imageLoader, UtilsKt.transformOf(painter4, painter5, painter6), UtilsKt.onStateOf(function14, function15, function16), fit, iM11891getDefaultFilterQualityfv9h1I, composer, (57344 & i4) | 72 | (i4 & 458752), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asyncImagePainterM14261rememberAsyncImagePainter5jETZwI;
    }

    @Composable
    @NotNull
    /* renamed from: rememberAsyncImagePainter-5jETZwI */
    public static final AsyncImagePainter m14261rememberAsyncImagePainter5jETZwI(@Nullable Object obj, @NotNull ImageLoader imageLoader, @Nullable Function1<? super AsyncImagePainter.State, ? extends AsyncImagePainter.State> function1, @Nullable Function1<? super AsyncImagePainter.State, Unit> function12, @Nullable ContentScale contentScale, int i, @Nullable Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(-2020614074);
        if ((i3 & 4) != 0) {
            function1 = AsyncImagePainter.INSTANCE.getDefaultTransform();
        }
        if ((i3 & 8) != 0) {
            function12 = null;
        }
        if ((i3 & 16) != 0) {
            contentScale = ContentScale.INSTANCE.getFit();
        }
        if ((i3 & 32) != 0) {
            i = DrawScope.INSTANCE.m11891getDefaultFilterQualityfv9h1I();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2020614074, i2, -1, "coil.compose.rememberAsyncImagePainter (AsyncImagePainter.kt:136)");
        }
        ImageRequest imageRequestRequestOf = UtilsKt.requestOf(obj, composer, 8);
        validateRequest(imageRequestRequestOf);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new AsyncImagePainter(imageRequestRequestOf, imageLoader);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        AsyncImagePainter asyncImagePainter = (AsyncImagePainter) objRememberedValue;
        asyncImagePainter.setTransform$coil_compose_base_release(function1);
        asyncImagePainter.setOnState$coil_compose_base_release(function12);
        asyncImagePainter.setContentScale$coil_compose_base_release(contentScale);
        asyncImagePainter.m14257setFilterQualityvDHp3xo$coil_compose_base_release(i);
        asyncImagePainter.setPreview$coil_compose_base_release(((Boolean) composer.consume(InspectionModeKt.getLocalInspectionMode())).booleanValue());
        asyncImagePainter.setImageLoader$coil_compose_base_release(imageLoader);
        asyncImagePainter.setRequest$coil_compose_base_release(imageRequestRequestOf);
        asyncImagePainter.onRemembered();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return asyncImagePainter;
    }

    public static final void validateRequest(ImageRequest imageRequest) {
        Object data = imageRequest.getData();
        if (data instanceof ImageRequest.Builder) {
            unsupportedData("ImageRequest.Builder", "Did you forget to call ImageRequest.Builder.build()?");
            throw new KotlinNothingValueException();
        }
        if (data instanceof ImageBitmap) {
            unsupportedData$default("ImageBitmap", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (data instanceof ImageVector) {
            unsupportedData$default("ImageVector", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (data instanceof Painter) {
            unsupportedData$default("Painter", null, 2, null);
            throw new KotlinNothingValueException();
        }
        if (imageRequest.getTarget() != null) {
            throw new IllegalArgumentException("request.target must be null.".toString());
        }
    }

    public static /* synthetic */ Void unsupportedData$default(String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "If you wish to display this " + str + ", use androidx.compose.foundation.Image.";
        }
        return unsupportedData(str, str2);
    }

    public static final Void unsupportedData(String str, String str2) {
        throw new IllegalArgumentException("Unsupported type: " + str + ". " + str2);
    }

    /* renamed from: isPositive-uvyYCjk */
    public static final boolean m14259isPositiveuvyYCjk(long j) {
        return ((double) Size.m11168getWidthimpl(j)) >= 0.5d && ((double) Size.m11165getHeightimpl(j)) >= 0.5d;
    }

    /* renamed from: toSizeOrNull-uvyYCjk */
    public static final coil.size.Size m14262toSizeOrNulluvyYCjk(long j) {
        if (j == Size.INSTANCE.m11176getUnspecifiedNHjbRc()) {
            return coil.size.Size.ORIGINAL;
        }
        if (!m14259isPositiveuvyYCjk(j)) {
            return null;
        }
        float fM11168getWidthimpl = Size.m11168getWidthimpl(j);
        Dimension Dimension = (Float.isInfinite(fM11168getWidthimpl) || Float.isNaN(fM11168getWidthimpl)) ? Dimension.Undefined.INSTANCE : Dimensions.Dimension(MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(j)));
        float fM11165getHeightimpl = Size.m11165getHeightimpl(j);
        return new coil.size.Size(Dimension, (Float.isInfinite(fM11165getHeightimpl) || Float.isNaN(fM11165getHeightimpl)) ? Dimension.Undefined.INSTANCE : Dimensions.Dimension(MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(j))));
    }
}
