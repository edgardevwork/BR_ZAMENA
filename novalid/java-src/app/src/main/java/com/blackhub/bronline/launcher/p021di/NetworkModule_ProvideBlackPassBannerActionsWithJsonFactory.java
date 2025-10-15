package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.blackpassbanner.network.BlackPassBannerActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideBlackPassBannerActionsWithJsonFactory implements Factory<BlackPassBannerActionsWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideBlackPassBannerActionsWithJsonFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public BlackPassBannerActionsWithJson get() {
        return provideBlackPassBannerActionsWithJson(this.module);
    }

    public static NetworkModule_ProvideBlackPassBannerActionsWithJsonFactory create(NetworkModule module) {
        return new NetworkModule_ProvideBlackPassBannerActionsWithJsonFactory(module);
    }

    public static BlackPassBannerActionsWithJson provideBlackPassBannerActionsWithJson(NetworkModule instance) {
        return (BlackPassBannerActionsWithJson) Preconditions.checkNotNullFromProvides(instance.provideBlackPassBannerActionsWithJson());
    }
}
