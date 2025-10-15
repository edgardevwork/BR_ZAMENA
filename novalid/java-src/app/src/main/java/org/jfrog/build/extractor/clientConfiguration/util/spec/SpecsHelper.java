package org.jfrog.build.extractor.clientConfiguration.util.spec;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.p059io.FilenameUtils;
import org.apache.http.client.utils.URLEncodedUtils;
import org.jfrog.build.api.util.CommonUtils;
import org.jfrog.build.api.util.Log;
import org.jfrog.build.extractor.builder.ArtifactBuilder;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryManagerBuilder;
import org.jfrog.build.extractor.clientConfiguration.client.artifactory.ArtifactoryManager;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;
import org.jfrog.build.extractor.clientConfiguration.util.DependenciesDownloaderHelper;
import org.jfrog.build.extractor.clientConfiguration.util.EditPropertiesHelper;
import org.jfrog.build.extractor.p065ci.Artifact;
import org.jfrog.build.extractor.p065ci.Dependency;
import org.jfrog.build.extractor.producerConsumer.ConsumerRunnableBase;
import org.jfrog.build.extractor.producerConsumer.ProducerConsumerExecutor;
import org.jfrog.build.extractor.producerConsumer.ProducerRunnableBase;
import org.jfrog.filespecs.FileSpec;
import org.jfrog.filespecs.FileSpecsValidation;
import org.jfrog.filespecs.properties.PropertiesParser;

/* loaded from: classes7.dex */
public class SpecsHelper {
    public static final int DEFAULT_NUMBER_OF_THREADS = 3;
    public final Log log;

    public SpecsHelper(Log log) {
        this.log = log;
    }

    public List<Artifact> uploadArtifactsBySpec(String str, File file, Map<String, String> map, ArtifactoryManagerBuilder artifactoryManagerBuilder) throws Exception {
        return uploadArtifactsBySpec(str, 3, file, createMultiMap(map), artifactoryManagerBuilder);
    }

    public static <K, V> Multimap<K, V> createMultiMap(Map<K, V> map) {
        ArrayListMultimap arrayListMultimapCreate = ArrayListMultimap.create();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            arrayListMultimapCreate.put(entry.getKey(), entry.getValue());
        }
        return arrayListMultimapCreate;
    }

    public List<Artifact> uploadArtifactsBySpec(String str, int i, File file, Multimap<String, String> multimap, ArtifactoryManagerBuilder artifactoryManagerBuilder) throws Exception {
        FileSpec fileSpecFromString = FileSpec.fromString(str);
        FileSpecsValidation.validateUploadFileSpec(fileSpecFromString, this.log);
        ArtifactoryManager artifactoryManagerBuild = artifactoryManagerBuilder.build();
        try {
            ProducerRunnableBase[] producerRunnableBaseArr = {new SpecDeploymentProducer(fileSpecFromString, file, multimap)};
            ConsumerRunnableBase[] consumerRunnableBaseArr = new ConsumerRunnableBase[i];
            for (int i2 = 0; i2 < i; i2++) {
                consumerRunnableBaseArr[i2] = new SpecDeploymentConsumer(artifactoryManagerBuild);
            }
            new ProducerConsumerExecutor(this.log, producerRunnableBaseArr, consumerRunnableBaseArr, 10).start();
            List<Artifact> listConvertDeployDetailsToArtifacts = convertDeployDetailsToArtifacts(((SpecDeploymentProducer) producerRunnableBaseArr[0]).getDeployedArtifacts());
            if (artifactoryManagerBuild != null) {
                artifactoryManagerBuild.close();
            }
            return listConvertDeployDetailsToArtifacts;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (artifactoryManagerBuild != null) {
                    try {
                        artifactoryManagerBuild.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    public final List<Artifact> convertDeployDetailsToArtifacts(Set<DeployDetails> set) throws IllegalArgumentException {
        ArrayList arrayList = new ArrayList();
        for (DeployDetails deployDetails : set) {
            String extension = FilenameUtils.getExtension(deployDetails.getFile().getName());
            ArtifactBuilder artifactBuilder = new ArtifactBuilder(deployDetails.getFile().getName());
            artifactBuilder.md5(deployDetails.getMd5()).sha1(deployDetails.getSha1()).sha256(deployDetails.getSha256()).type(extension).localPath(deployDetails.getFile().getAbsolutePath()).remotePath(deployDetails.getArtifactPath()).build();
            arrayList.add(artifactBuilder.build());
        }
        return arrayList;
    }

    public List<Dependency> downloadArtifactsBySpec(String str, ArtifactoryManager artifactoryManager, String str2) throws IOException {
        CommonUtils.handleJavaTmpdirProperty();
        DependenciesDownloaderHelper dependenciesDownloaderHelper = new DependenciesDownloaderHelper(artifactoryManager, str2, this.log);
        FileSpec fileSpecFromString = FileSpec.fromString(str);
        FileSpecsValidation.validateSearchBasedFileSpec(fileSpecFromString);
        return dependenciesDownloaderHelper.downloadDependencies(fileSpecFromString);
    }

    public boolean editPropertiesBySpec(String str, ArtifactoryManager artifactoryManager, EditPropertiesHelper.EditPropertiesActionType editPropertiesActionType, String str2) throws IOException {
        EditPropertiesHelper editPropertiesHelper = new EditPropertiesHelper(artifactoryManager, this.log);
        FileSpec fileSpecFromString = FileSpec.fromString(str);
        FileSpecsValidation.validateSearchBasedFileSpec(fileSpecFromString);
        return editPropertiesHelper.editProperties(fileSpecFromString, editPropertiesActionType, str2);
    }

    public static ArrayListMultimap<String, String> getPropertiesMap(String str) {
        ArrayListMultimap<String, String> arrayListMultimapCreate = ArrayListMultimap.create();
        fillPropertiesMap(str, arrayListMultimapCreate);
        return arrayListMultimapCreate;
    }

    public static void fillPropertiesMap(String str, ArrayListMultimap<String, String> arrayListMultimap) {
        if (StringUtils.isBlank(str)) {
            return;
        }
        for (String str2 : str.trim().split(PropertiesParser.PROPS_SEPARATOR)) {
            arrayListMultimap.putAll(StringUtils.substringBefore(str2, URLEncodedUtils.NAME_VALUE_SEPARATOR), Arrays.asList(StringUtils.substringAfter(str2, URLEncodedUtils.NAME_VALUE_SEPARATOR).split(",")));
        }
    }
}
