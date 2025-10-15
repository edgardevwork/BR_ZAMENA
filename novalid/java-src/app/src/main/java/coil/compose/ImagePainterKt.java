package coil.compose;

import android.content.Context;
import androidx.compose.p003ui.geometry.Size;
import androidx.compose.p003ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter;
import coil.request.ImageRequest;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
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

/* compiled from: ImagePainter.kt */
@Metadata(m7104d1 = {"\u0000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\u0006\u001ak\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052H\u0010\u0007\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a \u0010\u0000\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0087\b¢\u0006\u0002\u0010\u0012\u001am\u0010\u0000\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00052H\u0010\u0007\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000eH\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a\u0086\u0001\u0010\u0000\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00052H\u0010\u0007\u001aD\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\bj\u0002`\u000e2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0087\bø\u0001\u0000¢\u0006\u0002\u0010\u0019\u001a9\u0010\u0000\u001a\u00020\u00012\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0004\u001a\u00020\u00052\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0002\b\u0018H\u0087\b¢\u0006\u0002\u0010\u001a*\\\b\u0002\u0010\u001b\"\u0014\u0012\u0004\u0012\u0002`\f\u0012\u0004\u0012\u0002`\f\u0012\u0004\u0012\u00020\r0\b2@\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\tj\u0002`\f\u0012\u0004\u0012\u00020\r0\b*>\b\u0007\u0010\u001c\"\u00020\u00012\u00020\u0001B0\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\"\b \u0012\u001e\b\u000bB\u001a\b!\u0012\f\b\"\u0012\b\b\fJ\u0004\b\b(#\u0012\b\b$\u0012\u0004\b\b(%*0\b\u0002\u0010&\"\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t2\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, m7105d2 = {"rememberImagePainter", "Lcoil/compose/AsyncImagePainter;", "request", "Lcoil/request/ImageRequest;", "imageLoader", "Lcoil/ImageLoader;", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "onExecute", "Lkotlin/Function2;", "Lkotlin/Triple;", "Lcoil/compose/AsyncImagePainter$State;", "Landroidx/compose/ui/geometry/Size;", "Lcoil/compose/Snapshot;", "", "Lcoil/compose/ExecuteCallback;", "(Lcoil/request/ImageRequest;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "data", "", "(Ljava/lang/Object;Lcoil/ImageLoader;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "builder", "Lkotlin/Function1;", "Lcoil/request/ImageRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "(Ljava/lang/Object;Lcoil/ImageLoader;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcoil/compose/AsyncImagePainter;", "ExecuteCallback", "ImagePainter", "Lkotlin/Deprecated;", ThrowableDeserializer.PROP_NAME_MESSAGE, "ImagePainter has been renamed to AsyncImagePainter.", "replaceWith", "Lkotlin/ReplaceWith;", "imports", "coil.compose.AsyncImagePainter", "expression", "AsyncImagePainter", "Snapshot", "coil-compose-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nImagePainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImagePainter.kt\ncoil/compose/ImagePainterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,126:1\n76#2:127\n76#2:128\n*S KotlinDebug\n*F\n+ 1 ImagePainter.kt\ncoil/compose/ImagePainterKt\n*L\n67#1:127\n91#1:128\n*E\n"})
/* loaded from: classes3.dex */
public final class ImagePainterKt {
    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "AsyncImagePainter", imports = {"coil.compose.AsyncImagePainter"}))
    public static /* synthetic */ void ImagePainter$annotations() {
    }

    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object obj, @NotNull ImageLoader imageLoader, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(699722038);
        AsyncImagePainter asyncImagePainterM14261rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m14261rememberAsyncImagePainter5jETZwI(obj, imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return asyncImagePainterM14261rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(data, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object obj, @NotNull ImageLoader imageLoader, @NotNull Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-1913684348);
        AsyncImagePainter asyncImagePainterM14261rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m14261rememberAsyncImagePainter5jETZwI(obj, imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return asyncImagePainterM14261rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object obj, @NotNull ImageLoader imageLoader, @NotNull Function1<? super ImageRequest.Builder, Unit> function1, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(1750824323);
        ImageRequest.Builder builderData = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(obj);
        function1.invoke(builderData);
        AsyncImagePainter asyncImagePainterM14261rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m14261rememberAsyncImagePainter5jETZwI(builderData.build(), imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return asyncImagePainterM14261rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(ImageRequest.Builder(LocalContext.current).data(data).apply(builder).build(), imageLoader)", imports = {"androidx.compose.ui.platform.LocalContext", "coil.compose.rememberAsyncImagePainter", "coil.request.ImageRequest"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@Nullable Object obj, @NotNull ImageLoader imageLoader, @NotNull Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, @NotNull Function1<? super ImageRequest.Builder, Unit> function1, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-976338607);
        ImageRequest.Builder builderData = new ImageRequest.Builder((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).data(obj);
        function1.invoke(builderData);
        AsyncImagePainter asyncImagePainterM14261rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m14261rememberAsyncImagePainter5jETZwI(builderData.build(), imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return asyncImagePainterM14261rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@NotNull ImageRequest imageRequest, @NotNull ImageLoader imageLoader, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2028135656);
        AsyncImagePainter asyncImagePainterM14261rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m14261rememberAsyncImagePainter5jETZwI(imageRequest, imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return asyncImagePainterM14261rememberAsyncImagePainter5jETZwI;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "ImagePainter has been renamed to AsyncImagePainter.", replaceWith = @ReplaceWith(expression = "rememberAsyncImagePainter(request, imageLoader)", imports = {"coil.compose.rememberAsyncImagePainter"}))
    @Composable
    @NotNull
    public static final AsyncImagePainter rememberImagePainter(@NotNull ImageRequest imageRequest, @NotNull ImageLoader imageLoader, @NotNull Function2<? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, ? super Triple<? extends AsyncImagePainter.State, ImageRequest, Size>, Boolean> function2, @Nullable Composer composer, int i) {
        composer.startReplaceableGroup(-2123088410);
        AsyncImagePainter asyncImagePainterM14261rememberAsyncImagePainter5jETZwI = AsyncImagePainterKt.m14261rememberAsyncImagePainter5jETZwI(imageRequest, imageLoader, null, null, null, 0, composer, 72, 60);
        composer.endReplaceableGroup();
        return asyncImagePainterM14261rememberAsyncImagePainter5jETZwI;
    }
}
