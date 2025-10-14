package com.blackhub.bronline.game.model.remote.response.cases;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesResponse.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/cases/CasesResponse;", "", "casesSettings", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesSettingsDto;", "banner", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesBannerDto;", "cases", "", "Lcom/blackhub/bronline/game/model/remote/response/cases/CasesCaseTypeDto;", "(Lcom/blackhub/bronline/game/model/remote/response/cases/CasesSettingsDto;Lcom/blackhub/bronline/game/model/remote/response/cases/CasesBannerDto;Ljava/util/List;)V", "getBanner", "()Lcom/blackhub/bronline/game/model/remote/response/cases/CasesBannerDto;", "getCases", "()Ljava/util/List;", "getCasesSettings", "()Lcom/blackhub/bronline/game/model/remote/response/cases/CasesSettingsDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CasesResponse {
    public static final int $stable = 8;

    @SerializedName("banner")
    @NotNull
    public final CasesBannerDto banner;

    @SerializedName("cases")
    @NotNull
    public final List<CasesCaseTypeDto> cases;

    @SerializedName("settings")
    @NotNull
    public final CasesSettingsDto casesSettings;

    public CasesResponse() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CasesResponse copy$default(CasesResponse casesResponse, CasesSettingsDto casesSettingsDto, CasesBannerDto casesBannerDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            casesSettingsDto = casesResponse.casesSettings;
        }
        if ((i & 2) != 0) {
            casesBannerDto = casesResponse.banner;
        }
        if ((i & 4) != 0) {
            list = casesResponse.cases;
        }
        return casesResponse.copy(casesSettingsDto, casesBannerDto, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CasesSettingsDto getCasesSettings() {
        return this.casesSettings;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CasesBannerDto getBanner() {
        return this.banner;
    }

    @NotNull
    public final List<CasesCaseTypeDto> component3() {
        return this.cases;
    }

    @NotNull
    public final CasesResponse copy(@NotNull CasesSettingsDto casesSettings, @NotNull CasesBannerDto banner, @NotNull List<CasesCaseTypeDto> cases) {
        Intrinsics.checkNotNullParameter(casesSettings, "casesSettings");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(cases, "cases");
        return new CasesResponse(casesSettings, banner, cases);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesResponse)) {
            return false;
        }
        CasesResponse casesResponse = (CasesResponse) other;
        return Intrinsics.areEqual(this.casesSettings, casesResponse.casesSettings) && Intrinsics.areEqual(this.banner, casesResponse.banner) && Intrinsics.areEqual(this.cases, casesResponse.cases);
    }

    public int hashCode() {
        return (((this.casesSettings.hashCode() * 31) + this.banner.hashCode()) * 31) + this.cases.hashCode();
    }

    @NotNull
    public String toString() {
        return "CasesResponse(casesSettings=" + this.casesSettings + ", banner=" + this.banner + ", cases=" + this.cases + ")";
    }

    public CasesResponse(@NotNull CasesSettingsDto casesSettings, @NotNull CasesBannerDto banner, @NotNull List<CasesCaseTypeDto> cases) {
        Intrinsics.checkNotNullParameter(casesSettings, "casesSettings");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(cases, "cases");
        this.casesSettings = casesSettings;
        this.banner = banner;
        this.cases = cases;
    }

    public /* synthetic */ CasesResponse(CasesSettingsDto casesSettingsDto, CasesBannerDto casesBannerDto, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new CasesSettingsDto(0, 0, 0, 7, null) : casesSettingsDto, (i & 2) != 0 ? new CasesBannerDto(0, 0, null, null, null, null, null, 127, null) : casesBannerDto, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final CasesSettingsDto getCasesSettings() {
        return this.casesSettings;
    }

    @NotNull
    public final CasesBannerDto getBanner() {
        return this.banner;
    }

    @NotNull
    public final List<CasesCaseTypeDto> getCases() {
        return this.cases;
    }
}
