package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.W0 */
/* loaded from: classes6.dex */
public final class C11709W0 extends Lambda implements Function1<Throwable, Throwable> {

    /* renamed from: a */
    public static final C11709W0 f10868a = new C11709W0();

    public C11709W0() {
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
