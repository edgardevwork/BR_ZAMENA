package org.apache.ivy.core.module.descriptor;

import java.util.Map;
import org.apache.ivy.core.module.descriptor.Configuration;

/* loaded from: classes5.dex */
public class ConfigurationGroup extends Configuration {
    public final Map<String, Configuration> members;

    public ConfigurationGroup(String str, Map<String, Configuration> map) {
        super(str);
        this.members = map;
    }

    public String[] getMembersConfigurationNames() {
        return (String[]) this.members.keySet().toArray(new String[this.members.size()]);
    }

    public Configuration getMemberConfiguration(String str) {
        return this.members.get(str);
    }

    @Override // org.apache.ivy.core.module.descriptor.Configuration
    public Configuration.Visibility getVisibility() {
        for (Configuration configuration : this.members.values()) {
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
