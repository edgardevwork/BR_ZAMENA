package org.jfrog.build.extractor;

import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.codec.net.URLCodec;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.util.URI;

/* loaded from: classes8.dex */
public class UrlUtils {
    public static final String BUILD_PROJECT_PARAM = "?project=";
    public static final Pattern CREDENTIALS_IN_URL_REGEX = Pattern.compile("(http|https|git)://.+@");

    public static String removeCredentialsFromUrl(String str) {
        Matcher matcher = CREDENTIALS_IN_URL_REGEX.matcher(str);
        if (!matcher.find()) {
            return str;
        }
        return StringUtils.replace(str, matcher.group(), matcher.group(1) + "://");
    }

    public static void appendParamsToUrl(Map<String, String> map, StringBuilder sb) {
        if (map == null || map.isEmpty()) {
            return;
        }
        sb.append("params=");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        String strEncodeUrl = encodeUrl("|");
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            sb.append(encodeUrl(next.getKey()));
            String value = next.getValue();
            if (StringUtils.isNotBlank(value)) {
                sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                sb.append(encodeUrl(value));
            }
            if (it.hasNext()) {
                sb.append(strEncodeUrl);
            }
        }
    }

    public static String getProjectQueryParam(String str, String str2) {
        if (StringUtils.isEmpty(str)) {
            return "";
        }
        return str2 + encodeUrl(str);
    }

    public static String getProjectQueryParam(String str) {
        return getProjectQueryParam(str, BUILD_PROJECT_PARAM);
    }

    public static String encodeUrlPathPart(String str) {
        return org.apache.commons.codec.binary.StringUtils.newStringUsAscii(URLCodec.encodeUrl(null, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str))).replaceAll("\\+", "%20");
    }

    public static String encodeUrl(String str) {
        return org.apache.commons.codec.binary.StringUtils.newStringUsAscii(URLCodec.encodeUrl(URI.allowed_query, org.apache.commons.codec.binary.StringUtils.getBytesUtf8(str)));
    }
}
