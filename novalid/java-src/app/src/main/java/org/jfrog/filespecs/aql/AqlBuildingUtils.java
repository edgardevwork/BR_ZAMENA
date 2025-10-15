package org.jfrog.filespecs.aql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes5.dex */
public class AqlBuildingUtils {
    public static String buildQuerySuffix(String[] strArr, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        if (strArr != ArrayUtils.EMPTY_STRING_ARRAY) {
            String str4 = (String) StringUtils.defaultIfEmpty(str, "asc");
            sb.append(".sort({\"$");
            sb.append(str4);
            sb.append("\":");
            sb.append("[");
            sb.append(prepareSortFieldsForQuery(strArr));
            sb.append("]})");
        }
        if (StringUtils.isNotBlank(str2)) {
            sb.append(".offset(");
            sb.append(str2);
            sb.append(")");
        }
        if (StringUtils.isNotBlank(str3)) {
            sb.append(".limit(");
            sb.append(str3);
            sb.append(")");
        }
        return sb.toString();
    }

    public static String prepareSortFieldsForQuery(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            sb.append("\"");
            sb.append(strArr[i]);
            sb.append("\"");
            if (i < length - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static String buildIncludeQueryPart(String[] strArr, String str) {
        List<String> queryReturnFields = getQueryReturnFields(strArr);
        if (StringUtils.isBlank(str)) {
            queryReturnFields.add("property");
        }
        return ".include(" + StringUtils.join((Iterable<?>) prepareFieldsForQuery(queryReturnFields), ',') + ")";
    }

    public static List<String> getQueryReturnFields(String[] strArr) {
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "repo", "path", "actual_md5", "actual_sha1", "size", "type", "modified", "created"));
        for (String str : strArr) {
            if (arrayList.indexOf(str) == -1) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void lambda$prepareFieldsForQuery$0(List list, String str) {
    }

    public static List<String> prepareFieldsForQuery(final List<String> list) {
        list.forEach(new Consumer() { // from class: org.jfrog.filespecs.aql.AqlBuildingUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                AqlBuildingUtils.lambda$prepareFieldsForQuery$0(list, (String) obj);
            }
        });
        return list;
    }

    public static String buildAqlSearchQuery(String str, String[] strArr, String[] strArr2, boolean z, String str2) {
        String strPrepareSearchPattern = prepareSearchPattern(str);
        List<RepoPathFile> listCreateRepoPathFileTriples = PatternParsingUtils.createRepoPathFileTriples(strPrepareSearchPattern, z);
        boolean z2 = StringUtils.countMatches(strPrepareSearchPattern, "/") < 2;
        int size = listCreateRepoPathFileTriples.size();
        String strBuildExcludeQuery = buildExcludeQuery(strArr, strArr2, size == 0 || z, z);
        return String.format("{%s\"$or\":[", buildPropsQuery(str2) + buildNePathQuery(size == 0 || z2) + strBuildExcludeQuery) + handleRepoPathFileTriples(listCreateRepoPathFileTriples, size) + "]}";
    }

    public static String prepareSearchPattern(String str) {
        if (str.endsWith("/")) {
            str = str + "*";
        }
        return str.replaceAll("[()]", "");
    }

    public static String buildExcludeQuery(String[] strArr, String[] strArr2, boolean z, boolean z2) {
        if (ArrayUtils.isEmpty(strArr) && ArrayUtils.isEmpty(strArr2)) {
            return "";
        }
        ArrayList<RepoPathFile> arrayList = new ArrayList();
        int i = 0;
        if (!ArrayUtils.isEmpty(strArr)) {
            int length = strArr.length;
            while (i < length) {
                arrayList.addAll(PatternParsingUtils.createRepoPathFileTriples(prepareSearchPattern(strArr[i]), z2));
                i++;
            }
        } else {
            int length2 = strArr2.length;
            while (i < length2) {
                arrayList.addAll(PatternParsingUtils.createPathFilePairs("", prepareSearchPattern(strArr2[i]), z2));
                i++;
            }
        }
        String str = "";
        for (RepoPathFile repoPathFile : arrayList) {
            String path = repoPathFile.getPath();
            if (!z && path.equals(".")) {
                path = "*";
            }
            str = str + String.format("\"$or\":[{%s\"path\":{\"$nmatch\":\"%s\"},\"name\":{\"$nmatch\":\"%s\"}}],", StringUtils.isNotEmpty(repoPathFile.getRepo()) ? String.format("\"repo\":{\"$nmatch\":\"%s\"},", repoPathFile.getRepo()) : "", path, repoPathFile.getFile());
        }
        return str;
    }

    public static String buildNePathQuery(boolean z) {
        return z ? "" : "\"path\":{\"$ne\":\".\"},";
    }

    public static String buildPropsQuery(String str) {
        if (str == null || str.equals("")) {
            return "";
        }
        String[] strArrSplit = str.split(PropertiesParser.PROPS_SEPARATOR);
        StringBuilder sb = new StringBuilder();
        for (String str2 : strArrSplit) {
            String[] strArrSplit2 = str2.split(URLEncodedUtils.NAME_VALUE_SEPARATOR);
            if (strArrSplit2.length != 2) {
                System.out.print("Invalid props pattern: " + str2);
            }
            String str3 = strArrSplit2[0];
            String str4 = strArrSplit2[1];
            sb.append("\"@");
            sb.append(str3);
            sb.append("\": {\"$match\" : \"");
            sb.append(str4);
            sb.append("\"},");
        }
        return sb.toString();
    }

    public static String handleRepoPathFileTriples(List<RepoPathFile> list, int i) {
        String str = "";
        int i2 = 0;
        while (i2 < i) {
            str = str + buildInnerQuery(list.get(i2));
            i2++;
            if (i2 < i) {
                str = str + ",";
            }
        }
        return str;
    }

    public static String buildInnerQuery(RepoPathFile repoPathFile) {
        return String.format("{\"$and\":[{\"repo\":%s,\"path\":%s,\"name\":%s}]}", getAqlValue(repoPathFile.getRepo()), getAqlValue(repoPathFile.getPath()), getAqlValue(repoPathFile.getFile()));
    }

    public static String getAqlValue(String str) {
        String str2;
        if (str.contains("*")) {
            str2 = "{\"$match\":\"%s\"}";
        } else {
            str2 = "\"%s\"";
        }
        return String.format(str2, str);
    }
}
