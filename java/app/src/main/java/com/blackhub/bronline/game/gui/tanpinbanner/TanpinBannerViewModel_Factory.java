package com.blackhub.bronline.game.gui.tanpinbanner;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class TanpinBannerViewModel_Factory implements Factory<TanpinBannerViewModel> {
    public final Provider<TanpinBannerActionWithJSON> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;

    public TanpinBannerViewModel_Factory(Provider<TanpinBannerActionWithJSON> actionWithJSONProvider, Provider<Application> applicationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public TanpinBannerViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.applicationProvider.get());
    }

    public static TanpinBannerViewModel_Factory create(Provider<TanpinBannerActionWithJSON> actionWithJSONProvider, Provider<Application> applicationProvider) {
        return new TanpinBannerViewModel_Factory(actionWithJSONProvider, applicationProvider);
    }

    public static TanpinBannerViewModel newInstance(TanpinBannerActionWithJSON actionWithJSON, Application application) {
        return new TanpinBannerViewModel(actionWithJSON, application);
    }
}
