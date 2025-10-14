package androidx.core.net;

import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Preconditions;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;

/* loaded from: classes4.dex */
public final class MailTo {
    public static final String BCC = "bcc";
    public static final String BODY = "body";

    /* renamed from: CC */
    public static final String f250CC = "cc";
    public static final String MAILTO = "mailto";
    public static final String MAILTO_SCHEME = "mailto:";
    public static final String SUBJECT = "subject";

    /* renamed from: TO */
    public static final String f251TO = "to";
    public HashMap<String, String> mHeaders = new HashMap<>();

    public static boolean isMailTo(@Nullable String str) {
        return str != null && str.startsWith(MAILTO_SCHEME);
    }

    public static boolean isMailTo(@Nullable Uri uri) {
        return uri != null && MAILTO.equals(uri.getScheme());
    }

    @NonNull
    public static MailTo parse(@NonNull String str) throws ParseException {
        String strDecode;
        String strSubstring;
        Preconditions.checkNotNull(str);
        if (!isMailTo(str)) {
            throw new ParseException("Not a mailto scheme");
        }
        int iIndexOf = str.indexOf(35);
        if (iIndexOf != -1) {
            str = str.substring(0, iIndexOf);
        }
        int iIndexOf2 = str.indexOf(63);
        if (iIndexOf2 == -1) {
            strDecode = Uri.decode(str.substring(7));
            strSubstring = null;
        } else {
            strDecode = Uri.decode(str.substring(7, iIndexOf2));
            strSubstring = str.substring(iIndexOf2 + 1);
        }
        MailTo mailTo = new MailTo();
        if (strSubstring != null) {
            for (String str2 : strSubstring.split("&")) {
                String[] strArrSplit = str2.split(URLEncodedUtils.NAME_VALUE_SEPARATOR, 2);
                if (strArrSplit.length != 0) {
                    mailTo.mHeaders.put(Uri.decode(strArrSplit[0]).toLowerCase(Locale.ROOT), strArrSplit.length > 1 ? Uri.decode(strArrSplit[1]) : null);
                }
            }
        }
        String to = mailTo.getTo();
        if (to != null) {
            strDecode = strDecode + ", " + to;
        }
        mailTo.mHeaders.put("to", strDecode);
        return mailTo;
    }

    @NonNull
    public static MailTo parse(@NonNull Uri uri) throws ParseException {
        return parse(uri.toString());
    }

    @Nullable
    public String getTo() {
        return this.mHeaders.get("to");
    }

    @Nullable
    public String getCc() {
        return this.mHeaders.get("cc");
    }

    @Nullable
    public String getBcc() {
        return this.mHeaders.get("bcc");
    }

    @Nullable
    public String getSubject() {
        return this.mHeaders.get(SUBJECT);
    }

    @Nullable
    public String getBody() {
        return this.mHeaders.get("body");
    }

    @Nullable
    public Map<String, String> getHeaders() {
        return this.mHeaders;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder(MAILTO_SCHEME);
        sb.append('?');
        for (Map.Entry<String, String> entry : this.mHeaders.entrySet()) {
            sb.append(Uri.encode(entry.getKey()));
            sb.append('=');
            sb.append(Uri.encode(entry.getValue()));
            sb.append('&');
        }
        return sb.toString();
    }
}
