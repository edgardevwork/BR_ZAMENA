package coil.decode;

import coil.util.Utils;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.SetsKt__SetsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ExifUtils.kt */
@Metadata(m7104d1 = {"\u0000 \n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0016\u0010\b\u001a\u00020\u0004*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0000\"\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\u0004*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006¨\u0006\u000b"}, m7105d2 = {"RESPECT_PERFORMANCE_MIME_TYPES", "", "", "isRotated", "", "Lcoil/decode/ExifData;", "(Lcoil/decode/ExifData;)Z", "isSwapped", "supports", "Lcoil/decode/ExifOrientationPolicy;", "mimeType", "coil-base_release"}, m7106k = 2, m7107mv = {1, 9, 0}, m7109xi = 48)
/* loaded from: classes2.dex */
public final class ExifUtilsKt {

    @NotNull
    public static final Set<String> RESPECT_PERFORMANCE_MIME_TYPES = SetsKt__SetsKt.setOf((Object[]) new String[]{"image/jpeg", "image/webp", Utils.MIME_TYPE_HEIC, "image/heif"});

    /* compiled from: ExifUtils.kt */
    @Metadata(m7106k = 3, m7107mv = {1, 9, 0}, m7109xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ExifOrientationPolicy.values().length];
            try {
                iArr[ExifOrientationPolicy.RESPECT_PERFORMANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ExifOrientationPolicy.IGNORE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ExifOrientationPolicy.RESPECT_ALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean isSwapped(@NotNull ExifData exifData) {
        return exifData.getRotationDegrees() == 90 || exifData.getRotationDegrees() == 270;
    }

    public static final boolean isRotated(@NotNull ExifData exifData) {
        return exifData.getRotationDegrees() > 0;
    }

    public static final boolean supports(@NotNull ExifOrientationPolicy exifOrientationPolicy, @Nullable String str) {
        int i = WhenMappings.$EnumSwitchMapping$0[exifOrientationPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return false;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        } else if (str == null || !RESPECT_PERFORMANCE_MIME_TYPES.contains(str)) {
            return false;
        }
        return true;
    }
}
