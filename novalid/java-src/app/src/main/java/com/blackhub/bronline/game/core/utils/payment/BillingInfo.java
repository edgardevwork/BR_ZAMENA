package com.blackhub.bronline.game.core.utils.payment;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.donate.data.BillingItem;
import com.google.api.ClientProto;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;

/* compiled from: Utils.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/core/utils/payment/BillingInfo;", "", "()V", "BLACK_COINS_1000", "", "BLACK_COINS_10000", "BLACK_COINS_150", "BLACK_COINS_300", "BLACK_COINS_3000", "BLACK_COINS_500", "BLACK_COINS_5000", "BLACK_COINS_60", "BLACK_COINS_7000", "BLACK_COINS_750", "billingObj", "", "Lcom/blackhub/bronline/game/gui/donate/data/BillingItem;", "getBillingObj", "()Ljava/util/List;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class BillingInfo {
    public static final int $stable;

    @NotNull
    public static final String BLACK_COINS_1000 = "black_coins_purchase_id_1000";

    @NotNull
    public static final String BLACK_COINS_10000 = "black_coins_purchase_id_10000";

    @NotNull
    public static final String BLACK_COINS_150 = "black_coins_purchase_id_150";

    @NotNull
    public static final String BLACK_COINS_300 = "black_coins_purchase_id_300";

    @NotNull
    public static final String BLACK_COINS_3000 = "black_coins_purchase_id_3000";

    @NotNull
    public static final String BLACK_COINS_500 = "black_coins_purchase_id_500";

    @NotNull
    public static final String BLACK_COINS_5000 = "black_coins_purchase_id_5000";

    @NotNull
    public static final String BLACK_COINS_60 = "black_coins_purchase_id_60";

    @NotNull
    public static final String BLACK_COINS_7000 = "black_coins_purchase_id_7000";

    @NotNull
    public static final String BLACK_COINS_750 = "black_coins_purchase_id_750";

    @NotNull
    public static final BillingInfo INSTANCE = new BillingInfo();

    @NotNull
    public static final List<BillingItem> billingObj;

    @NotNull
    public final List<BillingItem> getBillingObj() {
        return billingObj;
    }

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        billingObj = CollectionsKt__CollectionsKt.listOf((Object[]) new BillingItem[]{new BillingItem(BLACK_COINS_60, 60, 60, AnyExtensionKt.empty(stringCompanionObject), 120), new BillingItem(BLACK_COINS_150, 150, 150, AnyExtensionKt.empty(stringCompanionObject), 300), new BillingItem(BLACK_COINS_300, 300, 300, AnyExtensionKt.empty(stringCompanionObject), 600), new BillingItem(BLACK_COINS_500, 500, 500, AnyExtensionKt.empty(stringCompanionObject), 1000), new BillingItem(BLACK_COINS_750, 750, 750, AnyExtensionKt.empty(stringCompanionObject), 1500), new BillingItem(BLACK_COINS_1000, 1000, ClientProto.OAUTH_SCOPES_FIELD_NUMBER, "+5%", 2000), new BillingItem(BLACK_COINS_3000, 3000, 3210, "+7%", 6000), new BillingItem(BLACK_COINS_5000, 5000, 5500, "+10%", 10000), new BillingItem(BLACK_COINS_7000, 7000, 7700, "+10%", 14000), new BillingItem(BLACK_COINS_10000, 10000, 11000, "+10%", 20000)});
        $stable = 8;
    }
}
