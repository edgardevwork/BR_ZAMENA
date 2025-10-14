package coil.compose;

import android.content.Context;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.graphics.painter.Painter;
import androidx.compose.p003ui.layout.ContentScale;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p003ui.unit.Constraints;
import androidx.compose.p003ui.unit.IntSizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.runtime.Stable;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import coil.request.NullRequestDataException;
import coil.size.Scale;
import com.blackhub.bronline.game.core.constants.Other;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Utils.kt */
@Metadata(m7104d1 = {"\u0000d\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001aX\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001\u001a\u0017\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a2\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0001\u001a!\u0010\u0019\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u001aH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u00020\u001a*\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u001aH\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010\u001d\u001a\u001b\u0010!\u001a\u00020\u001a*\u00020\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001a0#H\u0080\b\u001a\u0019\u0010$\u001a\u00020%*\u00020&H\u0000ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\f\u0010)\u001a\u00020**\u00020+H\u0001\"\u0019\u0010\u0000\u001a\u00020\u0001X\u0080\u0004ø\u0001\u0000¢\u0006\n\n\u0002\u0010\u0004\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006,"}, m7105d2 = {"ZeroConstraints", "Landroidx/compose/ui/unit/Constraints;", "getZeroConstraints", "()J", "J", "onStateOf", "Lkotlin/Function1;", "Lcoil/compose/AsyncImagePainter$State;", "", "onLoading", "Lcoil/compose/AsyncImagePainter$State$Loading;", "onSuccess", "Lcoil/compose/AsyncImagePainter$State$Success;", "onError", "Lcoil/compose/AsyncImagePainter$State$Error;", "requestOf", "Lcoil/request/ImageRequest;", "model", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/request/ImageRequest;", "transformOf", "placeholder", "Landroidx/compose/ui/graphics/painter/Painter;", "error", Other.FALLBACK, "constrainHeight", "", "height", "constrainHeight-K40F9xA", "(JF)F", "constrainWidth", "width", "constrainWidth-K40F9xA", "takeOrElse", "block", "Lkotlin/Function0;", "toIntSize", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/geometry/Size;", "toIntSize-uvyYCjk", "(J)J", "toScale", "Lcoil/size/Scale;", "Landroidx/compose/ui/layout/ContentScale;", "coil-compose-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utils.kt\ncoil/compose/UtilsKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,92:1\n76#2:93\n*S KotlinDebug\n*F\n+ 1 Utils.kt\ncoil/compose/UtilsKt\n*L\n26#1:93\n*E\n"})
/* loaded from: classes2.dex */
public final class UtilsKt {
    public static final long ZeroConstraints = Constraints.INSTANCE.m13630fixedJhjzzOo(0, 0);

    @Composable
    @ReadOnlyComposable
    @NotNull
    public static final ImageRequest requestOf(@Nullable Object obj, @Nullable Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1151830858, i, -1, "coil.compose.requestOf (Utils.kt:21)");
        }
        if (obj instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) obj;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return imageRequest;
        }
        ImageRequest imageRequestBuild = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(obj).build();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return imageRequestBuild;
    }

    @Stable
    @NotNull
    public static final Function1<AsyncImagePainter.State, AsyncImagePainter.State> transformOf(@Nullable final Painter painter, @Nullable final Painter painter2, @Nullable final Painter painter3) {
        if (painter != null || painter2 != null || painter3 != null) {
            return new Function1<AsyncImagePainter.State, AsyncImagePainter.State>() { // from class: coil.compose.UtilsKt.transformOf.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                public final AsyncImagePainter.State invoke(@NotNull AsyncImagePainter.State state) {
                    if (state instanceof AsyncImagePainter.State.Loading) {
                        Painter painter4 = painter;
                        AsyncImagePainter.State.Loading loading = (AsyncImagePainter.State.Loading) state;
                        return painter4 != null ? loading.copy(painter4) : loading;
                    }
                    if (!(state instanceof AsyncImagePainter.State.Error)) {
                        return state;
                    }
                    AsyncImagePainter.State.Error error = (AsyncImagePainter.State.Error) state;
                    if (error.getResult().getThrowable() instanceof NullRequestDataException) {
                        Painter painter5 = painter3;
                        return painter5 != null ? AsyncImagePainter.State.Error.copy$default(error, painter5, null, 2, null) : error;
                    }
                    Painter painter6 = painter2;
                    return painter6 != null ? AsyncImagePainter.State.Error.copy$default(error, painter6, null, 2, null) : error;
                }
            };
        }
        return AsyncImagePainter.INSTANCE.getDefaultTransform();
    }

    @Stable
    @Nullable
    public static final Function1<AsyncImagePainter.State, Unit> onStateOf(@Nullable final Function1<? super AsyncImagePainter.State.Loading, Unit> function1, @Nullable final Function1<? super AsyncImagePainter.State.Success, Unit> function12, @Nullable final Function1<? super AsyncImagePainter.State.Error, Unit> function13) {
        if (function1 == null && function12 == null && function13 == null) {
            return null;
        }
        return new Function1<AsyncImagePainter.State, Unit>() { // from class: coil.compose.UtilsKt.onStateOf.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AsyncImagePainter.State state) {
                invoke2(state);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AsyncImagePainter.State state) {
                if (state instanceof AsyncImagePainter.State.Loading) {
                    Function1<AsyncImagePainter.State.Loading, Unit> function14 = function1;
                    if (function14 != null) {
                        function14.invoke(state);
                        return;
                    }
                    return;
                }
                if (state instanceof AsyncImagePainter.State.Success) {
                    Function1<AsyncImagePainter.State.Success, Unit> function15 = function12;
                    if (function15 != null) {
                        function15.invoke(state);
                        return;
                    }
                    return;
                }
                if (!(state instanceof AsyncImagePainter.State.Error)) {
                    boolean z = state instanceof AsyncImagePainter.State.Empty;
                    return;
                }
                Function1<AsyncImagePainter.State.Error, Unit> function16 = function13;
                if (function16 != null) {
                    function16.invoke(state);
                }
            }
        };
    }

    @Stable
    @NotNull
    public static final Scale toScale(@NotNull ContentScale contentScale) {
        ContentScale.Companion companion = ContentScale.INSTANCE;
        return Intrinsics.areEqual(contentScale, companion.getFit()) ? true : Intrinsics.areEqual(contentScale, companion.getInside()) ? Scale.FIT : Scale.FILL;
    }

    /* renamed from: constrainWidth-K40F9xA, reason: not valid java name */
    public static final float m14288constrainWidthK40F9xA(long j, float f) {
        return RangesKt___RangesKt.coerceIn(f, Constraints.m13624getMinWidthimpl(j), Constraints.m13622getMaxWidthimpl(j));
    }

    /* renamed from: constrainHeight-K40F9xA, reason: not valid java name */
    public static final float m14287constrainHeightK40F9xA(long j, float f) {
        return RangesKt___RangesKt.coerceIn(f, Constraints.m13623getMinHeightimpl(j), Constraints.m13621getMaxHeightimpl(j));
    }

    public static final float takeOrElse(float f, @NotNull Function0<Float> function0) {
        return (Float.isInfinite(f) || Float.isNaN(f)) ? function0.invoke().floatValue() : f;
    }

    /* renamed from: toIntSize-uvyYCjk, reason: not valid java name */
    public static final long m14289toIntSizeuvyYCjk(long j) {
        return IntSizeKt.IntSize(MathKt__MathJVMKt.roundToInt(Size.m11168getWidthimpl(j)), MathKt__MathJVMKt.roundToInt(Size.m11165getHeightimpl(j)));
    }

    public static final long getZeroConstraints() {
        return ZeroConstraints;
    }
}
