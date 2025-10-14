package com.blackhub.bronline.game.gui.marketplace.model;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MarketplaceSortFilter.kt */
/* loaded from: classes3.dex */
public final class MarketplaceSortFilter {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ MarketplaceSortFilter[] $VALUES;
    public final int icon;
    public final int text;
    public final int value;
    public static final MarketplaceSortFilter NEW = new MarketplaceSortFilter("NEW", 0, R.string.marketplace_new_sort_filter, R.drawable.ic_sort_filter, 0);
    public static final MarketplaceSortFilter OLD = new MarketplaceSortFilter("OLD", 1, R.string.marketplace_old_sort_filter, R.drawable.ic_sort_filter_inverce, 1);
    public static final MarketplaceSortFilter DESCENDING = new MarketplaceSortFilter("DESCENDING", 2, R.string.marketplace_descending_sort_filter, R.drawable.ic_sort_filter, 0);
    public static final MarketplaceSortFilter ASCENDING = new MarketplaceSortFilter("ASCENDING", 3, R.string.marketplace_ascending_sort_filter, R.drawable.ic_sort_filter_inverce, 1);

    public static final /* synthetic */ MarketplaceSortFilter[] $values() {
        return new MarketplaceSortFilter[]{NEW, OLD, DESCENDING, ASCENDING};
    }

    @NotNull
    public static EnumEntries<MarketplaceSortFilter> getEntries() {
        return $ENTRIES;
    }

    public static MarketplaceSortFilter valueOf(String str) {
        return (MarketplaceSortFilter) Enum.valueOf(MarketplaceSortFilter.class, str);
    }

    public static MarketplaceSortFilter[] values() {
        return (MarketplaceSortFilter[]) $VALUES.clone();
    }

    public MarketplaceSortFilter(@StringRes String str, @DrawableRes int i, int i2, int i3, int i4) {
        this.text = i2;
        this.icon = i3;
        this.value = i4;
    }

    public final int getText() {
        return this.text;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        MarketplaceSortFilter[] marketplaceSortFilterArr$values = $values();
        $VALUES = marketplaceSortFilterArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(marketplaceSortFilterArr$values);
    }
}

