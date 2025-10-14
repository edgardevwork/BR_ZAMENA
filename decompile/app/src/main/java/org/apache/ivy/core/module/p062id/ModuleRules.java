package org.apache.ivy.core.module.p062id;

import com.blackhub.bronline.game.gui.donate.utils.DonateAllKeys;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.apache.ivy.ant.IvyCleanCache;
import org.apache.ivy.osgi.p063p2.P2ArtifactParser;
import org.apache.ivy.plugins.matcher.MapMatcher;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.filter.Filter;
import org.apache.ivy.util.filter.NoFilter;

/* loaded from: classes7.dex */
public class ModuleRules<T> {
    public MatcherLookup matcherLookup;
    public Map<MapMatcher, T> rules;

    public ModuleRules() {
        this.rules = new LinkedHashMap();
        this.matcherLookup = new MatcherLookup();
    }

    public ModuleRules(Map<MapMatcher, T> map) {
        this.rules = new LinkedHashMap();
        this.matcherLookup = new MatcherLookup();
        this.rules = new LinkedHashMap(map);
        Iterator<MapMatcher> it = map.keySet().iterator();
        while (it.hasNext()) {
            this.matcherLookup.add(it.next());
        }
    }

    public void defineRule(MapMatcher mapMatcher, T t) {
        Checks.checkNotNull(mapMatcher, "condition");
        Checks.checkNotNull(t, P2ArtifactParser.RuleHandler.RULE);
        this.rules.put(mapMatcher, t);
        this.matcherLookup.add(mapMatcher);
    }

    public T getRule(ModuleId moduleId) {
        return getRule(moduleId, NoFilter.instance());
    }

    public List<T> getRules(ModuleId moduleId) {
        return getRules(moduleId.getAttributes(), NoFilter.instance());
    }

    public T getRule(ModuleRevisionId moduleRevisionId) {
        return getRule(moduleRevisionId, NoFilter.instance());
    }

    public T getRule(ModuleId moduleId, Filter<T> filter) {
        Checks.checkNotNull(moduleId, DonateAllKeys.KEY_MID_METRICA_INTERNAL_ID);
        return getRule(moduleId.getAttributes(), filter);
    }

    public T getRule(ModuleRevisionId moduleRevisionId, Filter<T> filter) {
        Checks.checkNotNull(moduleRevisionId, "mrid");
        Checks.checkNotNull(filter, "filter");
        return getRule(moduleRevisionId.getAttributes(), filter);
    }

    public final T getRule(Map<String, String> map, Filter<T> filter) {
        Iterator<MapMatcher> it = this.matcherLookup.get(map).iterator();
        while (it.hasNext()) {
            T t = this.rules.get(it.next());
            if (filter.accept(t)) {
                return t;
            }
        }
        return null;
    }

    public List<T> getRules(ModuleRevisionId moduleRevisionId, Filter<T> filter) {
        Checks.checkNotNull(moduleRevisionId, "mrid");
        Checks.checkNotNull(filter, "filter");
        return getRules(moduleRevisionId.getAttributes(), filter);
    }

    public final List<T> getRules(Map<String, String> map, Filter<T> filter) {
        ArrayList arrayList = new ArrayList();
        Iterator<MapMatcher> it = this.matcherLookup.get(map).iterator();
        while (it.hasNext()) {
            T t = this.rules.get(it.next());
            if (filter.accept(t)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    public void dump(String str) {
        if (this.rules.isEmpty()) {
            Message.debug(str + IvyCleanCache.NONE);
            return;
        }
        for (Map.Entry<MapMatcher, T> entry : this.rules.entrySet()) {
            Message.debug(str + entry.getKey() + " -> " + entry.getValue());
        }
    }

    public Map<MapMatcher, T> getAllRules() {
        return Collections.unmodifiableMap(this.rules);
    }

    public ModuleRules<T> clone() {
        return new ModuleRules<>(this.rules);
    }
}
