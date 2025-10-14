package com.blackhub.bronline.game.gui.gasmangame.viewmodel;

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
public final class GasmanChildViewModel_Factory implements Factory<GasmanChildViewModel> {
    public final Provider<LocalNotification> localNotificationProvider;

    public GasmanChildViewModel_Factory(Provider<LocalNotification> localNotificationProvider) {
        this.localNotificationProvider = localNotificationProvider;
    }

    @Override // javax.inject.Provider
    public GasmanChildViewModel get() {
        return newInstance(this.localNotificationProvider.get());
    }

    public static GasmanChildViewModel_Factory create(Provider<LocalNotification> localNotificationProvider) {
        return new GasmanChildViewModel_Factory(localNotificationProvider);
    }

    public static GasmanChildViewModel newInstance(LocalNotification localNotification) {
        return new GasmanChildViewModel(localNotification);
    }
}
