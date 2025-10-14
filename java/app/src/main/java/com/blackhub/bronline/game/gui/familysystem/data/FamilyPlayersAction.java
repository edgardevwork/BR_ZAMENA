package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyPlayersAction.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FamilyPlayersAction {
    public static final int $stable = 8;
    public int actionsId;

    @NotNull
    public String actionsTitle;
    public int actionsValue;
    public final int type;

    public static /* synthetic */ FamilyPlayersAction copy$default(FamilyPlayersAction familyPlayersAction, int i, String str, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = familyPlayersAction.actionsId;
        }
        if ((i4 & 2) != 0) {
            str = familyPlayersAction.actionsTitle;
        }
        if ((i4 & 4) != 0) {
            i2 = familyPlayersAction.actionsValue;
        }
        if ((i4 & 8) != 0) {
            i3 = familyPlayersAction.type;
        }
        return familyPlayersAction.copy(i, str, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getActionsId() {
        return this.actionsId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getActionsTitle() {
        return this.actionsTitle;
    }

    /* renamed from: component3, reason: from getter */
    public final int getActionsValue() {
        return this.actionsValue;
    }

    /* renamed from: component4, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final FamilyPlayersAction copy(int actionsId, @NotNull String actionsTitle, int actionsValue, int type) {
        Intrinsics.checkNotNullParameter(actionsTitle, "actionsTitle");
        return new FamilyPlayersAction(actionsId, actionsTitle, actionsValue, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyPlayersAction)) {
            return false;
        }
        FamilyPlayersAction familyPlayersAction = (FamilyPlayersAction) other;
        return this.actionsId == familyPlayersAction.actionsId && Intrinsics.areEqual(this.actionsTitle, familyPlayersAction.actionsTitle) && this.actionsValue == familyPlayersAction.actionsValue && this.type == familyPlayersAction.type;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.actionsId) * 31) + this.actionsTitle.hashCode()) * 31) + Integer.hashCode(this.actionsValue)) * 31) + Integer.hashCode(this.type);
    }

    @NotNull
    public String toString() {
        return "FamilyPlayersAction(actionsId=" + this.actionsId + ", actionsTitle=" + this.actionsTitle + ", actionsValue=" + this.actionsValue + ", type=" + this.type + ")";
    }

    public FamilyPlayersAction(int i, @NotNull String actionsTitle, int i2, int i3) {
        Intrinsics.checkNotNullParameter(actionsTitle, "actionsTitle");
        this.actionsId = i;
        this.actionsTitle = actionsTitle;
        this.actionsValue = i2;
        this.type = i3;
    }

    public final int getActionsId() {
        return this.actionsId;
    }

    public final void setActionsId(int i) {
        this.actionsId = i;
    }

    @NotNull
    public final String getActionsTitle() {
        return this.actionsTitle;
    }

    public final void setActionsTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.actionsTitle = str;
    }

    public final int getActionsValue() {
        return this.actionsValue;
    }

    public final void setActionsValue(int i) {
        this.actionsValue = i;
    }

    public final int getType() {
        return this.type;
    }
}

