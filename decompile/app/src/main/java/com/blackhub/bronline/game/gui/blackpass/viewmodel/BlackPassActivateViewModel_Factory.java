package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.blackpass.network.BlackPassActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BlackPassActivateViewModel_Factory implements Factory<BlackPassActivateViewModel> {
    public final Provider<BlackPassActionWithJSON> actionWithJsonProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public BlackPassActivateViewModel_Factory(Provider<BlackPassActionWithJSON> actionWithJsonProvider, Provider<Application> applicationProvider, Provider<StringResource> stringResourceProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.applicationProvider = applicationProvider;
        this.stringResourceProvider = stringResourceProvider;
    }

    @Override // javax.inject.Provider
    public BlackPassActivateViewModel get() {
        return newInstance(this.actionWithJsonProvider.get(), this.applicationProvider.get(), this.stringResourceProvider.get());
    }

    public static BlackPassActivateViewModel_Factory create(Provider<BlackPassActionWithJSON> actionWithJsonProvider, Provider<Application> applicationProvider, Provider<StringResource> stringResourceProvider) {
        return new BlackPassActivateViewModel_Factory(actionWithJsonProvider, applicationProvider, stringResourceProvider);
    }

    public static BlackPassActivateViewModel newInstance(BlackPassActionWithJSON actionWithJson, Application application, StringResource stringResource) {
        return new BlackPassActivateViewModel(actionWithJson, application, stringResource);
    }
}
