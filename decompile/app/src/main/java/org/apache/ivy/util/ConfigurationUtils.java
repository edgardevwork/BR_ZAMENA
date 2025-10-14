package org.apache.ivy.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;

/* loaded from: classes8.dex */
public final class ConfigurationUtils {
    public static String[] replaceWildcards(String[] strArr, ModuleDescriptor moduleDescriptor) {
        if (strArr == null) {
            return moduleDescriptor.getConfigurationsNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (String str : strArr) {
            if ("*".equals(str)) {
                linkedHashSet.addAll(Arrays.asList(moduleDescriptor.getConfigurationsNames()));
            } else if ("*(public)".equals(str)) {
                for (Configuration configuration : moduleDescriptor.getConfigurations()) {
                    if (Configuration.Visibility.PUBLIC.equals(configuration.getVisibility())) {
                        linkedHashSet.add(configuration.getName());
                    }
                }
            } else if ("*(private)".equals(str)) {
                for (Configuration configuration2 : moduleDescriptor.getConfigurations()) {
                    if (Configuration.Visibility.PRIVATE.equals(configuration2.getVisibility())) {
                        linkedHashSet.add(configuration2.getName());
                    }
                }
            } else if (str.startsWith("!")) {
                linkedHashSet2.add(str.substring(1));
            } else {
                linkedHashSet.add(str);
            }
        }
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            linkedHashSet.remove((String) it.next());
        }
        return (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
    }
}
