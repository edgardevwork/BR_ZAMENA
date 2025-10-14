package com.blackhub.bronline.game.model.remote.response.holidayevents;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: HolidayEventsTutorial.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class HolidayEventsTutorial {
    public static final int $stable = 0;

    @SerializedName("description")
    @NotNull
    public final String description;

    @SerializedName("header")
    @NotNull
    public final String header;

    @SerializedName("id")
    public final int id;

    @SerializedName("imageName")
    @NotNull
    public final String imageName;

    public HolidayEventsTutorial() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ HolidayEventsTutorial copy$default(HolidayEventsTutorial holidayEventsTutorial, int i, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = holidayEventsTutorial.id;
        }
        if ((i2 & 2) != 0) {
            str = holidayEventsTutorial.header;
        }
        if ((i2 & 4) != 0) {
            str2 = holidayEventsTutorial.imageName;
        }
        if ((i2 & 8) != 0) {
            str3 = holidayEventsTutorial.description;
        }
        return holidayEventsTutorial.copy(i, str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @NotNull
    public final HolidayEventsTutorial copy(int id, @NotNull String header, @NotNull String imageName, @NotNull String description) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(description, "description");
        return new HolidayEventsTutorial(id, header, imageName, description);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HolidayEventsTutorial)) {
            return false;
        }
        HolidayEventsTutorial holidayEventsTutorial = (HolidayEventsTutorial) other;
        return this.id == holidayEventsTutorial.id && Intrinsics.areEqual(this.header, holidayEventsTutorial.header) && Intrinsics.areEqual(this.imageName, holidayEventsTutorial.imageName) && Intrinsics.areEqual(this.description, holidayEventsTutorial.description);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.header.hashCode()) * 31) + this.imageName.hashCode()) * 31) + this.description.hashCode();
    }

    @NotNull
    public String toString() {
        return "HolidayEventsTutorial(id=" + this.id + ", header=" + this.header + ", imageName=" + this.imageName + ", description=" + this.description + ")";
    }

    public HolidayEventsTutorial(int i, @NotNull String header, @NotNull String imageName, @NotNull String description) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        Intrinsics.checkNotNullParameter(description, "description");
        this.id = i;
        this.header = header;
        this.imageName = imageName;
        this.description = description;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ HolidayEventsTutorial(int i, String str, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3);
    }

    @NotNull
    public final String getHeader() {
        return this.header;
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final String getDescription() {
        return this.description;
    }
}

