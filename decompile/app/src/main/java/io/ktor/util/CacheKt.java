package io.ktor.util;

import androidx.exifinterface.media.ExifInterface;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Cache.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aP\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u0006\"\u0004\b\u0001\u0010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u0002H\u0006\u0012\u0004\u0012\u0002H\u00070\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u0002H\u0007\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\u0001H\u0007\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m7105d2 = {"CACHE_INITIAL_CAPACITY", "", "CACHE_LOAD_FACTOR", "", "createLRUCache", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "supplier", "Lkotlin/Function1;", "close", "", "maxSize", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final class CacheKt {
    public static final int CACHE_INITIAL_CAPACITY = 10;
    public static final float CACHE_LOAD_FACTOR = 0.75f;

    @InternalAPI
    @NotNull
    public static final <K, V> Map<K, V> createLRUCache(@NotNull Function1<? super K, ? extends V> supplier, @NotNull Function1<? super V, Unit> close, int i) {
        Intrinsics.checkNotNullParameter(supplier, "supplier");
        Intrinsics.checkNotNullParameter(close, "close");
        Map<K, V> mapSynchronizedMap = Collections.synchronizedMap(new LRUCache(supplier, close, i));
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(LRUCache…upplier, close, maxSize))");
        return mapSynchronizedMap;
    }
}
