package io.ktor.util;

import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringValues.kt */
@Metadata(m7104d1 = {"\u0000X\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aH\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00040\u00032\u001e\u0010\u0007\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00040\u0003H\u0002\u001a0\u0010\b\u001a\u00020\t2\u001e\u0010\n\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00040\u00032\u0006\u0010\u000b\u001a\u00020\tH\u0002\u001a\u0006\u0010\f\u001a\u00020\r\u001aM\u0010\f\u001a\u00020\r26\u0010\u000e\u001a\u001c\u0012\u0018\b\u0001\u0012\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00100\u000f\"\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0001¢\u0006\u0002\u0010\u0012\u001a \u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0001\u001a&\u0010\f\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u00052\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0001\u001a*\u0010\f\u001a\u00020\r2\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00180\u00172\b\b\u0002\u0010\u0011\u001a\u00020\u0001\u001a\u0012\u0010\u0019\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a\u001a6\u0010\u001c\u001a\u00020\u001d*\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00012\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010!\u001a\u001a\u0010\"\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005\u001a\u001a\u0010#\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005\u001a.\u0010$\u001a\u00020\r*\u00020\r2\b\b\u0002\u0010\u001f\u001a\u00020\u00012\u0018\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010!\u001a\u001c\u0010%\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00100\u0006*\u00020\r\u001a$\u0010&\u001a\u00020\u001d*\u00020\r2\u0018\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d0!\u001a\u001c\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00060\u0017*\u00020\r¨\u0006)"}, m7105d2 = {"entriesEquals", "", "a", "", "", "", "", "b", "entriesHashCode", "", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "seed", "valuesOf", "Lio/ktor/util/StringValues;", "pairs", "", "Lkotlin/Pair;", "caseInsensitiveKey", "([Lkotlin/Pair;Z)Lio/ktor/util/StringValues;", "name", "value", SavedStateHandle.VALUES, "map", "", "", "appendAll", "Lio/ktor/util/StringValuesBuilder;", "builder", "appendFiltered", "", "source", "keepEmpty", "predicate", "Lkotlin/Function2;", "appendIfNameAbsent", "appendIfNameAndValueAbsent", "filter", "flattenEntries", "flattenForEach", "block", "toMap", "ktor-utils"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1855#2,2:423\n1238#2,4:425\n1360#2:429\n1446#2,2:430\n1549#2:432\n1620#2,3:433\n1448#2,3:436\n1855#2:439\n857#2,2:440\n1856#2:442\n1855#2,2:443\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt\n*L\n330#1:423,2\n338#1:425,4\n343#1:429\n343#1:430,2\n344#1:432\n344#1:433,3\n343#1:436,3\n363#1:439\n364#1:440,2\n363#1:442\n394#1:443,2\n*E\n"})
/* loaded from: classes7.dex */
public final class StringValuesKt {
    public static /* synthetic */ StringValues valuesOf$default(Pair[] pairArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return valuesOf((Pair<String, ? extends List<String>>[]) pairArr, z);
    }

    @NotNull
    public static final StringValues valuesOf(@NotNull Pair<String, ? extends List<String>>[] pairs, boolean z) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        return new StringValues(z, MapsKt__MapsKt.toMap(ArraysKt___ArraysJvmKt.asList(pairs)));
    }

    public static /* synthetic */ StringValues valuesOf$default(String str, String str2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return valuesOf(str, str2, z);
    }

    @NotNull
    public static final StringValues valuesOf(@NotNull String name, @NotNull String value, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        return new StringValues(z, name, CollectionsKt__CollectionsJVMKt.listOf(value));
    }

    public static /* synthetic */ StringValues valuesOf$default(String str, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return valuesOf(str, (List<String>) list, z);
    }

    @NotNull
    public static final StringValues valuesOf(@NotNull String name, @NotNull List<String> values, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(values, "values");
        return new StringValues(z, name, values);
    }

    @NotNull
    public static final StringValues valuesOf() {
        return StringValues.INSTANCE.getEmpty();
    }

    public static /* synthetic */ StringValues valuesOf$default(Map map, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return valuesOf((Map<String, ? extends Iterable<String>>) map, z);
    }

    @NotNull
    public static final StringValues valuesOf(@NotNull Map<String, ? extends Iterable<String>> map, boolean z) {
        Intrinsics.checkNotNullParameter(map, "map");
        int size = map.size();
        if (size == 1) {
            Map.Entry entry = (Map.Entry) CollectionsKt___CollectionsKt.single(map.entrySet());
            return new StringValues(z, (String) entry.getKey(), CollectionsKt___CollectionsKt.toList((Iterable) entry.getValue()));
        }
        Map mapCaseInsensitiveMap = z ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap(size);
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            mapCaseInsensitiveMap.put(entry2.getKey(), CollectionsKt___CollectionsKt.toList((Iterable) entry2.getValue()));
        }
        return new StringValues(z, mapCaseInsensitiveMap);
    }

    @NotNull
    public static final Map<String, List<String>> toMap(@NotNull StringValues stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "<this>");
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put((String) entry.getKey(), CollectionsKt___CollectionsKt.toList((Iterable) entry.getValue()));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final List<Pair<String, String>> flattenEntries(@NotNull StringValues stringValues) {
        Intrinsics.checkNotNullParameter(stringValues, "<this>");
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                arrayList2.add(TuplesKt.m7112to(entry.getKey(), (String) it2.next()));
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, arrayList2);
        }
        return arrayList;
    }

    /* compiled from: StringValues.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "name", "", FirebaseAnalytics.Param.ITEMS, "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt$flattenForEach$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n1855#2,2:423\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt$flattenForEach$1\n*L\n351#1:423,2\n*E\n"})
    /* renamed from: io.ktor.util.StringValuesKt$flattenForEach$1 */
    /* loaded from: classes5.dex */
    public static final class C103631 extends Lambda implements Function2<String, List<? extends String>, Unit> {
        public final /* synthetic */ Function2<String, String, Unit> $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C103631(Function2<? super String, ? super String, Unit> function2) {
            super(2);
            function2 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
            invoke2(str, (List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull String name, @NotNull List<String> items) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(items, "items");
            Function2<String, String, Unit> function2 = function2;
            Iterator<T> it = items.iterator();
            while (it.hasNext()) {
                function2.invoke(name, (String) it.next());
            }
        }
    }

    public static final void flattenForEach(@NotNull StringValues stringValues, @NotNull Function2<? super String, ? super String, Unit> block) {
        Intrinsics.checkNotNullParameter(stringValues, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        stringValues.forEach(new Function2<String, List<? extends String>, Unit>() { // from class: io.ktor.util.StringValuesKt.flattenForEach.1
            public final /* synthetic */ Function2<String, String, Unit> $block;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C103631(Function2<? super String, ? super String, Unit> block2) {
                super(2);
                function2 = block2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
                invoke2(str, (List<String>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull String name, @NotNull List<String> items) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(items, "items");
                Function2<String, String, Unit> function2 = function2;
                Iterator<T> it = items.iterator();
                while (it.hasNext()) {
                    function2.invoke(name, (String) it.next());
                }
            }
        });
    }

    public static /* synthetic */ StringValues filter$default(StringValues stringValues, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return filter(stringValues, z, function2);
    }

    @NotNull
    public static final StringValues filter(@NotNull StringValues stringValues, boolean z, @NotNull Function2<? super String, ? super String, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(stringValues, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Set<Map.Entry<String, List<String>>> setEntries = stringValues.entries();
        Map mapCaseInsensitiveMap = stringValues.getCaseInsensitiveName() ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap(setEntries.size());
        Iterator<T> it = setEntries.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(((List) entry.getValue()).size());
            for (Object obj : iterable) {
                if (predicate.invoke(entry.getKey(), (String) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            if (z || (!arrayList.isEmpty())) {
                mapCaseInsensitiveMap.put(entry.getKey(), arrayList);
            }
        }
        return new StringValues(stringValues.getCaseInsensitiveName(), mapCaseInsensitiveMap);
    }

    public static /* synthetic */ void appendFiltered$default(StringValuesBuilder stringValuesBuilder, StringValues stringValues, boolean z, Function2 function2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        appendFiltered(stringValuesBuilder, stringValues, z, function2);
    }

    /* compiled from: StringValues.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\n¢\u0006\u0002\b\u0006"}, m7105d2 = {"<anonymous>", "", "name", "", "value", "", "invoke"}, m7106k = 3, m7107mv = {1, 8, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nStringValues.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt$appendFiltered$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,422:1\n857#2,2:423\n*S KotlinDebug\n*F\n+ 1 StringValues.kt\nio/ktor/util/StringValuesKt$appendFiltered$1\n*L\n383#1:423,2\n*E\n"})
    /* renamed from: io.ktor.util.StringValuesKt$appendFiltered$1 */
    /* loaded from: classes5.dex */
    public static final class C103621 extends Lambda implements Function2<String, List<? extends String>, Unit> {
        public final /* synthetic */ boolean $keepEmpty;
        public final /* synthetic */ Function2<String, String, Boolean> $predicate;
        public final /* synthetic */ StringValuesBuilder $this_appendFiltered;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C103621(boolean z, StringValuesBuilder stringValuesBuilder, Function2<? super String, ? super String, Boolean> function2) {
            super(2);
            z = z;
            stringValuesBuilder = stringValuesBuilder;
            function2 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
            invoke2(str, (List<String>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke */
        public final void invoke2(@NotNull String name, @NotNull List<String> value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            List<String> list = value;
            ArrayList arrayList = new ArrayList(value.size());
            Function2<String, String, Boolean> function2 = function2;
            for (Object obj : list) {
                if (function2.invoke(name, (String) obj).booleanValue()) {
                    arrayList.add(obj);
                }
            }
            if (z || (!arrayList.isEmpty())) {
                stringValuesBuilder.appendAll(name, arrayList);
            }
        }
    }

    public static final void appendFiltered(@NotNull StringValuesBuilder stringValuesBuilder, @NotNull StringValues source, boolean z, @NotNull Function2<? super String, ? super String, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        source.forEach(new Function2<String, List<? extends String>, Unit>() { // from class: io.ktor.util.StringValuesKt.appendFiltered.1
            public final /* synthetic */ boolean $keepEmpty;
            public final /* synthetic */ Function2<String, String, Boolean> $predicate;
            public final /* synthetic */ StringValuesBuilder $this_appendFiltered;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C103621(boolean z2, StringValuesBuilder stringValuesBuilder2, Function2<? super String, ? super String, Boolean> predicate2) {
                super(2);
                z = z2;
                stringValuesBuilder = stringValuesBuilder2;
                function2 = predicate2;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
                invoke2(str, (List<String>) list);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke */
            public final void invoke2(@NotNull String name, @NotNull List<String> value) {
                Intrinsics.checkNotNullParameter(name, "name");
                Intrinsics.checkNotNullParameter(value, "value");
                List<String> list = value;
                ArrayList arrayList = new ArrayList(value.size());
                Function2<String, String, Boolean> function2 = function2;
                for (Object obj : list) {
                    if (function2.invoke(name, (String) obj).booleanValue()) {
                        arrayList.add(obj);
                    }
                }
                if (z || (!arrayList.isEmpty())) {
                    stringValuesBuilder.appendAll(name, arrayList);
                }
            }
        });
    }

    @NotNull
    public static final StringValuesBuilder appendAll(@NotNull StringValuesBuilder stringValuesBuilder, @NotNull StringValuesBuilder builder) {
        Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Iterator<T> it = builder.entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            stringValuesBuilder.appendAll((String) entry.getKey(), (List) entry.getValue());
        }
        return stringValuesBuilder;
    }

    @NotNull
    public static final StringValuesBuilder appendIfNameAbsent(@NotNull StringValuesBuilder stringValuesBuilder, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!stringValuesBuilder.contains(name)) {
            stringValuesBuilder.append(name, value);
        }
        return stringValuesBuilder;
    }

    @NotNull
    public static final StringValuesBuilder appendIfNameAndValueAbsent(@NotNull StringValuesBuilder stringValuesBuilder, @NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(stringValuesBuilder, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        if (!stringValuesBuilder.contains(name, value)) {
            stringValuesBuilder.append(name, value);
        }
        return stringValuesBuilder;
    }

    public static final boolean entriesEquals(Set<? extends Map.Entry<String, ? extends List<String>>> set, Set<? extends Map.Entry<String, ? extends List<String>>> set2) {
        return Intrinsics.areEqual(set, set2);
    }

    public static final int entriesHashCode(Set<? extends Map.Entry<String, ? extends List<String>>> set, int i) {
        return (i * 31) + set.hashCode();
    }
}
