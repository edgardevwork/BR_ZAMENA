package com.blackhub.bronline.game.gui.moduledialog;

import android.app.Application;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.gui.moduledialog.network.ModuleDialogActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ModuleDialogViewModel_Factory implements Factory<ModuleDialogViewModel> {
    public final Provider<ModuleDialogActionsWithJson> actionsWithJsonProvider;
    public final Provider<Application> applicationProvider;
    public final Provider<StringResource> stringResourceProvider;

    public ModuleDialogViewModel_Factory(Provider<StringResource> stringResourceProvider, Provider<ModuleDialogActionsWithJson> actionsWithJsonProvider, Provider<Application> applicationProvider) {
        this.stringResourceProvider = stringResourceProvider;
        this.actionsWithJsonProvider = actionsWithJsonProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public ModuleDialogViewModel get() {
        return newInstance(this.stringResourceProvider.get(), this.actionsWithJsonProvider.get(), this.applicationProvider.get());
    }

    public static ModuleDialogViewModel_Factory create(Provider<StringResource> stringResourceProvider, Provider<ModuleDialogActionsWithJson> actionsWithJsonProvider, Provider<Application> applicationProvider) {
        return new ModuleDialogViewModel_Factory(stringResourceProvider, actionsWithJsonProvider, applicationProvider);
    }

    public static ModuleDialogViewModel newInstance(StringResource stringResource, ModuleDialogActionsWithJson actionsWithJson, Application application) {
        return new ModuleDialogViewModel(stringResource, actionsWithJson, application);
    }
}
