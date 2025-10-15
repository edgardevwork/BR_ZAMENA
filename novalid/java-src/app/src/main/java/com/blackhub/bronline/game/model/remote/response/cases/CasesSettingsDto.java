package com.blackhub.bronline.game.model.remote.response.cases;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesSettingsDto.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J'\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/cases/CasesSettingsDto;", "", "maxSprayedCount", "", "dailyCaseId", "legendaryCaseId", "(III)V", "getDailyCaseId", "()I", "getLegendaryCaseId", "getMaxSprayedCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CasesSettingsDto {
    public static final int $stable = 0;

    @SerializedName("dailyCaseId")
    public final int dailyCaseId;

    @SerializedName("legendaryCaseId")
    public final int legendaryCaseId;

    @SerializedName("maxSprayedCount")
    public final int maxSprayedCount;

    public CasesSettingsDto() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ CasesSettingsDto copy$default(CasesSettingsDto casesSettingsDto, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = casesSettingsDto.maxSprayedCount;
        }
        if ((i4 & 2) != 0) {
            i2 = casesSettingsDto.dailyCaseId;
        }
        if ((i4 & 4) != 0) {
            i3 = casesSettingsDto.legendaryCaseId;
        }
        return casesSettingsDto.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMaxSprayedCount() {
        return this.maxSprayedCount;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDailyCaseId() {
        return this.dailyCaseId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLegendaryCaseId() {
        return this.legendaryCaseId;
    }

    @NotNull
    public final CasesSettingsDto copy(int maxSprayedCount, int dailyCaseId, int legendaryCaseId) {
        return new CasesSettingsDto(maxSprayedCount, dailyCaseId, legendaryCaseId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesSettingsDto)) {
            return false;
        }
        CasesSettingsDto casesSettingsDto = (CasesSettingsDto) other;
        return this.maxSprayedCount == casesSettingsDto.maxSprayedCount && this.dailyCaseId == casesSettingsDto.dailyCaseId && this.legendaryCaseId == casesSettingsDto.legendaryCaseId;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.maxSprayedCount) * 31) + Integer.hashCode(this.dailyCaseId)) * 31) + Integer.hashCode(this.legendaryCaseId);
    }

    @NotNull
    public String toString() {
        return "CasesSettingsDto(maxSprayedCount=" + this.maxSprayedCount + ", dailyCaseId=" + this.dailyCaseId + ", legendaryCaseId=" + this.legendaryCaseId + ")";
    }

    public CasesSettingsDto(int i, int i2, int i3) {
        this.maxSprayedCount = i;
        this.dailyCaseId = i2;
        this.legendaryCaseId = i3;
    }

    public /* synthetic */ CasesSettingsDto(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getMaxSprayedCount() {
        return this.maxSprayedCount;
    }

    public final int getDailyCaseId() {
        return this.dailyCaseId;
    }

    public final int getLegendaryCaseId() {
        return this.legendaryCaseId;
    }
}
