package org.jfrog.build.extractor.clientConfiguration;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes8.dex */
public class ArtifactSpecs extends LinkedList<ArtifactSpec> {
    public ArtifactSpecs() {
    }

    public ArtifactSpecs(String str) {
        if (StringUtils.isNotBlank(str)) {
            for (String str2 : str.split("\r{0,1}\n")) {
                if (StringUtils.isNotBlank(str2)) {
                    add(ArtifactSpec.newSpec(str2));
                }
            }
        }
    }

    public Multimap<String, CharSequence> getProperties(ArtifactSpec artifactSpec) {
        ArrayListMultimap arrayListMultimapCreate = ArrayListMultimap.create();
        Iterator<ArtifactSpec> it = iterator();
        while (it.hasNext()) {
            ArtifactSpec next = it.next();
            if (next.matches(artifactSpec)) {
                for (Map.Entry<String, CharSequence> entry : next.getProperties().entrySet()) {
                    arrayListMultimapCreate.put(entry.getKey(), entry.getValue());
                }
            }
        }
        return arrayListMultimapCreate;
    }
}
