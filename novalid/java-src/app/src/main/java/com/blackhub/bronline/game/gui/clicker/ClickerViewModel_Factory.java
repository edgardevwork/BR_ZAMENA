package com.blackhub.bronline.game.gui.clicker;

import android.app.Application;
import com.blackhub.bronline.game.gui.clicker.network.ClickerActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ClickerViewModel_Factory implements Factory<ClickerViewModel> {
    public final Provider<ClickerActionsWithJson> actionsWithJsonProvider;
    public final Provider<Application> applicationProvider;

    public ClickerViewModel_Factory(Provider<ClickerActionsWithJson> actionsWithJsonProvider, Provider<Application> applicationProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public ClickerViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get(), this.applicationProvider.get());
    }

    public static ClickerViewModel_Factory create(Provider<ClickerActionsWithJson> actionsWithJsonProvider, Provider<Application> applicationProvider) {
        return new ClickerViewModel_Factory(actionsWithJsonProvider, applicationProvider);
    }

    public static ClickerViewModel newInstance(ClickerActionsWithJson actionsWithJson, Application application) {
        return new ClickerViewModel(actionsWithJson, application);
    }
}
