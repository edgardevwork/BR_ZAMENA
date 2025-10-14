package com.blackhub.bronline.game.gui.electric.state;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SumContactsUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bï\u0001\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\b\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\b¢\u0006\u0002\u0010\u001dJ\u000f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010P\u001a\u00020\fHÆ\u0003J\t\u0010Q\u001a\u00020\fHÆ\u0003J\t\u0010R\u001a\u00020\fHÆ\u0003J\t\u0010S\u001a\u00020\fHÆ\u0003J\t\u0010T\u001a\u00020\fHÆ\u0003J\t\u0010U\u001a\u00020\fHÆ\u0003J\t\u0010V\u001a\u00020\fHÆ\u0003J\t\u0010W\u001a\u00020\bHÆ\u0003J\t\u0010X\u001a\u00020\bHÆ\u0003J\t\u0010Y\u001a\u00020\bHÆ\u0003J\u000f\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010[\u001a\u00020\bHÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010GJ\t\u0010]\u001a\u00020\bHÆ\u0003J\t\u0010^\u001a\u00020\bHÆ\u0003J\t\u0010_\u001a\u00020\bHÆ\u0003J\t\u0010`\u001a\u00020\bHÆ\u0003J\t\u0010a\u001a\u00020\fHÆ\u0003J\t\u0010b\u001a\u00020\fHÆ\u0003J\t\u0010c\u001a\u00020\fHÆ\u0003J\t\u0010d\u001a\u00020\fHÆ\u0003Jø\u0001\u0010e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\f2\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\b2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u001c\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010fJ\u0013\u0010g\u001a\u00020\b2\b\u0010h\u001a\u0004\u0018\u00010iHÖ\u0003J\t\u0010j\u001a\u00020\fHÖ\u0001J\t\u0010k\u001a\u000207HÖ\u0001R\u0011\u0010\u001e\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0011\u0010#\u001a\u00020\f8G¢\u0006\u0006\u001a\u0004\b$\u0010 R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010 R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b'\u0010 R\u0011\u0010\u0016\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b(\u0010 R\u0011\u0010)\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b*\u0010 R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b+\u0010 R\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0011\u00102\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b:\u00105R\u0011\u0010\u001c\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010;R\u0011\u0010\u0017\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010;R\u0011\u0010\u0019\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010;R\u0011\u0010\u0018\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010;R\u0011\u0010\u001a\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010;R\u0011\u0010<\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b<\u0010;R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010;R\u0011\u0010=\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b=\u0010;R\u0011\u0010>\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b>\u0010;R\u0011\u0010?\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b?\u0010;R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010;R\u0011\u0010@\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\b@\u0010;R\u0011\u0010A\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bA\u0010;R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010;R\u0011\u0010B\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bB\u0010;R\u0014\u0010C\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010;R\u0014\u0010D\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bD\u0010;R\u0011\u0010E\u001a\u00020\b8F¢\u0006\u0006\u001a\u0004\bE\u0010;R\u0014\u0010F\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bF\u0010;R\u0015\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010H\u001a\u0004\b\u001b\u0010GR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bI\u0010 R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010 R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bK\u0010 R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bL\u0010 R\u0011\u0010\u0015\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bM\u0010 R\u0011\u0010\u0014\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bN\u0010 ¨\u0006l"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/state/SumContactsUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "instructionsAndHints", "", "Lcom/blackhub/bronline/game/gui/electric/model/ElectricInstructionsAndHintsModel;", "gameInstructionsItemList", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "isInstructionsShow", "", "isHintShow", "isHandShow", "countHint", "", "sumOne", "sumTwo", "sumThree", "bulbTextOne", "bulbTextTwo", "bulbTextThree", "textOne", "textTwo", "textThree", "countError", "isBulbOneOnTarget", "isBulbTwoOnTarget", "isBulbThreeOnTarget", "isFirstGame", "isWin", "isBlockingLoading", "(Ljava/util/List;Ljava/util/List;ZZZIIIIIIIIIIIZZZZLjava/lang/Boolean;Z)V", "backCubeOne", "getBackCubeOne", "()I", "backCubeThree", "getBackCubeThree", "backCubeTwo", "getBackCubeTwo", "getBulbTextOne", "getBulbTextThree", "getBulbTextTwo", "getCountError", "countErrorForGameOver", "getCountErrorForGameOver", "getCountHint", "elevationCircleTwo", "", "getElevationCircleTwo", "()F", "elevationHintThree", "getElevationHintThree", "elevationHintThreeOrFour", "getElevationHintThreeOrFour", "getGameInstructionsItemList", "()Ljava/util/List;", "hintText", "", "getHintText", "()Ljava/lang/String;", "getInstructionsAndHints", "()Z", "isHandRotateAnimationShow", "isHandTranslateAnimationShow", "isHandViewShow", "isHintBtnCloseVisible", "isHintThreeTurnOn", "isHintTwoTurnOn", "isNeedHintClose", "isOnePlusThreeCorrect", "isOnePlusTwoCorrect", "isSumAllTermsCorrect", "isTwoPlusThreeCorrect", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSumOne", "getSumThree", "getSumTwo", "getTextOne", "getTextThree", "getTextTwo", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;ZZZIIIIIIIIIIIZZZZLjava/lang/Boolean;Z)Lcom/blackhub/bronline/game/gui/electric/state/SumContactsUiState;", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SumContactsUiState implements UiState {
    public static final int $stable = 8;
    public final int bulbTextOne;
    public final int bulbTextThree;
    public final int bulbTextTwo;
    public final int countError;
    public final int countHint;

    @NotNull
    public final List<GameInstructionsItem> gameInstructionsItemList;

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> instructionsAndHints;
    public final boolean isBlockingLoading;
    public final boolean isBulbOneOnTarget;
    public final boolean isBulbThreeOnTarget;
    public final boolean isBulbTwoOnTarget;
    public final boolean isFirstGame;
    public final boolean isHandShow;
    public final boolean isHintShow;
    public final boolean isInstructionsShow;

    @Nullable
    public final Boolean isWin;
    public final int sumOne;
    public final int sumThree;
    public final int sumTwo;
    public final int textOne;
    public final int textThree;
    public final int textTwo;

    public SumContactsUiState() {
        this(null, null, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, null, false, 4194303, null);
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> component1() {
        return this.instructionsAndHints;
    }

    /* renamed from: component10, reason: from getter */
    public final int getBulbTextOne() {
        return this.bulbTextOne;
    }

    /* renamed from: component11, reason: from getter */
    public final int getBulbTextTwo() {
        return this.bulbTextTwo;
    }

    /* renamed from: component12, reason: from getter */
    public final int getBulbTextThree() {
        return this.bulbTextThree;
    }

    /* renamed from: component13, reason: from getter */
    public final int getTextOne() {
        return this.textOne;
    }

    /* renamed from: component14, reason: from getter */
    public final int getTextTwo() {
        return this.textTwo;
    }

    /* renamed from: component15, reason: from getter */
    public final int getTextThree() {
        return this.textThree;
    }

    /* renamed from: component16, reason: from getter */
    public final int getCountError() {
        return this.countError;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsBulbOneOnTarget() {
        return this.isBulbOneOnTarget;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsBulbTwoOnTarget() {
        return this.isBulbTwoOnTarget;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsBulbThreeOnTarget() {
        return this.isBulbThreeOnTarget;
    }

    @NotNull
    public final List<GameInstructionsItem> component2() {
        return this.gameInstructionsItemList;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsFirstGame() {
        return this.isFirstGame;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final Boolean getIsWin() {
        return this.isWin;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
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
    public final int getSumOne() {
        return this.sumOne;
    }

    /* renamed from: component8, reason: from getter */
    public final int getSumTwo() {
        return this.sumTwo;
    }

    /* renamed from: component9, reason: from getter */
    public final int getSumThree() {
        return this.sumThree;
    }

    @NotNull
    public final SumContactsUiState copy(@NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, @NotNull List<GameInstructionsItem> gameInstructionsItemList, boolean isInstructionsShow, boolean isHintShow, boolean isHandShow, int countHint, int sumOne, int sumTwo, int sumThree, int bulbTextOne, int bulbTextTwo, int bulbTextThree, int textOne, int textTwo, int textThree, int countError, boolean isBulbOneOnTarget, boolean isBulbTwoOnTarget, boolean isBulbThreeOnTarget, boolean isFirstGame, @Nullable Boolean isWin, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        Intrinsics.checkNotNullParameter(gameInstructionsItemList, "gameInstructionsItemList");
        return new SumContactsUiState(instructionsAndHints, gameInstructionsItemList, isInstructionsShow, isHintShow, isHandShow, countHint, sumOne, sumTwo, sumThree, bulbTextOne, bulbTextTwo, bulbTextThree, textOne, textTwo, textThree, countError, isBulbOneOnTarget, isBulbTwoOnTarget, isBulbThreeOnTarget, isFirstGame, isWin, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SumContactsUiState)) {
            return false;
        }
        SumContactsUiState sumContactsUiState = (SumContactsUiState) other;
        return Intrinsics.areEqual(this.instructionsAndHints, sumContactsUiState.instructionsAndHints) && Intrinsics.areEqual(this.gameInstructionsItemList, sumContactsUiState.gameInstructionsItemList) && this.isInstructionsShow == sumContactsUiState.isInstructionsShow && this.isHintShow == sumContactsUiState.isHintShow && this.isHandShow == sumContactsUiState.isHandShow && this.countHint == sumContactsUiState.countHint && this.sumOne == sumContactsUiState.sumOne && this.sumTwo == sumContactsUiState.sumTwo && this.sumThree == sumContactsUiState.sumThree && this.bulbTextOne == sumContactsUiState.bulbTextOne && this.bulbTextTwo == sumContactsUiState.bulbTextTwo && this.bulbTextThree == sumContactsUiState.bulbTextThree && this.textOne == sumContactsUiState.textOne && this.textTwo == sumContactsUiState.textTwo && this.textThree == sumContactsUiState.textThree && this.countError == sumContactsUiState.countError && this.isBulbOneOnTarget == sumContactsUiState.isBulbOneOnTarget && this.isBulbTwoOnTarget == sumContactsUiState.isBulbTwoOnTarget && this.isBulbThreeOnTarget == sumContactsUiState.isBulbThreeOnTarget && this.isFirstGame == sumContactsUiState.isFirstGame && Intrinsics.areEqual(this.isWin, sumContactsUiState.isWin) && this.isBlockingLoading == sumContactsUiState.isBlockingLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((((((((this.instructionsAndHints.hashCode() * 31) + this.gameInstructionsItemList.hashCode()) * 31) + Boolean.hashCode(this.isInstructionsShow)) * 31) + Boolean.hashCode(this.isHintShow)) * 31) + Boolean.hashCode(this.isHandShow)) * 31) + Integer.hashCode(this.countHint)) * 31) + Integer.hashCode(this.sumOne)) * 31) + Integer.hashCode(this.sumTwo)) * 31) + Integer.hashCode(this.sumThree)) * 31) + Integer.hashCode(this.bulbTextOne)) * 31) + Integer.hashCode(this.bulbTextTwo)) * 31) + Integer.hashCode(this.bulbTextThree)) * 31) + Integer.hashCode(this.textOne)) * 31) + Integer.hashCode(this.textTwo)) * 31) + Integer.hashCode(this.textThree)) * 31) + Integer.hashCode(this.countError)) * 31) + Boolean.hashCode(this.isBulbOneOnTarget)) * 31) + Boolean.hashCode(this.isBulbTwoOnTarget)) * 31) + Boolean.hashCode(this.isBulbThreeOnTarget)) * 31) + Boolean.hashCode(this.isFirstGame)) * 31;
        Boolean bool = this.isWin;
        return ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "SumContactsUiState(instructionsAndHints=" + this.instructionsAndHints + ", gameInstructionsItemList=" + this.gameInstructionsItemList + ", isInstructionsShow=" + this.isInstructionsShow + ", isHintShow=" + this.isHintShow + ", isHandShow=" + this.isHandShow + ", countHint=" + this.countHint + ", sumOne=" + this.sumOne + ", sumTwo=" + this.sumTwo + ", sumThree=" + this.sumThree + ", bulbTextOne=" + this.bulbTextOne + ", bulbTextTwo=" + this.bulbTextTwo + ", bulbTextThree=" + this.bulbTextThree + ", textOne=" + this.textOne + ", textTwo=" + this.textTwo + ", textThree=" + this.textThree + ", countError=" + this.countError + ", isBulbOneOnTarget=" + this.isBulbOneOnTarget + ", isBulbTwoOnTarget=" + this.isBulbTwoOnTarget + ", isBulbThreeOnTarget=" + this.isBulbThreeOnTarget + ", isFirstGame=" + this.isFirstGame + ", isWin=" + this.isWin + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public SumContactsUiState(@NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, @NotNull List<GameInstructionsItem> gameInstructionsItemList, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4, boolean z5, boolean z6, boolean z7, @Nullable Boolean bool, boolean z8) {
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        Intrinsics.checkNotNullParameter(gameInstructionsItemList, "gameInstructionsItemList");
        this.instructionsAndHints = instructionsAndHints;
        this.gameInstructionsItemList = gameInstructionsItemList;
        this.isInstructionsShow = z;
        this.isHintShow = z2;
        this.isHandShow = z3;
        this.countHint = i;
        this.sumOne = i2;
        this.sumTwo = i3;
        this.sumThree = i4;
        this.bulbTextOne = i5;
        this.bulbTextTwo = i6;
        this.bulbTextThree = i7;
        this.textOne = i8;
        this.textTwo = i9;
        this.textThree = i10;
        this.countError = i11;
        this.isBulbOneOnTarget = z4;
        this.isBulbTwoOnTarget = z5;
        this.isBulbThreeOnTarget = z6;
        this.isFirstGame = z7;
        this.isWin = bool;
        this.isBlockingLoading = z8;
    }

    public /* synthetic */ SumContactsUiState(List list, List list2, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, boolean z4, boolean z5, boolean z6, boolean z7, Boolean bool, boolean z8, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i12 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i12 & 4) != 0 ? false : z, (i12 & 8) != 0 ? false : z2, (i12 & 16) != 0 ? false : z3, (i12 & 32) != 0 ? 1 : i, (i12 & 64) != 0 ? 0 : i2, (i12 & 128) != 0 ? 0 : i3, (i12 & 256) != 0 ? 0 : i4, (i12 & 512) != 0 ? 0 : i5, (i12 & 1024) != 0 ? 0 : i6, (i12 & 2048) != 0 ? 0 : i7, (i12 & 4096) != 0 ? -10 : i8, (i12 & 8192) != 0 ? -10 : i9, (i12 & 16384) != 0 ? -10 : i10, (i12 & 32768) != 0 ? 0 : i11, (i12 & 65536) != 0 ? false : z4, (i12 & 131072) != 0 ? false : z5, (i12 & 262144) != 0 ? false : z6, (i12 & 524288) != 0 ? false : z7, (i12 & 1048576) != 0 ? null : bool, (i12 & 2097152) != 0 ? false : z8);
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

    public final int getSumOne() {
        return this.sumOne;
    }

    public final int getSumTwo() {
        return this.sumTwo;
    }

    public final int getSumThree() {
        return this.sumThree;
    }

    public final int getBulbTextOne() {
        return this.bulbTextOne;
    }

    public final int getBulbTextTwo() {
        return this.bulbTextTwo;
    }

    public final int getBulbTextThree() {
        return this.bulbTextThree;
    }

    public final int getTextOne() {
        return this.textOne;
    }

    public final int getTextTwo() {
        return this.textTwo;
    }

    public final int getTextThree() {
        return this.textThree;
    }

    public final int getCountError() {
        return this.countError;
    }

    public final boolean isBulbOneOnTarget() {
        return this.isBulbOneOnTarget;
    }

    public final boolean isBulbTwoOnTarget() {
        return this.isBulbTwoOnTarget;
    }

    public final boolean isBulbThreeOnTarget() {
        return this.isBulbThreeOnTarget;
    }

    public final boolean isFirstGame() {
        return this.isFirstGame;
    }

    @Nullable
    public final Boolean isWin() {
        return this.isWin;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    public final boolean isOnePlusTwoCorrect() {
        return this.textOne + this.textTwo == this.sumOne;
    }

    public final boolean isOnePlusThreeCorrect() {
        return this.textOne + this.textThree == this.sumTwo;
    }

    public final boolean isTwoPlusThreeCorrect() {
        return this.textTwo + this.textThree == this.sumThree;
    }

    public final int getCountErrorForGameOver() {
        return this.isFirstGame ? 20 : 5;
    }

    @DrawableRes
    public final int getBackCubeOne() {
        return isOnePlusTwoCorrect() ? R.drawable.bg_cube_green : R.drawable.bg_cube_red;
    }

    @DrawableRes
    public final int getBackCubeTwo() {
        return isOnePlusThreeCorrect() ? R.drawable.bg_cube_green : R.drawable.bg_cube_red;
    }

    @DrawableRes
    public final int getBackCubeThree() {
        return isTwoPlusThreeCorrect() ? R.drawable.bg_cube_green : R.drawable.bg_cube_red;
    }

    public final boolean isSumAllTermsCorrect() {
        return isOnePlusTwoCorrect() && isOnePlusThreeCorrect() && isTwoPlusThreeCorrect();
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
        int i;
        return this.isHintShow && ((i = this.countHint) == 1 || i == 3);
    }

    public final boolean isHandTranslateAnimationShow() {
        return this.isHintShow && this.countHint == 1 && !isHintTwoTurnOn();
    }

    public final boolean isHandRotateAnimationShow() {
        return this.isHintShow && this.countHint == 3;
    }

    public final float getElevationCircleTwo() {
        int i;
        return (this.isHintShow && ((i = this.countHint) == 1 || i == 2 || i == 3)) ? 4.0f : 0.0f;
    }

    public final float getElevationHintThree() {
        return (this.isHintShow && this.countHint == 2) ? 4.0f : 0.0f;
    }

    public final float getElevationHintThreeOrFour() {
        int i;
        return (this.isHintShow && ((i = this.countHint) == 2 || i == 3)) ? 4.0f : 0.0f;
    }

    public final boolean isHintTwoTurnOn() {
        return this.countHint == 1 && !(this.textOne == -10 && this.textTwo == -10 && this.textThree == -10);
    }

    public final boolean isHintThreeTurnOn() {
        int i;
        return this.countHint == 2 && !(((i = this.textOne) == -10 || this.textTwo == -10) && ((this.textTwo == -10 || this.textThree == -10) && (i == -10 || this.textThree == -10)));
    }

    public final boolean isHintBtnCloseVisible() {
        return !this.isFirstGame || this.countHint == 3;
    }

    public final boolean isNeedHintClose() {
        return this.isHintShow && this.countHint == 3;
    }
}
