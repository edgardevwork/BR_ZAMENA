package ru.rustore.sdk.billingclient.model.user;

import com.sdkit.paylib.paylibdomain.api.deeplink.entity.C8030a;
import kotlin.Metadata;

@Metadata(m7104d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m7105d2 = {"Lru/rustore/sdk/billingclient/model/user/UserAuthorizationStatus;", "", "authorized", "", "(Z)V", "getAuthorized", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "sdk-public-billingclient_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UserAuthorizationStatus {
    private final boolean authorized;

    public UserAuthorizationStatus(boolean z) {
        this.authorized = z;
    }

    public static /* synthetic */ UserAuthorizationStatus copy$default(UserAuthorizationStatus userAuthorizationStatus, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = userAuthorizationStatus.authorized;
        }
        return userAuthorizationStatus.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getAuthorized() {
        return this.authorized;
    }

    public final UserAuthorizationStatus copy(boolean authorized) {
        return new UserAuthorizationStatus(authorized);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof UserAuthorizationStatus) && this.authorized == ((UserAuthorizationStatus) other).authorized;
    }

    public final boolean getAuthorized() {
        return this.authorized;
    }

    public int hashCode() {
        return Boolean.hashCode(this.authorized);
    }

    public String toString() {
        return C8030a.m1428a(new StringBuilder("UserAuthorizationStatus(authorized="), this.authorized, ')');
    }
}
