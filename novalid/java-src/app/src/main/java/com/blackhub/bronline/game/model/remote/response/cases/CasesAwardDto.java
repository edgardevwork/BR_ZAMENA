package com.blackhub.bronline.game.model.remote.response.cases;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.enums.CommonRarityEnum;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesAwardDto.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003Jg\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0013R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000f¨\u0006,"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/cases/CasesAwardDto;", "", "id", "", "name", "", "nameStore", "rarity", "type", "renderId", "internalId", CatchStreamerKeys.COUNT_KEY, "priceSprayed", "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;III)V", "getCount", "()I", "getId", "getInternalId", "getName", "()Ljava/lang/String;", "getNameStore", "getPriceSprayed", "getRarity", "rarityFromEnum", "Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "getRarityFromEnum", "()Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "getRenderId", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CasesAwardDto {
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

    @SerializedName("priceSprayed")
    public final int priceSprayed;

    @SerializedName("rarity")
    public final int rarity;

    @SerializedName("renderId")
    @Nullable
    public final String renderId;

    @SerializedName("type")
    public final int type;

    public CasesAwardDto() {
        this(0, null, null, 0, 0, null, 0, 0, 0, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getNameStore() {
        return this.nameStore;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRarity() {
        return this.rarity;
    }

    /* renamed from: component5, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getRenderId() {
        return this.renderId;
    }

    /* renamed from: component7, reason: from getter */
    public final int getInternalId() {
        return this.internalId;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component9, reason: from getter */
    public final int getPriceSprayed() {
        return this.priceSprayed;
    }

    @NotNull
    public final CasesAwardDto copy(int id, @NotNull String name, @Nullable String nameStore, int rarity, int type, @Nullable String renderId, int internalId, int count, int priceSprayed) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new CasesAwardDto(id, name, nameStore, rarity, type, renderId, internalId, count, priceSprayed);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesAwardDto)) {
            return false;
        }
        CasesAwardDto casesAwardDto = (CasesAwardDto) other;
        return this.id == casesAwardDto.id && Intrinsics.areEqual(this.name, casesAwardDto.name) && Intrinsics.areEqual(this.nameStore, casesAwardDto.nameStore) && this.rarity == casesAwardDto.rarity && this.type == casesAwardDto.type && Intrinsics.areEqual(this.renderId, casesAwardDto.renderId) && this.internalId == casesAwardDto.internalId && this.count == casesAwardDto.count && this.priceSprayed == casesAwardDto.priceSprayed;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31;
        String str = this.nameStore;
        int iHashCode2 = (((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.rarity)) * 31) + Integer.hashCode(this.type)) * 31;
        String str2 = this.renderId;
        return ((((((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.internalId)) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.priceSprayed);
    }

    @NotNull
    public String toString() {
        return "CasesAwardDto(id=" + this.id + ", name=" + this.name + ", nameStore=" + this.nameStore + ", rarity=" + this.rarity + ", type=" + this.type + ", renderId=" + this.renderId + ", internalId=" + this.internalId + ", count=" + this.count + ", priceSprayed=" + this.priceSprayed + ")";
    }

    public CasesAwardDto(int i, @NotNull String name, @Nullable String str, int i2, int i3, @Nullable String str2, int i4, int i5, int i6) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
        this.nameStore = str;
        this.rarity = i2;
        this.type = i3;
        this.renderId = str2;
        this.internalId = i4;
        this.count = i5;
        this.priceSprayed = i6;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ CasesAwardDto(int i, String str, String str2, int i2, int i3, String str3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i7 & 4) != 0 ? null : str2, (i7 & 8) != 0 ? 0 : i2, (i7 & 16) != 0 ? 0 : i3, (i7 & 32) == 0 ? str3 : null, (i7 & 64) != 0 ? 0 : i4, (i7 & 128) != 0 ? 0 : i5, (i7 & 256) == 0 ? i6 : 0);
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

    public final int getPriceSprayed() {
        return this.priceSprayed;
    }

    @NotNull
    public final CommonRarityEnum getRarityFromEnum() {
        return CommonRarityEnum.INSTANCE.fromInt(this.rarity);
    }
}
