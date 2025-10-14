package com.blackhub.bronline.game.gui.gifts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: GiftsDictionary.kt */
@StabilityInferred(parameters = 0)
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

