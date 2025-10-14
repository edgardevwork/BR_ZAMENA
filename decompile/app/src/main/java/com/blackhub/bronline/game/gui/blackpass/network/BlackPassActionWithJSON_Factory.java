package com.blackhub.bronline.game.gui.blackpass.network;

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
public final class BlackPassActionWithJSON_Factory implements Factory<BlackPassActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public BlackPassActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public BlackPassActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static BlackPassActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new BlackPassActionWithJSON_Factory(guiManagerProvider);
    }

    public static BlackPassActionWithJSON newInstance(GUIManager guiManager) {
        return new BlackPassActionWithJSON(guiManager);
    }
}
