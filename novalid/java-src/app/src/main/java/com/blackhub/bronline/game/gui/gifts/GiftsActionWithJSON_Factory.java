package com.blackhub.bronline.game.gui.gifts;

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
public final class GiftsActionWithJSON_Factory implements Factory<GiftsActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public GiftsActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public GiftsActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static GiftsActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new GiftsActionWithJSON_Factory(guiManagerProvider);
    }

    public static GiftsActionWithJSON newInstance(GUIManager guiManager) {
        return new GiftsActionWithJSON(guiManager);
    }
}
