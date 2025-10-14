package com.blackhub.bronline.game.model.remote.response.vehicles;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VehiclesDTO.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class VehiclesDTO {
    public static final int $stable = 0;

    @SerializedName("id")
    @Nullable
    public final Integer id;

    @SerializedName("imageName")
    @Nullable
    public final String imageName;

    @SerializedName("modelid")
    @Nullable
    public final Integer modelId;

    @SerializedName("name")
    @Nullable
    public final String name;

    @SerializedName("market_name")
    @Nullable
    public final String nameStore;

    public static /* synthetic */ VehiclesDTO copy$default(VehiclesDTO vehiclesDTO, Integer num, String str, String str2, Integer num2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            num = vehiclesDTO.id;
        }
        if ((i & 2) != 0) {
            str = vehiclesDTO.name;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = vehiclesDTO.nameStore;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            num2 = vehiclesDTO.modelId;
        }
        Integer num3 = num2;
        if ((i & 16) != 0) {
            str3 = vehiclesDTO.imageName;
        }
        return vehiclesDTO.copy(num, str4, str5, num3, str3);
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
    public final String getNameStore() {
        return this.nameStore;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getModelId() {
        return this.modelId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final VehiclesDTO copy(@Nullable Integer id, @Nullable String name, @Nullable String nameStore, @Nullable Integer modelId, @Nullable String imageName) {
        return new VehiclesDTO(id, name, nameStore, modelId, imageName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehiclesDTO)) {
            return false;
        }
        VehiclesDTO vehiclesDTO = (VehiclesDTO) other;
        return Intrinsics.areEqual(this.id, vehiclesDTO.id) && Intrinsics.areEqual(this.name, vehiclesDTO.name) && Intrinsics.areEqual(this.nameStore, vehiclesDTO.nameStore) && Intrinsics.areEqual(this.modelId, vehiclesDTO.modelId) && Intrinsics.areEqual(this.imageName, vehiclesDTO.imageName);
    }

    public int hashCode() {
        Integer num = this.id;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameStore;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.modelId;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.imageName;
        return iHashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VehiclesDTO(id=" + this.id + ", name=" + this.name + ", nameStore=" + this.nameStore + ", modelId=" + this.modelId + ", imageName=" + this.imageName + ")";
    }

    public VehiclesDTO(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Integer num2, @Nullable String str3) {
        this.id = num;
        this.name = str;
        this.nameStore = str2;
        this.modelId = num2;
        this.imageName = str3;
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
    public final String getNameStore() {
        return this.nameStore;
    }

    @Nullable
    public final Integer getModelId() {
        return this.modelId;
    }

    @Nullable
    public final String getImageName() {
        return this.imageName;
    }
}

