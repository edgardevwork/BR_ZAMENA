package com.blackhub.bronline.game.gui.tutorialhints;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: TutorialUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u000eHÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0007HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\fHÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003J\t\u0010)\u001a\u00020\u000eHÆ\u0003J\t\u0010*\u001a\u00020\u000eHÆ\u0003Js\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u000eHÆ\u0001J\u0013\u0010,\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\u0003HÖ\u0001J\t\u00100\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0018R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001eR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00061"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "avatarNumber", "", "hintScreenType", "Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialEnum;", "hintTitle", "", "hintDesc", "mainTask", "Lcom/blackhub/bronline/game/gui/tutorialhints/HintQuestData;", "additionalTasksList", "", "isNewVersionVisible", "", "isInterfaceVisible", "isNeedClose", "isBlockingLoading", "(ILcom/blackhub/bronline/game/gui/tutorialhints/TutorialEnum;Ljava/lang/String;Ljava/lang/String;Lcom/blackhub/bronline/game/gui/tutorialhints/HintQuestData;Ljava/util/List;ZZZZ)V", "getAdditionalTasksList", "()Ljava/util/List;", "getAvatarNumber", "()I", "getHintDesc", "()Ljava/lang/String;", "hintImage", "getHintImage", "getHintScreenType", "()Lcom/blackhub/bronline/game/gui/tutorialhints/TutorialEnum;", "getHintTitle", "()Z", "getMainTask", "()Lcom/blackhub/bronline/game/gui/tutorialhints/HintQuestData;", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TutorialUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final List<HintQuestData> additionalTasksList;
    public final int avatarNumber;

    @NotNull
    public final String hintDesc;

    @NotNull
    public final TutorialEnum hintScreenType;

    @NotNull
    public final String hintTitle;
    public final boolean isBlockingLoading;
    public final boolean isInterfaceVisible;
    public final boolean isNeedClose;
    public final boolean isNewVersionVisible;

    @NotNull
    public final HintQuestData mainTask;

    public TutorialUiState() {
        this(0, null, null, null, null, null, false, false, false, false, 1023, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAvatarNumber() {
        return this.avatarNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TutorialEnum getHintScreenType() {
        return this.hintScreenType;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getHintTitle() {
        return this.hintTitle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getHintDesc() {
        return this.hintDesc;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final HintQuestData getMainTask() {
        return this.mainTask;
    }

    @NotNull
    public final List<HintQuestData> component6() {
        return this.additionalTasksList;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsNewVersionVisible() {
        return this.isNewVersionVisible;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsInterfaceVisible() {
        return this.isInterfaceVisible;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final TutorialUiState copy(int avatarNumber, @NotNull TutorialEnum hintScreenType, @NotNull String hintTitle, @NotNull String hintDesc, @NotNull HintQuestData mainTask, @NotNull List<HintQuestData> additionalTasksList, boolean isNewVersionVisible, boolean isInterfaceVisible, boolean isNeedClose, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(hintScreenType, "hintScreenType");
        Intrinsics.checkNotNullParameter(hintTitle, "hintTitle");
        Intrinsics.checkNotNullParameter(hintDesc, "hintDesc");
        Intrinsics.checkNotNullParameter(mainTask, "mainTask");
        Intrinsics.checkNotNullParameter(additionalTasksList, "additionalTasksList");
        return new TutorialUiState(avatarNumber, hintScreenType, hintTitle, hintDesc, mainTask, additionalTasksList, isNewVersionVisible, isInterfaceVisible, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TutorialUiState)) {
            return false;
        }
        TutorialUiState tutorialUiState = (TutorialUiState) other;
        return this.avatarNumber == tutorialUiState.avatarNumber && this.hintScreenType == tutorialUiState.hintScreenType && Intrinsics.areEqual(this.hintTitle, tutorialUiState.hintTitle) && Intrinsics.areEqual(this.hintDesc, tutorialUiState.hintDesc) && Intrinsics.areEqual(this.mainTask, tutorialUiState.mainTask) && Intrinsics.areEqual(this.additionalTasksList, tutorialUiState.additionalTasksList) && this.isNewVersionVisible == tutorialUiState.isNewVersionVisible && this.isInterfaceVisible == tutorialUiState.isInterfaceVisible && this.isNeedClose == tutorialUiState.isNeedClose && this.isBlockingLoading == tutorialUiState.isBlockingLoading;
    }

    public int hashCode() {
        return (((((((((((((((((Integer.hashCode(this.avatarNumber) * 31) + this.hintScreenType.hashCode()) * 31) + this.hintTitle.hashCode()) * 31) + this.hintDesc.hashCode()) * 31) + this.mainTask.hashCode()) * 31) + this.additionalTasksList.hashCode()) * 31) + Boolean.hashCode(this.isNewVersionVisible)) * 31) + Boolean.hashCode(this.isInterfaceVisible)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "TutorialUiState(avatarNumber=" + this.avatarNumber + ", hintScreenType=" + this.hintScreenType + ", hintTitle=" + this.hintTitle + ", hintDesc=" + this.hintDesc + ", mainTask=" + this.mainTask + ", additionalTasksList=" + this.additionalTasksList + ", isNewVersionVisible=" + this.isNewVersionVisible + ", isInterfaceVisible=" + this.isInterfaceVisible + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public TutorialUiState(int i, @NotNull TutorialEnum hintScreenType, @NotNull String hintTitle, @NotNull String hintDesc, @NotNull HintQuestData mainTask, @NotNull List<HintQuestData> additionalTasksList, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(hintScreenType, "hintScreenType");
        Intrinsics.checkNotNullParameter(hintTitle, "hintTitle");
        Intrinsics.checkNotNullParameter(hintDesc, "hintDesc");
        Intrinsics.checkNotNullParameter(mainTask, "mainTask");
        Intrinsics.checkNotNullParameter(additionalTasksList, "additionalTasksList");
        this.avatarNumber = i;
        this.hintScreenType = hintScreenType;
        this.hintTitle = hintTitle;
        this.hintDesc = hintDesc;
        this.mainTask = mainTask;
        this.additionalTasksList = additionalTasksList;
        this.isNewVersionVisible = z;
        this.isInterfaceVisible = z2;
        this.isNeedClose = z3;
        this.isBlockingLoading = z4;
    }

    public final int getAvatarNumber() {
        return this.avatarNumber;
    }

    public /* synthetic */ TutorialUiState(int i, TutorialEnum tutorialEnum, String str, String str2, HintQuestData hintQuestData, List list, boolean z, boolean z2, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? TutorialEnum.NONE : tutorialEnum, (i2 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 16) != 0 ? new HintQuestData(null, 0, 0, 0L, false, 31, null) : hintQuestData, (i2 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 64) != 0 ? true : z, (i2 & 128) == 0 ? z2 : true, (i2 & 256) != 0 ? false : z3, (i2 & 512) == 0 ? z4 : false);
    }

    @NotNull
    public final TutorialEnum getHintScreenType() {
        return this.hintScreenType;
    }

    @NotNull
    public final String getHintTitle() {
        return this.hintTitle;
    }

    @NotNull
    public final String getHintDesc() {
        return this.hintDesc;
    }

    @NotNull
    public final HintQuestData getMainTask() {
        return this.mainTask;
    }

    @NotNull
    public final List<HintQuestData> getAdditionalTasksList() {
        return this.additionalTasksList;
    }

    public final boolean isNewVersionVisible() {
        return this.isNewVersionVisible;
    }

    public final boolean isInterfaceVisible() {
        return this.isInterfaceVisible;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    @DrawableRes
    public final int getHintImage() {
        return this.avatarNumber == 1 ? R.drawable.img_firefighter : R.drawable.ic_instructor;
    }
}
