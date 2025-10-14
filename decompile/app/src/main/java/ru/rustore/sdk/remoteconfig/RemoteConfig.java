package ru.rustore.sdk.remoteconfig;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringNumberConversionsJVMKt;
import kotlin.text.StringsKt__StringNumberConversionsKt;
import ru.rustore.sdk.remoteconfig.RemoteConfigException;

@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J\u0013\u0010\t\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\b\u0010\u0015\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m7105d2 = {"Lru/rustore/sdk/remoteconfig/RemoteConfig;", "", "data", "", "", "(Ljava/util/Map;)V", "containsKey", "", "key", "equals", "other", "getBoolean", "getDouble", "", "getFloat", "", "getInt", "", "getLong", "", "getString", "hashCode", "sdk-public-remoteconfig_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes5.dex */
public final class RemoteConfig {
    public final Map<String, String> data;

    public RemoteConfig(Map<String, String> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    public final boolean containsKey(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.data.containsKey(key);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(RemoteConfig.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type ru.rustore.sdk.remoteconfig.RemoteConfig");
        return Intrinsics.areEqual(this.data, ((RemoteConfig) other).data);
    }

    public final boolean getBoolean(String key) throws RemoteConfigException.RemoteConfigCastException {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = this.data;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = map.get(key);
        if (Intrinsics.areEqual(str, "true")) {
            return true;
        }
        if (Intrinsics.areEqual(str, "false")) {
            return false;
        }
        throw new RemoteConfigException.RemoteConfigCastException("error getting the value by key: (" + key + ") as Boolean: (" + str + ')', null, 2, null);
    }

    public final double getDouble(String key) throws RemoteConfigException.RemoteConfigCastException {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = this.data;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = map.get(key);
        Double doubleOrNull = str != null ? StringsKt__StringNumberConversionsJVMKt.toDoubleOrNull(str) : null;
        if (doubleOrNull != null) {
            return doubleOrNull.doubleValue();
        }
        throw new RemoteConfigException.RemoteConfigCastException("error getting the value by key: (" + key + ") as Double: (" + str + ')', null, 2, null);
    }

    public final float getFloat(String key) throws RemoteConfigException.RemoteConfigCastException {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = this.data;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = map.get(key);
        Float floatOrNull = str != null ? StringsKt__StringNumberConversionsJVMKt.toFloatOrNull(str) : null;
        if (floatOrNull != null) {
            return floatOrNull.floatValue();
        }
        throw new RemoteConfigException.RemoteConfigCastException("error getting the value by key: (" + key + ") as Float: (" + str + ')', null, 2, null);
    }

    public final int getInt(String key) throws RemoteConfigException.RemoteConfigCastException {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = this.data;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = map.get(key);
        Integer intOrNull = str != null ? StringsKt__StringNumberConversionsKt.toIntOrNull(str) : null;
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new RemoteConfigException.RemoteConfigCastException("error getting the value by key: (" + key + ") as Int: (" + str + ')', null, 2, null);
    }

    public final long getLong(String key) throws RemoteConfigException.RemoteConfigCastException {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = this.data;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = map.get(key);
        Long longOrNull = str != null ? StringsKt__StringNumberConversionsKt.toLongOrNull(str) : null;
        if (longOrNull != null) {
            return longOrNull.longValue();
        }
        throw new RemoteConfigException.RemoteConfigCastException("error getting the value by key: (" + key + ") as Long: (" + str + ')', null, 2, null);
    }

    public final String getString(String key) throws RemoteConfigException.RemoteConfigCastException {
        Intrinsics.checkNotNullParameter(key, "key");
        Map<String, String> map = this.data;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        String str = map.get(key);
        if (str != null) {
            return str;
        }
        throw new RemoteConfigException.RemoteConfigCastException("error getting the value by key: (" + key + ") as String", null, 2, null);
    }

    public int hashCode() {
        return this.data.hashCode();
    }
}
