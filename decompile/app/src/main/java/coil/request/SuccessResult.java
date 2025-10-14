package coil.request;

import android.graphics.drawable.Drawable;
import coil.decode.DataSource;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ImageResult.kt */
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0002\u0010\u000fJP\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\rJ\u0013\u0010\u001c\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0096\u0002J\b\u0010\u001f\u001a\u00020 H\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0016R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006!"}, m7105d2 = {"Lcoil/request/SuccessResult;", "Lcoil/request/ImageResult;", "drawable", "Landroid/graphics/drawable/Drawable;", "request", "Lcoil/request/ImageRequest;", "dataSource", "Lcoil/decode/DataSource;", "memoryCacheKey", "Lcoil/memory/MemoryCache$Key;", "diskCacheKey", "", "isSampled", "", "isPlaceholderCached", "(Landroid/graphics/drawable/Drawable;Lcoil/request/ImageRequest;Lcoil/decode/DataSource;Lcoil/memory/MemoryCache$Key;Ljava/lang/String;ZZ)V", "getDataSource", "()Lcoil/decode/DataSource;", "getDiskCacheKey", "()Ljava/lang/String;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "()Z", "getMemoryCacheKey", "()Lcoil/memory/MemoryCache$Key;", "getRequest", "()Lcoil/request/ImageRequest;", "copy", "equals", "other", "", "hashCode", "", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class SuccessResult extends ImageResult {

    @NotNull
    public final DataSource dataSource;

    @Nullable
    public final String diskCacheKey;

    @NotNull
    public final Drawable drawable;
    public final boolean isPlaceholderCached;
    public final boolean isSampled;

    @Nullable
    public final MemoryCache.Key memoryCacheKey;

    @NotNull
    public final ImageRequest request;

    public /* synthetic */ SuccessResult(Drawable drawable, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(drawable, imageRequest, dataSource, (i & 8) != 0 ? null : key, (i & 16) != 0 ? null : str, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2);
    }

    @Override // coil.request.ImageResult
    @NotNull
    public Drawable getDrawable() {
        return this.drawable;
    }

    @Override // coil.request.ImageResult
    @NotNull
    public ImageRequest getRequest() {
        return this.request;
    }

    @NotNull
    public final DataSource getDataSource() {
        return this.dataSource;
    }

    @Nullable
    public final MemoryCache.Key getMemoryCacheKey() {
        return this.memoryCacheKey;
    }

    @Nullable
    public final String getDiskCacheKey() {
        return this.diskCacheKey;
    }

    /* renamed from: isSampled, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    /* renamed from: isPlaceholderCached, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    public SuccessResult(@NotNull Drawable drawable, @NotNull ImageRequest imageRequest, @NotNull DataSource dataSource, @Nullable MemoryCache.Key key, @Nullable String str, boolean z, boolean z2) {
        super(null);
        this.drawable = drawable;
        this.request = imageRequest;
        this.dataSource = dataSource;
        this.memoryCacheKey = key;
        this.diskCacheKey = str;
        this.isSampled = z;
        this.isPlaceholderCached = z2;
    }

    public static /* synthetic */ SuccessResult copy$default(SuccessResult successResult, Drawable drawable, ImageRequest imageRequest, DataSource dataSource, MemoryCache.Key key, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            drawable = successResult.getDrawable();
        }
        if ((i & 2) != 0) {
            imageRequest = successResult.getRequest();
        }
        ImageRequest imageRequest2 = imageRequest;
        if ((i & 4) != 0) {
            dataSource = successResult.dataSource;
        }
        DataSource dataSource2 = dataSource;
        if ((i & 8) != 0) {
            key = successResult.memoryCacheKey;
        }
        MemoryCache.Key key2 = key;
        if ((i & 16) != 0) {
            str = successResult.diskCacheKey;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = successResult.isSampled;
        }
        boolean z3 = z;
        if ((i & 64) != 0) {
            z2 = successResult.isPlaceholderCached;
        }
        return successResult.copy(drawable, imageRequest2, dataSource2, key2, str2, z3, z2);
    }

    @NotNull
    public final SuccessResult copy(@NotNull Drawable drawable, @NotNull ImageRequest request, @NotNull DataSource dataSource, @Nullable MemoryCache.Key memoryCacheKey, @Nullable String diskCacheKey, boolean isSampled, boolean isPlaceholderCached) {
        return new SuccessResult(drawable, request, dataSource, memoryCacheKey, diskCacheKey, isSampled, isPlaceholderCached);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof SuccessResult) {
            SuccessResult successResult = (SuccessResult) other;
            if (Intrinsics.areEqual(getDrawable(), successResult.getDrawable()) && Intrinsics.areEqual(getRequest(), successResult.getRequest()) && this.dataSource == successResult.dataSource && Intrinsics.areEqual(this.memoryCacheKey, successResult.memoryCacheKey) && Intrinsics.areEqual(this.diskCacheKey, successResult.diskCacheKey) && this.isSampled == successResult.isSampled && this.isPlaceholderCached == successResult.isPlaceholderCached) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((getDrawable().hashCode() * 31) + getRequest().hashCode()) * 31) + this.dataSource.hashCode()) * 31;
        MemoryCache.Key key = this.memoryCacheKey;
        int iHashCode2 = (iHashCode + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.diskCacheKey;
        return ((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.isSampled)) * 31) + Boolean.hashCode(this.isPlaceholderCached);
    }
}
