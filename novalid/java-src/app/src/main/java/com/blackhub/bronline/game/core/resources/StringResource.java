package com.blackhub.bronline.game.core.resources;

import android.text.SpannedString;
import androidx.annotation.StringRes;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringResource.kt */
@Metadata(m7104d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u001f\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0004\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0005H&J\u001c\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0005H&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\b\u0010\u0012\u001a\u00020\u0003H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0005H&J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0003H&J\b\u0010\u0018\u001a\u00020\u0003H&J\u0018\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0005H&J \u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0005H&J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0005H&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0005H&J\b\u0010\"\u001a\u00020\u0003H&J\b\u0010#\u001a\u00020\u0003H&J\b\u0010$\u001a\u00020\u0003H&J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H&J\u0010\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u0005H&J+\u0010(\u001a\u00020\u00032\b\b\u0001\u0010)\u001a\u00020\u00052\u0012\u0010*\u001a\n\u0012\u0006\b\u0001\u0012\u00020,0+\"\u00020,H&¢\u0006\u0002\u0010-J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020.H&J\u0018\u0010(\u001a\u00020\u00032\u0006\u0010)\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0003H&J\b\u0010/\u001a\u00020\u0003H&J\b\u00100\u001a\u00020\u0003H&J\b\u00101\u001a\u00020\u0003H&J\b\u00102\u001a\u00020\u0003H&J\b\u00103\u001a\u00020\u0003H&J\b\u00104\u001a\u00020\u0003H&J\u0010\u00105\u001a\u00020\u00032\u0006\u00106\u001a\u00020\u0005H&J\u0010\u00107\u001a\u0002082\u0006\u00109\u001a\u00020\u0003H&J\u0010\u0010:\u001a\u0002082\u0006\u0010;\u001a\u00020\u0003H&J\u0010\u0010<\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\u0003H&J\u0010\u0010>\u001a\u00020\u00032\u0006\u0010?\u001a\u00020@H&J\u0010\u0010A\u001a\u0002082\u0006\u0010B\u001a\u00020\u0003H&J\u0010\u0010C\u001a\u0002082\u0006\u0010D\u001a\u00020\u0003H&J\u0010\u0010E\u001a\u00020\u00032\u0006\u0010F\u001a\u00020\u0005H&J\b\u0010G\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006HÀ\u0006\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/resources/StringResource;", "Lcom/blackhub/bronline/game/core/resources/BaseResource;", "adminToolsTableTitle", "", "typeScreen", "", EclipseUpdateSiteParser.CategoryHandler.CATEGORY, "playerName", "playerId", "adminToolsTemplateTitle", "bpBoostListOfLevels", "", "bpDialogConfirmationLastChanceBodyMessage", "levels", "bpHeader", "level", "bpHeaderMax", "calendarBottomTextIsAvailable", "calendarBottomTextIsReceived", "calendarDescriptionBonusReward", "value", "calendarDescriptionMainReward", "calendarIsAllRewardsReceived", "calendarIsRewardOpened", "calendarTextIsFinishedSeason", "casesOpenCase", "caseName", "caseValue", "casesPurchaseCase", "caseCost", "casesSprayRewards", "valueOfDust", "errorWithCode", "errorCode", "findProblemEarly", "findProblemFuseRanOut", "findProblemMultimeterIsNotVisible", "getQuantityString", "pluralId", "amount", "getString", "stringId", "formatArgs", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "", "getUnknown", "linkTG", "linkVK", "notificationDefaultButton", "platesDefaultHint", "platesMainHint", "taxiCountOrders", "orders", "taxiDistance", "Landroid/text/SpannedString;", "distance", "taxiEndPoint", "endPoint", "taxiPrice", FirebaseAnalytics.Param.PRICE, "taxiRating", "rating", "", "taxiStartPoint", "startPoint", "taxiTime", "time", "taxiTotalCash", "totalCash", "tuningError", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public interface StringResource extends BaseResource {
    @NotNull
    String adminToolsTableTitle(int typeScreen, @Nullable String str, @NotNull String playerName, int playerId);

    @NotNull
    String adminToolsTemplateTitle(int typeScreen, @Nullable String str);

    @NotNull
    List<Integer> bpBoostListOfLevels();

    @NotNull
    String bpDialogConfirmationLastChanceBodyMessage(int levels);

    @NotNull
    String bpHeader(int level);

    @NotNull
    String bpHeaderMax();

    @NotNull
    String calendarBottomTextIsAvailable();

    @NotNull
    String calendarBottomTextIsReceived();

    @NotNull
    String calendarDescriptionBonusReward(int value);

    @NotNull
    String calendarDescriptionMainReward(int value);

    @NotNull
    String calendarIsAllRewardsReceived();

    @NotNull
    String calendarIsRewardOpened();

    @NotNull
    String calendarTextIsFinishedSeason();

    @NotNull
    String casesOpenCase(@NotNull String caseName, int caseValue);

    @NotNull
    String casesPurchaseCase(@NotNull String caseName, int caseValue, int caseCost);

    @NotNull
    String casesSprayRewards(int valueOfDust);

    @NotNull
    String errorWithCode(int errorCode);

    @NotNull
    String findProblemEarly();

    @NotNull
    String findProblemFuseRanOut();

    @NotNull
    String findProblemMultimeterIsNotVisible();

    @NotNull
    String getQuantityString(int pluralId, int amount);

    @NotNull
    String getString(int stringId);

    @NotNull
    String getString(int stringId, @NotNull Number value);

    @NotNull
    String getString(int stringId, @NotNull String value);

    @NotNull
    String getString(@StringRes int stringId, @NotNull Object... formatArgs);

    @NotNull
    String getUnknown();

    @NotNull
    String linkTG();

    @NotNull
    String linkVK();

    @NotNull
    String notificationDefaultButton();

    @NotNull
    String platesDefaultHint();

    @NotNull
    String platesMainHint();

    @NotNull
    String taxiCountOrders(int orders);

    @NotNull
    SpannedString taxiDistance(@NotNull String distance);

    @NotNull
    SpannedString taxiEndPoint(@NotNull String endPoint);

    @NotNull
    String taxiPrice(@NotNull String str);

    @NotNull
    String taxiRating(double rating);

    @NotNull
    SpannedString taxiStartPoint(@NotNull String startPoint);

    @NotNull
    SpannedString taxiTime(@NotNull String time);

    @NotNull
    String taxiTotalCash(int totalCash);

    @NotNull
    String tuningError();

    static /* synthetic */ String adminToolsTableTitle$default(StringResource stringResource, int i, String str, String str2, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adminToolsTableTitle");
        }
        if ((i3 & 2) != 0) {
            str = null;
        }
        if ((i3 & 4) != 0) {
            str2 = AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        return stringResource.adminToolsTableTitle(i, str, str2, i2);
    }

    static /* synthetic */ String adminToolsTemplateTitle$default(StringResource stringResource, int i, String str, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: adminToolsTemplateTitle");
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        return stringResource.adminToolsTemplateTitle(i, str);
    }
}
