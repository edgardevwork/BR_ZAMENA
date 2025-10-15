package ru.rustore.sdk.remoteconfig.internal;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.L */
/* loaded from: classes5.dex */
public final class C11687L {

    /* renamed from: a */
    public final Lazy f10831a;

    public C11687L(String rootDirectory, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(rootDirectory, "rootDirectory");
        this.f10831a = LazyKt__LazyJVMKt.lazy(new C11685K(rootDirectory, context));
    }

    /* renamed from: a */
    public final List<C11689M> m7522a() {
        ArrayList arrayList;
        List<File> listAsList;
        File[] fileArrListFiles = ((File) this.f10831a.getValue()).listFiles();
        if (fileArrListFiles == null || (listAsList = ArraysKt___ArraysJvmKt.asList(fileArrListFiles)) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listAsList, 10));
            for (File it : listAsList) {
                Intrinsics.checkNotNullExpressionValue(it, "it");
                arrayList.add(new C11689M(it));
            }
        }
        return arrayList == null ? CollectionsKt__CollectionsKt.emptyList() : arrayList;
    }
}
