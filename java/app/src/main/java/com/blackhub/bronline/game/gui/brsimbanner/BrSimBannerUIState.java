package com.blackhub.bronline.game.gui.brsimbanner;

import android.graphics.Bitmap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerCarModel;
import com.blackhub.bronline.game.gui.brsimbanner.model.BrSimBannerItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BrSimBannerUIState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class BrSimBannerUIState implements UiState {
    public static final int $stable = 8;

    @Nullable
    public final Bitmap bgImage;

    @NotNull
    public final List<BrSimBannerItem> bonusesList;

    @NotNull
    public final List<BrSimBannerCarModel> carPrizesList;
    public boolean isNeedClose;

    @NotNull
    public String link;

    @Nullable
    public final Bitmap simImage;

    public BrSimBannerUIState() {
        this(null, null, null, null, null, false, 63, null);
    }

    public static /* synthetic */ BrSimBannerUIState copy$default(BrSimBannerUIState brSimBannerUIState, Bitmap bitmap, Bitmap bitmap2, List list, List list2, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            bitmap = brSimBannerUIState.bgImage;
        }
        if ((i & 2) != 0) {
            bitmap2 = brSimBannerUIState.simImage;
        }
        Bitmap bitmap3 = bitmap2;
        if ((i & 4) != 0) {
            list = brSimBannerUIState.carPrizesList;
        }
        List list3 = list;
        if ((i & 8) != 0) {
            list2 = brSimBannerUIState.bonusesList;
        }
        List list4 = list2;
        if ((i & 16) != 0) {
            str = brSimBannerUIState.link;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = brSimBannerUIState.isNeedClose;
        }
        return brSimBannerUIState.copy(bitmap, bitmap3, list3, list4, str2, z);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Bitmap getSimImage() {
        return this.simImage;
    }

    @NotNull
    public final List<BrSimBannerCarModel> component3() {
        return this.carPrizesList;
    }

    @NotNull
    public final List<BrSimBannerItem> component4() {
        return this.bonusesList;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLink() {
        return this.link;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final BrSimBannerUIState copy(@Nullable Bitmap bgImage, @Nullable Bitmap simImage, @NotNull List<BrSimBannerCarModel> carPrizesList, @NotNull List<BrSimBannerItem> bonusesList, @NotNull String link, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(carPrizesList, "carPrizesList");
        Intrinsics.checkNotNullParameter(bonusesList, "bonusesList");
        Intrinsics.checkNotNullParameter(link, "link");
        return new BrSimBannerUIState(bgImage, simImage, carPrizesList, bonusesList, link, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BrSimBannerUIState)) {
            return false;
        }
        BrSimBannerUIState brSimBannerUIState = (BrSimBannerUIState) other;
        return Intrinsics.areEqual(this.bgImage, brSimBannerUIState.bgImage) && Intrinsics.areEqual(this.simImage, brSimBannerUIState.simImage) && Intrinsics.areEqual(this.carPrizesList, brSimBannerUIState.carPrizesList) && Intrinsics.areEqual(this.bonusesList, brSimBannerUIState.bonusesList) && Intrinsics.areEqual(this.link, brSimBannerUIState.link) && this.isNeedClose == brSimBannerUIState.isNeedClose;
    }

    public int hashCode() {
        Bitmap bitmap = this.bgImage;
        int iHashCode = (bitmap == null ? 0 : bitmap.hashCode()) * 31;
        Bitmap bitmap2 = this.simImage;
        return ((((((((iHashCode + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + this.carPrizesList.hashCode()) * 31) + this.bonusesList.hashCode()) * 31) + this.link.hashCode()) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "BrSimBannerUIState(bgImage=" + this.bgImage + ", simImage=" + this.simImage + ", carPrizesList=" + this.carPrizesList + ", bonusesList=" + this.bonusesList + ", link=" + this.link + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public BrSimBannerUIState(@Nullable Bitmap bitmap, @Nullable Bitmap bitmap2, @NotNull List<BrSimBannerCarModel> carPrizesList, @NotNull List<BrSimBannerItem> bonusesList, @NotNull String link, boolean z) {
        Intrinsics.checkNotNullParameter(carPrizesList, "carPrizesList");
        Intrinsics.checkNotNullParameter(bonusesList, "bonusesList");
        Intrinsics.checkNotNullParameter(link, "link");
        this.bgImage = bitmap;
        this.simImage = bitmap2;
        this.carPrizesList = carPrizesList;
        this.bonusesList = bonusesList;
        this.link = link;
        this.isNeedClose = z;
    }

    @Nullable
    public final Bitmap getBgImage() {
        return this.bgImage;
    }

    @Nullable
    public final Bitmap getSimImage() {
        return this.simImage;
    }

    public /* synthetic */ BrSimBannerUIState(Bitmap bitmap, Bitmap bitmap2, List list, List list2, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bitmap, (i & 2) == 0 ? bitmap2 : null, (i & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2, (i & 16) != 0 ? BrSimBannerConstants.FALLBACK_SITE_URL : str, (i & 32) != 0 ? false : z);
    }

    @NotNull
    public final List<BrSimBannerCarModel> getCarPrizesList() {
        return this.carPrizesList;
    }

    @NotNull
    public final List<BrSimBannerItem> getBonusesList() {
        return this.bonusesList;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    public final void setLink(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.link = str;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }

    public final void setNeedClose(boolean z) {
        this.isNeedClose = z;
    }
}

