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
public final class BlackPassMainViewModel_Factory implements Factory<BlackPassMainViewModel> {
    public final Provider<BlackPassActionWithJSON> actionWithJsonProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public BlackPassMainViewModel_Factory(Provider<BlackPassActionWithJSON> actionWithJsonProvider, Provider<StringResource> stringResourceProvider, Provider<Application> applicationProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.stringResourceProvider = stringResourceProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public BlackPassMainViewModel get() {
        return newInstance(this.actionWithJsonProvider.get(), this.stringResourceProvider.get(), this.applicationProvider.get());
    }

    public static BlackPassMainViewModel_Factory create(Provider<BlackPassActionWithJSON> actionWithJsonProvider, Provider<StringResource> stringResourceProvider, Provider<Application> applicationProvider) {
        return new BlackPassMainViewModel_Factory(actionWithJsonProvider, stringResourceProvider, applicationProvider);
    }

    public static BlackPassMainViewModel newInstance(BlackPassActionWithJSON actionWithJson, StringResource stringResource, Application application) {
        return new BlackPassMainViewModel(actionWithJson, stringResource, application);
    }
}
