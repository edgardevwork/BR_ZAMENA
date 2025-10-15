package org.apache.ivy.core.module.p062id;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.Ivy;
import org.apache.ivy.ant.IvyCleanCache;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.util.extendable.UnmodifiableExtendableItem;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes8.dex */
public class ModuleRevisionId extends UnmodifiableExtendableItem {
    public static final String ENCODE_PREFIX = "+";
    public static final String ENCODE_SEPARATOR = ":#@#:";
    public static final String NULL_ENCODE = "@#:NULL:#@";
    public static final String REV_STRICT_CHARS_PATTERN = "[a-zA-Z0-9\\-/\\._+=,\\[\\]\\{\\}\\(\\):@]";
    public static final String STRICT_CHARS_PATTERN = "[a-zA-Z0-9\\-/\\._+=]";
    public final String branch;
    public int hash;
    public final ModuleId moduleId;
    public final String revision;
    public static final Map<ModuleRevisionId, WeakReference<ModuleRevisionId>> CACHE = new WeakHashMap();
    public static final Pattern MRID_PATTERN = Pattern.compile("([a-zA-Z0-9\\-/\\._+=]*)#([a-zA-Z0-9\\-/\\._+=]+)(?:#([a-zA-Z0-9\\-/\\._+=]+))?;([a-zA-Z0-9\\-/\\._+=,\\[\\]\\{\\}\\(\\):@]+)");
    public static final Pattern NON_CAPTURING_PATTERN = Pattern.compile("(?:[a-zA-Z0-9\\-/\\._+=]*)#(?:[a-zA-Z0-9\\-/\\._+=]+)(?:#(?:[a-zA-Z0-9\\-/\\._+=]+))?;(?:[a-zA-Z0-9\\-/\\._+=,\\[\\]\\{\\}\\(\\):@]+)");

    public static ModuleRevisionId parse(String str) {
        Pattern pattern = MRID_PATTERN;
        Matcher matcher = pattern.matcher(str.trim());
        if (!matcher.matches()) {
            throw new IllegalArgumentException("module revision text representation do not match expected pattern. given mrid='" + str + "' expected form=" + pattern.pattern());
        }
        return newInstance(matcher.group(1), matcher.group(2), matcher.group(3), matcher.group(4));
    }

    public static ModuleRevisionId newInstance(String str, String str2, String str3) {
        return intern(new ModuleRevisionId(ModuleId.newInstance(str, str2), str3));
    }

    public static ModuleRevisionId newInstance(String str, String str2, String str3, Map<String, String> map) {
        return intern(new ModuleRevisionId(ModuleId.newInstance(str, str2), str3, map));
    }

    public static ModuleRevisionId newInstance(String str, String str2, String str3, String str4) {
        return intern(new ModuleRevisionId(ModuleId.newInstance(str, str2), str3, str4));
    }

    public static ModuleRevisionId newInstance(String str, String str2, String str3, String str4, Map<String, String> map) {
        return intern(new ModuleRevisionId(ModuleId.newInstance(str, str2), str3, str4, map));
    }

    public static ModuleRevisionId newInstance(String str, String str2, String str3, String str4, Map<String, String> map, boolean z) {
        return intern(new ModuleRevisionId(ModuleId.newInstance(str, str2), str3, str4, map, z));
    }

    public static ModuleRevisionId newInstance(ModuleRevisionId moduleRevisionId, String str) {
        return intern(new ModuleRevisionId(moduleRevisionId.getModuleId(), moduleRevisionId.getBranch(), str, moduleRevisionId.getQualifiedExtraAttributes()));
    }

    public static ModuleRevisionId newInstance(ModuleRevisionId moduleRevisionId, String str, String str2) {
        return intern(new ModuleRevisionId(moduleRevisionId.getModuleId(), str, str2, moduleRevisionId.getQualifiedExtraAttributes()));
    }

    public static ModuleRevisionId intern(ModuleRevisionId moduleRevisionId) {
        Map<ModuleRevisionId, WeakReference<ModuleRevisionId>> map = CACHE;
        synchronized (map) {
            try {
                WeakReference<ModuleRevisionId> weakReference = map.get(moduleRevisionId);
                ModuleRevisionId moduleRevisionId2 = weakReference != null ? weakReference.get() : null;
                if (moduleRevisionId2 == null) {
                    map.put(moduleRevisionId, new WeakReference<>(moduleRevisionId));
                } else {
                    moduleRevisionId = moduleRevisionId2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return moduleRevisionId;
    }

    public ModuleRevisionId(ModuleId moduleId, String str) {
        this(moduleId, null, str, null);
    }

    public ModuleRevisionId(ModuleId moduleId, String str, String str2) {
        this(moduleId, str, str2, null);
    }

    public ModuleRevisionId(ModuleId moduleId, String str, Map<String, String> map) {
        this(moduleId, null, str, map);
    }

    public ModuleRevisionId(ModuleId moduleId, String str, String str2, Map<String, String> map) {
        this(moduleId, str, str2, map, true);
    }

    public ModuleRevisionId(ModuleId moduleId, String str, String str2, Map<String, String> map, boolean z) {
        super(null, map);
        this.moduleId = moduleId;
        IvyContext context = IvyContext.getContext();
        if (z && str == null) {
            str = context.peekIvy() == null ? null : context.getSettings().getDefaultBranch(moduleId);
        }
        this.branch = str;
        String workingRevision = str2 == null ? Ivy.getWorkingRevision() : normalizeRevision(str2);
        this.revision = workingRevision;
        setStandardAttribute(IvyPatternHelper.ORGANISATION_KEY, moduleId.getOrganisation());
        setStandardAttribute("module", moduleId.getName());
        setStandardAttribute(IvyPatternHelper.BRANCH_KEY, str);
        setStandardAttribute(IvyPatternHelper.REVISION_KEY, workingRevision);
    }

    public ModuleId getModuleId() {
        return this.moduleId;
    }

    public String getName() {
        return getModuleId().getName();
    }

    public String getOrganisation() {
        return getModuleId().getOrganisation();
    }

    public String getRevision() {
        return this.revision;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ModuleRevisionId)) {
            return false;
        }
        ModuleRevisionId moduleRevisionId = (ModuleRevisionId) obj;
        if (!moduleRevisionId.getRevision().equals(getRevision())) {
            return false;
        }
        if (moduleRevisionId.getBranch() != null || getBranch() == null) {
            return (moduleRevisionId.getBranch() == null || moduleRevisionId.getBranch().equals(getBranch())) && moduleRevisionId.getModuleId().equals(getModuleId()) && moduleRevisionId.getQualifiedExtraAttributes().equals(getQualifiedExtraAttributes());
        }
        return false;
    }

    public int hashCode() {
        if (this.hash == 0) {
            this.hash = 31;
            int iHashCode = (31 * 13) + (getBranch() == null ? 0 : getBranch().hashCode());
            this.hash = iHashCode;
            int iHashCode2 = (iHashCode * 13) + getRevision().hashCode();
            this.hash = iHashCode2;
            int iHashCode3 = (iHashCode2 * 13) + getModuleId().hashCode();
            this.hash = iHashCode3;
            this.hash = (iHashCode3 * 13) + getQualifiedExtraAttributes().hashCode();
        }
        return this.hash;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.moduleId);
        String str2 = this.branch;
        if (str2 == null || str2.length() == 0) {
            str = "";
        } else {
            str = "#" + this.branch;
        }
        sb.append(str);
        sb.append(PropertiesParser.PROPS_SEPARATOR);
        String str3 = this.revision;
        if (str3 == null) {
            str3 = IvyCleanCache.NONE;
        }
        sb.append(str3);
        return sb.toString();
    }

    public String encodeToString() {
        StringBuilder sb = new StringBuilder();
        HashMap map = new HashMap(getAttributes());
        map.keySet().removeAll(getExtraAttributes().keySet());
        map.putAll(getQualifiedExtraAttributes());
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getValue();
            if (str == null) {
                str = NULL_ENCODE;
            }
            sb.append("+");
            sb.append((String) entry.getKey());
            sb.append(":#@#:");
            sb.append("+");
            sb.append(str);
            sb.append(":#@#:");
        }
        return sb.toString();
    }

    public static ModuleRevisionId decode(String str) {
        String[] strArrSplit = str.split(":#@#:");
        if (strArrSplit.length % 2 != 0) {
            throw new IllegalArgumentException("badly encoded module revision id: '" + str + "'");
        }
        HashMap map = new HashMap();
        for (int i = 0; i < strArrSplit.length; i += 2) {
            String str2 = strArrSplit[i];
            if (!str2.startsWith("+")) {
                throw new IllegalArgumentException("badly encoded module revision id: '" + str + "': " + str2 + " doesn't start with +");
            }
            String strSubstring = str2.substring(1);
            String str3 = strArrSplit[i + 1];
            if (!str3.startsWith("+")) {
                throw new IllegalArgumentException("badly encoded module revision id: '" + str + "': " + str3 + " doesn't start with +");
            }
            String strSubstring2 = str3.substring(1);
            if (NULL_ENCODE.equals(strSubstring2)) {
                strSubstring2 = null;
            }
            map.put(strSubstring, strSubstring2);
        }
        String str4 = (String) map.remove(IvyPatternHelper.ORGANISATION_KEY);
        String str5 = (String) map.remove("module");
        String str6 = (String) map.remove(IvyPatternHelper.REVISION_KEY);
        String str7 = (String) map.remove(IvyPatternHelper.BRANCH_KEY);
        if (str4 == null) {
            throw new IllegalArgumentException("badly encoded module revision id: '" + str + "': no organisation");
        }
        if (str5 == null) {
            throw new IllegalArgumentException("badly encoded module revision id: '" + str + "': no module name");
        }
        if (str6 == null) {
            throw new IllegalArgumentException("badly encoded module revision id: '" + str + "': no revision");
        }
        return newInstance(str4, str5, str7, str6, map);
    }

    public String getBranch() {
        return this.branch;
    }

    public static String normalizeRevision(String str) {
        return (str.startsWith("[") && str.endsWith("]") && str.indexOf(44) == -1 && !IvyPatternHelper.getTokenString(IvyPatternHelper.REVISION_KEY).equals(str)) ? str.substring(1, str.length() - 1) : str;
    }
}
