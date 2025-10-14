package com.blackhub.bronline.game.model.remote.response.gifts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftNormalDto.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class GiftNormalDto {
    public static final int $stable = 0;

    @SerializedName("description")
    @NotNull
    public final String description;

    @SerializedName("description_store")
    @NotNull
    public final String descriptionStore;

    public static /* synthetic */ GiftNormalDto copy$default(GiftNormalDto giftNormalDto, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftNormalDto.description;
        }
        if ((i & 2) != 0) {
            str2 = giftNormalDto.descriptionStore;
        }
        return giftNormalDto.copy(str, str2);
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
    public final GiftNormalDto copy(@NotNull String description, @NotNull String descriptionStore) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(descriptionStore, "descriptionStore");
        return new GiftNormalDto(description, descriptionStore);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftNormalDto)) {
            return false;
        }
        GiftNormalDto giftNormalDto = (GiftNormalDto) other;
        return Intrinsics.areEqual(this.description, giftNormalDto.description) && Intrinsics.areEqual(this.descriptionStore, giftNormalDto.descriptionStore);
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + this.descriptionStore.hashCode();
    }

    @NotNull
    public String toString() {
        return "GiftNormalDto(description=" + this.description + ", descriptionStore=" + this.descriptionStore + ")";
    }

    public GiftNormalDto(@NotNull String description, @NotNull String descriptionStore) {
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

