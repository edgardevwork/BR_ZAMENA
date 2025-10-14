package com.blackhub.bronline.game.p019ui.widget.dialog.dissapearingdialog;

import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: DialogProperties.kt */
@Immutable
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

