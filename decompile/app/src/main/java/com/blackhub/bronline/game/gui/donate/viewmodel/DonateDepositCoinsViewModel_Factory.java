package com.blackhub.bronline.game.gui.donate.viewmodel;

import com.blackhub.bronline.game.gui.donate.network.DonateActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class DonateDepositCoinsViewModel_Factory implements Factory<DonateDepositCoinsViewModel> {
    public final Provider<DonateActionWithJSON> actionsWithJsonProvider;

    public DonateDepositCoinsViewModel_Factory(Provider<DonateActionWithJSON> actionsWithJsonProvider) {
        this.actionsWithJsonProvider = actionsWithJsonProvider;
    }

    @Override // javax.inject.Provider
    public DonateDepositCoinsViewModel get() {
        return newInstance(this.actionsWithJsonProvider.get());
    }

    public static DonateDepositCoinsViewModel_Factory create(Provider<DonateActionWithJSON> actionsWithJsonProvider) {
        return new DonateDepositCoinsViewModel_Factory(actionsWithJsonProvider);
    }

    public static DonateDepositCoinsViewModel newInstance(DonateActionWithJSON actionsWithJson) {
        return new DonateDepositCoinsViewModel(actionsWithJson);
    }
}
