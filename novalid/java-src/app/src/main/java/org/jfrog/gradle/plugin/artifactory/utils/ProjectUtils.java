package org.jfrog.gradle.plugin.artifactory.utils;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;
import org.gradle.api.Project;
import org.gradle.api.artifacts.ModuleVersionIdentifier;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.build.extractor.clientConfiguration.IncludeExcludePatterns;
import org.jfrog.build.extractor.clientConfiguration.PatternMatcher;
import org.jfrog.gradle.plugin.artifactory.extractor.GradleDeployDetails;

/* loaded from: classes5.dex */
public class ProjectUtils {
    public static boolean isRootProject(Project project) {
        return project.equals(project.getRootProject());
    }

    public static String getId(Project project) {
        return getAsGavString(project.getGroup().toString(), project.getName(), project.getVersion().toString());
    }

    public static String getId(ModuleVersionIdentifier moduleVersionIdentifier) {
        if (moduleVersionIdentifier == null) {
            return null;
        }
        return getAsGavString(moduleVersionIdentifier.getGroup(), moduleVersionIdentifier.getName(), moduleVersionIdentifier.getVersion());
    }

    public static String getAsGavString(String str, String str2, String str3) {
        return str + StringUtils.PROCESS_POSTFIX_DELIMITER + str2 + StringUtils.PROCESS_POSTFIX_DELIMITER + str3;
    }

    public static boolean hasOneOfComponents(Project project, String... strArr) {
        for (String str : strArr) {
            if (project.getComponents().findByName(str) != null) {
                return true;
            }
        }
        return false;
    }

    public static Iterable<GradleDeployDetails> filterIncludeExcludeDetails(Project project, ArtifactoryClientConfiguration.PublisherHandler publisherHandler, Set<GradleDeployDetails> set, boolean z) {
        IncludeExcludePatterns includeExcludePatterns = new IncludeExcludePatterns(publisherHandler.getIncludePatterns(), publisherHandler.getExcludePatterns());
        if (publisherHandler.isFilterExcludedArtifactsFromBuild()) {
            return Iterables.filter(set, new IncludeExcludePredicate(project, includeExcludePatterns, z));
        }
        return z ? Iterables.filter(set, new ProjectPredicate(project)) : new ArrayList();
    }

    /* loaded from: classes8.dex */
    public static class ProjectPredicate implements Predicate<GradleDeployDetails> {
        public final Project project;

        public ProjectPredicate(Project project) {
            this.project = project;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@Nullable GradleDeployDetails gradleDeployDetails) {
            if (gradleDeployDetails == null) {
                return false;
            }
            return gradleDeployDetails.getProject().equals(this.project);
        }
    }

    /* loaded from: classes8.dex */
    public static class IncludeExcludePredicate implements Predicate<GradleDeployDetails> {
        public final boolean include;
        public final IncludeExcludePatterns patterns;
        public final Project project;

        public IncludeExcludePredicate(Project project, IncludeExcludePatterns includeExcludePatterns, boolean z) {
            this.project = project;
            this.patterns = includeExcludePatterns;
            this.include = z;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@Nullable GradleDeployDetails gradleDeployDetails) {
            if (gradleDeployDetails == null || !Objects.equals(gradleDeployDetails.getProject(), this.project)) {
                return false;
            }
            if (this.include) {
                return !PatternMatcher.pathConflicts(gradleDeployDetails.getDeployDetails().getArtifactPath(), this.patterns);
            }
            return PatternMatcher.pathConflicts(gradleDeployDetails.getDeployDetails().getArtifactPath(), this.patterns);
        }
    }
}
