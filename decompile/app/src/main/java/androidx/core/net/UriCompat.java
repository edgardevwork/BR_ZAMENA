package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.apache.http.HttpHost;

/* loaded from: classes4.dex */
public final class UriCompat {
    @NonNull
    public static String toSafeString(@NonNull Uri uri) {
        String scheme = uri.getScheme();
        String schemeSpecificPart = uri.getSchemeSpecificPart();
        if (scheme != null) {
            if (scheme.equalsIgnoreCase("tel") || scheme.equalsIgnoreCase("sip") || scheme.equalsIgnoreCase("sms") || scheme.equalsIgnoreCase("smsto") || scheme.equalsIgnoreCase(MailTo.MAILTO) || scheme.equalsIgnoreCase("nfc")) {
                StringBuilder sb = new StringBuilder(64);
                sb.append(scheme);
                sb.append(':');
                if (schemeSpecificPart != null) {
                    for (int i = 0; i < schemeSpecificPart.length(); i++) {
                        char cCharAt = schemeSpecificPart.charAt(i);
                        if (cCharAt == '-' || cCharAt == '@' || cCharAt == '.') {
                            sb.append(cCharAt);
                        } else {
                            sb.append('x');
                        }
                    }
                }
                return sb.toString();
            }
            if (scheme.equalsIgnoreCase(HttpHost.DEFAULT_SCHEME_NAME) || scheme.equalsIgnoreCase("https") || scheme.equalsIgnoreCase("ftp") || scheme.equalsIgnoreCase("rtsp")) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("//");
                sb2.append(uri.getHost() != null ? uri.getHost() : "");
                sb2.append(uri.getPort() != -1 ? StringUtils.PROCESS_POSTFIX_DELIMITER + uri.getPort() : "");
                sb2.append("/...");
                schemeSpecificPart = sb2.toString();
            }
        }
        StringBuilder sb3 = new StringBuilder(64);
        if (scheme != null) {
            sb3.append(scheme);
            sb3.append(':');
        }
        if (schemeSpecificPart != null) {
            sb3.append(schemeSpecificPart);
        }
        return sb3.toString();
    }
}
