package org.jfrog.build.extractor;

import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import org.jfrog.build.client.ArtifactoryUploadResponse;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;

/* loaded from: classes8.dex */
public class ModuleParallelDeployHelper {
    public static final int DEFAULT_DEPLOYMENT_THREADS = 3;

    public void deployArtifacts(final ArtifactoryManager artifactoryManager, Map<String, Set<DeployDetails>> map, int i) throws ExecutionException, InterruptedException {
        if (i <= 1) {
            map.forEach(new BiConsumer() { // from class: org.jfrog.build.extractor.ModuleParallelDeployHelper$$ExternalSyntheticLambda1
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f$0.lambda$deployArtifacts$0(artifactoryManager, (String) obj, (Set) obj2);
                }
            });
            return;
        }
        try {
            final ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(i);
            CompletableFuture.allOf((CompletableFuture[]) map.values().stream().map(new Function() { // from class: org.jfrog.build.extractor.ModuleParallelDeployHelper$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return this.f$0.lambda$deployArtifacts$2(artifactoryManager, executorServiceNewFixedThreadPool, (Set) obj);
                }
            }).toArray(new IntFunction() { // from class: org.jfrog.build.extractor.ModuleParallelDeployHelper$$ExternalSyntheticLambda3
                @Override // java.util.function.IntFunction
                public final Object apply(int i2) {
                    return ModuleParallelDeployHelper.lambda$deployArtifacts$3(i2);
                }
            })).get();
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    public final /* synthetic */ void lambda$deployArtifacts$0(ArtifactoryManager artifactoryManager, String str, Set set) {
        deploy(artifactoryManager, set, null);
    }

    public final /* synthetic */ CompletableFuture lambda$deployArtifacts$2(final ArtifactoryManager artifactoryManager, ExecutorService executorService, final Set set) {
        return CompletableFuture.runAsync(new Runnable() { // from class: org.jfrog.build.extractor.ModuleParallelDeployHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$null$1(artifactoryManager, set);
            }
        }, executorService);
    }

    public final /* synthetic */ void lambda$null$1(ArtifactoryManager artifactoryManager, Set set) {
        deploy(artifactoryManager, set, "[" + Thread.currentThread().getName() + "]");
    }

    public static /* synthetic */ CompletableFuture[] lambda$deployArtifacts$3(int i) {
        return new CompletableFuture[i];
    }

    public final void deploy(final ArtifactoryManager artifactoryManager, Set<DeployDetails> set, final String str) {
        set.forEach(new Consumer() { // from class: org.jfrog.build.extractor.ModuleParallelDeployHelper$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ModuleParallelDeployHelper.lambda$deploy$4(artifactoryManager, str, (DeployDetails) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$deploy$4(ArtifactoryManager artifactoryManager, String str, DeployDetails deployDetails) {
        try {
            ArtifactoryUploadResponse artifactoryUploadResponseUpload = artifactoryManager.upload(deployDetails, str);
            deployDetails.setDeploySucceeded(Boolean.TRUE);
            deployDetails.setSha256(artifactoryUploadResponseUpload.getChecksums().getSha256());
            deployDetails.setArtifactPath(artifactoryUploadResponseUpload.getPath());
        } catch (IOException e) {
            deployDetails.setDeploySucceeded(Boolean.FALSE);
            deployDetails.setSha256("");
            throw new RuntimeException("Error occurred while publishing artifact to Artifactory: " + deployDetails.getFile() + ".\n Skipping deployment of remaining artifacts (if any) and build info.", e);
        }
    }
}
