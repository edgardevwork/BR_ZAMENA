package com.blackhub.bronline.game.gui.donate.utils;

import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateUtils.kt */
@Metadata(m7104d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u001a\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¨\u0006\u0006"}, m7105d2 = {"getItemPrice", "", "item", "Lcom/blackhub/bronline/game/gui/donate/data/DonateItem;", "getPriceText", "", "app_siteRelease"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class DonateUtilsKt {
    public static final int getItemPrice(@Nullable DonateItem donateItem) {
        Integer basePrice;
        if (donateItem == null || (basePrice = donateItem.getBasePrice()) == null) {
            return 0;
        }
        int iIntValue = basePrice.intValue();
        return donateItem.getSalePercent() != 0 ? (int) (iIntValue * (1.0f - (donateItem.getSalePercent() / 100.0f))) : iIntValue;
    }

    @NotNull
    public static final String getPriceText(@Nullable DonateItem donateItem) {
        Integer rubles;
        if (donateItem == null || (rubles = donateItem.getRubles()) == null || rubles.intValue() != 1) {
            return " BC";
        }
        return " ₽";
    }
}
