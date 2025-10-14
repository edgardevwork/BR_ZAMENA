package coil.memory;

import android.graphics.Bitmap;
import androidx.collection.LruCache;
import coil.memory.MemoryCache;
import coil.memory.RealStrongMemoryCache;
import coil.util.Bitmaps;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StrongMemoryCache.kt */
@Metadata(m7104d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004*\u0001\b\b\u0000\u0018\u00002\u00020\u0001:\u0001#B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\fH\u0016J,\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001c2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 0\u001eH\u0016J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020\u0003H\u0016R\u0010\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, m7105d2 = {"Lcoil/memory/RealStrongMemoryCache;", "Lcoil/memory/StrongMemoryCache;", "maxSize", "", "weakMemoryCache", "Lcoil/memory/WeakMemoryCache;", "(ILcoil/memory/WeakMemoryCache;)V", "cache", "coil/memory/RealStrongMemoryCache$cache$1", "Lcoil/memory/RealStrongMemoryCache$cache$1;", "keys", "", "Lcoil/memory/MemoryCache$Key;", "getKeys", "()Ljava/util/Set;", "getMaxSize", "()I", "size", "getSize", "clearMemory", "", "get", "Lcoil/memory/MemoryCache$Value;", "key", "remove", "", "set", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "", "trimMemory", "level", "InternalValue", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStrongMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StrongMemoryCache.kt\ncoil/memory/RealStrongMemoryCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,117:1\n1#2:118\n*E\n"})
/* loaded from: classes.dex */
public final class RealStrongMemoryCache implements StrongMemoryCache {

    @NotNull
    public final RealStrongMemoryCache$cache$1 cache;

    @NotNull
    public final WeakMemoryCache weakMemoryCache;

    /* JADX WARN: Type inference failed for: r2v1, types: [coil.memory.RealStrongMemoryCache$cache$1] */
    public RealStrongMemoryCache(final int i, @NotNull WeakMemoryCache weakMemoryCache) {
        this.weakMemoryCache = weakMemoryCache;
        this.cache = new LruCache<MemoryCache.Key, InternalValue>(i) { // from class: coil.memory.RealStrongMemoryCache$cache$1
            @Override // androidx.collection.LruCache
            public int sizeOf(@NotNull MemoryCache.Key key, @NotNull RealStrongMemoryCache.InternalValue value) {
                return value.getSize();
            }

            @Override // androidx.collection.LruCache
            public void entryRemoved(boolean evicted, @NotNull MemoryCache.Key key, @NotNull RealStrongMemoryCache.InternalValue oldValue, @Nullable RealStrongMemoryCache.InternalValue newValue) {
                this.weakMemoryCache.set(key, oldValue.getBitmap(), oldValue.getExtras(), oldValue.getSize());
            }
        };
    }

    @Override // coil.memory.StrongMemoryCache
    public int getSize() {
        return size();
    }

    @Override // coil.memory.StrongMemoryCache
    public int getMaxSize() {
        return maxSize();
    }

    @Override // coil.memory.StrongMemoryCache
    @NotNull
    public Set<MemoryCache.Key> getKeys() {
        return snapshot().keySet();
    }

    @Override // coil.memory.StrongMemoryCache
    @Nullable
    public MemoryCache.Value get(@NotNull MemoryCache.Key key) {
        InternalValue internalValue = get(key);
        if (internalValue != null) {
            return new MemoryCache.Value(internalValue.getBitmap(), internalValue.getExtras());
        }
        return null;
    }

    @Override // coil.memory.StrongMemoryCache
    public void set(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> extras) {
        int allocationByteCountCompat = Bitmaps.getAllocationByteCountCompat(bitmap);
        if (allocationByteCountCompat <= getMaxSize()) {
            put(key, new InternalValue(bitmap, extras, allocationByteCountCompat));
        } else {
            remove(key);
            this.weakMemoryCache.set(key, bitmap, extras, allocationByteCountCompat);
        }
    }

    @Override // coil.memory.StrongMemoryCache
    public boolean remove(@NotNull MemoryCache.Key key) {
        return remove(key) != null;
    }

    @Override // coil.memory.StrongMemoryCache
    public void clearMemory() {
        evictAll();
    }

    @Override // coil.memory.StrongMemoryCache
    public void trimMemory(int level) {
        if (level >= 40) {
            clearMemory();
        } else {
            if (10 > level || level >= 20) {
                return;
            }
            trimToSize(getSize() / 2);
        }
    }

    /* compiled from: StrongMemoryCache.kt */
    @Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m7105d2 = {"Lcoil/memory/RealStrongMemoryCache$InternalValue;", "", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "size", "", "(Landroid/graphics/Bitmap;Ljava/util/Map;I)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getExtras", "()Ljava/util/Map;", "getSize", "()I", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes2.dex */
    public static final class InternalValue {

        @NotNull
        public final Bitmap bitmap;

        @NotNull
        public final Map<String, Object> extras;
        public final int size;

        public InternalValue(@NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> map, int i) {
            this.bitmap = bitmap;
            this.extras = map;
            this.size = i;
        }

        @NotNull
        public final Bitmap getBitmap() {
            return this.bitmap;
        }

        @NotNull
        public final Map<String, Object> getExtras() {
            return this.extras;
        }

        public final int getSize() {
            return this.size;
        }
    }
}
