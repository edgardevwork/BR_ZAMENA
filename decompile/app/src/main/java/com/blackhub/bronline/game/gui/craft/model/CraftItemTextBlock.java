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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0019J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003JE\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010!\u001a\u00020\u00192\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010¨\u0006%"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/CraftItemTextBlock;", "", "name", "", "timeOfPreparation", "chanceOfSuccess", "", "chanceOfSuccessIsWithVIP", "weight", "", "description", "(Ljava/lang/String;Ljava/lang/String;IIFLjava/lang/String;)V", "getChanceOfSuccess", "()I", "getChanceOfSuccessIsWithVIP", "getDescription", "()Ljava/lang/String;", "getName", "getTimeOfPreparation", "getWeight", "()F", "weightStrValue", "getWeightStrValue", "chanceOfCraft", "isWithVIP", "", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
