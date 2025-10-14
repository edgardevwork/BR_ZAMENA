package com.blackhub.bronline.game.gui.brsimbanner;

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
public final class BrSimBannerActionsWithJson_Factory implements Factory<BrSimBannerActionsWithJson> {
    public final Provider<GUIManager> guiManagerProvider;

    public BrSimBannerActionsWithJson_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public BrSimBannerActionsWithJson get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static BrSimBannerActionsWithJson_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new BrSimBannerActionsWithJson_Factory(guiManagerProvider);
    }

    public static BrSimBannerActionsWithJson newInstance(GUIManager guiManager) {
        return new BrSimBannerActionsWithJson(guiManager);
    }
}
