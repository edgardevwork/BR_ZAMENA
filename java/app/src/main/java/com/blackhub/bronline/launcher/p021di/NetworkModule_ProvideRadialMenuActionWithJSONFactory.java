package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.radialmenuforcar.netrowk.RadialMenuActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideRadialMenuActionWithJSONFactory implements Factory<RadialMenuActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideRadialMenuActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public RadialMenuActionWithJSON get() {
        return provideRadialMenuActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideRadialMenuActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideRadialMenuActionWithJSONFactory(module);
    }

    public static RadialMenuActionWithJSON provideRadialMenuActionWithJSON(NetworkModule instance) {
        return (RadialMenuActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideRadialMenuActionWithJSON());
    }
}
