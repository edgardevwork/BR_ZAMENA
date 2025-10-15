package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt__MapsJVMKt;

/* renamed from: io.appmetrica.analytics.impl.Fc */
/* loaded from: classes6.dex */
public final class C8898Fc {

    /* renamed from: a */
    public final LinkedHashMap f6587a = new LinkedHashMap();

    /* renamed from: a */
    public final LinkedHashMap m5139a(String str) {
        LinkedHashMap linkedHashMap = this.f6587a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((ModuleEventServiceHandlerFactory) entry.getValue()).createEventHandler(str));
        }
        return linkedHashMap2;
    }
}
