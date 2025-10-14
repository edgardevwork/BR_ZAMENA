package com.blackhub.bronline.game.gui.tuning.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TuningDetailDiagnosticItemObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class TuningDetailDiagnosticItemObj {
    public static final int $stable = 8;
    public int cost;
    public int id;
    public boolean isChecked;

    @NotNull
    public String nameDetail;

    @NotNull
    public String resName;
    public int valueState;

    public static /* synthetic */ TuningDetailDiagnosticItemObj copy$default(TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj, int i, String str, String str2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = tuningDetailDiagnosticItemObj.id;
        }
        if ((i4 & 2) != 0) {
            str = tuningDetailDiagnosticItemObj.nameDetail;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            str2 = tuningDetailDiagnosticItemObj.resName;
        }
        String str4 = str2;
        if ((i4 & 8) != 0) {
            i2 = tuningDetailDiagnosticItemObj.cost;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = tuningDetailDiagnosticItemObj.valueState;
        }
        return tuningDetailDiagnosticItemObj.copy(i, str3, str4, i5, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getNameDetail() {
        return this.nameDetail;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getResName() {
        return this.resName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCost() {
        return this.cost;
    }

    /* renamed from: component5, reason: from getter */
    public final int getValueState() {
        return this.valueState;
    }

    @NotNull
    public final TuningDetailDiagnosticItemObj copy(int id, @NotNull String nameDetail, @NotNull String resName, int cost, int valueState) {
        Intrinsics.checkNotNullParameter(nameDetail, "nameDetail");
        Intrinsics.checkNotNullParameter(resName, "resName");
        return new TuningDetailDiagnosticItemObj(id, nameDetail, resName, cost, valueState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TuningDetailDiagnosticItemObj)) {
            return false;
        }
        TuningDetailDiagnosticItemObj tuningDetailDiagnosticItemObj = (TuningDetailDiagnosticItemObj) other;
        return this.id == tuningDetailDiagnosticItemObj.id && Intrinsics.areEqual(this.nameDetail, tuningDetailDiagnosticItemObj.nameDetail) && Intrinsics.areEqual(this.resName, tuningDetailDiagnosticItemObj.resName) && this.cost == tuningDetailDiagnosticItemObj.cost && this.valueState == tuningDetailDiagnosticItemObj.valueState;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.nameDetail.hashCode()) * 31) + this.resName.hashCode()) * 31) + Integer.hashCode(this.cost)) * 31) + Integer.hashCode(this.valueState);
    }

    @NotNull
    public String toString() {
        return "TuningDetailDiagnosticItemObj(id=" + this.id + ", nameDetail=" + this.nameDetail + ", resName=" + this.resName + ", cost=" + this.cost + ", valueState=" + this.valueState + ")";
    }

    public TuningDetailDiagnosticItemObj(int i, @NotNull String nameDetail, @NotNull String resName, int i2, int i3) {
        Intrinsics.checkNotNullParameter(nameDetail, "nameDetail");
        Intrinsics.checkNotNullParameter(resName, "resName");
        this.id = i;
        this.nameDetail = nameDetail;
        this.resName = resName;
        this.cost = i2;
        this.valueState = i3;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    @NotNull
    public final String getNameDetail() {
        return this.nameDetail;
    }

    public final void setNameDetail(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.nameDetail = str;
    }

    @NotNull
    public final String getResName() {
        return this.resName;
    }

    public final void setResName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.resName = str;
    }

    public final int getCost() {
        return this.cost;
    }

    public final void setCost(int i) {
        this.cost = i;
    }

    public final int getValueState() {
        return this.valueState;
    }

    public final void setValueState(int i) {
        this.valueState = i;
    }

    /* renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final void setChecked(boolean z) {
        this.isChecked = z;
    }
}

