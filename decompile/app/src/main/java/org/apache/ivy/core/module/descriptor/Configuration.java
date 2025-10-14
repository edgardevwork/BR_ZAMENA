package org.apache.ivy.core.module.descriptor;

import io.ktor.client.utils.CacheControl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.util.extendable.DefaultExtendableItem;

/* loaded from: classes5.dex */
public class Configuration extends DefaultExtendableItem implements InheritableItem {
    public String deprecated;
    public String description;
    public Set<String> extendsFrom;
    public String name;
    public ModuleRevisionId sourceModule;
    public boolean transitive;
    public Visibility visibility;

    /* loaded from: classes7.dex */
    public static final class Visibility {
        public String name;
        public static final Visibility PUBLIC = new Visibility("public");
        public static final Visibility PRIVATE = new Visibility(CacheControl.PRIVATE);

        public static Visibility getVisibility(String str) {
            str.hashCode();
            if (str.equals("public")) {
                return PUBLIC;
            }
            if (str.equals(CacheControl.PRIVATE)) {
                return PRIVATE;
            }
            throw new IllegalArgumentException("unknown visibility " + str);
        }

        public Visibility(String str) {
            this.name = str;
        }

        public String toString() {
            return this.name;
        }
    }

    public static Collection<Configuration> findConfigurationExtending(String str, Configuration[] configurationArr) {
        ArrayList arrayList = new ArrayList();
        for (Configuration configuration : configurationArr) {
            if (configuration != null && Arrays.asList(configuration.getExtends()).contains(str)) {
                arrayList.add(configuration);
                arrayList.addAll(findConfigurationExtending(configuration.getName(), configurationArr));
            }
        }
        return arrayList;
    }

    public Configuration(String str) {
        this(str, Visibility.PUBLIC, null, null, true, null);
    }

    public Configuration(Configuration configuration, ModuleRevisionId moduleRevisionId) {
        this(configuration.getAttributes(), configuration.getQualifiedExtraAttributes(), configuration.getName(), configuration.getVisibility(), configuration.getDescription(), configuration.getExtends(), configuration.isTransitive(), configuration.getDeprecated(), moduleRevisionId);
    }

    public Configuration(String str, Visibility visibility, String str2, String[] strArr, boolean z, String str3) {
        this(null, null, str, visibility, str2, strArr, z, str3, null);
    }

    public Configuration(Map<String, String> map, Map<String, String> map2, String str, Visibility visibility, String str2, String[] strArr, boolean z, String str3, ModuleRevisionId moduleRevisionId) {
        super(map, map2);
        this.transitive = true;
        if (str == null) {
            throw new NullPointerException("null configuration name not allowed");
        }
        if (visibility == null) {
            throw new NullPointerException("null visibility not allowed");
        }
        this.name = str;
        this.visibility = visibility;
        this.description = str2;
        if (strArr == null) {
            this.extendsFrom = Collections.emptySet();
        } else {
            this.extendsFrom = new LinkedHashSet();
            for (String str4 : strArr) {
                this.extendsFrom.add(str4.trim());
            }
        }
        this.transitive = z;
        this.deprecated = str3;
        this.sourceModule = moduleRevisionId;
    }

    public String getDeprecated() {
        return this.deprecated;
    }

    public String getDescription() {
        return this.description;
    }

    public String[] getExtends() {
        Set<String> set = this.extendsFrom;
        return (String[]) set.toArray(new String[set.size()]);
    }

    public String getName() {
        return this.name;
    }

    public Visibility getVisibility() {
        return this.visibility;
    }

    public final boolean isTransitive() {
        return this.transitive;
    }

    @Override // org.apache.ivy.core.module.descriptor.InheritableItem
    public ModuleRevisionId getSourceModule() {
        return this.sourceModule;
    }

    public String toString() {
        return this.name;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Configuration) && ((Configuration) obj).getName().equals(getName());
    }

    public int hashCode() {
        return getName().hashCode();
    }

    public void replaceWildcards(ModuleDescriptor moduleDescriptor) {
        if (this != moduleDescriptor.getConfiguration(this.name)) {
            throw new IllegalArgumentException("The given ModuleDescriptor doesn't own this configuration!");
        }
        Configuration[] configurations = moduleDescriptor.getConfigurations();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : this.extendsFrom) {
            str.hashCode();
            switch (str) {
                case "*(public)":
                    addOther(configurations, Visibility.PUBLIC, linkedHashSet);
                    break;
                case "*(private)":
                    addOther(configurations, Visibility.PRIVATE, linkedHashSet);
                    break;
                case "*":
                    addOther(configurations, null, linkedHashSet);
                    break;
                default:
                    linkedHashSet.add(str);
                    break;
            }
        }
        this.extendsFrom = linkedHashSet;
    }

    public final void addOther(Configuration[] configurationArr, Visibility visibility, Set<String> set) {
        for (Configuration configuration : configurationArr) {
            String name = configuration.getName();
            if (!this.name.equals(name) && (visibility == null || visibility.equals(configuration.getVisibility()))) {
                set.add(name);
            }
        }
    }
}
