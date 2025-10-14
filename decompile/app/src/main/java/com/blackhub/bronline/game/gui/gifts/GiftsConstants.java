package com.blackhub.bronline.game.gui.gifts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: GiftsDictionary.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/gifts/GiftsConstants;", "", "()V", "giftIcons", "", "", "getGiftIcons", "()Ljava/util/List;", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class GiftsConstants {

    @NotNull
    public static final GiftsConstants INSTANCE = new GiftsConstants();

    @NotNull
    public static final List<Integer> giftIcons = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.drawable.ic_gift_style_1), Integer.valueOf(R.drawable.ic_gift_style_2), Integer.valueOf(R.drawable.ic_gift_style_3), Integer.valueOf(R.drawable.ic_gift_style_4), Integer.valueOf(R.drawable.ic_gift_style_5)});
    public static final int $stable = 8;

    @NotNull
    public final List<Integer> getGiftIcons() {
        return giftIcons;
    }
}
