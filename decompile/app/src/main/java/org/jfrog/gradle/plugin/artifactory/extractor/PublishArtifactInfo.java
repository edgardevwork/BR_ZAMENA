package org.jfrog.gradle.plugin.artifactory.extractor;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import javax.xml.namespace.QName;
import org.apache.commons.lang3.StringUtils;
import org.gradle.api.GradleException;

/* loaded from: classes5.dex */
public class PublishArtifactInfo implements Comparable<PublishArtifactInfo> {
    public final String classifier;
    public final String extension;
    public final Map<QName, String> extraInfo;
    public final File file;
    public final String name;
    public final String type;

    public PublishArtifactInfo(String str, String str2, String str3, String str4, File file) {
        this(str, str2, str3, str4, null, file);
    }

    public PublishArtifactInfo(String str, String str2, String str3, String str4, Map<QName, String> map, File file) {
        this.name = str;
        this.extension = str2;
        this.type = str3;
        this.classifier = str4;
        this.extraInfo = map;
        this.file = file;
    }

    public String getName() {
        return this.name;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getType() {
        return this.type;
    }

    public String getClassifier() {
        return this.classifier;
    }

    public Map<QName, String> getExtraInfo() {
        return this.extraInfo;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.gradle.api.GradleException */
    public Map<String, String> getExtraTokens() throws GradleException {
        HashMap map = new HashMap();
        if (StringUtils.isNotBlank(getClassifier())) {
            map.put("classifier", getClassifier());
        }
        Map<QName, String> extraInfo = getExtraInfo();
        if (extraInfo != null) {
            for (Map.Entry<QName, String> entry : extraInfo.entrySet()) {
                String localPart = entry.getKey().getLocalPart();
                if (map.containsKey(localPart)) {
                    throw new GradleException("Found duplicated extra info key defined '" + localPart + "'.");
                }
                map.put(localPart, entry.getValue());
            }
        }
        return map;
    }

    public File getFile() {
        return this.file;
    }

    @Override // java.lang.Comparable
    public int compareTo(PublishArtifactInfo publishArtifactInfo) {
        return this.file.compareTo(publishArtifactInfo.getFile());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.file.equals(((PublishArtifactInfo) obj).file);
    }

    public int hashCode() {
        return this.file.hashCode();
    }
}
