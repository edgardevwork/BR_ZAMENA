package org.jfrog.gradle.plugin.artifactory.dsl;

import groovy.lang.GroovyObjectSupport;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.gradle.api.GradleException;
import org.gradle.api.Project;
import org.gradle.api.artifacts.UnknownConfigurationException;
import org.gradle.internal.metaobject.DynamicInvokeResult;
import org.jfrog.build.extractor.clientConfiguration.ArtifactSpec;
import org.jfrog.build.extractor.clientConfiguration.ArtifactSpecs;

/* loaded from: classes5.dex */
public class PropertiesConfig extends GroovyObjectSupport {
    public final ArtifactSpecs artifactSpecs = new ArtifactSpecs();
    public final Project project;

    public PropertiesConfig(Project project) {
        this.project = project;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.gradle.api.GradleException */
    public Object invokeMethod(String str, Object obj) throws GradleException {
        Object[] objArr = (Object[]) obj;
        if (objArr.length != 2 || !(objArr[0] instanceof Map)) {
            throw new GradleException("Invalid artifact properties spec: " + str + ", " + Arrays.toString(objArr) + ".\nExpected: configName artifactSpec, key1:val1, key2:val2");
        }
        if (!"all".equals(str)) {
            try {
                this.project.getConfigurations().getByName(str);
            } catch (UnknownConfigurationException unused) {
                this.project.getLogger().info("Artifactory plugin: configuration '{}' not found in project '{}'", str, this.project.getPath());
            }
        }
        this.artifactSpecs.add(ArtifactSpec.builder().artifactNotation(objArr[1].toString()).configuration(str).properties(convertToMap((Map) objArr[0])).build());
        return DynamicInvokeResult.found();
    }

    public final Map<String, String> convertToMap(Map<?, ?> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            map2.put(String.valueOf(entry.getKey()), String.valueOf(entry.getValue()));
        }
        return map2;
    }

    public ArtifactSpecs getArtifactSpecs() {
        return this.artifactSpecs;
    }
}
