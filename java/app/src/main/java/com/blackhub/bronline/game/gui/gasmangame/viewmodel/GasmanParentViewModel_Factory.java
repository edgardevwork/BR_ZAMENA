package com.blackhub.bronline.game.gui.gasmangame.viewmodel;

import com.blackhub.bronline.game.gui.gasmangame.network.GasmanActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class GasmanParentViewModel_Factory implements Factory<GasmanParentViewModel> {
    public final Provider<GasmanActionsWithJson> actionsWithJsonProvider;

    public GasmanParentViewModel_Factory(Provider<GasmanActionsWithJson> actionsWithJsonProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public GasmanParentViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get());
    }

    public static GasmanParentViewModel_Factory create(Provider<GasmanActionsWithJson> actionsWithJsonProvider) {
        return new GasmanParentViewModel_Factory(actionsWithJsonProvider);
    }

    public static GasmanParentViewModel newInstance(GasmanActionsWithJson actionsWithJson) {
        return new GasmanParentViewModel(actionsWithJson);
    }
}
