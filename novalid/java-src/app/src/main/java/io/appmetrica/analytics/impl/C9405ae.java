package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.plugins.PluginErrorDetails;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.impl.ae */
/* loaded from: classes5.dex */
public final class C9405ae implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final byte[] fromModel(@NotNull String str) {
        if (Intrinsics.areEqual(PluginErrorDetails.Platform.NATIVE, str)) {
            str = "JVM";
        }
        return str.getBytes(Charsets.UTF_8);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    @NotNull
    /* renamed from: a */
    public final String m5855a(@NotNull byte[] bArr) {
        throw new UnsupportedOperationException();
    }
}
