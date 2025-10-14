package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.electric.network.ElectricActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideElectricActionWithJSONFactory implements Factory<ElectricActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideElectricActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public ElectricActionWithJSON get() {
        return provideElectricActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideElectricActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideElectricActionWithJSONFactory(module);
    }

    public static ElectricActionWithJSON provideElectricActionWithJSON(NetworkModule instance) {
        return (ElectricActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideElectricActionWithJSON());
    }
}
