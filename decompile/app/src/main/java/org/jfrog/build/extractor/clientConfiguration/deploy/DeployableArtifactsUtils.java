package org.jfrog.build.extractor.clientConfiguration.deploy;

import com.fasterxml.jackson.core.type.TypeReference;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import org.jfrog.build.client.DeployableArtifactDetail;
import org.jfrog.build.extractor.BuildInfoExtractorUtils;

/* loaded from: classes7.dex */
public class DeployableArtifactsUtils {
    public static void saveDeployableArtifactsToFile(Map<String, Set<DeployDetails>> map, File file, boolean z) throws IOException {
        if (z) {
            saveBackwardCompatibleDeployableArtifacts(map, file);
        } else {
            saveDeployableArtifactsByModule(map, file);
        }
    }

    public static void saveDeployableArtifactsByModule(Map<String, Set<DeployDetails>> map, File file) throws IOException {
        final HashMap map2 = new HashMap();
        map.forEach(new BiConsumer() { // from class: org.jfrog.build.extractor.clientConfiguration.deploy.DeployableArtifactsUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                DeployableArtifactsUtils.lambda$saveDeployableArtifactsByModule$0(map2, (String) obj, (Set) obj2);
            }
        });
        BuildInfoExtractorUtils.createMapper().writeValue(file, map2);
    }

    public static /* synthetic */ void lambda$saveDeployableArtifactsByModule$0(Map map, String str, Set set) {
    }

    @Deprecated
    public static void saveBackwardCompatibleDeployableArtifacts(Map<String, Set<DeployDetails>> map, File file) throws IOException {
        final ArrayList arrayList = new ArrayList();
        map.forEach(new BiConsumer() { // from class: org.jfrog.build.extractor.clientConfiguration.deploy.DeployableArtifactsUtils$$ExternalSyntheticLambda1
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                DeployableArtifactsUtils.lambda$saveBackwardCompatibleDeployableArtifacts$1(arrayList, (String) obj, (Set) obj2);
            }
        });
        BuildInfoExtractorUtils.createMapper().writeValue(file, arrayList);
    }

    public static /* synthetic */ void lambda$saveBackwardCompatibleDeployableArtifacts$1(List list, String str, Set set) {
        list.addAll(getDeployableArtifactsPaths(set));
    }

    public static Map<String, List<DeployableArtifactDetail>> loadDeployableArtifactsFromFile(File file, File file2) throws IOException {
        Map<String, List<DeployableArtifactDetail>> mapLoadDeployableArtifactsByModuleFromFile = loadDeployableArtifactsByModuleFromFile(file);
        return mapLoadDeployableArtifactsByModuleFromFile.isEmpty() ? loadBackwardCompatibleDeployableArtifactsFromFile(file2) : mapLoadDeployableArtifactsByModuleFromFile;
    }

    public static Map<String, List<DeployableArtifactDetail>> loadDeployableArtifactsByModuleFromFile(File file) throws IOException {
        if (file == null || file.length() == 0) {
            return new HashMap();
        }
        return (Map) BuildInfoExtractorUtils.createMapper().readValue(file, new TypeReference<Map<String, List<DeployableArtifactDetail>>>() { // from class: org.jfrog.build.extractor.clientConfiguration.deploy.DeployableArtifactsUtils.1
        });
    }

    @Deprecated
    public static Map<String, List<DeployableArtifactDetail>> loadBackwardCompatibleDeployableArtifactsFromFile(File file) throws IOException {
        if (file == null || file.length() == 0) {
            return new HashMap();
        }
        List list = (List) BuildInfoExtractorUtils.createMapper().readValue(file, new TypeReference<List<DeployableArtifactDetail>>() { // from class: org.jfrog.build.extractor.clientConfiguration.deploy.DeployableArtifactsUtils.2
        });
        HashMap map = new HashMap();
        if (!list.isEmpty()) {
            map.put("", list);
        }
        return map;
    }

    public static List<DeployableArtifactDetail> getDeployableArtifactsPaths(Set<DeployDetails> set) {
        ArrayList arrayList = new ArrayList();
        for (DeployDetails deployDetails : set) {
            arrayList.add(new DeployableArtifactDetail(deployDetails.getFile().getAbsolutePath(), deployDetails.getArtifactPath(), deployDetails.getSha1(), deployDetails.getSha256(), deployDetails.getDeploySucceeded(), deployDetails.getTargetRepository(), deployDetails.getProperties() != null ? deployDetails.getProperties().asMap() : Collections.emptyMap()));
        }
        return arrayList;
    }
}
