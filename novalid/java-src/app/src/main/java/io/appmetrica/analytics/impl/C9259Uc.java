package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.Uc */
/* loaded from: classes5.dex */
public final class C9259Uc implements Converter {

    /* renamed from: a */
    public final C8855Dj f7327a = C9676la.m6362h().m6376m();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final C9987xl[] fromModel(@NotNull Map<String, ? extends Object> map) {
        C9987xl c9987xl;
        Map<String, C8996Jc> mapMo4990b = this.f7327a.mo4990b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            C8996Jc c8996Jc = mapMo4990b.get(key);
            if (c8996Jc == null || value == null) {
                c9987xl = null;
            } else {
                c9987xl = new C9987xl();
                c9987xl.f9328a = key;
                c9987xl.f9329b = (byte[]) c8996Jc.f6820c.fromModel(value);
            }
            if (c9987xl != null) {
                arrayList.add(c9987xl);
            }
        }
        Object[] array = arrayList.toArray(new C9987xl[0]);
        if (array != null) {
            return (C9987xl[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a */
    public final Map<String, Object> toModel(@NotNull C9987xl[] c9987xlArr) {
        Map<String, C8996Jc> mapMo4990b = this.f7327a.mo4990b();
        ArrayList arrayList = new ArrayList();
        for (C9987xl c9987xl : c9987xlArr) {
            C8996Jc c8996Jc = mapMo4990b.get(c9987xl.f9328a);
            Pair pairM7112to = c8996Jc != null ? TuplesKt.m7112to(c9987xl.f9328a, c8996Jc.f6820c.toModel(c9987xl.f9329b)) : null;
            if (pairM7112to != null) {
                arrayList.add(pairM7112to);
            }
        }
        return MapsKt__MapsKt.toMap(arrayList);
    }
}
