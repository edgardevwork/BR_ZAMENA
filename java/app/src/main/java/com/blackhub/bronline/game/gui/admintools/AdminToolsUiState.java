package com.blackhub.bronline.game.gui.admintools;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.admintools.model.ATPlayerInfoItemModel;
import com.blackhub.bronline.game.gui.admintools.model.ATTemplateModel;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.IntRange;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AdminToolsUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class AdminToolsUiState implements UiState {
    public static final int $stable = 8;
    public final int categoryId;

    @NotNull
    public final String categoryTitle;

    @Nullable
    public final ATTemplateModel currentTemplate;
    public final boolean isBlockingLoading;
    public final boolean isInterfaceVisible;
    public final boolean isNeedClose;
    public final boolean isShowConfirmation;
    public final boolean isShowTable;
    public final int playerId;

    @NotNull
    public final List<ATPlayerInfoItemModel> playerInfoList;

    @NotNull
    public final String playerName;

    @NotNull
    public final String playerReport;
    public final int screenType;

    @NotNull
    public final String tableTitle;

    @NotNull
    public final List<ATTemplateModel> templateList;

    @NotNull
    public final String templateTitle;

    public AdminToolsUiState() {
        this(0, 0, null, null, null, null, null, null, 0, null, null, false, false, false, false, false, 65535, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScreenType() {
        return this.screenType;
    }

    @NotNull
    public final List<ATTemplateModel> component10() {
        return this.templateList;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final ATTemplateModel getCurrentTemplate() {
        return this.currentTemplate;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsShowTable() {
        return this.isShowTable;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsShowConfirmation() {
        return this.isShowConfirmation;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsInterfaceVisible() {
        return this.isInterfaceVisible;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPlayerId() {
        return this.playerId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPlayerName() {
        return this.playerName;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getPlayerReport() {
        return this.playerReport;
    }

    @NotNull
    public final List<ATPlayerInfoItemModel> component5() {
        return this.playerInfoList;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getTableTitle() {
        return this.tableTitle;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    /* renamed from: component9, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final AdminToolsUiState copy(int screenType, int playerId, @NotNull String playerName, @NotNull String playerReport, @NotNull List<ATPlayerInfoItemModel> playerInfoList, @NotNull String tableTitle, @NotNull String templateTitle, @NotNull String categoryTitle, int categoryId, @NotNull List<ATTemplateModel> templateList, @Nullable ATTemplateModel currentTemplate, boolean isShowTable, boolean isShowConfirmation, boolean isInterfaceVisible, boolean isNeedClose, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(playerReport, "playerReport");
        Intrinsics.checkNotNullParameter(playerInfoList, "playerInfoList");
        Intrinsics.checkNotNullParameter(tableTitle, "tableTitle");
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
        Intrinsics.checkNotNullParameter(templateList, "templateList");
        return new AdminToolsUiState(screenType, playerId, playerName, playerReport, playerInfoList, tableTitle, templateTitle, categoryTitle, categoryId, templateList, currentTemplate, isShowTable, isShowConfirmation, isInterfaceVisible, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdminToolsUiState)) {
            return false;
        }
        AdminToolsUiState adminToolsUiState = (AdminToolsUiState) other;
        return this.screenType == adminToolsUiState.screenType && this.playerId == adminToolsUiState.playerId && Intrinsics.areEqual(this.playerName, adminToolsUiState.playerName) && Intrinsics.areEqual(this.playerReport, adminToolsUiState.playerReport) && Intrinsics.areEqual(this.playerInfoList, adminToolsUiState.playerInfoList) && Intrinsics.areEqual(this.tableTitle, adminToolsUiState.tableTitle) && Intrinsics.areEqual(this.templateTitle, adminToolsUiState.templateTitle) && Intrinsics.areEqual(this.categoryTitle, adminToolsUiState.categoryTitle) && this.categoryId == adminToolsUiState.categoryId && Intrinsics.areEqual(this.templateList, adminToolsUiState.templateList) && Intrinsics.areEqual(this.currentTemplate, adminToolsUiState.currentTemplate) && this.isShowTable == adminToolsUiState.isShowTable && this.isShowConfirmation == adminToolsUiState.isShowConfirmation && this.isInterfaceVisible == adminToolsUiState.isInterfaceVisible && this.isNeedClose == adminToolsUiState.isNeedClose && this.isBlockingLoading == adminToolsUiState.isBlockingLoading;
    }

    @StringRes
    public final int getValidationChars() {
        return R.string.common_edittext_allowed_characters_for_admin_tools;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((((Integer.hashCode(this.screenType) * 31) + Integer.hashCode(this.playerId)) * 31) + this.playerName.hashCode()) * 31) + this.playerReport.hashCode()) * 31) + this.playerInfoList.hashCode()) * 31) + this.tableTitle.hashCode()) * 31) + this.templateTitle.hashCode()) * 31) + this.categoryTitle.hashCode()) * 31) + Integer.hashCode(this.categoryId)) * 31) + this.templateList.hashCode()) * 31;
        ATTemplateModel aTTemplateModel = this.currentTemplate;
        return ((((((((((iHashCode + (aTTemplateModel == null ? 0 : aTTemplateModel.hashCode())) * 31) + Boolean.hashCode(this.isShowTable)) * 31) + Boolean.hashCode(this.isShowConfirmation)) * 31) + Boolean.hashCode(this.isInterfaceVisible)) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "AdminToolsUiState(screenType=" + this.screenType + ", playerId=" + this.playerId + ", playerName=" + this.playerName + ", playerReport=" + this.playerReport + ", playerInfoList=" + this.playerInfoList + ", tableTitle=" + this.tableTitle + ", templateTitle=" + this.templateTitle + ", categoryTitle=" + this.categoryTitle + ", categoryId=" + this.categoryId + ", templateList=" + this.templateList + ", currentTemplate=" + this.currentTemplate + ", isShowTable=" + this.isShowTable + ", isShowConfirmation=" + this.isShowConfirmation + ", isInterfaceVisible=" + this.isInterfaceVisible + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public AdminToolsUiState(int i, int i2, @NotNull String playerName, @NotNull String playerReport, @NotNull List<ATPlayerInfoItemModel> playerInfoList, @NotNull String tableTitle, @NotNull String templateTitle, @NotNull String categoryTitle, int i3, @NotNull List<ATTemplateModel> templateList, @Nullable ATTemplateModel aTTemplateModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        Intrinsics.checkNotNullParameter(playerReport, "playerReport");
        Intrinsics.checkNotNullParameter(playerInfoList, "playerInfoList");
        Intrinsics.checkNotNullParameter(tableTitle, "tableTitle");
        Intrinsics.checkNotNullParameter(templateTitle, "templateTitle");
        Intrinsics.checkNotNullParameter(categoryTitle, "categoryTitle");
        Intrinsics.checkNotNullParameter(templateList, "templateList");
        this.screenType = i;
        this.playerId = i2;
        this.playerName = playerName;
        this.playerReport = playerReport;
        this.playerInfoList = playerInfoList;
        this.tableTitle = tableTitle;
        this.templateTitle = templateTitle;
        this.categoryTitle = categoryTitle;
        this.categoryId = i3;
        this.templateList = templateList;
        this.currentTemplate = aTTemplateModel;
        this.isShowTable = z;
        this.isShowConfirmation = z2;
        this.isInterfaceVisible = z3;
        this.isNeedClose = z4;
        this.isBlockingLoading = z5;
    }

    public final int getScreenType() {
        return this.screenType;
    }

    public final int getPlayerId() {
        return this.playerId;
    }

    public /* synthetic */ AdminToolsUiState(int i, int i2, String str, String str2, List list, String str3, String str4, String str5, int i3, List list2, ATTemplateModel aTTemplateModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i4 & 8) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i4 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 32) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i4 & 64) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str4, (i4 & 128) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str5, (i4 & 256) != 0 ? 0 : i3, (i4 & 512) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i4 & 1024) != 0 ? new ATTemplateModel(0, null, null, null, 15, null) : aTTemplateModel, (i4 & 2048) != 0 ? false : z, (i4 & 4096) != 0 ? false : z2, (i4 & 8192) != 0 ? true : z3, (i4 & 16384) != 0 ? false : z4, (i4 & 32768) != 0 ? false : z5);
    }

    @NotNull
    public final String getPlayerName() {
        return this.playerName;
    }

    @NotNull
    public final String getPlayerReport() {
        return this.playerReport;
    }

    @NotNull
    public final List<ATPlayerInfoItemModel> getPlayerInfoList() {
        return this.playerInfoList;
    }

    @NotNull
    public final String getTableTitle() {
        return this.tableTitle;
    }

    @NotNull
    public final String getTemplateTitle() {
        return this.templateTitle;
    }

    @NotNull
    public final String getCategoryTitle() {
        return this.categoryTitle;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @NotNull
    public final List<ATTemplateModel> getTemplateList() {
        return this.templateList;
    }

    @Nullable
    public final ATTemplateModel getCurrentTemplate() {
        return this.currentTemplate;
    }

    public final boolean isShowTable() {
        return this.isShowTable;
    }

    public final boolean isShowConfirmation() {
        return this.isShowConfirmation;
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

    @StringRes
    public final int getCategory() {
        int i = this.categoryId;
        return i != 3 ? i != 4 ? i != 5 ? i != 6 ? i != 7 ? R.string.admin_tools_ban : R.string.admin_tools_slap : R.string.admin_tools_warn : R.string.admin_tools_jail : R.string.admin_tools_mute : R.string.admin_tools_kick;
    }

    @StringRes
    @Nullable
    public final Integer getTimeTitle() {
        int i = this.categoryId;
        if (i == 4 || i == 5) {
            return Integer.valueOf(R.string.admin_tools_punishment_time_min);
        }
        if (i != 8) {
            return null;
        }
        return Integer.valueOf(R.string.admin_tools_punishment_time_days);
    }

    public final boolean isShowTemplateTime() {
        int i = this.categoryId;
        return i == 4 || i == 5 || i == 8;
    }

    @Nullable
    public final IntRange getTimeRange() {
        int i = this.categoryId;
        if (i == 4) {
            return new IntRange(0, 300);
        }
        if (i == 5) {
            return new IntRange(0, 120);
        }
        if (i != 8) {
            return null;
        }
        return new IntRange(0, 90);
    }
}

