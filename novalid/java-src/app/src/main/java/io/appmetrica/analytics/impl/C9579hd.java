package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.ndkcrashesapi.internal.NativeCrashSource;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.hd */
/* loaded from: classes7.dex */
public final class C9579hd implements ProtobufConverter {

    /* renamed from: a */
    @NotNull
    public static final C9554gd f8278a = new C9554gd();

    /* renamed from: b */
    public static final Map f8279b = MapsKt__MapsKt.mapOf(TuplesKt.m7112to(NativeCrashSource.UNKNOWN, 0), TuplesKt.m7112to(NativeCrashSource.CRASHPAD, 3));

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9397a6 fromModel(@NotNull C9654kd c9654kd) {
        C9397a6 c9397a6 = new C9397a6();
        c9397a6.f7680f = 1;
        C9372Z5 c9372z5 = new C9372Z5();
        c9372z5.f7621a = c9654kd.f8512a;
        C9472d6 c9472d6 = new C9472d6();
        Integer num = (Integer) f8279b.get(c9654kd.f8513b.f8435a);
        if (num != null) {
            c9472d6.f7896a = num.intValue();
        }
        String str = c9654kd.f8513b.f8436b;
        if (str == null) {
            str = "";
        }
        c9472d6.f7897b = str;
        c9372z5.f7622b = c9472d6;
        c9397a6.f7681g = c9372z5;
        return c9397a6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    /* renamed from: a */
    public final C9654kd m6257a(@NotNull C9397a6 c9397a6) {
        throw new UnsupportedOperationException();
    }
}
