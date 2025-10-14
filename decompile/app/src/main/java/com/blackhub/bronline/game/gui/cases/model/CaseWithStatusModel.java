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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/CaseWithStatusModel;", "", "idCase", "", "valueOfCases", "isUsedSale", "(III)V", "getIdCase", "()I", "getValueOfCases", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
