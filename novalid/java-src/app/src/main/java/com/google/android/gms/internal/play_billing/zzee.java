package com.google.android.gms.internal.play_billing;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import com.blackhub.bronline.launcher.LauncherConstants;
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

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzee {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzec zzecVar, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        zzd(zzecVar, sb, 0);
        return sb.toString();
    }

    public static void zzb(StringBuilder sb, int i, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        zzc(i, sb);
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
            sb.append(zzfd.zza(new zzbn(((String) obj).getBytes(zzda.zzb))));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzbq) {
            sb.append(": \"");
            sb.append(zzfd.zza((zzbq) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzcs) {
            sb.append(" {");
            zzd((zzcs) obj, sb, i + 2);
            sb.append(StringUtils.f9903LF);
            zzc(i, sb);
            sb.append(WebvttCssParser.RULE_END);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb, i3, "key", entry.getKey());
        zzb(sb, i3, "value", entry.getValue());
        sb.append(StringUtils.f9903LF);
        zzc(i, sb);
        sb.append(WebvttCssParser.RULE_END);
    }

    private static void zzc(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(zza, 0, i2);
            i -= i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:241:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzd(zzec zzecVar, StringBuilder sb, int i) throws SecurityException {
        int i2;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzecVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i3 = 0;
        while (true) {
            i2 = 3;
            if (i3 >= length) {
                break;
            }
            Method method3 = declaredMethods[i3];
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
            i3++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 4), zzcs.zzp(method2, zzecVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb, i, strSubstring.substring(0, strSubstring.length() - 3), zzcs.zzp(method, zzecVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzp = zzcs.zzp(method4, zzecVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzp instanceof Boolean) {
                            if (((Boolean) objZzp).booleanValue()) {
                                zzb(sb, i, strSubstring, objZzp);
                            }
                        } else if (objZzp instanceof Integer) {
                            if (((Integer) objZzp).intValue() != 0) {
                            }
                        } else if (objZzp instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzp).floatValue()) != 0) {
                            }
                        } else if (!(objZzp instanceof Double)) {
                            if (objZzp instanceof String) {
                                zEquals = objZzp.equals("");
                            } else if (objZzp instanceof zzbq) {
                                zEquals = objZzp.equals(zzbq.zzb);
                            } else if (objZzp instanceof zzec) {
                                if (objZzp != ((zzec) objZzp).zzh()) {
                                }
                            } else if (!(objZzp instanceof Enum) || ((Enum) objZzp).ordinal() != 0) {
                            }
                            if (!zEquals) {
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzp).doubleValue()) != 0) {
                        }
                    } else if (((Boolean) zzcs.zzp(method5, zzecVar, new Object[0])).booleanValue()) {
                    }
                }
            }
            i2 = 3;
        }
        if (zzecVar instanceof zzco) {
            Iterator itZzf = ((zzco) zzecVar).zzb.zzf();
            if (itZzf.hasNext()) {
                throw null;
            }
        }
        zzfg zzfgVar = ((zzcs) zzecVar).zzc;
        if (zzfgVar != null) {
            zzfgVar.zzi(sb, i);
        }
    }
}
