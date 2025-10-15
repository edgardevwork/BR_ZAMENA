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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcButtonModel;", "", "buttonText", "", "buttonId", "", "buttonKey", "(Ljava/lang/String;II)V", "getButtonId", "()I", "getButtonKey", "getButtonText", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
