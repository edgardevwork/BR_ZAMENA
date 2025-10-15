package io.ktor.http;

import io.ktor.http.ContentRange;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Ranges.kt */
@Metadata(m7104d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0018\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u001a \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\b\u0012\u0004\u0012\u00020\b0\u00052\u0006\u0010\t\u001a\u00020\nH\u0000¨\u0006\u000b"}, m7105d2 = {"parseRangesSpecifier", "Lio/ktor/http/RangesSpecifier;", "rangeSpec", "", "mergeRangesKeepOrder", "", "Lkotlin/ranges/LongRange;", "toLongRanges", "Lio/ktor/http/ContentRange;", "contentLength", "", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nRanges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Ranges.kt\nio/ktor/http/RangesKt\n+ 2 Text.kt\nio/ktor/util/TextKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,119:1\n38#2,4:120\n38#2,4:127\n1549#3:124\n1620#3,2:125\n1622#3:131\n1549#3:132\n1620#3,3:133\n819#3:136\n847#3,2:137\n1045#3:139\n1789#3,3:140\n*S KotlinDebug\n*F\n+ 1 Ranges.kt\nio/ktor/http/RangesKt\n*L\n61#1:120,4\n66#1:127,4\n62#1:124\n62#1:125,2\n62#1:131\n85#1:132\n85#1:133,3\n91#1:136\n91#1:137,2\n95#1:139\n95#1:140,3\n*E\n"})
/* loaded from: classes6.dex */
public final class RangesKt {
    @Nullable
    public static final RangesSpecifier parseRangesSpecifier(@NotNull String rangeSpec) {
        Pair pairM7112to;
        ContentRange bounded;
        Intrinsics.checkNotNullParameter(rangeSpec, "rangeSpec");
        try {
            int iIndexOf$default = StringsKt__StringsKt.indexOf$default((CharSequence) rangeSpec, URLEncodedUtils.NAME_VALUE_SEPARATOR, 0, false, 6, (Object) null);
            if (iIndexOf$default == -1) {
                return null;
            }
            String strSubstring = rangeSpec.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            String strSubstring2 = rangeSpec.substring(iIndexOf$default + 1);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
            Pair pairM7112to2 = TuplesKt.m7112to(strSubstring, strSubstring2);
            String str = (String) pairM7112to2.component1();
            List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) pairM7112to2.component2(), new char[]{','}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
            for (String str2 : listSplit$default) {
                if (StringsKt__StringsJVMKt.startsWith$default(str2, "-", false, 2, null)) {
                    bounded = new ContentRange.Suffix(Long.parseLong(StringsKt__StringsKt.removePrefix(str2, (CharSequence) "-")));
                } else {
                    int iIndexOf$default2 = StringsKt__StringsKt.indexOf$default((CharSequence) str2, "-", 0, false, 6, (Object) null);
                    if (iIndexOf$default2 == -1) {
                        pairM7112to = TuplesKt.m7112to("", "");
                    } else {
                        String strSubstring3 = str2.substring(0, iIndexOf$default2);
                        Intrinsics.checkNotNullExpressionValue(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                        String strSubstring4 = str2.substring(iIndexOf$default2 + 1);
                        Intrinsics.checkNotNullExpressionValue(strSubstring4, "this as java.lang.String).substring(startIndex)");
                        pairM7112to = TuplesKt.m7112to(strSubstring3, strSubstring4);
                    }
                    String str3 = (String) pairM7112to.component1();
                    String str4 = (String) pairM7112to.component2();
                    bounded = str4.length() > 0 ? new ContentRange.Bounded(Long.parseLong(str3), Long.parseLong(str4)) : new ContentRange.TailFrom(Long.parseLong(str3));
                }
                arrayList.add(bounded);
            }
            if (!arrayList.isEmpty() && str.length() != 0) {
                RangesSpecifier rangesSpecifier = new RangesSpecifier(str, arrayList);
                if (RangesSpecifier.isValid$default(rangesSpecifier, null, 1, null)) {
                    return rangesSpecifier;
                }
                return null;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NotNull
    public static final List<LongRange> toLongRanges(@NotNull List<? extends ContentRange> list, long j) {
        LongRange longRangeUntil;
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<? extends ContentRange> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (ContentRange contentRange : list2) {
            if (contentRange instanceof ContentRange.Bounded) {
                ContentRange.Bounded bounded = (ContentRange.Bounded) contentRange;
                longRangeUntil = new LongRange(bounded.getFrom(), RangesKt___RangesKt.coerceAtMost(bounded.getTo(), j - 1));
            } else if (contentRange instanceof ContentRange.TailFrom) {
                longRangeUntil = RangesKt___RangesKt.until(((ContentRange.TailFrom) contentRange).getFrom(), j);
            } else {
                if (!(contentRange instanceof ContentRange.Suffix)) {
                    throw new NoWhenBranchMatchedException();
                }
                longRangeUntil = RangesKt___RangesKt.until(RangesKt___RangesKt.coerceAtLeast(j - ((ContentRange.Suffix) contentRange).getLastCount(), 0L), j);
            }
            arrayList.add(longRangeUntil);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!((LongRange) obj).isEmpty()) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @NotNull
    public static final List<LongRange> mergeRangesKeepOrder(@NotNull List<LongRange> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<LongRange> listSortedWith = CollectionsKt___CollectionsKt.sortedWith(list, new Comparator() { // from class: io.ktor.http.RangesKt$mergeRangesKeepOrder$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt__ComparisonsKt.compareValues(((LongRange) t).getStart(), ((LongRange) t2).getStart());
            }
        });
        ArrayList arrayList = new ArrayList(list.size());
        for (LongRange longRange : listSortedWith) {
            if (arrayList.isEmpty()) {
                arrayList.add(longRange);
            } else if (((LongRange) CollectionsKt___CollectionsKt.last((List) arrayList)).getEndInclusive().longValue() < longRange.getStart().longValue() - 1) {
                arrayList.add(longRange);
            } else {
                LongRange longRange2 = (LongRange) CollectionsKt___CollectionsKt.last((List) arrayList);
                arrayList.set(CollectionsKt__CollectionsKt.getLastIndex(arrayList), new LongRange(longRange2.getStart().longValue(), Math.max(longRange2.getEndInclusive().longValue(), longRange.getEndInclusive().longValue())));
            }
        }
        LongRange[] longRangeArr = new LongRange[list.size()];
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LongRange range = (LongRange) it.next();
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Intrinsics.checkNotNullExpressionValue(range, "range");
                    if (io.ktor.util.RangesKt.contains(range, list.get(i))) {
                        longRangeArr[i] = range;
                        break;
                    }
                    i++;
                }
            }
        }
        return ArraysKt___ArraysKt.filterNotNull(longRangeArr);
    }
}
