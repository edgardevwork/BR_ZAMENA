package io.appmetrica.analytics.impl;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.te */
/* loaded from: classes6.dex */
public final class C9880te implements InterfaceC9414an {

    /* renamed from: a */
    public final boolean f9120a;

    public C9880te(@NotNull C9930ve c9930ve) {
        boolean z;
        List<C9905ue> list = c9930ve.f9229b;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = true;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C9905ue) it.next()).f9177c == EnumC9159Q7.f7146c) {
                    z = false;
                    break;
                }
            }
            z = true;
        }
        this.f9120a = z;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final List<C9905ue> invoke(@NotNull List<? extends C9905ue> list, @NotNull C8974Ie c8974Ie) {
        C9905ue c9905ue = new C9905ue(c8974Ie.f6780a, c8974Ie.f6781b, c8974Ie.f6784e);
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((C9905ue) it.next()).f9177c == c8974Ie.f6784e) {
                    if (c9905ue.f9177c == EnumC9159Q7.f7146c && this.f9120a) {
                        return CollectionsKt___CollectionsKt.plus((Collection<? extends C9905ue>) list, c9905ue);
                    }
                    return null;
                }
            }
        }
        return CollectionsKt___CollectionsKt.plus((Collection<? extends C9905ue>) list, c9905ue);
    }
}
