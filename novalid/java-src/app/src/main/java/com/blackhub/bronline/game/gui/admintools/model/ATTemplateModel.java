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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\n¨\u0006\u001c"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/admintools/model/ATTemplateModel;", "", "templateId", "", "templateTitle", "", "templateDesc", "templateTime", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getTemplateDesc", "()Ljava/lang/String;", "getTemplateId", "()I", "getTemplateTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTemplateTitle", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/blackhub/bronline/game/gui/admintools/model/ATTemplateModel;", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
