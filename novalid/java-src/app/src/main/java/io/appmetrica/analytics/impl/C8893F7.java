package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.F7 */
/* loaded from: classes7.dex */
public final class C8893F7 implements ServiceComponentsInitializer {

    /* renamed from: a */
    public final List f6573a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint"});

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(@NotNull Context context) {
        C8848Dc c8848Dc = C9676la.f8552C.f8573s;
        List list = this.f6573a;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new C9971x5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new C9971x5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        C9971x5[] c9971x5Arr = (C9971x5[]) array;
        InterfaceC8823Cc[] interfaceC8823CcArr = (InterfaceC8823Cc[]) Arrays.copyOf(c9971x5Arr, c9971x5Arr.length);
        synchronized (c8848Dc) {
            CollectionsKt__MutableCollectionsKt.addAll(c8848Dc.f6462a, interfaceC8823CcArr);
        }
        C9676la.f8552C.f8573s.m5061a(new C9705me(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
