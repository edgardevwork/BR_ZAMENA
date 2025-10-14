package com.blackhub.bronline.game.gui.panelinfo;

import com.blackhub.bronline.game.GUIManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes3.dex */
public final class PanelInfoActionWithJSON_Factory implements Factory<PanelInfoActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public PanelInfoActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public PanelInfoActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static PanelInfoActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new PanelInfoActionWithJSON_Factory(guiManagerProvider);
    }

    public static PanelInfoActionWithJSON newInstance(GUIManager guiManager) {
        return new PanelInfoActionWithJSON(guiManager);
    }
}
