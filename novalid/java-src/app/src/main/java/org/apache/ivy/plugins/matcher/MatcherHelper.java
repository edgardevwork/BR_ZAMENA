package org.apache.ivy.plugins.matcher;

import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes6.dex */
public final class MatcherHelper {
    public static boolean matches(PatternMatcher patternMatcher, String str, String str2) {
        return patternMatcher.getMatcher(str).matches(str2);
    }

    public static boolean matches(PatternMatcher patternMatcher, ModuleId moduleId, ModuleId moduleId2) {
        return matches(patternMatcher, moduleId.getOrganisation(), moduleId2.getOrganisation()) && matches(patternMatcher, moduleId.getName(), moduleId2.getName());
    }

    public static boolean matches(PatternMatcher patternMatcher, ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
        return matches(patternMatcher, moduleRevisionId.getOrganisation(), moduleRevisionId2.getOrganisation()) && matches(patternMatcher, moduleRevisionId.getName(), moduleRevisionId2.getName()) && matches(patternMatcher, moduleRevisionId.getRevision(), moduleRevisionId2.getRevision());
    }

    public static boolean matches(PatternMatcher patternMatcher, ArtifactId artifactId, ArtifactId artifactId2) {
        return matches(patternMatcher, artifactId.getModuleId(), artifactId2.getModuleId()) && matches(patternMatcher, artifactId.getName(), artifactId2.getName()) && matches(patternMatcher, artifactId.getExt(), artifactId2.getExt()) && matches(patternMatcher, artifactId.getType(), artifactId2.getType());
    }

    public static boolean isExact(PatternMatcher patternMatcher, ModuleRevisionId moduleRevisionId) {
        return isExact(patternMatcher, moduleRevisionId.getOrganisation()) && isExact(patternMatcher, moduleRevisionId.getName()) && isExact(patternMatcher, moduleRevisionId.getRevision());
    }

    public static boolean isExact(PatternMatcher patternMatcher, ModuleId moduleId) {
        return isExact(patternMatcher, moduleId.getOrganisation()) && isExact(patternMatcher, moduleId.getName());
    }

    public static boolean isExact(PatternMatcher patternMatcher, String str) {
        return patternMatcher.getMatcher(str).isExact();
    }
}
