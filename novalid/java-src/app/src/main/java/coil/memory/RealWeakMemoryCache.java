package coil.memory;

import android.graphics.Bitmap;
import androidx.annotation.VisibleForTesting;
import coil.memory.MemoryCache;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: WeakMemoryCache.kt */
@Metadata(m7104d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0000\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0005¢\u0006\u0002\u0010\u0002J\r\u0010\u0013\u001a\u00020\u0014H\u0001¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0005H\u0016J4\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\u0006\u0010$\u001a\u00020\u0012H\u0016J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u0012H\u0016RX\u0010\u0003\u001a>\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b0\u0004j\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b`\t8\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\n\u0010\u0002\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, m7105d2 = {"Lcoil/memory/RealWeakMemoryCache;", "Lcoil/memory/WeakMemoryCache;", "()V", "cache", "Ljava/util/LinkedHashMap;", "Lcoil/memory/MemoryCache$Key;", "Ljava/util/ArrayList;", "Lcoil/memory/RealWeakMemoryCache$InternalValue;", "Lkotlin/collections/ArrayList;", "Lkotlin/collections/LinkedHashMap;", "getCache$coil_base_release$annotations", "getCache$coil_base_release", "()Ljava/util/LinkedHashMap;", "keys", "", "getKeys", "()Ljava/util/Set;", "operationsSinceCleanUp", "", "cleanUp", "", "cleanUp$coil_base_release", "cleanUpIfNecessary", "clearMemory", "get", "Lcoil/memory/MemoryCache$Value;", "key", "remove", "", "set", "bitmap", "Landroid/graphics/Bitmap;", "extras", "", "", "", "size", "trimMemory", "level", "Companion", "InternalValue", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nWeakMemoryCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n+ 2 Collections.kt\ncoil/util/-Collections\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Utils.kt\ncoil/util/-Utils\n*L\n1#1,158:1\n44#2,2:159\n47#2:163\n55#2,9:172\n1#3:161\n1#3:162\n372#4,7:164\n162#5:171\n*S KotlinDebug\n*F\n+ 1 WeakMemoryCache.kt\ncoil/memory/RealWeakMemoryCache\n*L\n63#1:159,2\n63#1:163\n137#1:172,9\n63#1:162\n73#1:164,7\n77#1:171\n*E\n"})
/* loaded from: classes.dex */
public final class RealWeakMemoryCache implements WeakMemoryCache {
    public static final int CLEAN_UP_INTERVAL = 10;

    @NotNull
    public final LinkedHashMap<MemoryCache.Key, ArrayList<InternalValue>> cache = new LinkedHashMap<>();
    public int operationsSinceCleanUp;

    @VisibleForTesting
    public static /* synthetic */ void getCache$coil_base_release$annotations() {
    }

    @NotNull
    public final LinkedHashMap<MemoryCache.Key, ArrayList<InternalValue>> getCache$coil_base_release() {
        return this.cache;
    }

    @Override // coil.memory.WeakMemoryCache
    @NotNull
    public synchronized Set<MemoryCache.Key> getKeys() {
        return CollectionsKt___CollectionsKt.toSet(this.cache.keySet());
    }

    @Override // coil.memory.WeakMemoryCache
    @Nullable
    public synchronized MemoryCache.Value get(@NotNull MemoryCache.Key key) {
        try {
            ArrayList<InternalValue> arrayList = this.cache.get(key);
            MemoryCache.Value value = null;
            if (arrayList == null) {
                return null;
            }
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                InternalValue internalValue = arrayList.get(i);
                Bitmap bitmap = internalValue.getBitmap().get();
                MemoryCache.Value value2 = bitmap != null ? new MemoryCache.Value(bitmap, internalValue.getExtras()) : null;
                if (value2 != null) {
                    value = value2;
                    break;
                }
                i++;
            }
            cleanUpIfNecessary();
            return value;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void set(@NotNull MemoryCache.Key key, @NotNull Bitmap bitmap, @NotNull Map<String, ? extends Object> extras, int size) {
        try {
            LinkedHashMap<MemoryCache.Key, ArrayList<InternalValue>> linkedHashMap = this.cache;
            ArrayList<InternalValue> arrayList = linkedHashMap.get(key);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                linkedHashMap.put(key, arrayList);
            }
            ArrayList<InternalValue> arrayList2 = arrayList;
            int iIdentityHashCode = System.identityHashCode(bitmap);
            InternalValue internalValue = new InternalValue(iIdentityHashCode, new WeakReference(bitmap), extras, size);
            int size2 = arrayList2.size();
            int i = 0;
            while (true) {
                if (i < size2) {
                    InternalValue internalValue2 = arrayList2.get(i);
                    if (size < internalValue2.getSize()) {
                        i++;
                    } else if (internalValue2.getIdentityHashCode() == iIdentityHashCode && internalValue2.getBitmap().get() == bitmap) {
                        arrayList2.set(i, internalValue);
                    } else {
                        arrayList2.add(i, internalValue);
                    }
                } else {
                    arrayList2.add(internalValue);
                    break;
                }
            }
            cleanUpIfNecessary();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized boolean remove(@NotNull MemoryCache.Key key) {
        return this.cache.remove(key) != null;
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void clearMemory() {
        this.operationsSinceCleanUp = 0;
        this.cache.clear();
    }

    @Override // coil.memory.WeakMemoryCache
    public synchronized void trimMemory(int level) {
        if (level >= 10 && level != 20) {
            cleanUp$coil_base_release();
        }
    }

    public final void cleanUpIfNecessary() {
        int i = this.operationsSinceCleanUp;
        this.operationsSinceCleanUp = i + 1;
        if (i >= 10) {
            cleanUp$coil_base_release();
        }
    }

    @VisibleForTesting
    public final void cleanUp$coil_base_release() {
        WeakReference<Bitmap> bitmap;
        this.operationsSinceCleanUp = 0;
        Iterator<ArrayList<InternalValue>> it = this.cache.values().iterator();
        while (it.hasNext()) {
            ArrayList<InternalValue> next = it.next();
            if (next.size() <= 1) {
                InternalValue internalValue = (InternalValue) CollectionsKt___CollectionsKt.firstOrNull((List) next);
                if (((internalValue == null || (bitmap = internalValue.getBitmap()) == null) ? null : bitmap.get()) == null) {
                    it.remove();
                }
            } else {
                int size = next.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (next.get(i3).getBitmap().get() == null) {
                        next.remove(i3);
                        i++;
                    }
                }
                if (next.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    /* compiled from: WeakMemoryCache.kt */
    @Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u0013"}, m7105d2 = {"Lcoil/memory/RealWeakMemoryCache$InternalValue;", "", "identityHashCode", "", "bitmap", "Ljava/lang/ref/WeakReference;", "Landroid/graphics/Bitmap;", "extras", "", "", "size", "(ILjava/lang/ref/WeakReference;Ljava/util/Map;I)V", "getBitmap", "()Ljava/lang/ref/WeakReference;", "getExtras", "()Ljava/util/Map;", "getIdentityHashCode", "()I", "getSize", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @VisibleForTesting
    /* loaded from: classes2.dex */
    public static final class InternalValue {

        @NotNull
        public final WeakReference<Bitmap> bitmap;

        @NotNull
        public final Map<String, Object> extras;
        public final int identityHashCode;
        public final int size;

        public InternalValue(int i, @NotNull WeakReference<Bitmap> weakReference, @NotNull Map<String, ? extends Object> map, int i2) {
            this.identityHashCode = i;
            this.bitmap = weakReference;
            this.extras = map;
            this.size = i2;
        }

        public final int getIdentityHashCode() {
            return this.identityHashCode;
        }

        @NotNull
        public final WeakReference<Bitmap> getBitmap() {
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
