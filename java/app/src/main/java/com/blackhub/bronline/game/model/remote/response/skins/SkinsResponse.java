package com.blackhub.bronline.game.model.remote.response.skins;

import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SkinsResponse.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final /* data */ class SkinsResponse {
    public static final int $stable = 8;

    @SerializedName("array")
    @NotNull
    public final List<SkinsDTO> skinsList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkinsResponse copy$default(SkinsResponse skinsResponse, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = skinsResponse.skinsList;
        }
        return skinsResponse.copy(list);
    }

    @NotNull
    public final List<SkinsDTO> component1() {
        return this.skinsList;
    }

    @NotNull
    public final SkinsResponse copy(@NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        return new SkinsResponse(skinsList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof SkinsResponse) && Intrinsics.areEqual(this.skinsList, ((SkinsResponse) other).skinsList);
    }

    public int hashCode() {
        return this.skinsList.hashCode();
    }

    @NotNull
    public String toString() {
        return "SkinsResponse(skinsList=" + this.skinsList + ")";
    }

    public SkinsResponse(@NotNull List<SkinsDTO> skinsList) {
        Intrinsics.checkNotNullParameter(skinsList, "skinsList");
        this.skinsList = skinsList;
    }

    @NotNull
    public final List<SkinsDTO> getSkinsList() {
        return this.skinsList;
    }
}

