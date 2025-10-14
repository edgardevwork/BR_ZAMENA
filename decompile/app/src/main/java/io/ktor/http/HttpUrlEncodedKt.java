package io.ktor.http;

import io.ktor.http.Parameters;
import io.ktor.utils.p050io.charsets.CharsetJVMKt;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt__StringsKt;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: HttpUrlEncoded.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u0003\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\n\u0010\u0007\u001a\u00060\bj\u0002`\t\u001a\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\n2\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0000\u001a*\u0010\u0005\u001a\u00020\u0006*\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00040\u00032\n\u0010\u0007\u001a\u00060\bj\u0002`\t\u001a0\u0010\u0005\u001a\u00020\u0006*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\f0\u000b2\n\u0010\u0007\u001a\u00060\bj\u0002`\tH\u0000\u001a\"\u0010\r\u001a\u00020\u0002*\u00020\u00012\f\b\u0002\u0010\u000e\u001a\u00060\u000fj\u0002`\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012¨\u0006\u0013"}, m7105d2 = {"formUrlEncode", "", "Lio/ktor/http/Parameters;", "", "Lkotlin/Pair;", "formUrlEncodeTo", "", "out", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "Lio/ktor/http/ParametersBuilder;", "", "", "parseUrlEncodedParameters", "defaultEncoding", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "limit", "", "ktor-http"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nHttpUrlEncoded.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUrlEncoded.kt\nio/ktor/http/HttpUrlEncodedKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Parameters.kt\nio/ktor/http/Parameters$Companion\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,72:1\n1549#2:73\n1620#2,3:74\n288#2,2:77\n1855#2,2:80\n1360#2:83\n1446#2,2:84\n1549#2:86\n1620#2,3:87\n1448#2,3:90\n1360#2:93\n1446#2,2:94\n1549#2:96\n1620#2,3:97\n1448#2,3:100\n24#3:79\n1#4:82\n*S KotlinDebug\n*F\n+ 1 HttpUrlEncoded.kt\nio/ktor/http/HttpUrlEncodedKt\n*L\n14#1:73\n14#1:74,3\n16#1:77,2\n20#1:80,2\n53#1:83\n53#1:84,2\n53#1:86\n53#1:87,3\n53#1:90,3\n68#1:93\n68#1:94,2\n69#1:96\n69#1:97,3\n68#1:100,3\n19#1:79\n*E\n"})
/* loaded from: classes5.dex */
public final class HttpUrlEncodedKt {
    public static /* synthetic */ Parameters parseUrlEncodedParameters$default(String str, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = Charsets.UTF_8;
        }
        if ((i2 & 2) != 0) {
            i = 1000;
        }
        return parseUrlEncodedParameters(str, charset, i);
    }

    @NotNull
    public static final Parameters parseUrlEncodedParameters(@NotNull String str, @NotNull Charset defaultEncoding, int i) {
        Object next;
        String name;
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(defaultEncoding, "defaultEncoding");
        List<String> listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"&"}, false, i, 2, (Object) null);
        ArrayList<Pair> arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
        for (String str2 : listSplit$default) {
            arrayList.add(TuplesKt.m7112to(StringsKt__StringsKt.substringBefore$default(str2, URLEncodedUtils.NAME_VALUE_SEPARATOR, (String) null, 2, (Object) null), StringsKt__StringsKt.substringAfter(str2, URLEncodedUtils.NAME_VALUE_SEPARATOR, "")));
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Pair) next).getFirst(), "_charset_")) {
                break;
            }
        }
        Pair pair = (Pair) next;
        if (pair == null || (name = (String) pair.getSecond()) == null) {
            name = CharsetJVMKt.getName(defaultEncoding);
        }
        Charset charset = Charset.forName(name);
        Parameters.Companion companion = Parameters.INSTANCE;
        ParametersBuilder parametersBuilderParametersBuilder$default = ParametersKt.ParametersBuilder$default(0, 1, null);
        for (Pair pair2 : arrayList) {
            String str3 = (String) pair2.component1();
            String str4 = (String) pair2.component2();
            Intrinsics.checkNotNullExpressionValue(charset, "charset");
            parametersBuilderParametersBuilder$default.append(CodecsKt.decodeURLQueryComponent$default(str3, 0, 0, false, charset, 7, null), CodecsKt.decodeURLQueryComponent$default(str4, 0, 0, false, charset, 7, null));
        }
        return parametersBuilderParametersBuilder$default.build();
    }

    @NotNull
    public static final String formUrlEncode(@NotNull List<Pair<String, String>> list) throws IOException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        StringBuilder sb = new StringBuilder();
        formUrlEncodeTo(list, sb);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static final void formUrlEncodeTo(@NotNull List<Pair<String, String>> list, @NotNull Appendable out) throws IOException {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        CollectionsKt___CollectionsKt.joinTo$default(list, out, "&", null, null, 0, null, new Function1<Pair<? extends String, ? extends String>, CharSequence>() { // from class: io.ktor.http.HttpUrlEncodedKt.formUrlEncodeTo.1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Pair<? extends String, ? extends String> pair) {
                return invoke2((Pair<String, String>) pair);
            }

            @NotNull
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Pair<String, String> it) throws Throwable {
                Intrinsics.checkNotNullParameter(it, "it");
                String strEncodeURLParameter = CodecsKt.encodeURLParameter(it.getFirst(), true);
                if (it.getSecond() == null) {
                    return strEncodeURLParameter;
                }
                return strEncodeURLParameter + '=' + CodecsKt.encodeURLParameterValue(String.valueOf(it.getSecond()));
            }
        }, 60, null);
    }

    @NotNull
    public static final String formUrlEncode(@NotNull Parameters parameters) {
        Intrinsics.checkNotNullParameter(parameters, "<this>");
        Set<Map.Entry<String, List<String>>> setEntries = parameters.entries();
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
        return formUrlEncode(arrayList);
    }

    public static final void formUrlEncodeTo(@NotNull Parameters parameters, @NotNull Appendable out) throws IOException {
        Intrinsics.checkNotNullParameter(parameters, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        formUrlEncodeTo(parameters.entries(), out);
    }

    public static final void formUrlEncodeTo(@NotNull ParametersBuilder parametersBuilder, @NotNull Appendable out) throws IOException {
        Intrinsics.checkNotNullParameter(parametersBuilder, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        formUrlEncodeTo(parametersBuilder.entries(), out);
    }

    public static final void formUrlEncodeTo(@NotNull Set<? extends Map.Entry<String, ? extends List<String>>> set, @NotNull Appendable out) throws IOException {
        List listListOf;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(out, "out");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.isEmpty()) {
                listListOf = CollectionsKt__CollectionsJVMKt.listOf(TuplesKt.m7112to(str, null));
            } else {
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(TuplesKt.m7112to(str, (String) it2.next()));
                }
                listListOf = arrayList2;
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList, listListOf);
        }
        formUrlEncodeTo(arrayList, out);
    }
}
