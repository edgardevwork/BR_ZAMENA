package com.blackhub.bronline.game.gui.cases.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CasesBannerAttachment.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class CasesBannerSelectedCase {
    public static final int $stable = 8;

    @NotNull
    public final String caseImage;

    @NotNull
    public final String caseNameBottom;

    @NotNull
    public final String caseNameTop;

    @NotNull
    public final List<CaseReward> rewards;

    public CasesBannerSelectedCase() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CasesBannerSelectedCase copy$default(CasesBannerSelectedCase casesBannerSelectedCase, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = casesBannerSelectedCase.rewards;
        }
        if ((i & 2) != 0) {
            str = casesBannerSelectedCase.caseImage;
        }
        if ((i & 4) != 0) {
            str2 = casesBannerSelectedCase.caseNameTop;
        }
        if ((i & 8) != 0) {
            str3 = casesBannerSelectedCase.caseNameBottom;
        }
        return casesBannerSelectedCase.copy(list, str, str2, str3);
    }

    @NotNull
    public final List<CaseReward> component1() {
        return this.rewards;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCaseImage() {
        return this.caseImage;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getCaseNameTop() {
        return this.caseNameTop;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getCaseNameBottom() {
        return this.caseNameBottom;
    }

    @NotNull
    public final CasesBannerSelectedCase copy(@NotNull List<CaseReward> rewards, @NotNull String caseImage, @NotNull String caseNameTop, @NotNull String caseNameBottom) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(caseImage, "caseImage");
        Intrinsics.checkNotNullParameter(caseNameTop, "caseNameTop");
        Intrinsics.checkNotNullParameter(caseNameBottom, "caseNameBottom");
        return new CasesBannerSelectedCase(rewards, caseImage, caseNameTop, caseNameBottom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CasesBannerSelectedCase)) {
            return false;
        }
        CasesBannerSelectedCase casesBannerSelectedCase = (CasesBannerSelectedCase) other;
        return Intrinsics.areEqual(this.rewards, casesBannerSelectedCase.rewards) && Intrinsics.areEqual(this.caseImage, casesBannerSelectedCase.caseImage) && Intrinsics.areEqual(this.caseNameTop, casesBannerSelectedCase.caseNameTop) && Intrinsics.areEqual(this.caseNameBottom, casesBannerSelectedCase.caseNameBottom);
    }

    public int hashCode() {
        return (((((this.rewards.hashCode() * 31) + this.caseImage.hashCode()) * 31) + this.caseNameTop.hashCode()) * 31) + this.caseNameBottom.hashCode();
    }

    @NotNull
    public String toString() {
        return "CasesBannerSelectedCase(rewards=" + this.rewards + ", caseImage=" + this.caseImage + ", caseNameTop=" + this.caseNameTop + ", caseNameBottom=" + this.caseNameBottom + ")";
    }

    public CasesBannerSelectedCase(@NotNull List<CaseReward> rewards, @NotNull String caseImage, @NotNull String caseNameTop, @NotNull String caseNameBottom) {
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        Intrinsics.checkNotNullParameter(caseImage, "caseImage");
        Intrinsics.checkNotNullParameter(caseNameTop, "caseNameTop");
        Intrinsics.checkNotNullParameter(caseNameBottom, "caseNameBottom");
        this.rewards = rewards;
        this.caseImage = caseImage;
        this.caseNameTop = caseNameTop;
        this.caseNameBottom = caseNameBottom;
    }

    public /* synthetic */ CasesBannerSelectedCase(List list, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3);
    }

    @NotNull
    public final List<CaseReward> getRewards() {
        return this.rewards;
    }

    @NotNull
    public final String getCaseImage() {
        return this.caseImage;
    }

    @NotNull
    public final String getCaseNameTop() {
        return this.caseNameTop;
    }

    @NotNull
    public final String getCaseNameBottom() {
        return this.caseNameBottom;
    }
}

