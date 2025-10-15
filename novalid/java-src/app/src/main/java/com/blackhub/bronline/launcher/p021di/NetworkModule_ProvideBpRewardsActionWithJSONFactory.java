package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.bprewards.BpRewardsActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideBpRewardsActionWithJSONFactory implements Factory<BpRewardsActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideBpRewardsActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public BpRewardsActionWithJSON get() {
        return provideBpRewardsActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideBpRewardsActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideBpRewardsActionWithJSONFactory(module);
    }

    public static BpRewardsActionWithJSON provideBpRewardsActionWithJSON(NetworkModule instance) {
        return (BpRewardsActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideBpRewardsActionWithJSON());
    }
}
