package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.fishing.FishingActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideFishingActionWithJSONFactory implements Factory<FishingActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideFishingActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public FishingActionWithJSON get() {
        return provideFishingActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideFishingActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideFishingActionWithJSONFactory(module);
    }

    public static FishingActionWithJSON provideFishingActionWithJSON(NetworkModule instance) {
        return (FishingActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideFishingActionWithJSON());
    }
}
