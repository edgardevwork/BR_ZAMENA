package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.menupausesettingandmap.network.NewMenuActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideNewMenuActionWithJSONFactory implements Factory<NewMenuActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideNewMenuActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public NewMenuActionWithJSON get() {
        return provideNewMenuActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideNewMenuActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideNewMenuActionWithJSONFactory(module);
    }

    public static NewMenuActionWithJSON provideNewMenuActionWithJSON(NetworkModule instance) {
        return (NewMenuActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideNewMenuActionWithJSON());
    }
}
