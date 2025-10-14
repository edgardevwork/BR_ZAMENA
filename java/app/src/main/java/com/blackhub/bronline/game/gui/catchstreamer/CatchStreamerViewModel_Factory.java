package com.blackhub.bronline.game.gui.catchstreamer;

import com.blackhub.bronline.game.common.LocalNotification;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class CatchStreamerViewModel_Factory implements Factory<CatchStreamerViewModel> {
    public final Provider<CatchStreamerActionWithJSON> actionWithJSONProvider;
    public final Provider<LocalNotification> localNotificationProvider;

    public CatchStreamerViewModel_Factory(Provider<LocalNotification> localNotificationProvider, Provider<CatchStreamerActionWithJSON> actionWithJSONProvider) {
        this.localNotificationProvider = localNotificationProvider;
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public CatchStreamerViewModel get() {
        return newInstance(this.localNotificationProvider.get(), this.actionWithJSONProvider.get());
    }

    public static CatchStreamerViewModel_Factory create(Provider<LocalNotification> localNotificationProvider, Provider<CatchStreamerActionWithJSON> actionWithJSONProvider) {
        return new CatchStreamerViewModel_Factory(localNotificationProvider, actionWithJSONProvider);
    }

    public static CatchStreamerViewModel newInstance(LocalNotification localNotification, CatchStreamerActionWithJSON actionWithJSON) {
        return new CatchStreamerViewModel(localNotification, actionWithJSON);
    }
}
