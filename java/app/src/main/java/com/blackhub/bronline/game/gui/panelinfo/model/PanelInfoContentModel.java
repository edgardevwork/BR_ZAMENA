package com.blackhub.bronline.game.gui.panelinfo.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: PanelInfoContentModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class PanelInfoContentModel {
    public static final int $stable = 0;

    @SerializedName("d")
    @NotNull
    public final String descriptionText;

    @SerializedName("imageName")
    @NotNull
    public final String imageName;

    @SerializedName("tt")
    @NotNull
    public final String titleText;

    public PanelInfoContentModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ PanelInfoContentModel copy$default(PanelInfoContentModel panelInfoContentModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = panelInfoContentModel.titleText;
        }
        if ((i & 2) != 0) {
            str2 = panelInfoContentModel.descriptionText;
        }
        if ((i & 4) != 0) {
            str3 = panelInfoContentModel.imageName;
        }
        return panelInfoContentModel.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getImageName() {
        return this.imageName;
    }

    @NotNull
    public final PanelInfoContentModel copy(@NotNull String titleText, @NotNull String descriptionText, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        return new PanelInfoContentModel(titleText, descriptionText, imageName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PanelInfoContentModel)) {
            return false;
        }
        PanelInfoContentModel panelInfoContentModel = (PanelInfoContentModel) other;
        return Intrinsics.areEqual(this.titleText, panelInfoContentModel.titleText) && Intrinsics.areEqual(this.descriptionText, panelInfoContentModel.descriptionText) && Intrinsics.areEqual(this.imageName, panelInfoContentModel.imageName);
    }

    public int hashCode() {
        return (((this.titleText.hashCode() * 31) + this.descriptionText.hashCode()) * 31) + this.imageName.hashCode();
    }

    @NotNull
    public String toString() {
        return "PanelInfoContentModel(titleText=" + this.titleText + ", descriptionText=" + this.descriptionText + ", imageName=" + this.imageName + ")";
    }

    public PanelInfoContentModel(@NotNull String titleText, @NotNull String descriptionText, @NotNull String imageName) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(descriptionText, "descriptionText");
        Intrinsics.checkNotNullParameter(imageName, "imageName");
        this.titleText = titleText;
        this.descriptionText = descriptionText;
        this.imageName = imageName;
    }

    public /* synthetic */ PanelInfoContentModel(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3);
    }

    @NotNull
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    public final String getDescriptionText() {
        return this.descriptionText;
    }

    @NotNull
    public final String getImageName() {
        return this.imageName;
    }
}

