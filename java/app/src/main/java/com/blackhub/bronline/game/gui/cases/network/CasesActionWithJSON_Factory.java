package com.blackhub.bronline.game.gui.cases.network;

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
public final class CasesActionWithJSON_Factory implements Factory<CasesActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public CasesActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public CasesActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static CasesActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new CasesActionWithJSON_Factory(guiManagerProvider);
    }

    public static CasesActionWithJSON newInstance(GUIManager guiManager) {
        return new CasesActionWithJSON(guiManager);
    }
}
