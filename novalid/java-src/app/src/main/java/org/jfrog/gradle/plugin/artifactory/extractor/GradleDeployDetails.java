package org.jfrog.gradle.plugin.artifactory.extractor;

import java.util.Objects;
import org.gradle.api.Project;
import org.jfrog.build.extractor.clientConfiguration.deploy.DeployDetails;

/* loaded from: classes5.dex */
public class GradleDeployDetails implements Comparable<GradleDeployDetails> {
    public final DeployDetails deployDetails;
    public final Project project;
    public final PublishArtifactInfo publishArtifact;

    public GradleDeployDetails(PublishArtifactInfo publishArtifactInfo, DeployDetails deployDetails, Project project) {
        this.deployDetails = deployDetails;
        this.publishArtifact = publishArtifactInfo;
        this.project = project;
    }

    public DeployDetails getDeployDetails() {
        return this.deployDetails;
    }

    public Project getProject() {
        return this.project;
    }

    public PublishArtifactInfo getPublishArtifact() {
        return this.publishArtifact;
    }

    @Override // java.lang.Comparable
    public int compareTo(GradleDeployDetails gradleDeployDetails) {
        if (this.publishArtifact == null) {
            return -1;
        }
        if (gradleDeployDetails.publishArtifact == null) {
            return 1;
        }
        int iCompareTo = this.deployDetails.compareTo(gradleDeployDetails.deployDetails);
        if (iCompareTo == 0) {
            return 0;
        }
        String extension = this.publishArtifact.getExtension();
        String extension2 = gradleDeployDetails.publishArtifact.getExtension();
        if (extension == null) {
            return -1;
        }
        if (extension2 == null) {
            return 1;
        }
        String lowerCase = extension.toLowerCase();
        if ("xml".equals(lowerCase) || "pom".equals(lowerCase)) {
            return 1;
        }
        String lowerCase2 = extension2.toLowerCase();
        if ("xml".equals(lowerCase2) || "pom".equals(lowerCase2)) {
            return -1;
        }
        return iCompareTo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GradleDeployDetails gradleDeployDetails = (GradleDeployDetails) obj;
        return Objects.equals(this.deployDetails, gradleDeployDetails.deployDetails) && Objects.equals(this.publishArtifact, gradleDeployDetails.publishArtifact) && Objects.equals(this.project, gradleDeployDetails.project);
    }

    public int hashCode() {
        return Objects.hash(this.deployDetails, this.publishArtifact, this.project);
    }
}
