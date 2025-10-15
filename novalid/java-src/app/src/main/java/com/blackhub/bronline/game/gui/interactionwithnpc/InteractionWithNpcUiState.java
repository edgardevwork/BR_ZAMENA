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
@Metadata(m7104d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n¢\u0006\u0002\u0010\u0015J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\nHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\t\u0010+\u001a\u00020\nHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010/\u001a\u00020\nHÆ\u0003J\u008b\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\nHÆ\u0001J\u0013\u00101\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\t\u00104\u001a\u00020\u0003HÖ\u0001J\t\u00105\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0014\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001aR\u0011\u0010\u0012\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u001aR\u0011\u0010\u001b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0011\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010 R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00066"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "screen", "", "textTitle", "", "textDesc", "typingSpeed", "", "isSkipText", "", "buttonList", "", "Lcom/blackhub/bronline/game/gui/interactionwithnpc/InteractionWithNpcButtonModel;", "renderId", "bitmap", "Landroid/graphics/Bitmap;", "isRenderNew", "isNeedStartPosition", "isNeedClose", "isBlockingLoading", "(ILjava/lang/String;Ljava/lang/String;JZLjava/util/List;ILandroid/graphics/Bitmap;ZZZZ)V", "getBitmap", "()Landroid/graphics/Bitmap;", "getButtonList", "()Ljava/util/List;", "()Z", "isRender", "getRenderId", "()I", "getScreen", "getTextDesc", "()Ljava/lang/String;", "getTextTitle", "getTypingSpeed", "()J", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
