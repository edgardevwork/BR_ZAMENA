package com.blackhub.bronline.game.gui.interactionwithnpc;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class InteractionWithNpcViewModel_Factory implements Factory<InteractionWithNpcViewModel> {
    public final Provider<InteractionWithNpcActionWithJSON> actionWithJSONProvider;

    public InteractionWithNpcViewModel_Factory(Provider<InteractionWithNpcActionWithJSON> actionWithJSONProvider) {
        this.actionWithJSONProvider = actionWithJSONProvider;
    }

    @Override // javax.inject.Provider
    public InteractionWithNpcViewModel get() {
        return newInstance(this.actionWithJSONProvider.get());
    }

    public static InteractionWithNpcViewModel_Factory create(Provider<InteractionWithNpcActionWithJSON> actionWithJSONProvider) {
        return new InteractionWithNpcViewModel_Factory(actionWithJSONProvider);
    }

    public static InteractionWithNpcViewModel newInstance(InteractionWithNpcActionWithJSON actionWithJSON) {
        return new InteractionWithNpcViewModel(actionWithJSON);
    }
}
