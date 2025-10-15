package io.appmetrica.analytics.modulesapi.internal.client.adrevenue;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(m7104d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0014\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010)\u0012\b\b\u0002\u00104\u001a\u00020/¢\u0006\u0004\b5\u00106R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018R\u0019\u0010\"\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b \u0010\u0016\u001a\u0004\b!\u0010\u0018R\u0019\u0010%\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b#\u0010\u0016\u001a\u0004\b$\u0010\u0018R\u0019\u0010(\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b&\u0010\u0016\u001a\u0004\b'\u0010\u0018R%\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0014\u0018\u00010)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u00104\u001a\u00020/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00067"}, m7105d2 = {"Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdRevenue;", "", "Ljava/math/BigDecimal;", "a", "Ljava/math/BigDecimal;", "getAdRevenue", "()Ljava/math/BigDecimal;", "adRevenue", "Ljava/util/Currency;", "b", "Ljava/util/Currency;", "getCurrency", "()Ljava/util/Currency;", FirebaseAnalytics.Param.CURRENCY, "Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;", "c", "Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;", "getAdType", "()Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;", "adType", "", "d", "Ljava/lang/String;", "getAdNetwork", "()Ljava/lang/String;", "adNetwork", "e", "getAdUnitId", "adUnitId", "f", "getAdUnitName", "adUnitName", "g", "getAdPlacementId", "adPlacementId", "h", "getAdPlacementName", "adPlacementName", "i", "getPrecision", "precision", "", "j", "Ljava/util/Map;", "getPayload", "()Ljava/util/Map;", "payload", "", "k", "Z", "getAutoCollected", "()Z", "autoCollected", SegmentConstantPool.INITSTRING, "(Ljava/math/BigDecimal;Ljava/util/Currency;Lio/appmetrica/analytics/modulesapi/internal/client/adrevenue/ModuleAdType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Z)V", "modules-api_release"}, m7106k = 1, m7107mv = {1, 6, 0})
/* loaded from: classes7.dex */
public final class ModuleAdRevenue {

    /* renamed from: a, reason: from kotlin metadata */
    private final BigDecimal adRevenue;

    /* renamed from: b, reason: from kotlin metadata */
    private final Currency currency;

    /* renamed from: c, reason: from kotlin metadata */
    private final ModuleAdType adType;

    /* renamed from: d, reason: from kotlin metadata */
    private final String adNetwork;

    /* renamed from: e, reason: from kotlin metadata */
    private final String adUnitId;

    /* renamed from: f, reason: from kotlin metadata */
    private final String adUnitName;

    /* renamed from: g, reason: from kotlin metadata */
    private final String adPlacementId;

    /* renamed from: h, reason: from kotlin metadata */
    private final String adPlacementName;

    /* renamed from: i, reason: from kotlin metadata */
    private final String precision;

    /* renamed from: j, reason: from kotlin metadata */
    private final Map payload;

    /* renamed from: k, reason: from kotlin metadata */
    private final boolean autoCollected;

    public ModuleAdRevenue(@NotNull BigDecimal bigDecimal, @NotNull Currency currency, @Nullable ModuleAdType moduleAdType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Map<String, String> map, boolean z) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = moduleAdType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map;
        this.autoCollected = z;
    }

    @Nullable
    public final String getAdNetwork() {
        return this.adNetwork;
    }

    @Nullable
    public final String getAdPlacementId() {
        return this.adPlacementId;
    }

    @Nullable
    public final String getAdPlacementName() {
        return this.adPlacementName;
    }

    @NotNull
    public final BigDecimal getAdRevenue() {
        return this.adRevenue;
    }

    @Nullable
    public final ModuleAdType getAdType() {
        return this.adType;
    }

    @Nullable
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    @Nullable
    public final String getAdUnitName() {
        return this.adUnitName;
    }

    public final boolean getAutoCollected() {
        return this.autoCollected;
    }

    @NotNull
    public final Currency getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Map<String, String> getPayload() {
        return this.payload;
    }

    @Nullable
    public final String getPrecision() {
        return this.precision;
    }

    public /* synthetic */ ModuleAdRevenue(BigDecimal bigDecimal, Currency currency, ModuleAdType moduleAdType, String str, String str2, String str3, String str4, String str5, String str6, Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bigDecimal, currency, (i & 4) != 0 ? null : moduleAdType, (i & 8) != 0 ? null : str, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : str6, (i & 512) != 0 ? null : map, (i & 1024) != 0 ? true : z);
    }
}
