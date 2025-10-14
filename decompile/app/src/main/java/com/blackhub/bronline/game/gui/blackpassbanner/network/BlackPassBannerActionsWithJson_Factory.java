package com.blackhub.bronline.game.gui.blackpassbanner.network;

import com.blackhub.bronline.game.GUIManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes.dex */
public final class BlackPassBannerActionsWithJson_Factory implements Factory<BlackPassBannerActionsWithJson> {
    public final Provider<GUIManager> guiManagerProvider;

    public BlackPassBannerActionsWithJson_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public BlackPassBannerActionsWithJson get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static BlackPassBannerActionsWithJson_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new BlackPassBannerActionsWithJson_Factory(guiManagerProvider);
    }

    public static BlackPassBannerActionsWithJson newInstance(GUIManager guiManager) {
        return new BlackPassBannerActionsWithJson(guiManager);
    }
}
