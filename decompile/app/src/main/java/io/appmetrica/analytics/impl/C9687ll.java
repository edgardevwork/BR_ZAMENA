package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ll */
/* loaded from: classes6.dex */
public final class C9687ll implements InterfaceC9762ol {

    /* renamed from: a */
    public volatile C9637jl f8599a;

    /* renamed from: b */
    public final CopyOnWriteArrayList f8600b = new CopyOnWriteArrayList();

    @Override // io.appmetrica.analytics.impl.InterfaceC9762ol
    /* renamed from: a */
    public final void mo5082a(@NotNull C9637jl c9637jl) {
        this.f8599a = c9637jl;
        Iterator it = this.f8600b.iterator();
        while (it.hasNext()) {
            ((InterfaceC9762ol) it.next()).mo5082a(c9637jl);
        }
    }

    /* renamed from: b */
    public final void m6407b(@NotNull InterfaceC9762ol interfaceC9762ol) {
        this.f8600b.remove(interfaceC9762ol);
    }

    /* renamed from: b */
    public final void m6406b(@NotNull Context context) {
        String strOptStringOrNull;
        ProtobufStateStorage<Object> protobufStateStorageM5697a = C9268Ul.m5684a(C9737nl.class).m5697a(context);
        C9939vn c9939vnM7011a = C9676la.m6362h().m6363A().m7011a();
        synchronized (c9939vnM7011a) {
            strOptStringOrNull = JsonUtils.optStringOrNull(c9939vnM7011a.f9242a.m6979a(), "device_id");
        }
        mo5082a(new C9637jl(strOptStringOrNull, c9939vnM7011a.m6907a(), (C9737nl) protobufStateStorageM5697a.read()));
    }

    @NotNull
    /* renamed from: a */
    public final C9637jl m6404a() {
        C9637jl c9637jl = this.f8599a;
        if (c9637jl != null) {
            return c9637jl;
        }
        Intrinsics.throwUninitializedPropertyAccessException("startupState");
        return null;
    }

    /* renamed from: a */
    public final void m6405a(@NotNull InterfaceC9762ol interfaceC9762ol) {
        this.f8600b.add(interfaceC9762ol);
        if (this.f8599a != null) {
            C9637jl c9637jl = this.f8599a;
            if (c9637jl == null) {
                Intrinsics.throwUninitializedPropertyAccessException("startupState");
                c9637jl = null;
            }
            interfaceC9762ol.mo5082a(c9637jl);
        }
    }
}
