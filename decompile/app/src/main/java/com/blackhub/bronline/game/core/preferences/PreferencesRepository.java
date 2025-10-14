package com.blackhub.bronline.game.core.preferences;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: PreferencesRepository.kt */
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H&J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "", "getFloat", "", "key", "", "getInteger", "", "defValue", "getString", "putFloat", "", "currentSettingKey", "newParameter", "putInteger", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
