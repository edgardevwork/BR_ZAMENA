package coil;

import android.content.Context;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Coil.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0019\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m7105d2 = {"Lcoil/Coil;", "", "()V", "imageLoader", "Lcoil/ImageLoader;", "imageLoaderFactory", "Lcoil/ImageLoaderFactory;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "context", "Landroid/content/Context;", "newImageLoader", "reset", "", "setImageLoader", "factory", "coil-singleton_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCoil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Coil.kt\ncoil/Coil\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,105:1\n1#2:106\n*E\n"})
/* loaded from: classes3.dex */
public final class Coil {

    @NotNull
    public static final Coil INSTANCE = new Coil();

    @Nullable
    public static ImageLoader imageLoader;

    @Nullable
    public static ImageLoaderFactory imageLoaderFactory;

    @JvmStatic
    @NotNull
    public static final ImageLoader imageLoader(@NotNull Context context) {
        ImageLoader imageLoader2 = imageLoader;
        return imageLoader2 == null ? INSTANCE.newImageLoader(context) : imageLoader2;
    }

    @JvmStatic
    public static final synchronized void setImageLoader(@NotNull ImageLoader imageLoader2) {
        imageLoaderFactory = null;
        imageLoader = imageLoader2;
    }

    @JvmStatic
    public static final synchronized void setImageLoader(@NotNull ImageLoaderFactory factory) {
        imageLoaderFactory = factory;
        imageLoader = null;
    }

    @JvmStatic
    public static final synchronized void reset() {
        imageLoader = null;
        imageLoaderFactory = null;
    }

    public final synchronized ImageLoader newImageLoader(Context context) {
        ImageLoader imageLoaderNewImageLoader;
        try {
            ImageLoader imageLoader2 = imageLoader;
            if (imageLoader2 != null) {
                return imageLoader2;
            }
            ImageLoaderFactory imageLoaderFactory2 = imageLoaderFactory;
            if (imageLoaderFactory2 == null || (imageLoaderNewImageLoader = imageLoaderFactory2.newImageLoader()) == null) {
                Object applicationContext = context.getApplicationContext();
                ImageLoaderFactory imageLoaderFactory3 = applicationContext instanceof ImageLoaderFactory ? (ImageLoaderFactory) applicationContext : null;
                imageLoaderNewImageLoader = imageLoaderFactory3 != null ? imageLoaderFactory3.newImageLoader() : ImageLoaders.create(context);
            }
            imageLoaderFactory = null;
            imageLoader = imageLoaderNewImageLoader;
            return imageLoaderNewImageLoader;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'context.imageLoader.enqueue(request)'.", replaceWith = @ReplaceWith(expression = "request.context.imageLoader.enqueue(request)", imports = {"coil.imageLoader"}))
    @JvmStatic
    @NotNull
    public static final Disposable enqueue(@NotNull ImageRequest request) {
        throw new IllegalStateException("Unsupported".toString());
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'context.imageLoader.execute(request)'.", replaceWith = @ReplaceWith(expression = "request.context.imageLoader.execute(request)", imports = {"coil.imageLoader"}))
    @JvmStatic
    @Nullable
    public static final Object execute(@NotNull ImageRequest imageRequest, @NotNull Continuation<? super ImageResult> continuation) {
        throw new IllegalStateException("Unsupported".toString());
    }
}
