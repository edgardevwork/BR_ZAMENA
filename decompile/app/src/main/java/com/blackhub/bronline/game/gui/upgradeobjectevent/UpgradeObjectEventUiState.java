package com.blackhub.bronline.game.gui.upgradeobjectevent;

import android.graphics.Bitmap;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.common.C2732C;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.constants.resources.PngConstantsId68;
import com.blackhub.bronline.game.core.constants.resources.SvgConstantsId68;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.core.extension.IntExtensionKt;
import com.blackhub.bronline.game.core.utils.attachment.CommonEventTopListModel;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.GiftPrizeModel;
import com.blackhub.bronline.game.gui.upgradeobjectevent.model.UpgradeObjectEventTopListOfServersItem;
import com.blackhub.bronline.launcher.network.Server;
import com.bless.client.R;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.apache.http.impl.auth.NTLMEngineImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventUiState.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\ba\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BÍ\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0003\u0012\b\b\u0002\u0010#\u001a\u00020\u0003\u0012\b\b\u0002\u0010$\u001a\u00020\u000b\u0012\b\b\u0002\u0010%\u001a\u00020\u000b\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\u0003\u0012\b\b\u0002\u0010+\u001a\u00020\u0003\u0012\b\b\u0002\u0010,\u001a\u00020\b\u0012\b\b\u0002\u0010-\u001a\u00020\b\u0012\b\b\u0002\u0010.\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(\u0012\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010(\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002040(\u0012\b\b\u0002\u00105\u001a\u00020\u000b\u0012\b\b\u0002\u00106\u001a\u00020\u000b¢\u0006\u0002\u00107J\t\u0010j\u001a\u00020\u0003HÆ\u0003J\t\u0010k\u001a\u00020\u000bHÆ\u0003J\t\u0010l\u001a\u00020\u000bHÆ\u0003J\t\u0010m\u001a\u00020\u000bHÆ\u0003J\t\u0010n\u001a\u00020\u000bHÆ\u0003J\t\u0010o\u001a\u00020\u000bHÆ\u0003J\t\u0010p\u001a\u00020\u000bHÆ\u0003J\t\u0010q\u001a\u00020\u000bHÆ\u0003J\t\u0010r\u001a\u00020\u0003HÆ\u0003J\t\u0010s\u001a\u00020\u0003HÆ\u0003J\t\u0010t\u001a\u00020\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010v\u001a\u00020\u0003HÆ\u0003J\t\u0010w\u001a\u00020\u0003HÆ\u0003J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\t\u0010y\u001a\u00020\u0003HÆ\u0003J\t\u0010z\u001a\u00020\bHÆ\u0003J\t\u0010{\u001a\u00020\u0003HÆ\u0003J\t\u0010|\u001a\u00020\u0003HÆ\u0003J\t\u0010}\u001a\u00020\u0003HÆ\u0003J\t\u0010~\u001a\u00020\u000bHÆ\u0003J\t\u0010\u007f\u001a\u00020\u000bHÆ\u0003J\u0018\u0010\u0080\u0001\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u000bHÆ\u0003J\u0012\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(HÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\u0003HÆ\u0003J\u0012\u0010\u0088\u0001\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(HÆ\u0003J\u0012\u0010\u0089\u0001\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010(HÆ\u0003J\u0010\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u0002040(HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\rHÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u000bHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u000bHÆ\u0003JÒ\u0003\u0010\u0093\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u00032\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00032\b\b\u0002\u0010#\u001a\u00020\u00032\b\b\u0002\u0010$\u001a\u00020\u000b2\b\b\u0002\u0010%\u001a\u00020\u000b2\b\b\u0002\u0010&\u001a\u00020\u000b2\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020\u00032\b\b\u0002\u0010+\u001a\u00020\u00032\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\b2\b\b\u0002\u0010.\u001a\u00020\u00032\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(2\u0010\b\u0002\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010(2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u0002040(2\b\b\u0002\u00105\u001a\u00020\u000b2\b\b\u0002\u00106\u001a\u00020\u000bHÆ\u0001J\u0016\u0010\u0094\u0001\u001a\u00020\u000b2\n\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u0096\u0001HÖ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0003HÖ\u0001J\n\u0010\u0098\u0001\u001a\u00020\bHÖ\u0001R\u0019\u00101\u001a\n\u0012\u0004\u0012\u000202\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010:\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0011\u0010=\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b>\u0010<R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@R\u0011\u0010\u001e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bA\u0010<R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bB\u0010<R\u0011\u0010C\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bD\u0010<R\u0011\u0010E\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bF\u0010<R\u0011\u0010\u001c\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bG\u0010<R\u0011\u0010\u001d\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bH\u0010<R\u0011\u0010\u001b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bI\u0010<R\u0013\u0010J\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bK\u0010@R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0013\u0010N\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\bO\u0010@R\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\bP\u0010QR\u0011\u00106\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b6\u0010RR\u0011\u0010\u0011\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010RR\u0011\u0010\u0012\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010RR\u0011\u0010\u0014\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010RR\u0011\u0010\u0013\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010RR\u0011\u0010\u0018\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010RR\u0011\u0010\u0010\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010RR\u0011\u00105\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b5\u0010RR\u0011\u0010\u0015\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010RR\u0011\u0010\u0017\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010RR\u0011\u0010\u0016\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010RR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010RR\u0011\u0010$\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010RR\u0011\u0010&\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b&\u0010RR\u0011\u0010%\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010RR\u0011\u0010,\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bS\u0010TR\u0011\u0010-\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bU\u0010TR\u0011\u0010.\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bV\u0010<R\u0011\u0010*\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bW\u0010<R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bX\u0010<R\u0011\u0010Y\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\bZ\u0010<R\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b[\u0010<R\u0011\u0010 \u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010TR\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002040(¢\u0006\b\n\u0000\u001a\u0004\b]\u00109R\u0019\u0010/\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b^\u00109R\u0019\u0010'\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010(¢\u0006\b\n\u0000\u001a\u0004\b_\u00109R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b`\u0010<R\u0011\u0010a\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\bb\u0010<R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\bc\u0010dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\be\u0010fR\u0011\u0010!\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bg\u0010<R\u0011\u0010#\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bh\u0010<R\u0011\u0010\"\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\bi\u0010<¨\u0006\u0099\u0001"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "eventId", "", "bgImage", "Landroid/graphics/Bitmap;", "images", "", "", "typeScreen", "isUpgradeObjectPlayer", "", "upgradeObjectStrings", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventStrings;", "upgradeObjectImages", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventImages;", "isLevelUpgradeObjectOpen", "isBuyGiftOpen", "isEnergyInfoOpen", "isGiftQuestionOpen", "isGiftOpen", "isTopListOpen", "isTopListServerOpen", "isTopListPlayerOpen", "isInfoVisible", "eventLevel", FirebaseAnalytics.Param.CURRENCY, "currencySpent", "currencyProgressScorePlayer", "currencyProgressScoreServer", "countGift", "serverId", "serverName", "upgradePriceOne", "upgradePriceTwo", "upgradePriceThree", "isUpgradeOneEnable", "isUpgradeTwoEnable", "isUpgradeThreeEnable", "topServersList", "", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/UpgradeObjectEventTopListOfServersItem;", "placeInTop", "placePLayerInTopList", "levelPLayerInTopList", "namePLayerInTopList", "numberServer", "topList", "Lcom/blackhub/bronline/game/core/utils/attachment/CommonEventTopListModel;", "awardsLevelList", "Lcom/blackhub/bronline/game/gui/upgradeobjectevent/model/GiftPrizeModel;", "servers", "Lcom/blackhub/bronline/launcher/network/Server;", "isNeedClose", "isBlockingLoading", "(ILandroid/graphics/Bitmap;Ljava/util/Map;IZLcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventStrings;Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventImages;ZZZZZZZZZIIIIIIILjava/lang/String;IIIZZZLjava/util/List;IILjava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/util/List;ZZ)V", "getAwardsLevelList", "()Ljava/util/List;", "backColor", "getBackColor", "()I", "bagText", "getBagText", "getBgImage", "()Landroid/graphics/Bitmap;", "getCountGift", "getCurrency", "currencyLeftForNextLevel", "getCurrencyLeftForNextLevel", "currencyProgressScore", "getCurrencyProgressScore", "getCurrencyProgressScorePlayer", "getCurrencyProgressScoreServer", "getCurrencySpent", "eventBackground", "getEventBackground", "getEventId", "getEventLevel", "eventObjectRes", "getEventObjectRes", "getImages", "()Ljava/util/Map;", "()Z", "getLevelPLayerInTopList", "()Ljava/lang/String;", "getNamePLayerInTopList", "getNumberServer", "getPlaceInTop", "getPlacePLayerInTopList", "priceForUpgrade", "getPriceForUpgrade", "getServerId", "getServerName", "getServers", "getTopList", "getTopServersList", "getTypeScreen", "upgradeBtnOffset", "getUpgradeBtnOffset", "getUpgradeObjectImages", "()Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventImages;", "getUpgradeObjectStrings", "()Lcom/blackhub/bronline/game/gui/upgradeobjectevent/UpgradeObjectEventStrings;", "getUpgradePriceOne", "getUpgradePriceThree", "getUpgradePriceTwo", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UpgradeObjectEventUiState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final List<GiftPrizeModel> awardsLevelList;

    @Nullable
    public final Bitmap bgImage;
    public final int countGift;
    public final int currency;
    public final int currencyProgressScorePlayer;
    public final int currencyProgressScoreServer;
    public final int currencySpent;
    public final int eventId;
    public final int eventLevel;

    @NotNull
    public final Map<String, Bitmap> images;
    public final boolean isBlockingLoading;
    public final boolean isBuyGiftOpen;
    public final boolean isEnergyInfoOpen;
    public final boolean isGiftOpen;
    public final boolean isGiftQuestionOpen;
    public final boolean isInfoVisible;
    public final boolean isLevelUpgradeObjectOpen;
    public final boolean isNeedClose;
    public final boolean isTopListOpen;
    public final boolean isTopListPlayerOpen;
    public final boolean isTopListServerOpen;
    public final boolean isUpgradeObjectPlayer;
    public final boolean isUpgradeOneEnable;
    public final boolean isUpgradeThreeEnable;
    public final boolean isUpgradeTwoEnable;

    @NotNull
    public final String levelPLayerInTopList;

    @NotNull
    public final String namePLayerInTopList;
    public final int numberServer;
    public final int placeInTop;
    public final int placePLayerInTopList;
    public final int serverId;

    @NotNull
    public final String serverName;

    @NotNull
    public final List<Server> servers;

    @Nullable
    public final List<CommonEventTopListModel> topList;

    @Nullable
    public final List<UpgradeObjectEventTopListOfServersItem> topServersList;
    public final int typeScreen;

    @NotNull
    public final UpgradeObjectEventImages upgradeObjectImages;

    @NotNull
    public final UpgradeObjectEventStrings upgradeObjectStrings;
    public final int upgradePriceOne;
    public final int upgradePriceThree;
    public final int upgradePriceTwo;

    public UpgradeObjectEventUiState() {
        this(0, null, null, 0, false, null, null, false, false, false, false, false, false, false, false, false, 0, 0, 0, 0, 0, 0, 0, null, 0, 0, 0, false, false, false, null, 0, 0, null, null, 0, null, null, null, false, false, -1, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsEnergyInfoOpen() {
        return this.isEnergyInfoOpen;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsGiftQuestionOpen() {
        return this.isGiftQuestionOpen;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsGiftOpen() {
        return this.isGiftOpen;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsTopListOpen() {
        return this.isTopListOpen;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsTopListServerOpen() {
        return this.isTopListServerOpen;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsTopListPlayerOpen() {
        return this.isTopListPlayerOpen;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getIsInfoVisible() {
        return this.isInfoVisible;
    }

    /* renamed from: component17, reason: from getter */
    public final int getEventLevel() {
        return this.eventLevel;
    }

    /* renamed from: component18, reason: from getter */
    public final int getCurrency() {
        return this.currency;
    }

    /* renamed from: component19, reason: from getter */
    public final int getCurrencySpent() {
        return this.currencySpent;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    /* renamed from: component20, reason: from getter */
    public final int getCurrencyProgressScorePlayer() {
        return this.currencyProgressScorePlayer;
    }

    /* renamed from: component21, reason: from getter */
    public final int getCurrencyProgressScoreServer() {
        return this.currencyProgressScoreServer;
    }

    /* renamed from: component22, reason: from getter */
    public final int getCountGift() {
        return this.countGift;
    }

    /* renamed from: component23, reason: from getter */
    public final int getServerId() {
        return this.serverId;
    }

    @NotNull
    /* renamed from: component24, reason: from getter */
    public final String getServerName() {
        return this.serverName;
    }

    /* renamed from: component25, reason: from getter */
    public final int getUpgradePriceOne() {
        return this.upgradePriceOne;
    }

    /* renamed from: component26, reason: from getter */
    public final int getUpgradePriceTwo() {
        return this.upgradePriceTwo;
    }

    /* renamed from: component27, reason: from getter */
    public final int getUpgradePriceThree() {
        return this.upgradePriceThree;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsUpgradeOneEnable() {
        return this.isUpgradeOneEnable;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsUpgradeTwoEnable() {
        return this.isUpgradeTwoEnable;
    }

    @NotNull
    public final Map<String, Bitmap> component3() {
        return this.images;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsUpgradeThreeEnable() {
        return this.isUpgradeThreeEnable;
    }

    @Nullable
    public final List<UpgradeObjectEventTopListOfServersItem> component31() {
        return this.topServersList;
    }

    /* renamed from: component32, reason: from getter */
    public final int getPlaceInTop() {
        return this.placeInTop;
    }

    /* renamed from: component33, reason: from getter */
    public final int getPlacePLayerInTopList() {
        return this.placePLayerInTopList;
    }

    @NotNull
    /* renamed from: component34, reason: from getter */
    public final String getLevelPLayerInTopList() {
        return this.levelPLayerInTopList;
    }

    @NotNull
    /* renamed from: component35, reason: from getter */
    public final String getNamePLayerInTopList() {
        return this.namePLayerInTopList;
    }

    /* renamed from: component36, reason: from getter */
    public final int getNumberServer() {
        return this.numberServer;
    }

    @Nullable
    public final List<CommonEventTopListModel> component37() {
        return this.topList;
    }

    @Nullable
    public final List<GiftPrizeModel> component38() {
        return this.awardsLevelList;
    }

    @NotNull
    public final List<Server> component39() {
        return this.servers;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTypeScreen() {
        return this.typeScreen;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getIsBlockingLoading() {
        return this.isBlockingLoading;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsUpgradeObjectPlayer() {
        return this.isUpgradeObjectPlayer;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final UpgradeObjectEventStrings getUpgradeObjectStrings() {
        return this.upgradeObjectStrings;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final UpgradeObjectEventImages getUpgradeObjectImages() {
        return this.upgradeObjectImages;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsLevelUpgradeObjectOpen() {
        return this.isLevelUpgradeObjectOpen;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsBuyGiftOpen() {
        return this.isBuyGiftOpen;
    }

    @NotNull
    public final UpgradeObjectEventUiState copy(int eventId, @Nullable Bitmap bgImage, @NotNull Map<String, Bitmap> images, int typeScreen, boolean isUpgradeObjectPlayer, @NotNull UpgradeObjectEventStrings upgradeObjectStrings, @NotNull UpgradeObjectEventImages upgradeObjectImages, boolean isLevelUpgradeObjectOpen, boolean isBuyGiftOpen, boolean isEnergyInfoOpen, boolean isGiftQuestionOpen, boolean isGiftOpen, boolean isTopListOpen, boolean isTopListServerOpen, boolean isTopListPlayerOpen, boolean isInfoVisible, int eventLevel, int i, int currencySpent, int currencyProgressScorePlayer, int currencyProgressScoreServer, int countGift, int serverId, @NotNull String serverName, int upgradePriceOne, int upgradePriceTwo, int upgradePriceThree, boolean isUpgradeOneEnable, boolean isUpgradeTwoEnable, boolean isUpgradeThreeEnable, @Nullable List<UpgradeObjectEventTopListOfServersItem> topServersList, int placeInTop, int placePLayerInTopList, @NotNull String levelPLayerInTopList, @NotNull String namePLayerInTopList, int numberServer, @Nullable List<CommonEventTopListModel> topList, @Nullable List<GiftPrizeModel> awardsLevelList, @NotNull List<Server> servers, boolean isNeedClose, boolean isBlockingLoading) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(upgradeObjectStrings, "upgradeObjectStrings");
        Intrinsics.checkNotNullParameter(upgradeObjectImages, "upgradeObjectImages");
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(levelPLayerInTopList, "levelPLayerInTopList");
        Intrinsics.checkNotNullParameter(namePLayerInTopList, "namePLayerInTopList");
        Intrinsics.checkNotNullParameter(servers, "servers");
        return new UpgradeObjectEventUiState(eventId, bgImage, images, typeScreen, isUpgradeObjectPlayer, upgradeObjectStrings, upgradeObjectImages, isLevelUpgradeObjectOpen, isBuyGiftOpen, isEnergyInfoOpen, isGiftQuestionOpen, isGiftOpen, isTopListOpen, isTopListServerOpen, isTopListPlayerOpen, isInfoVisible, eventLevel, i, currencySpent, currencyProgressScorePlayer, currencyProgressScoreServer, countGift, serverId, serverName, upgradePriceOne, upgradePriceTwo, upgradePriceThree, isUpgradeOneEnable, isUpgradeTwoEnable, isUpgradeThreeEnable, topServersList, placeInTop, placePLayerInTopList, levelPLayerInTopList, namePLayerInTopList, numberServer, topList, awardsLevelList, servers, isNeedClose, isBlockingLoading);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpgradeObjectEventUiState)) {
            return false;
        }
        UpgradeObjectEventUiState upgradeObjectEventUiState = (UpgradeObjectEventUiState) other;
        return this.eventId == upgradeObjectEventUiState.eventId && Intrinsics.areEqual(this.bgImage, upgradeObjectEventUiState.bgImage) && Intrinsics.areEqual(this.images, upgradeObjectEventUiState.images) && this.typeScreen == upgradeObjectEventUiState.typeScreen && this.isUpgradeObjectPlayer == upgradeObjectEventUiState.isUpgradeObjectPlayer && Intrinsics.areEqual(this.upgradeObjectStrings, upgradeObjectEventUiState.upgradeObjectStrings) && Intrinsics.areEqual(this.upgradeObjectImages, upgradeObjectEventUiState.upgradeObjectImages) && this.isLevelUpgradeObjectOpen == upgradeObjectEventUiState.isLevelUpgradeObjectOpen && this.isBuyGiftOpen == upgradeObjectEventUiState.isBuyGiftOpen && this.isEnergyInfoOpen == upgradeObjectEventUiState.isEnergyInfoOpen && this.isGiftQuestionOpen == upgradeObjectEventUiState.isGiftQuestionOpen && this.isGiftOpen == upgradeObjectEventUiState.isGiftOpen && this.isTopListOpen == upgradeObjectEventUiState.isTopListOpen && this.isTopListServerOpen == upgradeObjectEventUiState.isTopListServerOpen && this.isTopListPlayerOpen == upgradeObjectEventUiState.isTopListPlayerOpen && this.isInfoVisible == upgradeObjectEventUiState.isInfoVisible && this.eventLevel == upgradeObjectEventUiState.eventLevel && this.currency == upgradeObjectEventUiState.currency && this.currencySpent == upgradeObjectEventUiState.currencySpent && this.currencyProgressScorePlayer == upgradeObjectEventUiState.currencyProgressScorePlayer && this.currencyProgressScoreServer == upgradeObjectEventUiState.currencyProgressScoreServer && this.countGift == upgradeObjectEventUiState.countGift && this.serverId == upgradeObjectEventUiState.serverId && Intrinsics.areEqual(this.serverName, upgradeObjectEventUiState.serverName) && this.upgradePriceOne == upgradeObjectEventUiState.upgradePriceOne && this.upgradePriceTwo == upgradeObjectEventUiState.upgradePriceTwo && this.upgradePriceThree == upgradeObjectEventUiState.upgradePriceThree && this.isUpgradeOneEnable == upgradeObjectEventUiState.isUpgradeOneEnable && this.isUpgradeTwoEnable == upgradeObjectEventUiState.isUpgradeTwoEnable && this.isUpgradeThreeEnable == upgradeObjectEventUiState.isUpgradeThreeEnable && Intrinsics.areEqual(this.topServersList, upgradeObjectEventUiState.topServersList) && this.placeInTop == upgradeObjectEventUiState.placeInTop && this.placePLayerInTopList == upgradeObjectEventUiState.placePLayerInTopList && Intrinsics.areEqual(this.levelPLayerInTopList, upgradeObjectEventUiState.levelPLayerInTopList) && Intrinsics.areEqual(this.namePLayerInTopList, upgradeObjectEventUiState.namePLayerInTopList) && this.numberServer == upgradeObjectEventUiState.numberServer && Intrinsics.areEqual(this.topList, upgradeObjectEventUiState.topList) && Intrinsics.areEqual(this.awardsLevelList, upgradeObjectEventUiState.awardsLevelList) && Intrinsics.areEqual(this.servers, upgradeObjectEventUiState.servers) && this.isNeedClose == upgradeObjectEventUiState.isNeedClose && this.isBlockingLoading == upgradeObjectEventUiState.isBlockingLoading;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.eventId) * 31;
        Bitmap bitmap = this.bgImage;
        int iHashCode2 = (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.images.hashCode()) * 31) + Integer.hashCode(this.typeScreen)) * 31) + Boolean.hashCode(this.isUpgradeObjectPlayer)) * 31) + this.upgradeObjectStrings.hashCode()) * 31) + this.upgradeObjectImages.hashCode()) * 31) + Boolean.hashCode(this.isLevelUpgradeObjectOpen)) * 31) + Boolean.hashCode(this.isBuyGiftOpen)) * 31) + Boolean.hashCode(this.isEnergyInfoOpen)) * 31) + Boolean.hashCode(this.isGiftQuestionOpen)) * 31) + Boolean.hashCode(this.isGiftOpen)) * 31) + Boolean.hashCode(this.isTopListOpen)) * 31) + Boolean.hashCode(this.isTopListServerOpen)) * 31) + Boolean.hashCode(this.isTopListPlayerOpen)) * 31) + Boolean.hashCode(this.isInfoVisible)) * 31) + Integer.hashCode(this.eventLevel)) * 31) + Integer.hashCode(this.currency)) * 31) + Integer.hashCode(this.currencySpent)) * 31) + Integer.hashCode(this.currencyProgressScorePlayer)) * 31) + Integer.hashCode(this.currencyProgressScoreServer)) * 31) + Integer.hashCode(this.countGift)) * 31) + Integer.hashCode(this.serverId)) * 31) + this.serverName.hashCode()) * 31) + Integer.hashCode(this.upgradePriceOne)) * 31) + Integer.hashCode(this.upgradePriceTwo)) * 31) + Integer.hashCode(this.upgradePriceThree)) * 31) + Boolean.hashCode(this.isUpgradeOneEnable)) * 31) + Boolean.hashCode(this.isUpgradeTwoEnable)) * 31) + Boolean.hashCode(this.isUpgradeThreeEnable)) * 31;
        List<UpgradeObjectEventTopListOfServersItem> list = this.topServersList;
        int iHashCode3 = (((((((((((iHashCode2 + (list == null ? 0 : list.hashCode())) * 31) + Integer.hashCode(this.placeInTop)) * 31) + Integer.hashCode(this.placePLayerInTopList)) * 31) + this.levelPLayerInTopList.hashCode()) * 31) + this.namePLayerInTopList.hashCode()) * 31) + Integer.hashCode(this.numberServer)) * 31;
        List<CommonEventTopListModel> list2 = this.topList;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<GiftPrizeModel> list3 = this.awardsLevelList;
        return ((((((iHashCode4 + (list3 != null ? list3.hashCode() : 0)) * 31) + this.servers.hashCode()) * 31) + Boolean.hashCode(this.isNeedClose)) * 31) + Boolean.hashCode(this.isBlockingLoading);
    }

    @NotNull
    public String toString() {
        return "UpgradeObjectEventUiState(eventId=" + this.eventId + ", bgImage=" + this.bgImage + ", images=" + this.images + ", typeScreen=" + this.typeScreen + ", isUpgradeObjectPlayer=" + this.isUpgradeObjectPlayer + ", upgradeObjectStrings=" + this.upgradeObjectStrings + ", upgradeObjectImages=" + this.upgradeObjectImages + ", isLevelUpgradeObjectOpen=" + this.isLevelUpgradeObjectOpen + ", isBuyGiftOpen=" + this.isBuyGiftOpen + ", isEnergyInfoOpen=" + this.isEnergyInfoOpen + ", isGiftQuestionOpen=" + this.isGiftQuestionOpen + ", isGiftOpen=" + this.isGiftOpen + ", isTopListOpen=" + this.isTopListOpen + ", isTopListServerOpen=" + this.isTopListServerOpen + ", isTopListPlayerOpen=" + this.isTopListPlayerOpen + ", isInfoVisible=" + this.isInfoVisible + ", eventLevel=" + this.eventLevel + ", currency=" + this.currency + ", currencySpent=" + this.currencySpent + ", currencyProgressScorePlayer=" + this.currencyProgressScorePlayer + ", currencyProgressScoreServer=" + this.currencyProgressScoreServer + ", countGift=" + this.countGift + ", serverId=" + this.serverId + ", serverName=" + this.serverName + ", upgradePriceOne=" + this.upgradePriceOne + ", upgradePriceTwo=" + this.upgradePriceTwo + ", upgradePriceThree=" + this.upgradePriceThree + ", isUpgradeOneEnable=" + this.isUpgradeOneEnable + ", isUpgradeTwoEnable=" + this.isUpgradeTwoEnable + ", isUpgradeThreeEnable=" + this.isUpgradeThreeEnable + ", topServersList=" + this.topServersList + ", placeInTop=" + this.placeInTop + ", placePLayerInTopList=" + this.placePLayerInTopList + ", levelPLayerInTopList=" + this.levelPLayerInTopList + ", namePLayerInTopList=" + this.namePLayerInTopList + ", numberServer=" + this.numberServer + ", topList=" + this.topList + ", awardsLevelList=" + this.awardsLevelList + ", servers=" + this.servers + ", isNeedClose=" + this.isNeedClose + ", isBlockingLoading=" + this.isBlockingLoading + ")";
    }

    public UpgradeObjectEventUiState(int i, @Nullable Bitmap bitmap, @NotNull Map<String, Bitmap> images, int i2, boolean z, @NotNull UpgradeObjectEventStrings upgradeObjectStrings, @NotNull UpgradeObjectEventImages upgradeObjectImages, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i3, int i4, int i5, int i6, int i7, int i8, int i9, @NotNull String serverName, int i10, int i11, int i12, boolean z11, boolean z12, boolean z13, @Nullable List<UpgradeObjectEventTopListOfServersItem> list, int i13, int i14, @NotNull String levelPLayerInTopList, @NotNull String namePLayerInTopList, int i15, @Nullable List<CommonEventTopListModel> list2, @Nullable List<GiftPrizeModel> list3, @NotNull List<Server> servers, boolean z14, boolean z15) {
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(upgradeObjectStrings, "upgradeObjectStrings");
        Intrinsics.checkNotNullParameter(upgradeObjectImages, "upgradeObjectImages");
        Intrinsics.checkNotNullParameter(serverName, "serverName");
        Intrinsics.checkNotNullParameter(levelPLayerInTopList, "levelPLayerInTopList");
        Intrinsics.checkNotNullParameter(namePLayerInTopList, "namePLayerInTopList");
        Intrinsics.checkNotNullParameter(servers, "servers");
        this.eventId = i;
        this.bgImage = bitmap;
        this.images = images;
        this.typeScreen = i2;
        this.isUpgradeObjectPlayer = z;
        this.upgradeObjectStrings = upgradeObjectStrings;
        this.upgradeObjectImages = upgradeObjectImages;
        this.isLevelUpgradeObjectOpen = z2;
        this.isBuyGiftOpen = z3;
        this.isEnergyInfoOpen = z4;
        this.isGiftQuestionOpen = z5;
        this.isGiftOpen = z6;
        this.isTopListOpen = z7;
        this.isTopListServerOpen = z8;
        this.isTopListPlayerOpen = z9;
        this.isInfoVisible = z10;
        this.eventLevel = i3;
        this.currency = i4;
        this.currencySpent = i5;
        this.currencyProgressScorePlayer = i6;
        this.currencyProgressScoreServer = i7;
        this.countGift = i8;
        this.serverId = i9;
        this.serverName = serverName;
        this.upgradePriceOne = i10;
        this.upgradePriceTwo = i11;
        this.upgradePriceThree = i12;
        this.isUpgradeOneEnable = z11;
        this.isUpgradeTwoEnable = z12;
        this.isUpgradeThreeEnable = z13;
        this.topServersList = list;
        this.placeInTop = i13;
        this.placePLayerInTopList = i14;
        this.levelPLayerInTopList = levelPLayerInTopList;
        this.namePLayerInTopList = namePLayerInTopList;
        this.numberServer = i15;
        this.topList = list2;
        this.awardsLevelList = list3;
        this.servers = servers;
        this.isNeedClose = z14;
        this.isBlockingLoading = z15;
    }

    public final int getEventId() {
        return this.eventId;
    }

    @Nullable
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    public /* synthetic */ UpgradeObjectEventUiState(int i, Bitmap bitmap, Map map, int i2, boolean z, UpgradeObjectEventStrings upgradeObjectEventStrings, UpgradeObjectEventImages upgradeObjectEventImages, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, int i3, int i4, int i5, int i6, int i7, int i8, int i9, String str, int i10, int i11, int i12, boolean z11, boolean z12, boolean z13, List list, int i13, int i14, String str2, String str3, int i15, List list2, List list3, List list4, boolean z14, boolean z15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 1 : i, (i16 & 2) != 0 ? null : bitmap, (i16 & 4) != 0 ? MapsKt__MapsKt.emptyMap() : map, (i16 & 8) != 0 ? 1 : i2, (i16 & 16) != 0 ? true : z, (i16 & 32) != 0 ? new UpgradeObjectEventStrings(1) : upgradeObjectEventStrings, (i16 & 64) != 0 ? new UpgradeObjectEventImages(1) : upgradeObjectEventImages, (i16 & 128) != 0 ? false : z2, (i16 & 256) != 0 ? false : z3, (i16 & 512) != 0 ? false : z4, (i16 & 1024) != 0 ? false : z5, (i16 & 2048) != 0 ? false : z6, (i16 & 4096) != 0 ? false : z7, (i16 & 8192) != 0 ? false : z8, (i16 & 16384) != 0 ? false : z9, (i16 & 32768) != 0 ? false : z10, (i16 & 65536) != 0 ? 0 : i3, (i16 & 131072) != 0 ? 0 : i4, (i16 & 262144) != 0 ? 0 : i5, (i16 & 524288) != 0 ? 0 : i6, (i16 & 1048576) != 0 ? 0 : i7, (i16 & 2097152) != 0 ? 0 : i8, (i16 & 4194304) != 0 ? 0 : i9, (i16 & 8388608) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i16 & 16777216) != 0 ? -1 : i10, (i16 & NTLMEngineImpl.FLAG_REQUEST_VERSION) != 0 ? -1 : i11, (i16 & 67108864) == 0 ? i12 : -1, (i16 & C2732C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? true : z11, (i16 & 268435456) != 0 ? true : z12, (i16 & 536870912) != 0 ? true : z13, (i16 & 1073741824) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i16 & Integer.MIN_VALUE) != 0 ? 0 : i13, (i17 & 1) != 0 ? 0 : i14, (i17 & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str2, (i17 & 4) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str3, (i17 & 8) != 0 ? 0 : i15, (i17 & 16) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i17 & 32) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list3, (i17 & 64) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list4, (i17 & 128) != 0 ? false : z14, (i17 & 256) != 0 ? true : z15);
    }

    @NotNull
    public final Map<String, Bitmap> getImages() {
        return this.images;
    }

    public final int getTypeScreen() {
        return this.typeScreen;
    }

    public final boolean isUpgradeObjectPlayer() {
        return this.isUpgradeObjectPlayer;
    }

    @NotNull
    public final UpgradeObjectEventStrings getUpgradeObjectStrings() {
        return this.upgradeObjectStrings;
    }

    @NotNull
    public final UpgradeObjectEventImages getUpgradeObjectImages() {
        return this.upgradeObjectImages;
    }

    public final boolean isLevelUpgradeObjectOpen() {
        return this.isLevelUpgradeObjectOpen;
    }

    public final boolean isBuyGiftOpen() {
        return this.isBuyGiftOpen;
    }

    public final boolean isEnergyInfoOpen() {
        return this.isEnergyInfoOpen;
    }

    public final boolean isGiftQuestionOpen() {
        return this.isGiftQuestionOpen;
    }

    public final boolean isGiftOpen() {
        return this.isGiftOpen;
    }

    public final boolean isTopListOpen() {
        return this.isTopListOpen;
    }

    public final boolean isTopListServerOpen() {
        return this.isTopListServerOpen;
    }

    public final boolean isTopListPlayerOpen() {
        return this.isTopListPlayerOpen;
    }

    public final boolean isInfoVisible() {
        return this.isInfoVisible;
    }

    public final int getEventLevel() {
        return this.eventLevel;
    }

    public final int getCurrency() {
        return this.currency;
    }

    public final int getCurrencySpent() {
        return this.currencySpent;
    }

    public final int getCurrencyProgressScorePlayer() {
        return this.currencyProgressScorePlayer;
    }

    public final int getCurrencyProgressScoreServer() {
        return this.currencyProgressScoreServer;
    }

    public final int getCountGift() {
        return this.countGift;
    }

    public final int getServerId() {
        return this.serverId;
    }

    @NotNull
    public final String getServerName() {
        return this.serverName;
    }

    public final int getUpgradePriceOne() {
        return this.upgradePriceOne;
    }

    public final int getUpgradePriceTwo() {
        return this.upgradePriceTwo;
    }

    public final int getUpgradePriceThree() {
        return this.upgradePriceThree;
    }

    public final boolean isUpgradeOneEnable() {
        return this.isUpgradeOneEnable;
    }

    public final boolean isUpgradeTwoEnable() {
        return this.isUpgradeTwoEnable;
    }

    public final boolean isUpgradeThreeEnable() {
        return this.isUpgradeThreeEnable;
    }

    @Nullable
    public final List<UpgradeObjectEventTopListOfServersItem> getTopServersList() {
        return this.topServersList;
    }

    public final int getPlaceInTop() {
        return this.placeInTop;
    }

    public final int getPlacePLayerInTopList() {
        return this.placePLayerInTopList;
    }

    @NotNull
    public final String getLevelPLayerInTopList() {
        return this.levelPLayerInTopList;
    }

    @NotNull
    public final String getNamePLayerInTopList() {
        return this.namePLayerInTopList;
    }

    public final int getNumberServer() {
        return this.numberServer;
    }

    @Nullable
    public final List<CommonEventTopListModel> getTopList() {
        return this.topList;
    }

    @Nullable
    public final List<GiftPrizeModel> getAwardsLevelList() {
        return this.awardsLevelList;
    }

    @NotNull
    public final List<Server> getServers() {
        return this.servers;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final boolean isBlockingLoading() {
        return this.isBlockingLoading;
    }

    @Nullable
    public final Bitmap getEventBackground() {
        int i = this.eventId;
        if (i == 0) {
            return this.images.get(SvgConstantsId68.BG_CHRISTMAS_TREE);
        }
        if (i != 1) {
            return null;
        }
        return this.images.get(PngConstantsId68.BG_HOST_MACHINE);
    }

    @Nullable
    public final Bitmap getEventObjectRes() {
        int i = this.eventId;
        if (i == 0) {
            int i2 = this.eventLevel;
            if (i2 >= 0 && i2 < 6) {
                return this.images.get(PngConstantsId68.CHRISTMAS_TREE_ONE);
            }
            if (6 <= i2 && i2 < 11) {
                return this.images.get(PngConstantsId68.CHRISTMAS_TREE_TWO);
            }
            if (11 <= i2 && i2 < 26) {
                return this.images.get(PngConstantsId68.CHRISTMAS_TREE_THREE);
            }
            return this.images.get(PngConstantsId68.CHRISTMAS_TREE_FOUR);
        }
        if (i != 1) {
            return null;
        }
        int i3 = this.eventLevel;
        if (i3 >= 0 && i3 < 6) {
            return this.images.get(SvgConstantsId68.HOST_MACHINE_ONE);
        }
        if (6 <= i3 && i3 < 11) {
            return this.images.get(SvgConstantsId68.HOST_MACHINE_TWO);
        }
        if (11 <= i3 && i3 < 26) {
            return this.images.get(SvgConstantsId68.HOST_MACHINE_THREE);
        }
        return this.images.get(SvgConstantsId68.HOST_MACHINE_FOUR);
    }

    @StringRes
    public final int getBagText() {
        return this.countGift > 0 ? R.string.upgrade_object_event_click_to_open : R.string.upgrade_object_event_click_to_buy;
    }

    public final int getPriceForUpgrade() {
        if (IntExtensionKt.isNotNegativeCommand(Integer.valueOf(this.upgradePriceOne))) {
            return this.upgradePriceOne;
        }
        if (IntExtensionKt.isNotNegativeCommand(Integer.valueOf(this.upgradePriceTwo))) {
            return this.upgradePriceTwo;
        }
        if (IntExtensionKt.isNotNegativeCommand(Integer.valueOf(this.upgradePriceThree))) {
            return this.upgradePriceThree;
        }
        return 0;
    }

    public final int getCurrencyProgressScore() {
        return !this.isUpgradeObjectPlayer ? this.currencyProgressScoreServer : this.currencyProgressScorePlayer;
    }

    public final int getCurrencyLeftForNextLevel() {
        return getCurrencyProgressScore() - this.currencySpent;
    }

    @DimenRes
    public final int getUpgradeBtnOffset() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.dimen._70wdp : R.dimen._85wdp;
    }

    @ColorRes
    public final int getBackColor() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.color.light_blue : R.color.total_black;
    }
}
