package com.blackhub.bronline.game.model.remote.response.cases;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBonusDto.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class CasesBonusDto {
    public static final int $stable = 0;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    public final int count;

    @SerializedName("id")
    public final int id;

    @SerializedName("internalId")
    public final int internalId;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("name_store")
    @Nullable
    public final String nameStore;

    @SerializedName("numberOpen")
    public final int numberOpen;

    @SerializedName("rarity")
    public final int rarity;

    @SerializedName("renderId")
    @Nullable
    public final String renderId;

    @SerializedName("type")
    public final int type;

    public CasesBonusDto() {
        this(0, 0, null, null, 0, 0, null, 0, 0, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final int getNumberOpen() {
        return this.numberOpen;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getNameStore() {
        return this.nameStore;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRarity() {
        return this.rarity;
    }

    /* renamed from: component6, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getRenderId() {
        return this.renderId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getInternalId() {
        return this.internalId;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final CasesBonusDto copy(int id, int numberOpen, @NotNull String name, @Nullable String nameStore, int rarity, int type, @Nullable String renderId, int internalId, int count) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CasesBonusDto(id, numberOpen, name, nameStore, rarity, type, renderId, internalId, count);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesBonusDto)) {
            return false;
        }
        CasesBonusDto casesBonusDto = (CasesBonusDto) other;
        return this.id == casesBonusDto.id && this.numberOpen == casesBonusDto.numberOpen && Intrinsics.areEqual(this.name, casesBonusDto.name) && Intrinsics.areEqual(this.nameStore, casesBonusDto.nameStore) && this.rarity == casesBonusDto.rarity && this.type == casesBonusDto.type && Intrinsics.areEqual(this.renderId, casesBonusDto.renderId) && this.internalId == casesBonusDto.internalId && this.count == casesBonusDto.count;
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.numberOpen)) * 31) + this.name.hashCode()) * 31;
        String str = this.nameStore;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.rarity)) * 31) + Integer.hashCode(this.type)) * 31;
        String str2 = this.renderId;
        return ((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.internalId)) * 31) + Integer.hashCode(this.count);
    }

    @NotNull
    public String toString() {
        return "CasesBonusDto(id=" + this.id + ", numberOpen=" + this.numberOpen + ", name=" + this.name + ", nameStore=" + this.nameStore + ", rarity=" + this.rarity + ", type=" + this.type + ", renderId=" + this.renderId + ", internalId=" + this.internalId + ", count=" + this.count + ")";
    }

    public CasesBonusDto(int i, int i2, @NotNull String name, @Nullable String str, int i3, int i4, @Nullable String str2, int i5, int i6) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.numberOpen = i2;
        this.name = name;
        this.nameStore = str;
        this.rarity = i3;
        this.type = i4;
        this.renderId = str2;
        this.internalId = i5;
        this.count = i6;
    }

    public final int getId() {
        return this.id;
    }

    public final int getNumberOpen() {
        return this.numberOpen;
    }

    public /* synthetic */ CasesBonusDto(int i, int i2, String str, String str2, int i3, int i4, String str3, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? 0 : i2, (i7 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) != 0 ? 0 : i4, (i7 & 64) == 0 ? str3 : null, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) == 0 ? i6 : 0);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNameStore() {
        return this.nameStore;
    }

    public final int getRarity() {
        return this.rarity;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getRenderId() {
        return this.renderId;
    }

    public final int getInternalId() {
        return this.internalId;
    }

    public final int getCount() {
        return this.count;
    }
}

