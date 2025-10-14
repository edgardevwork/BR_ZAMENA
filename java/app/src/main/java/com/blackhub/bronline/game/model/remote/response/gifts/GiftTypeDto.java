package com.blackhub.bronline.game.model.remote.response.gifts;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GiftTypeDto.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final /* data */ class GiftTypeDto {
    public static final int $stable = 0;
    public final int id;

    @NotNull
    public final String name;

    public static /* synthetic */ GiftTypeDto copy$default(GiftTypeDto giftTypeDto, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = giftTypeDto.id;
        }
        if ((i2 & 2) != 0) {
            str = giftTypeDto.name;
        }
        return giftTypeDto.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final GiftTypeDto copy(int id, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new GiftTypeDto(id, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftTypeDto)) {
            return false;
        }
        GiftTypeDto giftTypeDto = (GiftTypeDto) other;
        return this.id == giftTypeDto.id && Intrinsics.areEqual(this.name, giftTypeDto.name);
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.name.hashCode();
    }

    @NotNull
    public String toString() {
        return "GiftTypeDto(id=" + this.id + ", name=" + this.name + ")";
    }

    public GiftTypeDto(int i, @NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }
}

