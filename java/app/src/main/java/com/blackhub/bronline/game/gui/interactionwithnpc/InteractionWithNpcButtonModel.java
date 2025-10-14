package com.blackhub.bronline.game.gui.interactionwithnpc;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.admintools.AdminToolsKeys;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InteractionWithNpcButtonModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class InteractionWithNpcButtonModel {
    public static final int $stable = 0;

    @SerializedName(AdminToolsKeys.ADMIN_TOOLS_BUTTONS_ARRAY_KEY)
    public final int buttonId;

    @SerializedName(InteractionWithNpcKeys.INTERACTION_WITH_NPC_BUTTON_KEY)
    public final int buttonKey;

    @SerializedName("bn")
    @NotNull
    public final String buttonText;

    public InteractionWithNpcButtonModel() {
        this(null, 0, 0, 7, null);
    }

    public static /* synthetic */ InteractionWithNpcButtonModel copy$default(InteractionWithNpcButtonModel interactionWithNpcButtonModel, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = interactionWithNpcButtonModel.buttonText;
        }
        if ((i3 & 2) != 0) {
            i = interactionWithNpcButtonModel.buttonId;
        }
        if ((i3 & 4) != 0) {
            i2 = interactionWithNpcButtonModel.buttonKey;
        }
        return interactionWithNpcButtonModel.copy(str, i, i2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getButtonText() {
        return this.buttonText;
    }

    /* renamed from: component2, reason: from getter */
    public final int getButtonId() {
        return this.buttonId;
    }

    /* renamed from: component3, reason: from getter */
    public final int getButtonKey() {
        return this.buttonKey;
    }

    @NotNull
    public final InteractionWithNpcButtonModel copy(@NotNull String buttonText, int buttonId, int buttonKey) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        return new InteractionWithNpcButtonModel(buttonText, buttonId, buttonKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionWithNpcButtonModel)) {
            return false;
        }
        InteractionWithNpcButtonModel interactionWithNpcButtonModel = (InteractionWithNpcButtonModel) other;
        return Intrinsics.areEqual(this.buttonText, interactionWithNpcButtonModel.buttonText) && this.buttonId == interactionWithNpcButtonModel.buttonId && this.buttonKey == interactionWithNpcButtonModel.buttonKey;
    }

    public int hashCode() {
        return (((this.buttonText.hashCode() * 31) + Integer.hashCode(this.buttonId)) * 31) + Integer.hashCode(this.buttonKey);
    }

    @NotNull
    public String toString() {
        return "InteractionWithNpcButtonModel(buttonText=" + this.buttonText + ", buttonId=" + this.buttonId + ", buttonKey=" + this.buttonKey + ")";
    }

    public InteractionWithNpcButtonModel(@NotNull String buttonText, int i, int i2) {
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.buttonText = buttonText;
        this.buttonId = i;
        this.buttonKey = i2;
    }

    public /* synthetic */ InteractionWithNpcButtonModel(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? -1 : i2);
    }

    @NotNull
    public final String getButtonText() {
        return this.buttonText;
    }

    public final int getButtonId() {
        return this.buttonId;
    }

    public final int getButtonKey() {
        return this.buttonKey;
    }
}

