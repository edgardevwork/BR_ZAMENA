package org.apache.ivy.util.filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes8.dex */
public final class FilterHelper {
    public static final Filter<Artifact> NO_FILTER = NoFilter.instance();

    public static Filter<Artifact> getArtifactTypeFilter(String str) {
        if (str == null || str.trim().equals("*")) {
            return NO_FILTER;
        }
        return getArtifactTypeFilter(str.split(","));
    }

    public static Filter<Artifact> getArtifactTypeFilter(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return NO_FILTER;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            String strTrim = str.trim();
            if ("*".equals(strTrim)) {
                return NO_FILTER;
            }
            arrayList.add(strTrim);
        }
        return new ArtifactTypeFilter(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Collection<T> filter(Collection<T> collection, Filter<T> filter) {
        if (filter == 0) {
            return collection;
        }
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!filter.accept(it.next())) {
                it.remove();
            }
        }
        return arrayList;
    }
}
