package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.clicker.network.ClickerActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideClickerActionsWithJSONFactory implements Factory<ClickerActionsWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideClickerActionsWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public ClickerActionsWithJson get() {
        return provideClickerActionsWithJSON(this.module);
    }

    public static NetworkModule_ProvideClickerActionsWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideClickerActionsWithJSONFactory(module);
    }

    public static ClickerActionsWithJson provideClickerActionsWithJSON(NetworkModule instance) {
        return (ClickerActionsWithJson) Preconditions.checkNotNullFromProvides(instance.provideClickerActionsWithJSON());
    }
}
