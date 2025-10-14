package com.blackhub.bronline.launcher.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Auth.kt */
@StabilityInferred(parameters = 1)
/* loaded from: classes3.dex */
public final /* data */ class Auth {
    public static final int $stable = 0;

    @SerializedName("auth")
    public final boolean auth;

    @SerializedName("balance")
    @NotNull
    public final String balance;

    @SerializedName("color")
    @NotNull
    public final String color;

    @SerializedName(ThrowableDeserializer.PROP_NAME_MESSAGE)
    @NotNull
    public final String message;

    @SerializedName("name")
    @NotNull
    public final String name;

    @SerializedName("pass")
    @NotNull
    public final String pass;

    @SerializedName("server")
    @NotNull
    public final String server;

    public static /* synthetic */ Auth copy$default(Auth auth, boolean z, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            z = auth.auth;
        }
        if ((i & 2) != 0) {
            str = auth.name;
        }
        String str7 = str;
        if ((i & 4) != 0) {
            str2 = auth.pass;
        }
        String str8 = str2;
        if ((i & 8) != 0) {
            str3 = auth.server;
        }
        String str9 = str3;
        if ((i & 16) != 0) {
            str4 = auth.color;
        }
        String str10 = str4;
        if ((i & 32) != 0) {
            str5 = auth.balance;
        }
        String str11 = str5;
        if ((i & 64) != 0) {
            str6 = auth.message;
        }
        return auth.copy(z, str7, str8, str9, str10, str11, str6);
    }

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
    public final String getServer() {
        return this.server;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final Auth copy(boolean auth, @NotNull String name, @NotNull String pass, @NotNull String server, @NotNull String color, @NotNull String balance, @NotNull String message) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pass, "pass");
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(message, "message");
        return new Auth(auth, name, pass, server, color, balance, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Auth)) {
            return false;
        }
        Auth auth = (Auth) other;
        return this.auth == auth.auth && Intrinsics.areEqual(this.name, auth.name) && Intrinsics.areEqual(this.pass, auth.pass) && Intrinsics.areEqual(this.server, auth.server) && Intrinsics.areEqual(this.color, auth.color) && Intrinsics.areEqual(this.balance, auth.balance) && Intrinsics.areEqual(this.message, auth.message);
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.auth) * 31) + this.name.hashCode()) * 31) + this.pass.hashCode()) * 31) + this.server.hashCode()) * 31) + this.color.hashCode()) * 31) + this.balance.hashCode()) * 31) + this.message.hashCode();
    }

    @NotNull
    public String toString() {
        return "Auth(auth=" + this.auth + ", name=" + this.name + ", pass=" + this.pass + ", server=" + this.server + ", color=" + this.color + ", balance=" + this.balance + ", message=" + this.message + ")";
    }

    public Auth(boolean z, @NotNull String name, @NotNull String pass, @NotNull String server, @NotNull String color, @NotNull String balance, @NotNull String message) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(pass, "pass");
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(message, "message");
        this.auth = z;
        this.name = name;
        this.pass = pass;
        this.server = server;
        this.color = color;
        this.balance = balance;
        this.message = message;
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
    public final String getServer() {
        return this.server;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    @NotNull
    public final String getBalance() {
        return this.balance;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }
}

