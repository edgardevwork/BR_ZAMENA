package com.blackhub.bronline.game.gui.blackpass.viewmodel;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BlackPassPrizeListViewModel_Factory implements Factory<BlackPassPrizeListViewModel> {
    public final Provider<Application> applicationProvider;

    public BlackPassPrizeListViewModel_Factory(Provider<Application> applicationProvider) {
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public BlackPassPrizeListViewModel get() {
        return newInstance(this.applicationProvider.get());
    }

    public static BlackPassPrizeListViewModel_Factory create(Provider<Application> applicationProvider) {
        return new BlackPassPrizeListViewModel_Factory(applicationProvider);
    }

    public static BlackPassPrizeListViewModel newInstance(Application application) {
        return new BlackPassPrizeListViewModel(application);
    }
}
