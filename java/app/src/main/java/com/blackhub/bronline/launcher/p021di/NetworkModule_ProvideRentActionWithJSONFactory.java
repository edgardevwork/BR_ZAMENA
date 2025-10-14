package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.rent.RentActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideRentActionWithJSONFactory implements Factory<RentActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideRentActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public RentActionWithJSON get() {
        return provideRentActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideRentActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideRentActionWithJSONFactory(module);
    }

    public static RentActionWithJSON provideRentActionWithJSON(NetworkModule instance) {
        return (RentActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideRentActionWithJSON());
    }
}
