package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.cache.LocalCache;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class CacheBuilderSpec {
    public static final Splitter KEYS_SPLITTER = Splitter.m1150on(',').trimResults();
    public static final Splitter KEY_VALUE_SPLITTER = Splitter.m1150on('=').trimResults();
    public static final ImmutableMap<String, ValueParser> VALUE_PARSERS;

    @VisibleForTesting
    public long accessExpirationDuration;

    @VisibleForTesting
    @CheckForNull
    public TimeUnit accessExpirationTimeUnit;

    @VisibleForTesting
    @CheckForNull
    public Integer concurrencyLevel;

    @VisibleForTesting
    @CheckForNull
    public Integer initialCapacity;

    @VisibleForTesting
    @CheckForNull
    public LocalCache.Strength keyStrength;

    @VisibleForTesting
    @CheckForNull
    public Long maximumSize;

    @VisibleForTesting
    @CheckForNull
    public Long maximumWeight;

    @VisibleForTesting
    @CheckForNull
    public Boolean recordStats;

    @VisibleForTesting
    public long refreshDuration;

    @VisibleForTesting
    @CheckForNull
    public TimeUnit refreshTimeUnit;
    public final String specification;

    @VisibleForTesting
    @CheckForNull
    public LocalCache.Strength valueStrength;

    @VisibleForTesting
    public long writeExpirationDuration;

    @VisibleForTesting
    @CheckForNull
    public TimeUnit writeExpirationTimeUnit;

    public interface ValueParser {
        void parse(CacheBuilderSpec spec, String key, @CheckForNull String value);
    }

    static {
        ImmutableMap.Builder builderPut = ImmutableMap.builder().put("initialCapacity", new InitialCapacityParser()).put("maximumSize", new MaximumSizeParser()).put("maximumWeight", new MaximumWeightParser()).put("concurrencyLevel", new ConcurrencyLevelParser());
        LocalCache.Strength strength = LocalCache.Strength.WEAK;
        VALUE_PARSERS = builderPut.put("weakKeys", new KeyStrengthParser(strength)).put("softValues", new ValueStrengthParser(LocalCache.Strength.SOFT)).put("weakValues", new ValueStrengthParser(strength)).put("recordStats", new RecordStatsParser()).put("expireAfterAccess", new AccessDurationParser()).put("expireAfterWrite", new WriteDurationParser()).put("refreshAfterWrite", new RefreshDurationParser()).put("refreshInterval", new RefreshDurationParser()).buildOrThrow();
    }

    public CacheBuilderSpec(String specification) {
        this.specification = specification;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static CacheBuilderSpec parse(String cacheBuilderSpecification) {
        CacheBuilderSpec cacheBuilderSpec = new CacheBuilderSpec(cacheBuilderSpecification);
        if (!cacheBuilderSpecification.isEmpty()) {
            for (String str : KEYS_SPLITTER.split(cacheBuilderSpecification)) {
                ImmutableList immutableListCopyOf = ImmutableList.copyOf(KEY_VALUE_SPLITTER.split(str));
                Preconditions.checkArgument(!immutableListCopyOf.isEmpty(), "blank key-value pair");
                Preconditions.checkArgument(immutableListCopyOf.size() <= 2, "key-value pair %s with more than one equals sign", str);
                String str2 = (String) immutableListCopyOf.get(0);
                ValueParser valueParser = VALUE_PARSERS.get(str2);
                Preconditions.checkArgument(valueParser != null, "unknown key %s", str2);
                valueParser.parse(cacheBuilderSpec, str2, immutableListCopyOf.size() == 1 ? null : (String) immutableListCopyOf.get(1));
            }
        }
        return cacheBuilderSpec;
    }

    public static CacheBuilderSpec disableCaching() {
        return parse("maximumSize=0");
    }

    public CacheBuilder<Object, Object> toCacheBuilder() {
        CacheBuilder<Object, Object> cacheBuilderNewBuilder = CacheBuilder.newBuilder();
        Integer num = this.initialCapacity;
        if (num != null) {
            cacheBuilderNewBuilder.initialCapacity(num.intValue());
        }
        Long l = this.maximumSize;
        if (l != null) {
            cacheBuilderNewBuilder.maximumSize(l.longValue());
        }
        Long l2 = this.maximumWeight;
        if (l2 != null) {
            cacheBuilderNewBuilder.maximumWeight(l2.longValue());
        }
        Integer num2 = this.concurrencyLevel;
        if (num2 != null) {
            cacheBuilderNewBuilder.concurrencyLevel(num2.intValue());
        }
        LocalCache.Strength strength = this.keyStrength;
        if (strength != null) {
            if (C71851.$SwitchMap$com$google$common$cache$LocalCache$Strength[strength.ordinal()] == 1) {
                cacheBuilderNewBuilder.weakKeys();
            } else {
                throw new AssertionError();
            }
        }
        LocalCache.Strength strength2 = this.valueStrength;
        if (strength2 != null) {
            int i = C71851.$SwitchMap$com$google$common$cache$LocalCache$Strength[strength2.ordinal()];
            if (i == 1) {
                cacheBuilderNewBuilder.weakValues();
            } else if (i == 2) {
                cacheBuilderNewBuilder.softValues();
            } else {
                throw new AssertionError();
            }
        }
        Boolean bool = this.recordStats;
        if (bool != null && bool.booleanValue()) {
            cacheBuilderNewBuilder.recordStats();
        }
        TimeUnit timeUnit = this.writeExpirationTimeUnit;
        if (timeUnit != null) {
            cacheBuilderNewBuilder.expireAfterWrite(this.writeExpirationDuration, timeUnit);
        }
        TimeUnit timeUnit2 = this.accessExpirationTimeUnit;
        if (timeUnit2 != null) {
            cacheBuilderNewBuilder.expireAfterAccess(this.accessExpirationDuration, timeUnit2);
        }
        TimeUnit timeUnit3 = this.refreshTimeUnit;
        if (timeUnit3 != null) {
            cacheBuilderNewBuilder.refreshAfterWrite(this.refreshDuration, timeUnit3);
        }
        return cacheBuilderNewBuilder;
    }

    /* renamed from: com.google.common.cache.CacheBuilderSpec$1 */
    public static /* synthetic */ class C71851 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$cache$LocalCache$Strength;

        static {
            int[] iArr = new int[LocalCache.Strength.values().length];
            $SwitchMap$com$google$common$cache$LocalCache$Strength = iArr;
            try {
                iArr[LocalCache.Strength.WEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$cache$LocalCache$Strength[LocalCache.Strength.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public String toParsableString() {
        return this.specification;
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).addValue(toParsableString()).toString();
    }

    public int hashCode() {
        return Objects.hashCode(this.initialCapacity, this.maximumSize, this.maximumWeight, this.concurrencyLevel, this.keyStrength, this.valueStrength, this.recordStats, durationInNanos(this.writeExpirationDuration, this.writeExpirationTimeUnit), durationInNanos(this.accessExpirationDuration, this.accessExpirationTimeUnit), durationInNanos(this.refreshDuration, this.refreshTimeUnit));
    }

    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CacheBuilderSpec)) {
            return false;
        }
        CacheBuilderSpec cacheBuilderSpec = (CacheBuilderSpec) obj;
        return Objects.equal(this.initialCapacity, cacheBuilderSpec.initialCapacity) && Objects.equal(this.maximumSize, cacheBuilderSpec.maximumSize) && Objects.equal(this.maximumWeight, cacheBuilderSpec.maximumWeight) && Objects.equal(this.concurrencyLevel, cacheBuilderSpec.concurrencyLevel) && Objects.equal(this.keyStrength, cacheBuilderSpec.keyStrength) && Objects.equal(this.valueStrength, cacheBuilderSpec.valueStrength) && Objects.equal(this.recordStats, cacheBuilderSpec.recordStats) && Objects.equal(durationInNanos(this.writeExpirationDuration, this.writeExpirationTimeUnit), durationInNanos(cacheBuilderSpec.writeExpirationDuration, cacheBuilderSpec.writeExpirationTimeUnit)) && Objects.equal(durationInNanos(this.accessExpirationDuration, this.accessExpirationTimeUnit), durationInNanos(cacheBuilderSpec.accessExpirationDuration, cacheBuilderSpec.accessExpirationTimeUnit)) && Objects.equal(durationInNanos(this.refreshDuration, this.refreshTimeUnit), durationInNanos(cacheBuilderSpec.refreshDuration, cacheBuilderSpec.refreshTimeUnit));
    }

    @CheckForNull
    public static Long durationInNanos(long duration, @CheckForNull TimeUnit unit) {
        if (unit == null) {
            return null;
        }
        return Long.valueOf(unit.toNanos(duration));
    }

    /* loaded from: classes8.dex */
    public static abstract class IntegerParser implements ValueParser {
        public abstract void parseInteger(CacheBuilderSpec spec, int value);

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, String value) {
            if (Strings.isNullOrEmpty(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                parseInteger(spec, Integer.parseInt(value));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value), e);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class LongParser implements ValueParser {
        public abstract void parseLong(CacheBuilderSpec spec, long value);

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, String value) {
            if (Strings.isNullOrEmpty(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                parseLong(spec, Long.parseLong(value));
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException(CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value), e);
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class InitialCapacityParser extends IntegerParser {
        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        public void parseInteger(CacheBuilderSpec spec, int value) {
            Integer num = spec.initialCapacity;
            Preconditions.checkArgument(num == null, "initial capacity was already set to %s", num);
            spec.initialCapacity = Integer.valueOf(value);
        }
    }

    /* loaded from: classes8.dex */
    public static class MaximumSizeParser extends LongParser {
        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        public void parseLong(CacheBuilderSpec spec, long value) {
            Long l = spec.maximumSize;
            Preconditions.checkArgument(l == null, "maximum size was already set to %s", l);
            Long l2 = spec.maximumWeight;
            Preconditions.checkArgument(l2 == null, "maximum weight was already set to %s", l2);
            spec.maximumSize = Long.valueOf(value);
        }
    }

    /* loaded from: classes8.dex */
    public static class MaximumWeightParser extends LongParser {
        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        public void parseLong(CacheBuilderSpec spec, long value) {
            Long l = spec.maximumWeight;
            Preconditions.checkArgument(l == null, "maximum weight was already set to %s", l);
            Long l2 = spec.maximumSize;
            Preconditions.checkArgument(l2 == null, "maximum size was already set to %s", l2);
            spec.maximumWeight = Long.valueOf(value);
        }
    }

    /* loaded from: classes8.dex */
    public static class ConcurrencyLevelParser extends IntegerParser {
        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        public void parseInteger(CacheBuilderSpec spec, int value) {
            Integer num = spec.concurrencyLevel;
            Preconditions.checkArgument(num == null, "concurrency level was already set to %s", num);
            spec.concurrencyLevel = Integer.valueOf(value);
        }
    }

    /* loaded from: classes8.dex */
    public static class KeyStrengthParser implements ValueParser {
        public final LocalCache.Strength strength;

        public KeyStrengthParser(LocalCache.Strength strength) {
            this.strength = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, @CheckForNull String value) {
            Preconditions.checkArgument(value == null, "key %s does not take values", key);
            LocalCache.Strength strength = spec.keyStrength;
            Preconditions.checkArgument(strength == null, "%s was already set to %s", key, strength);
            spec.keyStrength = this.strength;
        }
    }

    /* loaded from: classes8.dex */
    public static class ValueStrengthParser implements ValueParser {
        public final LocalCache.Strength strength;

        public ValueStrengthParser(LocalCache.Strength strength) {
            this.strength = strength;
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, @CheckForNull String value) {
            Preconditions.checkArgument(value == null, "key %s does not take values", key);
            LocalCache.Strength strength = spec.valueStrength;
            Preconditions.checkArgument(strength == null, "%s was already set to %s", key, strength);
            spec.valueStrength = this.strength;
        }
    }

    /* loaded from: classes8.dex */
    public static class RecordStatsParser implements ValueParser {
        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, @CheckForNull String value) {
            Preconditions.checkArgument(value == null, "recordStats does not take values");
            Preconditions.checkArgument(spec.recordStats == null, "recordStats already set");
            spec.recordStats = Boolean.TRUE;
        }
    }

    /* loaded from: classes8.dex */
    public static abstract class DurationParser implements ValueParser {
        public abstract void parseDuration(CacheBuilderSpec spec, long duration, TimeUnit unit);

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(CacheBuilderSpec spec, String key, @CheckForNull String value) {
            TimeUnit timeUnit;
            if (Strings.isNullOrEmpty(value)) {
                throw new IllegalArgumentException("value of key " + key + " omitted");
            }
            try {
                char cCharAt = value.charAt(value.length() - 1);
                if (cCharAt == 'd') {
                    timeUnit = TimeUnit.DAYS;
                } else if (cCharAt == 'h') {
                    timeUnit = TimeUnit.HOURS;
                } else if (cCharAt == 'm') {
                    timeUnit = TimeUnit.MINUTES;
                } else if (cCharAt == 's') {
                    timeUnit = TimeUnit.SECONDS;
                } else {
                    throw new IllegalArgumentException(CacheBuilderSpec.format("key %s invalid unit: was %s, must end with one of [dhms]", key, value));
                }
                parseDuration(spec, Long.parseLong(value.substring(0, value.length() - 1)), timeUnit);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException(CacheBuilderSpec.format("key %s value set to %s, must be integer", key, value));
            }
        }
    }

    /* loaded from: classes8.dex */
    public static class AccessDurationParser extends DurationParser {
        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        public void parseDuration(CacheBuilderSpec spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.accessExpirationTimeUnit == null, "expireAfterAccess already set");
            spec.accessExpirationDuration = duration;
            spec.accessExpirationTimeUnit = unit;
        }
    }

    /* loaded from: classes8.dex */
    public static class WriteDurationParser extends DurationParser {
        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        public void parseDuration(CacheBuilderSpec spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.writeExpirationTimeUnit == null, "expireAfterWrite already set");
            spec.writeExpirationDuration = duration;
            spec.writeExpirationTimeUnit = unit;
        }
    }

    /* loaded from: classes8.dex */
    public static class RefreshDurationParser extends DurationParser {
        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        public void parseDuration(CacheBuilderSpec spec, long duration, TimeUnit unit) {
            Preconditions.checkArgument(spec.refreshTimeUnit == null, "refreshAfterWrite already set");
            spec.refreshDuration = duration;
            spec.refreshTimeUnit = unit;
        }
    }

    public static String format(String format, Object... args) {
        return String.format(Locale.ROOT, format, args);
    }
}
