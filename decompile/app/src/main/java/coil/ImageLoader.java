package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.ExifOrientationPolicy;
import coil.disk.DiskCache;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.size.Precision;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import coil.util.Contexts;
import coil.util.ImageLoaderOptions;
import coil.util.Logger;
import coil.util.Requests;
import coil.util.SingletonDiskCache;
import coil.util.Utils;
import com.blackhub.bronline.game.core.constants.Other;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyKt__LazyKt;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageLoader.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u001dJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0015H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001a\u00020\u001aH&J\b\u0010\u001b\u001a\u00020\u001cH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u0004\u0018\u00010\u000fX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011ø\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001¨\u0006\u001eÀ\u0006\u0001"}, m7105d2 = {"Lcoil/ImageLoader;", "", "components", "Lcoil/ComponentRegistry;", "getComponents", "()Lcoil/ComponentRegistry;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "diskCache", "Lcoil/disk/DiskCache;", "getDiskCache", "()Lcoil/disk/DiskCache;", "memoryCache", "Lcoil/memory/MemoryCache;", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newBuilder", "Lcoil/ImageLoader$Builder;", "shutdown", "", "Builder", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public interface ImageLoader {
    @NotNull
    Disposable enqueue(@NotNull ImageRequest request);

    @Nullable
    Object execute(@NotNull ImageRequest imageRequest, @NotNull Continuation<? super ImageResult> continuation);

    @NotNull
    ComponentRegistry getComponents();

    @NotNull
    DefaultRequestOptions getDefaults();

    @Nullable
    DiskCache getDiskCache();

    @Nullable
    MemoryCache getMemoryCache();

    @NotNull
    Builder newBuilder();

    void shutdown();

    /* compiled from: ImageLoader.kt */
    @Metadata(m7104d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0012\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010 \u001a\u00020!H\u0007J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&J\u000e\u0010'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)J\u0006\u0010*\u001a\u00020+J\u0014\u0010\t\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000b0-J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u000bJ\u0010\u0010\f\u001a\u00020\u00002\u0006\u0010.\u001a\u00020\rH\u0007J!\u0010\f\u001a\u00020\u00002\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200¢\u0006\u0002\b3H\u0007J\u000e\u00104\u001a\u00020\u00002\u0006\u00104\u001a\u00020\rJ\"\u00104\u001a\u00020\u00002\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020200¢\u0006\u0002\b3H\u0086\bJ\u000e\u00105\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020)J\u000e\u00107\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u0016\u0010\u0010\u001a\u00020\u00002\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110-J\u0010\u0010\u0010\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010%\u001a\u00020;J\u000e\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u0010\u0010<\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010>J\u0010\u0010<\u001a\u00020\u00002\b\b\u0001\u0010?\u001a\u00020)J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010A\u001a\u00020BJ\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010C\u001a\u00020\u0013J\u0010\u0010D\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010>J\u0010\u0010D\u001a\u00020\u00002\b\b\u0001\u0010?\u001a\u00020)J\u000e\u0010E\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u000e\u0010F\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u0010\u0010G\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u0010\u0010\u0014\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015J\u0016\u0010\u0016\u001a\u00020\u00002\u000e\u0010,\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170-J\u0010\u0010\u0016\u001a\u00020\u00002\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u000e\u0010H\u001a\u00020\u00002\u0006\u0010%\u001a\u00020;J\u000e\u0010I\u001a\u00020\u00002\u0006\u0010%\u001a\u00020;J\u000e\u0010J\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010K\u001a\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020L0-J\u000e\u0010K\u001a\u00020\u00002\u0006\u0010K\u001a\u00020LJ\u0010\u0010M\u001a\u00020\u00002\b\u0010=\u001a\u0004\u0018\u00010>J\u0010\u0010M\u001a\u00020\u00002\b\b\u0001\u0010?\u001a\u00020)J\u000e\u0010N\u001a\u00020\u00002\u0006\u0010N\u001a\u00020OJ\u000e\u0010P\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010Q\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cH\u0007J\u000e\u0010R\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u0010\u0010S\u001a\u00020\u00002\u0006\u0010S\u001a\u00020TH\u0007J\u000e\u0010U\u001a\u00020\u00002\u0006\u0010C\u001a\u00020VR\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, m7105d2 = {"Lcoil/ImageLoader$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "imageLoader", "Lcoil/RealImageLoader;", "(Lcoil/RealImageLoader;)V", "applicationContext", "callFactory", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "componentRegistry", "Lcoil/ComponentRegistry;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "diskCache", "Lcoil/disk/DiskCache;", "eventListenerFactory", "Lcoil/EventListener$Factory;", "logger", "Lcoil/util/Logger;", "memoryCache", "Lcoil/memory/MemoryCache;", "options", "Lcoil/util/ImageLoaderOptions;", "addLastModifiedToFileCacheKey", "enable", "", "allowHardware", "allowRgb565", "availableMemoryPercentage", "percent", "", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "bitmapFactoryExifOrientationPolicy", "policy", "Lcoil/decode/ExifOrientationPolicy;", "bitmapFactoryMaxParallelism", "maxParallelism", "", "build", "Lcoil/ImageLoader;", "initializer", "Lkotlin/Function0;", "registry", "builder", "Lkotlin/Function1;", "Lcoil/ComponentRegistry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "components", "crossfade", "durationMillis", "decoderDispatcher", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "diskCachePolicy", "Lcoil/request/CachePolicy;", "error", "drawable", "Landroid/graphics/drawable/Drawable;", "drawableResId", "eventListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/EventListener;", "factory", Other.FALLBACK, "fetcherDispatcher", "interceptorDispatcher", "launchInterceptorChainOnMainThread", "memoryCachePolicy", "networkCachePolicy", "networkObserverEnabled", "okHttpClient", "Lokhttp3/OkHttpClient;", "placeholder", "precision", "Lcoil/size/Precision;", "respectCacheHeaders", "trackWeakReferences", "transformationDispatcher", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Lcoil/transition/Transition;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
    public static final class Builder {

        @NotNull
        public final Context applicationContext;

        @Nullable
        public Lazy<? extends Call.Factory> callFactory;

        @Nullable
        public ComponentRegistry componentRegistry;

        @NotNull
        public DefaultRequestOptions defaults;

        @Nullable
        public Lazy<? extends DiskCache> diskCache;

        @Nullable
        public EventListener.Factory eventListenerFactory;

        @Nullable
        public Logger logger;

        @Nullable
        public Lazy<? extends MemoryCache> memoryCache;

        @NotNull
        public ImageLoaderOptions options;

        public static final EventListener eventListener$lambda$15(EventListener eventListener, ImageRequest imageRequest) {
            return eventListener;
        }

        public Builder(@NotNull Context context) {
            this.applicationContext = context.getApplicationContext();
            this.defaults = Requests.getDEFAULT_REQUEST_OPTIONS();
            this.memoryCache = null;
            this.diskCache = null;
            this.callFactory = null;
            this.eventListenerFactory = null;
            this.componentRegistry = null;
            this.options = new ImageLoaderOptions(false, false, false, 0, null, 31, null);
            this.logger = null;
        }

        public Builder(@NotNull RealImageLoader realImageLoader) {
            this.applicationContext = realImageLoader.getContext().getApplicationContext();
            this.defaults = realImageLoader.getDefaults();
            this.memoryCache = realImageLoader.getMemoryCacheLazy();
            this.diskCache = realImageLoader.getDiskCacheLazy();
            this.callFactory = realImageLoader.getCallFactoryLazy();
            this.eventListenerFactory = realImageLoader.getEventListenerFactory();
            this.componentRegistry = realImageLoader.getComponentRegistry();
            this.options = realImageLoader.getOptions();
            this.logger = realImageLoader.getLogger();
        }

        @NotNull
        public final Builder okHttpClient(@NotNull OkHttpClient okHttpClient) {
            return callFactory(okHttpClient);
        }

        @NotNull
        public final Builder okHttpClient(@NotNull Function0<? extends OkHttpClient> initializer) {
            return callFactory(initializer);
        }

        @NotNull
        public final Builder callFactory(@NotNull Call.Factory callFactory) {
            this.callFactory = LazyKt__LazyKt.lazyOf(callFactory);
            return this;
        }

        @NotNull
        public final Builder callFactory(@NotNull Function0<? extends Call.Factory> initializer) {
            this.callFactory = LazyKt__LazyJVMKt.lazy(initializer);
            return this;
        }

        public final /* synthetic */ Builder components(Function1<? super ComponentRegistry.Builder, Unit> builder) {
            ComponentRegistry.Builder builder2 = new ComponentRegistry.Builder();
            builder.invoke(builder2);
            return components(builder2.build());
        }

        @NotNull
        public final Builder components(@NotNull ComponentRegistry components) {
            this.componentRegistry = components;
            return this;
        }

        @NotNull
        public final Builder memoryCache(@Nullable MemoryCache memoryCache) {
            this.memoryCache = LazyKt__LazyKt.lazyOf(memoryCache);
            return this;
        }

        @NotNull
        public final Builder memoryCache(@NotNull Function0<? extends MemoryCache> initializer) {
            this.memoryCache = LazyKt__LazyJVMKt.lazy(initializer);
            return this;
        }

        @NotNull
        public final Builder diskCache(@Nullable DiskCache diskCache) {
            this.diskCache = LazyKt__LazyKt.lazyOf(diskCache);
            return this;
        }

        @NotNull
        public final Builder diskCache(@NotNull Function0<? extends DiskCache> initializer) {
            this.diskCache = LazyKt__LazyJVMKt.lazy(initializer);
            return this;
        }

        @NotNull
        public final Builder allowHardware(boolean enable) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : enable, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder allowRgb565(boolean enable) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : enable, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder addLastModifiedToFileCacheKey(boolean enable) {
            this.options = ImageLoaderOptions.copy$default(this.options, enable, false, false, 0, null, 30, null);
            return this;
        }

        @NotNull
        public final Builder networkObserverEnabled(boolean enable) {
            this.options = ImageLoaderOptions.copy$default(this.options, false, enable, false, 0, null, 29, null);
            return this;
        }

        @NotNull
        public final Builder respectCacheHeaders(boolean enable) {
            this.options = ImageLoaderOptions.copy$default(this.options, false, false, enable, 0, null, 27, null);
            return this;
        }

        @NotNull
        public final Builder bitmapFactoryMaxParallelism(int maxParallelism) {
            if (maxParallelism <= 0) {
                throw new IllegalArgumentException("maxParallelism must be > 0.".toString());
            }
            this.options = ImageLoaderOptions.copy$default(this.options, false, false, false, maxParallelism, null, 23, null);
            return this;
        }

        @NotNull
        public final Builder bitmapFactoryExifOrientationPolicy(@NotNull ExifOrientationPolicy policy) {
            this.options = ImageLoaderOptions.copy$default(this.options, false, false, false, 0, policy, 15, null);
            return this;
        }

        @NotNull
        public final Builder eventListener(@NotNull final EventListener listener) {
            return eventListenerFactory(new EventListener.Factory() { // from class: coil.ImageLoader$Builder$$ExternalSyntheticLambda0
                @Override // coil.EventListener.Factory
                public final EventListener create(ImageRequest imageRequest) {
                    return ImageLoader.Builder.eventListener$lambda$15(listener, imageRequest);
                }
            });
        }

        @NotNull
        public final Builder eventListenerFactory(@NotNull EventListener.Factory factory) {
            this.eventListenerFactory = factory;
            return this;
        }

        @NotNull
        public final Builder crossfade(boolean enable) {
            return crossfade(enable ? 100 : 0);
        }

        @NotNull
        public final Builder crossfade(int durationMillis) {
            Transition.Factory factory;
            if (durationMillis > 0) {
                factory = new CrossfadeTransition.Factory(durationMillis, false, 2, null);
            } else {
                factory = Transition.Factory.NONE;
            }
            transitionFactory(factory);
            return this;
        }

        @NotNull
        public final Builder transitionFactory(@NotNull Transition.Factory factory) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : factory, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder precision(@NotNull Precision precision) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : precision, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder bitmapConfig(@NotNull Bitmap.Config bitmapConfig) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : bitmapConfig, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull CoroutineDispatcher dispatcher) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : dispatcher, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : dispatcher, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : dispatcher, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder interceptorDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : dispatcher, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder fetcherDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : dispatcher, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder decoderDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : dispatcher, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder transformationDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : dispatcher, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder placeholder(@DrawableRes int drawableResId) {
            return placeholder(Contexts.getDrawableCompat(this.applicationContext, drawableResId));
        }

        @NotNull
        public final Builder placeholder(@Nullable Drawable drawable) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : drawable != null ? drawable.mutate() : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder error(@DrawableRes int drawableResId) {
            return error(Contexts.getDrawableCompat(this.applicationContext, drawableResId));
        }

        @NotNull
        public final Builder error(@Nullable Drawable drawable) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : drawable != null ? drawable.mutate() : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder fallback(@DrawableRes int drawableResId) {
            return fallback(Contexts.getDrawableCompat(this.applicationContext, drawableResId));
        }

        @NotNull
        public final Builder fallback(@Nullable Drawable drawable) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : drawable != null ? drawable.mutate() : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder memoryCachePolicy(@NotNull CachePolicy policy) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : policy, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder diskCachePolicy(@NotNull CachePolicy policy) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : policy, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : null);
            return this;
        }

        @NotNull
        public final Builder networkCachePolicy(@NotNull CachePolicy policy) {
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            this.defaults = defaultRequestOptions.copy((32639 & 1) != 0 ? defaultRequestOptions.interceptorDispatcher : null, (32639 & 2) != 0 ? defaultRequestOptions.fetcherDispatcher : null, (32639 & 4) != 0 ? defaultRequestOptions.decoderDispatcher : null, (32639 & 8) != 0 ? defaultRequestOptions.transformationDispatcher : null, (32639 & 16) != 0 ? defaultRequestOptions.transitionFactory : null, (32639 & 32) != 0 ? defaultRequestOptions.precision : null, (32639 & 64) != 0 ? defaultRequestOptions.bitmapConfig : null, (32639 & 128) != 0 ? defaultRequestOptions.allowHardware : false, (32639 & 256) != 0 ? defaultRequestOptions.allowRgb565 : false, (32639 & 512) != 0 ? defaultRequestOptions.placeholder : null, (32639 & 1024) != 0 ? defaultRequestOptions.error : null, (32639 & 2048) != 0 ? defaultRequestOptions.fallback : null, (32639 & 4096) != 0 ? defaultRequestOptions.memoryCachePolicy : null, (32639 & 8192) != 0 ? defaultRequestOptions.diskCachePolicy : null, (32639 & 16384) != 0 ? defaultRequestOptions.networkCachePolicy : policy);
            return this;
        }

        @NotNull
        public final Builder logger(@Nullable Logger logger) {
            this.logger = logger;
            return this;
        }

        @NotNull
        public final ImageLoader build() {
            Context context = this.applicationContext;
            DefaultRequestOptions defaultRequestOptions = this.defaults;
            Lazy<? extends MemoryCache> lazy = this.memoryCache;
            if (lazy == null) {
                lazy = LazyKt__LazyJVMKt.lazy(new Function0<MemoryCache>() { // from class: coil.ImageLoader$Builder$build$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final MemoryCache invoke() {
                        return new MemoryCache.Builder(this.this$0.applicationContext).build();
                    }
                });
            }
            Lazy<? extends MemoryCache> lazy2 = lazy;
            Lazy<? extends DiskCache> lazy3 = this.diskCache;
            if (lazy3 == null) {
                lazy3 = LazyKt__LazyJVMKt.lazy(new Function0<DiskCache>() { // from class: coil.ImageLoader$Builder$build$2
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final DiskCache invoke() {
                        return SingletonDiskCache.INSTANCE.get(this.this$0.applicationContext);
                    }
                });
            }
            Lazy<? extends DiskCache> lazy4 = lazy3;
            Lazy<? extends Call.Factory> lazy5 = this.callFactory;
            if (lazy5 == null) {
                lazy5 = LazyKt__LazyJVMKt.lazy(new Function0<OkHttpClient>() { // from class: coil.ImageLoader$Builder$build$3
                    @Override // kotlin.jvm.functions.Function0
                    @NotNull
                    public final OkHttpClient invoke() {
                        return new OkHttpClient();
                    }
                });
            }
            Lazy<? extends Call.Factory> lazy6 = lazy5;
            EventListener.Factory factory = this.eventListenerFactory;
            if (factory == null) {
                factory = EventListener.Factory.NONE;
            }
            EventListener.Factory factory2 = factory;
            ComponentRegistry componentRegistry = this.componentRegistry;
            if (componentRegistry == null) {
                componentRegistry = new ComponentRegistry();
            }
            return new RealImageLoader(context, defaultRequestOptions, lazy2, lazy4, lazy6, factory2, componentRegistry, this.options, this.logger);
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @ReplaceWith(expression = "memoryCache { MemoryCache.Builder(context).maxSizePercent(percent).build() }", imports = {"coil.memory.MemoryCache"}))
        @NotNull
        public final Builder availableMemoryPercentage(@FloatRange(from = 0.0d, m9to = 1.0d) double percent) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'memoryCache'.", replaceWith = @ReplaceWith(expression = "memoryCache { MemoryCache.Builder(context).weakReferencesEnabled(enable).build() }", imports = {"coil.memory.MemoryCache"}))
        @NotNull
        public final Builder trackWeakReferences(boolean enable) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'interceptorDispatcher'.", replaceWith = @ReplaceWith(expression = "interceptorDispatcher(if (enable) Dispatchers.Main.immediate else Dispatchers.IO)", imports = {"kotlinx.coroutines.Dispatchers"}))
        @NotNull
        public final Builder launchInterceptorChainOnMainThread(boolean enable) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @ReplaceWith(expression = "components(builder)", imports = {}))
        public final /* synthetic */ Builder componentRegistry(Function1 builder) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with 'components'.", replaceWith = @ReplaceWith(expression = "components(registry)", imports = {}))
        @NotNull
        public final Builder componentRegistry(@NotNull ComponentRegistry registry) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'transitionFactory'.", replaceWith = @ReplaceWith(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @NotNull
        public final Builder transition(@NotNull Transition transition) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }
    }
}
