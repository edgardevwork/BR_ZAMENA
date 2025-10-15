package org.apache.ivy.tools.analyser;

import org.apache.ivy.core.module.descriptor.ModuleDescriptor;

/* loaded from: classes8.dex */
public interface DependencyAnalyser {
    ModuleDescriptor[] analyze(JarModule[] jarModuleArr);
}
