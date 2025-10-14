package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: io.appmetrica.analytics.impl.mn */
/* loaded from: classes6.dex */
public final class C9714mn implements InterfaceC8970Ia {
    @Override // io.appmetrica.analytics.impl.InterfaceC8970Ia
    @Nullable
    /* renamed from: a */
    public final String mo5266a(@NotNull Context context) {
        ProtobufStateStorage<Object> protobufStateStorageMo5468a;
        C9737nl c9737nl;
        try {
            AbstractC9292Vl abstractC9292VlM5684a = C9268Ul.m5684a(C9737nl.class);
            if (abstractC9292VlM5684a != null && (protobufStateStorageMo5468a = abstractC9292VlM5684a.mo5468a(context, abstractC9292VlM5684a.mo5469c(context))) != null && (c9737nl = (C9737nl) protobufStateStorageMo5468a.read()) != null) {
                return c9737nl.f8765a;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
