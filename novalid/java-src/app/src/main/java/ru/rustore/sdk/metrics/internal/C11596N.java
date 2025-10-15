package ru.rustore.sdk.metrics.internal;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.C11605X;

/* renamed from: ru.rustore.sdk.metrics.internal.N */
/* loaded from: classes7.dex */
public final class C11596N {

    /* renamed from: a */
    public final C11591I f10634a;

    /* renamed from: b */
    public final C11593K f10635b;

    /* renamed from: c */
    public final C11594L f10636c;

    /* renamed from: d */
    public final InterfaceC11620g f10637d;

    public C11596N(C11591I persistentMetricsEventDataSource, C11593K persistentMetricsEventDtoFactory, C11594L persistentMetricsEventMapper, C11605X.b logger) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventDataSource, "persistentMetricsEventDataSource");
        Intrinsics.checkNotNullParameter(persistentMetricsEventDtoFactory, "persistentMetricsEventDtoFactory");
        Intrinsics.checkNotNullParameter(persistentMetricsEventMapper, "persistentMetricsEventMapper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f10634a = persistentMetricsEventDataSource;
        this.f10635b = persistentMetricsEventDtoFactory;
        this.f10636c = persistentMetricsEventMapper;
        this.f10637d = logger;
    }

    /* renamed from: a */
    public final void m7488a(List<C11586D> persistentMetricsEvents) throws IOException {
        Intrinsics.checkNotNullParameter(persistentMetricsEvents, "persistentMetricsEvents");
        C11591I c11591i = this.f10634a;
        C11594L c11594l = this.f10636c;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(persistentMetricsEvents, 10));
        Iterator<T> it = persistentMetricsEvents.iterator();
        while (it.hasNext()) {
            arrayList.add(c11594l.m7487a((C11586D) it.next()));
        }
        c11591i.m7484a(arrayList);
    }
}
