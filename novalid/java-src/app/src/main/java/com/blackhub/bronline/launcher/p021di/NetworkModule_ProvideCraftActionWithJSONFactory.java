package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.craft.CraftActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideCraftActionWithJSONFactory implements Factory<CraftActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideCraftActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public CraftActionWithJSON get() {
        return provideCraftActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideCraftActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideCraftActionWithJSONFactory(module);
    }

    public static CraftActionWithJSON provideCraftActionWithJSON(NetworkModule instance) {
        return (CraftActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideCraftActionWithJSON());
    }
}
