package com.blackhub.bronline.game.core.preferences;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PreferencesRepositoryImpl.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/preferences/PreferencesRepositoryImpl;", "Lcom/blackhub/bronline/game/core/preferences/PreferencesRepository;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getFloat", "", "key", "", "getInteger", "", "defValue", "getString", "putFloat", "", "currentSettingKey", "newParameter", "putInteger", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
