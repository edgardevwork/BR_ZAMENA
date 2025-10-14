package kotlin;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.apache.ivy.ant.IvyCleanCache;
import org.jetbrains.annotations.NotNull;

/* compiled from: Lazy.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m7105d2 = {"Lkotlin/LazyThreadSafetyMode;", "", "(Ljava/lang/String;I)V", "SYNCHRONIZED", "PUBLICATION", IvyCleanCache.NONE, "kotlin-stdlib"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes8.dex */
public final class LazyThreadSafetyMode extends Enum<LazyThreadSafetyMode> {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ LazyThreadSafetyMode[] $VALUES;
    public static final LazyThreadSafetyMode SYNCHRONIZED = new LazyThreadSafetyMode("SYNCHRONIZED", 0);
    public static final LazyThreadSafetyMode PUBLICATION = new LazyThreadSafetyMode("PUBLICATION", 1);
    public static final LazyThreadSafetyMode NONE = new LazyThreadSafetyMode(IvyCleanCache.NONE, 2);

    public static final /* synthetic */ LazyThreadSafetyMode[] $values() {
        return new LazyThreadSafetyMode[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    @NotNull
    public static EnumEntries<LazyThreadSafetyMode> getEntries() {
        return $ENTRIES;
    }

    public static LazyThreadSafetyMode valueOf(String str) {
        return (LazyThreadSafetyMode) Enum.valueOf(LazyThreadSafetyMode.class, str);
    }

    public static LazyThreadSafetyMode[] values() {
        return (LazyThreadSafetyMode[]) $VALUES.clone();
    }

    public LazyThreadSafetyMode(String str, int i) {
        super(str, i);
    }

    static {
        LazyThreadSafetyMode[] lazyThreadSafetyModeArr$values = $values();
        $VALUES = lazyThreadSafetyModeArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(lazyThreadSafetyModeArr$values);
    }
}
