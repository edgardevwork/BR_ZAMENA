package org.jfrog.build.extractor.clientConfiguration.util.spec;

import java.io.IOException;
import org.jfrog.build.api.producerConsumer.ProducerConsumerItem;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.producerConsumer.ConsumerRunnableBase;
import org.jfrog.build.extractor.producerConsumer.ProducerConsumerExecutor;

/* loaded from: classes7.dex */
public class SpecDeploymentConsumer extends ConsumerRunnableBase {
    public final ArtifactoryManager ArtifactoryManager;
    public ProducerConsumerExecutor executor;
    public Log log;

    public SpecDeploymentConsumer(ArtifactoryManager artifactoryManager) {
        this.ArtifactoryManager = artifactoryManager;
    }

    @Override // org.jfrog.build.extractor.producerConsumer.ConsumerRunnableBase
    public void consumerRun() {
        while (!Thread.interrupted()) {
            try {
                ProducerConsumerItem producerConsumerItemTake = this.executor.take();
                ProducerConsumerExecutor producerConsumerExecutor = this.executor;
                if (producerConsumerItemTake == producerConsumerExecutor.TERMINATE) {
                    producerConsumerExecutor.put(producerConsumerItemTake);
                    return;
                }
                this.ArtifactoryManager.upload((DeployDetails) producerConsumerItemTake, "[" + Thread.currentThread().getName() + "]");
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    @Override // org.jfrog.build.extractor.producerConsumer.ProducerConsumerRunnableInt
    public void setExecutor(ProducerConsumerExecutor producerConsumerExecutor) {
        this.executor = producerConsumerExecutor;
    }

    @Override // org.jfrog.build.extractor.producerConsumer.ProducerConsumerRunnableInt
    public void setLog(Log log) {
        this.log = log;
    }
}
