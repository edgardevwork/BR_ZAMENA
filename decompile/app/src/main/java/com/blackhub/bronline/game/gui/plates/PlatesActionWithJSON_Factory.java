package com.blackhub.bronline.game.gui.plates;

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
public final class PlatesActionWithJSON_Factory implements Factory<PlatesActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public PlatesActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public PlatesActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static PlatesActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new PlatesActionWithJSON_Factory(guiManagerProvider);
    }

    public static PlatesActionWithJSON newInstance(GUIManager guiManager) {
        return new PlatesActionWithJSON(guiManager);
    }
}
