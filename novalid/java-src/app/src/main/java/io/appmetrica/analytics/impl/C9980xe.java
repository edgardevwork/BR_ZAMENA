package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: io.appmetrica.analytics.impl.xe */
/* loaded from: classes7.dex */
public final class C9980xe implements ProtobufConverter {

    /* renamed from: a */
    public final C8998Je f9312a;

    /* renamed from: b */
    public final C9855se f9313b;

    public C9980xe() {
        this(new C8998Je(), new C9855se());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C8900Fe fromModel(@NonNull C9930ve c9930ve) {
        C8900Fe c8900Fe = new C8900Fe();
        c8900Fe.f6593a = this.f9312a.fromModel(c9930ve.f9228a);
        c8900Fe.f6594b = new C8875Ee[c9930ve.f9229b.size()];
        Iterator<C9905ue> it = c9930ve.f9229b.iterator();
        int i = 0;
        while (it.hasNext()) {
            c8900Fe.f6594b[i] = this.f9313b.fromModel(it.next());
            i++;
        }
        return c8900Fe;
    }

    public C9980xe(C8998Je c8998Je, C9855se c9855se) {
        this.f9312a = c8998Je;
        this.f9313b = c9855se;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9930ve toModel(@NonNull C8900Fe c8900Fe) {
        C8974Ie model;
        ArrayList arrayList = new ArrayList(c8900Fe.f6594b.length);
        for (C8875Ee c8875Ee : c8900Fe.f6594b) {
            arrayList.add(this.f9313b.toModel(c8875Ee));
        }
        C8850De c8850De = c8900Fe.f6593a;
        if (c8850De == null) {
            model = this.f9312a.toModel(new C8850De());
        } else {
            model = this.f9312a.toModel(c8850De);
        }
        return new C9930ve(model, arrayList);
    }
}
