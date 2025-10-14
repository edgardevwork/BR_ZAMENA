package com.samsung.android.sdk.pass.support;

import android.util.Log;
import com.samsung.android.sdk.pass.SpassFingerprint;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class SdkSupporter {
    public static final String CLASSNAME_FINGERPRINT_MANAGER = "com.samsung.android.fingerprint.FingerprintManager";

    public static boolean copyStaticFields(Object obj, Class cls, String str, String str2) throws IllegalAccessException, SecurityException, IllegalArgumentException {
        try {
            Field[] fields = Class.forName(str).getFields();
            HashMap map = new HashMap();
            for (Field field : fields) {
                map.put(field.getName(), field);
            }
            for (Field field2 : cls.getFields()) {
                String name = field2.getName();
                if (str2 == null || name.startsWith(str2)) {
                    Field field3 = (Field) map.get(name);
                    if (field3 != null && field3.getType().equals(field2.getType())) {
                        field2.set(obj, field3.get(null));
                    }
                }
            }
            return true;
        } catch (Exception e) {
            Log.w(SpassFingerprint.TAG, "copyFields: failed - " + e);
            return true;
        }
    }
}
