package org.apache.ivy.ant;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.util.StringUtils;

/* loaded from: classes7.dex */
public class IvyDependencyConf {
    public String mapped;
    public final List<IvyDependencyConfMapped> mappeds = new ArrayList();

    public static class IvyDependencyConfMapped {
        public String name;

        public void setName(String str) {
            this.name = str;
        }
    }

    public void setMapped(String str) {
        this.mapped = str;
    }

    public IvyDependencyConfMapped createMapped() {
        IvyDependencyConfMapped ivyDependencyConfMapped = new IvyDependencyConfMapped();
        this.mappeds.add(ivyDependencyConfMapped);
        return ivyDependencyConfMapped;
    }

    public void addConf(DefaultDependencyDescriptor defaultDependencyDescriptor, String str) {
        String str2 = this.mapped;
        if (str2 != null) {
            for (String str3 : StringUtils.splitToArray(str2)) {
                defaultDependencyDescriptor.addDependencyConfiguration(str, str3);
            }
        }
        Iterator<IvyDependencyConfMapped> it = this.mappeds.iterator();
        while (it.hasNext()) {
            defaultDependencyDescriptor.addDependencyConfiguration(str, it.next().name);
        }
    }
}
