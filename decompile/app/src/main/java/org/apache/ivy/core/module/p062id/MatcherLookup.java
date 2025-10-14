package org.apache.ivy.core.module.p062id;

import androidx.media3.extractor.text.webvtt.WebvttCssParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.plugins.matcher.ExactPatternMatcher;
import org.apache.ivy.plugins.matcher.MapMatcher;

/* loaded from: classes7.dex */
public class MatcherLookup {
    public static final String DEFAULT = "{org:default, module:default}";
    public Map<String, List<MapMatcher>> lookup = new HashMap();
    public List<MapMatcher> nonExactMatchers = new ArrayList();

    public void add(MapMatcher mapMatcher) {
        if (!(mapMatcher.getPatternMatcher() instanceof ExactPatternMatcher)) {
            this.nonExactMatchers.add(mapMatcher);
            return;
        }
        String strKey = key(mapMatcher.getAttributes());
        List<MapMatcher> arrayList = this.lookup.get(strKey);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.lookup.put(strKey, arrayList);
        }
        arrayList.add(mapMatcher);
    }

    public List<MapMatcher> get(Map<String, String> map) {
        List<MapMatcher> list;
        ArrayList arrayList = new ArrayList();
        if (!this.nonExactMatchers.isEmpty()) {
            for (MapMatcher mapMatcher : this.nonExactMatchers) {
                if (mapMatcher.matches(map)) {
                    arrayList.add(mapMatcher);
                }
            }
        }
        String strKey = key(map);
        List<MapMatcher> list2 = this.lookup.get(strKey);
        if (list2 != null) {
            for (MapMatcher mapMatcher2 : list2) {
                if (mapMatcher2.matches(map)) {
                    arrayList.add(mapMatcher2);
                }
            }
        }
        if (!DEFAULT.equals(strKey) && (list = this.lookup.get(DEFAULT)) != null) {
            for (MapMatcher mapMatcher3 : list) {
                if (mapMatcher3.matches(map)) {
                    arrayList.add(mapMatcher3);
                }
            }
        }
        return arrayList;
    }

    public final String key(Map<String, String> map) {
        String str = map.get(IvyPatternHelper.ORGANISATION_KEY);
        String str2 = map.get("module");
        if (str == null || "*".equals(str) || str2 == null || "*".equals(str2)) {
            return DEFAULT;
        }
        return "{org:" + str + ", module:" + str2 + WebvttCssParser.RULE_END;
    }
}
