package com.blackhub.bronline.game.model.remote.response.holidayevents;

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

/* compiled from: HolidayEventsTasks.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0015J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Jj\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u0003HÖ\u0001J\t\u0010*\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012¨\u0006+"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsTasks;", "", "id", "", "notActive", "typeId", "typeName", "", "description", "requirementDescription", CatchStreamerKeys.COUNT_KEY, "award", "typeBtn", "(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "getAward", "()I", "getCount", "getDescription", "()Ljava/lang/String;", "getId", "getNotActive", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRequirementDescription", "getTypeBtn", "getTypeId", "getTypeName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(ILjava/lang/Integer;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;III)Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsTasks;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsTasks {
    public static final int $stable = 0;

    @SerializedName("award")
    public final int award;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    public final int count;

    @SerializedName("description")
    @NotNull
    public final String description;

    @SerializedName("id")
    public final int id;

    @SerializedName("notActive")
    @Nullable
    public final Integer notActive;

    @SerializedName("requirementDescription")
    @NotNull
    public final String requirementDescription;

    @SerializedName("typeBtn")
    public final int typeBtn;

    @SerializedName("typeId")
    public final int typeId;

    @SerializedName("typeName")
    @NotNull
    public final String typeName;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getNotActive() {
        return this.notActive;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTypeId() {
        return this.typeId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getRequirementDescription() {
        return this.requirementDescription;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component8, reason: from getter */
    public final int getAward() {
        return this.award;
    }

    /* renamed from: component9, reason: from getter */
    public final int getTypeBtn() {
        return this.typeBtn;
    }

    @NotNull
    public final HolidayEventsTasks copy(int id, @Nullable Integer notActive, int typeId, @NotNull String typeName, @NotNull String description, @NotNull String requirementDescription, int count, int award, int typeBtn) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(requirementDescription, "requirementDescription");
        return new HolidayEventsTasks(id, notActive, typeId, typeName, description, requirementDescription, count, award, typeBtn);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsTasks)) {
            return false;
        }
        HolidayEventsTasks holidayEventsTasks = (HolidayEventsTasks) other;
        return this.id == holidayEventsTasks.id && Intrinsics.areEqual(this.notActive, holidayEventsTasks.notActive) && this.typeId == holidayEventsTasks.typeId && Intrinsics.areEqual(this.typeName, holidayEventsTasks.typeName) && Intrinsics.areEqual(this.description, holidayEventsTasks.description) && Intrinsics.areEqual(this.requirementDescription, holidayEventsTasks.requirementDescription) && this.count == holidayEventsTasks.count && this.award == holidayEventsTasks.award && this.typeBtn == holidayEventsTasks.typeBtn;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.notActive;
        return ((((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.typeId)) * 31) + this.typeName.hashCode()) * 31) + this.description.hashCode()) * 31) + this.requirementDescription.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.award)) * 31) + Integer.hashCode(this.typeBtn);
    }

    @NotNull
    public String toString() {
        return "HolidayEventsTasks(id=" + this.id + ", notActive=" + this.notActive + ", typeId=" + this.typeId + ", typeName=" + this.typeName + ", description=" + this.description + ", requirementDescription=" + this.requirementDescription + ", count=" + this.count + ", award=" + this.award + ", typeBtn=" + this.typeBtn + ")";
    }

    public HolidayEventsTasks(int i, @Nullable Integer num, int i2, @NotNull String typeName, @NotNull String description, @NotNull String requirementDescription, int i3, int i4, int i5) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(requirementDescription, "requirementDescription");
        this.id = i;
        this.notActive = num;
        this.typeId = i2;
        this.typeName = typeName;
        this.description = description;
        this.requirementDescription = requirementDescription;
        this.count = i3;
        this.award = i4;
        this.typeBtn = i5;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final Integer getNotActive() {
        return this.notActive;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public /* synthetic */ HolidayEventsTasks(int i, Integer num, int i2, String str, String str2, String str3, int i3, int i4, int i5, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, num, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i6 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i6 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i6 & 64) != 0 ? 0 : i3, (i6 & 128) != 0 ? 0 : i4, (i6 & 256) != 0 ? 0 : i5);
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final String getRequirementDescription() {
        return this.requirementDescription;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getAward() {
        return this.award;
    }

    public final int getTypeBtn() {
        return this.typeBtn;
    }
}
