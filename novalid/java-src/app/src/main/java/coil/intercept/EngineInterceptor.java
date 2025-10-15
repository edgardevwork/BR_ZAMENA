package coil.intercept;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.extractor.mkv.MatroskaExtractor;
import androidx.media3.extractor.text.cea.Cea708Decoder;
import coil.ComponentRegistry;
import coil.EventListener;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.decode.FileImageSource;
import coil.decode.ImageSource;
import coil.fetch.DrawableResult;
import coil.fetch.FetchResult;
import coil.fetch.Fetcher;
import coil.fetch.SourceResult;
import coil.intercept.Interceptor;
import coil.memory.MemoryCache;
import coil.memory.MemoryCacheService;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.Options;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Scale;
import coil.size.Size;
import coil.transform.Transformation;
import coil.util.Bitmaps;
import coil.util.DrawableUtils;
import coil.util.Logger;
import coil.util.Utils;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: EngineInterceptor.kt */
@Metadata(m7104d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002JA\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J1\u0010!\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010#J9\u0010$\u001a\u00020%2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+J3\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0081@ø\u0001\u0000¢\u0006\u0004\b.\u0010/R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u00062"}, m7105d2 = {"Lcoil/intercept/EngineInterceptor;", "Lcoil/intercept/Interceptor;", "imageLoader", "Lcoil/ImageLoader;", "requestService", "Lcoil/request/RequestService;", "logger", "Lcoil/util/Logger;", "(Lcoil/ImageLoader;Lcoil/request/RequestService;Lcoil/util/Logger;)V", "memoryCacheService", "Lcoil/memory/MemoryCacheService;", "convertDrawableToBitmap", "Landroid/graphics/Bitmap;", "drawable", "Landroid/graphics/drawable/Drawable;", "options", "Lcoil/request/Options;", "transformations", "", "Lcoil/transform/Transformation;", "decode", "Lcoil/intercept/EngineInterceptor$ExecuteResult;", "fetchResult", "Lcoil/fetch/SourceResult;", "components", "Lcoil/ComponentRegistry;", "request", "Lcoil/request/ImageRequest;", "mappedData", "", "eventListener", "Lcoil/EventListener;", "(Lcoil/fetch/SourceResult;Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "execute", "_options", "(Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RemoteConfigComponent.FETCH_FILE_NAME, "Lcoil/fetch/FetchResult;", "(Lcoil/ComponentRegistry;Lcoil/request/ImageRequest;Ljava/lang/Object;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "intercept", "Lcoil/request/ImageResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "transform", "result", "transform$coil_base_release", "(Lcoil/intercept/EngineInterceptor$ExecuteResult;Lcoil/request/ImageRequest;Lcoil/request/Options;Lcoil/EventListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ExecuteResult", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncoil/util/-Utils\n+ 4 Logs.kt\ncoil/util/-Logs\n*L\n1#1,302:1\n1#2:303\n1#2:305\n1#2:307\n184#3:304\n188#3:306\n21#4,4:308\n21#4,4:312\n21#4,4:316\n*S KotlinDebug\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor\n*L\n116#1:305\n117#1:307\n116#1:304\n117#1:306\n230#1:308,4\n262#1:312,4\n268#1:316,4\n*E\n"})
/* loaded from: classes.dex */
public final class EngineInterceptor implements Interceptor {

    @NotNull
    public static final String TAG = "EngineInterceptor";

    @NotNull
    public final ImageLoader imageLoader;

    @Nullable
    public final Logger logger;

    @NotNull
    public final MemoryCacheService memoryCacheService;

    @NotNull
    public final RequestService requestService;

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.intercept.EngineInterceptor", m7120f = "EngineInterceptor.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {199}, m7123m = "decode", m7124n = {"this", "fetchResult", "components", "request", "mappedData", "options", "eventListener", "decoder", "searchIndex"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0"})
    /* renamed from: coil.intercept.EngineInterceptor$decode$1 */
    public static final class C34121 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C34121(Continuation<? super C34121> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.decode(null, null, null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.intercept.EngineInterceptor", m7120f = "EngineInterceptor.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m7122l = {122, 126, Cea708Decoder.COMMAND_SPA}, m7123m = "execute", m7124n = {"this", "request", "mappedData", "eventListener", "options", "components", "fetchResult", "this", "request", "eventListener", "options", "fetchResult"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4"})
    /* renamed from: coil.intercept.EngineInterceptor$execute$1 */
    public static final class C34131 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public Object L$7;
        public int label;
        public /* synthetic */ Object result;

        public C34131(Continuation<? super C34131> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.execute(null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.intercept.EngineInterceptor", m7120f = "EngineInterceptor.kt", m7121i = {0, 0, 0, 0, 0, 0, 0, 0}, m7122l = {MatroskaExtractor.ID_BLOCK_ADDITIONAL}, m7123m = RemoteConfigComponent.FETCH_FILE_NAME, m7124n = {"this", "components", "request", "mappedData", "options", "eventListener", "fetcher", "searchIndex"}, m7125s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "I$0"})
    /* renamed from: coil.intercept.EngineInterceptor$fetch$1 */
    public static final class C34141 extends ContinuationImpl {
        public int I$0;
        public Object L$0;
        public Object L$1;
        public Object L$2;
        public Object L$3;
        public Object L$4;
        public Object L$5;
        public Object L$6;
        public int label;
        public /* synthetic */ Object result;

        public C34141(Continuation<? super C34141> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.fetch(null, null, null, null, null, this);
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.intercept.EngineInterceptor", m7120f = "EngineInterceptor.kt", m7121i = {0, 0}, m7122l = {73}, m7123m = "intercept", m7124n = {"this", "chain"}, m7125s = {"L$0", "L$1"})
    /* renamed from: coil.intercept.EngineInterceptor$intercept$1 */
    public static final class C34151 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C34151(Continuation<? super C34151> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EngineInterceptor.this.intercept(null, this);
        }
    }

    public EngineInterceptor(@NotNull ImageLoader imageLoader, @NotNull RequestService requestService, @Nullable Logger logger) {
        this.imageLoader = imageLoader;
        this.requestService = requestService;
        this.logger = logger;
        this.memoryCacheService = new MemoryCacheService(imageLoader, requestService, logger);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // coil.intercept.Interceptor
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object intercept(@NotNull Interceptor.Chain chain, @NotNull Continuation<? super ImageResult> continuation) throws Throwable {
        C34151 c34151;
        EngineInterceptor engineInterceptor;
        if (continuation instanceof C34151) {
            c34151 = (C34151) continuation;
            int i = c34151.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34151.label = i - Integer.MIN_VALUE;
            } else {
                c34151 = new C34151(continuation);
            }
        }
        Object objWithContext = c34151.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c34151.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chain = (Interceptor.Chain) c34151.L$1;
            engineInterceptor = (EngineInterceptor) c34151.L$0;
            try {
                ResultKt.throwOnFailure(objWithContext);
            } catch (Throwable th) {
                th = th;
                if (!(th instanceof CancellationException)) {
                    throw th;
                }
                return engineInterceptor.requestService.errorResult(chain.getRequest(), th);
            }
        }
        ResultKt.throwOnFailure(objWithContext);
        try {
            ImageRequest request = chain.getRequest();
            Object data = request.getData();
            Size size = chain.getSize();
            EventListener eventListener = Utils.getEventListener(chain);
            Options options = this.requestService.options(request, size);
            Scale scale = options.getScale();
            eventListener.mapStart(request, data);
            Object map = this.imageLoader.getComponents().map(data, options);
            eventListener.mapEnd(request, map);
            MemoryCache.Key keyNewCacheKey = this.memoryCacheService.newCacheKey(request, map, options, eventListener);
            MemoryCache.Value cacheValue = keyNewCacheKey != null ? this.memoryCacheService.getCacheValue(request, keyNewCacheKey, size, scale) : null;
            if (cacheValue != null) {
                return this.memoryCacheService.newResult(chain, request, keyNewCacheKey, cacheValue);
            }
            CoroutineDispatcher fetcherDispatcher = request.getFetcherDispatcher();
            C34162 c34162 = new C34162(request, map, options, eventListener, keyNewCacheKey, chain, null);
            c34151.L$0 = this;
            c34151.L$1 = chain;
            c34151.label = 1;
            objWithContext = BuildersKt.withContext(fetcherDispatcher, c34162, c34151);
            return objWithContext == coroutine_suspended ? coroutine_suspended : objWithContext;
        } catch (Throwable th2) {
            th = th2;
            engineInterceptor = this;
            if (!(th instanceof CancellationException)) {
            }
        }
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m7104d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m7105d2 = {"<anonymous>", "Lcoil/request/SuccessResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    @DebugMetadata(m7119c = "coil.intercept.EngineInterceptor$intercept$2", m7120f = "EngineInterceptor.kt", m7121i = {}, m7122l = {75}, m7123m = "invokeSuspend", m7124n = {}, m7125s = {})
    @SourceDebugExtension({"SMAP\nEngineInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EngineInterceptor.kt\ncoil/intercept/EngineInterceptor$intercept$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,302:1\n1#2:303\n*E\n"})
    /* renamed from: coil.intercept.EngineInterceptor$intercept$2 */
    public static final class C34162 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super SuccessResult>, Object> {
        public final /* synthetic */ MemoryCache.Key $cacheKey;
        public final /* synthetic */ Interceptor.Chain $chain;
        public final /* synthetic */ EventListener $eventListener;
        public final /* synthetic */ Object $mappedData;
        public final /* synthetic */ Options $options;
        public final /* synthetic */ ImageRequest $request;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34162(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, MemoryCache.Key key, Interceptor.Chain chain, Continuation<? super C34162> continuation) {
            super(2, continuation);
            this.$request = imageRequest;
            this.$mappedData = obj;
            this.$options = options;
            this.$eventListener = eventListener;
            this.$cacheKey = key;
            this.$chain = chain;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EngineInterceptor.this.new C34162(this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super SuccessResult> continuation) {
            return ((C34162) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                EngineInterceptor engineInterceptor = EngineInterceptor.this;
                ImageRequest imageRequest = this.$request;
                Object obj2 = this.$mappedData;
                Options options = this.$options;
                EventListener eventListener = this.$eventListener;
                this.label = 1;
                obj = engineInterceptor.execute(imageRequest, obj2, options, eventListener, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ExecuteResult executeResult = (ExecuteResult) obj;
            return new SuccessResult(executeResult.getDrawable(), this.$request, executeResult.getDataSource(), EngineInterceptor.this.memoryCacheService.setCacheValue(this.$cacheKey, this.$request, executeResult) ? this.$cacheKey : null, executeResult.getDiskCacheKey(), executeResult.getIsSampled(), Utils.isPlaceholderCached(this.$chain));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162 A[Catch: all -> 0x00e1, TRY_LEAVE, TryCatch #0 {all -> 0x00e1, blocks: (B:48:0x0157, B:50:0x0162, B:56:0x01a2, B:58:0x01a6, B:79:0x0212, B:80:0x0217, B:28:0x00a6, B:30:0x00b2, B:33:0x00e5, B:35:0x00eb, B:44:0x011a, B:37:0x00f1, B:39:0x0100, B:40:0x0107, B:42:0x010d, B:43:0x0114), top: B:89:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01a2 A[Catch: all -> 0x00e1, TRY_ENTER, TryCatch #0 {all -> 0x00e1, blocks: (B:48:0x0157, B:50:0x0162, B:56:0x01a2, B:58:0x01a6, B:79:0x0212, B:80:0x0217, B:28:0x00a6, B:30:0x00b2, B:33:0x00e5, B:35:0x00eb, B:44:0x011a, B:37:0x00f1, B:39:0x0100, B:40:0x0107, B:42:0x010d, B:43:0x0114), top: B:89:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, coil.ComponentRegistry] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, coil.request.Options] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, coil.ComponentRegistry] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object execute(ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) throws Throwable {
        C34131 c34131;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Object obj2;
        EventListener eventListener2;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        ImageRequest imageRequest2;
        EngineInterceptor engineInterceptor;
        T t;
        FetchResult fetchResult;
        Ref.ObjectRef objectRef6;
        ImageRequest imageRequest3;
        ExecuteResult executeResult;
        EngineInterceptor engineInterceptor2;
        EventListener eventListener3;
        ImageRequest imageRequest4;
        EngineInterceptor engineInterceptor3;
        SourceResult sourceResult;
        ImageSource source;
        SourceResult sourceResult2;
        Object objTransform$coil_base_release;
        ImageSource source2;
        Object obj3;
        Object obj4;
        Bitmap bitmap;
        if (continuation instanceof C34131) {
            c34131 = (C34131) continuation;
            int i = c34131.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c34131.label = i - Integer.MIN_VALUE;
            } else {
                c34131 = new C34131(continuation);
            }
        }
        C34131 c341312 = c34131;
        Object obj5 = c341312.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c341312.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj5);
            Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
            objectRef7.element = options;
            Ref.ObjectRef objectRef8 = new Ref.ObjectRef();
            objectRef8.element = this.imageLoader.getComponents();
            objectRef = new Ref.ObjectRef();
            try {
                if (!this.requestService.allowHardwareWorkerThread((Options) objectRef7.element)) {
                    Options options2 = (Options) objectRef7.element;
                    objectRef7.element = options2.copy((32765 & 1) != 0 ? options2.context : null, (32765 & 2) != 0 ? options2.config : Bitmap.Config.ARGB_8888, (32765 & 4) != 0 ? options2.colorSpace : null, (32765 & 8) != 0 ? options2.size : null, (32765 & 16) != 0 ? options2.scale : null, (32765 & 32) != 0 ? options2.allowInexactSize : false, (32765 & 64) != 0 ? options2.allowRgb565 : false, (32765 & 128) != 0 ? options2.premultipliedAlpha : false, (32765 & 256) != 0 ? options2.diskCacheKey : null, (32765 & 512) != 0 ? options2.headers : null, (32765 & 1024) != 0 ? options2.tags : null, (32765 & 2048) != 0 ? options2.parameters : null, (32765 & 4096) != 0 ? options2.memoryCachePolicy : null, (32765 & 8192) != 0 ? options2.diskCachePolicy : null, (32765 & 16384) != 0 ? options2.networkCachePolicy : null);
                }
                if (imageRequest.getFetcherFactory() != null || imageRequest.getDecoderFactory() != null) {
                    ComponentRegistry.Builder builderNewBuilder = ((ComponentRegistry) objectRef8.element).newBuilder();
                    Pair<Fetcher.Factory<?>, Class<?>> fetcherFactory = imageRequest.getFetcherFactory();
                    if (fetcherFactory != null) {
                        builderNewBuilder.getFetcherFactories$coil_base_release().add(0, fetcherFactory);
                    }
                    Decoder.Factory decoderFactory = imageRequest.getDecoderFactory();
                    if (decoderFactory != null) {
                        builderNewBuilder.getDecoderFactories$coil_base_release().add(0, decoderFactory);
                    }
                    objectRef8.element = builderNewBuilder.build();
                }
                ComponentRegistry componentRegistry = (ComponentRegistry) objectRef8.element;
                Options options3 = (Options) objectRef7.element;
                c341312.L$0 = this;
                c341312.L$1 = imageRequest;
                c341312.L$2 = obj;
                c341312.L$3 = eventListener;
                c341312.L$4 = objectRef7;
                c341312.L$5 = objectRef8;
                c341312.L$6 = objectRef;
                c341312.L$7 = objectRef;
                c341312.label = 1;
                Object objFetch = fetch(componentRegistry, imageRequest, obj, options3, eventListener, c341312);
                if (objFetch == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj;
                eventListener2 = eventListener;
                objectRef3 = objectRef7;
                objectRef4 = objectRef8;
                objectRef5 = objectRef;
                imageRequest2 = imageRequest;
                engineInterceptor = this;
                t = objFetch;
                objectRef5.element = t;
                T t2 = objectRef.element;
                fetchResult = (FetchResult) t2;
                if (!(fetchResult instanceof SourceResult)) {
                }
            } catch (Throwable th) {
                th = th;
                objectRef2 = objectRef;
                T t3 = objectRef2.element;
                sourceResult = t3 instanceof SourceResult ? (SourceResult) t3 : null;
                if (sourceResult != null && (source = sourceResult.getSource()) != null) {
                    Utils.closeQuietly(source);
                }
                throw th;
            }
        } else if (i2 == 1) {
            objectRef5 = (Ref.ObjectRef) c341312.L$7;
            Ref.ObjectRef objectRef9 = (Ref.ObjectRef) c341312.L$6;
            Ref.ObjectRef objectRef10 = (Ref.ObjectRef) c341312.L$5;
            Ref.ObjectRef objectRef11 = (Ref.ObjectRef) c341312.L$4;
            eventListener2 = (EventListener) c341312.L$3;
            Object obj6 = c341312.L$2;
            imageRequest2 = (ImageRequest) c341312.L$1;
            engineInterceptor = (EngineInterceptor) c341312.L$0;
            try {
                ResultKt.throwOnFailure(obj5);
                objectRef = objectRef9;
                objectRef4 = objectRef10;
                objectRef3 = objectRef11;
                obj2 = obj6;
                t = obj5;
                objectRef5.element = t;
                T t22 = objectRef.element;
                fetchResult = (FetchResult) t22;
                if (!(fetchResult instanceof SourceResult)) {
                    CoroutineDispatcher decoderDispatcher = imageRequest2.getDecoderDispatcher();
                    EngineInterceptor$execute$executeResult$1 engineInterceptor$execute$executeResult$1 = new EngineInterceptor$execute$executeResult$1(engineInterceptor, objectRef, objectRef4, imageRequest2, obj2, objectRef3, eventListener2, null);
                    c341312.L$0 = engineInterceptor;
                    c341312.L$1 = imageRequest2;
                    c341312.L$2 = eventListener2;
                    c341312.L$3 = objectRef3;
                    c341312.L$4 = objectRef;
                    c341312.L$5 = null;
                    c341312.L$6 = null;
                    c341312.L$7 = null;
                    c341312.label = 2;
                    Object objWithContext = BuildersKt.withContext(decoderDispatcher, engineInterceptor$execute$executeResult$1, c341312);
                    if (objWithContext == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    eventListener3 = eventListener2;
                    imageRequest4 = imageRequest2;
                    engineInterceptor3 = engineInterceptor;
                    objectRef2 = objectRef;
                    obj3 = objWithContext;
                    objectRef = objectRef2;
                    engineInterceptor2 = engineInterceptor3;
                    eventListener2 = eventListener3;
                    imageRequest3 = imageRequest4;
                    Ref.ObjectRef objectRef12 = objectRef3;
                    executeResult = (ExecuteResult) obj3;
                    objectRef6 = objectRef12;
                    T t4 = objectRef.element;
                    if (t4 instanceof SourceResult) {
                    }
                    if (sourceResult2 != null) {
                        Utils.closeQuietly(source2);
                    }
                    Options options4 = (Options) objectRef6.element;
                    c341312.L$0 = null;
                    c341312.L$1 = null;
                    c341312.L$2 = null;
                    c341312.L$3 = null;
                    c341312.L$4 = null;
                    c341312.L$5 = null;
                    c341312.L$6 = null;
                    c341312.L$7 = null;
                    c341312.label = 3;
                    objTransform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult, imageRequest3, options4, eventListener2, c341312);
                    obj4 = objTransform$coil_base_release;
                    if (objTransform$coil_base_release == coroutine_suspended) {
                    }
                } else if (fetchResult instanceof DrawableResult) {
                    ExecuteResult executeResult2 = new ExecuteResult(((DrawableResult) t22).getDrawable(), ((DrawableResult) objectRef.element).getIsSampled(), ((DrawableResult) objectRef.element).getDataSource(), null);
                    objectRef6 = objectRef3;
                    imageRequest3 = imageRequest2;
                    executeResult = executeResult2;
                    engineInterceptor2 = engineInterceptor;
                    T t42 = objectRef.element;
                    if (t42 instanceof SourceResult) {
                    }
                    if (sourceResult2 != null) {
                    }
                    Options options42 = (Options) objectRef6.element;
                    c341312.L$0 = null;
                    c341312.L$1 = null;
                    c341312.L$2 = null;
                    c341312.L$3 = null;
                    c341312.L$4 = null;
                    c341312.L$5 = null;
                    c341312.L$6 = null;
                    c341312.L$7 = null;
                    c341312.label = 3;
                    objTransform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult, imageRequest3, options42, eventListener2, c341312);
                    obj4 = objTransform$coil_base_release;
                    if (objTransform$coil_base_release == coroutine_suspended) {
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th2) {
                th = th2;
                objectRef2 = objectRef9;
                T t32 = objectRef2.element;
                if (t32 instanceof SourceResult) {
                }
                if (sourceResult != null) {
                    Utils.closeQuietly(source);
                }
                throw th;
            }
        } else if (i2 == 2) {
            objectRef2 = (Ref.ObjectRef) c341312.L$4;
            objectRef3 = (Ref.ObjectRef) c341312.L$3;
            eventListener3 = (EventListener) c341312.L$2;
            imageRequest4 = (ImageRequest) c341312.L$1;
            engineInterceptor3 = (EngineInterceptor) c341312.L$0;
            try {
                ResultKt.throwOnFailure(obj5);
                obj3 = obj5;
                objectRef = objectRef2;
                engineInterceptor2 = engineInterceptor3;
                eventListener2 = eventListener3;
                imageRequest3 = imageRequest4;
                Ref.ObjectRef objectRef122 = objectRef3;
                executeResult = (ExecuteResult) obj3;
                objectRef6 = objectRef122;
                T t422 = objectRef.element;
                sourceResult2 = t422 instanceof SourceResult ? (SourceResult) t422 : null;
                if (sourceResult2 != null && (source2 = sourceResult2.getSource()) != null) {
                    Utils.closeQuietly(source2);
                }
                Options options422 = (Options) objectRef6.element;
                c341312.L$0 = null;
                c341312.L$1 = null;
                c341312.L$2 = null;
                c341312.L$3 = null;
                c341312.L$4 = null;
                c341312.L$5 = null;
                c341312.L$6 = null;
                c341312.L$7 = null;
                c341312.label = 3;
                objTransform$coil_base_release = engineInterceptor2.transform$coil_base_release(executeResult, imageRequest3, options422, eventListener2, c341312);
                obj4 = objTransform$coil_base_release;
                if (objTransform$coil_base_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th3) {
                th = th3;
                T t322 = objectRef2.element;
                if (t322 instanceof SourceResult) {
                }
                if (sourceResult != null) {
                }
                throw th;
            }
        } else {
            if (i2 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj5);
            obj4 = obj5;
        }
        ExecuteResult executeResult3 = (ExecuteResult) obj4;
        Drawable drawable = executeResult3.getDrawable();
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        if (bitmapDrawable != null && (bitmap = bitmapDrawable.getBitmap()) != null) {
            bitmap.prepareToDraw();
        }
        return executeResult3;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0091 -> B:21:0x0095). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetch(ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super FetchResult> continuation) throws Throwable {
        C34141 c34141;
        int i;
        EngineInterceptor engineInterceptor;
        Pair<Fetcher, Integer> pairNewFetcher;
        ImageSource source;
        if (continuation instanceof C34141) {
            c34141 = (C34141) continuation;
            int i2 = c34141.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c34141.label = i2 - Integer.MIN_VALUE;
            } else {
                c34141 = new C34141(continuation);
            }
        }
        Object obj2 = c34141.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c34141.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj2);
            i = 0;
            engineInterceptor = this;
            pairNewFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i);
            if (pairNewFetcher != null) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c34141.I$0;
            Fetcher fetcher = (Fetcher) c34141.L$6;
            EventListener eventListener2 = (EventListener) c34141.L$5;
            options = (Options) c34141.L$4;
            Object obj3 = c34141.L$3;
            ImageRequest imageRequest2 = (ImageRequest) c34141.L$2;
            ComponentRegistry componentRegistry2 = (ComponentRegistry) c34141.L$1;
            engineInterceptor = (EngineInterceptor) c34141.L$0;
            ResultKt.throwOnFailure(obj2);
            C34141 c341412 = c34141;
            int i5 = i4;
            componentRegistry = componentRegistry2;
            C34141 c341413 = c341412;
            Fetcher first = fetcher;
            imageRequest = imageRequest2;
            eventListener = eventListener2;
            obj = obj3;
            FetchResult fetchResult = (FetchResult) obj2;
            try {
                eventListener.fetchEnd(imageRequest, first, options, fetchResult);
                if (fetchResult == null) {
                    return fetchResult;
                }
                i = i5;
                c34141 = c341413;
                pairNewFetcher = componentRegistry.newFetcher(obj, options, engineInterceptor.imageLoader, i);
                if (pairNewFetcher != null) {
                    throw new IllegalStateException(("Unable to create a fetcher that supports: " + obj).toString());
                }
                first = pairNewFetcher.getFirst();
                int iIntValue = pairNewFetcher.getSecond().intValue() + 1;
                eventListener.fetchStart(imageRequest, first, options);
                c34141.L$0 = engineInterceptor;
                c34141.L$1 = componentRegistry;
                c34141.L$2 = imageRequest;
                c34141.L$3 = obj;
                c34141.L$4 = options;
                c34141.L$5 = eventListener;
                c34141.L$6 = first;
                c34141.I$0 = iIntValue;
                c34141.label = 1;
                Object objFetch = first.fetch(c34141);
                if (objFetch == coroutine_suspended) {
                    return coroutine_suspended;
                }
                C34141 c341414 = c34141;
                i5 = iIntValue;
                obj2 = objFetch;
                c341413 = c341414;
                FetchResult fetchResult2 = (FetchResult) obj2;
                eventListener.fetchEnd(imageRequest, first, options, fetchResult2);
                if (fetchResult2 == null) {
                }
            } catch (Throwable th) {
                SourceResult sourceResult = fetchResult2 instanceof SourceResult ? (SourceResult) fetchResult2 : null;
                if (sourceResult != null && (source = sourceResult.getSource()) != null) {
                    Utils.closeQuietly(source);
                }
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ac -> B:21:0x00b4). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decode(SourceResult sourceResult, ComponentRegistry componentRegistry, ImageRequest imageRequest, Object obj, Options options, EventListener eventListener, Continuation<? super ExecuteResult> continuation) throws Throwable {
        C34121 c34121;
        EngineInterceptor engineInterceptor;
        ImageRequest imageRequest2;
        Object obj2;
        Options options2;
        EventListener eventListener2;
        int i;
        C34121 c341212;
        EngineInterceptor engineInterceptor2;
        SourceResult sourceResult2;
        ComponentRegistry componentRegistry2;
        Pair<Decoder, Integer> pairNewDecoder;
        if (continuation instanceof C34121) {
            c34121 = (C34121) continuation;
            int i2 = c34121.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c34121.label = i2 - Integer.MIN_VALUE;
                engineInterceptor = this;
            } else {
                engineInterceptor = this;
                c34121 = engineInterceptor.new C34121(continuation);
            }
        }
        Object obj3 = c34121.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c34121.label;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj3);
            imageRequest2 = imageRequest;
            obj2 = obj;
            options2 = options;
            eventListener2 = eventListener;
            i = 0;
            c341212 = c34121;
            engineInterceptor2 = engineInterceptor;
            sourceResult2 = sourceResult;
            componentRegistry2 = componentRegistry;
            pairNewDecoder = componentRegistry2.newDecoder(sourceResult2, options2, engineInterceptor2.imageLoader, i);
            if (pairNewDecoder != null) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i4 = c34121.I$0;
            Decoder decoder = (Decoder) c34121.L$7;
            EventListener eventListener3 = (EventListener) c34121.L$6;
            Options options3 = (Options) c34121.L$5;
            Object obj4 = c34121.L$4;
            ImageRequest imageRequest3 = (ImageRequest) c34121.L$3;
            ComponentRegistry componentRegistry3 = (ComponentRegistry) c34121.L$2;
            SourceResult sourceResult3 = (SourceResult) c34121.L$1;
            engineInterceptor2 = (EngineInterceptor) c34121.L$0;
            ResultKt.throwOnFailure(obj3);
            C34121 c341213 = c34121;
            componentRegistry2 = componentRegistry3;
            int i5 = i4;
            imageRequest2 = imageRequest3;
            eventListener2 = eventListener3;
            options2 = options3;
            DecodeResult decodeResult = (DecodeResult) obj3;
            eventListener2.decodeEnd(imageRequest2, decoder, options2, decodeResult);
            if (decodeResult != null) {
                obj2 = obj4;
                i = i5;
                c341212 = c341213;
                sourceResult2 = sourceResult3;
                pairNewDecoder = componentRegistry2.newDecoder(sourceResult2, options2, engineInterceptor2.imageLoader, i);
                if (pairNewDecoder != null) {
                    throw new IllegalStateException(("Unable to create a decoder that supports: " + obj2).toString());
                }
                Decoder first = pairNewDecoder.getFirst();
                int iIntValue = pairNewDecoder.getSecond().intValue() + 1;
                eventListener2.decodeStart(imageRequest2, first, options2);
                c341212.L$0 = engineInterceptor2;
                c341212.L$1 = sourceResult2;
                c341212.L$2 = componentRegistry2;
                c341212.L$3 = imageRequest2;
                c341212.L$4 = obj2;
                c341212.L$5 = options2;
                c341212.L$6 = eventListener2;
                c341212.L$7 = first;
                c341212.I$0 = iIntValue;
                c341212.label = 1;
                Object objDecode = first.decode(c341212);
                if (objDecode == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sourceResult3 = sourceResult2;
                obj3 = objDecode;
                obj4 = obj2;
                decoder = first;
                c341213 = c341212;
                i5 = iIntValue;
                DecodeResult decodeResult2 = (DecodeResult) obj3;
                eventListener2.decodeEnd(imageRequest2, decoder, options2, decodeResult2);
                if (decodeResult2 != null) {
                }
            } else {
                Drawable drawable = decodeResult2.getDrawable();
                boolean isSampled = decodeResult2.getIsSampled();
                DataSource dataSource = sourceResult3.getDataSource();
                ImageSource source = sourceResult3.getSource();
                FileImageSource fileImageSource = source instanceof FileImageSource ? (FileImageSource) source : null;
                return new ExecuteResult(drawable, isSampled, dataSource, fileImageSource != null ? fileImageSource.getDiskCacheKey() : null);
            }
        }
    }

    @VisibleForTesting
    @Nullable
    public final Object transform$coil_base_release(@NotNull ExecuteResult executeResult, @NotNull ImageRequest imageRequest, @NotNull Options options, @NotNull EventListener eventListener, @NotNull Continuation<? super ExecuteResult> continuation) {
        List<Transformation> transformations = imageRequest.getTransformations();
        if (transformations.isEmpty()) {
            return executeResult;
        }
        if (!(executeResult.getDrawable() instanceof BitmapDrawable) && !imageRequest.getAllowConversionToBitmap()) {
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, "allowConversionToBitmap=false, skipping transformations for type " + executeResult.getDrawable().getClass().getCanonicalName() + '.', null);
            }
            return executeResult;
        }
        return BuildersKt.withContext(imageRequest.getTransformationDispatcher(), new EngineInterceptor$transform$3(this, executeResult, options, transformations, eventListener, imageRequest, null), continuation);
    }

    public final Bitmap convertDrawableToBitmap(Drawable drawable, Options options, List<? extends Transformation> transformations) {
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config safeConfig = Bitmaps.getSafeConfig(bitmap);
            if (ArraysKt___ArraysKt.contains(Utils.getVALID_TRANSFORMATION_CONFIGS(), safeConfig)) {
                return bitmap;
            }
            Logger logger = this.logger;
            if (logger != null && logger.getLevel() <= 4) {
                logger.log(TAG, 4, "Converting bitmap with config " + safeConfig + " to apply transformations: " + transformations + '.', null);
            }
        } else {
            Logger logger2 = this.logger;
            if (logger2 != null && logger2.getLevel() <= 4) {
                logger2.log(TAG, 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + transformations + '.', null);
            }
        }
        return DrawableUtils.INSTANCE.convertToBitmap(drawable, options.getConfig(), options.getSize(), options.getScale(), options.getAllowInexactSize());
    }

    /* compiled from: EngineInterceptor.kt */
    @Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ0\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0011¨\u0006\u0013"}, m7105d2 = {"Lcoil/intercept/EngineInterceptor$ExecuteResult;", "", "drawable", "Landroid/graphics/drawable/Drawable;", "isSampled", "", "dataSource", "Lcoil/decode/DataSource;", "diskCacheKey", "", "(Landroid/graphics/drawable/Drawable;ZLcoil/decode/DataSource;Ljava/lang/String;)V", "getDataSource", "()Lcoil/decode/DataSource;", "getDiskCacheKey", "()Ljava/lang/String;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "copy", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class ExecuteResult {

        @NotNull
        public final DataSource dataSource;

        @Nullable
        public final String diskCacheKey;

        @NotNull
        public final Drawable drawable;
        public final boolean isSampled;

        public ExecuteResult(@NotNull Drawable drawable, boolean z, @NotNull DataSource dataSource, @Nullable String str) {
            this.drawable = drawable;
            this.isSampled = z;
            this.dataSource = dataSource;
            this.diskCacheKey = str;
        }

        @NotNull
        public final Drawable getDrawable() {
            return this.drawable;
        }

        /* renamed from: isSampled, reason: from getter */
        public final boolean getIsSampled() {
            return this.isSampled;
        }

        @NotNull
        public final DataSource getDataSource() {
            return this.dataSource;
        }

        @Nullable
        public final String getDiskCacheKey() {
            return this.diskCacheKey;
        }

        public static /* synthetic */ ExecuteResult copy$default(ExecuteResult executeResult, Drawable drawable, boolean z, DataSource dataSource, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = executeResult.drawable;
            }
            if ((i & 2) != 0) {
                z = executeResult.isSampled;
            }
            if ((i & 4) != 0) {
                dataSource = executeResult.dataSource;
            }
            if ((i & 8) != 0) {
                str = executeResult.diskCacheKey;
            }
            return executeResult.copy(drawable, z, dataSource, str);
        }

        @NotNull
        public final ExecuteResult copy(@NotNull Drawable drawable, boolean isSampled, @NotNull DataSource dataSource, @Nullable String diskCacheKey) {
            return new ExecuteResult(drawable, isSampled, dataSource, diskCacheKey);
        }
    }
}
