package ru.rustore.sdk.metrics.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: ru.rustore.sdk.metrics.internal.H */
/* loaded from: classes5.dex */
public final class C11590H extends Lambda implements Function0<String> {

    /* renamed from: a */
    public final /* synthetic */ List<C11592J> f10621a;

    /* renamed from: b */
    public final /* synthetic */ int f10622b = 10;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11590H(List list) {
        super(0);
        this.f10621a = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        List<C11592J> list = this.f10621a;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C11639u(((C11592J) it.next()).f10628a));
        }
        return "Getting first " + this.f10622b + " from storage: " + arrayList;
    }
}
