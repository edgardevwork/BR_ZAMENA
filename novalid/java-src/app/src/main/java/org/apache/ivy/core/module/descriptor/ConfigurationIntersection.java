package org.apache.ivy.core.module.descriptor;

import java.util.Map;
import org.apache.ivy.core.module.descriptor.Configuration;

/* loaded from: classes5.dex */
public class ConfigurationIntersection extends Configuration {
    public final Map<String, Configuration> intersectedConfs;

    public ConfigurationIntersection(String str, Map<String, Configuration> map) {
        super(str);
        this.intersectedConfs = map;
    }

    public String[] getIntersectedConfigurationNames() {
        return (String[]) this.intersectedConfs.keySet().toArray(new String[this.intersectedConfs.size()]);
    }

    public Configuration getIntersectedConfiguration(String str) {
        return this.intersectedConfs.get(str);
    }

    @Override // org.apache.ivy.core.module.descriptor.Configuration
    public Configuration.Visibility getVisibility() {
        for (Configuration configuration : this.intersectedConfs.values()) {
            if (configuration != null) {
                Configuration.Visibility visibility = Configuration.Visibility.PRIVATE;
                if (visibility.equals(configuration.getVisibility())) {
                    return visibility;
                }
            }
        }
        return Configuration.Visibility.PUBLIC;
    }
}
