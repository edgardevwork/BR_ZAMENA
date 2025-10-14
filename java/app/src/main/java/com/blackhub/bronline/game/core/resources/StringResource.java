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

