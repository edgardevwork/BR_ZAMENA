package com.blackhub.bronline.game.gui.upgradeobjectevent;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.bless.client.R;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: UpgradeObjectEventImages.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class UpgradeObjectEventImages {
    public static final int $stable = 0;
    public final int eventId;

    public UpgradeObjectEventImages() {
        this(0, 1, null);
    }

    public static /* synthetic */ UpgradeObjectEventImages copy$default(UpgradeObjectEventImages upgradeObjectEventImages, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = upgradeObjectEventImages.eventId;
        }
        return upgradeObjectEventImages.copy(i);
    }

    /* renamed from: component1, reason: from getter */
    public final int getEventId() {
        return this.eventId;
    }

    @NotNull
    public final UpgradeObjectEventImages copy(int eventId) {
        return new UpgradeObjectEventImages(eventId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UpgradeObjectEventImages) && this.eventId == ((UpgradeObjectEventImages) other).eventId;
    }

    public int hashCode() {
        return Integer.hashCode(this.eventId);
    }

    @NotNull
    public String toString() {
        return "UpgradeObjectEventImages(eventId=" + this.eventId + ")";
    }

    public UpgradeObjectEventImages(int i) {
        this.eventId = i;
    }

    public /* synthetic */ UpgradeObjectEventImages(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 1 : i);
    }

    public final int getEventId() {
        return this.eventId;
    }

    @DrawableRes
    public final int getCurrencyEventImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_christmas_tree_energy : R.drawable.ic_host_machine_chip;
    }

    @DrawableRes
    public final int getEventObjectIcon() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_christmas_tree : R.drawable.ic_data_storage_white;
    }

    @DrawableRes
    public final int getUpgradeImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_new_years_ball : R.drawable.ic_host_image_ram;
    }

    @DrawableRes
    public final int getGiftImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_gift_green_small : R.drawable.ic_green_host_gift;
    }

    @DrawableRes
    public final int getGiftOneImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_gift_red : R.drawable.ic_giftbox_blue;
    }

    @DrawableRes
    public final int getGiftTwoImage() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_gift_red : R.drawable.ic_giftbox_pink : R.drawable.ic_gift_green;
    }

    @DrawableRes
    public final int getGiftThreeImage() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_gift_red : R.drawable.ic_giftbox_pink_heart : R.drawable.ic_gift_blue;
    }

    @DrawableRes
    public final int getGiftFourImage() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_gift_red : R.drawable.ic_giftbox_red : R.drawable.ic_gift_white_red;
    }

    @DrawableRes
    public final int getIcReward() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_reward : R.drawable.ic_reward_grey;
    }

    @DrawableRes
    @Nullable
    public final Integer getGiftBag() {
        if (this.eventId == 0) {
            return Integer.valueOf(R.drawable.ic_bag_front);
        }
        return null;
    }

    @DrawableRes
    public final int getGiftInfoImage() {
        int i = this.eventId;
        return (i == 0 || i != 1) ? R.drawable.ic_lot_gifts : R.drawable.ic_lot_host_gift;
    }

    @DrawableRes
    public final int getIcButtonBg() {
        int i = this.eventId;
        return i != 0 ? i != 1 ? R.drawable.ic_bag_front : R.drawable.ic_server : R.drawable.ic_christmas_tree_gray;
    }
}

