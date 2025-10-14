package org.apache.ivy.core.cache;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;

/* loaded from: classes7.dex */
public interface ModuleDescriptorWriter {
    void write(ResolvedResource resolvedResource, ModuleDescriptor moduleDescriptor, File file, File file2) throws IOException, ParseException;
}
