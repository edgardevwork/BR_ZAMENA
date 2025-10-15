package com.blackhub.bronline.game.gui.upgradeobjectevent;

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
public final class UpgradeObjectEventActionWithJSON_Factory implements Factory<UpgradeObjectEventActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public UpgradeObjectEventActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public UpgradeObjectEventActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static UpgradeObjectEventActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new UpgradeObjectEventActionWithJSON_Factory(guiManagerProvider);
    }

    public static UpgradeObjectEventActionWithJSON newInstance(GUIManager guiManager) {
        return new UpgradeObjectEventActionWithJSON(guiManager);
    }
}
