package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleServiceEventHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Nc */
/* loaded from: classes6.dex */
public final class C9092Nc extends AbstractC9632jg {

    /* renamed from: b */
    public final ArrayList f7030b;

    public C9092Nc(@NotNull C9571h5 c9571h5) {
        super(c9571h5);
        String strM5827b = c9571h5.mo5024b().m5827b();
        strM5827b = strM5827b == null ? "empty" : strM5827b;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String.format("[ModulesEventHandler-%s]", Arrays.copyOf(new Object[]{strM5827b}, 1));
        LinkedHashMap linkedHashMapM5139a = C9676la.m6362h().m6375l().m5139a(strM5827b);
        ArrayList arrayList = new ArrayList(linkedHashMapM5139a.size());
        for (Map.Entry entry : linkedHashMapM5139a.entrySet()) {
            arrayList.add(TuplesKt.m7112to(entry.getValue(), new C8873Ec(c9571h5, (String) entry.getKey())));
        }
        this.f7030b = arrayList;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NotNull C9252U5 c9252u5) {
        ArrayList arrayList = this.f7030b;
        if (!(arrayList instanceof Collection) || !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ModuleServiceEventHandler moduleServiceEventHandler = (ModuleServiceEventHandler) pair.component1();
                C8873Ec c8873Ec = (C8873Ec) pair.component2();
                if (moduleServiceEventHandler.handle(new C8948Hc(c8873Ec.f6541b, c8873Ec.f6540a, new C8923Gc(c8873Ec.f6542c, c9252u5)), c9252u5)) {
                    return true;
                }
            }
        }
        return false;
    }
}
