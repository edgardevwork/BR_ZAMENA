package ru.rustore.sdk.remoteconfig;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m7104d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u0005ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u0003ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/ConfigRequestParameter;", "", "language", "Lru/rustore/sdk/remoteconfig/Language;", "account", "Lru/rustore/sdk/remoteconfig/Account;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "getAccount-0Wq30jA", "()Ljava/lang/String;", "Ljava/lang/String;", "getLanguage-msbmrr8", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class ConfigRequestParameter {
    public final String account;
    public final String language;

    public ConfigRequestParameter(String str, String str2) {
        this.language = str;
        this.account = str2;
    }

    /* renamed from: getAccount-0Wq30jA, reason: not valid java name and from getter */
    public final String getAccount() {
        return this.account;
    }

    /* renamed from: getLanguage-msbmrr8, reason: not valid java name and from getter */
    public final String getLanguage() {
        return this.language;
    }

    public /* synthetic */ ConfigRequestParameter(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, null);
    }

    public /* synthetic */ ConfigRequestParameter(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2);
    }
}
