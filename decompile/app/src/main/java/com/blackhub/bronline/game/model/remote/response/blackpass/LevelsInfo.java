package com.blackhub.bronline.game.model.remote.response.blackpass;

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

/* compiled from: LevelsInfo.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0002\u0010\u0015J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010B\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010C\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00100J\u0010\u0010D\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u00100J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J¾\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010PJ\u0013\u0010Q\u001a\u00020R2\b\u0010S\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010T\u001a\u00020\u0003HÖ\u0001J\t\u0010U\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0017\"\u0004\b#\u0010\u0019R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0017R\u0011\u0010)\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b4\u00100\"\u0004\b5\u00102R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00103\u001a\u0004\b6\u00100\"\u0004\b7\u00102R \u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u001d\"\u0004\b9\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010\u0017R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0017\"\u0004\b<\u0010\u0019R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0017\"\u0004\b>\u0010\u0019¨\u0006V"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/blackpass/LevelsInfo;", "", "id", "", "name", "", "nameStore", "description", "descriptionStore", "typeId", "awardId", "renderId", CatchStreamerKeys.COUNT_KEY, "typeReward", "texture", "rotX", "", "rotY", "rotZ", "timeSkin", "rarity", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;II)V", "getAwardId", "()I", "setAwardId", "(I)V", "getCount", "setCount", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getDescriptionStore", "setDescriptionStore", "getId", "setId", "getName", "setName", "getNameStore", "setNameStore", "getRarity", "rarityEnum", "Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "getRarityEnum", "()Lcom/blackhub/bronline/game/core/enums/CommonRarityEnum;", "getRenderId", "setRenderId", "getRotX", "()Ljava/lang/Float;", "setRotX", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getRotY", "setRotY", "getRotZ", "setRotZ", "getTexture", "setTexture", "getTimeSkin", "getTypeId", "setTypeId", "getTypeReward", "setTypeReward", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;IILjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Float;II)Lcom/blackhub/bronline/game/model/remote/response/blackpass/LevelsInfo;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class LevelsInfo {
    public static final int $stable = 8;

    @SerializedName("awardId")
    public int awardId;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    public int count;

    @SerializedName("description")
    @Nullable
    public String description;

    @SerializedName("descriptionStore")
    @Nullable
    public String descriptionStore;

    @SerializedName("id")
    public int id;

    @SerializedName("name")
    @Nullable
    public String name;

    @SerializedName("nameStore")
    @Nullable
    public String nameStore;

    @SerializedName("rarity")
    public final int rarity;

    @SerializedName("renderId")
    @NotNull
    public String renderId;

    @SerializedName("rotX")
    @Nullable
    public Float rotX;

    @SerializedName("rotY")
    @Nullable
    public Float rotY;

    @SerializedName("rotZ")
    @Nullable
    public Float rotZ;

    @SerializedName("texture")
    @Nullable
    public String texture;

    @SerializedName("timeSkin")
    public final int timeSkin;

    @SerializedName("typeId")
    public int typeId;

    @SerializedName("typeReward")
    public int typeReward;

    public LevelsInfo() {
        this(0, null, null, null, null, 0, 0, null, 0, 0, null, null, null, null, 0, 0, 65535, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getTypeReward() {
        return this.typeReward;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getTexture() {
        return this.texture;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Float getRotX() {
        return this.rotX;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Float getRotY() {
        return this.rotY;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Float getRotZ() {
        return this.rotZ;
    }

    /* renamed from: component15, reason: from getter */
    public final int getTimeSkin() {
        return this.timeSkin;
    }

    /* renamed from: component16, reason: from getter */
    public final int getRarity() {
        return this.rarity;
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
    public final String getDescription() {
        return this.description;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }

    /* renamed from: component6, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    /* renamed from: component7, reason: from getter */
    public final int getAwardId() {
        return this.awardId;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getRenderId() {
        return this.renderId;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final LevelsInfo copy(int id, @Nullable String name, @Nullable String nameStore, @Nullable String description, @Nullable String descriptionStore, int typeId, int awardId, @NotNull String renderId, int count, int typeReward, @Nullable String texture, @Nullable Float rotX, @Nullable Float rotY, @Nullable Float rotZ, int timeSkin, int rarity) {
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        return new LevelsInfo(id, name, nameStore, description, descriptionStore, typeId, awardId, renderId, count, typeReward, texture, rotX, rotY, rotZ, timeSkin, rarity);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LevelsInfo)) {
            return false;
        }
        LevelsInfo levelsInfo = (LevelsInfo) other;
        return this.id == levelsInfo.id && Intrinsics.areEqual(this.name, levelsInfo.name) && Intrinsics.areEqual(this.nameStore, levelsInfo.nameStore) && Intrinsics.areEqual(this.description, levelsInfo.description) && Intrinsics.areEqual(this.descriptionStore, levelsInfo.descriptionStore) && this.typeId == levelsInfo.typeId && this.awardId == levelsInfo.awardId && Intrinsics.areEqual(this.renderId, levelsInfo.renderId) && this.count == levelsInfo.count && this.typeReward == levelsInfo.typeReward && Intrinsics.areEqual(this.texture, levelsInfo.texture) && Intrinsics.areEqual((Object) this.rotX, (Object) levelsInfo.rotX) && Intrinsics.areEqual((Object) this.rotY, (Object) levelsInfo.rotY) && Intrinsics.areEqual((Object) this.rotZ, (Object) levelsInfo.rotZ) && this.timeSkin == levelsInfo.timeSkin && this.rarity == levelsInfo.rarity;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.nameStore;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.description;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.descriptionStore;
        int iHashCode5 = (((((((((((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + Integer.hashCode(this.typeId)) * 31) + Integer.hashCode(this.awardId)) * 31) + this.renderId.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.typeReward)) * 31;
        String str5 = this.texture;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f = this.rotX;
        int iHashCode7 = (iHashCode6 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.rotY;
        int iHashCode8 = (iHashCode7 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.rotZ;
        return ((((iHashCode8 + (f3 != null ? f3.hashCode() : 0)) * 31) + Integer.hashCode(this.timeSkin)) * 31) + Integer.hashCode(this.rarity);
    }

    @NotNull
    public String toString() {
        return "LevelsInfo(id=" + this.id + ", name=" + this.name + ", nameStore=" + this.nameStore + ", description=" + this.description + ", descriptionStore=" + this.descriptionStore + ", typeId=" + this.typeId + ", awardId=" + this.awardId + ", renderId=" + this.renderId + ", count=" + this.count + ", typeReward=" + this.typeReward + ", texture=" + this.texture + ", rotX=" + this.rotX + ", rotY=" + this.rotY + ", rotZ=" + this.rotZ + ", timeSkin=" + this.timeSkin + ", rarity=" + this.rarity + ")";
    }

    public LevelsInfo(int i, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, int i2, int i3, @NotNull String renderId, int i4, int i5, @Nullable String str5, @Nullable Float f, @Nullable Float f2, @Nullable Float f3, int i6, int i7) {
        Intrinsics.checkNotNullParameter(renderId, "renderId");
        this.id = i;
        this.name = str;
        this.nameStore = str2;
        this.description = str3;
        this.descriptionStore = str4;
        this.typeId = i2;
        this.awardId = i3;
        this.renderId = renderId;
        this.count = i4;
        this.typeReward = i5;
        this.texture = str5;
        this.rotX = f;
        this.rotY = f2;
        this.rotZ = f3;
        this.timeSkin = i6;
        this.rarity = i7;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    @Nullable
    public final String getNameStore() {
        return this.nameStore;
    }

    public final void setNameStore(@Nullable String str) {
        this.nameStore = str;
    }

    @Nullable
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@Nullable String str) {
        this.description = str;
    }

    @Nullable
    public final String getDescriptionStore() {
        return this.descriptionStore;
    }

    public final void setDescriptionStore(@Nullable String str) {
        this.descriptionStore = str;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public final void setTypeId(int i) {
        this.typeId = i;
    }

    public final int getAwardId() {
        return this.awardId;
    }

    public final void setAwardId(int i) {
        this.awardId = i;
    }

    public /* synthetic */ LevelsInfo(int i, String str, String str2, String str3, String str4, int i2, int i3, String str5, int i4, int i5, String str6, Float f, Float f2, Float f3, int i6, int i7, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this((i8 & 1) != 0 ? 0 : i, (i8 & 2) != 0 ? null : str, (i8 & 4) != 0 ? null : str2, (i8 & 8) != 0 ? null : str3, (i8 & 16) != 0 ? null : str4, (i8 & 32) != 0 ? 0 : i2, (i8 & 64) != 0 ? 0 : i3, (i8 & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i8 & 256) != 0 ? 0 : i4, (i8 & 512) != 0 ? 0 : i5, (i8 & 1024) != 0 ? null : str6, (i8 & 2048) != 0 ? null : f, (i8 & 4096) != 0 ? null : f2, (i8 & 8192) == 0 ? f3 : null, (i8 & 16384) != 0 ? 0 : i6, (i8 & 32768) != 0 ? 1 : i7);
    }

    @NotNull
    public final String getRenderId() {
        return this.renderId;
    }

    public final void setRenderId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.renderId = str;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final int getTypeReward() {
        return this.typeReward;
    }

    public final void setTypeReward(int i) {
        this.typeReward = i;
    }

    @Nullable
    public final String getTexture() {
        return this.texture;
    }

    public final void setTexture(@Nullable String str) {
        this.texture = str;
    }

    @Nullable
    public final Float getRotX() {
        return this.rotX;
    }

    public final void setRotX(@Nullable Float f) {
        this.rotX = f;
    }

    @Nullable
    public final Float getRotY() {
        return this.rotY;
    }

    public final void setRotY(@Nullable Float f) {
        this.rotY = f;
    }

    @Nullable
    public final Float getRotZ() {
        return this.rotZ;
    }

    public final void setRotZ(@Nullable Float f) {
        this.rotZ = f;
    }

    public final int getTimeSkin() {
        return this.timeSkin;
    }

    public final int getRarity() {
        return this.rarity;
    }

    @NotNull
    public final CommonRarityEnum getRarityEnum() {
        return CommonRarityEnum.INSTANCE.fromInt(this.rarity);
    }
}
