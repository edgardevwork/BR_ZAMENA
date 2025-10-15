package com.blackhub.bronline.game.p019ui.widget.dialog.dissapearingdialog;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DialogProperties.kt */
@Immutable
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m7105d2 = {"Lcom/blackhub/bronline/game/ui/widget/dialog/dissapearingdialog/DialogProperties;", "", "dismissOnBackPress", "", "dismissOnClickOutside", "(ZZ)V", "usePlatformDefaultWidth", "(ZZZ)V", "getDismissOnBackPress", "()Z", "getDismissOnClickOutside", "getUsePlatformDefaultWidth", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes3.dex */
public final class DialogProperties {
    public static final int $stable = 0;
    public final boolean dismissOnBackPress;
    public final boolean dismissOnClickOutside;
    public final boolean usePlatformDefaultWidth;

    public DialogProperties() {
        this(false, false, false, 7, null);
    }

    public DialogProperties(boolean z, boolean z2, boolean z3) {
        this.dismissOnBackPress = z;
        this.dismissOnClickOutside = z2;
        this.usePlatformDefaultWidth = z3;
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    public final boolean getDismissOnBackPress() {
        return this.dismissOnBackPress;
    }

    public final boolean getDismissOnClickOutside() {
        return this.dismissOnClickOutside;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    public /* synthetic */ DialogProperties(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2);
    }

    public DialogProperties(boolean z, boolean z2) {
        this(z, z2, true);
    }
}
