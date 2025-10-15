package io.appmetrica.analytics.coreutils.internal.collection;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.options.IFramePlayerOptions;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010&\n\u0002\b\b\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001J(\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00022\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0002H\u0007JC\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\f\u001a\u0004\u0018\u00018\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u0010\u000b\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J2\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u00102\u0014\u0010\n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00028\u00000\u0011H\u0007J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J?\u0010\u001c\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00112\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\tH\u0007J\"\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u00102\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0007J4\u0010\"\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0007J4\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011H\u0007J/\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018\"\u0004\b\u0000\u0010\u00102\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000$\"\u00028\u0000H\u0007¢\u0006\u0004\b&\u0010'J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190 2\u0006\u0010(\u001a\u00020\u0016H\u0007J)\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00120 2\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120$\"\u00020\u0012H\u0007¢\u0006\u0004\b+\u0010,J>\u0010.\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-\u0018\u00010 \"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011H\u0007J<\u00100\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u001a\u0010/\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-\u0018\u00010 H\u0007J>\u00101\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u001a\u0010/\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010-\u0018\u00010 H\u0007J&\u00102\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 \"\u0004\b\u0000\u0010\u00102\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002H\u0007J8\u00103\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011\"\u0004\b\u0000\u0010\u0007\"\u0004\b\u0001\u0010\b2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0011H\u0007J)\u00104\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00102\u0010\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010 H\u0007¢\u0006\u0004\b4\u00105J\u001c\u00108\u001a\u0002072\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002060\u0011H\u0007J\u001e\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002060\u00112\b\u0010\u0017\u001a\u0004\u0018\u000107H\u0007J&\u0010:\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 \"\u0004\b\u0000\u0010\u00102\u000e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010 H\u0007J\u0016\u0010<\u001a\u00020\u00052\f\u0010;\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0007¨\u0006="}, m7105d2 = {"Lio/appmetrica/analytics/coreutils/internal/collection/CollectionUtils;", "", "", TtmlNode.LEFT, TtmlNode.RIGHT, "", "areCollectionsEqual", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "map", "key", "value", "", "putOpt", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "", "getFromMapIgnoreCase", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/Object;", "convertMapKeysToLowerCase", "", "input", "", "", "hashSetFromIntArray", "defValue", "getOrDefault", "(Ljava/util/Map;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "copyOf", "original", "", "unmodifiableListCopy", "unmodifiableMapCopy", "unmodifiableSameOrderMapCopy", "", SavedStateHandle.VALUES, "unmodifiableSetOf", "([Ljava/lang/Object;)Ljava/util/Set;", "array", "toIntList", "elements", "createSortedListWithoutRepetitions", "([Ljava/lang/String;)Ljava/util/List;", "", "getListFromMap", IFramePlayerOptions.Builder.LIST, "getMapFromList", "getMapFromListOrNull", "arrayListCopyOfNullableCollection", "mapCopyOfNullableMap", "getFirstOrNull", "(Ljava/util/List;)Ljava/lang/Object;", "", "Landroid/os/Bundle;", "mapToBundle", "bundleToMap", "nullIfEmptyList", "collection", "isNullOrEmpty", "core-utils_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class CollectionUtils {

    @NotNull
    public static final CollectionUtils INSTANCE = new CollectionUtils();

    private CollectionUtils() {
    }

    @JvmStatic
    public static final boolean areCollectionsEqual(@Nullable Collection<? extends Object> collection, @Nullable Collection<? extends Object> collection2) {
        HashSet hashSet;
        if (collection == null && collection2 == null) {
            return true;
        }
        if (collection == null || collection2 == null || collection.size() != collection2.size()) {
            return false;
        }
        if (collection instanceof HashSet) {
            hashSet = (HashSet) collection;
            collection = collection2;
        } else if (collection2 instanceof HashSet) {
            hashSet = (HashSet) collection2;
        } else {
            HashSet hashSet2 = new HashSet(collection);
            collection = collection2;
            hashSet = hashSet2;
        }
        Iterator<? extends Object> it = collection.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @JvmStatic
    @Nullable
    public static final <T> List<T> arrayListCopyOfNullableCollection(@Nullable Collection<? extends T> input) {
        if (input != null) {
            return CollectionsKt___CollectionsKt.toList(input);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public static final Map<String, byte[]> bundleToMap(@Nullable Bundle input) {
        HashMap map = new HashMap();
        if (input != null) {
            for (String str : input.keySet()) {
                byte[] byteArray = input.getByteArray(str);
                if (byteArray != null) {
                    map.put(str, byteArray);
                }
            }
        }
        return map;
    }

    @JvmStatic
    @NotNull
    public static final <T> Map<String, T> convertMapKeysToLowerCase(@NotNull Map<String, ? extends T> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            linkedHashMap.put(str != null ? str.toLowerCase(Locale.getDefault()) : null, entry.getValue());
        }
        return linkedHashMap;
    }

    @JvmStatic
    @Nullable
    public static final <K, V> Map<K, V> copyOf(@Nullable Map<K, V> input) {
        if (input == null || input.isEmpty()) {
            return null;
        }
        return new HashMap(input);
    }

    @JvmStatic
    @NotNull
    public static final List<String> createSortedListWithoutRepetitions(@NotNull String... elements) {
        return unmodifiableListCopy(ArraysKt___ArraysJvmKt.toSortedSet(elements));
    }

    @JvmStatic
    @Nullable
    public static final <T> T getFirstOrNull(@Nullable List<? extends T> input) {
        if (input != null) {
            return (T) CollectionsKt___CollectionsKt.firstOrNull((List) input);
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final <T> T getFromMapIgnoreCase(@NotNull Map<String, ? extends T> map, @NotNull String key) {
        T next;
        Iterator<T> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            Map.Entry entry = (Map.Entry) next;
            CharSequence charSequence = (CharSequence) entry.getKey();
            if (charSequence != null && charSequence.length() != 0 && StringsKt__StringsJVMKt.equals((String) entry.getKey(), key, true)) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return (T) entry2.getValue();
        }
        return null;
    }

    @JvmStatic
    @Nullable
    public static final <K, V> List<Map.Entry<K, V>> getListFromMap(@Nullable Map<K, ? extends V> map) {
        if (map == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(new AbstractMap.SimpleEntry(it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @NotNull
    public static final <K, V> Map<K, V> getMapFromList(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return new LinkedHashMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    public static final <K, V> Map<K, V> getMapFromListOrNull(@Nullable List<? extends Map.Entry<? extends K, ? extends V>> list) {
        if (list == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt___RangesKt.coerceAtLeast(MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @JvmStatic
    public static final <K, V> V getOrDefault(@NotNull Map<K, ? extends V> map, K key, V defValue) {
        V v = map.get(key);
        return v == null ? defValue : v;
    }

    @JvmStatic
    @NotNull
    public static final Set<Integer> hashSetFromIntArray(@NotNull int[] input) {
        return ArraysKt___ArraysKt.toHashSet(input);
    }

    @JvmStatic
    public static final boolean isNullOrEmpty(@Nullable Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    @JvmStatic
    @Nullable
    public static final <K, V> Map<K, V> mapCopyOfNullableMap(@Nullable Map<K, ? extends V> input) {
        if (input != null) {
            return MapsKt__MapsKt.toMap(input);
        }
        return null;
    }

    @JvmStatic
    @NotNull
    public static final Bundle mapToBundle(@NotNull Map<String, byte[]> input) {
        Bundle bundle = new Bundle(input.size());
        for (Map.Entry<String, byte[]> entry : input.entrySet()) {
            bundle.putByteArray(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmStatic
    @Nullable
    public static final <T> List<T> nullIfEmptyList(@Nullable List<? extends T> input) {
        if (input == 0 || !(!input.isEmpty())) {
            return null;
        }
        return input;
    }

    @JvmStatic
    public static final <K, V> void putOpt(@NotNull Map<K, V> map, @Nullable K key, @Nullable V value) {
        if (key == null || value == null) {
            return;
        }
        map.put(key, value);
    }

    @JvmStatic
    @NotNull
    public static final List<Integer> toIntList(@NotNull int[] array) {
        return ArraysKt___ArraysKt.toList(array);
    }

    @JvmStatic
    @NotNull
    public static final <T> List<T> unmodifiableListCopy(@NotNull Collection<? extends T> original) {
        return Collections.unmodifiableList(new ArrayList(original));
    }

    @JvmStatic
    @NotNull
    public static final <K, V> Map<K, V> unmodifiableMapCopy(@NotNull Map<K, ? extends V> original) {
        return Collections.unmodifiableMap(new HashMap(original));
    }

    @JvmStatic
    @NotNull
    public static final <K, V> Map<K, V> unmodifiableSameOrderMapCopy(@NotNull Map<K, ? extends V> original) {
        return Collections.unmodifiableMap(new LinkedHashMap(original));
    }

    @JvmStatic
    @NotNull
    public static final <T> Set<T> unmodifiableSetOf(@NotNull T... tArr) {
        return Collections.unmodifiableSet(ArraysKt___ArraysKt.toHashSet(tArr));
    }
}
