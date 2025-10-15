package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Comparator;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.sa */
/* loaded from: classes7.dex */
public final class C9851sa implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        String str = (String) ((Map.Entry) obj).getValue();
        String str2 = (String) ((Map.Entry) obj2).getValue();
        int utf8BytesLength = StringUtils.getUtf8BytesLength(str);
        int utf8BytesLength2 = StringUtils.getUtf8BytesLength(str2);
        if (utf8BytesLength < utf8BytesLength2) {
            return -1;
        }
        return utf8BytesLength == utf8BytesLength2 ? 0 : 1;
    }
}
