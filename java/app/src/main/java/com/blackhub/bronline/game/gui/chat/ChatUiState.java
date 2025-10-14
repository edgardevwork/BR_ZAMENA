package com.blackhub.bronline.game.gui.chat;

import androidx.annotation.StringRes;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.common.UiState;
import com.blackhub.bronline.game.gui.chat.model.ChatMessageModel;
import com.bless.client.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChatUiState.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final /* data */ class ChatUiState implements UiState {
    public static final int $stable = 8;
    public final boolean isNeedToClose;

    @NotNull
    public final List<ChatMessageModel> messagesList;
    public final int timerSeconds;

    public ChatUiState() {
        this(0, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatUiState copy$default(ChatUiState chatUiState, int i, List list, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatUiState.timerSeconds;
        }
        if ((i2 & 2) != 0) {
            list = chatUiState.messagesList;
        }
        if ((i2 & 4) != 0) {
            z = chatUiState.isNeedToClose;
        }
        return chatUiState.copy(i, list, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTimerSeconds() {
        return this.timerSeconds;
    }

    @NotNull
    public final List<ChatMessageModel> component2() {
        return this.messagesList;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsNeedToClose() {
        return this.isNeedToClose;
    }

    @NotNull
    public final ChatUiState copy(int timerSeconds, @NotNull List<ChatMessageModel> messagesList, boolean isNeedToClose) {
        Intrinsics.checkNotNullParameter(messagesList, "messagesList");
        return new ChatUiState(timerSeconds, messagesList, isNeedToClose);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatUiState)) {
            return false;
        }
        ChatUiState chatUiState = (ChatUiState) other;
        return this.timerSeconds == chatUiState.timerSeconds && Intrinsics.areEqual(this.messagesList, chatUiState.messagesList) && this.isNeedToClose == chatUiState.isNeedToClose;
    }

    @StringRes
    public final int getValidationChars() {
        return R.string.common_edittext_allowed_characters_for_admin_tools;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.timerSeconds) * 31) + this.messagesList.hashCode()) * 31) + Boolean.hashCode(this.isNeedToClose);
    }

    @NotNull
    public String toString() {
        return "ChatUiState(timerSeconds=" + this.timerSeconds + ", messagesList=" + this.messagesList + ", isNeedToClose=" + this.isNeedToClose + ")";
    }

    public ChatUiState(int i, @NotNull List<ChatMessageModel> messagesList, boolean z) {
        Intrinsics.checkNotNullParameter(messagesList, "messagesList");
        this.timerSeconds = i;
        this.messagesList = messagesList;
        this.isNeedToClose = z;
    }

    public final int getTimerSeconds() {
        return this.timerSeconds;
    }

    public /* synthetic */ ChatUiState(int i, List list, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i2 & 4) != 0 ? false : z);
    }

    @NotNull
    public final List<ChatMessageModel> getMessagesList() {
        return this.messagesList;
    }

    public final boolean isNeedToClose() {
        return this.isNeedToClose;
    }
}

