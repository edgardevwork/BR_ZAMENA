package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.H */
/* loaded from: classes6.dex */
public final class C11679H extends Lambda implements Function1<Throwable, Throwable> {

    /* renamed from: a */
    public static final C11679H f10823a = new C11679H();

    public C11679H() {
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
