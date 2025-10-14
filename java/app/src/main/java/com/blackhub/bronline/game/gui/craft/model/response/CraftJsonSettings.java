package com.blackhub.bronline.game.gui.craft.model.response;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CraftJsonSettings.kt */
@StabilityInferred(parameters = 1)
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

