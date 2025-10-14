package com.blackhub.bronline.game.gui.craft.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftItemTextBlock.kt */
@StabilityInferred(parameters = 1)

public final /* data */ class CraftItemTextBlock {
    public static final int $stable = 0;
    public final int chanceOfSuccess;
    public final int chanceOfSuccessIsWithVIP;

    @NotNull
    public final String description;

    @NotNull
    public final String name;

    @NotNull
    public final String timeOfPreparation;
    public final float weight;

    public CraftItemTextBlock() {
        this(null, null, 0, 0, 0.0f, null, 63, null);
    }

    public static /* synthetic */ CraftItemTextBlock copy$default(CraftItemTextBlock craftItemTextBlock, String str, String str2, int i, int i2, float f, String str3, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = craftItemTextBlock.name;
        }
        if ((i3 & 2) != 0) {
            str2 = craftItemTextBlock.timeOfPreparation;
        }
        String str4 = str2;
        if ((i3 & 4) != 0) {
            i = craftItemTextBlock.chanceOfSuccess;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = craftItemTextBlock.chanceOfSuccessIsWithVIP;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            f = craftItemTextBlock.weight;
        }
        float f2 = f;
        if ((i3 & 32) != 0) {
            str3 = craftItemTextBlock.description;
        }
        return craftItemTextBlock.copy(str, str4, i4, i5, f2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTimeOfPreparation() {
        return this.timeOfPreparation;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChanceOfSuccess() {
        return this.chanceOfSuccess;
    }

    /* renamed from: component4, reason: from getter */
    public final int getChanceOfSuccessIsWithVIP() {
        return this.chanceOfSuccessIsWithVIP;
    }

    /* renamed from: component5, reason: from getter */
    public final float getWeight() {
        return this.weight;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final CraftItemTextBlock copy(@NotNull String name, @NotNull String timeOfPreparation, int chanceOfSuccess, int chanceOfSuccessIsWithVIP, float weight, @NotNull String description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(timeOfPreparation, "timeOfPreparation");
        Intrinsics.checkNotNullParameter(description, "description");
        return new CraftItemTextBlock(name, timeOfPreparation, chanceOfSuccess, chanceOfSuccessIsWithVIP, weight, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CraftItemTextBlock)) {
            return false;
        }
        CraftItemTextBlock craftItemTextBlock = (CraftItemTextBlock) other;
        return Intrinsics.areEqual(this.name, craftItemTextBlock.name) && Intrinsics.areEqual(this.timeOfPreparation, craftItemTextBlock.timeOfPreparation) && this.chanceOfSuccess == craftItemTextBlock.chanceOfSuccess && this.chanceOfSuccessIsWithVIP == craftItemTextBlock.chanceOfSuccessIsWithVIP && Float.compare(this.weight, craftItemTextBlock.weight) == 0 && Intrinsics.areEqual(this.description, craftItemTextBlock.description);
    }

    public int hashCode() {
        return (((((((((this.name.hashCode() * 31) + this.timeOfPreparation.hashCode()) * 31) + Integer.hashCode(this.chanceOfSuccess)) * 31) + Integer.hashCode(this.chanceOfSuccessIsWithVIP)) * 31) + Float.hashCode(this.weight)) * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "CraftItemTextBlock(name=" + this.name + ", timeOfPreparation=" + this.timeOfPreparation + ", chanceOfSuccess=" + this.chanceOfSuccess + ", chanceOfSuccessIsWithVIP=" + this.chanceOfSuccessIsWithVIP + ", weight=" + this.weight + ", description=" + this.description + ")";
    }

    public CraftItemTextBlock(@NotNull String name, @NotNull String timeOfPreparation, int i, int i2, float f, @NotNull String description) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(timeOfPreparation, "timeOfPreparation");
        Intrinsics.checkNotNullParameter(description, "description");
        this.name = name;
        this.timeOfPreparation = timeOfPreparation;
        this.chanceOfSuccess = i;
        this.chanceOfSuccessIsWithVIP = i2;
        this.weight = f;
        this.description = description;
    }

    public /* synthetic */ CraftItemTextBlock(String str, String str2, int i, int i2, float f, String str3, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) == 0 ? i2 : 0, (i3 & 16) != 0 ? 0.0f : f, (i3 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getTimeOfPreparation() {
        return this.timeOfPreparation;
    }

    public final int getChanceOfSuccess() {
        return this.chanceOfSuccess;
    }

    public final int getChanceOfSuccessIsWithVIP() {
        return this.chanceOfSuccessIsWithVIP;
    }

    public final float getWeight() {
        return this.weight;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final int chanceOfCraft(boolean isWithVIP) {
        return isWithVIP ? this.chanceOfSuccessIsWithVIP : this.chanceOfSuccess;
    }

    @NotNull
    public final String getWeightStrValue() {
        float f = this.weight;
        return f % ((float) 1) == 0.0f ? String.valueOf((int) f) : String.valueOf(f);
    }
}

