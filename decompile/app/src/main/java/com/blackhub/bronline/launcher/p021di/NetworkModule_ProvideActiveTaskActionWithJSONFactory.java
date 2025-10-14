package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.activetask.ActiveTaskActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideActiveTaskActionWithJSONFactory implements Factory<ActiveTaskActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideActiveTaskActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public ActiveTaskActionWithJSON get() {
        return provideActiveTaskActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideActiveTaskActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideActiveTaskActionWithJSONFactory(module);
    }

    public static ActiveTaskActionWithJSON provideActiveTaskActionWithJSON(NetworkModule instance) {
        return (ActiveTaskActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideActiveTaskActionWithJSON());
    }
}
