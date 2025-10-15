package org.jfrog.build.extractor.clientConfiguration.deploy;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimap;
import com.google.common.collect.Multimaps;
import com.google.common.collect.UnmodifiableIterator;
import java.io.File;
import java.io.Serializable;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.BuildFileBean;
import org.jfrog.build.api.producerConsumer.ProducerConsumerItem;

/* loaded from: classes5.dex */
public class DeployDetails implements Comparable<DeployDetails>, Serializable, ProducerConsumerItem {
    public String artifactPath;
    public Boolean deploySucceeded;
    public boolean explode;
    public File file;
    public String md5;
    public PackageType packageType;
    public ArrayListMultimap<String, String> properties;
    public String sha1;
    public String sha256;
    public String targetRepository;

    /* loaded from: classes7.dex */
    public enum PackageType {
        GENERIC,
        MAVEN,
        ANT,
        IVY,
        GRADLE,
        GO,
        NPM
    }

    public String getTargetRepository() {
        return this.targetRepository;
    }

    public String getArtifactPath() {
        return this.artifactPath;
    }

    public File getFile() {
        return this.file;
    }

    public ArrayListMultimap<String, String> getProperties() {
        return this.properties;
    }

    public String getSha1() {
        return this.sha1;
    }

    public String getSha256() {
        return this.sha256;
    }

    public void setSha256(String str) {
        this.sha256 = str;
    }

    public void setArtifactPath(String str) {
        this.artifactPath = str;
    }

    public Boolean getDeploySucceeded() {
        return this.deploySucceeded;
    }

    public void setDeploySucceeded(Boolean bool) {
        this.deploySucceeded = bool;
    }

    public String getMd5() {
        return this.md5;
    }

    public boolean isExplode() {
        return this.explode;
    }

    public PackageType getPackageType() {
        return this.packageType;
    }

    @Override // java.lang.Comparable
    public int compareTo(DeployDetails deployDetails) {
        return this.artifactPath.compareTo(deployDetails.artifactPath);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeployDetails deployDetails = (DeployDetails) obj;
        return this.artifactPath.equals(deployDetails.artifactPath) && this.targetRepository.equals(deployDetails.targetRepository);
    }

    public int hashCode() {
        return (Objects.hashCode(this.artifactPath) * 31) + Objects.hashCode(this.targetRepository);
    }

    /* loaded from: classes7.dex */
    public static class Builder {
        public DeployDetails deployDetails = new DeployDetails();

        public DeployDetails build() {
            File file = this.deployDetails.file;
            if (file != null && file.exists()) {
                if (StringUtils.isBlank(this.deployDetails.targetRepository)) {
                    throw new IllegalArgumentException("Target repository cannot be empty");
                }
                if (StringUtils.isBlank(this.deployDetails.artifactPath)) {
                    throw new IllegalArgumentException("Artifact path cannot be empty");
                }
                return this.deployDetails;
            }
            throw new IllegalArgumentException("File not found: " + this.deployDetails.file);
        }

        public Builder bean(BuildFileBean buildFileBean) {
            Properties properties = buildFileBean.getProperties();
            if (properties != null) {
                ArrayListMultimap<String, String> arrayListMultimapCreate = ArrayListMultimap.create();
                UnmodifiableIterator<Map.Entry<String, String>> it = Maps.fromProperties(properties).entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, String> next = it.next();
                    arrayListMultimapCreate.put(next.getKey(), next.getValue());
                }
                this.deployDetails.properties = arrayListMultimapCreate;
            }
            this.deployDetails.sha1 = buildFileBean.getSha1();
            this.deployDetails.md5 = buildFileBean.getMd5();
            return this;
        }

        public Builder file(File file) {
            this.deployDetails.file = file;
            return this;
        }

        public Builder targetRepository(String str) {
            this.deployDetails.targetRepository = str;
            return this;
        }

        public Builder artifactPath(String str) {
            this.deployDetails.artifactPath = str;
            return this;
        }

        public Builder sha256(String str) {
            this.deployDetails.sha256 = str;
            return this;
        }

        public Builder sha1(String str) {
            this.deployDetails.sha1 = str;
            return this;
        }

        public Builder md5(String str) {
            this.deployDetails.md5 = str;
            return this;
        }

        public Builder explode(boolean z) {
            this.deployDetails.explode = z;
            return this;
        }

        public Builder packageType(PackageType packageType) {
            this.deployDetails.packageType = packageType;
            return this;
        }

        public Builder addProperty(String str, String str2) {
            DeployDetails deployDetails = this.deployDetails;
            if (deployDetails.properties == null) {
                deployDetails.properties = ArrayListMultimap.create();
            }
            this.deployDetails.properties.put(str, str2);
            return this;
        }

        public Builder addProperties(Map<String, String> map) {
            DeployDetails deployDetails = this.deployDetails;
            if (deployDetails.properties == null) {
                deployDetails.properties = ArrayListMultimap.create();
            }
            this.deployDetails.properties.putAll(Multimaps.forMap(map));
            return this;
        }

        public Builder addProperties(Multimap<String, String> multimap) {
            DeployDetails deployDetails = this.deployDetails;
            if (deployDetails.properties == null) {
                deployDetails.properties = ArrayListMultimap.create();
            }
            this.deployDetails.properties.putAll(multimap);
            return this;
        }
    }
}
