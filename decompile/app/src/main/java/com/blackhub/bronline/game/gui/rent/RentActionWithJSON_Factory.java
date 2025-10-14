package com.blackhub.bronline.game.gui.rent;

import com.blackhub.bronline.game.GUIManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes2.dex */
public final class RentActionWithJSON_Factory implements Factory<RentActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public RentActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public RentActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static RentActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new RentActionWithJSON_Factory(guiManagerProvider);
    }

    public static RentActionWithJSON newInstance(GUIManager guiManager) {
        return new RentActionWithJSON(guiManager);
    }
}
