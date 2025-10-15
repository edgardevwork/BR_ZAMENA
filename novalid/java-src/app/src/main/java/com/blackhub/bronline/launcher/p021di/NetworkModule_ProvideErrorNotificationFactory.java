package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.common.LocalNotification;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideErrorNotificationFactory implements Factory<LocalNotification> {
    public final NetworkModule module;

    public NetworkModule_ProvideErrorNotificationFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public LocalNotification get() {
        return provideErrorNotification(this.module);
    }

    public static NetworkModule_ProvideErrorNotificationFactory create(NetworkModule module) {
        return new NetworkModule_ProvideErrorNotificationFactory(module);
    }

    public static LocalNotification provideErrorNotification(NetworkModule instance) {
        return (LocalNotification) Preconditions.checkNotNullFromProvides(instance.provideErrorNotification());
    }
}
