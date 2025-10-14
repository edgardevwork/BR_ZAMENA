package com.blackhub.bronline.game.gui.panelinfo;

import android.app.Application;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class PanelInfoViewModel_Factory implements Factory<PanelInfoViewModel> {
    public final Provider<PanelInfoActionWithJSON> actionWithJSONProvider;
    public final Provider<Application> applicationProvider;

    public PanelInfoViewModel_Factory(Provider<PanelInfoActionWithJSON> actionWithJSONProvider, Provider<Application> applicationProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
        this.applicationProvider = applicationProvider;
    }

    @Override // javax.inject.Provider
    public PanelInfoViewModel get() {
        return newInstance(this.actionWithJSONProvider.get(), this.applicationProvider.get());
    }

    public static PanelInfoViewModel_Factory create(Provider<PanelInfoActionWithJSON> actionWithJSONProvider, Provider<Application> applicationProvider) {
        return new PanelInfoViewModel_Factory(actionWithJSONProvider, applicationProvider);
    }

    public static PanelInfoViewModel newInstance(PanelInfoActionWithJSON actionWithJSON, Application application) {
        return new PanelInfoViewModel(actionWithJSON, application);
    }
}
