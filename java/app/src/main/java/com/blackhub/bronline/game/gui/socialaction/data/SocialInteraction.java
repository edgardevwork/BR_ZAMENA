package com.blackhub.bronline.game.gui.socialaction.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.fractions.Const;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SocialInteraction.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class SocialInteraction {
    public static final int $stable = 8;

    @SerializedName("id")
    public final int id;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("org")
    public final int org;
    public int page;

    @SerializedName("type")
    public final int type;

    public static /* synthetic */ SocialInteraction copy$default(SocialInteraction socialInteraction, int i, String str, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = socialInteraction.id;
        }
        if ((i5 & 2) != 0) {
            str = socialInteraction.name;
        }
        String str2 = str;
        if ((i5 & 4) != 0) {
            i2 = socialInteraction.type;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = socialInteraction.org;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = socialInteraction.page;
        }
        return socialInteraction.copy(i, str2, i6, i7, i4);
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

    /* renamed from: component3, reason: from getter */
    public final int getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOrg() {
        return this.org;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPage() {
        return this.page;
    }

    @NotNull
    public final SocialInteraction copy(int id, @NotNull String name, int type, int org2, int page) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new SocialInteraction(id, name, type, org2, page);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialInteraction)) {
            return false;
        }
        SocialInteraction socialInteraction = (SocialInteraction) other;
        return this.id == socialInteraction.id && Intrinsics.areEqual(this.name, socialInteraction.name) && this.type == socialInteraction.type && this.org == socialInteraction.org && this.page == socialInteraction.page;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.type)) * 31) + Integer.hashCode(this.org)) * 31) + Integer.hashCode(this.page);
    }

    @NotNull
    public String toString() {
        return "SocialInteraction(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", org=" + this.org + ", page=" + this.page + ")";
    }

    public SocialInteraction(int i, @NotNull String name, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = i;
        this.name = name;
        this.type = i2;
        this.org = i3;
        this.page = i4;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getType() {
        return this.type;
    }

    public final int getOrg() {
        return this.org;
    }

    public final int getPage() {
        return this.page;
    }

    public final void setPage(int i) {
        this.page = i;
    }
}

