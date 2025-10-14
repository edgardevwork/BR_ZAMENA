package com.blackhub.bronline.game.model.remote.response.gifts;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftsResponse.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\u0002\u0010\tJ\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/gifts/GiftsResponse;", "", "giftLegendaryDto", "", "Lcom/blackhub/bronline/game/model/remote/response/gifts/GiftLegendaryDto;", "giftNormalDto", "Lcom/blackhub/bronline/game/model/remote/response/gifts/GiftNormalDto;", "giftTypeDto", "Lcom/blackhub/bronline/game/model/remote/response/gifts/GiftTypeDto;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getGiftLegendaryDto", "()Ljava/util/List;", "getGiftNormalDto", "getGiftTypeDto", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class GiftsResponse {
    public static final int $stable = 8;

    @SerializedName("giftLegendary")
    @NotNull
    public final List<GiftLegendaryDto> giftLegendaryDto;

    @SerializedName("giftNormal")
    @NotNull
    public final List<GiftNormalDto> giftNormalDto;

    @SerializedName("giftType")
    @NotNull
    public final List<GiftTypeDto> giftTypeDto;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftsResponse copy$default(GiftsResponse giftsResponse, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = giftsResponse.giftLegendaryDto;
        }
        if ((i & 2) != 0) {
            list2 = giftsResponse.giftNormalDto;
        }
        if ((i & 4) != 0) {
            list3 = giftsResponse.giftTypeDto;
        }
        return giftsResponse.copy(list, list2, list3);
    }

    @NotNull
    public final List<GiftLegendaryDto> component1() {
        return this.giftLegendaryDto;
    }

    @NotNull
    public final List<GiftNormalDto> component2() {
        return this.giftNormalDto;
    }

    @NotNull
    public final List<GiftTypeDto> component3() {
        return this.giftTypeDto;
    }

    @NotNull
    public final GiftsResponse copy(@NotNull List<GiftLegendaryDto> giftLegendaryDto, @NotNull List<GiftNormalDto> giftNormalDto, @NotNull List<GiftTypeDto> giftTypeDto) {
        Intrinsics.checkNotNullParameter(giftLegendaryDto, "giftLegendaryDto");
        Intrinsics.checkNotNullParameter(giftNormalDto, "giftNormalDto");
        Intrinsics.checkNotNullParameter(giftTypeDto, "giftTypeDto");
        return new GiftsResponse(giftLegendaryDto, giftNormalDto, giftTypeDto);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftsResponse)) {
            return false;
        }
        GiftsResponse giftsResponse = (GiftsResponse) other;
        return Intrinsics.areEqual(this.giftLegendaryDto, giftsResponse.giftLegendaryDto) && Intrinsics.areEqual(this.giftNormalDto, giftsResponse.giftNormalDto) && Intrinsics.areEqual(this.giftTypeDto, giftsResponse.giftTypeDto);
    }

    public int hashCode() {
        return (((this.giftLegendaryDto.hashCode() * 31) + this.giftNormalDto.hashCode()) * 31) + this.giftTypeDto.hashCode();
    }

    @NotNull
    public String toString() {
        return "GiftsResponse(giftLegendaryDto=" + this.giftLegendaryDto + ", giftNormalDto=" + this.giftNormalDto + ", giftTypeDto=" + this.giftTypeDto + ")";
    }

    public GiftsResponse(@NotNull List<GiftLegendaryDto> giftLegendaryDto, @NotNull List<GiftNormalDto> giftNormalDto, @NotNull List<GiftTypeDto> giftTypeDto) {
        Intrinsics.checkNotNullParameter(giftLegendaryDto, "giftLegendaryDto");
        Intrinsics.checkNotNullParameter(giftNormalDto, "giftNormalDto");
        Intrinsics.checkNotNullParameter(giftTypeDto, "giftTypeDto");
        this.giftLegendaryDto = giftLegendaryDto;
        this.giftNormalDto = giftNormalDto;
        this.giftTypeDto = giftTypeDto;
    }

    @NotNull
    public final List<GiftLegendaryDto> getGiftLegendaryDto() {
        return this.giftLegendaryDto;
    }

    @NotNull
    public final List<GiftNormalDto> getGiftNormalDto() {
        return this.giftNormalDto;
    }

    @NotNull
    public final List<GiftTypeDto> getGiftTypeDto() {
        return this.giftTypeDto;
    }
}
