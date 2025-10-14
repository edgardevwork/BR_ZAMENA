package org.jfrog.build.extractor.clientConfiguration.util.spec;

import com.google.common.collect.Multimap;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.producerConsumer.ProducerRunnableBase;
import org.jfrog.filespecs.FileSpec;
import org.jfrog.filespecs.entities.FilesGroup;

/* loaded from: classes7.dex */
public class SpecDeploymentProducer extends ProducerRunnableBase {
    public Multimap<String, String> buildProperties;
    public Set<DeployDetails> deployDetailsSet = new HashSet();
    public FileSpec spec;
    public File workspace;

    public SpecDeploymentProducer(FileSpec fileSpec, File file, Multimap<String, String> multimap) {
        this.spec = fileSpec;
        this.workspace = file;
        this.buildProperties = multimap;
    }

    @Override // org.jfrog.build.extractor.producerConsumer.ProducerRunnableBase
    public void producerRun() throws InterruptedException {
        this.log.debug(String.format("[Thread %s] starting run()", Thread.currentThread().getName()));
        try {
            for (FilesGroup filesGroup : this.spec.getFiles()) {
                if (Thread.interrupted()) {
                    return;
                }
                this.log.debug(String.format("[Thread %s] getting deploy details from the following json: \n %s ", Thread.currentThread().getName(), filesGroup.toString()));
                new SingleSpecDeploymentProducer(filesGroup, this.workspace, this.buildProperties).executeSpec(this.deployDetailsSet, this.executor);
            }
        } catch (InterruptedException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    public Set<DeployDetails> getDeployedArtifacts() {
        return this.deployDetailsSet;
    }
}
