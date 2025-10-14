package io.ktor.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: Cache.kt */
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010&\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B7\b\u0000\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\rJ\u001c\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0014R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Lio/ktor/util/LRUCache;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/LinkedHashMap;", "supplier", "Lkotlin/Function1;", "close", "", "maxSize", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V", "get", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "removeEldestEntry", "", "eldest", "", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nio/ktor/util/LRUCache\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
/* loaded from: classes7.dex */
public final class LRUCache<K, V> extends LinkedHashMap<K, V> {

    @NotNull
    public final Function1<V, Unit> close;
    public final int maxSize;

    @NotNull
    public final Function1<K, V> supplier;

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return (Set<Map.Entry<K, V>>) getEntries();
    }

    public /* bridge */ Set<Map.Entry<Object, Object>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Object> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return (Set<K>) getKeys();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<V> values() {
        return (Collection<V>) getValues();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LRUCache(@NotNull Function1<? super K, ? extends V> supplier, @NotNull Function1<? super V, Unit> close, int i) {
        super(10, 0.75f, true);
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        this.supplier = supplier;
        this.close = close;
        this.maxSize = i;
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(@NotNull Map.Entry<? extends K, ? extends V> eldest) {
        Intrinsics.checkNotNullParameter(eldest, "eldest");
        boolean z = size() > this.maxSize;
        if (z) {
            this.close.invoke(eldest.getValue());
        }
        return z;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V get(Object key) {
        if (this.maxSize == 0) {
            return this.supplier.invoke(key);
        }
        synchronized (this) {
            V v = (V) super.get(key);
            if (v != null) {
                return v;
            }
            V vInvoke = this.supplier.invoke(key);
            put(key, vInvoke);
            return vInvoke;
        }
    }
}
