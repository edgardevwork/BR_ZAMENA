package com.blackhub.bronline.game.model.remote.response.gifts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftLegendaryDto.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class GiftLegendaryDto {
    public static final int $stable = 0;

    @SerializedName("description")
    @NotNull
    public final String description;

    @SerializedName("description_store")
    @NotNull
    public final String descriptionStore;

    public static /* synthetic */ GiftLegendaryDto copy$default(GiftLegendaryDto giftLegendaryDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftLegendaryDto.description;
        }
        if ((i & 2) != 0) {
            str2 = giftLegendaryDto.descriptionStore;
        }
        return giftLegendaryDto.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }

    @NotNull
    public final GiftLegendaryDto copy(@NotNull String description, @NotNull String descriptionStore) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionStore, "descriptionStore");
        return new GiftLegendaryDto(description, descriptionStore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftLegendaryDto)) {
            return false;
        }
        GiftLegendaryDto giftLegendaryDto = (GiftLegendaryDto) other;
        return Intrinsics.areEqual(this.description, giftLegendaryDto.description) && Intrinsics.areEqual(this.descriptionStore, giftLegendaryDto.descriptionStore);
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + this.descriptionStore.hashCode();
    }

    @NotNull
    public String toString() {
        return "GiftLegendaryDto(description=" + this.description + ", descriptionStore=" + this.descriptionStore + ")";
    }

    public GiftLegendaryDto(@NotNull String description, @NotNull String descriptionStore) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionStore, "descriptionStore");
        this.description = description;
        this.descriptionStore = descriptionStore;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }
}

