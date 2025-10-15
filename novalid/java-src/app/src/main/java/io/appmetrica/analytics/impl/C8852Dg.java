package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Dg */
/* loaded from: classes7.dex */
public final class C8852Dg extends AbstractC9180R5 {

    /* renamed from: b */
    public final C9571h5 f6474b;

    /* renamed from: c */
    public final InterfaceC8827Cg f6475c;

    /* renamed from: d */
    public final C9250U3 f6476d;

    public C8852Dg(@NonNull C9571h5 c9571h5, @NonNull InterfaceC8827Cg interfaceC8827Cg) {
        this(c9571h5, interfaceC8827Cg, new C9250U3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC9180R5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8902Fg load(@NonNull C9157Q5 c9157q5) {
        C8902Fg c8902Fg = (C8902Fg) super.load(c9157q5);
        c8902Fg.f6609n = ((C8777Ag) c9157q5.componentArguments).f6327a;
        c8902Fg.f6614s = this.f6474b.f8249v.m6936a();
        c8902Fg.f6619x = this.f6474b.f8246s.m5095a();
        C8777Ag c8777Ag = (C8777Ag) c9157q5.componentArguments;
        c8902Fg.f6599d = c8777Ag.f6329c;
        c8902Fg.f6600e = c8777Ag.f6328b;
        c8902Fg.f6601f = c8777Ag.f6330d;
        c8902Fg.f6602g = c8777Ag.f6331e;
        c8902Fg.f6605j = c8777Ag.f6332f;
        c8902Fg.f6603h = c8777Ag.f6333g;
        c8902Fg.f6604i = c8777Ag.f6334h;
        Boolean boolValueOf = Boolean.valueOf(c8777Ag.f6335i);
        InterfaceC8827Cg interfaceC8827Cg = this.f6475c;
        c8902Fg.f6606k = boolValueOf;
        c8902Fg.f6607l = interfaceC8827Cg;
        C8777Ag c8777Ag2 = (C8777Ag) c9157q5.componentArguments;
        c8902Fg.f6618w = c8777Ag2.f6337k;
        C9637jl c9637jl = c9157q5.f7143a;
        C8765A4 c8765a4 = c9637jl.f8465n;
        c8902Fg.f6610o = c8765a4.f6311a;
        C9165Qd c9165Qd = c9637jl.f8470s;
        if (c9165Qd != null) {
            c8902Fg.f6615t = c9165Qd.f7157a;
            c8902Fg.f6616u = c9165Qd.f7158b;
        }
        c8902Fg.f6611p = c8765a4.f6312b;
        c8902Fg.f6613r = c9637jl.f8456e;
        c8902Fg.f6612q = c9637jl.f8462k;
        C9250U3 c9250u3 = this.f6476d;
        Map<String, String> map = c8777Ag2.f6336j;
        C9178R3 c9178r3M6368d = C9676la.f8552C.m6368d();
        c9250u3.getClass();
        c8902Fg.f6617v = C9250U3.m5629a(map, c9637jl, c9178r3M6368d);
        return c8902Fg;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C8902Fg(this.f6474b);
    }

    public C8852Dg(C9571h5 c9571h5, InterfaceC8827Cg interfaceC8827Cg, C9250U3 c9250u3) {
        super(c9571h5.getContext(), c9571h5.mo5024b().m5828c());
        this.f6474b = c9571h5;
        this.f6475c = interfaceC8827Cg;
        this.f6476d = c9250u3;
    }

    @NonNull
    /* renamed from: a */
    public final C8902Fg m5071a() {
        return new C8902Fg(this.f6474b);
    }
}
