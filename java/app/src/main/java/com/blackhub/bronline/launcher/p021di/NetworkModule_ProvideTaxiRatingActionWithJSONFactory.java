package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.taxirating.TaxiRatingActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideTaxiRatingActionWithJSONFactory implements Factory<TaxiRatingActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideTaxiRatingActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public TaxiRatingActionWithJSON get() {
        return provideTaxiRatingActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideTaxiRatingActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideTaxiRatingActionWithJSONFactory(module);
    }

    public static TaxiRatingActionWithJSON provideTaxiRatingActionWithJSON(NetworkModule instance) {
        return (TaxiRatingActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideTaxiRatingActionWithJSON());
    }
}
