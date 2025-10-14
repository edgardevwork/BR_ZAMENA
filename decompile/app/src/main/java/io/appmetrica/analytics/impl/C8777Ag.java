package io.appmetrica.analytics.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Ag */
/* loaded from: classes8.dex */
public final class C8777Ag extends BaseRequestConfig.BaseRequestArguments {

    /* renamed from: a */
    @Nullable
    public final String f6327a;

    /* renamed from: b */
    @Nullable
    public final Location f6328b;

    /* renamed from: c */
    public final boolean f6329c;

    /* renamed from: d */
    public final boolean f6330d;

    /* renamed from: e */
    public final int f6331e;

    /* renamed from: f */
    public final int f6332f;

    /* renamed from: g */
    public final int f6333g;

    /* renamed from: h */
    public final boolean f6334h;

    /* renamed from: i */
    public final boolean f6335i;

    /* renamed from: j */
    @Nullable
    public final Map<String, String> f6336j;

    /* renamed from: k */
    public final int f6337k;

    public C8777Ag(@NonNull C8840D4 c8840d4) {
        this(c8840d4.f6445a, c8840d4.f6446b, c8840d4.f6447c, c8840d4.f6448d, c8840d4.f6449e, c8840d4.f6450f, c8840d4.f6451g, c8840d4.f6452h, c8840d4.f6453i, c8840d4.f6454j, c8840d4.f6455k);
    }

    /* renamed from: a */
    public static C8777Ag m4956a() {
        return new C8777Ag(null, null, null, null, null, null, null, null, null, null, null);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    @NonNull
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C8777Ag mergeFrom(@NonNull C8840D4 c8840d4) {
        return new C8777Ag((String) WrapUtils.getOrDefaultNullable(c8840d4.f6445a, this.f6327a), (Boolean) WrapUtils.getOrDefaultNullable(c8840d4.f6446b, Boolean.valueOf(this.f6329c)), (Location) WrapUtils.getOrDefaultNullable(c8840d4.f6447c, this.f6328b), (Boolean) WrapUtils.getOrDefaultNullable(c8840d4.f6448d, Boolean.valueOf(this.f6330d)), (Integer) WrapUtils.getOrDefaultNullable(c8840d4.f6449e, Integer.valueOf(this.f6331e)), (Integer) WrapUtils.getOrDefaultNullable(c8840d4.f6450f, Integer.valueOf(this.f6332f)), (Integer) WrapUtils.getOrDefaultNullable(c8840d4.f6451g, Integer.valueOf(this.f6333g)), (Boolean) WrapUtils.getOrDefaultNullable(c8840d4.f6452h, Boolean.valueOf(this.f6334h)), (Boolean) WrapUtils.getOrDefaultNullable(c8840d4.f6453i, Boolean.valueOf(this.f6335i)), (Map) WrapUtils.getOrDefaultNullable(c8840d4.f6454j, this.f6336j), (Integer) WrapUtils.getOrDefaultNullable(c8840d4.f6455k, Integer.valueOf(this.f6337k)));
    }

    public C8777Ag(String str, Boolean bool, Location location, Boolean bool2, Integer num, Integer num2, Integer num3, Boolean bool3, Boolean bool4, Map map, Integer num4) {
        this.f6327a = str;
        Boolean bool5 = Boolean.FALSE;
        this.f6329c = ((Boolean) WrapUtils.getOrDefault(bool, bool5)).booleanValue();
        this.f6328b = location;
        this.f6330d = ((Boolean) WrapUtils.getOrDefault(bool2, bool5)).booleanValue();
        this.f6331e = Math.max(10, ((Integer) WrapUtils.getOrDefault(num, 10)).intValue());
        this.f6332f = ((Integer) WrapUtils.getOrDefault(num2, 7)).intValue();
        this.f6333g = ((Integer) WrapUtils.getOrDefault(num3, 90)).intValue();
        this.f6334h = ((Boolean) WrapUtils.getOrDefault(bool3, bool5)).booleanValue();
        this.f6335i = ((Boolean) WrapUtils.getOrDefault(bool4, Boolean.TRUE)).booleanValue();
        this.f6336j = map;
        this.f6337k = ((Integer) WrapUtils.getOrDefault(num4, 1000)).intValue();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.ArgumentsMerger
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final boolean compareWithOtherArguments(@NonNull C8840D4 c8840d4) {
        Location location;
        Map<String, String> map;
        String str;
        Boolean bool = c8840d4.f6446b;
        if (bool != null && this.f6329c != bool.booleanValue()) {
            return false;
        }
        Boolean bool2 = c8840d4.f6448d;
        if (bool2 != null && this.f6330d != bool2.booleanValue()) {
            return false;
        }
        Integer num = c8840d4.f6449e;
        if (num != null && this.f6331e != num.intValue()) {
            return false;
        }
        Integer num2 = c8840d4.f6450f;
        if (num2 != null && this.f6332f != num2.intValue()) {
            return false;
        }
        Integer num3 = c8840d4.f6451g;
        if (num3 != null && this.f6333g != num3.intValue()) {
            return false;
        }
        Boolean bool3 = c8840d4.f6452h;
        if (bool3 != null && this.f6334h != bool3.booleanValue()) {
            return false;
        }
        Boolean bool4 = c8840d4.f6453i;
        if (bool4 != null && this.f6335i != bool4.booleanValue()) {
            return false;
        }
        String str2 = c8840d4.f6445a;
        if (str2 != null && ((str = this.f6327a) == null || !str.equals(str2))) {
            return false;
        }
        Map<String, String> map2 = c8840d4.f6454j;
        if (map2 != null && ((map = this.f6336j) == null || !map.equals(map2))) {
            return false;
        }
        Integer num4 = c8840d4.f6455k;
        if (num4 != null && this.f6337k != num4.intValue()) {
            return false;
        }
        Location location2 = c8840d4.f6447c;
        if (location2 != null && (location = this.f6328b) != location2) {
            if (location == null || location.getTime() != location2.getTime() || location.getElapsedRealtimeNanos() != location2.getElapsedRealtimeNanos() || Double.compare(location2.getLatitude(), location.getLatitude()) != 0 || Double.compare(location2.getLongitude(), location.getLongitude()) != 0 || Double.compare(location2.getAltitude(), location.getAltitude()) != 0 || Float.compare(location2.getSpeed(), location.getSpeed()) != 0 || Float.compare(location2.getBearing(), location.getBearing()) != 0 || Float.compare(location2.getAccuracy(), location.getAccuracy()) != 0) {
                return false;
            }
            if (AndroidUtils.isApiAchieved(26) && (Float.compare(location2.getVerticalAccuracyMeters(), location.getVerticalAccuracyMeters()) != 0 || Float.compare(location2.getSpeedAccuracyMetersPerSecond(), location.getSpeedAccuracyMetersPerSecond()) != 0 || Float.compare(location2.getBearingAccuracyDegrees(), location.getBearingAccuracyDegrees()) != 0)) {
                return false;
            }
            if (location.getProvider() != null) {
                if (!location.getProvider().equals(location2.getProvider())) {
                    return false;
                }
            } else if (location2.getProvider() != null) {
                return false;
            }
            if (location.getExtras() != null) {
                if (!location.getExtras().equals(location2.getExtras())) {
                    return false;
                }
            } else if (location2.getExtras() != null) {
                return false;
            }
        }
        return true;
    }
}
