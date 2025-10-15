package ru.p068vk.store.sdk.lib.storeversion.aidl.model;

import java.util.Objects;

/* loaded from: classes5.dex */
public final class StoreVersionInfo {
    public final Long versionCode;
    public final String versionName;

    public StoreVersionInfo(String str, Long l) {
        this.versionName = str;
        this.versionCode = l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StoreVersionInfo.class != obj.getClass()) {
            return false;
        }
        StoreVersionInfo storeVersionInfo = (StoreVersionInfo) obj;
        if (Objects.equals(this.versionName, storeVersionInfo.versionName)) {
            return Objects.equals(this.versionCode, storeVersionInfo.versionCode);
        }
        return false;
    }

    public Long getVersionCode() {
        return this.versionCode;
    }

    public String getVersionName() {
        return this.versionName;
    }

    public int hashCode() {
        String str = this.versionName;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.versionCode;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }
}
