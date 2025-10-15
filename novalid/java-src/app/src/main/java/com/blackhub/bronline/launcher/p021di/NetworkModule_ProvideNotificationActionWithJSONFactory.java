package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.notification.network.NotificationActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideNotificationActionWithJSONFactory implements Factory<NotificationActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideNotificationActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public NotificationActionWithJSON get() {
        return provideNotificationActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideNotificationActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideNotificationActionWithJSONFactory(module);
    }

    public static NotificationActionWithJSON provideNotificationActionWithJSON(NetworkModule instance) {
        return (NotificationActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideNotificationActionWithJSON());
    }
}
