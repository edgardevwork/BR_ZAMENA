package com.blackhub.bronline.game.gui.familysystem.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NetworkFamilySystem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class FamilySystemUpgradeObj {
    public static final int $stable = 0;

    @SerializedName("ammo")
    public final int ammo;

    @SerializedName("armour")
    public final int armour;

    @SerializedName("gasoline")
    public final int gasoline;

    @SerializedName("id")
    public final int id;

    @SerializedName("level")
    public final int level;

    @SerializedName("masks")
    public final int masks;

    @SerializedName("materials")
    public final int materials;

    @SerializedName("money")
    public final int money;

    @SerializedName("people")
    public final int people;

    @SerializedName(FirebaseAnalytics.Param.PRICE)
    public final int price;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final int getPrice() {
        return this.price;
    }

    /* renamed from: component2, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* renamed from: component3, reason: from getter */
    public final int getMoney() {
        return this.money;
    }

    /* renamed from: component4, reason: from getter */
    public final int getMaterials() {
        return this.materials;
    }

    /* renamed from: component5, reason: from getter */
    public final int getMasks() {
        return this.masks;
    }

    /* renamed from: component6, reason: from getter */
    public final int getGasoline() {
        return this.gasoline;
    }

    /* renamed from: component7, reason: from getter */
    public final int getArmour() {
        return this.armour;
    }

    /* renamed from: component8, reason: from getter */
    public final int getPeople() {
        return this.people;
    }

    /* renamed from: component9, reason: from getter */
    public final int getAmmo() {
        return this.ammo;
    }

    @NotNull
    public final FamilySystemUpgradeObj copy(int id, int level, int money, int materials, int masks, int gasoline, int armour, int people, int ammo, int price) {
        return new FamilySystemUpgradeObj(id, level, money, materials, masks, gasoline, armour, people, ammo, price);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilySystemUpgradeObj)) {
            return false;
        }
        FamilySystemUpgradeObj familySystemUpgradeObj = (FamilySystemUpgradeObj) other;
        return this.id == familySystemUpgradeObj.id && this.level == familySystemUpgradeObj.level && this.money == familySystemUpgradeObj.money && this.materials == familySystemUpgradeObj.materials && this.masks == familySystemUpgradeObj.masks && this.gasoline == familySystemUpgradeObj.gasoline && this.armour == familySystemUpgradeObj.armour && this.people == familySystemUpgradeObj.people && this.ammo == familySystemUpgradeObj.ammo && this.price == familySystemUpgradeObj.price;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.id) * 31) + Integer.hashCode(this.level)) * 31) + Integer.hashCode(this.money)) * 31) + Integer.hashCode(this.materials)) * 31) + Integer.hashCode(this.masks)) * 31) + Integer.hashCode(this.gasoline)) * 31) + Integer.hashCode(this.armour)) * 31) + Integer.hashCode(this.people)) * 31) + Integer.hashCode(this.ammo)) * 31) + Integer.hashCode(this.price);
    }

    @NotNull
    public String toString() {
        return "FamilySystemUpgradeObj(id=" + this.id + ", level=" + this.level + ", money=" + this.money + ", materials=" + this.materials + ", masks=" + this.masks + ", gasoline=" + this.gasoline + ", armour=" + this.armour + ", people=" + this.people + ", ammo=" + this.ammo + ", price=" + this.price + ")";
    }

    public FamilySystemUpgradeObj(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        this.id = i;
        this.level = i2;
        this.money = i3;
        this.materials = i4;
        this.masks = i5;
        this.gasoline = i6;
        this.armour = i7;
        this.people = i8;
        this.ammo = i9;
        this.price = i10;
    }

    public final int getId() {
        return this.id;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getMoney() {
        return this.money;
    }

    public final int getMaterials() {
        return this.materials;
    }

    public final int getMasks() {
        return this.masks;
    }

    public final int getGasoline() {
        return this.gasoline;
    }

    public final int getArmour() {
        return this.armour;
    }

    public final int getPeople() {
        return this.people;
    }

    public final int getAmmo() {
        return this.ammo;
    }

    public final int getPrice() {
        return this.price;
    }
}

