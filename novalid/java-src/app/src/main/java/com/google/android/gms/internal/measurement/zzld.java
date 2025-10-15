package com.google.android.gms.internal.measurement;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.blackhub.bronline.launcher.LauncherConstants;
import com.google.android.gms.internal.measurement.zzjt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.lang3.StringUtils;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes4.dex */
final class zzld {
    private static final char[] zza;

    public static String zza(zzlc zzlcVar, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zza(zzlcVar, sb, 0);
        return sb.toString();
    }

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    private static void zza(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = zza;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    public static void zza(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zza(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zza(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zza(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char cCharAt = str.charAt(i2);
                if (Character.isUpperCase(cCharAt)) {
                    sb2.append(LauncherConstants.UNDERSCORE_STRING);
                }
                sb2.append(Character.toLowerCase(cCharAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(zzmg.zza(zzik.zza((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzik) {
            sb.append(": \"");
            sb.append(zzmg.zza((zzik) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzjt) {
            sb.append(" {");
            zza((zzjt) obj, sb, i + 2);
            sb.append(StringUtils.f9903LF);
            zza(i, sb);
            sb.append(WebvttCssParser.RULE_END);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i3 = i + 2;
            zza(sb, i3, "key", entry.getKey());
            zza(sb, i3, "value", entry.getValue());
            sb.append(StringUtils.f9903LF);
            zza(i, sb);
            sb.append(WebvttCssParser.RULE_END);
            return;
        }
        sb.append(": ");
        sb.append(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zza(zzlc zzlcVar, StringBuilder sb, int i) throws SecurityException {
        int i2;
        int i3;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzlcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zza(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzjt.zza(method2, zzlcVar, new Object[0]));
                i2 = 3;
            } else {
                if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                    i3 = 3;
                    zza(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzjt.zza(method, zzlcVar, new Object[0]));
                } else {
                    i3 = 3;
                    if (hashSet.contains("set" + strSubstring)) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                Method method4 = (Method) entry.getValue();
                                Method method5 = (Method) map.get("has" + strSubstring);
                                if (method4 != null) {
                                    Object objZza = zzjt.zza(method4, zzlcVar, new Object[0]);
                                    if (method5 == null) {
                                        zBooleanValue = true;
                                        if (objZza instanceof Boolean) {
                                            zEquals = !((Boolean) objZza).booleanValue();
                                        } else if (objZza instanceof Integer) {
                                            if (((Integer) objZza).intValue() == 0) {
                                            }
                                        } else if (objZza instanceof Float) {
                                            if (Float.floatToRawIntBits(((Float) objZza).floatValue()) == 0) {
                                            }
                                        } else if (objZza instanceof Double) {
                                            if (Double.doubleToRawLongBits(((Double) objZza).doubleValue()) == 0) {
                                            }
                                        } else if (objZza instanceof String) {
                                            zEquals = objZza.equals("");
                                        } else if (objZza instanceof zzik) {
                                            zEquals = objZza.equals(zzik.zza);
                                        } else if (!(objZza instanceof zzlc) ? !(objZza instanceof Enum) || ((Enum) objZza).ordinal() != 0 : objZza != ((zzlc) objZza).zzck()) {
                                        }
                                        if (zEquals) {
                                            zBooleanValue = false;
                                        }
                                    } else {
                                        zBooleanValue = ((Boolean) zzjt.zza(method5, zzlcVar, new Object[0])).booleanValue();
                                    }
                                    if (zBooleanValue) {
                                        zza(sb, i, strSubstring, objZza);
                                    }
                                }
                            }
                        }
                    }
                }
                i2 = i3;
            }
        }
        if (zzlcVar instanceof zzjt.zzd) {
            Iterator<Map.Entry<T, Object>> itZzd = ((zzjt.zzd) zzlcVar).zzc.zzd();
            if (itZzd.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzmj zzmjVar = ((zzjt) zzlcVar).zzb;
        if (zzmjVar != null) {
            zzmjVar.zza(sb, i);
        }
    }
}
