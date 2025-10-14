package com.blackhub.bronline.game.model.remote.response.skins;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SkinsDTO.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class SkinsDTO {
    public static final int $stable = 0;

    @SerializedName("description")
    @Nullable
    public final String description;

    @SerializedName("internalId")
    @Nullable
    public final Integer id;

    @SerializedName("imageName")
    @Nullable
    public final String imageName;

    @SerializedName("modelId")
    @Nullable
    public final Integer modelId;

    @SerializedName("name")
    @Nullable
    public final String name;

    @SerializedName("rarity")
    @Nullable
    public final Integer rarity;

    @SerializedName("tradeMaxPrice")
    @Nullable
    public final Integer tradeMaxPrice;

    public static /* synthetic */ SkinsDTO copy$default(SkinsDTO skinsDTO, Integer num, String str, Integer num2, String str2, String str3, Integer num3, Integer num4, int i, Object obj) {
        if ((i & 1) != 0) {
            num = skinsDTO.id;
        }
        if ((i & 2) != 0) {
            str = skinsDTO.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            num2 = skinsDTO.modelId;
        }
        Integer num5 = num2;
        if ((i & 8) != 0) {
            str2 = skinsDTO.imageName;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            str3 = skinsDTO.description;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            num3 = skinsDTO.rarity;
        }
        Integer num6 = num3;
        if ((i & 64) != 0) {
            num4 = skinsDTO.tradeMaxPrice;
        }
        return skinsDTO.copy(num, str4, num5, str5, str6, num6, num4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getModelId() {
        return this.modelId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getRarity() {
        return this.rarity;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getTradeMaxPrice() {
        return this.tradeMaxPrice;
    }

    @NotNull
    public final SkinsDTO copy(@Nullable Integer id, @Nullable String name, @Nullable Integer modelId, @Nullable String imageName, @Nullable String description, @Nullable Integer rarity, @Nullable Integer tradeMaxPrice) {
        return new SkinsDTO(id, name, modelId, imageName, description, rarity, tradeMaxPrice);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkinsDTO)) {
            return false;
        }
        SkinsDTO skinsDTO = (SkinsDTO) other;
        return Intrinsics.areEqual(this.id, skinsDTO.id) && Intrinsics.areEqual(this.name, skinsDTO.name) && Intrinsics.areEqual(this.modelId, skinsDTO.modelId) && Intrinsics.areEqual(this.imageName, skinsDTO.imageName) && Intrinsics.areEqual(this.description, skinsDTO.description) && Intrinsics.areEqual(this.rarity, skinsDTO.rarity) && Intrinsics.areEqual(this.tradeMaxPrice, skinsDTO.tradeMaxPrice);
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.modelId;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.imageName;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.rarity;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.tradeMaxPrice;
        return iHashCode6 + (num4 != null ? num4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SkinsDTO(id=" + this.id + ", name=" + this.name + ", modelId=" + this.modelId + ", imageName=" + this.imageName + ", description=" + this.description + ", rarity=" + this.rarity + ", tradeMaxPrice=" + this.tradeMaxPrice + ")";
    }

    public SkinsDTO(@Nullable Integer num, @Nullable String str, @Nullable Integer num2, @Nullable String str2, @Nullable String str3, @Nullable Integer num3, @Nullable Integer num4) {
        this.id = num;
        this.name = str;
        this.modelId = num2;
        this.imageName = str2;
        this.description = str3;
        this.rarity = num3;
        this.tradeMaxPrice = num4;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final Integer getModelId() {
        return this.modelId;
    }

    @Nullable
    public final String getImageName() {
        return this.imageName;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    public final Integer getRarity() {
        return this.rarity;
    }

    @Nullable
    public final Integer getTradeMaxPrice() {
        return this.tradeMaxPrice;
    }
}

