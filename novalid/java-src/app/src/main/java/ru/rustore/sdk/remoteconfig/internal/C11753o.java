package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.o */
/* loaded from: classes6.dex */
public final class C11753o extends Lambda implements Function1<Throwable, Throwable> {

    /* renamed from: a */
    public static final C11753o f10964a = new C11753o();

    public C11753o() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(Throwable th) {
        Throwable throwable = th;
        Intrinsics.checkNotNullParameter(throwable, "it");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return !(throwable instanceof RemoteConfigException) ? new RemoteConfigException.RemoteConfigCommonException("Initialization config failed with an error", throwable) : (RemoteConfigException) throwable;
    }
}
