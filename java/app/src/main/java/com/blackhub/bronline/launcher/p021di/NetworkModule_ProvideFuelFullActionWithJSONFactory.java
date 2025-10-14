package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.fuelfill.network.FuelFillActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideFuelFullActionWithJSONFactory implements Factory<FuelFillActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideFuelFullActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public FuelFillActionWithJSON get() {
        return provideFuelFullActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideFuelFullActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideFuelFullActionWithJSONFactory(module);
    }

    public static FuelFillActionWithJSON provideFuelFullActionWithJSON(NetworkModule instance) {
        return (FuelFillActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideFuelFullActionWithJSON());
    }
}
