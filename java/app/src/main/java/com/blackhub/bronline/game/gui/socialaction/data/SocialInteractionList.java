package com.blackhub.bronline.game.gui.socialaction.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SocialInteractionList.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class SocialInteractionList {
    public static final int $stable = 8;

    @SerializedName("array")
    @NotNull
    public final List<SocialInteraction> arraySocialInteraction;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialInteractionList copy$default(SocialInteractionList socialInteractionList, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = socialInteractionList.arraySocialInteraction;
        }
        return socialInteractionList.copy(list);
    }

    @NotNull
    public final List<SocialInteraction> component1() {
        return this.arraySocialInteraction;
    }

    @NotNull
    public final SocialInteractionList copy(@NotNull List<SocialInteraction> arraySocialInteraction) {
        Intrinsics.checkNotNullParameter(arraySocialInteraction, "arraySocialInteraction");
        return new SocialInteractionList(arraySocialInteraction);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SocialInteractionList) && Intrinsics.areEqual(this.arraySocialInteraction, ((SocialInteractionList) other).arraySocialInteraction);
    }

    public int hashCode() {
        return this.arraySocialInteraction.hashCode();
    }

    @NotNull
    public String toString() {
        return "SocialInteractionList(arraySocialInteraction=" + this.arraySocialInteraction + ")";
    }

    public SocialInteractionList(@NotNull List<SocialInteraction> arraySocialInteraction) {
        Intrinsics.checkNotNullParameter(arraySocialInteraction, "arraySocialInteraction");
        this.arraySocialInteraction = arraySocialInteraction;
    }

    @NotNull
    public final List<SocialInteraction> getArraySocialInteraction() {
        return this.arraySocialInteraction;
    }
}

