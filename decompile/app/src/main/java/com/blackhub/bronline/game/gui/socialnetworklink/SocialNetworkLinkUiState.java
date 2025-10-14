package com.blackhub.bronline.game.gui.socialnetworklink;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.socialnetworklink.data.SocialButtonObj;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SocialNetworkLinkUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\tR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/socialnetworklink/SocialNetworkLinkUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "socialButtons", "", "Lcom/blackhub/bronline/game/gui/socialnetworklink/data/SocialButtonObj;", "isActiveCheckbox", "", "isNeedClose", "(Ljava/util/List;ZZ)V", "()Z", "getSocialButtons", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SocialNetworkLinkUiState implements UiState {
    public static final int $stable = 8;
    public final boolean isActiveCheckbox;
    public final boolean isNeedClose;

    @NotNull
    public final List<SocialButtonObj> socialButtons;

    public SocialNetworkLinkUiState() {
        this(null, false, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialNetworkLinkUiState copy$default(SocialNetworkLinkUiState socialNetworkLinkUiState, List list, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = socialNetworkLinkUiState.socialButtons;
        }
        if ((i & 2) != 0) {
            z = socialNetworkLinkUiState.isActiveCheckbox;
        }
        if ((i & 4) != 0) {
            z2 = socialNetworkLinkUiState.isNeedClose;
        }
        return socialNetworkLinkUiState.copy(list, z, z2);
    }

    @NotNull
    public final List<SocialButtonObj> component1() {
        return this.socialButtons;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsActiveCheckbox() {
        return this.isActiveCheckbox;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final SocialNetworkLinkUiState copy(@NotNull List<SocialButtonObj> socialButtons, boolean isActiveCheckbox, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(socialButtons, "socialButtons");
        return new SocialNetworkLinkUiState(socialButtons, isActiveCheckbox, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialNetworkLinkUiState)) {
            return false;
        }
        SocialNetworkLinkUiState socialNetworkLinkUiState = (SocialNetworkLinkUiState) other;
        return Intrinsics.areEqual(this.socialButtons, socialNetworkLinkUiState.socialButtons) && this.isActiveCheckbox == socialNetworkLinkUiState.isActiveCheckbox && this.isNeedClose == socialNetworkLinkUiState.isNeedClose;
    }

    public int hashCode() {
        return (((this.socialButtons.hashCode() * 31) + Boolean.hashCode(this.isActiveCheckbox)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "SocialNetworkLinkUiState(socialButtons=" + this.socialButtons + ", isActiveCheckbox=" + this.isActiveCheckbox + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public SocialNetworkLinkUiState(@NotNull List<SocialButtonObj> socialButtons, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(socialButtons, "socialButtons");
        this.socialButtons = socialButtons;
        this.isActiveCheckbox = z;
        this.isNeedClose = z2;
    }

    public /* synthetic */ SocialNetworkLinkUiState(List list, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    @NotNull
    public final List<SocialButtonObj> getSocialButtons() {
        return this.socialButtons;
    }

    public final boolean isActiveCheckbox() {
        return this.isActiveCheckbox;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}
