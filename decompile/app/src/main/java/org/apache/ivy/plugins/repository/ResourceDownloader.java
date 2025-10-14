package org.apache.ivy.plugins.repository;

import java.io.File;
import java.io.IOException;
import org.apache.ivy.core.module.descriptor.Artifact;

/* loaded from: classes6.dex */
public interface ResourceDownloader {
    void download(Artifact artifact, Resource resource, File file) throws IOException;
}
