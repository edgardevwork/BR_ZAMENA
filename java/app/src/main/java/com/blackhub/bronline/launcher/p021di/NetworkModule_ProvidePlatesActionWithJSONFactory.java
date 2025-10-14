package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.plates.PlatesActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvidePlatesActionWithJSONFactory implements Factory<PlatesActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvidePlatesActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public PlatesActionWithJSON get() {
        return providePlatesActionWithJSON(this.module);
    }

    public static NetworkModule_ProvidePlatesActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvidePlatesActionWithJSONFactory(module);
    }

    public static PlatesActionWithJSON providePlatesActionWithJSON(NetworkModule instance) {
        return (PlatesActionWithJSON) Preconditions.checkNotNullFromProvides(instance.providePlatesActionWithJSON());
    }
}
