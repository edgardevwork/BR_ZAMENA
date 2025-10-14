package com.blackhub.bronline.game.gui.panelinfo;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.panelinfo.model.PanelInfoModel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PanelInfoUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class PanelInfoUiState implements UiState {
    public static final int $stable = 8;

    @NotNull
    public final PanelInfoModel hintModel;

    @NotNull
    public final Map<String, Bitmap> images;
    public final boolean isNeedClose;

    public PanelInfoUiState() {
        this(null, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PanelInfoUiState copy$default(PanelInfoUiState panelInfoUiState, Map map, PanelInfoModel panelInfoModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            map = panelInfoUiState.images;
        }
        if ((i & 2) != 0) {
            panelInfoModel = panelInfoUiState.hintModel;
        }
        if ((i & 4) != 0) {
            z = panelInfoUiState.isNeedClose;
        }
        return panelInfoUiState.copy(map, panelInfoModel, z);
    }

    @NotNull
    public final Map<String, Bitmap> component1() {
        return this.images;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final PanelInfoModel getHintModel() {
        return this.hintModel;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final PanelInfoUiState copy(@NotNull Map<String, Bitmap> images, @NotNull PanelInfoModel hintModel, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(hintModel, "hintModel");
        return new PanelInfoUiState(images, hintModel, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PanelInfoUiState)) {
            return false;
        }
        PanelInfoUiState panelInfoUiState = (PanelInfoUiState) other;
        return Intrinsics.areEqual(this.images, panelInfoUiState.images) && Intrinsics.areEqual(this.hintModel, panelInfoUiState.hintModel) && this.isNeedClose == panelInfoUiState.isNeedClose;
    }

    public int hashCode() {
        return (((this.images.hashCode() * 31) + this.hintModel.hashCode()) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "PanelInfoUiState(images=" + this.images + ", hintModel=" + this.hintModel + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public PanelInfoUiState(@NotNull Map<String, Bitmap> images, @NotNull PanelInfoModel hintModel, boolean z) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(hintModel, "hintModel");
        this.images = images;
        this.hintModel = hintModel;
        this.isNeedClose = z;
    }

    public /* synthetic */ PanelInfoUiState(Map map, PanelInfoModel panelInfoModel, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i & 2) != 0 ? new PanelInfoModel(null, 1, null) : panelInfoModel, (i & 4) != 0 ? false : z);
    }

    @NotNull
    public final Map<String, Bitmap> getImages() {
        return this.images;
    }

    @NotNull
    public final PanelInfoModel getHintModel() {
        return this.hintModel;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}

