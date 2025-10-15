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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/socialaction/data/SocialInteractionList;", "", "arraySocialInteraction", "", "Lcom/blackhub/bronline/game/gui/socialaction/data/SocialInteraction;", "(Ljava/util/List;)V", "getArraySocialInteraction", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
