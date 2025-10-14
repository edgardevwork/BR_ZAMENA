package com.blackhub.bronline.game.gui.electric.state;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RaiseChargeUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class RaiseChargeUiState implements UiState {
    public static final int $stable = 8;
    public final int count;
    public final int countHint;

    @NotNull
    public final List<GameInstructionsItem> gameInstructionsItemList;

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> instructionsAndHints;
    public final boolean isFirstGame;
    public final boolean isHandShow;
    public final boolean isHintShow;
    public final boolean isInstructionsShow;

    @Nullable
    public final Boolean isWin;

    public RaiseChargeUiState() {
        this(null, null, false, false, false, 0, false, null, 0, 511, null);
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> component1() {
        return this.instructionsAndHints;
    }

    @NotNull
    public final List<GameInstructionsItem> component2() {
        return this.gameInstructionsItemList;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsInstructionsShow() {
        return this.isInstructionsShow;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsHintShow() {
        return this.isHintShow;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsHandShow() {
        return this.isHandShow;
    }

    /* renamed from: component6, reason: from getter */
    public final int getCountHint() {
        return this.countHint;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsFirstGame() {
        return this.isFirstGame;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsWin() {
        return this.isWin;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final RaiseChargeUiState copy(@NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, @NotNull List<GameInstructionsItem> gameInstructionsItemList, boolean isInstructionsShow, boolean isHintShow, boolean isHandShow, int countHint, boolean isFirstGame, @Nullable Boolean isWin, int i) {
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        Intrinsics.checkNotNullParameter(gameInstructionsItemList, "gameInstructionsItemList");
        return new RaiseChargeUiState(instructionsAndHints, gameInstructionsItemList, isInstructionsShow, isHintShow, isHandShow, countHint, isFirstGame, isWin, i);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RaiseChargeUiState)) {
            return false;
        }
        RaiseChargeUiState raiseChargeUiState = (RaiseChargeUiState) other;
        return Intrinsics.areEqual(this.instructionsAndHints, raiseChargeUiState.instructionsAndHints) && Intrinsics.areEqual(this.gameInstructionsItemList, raiseChargeUiState.gameInstructionsItemList) && this.isInstructionsShow == raiseChargeUiState.isInstructionsShow && this.isHintShow == raiseChargeUiState.isHintShow && this.isHandShow == raiseChargeUiState.isHandShow && this.countHint == raiseChargeUiState.countHint && this.isFirstGame == raiseChargeUiState.isFirstGame && Intrinsics.areEqual(this.isWin, raiseChargeUiState.isWin) && this.count == raiseChargeUiState.count;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.instructionsAndHints.hashCode() * 31) + this.gameInstructionsItemList.hashCode()) * 31) + Boolean.hashCode(this.isInstructionsShow)) * 31) + Boolean.hashCode(this.isHintShow)) * 31) + Boolean.hashCode(this.isHandShow)) * 31) + Integer.hashCode(this.countHint)) * 31) + Boolean.hashCode(this.isFirstGame)) * 31;
        Boolean bool = this.isWin;
        return ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Integer.hashCode(this.count);
    }

    @NotNull
    public String toString() {
        return "RaiseChargeUiState(instructionsAndHints=" + this.instructionsAndHints + ", gameInstructionsItemList=" + this.gameInstructionsItemList + ", isInstructionsShow=" + this.isInstructionsShow + ", isHintShow=" + this.isHintShow + ", isHandShow=" + this.isHandShow + ", countHint=" + this.countHint + ", isFirstGame=" + this.isFirstGame + ", isWin=" + this.isWin + ", count=" + this.count + ")";
    }

    public RaiseChargeUiState(@NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, @NotNull List<GameInstructionsItem> gameInstructionsItemList, boolean z, boolean z2, boolean z3, int i, boolean z4, @Nullable Boolean bool, int i2) {
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        Intrinsics.checkNotNullParameter(gameInstructionsItemList, "gameInstructionsItemList");
        this.instructionsAndHints = instructionsAndHints;
        this.gameInstructionsItemList = gameInstructionsItemList;
        this.isInstructionsShow = z;
        this.isHintShow = z2;
        this.isHandShow = z3;
        this.countHint = i;
        this.isFirstGame = z4;
        this.isWin = bool;
        this.count = i2;
    }

    public /* synthetic */ RaiseChargeUiState(List list, List list2, boolean z, boolean z2, boolean z3, int i, boolean z4, Boolean bool, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? true : z3, (i3 & 32) != 0 ? 1 : i, (i3 & 64) == 0 ? z4 : false, (i3 & 128) != 0 ? null : bool, (i3 & 256) == 0 ? i2 : 1);
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> getInstructionsAndHints() {
        return this.instructionsAndHints;
    }

    @NotNull
    public final List<GameInstructionsItem> getGameInstructionsItemList() {
        return this.gameInstructionsItemList;
    }

    public final boolean isInstructionsShow() {
        return this.isInstructionsShow;
    }

    public final boolean isHintShow() {
        return this.isHintShow;
    }

    public final boolean isHandShow() {
        return this.isHandShow;
    }

    public final int getCountHint() {
        return this.countHint;
    }

    public final boolean isFirstGame() {
        return this.isFirstGame;
    }

    @Nullable
    public final Boolean isWin() {
        return this.isWin;
    }

    public final int getCount() {
        return this.count;
    }

    @NotNull
    public final String getHintText() {
        List<String> textHintList;
        String str;
        List<String> textHintList2;
        String str2;
        List<String> textHintList3;
        String str3;
        int i = this.countHint;
        if (i == 1) {
            ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
            return (electricInstructionsAndHintsModel == null || (textHintList = electricInstructionsAndHintsModel.getTextHintList()) == null || (str = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList, 0)) == null) ? AnyExtensionKt.empty(this) : str;
        }
        if (i == 2) {
            ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel2 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
            return (electricInstructionsAndHintsModel2 == null || (textHintList2 = electricInstructionsAndHintsModel2.getTextHintList()) == null || (str2 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList2, 1)) == null) ? AnyExtensionKt.empty(this) : str2;
        }
        if (i == 3) {
            ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel3 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
            return (electricInstructionsAndHintsModel3 == null || (textHintList3 = electricInstructionsAndHintsModel3.getTextHintList()) == null || (str3 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList3, 2)) == null) ? AnyExtensionKt.empty(this) : str3;
        }
        return AnyExtensionKt.empty(this);
    }

    public final boolean isHandViewShow() {
        return this.isHintShow && this.countHint != 3 && this.isHandShow;
    }

    public final int getPbForGamesVisibility() {
        return (this.isHintShow && this.countHint == 3) ? 4 : 0;
    }

    public final int getPbForHintVisibility() {
        return (this.isHintShow && this.countHint == 3) ? 0 : 4;
    }

    public final float getElevationHintTwoOrThree() {
        int i;
        return (this.isHintShow && ((i = this.countHint) == 2 || i == 3)) ? 4.0f : 0.0f;
    }

    public final boolean isHintBtnCloseVisible() {
        return !this.isFirstGame || this.countHint == 3;
    }

    public final boolean isBtnRaiseEnable() {
        int i;
        return (this.isHintShow && ((i = this.countHint) == 2 || i == 3)) ? false : true;
    }

    public final boolean isBtnAttachEnable() {
        return (this.isHintShow && this.countHint == 3) ? false : true;
    }
}

