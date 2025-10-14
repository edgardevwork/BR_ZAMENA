package com.blackhub.bronline.game.gui.youtubeplayer;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: YoutubePlayerUiState.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class YoutubePlayerUiState implements UiState {
    public static final int $stable = 0;
    public final boolean isDestroyPushTimeEnable;
    public final boolean isNeedClose;
    public final int time;

    @NotNull
    public final String uri;

    public YoutubePlayerUiState() {
        this(null, 0, false, false, 15, null);
    }

    public static /* synthetic */ YoutubePlayerUiState copy$default(YoutubePlayerUiState youtubePlayerUiState, String str, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = youtubePlayerUiState.uri;
        }
        if ((i2 & 2) != 0) {
            i = youtubePlayerUiState.time;
        }
        if ((i2 & 4) != 0) {
            z = youtubePlayerUiState.isDestroyPushTimeEnable;
        }
        if ((i2 & 8) != 0) {
            z2 = youtubePlayerUiState.isNeedClose;
        }
        return youtubePlayerUiState.copy(str, i, z, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTime() {
        return this.time;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDestroyPushTimeEnable() {
        return this.isDestroyPushTimeEnable;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsNeedClose() {
        return this.isNeedClose;
    }

    @NotNull
    public final YoutubePlayerUiState copy(@NotNull String uri, int time, boolean isDestroyPushTimeEnable, boolean isNeedClose) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new YoutubePlayerUiState(uri, time, isDestroyPushTimeEnable, isNeedClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof YoutubePlayerUiState)) {
            return false;
        }
        YoutubePlayerUiState youtubePlayerUiState = (YoutubePlayerUiState) other;
        return Intrinsics.areEqual(this.uri, youtubePlayerUiState.uri) && this.time == youtubePlayerUiState.time && this.isDestroyPushTimeEnable == youtubePlayerUiState.isDestroyPushTimeEnable && this.isNeedClose == youtubePlayerUiState.isNeedClose;
    }

    public int hashCode() {
        return (((((this.uri.hashCode() * 31) + Integer.hashCode(this.time)) * 31) + Boolean.hashCode(this.isDestroyPushTimeEnable)) * 31) + Boolean.hashCode(this.isNeedClose);
    }

    @NotNull
    public String toString() {
        return "YoutubePlayerUiState(uri=" + this.uri + ", time=" + this.time + ", isDestroyPushTimeEnable=" + this.isDestroyPushTimeEnable + ", isNeedClose=" + this.isNeedClose + ")";
    }

    public YoutubePlayerUiState(@NotNull String uri, int i, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.uri = uri;
        this.time = i;
        this.isDestroyPushTimeEnable = z;
        this.isNeedClose = z2;
    }

    public /* synthetic */ YoutubePlayerUiState(String str, int i, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? false : z2);
    }

    @NotNull
    public final String getUri() {
        return this.uri;
    }

    public final int getTime() {
        return this.time;
    }

    public final boolean isDestroyPushTimeEnable() {
        return this.isDestroyPushTimeEnable;
    }

    public final boolean isNeedClose() {
        return this.isNeedClose;
    }
}

