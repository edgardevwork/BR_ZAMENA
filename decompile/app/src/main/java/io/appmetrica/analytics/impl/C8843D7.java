package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.D7 */
/* loaded from: classes7.dex */
public final class C8843D7 implements ClientComponentsInitializer {

    /* renamed from: a */
    public final List f6461a = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{"io.appmetrica.analytics.adrevenue.admob.v23.internal.AdMobClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.applovin.v12.internal.AppLovinClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.fyber.v3.internal.FyberClientModuleEntryPoint", "io.appmetrica.analytics.adrevenue.ironsource.v7.internal.IronSourceClientModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudClientModuleEntryPoint"});

    @Override // io.appmetrica.analytics.coreapi.internal.clientcomponents.ClientComponentsInitializer
    public final void onCreate() {
        if (C9820r4.m6725i().f8966a.m5692c()) {
            C8848Dc c8848Dc = C9820r4.m6725i().f8978m;
            List list = this.f6461a;
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
        }
    }
}
