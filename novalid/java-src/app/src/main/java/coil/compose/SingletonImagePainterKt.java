package coil.compose;

import android.content.Context;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SingletonImagePainter.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b¢\u0006\u0002\u0010\u0004\u001ac\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032H\u0010\u0005\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u0018\u0010\u0000\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0087\b¢\u0006\u0002\u0010\u0010\u001ae\u0010\u0000\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2H\u0010\u0005\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\fH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0011\u001a~\u0010\u0000\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2H\u0010\u0005\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u0006j\u0002`\f2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0017\u001a1\u0010\u0000\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0087\b¢\u0006\u0002\u0010\u0018*\\\b\u0002\u0010\u0019\"\u0014\u0012\u0004\u0012\u0002`\n\u0012\u0004\u0012\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u00062@\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n\u0012\u0004\u0012\u00020\u000b0\u0006*0\b\u0002\u0010\u001a\"\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00072\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, m7105d2 = {"rememberImagePainter", "Lcoil/compose/AsyncImagePainter;", "request", "Lcoil/request/ImageRequest;", "(Lcoil/request/ImageRequest;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "onExecute", "Lkotlin/Function2;", "Lkotlin/Triple;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/geometry/Size;", "Lcoil/compose/Snapshot;", "", "Lcoil/compose/ExecuteCallback;", "(Lcoil/request/ImageRequest;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "data", "", "(Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "ExecuteCallback", "Snapshot", "coil-compose-singleton_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nSingletonImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingletonImagePainter.kt\ncoil/compose/SingletonImagePainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,108:1\n76#2:109\n76#2:110\n*S KotlinDebug\n*F\n+ 1 SingletonImagePainter.kt\ncoil/compose/SingletonImagePainterKt\n*L\n54#1:109\n76#1:110\n*E\n"})
/* loaded from: classes2.dex */
public final class SingletonImagePainterKt {
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object obj, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1998134191);
        AsyncImagePainter asyncImagePainterM14281rememberAsyncImagePainter19ie5dc = SingletonAsyncImagePainterKt.m14281rememberAsyncImagePainter19ie5dc(obj, null, null, null, 0, composer, 8, 30);
        composer.endReplaceableGroup();
        return asyncImagePainterM14281rememberAsyncImagePainter19ie5dc;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object obj, @NotNull Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2090701729);
        AsyncImagePainter asyncImagePainterM14281rememberAsyncImagePainter19ie5dc = SingletonAsyncImagePainterKt.m14281rememberAsyncImagePainter19ie5dc(obj, null, null, null, 0, composer, 8, 30);
        composer.endReplaceableGroup();
        return asyncImagePainterM14281rememberAsyncImagePainter19ie5dc;
    }

    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object obj, @NotNull Function1<? super ImageRequest.Builder, Unit> function1, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(309201794);
        ImageRequest.Builder builderData = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(obj);
        function1.invoke(builderData);
        AsyncImagePainter asyncImagePainterM14281rememberAsyncImagePainter19ie5dc = SingletonAsyncImagePainterKt.m14281rememberAsyncImagePainter19ie5dc(builderData.build(), null, null, null, 0, composer, 8, 30);
        composer.endReplaceableGroup();
        return asyncImagePainterM14281rememberAsyncImagePainter19ie5dc;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build())", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object obj, @NotNull Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, @NotNull Function1<? super ImageRequest.Builder, Unit> function1, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(305839348);
        ImageRequest.Builder builderData = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(obj);
        function1.invoke(builderData);
        AsyncImagePainter asyncImagePainterM14281rememberAsyncImagePainter19ie5dc = SingletonAsyncImagePainterKt.m14281rememberAsyncImagePainter19ie5dc(builderData.build(), null, null, null, 0, composer, 8, 30);
        composer.endReplaceableGroup();
        return asyncImagePainterM14281rememberAsyncImagePainter19ie5dc;
    }

    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@NotNull ImageRequest imageRequest, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(2091320589);
        AsyncImagePainter asyncImagePainterM14281rememberAsyncImagePainter19ie5dc = SingletonAsyncImagePainterKt.m14281rememberAsyncImagePainter19ie5dc(imageRequest, null, null, null, 0, composer, 8, 30);
        composer.endReplaceableGroup();
        return asyncImagePainterM14281rememberAsyncImagePainter19ie5dc;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@NotNull ImageRequest imageRequest, @NotNull Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2003443841);
        AsyncImagePainter asyncImagePainterM14281rememberAsyncImagePainter19ie5dc = SingletonAsyncImagePainterKt.m14281rememberAsyncImagePainter19ie5dc(imageRequest, null, null, null, 0, composer, 8, 30);
        composer.endReplaceableGroup();
        return asyncImagePainterM14281rememberAsyncImagePainter19ie5dc;
    }
}
