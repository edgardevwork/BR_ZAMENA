package com.blackhub.bronline.game.gui.rating;

import android.app.Application;
import com.blackhub.bronline.game.core.resources.StringResource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class RatingViewModel_Factory implements Factory<RatingViewModel> {
    public final Provider<RatingActionWithJson> actionWithJsonProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public RatingViewModel_Factory(Provider<RatingActionWithJson> actionWithJsonProvider, Provider<StringResource> stringResourceProvider, Provider<Application> applicationProvider) {
        this.actionWithJsonProvider = actionWithJsonProvider;
        this.stringResourceProvider = stringResourceProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public RatingViewModel get() {
        return newInstance(this.actionWithJsonProvider.get(), this.stringResourceProvider.get(), this.applicationProvider.get());
    }

    public static RatingViewModel_Factory create(Provider<RatingActionWithJson> actionWithJsonProvider, Provider<StringResource> stringResourceProvider, Provider<Application> applicationProvider) {
        return new RatingViewModel_Factory(actionWithJsonProvider, stringResourceProvider, applicationProvider);
    }

    public static RatingViewModel newInstance(RatingActionWithJson actionWithJson, StringResource stringResource, Application application) {
        return new RatingViewModel(actionWithJson, stringResource, application);
    }
}
