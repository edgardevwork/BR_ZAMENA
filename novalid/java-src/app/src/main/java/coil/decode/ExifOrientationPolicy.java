package coil.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExifOrientationPolicy.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lcoil/decode/ExifOrientationPolicy;", "", "(Ljava/lang/String;I)V", "IGNORE", "RESPECT_PERFORMANCE", "RESPECT_ALL", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ExifOrientationPolicy {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ ExifOrientationPolicy[] $VALUES;
    public static final ExifOrientationPolicy IGNORE = new ExifOrientationPolicy("IGNORE", 0);
    public static final ExifOrientationPolicy RESPECT_PERFORMANCE = new ExifOrientationPolicy("RESPECT_PERFORMANCE", 1);
    public static final ExifOrientationPolicy RESPECT_ALL = new ExifOrientationPolicy("RESPECT_ALL", 2);

    public static final /* synthetic */ ExifOrientationPolicy[] $values() {
        return new ExifOrientationPolicy[]{IGNORE, RESPECT_PERFORMANCE, RESPECT_ALL};
    }

    @NotNull
    public static EnumEntries<ExifOrientationPolicy> getEntries() {
        return $ENTRIES;
    }

    public static ExifOrientationPolicy valueOf(String str) {
        return (ExifOrientationPolicy) Enum.valueOf(ExifOrientationPolicy.class, str);
    }

    public static ExifOrientationPolicy[] values() {
        return (ExifOrientationPolicy[]) $VALUES.clone();
    }

    public ExifOrientationPolicy(String str, int i) {
    }

    static {
        ExifOrientationPolicy[] exifOrientationPolicyArr$values = $values();
        $VALUES = exifOrientationPolicyArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(exifOrientationPolicyArr$values);
    }
}
