package androidx.profileinstaller;

import androidx.annotation.RestrictTo;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import org.apache.commons.compress.archivers.tar.TarConstants;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes2.dex */
public class ProfileVersion {
    public static final int MAX_SUPPORTED_SDK = 34;
    public static final int MIN_SUPPORTED_SDK = 24;
    public static final byte[] V015_S = {48, TarConstants.LF_LINK, TarConstants.LF_DIR, 0};
    public static final byte[] V010_P = {48, TarConstants.LF_LINK, 48, 0};
    public static final byte[] V009_O_MR1 = {48, 48, 57, 0};
    public static final byte[] V005_O = {48, 48, TarConstants.LF_DIR, 0};
    public static final byte[] V001_N = {48, 48, TarConstants.LF_LINK, 0};
    public static final byte[] METADATA_V001_N = {48, 48, TarConstants.LF_LINK, 0};
    public static final byte[] METADATA_V002 = {48, 48, TarConstants.LF_SYMLINK, 0};

    public static String dexKeySeparator(byte[] bArr) {
        return (Arrays.equals(bArr, V001_N) || Arrays.equals(bArr, V005_O)) ? StringUtils.PROCESS_POSTFIX_DELIMITER : "!";
    }
}
