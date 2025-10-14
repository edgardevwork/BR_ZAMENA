package io.ktor.util.collections;

import androidx.concurrent.futures.C2081xc40028dd;
import androidx.exifinterface.media.ExifInterface;
import io.ktor.util.InternalAPI;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CopyOnWriteHashMap.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J8\u0010\u000b\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00028\u00002!\u0010\n\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u000eJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00028\u0001H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m7105d2 = {"Lio/ktor/util/collections/CopyOnWriteHashMap;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, SegmentConstantPool.INITSTRING, "()V", "key", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "producer", "computeIfAbsent", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove", "", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "ktor-utils"}, m7106k = 1, m7107mv = {1, 8, 0}, m7109xi = 48)
@InternalAPI
@SourceDebugExtension({"SMAP\nCopyOnWriteHashMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CopyOnWriteHashMap.kt\nio/ktor/util/collections/CopyOnWriteHashMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n1#2:74\n*E\n"})
/* loaded from: classes7.dex */
public final class CopyOnWriteHashMap<K, V> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater current$FU = AtomicReferenceFieldUpdater.newUpdater(CopyOnWriteHashMap.class, Object.class, "current");

    @NotNull
    private volatile /* synthetic */ Object current = MapsKt__MapsKt.emptyMap();

    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        Map map;
        HashMap map2;
        V v;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        do {
            map = (Map) this.current;
            if (map.get(key) == value) {
                return value;
            }
            map2 = new HashMap(map);
            v = (V) map2.put(key, value);
        } while (!C2081xc40028dd.m347m(current$FU, this, map, map2));
        return v;
    }

    @Nullable
    public final V get(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (V) ((Map) this.current).get(key);
    }

    public final void set(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        put(key, value);
    }

    @Nullable
    public final V remove(@NotNull K key) {
        Map map;
        HashMap map2;
        V v;
        Intrinsics.checkNotNullParameter(key, "key");
        do {
            map = (Map) this.current;
            if (map.get(key) == null) {
                return null;
            }
            map2 = new HashMap(map);
            v = (V) map2.remove(key);
        } while (!C2081xc40028dd.m347m(current$FU, this, map, map2));
        return v;
    }

    @NotNull
    public final V computeIfAbsent(@NotNull K key, @NotNull Function1<? super K, ? extends V> producer) {
        Map map;
        HashMap map2;
        V vInvoke;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(producer, "producer");
        do {
            map = (Map) this.current;
            V v = (V) map.get(key);
            if (v != null) {
                return v;
            }
            map2 = new HashMap(map);
            vInvoke = producer.invoke(key);
            map2.put(key, vInvoke);
        } while (!C2081xc40028dd.m347m(current$FU, this, map, map2));
        return vInvoke;
    }
}
