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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0011\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003JI\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/holidayevents/HolidayEventsSettings;", "", "id", "", "name", "", "icImage", "objectGrades", "", "objectImages", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getIcImage", "()Ljava/lang/String;", "getId", "()I", "getName", "getObjectGrades", "()Ljava/util/List;", "getObjectImages", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
