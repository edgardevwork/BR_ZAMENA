package com.blackhub.bronline.game.gui.chat.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ChatMessageServerModel.kt */
@StabilityInferred(parameters = 1)
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m7105d2 = {"Lcom/blackhub/bronline/game/gui/chat/model/ChatMessageServerModel;", "", ThrowableDeserializer.PROP_NAME_MESSAGE, "", "type", "", "name", "(Ljava/lang/String;ILjava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "getName", "getType", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChatMessageServerModel {
    public static final int $stable = 0;

    @SerializedName("text")
    @Nullable
    public final String message;

    @SerializedName("name")
    @Nullable
    public final String name;

    @SerializedName("type")
    public final int type;

    public static /* synthetic */ ChatMessageServerModel copy$default(ChatMessageServerModel chatMessageServerModel, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = chatMessageServerModel.message;
        }
        if ((i2 & 2) != 0) {
            i = chatMessageServerModel.type;
        }
        if ((i2 & 4) != 0) {
            str2 = chatMessageServerModel.name;
        }
        return chatMessageServerModel.copy(str, i, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final ChatMessageServerModel copy(@Nullable String message, int type, @Nullable String name) {
        return new ChatMessageServerModel(message, type, name);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatMessageServerModel)) {
            return false;
        }
        ChatMessageServerModel chatMessageServerModel = (ChatMessageServerModel) other;
        return Intrinsics.areEqual(this.message, chatMessageServerModel.message) && this.type == chatMessageServerModel.type && Intrinsics.areEqual(this.name, chatMessageServerModel.name);
    }

    public int hashCode() {
        String str = this.message;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.type)) * 31;
        String str2 = this.name;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ChatMessageServerModel(message=" + this.message + ", type=" + this.type + ", name=" + this.name + ")";
    }

    public ChatMessageServerModel(@Nullable String str, int i, @Nullable String str2) {
        this.message = str;
        this.type = i;
        this.name = str2;
    }

    public /* synthetic */ ChatMessageServerModel(String str, int i, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i, str2);
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    public final int getType() {
        return this.type;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }
}
