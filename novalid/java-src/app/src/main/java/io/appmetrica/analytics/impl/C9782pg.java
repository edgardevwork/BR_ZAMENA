package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.pg */
/* loaded from: classes6.dex */
public final class C9782pg extends AbstractC9632jg {

    /* renamed from: b */
    public final IReporter f8903b;

    public C9782pg(@NonNull C9571h5 c9571h5, @NonNull IReporter iReporter) {
        super(c9571h5);
        this.f8903b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC9632jg
    /* renamed from: a */
    public final boolean mo5129a(@NonNull C9252U5 c9252u5) {
        C9853sc c9853sc = (C9853sc) C9853sc.f9043c.get(c9252u5.f7312d);
        HashMap map = new HashMap();
        map.put("type", c9853sc.f9044a);
        map.put("delivery_method", c9853sc.f9045b);
        this.f8903b.reportEvent("crash_saved", map);
        return false;
    }
}
