package com.blackhub.bronline.game.model.local;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppConfigModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/local/AppConfigModel;", "", "baseUrlCdn", "", "(Ljava/lang/String;)V", "getBaseUrlCdn", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
