package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.admintools.AdminToolsActionWithJSON;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideAdminToolsActionWithJSONFactory implements Factory<AdminToolsActionWithJSON> {
    public final NetworkModule module;

    public NetworkModule_ProvideAdminToolsActionWithJSONFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public AdminToolsActionWithJSON get() {
        return provideAdminToolsActionWithJSON(this.module);
    }

    public static NetworkModule_ProvideAdminToolsActionWithJSONFactory create(NetworkModule module) {
        return new NetworkModule_ProvideAdminToolsActionWithJSONFactory(module);
    }

    public static AdminToolsActionWithJSON provideAdminToolsActionWithJSON(NetworkModule instance) {
        return (AdminToolsActionWithJSON) Preconditions.checkNotNullFromProvides(instance.provideAdminToolsActionWithJSON());
    }
}
