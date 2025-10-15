package org.jfrog.filespecs.properties;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URLEncodedUtils;

/* loaded from: classes5.dex */
public class PropertiesParser {
    public static final String PROPS_SEPARATOR = ";";
    public static final String VALUES_SEPARATOR = ",";

    public static List<Property> parsePropertiesStringToList(String str) {
        return (List) parsePropertiesStringToMap(str).entrySet().stream().map(new Function() { // from class: org.jfrog.filespecs.properties.PropertiesParser$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return PropertiesParser.lambda$parsePropertiesStringToList$0((Map.Entry) obj);
            }
        }).collect(Collectors.toList());
    }

    public static /* synthetic */ Property lambda$parsePropertiesStringToList$0(Map.Entry entry) {
        return new Property((String) entry.getKey(), (Set) entry.getValue());
    }

    public static Map<String, Set<String>> parsePropertiesStringToMap(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (StringUtils.isEmpty(str)) {
            return linkedHashMap;
        }
        for (String str2 : str.split(PROPS_SEPARATOR)) {
            if (!StringUtils.isEmpty(str2)) {
                String[] strArrSplit = str2.split(URLEncodedUtils.NAME_VALUE_SEPARATOR, 2);
                if (strArrSplit.length != 2) {
                    throw new IllegalArgumentException(String.format("Invalid property format: %s - format should be key=val1,val2,...", str2));
                }
                String str3 = strArrSplit[0];
                String[] strArrSplit2 = strArrSplit[1].split(",");
                if (!linkedHashMap.containsKey(str3)) {
                    linkedHashMap.put(str3, new LinkedHashSet());
                }
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < strArrSplit2.length; i++) {
                    sb.append(strArrSplit2[i]);
                    if (strArrSplit2[i].endsWith("\\") && i < strArrSplit2.length - 1) {
                        sb.setLength(sb.length() - 1);
                        sb.append(",");
                    } else {
                        ((Set) linkedHashMap.get(str3)).add(sb.toString());
                        sb.setLength(0);
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
