package com.blackhub.bronline.game.gui.donate.utils;

import com.blackhub.bronline.game.gui.donate.data.DonateItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: DonateUtils.kt */
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

