package com.blackhub.bronline.game.gui.electric.state;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.electric.model.ElectricInstructionsAndHintsModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChangeBulbUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u000eJ\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\tHÆ\u0003J\t\u0010%\u001a\u00020\u0006HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\u0006HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001fJf\u0010)\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020\tHÖ\u0001J\t\u0010/\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001dR\u0011\u0010\f\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\r\u0010\u001f¨\u00060"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/electric/state/ChangeBulbUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "instructionsAndHints", "", "Lcom/blackhub/bronline/game/gui/electric/model/ElectricInstructionsAndHintsModel;", "isHintShow", "", "isHandShow", "countHint", "", "isBulbBrokeVisible", "isBulbFullVisible", "isFirstGame", "isWin", "(Ljava/util/List;ZZIZZZLjava/lang/Boolean;)V", "getCountHint", "()I", "elevationBulbFull", "", "getElevationBulbFull", "()F", "elevationHint", "getElevationHint", "hintText", "", "getHintText", "()Ljava/lang/String;", "getInstructionsAndHints", "()Ljava/util/List;", "()Z", "isHintBtnCloseVisible", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/util/List;ZZIZZZLjava/lang/Boolean;)Lcom/blackhub/bronline/game/gui/electric/state/ChangeBulbUiState;", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChangeBulbUiState implements UiState {
    public static final int $stable = 8;
    public final int countHint;

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> instructionsAndHints;
    public final boolean isBulbBrokeVisible;
    public final boolean isBulbFullVisible;
    public final boolean isFirstGame;
    public final boolean isHandShow;
    public final boolean isHintShow;

    @Nullable
    public final Boolean isWin;

    public ChangeBulbUiState() {
        this(null, false, false, 0, false, false, false, null, 255, null);
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> component1() {
        return this.instructionsAndHints;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsHintShow() {
        return this.isHintShow;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsHandShow() {
        return this.isHandShow;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCountHint() {
        return this.countHint;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsBulbBrokeVisible() {
        return this.isBulbBrokeVisible;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsBulbFullVisible() {
        return this.isBulbFullVisible;
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

    @NotNull
    public final ChangeBulbUiState copy(@NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, boolean isHintShow, boolean isHandShow, int countHint, boolean isBulbBrokeVisible, boolean isBulbFullVisible, boolean isFirstGame, @Nullable Boolean isWin) {
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        return new ChangeBulbUiState(instructionsAndHints, isHintShow, isHandShow, countHint, isBulbBrokeVisible, isBulbFullVisible, isFirstGame, isWin);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChangeBulbUiState)) {
            return false;
        }
        ChangeBulbUiState changeBulbUiState = (ChangeBulbUiState) other;
        return Intrinsics.areEqual(this.instructionsAndHints, changeBulbUiState.instructionsAndHints) && this.isHintShow == changeBulbUiState.isHintShow && this.isHandShow == changeBulbUiState.isHandShow && this.countHint == changeBulbUiState.countHint && this.isBulbBrokeVisible == changeBulbUiState.isBulbBrokeVisible && this.isBulbFullVisible == changeBulbUiState.isBulbFullVisible && this.isFirstGame == changeBulbUiState.isFirstGame && Intrinsics.areEqual(this.isWin, changeBulbUiState.isWin);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.instructionsAndHints.hashCode() * 31) + Boolean.hashCode(this.isHintShow)) * 31) + Boolean.hashCode(this.isHandShow)) * 31) + Integer.hashCode(this.countHint)) * 31) + Boolean.hashCode(this.isBulbBrokeVisible)) * 31) + Boolean.hashCode(this.isBulbFullVisible)) * 31) + Boolean.hashCode(this.isFirstGame)) * 31;
        Boolean bool = this.isWin;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @NotNull
    public String toString() {
        return "ChangeBulbUiState(instructionsAndHints=" + this.instructionsAndHints + ", isHintShow=" + this.isHintShow + ", isHandShow=" + this.isHandShow + ", countHint=" + this.countHint + ", isBulbBrokeVisible=" + this.isBulbBrokeVisible + ", isBulbFullVisible=" + this.isBulbFullVisible + ", isFirstGame=" + this.isFirstGame + ", isWin=" + this.isWin + ")";
    }

    public ChangeBulbUiState(@NotNull List<ElectricInstructionsAndHintsModel> instructionsAndHints, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, @Nullable Boolean bool) {
        Intrinsics.checkNotNullParameter(instructionsAndHints, "instructionsAndHints");
        this.instructionsAndHints = instructionsAndHints;
        this.isHintShow = z;
        this.isHandShow = z2;
        this.countHint = i;
        this.isBulbBrokeVisible = z3;
        this.isBulbFullVisible = z4;
        this.isFirstGame = z5;
        this.isWin = bool;
    }

    public /* synthetic */ ChangeBulbUiState(List list, boolean z, boolean z2, int i, boolean z3, boolean z4, boolean z5, Boolean bool, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? 1 : i, (i2 & 16) == 0 ? z3 : true, (i2 & 32) != 0 ? false : z4, (i2 & 64) == 0 ? z5 : false, (i2 & 128) != 0 ? null : bool);
    }

    @NotNull
    public final List<ElectricInstructionsAndHintsModel> getInstructionsAndHints() {
        return this.instructionsAndHints;
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

    public final boolean isBulbBrokeVisible() {
        return this.isBulbBrokeVisible;
    }

    public final boolean isBulbFullVisible() {
        return this.isBulbFullVisible;
    }

    public final boolean isFirstGame() {
        return this.isFirstGame;
    }

    @Nullable
    public final Boolean isWin() {
        return this.isWin;
    }

    @NotNull
    public final String getHintText() {
        List<String> textHintList;
        String str;
        List<String> textHintList2;
        String str2;
        int i = this.countHint;
        if (i == 1) {
            ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.lastOrNull((List) this.instructionsAndHints);
            return (electricInstructionsAndHintsModel == null || (textHintList = electricInstructionsAndHintsModel.getTextHintList()) == null || (str = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList, 0)) == null) ? AnyExtensionKt.empty(this) : str;
        }
        if (i == 2) {
            ElectricInstructionsAndHintsModel electricInstructionsAndHintsModel2 = (ElectricInstructionsAndHintsModel) CollectionsKt___CollectionsKt.lastOrNull((List) this.instructionsAndHints);
            return (electricInstructionsAndHintsModel2 == null || (textHintList2 = electricInstructionsAndHintsModel2.getTextHintList()) == null || (str2 = (String) CollectionsKt___CollectionsKt.getOrNull(textHintList2, 1)) == null) ? AnyExtensionKt.empty(this) : str2;
        }
        return AnyExtensionKt.empty(this);
    }

    public final float getElevationHint() {
        return this.isHintShow ? 4.0f : 0.0f;
    }

    public final float getElevationBulbFull() {
        return this.countHint == 2 ? 6.0f : 0.0f;
    }

    public final boolean isHintBtnCloseVisible() {
        return !this.isFirstGame || this.countHint == 2;
    }
}
