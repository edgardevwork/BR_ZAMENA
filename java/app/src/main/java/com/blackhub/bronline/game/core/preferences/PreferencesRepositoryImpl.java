package com.blackhub.bronline.game.core.preferences;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PreferencesRepositoryImpl.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class PreferencesRepositoryImpl implements PreferencesRepository {
    public static final int $stable = 8;

    @NotNull
    public final Context context;

    public PreferencesRepositoryImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // com.blackhub.bronline.game.core.preferences.PreferencesRepository
    public void putInteger(@NotNull String currentSettingKey, int newParameter) {
        Intrinsics.checkNotNullParameter(currentSettingKey, "currentSettingKey");
        Preferences.putInteger(this.context, currentSettingKey, newParameter);
    }

    @Override // com.blackhub.bronline.game.core.preferences.PreferencesRepository
    public void putFloat(@NotNull String currentSettingKey, float newParameter) {
        Intrinsics.checkNotNullParameter(currentSettingKey, "currentSettingKey");
        Preferences.putFloat(this.context, currentSettingKey, newParameter);
    }

    @Override // com.blackhub.bronline.game.core.preferences.PreferencesRepository
    public int getInteger(@NotNull String key, int defValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Preferences.getInteger(this.context, key, defValue);
    }

    @Override // com.blackhub.bronline.game.core.preferences.PreferencesRepository
    public float getFloat(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return Preferences.getFloat(this.context, key);
    }

    @Override // com.blackhub.bronline.game.core.preferences.PreferencesRepository
    @NotNull
    public String getString(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String string = Preferences.getString(this.context, key);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}

