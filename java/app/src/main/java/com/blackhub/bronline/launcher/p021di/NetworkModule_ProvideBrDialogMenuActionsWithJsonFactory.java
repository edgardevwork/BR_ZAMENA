package com.blackhub.bronline.launcher.p021di;

import com.blackhub.bronline.game.gui.menu.network.MenuActionsWithJson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes7.dex */
public final class NetworkModule_ProvideBrDialogMenuActionsWithJsonFactory implements Factory<MenuActionsWithJson> {
    public final NetworkModule module;

    public NetworkModule_ProvideBrDialogMenuActionsWithJsonFactory(NetworkModule module) {
        this.module = module;
    }

    @Override // javax.inject.Provider
    public MenuActionsWithJson get() {
        return provideBrDialogMenuActionsWithJson(this.module);
    }

    public static NetworkModule_ProvideBrDialogMenuActionsWithJsonFactory create(NetworkModule module) {
        return new NetworkModule_ProvideBrDialogMenuActionsWithJsonFactory(module);
    }

    public static MenuActionsWithJson provideBrDialogMenuActionsWithJson(NetworkModule instance) {
        return (MenuActionsWithJson) Preconditions.checkNotNullFromProvides(instance.provideBrDialogMenuActionsWithJson());
    }
}
