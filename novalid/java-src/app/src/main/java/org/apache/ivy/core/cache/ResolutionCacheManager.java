package org.apache.ivy.core.cache;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes7.dex */
public interface ResolutionCacheManager {
    void clean();

    File getConfigurationResolveReportInCache(String str, String str2);

    File[] getConfigurationResolveReportsInCache(String str);

    File getResolutionCacheRoot();

    File getResolvedIvyFileInCache(ModuleRevisionId moduleRevisionId);

    File getResolvedIvyPropertiesInCache(ModuleRevisionId moduleRevisionId);

    ModuleDescriptor getResolvedModuleDescriptor(ModuleRevisionId moduleRevisionId) throws IOException, ParseException;

    void saveResolvedModuleDescriptor(ModuleDescriptor moduleDescriptor) throws IOException, ParseException;
}
