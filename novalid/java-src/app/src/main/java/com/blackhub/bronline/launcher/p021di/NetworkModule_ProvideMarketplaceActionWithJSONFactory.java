package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.marketplace.MarketplaceActionWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideMarketplaceActionWithJSONFactory implements Factory<MarketplaceActionWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideMarketplaceActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public MarketplaceActionWithJson get() {
        return provideMarketplaceActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideMarketplaceActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideMarketplaceActionWithJSONFactory(module);
    }

    public static MarketplaceActionWithJson provideMarketplaceActionWithJSON(NetworkModule instance) {
        return (MarketplaceActionWithJson) Preconditions.checkNotNullFromProvides(instance.provideMarketplaceActionWithJSON());
    }
}
