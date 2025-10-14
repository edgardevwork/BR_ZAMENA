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

