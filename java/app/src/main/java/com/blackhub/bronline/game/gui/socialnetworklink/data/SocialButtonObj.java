package com.blackhub.bronline.game.gui.socialnetworklink.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SocialButtonObj.kt */
@StabilityInferred(parameters = 0)

public final /* data */ class SocialButtonObj {
    public static final int $stable = 8;
    public final int buttonId;

    @NotNull
    public final String buttonName;
    public final int buttonResIdIfActive;
    public final int buttonResIdIfNotActive;
    public int isActive;

    public static /* synthetic */ SocialButtonObj copy$default(SocialButtonObj socialButtonObj, int i, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = socialButtonObj.buttonId;
        }
        if ((i5 & 2) != 0) {
            str = socialButtonObj.buttonName;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i2 = socialButtonObj.buttonResIdIfActive;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = socialButtonObj.buttonResIdIfNotActive;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = socialButtonObj.isActive;
        }
        return socialButtonObj.copy(i, str2, i6, i7, i4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getButtonId() {
        return this.buttonId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getButtonResIdIfActive() {
        return this.buttonResIdIfActive;
    }

    /* renamed from: component4, reason: from getter */
    public final int getButtonResIdIfNotActive() {
        return this.buttonResIdIfNotActive;
    }

    /* renamed from: component5, reason: from getter */
    public final int getIsActive() {
        return this.isActive;
    }

    @NotNull
    public final SocialButtonObj copy(int buttonId, @NotNull String buttonName, int buttonResIdIfActive, int buttonResIdIfNotActive, int isActive) {
        Intrinsics.checkNotNullParameter(buttonName, "buttonName");
        return new SocialButtonObj(buttonId, buttonName, buttonResIdIfActive, buttonResIdIfNotActive, isActive);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialButtonObj)) {
            return false;
        }
        SocialButtonObj socialButtonObj = (SocialButtonObj) other;
        return this.buttonId == socialButtonObj.buttonId && Intrinsics.areEqual(this.buttonName, socialButtonObj.buttonName) && this.buttonResIdIfActive == socialButtonObj.buttonResIdIfActive && this.buttonResIdIfNotActive == socialButtonObj.buttonResIdIfNotActive && this.isActive == socialButtonObj.isActive;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.buttonId) * 31) + this.buttonName.hashCode()) * 31) + Integer.hashCode(this.buttonResIdIfActive)) * 31) + Integer.hashCode(this.buttonResIdIfNotActive)) * 31) + Integer.hashCode(this.isActive);
    }

    @NotNull
    public String toString() {
        return "SocialButtonObj(buttonId=" + this.buttonId + ", buttonName=" + this.buttonName + ", buttonResIdIfActive=" + this.buttonResIdIfActive + ", buttonResIdIfNotActive=" + this.buttonResIdIfNotActive + ", isActive=" + this.isActive + ")";
    }

    public SocialButtonObj(int i, @NotNull String buttonName, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(buttonName, "buttonName");
        this.buttonId = i;
        this.buttonName = buttonName;
        this.buttonResIdIfActive = i2;
        this.buttonResIdIfNotActive = i3;
        this.isActive = i4;
    }

    public final int getButtonId() {
        return this.buttonId;
    }

    @NotNull
    public final String getButtonName() {
        return this.buttonName;
    }

    public final int getButtonResIdIfActive() {
        return this.buttonResIdIfActive;
    }

    public final int getButtonResIdIfNotActive() {
        return this.buttonResIdIfNotActive;
    }

    public final int isActive() {
        return this.isActive;
    }

    public final void setActive(int i) {
        this.isActive = i;
    }
}

