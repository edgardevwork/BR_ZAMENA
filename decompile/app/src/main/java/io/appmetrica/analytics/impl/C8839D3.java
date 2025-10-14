package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.D3 */
/* loaded from: classes7.dex */
public final class C8839D3 implements Converter {

    /* renamed from: a */
    public final C9776pa f6444a;

    public C8839D3() {
        this(new C9776pa(20, 100));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9288Vh fromModel(@NonNull List<String> list) {
        C9054Lm c9054LmMo5318a = this.f6444a.mo5318a((List<Object>) list);
        C9499e8 c9499e8 = new C9499e8();
        c9499e8.f7995a = StringUtils.getUTF8Bytes((List<String>) c9054LmMo5318a.f6954a);
        InterfaceC9869t3 interfaceC9869t3 = c9054LmMo5318a.f6955b;
        int i = ((C8815C4) interfaceC9869t3).f9034a;
        return new C9288Vh(c9499e8, interfaceC9869t3);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    public final Object toModel(@NonNull Object obj) {
        throw new UnsupportedOperationException();
    }

    @VisibleForTesting
    public C8839D3(@NonNull C9776pa c9776pa) {
        this.f6444a = c9776pa;
    }

    @NonNull
    /* renamed from: a */
    public final List<String> m5052a(@NonNull C9288Vh c9288Vh) {
        throw new UnsupportedOperationException();
    }
}
