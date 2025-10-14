package androidx.compose.material3;

import androidx.exifinterface.media.ExifInterface;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActualJvm.jvm.kt */
@Metadata(m7104d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002\u001a*\u0010\n\u001a\u00020\u0002*\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0000\"\u001a\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\n\u0010\u000b\"\u00020\f2\u00020\f*\u001e\b\u0000\u0010\r\u001a\u0004\b\u0000\u0010\u000e\"\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\b\u0012\u0004\u0012\u0002H\u000e0\u000f¨\u0006\u0010"}, m7105d2 = {"cachedFormatters", "Ljava/util/WeakHashMap;", "", "Ljava/text/NumberFormat;", "getCachedDateTimeFormatter", "minDigits", "", "maxDigits", "isGroupingUsed", "", "toLocalString", "CalendarLocale", "Ljava/util/Locale;", "InternalAtomicReference", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/atomic/AtomicReference;", "material3_release"}, m7106k = 2, m7107mv = {1, 8, 0}, m7109xi = 48)
@SourceDebugExtension({"SMAP\nActualJvm.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/material3/ActualJvm_jvmKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,70:1\n361#2,7:71\n*S KotlinDebug\n*F\n+ 1 ActualJvm.jvm.kt\nandroidx/compose/material3/ActualJvm_jvmKt\n*L\n62#1:71,7\n*E\n"})
/* loaded from: classes.dex */
public final class ActualJvm_jvmKt {

    @NotNull
    private static final WeakHashMap<String, NumberFormat> cachedFormatters = new WeakHashMap<>();

    public static /* synthetic */ void InternalAtomicReference$annotations() {
    }

    public static /* synthetic */ String toLocalString$default(int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = 1;
        }
        if ((i4 & 2) != 0) {
            i3 = 40;
        }
        if ((i4 & 4) != 0) {
            z = false;
        }
        return toLocalString(i, i2, i3, z);
    }

    @NotNull
    public static final String toLocalString(int i, int i2, int i3, boolean z) {
        return getCachedDateTimeFormatter(i2, i3, z).format(Integer.valueOf(i));
    }

    private static final NumberFormat getCachedDateTimeFormatter(int i, int i2, boolean z) {
        String str = i + '.' + i2 + '.' + z + '.' + Locale.getDefault().toLanguageTag();
        WeakHashMap<String, NumberFormat> weakHashMap = cachedFormatters;
        NumberFormat integerInstance = weakHashMap.get(str);
        if (integerInstance == null) {
            integerInstance = NumberFormat.getIntegerInstance();
            integerInstance.setGroupingUsed(z);
            integerInstance.setMinimumIntegerDigits(i);
            integerInstance.setMaximumIntegerDigits(i2);
            weakHashMap.put(str, integerInstance);
        }
        return integerInstance;
    }
}
