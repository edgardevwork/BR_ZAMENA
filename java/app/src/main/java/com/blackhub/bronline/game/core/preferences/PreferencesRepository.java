package com.blackhub.bronline.game.core.preferences;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PreferencesRepository.kt */

public interface PreferencesRepository {
    float getFloat(@NotNull String key);

    int getInteger(@NotNull String key, int defValue);

    @NotNull
    String getString(@NotNull String key);

    void putFloat(@NotNull String currentSettingKey, float newParameter);

    void putInteger(@NotNull String currentSettingKey, int newParameter);

    static /* synthetic */ int getInteger$default(PreferencesRepository preferencesRepository, String str, int i, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInteger");
        }
        if ((i2 & 2) != 0) {
            i = -1;
        }
        return preferencesRepository.getInteger(str, i);
    }
}

