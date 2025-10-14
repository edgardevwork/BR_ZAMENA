package org.jfrog.build.api.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.p059io.FileUtils;

/* loaded from: classes7.dex */
public class CommonUtils {
    public static /* synthetic */ Object lambda$getLast$5(Object obj, Object obj2) {
        return obj2;
    }

    public static <K, V> Map<K, V> filterMapValues(Map<K, V> map, final Predicate<V> predicate) {
        return (Map) map.entrySet().stream().filter(new Predicate() { // from class: org.jfrog.build.api.util.CommonUtils$$ExternalSyntheticLambda7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CommonUtils.lambda$filterMapValues$0((Map.Entry) obj);
            }
        }).filter(new Predicate() { // from class: org.jfrog.build.api.util.CommonUtils$$ExternalSyntheticLambda8
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CommonUtils.lambda$filterMapValues$1(predicate, (Map.Entry) obj);
            }
        }).collect(Collectors.toMap(new CommonUtils$$ExternalSyntheticLambda5(), new CommonUtils$$ExternalSyntheticLambda6()));
    }

    public static /* synthetic */ boolean lambda$filterMapValues$0(Map.Entry entry) {
        return entry.getValue() != null;
    }

    public static /* synthetic */ boolean lambda$filterMapValues$1(Predicate predicate, Map.Entry entry) {
        return predicate.test(entry.getValue());
    }

    public static <K, V> Map<K, V> filterMapKeys(Map<K, V> map, final Predicate<K> predicate) {
        return (Map) map.entrySet().stream().filter(new Predicate() { // from class: org.jfrog.build.api.util.CommonUtils$$ExternalSyntheticLambda3
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CommonUtils.lambda$filterMapKeys$2((Map.Entry) obj);
            }
        }).filter(new Predicate() { // from class: org.jfrog.build.api.util.CommonUtils$$ExternalSyntheticLambda4
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return CommonUtils.lambda$filterMapKeys$3(predicate, (Map.Entry) obj);
            }
        }).collect(Collectors.toMap(new CommonUtils$$ExternalSyntheticLambda5(), new CommonUtils$$ExternalSyntheticLambda6()));
    }

    public static /* synthetic */ boolean lambda$filterMapKeys$2(Map.Entry entry) {
        return entry.getKey() != null;
    }

    public static /* synthetic */ boolean lambda$filterMapKeys$3(Predicate predicate, Map.Entry entry) {
        return predicate.test(entry.getKey());
    }

    public static <K, V> Map<K, V> entriesOnlyOnLeftMap(Map<K, V> map, Map<K, V> map2) {
        HashMap map3 = new HashMap();
        map3.putAll(map);
        map3.putAll(map2);
        map3.entrySet().removeAll(map2.entrySet());
        return map3;
    }

    public static <T> List<T> concatLists(List<T> list, List<T> list2) {
        return (List) Stream.concat(list.stream(), list2.stream()).collect(Collectors.toList());
    }

    public static <F, T> ArrayList<T> transformList(Iterable<F> iterable, final Function<F, T> function) {
        final ArrayList<T> arrayList = new ArrayList<>();
        iterable.forEach(new Consumer() { // from class: org.jfrog.build.api.util.CommonUtils$$ExternalSyntheticLambda9
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                CommonUtils.lambda$transformList$4(arrayList, function, obj);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ void lambda$transformList$4(ArrayList arrayList, Function function, Object obj) {
        arrayList.add(function.apply(obj));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T getFirstSatisfying(Collection<T> collection, Predicate<T> predicate, T t) {
        return collection.stream().filter(new CommonUtils$$ExternalSyntheticLambda2()).filter(predicate).findFirst().orElse(t);
    }

    public static <T> boolean isAnySatisfying(Collection<T> collection, Predicate<T> predicate) {
        return getFirstSatisfying(collection, predicate, null) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Collection<T> filterCollection(Collection<T> collection, Predicate<T> predicate) {
        return (Collection) collection.stream().filter(new CommonUtils$$ExternalSyntheticLambda2()).filter(predicate).collect(Collectors.toList());
    }

    public static <T> T getLast(Collection<T> collection) {
        return collection.stream().reduce(new BinaryOperator() { // from class: org.jfrog.build.api.util.CommonUtils$$ExternalSyntheticLambda1
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return CommonUtils.lambda$getLast$5(obj, obj2);
            }
        }).orElse(null);
    }

    public static <T> T getOnlyElement(Collection<T> collection) {
        if (collection.size() == 1) {
            return collection.iterator().next();
        }
        throw new IllegalArgumentException("Collection was expected to have exactly one element, but has " + collection.size());
    }

    public static void writeByCharset(String str, File file, Charset charset) throws RuntimeException {
        try {
            BufferedWriter bufferedWriterNewBufferedWriter = Files.newBufferedWriter(file.toPath(), charset, new OpenOption[0]);
            try {
                bufferedWriterNewBufferedWriter.write(str);
                bufferedWriterNewBufferedWriter.flush();
                bufferedWriterNewBufferedWriter.close();
            } finally {
            }
        } catch (Throwable th) {
            throw new RuntimeException(th);
        }
    }

    public static String readByCharset(File file, Charset charset) throws IOException {
        return new String(Files.readAllBytes(file.toPath()), charset);
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        return new HashSet<>(Arrays.asList(eArr));
    }

    public static <T> Iterable<T> emptyIfNull(Iterable<T> iterable) {
        return iterable == null ? Collections.emptyList() : iterable;
    }

    public static void handleJavaTmpdirProperty() throws IOException {
        String tempDirectoryPath = FileUtils.getTempDirectoryPath();
        if (StringUtils.isNotBlank(tempDirectoryPath)) {
            if (FileUtils.getTempDirectory().exists()) {
                return;
            }
            try {
                Files.createDirectories(Paths.get(tempDirectoryPath, new String[0]), new FileAttribute[0]);
                return;
            } catch (IOException e) {
                throw new RuntimeException("The directory defined by the system property 'java.io.tmpdir' (" + tempDirectoryPath + ") doesn't exit. An attempt to create a directory in this path failed: ", e);
            }
        }
        if (SystemUtils.IS_OS_UNIX) {
            System.setProperty(SystemUtils.JAVA_IO_TMPDIR_KEY, "/tmp");
            return;
        }
        throw new RuntimeException("java.io.tmpdir system property is missing!");
    }
}
