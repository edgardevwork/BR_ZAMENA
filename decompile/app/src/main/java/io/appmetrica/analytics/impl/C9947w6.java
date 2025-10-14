package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* renamed from: io.appmetrica.analytics.impl.w6 */
/* loaded from: classes7.dex */
public final class C9947w6 implements ProtobufConverter {

    /* renamed from: a */
    public final C9310Wf f9250a;

    public C9947w6() {
        this(new C9310Wf());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9447c6 fromModel(@NonNull C9922v6 c9922v6) {
        C9447c6 c9447c6FromModel = this.f9250a.fromModel(c9922v6.f9214a);
        c9447c6FromModel.f7828g = 1;
        C9422b6 c9422b6 = new C9422b6();
        c9447c6FromModel.f7829h = c9422b6;
        c9422b6.f7768a = StringUtils.correctIllFormedString(c9922v6.f9215b);
        return c9447c6FromModel;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public C9947w6(C9310Wf c9310Wf) {
        this.f9250a = c9310Wf;
    }

    @NonNull
    /* renamed from: a */
    public final C9922v6 m6919a(@NonNull C9447c6 c9447c6) {
        throw new UnsupportedOperationException();
    }
}
