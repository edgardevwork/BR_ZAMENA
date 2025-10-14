package com.blackhub.bronline.game.model.remote.response.vehicles;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VehiclesDTO.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "", "id", "", "name", "", "nameStore", "modelId", "imageName", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageName", "()Ljava/lang/String;", "getModelId", "getName", "getNameStore", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/blackhub/bronline/game/model/remote/response/vehicles/VehiclesDTO;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
