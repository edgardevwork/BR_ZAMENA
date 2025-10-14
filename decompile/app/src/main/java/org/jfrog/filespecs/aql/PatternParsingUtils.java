package org.jfrog.filespecs.aql;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes5.dex */
public class PatternParsingUtils {
    public static boolean isSlashPrecedeAsterisk(int i, int i2) {
        return i2 < i && i2 >= 0;
    }

    public static List<RepoPathFile> createRepoPathFileTriples(String str, boolean z) {
        int iIndexOf = str.indexOf("/");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '*') {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (arrayList.isEmpty() || isSlashPrecedeAsterisk(((Integer) arrayList.get(0)).intValue(), iIndexOf)) {
            if (iIndexOf < 0) {
                return createPathFilePairs(str, "*", z);
            }
            return createPathFilePairs(str.substring(0, iIndexOf), str.substring(iIndexOf + 1), z);
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            if (isSlashPrecedeAsterisk(iIntValue, iIndexOf)) {
                break;
            }
            i2 = iIntValue + 1;
            String strSubstring = str.substring(0, i2);
            String strSubstring2 = str.substring(iIntValue);
            int iCountMatches = StringUtils.countMatches(strSubstring2, "/");
            int iCountMatches2 = StringUtils.countMatches(strSubstring2, "*");
            if (iCountMatches > 1 || iCountMatches2 > 1) {
                strSubstring2 = strSubstring2.replaceFirst("^\\*/", "");
                if (!strSubstring2.startsWith("*")) {
                    strSubstring2 = "*" + strSubstring2;
                }
            }
            arrayList2.addAll(createPathFilePairs(strSubstring, strSubstring2, z));
        }
        if (i2 < iIndexOf) {
            arrayList2.addAll(createPathFilePairs(str.substring(0, iIndexOf), str.substring(iIndexOf + 1), z));
        } else if (iIndexOf < 0 && !StringUtils.endsWith(str, "*")) {
            arrayList2.addAll(createPathFilePairs(str, "*", z));
        }
        return arrayList2;
    }

    public static List<RepoPathFile> createPathFilePairs(String str, String str2, boolean z) {
        String str3;
        ArrayList arrayList = new ArrayList();
        if (str2.equals("*")) {
            arrayList.add(new RepoPathFile(str, getDefaultPath(z), "*"));
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        int iLastIndexOf = str2.lastIndexOf("/");
        if (iLastIndexOf < 0) {
            str3 = "";
            if (!z || !str2.startsWith("*")) {
                arrayList2.add(new RepoPathFile(str, ".", str2));
            }
        } else {
            String strSubstring = str2.substring(0, iLastIndexOf);
            str2 = str2.substring(iLastIndexOf + 1);
            arrayList2.add(new RepoPathFile(str, strSubstring, str2));
            str3 = strSubstring;
        }
        if (!z) {
            return arrayList2;
        }
        if (str2.equals("*")) {
            arrayList2.add(new RepoPathFile(str, str3 + "/*", "*"));
            return arrayList2;
        }
        populateTriplesWithRepoPathFile(arrayList2, str, str3, str2);
        return arrayList2;
    }

    public static String getDefaultPath(boolean z) {
        if (z) {
            return "*";
        }
        return ".";
    }

    public static void populateTriplesWithRepoPathFile(List<RepoPathFile> list, String str, String str2, String str3) {
        String[] strArrSplit = str3.split("\\*", -1);
        for (int i = 0; i < strArrSplit.length - 1; i++) {
            int i2 = 0;
            String str4 = "";
            while (true) {
                if (i2 >= strArrSplit.length) {
                    break;
                }
                String str5 = strArrSplit[i2];
                if (i2 > 0) {
                    str4 = str4 + "*";
                }
                str4 = i2 == i ? str4 + strArrSplit[i] + "*/" : str4 + str5;
                i2++;
            }
            String[] strArrSplit2 = str4.split("/", -1);
            String str6 = strArrSplit2[0];
            String str7 = strArrSplit2[1];
            String str8 = str7.equals("") ? "*" : str7;
            if (!str2.equals("") && !str2.endsWith("/")) {
                str2 = str2 + "/";
            }
            list.add(new RepoPathFile(str, str2 + str6, str8));
        }
    }
}
