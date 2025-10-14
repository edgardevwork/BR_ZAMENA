package com.blackhub.bronline.game.gui.drivingschool.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SignObj.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class SignObj {
    public static final int $stable = 0;
    public final boolean ifShowUnderline;

    @Nullable
    public final Integer leftPosition;
    public final int leftSignDescription;
    public final int leftSignIcon;
    public final int leftSignName;

    @Nullable
    public final Integer rightPosition;

    @Nullable
    public final Integer rightSignDescription;

    @Nullable
    public final Integer rightSignIcon;

    @Nullable
    public final Integer rightSignName;

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getLeftPosition() {
        return this.leftPosition;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLeftSignName() {
        return this.leftSignName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLeftSignDescription() {
        return this.leftSignDescription;
    }

    /* renamed from: component4, reason: from getter */
    public final int getLeftSignIcon() {
        return this.leftSignIcon;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Integer getRightPosition() {
        return this.rightPosition;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getRightSignName() {
        return this.rightSignName;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Integer getRightSignDescription() {
        return this.rightSignDescription;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getRightSignIcon() {
        return this.rightSignIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIfShowUnderline() {
        return this.ifShowUnderline;
    }

    @NotNull
    public final SignObj copy(@Nullable Integer leftPosition, int leftSignName, int leftSignDescription, int leftSignIcon, @Nullable Integer rightPosition, @Nullable Integer rightSignName, @Nullable Integer rightSignDescription, @Nullable Integer rightSignIcon, boolean ifShowUnderline) {
        return new SignObj(leftPosition, leftSignName, leftSignDescription, leftSignIcon, rightPosition, rightSignName, rightSignDescription, rightSignIcon, ifShowUnderline);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignObj)) {
            return false;
        }
        SignObj signObj = (SignObj) other;
        return Intrinsics.areEqual(this.leftPosition, signObj.leftPosition) && this.leftSignName == signObj.leftSignName && this.leftSignDescription == signObj.leftSignDescription && this.leftSignIcon == signObj.leftSignIcon && Intrinsics.areEqual(this.rightPosition, signObj.rightPosition) && Intrinsics.areEqual(this.rightSignName, signObj.rightSignName) && Intrinsics.areEqual(this.rightSignDescription, signObj.rightSignDescription) && Intrinsics.areEqual(this.rightSignIcon, signObj.rightSignIcon) && this.ifShowUnderline == signObj.ifShowUnderline;
    }

    public int hashCode() {
        Integer num = this.leftPosition;
        int iHashCode = (((((((num == null ? 0 : num.hashCode()) * 31) + Integer.hashCode(this.leftSignName)) * 31) + Integer.hashCode(this.leftSignDescription)) * 31) + Integer.hashCode(this.leftSignIcon)) * 31;
        Integer num2 = this.rightPosition;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.rightSignName;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.rightSignDescription;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.rightSignIcon;
        return ((iHashCode4 + (num5 != null ? num5.hashCode() : 0)) * 31) + Boolean.hashCode(this.ifShowUnderline);
    }

    @NotNull
    public String toString() {
        return "SignObj(leftPosition=" + this.leftPosition + ", leftSignName=" + this.leftSignName + ", leftSignDescription=" + this.leftSignDescription + ", leftSignIcon=" + this.leftSignIcon + ", rightPosition=" + this.rightPosition + ", rightSignName=" + this.rightSignName + ", rightSignDescription=" + this.rightSignDescription + ", rightSignIcon=" + this.rightSignIcon + ", ifShowUnderline=" + this.ifShowUnderline + ")";
    }

    public SignObj(@Nullable Integer num, int i, int i2, int i3, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, boolean z) {
        this.leftPosition = num;
        this.leftSignName = i;
        this.leftSignDescription = i2;
        this.leftSignIcon = i3;
        this.rightPosition = num2;
        this.rightSignName = num3;
        this.rightSignDescription = num4;
        this.rightSignIcon = num5;
        this.ifShowUnderline = z;
    }

    public /* synthetic */ SignObj(Integer num, int i, int i2, int i3, Integer num2, Integer num3, Integer num4, Integer num5, boolean z, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : num, i, i2, i3, (i4 & 16) != 0 ? null : num2, num3, num4, num5, z);
    }

    @Nullable
    public final Integer getLeftPosition() {
        return this.leftPosition;
    }

    public final int getLeftSignName() {
        return this.leftSignName;
    }

    public final int getLeftSignDescription() {
        return this.leftSignDescription;
    }

    public final int getLeftSignIcon() {
        return this.leftSignIcon;
    }

    @Nullable
    public final Integer getRightPosition() {
        return this.rightPosition;
    }

    @Nullable
    public final Integer getRightSignName() {
        return this.rightSignName;
    }

    @Nullable
    public final Integer getRightSignDescription() {
        return this.rightSignDescription;
    }

    @Nullable
    public final Integer getRightSignIcon() {
        return this.rightSignIcon;
    }

    public final boolean getIfShowUnderline() {
        return this.ifShowUnderline;
    }
}

