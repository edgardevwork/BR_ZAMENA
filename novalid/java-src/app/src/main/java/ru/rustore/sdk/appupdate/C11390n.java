package ru.rustore.sdk.appupdate;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.metrics.MetricsClient;

/* renamed from: ru.rustore.sdk.appupdate.n */
/* loaded from: classes6.dex */
public final class C11390n {

    /* renamed from: a */
    @NotNull
    public final C11384j f10134a;

    /* renamed from: b */
    @NotNull
    public final MetricsClient f10135b;

    public C11390n(@NotNull C11384j mapper, @NotNull MetricsClient metricsClient) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(metricsClient, "metricsClient");
        this.f10134a = mapper;
        this.f10135b = metricsClient;
    }
}
