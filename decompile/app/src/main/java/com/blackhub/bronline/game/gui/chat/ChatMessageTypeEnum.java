package com.blackhub.bronline.game.gui.chat;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatMessageTypeEnum.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chat/ChatMessageTypeEnum;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "MINE", "ENEMY", "MIDDLE", "Companion", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes.dex */
public final class ChatMessageTypeEnum {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ChatMessageTypeEnum[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public final int value;
    public static final ChatMessageTypeEnum MINE = new ChatMessageTypeEnum("MINE", 0, 1);
    public static final ChatMessageTypeEnum ENEMY = new ChatMessageTypeEnum("ENEMY", 1, 2);
    public static final ChatMessageTypeEnum MIDDLE = new ChatMessageTypeEnum("MIDDLE", 2, 3);

    public static final /* synthetic */ ChatMessageTypeEnum[] $values() {
        return new ChatMessageTypeEnum[]{MINE, ENEMY, MIDDLE};
    }

    @NotNull
    public static EnumEntries<ChatMessageTypeEnum> getEntries() {
        return $ENTRIES;
    }

    public static ChatMessageTypeEnum valueOf(String str) {
        return (ChatMessageTypeEnum) Enum.valueOf(ChatMessageTypeEnum.class, str);
    }

    public static ChatMessageTypeEnum[] values() {
        return (ChatMessageTypeEnum[]) $VALUES.clone();
    }

    public ChatMessageTypeEnum(String str, int i, int i2) {
        this.value = i2;
    }

    public /* synthetic */ ChatMessageTypeEnum(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 1) != 0 ? 1 : i2);
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ChatMessageTypeEnum[] chatMessageTypeEnumArr$values = $values();
        $VALUES = chatMessageTypeEnumArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(chatMessageTypeEnumArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ChatMessageTypeEnum.kt */
    @Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chat/ChatMessageTypeEnum$Companion;", "", "()V", "fromInt", "Lcom/blackhub/bronline/game/gui/chat/ChatMessageTypeEnum;", "value", "", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
    @SourceDebugExtension({"SMAP\nChatMessageTypeEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChatMessageTypeEnum.kt\ncom/blackhub/bronline/game/gui/chat/ChatMessageTypeEnum$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,13:1\n288#2,2:14\n*S KotlinDebug\n*F\n+ 1 ChatMessageTypeEnum.kt\ncom/blackhub/bronline/game/gui/chat/ChatMessageTypeEnum$Companion\n*L\n11#1:14,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ChatMessageTypeEnum fromInt(int value) {
            ChatMessageTypeEnum next;
            Iterator<ChatMessageTypeEnum> it = ChatMessageTypeEnum.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.getValue() == value) {
                    break;
                }
            }
            ChatMessageTypeEnum chatMessageTypeEnum = next;
            return chatMessageTypeEnum == null ? ChatMessageTypeEnum.MINE : chatMessageTypeEnum;
        }
    }
}
