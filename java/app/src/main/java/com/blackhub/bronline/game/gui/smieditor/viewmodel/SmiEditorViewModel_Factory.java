package com.blackhub.bronline.game.gui.smieditor.viewmodel;

import com.blackhub.bronline.game.common.LocalNotification;
import com.blackhub.bronline.game.gui.smieditor.network.SmiEditorActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class SmiEditorViewModel_Factory implements Factory<SmiEditorViewModel> {
    public final Provider<SmiEditorActionWithJSON> actionWithJSONProvider;
    public final Provider<LocalNotification> localNotificationProvider;

    public SmiEditorViewModel_Factory(Provider<SmiEditorActionWithJSON> actionWithJSONProvider, Provider<LocalNotification> localNotificationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.localNotificationProvider = localNotificationProvider;
    }

    @Override // javax.inject.Provider
    public SmiEditorViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.localNotificationProvider.get());
    }

    public static SmiEditorViewModel_Factory create(Provider<SmiEditorActionWithJSON> actionWithJSONProvider, Provider<LocalNotification> localNotificationProvider) {
        return new SmiEditorViewModel_Factory(actionWithJSONProvider, localNotificationProvider);
    }

    public static SmiEditorViewModel newInstance(SmiEditorActionWithJSON actionWithJSON, LocalNotification localNotification) {
        return new SmiEditorViewModel(actionWithJSON, localNotification);
    }
}
