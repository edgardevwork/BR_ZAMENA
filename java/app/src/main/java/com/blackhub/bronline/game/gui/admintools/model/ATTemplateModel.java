package com.blackhub.bronline.game.gui.admintools.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.admintools.AdminToolsKeys;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ATTemplateModel.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class ATTemplateModel {
    public static final int $stable = 0;

    @SerializedName(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_DESC_KEY)
    @NotNull
    public final String templateDesc;

    @SerializedName(AdminToolsKeys.ADMIN_TOOLS_TABLE_BUTTON_ID_KEY)
    public final int templateId;

    @SerializedName("br")
    @Nullable
    public final Integer templateTime;

    @SerializedName("bn")
    @NotNull
    public final String templateTitle;

    public ATTemplateModel() {
        this(0, null, null, null, 15, null);
    }

    public static /* synthetic */ ATTemplateModel copy$default(ATTemplateModel aTTemplateModel, int i, String str, String str2, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aTTemplateModel.templateId;
        }
        if ((i2 & 2) != 0) {
            str = aTTemplateModel.templateTitle;
        }
        if ((i2 & 4) != 0) {
            str2 = aTTemplateModel.templateDesc;
        }
        if ((i2 & 8) != 0) {
            num = aTTemplateModel.templateTime;
        }
        return aTTemplateModel.copy(i, str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTemplateId() {
        return this.templateId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getTemplateDesc() {
        return this.templateDesc;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getTemplateTime() {
        return this.templateTime;
    }

    @NotNull
    public final ATTemplateModel copy(int templateId, @NotNull String templateTitle, @NotNull String templateDesc, @Nullable Integer templateTime) {
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(templateDesc, "templateDesc");
        return new ATTemplateModel(templateId, templateTitle, templateDesc, templateTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ATTemplateModel)) {
            return false;
        }
        ATTemplateModel aTTemplateModel = (ATTemplateModel) other;
        return this.templateId == aTTemplateModel.templateId && Intrinsics.areEqual(this.templateTitle, aTTemplateModel.templateTitle) && Intrinsics.areEqual(this.templateDesc, aTTemplateModel.templateDesc) && Intrinsics.areEqual(this.templateTime, aTTemplateModel.templateTime);
    }

    public int hashCode() {
        int iHashCode = ((((Integer.hashCode(this.templateId) * 31) + this.templateTitle.hashCode()) * 31) + this.templateDesc.hashCode()) * 31;
        Integer num = this.templateTime;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "ATTemplateModel(templateId=" + this.templateId + ", templateTitle=" + this.templateTitle + ", templateDesc=" + this.templateDesc + ", templateTime=" + this.templateTime + ")";
    }

    public ATTemplateModel(int i, @NotNull String templateTitle, @NotNull String templateDesc, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(templateDesc, "templateDesc");
        this.templateId = i;
        this.templateTitle = templateTitle;
        this.templateDesc = templateDesc;
        this.templateTime = num;
    }

    public final int getTemplateId() {
        return this.templateId;
    }

    public /* synthetic */ ATTemplateModel(int i, String str, String str2, Integer num, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i2 & 8) != 0 ? null : num);
    }

    @NotNull
    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    @NotNull
    public final String getTemplateDesc() {
        return this.templateDesc;
    }

    @Nullable
    public final Integer getTemplateTime() {
        return this.templateTime;
    }
}

