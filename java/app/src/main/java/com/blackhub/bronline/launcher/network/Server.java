package com.blackhub.bronline.launcher.network;

import android.annotation.SuppressLint;

import androidx.browser.customtabs.CustomTabsCallback;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Server.kt */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final /* data */ class Server {
    public static final int $stable = 8;

    @SerializedName("color")
    @NotNull
    public String color;

    @SerializedName("firstname")
    @NotNull
    public String firstName;

    @SerializedName("ip")
    @NotNull
    public String ip;

    @SerializedName("key")
    @NotNull
    public String key;

    @SerializedName("maxonline")
    @NotNull
    public String maxOnline;

    @SerializedName("name")
    @NotNull
    public String name;

    @SuppressLint("RestrictedApi")
    @SerializedName(CustomTabsCallback.ONLINE_EXTRAS_KEY)
    @NotNull
    public String online;

    @SerializedName("port")
    @NotNull
    public String port;

    @SerializedName("secondname")
    @NotNull
    public String secondName;

    @Nullable
    public final Integer testServerId;

    @SerializedName("url")
    @NotNull
    public String url;

    @SerializedName("x2")
    public boolean x2;

    @SerializedName("x2cordx")
    @Nullable
    public Float x2cordx;

    @SerializedName("x2cordy")
    @Nullable
    public Float x2cordy;

    @NotNull
    public final Server copy(@NotNull String ip, @NotNull String port, @NotNull String online, @NotNull String maxOnline, @NotNull String color, boolean x2, @Nullable Float x2cordx, @Nullable Float x2cordy, @NotNull String key, @NotNull String name, @NotNull String firstName, @NotNull String secondName, @NotNull String url, @Nullable Integer testServerId) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(port, "port");
        Intrinsics.checkNotNullParameter(online, "online");
        Intrinsics.checkNotNullParameter(maxOnline, "maxOnline");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(secondName, "secondName");
        Intrinsics.checkNotNullParameter(url, "url");
        return new Server(ip, port, online, maxOnline, color, x2, x2cordx, x2cordy, key, name, firstName, secondName, url, testServerId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Server)) {
            return false;
        }
        Server server = (Server) other;
        return Intrinsics.areEqual(this.ip, server.ip) && Intrinsics.areEqual(this.port, server.port) && Intrinsics.areEqual(this.online, server.online) && Intrinsics.areEqual(this.maxOnline, server.maxOnline) && Intrinsics.areEqual(this.color, server.color) && this.x2 == server.x2 && Intrinsics.areEqual((Object) this.x2cordx, (Object) server.x2cordx) && Intrinsics.areEqual((Object) this.x2cordy, (Object) server.x2cordy) && Intrinsics.areEqual(this.key, server.key) && Intrinsics.areEqual(this.name, server.name) && Intrinsics.areEqual(this.firstName, server.firstName) && Intrinsics.areEqual(this.secondName, server.secondName) && Intrinsics.areEqual(this.url, server.url) && Intrinsics.areEqual(this.testServerId, server.testServerId);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.ip.hashCode() * 31) + this.port.hashCode()) * 31) + this.online.hashCode()) * 31) + this.maxOnline.hashCode()) * 31) + this.color.hashCode()) * 31) + Boolean.hashCode(this.x2)) * 31;
        Float f = this.x2cordx;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.x2cordy;
        int iHashCode3 = (((((((((((iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31) + this.key.hashCode()) * 31) + this.name.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.secondName.hashCode()) * 31) + this.url.hashCode()) * 31;
        Integer num = this.testServerId;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Server(ip=" + this.ip + ", port=" + this.port + ", online=" + this.online + ", maxOnline=" + this.maxOnline + ", color=" + this.color + ", x2=" + this.x2 + ", x2cordx=" + this.x2cordx + ", x2cordy=" + this.x2cordy + ", key=" + this.key + ", name=" + this.name + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", url=" + this.url + ", testServerId=" + this.testServerId + ")";
    }

    public Server(@NotNull String ip, @NotNull String port, @NotNull String online, @NotNull String maxOnline, @NotNull String color, boolean z, @Nullable Float f, @Nullable Float f2, @NotNull String key, @NotNull String name, @NotNull String firstName, @NotNull String secondName, @NotNull String url, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(ip, "ip");
        Intrinsics.checkNotNullParameter(port, "port");
        Intrinsics.checkNotNullParameter(online, "online");
        Intrinsics.checkNotNullParameter(maxOnline, "maxOnline");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(secondName, "secondName");
        Intrinsics.checkNotNullParameter(url, "url");
        this.ip = ip;
        this.port = port;
        this.online = online;
        this.maxOnline = maxOnline;
        this.color = color;
        this.x2 = z;
        this.x2cordx = f;
        this.x2cordy = f2;
        this.key = key;
        this.name = name;
        this.firstName = firstName;
        this.secondName = secondName;
        this.url = url;
        this.testServerId = num;
    }

    public /* synthetic */ Server(String str, String str2, String str3, String str4, String str5, boolean z, Float f, Float f2, String str6, String str7, String str8, String str9, String str10, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, z, (i & 64) != 0 ? null : f, (i & 128) != 0 ? null : f2, str6, str7, str8, str9, str10, (i & 8192) != 0 ? null : num);
    }

    @NotNull
    public final String getIp() {
        return this.ip;
    }

    public final void setIp(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ip = str;
    }

    @NotNull
    public final String getPort() {
        return this.port;
    }

    public final void setPort(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.port = str;
    }

    @NotNull
    public final String getOnline() {
        return this.online;
    }

    public final void setOnline(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.online = str;
    }

    @NotNull
    public final String getMaxOnline() {
        return this.maxOnline;
    }

    public final void setMaxOnline(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.maxOnline = str;
    }

    @NotNull
    public final String getColor() {
        return this.color;
    }

    public final void setColor(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.color = str;
    }

    public final boolean getX2() {
        return this.x2;
    }

    public final void setX2(boolean z) {
        this.x2 = z;
    }

    @Nullable
    public final Float getX2cordx() {
        return this.x2cordx;
    }

    public final void setX2cordx(@Nullable Float f) {
        this.x2cordx = f;
    }

    @Nullable
    public final Float getX2cordy() {
        return this.x2cordy;
    }

    public final void setX2cordy(@Nullable Float f) {
        this.x2cordy = f;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final void setKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final void setName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.firstName = str;
    }

    @NotNull
    public final String getSecondName() {
        return this.secondName;
    }

    public final void setSecondName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.secondName = str;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @Nullable
    public final Integer getTestServerId() {
        return this.testServerId;
    }
}

