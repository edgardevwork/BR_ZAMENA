package com.blackhub.bronline.game.gui.activetask;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class ActiveTaskViewModel_Factory implements Factory<ActiveTaskViewModel> {
    public final Provider<ActiveTaskActionWithJSON> actionWithJSONProvider;

    public ActiveTaskViewModel_Factory(Provider<ActiveTaskActionWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public ActiveTaskViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static ActiveTaskViewModel_Factory create(Provider<ActiveTaskActionWithJSON> actionWithJSONProvider) {
        return new ActiveTaskViewModel_Factory(actionWithJSONProvider);
    }

    public static ActiveTaskViewModel newInstance(ActiveTaskActionWithJSON actionWithJSON) {
        return new ActiveTaskViewModel(actionWithJSON);
    }
}
