package org.apache.ivy.core.module.descriptor;

import java.util.Date;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.repository.Resource;

/* loaded from: classes7.dex */
public class DefaultWorkspaceModuleDescriptor extends DefaultModuleDescriptor implements WorkspaceModuleDescriptor {
    public DefaultWorkspaceModuleDescriptor(ModuleDescriptorParser moduleDescriptorParser, Resource resource) {
        super(moduleDescriptorParser, resource);
    }

    public DefaultWorkspaceModuleDescriptor(ModuleRevisionId moduleRevisionId, String str, Date date) {
        super(moduleRevisionId, str, date);
    }

    public DefaultWorkspaceModuleDescriptor(ModuleRevisionId moduleRevisionId, String str, Date date, boolean z) {
        super(moduleRevisionId, str, date, z);
    }
}
