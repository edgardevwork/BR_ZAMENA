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

