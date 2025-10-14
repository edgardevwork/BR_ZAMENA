package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FragmentIDWithStatusOfReplay.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class FragmentIDWithStatusOfReplay {
    public static final int $stable = 8;
    public int fragmentID;
    public boolean ifReplace;
    public final boolean isOnlyLocalChange;

    public static /* synthetic */ FragmentIDWithStatusOfReplay copy$default(FragmentIDWithStatusOfReplay fragmentIDWithStatusOfReplay, int i, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = fragmentIDWithStatusOfReplay.fragmentID;
        }
        if ((i2 & 2) != 0) {
            z = fragmentIDWithStatusOfReplay.ifReplace;
        }
        if ((i2 & 4) != 0) {
            z2 = fragmentIDWithStatusOfReplay.isOnlyLocalChange;
        }
        return fragmentIDWithStatusOfReplay.copy(i, z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getFragmentID() {
        return this.fragmentID;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIfReplace() {
        return this.ifReplace;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsOnlyLocalChange() {
        return this.isOnlyLocalChange;
    }

    @NotNull
    public final FragmentIDWithStatusOfReplay copy(int fragmentID, boolean ifReplace, boolean isOnlyLocalChange) {
        return new FragmentIDWithStatusOfReplay(fragmentID, ifReplace, isOnlyLocalChange);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentIDWithStatusOfReplay)) {
            return false;
        }
        FragmentIDWithStatusOfReplay fragmentIDWithStatusOfReplay = (FragmentIDWithStatusOfReplay) other;
        return this.fragmentID == fragmentIDWithStatusOfReplay.fragmentID && this.ifReplace == fragmentIDWithStatusOfReplay.ifReplace && this.isOnlyLocalChange == fragmentIDWithStatusOfReplay.isOnlyLocalChange;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.fragmentID) * 31) + Boolean.hashCode(this.ifReplace)) * 31) + Boolean.hashCode(this.isOnlyLocalChange);
    }

    @NotNull
    public String toString() {
        return "FragmentIDWithStatusOfReplay(fragmentID=" + this.fragmentID + ", ifReplace=" + this.ifReplace + ", isOnlyLocalChange=" + this.isOnlyLocalChange + ")";
    }

    public FragmentIDWithStatusOfReplay(int i, boolean z, boolean z2) {
        this.fragmentID = i;
        this.ifReplace = z;
        this.isOnlyLocalChange = z2;
    }

    public final int getFragmentID() {
        return this.fragmentID;
    }

    public final void setFragmentID(int i) {
        this.fragmentID = i;
    }

    public final boolean getIfReplace() {
        return this.ifReplace;
    }

    public final void setIfReplace(boolean z) {
        this.ifReplace = z;
    }

    public final boolean isOnlyLocalChange() {
        return this.isOnlyLocalChange;
    }
}

