package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC9664kn;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes5.dex */
public class AdRevenue {

    @Nullable
    public final String adNetwork;

    @Nullable
    public final String adPlacementId;

    @Nullable
    public final String adPlacementName;

    @NonNull
    public final BigDecimal adRevenue;

    @Nullable
    public final AdType adType;

    @Nullable
    public final String adUnitId;

    @Nullable
    public final String adUnitName;

    @NonNull
    public final Currency currency;

    @Nullable
    public final Map<String, String> payload;

    @Nullable
    public final String precision;

    public static class Builder {

        /* renamed from: a */
        private final BigDecimal f5917a;

        /* renamed from: b */
        private final Currency f5918b;

        /* renamed from: c */
        private AdType f5919c;

        /* renamed from: d */
        private String f5920d;

        /* renamed from: e */
        private String f5921e;

        /* renamed from: f */
        private String f5922f;

        /* renamed from: g */
        private String f5923g;

        /* renamed from: h */
        private String f5924h;

        /* renamed from: i */
        private String f5925i;

        /* renamed from: j */
        private Map f5926j;

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f5917a, this.f5918b, this.f5919c, this.f5920d, this.f5921e, this.f5922f, this.f5923g, this.f5924h, this.f5925i, this.f5926j, 0);
        }

        public Builder withAdNetwork(@Nullable String str) {
            this.f5920d = str;
            return this;
        }

        public Builder withAdPlacementId(@Nullable String str) {
            this.f5923g = str;
            return this;
        }

        public Builder withAdPlacementName(@Nullable String str) {
            this.f5924h = str;
            return this;
        }

        public Builder withAdType(@Nullable AdType adType) {
            this.f5919c = adType;
            return this;
        }

        public Builder withAdUnitId(@Nullable String str) {
            this.f5921e = str;
            return this;
        }

        public Builder withAdUnitName(@Nullable String str) {
            this.f5922f = str;
            return this;
        }

        public Builder withPayload(@Nullable Map<String, String> map) {
            this.f5926j = map == null ? null : CollectionUtils.copyOf(map);
            return this;
        }

        public Builder withPrecision(@Nullable String str) {
            this.f5925i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f5917a = bigDecimal;
            this.f5918b = currency;
        }
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j, @NonNull Currency currency) {
        return new Builder(AbstractC9664kn.m6339a(j), currency, 0);
    }

    public static Builder newBuilder(double d, @NonNull Currency currency) {
        return new Builder(new BigDecimal(AbstractC9664kn.m6338a(d)), currency, 0);
    }
}
