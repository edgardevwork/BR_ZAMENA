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
@Metadata(m7104d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\b¢\u0006\u0002\u0010\u0013J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0011HÆ\u0003J\t\u00102\u001a\u00020\bHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\bHÆ\u0003J\t\u00106\u001a\u00020\bHÆ\u0003J\t\u00107\u001a\u00020\fHÆ\u0003J\t\u00108\u001a\u00020\bHÆ\u0003J\t\u00109\u001a\u00020\bHÆ\u0003J\u0010\u0010:\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010,J\u008a\u0001\u0010;\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010<J\u0013\u0010=\u001a\u00020\b2\b\u0010>\u001a\u0004\u0018\u00010?HÖ\u0003J\t\u0010@\u001a\u00020\fHÖ\u0001J\t\u0010A\u001a\u00020%HÖ\u0001R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001bR\u0011\u0010 \u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b!\u0010\u001bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u0012\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010)R\u0011\u0010\r\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010)R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010)R\u0011\u0010*\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b*\u0010)R\u0011\u0010+\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010)R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010)R\u0011\u0010\u000e\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010)R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010-\u001a\u0004\b\u000f\u0010,R\u0011\u0010.\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b/\u0010\u0017¨\u0006B"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/state/CollectSchemeUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "instructionsAndHints", "", "Lcom/blackhub/bronline/game/gui/electric/model/ElectricInstructionsAndHintsModel;", "gameInstructionsItemList", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "isInstructionsShow", "", "isHintShow", "isHandShow", "countHint", "", "isFirstGame", "isTimerStart", "isWin", "colorTrafficLight", "Lcom/blackhub/bronline/game/gui/electric/enums/ColorTrafficLight;", "isBlockingLoading", "(Ljava/util/List;Ljava/util/List;ZZZIZZLjava/lang/Boolean;Lcom/blackhub/bronline/game/gui/electric/enums/ColorTrafficLight;Z)V", "getColorTrafficLight", "()Lcom/blackhub/bronline/game/gui/electric/enums/ColorTrafficLight;", "getCountHint", "()I", "elevationHint", "", "getElevationHint", "()F", "elevationHintOne", "getElevationHintOne", "elevationHintThree", "getElevationHintThree", "elevationHintTwo", "getElevationHintTwo", "getGameInstructionsItemList", "()Ljava/util/List;", "hintText", "", "getHintText", "()Ljava/lang/String;", "getInstructionsAndHints", "()Z", "isHandViewShow", "isHintBtnCloseVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "resourceColorTrafficLight", "getResourceColorTrafficLight", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;ZZZIZZLjava/lang/Boolean;Lcom/blackhub/bronline/game/gui/electric/enums/ColorTrafficLight;Z)Lcom/blackhub/bronline/game/gui/electric/state/CollectSchemeUiState;", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
