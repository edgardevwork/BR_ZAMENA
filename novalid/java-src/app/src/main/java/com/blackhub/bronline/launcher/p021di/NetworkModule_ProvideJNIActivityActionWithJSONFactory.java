package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.core.network.JNIActivityActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideJNIActivityActionWithJSONFactory implements Factory<JNIActivityActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideJNIActivityActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public JNIActivityActionWithJSON get() {
        return provideJNIActivityActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideJNIActivityActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideJNIActivityActionWithJSONFactory(module);
    }

    public static JNIActivityActionWithJSON provideJNIActivityActionWithJSON(NetworkModule instance) {
        return (JNIActivityActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideJNIActivityActionWithJSON());
    }
}
