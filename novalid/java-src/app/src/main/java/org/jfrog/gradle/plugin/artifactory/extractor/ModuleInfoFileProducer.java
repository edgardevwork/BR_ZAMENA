package org.jfrog.gradle.plugin.artifactory.extractor;

import org.gradle.api.file.FileCollection;

/* loaded from: classes5.dex */
public interface ModuleInfoFileProducer {
    FileCollection getModuleInfoFiles();

    boolean hasModules();
}
