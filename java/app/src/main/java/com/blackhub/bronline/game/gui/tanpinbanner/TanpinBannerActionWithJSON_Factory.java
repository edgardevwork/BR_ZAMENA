package com.blackhub.bronline.game.gui.tanpinbanner;

import com.blackhub.bronline.game.GUIManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata

public final class TanpinBannerActionWithJSON_Factory implements Factory<TanpinBannerActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public TanpinBannerActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public TanpinBannerActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static TanpinBannerActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new TanpinBannerActionWithJSON_Factory(guiManagerProvider);
    }

    public static TanpinBannerActionWithJSON newInstance(GUIManager guiManager) {
        return new TanpinBannerActionWithJSON(guiManager);
    }
}
