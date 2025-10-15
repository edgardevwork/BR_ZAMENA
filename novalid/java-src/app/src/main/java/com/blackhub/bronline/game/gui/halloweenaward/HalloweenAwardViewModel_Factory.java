package com.blackhub.bronline.game.gui.halloweenaward;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class HalloweenAwardViewModel_Factory implements Factory<HalloweenAwardViewModel> {
    public final Provider<HalloweenAwardActionWithJSON> actionWithJSONProvider;

    public HalloweenAwardViewModel_Factory(Provider<HalloweenAwardActionWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public HalloweenAwardViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static HalloweenAwardViewModel_Factory create(Provider<HalloweenAwardActionWithJSON> actionWithJSONProvider) {
        return new HalloweenAwardViewModel_Factory(actionWithJSONProvider);
    }

    public static HalloweenAwardViewModel newInstance(HalloweenAwardActionWithJSON actionWithJSON) {
        return new HalloweenAwardViewModel(actionWithJSON);
    }
}
