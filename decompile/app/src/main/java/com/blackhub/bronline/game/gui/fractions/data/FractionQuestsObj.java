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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0011\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\t\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsObj;", "", "fractionQuests", "", "Lcom/blackhub/bronline/game/gui/fractions/data/FractionQuestsList;", "(Ljava/util/List;)V", "getFractionQuests", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
