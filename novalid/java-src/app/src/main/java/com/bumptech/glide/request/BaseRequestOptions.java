package com.bumptech.glide.request;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.CheckResult;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.MultiTransformation;
import com.bumptech.glide.load.Option;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.Transformation;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.load.model.stream.HttpGlideUrlLoader;
import com.bumptech.glide.load.resource.bitmap.BitmapEncoder;
import com.bumptech.glide.load.resource.bitmap.CenterCrop;
import com.bumptech.glide.load.resource.bitmap.CenterInside;
import com.bumptech.glide.load.resource.bitmap.CircleCrop;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.load.resource.bitmap.Downsampler;
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation;
import com.bumptech.glide.load.resource.bitmap.FitCenter;
import com.bumptech.glide.load.resource.bitmap.VideoDecoder;
import com.bumptech.glide.load.resource.drawable.ResourceDrawableDecoder;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.load.resource.gif.GifDrawableTransformation;
import com.bumptech.glide.load.resource.gif.GifOptions;
import com.bumptech.glide.request.BaseRequestOptions;
import com.bumptech.glide.signature.EmptySignature;
import com.bumptech.glide.util.CachedHashCodeArrayMap;
import com.bumptech.glide.util.Preconditions;
import com.bumptech.glide.util.Util;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class BaseRequestOptions<T extends BaseRequestOptions<T>> implements Cloneable {
    public static final int DISK_CACHE_STRATEGY = 4;
    public static final int ERROR_ID = 32;
    public static final int ERROR_PLACEHOLDER = 16;
    public static final int FALLBACK = 8192;
    public static final int FALLBACK_ID = 16384;
    public static final int IS_CACHEABLE = 256;
    public static final int ONLY_RETRIEVE_FROM_CACHE = 524288;
    public static final int OVERRIDE = 512;
    public static final int PLACEHOLDER = 64;
    public static final int PLACEHOLDER_ID = 128;
    public static final int PRIORITY = 8;
    public static final int RESOURCE_CLASS = 4096;
    public static final int SIGNATURE = 1024;
    public static final int SIZE_MULTIPLIER = 2;
    public static final int THEME = 32768;
    public static final int TRANSFORMATION = 2048;
    public static final int TRANSFORMATION_ALLOWED = 65536;
    public static final int TRANSFORMATION_REQUIRED = 131072;
    public static final int UNSET = -1;
    public static final int USE_ANIMATION_POOL = 1048576;
    public static final int USE_UNLIMITED_SOURCE_GENERATORS_POOL = 262144;
    public int errorId;

    @Nullable
    public Drawable errorPlaceholder;

    @Nullable
    public Drawable fallbackDrawable;
    public int fallbackId;
    public int fields;
    public boolean isAutoCloneEnabled;
    public boolean isLocked;
    public boolean isTransformationRequired;
    public boolean onlyRetrieveFromCache;

    @Nullable
    public Drawable placeholderDrawable;
    public int placeholderId;

    @Nullable
    public Resources.Theme theme;
    public boolean useAnimationPool;
    public boolean useUnlimitedSourceGeneratorsPool;
    public float sizeMultiplier = 1.0f;

    @NonNull
    public DiskCacheStrategy diskCacheStrategy = DiskCacheStrategy.AUTOMATIC;

    @NonNull
    public Priority priority = Priority.NORMAL;
    public boolean isCacheable = true;
    public int overrideHeight = -1;
    public int overrideWidth = -1;

    @NonNull
    public Key signature = EmptySignature.obtain();
    public boolean isTransformationAllowed = true;

    @NonNull
    public Options options = new Options();

    @NonNull
    public Map<Class<?>, Transformation<?>> transformations = new CachedHashCodeArrayMap();

    @NonNull
    public Class<?> resourceClass = Object.class;
    public boolean isScaleOnlyOrNoTransform = true;

    public static boolean isSet(int i, int i2) {
        return (i & i2) != 0;
    }

    public final T self() {
        return this;
    }

    @NonNull
    @CheckResult
    public T sizeMultiplier(@FloatRange(from = 0.0d, m9to = 1.0d) float f) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().sizeMultiplier(f);
        }
        if (f < 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.sizeMultiplier = f;
        this.fields |= 2;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T useUnlimitedSourceGeneratorsPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().useUnlimitedSourceGeneratorsPool(z);
        }
        this.useUnlimitedSourceGeneratorsPool = z;
        this.fields |= 262144;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T useAnimationPool(boolean z) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().useAnimationPool(z);
        }
        this.useAnimationPool = z;
        this.fields |= 1048576;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T onlyRetrieveFromCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().onlyRetrieveFromCache(z);
        }
        this.onlyRetrieveFromCache = z;
        this.fields |= 524288;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T diskCacheStrategy(@NonNull DiskCacheStrategy diskCacheStrategy) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().diskCacheStrategy(diskCacheStrategy);
        }
        this.diskCacheStrategy = (DiskCacheStrategy) Preconditions.checkNotNull(diskCacheStrategy);
        this.fields |= 4;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T priority(@NonNull Priority priority) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().priority(priority);
        }
        this.priority = (Priority) Preconditions.checkNotNull(priority);
        this.fields |= 8;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T placeholder(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().placeholder(drawable);
        }
        this.placeholderDrawable = drawable;
        int i = this.fields | 64;
        this.placeholderId = 0;
        this.fields = i & (-129);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T placeholder(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().placeholder(i);
        }
        this.placeholderId = i;
        int i2 = this.fields | 128;
        this.placeholderDrawable = null;
        this.fields = i2 & (-65);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fallback(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().fallback(drawable);
        }
        this.fallbackDrawable = drawable;
        int i = this.fields | 8192;
        this.fallbackId = 0;
        this.fields = i & (-16385);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T fallback(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().fallback(i);
        }
        this.fallbackId = i;
        int i2 = this.fields | 16384;
        this.fallbackDrawable = null;
        this.fields = i2 & (-8193);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T error(@Nullable Drawable drawable) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().error(drawable);
        }
        this.errorPlaceholder = drawable;
        int i = this.fields | 16;
        this.errorId = 0;
        this.fields = i & (-33);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T error(@DrawableRes int i) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().error(i);
        }
        this.errorId = i;
        int i2 = this.fields | 32;
        this.errorPlaceholder = null;
        this.fields = i2 & (-17);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T theme(@Nullable Resources.Theme theme) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().theme(theme);
        }
        this.theme = theme;
        if (theme != null) {
            this.fields |= 32768;
            return (T) set(ResourceDrawableDecoder.THEME, theme);
        }
        this.fields &= -32769;
        return (T) removeOption(ResourceDrawableDecoder.THEME);
    }

    @NonNull
    @CheckResult
    public T skipMemoryCache(boolean z) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().skipMemoryCache(true);
        }
        this.isCacheable = !z;
        this.fields |= 256;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T override(int i, int i2) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().override(i, i2);
        }
        this.overrideWidth = i;
        this.overrideHeight = i2;
        this.fields |= 512;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T override(int i) {
        return (T) override(i, i);
    }

    @NonNull
    @CheckResult
    public T signature(@NonNull Key key) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().signature(key);
        }
        this.signature = (Key) Preconditions.checkNotNull(key);
        this.fields |= 1024;
        return (T) selfOrThrowIfLocked();
    }

    @Override // 
    @CheckResult
    /* renamed from: clone */
    public T mo15137clone() {
        try {
            T t = (T) super.clone();
            Options options = new Options();
            t.options = options;
            options.putAll(this.options);
            CachedHashCodeArrayMap cachedHashCodeArrayMap = new CachedHashCodeArrayMap();
            t.transformations = cachedHashCodeArrayMap;
            cachedHashCodeArrayMap.putAll(this.transformations);
            t.isLocked = false;
            t.isAutoCloneEnabled = false;
            return t;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @NonNull
    @CheckResult
    public <Y> T set(@NonNull Option<Y> option, @NonNull Y y) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().set(option, y);
        }
        Preconditions.checkNotNull(option);
        Preconditions.checkNotNull(y);
        this.options.set(option, y);
        return (T) selfOrThrowIfLocked();
    }

    public T removeOption(@NonNull Option<?> option) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().removeOption(option);
        }
        this.options.remove(option);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T decode(@NonNull Class<?> cls) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().decode(cls);
        }
        this.resourceClass = (Class) Preconditions.checkNotNull(cls);
        this.fields |= 4096;
        return (T) selfOrThrowIfLocked();
    }

    public final boolean isTransformationAllowed() {
        return this.isTransformationAllowed;
    }

    public final boolean isTransformationSet() {
        return isSet(2048);
    }

    public final boolean isLocked() {
        return this.isLocked;
    }

    @NonNull
    @CheckResult
    public T encodeFormat(@NonNull Bitmap.CompressFormat compressFormat) {
        return (T) set(BitmapEncoder.COMPRESSION_FORMAT, Preconditions.checkNotNull(compressFormat));
    }

    @NonNull
    @CheckResult
    public T encodeQuality(@IntRange(from = 0, m10to = 100) int i) {
        return (T) set(BitmapEncoder.COMPRESSION_QUALITY, Integer.valueOf(i));
    }

    @NonNull
    @CheckResult
    public T frame(@IntRange(from = 0) long j) {
        return (T) set(VideoDecoder.TARGET_FRAME, Long.valueOf(j));
    }

    @NonNull
    @CheckResult
    public T format(@NonNull DecodeFormat decodeFormat) {
        Preconditions.checkNotNull(decodeFormat);
        return (T) set(Downsampler.DECODE_FORMAT, decodeFormat).set(GifOptions.DECODE_FORMAT, decodeFormat);
    }

    @NonNull
    @CheckResult
    public T disallowHardwareConfig() {
        return (T) set(Downsampler.ALLOW_HARDWARE_CONFIG, Boolean.FALSE);
    }

    @NonNull
    @CheckResult
    public T downsample(@NonNull DownsampleStrategy downsampleStrategy) {
        return (T) set(DownsampleStrategy.OPTION, Preconditions.checkNotNull(downsampleStrategy));
    }

    @NonNull
    @CheckResult
    public T timeout(@IntRange(from = 0) int i) {
        return (T) set(HttpGlideUrlLoader.TIMEOUT, Integer.valueOf(i));
    }

    @NonNull
    @CheckResult
    public T optionalCenterCrop() {
        return (T) optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
    }

    @NonNull
    @CheckResult
    public T centerCrop() {
        return (T) transform(DownsampleStrategy.CENTER_OUTSIDE, new CenterCrop());
    }

    @NonNull
    @CheckResult
    public T optionalFitCenter() {
        return (T) optionalScaleOnlyTransform(DownsampleStrategy.FIT_CENTER, new FitCenter());
    }

    @NonNull
    @CheckResult
    public T fitCenter() {
        return (T) scaleOnlyTransform(DownsampleStrategy.FIT_CENTER, new FitCenter());
    }

    @NonNull
    @CheckResult
    public T optionalCenterInside() {
        return (T) optionalScaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
    }

    @NonNull
    @CheckResult
    public T centerInside() {
        return (T) scaleOnlyTransform(DownsampleStrategy.CENTER_INSIDE, new CenterInside());
    }

    @NonNull
    @CheckResult
    public T optionalCircleCrop() {
        return (T) optionalTransform(DownsampleStrategy.CENTER_OUTSIDE, new CircleCrop());
    }

    @NonNull
    @CheckResult
    public T circleCrop() {
        return (T) transform(DownsampleStrategy.CENTER_INSIDE, new CircleCrop());
    }

    @NonNull
    public final T optionalTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().optionalTransform(downsampleStrategy, transformation);
        }
        downsample(downsampleStrategy);
        return (T) transform(transformation, false);
    }

    @NonNull
    @CheckResult
    public final T transform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().transform(downsampleStrategy, transformation);
        }
        downsample(downsampleStrategy);
        return (T) transform(transformation);
    }

    @NonNull
    public final T scaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        return (T) scaleOnlyTransform(downsampleStrategy, transformation, true);
    }

    @NonNull
    public final T optionalScaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation) {
        return (T) scaleOnlyTransform(downsampleStrategy, transformation, false);
    }

    @NonNull
    public final T scaleOnlyTransform(@NonNull DownsampleStrategy downsampleStrategy, @NonNull Transformation<Bitmap> transformation, boolean z) {
        T t;
        if (z) {
            t = (T) transform(downsampleStrategy, transformation);
        } else {
            t = (T) optionalTransform(downsampleStrategy, transformation);
        }
        t.isScaleOnlyOrNoTransform = true;
        return t;
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull Transformation<Bitmap> transformation) {
        return (T) transform(transformation, true);
    }

    @NonNull
    @CheckResult
    public T transform(@NonNull Transformation<Bitmap>... transformationArr) {
        if (transformationArr.length > 1) {
            return (T) transform((Transformation<Bitmap>) new MultiTransformation(transformationArr), true);
        }
        if (transformationArr.length == 1) {
            return (T) transform(transformationArr[0]);
        }
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    @Deprecated
    public T transforms(@NonNull Transformation<Bitmap>... transformationArr) {
        return (T) transform((Transformation<Bitmap>) new MultiTransformation(transformationArr), true);
    }

    @NonNull
    @CheckResult
    public T optionalTransform(@NonNull Transformation<Bitmap> transformation) {
        return (T) transform(transformation, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public T transform(@NonNull Transformation<Bitmap> transformation, boolean z) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().transform(transformation, z);
        }
        DrawableTransformation drawableTransformation = new DrawableTransformation(transformation, z);
        transform(Bitmap.class, transformation, z);
        transform(Drawable.class, drawableTransformation, z);
        transform(BitmapDrawable.class, drawableTransformation.asBitmapDrawable(), z);
        transform(GifDrawable.class, new GifDrawableTransformation(transformation), z);
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public <Y> T optionalTransform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation) {
        return (T) transform(cls, transformation, false);
    }

    @NonNull
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation, boolean z) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().transform(cls, transformation, z);
        }
        Preconditions.checkNotNull(cls);
        Preconditions.checkNotNull(transformation);
        this.transformations.put(cls, transformation);
        int i = this.fields;
        this.isTransformationAllowed = true;
        this.fields = 67584 | i;
        this.isScaleOnlyOrNoTransform = false;
        if (z) {
            this.fields = i | 198656;
            this.isTransformationRequired = true;
        }
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public <Y> T transform(@NonNull Class<Y> cls, @NonNull Transformation<Y> transformation) {
        return (T) transform(cls, transformation, true);
    }

    @NonNull
    @CheckResult
    public T dontTransform() {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().dontTransform();
        }
        this.transformations.clear();
        int i = this.fields;
        this.isTransformationRequired = false;
        this.isTransformationAllowed = false;
        this.fields = (i & (-133121)) | 65536;
        this.isScaleOnlyOrNoTransform = true;
        return (T) selfOrThrowIfLocked();
    }

    @NonNull
    @CheckResult
    public T dontAnimate() {
        return (T) set(GifOptions.DISABLE_ANIMATION, Boolean.TRUE);
    }

    @NonNull
    @CheckResult
    public T apply(@NonNull BaseRequestOptions<?> baseRequestOptions) {
        if (this.isAutoCloneEnabled) {
            return (T) mo15137clone().apply(baseRequestOptions);
        }
        if (isSet(baseRequestOptions.fields, 2)) {
            this.sizeMultiplier = baseRequestOptions.sizeMultiplier;
        }
        if (isSet(baseRequestOptions.fields, 262144)) {
            this.useUnlimitedSourceGeneratorsPool = baseRequestOptions.useUnlimitedSourceGeneratorsPool;
        }
        if (isSet(baseRequestOptions.fields, 1048576)) {
            this.useAnimationPool = baseRequestOptions.useAnimationPool;
        }
        if (isSet(baseRequestOptions.fields, 4)) {
            this.diskCacheStrategy = baseRequestOptions.diskCacheStrategy;
        }
        if (isSet(baseRequestOptions.fields, 8)) {
            this.priority = baseRequestOptions.priority;
        }
        if (isSet(baseRequestOptions.fields, 16)) {
            this.errorPlaceholder = baseRequestOptions.errorPlaceholder;
            this.errorId = 0;
            this.fields &= -33;
        }
        if (isSet(baseRequestOptions.fields, 32)) {
            this.errorId = baseRequestOptions.errorId;
            this.errorPlaceholder = null;
            this.fields &= -17;
        }
        if (isSet(baseRequestOptions.fields, 64)) {
            this.placeholderDrawable = baseRequestOptions.placeholderDrawable;
            this.placeholderId = 0;
            this.fields &= -129;
        }
        if (isSet(baseRequestOptions.fields, 128)) {
            this.placeholderId = baseRequestOptions.placeholderId;
            this.placeholderDrawable = null;
            this.fields &= -65;
        }
        if (isSet(baseRequestOptions.fields, 256)) {
            this.isCacheable = baseRequestOptions.isCacheable;
        }
        if (isSet(baseRequestOptions.fields, 512)) {
            this.overrideWidth = baseRequestOptions.overrideWidth;
            this.overrideHeight = baseRequestOptions.overrideHeight;
        }
        if (isSet(baseRequestOptions.fields, 1024)) {
            this.signature = baseRequestOptions.signature;
        }
        if (isSet(baseRequestOptions.fields, 4096)) {
            this.resourceClass = baseRequestOptions.resourceClass;
        }
        if (isSet(baseRequestOptions.fields, 8192)) {
            this.fallbackDrawable = baseRequestOptions.fallbackDrawable;
            this.fallbackId = 0;
            this.fields &= -16385;
        }
        if (isSet(baseRequestOptions.fields, 16384)) {
            this.fallbackId = baseRequestOptions.fallbackId;
            this.fallbackDrawable = null;
            this.fields &= -8193;
        }
        if (isSet(baseRequestOptions.fields, 32768)) {
            this.theme = baseRequestOptions.theme;
        }
        if (isSet(baseRequestOptions.fields, 65536)) {
            this.isTransformationAllowed = baseRequestOptions.isTransformationAllowed;
        }
        if (isSet(baseRequestOptions.fields, 131072)) {
            this.isTransformationRequired = baseRequestOptions.isTransformationRequired;
        }
        if (isSet(baseRequestOptions.fields, 2048)) {
            this.transformations.putAll(baseRequestOptions.transformations);
            this.isScaleOnlyOrNoTransform = baseRequestOptions.isScaleOnlyOrNoTransform;
        }
        if (isSet(baseRequestOptions.fields, 524288)) {
            this.onlyRetrieveFromCache = baseRequestOptions.onlyRetrieveFromCache;
        }
        if (!this.isTransformationAllowed) {
            this.transformations.clear();
            int i = this.fields;
            this.isTransformationRequired = false;
            this.fields = i & (-133121);
            this.isScaleOnlyOrNoTransform = true;
        }
        this.fields |= baseRequestOptions.fields;
        this.options.putAll(baseRequestOptions.options);
        return (T) selfOrThrowIfLocked();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BaseRequestOptions)) {
            return false;
        }
        BaseRequestOptions baseRequestOptions = (BaseRequestOptions) obj;
        return Float.compare(baseRequestOptions.sizeMultiplier, this.sizeMultiplier) == 0 && this.errorId == baseRequestOptions.errorId && Util.bothNullOrEqual(this.errorPlaceholder, baseRequestOptions.errorPlaceholder) && this.placeholderId == baseRequestOptions.placeholderId && Util.bothNullOrEqual(this.placeholderDrawable, baseRequestOptions.placeholderDrawable) && this.fallbackId == baseRequestOptions.fallbackId && Util.bothNullOrEqual(this.fallbackDrawable, baseRequestOptions.fallbackDrawable) && this.isCacheable == baseRequestOptions.isCacheable && this.overrideHeight == baseRequestOptions.overrideHeight && this.overrideWidth == baseRequestOptions.overrideWidth && this.isTransformationRequired == baseRequestOptions.isTransformationRequired && this.isTransformationAllowed == baseRequestOptions.isTransformationAllowed && this.useUnlimitedSourceGeneratorsPool == baseRequestOptions.useUnlimitedSourceGeneratorsPool && this.onlyRetrieveFromCache == baseRequestOptions.onlyRetrieveFromCache && this.diskCacheStrategy.equals(baseRequestOptions.diskCacheStrategy) && this.priority == baseRequestOptions.priority && this.options.equals(baseRequestOptions.options) && this.transformations.equals(baseRequestOptions.transformations) && this.resourceClass.equals(baseRequestOptions.resourceClass) && Util.bothNullOrEqual(this.signature, baseRequestOptions.signature) && Util.bothNullOrEqual(this.theme, baseRequestOptions.theme);
    }

    public int hashCode() {
        return Util.hashCode(this.theme, Util.hashCode(this.signature, Util.hashCode(this.resourceClass, Util.hashCode(this.transformations, Util.hashCode(this.options, Util.hashCode(this.priority, Util.hashCode(this.diskCacheStrategy, Util.hashCode(this.onlyRetrieveFromCache, Util.hashCode(this.useUnlimitedSourceGeneratorsPool, Util.hashCode(this.isTransformationAllowed, Util.hashCode(this.isTransformationRequired, Util.hashCode(this.overrideWidth, Util.hashCode(this.overrideHeight, Util.hashCode(this.isCacheable, Util.hashCode(this.fallbackDrawable, Util.hashCode(this.fallbackId, Util.hashCode(this.placeholderDrawable, Util.hashCode(this.placeholderId, Util.hashCode(this.errorPlaceholder, Util.hashCode(this.errorId, Util.hashCode(this.sizeMultiplier)))))))))))))))))))));
    }

    @NonNull
    public T lock() {
        this.isLocked = true;
        return (T) self();
    }

    @NonNull
    public T autoClone() {
        if (this.isLocked && !this.isAutoCloneEnabled) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.isAutoCloneEnabled = true;
        return (T) lock();
    }

    @NonNull
    public final T selfOrThrowIfLocked() {
        if (this.isLocked) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) self();
    }

    public final boolean isAutoCloneEnabled() {
        return this.isAutoCloneEnabled;
    }

    public final boolean isDiskCacheStrategySet() {
        return isSet(4);
    }

    public final boolean isSkipMemoryCacheSet() {
        return isSet(256);
    }

    @NonNull
    public final Map<Class<?>, Transformation<?>> getTransformations() {
        return this.transformations;
    }

    public final boolean isTransformationRequired() {
        return this.isTransformationRequired;
    }

    @NonNull
    public final Options getOptions() {
        return this.options;
    }

    @NonNull
    public final Class<?> getResourceClass() {
        return this.resourceClass;
    }

    @NonNull
    public final DiskCacheStrategy getDiskCacheStrategy() {
        return this.diskCacheStrategy;
    }

    @Nullable
    public final Drawable getErrorPlaceholder() {
        return this.errorPlaceholder;
    }

    public final int getErrorId() {
        return this.errorId;
    }

    public final int getPlaceholderId() {
        return this.placeholderId;
    }

    @Nullable
    public final Drawable getPlaceholderDrawable() {
        return this.placeholderDrawable;
    }

    public final int getFallbackId() {
        return this.fallbackId;
    }

    @Nullable
    public final Drawable getFallbackDrawable() {
        return this.fallbackDrawable;
    }

    @Nullable
    public final Resources.Theme getTheme() {
        return this.theme;
    }

    public final boolean isMemoryCacheable() {
        return this.isCacheable;
    }

    @NonNull
    public final Key getSignature() {
        return this.signature;
    }

    public final boolean isPrioritySet() {
        return isSet(8);
    }

    @NonNull
    public final Priority getPriority() {
        return this.priority;
    }

    public final int getOverrideWidth() {
        return this.overrideWidth;
    }

    public final boolean isValidOverride() {
        return Util.isValidDimensions(this.overrideWidth, this.overrideHeight);
    }

    public final int getOverrideHeight() {
        return this.overrideHeight;
    }

    public final float getSizeMultiplier() {
        return this.sizeMultiplier;
    }

    public boolean isScaleOnlyOrNoTransform() {
        return this.isScaleOnlyOrNoTransform;
    }

    public final boolean isSet(int i) {
        return isSet(this.fields, i);
    }

    public final boolean getUseUnlimitedSourceGeneratorsPool() {
        return this.useUnlimitedSourceGeneratorsPool;
    }

    public final boolean getUseAnimationPool() {
        return this.useAnimationPool;
    }

    public final boolean getOnlyRetrieveFromCache() {
        return this.onlyRetrieveFromCache;
    }
}
