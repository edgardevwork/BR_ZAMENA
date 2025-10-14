package com.blackhub.bronline.game.gui.interactionwithnpc;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: InteractionWithNpcUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class InteractionWithNpcUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap bitmap;

    @Nullable
    public final List<InteractionWithNpcButtonModel> buttonList;
    public final boolean isBlockingLoading;
    public final boolean isNeedClose;
    public final boolean isNeedStartPosition;
    public final boolean isRenderNew;
    public final boolean isSkipText;
    public final int renderId;
    public final int screen;

    @NotNull
    public final String textDesc;

    @NotNull
    public final String textTitle;
    public final long typingSpeed;

    public InteractionWithNpcUiState() {
        this(0, null, null, 0L, false, null, 0, null, false, false, false, false, UnixStat.PERM_MASK, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScreen() {
        return this.screen;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsNeedStartPosition() {
        return this.isNeedStartPosition;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTextTitle() {
        return this.textTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTextDesc() {
        return this.textDesc;
    }

    /* renamed from: component4, reason: from getter */
    public final long getTypingSpeed() {
        return this.typingSpeed;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsSkipText() {
        return this.isSkipText;
    }

    @Nullable
    public final List<InteractionWithNpcButtonModel> component6() {
        return this.buttonList;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRenderId() {
        return this.renderId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsRenderNew() {
        return this.isRenderNew;
    }

    @NotNull
    public final InteractionWithNpcUiState copy(int screen, @NotNull String textTitle, @NotNull String textDesc, long typingSpeed, boolean isSkipText, @Nullable List<InteractionWithNpcButtonModel> buttonList, int renderId, @Nullable Bitmap bitmap, boolean isRenderNew, boolean isNeedStartPosition, boolean isNeedClose, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(textTitle, "textTitle");
        Intrinsics.checkNotNullParameter(textDesc, "textDesc");
        return new InteractionWithNpcUiState(screen, textTitle, textDesc, typingSpeed, isSkipText, buttonList, renderId, bitmap, isRenderNew, isNeedStartPosition, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InteractionWithNpcUiState)) {
            return false;
        }
        InteractionWithNpcUiState interactionWithNpcUiState = (InteractionWithNpcUiState) other;
        return this.screen == interactionWithNpcUiState.screen && Intrinsics.areEqual(this.textTitle, interactionWithNpcUiState.textTitle) && Intrinsics.areEqual(this.textDesc, interactionWithNpcUiState.textDesc) && this.typingSpeed == interactionWithNpcUiState.typingSpeed && this.isSkipText == interactionWithNpcUiState.isSkipText && Intrinsics.areEqual(this.buttonList, interactionWithNpcUiState.buttonList) && this.renderId == interactionWithNpcUiState.renderId && Intrinsics.areEqual(this.bitmap, interactionWithNpcUiState.bitmap) && this.isRenderNew == interactionWithNpcUiState.isRenderNew && this.isNeedStartPosition == interactionWithNpcUiState.isNeedStartPosition && this.isNeedClose == interactionWithNpcUiState.isNeedClose && this.isBlockingLoading == interactionWithNpcUiState.isBlockingLoading;
    }

    public int hashCode() {
        int iHashCode = ((((((((Integer.hashCode(this.screen) * 31) + this.textTitle.hashCode()) * 31) + this.textDesc.hashCode()) * 31) + Long.hashCode(this.typingSpeed)) * 31) + Boolean.hashCode(this.isSkipText)) * 31;
        List<InteractionWithNpcButtonModel> list = this.buttonList;
        int iHashCode2 = (((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.renderId)) * 31;
        Bitmap bitmap = this.bitmap;
        return ((((((((iHashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + Boolean.hashCode(this.isRenderNew)) * 31) + Boolean.hashCode(this.isNeedStartPosition)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "InteractionWithNpcUiState(screen=" + this.screen + ", textTitle=" + this.textTitle + ", textDesc=" + this.textDesc + ", typingSpeed=" + this.typingSpeed + ", isSkipText=" + this.isSkipText + ", buttonList=" + this.buttonList + ", renderId=" + this.renderId + ", bitmap=" + this.bitmap + ", isRenderNew=" + this.isRenderNew + ", isNeedStartPosition=" + this.isNeedStartPosition + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public InteractionWithNpcUiState(int i, @NotNull String textTitle, @NotNull String textDesc, long j, boolean z, @Nullable List<InteractionWithNpcButtonModel> list, int i2, @Nullable Bitmap bitmap, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(textTitle, "textTitle");
        Intrinsics.checkNotNullParameter(textDesc, "textDesc");
        this.screen = i;
        this.textTitle = textTitle;
        this.textDesc = textDesc;
        this.typingSpeed = j;
        this.isSkipText = z;
        this.buttonList = list;
        this.renderId = i2;
        this.bitmap = bitmap;
        this.isRenderNew = z2;
        this.isNeedStartPosition = z3;
        this.isNeedClose = z4;
        this.isBlockingLoading = z5;
    }

    public final int getScreen() {
        return this.screen;
    }

    public /* synthetic */ InteractionWithNpcUiState(int i, String str, String str2, long j, boolean z, List list, int i2, Bitmap bitmap, boolean z2, boolean z3, boolean z4, boolean z5, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i3 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i3 & 8) != 0 ? 0L : j, (i3 & 16) != 0 ? true : z, (i3 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i3 & 64) != 0 ? 0 : i2, (i3 & 128) != 0 ? null : bitmap, (i3 & 256) == 0 ? z2 : true, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z4, (i3 & 2048) == 0 ? z5 : false);
    }

    @NotNull
    public final String getTextTitle() {
        return this.textTitle;
    }

    @NotNull
    public final String getTextDesc() {
        return this.textDesc;
    }

    public final long getTypingSpeed() {
        return this.typingSpeed;
    }

    public final boolean isSkipText() {
        return this.isSkipText;
    }

    @Nullable
    public final List<InteractionWithNpcButtonModel> getButtonList() {
        return this.buttonList;
    }

    public final int getRenderId() {
        return this.renderId;
    }

    @Nullable
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    public final boolean isRenderNew() {
        return this.isRenderNew;
    }

    public final boolean isNeedStartPosition() {
        return this.isNeedStartPosition;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    public final boolean isRender() {
        int i = this.renderId;
        return (i == -1 || i == 0) ? false : true;
    }
}

