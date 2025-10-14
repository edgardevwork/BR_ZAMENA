package com.blackhub.bronline.game.model.remote.response.blackpass;

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

/* compiled from: BlackPassItems.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class TasksInfo {
    public static final int $stable = 8;

    @SerializedName("award")
    public int award;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    public int count;

    @SerializedName("description")
    @NotNull
    public String description;

    @SerializedName("id")
    public int id;

    @SerializedName("level")
    public final int level;

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
    public String typeName;

    public TasksInfo() {
        this(0, null, 0, null, null, null, 0, 0, 0, 0, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getLevel() {
        return this.level;
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
    public final TasksInfo copy(int id, @Nullable Integer notActive, int typeId, @NotNull String typeName, @NotNull String description, @NotNull String requirementDescription, int count, int award, int typeBtn, int level) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(requirementDescription, "requirementDescription");
        return new TasksInfo(id, notActive, typeId, typeName, description, requirementDescription, count, award, typeBtn, level);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TasksInfo)) {
            return false;
        }
        TasksInfo tasksInfo = (TasksInfo) other;
        return this.id == tasksInfo.id && Intrinsics.areEqual(this.notActive, tasksInfo.notActive) && this.typeId == tasksInfo.typeId && Intrinsics.areEqual(this.typeName, tasksInfo.typeName) && Intrinsics.areEqual(this.description, tasksInfo.description) && Intrinsics.areEqual(this.requirementDescription, tasksInfo.requirementDescription) && this.count == tasksInfo.count && this.award == tasksInfo.award && this.typeBtn == tasksInfo.typeBtn && this.level == tasksInfo.level;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.id) * 31;
        Integer num = this.notActive;
        return ((((((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.typeId)) * 31) + this.typeName.hashCode()) * 31) + this.description.hashCode()) * 31) + this.requirementDescription.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.award)) * 31) + Integer.hashCode(this.typeBtn)) * 31) + Integer.hashCode(this.level);
    }

    @NotNull
    public String toString() {
        return "TasksInfo(id=" + this.id + ", notActive=" + this.notActive + ", typeId=" + this.typeId + ", typeName=" + this.typeName + ", description=" + this.description + ", requirementDescription=" + this.requirementDescription + ", count=" + this.count + ", award=" + this.award + ", typeBtn=" + this.typeBtn + ", level=" + this.level + ")";
    }

    public TasksInfo(int i, @Nullable Integer num, int i2, @NotNull String typeName, @NotNull String description, @NotNull String requirementDescription, int i3, int i4, int i5, int i6) {
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
        this.level = i6;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    @Nullable
    public final Integer getNotActive() {
        return this.notActive;
    }

    public final int getTypeId() {
        return this.typeId;
    }

    public /* synthetic */ TasksInfo(int i, Integer num, int i2, String str, String str2, String str3, int i3, int i4, int i5, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? 0 : i, (i7 & 2) != 0 ? null : num, (i7 & 4) != 0 ? 0 : i2, (i7 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i7 & 16) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i7 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i7 & 64) != 0 ? 0 : i3, (i7 & 128) != 0 ? 0 : i4, (i7 & 256) != 0 ? 0 : i5, (i7 & 512) == 0 ? i6 : 0);
    }

    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }

    public final void setTypeName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.typeName = str;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.description = str;
    }

    @NotNull
    public final String getRequirementDescription() {
        return this.requirementDescription;
    }

    public final int getCount() {
        return this.count;
    }

    public final void setCount(int i) {
        this.count = i;
    }

    public final int getAward() {
        return this.award;
    }

    public final void setAward(int i) {
        this.award = i;
    }

    public final int getTypeBtn() {
        return this.typeBtn;
    }

    public final int getLevel() {
        return this.level;
    }
}

