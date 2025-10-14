package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.k */
/* loaded from: classes6.dex */
public final class C11745k extends Lambda implements Function1<Throwable, Throwable> {

    /* renamed from: a */
    public static final C11745k f10942a = new C11745k();

    public C11745k() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Throwable invoke(Throwable th) {
        Throwable throwable = th;
        Intrinsics.checkNotNullParameter(throwable, "error");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return !(throwable instanceof RemoteConfigException) ? new RemoteConfigException.FailedToReceiveRemoteConfig("Failed to receive remote configuration", throwable) : (RemoteConfigException) throwable;
    }
}
