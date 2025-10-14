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

