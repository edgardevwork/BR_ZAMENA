package org.apache.ivy.core.module.p062id;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.IvyPatternHelper;

/* loaded from: classes7.dex */
public class ModuleId implements Comparable<ModuleId> {
    public static final String ENCODE_SEPARATOR = ":#@#:";
    public Map<String, String> attributes;
    public int hash;
    public String name;
    public String organisation;
    public static final Map<ModuleId, WeakReference<ModuleId>> CACHE = new WeakHashMap();
    public static final Pattern MID_PATTERN = Pattern.compile("([a-zA-Z0-9\\-/\\._+=]*)#([a-zA-Z0-9\\-/\\._+=]+)");

    public static ModuleId newInstance(String str, String str2) {
        return intern(new ModuleId(str, str2));
    }

    public static ModuleId intern(ModuleId moduleId) {
        Map<ModuleId, WeakReference<ModuleId>> map = CACHE;
        synchronized (map) {
            try {
                WeakReference<ModuleId> weakReference = map.get(moduleId);
                ModuleId moduleId2 = weakReference != null ? weakReference.get() : null;
                if (moduleId2 == null) {
                    map.put(moduleId, new WeakReference<>(moduleId));
                } else {
                    moduleId = moduleId2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return moduleId;
    }

    public ModuleId(String str, String str2) {
        HashMap map = new HashMap();
        this.attributes = map;
        if (str2 == null) {
            throw new IllegalArgumentException("null name not allowed");
        }
        this.organisation = str;
        this.name = str2;
        map.put(IvyPatternHelper.ORGANISATION_KEY, str);
        this.attributes.put("module", str2);
    }

    public String getName() {
        return this.name;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ModuleId)) {
            return false;
        }
        ModuleId moduleId = (ModuleId) obj;
        String str = moduleId.organisation;
        if (str == null) {
            if (this.organisation != null || !moduleId.name.equals(this.name)) {
                return false;
            }
        } else if (!str.equals(this.organisation) || !moduleId.name.equals(this.name)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        if (this.hash == 0) {
            this.hash = 31;
            int i = 31 * 13;
            String str = this.organisation;
            int iHashCode = i + (str == null ? 0 : str.hashCode());
            this.hash = iHashCode;
            this.hash = (iHashCode * 13) + this.name.hashCode();
        }
        return this.hash;
    }

    public String toString() {
        return this.organisation + "#" + this.name;
    }

    @Override // java.lang.Comparable
    public int compareTo(ModuleId moduleId) {
        int iCompareTo = this.organisation.compareTo(moduleId.organisation);
        return iCompareTo == 0 ? this.name.compareTo(moduleId.name) : iCompareTo;
    }

    public String encodeToString() {
        return getOrganisation() + ":#@#:" + getName();
    }

    public Map<String, String> getAttributes() {
        return this.attributes;
    }

    public static ModuleId decode(String str) {
        String[] strArrSplit = str.split(":#@#:");
        if (strArrSplit.length != 2) {
            throw new IllegalArgumentException("badly encoded module id: '" + str + "'");
        }
        return new ModuleId(strArrSplit[0], strArrSplit[1]);
    }

    public static ModuleId parse(String str) {
        Pattern pattern = MID_PATTERN;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.matches()) {
            throw new IllegalArgumentException("module text representation do not match expected pattern. given mid='" + str + "' expected form=" + pattern.pattern());
        }
        return newInstance(matcher.group(1), matcher.group(2));
    }
}
