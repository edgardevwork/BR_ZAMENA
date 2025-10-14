package com.blackhub.bronline.game.gui.dialog.gameinstruction;

import androidx.annotation.DrawableRes;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: GameInstructionsItem.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/dialog/gameinstruction/GameInstructionsItem;", "", "drawable", "", "text", "", "(ILjava/lang/String;)V", "getDrawable", "()I", "getText", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
