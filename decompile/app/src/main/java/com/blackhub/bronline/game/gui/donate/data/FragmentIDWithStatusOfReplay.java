package com.blackhub.bronline.game.gui.donate.data;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FragmentIDWithStatusOfReplay.kt */
@StabilityInferred(parameters = 0)
@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\r¨\u0006\u0019"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/donate/data/FragmentIDWithStatusOfReplay;", "", "fragmentID", "", "ifReplace", "", "isOnlyLocalChange", "(IZZ)V", "getFragmentID", "()I", "setFragmentID", "(I)V", "getIfReplace", "()Z", "setIfReplace", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
