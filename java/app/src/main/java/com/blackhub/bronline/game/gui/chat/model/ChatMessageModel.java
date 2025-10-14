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

