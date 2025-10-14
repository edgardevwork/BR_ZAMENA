package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftJsonSettings.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/craft/model/response/CraftJsonSettings;", "", "vipProbAdd", "", "(F)V", "getVipProbAdd", "()F", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CraftJsonSettings {
    public static final int $stable = 0;
    public final float vipProbAdd;

    public CraftJsonSettings() {
        this(0.0f, 1, null);
    }

    public static /* synthetic */ CraftJsonSettings copy$default(CraftJsonSettings craftJsonSettings, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = craftJsonSettings.vipProbAdd;
        }
        return craftJsonSettings.copy(f);
    }

    /* renamed from: component1, reason: from getter */
    public final float getVipProbAdd() {
        return this.vipProbAdd;
    }

    @NotNull
    public final CraftJsonSettings copy(float vipProbAdd) {
        return new CraftJsonSettings(vipProbAdd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CraftJsonSettings) && Float.compare(this.vipProbAdd, ((CraftJsonSettings) other).vipProbAdd) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.vipProbAdd);
    }

    @NotNull
    public String toString() {
        return "CraftJsonSettings(vipProbAdd=" + this.vipProbAdd + ")";
    }

    public CraftJsonSettings(float f) {
        this.vipProbAdd = f;
    }

    public /* synthetic */ CraftJsonSettings(float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0.0f : f);
    }

    public final float getVipProbAdd() {
        return this.vipProbAdd;
    }
}
