package org.apache.ivy.core.event.publish;

import java.io.File;
import org.apache.ivy.core.event.IvyEvent;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.resolver.DependencyResolver;

/* loaded from: classes7.dex */
public abstract class PublishEvent extends IvyEvent {
    public final Artifact artifact;
    public final File data;
    public final boolean overwrite;
    public final DependencyResolver resolver;

    public PublishEvent(String str, DependencyResolver dependencyResolver, Artifact artifact, File file, boolean z) {
        super(str);
        this.resolver = dependencyResolver;
        this.artifact = artifact;
        this.data = file;
        this.overwrite = z;
        addMridAttributes(artifact.getModuleRevisionId());
        addAttributes(artifact.getAttributes());
        addAttribute("resolver", dependencyResolver.getName());
        addAttribute(PomReader.PomProfileElement.FILE, file.getAbsolutePath());
        addAttribute("overwrite", String.valueOf(z));
    }

    public DependencyResolver getResolver() {
        return this.resolver;
    }

    public File getData() {
        return this.data;
    }

    public Artifact getArtifact() {
        return this.artifact;
    }

    public boolean isOverwrite() {
        return this.overwrite;
    }
}
