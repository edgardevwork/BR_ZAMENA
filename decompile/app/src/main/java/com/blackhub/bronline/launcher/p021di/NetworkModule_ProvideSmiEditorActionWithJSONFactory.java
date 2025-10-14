package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.smieditor.network.SmiEditorActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideSmiEditorActionWithJSONFactory implements Factory<SmiEditorActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideSmiEditorActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public SmiEditorActionWithJSON get() {
        return provideSmiEditorActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideSmiEditorActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideSmiEditorActionWithJSONFactory(module);
    }

    public static SmiEditorActionWithJSON provideSmiEditorActionWithJSON(NetworkModule instance) {
        return (SmiEditorActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideSmiEditorActionWithJSON());
    }
}
