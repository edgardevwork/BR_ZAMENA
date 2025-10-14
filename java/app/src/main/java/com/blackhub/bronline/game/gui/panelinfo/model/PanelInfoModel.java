package com.blackhub.bronline.game.gui.panelinfo.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PanelInfoModel.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class PanelInfoModel {
    public static final int $stable = 8;

    @SerializedName("h")
    @NotNull
    public final List<PanelInfoContentModel> allHints;

    public PanelInfoModel() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PanelInfoModel copy$default(PanelInfoModel panelInfoModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = panelInfoModel.allHints;
        }
        return panelInfoModel.copy(list);
    }

    @NotNull
    public final List<PanelInfoContentModel> component1() {
        return this.allHints;
    }

    @NotNull
    public final PanelInfoModel copy(@NotNull List<PanelInfoContentModel> allHints) {
        Intrinsics.checkNotNullParameter(allHints, "allHints");
        return new PanelInfoModel(allHints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PanelInfoModel) && Intrinsics.areEqual(this.allHints, ((PanelInfoModel) other).allHints);
    }

    public int hashCode() {
        return this.allHints.hashCode();
    }

    @NotNull
    public String toString() {
        return "PanelInfoModel(allHints=" + this.allHints + ")";
    }

    public PanelInfoModel(@NotNull List<PanelInfoContentModel> allHints) {
        Intrinsics.checkNotNullParameter(allHints, "allHints");
        this.allHints = allHints;
    }

    public /* synthetic */ PanelInfoModel(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }

    @NotNull
    public final List<PanelInfoContentModel> getAllHints() {
        return this.allHints;
    }
}

