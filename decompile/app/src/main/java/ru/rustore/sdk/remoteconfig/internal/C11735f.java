package ru.rustore.sdk.remoteconfig.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.internal.AbstractC11730d0;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.f */
/* loaded from: classes6.dex */
public final class C11735f extends Lambda implements Function0<C11708W> {

    /* renamed from: a */
    public final /* synthetic */ C11739h f10923a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11735f(C11739h c11739h) {
        super(0);
        this.f10923a = c11739h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C11708W invoke() {
        C11708W c11708w;
        C11708W c11708w2;
        C11739h c11739h = this.f10923a;
        synchronized (c11739h.f10935e) {
            try {
                C11722c actualConfigDto = c11739h.f10931a.m7532a();
                if (actualConfigDto != null) {
                    c11739h.f10933c.getClass();
                    Intrinsics.checkNotNullParameter(actualConfigDto, "actualConfigDto");
                    c11708w = new C11708W(actualConfigDto.f10890a, actualConfigDto.f10891b, actualConfigDto.f10892c);
                } else {
                    c11708w = null;
                }
                AbstractC11730d0 abstractC11730d0M7526a = c11739h.f10932b.m7526a(c11708w);
                if (abstractC11730d0M7526a instanceof AbstractC11730d0.a) {
                    c11708w2 = ((AbstractC11730d0.a) abstractC11730d0M7526a).f10914a;
                } else {
                    if (!(abstractC11730d0M7526a instanceof AbstractC11730d0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    C11687L c11687l = c11739h.f10931a.f10885a;
                    Set filesToDelete = CollectionsKt___CollectionsKt.toSet(c11687l.m7522a());
                    Intrinsics.checkNotNullParameter(filesToDelete, "filesToDelete");
                    List<C11689M> listM7522a = c11687l.m7522a();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listM7522a) {
                        if (filesToDelete.contains((C11689M) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((C11689M) it.next()).f10833a.delete();
                    }
                    C11719b c11719b = c11739h.f10931a;
                    C11729d c11729d = c11739h.f10934d;
                    C11708W networkConfigDto = ((AbstractC11730d0.b) abstractC11730d0M7526a).f10915a;
                    c11729d.getClass();
                    Intrinsics.checkNotNullParameter(networkConfigDto, "networkConfigDto");
                    c11719b.m7533a(new C11722c(networkConfigDto.f10865a, networkConfigDto.f10866b, networkConfigDto.f10867c));
                    c11708w2 = ((AbstractC11730d0.b) abstractC11730d0M7526a).f10915a;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c11708w2;
    }
}
