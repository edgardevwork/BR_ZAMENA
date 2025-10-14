package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.fractions.network.FractionActionsWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideFractionActionsWithJSONFactory implements Factory<FractionActionsWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideFractionActionsWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public FractionActionsWithJSON get() {
        return provideFractionActionsWithJSON(this.module);
    }

    public static NetworkModule_ProvideFractionActionsWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideFractionActionsWithJSONFactory(module);
    }

    public static FractionActionsWithJSON provideFractionActionsWithJSON(NetworkModule instance) {
        return (FractionActionsWithJSON) Preconditions.checkNotNullFromProvides(instance.provideFractionActionsWithJSON());
    }
}
