package org.apache.ivy.core.module.descriptor;

import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.util.extendable.ExtendableItem;

/* loaded from: classes7.dex */
public interface DependencyDescriptor extends ExtendableItem, InheritableItem {
    DependencyDescriptor asSystem();

    boolean canExclude();

    DependencyDescriptor clone(ModuleRevisionId moduleRevisionId);

    boolean doesExclude(String[] strArr, ArtifactId artifactId);

    DependencyArtifactDescriptor[] getAllDependencyArtifacts();

    ExcludeRule[] getAllExcludeRules();

    IncludeRule[] getAllIncludeRules();

    DependencyArtifactDescriptor[] getDependencyArtifacts(String str);

    DependencyArtifactDescriptor[] getDependencyArtifacts(String[] strArr);

    String[] getDependencyConfigurations(String str);

    String[] getDependencyConfigurations(String str, String str2);

    String[] getDependencyConfigurations(String[] strArr);

    ModuleId getDependencyId();

    ModuleRevisionId getDependencyRevisionId();

    ModuleRevisionId getDynamicConstraintDependencyRevisionId();

    ExcludeRule[] getExcludeRules(String str);

    ExcludeRule[] getExcludeRules(String[] strArr);

    IncludeRule[] getIncludeRules(String str);

    IncludeRule[] getIncludeRules(String[] strArr);

    String[] getModuleConfigurations();

    Namespace getNamespace();

    ModuleRevisionId getParentRevisionId();

    boolean isChanging();

    boolean isForce();

    boolean isTransitive();
}
