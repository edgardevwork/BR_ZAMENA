package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyUpgradeValueData.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class FamilyUpgradeValueData {
    public static final int $stable = 0;

    @NotNull
    public final String description;
    public final int value;

    public static /* synthetic */ FamilyUpgradeValueData copy$default(FamilyUpgradeValueData familyUpgradeValueData, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = familyUpgradeValueData.description;
        }
        if ((i2 & 2) != 0) {
            i = familyUpgradeValueData.value;
        }
        return familyUpgradeValueData.copy(str, i);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @NotNull
    public final FamilyUpgradeValueData copy(@NotNull String description, int value) {
        Intrinsics.checkNotNullParameter(description, "description");
        return new FamilyUpgradeValueData(description, value);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyUpgradeValueData)) {
            return false;
        }
        FamilyUpgradeValueData familyUpgradeValueData = (FamilyUpgradeValueData) other;
        return Intrinsics.areEqual(this.description, familyUpgradeValueData.description) && this.value == familyUpgradeValueData.value;
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + Integer.hashCode(this.value);
    }

    @NotNull
    public String toString() {
        return "FamilyUpgradeValueData(description=" + this.description + ", value=" + this.value + ")";
    }

    public FamilyUpgradeValueData(@NotNull String description, int i) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.description = description;
        this.value = i;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int getValue() {
        return this.value;
    }
}

