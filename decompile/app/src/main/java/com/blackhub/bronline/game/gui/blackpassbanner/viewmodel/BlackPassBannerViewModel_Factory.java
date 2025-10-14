package com.blackhub.bronline.game.gui.blackpassbanner.viewmodel;

import android.app.Application;
import com.blackhub.bronline.game.gui.blackpassbanner.network.BlackPassBannerActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BlackPassBannerViewModel_Factory implements Factory<BlackPassBannerViewModel> {
    public final Provider<BlackPassBannerActionsWithJson> actionsWithJsonProvider;
    public final Provider<Application> applicationProvider;

    public BlackPassBannerViewModel_Factory(Provider<BlackPassBannerActionsWithJson> actionsWithJsonProvider, Provider<Application> applicationProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public BlackPassBannerViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get(), this.applicationProvider.get());
    }

    public static BlackPassBannerViewModel_Factory create(Provider<BlackPassBannerActionsWithJson> actionsWithJsonProvider, Provider<Application> applicationProvider) {
        return new BlackPassBannerViewModel_Factory(actionsWithJsonProvider, applicationProvider);
    }

    public static BlackPassBannerViewModel newInstance(BlackPassBannerActionsWithJson actionsWithJson, Application application) {
        return new BlackPassBannerViewModel(actionsWithJson, application);
    }
}
