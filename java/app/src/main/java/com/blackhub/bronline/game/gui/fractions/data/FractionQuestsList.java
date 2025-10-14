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

