package org.apache.ivy.core.module.descriptor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes7.dex */
public class DefaultExtendsDescriptor implements ExtendsDescriptor {
    public final List<String> extendsTypes;
    public boolean local;
    public String location;
    public ModuleDescriptor parent;

    public DefaultExtendsDescriptor(ModuleDescriptor moduleDescriptor, String str, String[] strArr) {
        this(moduleDescriptor, str, strArr, false);
    }

    public DefaultExtendsDescriptor(ModuleDescriptor moduleDescriptor, String str, String[] strArr, boolean z) {
        this.parent = moduleDescriptor;
        this.location = str;
        this.local = z;
        ArrayList arrayList = new ArrayList(strArr.length);
        this.extendsTypes = arrayList;
        arrayList.addAll(Arrays.asList(strArr));
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public ModuleRevisionId getParentRevisionId() {
        return this.parent.getModuleRevisionId();
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public ModuleRevisionId getResolvedParentRevisionId() {
        return this.parent.getResolvedModuleRevisionId();
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public ModuleDescriptor getParentMd() {
        return this.parent;
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public String getLocation() {
        return this.location;
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public String[] getExtendsTypes() {
        List<String> list = this.extendsTypes;
        return (String[]) list.toArray(new String[list.size()]);
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public boolean isAllInherited() {
        return this.extendsTypes.contains("all");
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public boolean isInfoInherited() {
        return isAllInherited() || this.extendsTypes.contains("info");
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public boolean isDescriptionInherited() {
        return isAllInherited() || this.extendsTypes.contains("description");
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public boolean areConfigurationsInherited() {
        return isAllInherited() || this.extendsTypes.contains("configurations");
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public boolean areDependenciesInherited() {
        return isAllInherited() || this.extendsTypes.contains("dependencies");
    }

    @Override // org.apache.ivy.core.module.descriptor.ExtendsDescriptor
    public boolean isLocal() {
        return this.local;
    }
}
