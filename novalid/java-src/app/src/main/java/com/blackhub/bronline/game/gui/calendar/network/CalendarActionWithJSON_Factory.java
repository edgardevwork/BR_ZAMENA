package com.blackhub.bronline.game.gui.calendar.network;

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
public final class CalendarActionWithJSON_Factory implements Factory<CalendarActionWithJSON> {
    public final Provider<GUIManager> guiManagerProvider;

    public CalendarActionWithJSON_Factory(Provider<GUIManager> guiManagerProvider) {
        this.guiManagerProvider = guiManagerProvider;
    }

    @Override // javax.inject.Provider
    public CalendarActionWithJSON get() {
        return newInstance(this.guiManagerProvider.get());
    }

    public static CalendarActionWithJSON_Factory create(Provider<GUIManager> guiManagerProvider) {
        return new CalendarActionWithJSON_Factory(guiManagerProvider);
    }

    public static CalendarActionWithJSON newInstance(GUIManager guiManager) {
        return new CalendarActionWithJSON(guiManager);
    }
}
