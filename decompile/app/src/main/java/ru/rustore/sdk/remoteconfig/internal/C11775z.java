package ru.rustore.sdk.remoteconfig.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

/* renamed from: ru.rustore.sdk.remoteconfig.internal.z */
/* loaded from: classes5.dex */
public final class C11775z implements RemoteConfigClientEventListener {
    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void backgroundJobErrors(RemoteConfigException.BackgroundConfigUpdateError exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void firstLoadComplete() {
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void initComplete() {
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void memoryCacheUpdated() {
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void persistentStorageUpdated() {
    }

    @Override // ru.rustore.sdk.remoteconfig.RemoteConfigClientEventListener
    public final void remoteConfigNetworkRequestFailure(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
    }
}
