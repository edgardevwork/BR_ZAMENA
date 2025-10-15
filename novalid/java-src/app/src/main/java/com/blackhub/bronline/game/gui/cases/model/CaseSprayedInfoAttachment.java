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
@Metadata(m7104d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/CaseSprayedInfoAttachment;", "", "notSprayedRewardIdList", "", "", "sprayedRewardIdList", "(Ljava/util/List;Ljava/util/List;)V", "getNotSprayedRewardIdList", "()Ljava/util/List;", "getSprayedRewardIdList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
