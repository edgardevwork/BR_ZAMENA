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
@Metadata(m7104d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\tHÆ\u0003J5\u0010\u0013\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0004HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000f¨\u0006\u001a"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/panelinfo/PanelInfoUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "images", "", "", "Landroid/graphics/Bitmap;", "hintModel", "Lcom/blackhub/bronline/game/gui/panelinfo/model/PanelInfoModel;", "isNeedClose", "", "(Ljava/util/Map;Lcom/blackhub/bronline/game/gui/panelinfo/model/PanelInfoModel;Z)V", "getHintModel", "()Lcom/blackhub/bronline/game/gui/panelinfo/model/PanelInfoModel;", "getImages", "()Ljava/util/Map;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
