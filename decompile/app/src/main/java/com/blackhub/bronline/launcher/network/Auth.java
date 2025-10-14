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
@Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003JO\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\""}, m7105d2 = {"Lcom/blackhub/bronline/launcher/network/Auth;", "", "auth", "", "name", "", "pass", "server", "color", "balance", ThrowableDeserializer.PROP_NAME_MESSAGE, "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuth", "()Z", "getBalance", "()Ljava/lang/String;", "getColor", "getMessage", "getName", "getPass", "getServer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
