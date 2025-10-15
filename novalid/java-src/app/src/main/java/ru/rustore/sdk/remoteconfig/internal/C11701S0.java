package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.S0 */
/* loaded from: classes6.dex */
public final class C11701S0 extends Lambda implements Function1<Throwable, Throwable> {

    /* renamed from: a */
    public static final C11701S0 f10845a = new C11701S0();

    public C11701S0() {
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
