package com.blackhub.bronline.game.gui.menu.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ButtonsConfigResponse.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0006J&\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0002\u0010\u0006R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0004\u0010\u0006¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/menu/model/ButtonsConfigResponse;", "", "isShowSimButton", "", "isShowTanpinButton", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/blackhub/bronline/game/gui/menu/model/ButtonsConfigResponse;", "equals", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonsConfigResponse {
    public static final int $stable = 0;

    @SerializedName("isShowSimButton")
    @Nullable
    public final Boolean isShowSimButton;

    @SerializedName("isShowTanpinButton")
    @Nullable
    public final Boolean isShowTanpinButton;

    public ButtonsConfigResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ButtonsConfigResponse copy$default(ButtonsConfigResponse buttonsConfigResponse, Boolean bool, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = buttonsConfigResponse.isShowSimButton;
        }
        if ((i & 2) != 0) {
            bool2 = buttonsConfigResponse.isShowTanpinButton;
        }
        return buttonsConfigResponse.copy(bool, bool2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Boolean getIsShowSimButton() {
        return this.isShowSimButton;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getIsShowTanpinButton() {
        return this.isShowTanpinButton;
    }

    @NotNull
    public final ButtonsConfigResponse copy(@Nullable Boolean isShowSimButton, @Nullable Boolean isShowTanpinButton) {
        return new ButtonsConfigResponse(isShowSimButton, isShowTanpinButton);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonsConfigResponse)) {
            return false;
        }
        ButtonsConfigResponse buttonsConfigResponse = (ButtonsConfigResponse) other;
        return Intrinsics.areEqual(this.isShowSimButton, buttonsConfigResponse.isShowSimButton) && Intrinsics.areEqual(this.isShowTanpinButton, buttonsConfigResponse.isShowTanpinButton);
    }

    public int hashCode() {
        Boolean bool = this.isShowSimButton;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.isShowTanpinButton;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ButtonsConfigResponse(isShowSimButton=" + this.isShowSimButton + ", isShowTanpinButton=" + this.isShowTanpinButton + ")";
    }

    public ButtonsConfigResponse(@Nullable Boolean bool, @Nullable Boolean bool2) {
        this.isShowSimButton = bool;
        this.isShowTanpinButton = bool2;
    }

    public /* synthetic */ ButtonsConfigResponse(Boolean bool, Boolean bool2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : bool2);
    }

    @Nullable
    public final Boolean isShowSimButton() {
        return this.isShowSimButton;
    }

    @Nullable
    public final Boolean isShowTanpinButton() {
        return this.isShowTanpinButton;
    }
}
