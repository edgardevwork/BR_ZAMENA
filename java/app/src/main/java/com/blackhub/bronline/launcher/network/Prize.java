package com.blackhub.bronline.launcher.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.blackhub.bronline.game.gui.catchstreamer.CatchStreamerKeys;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Prize.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class Prize {
    public static final int $stable = 0;

    @SerializedName("auth")
    public final boolean auth;

    @SerializedName("balance")
    @NotNull
    public final String balance;

    @SerializedName(CatchStreamerKeys.COUNT_KEY)
    public final int count;

    @SerializedName("error")
    public final boolean error;

    @SerializedName(ThrowableDeserializer.PROP_NAME_MESSAGE)
    @NotNull
    public final String message;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("object")
    public final int pObject;

    @SerializedName("pass")
    @NotNull
    public final String pass;

    @SerializedName("title")
    @NotNull
    public final String title;

    /* renamed from: component1, reason: from getter */
    public final boolean getAuth() {
        return this.auth;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getPass() {
        return this.pass;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component8, reason: from getter */
    public final int getCount() {
        return this.count;
    }

    /* renamed from: component9, reason: from getter */
    public final int getPObject() {
        return this.pObject;
    }

    @NotNull
    public final Prize copy(boolean auth, @NotNull String name, @NotNull String pass, @NotNull String balance, boolean error, @NotNull String message, @NotNull String title, int count, int pObject) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pass, "pass");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(title, "title");
        return new Prize(auth, name, pass, balance, error, message, title, count, pObject);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Prize)) {
            return false;
        }
        Prize prize = (Prize) other;
        return this.auth == prize.auth && Intrinsics.areEqual(this.name, prize.name) && Intrinsics.areEqual(this.pass, prize.pass) && Intrinsics.areEqual(this.balance, prize.balance) && this.error == prize.error && Intrinsics.areEqual(this.message, prize.message) && Intrinsics.areEqual(this.title, prize.title) && this.count == prize.count && this.pObject == prize.pObject;
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.auth) * 31) + this.name.hashCode()) * 31) + this.pass.hashCode()) * 31) + this.balance.hashCode()) * 31) + Boolean.hashCode(this.error)) * 31) + this.message.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.count)) * 31) + Integer.hashCode(this.pObject);
    }

    @NotNull
    public String toString() {
        return "Prize(auth=" + this.auth + ", name=" + this.name + ", pass=" + this.pass + ", balance=" + this.balance + ", error=" + this.error + ", message=" + this.message + ", title=" + this.title + ", count=" + this.count + ", pObject=" + this.pObject + ")";
    }

    public Prize(boolean z, @NotNull String name, @NotNull String pass, @NotNull String balance, boolean z2, @NotNull String message, @NotNull String title, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pass, "pass");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(title, "title");
        this.auth = z;
        this.name = name;
        this.pass = pass;
        this.balance = balance;
        this.error = z2;
        this.message = message;
        this.title = title;
        this.count = i;
        this.pObject = i2;
    }

    public final boolean getAuth() {
        return this.auth;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPass() {
        return this.pass;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    public final boolean getError() {
        return this.error;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getCount() {
        return this.count;
    }

    public final int getPObject() {
        return this.pObject;
    }
}

