package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.F3 */
/* loaded from: classes7.dex */
public final class C8889F3 implements InterfaceC9414an {
    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C8987J3> invoke(@NotNull List<C8987J3> list, @NotNull C8987J3 c8987j3) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                EnumC9159Q7 enumC9159Q7 = ((C8987J3) it.next()).f6806b;
                EnumC9159Q7 enumC9159Q72 = c8987j3.f6806b;
                if (enumC9159Q7 == enumC9159Q72) {
                    if (enumC9159Q72 != EnumC9159Q7.f7146c) {
                        return null;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((C8987J3) obj).f6806b != EnumC9159Q7.f7146c) {
                            arrayList.add(obj);
                        }
                    }
                    return CollectionsKt___CollectionsKt.plus((Collection<? extends C8987J3>) arrayList, c8987j3);
                }
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection<? extends C8987J3>) list, c8987j3);
    }
}
