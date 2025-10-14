package com.blackhub.bronline.game.gui.electric.state;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.enums.ColorTrafficLight;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.bless.client.R;
import com.fasterxml.jackson.core.p022io.schubfach.DoubleToDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CollectSchemeUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class CollectSchemeUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final ColorTrafficLight colorTrafficLight;
    public final int countHint;

    @NotNull
    public final List<GameInstructionsItem> gameInstructionsItemList;

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> instructionsAndHints;
    public final boolean isBlockingLoading;
    public final boolean isFirstGame;
    public final boolean isHandShow;
    public final boolean isHintShow;
    public final boolean isInstructionsShow;
    public final boolean isTimerStart;

    @Nullable
    public final Boolean isWin;

    /* compiled from: CollectSchemeUiState.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ColorTrafficLight.values().length];
            try {
                iArr[ColorTrafficLight.RED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ColorTrafficLight.YELLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ColorTrafficLight.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ColorTrafficLight.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CollectSchemeUiState() {
        this(null, null, false, false, false, 0, false, false, null, null, false, DoubleToDecimal.BQ_MASK, null);
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> component1() {
        return this.instructionsAndHints;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final ColorTrafficLight getColorTrafficLight() {
        return this.colorTrafficLight;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
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

    /* renamed from: component8, reason: from getter */
    public final boolean getIsTimerStart() {
        return this.isTimerStart;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Boolean getIsWin() {
        return this.isWin;
    }

    @NotNull
    public final CollectSchemeUiState copy(@NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, @NotNull List<GameInstructionsItem> gameInstructionsItemList, boolean isInstructionsShow, boolean isHintShow, boolean isHandShow, int countHint, boolean isFirstGame, boolean isTimerStart, @Nullable Boolean isWin, @NotNull ColorTrafficLight colorTrafficLight, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        Intrinsics.checkNotNullParameter(gameInstructionsItemList, "gameInstructionsItemList");
        Intrinsics.checkNotNullParameter(colorTrafficLight, "colorTrafficLight");
        return new CollectSchemeUiState(instructionsAndHints, gameInstructionsItemList, isInstructionsShow, isHintShow, isHandShow, countHint, isFirstGame, isTimerStart, isWin, colorTrafficLight, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CollectSchemeUiState)) {
            return false;
        }
        CollectSchemeUiState collectSchemeUiState = (CollectSchemeUiState) other;
        return Intrinsics.areEqual(this.instructionsAndHints, collectSchemeUiState.instructionsAndHints) && Intrinsics.areEqual(this.gameInstructionsItemList, collectSchemeUiState.gameInstructionsItemList) && this.isInstructionsShow == collectSchemeUiState.isInstructionsShow && this.isHintShow == collectSchemeUiState.isHintShow && this.isHandShow == collectSchemeUiState.isHandShow && this.countHint == collectSchemeUiState.countHint && this.isFirstGame == collectSchemeUiState.isFirstGame && this.isTimerStart == collectSchemeUiState.isTimerStart && Intrinsics.areEqual(this.isWin, collectSchemeUiState.isWin) && this.colorTrafficLight == collectSchemeUiState.colorTrafficLight && this.isBlockingLoading == collectSchemeUiState.isBlockingLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((this.instructionsAndHints.hashCode() * 31) + this.gameInstructionsItemList.hashCode()) * 31) + Boolean.hashCode(this.isInstructionsShow)) * 31) + Boolean.hashCode(this.isHintShow)) * 31) + Boolean.hashCode(this.isHandShow)) * 31) + Integer.hashCode(this.countHint)) * 31) + Boolean.hashCode(this.isFirstGame)) * 31) + Boolean.hashCode(this.isTimerStart)) * 31;
        Boolean bool = this.isWin;
        return ((((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.colorTrafficLight.hashCode()) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "CollectSchemeUiState(instructionsAndHints=" + this.instructionsAndHints + ", gameInstructionsItemList=" + this.gameInstructionsItemList + ", isInstructionsShow=" + this.isInstructionsShow + ", isHintShow=" + this.isHintShow + ", isHandShow=" + this.isHandShow + ", countHint=" + this.countHint + ", isFirstGame=" + this.isFirstGame + ", isTimerStart=" + this.isTimerStart + ", isWin=" + this.isWin + ", colorTrafficLight=" + this.colorTrafficLight + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public CollectSchemeUiState(@NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, @NotNull List<GameInstructionsItem> gameInstructionsItemList, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, @Nullable Boolean bool, @NotNull ColorTrafficLight colorTrafficLight, boolean z6) {
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        Intrinsics.checkNotNullParameter(gameInstructionsItemList, "gameInstructionsItemList");
        Intrinsics.checkNotNullParameter(colorTrafficLight, "colorTrafficLight");
        this.instructionsAndHints = instructionsAndHints;
        this.gameInstructionsItemList = gameInstructionsItemList;
        this.isInstructionsShow = z;
        this.isHintShow = z2;
        this.isHandShow = z3;
        this.countHint = i;
        this.isFirstGame = z4;
        this.isTimerStart = z5;
        this.isWin = bool;
        this.colorTrafficLight = colorTrafficLight;
        this.isBlockingLoading = z6;
    }

    public /* synthetic */ CollectSchemeUiState(List list, List list2, boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, Boolean bool, ColorTrafficLight colorTrafficLight, boolean z6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? false : z2, (i2 & 16) != 0 ? false : z3, (i2 & 32) != 0 ? 1 : i, (i2 & 64) != 0 ? false : z4, (i2 & 128) != 0 ? false : z5, (i2 & 256) != 0 ? null : bool, (i2 & 512) != 0 ? ColorTrafficLight.NONE : colorTrafficLight, (i2 & 1024) == 0 ? z6 : false);
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

    public final boolean isTimerStart() {
        return this.isTimerStart;
    }

    @Nullable
    public final Boolean isWin() {
        return this.isWin;
    }

    @NotNull
    public final ColorTrafficLight getColorTrafficLight() {
        return this.colorTrafficLight;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    @DrawableRes
    public final int getResourceColorTrafficLight() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.colorTrafficLight.ordinal()];
        if (i == 1) {
            return R.drawable.img_traffic_light_red;
        }
        if (i == 2) {
            return R.drawable.img_traffic_light_yellow;
        }
        if (i == 3) {
            return R.drawable.img_traffic_light_green;
        }
        if (i == 4) {
            return R.drawable.img_traffic_light;
        }
        throw new NoWhenBranchMatchedException();
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
        return this.isHintShow && this.countHint == 2;
    }

    public final float getElevationHintOne() {
        return (this.isHintShow && this.countHint == 1) ? 4.0f : 0.0f;
    }

    public final float getElevationHintTwo() {
        return (this.isHintShow && this.countHint == 2) ? 4.0f : 0.0f;
    }

    public final float getElevationHintThree() {
        return (this.isHintShow && this.countHint == 3) ? 4.0f : 0.0f;
    }

    public final float getElevationHint() {
        return (this.isHintShow && this.countHint == 3) ? 10.0f : 2.0f;
    }

    public final boolean isHintBtnCloseVisible() {
        return !this.isFirstGame || this.countHint == 3;
    }
}

