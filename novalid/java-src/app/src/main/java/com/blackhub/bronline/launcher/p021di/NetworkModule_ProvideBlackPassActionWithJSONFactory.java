package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.blackpass.network.BlackPassActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideBlackPassActionWithJSONFactory implements Factory<BlackPassActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideBlackPassActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public BlackPassActionWithJSON get() {
        return provideBlackPassActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideBlackPassActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideBlackPassActionWithJSONFactory(module);
    }

    public static BlackPassActionWithJSON provideBlackPassActionWithJSON(NetworkModule instance) {
        return (BlackPassActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideBlackPassActionWithJSON());
    }
}
