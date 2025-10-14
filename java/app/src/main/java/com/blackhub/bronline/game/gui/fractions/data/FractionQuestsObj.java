package com.blackhub.bronline.game.gui.fractions.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FractionQuestObj.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class FractionQuestsObj {
    public static final int $stable = 8;

    @SerializedName("fractionTask")
    @Nullable
    public final List<FractionQuestsList> fractionQuests;

    public FractionQuestsObj() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FractionQuestsObj copy$default(FractionQuestsObj fractionQuestsObj, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = fractionQuestsObj.fractionQuests;
        }
        return fractionQuestsObj.copy(list);
    }

    @Nullable
    public final List<FractionQuestsList> component1() {
        return this.fractionQuests;
    }

    @NotNull
    public final FractionQuestsObj copy(@Nullable List<FractionQuestsList> fractionQuests) {
        return new FractionQuestsObj(fractionQuests);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof FractionQuestsObj) && Intrinsics.areEqual(this.fractionQuests, ((FractionQuestsObj) other).fractionQuests);
    }

    public int hashCode() {
        List<FractionQuestsList> list = this.fractionQuests;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @NotNull
    public String toString() {
        return "FractionQuestsObj(fractionQuests=" + this.fractionQuests + ")";
    }

    public FractionQuestsObj(@Nullable List<FractionQuestsList> list) {
        this.fractionQuests = list;
    }

    public /* synthetic */ FractionQuestsObj(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }

    @Nullable
    public final List<FractionQuestsList> getFractionQuests() {
        return this.fractionQuests;
    }
}

