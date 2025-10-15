package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionSystemQuestObj.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\n2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006!"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionSystemQuestsObj;", "", "id", "", "title", "", "description", "moneyReward", "scoreReward", "isClicked", "", "(ILjava/lang/String;Ljava/lang/String;IIZ)V", "getDescription", "()Ljava/lang/String;", "getId", "()I", "()Z", "setClicked", "(Z)V", "getMoneyReward", "getScoreReward", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FractionSystemQuestsObj {
    public static final int $stable = 8;

    @SerializedName("task_description")
    @NotNull
    public final String description;

    @SerializedName(Const.FRACTION_TASK_ID)
    public final int id;
    public boolean isClicked;

    @SerializedName("task_money")
    public final int moneyReward;

    @SerializedName("task_points")
    public final int scoreReward;

    @SerializedName("task_title")
    @NotNull
    public final String title;

    public static /* synthetic */ FractionSystemQuestsObj copy$default(FractionSystemQuestsObj fractionSystemQuestsObj, int i, String str, String str2, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = fractionSystemQuestsObj.id;
        }
        if ((i4 & 2) != 0) {
            str = fractionSystemQuestsObj.title;
        }
        String str3 = str;
        if ((i4 & 4) != 0) {
            str2 = fractionSystemQuestsObj.description;
        }
        String str4 = str2;
        if ((i4 & 8) != 0) {
            i2 = fractionSystemQuestsObj.moneyReward;
        }
        int i5 = i2;
        if ((i4 & 16) != 0) {
            i3 = fractionSystemQuestsObj.scoreReward;
        }
        int i6 = i3;
        if ((i4 & 32) != 0) {
            z = fractionSystemQuestsObj.isClicked;
        }
        return fractionSystemQuestsObj.copy(i, str3, str4, i5, i6, z);
    }

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
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMoneyReward() {
        return this.moneyReward;
    }

    /* renamed from: component5, reason: from getter */
    public final int getScoreReward() {
        return this.scoreReward;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final FractionSystemQuestsObj copy(int id, @NotNull String title, @NotNull String description, int moneyReward, int scoreReward, boolean isClicked) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        return new FractionSystemQuestsObj(id, title, description, moneyReward, scoreReward, isClicked);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FractionSystemQuestsObj)) {
            return false;
        }
        FractionSystemQuestsObj fractionSystemQuestsObj = (FractionSystemQuestsObj) other;
        return this.id == fractionSystemQuestsObj.id && Intrinsics.areEqual(this.title, fractionSystemQuestsObj.title) && Intrinsics.areEqual(this.description, fractionSystemQuestsObj.description) && this.moneyReward == fractionSystemQuestsObj.moneyReward && this.scoreReward == fractionSystemQuestsObj.scoreReward && this.isClicked == fractionSystemQuestsObj.isClicked;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + Integer.hashCode(this.moneyReward)) * 31) + Integer.hashCode(this.scoreReward)) * 31) + Boolean.hashCode(this.isClicked);
    }

    @NotNull
    public String toString() {
        return "FractionSystemQuestsObj(id=" + this.id + ", title=" + this.title + ", description=" + this.description + ", moneyReward=" + this.moneyReward + ", scoreReward=" + this.scoreReward + ", isClicked=" + this.isClicked + ")";
    }

    public FractionSystemQuestsObj(int i, @NotNull String title, @NotNull String description, int i2, int i3, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = i;
        this.title = title;
        this.description = description;
        this.moneyReward = i2;
        this.scoreReward = i3;
        this.isClicked = z;
    }

    public /* synthetic */ FractionSystemQuestsObj(int i, String str, String str2, int i2, int i3, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, str2, i2, i3, (i4 & 32) != 0 ? false : z);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
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

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }
}
