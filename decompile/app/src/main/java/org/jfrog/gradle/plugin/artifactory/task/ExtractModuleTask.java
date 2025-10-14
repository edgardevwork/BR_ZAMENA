package org.jfrog.gradle.plugin.artifactory.task;

import java.io.File;
import java.io.IOException;
import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.tasks.OutputFile;
import org.gradle.api.tasks.TaskAction;
import org.jfrog.build.extractor.ModuleExtractorUtils;
import org.jfrog.gradle.plugin.artifactory.extractor.GradleModuleExtractor;

/* loaded from: classes5.dex */
public class ExtractModuleTask extends DefaultTask {
    public static final Logger log = Logging.getLogger(ExtractModuleTask.class);
    public final RegularFileProperty moduleFile = getProject().getObjects().fileProperty();

    @OutputFile
    public RegularFileProperty getModuleFile() {
        return this.moduleFile;
    }

    @TaskAction
    public void extractModule() throws Throwable {
        log.info("Extracting details for {}", getPath());
        try {
            ModuleExtractorUtils.saveModuleToFile(new GradleModuleExtractor().extractModule(getProject()), (File) this.moduleFile.getAsFile().get());
        } catch (IOException e) {
            throw new RuntimeException("Could not save module file", e);
        }
    }
}
