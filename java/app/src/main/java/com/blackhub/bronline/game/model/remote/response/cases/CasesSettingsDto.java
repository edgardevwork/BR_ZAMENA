package com.blackhub.bronline.game.model.remote.response.cases;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesSettingsDto.kt */
@StabilityInferred(parameters = 1)
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

