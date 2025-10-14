package com.blackhub.bronline.game.gui.admintools;

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
public final class AdminToolsViewModel_Factory implements Factory<AdminToolsViewModel> {
    public final Provider<AdminToolsActionWithJSON> actionWithJSONProvider;
    public final Provider<StringResource> stringResourceProvider;

    public AdminToolsViewModel_Factory(Provider<AdminToolsActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.stringResourceProvider = stringResourceProvider;
    }

    @Override // javax.inject.Provider
    public AdminToolsViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.stringResourceProvider.get());
    }

    public static AdminToolsViewModel_Factory create(Provider<AdminToolsActionWithJSON> actionWithJSONProvider, Provider<StringResource> stringResourceProvider) {
        return new AdminToolsViewModel_Factory(actionWithJSONProvider, stringResourceProvider);
    }

    public static AdminToolsViewModel newInstance(AdminToolsActionWithJSON actionWithJSON, StringResource stringResource) {
        return new AdminToolsViewModel(actionWithJSON, stringResource);
    }
}
