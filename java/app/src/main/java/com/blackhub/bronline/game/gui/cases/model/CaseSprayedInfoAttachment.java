package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CaseSprayedInfoAttachment.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class CaseSprayedInfoAttachment {
    public static final int $stable = 8;

    @NotNull
    public final List<Integer> notSprayedRewardIdList;

    @NotNull
    public final List<Integer> sprayedRewardIdList;

    public CaseSprayedInfoAttachment() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaseSprayedInfoAttachment copy$default(CaseSprayedInfoAttachment caseSprayedInfoAttachment, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = caseSprayedInfoAttachment.notSprayedRewardIdList;
        }
        if ((i & 2) != 0) {
            list2 = caseSprayedInfoAttachment.sprayedRewardIdList;
        }
        return caseSprayedInfoAttachment.copy(list, list2);
    }

    @NotNull
    public final List<Integer> component1() {
        return this.notSprayedRewardIdList;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.sprayedRewardIdList;
    }

    @NotNull
    public final CaseSprayedInfoAttachment copy(@NotNull List<Integer> notSprayedRewardIdList, @NotNull List<Integer> sprayedRewardIdList) {
        Intrinsics.checkNotNullParameter(notSprayedRewardIdList, "notSprayedRewardIdList");
        Intrinsics.checkNotNullParameter(sprayedRewardIdList, "sprayedRewardIdList");
        return new CaseSprayedInfoAttachment(notSprayedRewardIdList, sprayedRewardIdList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CaseSprayedInfoAttachment)) {
            return false;
        }
        CaseSprayedInfoAttachment caseSprayedInfoAttachment = (CaseSprayedInfoAttachment) other;
        return Intrinsics.areEqual(this.notSprayedRewardIdList, caseSprayedInfoAttachment.notSprayedRewardIdList) && Intrinsics.areEqual(this.sprayedRewardIdList, caseSprayedInfoAttachment.sprayedRewardIdList);
    }

    public int hashCode() {
        return (this.notSprayedRewardIdList.hashCode() * 31) + this.sprayedRewardIdList.hashCode();
    }

    @NotNull
    public String toString() {
        return "CaseSprayedInfoAttachment(notSprayedRewardIdList=" + this.notSprayedRewardIdList + ", sprayedRewardIdList=" + this.sprayedRewardIdList + ")";
    }

    public CaseSprayedInfoAttachment(@NotNull List<Integer> notSprayedRewardIdList, @NotNull List<Integer> sprayedRewardIdList) {
        Intrinsics.checkNotNullParameter(notSprayedRewardIdList, "notSprayedRewardIdList");
        Intrinsics.checkNotNullParameter(sprayedRewardIdList, "sprayedRewardIdList");
        this.notSprayedRewardIdList = notSprayedRewardIdList;
        this.sprayedRewardIdList = sprayedRewardIdList;
    }

    public /* synthetic */ CaseSprayedInfoAttachment(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }

    @NotNull
    public final List<Integer> getNotSprayedRewardIdList() {
        return this.notSprayedRewardIdList;
    }

    @NotNull
    public final List<Integer> getSprayedRewardIdList() {
        return this.sprayedRewardIdList;
    }
}

