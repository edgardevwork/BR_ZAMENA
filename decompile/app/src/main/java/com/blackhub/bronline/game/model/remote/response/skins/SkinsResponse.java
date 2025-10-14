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
@Metadata(m7104d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\t\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m7105d2 = {"Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsResponse;", "", "skinsList", "", "Lcom/blackhub/bronline/game/model/remote/response/skins/SkinsDTO;", "(Ljava/util/List;)V", "getSkinsList", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
