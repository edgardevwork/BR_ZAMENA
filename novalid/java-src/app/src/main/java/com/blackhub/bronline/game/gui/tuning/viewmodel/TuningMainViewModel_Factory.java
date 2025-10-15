package com.blackhub.bronline.game.gui.tuning.viewmodel;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.tuning.network.TuningActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class TuningMainViewModel_Factory implements Factory<TuningMainViewModel> {
    public final Provider<TuningActionWithJSON> actionWithJsonProvider;
    public final Provider<LocalNotification> localNotificationProvider;

    public TuningMainViewModel_Factory(Provider<TuningActionWithJSON> actionWithJsonProvider, Provider<LocalNotification> localNotificationProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.localNotificationProvider = localNotificationProvider;
    }

    @Override // javax.inject.Provider
    public TuningMainViewModel get() {
        return newInstance(this.actionWithJsonProvider.get(), this.localNotificationProvider.get());
    }

    public static TuningMainViewModel_Factory create(Provider<TuningActionWithJSON> actionWithJsonProvider, Provider<LocalNotification> localNotificationProvider) {
        return new TuningMainViewModel_Factory(actionWithJsonProvider, localNotificationProvider);
    }

    public static TuningMainViewModel newInstance(TuningActionWithJSON actionWithJson, LocalNotification localNotification) {
        return new TuningMainViewModel(actionWithJson, localNotification);
    }
}
