package com.blackhub.bronline.game.gui.notification.viewmodel;

import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.notification.network.NotificationActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class NotificationViewModel_Factory implements Factory<NotificationViewModel> {
    public final Provider<NotificationActionWithJSON> actionWithJsonProvider;
    public final Provider<StringResource> stringResourceProvider;

    public NotificationViewModel_Factory(Provider<NotificationActionWithJSON> actionWithJsonProvider, Provider<StringResource> stringResourceProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.stringResourceProvider = stringResourceProvider;
    }

    @Override // javax.inject.Provider
    public NotificationViewModel get() {
        return newInstance(this.actionWithJsonProvider.get(), this.stringResourceProvider.get());
    }

    public static NotificationViewModel_Factory create(Provider<NotificationActionWithJSON> actionWithJsonProvider, Provider<StringResource> stringResourceProvider) {
        return new NotificationViewModel_Factory(actionWithJsonProvider, stringResourceProvider);
    }

    public static NotificationViewModel newInstance(NotificationActionWithJSON actionWithJson, StringResource stringResource) {
        return new NotificationViewModel(actionWithJson, stringResource);
    }
}
