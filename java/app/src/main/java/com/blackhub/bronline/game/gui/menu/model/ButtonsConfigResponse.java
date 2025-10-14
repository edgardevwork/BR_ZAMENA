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

