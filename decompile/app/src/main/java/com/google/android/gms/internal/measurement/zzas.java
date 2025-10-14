package com.google.android.gms.internal.measurement;

import androidx.media3.datasource.cache.CacheFileMetadataIndex;
import com.fasterxml.jackson.core.base.ParserMinimalBase;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes7.dex */
public final class zzas implements zzaq, Iterable<zzaq> {
    private final String zza;

    public final int hashCode() {
        return this.zza.hashCode();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:328:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x00cb A[PHI: r6 r7 r14 r15
  0x00cb: PHI (r6v31 java.lang.String) = 
  (r6v4 java.lang.String)
  (r6v5 java.lang.String)
  (r6v6 java.lang.String)
  (r6v7 java.lang.String)
  (r6v32 java.lang.String)
 binds: [B:396:0x019c, B:392:0x018a, B:388:0x0178, B:384:0x0166, B:328:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r7v13 java.lang.String) = 
  (r7v1 java.lang.String)
  (r7v2 java.lang.String)
  (r7v3 java.lang.String)
  (r7v4 java.lang.String)
  (r7v14 java.lang.String)
 binds: [B:396:0x019c, B:392:0x018a, B:388:0x0178, B:384:0x0166, B:328:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r14v10 java.lang.String) = 
  (r14v1 java.lang.String)
  (r14v2 java.lang.String)
  (r14v3 java.lang.String)
  (r14v4 java.lang.String)
  (r14v11 java.lang.String)
 binds: [B:396:0x019c, B:392:0x018a, B:388:0x0178, B:384:0x0166, B:328:0x00c3] A[DONT_GENERATE, DONT_INLINE]
  0x00cb: PHI (r15v7 java.lang.String) = 
  (r15v1 java.lang.String)
  (r15v2 java.lang.String)
  (r15v3 java.lang.String)
  (r15v4 java.lang.String)
  (r15v8 java.lang.String)
 binds: [B:396:0x019c, B:392:0x018a, B:388:0x0178, B:384:0x0166, B:328:0x00c3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:485:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:495:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x04bb  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0534  */
    /* JADX WARN: Removed duplicated region for block: B:515:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:525:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:527:0x05af  */
    /* JADX WARN: Removed duplicated region for block: B:536:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x062e  */
    /* JADX WARN: Removed duplicated region for block: B:551:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:553:0x064b  */
    @Override // com.google.android.gms.internal.measurement.zzaq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzaq zza(String str, zzh zzhVar, List<zzaq> list) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        char c;
        int i;
        String strZzf;
        String strZzf2;
        double dMin;
        double dMin2;
        int i2;
        int length;
        int i3;
        zzh zzhVar2;
        String strZzf3;
        if (!"charAt".equals(str) && !"concat".equals(str) && !"hasOwnProperty".equals(str) && !"indexOf".equals(str) && !"lastIndexOf".equals(str) && !FeatureParser.ImportHandler.MATCH.equals(str) && !"replace".equals(str) && !FirebaseAnalytics.Event.SEARCH.equals(str) && !"slice".equals(str) && !"split".equals(str) && !"substring".equals(str) && !"toLowerCase".equals(str) && !"toLocaleLowerCase".equals(str) && !"toString".equals(str) && !"toUpperCase".equals(str)) {
            str2 = "toLocaleUpperCase";
            if (!str2.equals(str)) {
                str3 = "hasOwnProperty";
                str4 = "trim";
                if (!str4.equals(str)) {
                    throw new IllegalArgumentException(String.format("%s is not a String function", str));
                }
            }
            str.hashCode();
            switch (str.hashCode()) {
                case -1789698943:
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    if (str.equals(str7)) {
                        c = 0;
                        break;
                    } else {
                        c = 65535;
                        break;
                    }
                case -1776922004:
                    str5 = "charAt";
                    str6 = "toString";
                    str8 = "toLocaleLowerCase";
                    str7 = str3;
                    if (str.equals(str6)) {
                        c = 1;
                        break;
                    }
                    break;
                case -1464939364:
                    str5 = "charAt";
                    str8 = "toLocaleLowerCase";
                    str6 = "toString";
                    str7 = str3;
                    if (str.equals(str8)) {
                        c = 2;
                        break;
                    }
                    break;
                case -1361633751:
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    if (str.equals(str5)) {
                        c = 3;
                        break;
                    }
                    break;
                case -1354795244:
                    if (str.equals("concat")) {
                        c = 4;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case -1137582698:
                    if (str.equals("toLowerCase")) {
                        c = 5;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case -906336856:
                    if (str.equals(FirebaseAnalytics.Event.SEARCH)) {
                        c = 6;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case -726908483:
                    if (str.equals(str2)) {
                        c = 7;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case -467511597:
                    if (str.equals("lastIndexOf")) {
                        c = '\b';
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case -399551817:
                    if (str.equals("toUpperCase")) {
                        c = '\t';
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case 3568674:
                    if (str.equals(str4)) {
                        c = '\n';
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case 103668165:
                    if (str.equals(FeatureParser.ImportHandler.MATCH)) {
                        c = 11;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case 109526418:
                    if (str.equals("slice")) {
                        c = '\f';
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case 109648666:
                    if (str.equals("split")) {
                        c = '\r';
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case 530542161:
                    if (str.equals("substring")) {
                        c = 14;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case 1094496948:
                    if (str.equals("replace")) {
                        c = 15;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                case 1943291465:
                    if (str.equals("indexOf")) {
                        c = 16;
                        str5 = "charAt";
                        str6 = "toString";
                        str7 = str3;
                        str8 = "toLocaleLowerCase";
                        break;
                    }
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
                default:
                    str5 = "charAt";
                    str6 = "toString";
                    str7 = str3;
                    str8 = "toLocaleLowerCase";
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    zzg.zza(str7, 1, list);
                    String str9 = this.zza;
                    zzaq zzaqVarZza = zzhVar.zza(list.get(0));
                    if (CacheFileMetadataIndex.COLUMN_LENGTH.equals(zzaqVarZza.zzf())) {
                        return zzaq.zzh;
                    }
                    double dDoubleValue = zzaqVarZza.zze().doubleValue();
                    if (dDoubleValue == Math.floor(dDoubleValue) && (i = (int) dDoubleValue) >= 0 && i < str9.length()) {
                        return zzaq.zzh;
                    }
                    return zzaq.zzi;
                case 1:
                    zzg.zza(str6, 0, list);
                    return this;
                case 2:
                    zzg.zza(str8, 0, list);
                    return new zzas(this.zza.toLowerCase());
                case 3:
                    zzg.zzc(str5, 1, list);
                    int iZza = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                    String str10 = this.zza;
                    if (iZza < 0 || iZza >= str10.length()) {
                        return zzaq.zzj;
                    }
                    return new zzas(String.valueOf(str10.charAt(iZza)));
                case 4:
                    if (list.isEmpty()) {
                        return this;
                    }
                    StringBuilder sb = new StringBuilder(this.zza);
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        sb.append(zzhVar.zza(list.get(i4)).zzf());
                    }
                    return new zzas(sb.toString());
                case 5:
                    zzg.zza("toLowerCase", 0, list);
                    return new zzas(this.zza.toLowerCase(Locale.ENGLISH));
                case 6:
                    zzg.zzc(FirebaseAnalytics.Event.SEARCH, 1, list);
                    if (!list.isEmpty()) {
                        strZzf = zzhVar.zza(list.get(0)).zzf();
                    } else {
                        strZzf = zzaq.zzc.zzf();
                    }
                    if (Pattern.compile(strZzf).matcher(this.zza).find()) {
                        return new zzai(Double.valueOf(r0.start()));
                    }
                    return new zzai(Double.valueOf(-1.0d));
                case 7:
                    zzg.zza(str2, 0, list);
                    return new zzas(this.zza.toUpperCase());
                case '\b':
                    zzg.zzc("lastIndexOf", 2, list);
                    String str11 = this.zza;
                    if (list.size() <= 0) {
                        strZzf2 = zzaq.zzc.zzf();
                    } else {
                        strZzf2 = zzhVar.zza(list.get(0)).zzf();
                    }
                    return new zzai(Double.valueOf(str11.lastIndexOf(strZzf2, (int) (Double.isNaN(list.size() < 2 ? Double.NaN : zzhVar.zza(list.get(1)).zze().doubleValue()) ? Double.POSITIVE_INFINITY : zzg.zza(r4)))));
                case '\t':
                    zzg.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.toUpperCase(Locale.ENGLISH));
                case '\n':
                    zzg.zza("toUpperCase", 0, list);
                    return new zzas(this.zza.trim());
                case 11:
                    zzg.zzc(FeatureParser.ImportHandler.MATCH, 1, list);
                    Matcher matcher = Pattern.compile(list.size() <= 0 ? "" : zzhVar.zza(list.get(0)).zzf()).matcher(this.zza);
                    if (matcher.find()) {
                        return new zzaf(new zzas(matcher.group()));
                    }
                    return zzaq.zzd;
                case '\f':
                    zzg.zzc("slice", 2, list);
                    String str12 = this.zza;
                    double dZza = zzg.zza(!list.isEmpty() ? zzhVar.zza(list.get(0)).zze().doubleValue() : 0.0d);
                    if (dZza < 0.0d) {
                        dMin = Math.max(str12.length() + dZza, 0.0d);
                    } else {
                        dMin = Math.min(dZza, str12.length());
                    }
                    int i5 = (int) dMin;
                    double dZza2 = zzg.zza(list.size() > 1 ? zzhVar.zza(list.get(1)).zze().doubleValue() : str12.length());
                    if (dZza2 < 0.0d) {
                        dMin2 = Math.max(str12.length() + dZza2, 0.0d);
                    } else {
                        dMin2 = Math.min(dZza2, str12.length());
                    }
                    return new zzas(str12.substring(i5, Math.max(0, ((int) dMin2) - i5) + i5));
                case '\r':
                    zzg.zzc("split", 2, list);
                    String str13 = this.zza;
                    if (str13.length() == 0) {
                        return new zzaf(this);
                    }
                    ArrayList arrayList = new ArrayList();
                    if (list.isEmpty()) {
                        arrayList.add(this);
                    } else {
                        String strZzf4 = zzhVar.zza(list.get(0)).zzf();
                        long jZzc = list.size() > 1 ? zzg.zzc(zzhVar.zza(list.get(1)).zze().doubleValue()) : ParserMinimalBase.MAX_INT_L;
                        if (jZzc == 0) {
                            return new zzaf();
                        }
                        String[] strArrSplit = str13.split(Pattern.quote(strZzf4), ((int) jZzc) + 1);
                        int length2 = strArrSplit.length;
                        if (!strZzf4.isEmpty() || strArrSplit.length <= 0) {
                            i2 = 0;
                        } else {
                            boolean zIsEmpty = strArrSplit[0].isEmpty();
                            i2 = zIsEmpty;
                            if (strArrSplit[strArrSplit.length - 1].isEmpty()) {
                                length2 = strArrSplit.length - 1;
                                i2 = zIsEmpty;
                            }
                        }
                        if (strArrSplit.length > jZzc) {
                            length2--;
                        }
                        while (i2 < length2) {
                            arrayList.add(new zzas(strArrSplit[i2]));
                            i2++;
                        }
                    }
                    return new zzaf(arrayList);
                case 14:
                    zzg.zzc("substring", 2, list);
                    String str14 = this.zza;
                    int iZza2 = !list.isEmpty() ? (int) zzg.zza(zzhVar.zza(list.get(0)).zze().doubleValue()) : 0;
                    if (list.size() > 1) {
                        length = (int) zzg.zza(zzhVar.zza(list.get(1)).zze().doubleValue());
                    } else {
                        length = str14.length();
                    }
                    int iMin = Math.min(Math.max(iZza2, 0), str14.length());
                    int iMin2 = Math.min(Math.max(length, 0), str14.length());
                    return new zzas(str14.substring(Math.min(iMin, iMin2), Math.max(iMin, iMin2)));
                case 15:
                    zzg.zzc("replace", 2, list);
                    zzaq zzaqVarZza2 = zzaq.zzc;
                    String strZzf5 = zzaqVarZza2.zzf();
                    if (!list.isEmpty()) {
                        strZzf5 = zzhVar.zza(list.get(0)).zzf();
                        if (list.size() > 1) {
                            zzaqVarZza2 = zzhVar.zza(list.get(1));
                        }
                    }
                    String str15 = this.zza;
                    int iIndexOf = str15.indexOf(strZzf5);
                    if (iIndexOf < 0) {
                        return this;
                    }
                    if (zzaqVarZza2 instanceof zzal) {
                        i3 = 0;
                        zzaqVarZza2 = ((zzal) zzaqVarZza2).zza(zzhVar, Arrays.asList(new zzas(strZzf5), new zzai(Double.valueOf(iIndexOf)), this));
                    } else {
                        i3 = 0;
                    }
                    return new zzas(str15.substring(i3, iIndexOf) + zzaqVarZza2.zzf() + str15.substring(iIndexOf + strZzf5.length()));
                case 16:
                    zzg.zzc("indexOf", 2, list);
                    String str16 = this.zza;
                    if (list.size() <= 0) {
                        strZzf3 = zzaq.zzc.zzf();
                        zzhVar2 = zzhVar;
                    } else {
                        zzhVar2 = zzhVar;
                        strZzf3 = zzhVar2.zza(list.get(0)).zzf();
                    }
                    return new zzai(Double.valueOf(str16.indexOf(strZzf3, (int) zzg.zza(list.size() < 2 ? 0.0d : zzhVar2.zza(list.get(1)).zze().doubleValue()))));
                default:
                    throw new IllegalArgumentException("Command not supported");
            }
        }
        str2 = "toLocaleUpperCase";
        str3 = "hasOwnProperty";
        str4 = "trim";
        str.hashCode();
        switch (str.hashCode()) {
            case -1789698943:
                break;
            case -1776922004:
                break;
            case -1464939364:
                break;
            case -1361633751:
                break;
            case -1354795244:
                break;
            case -1137582698:
                break;
            case -906336856:
                break;
            case -726908483:
                break;
            case -467511597:
                break;
            case -399551817:
                break;
            case 3568674:
                break;
            case 103668165:
                break;
            case 109526418:
                break;
            case 109648666:
                break;
            case 530542161:
                break;
            case 1094496948:
                break;
            case 1943291465:
                break;
        }
        switch (c) {
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final zzaq zzc() {
        return new zzas(this.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Boolean zzd() {
        return Boolean.valueOf(!this.zza.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Double zze() {
        if (this.zza.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(this.zza);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final String zzf() {
        return this.zza;
    }

    public final String toString() {
        return "\"" + this.zza + "\"";
    }

    @Override // com.google.android.gms.internal.measurement.zzaq
    public final Iterator<zzaq> zzh() {
        return new zzav(this);
    }

    @Override // java.lang.Iterable
    public final Iterator<zzaq> iterator() {
        return new zzau(this);
    }

    public zzas(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.zza = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzas) {
            return this.zza.equals(((zzas) obj).zza);
        }
        return false;
    }
}
