package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.internal.CounterConfiguration;
import io.appmetrica.analytics.networktasks.internal.ArgumentsMerger;
import java.util.Map;
import java.util.Objects;

/* renamed from: io.appmetrica.analytics.impl.D4 */
/* loaded from: classes7.dex */
public final class C8840D4 implements ArgumentsMerger {

    /* renamed from: a */
    @Nullable
    public final String f6445a;

    /* renamed from: b */
    @Nullable
    public final Boolean f6446b;

    /* renamed from: c */
    @Nullable
    public final Location f6447c;

    /* renamed from: d */
    @Nullable
    public final Boolean f6448d;

    /* renamed from: e */
    @Nullable
    public final Integer f6449e;

    /* renamed from: f */
    @Nullable
    public final Integer f6450f;

    /* renamed from: g */
    @Nullable
    public final Integer f6451g;

    /* renamed from: h */
    @Nullable
    public final Boolean f6452h;

    /* renamed from: i */
    @Nullable
    public final Boolean f6453i;

    /* renamed from: j */
    @Nullable
    public final Map<String, String> f6454j;

    /* renamed from: k */
    @Nullable
    public final Integer f6455k;

    /* renamed from: l */
    @Nullable
    public final Boolean f6456l;

    /* renamed from: m */
    @Nullable
    public final Boolean f6457m;

    public C8840D4(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4, Boolean bool5, Boolean bool6) {
        this.f6445a = str;
        this.f6446b = bool;
        this.f6447c = location;
        this.f6448d = bool2;
        this.f6449e = num;
        this.f6450f = num2;
        this.f6451g = num3;
        this.f6452h = bool3;
        this.f6453i = bool4;
        this.f6454j = map;
        this.f6455k = num4;
        this.f6456l = bool5;
        this.f6457m = bool6;
    }

    /* renamed from: a */
    public final boolean m5053a(@NonNull C8840D4 c8840d4) {
        return equals(c8840d4);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8840D4 mergeFrom(@NonNull C8840D4 c8840d4) {
        return new C8840D4((String) WrapUtils.getOrDefaultNullable(this.f6445a, c8840d4.f6445a), (Boolean) WrapUtils.getOrDefaultNullable(this.f6446b, c8840d4.f6446b), (Location) WrapUtils.getOrDefaultNullable(this.f6447c, c8840d4.f6447c), (Boolean) WrapUtils.getOrDefaultNullable(this.f6448d, c8840d4.f6448d), (Integer) WrapUtils.getOrDefaultNullable(this.f6449e, c8840d4.f6449e), (Integer) WrapUtils.getOrDefaultNullable(this.f6450f, c8840d4.f6450f), (Integer) WrapUtils.getOrDefaultNullable(this.f6451g, c8840d4.f6451g), (Boolean) WrapUtils.getOrDefaultNullable(this.f6452h, c8840d4.f6452h), (Boolean) WrapUtils.getOrDefaultNullable(this.f6453i, c8840d4.f6453i), (Map) WrapUtils.getOrDefaultNullable(this.f6454j, c8840d4.f6454j), (Integer) WrapUtils.getOrDefaultNullable(this.f6455k, c8840d4.f6455k), (Boolean) WrapUtils.getOrDefaultNullable(this.f6456l, c8840d4.f6456l), (Boolean) WrapUtils.getOrDefaultNullable(this.f6457m, c8840d4.f6457m));
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    public final boolean compareWithOtherArguments(@NonNull Object obj) {
        return equals((C8840D4) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C8840D4.class != obj.getClass()) {
            return false;
        }
        C8840D4 c8840d4 = (C8840D4) obj;
        if (Objects.equals(this.f6445a, c8840d4.f6445a) && Objects.equals(this.f6446b, c8840d4.f6446b) && Objects.equals(this.f6447c, c8840d4.f6447c) && Objects.equals(this.f6448d, c8840d4.f6448d) && Objects.equals(this.f6449e, c8840d4.f6449e) && Objects.equals(this.f6450f, c8840d4.f6450f) && Objects.equals(this.f6451g, c8840d4.f6451g) && Objects.equals(this.f6452h, c8840d4.f6452h) && Objects.equals(this.f6453i, c8840d4.f6453i) && Objects.equals(this.f6454j, c8840d4.f6454j) && Objects.equals(this.f6455k, c8840d4.f6455k) && Objects.equals(this.f6456l, c8840d4.f6456l)) {
            return Objects.equals(this.f6457m, c8840d4.f6457m);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f6445a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.f6446b;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Location location = this.f6447c;
        int iHashCode3 = (iHashCode2 + (location != null ? location.hashCode() : 0)) * 31;
        Boolean bool2 = this.f6448d;
        int iHashCode4 = (iHashCode3 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Integer num = this.f6449e;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.f6450f;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.f6451g;
        int iHashCode7 = (iHashCode6 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool3 = this.f6452h;
        int iHashCode8 = (iHashCode7 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.f6453i;
        int iHashCode9 = (iHashCode8 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Map<String, String> map = this.f6454j;
        int iHashCode10 = (iHashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Integer num4 = this.f6455k;
        int iHashCode11 = (iHashCode10 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool5 = this.f6456l;
        int iHashCode12 = (iHashCode11 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.f6457m;
        return iHashCode12 + (bool6 != null ? bool6.hashCode() : 0);
    }

    public final String toString() {
        return "ReporterArguments{apiKey='" + this.f6445a + "', locationTracking=" + this.f6446b + ", manualLocation=" + this.f6447c + ", firstActivationAsUpdate=" + this.f6448d + ", sessionTimeout=" + this.f6449e + ", maxReportsCount=" + this.f6450f + ", dispatchPeriod=" + this.f6451g + ", logEnabled=" + this.f6452h + ", dataSendingEnabled=" + this.f6453i + ", clidsFromClient=" + this.f6454j + ", maxReportsInDbCount=" + this.f6455k + ", nativeCrashesEnabled=" + this.f6456l + ", revenueAutoTrackingEnabled=" + this.f6457m + '}';
    }

    public C8840D4(@NonNull CounterConfiguration counterConfiguration, @Nullable Map<String, String> map) {
        this(counterConfiguration.getApiKey(), counterConfiguration.isLocationTrackingEnabled(), counterConfiguration.getManualLocation(), counterConfiguration.isFirstActivationAsUpdate(), counterConfiguration.getSessionTimeout(), counterConfiguration.getMaxReportsCount(), counterConfiguration.getDispatchPeriod(), counterConfiguration.isLogEnabled(), counterConfiguration.getDataSendingEnabled(), map, counterConfiguration.getMaxReportsInDbCount(), counterConfiguration.getReportNativeCrashesEnabled(), counterConfiguration.isRevenueAutoTrackingEnabled());
    }

    public C8840D4() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
