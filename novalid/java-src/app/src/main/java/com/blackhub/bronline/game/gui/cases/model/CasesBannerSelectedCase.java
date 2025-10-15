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
@Metadata(m7104d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/cases/model/CasesBannerSelectedCase;", "", "rewards", "", "Lcom/blackhub/bronline/game/gui/cases/model/CaseReward;", "caseImage", "", "caseNameTop", "caseNameBottom", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCaseImage", "()Ljava/lang/String;", "getCaseNameBottom", "getCaseNameTop", "getRewards", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
