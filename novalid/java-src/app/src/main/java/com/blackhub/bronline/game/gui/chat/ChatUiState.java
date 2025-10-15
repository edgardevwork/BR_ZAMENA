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
@Metadata(m7104d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chat/ChatUiState;", "Lcom/blackhub/bronline/game/common/UiState;", "timerSeconds", "", "messagesList", "", "Lcom/blackhub/bronline/game/gui/chat/model/ChatMessageModel;", "isNeedToClose", "", "(ILjava/util/List;Z)V", "()Z", "getMessagesList", "()Ljava/util/List;", "getTimerSeconds", "()I", "validationChars", "getValidationChars", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
