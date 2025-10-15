package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.upgradeobjectevent.UpgradeObjectEventActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideUpgradeObjectActionWithJSONFactory implements Factory<UpgradeObjectEventActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideUpgradeObjectActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public UpgradeObjectEventActionWithJSON get() {
        return provideUpgradeObjectActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideUpgradeObjectActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideUpgradeObjectActionWithJSONFactory(module);
    }

    public static UpgradeObjectEventActionWithJSON provideUpgradeObjectActionWithJSON(NetworkModule instance) {
        return (UpgradeObjectEventActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideUpgradeObjectActionWithJSON());
    }
}
