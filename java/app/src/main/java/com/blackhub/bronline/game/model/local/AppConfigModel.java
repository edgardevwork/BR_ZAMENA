package com.blackhub.bronline.game.model.local;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppConfigModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class AppConfigModel {
    public static final int $stable = 0;

    @NotNull
    public final String baseUrlCdn;

    public AppConfigModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AppConfigModel copy$default(AppConfigModel appConfigModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appConfigModel.baseUrlCdn;
        }
        return appConfigModel.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBaseUrlCdn() {
        return this.baseUrlCdn;
    }

    @NotNull
    public final AppConfigModel copy(@NotNull String baseUrlCdn) {
        Intrinsics.checkNotNullParameter(baseUrlCdn, "baseUrlCdn");
        return new AppConfigModel(baseUrlCdn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppConfigModel) && Intrinsics.areEqual(this.baseUrlCdn, ((AppConfigModel) other).baseUrlCdn);
    }

    public int hashCode() {
        return this.baseUrlCdn.hashCode();
    }

    @NotNull
    public String toString() {
        return "AppConfigModel(baseUrlCdn=" + this.baseUrlCdn + ")";
    }

    public AppConfigModel(@NotNull String baseUrlCdn) {
        Intrinsics.checkNotNullParameter(baseUrlCdn, "baseUrlCdn");
        this.baseUrlCdn = baseUrlCdn;
    }

    public /* synthetic */ AppConfigModel(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "https://dl.blackcdn.me/" : str);
    }

    @NotNull
    public final String getBaseUrlCdn() {
        return this.baseUrlCdn;
    }
}

