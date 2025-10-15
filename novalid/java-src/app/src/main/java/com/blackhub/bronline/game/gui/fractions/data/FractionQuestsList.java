package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionQuestObj.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsList;", "", "fractionID", "", "taskList", "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsItem;", "(ILjava/util/List;)V", "getFractionID", "()I", "getTaskList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FractionQuestsList {
    public static final int $stable = 8;

    @SerializedName("fractionID")
    public final int fractionID;

    @SerializedName("taskList")
    @NotNull
    public final List<FractionQuestsItem> taskList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionQuestsList copy$default(FractionQuestsList fractionQuestsList, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fractionQuestsList.fractionID;
        }
        if ((i2 & 2) != 0) {
            list = fractionQuestsList.taskList;
        }
        return fractionQuestsList.copy(i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFractionID() {
        return this.fractionID;
    }

    @NotNull
    public final List<FractionQuestsItem> component2() {
        return this.taskList;
    }

    @NotNull
    public final FractionQuestsList copy(int fractionID, @NotNull List<FractionQuestsItem> taskList) {
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        return new FractionQuestsList(fractionID, taskList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionQuestsList)) {
            return false;
        }
        FractionQuestsList fractionQuestsList = (FractionQuestsList) other;
        return this.fractionID == fractionQuestsList.fractionID && Intrinsics.areEqual(this.taskList, fractionQuestsList.taskList);
    }

    public int hashCode() {
        return (Integer.hashCode(this.fractionID) * 31) + this.taskList.hashCode();
    }

    @NotNull
    public String toString() {
        return "FractionQuestsList(fractionID=" + this.fractionID + ", taskList=" + this.taskList + ")";
    }

    public FractionQuestsList(int i, @NotNull List<FractionQuestsItem> taskList) {
        Intrinsics.checkNotNullParameter(taskList, "taskList");
        this.fractionID = i;
        this.taskList = taskList;
    }

    public final int getFractionID() {
        return this.fractionID;
    }

    @NotNull
    public final List<FractionQuestsItem> getTaskList() {
        return this.taskList;
    }
}
