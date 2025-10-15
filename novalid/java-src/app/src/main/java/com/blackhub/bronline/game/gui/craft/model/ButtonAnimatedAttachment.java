package com.blackhub.bronline.game.gui.craft.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ButtonAnimatedAttachment.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J'\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0007¨\u0006\u0012"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/ButtonAnimatedAttachment;", "", "isButtonsExpanded", "", "isWithIndicationCraft", "isWithIndicationStash", "(ZZZ)V", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
