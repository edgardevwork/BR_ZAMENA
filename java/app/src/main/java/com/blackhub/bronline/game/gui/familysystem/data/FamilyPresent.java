package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyPresent.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class FamilyPresent {
    public static final int $stable = 0;

    @NotNull
    public final String thisPresentsName;

    @NotNull
    public final String thisPresentsValue;

    public static /* synthetic */ FamilyPresent copy$default(FamilyPresent familyPresent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = familyPresent.thisPresentsName;
        }
        if ((i & 2) != 0) {
            str2 = familyPresent.thisPresentsValue;
        }
        return familyPresent.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getThisPresentsName() {
        return this.thisPresentsName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getThisPresentsValue() {
        return this.thisPresentsValue;
    }

    @NotNull
    public final FamilyPresent copy(@NotNull String thisPresentsName, @NotNull String thisPresentsValue) {
        Intrinsics.checkNotNullParameter(thisPresentsName, "thisPresentsName");
        Intrinsics.checkNotNullParameter(thisPresentsValue, "thisPresentsValue");
        return new FamilyPresent(thisPresentsName, thisPresentsValue);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyPresent)) {
            return false;
        }
        FamilyPresent familyPresent = (FamilyPresent) other;
        return Intrinsics.areEqual(this.thisPresentsName, familyPresent.thisPresentsName) && Intrinsics.areEqual(this.thisPresentsValue, familyPresent.thisPresentsValue);
    }

    public int hashCode() {
        return (this.thisPresentsName.hashCode() * 31) + this.thisPresentsValue.hashCode();
    }

    @NotNull
    public String toString() {
        return "FamilyPresent(thisPresentsName=" + this.thisPresentsName + ", thisPresentsValue=" + this.thisPresentsValue + ")";
    }

    public FamilyPresent(@NotNull String thisPresentsName, @NotNull String thisPresentsValue) {
        Intrinsics.checkNotNullParameter(thisPresentsName, "thisPresentsName");
        Intrinsics.checkNotNullParameter(thisPresentsValue, "thisPresentsValue");
        this.thisPresentsName = thisPresentsName;
        this.thisPresentsValue = thisPresentsValue;
    }

    @NotNull
    public final String getThisPresentsName() {
        return this.thisPresentsName;
    }

    @NotNull
    public final String getThisPresentsValue() {
        return this.thisPresentsValue;
    }
}

