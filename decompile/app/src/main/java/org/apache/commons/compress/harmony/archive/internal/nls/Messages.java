package org.apache.commons.compress.harmony.archive.internal.nls;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Arrays;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.function.IntFunction;

/* loaded from: classes6.dex */
public class Messages {
    public static ResourceBundle bundle;

    public static String getString(String str) {
        ResourceBundle resourceBundle = bundle;
        if (resourceBundle == null) {
            return str;
        }
        try {
            return resourceBundle.getString(str);
        } catch (MissingResourceException unused) {
            return "Missing message: " + str;
        }
    }

    public static String getString(String str, Object obj) {
        return getString(str, new Object[]{obj});
    }

    public static String getString(String str, int i) {
        return getString(str, new Object[]{Integer.toString(i)});
    }

    public static String getString(String str, char c) {
        return getString(str, new Object[]{String.valueOf(c)});
    }

    public static String getString(String str, Object obj, Object obj2) {
        return getString(str, new Object[]{obj, obj2});
    }

    public static String getString(String str, Object[] objArr) {
        ResourceBundle resourceBundle = bundle;
        if (resourceBundle != null) {
            try {
                str = resourceBundle.getString(str);
            } catch (MissingResourceException unused) {
            }
        }
        return format(str, objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String format(String str, final Object[] objArr) {
        int i;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 20));
        int length = objArr.length;
        String[] strArr = new String[length];
        Arrays.setAll(strArr, new IntFunction() { // from class: org.apache.commons.compress.harmony.archive.internal.nls.Messages$$ExternalSyntheticLambda1
            @Override // java.util.function.IntFunction
            public final Object apply(int i2) {
                return Messages.lambda$format$0(objArr, i2);
            }
        });
        int length2 = 0;
        while (true) {
            int iIndexOf = str.indexOf(123, length2);
            if (iIndexOf < 0) {
                break;
            }
            if (iIndexOf != 0) {
                int i2 = iIndexOf - 1;
                if (str.charAt(i2) == '\\') {
                    if (iIndexOf != 1) {
                        sb.append(str.substring(length2, i2));
                    }
                    sb.append('{');
                    i = iIndexOf + 1;
                } else if (iIndexOf > str.length() - 3) {
                    sb.append(str.substring(length2));
                    length2 = str.length();
                } else {
                    int i3 = iIndexOf + 1;
                    byte bDigit = (byte) Character.digit(str.charAt(i3), 10);
                    if (bDigit < 0 || str.charAt(iIndexOf + 2) != '}') {
                        sb.append(str.substring(length2, i3));
                        length2 = i3;
                    } else {
                        sb.append(str.substring(length2, iIndexOf));
                        if (bDigit >= length) {
                            sb.append("<missing argument>");
                        } else {
                            sb.append(strArr[bDigit]);
                        }
                        i = iIndexOf + 3;
                    }
                }
                length2 = i;
            }
        }
        if (length2 < str.length()) {
            sb.append(str.substring(length2));
        }
        return sb.toString();
    }

    public static /* synthetic */ String lambda$format$0(Object[] objArr, int i) {
        return Objects.toString(objArr[i], "<null>");
    }

    public static ResourceBundle setLocale(final Locale locale, final String str) {
        final ClassLoader classLoader = null;
        try {
            return (ResourceBundle) AccessController.doPrivileged(new PrivilegedAction() { // from class: org.apache.commons.compress.harmony.archive.internal.nls.Messages$$ExternalSyntheticLambda0
                @Override // java.security.PrivilegedAction
                public final Object run() {
                    return Messages.lambda$setLocale$1(str, locale, classLoader);
                }
            });
        } catch (MissingResourceException unused) {
            return null;
        }
    }

    public static /* synthetic */ Object lambda$setLocale$1(String str, Locale locale, ClassLoader classLoader) {
        if (classLoader == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return ResourceBundle.getBundle(str, locale, classLoader);
    }

    static {
        try {
            bundle = setLocale(Locale.getDefault(), "org.apache.commons.compress.harmony.archive.internal.nls.messages");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
