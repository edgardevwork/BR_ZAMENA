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

