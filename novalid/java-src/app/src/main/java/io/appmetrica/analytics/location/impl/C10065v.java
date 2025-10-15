package io.appmetrica.analytics.location.impl;

import android.content.Context;
import android.location.LocationListener;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider;
import org.jetbrains.annotations.NotNull;

/* renamed from: io.appmetrica.analytics.location.impl.v */
/* loaded from: classes7.dex */
public final class C10065v implements LastKnownLocationExtractorProvider {

    /* renamed from: a */
    public final String f9476a;

    /* renamed from: b */
    public final InterfaceC10062s f9477b;

    /* renamed from: c */
    public final String f9478c;

    public C10065v(@NotNull String str, @NotNull InterfaceC10062s interfaceC10062s, @NotNull String str2) {
        this.f9476a = str;
        this.f9477b = interfaceC10062s;
        this.f9478c = str2;
    }

    @Override // io.appmetrica.analytics.locationapi.internal.LastKnownLocationExtractorProvider
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10064u getExtractor(@NotNull Context context, @NotNull PermissionExtractor permissionExtractor, @NotNull IHandlerExecutor iHandlerExecutor, @NotNull LocationListener locationListener) {
        return new C10064u(context, this.f9477b.mo7023a(permissionExtractor), locationListener, this.f9476a);
    }

    @Override // io.appmetrica.analytics.locationapi.internal.Identifiable
    @NotNull
    public final String getIdentifier() {
        return this.f9478c;
    }
}
