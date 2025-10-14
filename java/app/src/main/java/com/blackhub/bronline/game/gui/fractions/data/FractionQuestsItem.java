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
public final /* data */ class FractionQuestsItem {
    public static final int $stable = 8;

    @SerializedName("taskDescription")
    @NotNull
    public final String description;

    @SerializedName("taskInfo")
    @NotNull
    public final String goal;

    @SerializedName("taskID")
    public final int id;
    public boolean isClicked;

    @SerializedName("taskMoney")
    public final int moneyReward;

    @SerializedName("taskPoint")
    public final int scoreReward;

    @SerializedName("taskAccess")
    @NotNull
    public final List<Integer> taskAccess;

    @SerializedName("taskTitle")
    @NotNull
    public final String title;

    @SerializedName("taskToken")
    public final int tokenReward;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getGoal() {
        return this.goal;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMoneyReward() {
        return this.moneyReward;
    }

    /* renamed from: component6, reason: from getter */
    public final int getScoreReward() {
        return this.scoreReward;
    }

    /* renamed from: component7, reason: from getter */
    public final int getTokenReward() {
        return this.tokenReward;
    }

    @NotNull
    public final List<Integer> component8() {
        return this.taskAccess;
    }

    @NotNull
    public final FractionQuestsItem copy(int id, @NotNull String title, @NotNull String goal, @NotNull String description, int moneyReward, int scoreReward, int tokenReward, @NotNull List<Integer> taskAccess) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(taskAccess, "taskAccess");
        return new FractionQuestsItem(id, title, goal, description, moneyReward, scoreReward, tokenReward, taskAccess);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionQuestsItem)) {
            return false;
        }
        FractionQuestsItem fractionQuestsItem = (FractionQuestsItem) other;
        return this.id == fractionQuestsItem.id && Intrinsics.areEqual(this.title, fractionQuestsItem.title) && Intrinsics.areEqual(this.goal, fractionQuestsItem.goal) && Intrinsics.areEqual(this.description, fractionQuestsItem.description) && this.moneyReward == fractionQuestsItem.moneyReward && this.scoreReward == fractionQuestsItem.scoreReward && this.tokenReward == fractionQuestsItem.tokenReward && Intrinsics.areEqual(this.taskAccess, fractionQuestsItem.taskAccess);
    }

    public int hashCode() {
        return (((((((((((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.goal.hashCode()) * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.moneyReward)) * 31) + Integer.hashCode(this.scoreReward)) * 31) + Integer.hashCode(this.tokenReward)) * 31) + this.taskAccess.hashCode();
    }

    @NotNull
    public String toString() {
        return "FractionQuestsItem(id=" + this.id + ", title=" + this.title + ", goal=" + this.goal + ", description=" + this.description + ", moneyReward=" + this.moneyReward + ", scoreReward=" + this.scoreReward + ", tokenReward=" + this.tokenReward + ", taskAccess=" + this.taskAccess + ")";
    }

    public FractionQuestsItem(int i, @NotNull String title, @NotNull String goal, @NotNull String description, int i2, int i3, int i4, @NotNull List<Integer> taskAccess) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(goal, "goal");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(taskAccess, "taskAccess");
        this.id = i;
        this.title = title;
        this.goal = goal;
        this.description = description;
        this.moneyReward = i2;
        this.scoreReward = i3;
        this.tokenReward = i4;
        this.taskAccess = taskAccess;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final String getGoal() {
        return this.goal;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getMoneyReward() {
        return this.moneyReward;
    }

    public final int getScoreReward() {
        return this.scoreReward;
    }

    public final int getTokenReward() {
        return this.tokenReward;
    }

    @NotNull
    public final List<Integer> getTaskAccess() {
        return this.taskAccess;
    }

    /* renamed from: isClicked, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}

