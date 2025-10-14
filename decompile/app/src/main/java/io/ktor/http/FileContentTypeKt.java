package io.ktor.http;

import androidx.exifinterface.media.ExifInterface;
import io.ktor.http.ContentType;
import io.ktor.util.CharsetKt;
import io.ktor.util.CollectionsKt;
import io.ktor.util.TextKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.apache.ivy.core.IvyPatternHelper;
import org.jetbrains.annotations.NotNull;

/* compiled from: FileContentType.kt */
@Metadata(m7104d1 = {"\u0000*\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\f\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002\u001a\u0012\u0010\u000f\u001a\u00020\u0004*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002\u001a\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003*\u00020\u0004\u001a\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0002\u001a\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0002\u001a<\u0010\u0015\u001a\u0014\u0012\u0004\u0012\u0002H\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00170\u00030\u0001\"\u0004\b\u0000\u0010\u0016\"\u0004\b\u0001\u0010\u0017*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0016\u0012\u0004\u0012\u0002H\u00170\u00190\u0018H\u0000\u001a\u0012\u0010\u001a\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0000\u001a\f\u0010\u001b\u001a\u00020\u0004*\u00020\u0002H\u0000\"-\u0010\u0000\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006\"-\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00030\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\n\u0010\u0006¨\u0006\u001c"}, m7105d2 = {"contentTypesByExtensions", "", "", "", "Lio/ktor/http/ContentType;", "getContentTypesByExtensions", "()Ljava/util/Map;", "contentTypesByExtensions$delegate", "Lkotlin/Lazy;", "extensionsByContentType", "getExtensionsByContentType", "extensionsByContentType$delegate", "defaultForFileExtension", "Lio/ktor/http/ContentType$Companion;", "extension", "defaultForFilePath", "path", "fileExtensions", "fromFileExtension", IvyPatternHelper.EXT_KEY, "fromFilePath", "groupByPairs", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "Lkotlin/sequences/Sequence;", "Lkotlin/Pair;", "selectDefault", "toContentType", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nFileContentType.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileContentType.kt\nio/ktor/http/FileContentTypeKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,81:1\n970#2:82\n999#2,3:83\n1002#2,3:93\n361#3,7:86\n442#3:96\n392#3:97\n1238#4,2:98\n1549#4:100\n1620#4,3:101\n1241#4:104\n*S KotlinDebug\n*F\n+ 1 FileContentType.kt\nio/ktor/http/FileContentTypeKt\n*L\n73#1:82\n73#1:83,3\n73#1:93,3\n73#1:86,7\n74#1:96\n74#1:97\n74#1:98,2\n74#1:100\n74#1:101,3\n74#1:104\n*E\n"})
/* loaded from: classes5.dex */
public final class FileContentTypeKt {

    @NotNull
    public static final Lazy contentTypesByExtensions$delegate = LazyKt__LazyJVMKt.lazy(new Function0<Map<String, List<? extends ContentType>>>() { // from class: io.ktor.http.FileContentTypeKt$contentTypesByExtensions$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<String, List<? extends ContentType>> invoke() {
            Map<String, List<? extends ContentType>> mapCaseInsensitiveMap = CollectionsKt.caseInsensitiveMap();
            mapCaseInsensitiveMap.putAll(FileContentTypeKt.groupByPairs(CollectionsKt___CollectionsKt.asSequence(MimesKt.getMimes())));
            return mapCaseInsensitiveMap;
        }
    });

    @NotNull
    public static final Lazy extensionsByContentType$delegate = LazyKt__LazyJVMKt.lazy(new Function0<Map<ContentType, ? extends List<? extends String>>>() { // from class: io.ktor.http.FileContentTypeKt$extensionsByContentType$2
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Map<ContentType, ? extends List<? extends String>> invoke() {
            return FileContentTypeKt.groupByPairs(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(MimesKt.getMimes()), new Function1<Pair<? extends String, ? extends ContentType>, Pair<? extends ContentType, ? extends String>>() { // from class: io.ktor.http.FileContentTypeKt$extensionsByContentType$2.1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Pair<? extends ContentType, ? extends String> invoke(Pair<? extends String, ? extends ContentType> pair) {
                    return invoke2((Pair<String, ContentType>) pair);
                }

                @NotNull
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Pair<ContentType, String> invoke2(@NotNull Pair<String, ContentType> pair) {
                    Intrinsics.checkNotNullParameter(pair, "<name for destructuring parameter 0>");
                    return TuplesKt.m7112to(pair.component2(), pair.component1());
                }
            }));
        }
    });

    @NotNull
    public static final ContentType defaultForFileExtension(@NotNull ContentType.Companion companion, @NotNull String extension) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(extension, "extension");
        return selectDefault(fromFileExtension(ContentType.INSTANCE, extension));
    }

    @NotNull
    public static final ContentType defaultForFilePath(@NotNull ContentType.Companion companion, @NotNull String path) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        return selectDefault(fromFilePath(ContentType.INSTANCE, path));
    }

    @NotNull
    public static final List<ContentType> fromFilePath(@NotNull ContentType.Companion companion, @NotNull String path) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(path, "path");
        int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) path, '.', StringsKt__StringsKt.lastIndexOfAny$default((CharSequence) path, CharsetKt.toCharArray("/\\"), 0, false, 6, (Object) null) + 1, false, 4, (Object) null);
        if (iIndexOf$default == -1) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        String strSubstring = path.substring(iIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        return fromFileExtension(companion, strSubstring);
    }

    @NotNull
    public static final List<ContentType> fromFileExtension(@NotNull ContentType.Companion companion, @NotNull String ext) {
        Intrinsics.checkNotNullParameter(companion, "<this>");
        Intrinsics.checkNotNullParameter(ext, "ext");
        for (String lowerCasePreservingASCIIRules = TextKt.toLowerCasePreservingASCIIRules(StringsKt__StringsKt.removePrefix(ext, (CharSequence) ".")); lowerCasePreservingASCIIRules.length() > 0; lowerCasePreservingASCIIRules = StringsKt__StringsKt.substringAfter(lowerCasePreservingASCIIRules, ".", "")) {
            List<ContentType> list = getContentTypesByExtensions().get(lowerCasePreservingASCIIRules);
            if (list != null) {
                return list;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static final List<String> fileExtensions(@NotNull ContentType contentType) {
        Intrinsics.checkNotNullParameter(contentType, "<this>");
        List<String> list = getExtensionsByContentType().get(contentType);
        if (list != null) {
            return list;
        }
        List<String> list2 = getExtensionsByContentType().get(contentType.withoutParameters());
        return list2 == null ? CollectionsKt__CollectionsKt.emptyList() : list2;
    }

    public static final Map<String, List<ContentType>> getContentTypesByExtensions() {
        return (Map) contentTypesByExtensions$delegate.getValue();
    }

    public static final Map<ContentType, List<String>> getExtensionsByContentType() {
        return (Map) extensionsByContentType$delegate.getValue();
    }

    @NotNull
    public static final ContentType selectDefault(@NotNull List<ContentType> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        ContentType octetStream = (ContentType) CollectionsKt___CollectionsKt.firstOrNull((List) list);
        if (octetStream == null) {
            octetStream = ContentType.Application.INSTANCE.getOctetStream();
        }
        return (Intrinsics.areEqual(octetStream.getContentType(), "text") && ContentTypesKt.charset(octetStream) == null) ? ContentTypesKt.withCharset(octetStream, Charsets.UTF_8) : octetStream;
    }

    @NotNull
    public static final ContentType toContentType(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            return ContentType.INSTANCE.parse(str);
        } catch (Throwable th) {
            throw new IllegalArgumentException("Failed to parse " + str, th);
        }
    }

    @NotNull
    public static final <A, B> Map<A, List<B>> groupByPairs(@NotNull Sequence<? extends Pair<? extends A, ? extends B>> sequence) {
        Intrinsics.checkNotNullParameter(sequence, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair<? extends A, ? extends B> pair : sequence) {
            A first = pair.getFirst();
            Object arrayList = linkedHashMap.get(first);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(first, arrayList);
            }
            ((List) arrayList).add(pair);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList2.add(((Pair) it.next()).getSecond());
            }
            linkedHashMap2.put(key, arrayList2);
        }
        return linkedHashMap2;
    }
}
