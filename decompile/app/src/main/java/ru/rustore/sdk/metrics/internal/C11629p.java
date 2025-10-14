package ru.rustore.sdk.metrics.internal;

import java.net.URI;
import java.net.URL;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.metrics.BuildConfig;

/* renamed from: ru.rustore.sdk.metrics.internal.p */
/* loaded from: classes5.dex */
public final class C11629p extends Lambda implements Function0<URL> {

    /* renamed from: a */
    public final /* synthetic */ C11637s f10690a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11629p(C11637s c11637s) {
        super(0);
        this.f10690a = c11637s;
    }

    @Override // kotlin.jvm.functions.Function0
    public final URL invoke() {
        this.f10690a.f10707a.getClass();
        return new URI(BuildConfig.BACKEND_URL).resolve("/v1/send_custom_event_batch").toURL();
    }
}
