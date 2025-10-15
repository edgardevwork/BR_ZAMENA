package ru.rustore.sdk.billingclient.impl.domain.model;

import kotlin.Metadata;
import org.apache.ivy.core.cache.ArtifactOrigin;

@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m7105d2 = {"Lru/rustore/sdk/billingclient/impl/domain/model/UnauthorizedProductType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NON_CONSUMABLE", "CONSUMABLE", "SUBSCRIPTION", "APPLICATION", ArtifactOrigin.UNKNOWN, "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public enum UnauthorizedProductType {
    NON_CONSUMABLE("non_consumable"),
    CONSUMABLE("consumable"),
    SUBSCRIPTION("subscription"),
    APPLICATION("application"),
    UNKNOWN("unknown");

    private final String value;

    UnauthorizedProductType(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
