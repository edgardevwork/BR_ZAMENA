package coil.request;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.MainThread;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import coil.decode.Decoder;
import coil.fetch.Fetcher;
import coil.memory.MemoryCache;
import coil.request.Parameters;
import coil.size.Dimension;
import coil.size.DisplaySizeResolver;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.Size;
import coil.size.SizeResolver;
import coil.size.SizeResolvers;
import coil.size.Sizes;
import coil.size.ViewSizeResolver;
import coil.size.ViewSizeResolvers;
import coil.target.ImageViewTarget;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transform.Transformation;
import coil.transition.CrossfadeTransition;
import coil.transition.Transition;
import coil.util.Collections;
import coil.util.Contexts;
import coil.util.Requests;
import coil.util.Utils;
import com.blackhub.bronline.game.core.constants.Other;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageRequest.kt */
@Metadata(m7104d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0004\u008c\u0001\u008d\u0001Bõ\u0002\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u001c\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020#\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010*\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010.\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020,\u0012\u0006\u00100\u001a\u000201\u0012\u0006\u00102\u001a\u000203\u0012\u0006\u00104\u001a\u000205\u0012\u0006\u00106\u001a\u000207\u0012\b\u00108\u001a\u0004\u0018\u00010\n\u0012\b\u00109\u001a\u0004\u0018\u00010:\u0012\b\u0010;\u001a\u0004\u0018\u00010<\u0012\b\u0010=\u001a\u0004\u0018\u00010:\u0012\b\u0010>\u001a\u0004\u0018\u00010<\u0012\b\u0010?\u001a\u0004\u0018\u00010:\u0012\b\u0010@\u001a\u0004\u0018\u00010<\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020D¢\u0006\u0002\u0010EJ\u0015\u0010\u0087\u0001\u001a\u00020#2\t\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u0089\u0001\u001a\u00020:H\u0016J\u0014\u0010\u008a\u0001\u001a\u00030\u008b\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007R\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0011\u0010$\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bH\u0010GR\u0011\u0010%\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\bL\u0010MR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u0010.\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bR\u0010SR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\bT\u0010UR\u0011\u0010C\u001a\u00020D¢\u0006\b\n\u0000\u001a\u0004\bV\u0010WR\u0011\u0010A\u001a\u00020B¢\u0006\b\n\u0000\u001a\u0004\bX\u0010YR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010[R\u0011\u0010)\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0013\u0010^\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0010\u0010>\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010=\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010aR\u0013\u0010b\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\bc\u0010`R\u0010\u0010@\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010?\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010aR\u0011\u0010-\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bd\u0010SR'\u0010\u0013\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0016\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\bg\u0010hR\u0011\u0010+\u001a\u00020,¢\u0006\b\n\u0000\u001a\u0004\bi\u0010SR\u0011\u00100\u001a\u000201¢\u0006\b\n\u0000\u001a\u0004\bj\u0010kR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bn\u0010oR\u0011\u0010'\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bp\u0010]R\u0011\u0010*\u001a\u00020(¢\u0006\b\n\u0000\u001a\u0004\bq\u0010]R\u0011\u00106\u001a\u000207¢\u0006\b\n\u0000\u001a\u0004\br\u0010sR\u0013\u0010t\u001a\u0004\u0018\u00010<8F¢\u0006\u0006\u001a\u0004\bu\u0010`R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u00108\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\bv\u0010oR\u0012\u00109\u001a\u0004\u0018\u00010:X\u0082\u0004¢\u0006\u0004\n\u0002\u0010aR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bw\u0010xR\u0011\u0010&\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\by\u0010GR\u0011\u00104\u001a\u000205¢\u0006\b\n\u0000\u001a\u0004\bz\u0010{R\u0011\u00102\u001a\u000203¢\u0006\b\n\u0000\u001a\u0004\b|\u0010}R\u0011\u0010 \u001a\u00020!¢\u0006\b\n\u0000\u001a\u0004\b~\u0010\u007fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0000\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0012\u0010/\u001a\u00020,¢\u0006\t\n\u0000\u001a\u0005\b\u0082\u0001\u0010SR\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\n\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0013\u0010\u001c\u001a\u00020\u001d¢\u0006\n\n\u0000\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008e\u0001"}, m7105d2 = {"Lcoil/request/ImageRequest;", "", "context", "Landroid/content/Context;", "data", "target", "Lcoil/target/Target;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/request/ImageRequest$Listener;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "diskCacheKey", "", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "precision", "Lcoil/size/Precision;", "fetcherFactory", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "decoderFactory", "Lcoil/decode/Decoder$Factory;", "transformations", "", "Lcoil/transform/Transformation;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "headers", "Lokhttp3/Headers;", "tags", "Lcoil/request/Tags;", "allowConversionToBitmap", "", "allowHardware", "allowRgb565", "premultipliedAlpha", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "interceptorDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "sizeResolver", "Lcoil/size/SizeResolver;", "scale", "Lcoil/size/Scale;", "parameters", "Lcoil/request/Parameters;", "placeholderMemoryCacheKey", "placeholderResId", "", "placeholderDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "errorDrawable", "fallbackResId", "fallbackDrawable", "defined", "Lcoil/request/DefinedRequestOptions;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "(Landroid/content/Context;Ljava/lang/Object;Lcoil/target/Target;Lcoil/request/ImageRequest$Listener;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Precision;Lkotlin/Pair;Lcoil/decode/Decoder$Factory;Ljava/util/List;Lcoil/transition/Transition$Factory;Lokhttp3/Headers;Lcoil/request/Tags;ZZZZLcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lcoil/request/Parameters;Lcoil/memory/MemoryCache$Key;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;Landroid/graphics/drawable/Drawable;Lcoil/request/DefinedRequestOptions;Lcoil/request/DefaultRequestOptions;)V", "getAllowConversionToBitmap", "()Z", "getAllowHardware", "getAllowRgb565", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "getContext", "()Landroid/content/Context;", "getData", "()Ljava/lang/Object;", "getDecoderDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDecoderFactory", "()Lcoil/decode/Decoder$Factory;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "getDefined", "()Lcoil/request/DefinedRequestOptions;", "getDiskCacheKey", "()Ljava/lang/String;", "getDiskCachePolicy", "()Lcoil/request/CachePolicy;", "error", "getError", "()Landroid/graphics/drawable/Drawable;", "Ljava/lang/Integer;", Other.FALLBACK, "getFallback", "getFetcherDispatcher", "getFetcherFactory", "()Lkotlin/Pair;", "getHeaders", "()Lokhttp3/Headers;", "getInterceptorDispatcher", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getListener", "()Lcoil/request/ImageRequest$Listener;", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "getMemoryCachePolicy", "getNetworkCachePolicy", "getParameters", "()Lcoil/request/Parameters;", "placeholder", "getPlaceholder", "getPlaceholderMemoryCacheKey", "getPrecision", "()Lcoil/size/Precision;", "getPremultipliedAlpha", "getScale", "()Lcoil/size/Scale;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "getTags", "()Lcoil/request/Tags;", "getTarget", "()Lcoil/target/Target;", "getTransformationDispatcher", "getTransformations", "()Ljava/util/List;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "equals", "other", "hashCode", "newBuilder", "Lcoil/request/ImageRequest$Builder;", "Builder", "Listener", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ImageRequest {
    public final boolean allowConversionToBitmap;
    public final boolean allowHardware;
    public final boolean allowRgb565;

    @NotNull
    public final Bitmap.Config bitmapConfig;

    @Nullable
    public final ColorSpace colorSpace;

    @NotNull
    public final Context context;

    @NotNull
    public final Object data;

    @NotNull
    public final CoroutineDispatcher decoderDispatcher;

    @Nullable
    public final Decoder.Factory decoderFactory;

    @NotNull
    public final DefaultRequestOptions defaults;

    @NotNull
    public final DefinedRequestOptions defined;

    @Nullable
    public final String diskCacheKey;

    @NotNull
    public final CachePolicy diskCachePolicy;

    @Nullable
    public final Drawable errorDrawable;

    @Nullable
    public final Integer errorResId;

    @Nullable
    public final Drawable fallbackDrawable;

    @Nullable
    public final Integer fallbackResId;

    @NotNull
    public final CoroutineDispatcher fetcherDispatcher;

    @Nullable
    public final Pair<Fetcher.Factory<?>, Class<?>> fetcherFactory;

    @NotNull
    public final Headers headers;

    @NotNull
    public final CoroutineDispatcher interceptorDispatcher;

    @NotNull
    public final Lifecycle lifecycle;

    @Nullable
    public final Listener listener;

    @Nullable
    public final MemoryCache.Key memoryCacheKey;

    @NotNull
    public final CachePolicy memoryCachePolicy;

    @NotNull
    public final CachePolicy networkCachePolicy;

    @NotNull
    public final Parameters parameters;

    @Nullable
    public final Drawable placeholderDrawable;

    @Nullable
    public final MemoryCache.Key placeholderMemoryCacheKey;

    @Nullable
    public final Integer placeholderResId;

    @NotNull
    public final Precision precision;
    public final boolean premultipliedAlpha;

    @NotNull
    public final Scale scale;

    @NotNull
    public final SizeResolver sizeResolver;

    @NotNull
    public final Tags tags;

    @Nullable
    public final Target target;

    @NotNull
    public final CoroutineDispatcher transformationDispatcher;

    @NotNull
    public final List<Transformation> transformations;

    @NotNull
    public final Transition.Factory transitionFactory;

    public /* synthetic */ ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair pair, Decoder.Factory factory, List list, Transition.Factory factory2, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, target, listener, key, str, config, colorSpace, precision, pair, factory, list, factory2, headers, tags, z, z2, z3, z4, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, sizeResolver, scale, parameters, key2, num, drawable, num2, drawable2, num3, drawable3, definedRequestOptions, defaultRequestOptions);
    }

    @JvmOverloads
    @NotNull
    public final Builder newBuilder() {
        return newBuilder$default(this, null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest(Context context, Object obj, Target target, Listener listener, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, Precision precision, Pair<? extends Fetcher.Factory<?>, ? extends Class<?>> pair, Decoder.Factory factory, List<? extends Transformation> list, Transition.Factory factory2, Headers headers, Tags tags, boolean z, boolean z2, boolean z3, boolean z4, CachePolicy cachePolicy, CachePolicy cachePolicy2, CachePolicy cachePolicy3, CoroutineDispatcher coroutineDispatcher, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, CoroutineDispatcher coroutineDispatcher4, Lifecycle lifecycle, SizeResolver sizeResolver, Scale scale, Parameters parameters, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, DefinedRequestOptions definedRequestOptions, DefaultRequestOptions defaultRequestOptions) {
        this.context = context;
        this.data = obj;
        this.target = target;
        this.listener = listener;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.bitmapConfig = config;
        this.colorSpace = colorSpace;
        this.precision = precision;
        this.fetcherFactory = pair;
        this.decoderFactory = factory;
        this.transformations = list;
        this.transitionFactory = factory2;
        this.headers = headers;
        this.tags = tags;
        this.allowConversionToBitmap = z;
        this.allowHardware = z2;
        this.allowRgb565 = z3;
        this.premultipliedAlpha = z4;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
        this.interceptorDispatcher = coroutineDispatcher;
        this.fetcherDispatcher = coroutineDispatcher2;
        this.decoderDispatcher = coroutineDispatcher3;
        this.transformationDispatcher = coroutineDispatcher4;
        this.lifecycle = lifecycle;
        this.sizeResolver = sizeResolver;
        this.scale = scale;
        this.parameters = parameters;
        this.placeholderMemoryCacheKey = key2;
        this.placeholderResId = num;
        this.placeholderDrawable = drawable;
        this.errorResId = num2;
        this.errorDrawable = drawable2;
        this.fallbackResId = num3;
        this.fallbackDrawable = drawable3;
        this.defined = definedRequestOptions;
        this.defaults = defaultRequestOptions;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final Object getData() {
        return this.data;
    }

    @Nullable
    public final Target getTarget() {
        return this.target;
    }

    @Nullable
    public final Listener getListener() {
        return this.listener;
    }

    @Nullable
    public final MemoryCache.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    @Nullable
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    @NotNull
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @Nullable
    public final ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    @NotNull
    public final Precision getPrecision() {
        return this.precision;
    }

    @Nullable
    public final Pair<Fetcher.Factory<?>, Class<?>> getFetcherFactory() {
        return this.fetcherFactory;
    }

    @Nullable
    public final Decoder.Factory getDecoderFactory() {
        return this.decoderFactory;
    }

    @NotNull
    public final List<Transformation> getTransformations() {
        return this.transformations;
    }

    @NotNull
    public final Transition.Factory getTransitionFactory() {
        return this.transitionFactory;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.headers;
    }

    @NotNull
    public final Tags getTags() {
        return this.tags;
    }

    public final boolean getAllowConversionToBitmap() {
        return this.allowConversionToBitmap;
    }

    public final boolean getAllowHardware() {
        return this.allowHardware;
    }

    public final boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    public final boolean getPremultipliedAlpha() {
        return this.premultipliedAlpha;
    }

    @NotNull
    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @NotNull
    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    @NotNull
    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @NotNull
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    @NotNull
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    @NotNull
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @NotNull
    public final SizeResolver getSizeResolver() {
        return this.sizeResolver;
    }

    @NotNull
    public final Scale getScale() {
        return this.scale;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.parameters;
    }

    @Nullable
    public final MemoryCache.Key getPlaceholderMemoryCacheKey() {
        return this.placeholderMemoryCacheKey;
    }

    @NotNull
    public final DefinedRequestOptions getDefined() {
        return this.defined;
    }

    @NotNull
    public final DefaultRequestOptions getDefaults() {
        return this.defaults;
    }

    @Nullable
    public final Drawable getPlaceholder() {
        return Requests.getDrawableCompat(this, this.placeholderDrawable, this.placeholderResId, this.defaults.getPlaceholder());
    }

    @Nullable
    public final Drawable getError() {
        return Requests.getDrawableCompat(this, this.errorDrawable, this.errorResId, this.defaults.getError());
    }

    @Nullable
    public final Drawable getFallback() {
        return Requests.getDrawableCompat(this, this.fallbackDrawable, this.fallbackResId, this.defaults.getFallback());
    }

    public static /* synthetic */ Builder newBuilder$default(ImageRequest imageRequest, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = imageRequest.context;
        }
        return imageRequest.newBuilder(context);
    }

    @JvmOverloads
    @NotNull
    public final Builder newBuilder(@NotNull Context context) {
        return new Builder(this, context);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof ImageRequest) {
            ImageRequest imageRequest = (ImageRequest) other;
            if (Intrinsics.areEqual(this.context, imageRequest.context) && Intrinsics.areEqual(this.data, imageRequest.data) && Intrinsics.areEqual(this.target, imageRequest.target) && Intrinsics.areEqual(this.listener, imageRequest.listener) && Intrinsics.areEqual(this.memoryCacheKey, imageRequest.memoryCacheKey) && Intrinsics.areEqual(this.diskCacheKey, imageRequest.diskCacheKey) && this.bitmapConfig == imageRequest.bitmapConfig && ((Build.VERSION.SDK_INT < 26 || Intrinsics.areEqual(this.colorSpace, imageRequest.colorSpace)) && this.precision == imageRequest.precision && Intrinsics.areEqual(this.fetcherFactory, imageRequest.fetcherFactory) && Intrinsics.areEqual(this.decoderFactory, imageRequest.decoderFactory) && Intrinsics.areEqual(this.transformations, imageRequest.transformations) && Intrinsics.areEqual(this.transitionFactory, imageRequest.transitionFactory) && Intrinsics.areEqual(this.headers, imageRequest.headers) && Intrinsics.areEqual(this.tags, imageRequest.tags) && this.allowConversionToBitmap == imageRequest.allowConversionToBitmap && this.allowHardware == imageRequest.allowHardware && this.allowRgb565 == imageRequest.allowRgb565 && this.premultipliedAlpha == imageRequest.premultipliedAlpha && this.memoryCachePolicy == imageRequest.memoryCachePolicy && this.diskCachePolicy == imageRequest.diskCachePolicy && this.networkCachePolicy == imageRequest.networkCachePolicy && Intrinsics.areEqual(this.interceptorDispatcher, imageRequest.interceptorDispatcher) && Intrinsics.areEqual(this.fetcherDispatcher, imageRequest.fetcherDispatcher) && Intrinsics.areEqual(this.decoderDispatcher, imageRequest.decoderDispatcher) && Intrinsics.areEqual(this.transformationDispatcher, imageRequest.transformationDispatcher) && Intrinsics.areEqual(this.placeholderMemoryCacheKey, imageRequest.placeholderMemoryCacheKey) && Intrinsics.areEqual(this.placeholderResId, imageRequest.placeholderResId) && Intrinsics.areEqual(this.placeholderDrawable, imageRequest.placeholderDrawable) && Intrinsics.areEqual(this.errorResId, imageRequest.errorResId) && Intrinsics.areEqual(this.errorDrawable, imageRequest.errorDrawable) && Intrinsics.areEqual(this.fallbackResId, imageRequest.fallbackResId) && Intrinsics.areEqual(this.fallbackDrawable, imageRequest.fallbackDrawable) && Intrinsics.areEqual(this.lifecycle, imageRequest.lifecycle) && Intrinsics.areEqual(this.sizeResolver, imageRequest.sizeResolver) && this.scale == imageRequest.scale && Intrinsics.areEqual(this.parameters, imageRequest.parameters) && Intrinsics.areEqual(this.defined, imageRequest.defined) && Intrinsics.areEqual(this.defaults, imageRequest.defaults))) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.data.hashCode()) * 31;
        Target target = this.target;
        int iHashCode2 = (iHashCode + (target != null ? target.hashCode() : 0)) * 31;
        Listener listener = this.listener;
        int iHashCode3 = (iHashCode2 + (listener != null ? listener.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.memoryCacheKey;
        int iHashCode4 = (iHashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        int iHashCode5 = (((iHashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.bitmapConfig.hashCode()) * 31;
        ColorSpace colorSpace = this.colorSpace;
        int iHashCode6 = (((iHashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.precision.hashCode()) * 31;
        Pair<Fetcher.Factory<?>, Class<?>> pair = this.fetcherFactory;
        int iHashCode7 = (iHashCode6 + (pair != null ? pair.hashCode() : 0)) * 31;
        Decoder.Factory factory = this.decoderFactory;
        int iHashCode8 = (((((((((((((((((((((((((((((((((((((((iHashCode7 + (factory != null ? factory.hashCode() : 0)) * 31) + this.transformations.hashCode()) * 31) + this.transitionFactory.hashCode()) * 31) + this.headers.hashCode()) * 31) + this.tags.hashCode()) * 31) + Boolean.hashCode(this.allowConversionToBitmap)) * 31) + Boolean.hashCode(this.allowHardware)) * 31) + Boolean.hashCode(this.allowRgb565)) * 31) + Boolean.hashCode(this.premultipliedAlpha)) * 31) + this.memoryCachePolicy.hashCode()) * 31) + this.diskCachePolicy.hashCode()) * 31) + this.networkCachePolicy.hashCode()) * 31) + this.interceptorDispatcher.hashCode()) * 31) + this.fetcherDispatcher.hashCode()) * 31) + this.decoderDispatcher.hashCode()) * 31) + this.transformationDispatcher.hashCode()) * 31) + this.lifecycle.hashCode()) * 31) + this.sizeResolver.hashCode()) * 31) + this.scale.hashCode()) * 31) + this.parameters.hashCode()) * 31;
        MemoryCache.Key key2 = this.placeholderMemoryCacheKey;
        int iHashCode9 = (iHashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.placeholderResId;
        int iHashCode10 = (iHashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.placeholderDrawable;
        int iHashCode11 = (iHashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.errorResId;
        int iHashCode12 = (iHashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.errorDrawable;
        int iHashCode13 = (iHashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.fallbackResId;
        int iHashCode14 = (iHashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.fallbackDrawable;
        return ((((iHashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.defined.hashCode()) * 31) + this.defaults.hashCode();
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0017J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u000bH\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, m7105d2 = {"Lcoil/request/ImageRequest$Listener;", "", "onCancel", "", "request", "Lcoil/request/ImageRequest;", "onError", "result", "Lcoil/request/ErrorResult;", "onStart", "onSuccess", "Lcoil/request/SuccessResult;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public interface Listener {
        @MainThread
        default void onCancel(@NotNull ImageRequest request) {
        }

        @MainThread
        default void onError(@NotNull ImageRequest request, @NotNull ErrorResult result) {
        }

        @MainThread
        default void onStart(@NotNull ImageRequest request) {
        }

        @MainThread
        default void onSuccess(@NotNull ImageRequest request, @NotNull SuccessResult result) {
        }

        /* compiled from: ImageRequest.kt */
        @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
        public static final class DefaultImpls {
            @MainThread
            @Deprecated
            public static void onStart(@NotNull Listener listener, @NotNull ImageRequest imageRequest) {
                Listener.super.onStart(imageRequest);
            }

            @MainThread
            @Deprecated
            public static void onCancel(@NotNull Listener listener, @NotNull ImageRequest imageRequest) {
                Listener.super.onCancel(imageRequest);
            }

            @MainThread
            @Deprecated
            public static void onError(@NotNull Listener listener, @NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult) {
                Listener.super.onError(imageRequest, errorResult);
            }

            @MainThread
            @Deprecated
            public static void onSuccess(@NotNull Listener listener, @NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
                Listener.super.onSuccess(imageRequest, successResult);
            }
        }
    }

    /* compiled from: ImageRequest.kt */
    @Metadata(m7104d1 = {"\u0000®\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u0016\u0010L\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0019J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010P\u001a\u00020\u000eJ\u0006\u0010Q\u001a\u00020\u0006J\u0010\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010R\u001a\u00020\u00002\u0006\u0010S\u001a\u00020\u001fJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001J\u0010\u0010T\u001a\u00020\u00002\u0006\u0010T\u001a\u00020UH\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010W\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u001bJ\u000e\u0010V\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J\u0010\u0010Z\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010Z\u001a\u00020\u00002\b\b\u0001\u0010\\\u001a\u00020\u001fJ\u0010\u0010]\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010]\u001a\u00020\u00002\b\b\u0001\u0010\\\u001a\u00020\u001fJ\u0010\u0010^\u001a\u00020\u00002\u0006\u0010^\u001a\u00020_H\u0007J\u000e\u0010#\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J#\u0010$\u001a\u00020\u0000\"\n\b\u0000\u0010`\u0018\u0001*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u0002H`0&H\u0086\bJ,\u0010$\u001a\u00020\u0000\"\b\b\u0000\u0010`*\u00020\u00012\f\u0010W\u001a\b\u0012\u0004\u0012\u0002H`0&2\f\u0010a\u001a\b\u0012\u0004\u0012\u0002H`0'J\u000e\u0010(\u001a\u00020\u00002\u0006\u0010(\u001a\u00020bJ\u000e\u0010*\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J\u0010\u0010+\u001a\u00020\u00002\b\u0010+\u001a\u0004\u0018\u00010,J\u0010\u0010+\u001a\u00020\u00002\b\u0010c\u001a\u0004\u0018\u00010dJÇ\u0001\u0010-\u001a\u00020\u00002#\b\u0006\u0010e\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020h0f2#\b\u0006\u0010i\u001a\u001d\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(\u0005\u0012\u0004\u0012\u00020h0f28\b\u0006\u0010j\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110l¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020h0k28\b\u0006\u0010n\u001a2\u0012\u0013\u0012\u00110\u0006¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(\u0005\u0012\u0013\u0012\u00110o¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020h0kH\u0086\bJ\u0010\u0010-\u001a\u00020\u00002\b\u0010-\u001a\u0004\u0018\u00010.J\u0010\u0010/\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u000100J\u0010\u0010/\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010\u0019J\u000e\u00101\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u001bJ\u000e\u00102\u001a\u00020\u00002\u0006\u0010Y\u001a\u00020\u001bJ\u000e\u00103\u001a\u00020\u00002\u0006\u00103\u001a\u00020pJ\u0010\u0010q\u001a\u00020\u00002\b\u0010[\u001a\u0004\u0018\u00010\u001dJ\u0010\u0010q\u001a\u00020\u00002\b\b\u0001\u0010\\\u001a\u00020\u001fJ\u0010\u00106\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u000100J\u0010\u00106\u001a\u00020\u00002\b\u0010X\u001a\u0004\u0018\u00010\u0019J\u000e\u00108\u001a\u00020\u00002\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010O\u001a\u00020\tJ\u000e\u0010r\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u0019J\u000e\u0010s\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u0019J\b\u0010t\u001a\u00020hH\u0002J\b\u0010u\u001a\u00020hH\u0002J\b\u0010v\u001a\u00020,H\u0002J\b\u0010w\u001a\u00020=H\u0002J\b\u0010x\u001a\u00020?H\u0002J\u000e\u0010@\u001a\u00020\u00002\u0006\u0010@\u001a\u00020=J\u0016\u0010y\u001a\u00020\u00002\u0006\u0010M\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0019J&\u0010z\u001a\u00020\u00002\u0006\u0010X\u001a\u00020\u00192\b\u0010N\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0019H\u0007J\u0016\u0010{\u001a\u00020\u00002\u0006\u0010|\u001a\u00020}2\u0006\u0010~\u001a\u00020}J\u000e\u0010{\u001a\u00020\u00002\u0006\u0010{\u001a\u00020\u007fJ\u000f\u0010{\u001a\u00020\u00002\u0007\u0010\u0080\u0001\u001a\u00020?J\u0010\u0010{\u001a\u00020\u00002\b\b\u0001\u0010{\u001a\u00020\u001fJ\u001a\u0010{\u001a\u00020\u00002\b\b\u0001\u0010|\u001a\u00020\u001f2\b\b\u0001\u0010~\u001a\u00020\u001fJ'\u0010\u0081\u0001\u001a\u00020\u0000\"\n\b\u0000\u0010`\u0018\u0001*\u00020\u00012\t\u0010\u0081\u0001\u001a\u0004\u0018\u0001H`H\u0086\b¢\u0006\u0003\u0010\u0082\u0001J2\u0010\u0081\u0001\u001a\u00020\u0000\"\b\b\u0000\u0010`*\u00020\u00012\u000e\u0010a\u001a\n\u0012\u0006\b\u0000\u0012\u0002H`0'2\t\u0010\u0081\u0001\u001a\u0004\u0018\u0001H`¢\u0006\u0003\u0010\u0083\u0001J\u000f\u0010B\u001a\u00020\u00002\u0007\u0010B\u001a\u00030\u0084\u0001J|\u0010D\u001a\u00020\u00002%\b\u0006\u0010e\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(q\u0012\u0004\u0012\u00020h0f2%\b\u0006\u0010j\u001a\u001f\u0012\u0015\u0012\u0013\u0018\u00010\u001d¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(Z\u0012\u0004\u0012\u00020h0f2#\b\u0006\u0010n\u001a\u001d\u0012\u0013\u0012\u00110\u001d¢\u0006\f\bg\u0012\b\bM\u0012\u0004\b\b(m\u0012\u0004\u0012\u00020h0fH\u0086\bJ\u0010\u0010D\u001a\u00020\u00002\b\u0010\u0085\u0001\u001a\u00030\u0086\u0001J\u0010\u0010D\u001a\u00020\u00002\b\u0010D\u001a\u0004\u0018\u00010EJ\u000e\u0010F\u001a\u00020\u00002\u0006\u0010V\u001a\u00020\u0013J!\u0010G\u001a\u00020\u00002\u0013\u0010G\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020I0\u0087\u0001\"\u00020I¢\u0006\u0003\u0010\u0088\u0001J\u0014\u0010G\u001a\u00020\u00002\f\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HJ\u0013\u0010\u0089\u0001\u001a\u00020\u00002\b\u0010\u0089\u0001\u001a\u00030\u008a\u0001H\u0007J\u000f\u0010J\u001a\u00020\u00002\u0007\u0010\u0089\u0001\u001a\u00020KR\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0012\u0010\f\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010 R\u0010\u0010#\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010$\u001a\u0018\u0012\b\u0012\u0006\u0012\u0002\b\u00030&\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00102\u001a\u0004\u0018\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000100X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00107\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0004\n\u0002\u0010 R\u0010\u00108\u001a\u0004\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010A\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010B\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0004\u0012\u00020\u0001\u0018\u00010CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010D\u001a\u0004\u0018\u00010EX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010F\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010G\u001a\b\u0012\u0004\u0012\u00020I0HX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010J\u001a\u0004\u0018\u00010KX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u008b\u0001"}, m7105d2 = {"Lcoil/request/ImageRequest$Builder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "request", "Lcoil/request/ImageRequest;", "(Lcoil/request/ImageRequest;Landroid/content/Context;)V", "allowConversionToBitmap", "", "allowHardware", "Ljava/lang/Boolean;", "allowRgb565", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "colorSpace", "Landroid/graphics/ColorSpace;", "data", "decoderDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "decoderFactory", "Lcoil/decode/Decoder$Factory;", RemoteConfigComponent.DEFAULTS_FILE_NAME, "Lcoil/request/DefaultRequestOptions;", "diskCacheKey", "", "diskCachePolicy", "Lcoil/request/CachePolicy;", "errorDrawable", "Landroid/graphics/drawable/Drawable;", "errorResId", "", "Ljava/lang/Integer;", "fallbackDrawable", "fallbackResId", "fetcherDispatcher", "fetcherFactory", "Lkotlin/Pair;", "Lcoil/fetch/Fetcher$Factory;", "Ljava/lang/Class;", "headers", "Lokhttp3/Headers$Builder;", "interceptorDispatcher", "lifecycle", "Landroidx/lifecycle/Lifecycle;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcoil/request/ImageRequest$Listener;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "memoryCachePolicy", "networkCachePolicy", "parameters", "Lcoil/request/Parameters$Builder;", "placeholderDrawable", "placeholderMemoryCacheKey", "placeholderResId", "precision", "Lcoil/size/Precision;", "premultipliedAlpha", "resolvedLifecycle", "resolvedScale", "Lcoil/size/Scale;", "resolvedSizeResolver", "Lcoil/size/SizeResolver;", "scale", "sizeResolver", "tags", "", "target", "Lcoil/target/Target;", "transformationDispatcher", "transformations", "", "Lcoil/transform/Transformation;", "transitionFactory", "Lcoil/transition/Transition$Factory;", "addHeader", "name", "value", "enable", "config", "build", "crossfade", "durationMillis", "decoder", "Lcoil/decode/Decoder;", "dispatcher", "factory", "key", "policy", "error", "drawable", "drawableResId", Other.FALLBACK, "fetcher", "Lcoil/fetch/Fetcher;", ExifInterface.GPS_DIRECTION_TRUE, "type", "Lokhttp3/Headers;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "", "onCancel", "onError", "Lkotlin/Function2;", "Lcoil/request/ErrorResult;", "result", "onSuccess", "Lcoil/request/SuccessResult;", "Lcoil/request/Parameters;", "placeholder", "removeHeader", "removeParameter", "resetResolvedScale", "resetResolvedValues", "resolveLifecycle", "resolveScale", "resolveSizeResolver", "setHeader", "setParameter", "size", "width", "Lcoil/size/Dimension;", "height", "Lcoil/size/Size;", "resolver", "tag", "(Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "(Ljava/lang/Class;Ljava/lang/Object;)Lcoil/request/ImageRequest$Builder;", "Lcoil/request/Tags;", "imageView", "Landroid/widget/ImageView;", "", "([Lcoil/transform/Transformation;)Lcoil/request/ImageRequest$Builder;", AnimatedStateListDrawableCompat.ELEMENT_TRANSITION, "Lcoil/transition/Transition;", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nImageRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageRequest.kt\ncoil/request/ImageRequest$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1057:1\n1#2:1058\n*E\n"})
    public static final class Builder {
        public boolean allowConversionToBitmap;

        @Nullable
        public Boolean allowHardware;

        @Nullable
        public Boolean allowRgb565;

        @Nullable
        public Bitmap.Config bitmapConfig;

        @Nullable
        public ColorSpace colorSpace;

        @NotNull
        public final Context context;

        @Nullable
        public Object data;

        @Nullable
        public CoroutineDispatcher decoderDispatcher;

        @Nullable
        public Decoder.Factory decoderFactory;

        @NotNull
        public DefaultRequestOptions defaults;

        @Nullable
        public String diskCacheKey;

        @Nullable
        public CachePolicy diskCachePolicy;

        @Nullable
        public Drawable errorDrawable;

        @DrawableRes
        @Nullable
        public Integer errorResId;

        @Nullable
        public Drawable fallbackDrawable;

        @DrawableRes
        @Nullable
        public Integer fallbackResId;

        @Nullable
        public CoroutineDispatcher fetcherDispatcher;

        @Nullable
        public Pair<? extends Fetcher.Factory<?>, ? extends Class<?>> fetcherFactory;

        @Nullable
        public Headers.Builder headers;

        @Nullable
        public CoroutineDispatcher interceptorDispatcher;

        @Nullable
        public Lifecycle lifecycle;

        @Nullable
        public Listener listener;

        @Nullable
        public MemoryCache.Key memoryCacheKey;

        @Nullable
        public CachePolicy memoryCachePolicy;

        @Nullable
        public CachePolicy networkCachePolicy;

        @Nullable
        public Parameters.Builder parameters;

        @Nullable
        public Drawable placeholderDrawable;

        @Nullable
        public MemoryCache.Key placeholderMemoryCacheKey;

        @DrawableRes
        @Nullable
        public Integer placeholderResId;

        @Nullable
        public Precision precision;
        public boolean premultipliedAlpha;

        @Nullable
        public Lifecycle resolvedLifecycle;

        @Nullable
        public Scale resolvedScale;

        @Nullable
        public SizeResolver resolvedSizeResolver;

        @Nullable
        public Scale scale;

        @Nullable
        public SizeResolver sizeResolver;

        @Nullable
        public Map<Class<?>, Object> tags;

        @Nullable
        public Target target;

        @Nullable
        public CoroutineDispatcher transformationDispatcher;

        @NotNull
        public List<? extends Transformation> transformations;

        @Nullable
        public Transition.Factory transitionFactory;

        @JvmOverloads
        public Builder(@NotNull ImageRequest imageRequest) {
            this(imageRequest, null, 2, null);
        }

        @JvmOverloads
        @NotNull
        public final Builder setParameter(@NotNull String str, @Nullable Object obj) {
            return setParameter$default(this, str, obj, null, 4, null);
        }

        public Builder(@NotNull Context context) {
            this.context = context;
            this.defaults = Requests.getDEFAULT_REQUEST_OPTIONS();
            this.data = null;
            this.target = null;
            this.listener = null;
            this.memoryCacheKey = null;
            this.diskCacheKey = null;
            this.bitmapConfig = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = null;
            }
            this.precision = null;
            this.fetcherFactory = null;
            this.decoderFactory = null;
            this.transformations = CollectionsKt__CollectionsKt.emptyList();
            this.transitionFactory = null;
            this.headers = null;
            this.tags = null;
            this.allowConversionToBitmap = true;
            this.allowHardware = null;
            this.allowRgb565 = null;
            this.premultipliedAlpha = true;
            this.memoryCachePolicy = null;
            this.diskCachePolicy = null;
            this.networkCachePolicy = null;
            this.interceptorDispatcher = null;
            this.fetcherDispatcher = null;
            this.decoderDispatcher = null;
            this.transformationDispatcher = null;
            this.parameters = null;
            this.placeholderMemoryCacheKey = null;
            this.placeholderResId = null;
            this.placeholderDrawable = null;
            this.errorResId = null;
            this.errorDrawable = null;
            this.fallbackResId = null;
            this.fallbackDrawable = null;
            this.lifecycle = null;
            this.sizeResolver = null;
            this.scale = null;
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        @JvmOverloads
        public Builder(@NotNull ImageRequest imageRequest, @NotNull Context context) {
            this.context = context;
            this.defaults = imageRequest.getDefaults();
            this.data = imageRequest.getData();
            this.target = imageRequest.getTarget();
            this.listener = imageRequest.getListener();
            this.memoryCacheKey = imageRequest.getMemoryCacheKey();
            this.diskCacheKey = imageRequest.getDiskCacheKey();
            this.bitmapConfig = imageRequest.getDefined().getBitmapConfig();
            if (Build.VERSION.SDK_INT >= 26) {
                this.colorSpace = imageRequest.getColorSpace();
            }
            this.precision = imageRequest.getDefined().getPrecision();
            this.fetcherFactory = imageRequest.getFetcherFactory();
            this.decoderFactory = imageRequest.getDecoderFactory();
            this.transformations = imageRequest.getTransformations();
            this.transitionFactory = imageRequest.getDefined().getTransitionFactory();
            this.headers = imageRequest.getHeaders().newBuilder();
            this.tags = MapsKt__MapsKt.toMutableMap(imageRequest.getTags().asMap());
            this.allowConversionToBitmap = imageRequest.getAllowConversionToBitmap();
            this.allowHardware = imageRequest.getDefined().getAllowHardware();
            this.allowRgb565 = imageRequest.getDefined().getAllowRgb565();
            this.premultipliedAlpha = imageRequest.getPremultipliedAlpha();
            this.memoryCachePolicy = imageRequest.getDefined().getMemoryCachePolicy();
            this.diskCachePolicy = imageRequest.getDefined().getDiskCachePolicy();
            this.networkCachePolicy = imageRequest.getDefined().getNetworkCachePolicy();
            this.interceptorDispatcher = imageRequest.getDefined().getInterceptorDispatcher();
            this.fetcherDispatcher = imageRequest.getDefined().getFetcherDispatcher();
            this.decoderDispatcher = imageRequest.getDefined().getDecoderDispatcher();
            this.transformationDispatcher = imageRequest.getDefined().getTransformationDispatcher();
            this.parameters = imageRequest.getParameters().newBuilder();
            this.placeholderMemoryCacheKey = imageRequest.getPlaceholderMemoryCacheKey();
            this.placeholderResId = imageRequest.placeholderResId;
            this.placeholderDrawable = imageRequest.placeholderDrawable;
            this.errorResId = imageRequest.errorResId;
            this.errorDrawable = imageRequest.errorDrawable;
            this.fallbackResId = imageRequest.fallbackResId;
            this.fallbackDrawable = imageRequest.fallbackDrawable;
            this.lifecycle = imageRequest.getDefined().getLifecycle();
            this.sizeResolver = imageRequest.getDefined().getSizeResolver();
            this.scale = imageRequest.getDefined().getScale();
            if (imageRequest.getContext() == context) {
                this.resolvedLifecycle = imageRequest.getLifecycle();
                this.resolvedSizeResolver = imageRequest.getSizeResolver();
                this.resolvedScale = imageRequest.getScale();
            } else {
                this.resolvedLifecycle = null;
                this.resolvedSizeResolver = null;
                this.resolvedScale = null;
            }
        }

        public /* synthetic */ Builder(ImageRequest imageRequest, Context context, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(imageRequest, (i & 2) != 0 ? imageRequest.getContext() : context);
        }

        @NotNull
        public final Builder data(@Nullable Object data) {
            this.data = data;
            return this;
        }

        @NotNull
        public final Builder memoryCacheKey(@Nullable String key) {
            return memoryCacheKey(key != null ? new MemoryCache.Key(key, null, 2, null) : null);
        }

        @NotNull
        public final Builder memoryCacheKey(@Nullable MemoryCache.Key key) {
            this.memoryCacheKey = key;
            return this;
        }

        @NotNull
        public final Builder diskCacheKey(@Nullable String key) {
            this.diskCacheKey = key;
            return this;
        }

        public static /* synthetic */ Builder listener$default(Builder builder, Function1 function1, Function1 function12, Function2 function2, Function2 function22, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = new Function1<ImageRequest, Unit>() { // from class: coil.request.ImageRequest$Builder$listener$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ImageRequest imageRequest) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageRequest imageRequest) {
                        invoke2(imageRequest);
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 2) != 0) {
                function12 = new Function1<ImageRequest, Unit>() { // from class: coil.request.ImageRequest$Builder$listener$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ImageRequest imageRequest) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(ImageRequest imageRequest) {
                        invoke2(imageRequest);
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 4) != 0) {
                function2 = new Function2<ImageRequest, ErrorResult, Unit>() { // from class: coil.request.ImageRequest$Builder$listener$3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ImageRequest imageRequest, @NotNull ErrorResult errorResult) {
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(ImageRequest imageRequest, ErrorResult errorResult) {
                        invoke2(imageRequest, errorResult);
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 8) != 0) {
                function22 = new Function2<ImageRequest, SuccessResult, Unit>() { // from class: coil.request.ImageRequest$Builder$listener$4
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull ImageRequest imageRequest, @NotNull SuccessResult successResult) {
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(ImageRequest imageRequest, SuccessResult successResult) {
                        invoke2(imageRequest, successResult);
                        return Unit.INSTANCE;
                    }
                };
            }
            return builder.listener(new ImageRequest$Builder$listener$5(function1, function12, function2, function22));
        }

        @NotNull
        public final Builder listener(@NotNull Function1<? super ImageRequest, Unit> function1, @NotNull Function1<? super ImageRequest, Unit> function12, @NotNull Function2<? super ImageRequest, ? super ErrorResult, Unit> function2, @NotNull Function2<? super ImageRequest, ? super SuccessResult, Unit> function22) {
            return listener(new ImageRequest$Builder$listener$5(function1, function12, function2, function22));
        }

        @NotNull
        public final Builder listener(@Nullable Listener listener) {
            this.listener = listener;
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull CoroutineDispatcher dispatcher) {
            this.fetcherDispatcher = dispatcher;
            this.decoderDispatcher = dispatcher;
            this.transformationDispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder interceptorDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            this.interceptorDispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder fetcherDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            this.fetcherDispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder decoderDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            this.decoderDispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder transformationDispatcher(@NotNull CoroutineDispatcher dispatcher) {
            this.transformationDispatcher = dispatcher;
            return this;
        }

        @NotNull
        public final Builder transformations(@NotNull Transformation... transformations) {
            return transformations(ArraysKt___ArraysKt.toList(transformations));
        }

        @NotNull
        public final Builder transformations(@NotNull List<? extends Transformation> transformations) {
            this.transformations = Collections.toImmutableList(transformations);
            return this;
        }

        @NotNull
        public final Builder bitmapConfig(@NotNull Bitmap.Config config) {
            this.bitmapConfig = config;
            return this;
        }

        @RequiresApi(26)
        @NotNull
        public final Builder colorSpace(@NotNull ColorSpace colorSpace) {
            this.colorSpace = colorSpace;
            return this;
        }

        @NotNull
        public final Builder size(@Px int size) {
            return size(size, size);
        }

        @NotNull
        public final Builder size(@Px int width, @Px int height) {
            return size(Sizes.Size(width, height));
        }

        @NotNull
        public final Builder size(@NotNull Dimension width, @NotNull Dimension height) {
            return size(new Size(width, height));
        }

        @NotNull
        public final Builder size(@NotNull Size size) {
            return size(SizeResolvers.create(size));
        }

        @NotNull
        public final Builder size(@NotNull SizeResolver resolver) {
            this.sizeResolver = resolver;
            resetResolvedValues();
            return this;
        }

        @NotNull
        public final Builder scale(@NotNull Scale scale) {
            this.scale = scale;
            return this;
        }

        @NotNull
        public final Builder precision(@NotNull Precision precision) {
            this.precision = precision;
            return this;
        }

        public final /* synthetic */ <T> Builder fetcherFactory(Fetcher.Factory<T> factory) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return fetcherFactory(factory, Object.class);
        }

        @NotNull
        public final <T> Builder fetcherFactory(@NotNull Fetcher.Factory<T> factory, @NotNull Class<T> type) {
            this.fetcherFactory = TuplesKt.m7112to(factory, type);
            return this;
        }

        @NotNull
        public final Builder decoderFactory(@NotNull Decoder.Factory factory) {
            this.decoderFactory = factory;
            return this;
        }

        @NotNull
        public final Builder allowConversionToBitmap(boolean enable) {
            this.allowConversionToBitmap = enable;
            return this;
        }

        @NotNull
        public final Builder allowHardware(boolean enable) {
            this.allowHardware = Boolean.valueOf(enable);
            return this;
        }

        @NotNull
        public final Builder allowRgb565(boolean enable) {
            this.allowRgb565 = Boolean.valueOf(enable);
            return this;
        }

        @NotNull
        public final Builder premultipliedAlpha(boolean enable) {
            this.premultipliedAlpha = enable;
            return this;
        }

        @NotNull
        public final Builder memoryCachePolicy(@NotNull CachePolicy policy) {
            this.memoryCachePolicy = policy;
            return this;
        }

        @NotNull
        public final Builder diskCachePolicy(@NotNull CachePolicy policy) {
            this.diskCachePolicy = policy;
            return this;
        }

        @NotNull
        public final Builder networkCachePolicy(@NotNull CachePolicy policy) {
            this.networkCachePolicy = policy;
            return this;
        }

        @NotNull
        public final Builder headers(@NotNull Headers headers) {
            this.headers = headers.newBuilder();
            return this;
        }

        @NotNull
        public final Builder addHeader(@NotNull String name, @NotNull String value) {
            Headers.Builder builder = this.headers;
            if (builder == null) {
                builder = new Headers.Builder();
                this.headers = builder;
            }
            builder.add(name, value);
            return this;
        }

        @NotNull
        public final Builder setHeader(@NotNull String name, @NotNull String value) {
            Headers.Builder builder = this.headers;
            if (builder == null) {
                builder = new Headers.Builder();
                this.headers = builder;
            }
            builder.set(name, value);
            return this;
        }

        @NotNull
        public final Builder removeHeader(@NotNull String name) {
            Headers.Builder builder = this.headers;
            if (builder != null) {
                builder.removeAll(name);
            }
            return this;
        }

        public final /* synthetic */ <T> Builder tag(T tag) {
            Intrinsics.reifiedOperationMarker(4, ExifInterface.GPS_DIRECTION_TRUE);
            return tag(Object.class, tag);
        }

        @NotNull
        public final <T> Builder tag(@NotNull Class<? super T> type, @Nullable T tag) {
            if (tag == null) {
                Map<Class<?>, Object> map = this.tags;
                if (map != null) {
                    map.remove(type);
                }
            } else {
                Map linkedHashMap = this.tags;
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                    this.tags = linkedHashMap;
                }
                T tCast = type.cast(tag);
                Intrinsics.checkNotNull(tCast);
                linkedHashMap.put(type, tCast);
            }
            return this;
        }

        @NotNull
        public final Builder tags(@NotNull Tags tags) {
            this.tags = MapsKt__MapsKt.toMutableMap(tags.asMap());
            return this;
        }

        @NotNull
        public final Builder placeholderMemoryCacheKey(@Nullable String key) {
            return placeholderMemoryCacheKey(key != null ? new MemoryCache.Key(key, null, 2, null) : null);
        }

        @NotNull
        public final Builder placeholderMemoryCacheKey(@Nullable MemoryCache.Key key) {
            this.placeholderMemoryCacheKey = key;
            return this;
        }

        @NotNull
        public final Builder placeholder(@DrawableRes int drawableResId) {
            this.placeholderResId = Integer.valueOf(drawableResId);
            this.placeholderDrawable = null;
            return this;
        }

        @NotNull
        public final Builder placeholder(@Nullable Drawable drawable) {
            this.placeholderDrawable = drawable;
            this.placeholderResId = 0;
            return this;
        }

        @NotNull
        public final Builder error(@DrawableRes int drawableResId) {
            this.errorResId = Integer.valueOf(drawableResId);
            this.errorDrawable = null;
            return this;
        }

        @NotNull
        public final Builder error(@Nullable Drawable drawable) {
            this.errorDrawable = drawable;
            this.errorResId = 0;
            return this;
        }

        @NotNull
        public final Builder fallback(@DrawableRes int i) {
            this.fallbackResId = Integer.valueOf(i);
            this.fallbackDrawable = null;
            return this;
        }

        @NotNull
        public final Builder fallback(@Nullable Drawable drawable) {
            this.fallbackDrawable = drawable;
            this.fallbackResId = 0;
            return this;
        }

        @NotNull
        public final Builder target(@NotNull ImageView imageView) {
            return target(new ImageViewTarget(imageView));
        }

        public static /* synthetic */ Builder target$default(Builder builder, Function1 function1, Function1 function12, Function1 function13, int i, Object obj) {
            if ((i & 1) != 0) {
                function1 = new Function1<Drawable, Unit>() { // from class: coil.request.ImageRequest$Builder$target$1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Drawable drawable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                        invoke2(drawable);
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 2) != 0) {
                function12 = new Function1<Drawable, Unit>() { // from class: coil.request.ImageRequest$Builder$target$2
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@Nullable Drawable drawable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                        invoke2(drawable);
                        return Unit.INSTANCE;
                    }
                };
            }
            if ((i & 4) != 0) {
                function13 = new Function1<Drawable, Unit>() { // from class: coil.request.ImageRequest$Builder$target$3
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Drawable drawable) {
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Drawable drawable) {
                        invoke2(drawable);
                        return Unit.INSTANCE;
                    }
                };
            }
            return builder.target(new ImageRequest$Builder$target$4(function1, function12, function13));
        }

        @NotNull
        public final Builder target(@NotNull Function1<? super Drawable, Unit> onStart, @NotNull Function1<? super Drawable, Unit> onError, @NotNull Function1<? super Drawable, Unit> onSuccess) {
            return target(new ImageRequest$Builder$target$4(onStart, onError, onSuccess));
        }

        @NotNull
        public final Builder target(@Nullable Target target) {
            this.target = target;
            resetResolvedValues();
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
            this.transitionFactory = factory;
            return this;
        }

        @NotNull
        public final Builder lifecycle(@Nullable LifecycleOwner owner) {
            return lifecycle(owner != null ? owner.getLifecycle() : null);
        }

        @NotNull
        public final Builder lifecycle(@Nullable Lifecycle lifecycle) {
            this.lifecycle = lifecycle;
            return this;
        }

        public static /* synthetic */ Builder setParameter$default(Builder builder, String str, Object obj, String str2, int i, Object obj2) {
            if ((i & 4) != 0) {
                str2 = obj != null ? obj.toString() : null;
            }
            return builder.setParameter(str, obj, str2);
        }

        @JvmOverloads
        @NotNull
        public final Builder setParameter(@NotNull String key, @Nullable Object value, @Nullable String memoryCacheKey) {
            Parameters.Builder builder = this.parameters;
            if (builder == null) {
                builder = new Parameters.Builder();
                this.parameters = builder;
            }
            builder.set(key, value, memoryCacheKey);
            return this;
        }

        @NotNull
        public final Builder removeParameter(@NotNull String key) {
            Parameters.Builder builder = this.parameters;
            if (builder != null) {
                builder.remove(key);
            }
            return this;
        }

        @NotNull
        public final Builder parameters(@NotNull Parameters parameters) {
            this.parameters = parameters.newBuilder();
            return this;
        }

        @NotNull
        public final Builder defaults(@NotNull DefaultRequestOptions defaultRequestOptions) {
            this.defaults = defaultRequestOptions;
            resetResolvedScale();
            return this;
        }

        @NotNull
        public final ImageRequest build() {
            Context context = this.context;
            Object obj = this.data;
            if (obj == null) {
                obj = NullRequestData.INSTANCE;
            }
            Object obj2 = obj;
            Target target = this.target;
            Listener listener = this.listener;
            MemoryCache.Key key = this.memoryCacheKey;
            String str = this.diskCacheKey;
            Bitmap.Config bitmapConfig = this.bitmapConfig;
            if (bitmapConfig == null) {
                bitmapConfig = this.defaults.getBitmapConfig();
            }
            Bitmap.Config config = bitmapConfig;
            ColorSpace colorSpace = this.colorSpace;
            Precision precision = this.precision;
            if (precision == null) {
                precision = this.defaults.getPrecision();
            }
            Precision precision2 = precision;
            Pair<? extends Fetcher.Factory<?>, ? extends Class<?>> pair = this.fetcherFactory;
            Decoder.Factory factory = this.decoderFactory;
            List<? extends Transformation> list = this.transformations;
            Transition.Factory transitionFactory = this.transitionFactory;
            if (transitionFactory == null) {
                transitionFactory = this.defaults.getTransitionFactory();
            }
            Transition.Factory factory2 = transitionFactory;
            Headers.Builder builder = this.headers;
            Headers headersOrEmpty = Utils.orEmpty(builder != null ? builder.build() : null);
            Map<Class<?>, ? extends Object> map = this.tags;
            Tags tagsOrEmpty = Utils.orEmpty(map != null ? Tags.INSTANCE.from(map) : null);
            boolean z = this.allowConversionToBitmap;
            Boolean bool = this.allowHardware;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : this.defaults.getAllowHardware();
            Boolean bool2 = this.allowRgb565;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : this.defaults.getAllowRgb565();
            boolean z2 = this.premultipliedAlpha;
            CachePolicy memoryCachePolicy = this.memoryCachePolicy;
            if (memoryCachePolicy == null) {
                memoryCachePolicy = this.defaults.getMemoryCachePolicy();
            }
            CachePolicy cachePolicy = memoryCachePolicy;
            CachePolicy diskCachePolicy = this.diskCachePolicy;
            if (diskCachePolicy == null) {
                diskCachePolicy = this.defaults.getDiskCachePolicy();
            }
            CachePolicy cachePolicy2 = diskCachePolicy;
            CachePolicy networkCachePolicy = this.networkCachePolicy;
            if (networkCachePolicy == null) {
                networkCachePolicy = this.defaults.getNetworkCachePolicy();
            }
            CachePolicy cachePolicy3 = networkCachePolicy;
            CoroutineDispatcher interceptorDispatcher = this.interceptorDispatcher;
            if (interceptorDispatcher == null) {
                interceptorDispatcher = this.defaults.getInterceptorDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher = interceptorDispatcher;
            CoroutineDispatcher fetcherDispatcher = this.fetcherDispatcher;
            if (fetcherDispatcher == null) {
                fetcherDispatcher = this.defaults.getFetcherDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher2 = fetcherDispatcher;
            CoroutineDispatcher decoderDispatcher = this.decoderDispatcher;
            if (decoderDispatcher == null) {
                decoderDispatcher = this.defaults.getDecoderDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher3 = decoderDispatcher;
            CoroutineDispatcher transformationDispatcher = this.transformationDispatcher;
            if (transformationDispatcher == null) {
                transformationDispatcher = this.defaults.getTransformationDispatcher();
            }
            CoroutineDispatcher coroutineDispatcher4 = transformationDispatcher;
            Lifecycle lifecycleResolveLifecycle = this.lifecycle;
            if (lifecycleResolveLifecycle == null && (lifecycleResolveLifecycle = this.resolvedLifecycle) == null) {
                lifecycleResolveLifecycle = resolveLifecycle();
            }
            Lifecycle lifecycle = lifecycleResolveLifecycle;
            SizeResolver sizeResolverResolveSizeResolver = this.sizeResolver;
            if (sizeResolverResolveSizeResolver == null && (sizeResolverResolveSizeResolver = this.resolvedSizeResolver) == null) {
                sizeResolverResolveSizeResolver = resolveSizeResolver();
            }
            SizeResolver sizeResolver = sizeResolverResolveSizeResolver;
            Scale scaleResolveScale = this.scale;
            if (scaleResolveScale == null && (scaleResolveScale = this.resolvedScale) == null) {
                scaleResolveScale = resolveScale();
            }
            Scale scale = scaleResolveScale;
            Parameters.Builder builder2 = this.parameters;
            return new ImageRequest(context, obj2, target, listener, key, str, config, colorSpace, precision2, pair, factory, list, factory2, headersOrEmpty, tagsOrEmpty, z, zBooleanValue, zBooleanValue2, z2, cachePolicy, cachePolicy2, cachePolicy3, coroutineDispatcher, coroutineDispatcher2, coroutineDispatcher3, coroutineDispatcher4, lifecycle, sizeResolver, scale, Utils.orEmpty(builder2 != null ? builder2.build() : null), this.placeholderMemoryCacheKey, this.placeholderResId, this.placeholderDrawable, this.errorResId, this.errorDrawable, this.fallbackResId, this.fallbackDrawable, new DefinedRequestOptions(this.lifecycle, this.sizeResolver, this.scale, this.interceptorDispatcher, this.fetcherDispatcher, this.decoderDispatcher, this.transformationDispatcher, this.transitionFactory, this.precision, this.bitmapConfig, this.allowHardware, this.allowRgb565, this.memoryCachePolicy, this.diskCachePolicy, this.networkCachePolicy), this.defaults, null);
        }

        public final void resetResolvedValues() {
            this.resolvedLifecycle = null;
            this.resolvedSizeResolver = null;
            this.resolvedScale = null;
        }

        public final void resetResolvedScale() {
            this.resolvedScale = null;
        }

        public final Lifecycle resolveLifecycle() {
            Target target = this.target;
            Lifecycle lifecycle = Contexts.getLifecycle(target instanceof ViewTarget ? ((ViewTarget) target).getView().getContext() : this.context);
            return lifecycle == null ? GlobalLifecycle.INSTANCE : lifecycle;
        }

        public final SizeResolver resolveSizeResolver() {
            ImageView.ScaleType scaleType;
            Target target = this.target;
            if (target instanceof ViewTarget) {
                View view = ((ViewTarget) target).getView();
                if ((view instanceof ImageView) && ((scaleType = ((ImageView) view).getScaleType()) == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX)) {
                    return SizeResolvers.create(Size.ORIGINAL);
                }
                return ViewSizeResolvers.create$default(view, false, 2, null);
            }
            return new DisplaySizeResolver(this.context);
        }

        public final Scale resolveScale() {
            View view;
            SizeResolver sizeResolver = this.sizeResolver;
            View view2 = null;
            ViewSizeResolver viewSizeResolver = sizeResolver instanceof ViewSizeResolver ? (ViewSizeResolver) sizeResolver : null;
            if (viewSizeResolver == null || (view = viewSizeResolver.getView()) == null) {
                Target target = this.target;
                ViewTarget viewTarget = target instanceof ViewTarget ? (ViewTarget) target : null;
                if (viewTarget != null) {
                    view2 = viewTarget.getView();
                }
            } else {
                view2 = view;
            }
            if (view2 instanceof ImageView) {
                return Utils.getScale((ImageView) view2);
            }
            return Scale.FIT;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'fetcherFactory'.", replaceWith = @ReplaceWith(expression = "fetcherFactory<Any> { _, _, _ -> fetcher }", imports = {}))
        @NotNull
        public final Builder fetcher(@NotNull Fetcher fetcher) {
            Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to 'decoderFactory'.", replaceWith = @ReplaceWith(expression = "decoderFactory { _, _, _ -> decoder }", imports = {}))
        @NotNull
        public final Builder decoder(@NotNull Decoder decoder) {
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
