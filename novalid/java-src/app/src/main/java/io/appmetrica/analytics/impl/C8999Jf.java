package io.appmetrica.analytics.impl;

import android.net.Uri;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import org.apache.http.client.utils.URLEncodedUtils;

/* renamed from: io.appmetrica.analytics.impl.Jf */
/* loaded from: classes8.dex */
public final class C8999Jf {
    /* renamed from: a */
    public static C8967I7 m5310a(String str) {
        HashMap map;
        String strDecode = Uri.decode((String) m5311b(str).get("appmetrica_deep_link"));
        if (TextUtils.isEmpty(strDecode)) {
            map = null;
        } else {
            HashMap mapM5311b = m5311b(strDecode);
            map = new HashMap(mapM5311b.size());
            for (Map.Entry entry : mapM5311b.entrySet()) {
                map.put(Uri.decode((String) entry.getKey()), Uri.decode((String) entry.getValue()));
            }
        }
        return new C8967I7(strDecode, map, str);
    }

    /* renamed from: b */
    public static HashMap m5311b(String str) {
        HashMap map = new HashMap();
        if (str != null) {
            int iLastIndexOf = str.lastIndexOf(63);
            if (iLastIndexOf >= 0) {
                str = str.substring(iLastIndexOf + 1);
            }
            if (str.contains(URLEncodedUtils.NAME_VALUE_SEPARATOR)) {
                for (String str2 : str.split("&")) {
                    int iIndexOf = str2.indexOf(URLEncodedUtils.NAME_VALUE_SEPARATOR);
                    if (iIndexOf >= 0) {
                        map.put(str2.substring(0, iIndexOf), str2.substring(iIndexOf + 1));
                    } else {
                        map.put(str2, "");
                    }
                }
            }
        }
        return map;
    }
}
