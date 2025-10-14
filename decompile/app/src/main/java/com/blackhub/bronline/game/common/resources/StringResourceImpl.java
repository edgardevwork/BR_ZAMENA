package com.blackhub.bronline.game.common.resources;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.style.ForegroundColorSpan;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorRes;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.StringExtensionKt;
import com.blackhub.bronline.game.core.resources.StringResource;
import com.blackhub.bronline.game.core.utils.UtilsKt;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.ivy.osgi.updatesite.xml.EclipseUpdateSiteParser;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StringResourceImpl.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b!\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J*\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\fH\u0016J\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\fH\u0016J\b\u0010\u0017\u001a\u00020\nH\u0016J\b\u0010\u0018\u001a\u00020\nH\u0016J\b\u0010\u0019\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001d\u001a\u00020\nH\u0016J\b\u0010\u001e\u001a\u00020\nH\u0016J\b\u0010\u001f\u001a\u00020\nH\u0016J\u0018\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\fH\u0016J \u0010#\u001a\u00020\n2\u0006\u0010!\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010$\u001a\u00020\fH\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\fH\u0016J\u0012\u0010'\u001a\u00020\f2\b\b\u0001\u0010(\u001a\u00020\fH\u0002J\u0010\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\fH\u0016J\b\u0010+\u001a\u00020\nH\u0016J\b\u0010,\u001a\u00020\nH\u0016J\b\u0010-\u001a\u00020\nH\u0016J\u001a\u0010.\u001a\u00020\n2\b\b\u0001\u0010/\u001a\u00020\f2\u0006\u00100\u001a\u00020\fH\u0016J\u0010\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\fH\u0016J+\u00101\u001a\u00020\n2\b\b\u0001\u00102\u001a\u00020\f2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020504\"\u000205H\u0016¢\u0006\u0002\u00106J\u0018\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\f2\u0006\u0010\u001b\u001a\u000207H\u0016J\u0018\u00101\u001a\u00020\n2\u0006\u00102\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\nH\u0016J\b\u00108\u001a\u00020\nH\u0016J\u0018\u00109\u001a\b\u0012\u0004\u0012\u00020\f0\u00122\b\b\u0001\u0010:\u001a\u00020\fH\u0002J\b\u0010;\u001a\u00020\nH\u0016J\b\u0010<\u001a\u00020\nH\u0016J\b\u0010=\u001a\u00020\nH\u0016J\b\u0010>\u001a\u00020\nH\u0016J\b\u0010?\u001a\u00020\nH\u0016J3\u0010@\u001a\u00020\n2\b\b\u0001\u0010:\u001a\u00020\f2\u0006\u00100\u001a\u00020\f2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020504\"\u000205H\u0002¢\u0006\u0002\u0010AJ\u000e\u0010B\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0004J\u0012\u0010C\u001a\u00020\n2\b\b\u0001\u0010:\u001a\u00020\fH\u0002J+\u0010C\u001a\u00020\n2\b\b\u0001\u0010:\u001a\u00020\f2\u0012\u00103\u001a\n\u0012\u0006\b\u0001\u0012\u00020504\"\u000205H\u0002¢\u0006\u0002\u00106J\u0010\u0010D\u001a\u00020\n2\u0006\u0010E\u001a\u00020\fH\u0016J\u0010\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020\nH\u0016J\u0010\u0010I\u001a\u00020G2\u0006\u0010J\u001a\u00020\nH\u0016J\u0010\u0010K\u001a\u00020\n2\u0006\u0010L\u001a\u00020\nH\u0016J\u0010\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020OH\u0016J\u0010\u0010P\u001a\u00020G2\u0006\u0010Q\u001a\u00020\nH\u0016J\u0010\u0010R\u001a\u00020G2\u0006\u0010S\u001a\u00020\nH\u0016J\u0010\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020\fH\u0016J\b\u0010V\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006W"}, m7105d2 = {"Lcom/blackhub/bronline/game/common/resources/StringResourceImpl;", "Lcom/blackhub/bronline/game/core/resources/StringResource;", "()V", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "contextRef", "Ljava/lang/ref/WeakReference;", "adminToolsTableTitle", "", "typeScreen", "", EclipseUpdateSiteParser.CategoryHandler.CATEGORY, "playerName", "playerId", "adminToolsTemplateTitle", "bpBoostListOfLevels", "", "bpDialogConfirmationLastChanceBodyMessage", "levels", "bpHeader", "level", "bpHeaderMax", "calendarBottomTextIsAvailable", "calendarBottomTextIsReceived", "calendarDescriptionBonusReward", "value", "calendarDescriptionMainReward", "calendarIsAllRewardsReceived", "calendarIsRewardOpened", "calendarTextIsFinishedSeason", "casesOpenCase", "caseName", "caseValue", "casesPurchaseCase", "caseCost", "casesSprayRewards", "valueOfDust", "colorBR", "id", "errorWithCode", "errorCode", "findProblemEarly", "findProblemFuseRanOut", "findProblemMultimeterIsNotVisible", "getQuantityString", "pluralId", "amount", "getString", "stringId", "formatArgs", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "", "getUnknown", "integerList", "resId", "linkTG", "linkVK", "notificationDefaultButton", "platesDefaultHint", "platesMainHint", "plural", "(II[Ljava/lang/Object;)Ljava/lang/String;", "setupContext", TypedValues.Custom.S_STRING, "taxiCountOrders", "orders", "taxiDistance", "Landroid/text/SpannedString;", "distance", "taxiEndPoint", "endPoint", "taxiPrice", FirebaseAnalytics.Param.PRICE, "taxiRating", "rating", "", "taxiStartPoint", "startPoint", "taxiTime", "time", "taxiTotalCash", "totalCash", "tuningError", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nStringResourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringResourceImpl.kt\ncom/blackhub/bronline/game/common/resources/StringResourceImpl\n+ 2 SpannableStringBuilder.kt\nandroidx/core/text/SpannableStringBuilderKt\n*L\n1#1,280:1\n41#2,2:281\n115#2:283\n74#2,4:284\n43#2:288\n41#2,2:289\n115#2:291\n74#2,4:292\n43#2:296\n41#2,2:297\n115#2:299\n74#2,4:300\n43#2:304\n41#2,2:305\n115#2:307\n74#2,4:308\n43#2:312\n*S KotlinDebug\n*F\n+ 1 StringResourceImpl.kt\ncom/blackhub/bronline/game/common/resources/StringResourceImpl\n*L\n118#1:281,2\n120#1:283\n120#1:284,4\n118#1:288\n127#1:289,2\n129#1:291\n129#1:292,4\n127#1:296\n136#1:297,2\n138#1:299\n138#1:300,4\n136#1:304\n145#1:305,2\n147#1:307\n147#1:308,4\n145#1:312\n*E\n"})
/* loaded from: classes3.dex */
public final class StringResourceImpl implements StringResource {
    public static final int $stable = 8;

    @NotNull
    public WeakReference<Context> contextRef = new WeakReference<>(null);

    private final Context getContext() {
        Context context = this.contextRef.get();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String getString(int stringId) {
        return string(stringId);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String getString(int stringId, @NotNull Number value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return string(stringId, value);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String getString(int stringId, @NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return string(stringId, value);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String getString(@StringRes int stringId, @NotNull Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        return string(stringId, Arrays.copyOf(formatArgs, formatArgs.length));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String getQuantityString(@PluralsRes int pluralId, int amount) {
        return plural(pluralId, amount, Integer.valueOf(amount));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String taxiRating(double rating) {
        return string(R.string.taxi_rating, Double.valueOf(rating));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String taxiCountOrders(int orders) {
        return string(R.string.taxi_orders, Integer.valueOf(orders));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String taxiTotalCash(int totalCash) {
        return string(R.string.taxi_total_cash, StringExtensionKt.formatMoneyAmount$default(totalCash, false, false, 2, (Object) null));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String taxiPrice(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "price");
        return StringExtensionKt.formatMoneyAmount(StringExtensionKt.toFloatOrZero(str));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String findProblemEarly() {
        return string(R.string.electric_find_problem_early);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String findProblemFuseRanOut() {
        return string(R.string.electric_find_problem_fuse_ran_out);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String findProblemMultimeterIsNotVisible() {
        return string(R.string.electric_find_problem_multimeter_is_not_visible);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String getUnknown() {
        return string(R.string.common_unknown);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String errorWithCode(int errorCode) {
        return string(R.string.common_error_with_key, Integer.valueOf(errorCode));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String bpDialogConfirmationLastChanceBodyMessage(int levels) {
        if (levels == 1) {
            return string(R.string.black_pass_action_level_up, Integer.valueOf(levels));
        }
        return string(R.string.black_pass_action_levels_up, Integer.valueOf(levels));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public List<Integer> bpBoostListOfLevels() {
        return integerList(R.array.black_pass_boost_levels);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String bpHeader(int level) {
        if (level == 1) {
            return string(R.string.black_pass_boost_plus_level, Integer.valueOf(level));
        }
        return string(R.string.black_pass_boost_plus_levels, Integer.valueOf(level));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String bpHeaderMax() {
        return string(R.string.black_pass_boost_max_level);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String notificationDefaultButton() {
        return string(R.string.common_continue);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String linkVK() {
        return string(R.string.social_network_link_button_vk_title);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String linkTG() {
        return string(R.string.social_network_link_button_telegram_title);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String tuningError() {
        return string(R.string.tuning_unknown_error);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String adminToolsTableTitle(int typeScreen, @Nullable String str, @NotNull String playerName, int playerId) {
        String strString;
        Intrinsics.checkNotNullParameter(playerName, "playerName");
        if (typeScreen == 2) {
            String strString2 = str != null ? string(R.string.admin_tools_tracking_panel_table_title, str) : null;
            return strString2 == null ? "" : strString2;
        }
        if (typeScreen == 4) {
            return string(R.string.admin_tools_report_table_title, playerName, Integer.valueOf(playerId));
        }
        if (typeScreen != 8) {
            return string(R.string.admin_tools_table_title_before_category);
        }
        return (str == null || (strString = string(R.string.admin_tools_table_title_with_category, str)) == null) ? string(R.string.admin_tools_table_title_before_category) : strString;
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String adminToolsTemplateTitle(int typeScreen, @Nullable String str) {
        String strString;
        String strString2;
        if (typeScreen == 9) {
            return (str == null || (strString = string(R.string.admin_tools_template_add_new_title_with_category, str)) == null) ? string(R.string.admin_tools_template_add_new_title_before_category) : strString;
        }
        if (typeScreen != 82) {
            return string(R.string.admin_tools_template_add_new_title_before_category);
        }
        return (str == null || (strString2 = string(R.string.admin_tools_template_editing_title_with_category, str)) == null) ? string(R.string.admin_tools_template_editing_title_before_category) : strString2;
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String platesDefaultHint() {
        return string(R.string.plates_change_country);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String platesMainHint() {
        return string(R.string.plates_main_hint);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String calendarDescriptionMainReward(int value) {
        return string(R.string.calendar_description_main_reward, Integer.valueOf(value));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String calendarDescriptionBonusReward(int value) {
        return string(R.string.calendar_description_bonus_reward, Integer.valueOf(value));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String calendarIsRewardOpened() {
        return string(R.string.calendar_reward_received);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String calendarIsAllRewardsReceived() {
        return string(R.string.calendar_reward_all_received);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String calendarBottomTextIsReceived() {
        return string(R.string.calendar_bottom_text_is_received);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String calendarBottomTextIsAvailable() {
        return string(R.string.calendar_bottom_text_is_available);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String calendarTextIsFinishedSeason() {
        return string(R.string.calendar_reward_finished_season);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String casesPurchaseCase(@NotNull String caseName, int caseValue, int caseCost) {
        Intrinsics.checkNotNullParameter(caseName, "caseName");
        return string(R.string.cases_opening_case_with_bc, caseName, Integer.valueOf(caseValue), Integer.valueOf(caseCost));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String casesOpenCase(@NotNull String caseName, int caseValue) {
        Intrinsics.checkNotNullParameter(caseName, "caseName");
        return string(R.string.cases_opening_case, caseName, Integer.valueOf(caseValue));
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public String casesSprayRewards(int valueOfDust) {
        return string(R.string.cases_spray_request_info, Integer.valueOf(valueOfDust));
    }

    @NotNull
    public final StringResourceImpl setupContext(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.contextRef.clear();
        this.contextRef = new WeakReference<>(context);
        return this;
    }

    public final String string(@StringRes int i) {
        String string = getContext().getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final String string(@StringRes int i, Object... objArr) {
        String string = getContext().getString(i, Arrays.copyOf(objArr, objArr.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public final String plural(@PluralsRes int resId, int amount, Object... formatArgs) throws Resources.NotFoundException {
        try {
            String quantityString = getContext().getResources().getQuantityString(resId, amount, Arrays.copyOf(formatArgs, formatArgs.length));
            Intrinsics.checkNotNull(quantityString);
            return quantityString;
        } catch (Resources.NotFoundException e) {
            UtilsKt.crashlyticsRecordNewException("StringResourceImpl plural (" + resId + ") NotFoundException: " + e);
            return AnyExtensionKt.empty(StringCompanionObject.INSTANCE);
        }
    }

    public final List<Integer> integerList(@ArrayRes int resId) throws Resources.NotFoundException {
        int[] intArray = getContext().getResources().getIntArray(resId);
        Intrinsics.checkNotNullExpressionValue(intArray, "getIntArray(...)");
        return ArraysKt___ArraysKt.toList(intArray);
    }

    public final int colorBR(@ColorRes int id) {
        return getContext().getColor(id);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public SpannedString taxiStartPoint(@NotNull String startPoint) {
        Intrinsics.checkNotNullParameter(startPoint, "startPoint");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string(R.string.taxi_start_point));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(colorBR(R.color.white));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) startPoint);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public SpannedString taxiEndPoint(@NotNull String endPoint) {
        Intrinsics.checkNotNullParameter(endPoint, "endPoint");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string(R.string.taxi_end_point));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(colorBR(R.color.white));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) endPoint);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public SpannedString taxiDistance(@NotNull String distance) {
        Intrinsics.checkNotNullParameter(distance, "distance");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string(R.string.taxi_distance));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(colorBR(R.color.white));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) distance);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.blackhub.bronline.game.core.resources.StringResource
    @NotNull
    public SpannedString taxiTime(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) string(R.string.taxi_time));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(colorBR(R.color.white));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) time);
        spannableStringBuilder.setSpan(foregroundColorSpan, length, spannableStringBuilder.length(), 17);
        return new SpannedString(spannableStringBuilder);
    }
}
