package com.blackhub.bronline.game.gui.dialog.gameinstruction;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GameInstructionsItem.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final /* data */ class GameInstructionsItem {
    public static final int $stable = 0;
    public final int drawable;

    @NotNull
    public final String text;

    public static /* synthetic */ GameInstructionsItem copy$default(GameInstructionsItem gameInstructionsItem, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gameInstructionsItem.drawable;
        }
        if ((i2 & 2) != 0) {
            str = gameInstructionsItem.text;
        }
        return gameInstructionsItem.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getDrawable() {
        return this.drawable;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final GameInstructionsItem copy(@DrawableRes int drawable, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        return new GameInstructionsItem(drawable, text);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameInstructionsItem)) {
            return false;
        }
        GameInstructionsItem gameInstructionsItem = (GameInstructionsItem) other;
        return this.drawable == gameInstructionsItem.drawable && Intrinsics.areEqual(this.text, gameInstructionsItem.text);
    }

    public int hashCode() {
        return (Integer.hashCode(this.drawable) * 31) + this.text.hashCode();
    }

    @NotNull
    public String toString() {
        return "GameInstructionsItem(drawable=" + this.drawable + ", text=" + this.text + ")";
    }

    public GameInstructionsItem(@DrawableRes int i, @NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.drawable = i;
        this.text = text;
    }

    public final int getDrawable() {
        return this.drawable;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }
}

