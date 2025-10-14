package com.blackhub.bronline.game.gui.familysystem.data;

import android.text.Spanned;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FamilyTopData.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FamilyTopData {
    public static final int $stable = 8;
    public final int backgroundColor;
    public final int familyGlasses;

    @NotNull
    public final Spanned familyName;
    public final int familyRep;
    public final int familyType;
    public boolean ifMyFamily;
    public boolean isClicked;
    public final int leftIcon;
    public final int position;
    public final int rightIcon;

    /* renamed from: component1, reason: from getter */
    public final int getPosition() {
        return this.position;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIfMyFamily() {
        return this.ifMyFamily;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Spanned getFamilyName() {
        return this.familyName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getFamilyType() {
        return this.familyType;
    }

    /* renamed from: component4, reason: from getter */
    public final int getFamilyRep() {
        return this.familyRep;
    }

    /* renamed from: component5, reason: from getter */
    public final int getFamilyGlasses() {
        return this.familyGlasses;
    }

    /* renamed from: component6, reason: from getter */
    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component7, reason: from getter */
    public final int getLeftIcon() {
        return this.leftIcon;
    }

    /* renamed from: component8, reason: from getter */
    public final int getRightIcon() {
        return this.rightIcon;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsClicked() {
        return this.isClicked;
    }

    @NotNull
    public final FamilyTopData copy(int position, @NotNull Spanned familyName, int familyType, int familyRep, int familyGlasses, int backgroundColor, int leftIcon, int rightIcon, boolean isClicked, boolean ifMyFamily) {
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        return new FamilyTopData(position, familyName, familyType, familyRep, familyGlasses, backgroundColor, leftIcon, rightIcon, isClicked, ifMyFamily);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyTopData)) {
            return false;
        }
        FamilyTopData familyTopData = (FamilyTopData) other;
        return this.position == familyTopData.position && Intrinsics.areEqual(this.familyName, familyTopData.familyName) && this.familyType == familyTopData.familyType && this.familyRep == familyTopData.familyRep && this.familyGlasses == familyTopData.familyGlasses && this.backgroundColor == familyTopData.backgroundColor && this.leftIcon == familyTopData.leftIcon && this.rightIcon == familyTopData.rightIcon && this.isClicked == familyTopData.isClicked && this.ifMyFamily == familyTopData.ifMyFamily;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.position) * 31) + this.familyName.hashCode()) * 31) + Integer.hashCode(this.familyType)) * 31) + Integer.hashCode(this.familyRep)) * 31) + Integer.hashCode(this.familyGlasses)) * 31) + Integer.hashCode(this.backgroundColor)) * 31) + Integer.hashCode(this.leftIcon)) * 31) + Integer.hashCode(this.rightIcon)) * 31) + Boolean.hashCode(this.isClicked)) * 31) + Boolean.hashCode(this.ifMyFamily);
    }

    @NotNull
    public String toString() {
        int i = this.position;
        Spanned spanned = this.familyName;
        return "FamilyTopData(position=" + i + ", familyName=" + ((Object) spanned) + ", familyType=" + this.familyType + ", familyRep=" + this.familyRep + ", familyGlasses=" + this.familyGlasses + ", backgroundColor=" + this.backgroundColor + ", leftIcon=" + this.leftIcon + ", rightIcon=" + this.rightIcon + ", isClicked=" + this.isClicked + ", ifMyFamily=" + this.ifMyFamily + ")";
    }

    public FamilyTopData(int i, @NotNull Spanned familyName, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(familyName, "familyName");
        this.position = i;
        this.familyName = familyName;
        this.familyType = i2;
        this.familyRep = i3;
        this.familyGlasses = i4;
        this.backgroundColor = i5;
        this.leftIcon = i6;
        this.rightIcon = i7;
        this.isClicked = z;
        this.ifMyFamily = z2;
    }

    public /* synthetic */ FamilyTopData(int i, Spanned spanned, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, boolean z2, int i8, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, spanned, i2, i3, i4, i5, i6, i7, (i8 & 256) != 0 ? false : z, (i8 & 512) != 0 ? false : z2);
    }

    public final int getPosition() {
        return this.position;
    }

    @NotNull
    public final Spanned getFamilyName() {
        return this.familyName;
    }

    public final int getFamilyType() {
        return this.familyType;
    }

    public final int getFamilyRep() {
        return this.familyRep;
    }

    public final int getFamilyGlasses() {
        return this.familyGlasses;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getLeftIcon() {
        return this.leftIcon;
    }

    public final int getRightIcon() {
        return this.rightIcon;
    }

    public final boolean isClicked() {
        return this.isClicked;
    }

    public final void setClicked(boolean z) {
        this.isClicked = z;
    }

    public final boolean getIfMyFamily() {
        return this.ifMyFamily;
    }

    public final void setIfMyFamily(boolean z) {
        this.ifMyFamily = z;
    }
}

