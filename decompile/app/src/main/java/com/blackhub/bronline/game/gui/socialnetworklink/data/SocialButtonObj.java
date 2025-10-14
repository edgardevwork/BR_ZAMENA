package com.blackhub.bronline.game.gui.socialnetworklink.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SocialButtonObj.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/socialnetworklink/data/SocialButtonObj;", "", "buttonId", "", "buttonName", "", "buttonResIdIfActive", "buttonResIdIfNotActive", "isActive", "(ILjava/lang/String;III)V", "getButtonId", "()I", "getButtonName", "()Ljava/lang/String;", "getButtonResIdIfActive", "getButtonResIdIfNotActive", "setActive", "(I)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
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
