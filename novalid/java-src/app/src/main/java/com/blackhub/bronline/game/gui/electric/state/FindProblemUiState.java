package com.blackhub.bronline.game.gui.electric.state;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.dialog.gameinstruction.GameInstructionsItem;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import com.blackhub.bronline.game.gui.electric.viewmodel.FindProblemViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FindProblemUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\bM\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\n\u0012\b\b\u0002\u0010\u0016\u001a\u00020\n\u0012\b\b\u0002\u0010\u0017\u001a\u00020\n\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\b\b\u0002\u0010\"\u001a\u00020\n\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\b\b\u0002\u0010$\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020\n\u0012\b\b\u0002\u0010&\u001a\u00020\n\u0012\b\b\u0002\u0010'\u001a\u00020\n¢\u0006\u0002\u0010(J\t\u0010W\u001a\u00020\u0003HÆ\u0003J\t\u0010X\u001a\u00020\nHÆ\u0003J\t\u0010Y\u001a\u00020\nHÆ\u0003J\t\u0010Z\u001a\u00020\nHÆ\u0003J\t\u0010[\u001a\u00020\nHÆ\u0003J\t\u0010\\\u001a\u00020\nHÆ\u0003J\t\u0010]\u001a\u00020\nHÆ\u0003J\t\u0010^\u001a\u00020\nHÆ\u0003J\t\u0010_\u001a\u00020\nHÆ\u0003J\t\u0010`\u001a\u00020\nHÆ\u0003J\t\u0010a\u001a\u00020\nHÆ\u0003J\u000f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010c\u001a\u00020\nHÆ\u0003J\t\u0010d\u001a\u00020\nHÆ\u0003J\t\u0010e\u001a\u00020\nHÆ\u0003J\t\u0010f\u001a\u00020\nHÆ\u0003J\t\u0010g\u001a\u00020\nHÆ\u0003J\t\u0010h\u001a\u00020\nHÆ\u0003J\t\u0010i\u001a\u00020\nHÆ\u0003J\t\u0010j\u001a\u00020\nHÆ\u0003J\t\u0010k\u001a\u00020\nHÆ\u0003J\t\u0010l\u001a\u00020\nHÆ\u0003J\u000f\u0010m\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J\t\u0010n\u001a\u00020\nHÆ\u0003J\t\u0010o\u001a\u00020\nHÆ\u0003J\t\u0010p\u001a\u00020\nHÆ\u0003J\t\u0010q\u001a\u00020\nHÆ\u0003J\t\u0010r\u001a\u00020\nHÆ\u0003J\t\u0010s\u001a\u00020\nHÆ\u0003J\t\u0010t\u001a\u00020\u000eHÆ\u0003J\t\u0010u\u001a\u00020\u0003HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003JÕ\u0002\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\n2\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\n2\b\b\u0002\u0010#\u001a\u00020\n2\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\n2\b\b\u0002\u0010&\u001a\u00020\n2\b\b\u0002\u0010'\u001a\u00020\nHÆ\u0001J\u0013\u0010x\u001a\u00020\n2\b\u0010y\u001a\u0004\u0018\u00010zHÖ\u0003J\t\u0010{\u001a\u00020\u000eHÖ\u0001J\t\u0010|\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b0\u0010.R\u0011\u00101\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b2\u0010.R\u0011\u00103\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b4\u0010.R\u0011\u00105\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b6\u0010.R\u0011\u00107\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b8\u0010.R\u0011\u00109\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b:\u0010.R\u0011\u0010;\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b<\u0010.R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b=\u0010>R\u0011\u0010?\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010>R\u0011\u0010'\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b'\u0010CR\u0011\u0010#\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010CR\u0011\u0010 \u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010CR\u0011\u0010\"\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010CR\u0011\u0010!\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b!\u0010CR\u0011\u0010$\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010CR\u0011\u0010\u001f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010CR\u0011\u0010\u001c\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010CR\u0011\u0010\u001e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010CR\u0011\u0010\u001d\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010CR\u0011\u0010\u001b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010CR\u0011\u0010\u0018\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010CR\u0011\u0010\u001a\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010CR\u0011\u0010\u0019\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010CR\u0011\u0010D\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bD\u0010CR\u0011\u0010\u0017\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010CR\u0011\u0010E\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bE\u0010CR\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010CR\u0011\u0010F\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bF\u0010CR\u0011\u0010\u0016\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010CR\u0011\u0010G\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bG\u0010CR\u0011\u0010\u0015\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010CR\u0011\u0010H\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bH\u0010CR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010CR\u0011\u0010I\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bI\u0010CR\u0011\u0010J\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bJ\u0010CR\u0011\u0010K\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bK\u0010CR\u0011\u0010L\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bL\u0010CR\u0011\u0010M\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bM\u0010CR\u0011\u0010N\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bN\u0010CR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010CR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010CR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010CR\u0011\u0010%\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b%\u0010CR\u0011\u0010O\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bO\u0010CR\u0011\u0010&\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010CR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bP\u0010CR\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010CR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bR\u0010AR\u0011\u0010S\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bT\u0010AR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bU\u0010AR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010A¨\u0006}"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/state/FindProblemUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "screenArgs", "", "instructionsAndHints", "", "Lcom/blackhub/bronline/game/gui/electric/model/ElectricInstructionsAndHintsModel;", "gameInstructionsItemList", "Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "isInstructionsShow", "", "isHintShow", "isHandShow", "countHint", "", "textOhmOnTable", "textOhmOnMultimeter", "probeBlackOnTarget", "probeRedOnTarget", "isMultimeterVisible", "isFuseRedOneWithProbeVisible", "isFuseRedTwoWithProbeVisible", "isFuseRedThreeWithProbeVisible", "isFuseRedFourWithProbeVisible", "isFuseGrayOneVisible", "isFuseGrayTwoVisible", "isFuseGrayThreeVisible", "isFuseGrayFourVisible", "isFuseFillOne", "isFuseFillTwo", "isFuseFillThree", "isFuseFillFour", "isElementTwoOneHasListener", "isElementTwoTwoHasListener", "isElementTwoThreeHasListener", "isElementTwoFourHasListener", "isFirstGame", "isNextGame", "isWin", "isBlockingLoading", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZZILjava/lang/String;Ljava/lang/String;ZZZZZZZZZZZZZZZZZZZZZZZ)V", "getCountHint", "()I", "elevationHintEight", "", "getElevationHintEight", "()F", "elevationHintFour", "getElevationHintFour", "elevationHintFourOrFive", "getElevationHintFourOrFive", "elevationHintOne", "getElevationHintOne", "elevationHintSeven", "getElevationHintSeven", "elevationHintSix", "getElevationHintSix", "elevationHintThreeOrSeven", "getElevationHintThreeOrSeven", "elevationHintTwo", "getElevationHintTwo", "getGameInstructionsItemList", "()Ljava/util/List;", "hintText", "getHintText", "()Ljava/lang/String;", "getInstructionsAndHints", "()Z", "isFuseRedFourVisible", "isFuseRedOneVisible", "isFuseRedThreeVisible", "isFuseRedTwoVisible", "isHandRotateAnimationShow", "isHandTranslateAnimationFourShow", "isHandTranslateAnimationOneShow", "isHandTranslateAnimationThreeShow", "isHandTranslateAnimationTwoShow", "isHandViewShow", "isHintBtnCloseVisible", "isShowHintFourOrFive", "getProbeBlackOnTarget", "getProbeRedOnTarget", "getScreenArgs", "textMultimeter", "getTextMultimeter", "getTextOhmOnMultimeter", "getTextOhmOnTable", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class FindProblemUiState implements UiState {
    public static final int $stable = 8;
    public final int countHint;

    @NotNull
    public final List<GameInstructionsItem> gameInstructionsItemList;

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> instructionsAndHints;
    public final boolean isBlockingLoading;
    public final boolean isElementTwoFourHasListener;
    public final boolean isElementTwoOneHasListener;
    public final boolean isElementTwoThreeHasListener;
    public final boolean isElementTwoTwoHasListener;
    public final boolean isFirstGame;
    public final boolean isFuseFillFour;
    public final boolean isFuseFillOne;
    public final boolean isFuseFillThree;
    public final boolean isFuseFillTwo;
    public final boolean isFuseGrayFourVisible;
    public final boolean isFuseGrayOneVisible;
    public final boolean isFuseGrayThreeVisible;
    public final boolean isFuseGrayTwoVisible;
    public final boolean isFuseRedFourWithProbeVisible;
    public final boolean isFuseRedOneWithProbeVisible;
    public final boolean isFuseRedThreeWithProbeVisible;
    public final boolean isFuseRedTwoWithProbeVisible;
    public final boolean isHandShow;
    public final boolean isHintShow;
    public final boolean isInstructionsShow;
    public final boolean isMultimeterVisible;
    public final boolean isNextGame;
    public final boolean isWin;
    public final boolean probeBlackOnTarget;
    public final boolean probeRedOnTarget;

    @NotNull
    public final String screenArgs;

    @NotNull
    public final String textOhmOnMultimeter;

    @NotNull
    public final String textOhmOnTable;

    public FindProblemUiState() {
        this(null, null, null, false, false, false, 0, null, null, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, -1, null);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getScreenArgs() {
        return this.screenArgs;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getProbeBlackOnTarget() {
        return this.probeBlackOnTarget;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getProbeRedOnTarget() {
        return this.probeRedOnTarget;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsMultimeterVisible() {
        return this.isMultimeterVisible;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsFuseRedOneWithProbeVisible() {
        return this.isFuseRedOneWithProbeVisible;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsFuseRedTwoWithProbeVisible() {
        return this.isFuseRedTwoWithProbeVisible;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsFuseRedThreeWithProbeVisible() {
        return this.isFuseRedThreeWithProbeVisible;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsFuseRedFourWithProbeVisible() {
        return this.isFuseRedFourWithProbeVisible;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsFuseGrayOneVisible() {
        return this.isFuseGrayOneVisible;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsFuseGrayTwoVisible() {
        return this.isFuseGrayTwoVisible;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsFuseGrayThreeVisible() {
        return this.isFuseGrayThreeVisible;
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> component2() {
        return this.instructionsAndHints;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsFuseGrayFourVisible() {
        return this.isFuseGrayFourVisible;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsFuseFillOne() {
        return this.isFuseFillOne;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsFuseFillTwo() {
        return this.isFuseFillTwo;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsFuseFillThree() {
        return this.isFuseFillThree;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsFuseFillFour() {
        return this.isFuseFillFour;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getIsElementTwoOneHasListener() {
        return this.isElementTwoOneHasListener;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getIsElementTwoTwoHasListener() {
        return this.isElementTwoTwoHasListener;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsElementTwoThreeHasListener() {
        return this.isElementTwoThreeHasListener;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsElementTwoFourHasListener() {
        return this.isElementTwoFourHasListener;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsFirstGame() {
        return this.isFirstGame;
    }

    @NotNull
    public final List<GameInstructionsItem> component3() {
        return this.gameInstructionsItemList;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsNextGame() {
        return this.isNextGame;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsWin() {
        return this.isWin;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsInstructionsShow() {
        return this.isInstructionsShow;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsHintShow() {
        return this.isHintShow;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsHandShow() {
        return this.isHandShow;
    }

    /* renamed from: component7, reason: from getter */
    public final int getCountHint() {
        return this.countHint;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getTextOhmOnTable() {
        return this.textOhmOnTable;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getTextOhmOnMultimeter() {
        return this.textOhmOnMultimeter;
    }

    @NotNull
    public final FindProblemUiState copy(@NotNull String screenArgs, @NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, @NotNull List<GameInstructionsItem> gameInstructionsItemList, boolean isInstructionsShow, boolean isHintShow, boolean isHandShow, int countHint, @NotNull String textOhmOnTable, @NotNull String textOhmOnMultimeter, boolean probeBlackOnTarget, boolean probeRedOnTarget, boolean isMultimeterVisible, boolean isFuseRedOneWithProbeVisible, boolean isFuseRedTwoWithProbeVisible, boolean isFuseRedThreeWithProbeVisible, boolean isFuseRedFourWithProbeVisible, boolean isFuseGrayOneVisible, boolean isFuseGrayTwoVisible, boolean isFuseGrayThreeVisible, boolean isFuseGrayFourVisible, boolean isFuseFillOne, boolean isFuseFillTwo, boolean isFuseFillThree, boolean isFuseFillFour, boolean isElementTwoOneHasListener, boolean isElementTwoTwoHasListener, boolean isElementTwoThreeHasListener, boolean isElementTwoFourHasListener, boolean isFirstGame, boolean isNextGame, boolean isWin, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        Intrinsics.checkNotNullParameter(gameInstructionsItemList, "gameInstructionsItemList");
        Intrinsics.checkNotNullParameter(textOhmOnTable, "textOhmOnTable");
        Intrinsics.checkNotNullParameter(textOhmOnMultimeter, "textOhmOnMultimeter");
        return new FindProblemUiState(screenArgs, instructionsAndHints, gameInstructionsItemList, isInstructionsShow, isHintShow, isHandShow, countHint, textOhmOnTable, textOhmOnMultimeter, probeBlackOnTarget, probeRedOnTarget, isMultimeterVisible, isFuseRedOneWithProbeVisible, isFuseRedTwoWithProbeVisible, isFuseRedThreeWithProbeVisible, isFuseRedFourWithProbeVisible, isFuseGrayOneVisible, isFuseGrayTwoVisible, isFuseGrayThreeVisible, isFuseGrayFourVisible, isFuseFillOne, isFuseFillTwo, isFuseFillThree, isFuseFillFour, isElementTwoOneHasListener, isElementTwoTwoHasListener, isElementTwoThreeHasListener, isElementTwoFourHasListener, isFirstGame, isNextGame, isWin, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FindProblemUiState)) {
            return false;
        }
        FindProblemUiState findProblemUiState = (FindProblemUiState) other;
        return Intrinsics.areEqual(this.screenArgs, findProblemUiState.screenArgs) && Intrinsics.areEqual(this.instructionsAndHints, findProblemUiState.instructionsAndHints) && Intrinsics.areEqual(this.gameInstructionsItemList, findProblemUiState.gameInstructionsItemList) && this.isInstructionsShow == findProblemUiState.isInstructionsShow && this.isHintShow == findProblemUiState.isHintShow && this.isHandShow == findProblemUiState.isHandShow && this.countHint == findProblemUiState.countHint && Intrinsics.areEqual(this.textOhmOnTable, findProblemUiState.textOhmOnTable) && Intrinsics.areEqual(this.textOhmOnMultimeter, findProblemUiState.textOhmOnMultimeter) && this.probeBlackOnTarget == findProblemUiState.probeBlackOnTarget && this.probeRedOnTarget == findProblemUiState.probeRedOnTarget && this.isMultimeterVisible == findProblemUiState.isMultimeterVisible && this.isFuseRedOneWithProbeVisible == findProblemUiState.isFuseRedOneWithProbeVisible && this.isFuseRedTwoWithProbeVisible == findProblemUiState.isFuseRedTwoWithProbeVisible && this.isFuseRedThreeWithProbeVisible == findProblemUiState.isFuseRedThreeWithProbeVisible && this.isFuseRedFourWithProbeVisible == findProblemUiState.isFuseRedFourWithProbeVisible && this.isFuseGrayOneVisible == findProblemUiState.isFuseGrayOneVisible && this.isFuseGrayTwoVisible == findProblemUiState.isFuseGrayTwoVisible && this.isFuseGrayThreeVisible == findProblemUiState.isFuseGrayThreeVisible && this.isFuseGrayFourVisible == findProblemUiState.isFuseGrayFourVisible && this.isFuseFillOne == findProblemUiState.isFuseFillOne && this.isFuseFillTwo == findProblemUiState.isFuseFillTwo && this.isFuseFillThree == findProblemUiState.isFuseFillThree && this.isFuseFillFour == findProblemUiState.isFuseFillFour && this.isElementTwoOneHasListener == findProblemUiState.isElementTwoOneHasListener && this.isElementTwoTwoHasListener == findProblemUiState.isElementTwoTwoHasListener && this.isElementTwoThreeHasListener == findProblemUiState.isElementTwoThreeHasListener && this.isElementTwoFourHasListener == findProblemUiState.isElementTwoFourHasListener && this.isFirstGame == findProblemUiState.isFirstGame && this.isNextGame == findProblemUiState.isNextGame && this.isWin == findProblemUiState.isWin && this.isBlockingLoading == findProblemUiState.isBlockingLoading;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.screenArgs.hashCode() * 31) + this.instructionsAndHints.hashCode()) * 31) + this.gameInstructionsItemList.hashCode()) * 31) + Boolean.hashCode(this.isInstructionsShow)) * 31) + Boolean.hashCode(this.isHintShow)) * 31) + Boolean.hashCode(this.isHandShow)) * 31) + Integer.hashCode(this.countHint)) * 31) + this.textOhmOnTable.hashCode()) * 31) + this.textOhmOnMultimeter.hashCode()) * 31) + Boolean.hashCode(this.probeBlackOnTarget)) * 31) + Boolean.hashCode(this.probeRedOnTarget)) * 31) + Boolean.hashCode(this.isMultimeterVisible)) * 31) + Boolean.hashCode(this.isFuseRedOneWithProbeVisible)) * 31) + Boolean.hashCode(this.isFuseRedTwoWithProbeVisible)) * 31) + Boolean.hashCode(this.isFuseRedThreeWithProbeVisible)) * 31) + Boolean.hashCode(this.isFuseRedFourWithProbeVisible)) * 31) + Boolean.hashCode(this.isFuseGrayOneVisible)) * 31) + Boolean.hashCode(this.isFuseGrayTwoVisible)) * 31) + Boolean.hashCode(this.isFuseGrayThreeVisible)) * 31) + Boolean.hashCode(this.isFuseGrayFourVisible)) * 31) + Boolean.hashCode(this.isFuseFillOne)) * 31) + Boolean.hashCode(this.isFuseFillTwo)) * 31) + Boolean.hashCode(this.isFuseFillThree)) * 31) + Boolean.hashCode(this.isFuseFillFour)) * 31) + Boolean.hashCode(this.isElementTwoOneHasListener)) * 31) + Boolean.hashCode(this.isElementTwoTwoHasListener)) * 31) + Boolean.hashCode(this.isElementTwoThreeHasListener)) * 31) + Boolean.hashCode(this.isElementTwoFourHasListener)) * 31) + Boolean.hashCode(this.isFirstGame)) * 31) + Boolean.hashCode(this.isNextGame)) * 31) + Boolean.hashCode(this.isWin)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "FindProblemUiState(screenArgs=" + this.screenArgs + ", instructionsAndHints=" + this.instructionsAndHints + ", gameInstructionsItemList=" + this.gameInstructionsItemList + ", isInstructionsShow=" + this.isInstructionsShow + ", isHintShow=" + this.isHintShow + ", isHandShow=" + this.isHandShow + ", countHint=" + this.countHint + ", textOhmOnTable=" + this.textOhmOnTable + ", textOhmOnMultimeter=" + this.textOhmOnMultimeter + ", probeBlackOnTarget=" + this.probeBlackOnTarget + ", probeRedOnTarget=" + this.probeRedOnTarget + ", isMultimeterVisible=" + this.isMultimeterVisible + ", isFuseRedOneWithProbeVisible=" + this.isFuseRedOneWithProbeVisible + ", isFuseRedTwoWithProbeVisible=" + this.isFuseRedTwoWithProbeVisible + ", isFuseRedThreeWithProbeVisible=" + this.isFuseRedThreeWithProbeVisible + ", isFuseRedFourWithProbeVisible=" + this.isFuseRedFourWithProbeVisible + ", isFuseGrayOneVisible=" + this.isFuseGrayOneVisible + ", isFuseGrayTwoVisible=" + this.isFuseGrayTwoVisible + ", isFuseGrayThreeVisible=" + this.isFuseGrayThreeVisible + ", isFuseGrayFourVisible=" + this.isFuseGrayFourVisible + ", isFuseFillOne=" + this.isFuseFillOne + ", isFuseFillTwo=" + this.isFuseFillTwo + ", isFuseFillThree=" + this.isFuseFillThree + ", isFuseFillFour=" + this.isFuseFillFour + ", isElementTwoOneHasListener=" + this.isElementTwoOneHasListener + ", isElementTwoTwoHasListener=" + this.isElementTwoTwoHasListener + ", isElementTwoThreeHasListener=" + this.isElementTwoThreeHasListener + ", isElementTwoFourHasListener=" + this.isElementTwoFourHasListener + ", isFirstGame=" + this.isFirstGame + ", isNextGame=" + this.isNextGame + ", isWin=" + this.isWin + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public FindProblemUiState(@NotNull String screenArgs, @NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, @NotNull List<GameInstructionsItem> gameInstructionsItemList, boolean z, boolean z2, boolean z3, int i, @NotNull String textOhmOnTable, @NotNull String textOhmOnMultimeter, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26) {
        Intrinsics.checkNotNullParameter(screenArgs, "screenArgs");
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        Intrinsics.checkNotNullParameter(gameInstructionsItemList, "gameInstructionsItemList");
        Intrinsics.checkNotNullParameter(textOhmOnTable, "textOhmOnTable");
        Intrinsics.checkNotNullParameter(textOhmOnMultimeter, "textOhmOnMultimeter");
        this.screenArgs = screenArgs;
        this.instructionsAndHints = instructionsAndHints;
        this.gameInstructionsItemList = gameInstructionsItemList;
        this.isInstructionsShow = z;
        this.isHintShow = z2;
        this.isHandShow = z3;
        this.countHint = i;
        this.textOhmOnTable = textOhmOnTable;
        this.textOhmOnMultimeter = textOhmOnMultimeter;
        this.probeBlackOnTarget = z4;
        this.probeRedOnTarget = z5;
        this.isMultimeterVisible = z6;
        this.isFuseRedOneWithProbeVisible = z7;
        this.isFuseRedTwoWithProbeVisible = z8;
        this.isFuseRedThreeWithProbeVisible = z9;
        this.isFuseRedFourWithProbeVisible = z10;
        this.isFuseGrayOneVisible = z11;
        this.isFuseGrayTwoVisible = z12;
        this.isFuseGrayThreeVisible = z13;
        this.isFuseGrayFourVisible = z14;
        this.isFuseFillOne = z15;
        this.isFuseFillTwo = z16;
        this.isFuseFillThree = z17;
        this.isFuseFillFour = z18;
        this.isElementTwoOneHasListener = z19;
        this.isElementTwoTwoHasListener = z20;
        this.isElementTwoThreeHasListener = z21;
        this.isElementTwoFourHasListener = z22;
        this.isFirstGame = z23;
        this.isNextGame = z24;
        this.isWin = z25;
        this.isBlockingLoading = z26;
    }

    public /* synthetic */ FindProblemUiState(String str, List list, List list2, boolean z, boolean z2, boolean z3, int i, String str2, String str3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i2 & 8) != 0 ? false : z, (i2 & 16) != 0 ? false : z2, (i2 & 32) != 0 ? false : z3, (i2 & 64) != 0 ? 1 : i, (i2 & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 256) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i2 & 512) != 0 ? false : z4, (i2 & 1024) != 0 ? false : z5, (i2 & 2048) != 0 ? false : z6, (i2 & 4096) != 0 ? true : z7, (i2 & 8192) != 0 ? true : z8, (i2 & 16384) != 0 ? true : z9, (i2 & 32768) != 0 ? true : z10, (i2 & 65536) != 0 ? true : z11, (i2 & 131072) != 0 ? true : z12, (i2 & 262144) != 0 ? true : z13, (i2 & 524288) != 0 ? true : z14, (i2 & 1048576) != 0 ? false : z15, (i2 & 2097152) != 0 ? false : z16, (i2 & 4194304) != 0 ? false : z17, (i2 & 8388608) != 0 ? false : z18, (i2 & 16777216) != 0 ? true : z19, (i2 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? true : z20, (i2 & 67108864) != 0 ? true : z21, (i2 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? true : z22, (i2 & 268435456) != 0 ? false : z23, (i2 & 536870912) != 0 ? false : z24, (i2 & 1073741824) != 0 ? false : z25, (i2 & Integer.MIN_VALUE) != 0 ? false : z26);
    }

    @NotNull
    public final String getScreenArgs() {
        return this.screenArgs;
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

    @NotNull
    public final String getTextOhmOnTable() {
        return this.textOhmOnTable;
    }

    @NotNull
    public final String getTextOhmOnMultimeter() {
        return this.textOhmOnMultimeter;
    }

    public final boolean getProbeBlackOnTarget() {
        return this.probeBlackOnTarget;
    }

    public final boolean getProbeRedOnTarget() {
        return this.probeRedOnTarget;
    }

    public final boolean isMultimeterVisible() {
        return this.isMultimeterVisible;
    }

    public final boolean isFuseRedOneWithProbeVisible() {
        return this.isFuseRedOneWithProbeVisible;
    }

    public final boolean isFuseRedTwoWithProbeVisible() {
        return this.isFuseRedTwoWithProbeVisible;
    }

    public final boolean isFuseRedThreeWithProbeVisible() {
        return this.isFuseRedThreeWithProbeVisible;
    }

    public final boolean isFuseRedFourWithProbeVisible() {
        return this.isFuseRedFourWithProbeVisible;
    }

    public final boolean isFuseGrayOneVisible() {
        return this.isFuseGrayOneVisible;
    }

    public final boolean isFuseGrayTwoVisible() {
        return this.isFuseGrayTwoVisible;
    }

    public final boolean isFuseGrayThreeVisible() {
        return this.isFuseGrayThreeVisible;
    }

    public final boolean isFuseGrayFourVisible() {
        return this.isFuseGrayFourVisible;
    }

    public final boolean isFuseFillOne() {
        return this.isFuseFillOne;
    }

    public final boolean isFuseFillTwo() {
        return this.isFuseFillTwo;
    }

    public final boolean isFuseFillThree() {
        return this.isFuseFillThree;
    }

    public final boolean isFuseFillFour() {
        return this.isFuseFillFour;
    }

    public final boolean isElementTwoOneHasListener() {
        return this.isElementTwoOneHasListener;
    }

    public final boolean isElementTwoTwoHasListener() {
        return this.isElementTwoTwoHasListener;
    }

    public final boolean isElementTwoThreeHasListener() {
        return this.isElementTwoThreeHasListener;
    }

    public final boolean isElementTwoFourHasListener() {
        return this.isElementTwoFourHasListener;
    }

    public final boolean isFirstGame() {
        return this.isFirstGame;
    }

    public final boolean isNextGame() {
        return this.isNextGame;
    }

    public final boolean isWin() {
        return this.isWin;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    @NotNull
    public final String getTextMultimeter() {
        return (this.probeBlackOnTarget && this.probeRedOnTarget) ? this.textOhmOnMultimeter : FindProblemViewModel.OHM_ZERO;
    }

    public final boolean isFuseRedOneVisible() {
        return this.isFuseRedOneWithProbeVisible && this.isFuseGrayOneVisible;
    }

    public final boolean isFuseRedTwoVisible() {
        return this.isFuseRedTwoWithProbeVisible && this.isFuseGrayTwoVisible;
    }

    public final boolean isFuseRedThreeVisible() {
        return this.isFuseRedThreeWithProbeVisible && this.isFuseGrayThreeVisible;
    }

    public final boolean isFuseRedFourVisible() {
        return this.isFuseRedFourWithProbeVisible && this.isFuseGrayFourVisible;
    }

    @NotNull
    public final String getHintText() {
        List<String> textHintList;
        List<String> textHintList2;
        List<String> textHintList3;
        List<String> textHintList4;
        List<String> textHintList5;
        List<String> textHintList6;
        List<String> textHintList7;
        List<String> textHintList8;
        switch (this.countHint) {
            case 1:
                ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
                if (electricInstructionsAndHintsModel == null || (textHintList = electricInstructionsAndHintsModel.getTextHintList()) == null || (r0 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList, 0)) == null) {
                    break;
                }
                break;
            case 2:
                ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel2 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
                if (electricInstructionsAndHintsModel2 == null || (textHintList2 = electricInstructionsAndHintsModel2.getTextHintList()) == null || (r0 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList2, 1)) == null) {
                    break;
                }
                break;
            case 3:
                ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel3 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
                if (electricInstructionsAndHintsModel3 == null || (textHintList3 = electricInstructionsAndHintsModel3.getTextHintList()) == null || (r0 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList3, 2)) == null) {
                    break;
                }
                break;
            case 4:
                ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel4 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
                if (electricInstructionsAndHintsModel4 == null || (textHintList4 = electricInstructionsAndHintsModel4.getTextHintList()) == null || (r0 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList4, 3)) == null) {
                    break;
                }
                break;
            case 5:
                ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel5 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
                if (electricInstructionsAndHintsModel5 == null || (textHintList5 = electricInstructionsAndHintsModel5.getTextHintList()) == null || (r0 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList5, 4)) == null) {
                    break;
                }
                break;
            case 6:
                ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel6 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
                if (electricInstructionsAndHintsModel6 == null || (textHintList6 = electricInstructionsAndHintsModel6.getTextHintList()) == null || (r0 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList6, 5)) == null) {
                    break;
                }
                break;
            case 7:
                ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel7 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
                if (electricInstructionsAndHintsModel7 == null || (textHintList7 = electricInstructionsAndHintsModel7.getTextHintList()) == null || (r0 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList7, 6)) == null) {
                    break;
                }
                break;
            case 8:
                ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel8 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.firstOrNull((List) this.instructionsAndHints);
                if (electricInstructionsAndHintsModel8 == null || (textHintList8 = electricInstructionsAndHintsModel8.getTextHintList()) == null || (r0 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList8, 7)) == null) {
                    break;
                }
                break;
        }
        return AnyExtensionKt.empty(this);
    }

    public final boolean isHandViewShow() {
        int i;
        return this.isHintShow && ((i = this.countHint) == 1 || i == 2 || i == 3 || i == 5 || i == 6 || i == 7 || i == 8);
    }

    public final boolean isHandRotateAnimationShow() {
        int i;
        return this.isHintShow && ((i = this.countHint) == 1 || i == 5 || i == 8);
    }

    public final boolean isHandTranslateAnimationOneShow() {
        return this.isHintShow && this.countHint == 2;
    }

    public final boolean isHandTranslateAnimationTwoShow() {
        return this.isHintShow && this.countHint == 3;
    }

    public final boolean isHandTranslateAnimationThreeShow() {
        return this.isHintShow && this.countHint == 6;
    }

    public final boolean isHandTranslateAnimationFourShow() {
        return this.isHintShow && this.countHint == 7;
    }

    public final boolean isShowHintFourOrFive() {
        int i;
        return this.isHintShow && ((i = this.countHint) == 4 || i == 5);
    }

    public final float getElevationHintOne() {
        return (this.isHintShow && this.countHint == 1) ? 4.0f : 0.0f;
    }

    public final float getElevationHintTwo() {
        return (this.isHintShow && this.countHint == 2) ? 4.0f : 0.0f;
    }

    public final float getElevationHintThreeOrSeven() {
        int i;
        return (this.isHintShow && ((i = this.countHint) == 3 || i == 7)) ? 4.0f : 0.0f;
    }

    public final float getElevationHintFour() {
        return (this.isHintShow && this.countHint == 4) ? 4.0f : 0.0f;
    }

    public final float getElevationHintFourOrFive() {
        int i;
        return (this.isHintShow && ((i = this.countHint) == 4 || i == 5)) ? 4.0f : 0.0f;
    }

    public final float getElevationHintSix() {
        return (this.isHintShow && this.countHint == 6) ? 4.0f : 0.0f;
    }

    public final float getElevationHintSeven() {
        return (this.isHintShow && this.countHint == 7) ? 4.0f : 0.0f;
    }

    public final float getElevationHintEight() {
        return (this.isHintShow && this.countHint == 8) ? 4.0f : 0.0f;
    }

    public final boolean isHintBtnCloseVisible() {
        return !this.isFirstGame || this.countHint == 7;
    }
}
