package coil.request;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.transition.Transition;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DefinedRequestOptions.kt */
@Metadata(m7104d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u0010\u001aJ¿\u0001\u00104\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\u0002\u00105J\u0013\u00106\u001a\u00020\u00142\b\u00107\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u00108\u001a\u000209H\u0016R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\"R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b)\u0010$R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0017¢\u0006\b\n\u0000\u001a\u0004\b*\u0010$R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\f\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\"R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103¨\u0006:"}, m7105d2 = {"Lcoil/request/DefinedRequestOptions;", "", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "sizeResolver", "Lcoil/size/SizeResolver;", "scale", "Lcoil/size/Scale;", "interceptorDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "transitionFactory", "Lcoil/transition/Transition$Factory;", "precision", "Lcoil/size/Precision;", "bitmapConfig", "Landroid/graphics/Bitmap$Config;", "allowHardware", "", "allowRgb565", "memoryCachePolicy", "Lcoil/request/CachePolicy;", "diskCachePolicy", "networkCachePolicy", "(Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "getAllowHardware", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getAllowRgb565", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "getDecoderDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "getDiskCachePolicy", "()Lcoil/request/CachePolicy;", "getFetcherDispatcher", "getInterceptorDispatcher", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getMemoryCachePolicy", "getNetworkCachePolicy", "getPrecision", "()Lcoil/size/Precision;", "getScale", "()Lcoil/size/Scale;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "getTransformationDispatcher", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "copy", "(Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)Lcoil/request/DefinedRequestOptions;", "equals", "other", "hashCode", "", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class DefinedRequestOptions {

    @Nullable
    public final Boolean allowHardware;

    @Nullable
    public final Boolean allowRgb565;

    @Nullable
    public final Bitmap.Config bitmapConfig;

    @Nullable
    public final CoroutineDispatcher decoderDispatcher;

    @Nullable
    public final CachePolicy diskCachePolicy;

    @Nullable
    public final CoroutineDispatcher fetcherDispatcher;

    @Nullable
    public final CoroutineDispatcher interceptorDispatcher;

    @Nullable
    public final Lifecycle lifecycle;

    @Nullable
    public final CachePolicy memoryCachePolicy;

    @Nullable
    public final CachePolicy networkCachePolicy;

    @Nullable
    public final Precision precision;

    @Nullable
    public final Scale scale;

    @Nullable
    public final SizeResolver sizeResolver;

    @Nullable
    public final CoroutineDispatcher transformationDispatcher;

    @Nullable
    public final Transition.Factory transitionFactory;

    public DefinedRequestOptions(@Nullable Lifecycle lifecycle, @Nullable SizeResolver sizeResolver, @Nullable Scale scale, @Nullable CoroutineDispatcher coroutineDispatcher, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable CoroutineDispatcher coroutineDispatcher4, @Nullable Transition.Factory factory, @Nullable Precision precision, @Nullable Bitmap.Config config, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable CachePolicy cachePolicy, @Nullable CachePolicy cachePolicy2, @Nullable CachePolicy cachePolicy3) {
        this.lifecycle = lifecycle;
        this.sizeResolver = sizeResolver;
        this.scale = scale;
        this.interceptorDispatcher = coroutineDispatcher;
        this.fetcherDispatcher = coroutineDispatcher2;
        this.decoderDispatcher = coroutineDispatcher3;
        this.transformationDispatcher = coroutineDispatcher4;
        this.transitionFactory = factory;
        this.precision = precision;
        this.bitmapConfig = config;
        this.allowHardware = bool;
        this.allowRgb565 = bool2;
        this.memoryCachePolicy = cachePolicy;
        this.diskCachePolicy = cachePolicy2;
        this.networkCachePolicy = cachePolicy3;
    }

    @Nullable
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Nullable
    public final SizeResolver getSizeResolver() {
        return this.sizeResolver;
    }

    @Nullable
    public final Scale getScale() {
        return this.scale;
    }

    @Nullable
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.interceptorDispatcher;
    }

    @Nullable
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.fetcherDispatcher;
    }

    @Nullable
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.decoderDispatcher;
    }

    @Nullable
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.transformationDispatcher;
    }

    @Nullable
    public final Transition.Factory getTransitionFactory() {
        return this.transitionFactory;
    }

    @Nullable
    public final Precision getPrecision() {
        return this.precision;
    }

    @Nullable
    public final Bitmap.Config getBitmapConfig() {
        return this.bitmapConfig;
    }

    @Nullable
    public final Boolean getAllowHardware() {
        return this.allowHardware;
    }

    @Nullable
    public final Boolean getAllowRgb565() {
        return this.allowRgb565;
    }

    @Nullable
    public final CachePolicy getMemoryCachePolicy() {
        return this.memoryCachePolicy;
    }

    @Nullable
    public final CachePolicy getDiskCachePolicy() {
        return this.diskCachePolicy;
    }

    @Nullable
    public final CachePolicy getNetworkCachePolicy() {
        return this.networkCachePolicy;
    }

    @NotNull
    public final DefinedRequestOptions copy(@Nullable Lifecycle lifecycle, @Nullable SizeResolver sizeResolver, @Nullable Scale scale, @Nullable CoroutineDispatcher interceptorDispatcher, @Nullable CoroutineDispatcher fetcherDispatcher, @Nullable CoroutineDispatcher decoderDispatcher, @Nullable CoroutineDispatcher transformationDispatcher, @Nullable Transition.Factory transitionFactory, @Nullable Precision precision, @Nullable Bitmap.Config bitmapConfig, @Nullable Boolean allowHardware, @Nullable Boolean allowRgb565, @Nullable CachePolicy memoryCachePolicy, @Nullable CachePolicy diskCachePolicy, @Nullable CachePolicy networkCachePolicy) {
        return new DefinedRequestOptions(lifecycle, sizeResolver, scale, interceptorDispatcher, fetcherDispatcher, decoderDispatcher, transformationDispatcher, transitionFactory, precision, bitmapConfig, allowHardware, allowRgb565, memoryCachePolicy, diskCachePolicy, networkCachePolicy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof DefinedRequestOptions) {
            DefinedRequestOptions definedRequestOptions = (DefinedRequestOptions) other;
            if (Intrinsics.areEqual(this.lifecycle, definedRequestOptions.lifecycle) && Intrinsics.areEqual(this.sizeResolver, definedRequestOptions.sizeResolver) && this.scale == definedRequestOptions.scale && Intrinsics.areEqual(this.interceptorDispatcher, definedRequestOptions.interceptorDispatcher) && Intrinsics.areEqual(this.fetcherDispatcher, definedRequestOptions.fetcherDispatcher) && Intrinsics.areEqual(this.decoderDispatcher, definedRequestOptions.decoderDispatcher) && Intrinsics.areEqual(this.transformationDispatcher, definedRequestOptions.transformationDispatcher) && Intrinsics.areEqual(this.transitionFactory, definedRequestOptions.transitionFactory) && this.precision == definedRequestOptions.precision && this.bitmapConfig == definedRequestOptions.bitmapConfig && Intrinsics.areEqual(this.allowHardware, definedRequestOptions.allowHardware) && Intrinsics.areEqual(this.allowRgb565, definedRequestOptions.allowRgb565) && this.memoryCachePolicy == definedRequestOptions.memoryCachePolicy && this.diskCachePolicy == definedRequestOptions.diskCachePolicy && this.networkCachePolicy == definedRequestOptions.networkCachePolicy) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Lifecycle lifecycle = this.lifecycle;
        int iHashCode = (lifecycle != null ? lifecycle.hashCode() : 0) * 31;
        SizeResolver sizeResolver = this.sizeResolver;
        int iHashCode2 = (iHashCode + (sizeResolver != null ? sizeResolver.hashCode() : 0)) * 31;
        Scale scale = this.scale;
        int iHashCode3 = (iHashCode2 + (scale != null ? scale.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher = this.interceptorDispatcher;
        int iHashCode4 = (iHashCode3 + (coroutineDispatcher != null ? coroutineDispatcher.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher2 = this.fetcherDispatcher;
        int iHashCode5 = (iHashCode4 + (coroutineDispatcher2 != null ? coroutineDispatcher2.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher3 = this.decoderDispatcher;
        int iHashCode6 = (iHashCode5 + (coroutineDispatcher3 != null ? coroutineDispatcher3.hashCode() : 0)) * 31;
        CoroutineDispatcher coroutineDispatcher4 = this.transformationDispatcher;
        int iHashCode7 = (iHashCode6 + (coroutineDispatcher4 != null ? coroutineDispatcher4.hashCode() : 0)) * 31;
        Transition.Factory factory = this.transitionFactory;
        int iHashCode8 = (iHashCode7 + (factory != null ? factory.hashCode() : 0)) * 31;
        Precision precision = this.precision;
        int iHashCode9 = (iHashCode8 + (precision != null ? precision.hashCode() : 0)) * 31;
        Bitmap.Config config = this.bitmapConfig;
        int iHashCode10 = (iHashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.allowHardware;
        int iHashCode11 = (iHashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.allowRgb565;
        int iHashCode12 = (iHashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy = this.memoryCachePolicy;
        int iHashCode13 = (iHashCode12 + (cachePolicy != null ? cachePolicy.hashCode() : 0)) * 31;
        CachePolicy cachePolicy2 = this.diskCachePolicy;
        int iHashCode14 = (iHashCode13 + (cachePolicy2 != null ? cachePolicy2.hashCode() : 0)) * 31;
        CachePolicy cachePolicy3 = this.networkCachePolicy;
        return iHashCode14 + (cachePolicy3 != null ? cachePolicy3.hashCode() : 0);
    }
}
