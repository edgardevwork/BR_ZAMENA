package com.blackhub.bronline.game.model.remote.response.holidayevents;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsSettings.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsSettings {
    public static final int $stable = 8;

    @SerializedName("icImage")
    @NotNull
    public final String icImage;

    @SerializedName("id")
    public final int id;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("objectGrades")
    @Nullable
    public final List<Integer> objectGrades;

    @SerializedName("objectImages")
    @NotNull
    public final List<String> objectImages;

    public HolidayEventsSettings() {
        this(0, null, null, null, null, 31, null);
    }

    public static /* synthetic */ HolidayEventsSettings copy$default(HolidayEventsSettings holidayEventsSettings, int i, String str, String str2, List list, List list2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = holidayEventsSettings.id;
        }
        if ((i2 & 2) != 0) {
            str = holidayEventsSettings.name;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            str2 = holidayEventsSettings.icImage;
        }
        String str4 = str2;
        if ((i2 & 8) != 0) {
            list = holidayEventsSettings.objectGrades;
        }
        List list3 = list;
        if ((i2 & 16) != 0) {
            list2 = holidayEventsSettings.objectImages;
        }
        return holidayEventsSettings.copy(i, str3, str4, list3, list2);
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

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIcImage() {
        return this.icImage;
    }

    @Nullable
    public final List<Integer> component4() {
        return this.objectGrades;
    }

    @NotNull
    public final List<String> component5() {
        return this.objectImages;
    }

    @NotNull
    public final HolidayEventsSettings copy(int id, @NotNull String name, @NotNull String icImage, @Nullable List<Integer> objectGrades, @NotNull List<String> objectImages) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icImage, "icImage");
        Intrinsics.checkNotNullParameter(objectImages, "objectImages");
        return new HolidayEventsSettings(id, name, icImage, objectGrades, objectImages);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsSettings)) {
            return false;
        }
        HolidayEventsSettings holidayEventsSettings = (HolidayEventsSettings) other;
        return this.id == holidayEventsSettings.id && Intrinsics.areEqual(this.name, holidayEventsSettings.name) && Intrinsics.areEqual(this.icImage, holidayEventsSettings.icImage) && Intrinsics.areEqual(this.objectGrades, holidayEventsSettings.objectGrades) && Intrinsics.areEqual(this.objectImages, holidayEventsSettings.objectImages);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + this.icImage.hashCode()) * 31;
        List<Integer> list = this.objectGrades;
        return ((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.objectImages.hashCode();
    }

    @NotNull
    public String toString() {
        return "HolidayEventsSettings(id=" + this.id + ", name=" + this.name + ", icImage=" + this.icImage + ", objectGrades=" + this.objectGrades + ", objectImages=" + this.objectImages + ")";
    }

    public HolidayEventsSettings(int i, @NotNull String name, @NotNull String icImage, @Nullable List<Integer> list, @NotNull List<String> objectImages) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icImage, "icImage");
        Intrinsics.checkNotNullParameter(objectImages, "objectImages");
        this.id = i;
        this.name = name;
        this.icImage = icImage;
        this.objectGrades = list;
        this.objectImages = objectImages;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ HolidayEventsSettings(int i, String str, String str2, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getIcImage() {
        return this.icImage;
    }

    @Nullable
    public final List<Integer> getObjectGrades() {
        return this.objectGrades;
    }

    @NotNull
    public final List<String> getObjectImages() {
        return this.objectImages;
    }
}

