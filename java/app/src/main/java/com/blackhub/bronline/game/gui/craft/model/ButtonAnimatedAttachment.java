package com.blackhub.bronline.game.gui.craft.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ButtonAnimatedAttachment.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class ButtonAnimatedAttachment {
    public static final int $stable = 0;
    public final boolean isButtonsExpanded;
    public final boolean isWithIndicationCraft;
    public final boolean isWithIndicationStash;

    public ButtonAnimatedAttachment() {
        this(false, false, false, 7, null);
    }

    public static /* synthetic */ ButtonAnimatedAttachment copy$default(ButtonAnimatedAttachment buttonAnimatedAttachment, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = buttonAnimatedAttachment.isButtonsExpanded;
        }
        if ((i & 2) != 0) {
            z2 = buttonAnimatedAttachment.isWithIndicationCraft;
        }
        if ((i & 4) != 0) {
            z3 = buttonAnimatedAttachment.isWithIndicationStash;
        }
        return buttonAnimatedAttachment.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsButtonsExpanded() {
        return this.isButtonsExpanded;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsWithIndicationCraft() {
        return this.isWithIndicationCraft;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsWithIndicationStash() {
        return this.isWithIndicationStash;
    }

    @NotNull
    public final ButtonAnimatedAttachment copy(boolean isButtonsExpanded, boolean isWithIndicationCraft, boolean isWithIndicationStash) {
        return new ButtonAnimatedAttachment(isButtonsExpanded, isWithIndicationCraft, isWithIndicationStash);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonAnimatedAttachment)) {
            return false;
        }
        ButtonAnimatedAttachment buttonAnimatedAttachment = (ButtonAnimatedAttachment) other;
        return this.isButtonsExpanded == buttonAnimatedAttachment.isButtonsExpanded && this.isWithIndicationCraft == buttonAnimatedAttachment.isWithIndicationCraft && this.isWithIndicationStash == buttonAnimatedAttachment.isWithIndicationStash;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isButtonsExpanded) * 31) + Boolean.hashCode(this.isWithIndicationCraft)) * 31) + Boolean.hashCode(this.isWithIndicationStash);
    }

    @NotNull
    public String toString() {
        return "ButtonAnimatedAttachment(isButtonsExpanded=" + this.isButtonsExpanded + ", isWithIndicationCraft=" + this.isWithIndicationCraft + ", isWithIndicationStash=" + this.isWithIndicationStash + ")";
    }

    public ButtonAnimatedAttachment(boolean z, boolean z2, boolean z3) {
        this.isButtonsExpanded = z;
        this.isWithIndicationCraft = z2;
        this.isWithIndicationStash = z3;
    }

    public /* synthetic */ ButtonAnimatedAttachment(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    public final boolean isButtonsExpanded() {
        return this.isButtonsExpanded;
    }

    public final boolean isWithIndicationCraft() {
        return this.isWithIndicationCraft;
    }

    public final boolean isWithIndicationStash() {
        return this.isWithIndicationStash;
    }
}

