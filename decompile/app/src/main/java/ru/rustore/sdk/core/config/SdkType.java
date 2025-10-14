package ru.rustore.sdk.core.config;

import io.appmetrica.analytics.plugins.PluginErrorDetails;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SdkType.kt */
@Metadata(m7104d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m7105d2 = {"Lru/rustore/sdk/core/config/SdkType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "KOTLIN", "UNITY", "FLUTTER", "UNREAL_ENGINE", "GODOT", "REACT_NATIVE", "Companion", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
/* loaded from: classes7.dex */
public enum SdkType {
    KOTLIN("kotlin"),
    UNITY(PluginErrorDetails.Platform.UNITY),
    FLUTTER(PluginErrorDetails.Platform.FLUTTER),
    UNREAL_ENGINE("unreal-engine"),
    GODOT("godot"),
    REACT_NATIVE("react-native");


    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEY = "type";

    @NotNull
    public final String value;

    SdkType(String str) {
        this.value = str;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }

    /* compiled from: SdkType.kt */
    @Metadata(m7104d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\bJ\u0014\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m7105d2 = {"Lru/rustore/sdk/core/config/SdkType$Companion;", "", "()V", "KEY", "", "fromMap", "Lru/rustore/sdk/core/config/SdkType;", "map", "", "fromValue", "value", "sdk-public-core_release"}, m7106k = 1, m7107mv = {1, 7, 0}, m7109xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @Nullable
        public final SdkType fromMap(@NotNull Map<String, ? extends Object> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            Object obj = map.get("type");
            return fromValue(obj instanceof String ? (String) obj : null);
        }

        public final SdkType fromValue(String value) {
            SdkType sdkType = SdkType.KOTLIN;
            if (Intrinsics.areEqual(value, sdkType.getValue())) {
                return sdkType;
            }
            SdkType sdkType2 = SdkType.UNITY;
            if (Intrinsics.areEqual(value, sdkType2.getValue())) {
                return sdkType2;
            }
            SdkType sdkType3 = SdkType.FLUTTER;
            if (Intrinsics.areEqual(value, sdkType3.getValue())) {
                return sdkType3;
            }
            SdkType sdkType4 = SdkType.UNREAL_ENGINE;
            if (Intrinsics.areEqual(value, sdkType4.getValue())) {
                return sdkType4;
            }
            SdkType sdkType5 = SdkType.GODOT;
            if (Intrinsics.areEqual(value, sdkType5.getValue())) {
                return sdkType5;
            }
            SdkType sdkType6 = SdkType.REACT_NATIVE;
            if (Intrinsics.areEqual(value, sdkType6.getValue())) {
                return sdkType6;
            }
            return null;
        }
    }
}
