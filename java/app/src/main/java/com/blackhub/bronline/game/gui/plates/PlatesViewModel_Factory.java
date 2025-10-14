package com.blackhub.bronline.game.gui.plates;

import com.blackhub.bronline.game.core.resources.StringResource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class PlatesViewModel_Factory implements Factory<PlatesViewModel> {
    public final Provider<PlatesActionWithJSON> actionWithJSONProvider;
    public final Provider<StringResource> stringResourceProvider;

    public PlatesViewModel_Factory(Provider<PlatesActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.stringResourceProvider = stringResourceProvider;
    }

    @Override // javax.inject.Provider
    public PlatesViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.stringResourceProvider.get());
    }

    public static PlatesViewModel_Factory create(Provider<PlatesActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider) {
        return new PlatesViewModel_Factory(actionWithJSONProvider, stringResourceProvider);
    }

    public static PlatesViewModel newInstance(PlatesActionWithJSON actionWithJSON, StringResource stringResource) {
        return new PlatesViewModel(actionWithJSON, stringResource);
    }
}
