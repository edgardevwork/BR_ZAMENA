package com.blackhub.bronline.game.gui.chat.model;

import androidx.compose.p003ui.Alignment;
import androidx.compose.p003ui.text.AnnotatedString;
import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.core.extension.AnyExtensionKt;
import com.blackhub.bronline.game.gui.chat.ChatMessageTypeEnum;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChatMessageModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chat/model/ChatMessageModel;", "", "name", "Landroidx/compose/ui/text/AnnotatedString;", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "messageTypeEnum", "Lcom/blackhub/bronline/game/gui/chat/ChatMessageTypeEnum;", "(Landroidx/compose/ui/text/AnnotatedString;Ljava/lang/String;Lcom/blackhub/bronline/game/gui/chat/ChatMessageTypeEnum;)V", "alignment", "Landroidx/compose/ui/Alignment;", "getAlignment", "()Landroidx/compose/ui/Alignment;", "getMessage", "()Ljava/lang/String;", "getMessageTypeEnum", "()Lcom/blackhub/bronline/game/gui/chat/ChatMessageTypeEnum;", "getName", "()Landroidx/compose/ui/text/AnnotatedString;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final /* data */ class ChatMessageModel {
    public static final int $stable = 0;

    @NotNull
    public final String message;

    @NotNull
    public final ChatMessageTypeEnum messageTypeEnum;

    @NotNull
    public final AnnotatedString name;

    /* compiled from: ChatMessageModel.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatMessageTypeEnum.values().length];
            try {
                iArr[ChatMessageTypeEnum.MINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatMessageTypeEnum.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatMessageTypeEnum.ENEMY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ChatMessageModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ ChatMessageModel copy$default(ChatMessageModel chatMessageModel, AnnotatedString annotatedString, String str, ChatMessageTypeEnum chatMessageTypeEnum, int i, Object obj) {
        if ((i & 1) != 0) {
            annotatedString = chatMessageModel.name;
        }
        if ((i & 2) != 0) {
            str = chatMessageModel.message;
        }
        if ((i & 4) != 0) {
            chatMessageTypeEnum = chatMessageModel.messageTypeEnum;
        }
        return chatMessageModel.copy(annotatedString, str, chatMessageTypeEnum);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final AnnotatedString getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final ChatMessageTypeEnum getMessageTypeEnum() {
        return this.messageTypeEnum;
    }

    @NotNull
    public final ChatMessageModel copy(@NotNull AnnotatedString name, @NotNull String str, @NotNull ChatMessageTypeEnum messageTypeEnum) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(messageTypeEnum, "messageTypeEnum");
        return new ChatMessageModel(name, str, messageTypeEnum);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessageModel)) {
            return false;
        }
        ChatMessageModel chatMessageModel = (ChatMessageModel) other;
        return Intrinsics.areEqual(this.name, chatMessageModel.name) && Intrinsics.areEqual(this.message, chatMessageModel.message) && this.messageTypeEnum == chatMessageModel.messageTypeEnum;
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.message.hashCode()) * 31) + this.messageTypeEnum.hashCode();
    }

    @NotNull
    public String toString() {
        AnnotatedString annotatedString = this.name;
        return "ChatMessageModel(name=" + ((Object) annotatedString) + ", message=" + this.message + ", messageTypeEnum=" + this.messageTypeEnum + ")";
    }

    public ChatMessageModel(@NotNull AnnotatedString name, @NotNull String message, @NotNull ChatMessageTypeEnum messageTypeEnum) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageTypeEnum, "messageTypeEnum");
        this.name = name;
        this.message = message;
        this.messageTypeEnum = messageTypeEnum;
    }

    public /* synthetic */ ChatMessageModel(AnnotatedString annotatedString, String str, ChatMessageTypeEnum chatMessageTypeEnum, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new AnnotatedString(AnyExtensionKt.empty(StringCompanionObject.INSTANCE), null, null, 6, null) : annotatedString, (i & 2) != 0 ? AnyExtensionKt.empty(StringCompanionObject.INSTANCE) : str, (i & 4) != 0 ? ChatMessageTypeEnum.MINE : chatMessageTypeEnum);
    }

    @NotNull
    public final AnnotatedString getName() {
        return this.name;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final ChatMessageTypeEnum getMessageTypeEnum() {
        return this.messageTypeEnum;
    }

    @NotNull
    public final Alignment getAlignment() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.messageTypeEnum.ordinal()];
        if (i == 1) {
            return Alignment.INSTANCE.getCenterEnd();
        }
        if (i == 2) {
            return Alignment.INSTANCE.getCenter();
        }
        if (i == 3) {
            return Alignment.INSTANCE.getCenterStart();
        }
        throw new NoWhenBranchMatchedException();
    }
}
