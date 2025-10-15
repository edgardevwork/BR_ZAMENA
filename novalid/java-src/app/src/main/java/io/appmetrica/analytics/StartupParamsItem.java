package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class StartupParamsItem {

    /* renamed from: a */
    private final String f6005a;

    /* renamed from: b */
    private final StartupParamsItemStatus f6006b;

    /* renamed from: c */
    private final String f6007c;

    public StartupParamsItem(@Nullable String str, @NonNull StartupParamsItemStatus startupParamsItemStatus, @Nullable String str2) {
        this.f6005a = str;
        this.f6006b = startupParamsItemStatus;
        this.f6007c = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || StartupParamsItem.class != obj.getClass()) {
            return false;
        }
        StartupParamsItem startupParamsItem = (StartupParamsItem) obj;
        return Objects.equals(this.f6005a, startupParamsItem.f6005a) && this.f6006b == startupParamsItem.f6006b && Objects.equals(this.f6007c, startupParamsItem.f6007c);
    }

    @Nullable
    public String getErrorDetails() {
        return this.f6007c;
    }

    @Nullable
    public String getId() {
        return this.f6005a;
    }

    @NonNull
    public StartupParamsItemStatus getStatus() {
        return this.f6006b;
    }

    public int hashCode() {
        return Objects.hash(this.f6005a, this.f6006b, this.f6007c);
    }

    @NonNull
    public String toString() {
        return "StartupParamsItem{id='" + this.f6005a + "', status=" + this.f6006b + ", errorDetails='" + this.f6007c + "'}";
    }
}
