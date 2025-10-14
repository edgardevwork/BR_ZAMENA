package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.MainThread;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.lifecycle.Lifecycle;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.p007ts.H263Reader;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.BitmapFactoryDecoder;
import coil.decode.DataSource;
import coil.disk.DiskCache;
import coil.fetch.AssetUriFetcher;
import coil.fetch.BitmapFetcher;
import coil.fetch.ByteBufferFetcher;
import coil.fetch.ContentUriFetcher;
import coil.fetch.DrawableFetcher;
import coil.fetch.FileFetcher;
import coil.fetch.HttpUriFetcher;
import coil.fetch.ResourceUriFetcher;
import coil.intercept.EngineInterceptor;
import coil.intercept.Interceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ErrorResult;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.NullRequestData;
import coil.request.NullRequestDataException;
import coil.request.OneShotDisposable;
import coil.request.RequestDelegate;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.NoneTransition;
import coil.transition.Transition;
import coil.transition.TransitionTarget;
import coil.util.ImageLoaderOptions;
import coil.util.Lifecycles;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import coil.util.Utils;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import okhttp3.Call;
import okhttp3.HttpUrl;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RealImageLoader.kt */
@Metadata(m7104d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 [2\u00020\u0001:\u0001[Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\u0002\u0010\u0015J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?H\u0016J\u0019\u0010@\u001a\u00020A2\u0006\u0010>\u001a\u00020?H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010BJ!\u0010C\u001a\u00020A2\u0006\u0010D\u001a\u00020?2\u0006\u0010E\u001a\u00020FH\u0083@ø\u0001\u0000¢\u0006\u0002\u0010GJ\b\u0010H\u001a\u00020IH\u0016J\u0018\u0010J\u001a\u00020K2\u0006\u0010>\u001a\u00020?2\u0006\u0010L\u001a\u00020MH\u0002J\"\u0010N\u001a\u00020K2\u0006\u0010O\u001a\u00020P2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020MH\u0002J\"\u0010S\u001a\u00020K2\u0006\u0010O\u001a\u00020T2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020MH\u0002J\u0015\u0010U\u001a\u00020K2\u0006\u0010V\u001a\u00020FH\u0000¢\u0006\u0002\bWJ\b\u00108\u001a\u00020KH\u0016J1\u0010X\u001a\u00020K2\u0006\u0010O\u001a\u00020A2\b\u0010Q\u001a\u0004\u0018\u00010R2\u0006\u0010L\u001a\u00020M2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020K0ZH\u0082\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010 \u001a\u0004\u0018\u00010\n8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b#\u0010$*\u0004\b!\u0010\"R\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001d\u0010-\u001a\u0004\u0018\u00010\b8VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b/\u00100*\u0004\b.\u0010\"R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u0017R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u000207X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u000209X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\\"}, m7105d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "memoryCacheLazy", "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "diskCacheLazy", "Lcoil/disk/DiskCache;", "callFactoryLazy", "Lokhttp3/Call$Factory;", "eventListenerFactory", "Lcoil/EventListener$Factory;", "componentRegistry", "Lcoil/ComponentRegistry;", "options", "Lcoil/util/ImageLoaderOptions;", "logger", "Lcoil/util/Logger;", "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil/EventListener$Factory;Lcoil/ComponentRegistry;Lcoil/util/ImageLoaderOptions;Lcoil/util/Logger;)V", "getCallFactoryLazy", "()Lkotlin/Lazy;", "getComponentRegistry", "()Lcoil/ComponentRegistry;", "components", "getComponents", "getContext", "()Landroid/content/Context;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "diskCache", "getDiskCache$delegate", "(Lcoil/RealImageLoader;)Ljava/lang/Object;", "getDiskCache", "()Lcoil/disk/DiskCache;", "getDiskCacheLazy", "getEventListenerFactory", "()Lcoil/EventListener$Factory;", "interceptors", "", "Lcoil/intercept/Interceptor;", "getLogger", "()Lcoil/util/Logger;", "memoryCache", "getMemoryCache$delegate", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "getMemoryCacheLazy", "getOptions", "()Lcoil/util/ImageLoaderOptions;", "requestService", "Lcoil/request/RequestService;", PomReader.SCOPE, "Lkotlinx/coroutines/CoroutineScope;", "shutdown", "Ljava/util/concurrent/atomic/AtomicBoolean;", "systemCallbacks", "Lcoil/util/SystemCallbacks;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeMain", "initialRequest", "type", "", "(Lcoil/request/ImageRequest;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newBuilder", "Lcoil/ImageLoader$Builder;", "onCancel", "", "eventListener", "Lcoil/EventListener;", "onError", "result", "Lcoil/request/ErrorResult;", "target", "Lcoil/target/Target;", "onSuccess", "Lcoil/request/SuccessResult;", "onTrimMemory", "level", "onTrimMemory$coil_base_release", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "setDrawable", "Lkotlin/Function0;", "Companion", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRealImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ComponentRegistry.kt\ncoil/ComponentRegistry$Builder\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Utils.kt\ncoil/util/-Utils\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 8 Logs.kt\ncoil/util/-Logs\n*L\n1#1,296:1\n274#1,15:326\n274#1,15:345\n48#2,4:297\n138#3:301\n138#3:302\n138#3:303\n138#3:304\n138#3:305\n138#3:306\n146#3:307\n146#3:308\n154#3:309\n154#3:310\n154#3:311\n154#3:312\n154#3:313\n154#3:314\n154#3:315\n154#3:316\n1#4:317\n1#4:319\n173#5:318\n50#6:320\n28#7:321\n21#8,4:322\n21#8,4:341\n21#8,4:360\n*S KotlinDebug\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n241#1:326,15\n255#1:345,15\n78#1:297,4\n85#1:301\n86#1:302\n87#1:303\n88#1:304\n89#1:305\n90#1:306\n92#1:307\n93#1:308\n95#1:309\n96#1:310\n97#1:311\n98#1:312\n99#1:313\n100#1:314\n101#1:315\n102#1:316\n170#1:319\n170#1:318\n171#1:320\n171#1:321\n238#1:322,4\n252#1:341,4\n261#1:360,4\n*E\n"})
/* loaded from: classes3.dex */
public final class RealImageLoader implements ImageLoader {
    public static final int REQUEST_TYPE_ENQUEUE = 0;
    public static final int REQUEST_TYPE_EXECUTE = 1;

    @NotNull
    public static final String TAG = "RealImageLoader";

    @NotNull
    public final Lazy<Call.Factory> callFactoryLazy;

    @NotNull
    public final ComponentRegistry componentRegistry;

    @NotNull
    public final ComponentRegistry components;

    @NotNull
    public final Context context;

    @NotNull
    public final DefaultRequestOptions defaults;

    @NotNull
    public final Lazy<DiskCache> diskCacheLazy;

    @NotNull
    public final EventListener.Factory eventListenerFactory;

    @NotNull
    public final List<Interceptor> interceptors;

    @Nullable
    public final Logger logger;

    @NotNull
    public final Lazy<MemoryCache> memoryCacheLazy;

    @NotNull
    public final ImageLoaderOptions options;

    @NotNull
    public final RequestService requestService;

    @NotNull
    public final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain().getImmediate()).plus(new RealImageLoader$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.INSTANCE, this)));

    @NotNull
    public final AtomicBoolean shutdown;

    @NotNull
    public final SystemCallbacks systemCallbacks;

    /* compiled from: RealImageLoader.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.RealImageLoader", m7120f = "RealImageLoader.kt", m7121i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, m7122l = {MatroskaExtractor.ID_BLOCK_MORE, 178, H263Reader.START_CODE_VALUE_VOP}, m7123m = "executeMain", m7124n = {"this", "requestDelegate", "request", "eventListener", "this", "requestDelegate", "request", "eventListener", "placeholderBitmap", "this", "requestDelegate", "request", "eventListener"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3"})
    /* renamed from: coil.RealImageLoader$executeMain$1 */
    /* loaded from: classes.dex */
    public static final class C33921 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public int label;
        public /* synthetic */ Object result;

        public C33921(Continuation<? super C33921> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return RealImageLoader.this.executeMain(null, 0, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RealImageLoader(@NotNull Context context, @NotNull DefaultRequestOptions defaultRequestOptions, @NotNull Lazy<? extends MemoryCache> lazy, @NotNull Lazy<? extends DiskCache> lazy2, @NotNull Lazy<? extends Call.Factory> lazy3, @NotNull EventListener.Factory factory, @NotNull ComponentRegistry componentRegistry, @NotNull ImageLoaderOptions imageLoaderOptions, @Nullable Logger logger) {
        this.context = context;
        this.defaults = defaultRequestOptions;
        this.memoryCacheLazy = lazy;
        this.diskCacheLazy = lazy2;
        this.callFactoryLazy = lazy3;
        this.eventListenerFactory = factory;
        this.componentRegistry = componentRegistry;
        this.options = imageLoaderOptions;
        this.logger = logger;
        SystemCallbacks systemCallbacks = new SystemCallbacks(this, context, imageLoaderOptions.getNetworkObserverEnabled());
        this.systemCallbacks = systemCallbacks;
        RequestService requestService = new RequestService(this, systemCallbacks, logger);
        this.requestService = requestService;
        this.components = componentRegistry.newBuilder().add(new HttpUrlMapper(), HttpUrl.class).add(new StringMapper(), String.class).add(new FileUriMapper(), Uri.class).add(new ResourceUriMapper(), Uri.class).add(new ResourceIntMapper(), Integer.class).add(new ByteArrayMapper(), byte[].class).add(new UriKeyer(), Uri.class).add(new FileKeyer(imageLoaderOptions.getAddLastModifiedToFileCacheKey()), File.class).add(new HttpUriFetcher.Factory(lazy3, lazy2, imageLoaderOptions.getRespectCacheHeaders()), Uri.class).add(new FileFetcher.Factory(), File.class).add(new AssetUriFetcher.Factory(), Uri.class).add(new ContentUriFetcher.Factory(), Uri.class).add(new ResourceUriFetcher.Factory(), Uri.class).add(new DrawableFetcher.Factory(), Drawable.class).add(new BitmapFetcher.Factory(), Bitmap.class).add(new ByteBufferFetcher.Factory(), ByteBuffer.class).add(new BitmapFactoryDecoder.Factory(imageLoaderOptions.getBitmapFactoryMaxParallelism(), imageLoaderOptions.getBitmapFactoryExifOrientationPolicy())).build();
        this.interceptors = CollectionsKt___CollectionsKt.plus((Collection<? extends EngineInterceptor>) getComponents().getInterceptors(), new EngineInterceptor(this, requestService, logger));
        this.shutdown = new AtomicBoolean(false);
        systemCallbacks.register();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // coil.ImageLoader
    @NotNull
    public DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    @NotNull
    public final Lazy<MemoryCache> getMemoryCacheLazy() {
        return this.memoryCacheLazy;
    }

    @NotNull
    public final Lazy<DiskCache> getDiskCacheLazy() {
        return this.diskCacheLazy;
    }

    @NotNull
    public final Lazy<Call.Factory> getCallFactoryLazy() {
        return this.callFactoryLazy;
    }

    @NotNull
    public final EventListener.Factory getEventListenerFactory() {
        return this.eventListenerFactory;
    }

    @NotNull
    public final ComponentRegistry getComponentRegistry() {
        return this.componentRegistry;
    }

    @NotNull
    public final ImageLoaderOptions getOptions() {
        return this.options;
    }

    @Nullable
    public final Logger getLogger() {
        return this.logger;
    }

    @Override // coil.ImageLoader
    @Nullable
    public MemoryCache getMemoryCache() {
        return this.memoryCacheLazy.getValue();
    }

    @Override // coil.ImageLoader
    @Nullable
    public DiskCache getDiskCache() {
        return this.diskCacheLazy.getValue();
    }

    @Override // coil.ImageLoader
    @NotNull
    public ComponentRegistry getComponents() {
        return this.components;
    }

    @Override // coil.ImageLoader
    @NotNull
    public Disposable enqueue(@NotNull ImageRequest request) {
        Deferred<? extends ImageResult> deferredAsync$default = BuildersKt__Builders_commonKt.async$default(this.scope, null, null, new RealImageLoader$enqueue$job$1(this, request, null), 3, null);
        if (request.getTarget() instanceof ViewTarget) {
            return Utils.getRequestManager(((ViewTarget) request.getTarget()).getView()).getDisposable(deferredAsync$default);
        }
        return new OneShotDisposable(deferredAsync$default);
    }

    /* compiled from: RealImageLoader.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lcoil/request/ImageResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.RealImageLoader$execute$2", m7120f = "RealImageLoader.kt", m7121i = {}, m7122l = {Cea708Decoder.COMMAND_DLW}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    /* renamed from: coil.RealImageLoader$execute$2 */
    /* loaded from: classes.dex */
    public static final class C33912 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ImageResult>, Object> {
        public final /* synthetic */ ImageRequest $request;
        public /* synthetic */ Object L$0;
        public int label;
        public final /* synthetic */ RealImageLoader this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C33912(ImageRequest imageRequest, RealImageLoader realImageLoader, Continuation<? super C33912> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.this$0 = realImageLoader;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            C33912 c33912 = new C33912(this.$request, this.this$0, continuation);
            c33912.L$0 = obj;
            return c33912;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ImageResult> continuation) {
            return ((C33912) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Deferred<? extends ImageResult> deferredAsync$default = BuildersKt__Builders_commonKt.async$default((CoroutineScope) this.L$0, Dispatchers.getMain().getImmediate(), null, new RealImageLoader$execute$2$job$1(this.this$0, this.$request, null), 2, null);
                if (this.$request.getTarget() instanceof ViewTarget) {
                    Utils.getRequestManager(((ViewTarget) this.$request.getTarget()).getView()).getDisposable(deferredAsync$default);
                }
                this.label = 1;
                obj = deferredAsync$default.await(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    @Override // coil.ImageLoader
    @Nullable
    public Object execute(@NotNull ImageRequest imageRequest, @NotNull Continuation<? super ImageResult> continuation) {
        return CoroutineScopeKt.coroutineScope(new C33912(imageRequest, this, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0113 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:146:0x00f2, B:148:0x00f8, B:150:0x00fe, B:155:0x010b, B:158:0x0113, B:160:0x0125, B:162:0x012b, B:163:0x012e, B:165:0x0137, B:166:0x013a, B:159:0x0121), top: B:199:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0121 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:146:0x00f2, B:148:0x00f8, B:150:0x00fe, B:155:0x010b, B:158:0x0113, B:160:0x0125, B:162:0x012b, B:163:0x012e, B:165:0x0137, B:166:0x013a, B:159:0x0121), top: B:199:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x012b A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:146:0x00f2, B:148:0x00f8, B:150:0x00fe, B:155:0x010b, B:158:0x0113, B:160:0x0125, B:162:0x012b, B:163:0x012e, B:165:0x0137, B:166:0x013a, B:159:0x0121), top: B:199:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0137 A[Catch: all -> 0x0103, TryCatch #2 {all -> 0x0103, blocks: (B:146:0x00f2, B:148:0x00f8, B:150:0x00fe, B:155:0x010b, B:158:0x0113, B:160:0x0125, B:162:0x012b, B:163:0x012e, B:165:0x0137, B:166:0x013a, B:159:0x0121), top: B:199:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0153 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0185 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0190 A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:116:0x0046, B:174:0x018a, B:176:0x0190, B:177:0x019b, B:179:0x019f), top: B:203:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x019b A[Catch: all -> 0x004b, TryCatch #5 {all -> 0x004b, blocks: (B:116:0x0046, B:174:0x018a, B:176:0x0190, B:177:0x019b, B:179:0x019f), top: B:203:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x01b7 A[Catch: all -> 0x01c8, TRY_LEAVE, TryCatch #3 {all -> 0x01c8, blocks: (B:184:0x01b3, B:186:0x01b7, B:191:0x01ca, B:192:0x01cd), top: B:201:0x01b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01ca A[Catch: all -> 0x01c8, TRY_ENTER, TryCatch #3 {all -> 0x01c8, blocks: (B:184:0x01b3, B:186:0x01b7, B:191:0x01ca, B:192:0x01cd), top: B:201:0x01b3 }] */
    @MainThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object executeMain(ImageRequest imageRequest, int i, Continuation<? super ImageResult> continuation) throws Throwable {
        C33921 c33921;
        RequestDelegate requestDelegate;
        ImageRequest imageRequestBuild;
        RealImageLoader realImageLoader;
        RequestDelegate requestDelegate2;
        EventListener eventListener;
        RealImageLoader realImageLoader2;
        ImageRequest imageRequest2;
        EventListener eventListener2;
        RequestDelegate requestDelegate3;
        Bitmap bitmap;
        Drawable placeholder;
        Target target;
        ImageRequest.Listener listener;
        Object size;
        Bitmap bitmap2;
        RealImageLoader realImageLoader3;
        RequestDelegate requestDelegate4;
        Object obj;
        ImageRequest imageRequest3;
        Object objWithContext;
        Object obj2;
        ImageResult imageResult;
        if (continuation instanceof C33921) {
            c33921 = (C33921) continuation;
            int i2 = c33921.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c33921.label = i2 - Integer.MIN_VALUE;
            } else {
                c33921 = new C33921(continuation);
            }
        }
        Object obj3 = c33921.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c33921.label;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj3);
                requestDelegate = this.requestService.requestDelegate(imageRequest, JobKt.getJob(c33921.getContext()));
                requestDelegate.assertActive();
                imageRequestBuild = ImageRequest.newBuilder$default(imageRequest, null, 1, null).defaults(getDefaults()).build();
                EventListener eventListenerCreate = this.eventListenerFactory.create(imageRequestBuild);
                try {
                    if (imageRequestBuild.getData() == NullRequestData.INSTANCE) {
                        throw new NullRequestDataException();
                    }
                    requestDelegate.start();
                    if (i == 0) {
                        Lifecycle lifecycle = imageRequestBuild.getLifecycle();
                        c33921.L$0 = this;
                        c33921.L$1 = requestDelegate;
                        c33921.L$2 = imageRequestBuild;
                        c33921.L$3 = eventListenerCreate;
                        c33921.label = 1;
                        if (Lifecycles.awaitStarted(lifecycle, c33921) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        realImageLoader2 = this;
                        imageRequest2 = imageRequestBuild;
                        eventListener2 = eventListenerCreate;
                        requestDelegate3 = requestDelegate;
                        requestDelegate = requestDelegate3;
                    } else {
                        realImageLoader2 = this;
                        imageRequest2 = imageRequestBuild;
                        eventListener2 = eventListenerCreate;
                    }
                } catch (Throwable th) {
                    th = th;
                    realImageLoader = this;
                    requestDelegate2 = requestDelegate;
                    eventListener = eventListenerCreate;
                    if (th instanceof CancellationException) {
                    }
                }
            } else if (i3 == 1) {
                eventListener2 = (EventListener) c33921.L$3;
                imageRequest2 = (ImageRequest) c33921.L$2;
                requestDelegate3 = (RequestDelegate) c33921.L$1;
                realImageLoader2 = (RealImageLoader) c33921.L$0;
                try {
                    ResultKt.throwOnFailure(obj3);
                    requestDelegate = requestDelegate3;
                } catch (Throwable th2) {
                    th = th2;
                    eventListener = eventListener2;
                    imageRequestBuild = imageRequest2;
                    requestDelegate2 = requestDelegate3;
                    realImageLoader = realImageLoader2;
                    if (th instanceof CancellationException) {
                        realImageLoader.onCancel(imageRequestBuild, eventListener);
                        throw th;
                    }
                    ErrorResult errorResult = realImageLoader.requestService.errorResult(imageRequestBuild, th);
                    realImageLoader.onError(errorResult, imageRequestBuild.getTarget(), eventListener);
                    return errorResult;
                }
            } else if (i3 == 2) {
                Bitmap bitmap3 = (Bitmap) c33921.L$4;
                eventListener2 = (EventListener) c33921.L$3;
                imageRequest3 = (ImageRequest) c33921.L$2;
                requestDelegate4 = (RequestDelegate) c33921.L$1;
                realImageLoader3 = (RealImageLoader) c33921.L$0;
                try {
                    ResultKt.throwOnFailure(obj3);
                    bitmap2 = bitmap3;
                    obj = obj3;
                    Size size2 = (Size) obj;
                    eventListener2.resolveSizeEnd(imageRequest3, size2);
                    CoroutineDispatcher interceptorDispatcher = imageRequest3.getInterceptorDispatcher();
                    RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$1 = new RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size2, eventListener2, bitmap2, null);
                    c33921.L$0 = realImageLoader3;
                    c33921.L$1 = requestDelegate4;
                    c33921.L$2 = imageRequest3;
                    c33921.L$3 = eventListener2;
                    c33921.L$4 = null;
                    c33921.label = 3;
                    objWithContext = BuildersKt.withContext(interceptorDispatcher, realImageLoader$executeMain$result$1, c33921);
                    if (objWithContext != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eventListener = eventListener2;
                    imageRequestBuild = imageRequest3;
                    requestDelegate2 = requestDelegate4;
                    realImageLoader = realImageLoader3;
                    obj2 = objWithContext;
                    imageResult = (ImageResult) obj2;
                    if (imageResult instanceof SuccessResult) {
                    }
                    return imageResult;
                } catch (Throwable th3) {
                    th = th3;
                    eventListener = eventListener2;
                    imageRequestBuild = imageRequest3;
                    requestDelegate2 = requestDelegate4;
                    realImageLoader = realImageLoader3;
                    if (th instanceof CancellationException) {
                    }
                }
            } else {
                if (i3 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eventListener = (EventListener) c33921.L$3;
                imageRequestBuild = (ImageRequest) c33921.L$2;
                requestDelegate2 = (RequestDelegate) c33921.L$1;
                realImageLoader = (RealImageLoader) c33921.L$0;
                try {
                    ResultKt.throwOnFailure(obj3);
                    obj2 = obj3;
                    imageResult = (ImageResult) obj2;
                    if (imageResult instanceof SuccessResult) {
                        realImageLoader.onSuccess((SuccessResult) imageResult, imageRequestBuild.getTarget(), eventListener);
                    } else if (imageResult instanceof ErrorResult) {
                        realImageLoader.onError((ErrorResult) imageResult, imageRequestBuild.getTarget(), eventListener);
                    }
                    return imageResult;
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        if (th instanceof CancellationException) {
                        }
                    } finally {
                        requestDelegate2.complete();
                    }
                }
            }
            MemoryCache memoryCache = realImageLoader2.getMemoryCache();
            if (memoryCache == null) {
                bitmap = null;
                if (bitmap != null) {
                    placeholder = imageRequest2.getPlaceholder();
                } else {
                    placeholder = new BitmapDrawable(imageRequest2.getContext().getResources(), bitmap);
                }
                target = imageRequest2.getTarget();
                if (target != null) {
                    target.onStart(placeholder);
                }
                eventListener2.onStart(imageRequest2);
                listener = imageRequest2.getListener();
                if (listener != null) {
                    listener.onStart(imageRequest2);
                }
                eventListener2.resolveSizeStart(imageRequest2);
                SizeResolver sizeResolver = imageRequest2.getSizeResolver();
                c33921.L$0 = realImageLoader2;
                c33921.L$1 = requestDelegate;
                c33921.L$2 = imageRequest2;
                c33921.L$3 = eventListener2;
                c33921.L$4 = bitmap;
                c33921.label = 2;
                size = sizeResolver.size(c33921);
                if (size != coroutine_suspended) {
                    return coroutine_suspended;
                }
                bitmap2 = bitmap;
                realImageLoader3 = realImageLoader2;
                ImageRequest imageRequest4 = imageRequest2;
                requestDelegate4 = requestDelegate;
                obj = size;
                imageRequest3 = imageRequest4;
                Size size22 = (Size) obj;
                eventListener2.resolveSizeEnd(imageRequest3, size22);
                CoroutineDispatcher interceptorDispatcher2 = imageRequest3.getInterceptorDispatcher();
                RealImageLoader$executeMain$result$1 realImageLoader$executeMain$result$12 = new RealImageLoader$executeMain$result$1(imageRequest3, realImageLoader3, size22, eventListener2, bitmap2, null);
                c33921.L$0 = realImageLoader3;
                c33921.L$1 = requestDelegate4;
                c33921.L$2 = imageRequest3;
                c33921.L$3 = eventListener2;
                c33921.L$4 = null;
                c33921.label = 3;
                objWithContext = BuildersKt.withContext(interceptorDispatcher2, realImageLoader$executeMain$result$12, c33921);
                if (objWithContext != coroutine_suspended) {
                }
            } else {
                MemoryCache.Key placeholderMemoryCacheKey = imageRequest2.getPlaceholderMemoryCacheKey();
                MemoryCache.Value value = placeholderMemoryCacheKey != null ? memoryCache.get(placeholderMemoryCacheKey) : null;
                if (value != null) {
                    bitmap = value.getBitmap();
                }
                if (bitmap != null) {
                }
                target = imageRequest2.getTarget();
                if (target != null) {
                }
                eventListener2.onStart(imageRequest2);
                listener = imageRequest2.getListener();
                if (listener != null) {
                }
                eventListener2.resolveSizeStart(imageRequest2);
                SizeResolver sizeResolver2 = imageRequest2.getSizeResolver();
                c33921.L$0 = realImageLoader2;
                c33921.L$1 = requestDelegate;
                c33921.L$2 = imageRequest2;
                c33921.L$3 = eventListener2;
                c33921.L$4 = bitmap;
                c33921.label = 2;
                size = sizeResolver2.size(c33921);
                if (size != coroutine_suspended) {
                }
            }
            imageResult = (ImageResult) obj2;
            if (imageResult instanceof SuccessResult) {
            }
            return imageResult;
        } catch (Throwable th5) {
            th = th5;
            requestDelegate2 = requestDelegate;
            eventListener = eventListener2;
            imageRequestBuild = imageRequest2;
            realImageLoader = realImageLoader2;
            if (th instanceof CancellationException) {
            }
        }
    }

    public final void onTrimMemory$coil_base_release(int level) {
        MemoryCache value;
        Lazy<MemoryCache> lazy = this.memoryCacheLazy;
        if (lazy == null || (value = lazy.getValue()) == null) {
            return;
        }
        value.trimMemory(level);
    }

    @Override // coil.ImageLoader
    public void shutdown() {
        if (this.shutdown.getAndSet(true)) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.scope, null, 1, null);
        this.systemCallbacks.shutdown();
        MemoryCache memoryCache = getMemoryCache();
        if (memoryCache != null) {
            memoryCache.clear();
        }
    }

    @Override // coil.ImageLoader
    @NotNull
    public ImageLoader.Builder newBuilder() {
        return new ImageLoader.Builder(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSuccess(SuccessResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        DataSource dataSource = result.getDataSource();
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, Utils.getEmoji(dataSource) + " Successful (" + dataSource.name() + ") - " + request.getData(), null);
        }
        if (target instanceof TransitionTarget) {
            Transition transitionCreate = result.getRequest().getTransitionFactory().create((TransitionTarget) target, result);
            if (!(transitionCreate instanceof NoneTransition)) {
                eventListener.transitionStart(result.getRequest(), transitionCreate);
                transitionCreate.transition();
                eventListener.transitionEnd(result.getRequest(), transitionCreate);
            }
        } else if (target != null) {
            target.onSuccess(result.getDrawable());
        }
        eventListener.onSuccess(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onSuccess(request, result);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onError(ErrorResult result, Target target, EventListener eventListener) {
        ImageRequest request = result.getRequest();
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "🚨 Failed - " + request.getData() + " - " + result.getThrowable(), null);
        }
        if (target instanceof TransitionTarget) {
            Transition transitionCreate = result.getRequest().getTransitionFactory().create((TransitionTarget) target, result);
            if (!(transitionCreate instanceof NoneTransition)) {
                eventListener.transitionStart(result.getRequest(), transitionCreate);
                transitionCreate.transition();
                eventListener.transitionEnd(result.getRequest(), transitionCreate);
            }
        } else if (target != null) {
            target.onError(result.getDrawable());
        }
        eventListener.onError(request, result);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onError(request, result);
        }
    }

    public final void onCancel(ImageRequest request, EventListener eventListener) {
        Logger logger = this.logger;
        if (logger != null && logger.getLevel() <= 4) {
            logger.log(TAG, 4, "🏗  Cancelled - " + request.getData(), null);
        }
        eventListener.onCancel(request);
        ImageRequest.Listener listener = request.getListener();
        if (listener != null) {
            listener.onCancel(request);
        }
    }

    public final void transition(ImageResult imageResult, Target target, EventListener eventListener, Function0<Unit> function0) {
        if (!(target instanceof TransitionTarget)) {
            function0.invoke();
            return;
        }
        Transition transitionCreate = imageResult.getRequest().getTransitionFactory().create((TransitionTarget) target, imageResult);
        if (transitionCreate instanceof NoneTransition) {
            function0.invoke();
            return;
        }
        eventListener.transitionStart(imageResult.getRequest(), transitionCreate);
        transitionCreate.transition();
        eventListener.transitionEnd(imageResult.getRequest(), transitionCreate);
    }
}
