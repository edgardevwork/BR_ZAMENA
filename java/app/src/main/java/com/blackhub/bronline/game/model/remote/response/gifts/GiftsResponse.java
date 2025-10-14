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

