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
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\nR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/youtubeplayer/YoutubePlayerUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "uri", "", "time", "", "isDestroyPushTimeEnable", "", "isNeedClose", "(Ljava/lang/String;IZZ)V", "()Z", "getTime", "()I", "getUri", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
