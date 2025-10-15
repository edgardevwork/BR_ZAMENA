package org.apache.ivy.core.module.descriptor;

import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes7.dex */
public interface ExtendsDescriptor {
    boolean areConfigurationsInherited();

    boolean areDependenciesInherited();

    String[] getExtendsTypes();

    String getLocation();

    ModuleDescriptor getParentMd();

    ModuleRevisionId getParentRevisionId();

    ModuleRevisionId getResolvedParentRevisionId();

    boolean isAllInherited();

    boolean isDescriptionInherited();

    boolean isInfoInherited();

    boolean isLocal();
}
