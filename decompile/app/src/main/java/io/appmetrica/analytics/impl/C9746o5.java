package io.appmetrica.analytics.impl;

import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.o5 */
/* loaded from: classes6.dex */
public final class C9746o5 implements InterfaceC8784An {

    /* renamed from: a */
    public final List f8803a;

    public C9746o5(@NotNull List<? extends Pair<String, ? extends InterfaceC8784An>> list) {
        this.f8803a = list;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8784An
    @Nullable
    /* renamed from: a */
    public final String mo4978a() {
        Iterator it = this.f8803a.iterator();
        while (it.hasNext()) {
            String strMo4978a = ((InterfaceC8784An) ((Pair) it.next()).getSecond()).mo4978a();
            if (strMo4978a != null && strMo4978a.length() > 0) {
                return strMo4978a;
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC8784An
    /* renamed from: a */
    public final void mo4979a(@NotNull String str) {
        Iterator it = this.f8803a.iterator();
        while (it.hasNext()) {
            ((InterfaceC8784An) ((Pair) it.next()).getSecond()).mo4979a(str);
        }
    }
}
