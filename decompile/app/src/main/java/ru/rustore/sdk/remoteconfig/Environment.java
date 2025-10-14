package ru.rustore.sdk.remoteconfig;

import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/Environment;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALPHA", "BETA", "RELEASE", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public enum Environment {
    ALPHA("ALPHA"),
    BETA("BETA"),
    RELEASE("RELEASE");

    public final String value;

    Environment(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
