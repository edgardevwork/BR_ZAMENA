package com.blackhub.bronline.game.model.remote.response.gifts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftLegendaryDto.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/gifts/GiftLegendaryDto;", "", "description", "", "descriptionStore", "(Ljava/lang/String;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDescriptionStore", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
