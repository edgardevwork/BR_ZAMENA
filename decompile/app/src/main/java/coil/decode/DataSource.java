package coil.decode;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DataSource.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, m7105d2 = {"Lcoil/decode/DataSource;", "", "(Ljava/lang/String;I)V", "MEMORY_CACHE", "MEMORY", "DISK", "NETWORK", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class DataSource {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ DataSource[] $VALUES;
    public static final DataSource MEMORY_CACHE = new DataSource("MEMORY_CACHE", 0);
    public static final DataSource MEMORY = new DataSource("MEMORY", 1);
    public static final DataSource DISK = new DataSource("DISK", 2);
    public static final DataSource NETWORK = new DataSource("NETWORK", 3);

    public static final /* synthetic */ DataSource[] $values() {
        return new DataSource[]{MEMORY_CACHE, MEMORY, DISK, NETWORK};
    }

    @NotNull
    public static EnumEntries<DataSource> getEntries() {
        return $ENTRIES;
    }

    public static DataSource valueOf(String str) {
        return (DataSource) Enum.valueOf(DataSource.class, str);
    }

    public static DataSource[] values() {
        return (DataSource[]) $VALUES.clone();
    }

    public DataSource(String str, int i) {
    }

    static {
        DataSource[] dataSourceArr$values = $values();
        $VALUES = dataSourceArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(dataSourceArr$values);
    }
}
