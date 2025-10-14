package org.jfrog.build.extractor.clientConfiguration.util;

import com.google.common.collect.ArrayListMultimap;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Properties;
import java.util.function.Predicate;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.extractor.UrlUtils;
import org.jfrog.build.extractor.clientConfiguration.ClientProperties;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes7.dex */
public abstract class DeploymentUrlUtils {
    public static String getDeploymentUrl(String str, Properties properties) throws UnsupportedEncodingException {
        Map mapFilterMapKeys = CommonUtils.filterMapKeys(properties, new Predicate() { // from class: org.jfrog.build.extractor.clientConfiguration.util.DeploymentUrlUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return DeploymentUrlUtils.lambda$getDeploymentUrl$0(obj);
            }
        });
        StringBuilder sb = new StringBuilder(str);
        for (Map.Entry entry : mapFilterMapKeys.entrySet()) {
            String strRemoveStart = StringUtils.removeStart((String) entry.getKey(), ClientProperties.PROP_DEPLOY_PARAM_PROP_PREFIX);
            sb.append(PropertiesParser.PROPS_SEPARATOR);
            sb.append(URLEncoder.encode(strRemoveStart, "UTF-8"));
            sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

    public static /* synthetic */ boolean lambda$getDeploymentUrl$0(Object obj) {
        return ((String) obj).startsWith(ClientProperties.PROP_DEPLOY_PARAM_PROP_PREFIX);
    }

    public static String encodePath(String str) {
        String str2;
        String strSubstring;
        int iIndexOf = str.indexOf(PropertiesParser.PROPS_SEPARATOR);
        if (iIndexOf != -1) {
            String strSubstring2 = str.substring(0, iIndexOf);
            if (iIndexOf == str.length() - 1) {
                strSubstring = "";
            } else {
                strSubstring = str.substring(iIndexOf + 1);
            }
            str2 = strSubstring;
            str = strSubstring2;
        } else {
            str2 = null;
        }
        String[] strArrSplit = StringUtils.split(str, "/");
        for (int i = 0; i < strArrSplit.length; i++) {
            strArrSplit[i] = UrlUtils.encodeUrlPathPart(strArrSplit[i]);
        }
        String strJoin = StringUtils.join(strArrSplit, "/");
        if (!StringUtils.isNotBlank(str2)) {
            return strJoin;
        }
        return strJoin + PropertiesParser.PROPS_SEPARATOR + str2;
    }

    public static String buildMatrixParamsString(ArrayListMultimap<String, String> arrayListMultimap, boolean z) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        if (arrayListMultimap != null && !arrayListMultimap.isEmpty()) {
            for (String str : arrayListMultimap.keySet()) {
                for (String str2 : arrayListMultimap.get((Object) str)) {
                    if (str2 != null) {
                        for (String str3 : str2.split(",")) {
                            String strTrim = str3.trim();
                            sb.append(PropertiesParser.PROPS_SEPARATOR);
                            sb.append(z ? encode(str) : str);
                            sb.append(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                            if (z) {
                                strTrim = encode(strTrim);
                            }
                            sb.append(strTrim);
                        }
                    }
                }
            }
        }
        return sb.toString();
    }

    public static String encode(String str) throws UnsupportedEncodingException {
        if (str != null) {
            return URLEncoder.encode(str, "UTF-8");
        }
        return null;
    }
}
