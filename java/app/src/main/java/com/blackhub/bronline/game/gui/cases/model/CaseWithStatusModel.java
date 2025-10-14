package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.donate.utils.DonateAllKeys;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseWithStatusModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class CaseWithStatusModel {
    public static final int $stable = 0;

    @SerializedName("id")
    public final int idCase;

    @SerializedName(DonateAllKeys.IS_NEED_SHOW_DONATE_PACKAGE_DU)
    public final int isUsedSale;

    @SerializedName("cot")
    public final int valueOfCases;

    public CaseWithStatusModel() {
        this(0, 0, 0, 7, null);
    }

    public static /* synthetic */ CaseWithStatusModel copy$default(CaseWithStatusModel caseWithStatusModel, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = caseWithStatusModel.idCase;
        }
        if ((i4 & 2) != 0) {
            i2 = caseWithStatusModel.valueOfCases;
        }
        if ((i4 & 4) != 0) {
            i3 = caseWithStatusModel.isUsedSale;
        }
        return caseWithStatusModel.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIdCase() {
        return this.idCase;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValueOfCases() {
        return this.valueOfCases;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIsUsedSale() {
        return this.isUsedSale;
    }

    @NotNull
    public final CaseWithStatusModel copy(int idCase, int valueOfCases, int isUsedSale) {
        return new CaseWithStatusModel(idCase, valueOfCases, isUsedSale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaseWithStatusModel)) {
            return false;
        }
        CaseWithStatusModel caseWithStatusModel = (CaseWithStatusModel) other;
        return this.idCase == caseWithStatusModel.idCase && this.valueOfCases == caseWithStatusModel.valueOfCases && this.isUsedSale == caseWithStatusModel.isUsedSale;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.idCase) * 31) + Integer.hashCode(this.valueOfCases)) * 31) + Integer.hashCode(this.isUsedSale);
    }

    @NotNull
    public String toString() {
        return "CaseWithStatusModel(idCase=" + this.idCase + ", valueOfCases=" + this.valueOfCases + ", isUsedSale=" + this.isUsedSale + ")";
    }

    public CaseWithStatusModel(int i, int i2, int i3) {
        this.idCase = i;
        this.valueOfCases = i2;
        this.isUsedSale = i3;
    }

    public /* synthetic */ CaseWithStatusModel(int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? -1 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
    }

    public final int getIdCase() {
        return this.idCase;
    }

    public final int getValueOfCases() {
        return this.valueOfCases;
    }

    public final int isUsedSale() {
        return this.isUsedSale;
    }
}

