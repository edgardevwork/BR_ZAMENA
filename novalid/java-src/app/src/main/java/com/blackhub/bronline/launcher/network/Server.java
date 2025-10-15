package com.blackhub.bronline.launcher.network;

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
@Metadata(m7104d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0014J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0002\u0010*J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\tHÆ\u0003J\u0010\u0010D\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00103J\u0010\u0010E\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u00103J\t\u0010F\u001a\u00020\u0003HÆ\u0003J \u0001\u0010G\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0002\u0010HJ\u0013\u0010I\u001a\u00020\t2\b\u0010J\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010K\u001a\u00020\u0013HÖ\u0001J\t\u0010L\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0016\"\u0004\b\"\u0010\u0018R\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0016\"\u0004\b&\u0010\u0018R\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\n\n\u0002\u0010+\u001a\u0004\b)\u0010*R\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0016\"\u0004\b-\u0010\u0018R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u00106\u001a\u0004\b7\u00103\"\u0004\b8\u00105¨\u0006M"}, m7105d2 = {"Lcom/blackhub/bronline/launcher/network/Server;", "", "ip", "", "port", CustomTabsCallback.ONLINE_EXTRAS_KEY, "maxOnline", "color", "x2", "", "x2cordx", "", "x2cordy", "key", "name", "firstName", "secondName", "url", "testServerId", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getColor", "()Ljava/lang/String;", "setColor", "(Ljava/lang/String;)V", "getFirstName", "setFirstName", "getIp", "setIp", "getKey", "setKey", "getMaxOnline", "setMaxOnline", "getName", "setName", "getOnline", "setOnline", "getPort", "setPort", "getSecondName", "setSecondName", "getTestServerId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUrl", "setUrl", "getX2", "()Z", "setX2", "(Z)V", "getX2cordx", "()Ljava/lang/Float;", "setX2cordx", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getX2cordy", "setX2cordy", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/blackhub/bronline/launcher/network/Server;", "equals", "other", "hashCode", "toString", "app_siteRelease"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
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
    /* renamed from: component1, reason: from getter */
    public final String getIp() {
        return this.ip;
    }

    @NotNull
    /* renamed from: component10, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final String getSecondName() {
        return this.secondName;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getTestServerId() {
        return this.testServerId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPort() {
        return this.port;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOnline() {
        return this.online;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getMaxOnline() {
        return this.maxOnline;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getX2() {
        return this.x2;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Float getX2cordx() {
        return this.x2cordx;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Float getX2cordy() {
        return this.x2cordy;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final String getKey() {
        return this.key;
    }

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
