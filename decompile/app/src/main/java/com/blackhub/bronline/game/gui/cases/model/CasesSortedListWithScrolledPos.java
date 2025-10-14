package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesSortedListWithScrolledPos.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0002\u0010\u0006J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J#\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/CasesSortedListWithScrolledPos;", "", "sortedRewards", "", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "scrolledReward", "(Ljava/util/List;Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;)V", "getScrolledReward", "()Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "getSortedRewards", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class CasesSortedListWithScrolledPos {
    public static final int $stable = 8;

    @NotNull
    public final CaseReward scrolledReward;

    @NotNull
    public final List<CaseReward> sortedRewards;

    public CasesSortedListWithScrolledPos() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CasesSortedListWithScrolledPos copy$default(CasesSortedListWithScrolledPos casesSortedListWithScrolledPos, List list, CaseReward caseReward, int i, Object obj) {
        if ((i & 1) != 0) {
            list = casesSortedListWithScrolledPos.sortedRewards;
        }
        if ((i & 2) != 0) {
            caseReward = casesSortedListWithScrolledPos.scrolledReward;
        }
        return casesSortedListWithScrolledPos.copy(list, caseReward);
    }

    @NotNull
    public final List<CaseReward> component1() {
        return this.sortedRewards;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CaseReward getScrolledReward() {
        return this.scrolledReward;
    }

    @NotNull
    public final CasesSortedListWithScrolledPos copy(@NotNull List<CaseReward> sortedRewards, @NotNull CaseReward scrolledReward) {
        Intrinsics.checkNotNullParameter(sortedRewards, "sortedRewards");
        Intrinsics.checkNotNullParameter(scrolledReward, "scrolledReward");
        return new CasesSortedListWithScrolledPos(sortedRewards, scrolledReward);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesSortedListWithScrolledPos)) {
            return false;
        }
        CasesSortedListWithScrolledPos casesSortedListWithScrolledPos = (CasesSortedListWithScrolledPos) other;
        return Intrinsics.areEqual(this.sortedRewards, casesSortedListWithScrolledPos.sortedRewards) && Intrinsics.areEqual(this.scrolledReward, casesSortedListWithScrolledPos.scrolledReward);
    }

    public int hashCode() {
        return (this.sortedRewards.hashCode() * 31) + this.scrolledReward.hashCode();
    }

    @NotNull
    public String toString() {
        return "CasesSortedListWithScrolledPos(sortedRewards=" + this.sortedRewards + ", scrolledReward=" + this.scrolledReward + ")";
    }

    public CasesSortedListWithScrolledPos(@NotNull List<CaseReward> sortedRewards, @NotNull CaseReward scrolledReward) {
        Intrinsics.checkNotNullParameter(sortedRewards, "sortedRewards");
        Intrinsics.checkNotNullParameter(scrolledReward, "scrolledReward");
        this.sortedRewards = sortedRewards;
        this.scrolledReward = scrolledReward;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ CasesSortedListWithScrolledPos(java.util.List r23, com.blackhub.bronline.game.gui.cases.model.CaseReward r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r22 = this;
            r0 = r25 & 1
            if (r0 == 0) goto L9
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            goto Lb
        L9:
            r0 = r23
        Lb:
            r1 = r25 & 2
            if (r1 == 0) goto L32
            com.blackhub.bronline.game.gui.cases.model.CaseReward r1 = new com.blackhub.bronline.game.gui.cases.model.CaseReward
            r2 = r1
            r20 = 131071(0x1ffff, float:1.8367E-40)
            r21 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r2 = r22
            goto L36
        L32:
            r2 = r22
            r1 = r24
        L36:
            r2.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blackhub.bronline.game.gui.cases.model.CasesSortedListWithScrolledPos.<init>(java.util.List, com.blackhub.bronline.game.gui.cases.model.CaseReward, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @NotNull
    public final List<CaseReward> getSortedRewards() {
        return this.sortedRewards;
    }

    @NotNull
    public final CaseReward getScrolledReward() {
        return this.scrolledReward;
    }
}
