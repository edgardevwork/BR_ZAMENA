package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.taxi.TaxiActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideTaxiActionWithJSONFactory implements Factory<TaxiActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideTaxiActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TaxiActionWithJSON get() {
        return provideTaxiActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideTaxiActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideTaxiActionWithJSONFactory(module);
    }

    public static TaxiActionWithJSON provideTaxiActionWithJSON(NetworkModule instance) {
        return (TaxiActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideTaxiActionWithJSON());
    }
}
