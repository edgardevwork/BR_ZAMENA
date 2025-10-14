package com.blackhub.bronline.game.core;

import android.os.Environment;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.BooleanExtensionKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppLocalValues.kt */
@StabilityInferred(parameters = 0)

public final class AppLocalValues {

    @Nullable
    public HashMap<String, String> mAppLocalValues = new HashMap<>();

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @JvmField
    @NotNull
    public static final AppLocalValues instance = new AppLocalValues();

    @JvmStatic
    @Nullable
    public static final AppLocalValues getInstance() {
        return INSTANCE.getInstance();
    }

    public AppLocalValues() {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        setAppLocalValue("STORAGE_ROOT", absolutePath);
    }

    public final boolean hasAppLocalValue(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, String> map = this.mAppLocalValues;
        return BooleanExtensionKt.getOrFalse(map != null ? Boolean.valueOf(map.containsKey(key)) : null);
    }

    @Nullable
    public final String getAppLocalValue(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        HashMap<String, String> map = this.mAppLocalValues;
        if (map != null) {
            return map.get(key);
        }
        return null;
    }

    public final void setAppLocalValue(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        HashMap<String, String> map = this.mAppLocalValues;
        if (map != null) {
            map.put(key, value);
        }
    }

    /* compiled from: AppLocalValues.kt */
    @Metadata(m7104d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/AppLocalValues$Companion;", "", "()V", "instance", "Lcom/blackhub/bronline/game/core/AppLocalValues;", "getInstance", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @JvmStatic
        @Nullable
        public final AppLocalValues getInstance() {
            return AppLocalValues.instance;
        }
    }
}

