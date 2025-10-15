package coil.size;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: Scale.kt */
@Metadata(m7104d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m7105d2 = {"Lcoil/size/Scale;", "", "(Ljava/lang/String;I)V", "FILL", "FIT", "coil-base_release"}, m7106k = 1, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class Scale extends Enum<Scale> {
    public static final /* synthetic */ EnumEntries $ENTRIES;
    public static final /* synthetic */ Scale[] $VALUES;
    public static final Scale FILL = new Scale("FILL", 0);
    public static final Scale FIT = new Scale("FIT", 1);

    public static final /* synthetic */ Scale[] $values() {
        return new Scale[]{FILL, FIT};
    }

    @NotNull
    public static EnumEntries<Scale> getEntries() {
        return $ENTRIES;
    }

    public static Scale valueOf(String str) {
        return (Scale) Enum.valueOf(Scale.class, str);
    }

    public static Scale[] values() {
        return (Scale[]) $VALUES.clone();
    }

    public Scale(String str, int i) {
        super(str, i);
    }

    static {
        Scale[] scaleArr$values = $values();
        $VALUES = scaleArr$values;
        $ENTRIES = EnumEntriesKt.enumEntries(scaleArr$values);
    }
}
