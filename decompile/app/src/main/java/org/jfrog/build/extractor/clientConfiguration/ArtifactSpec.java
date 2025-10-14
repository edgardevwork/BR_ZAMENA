package org.jfrog.build.extractor.clientConfiguration;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes8.dex */
public class ArtifactSpec {
    public static final Pattern ARTIFACT_NOTATION = Pattern.compile("^([^:]+):([^:]+):([^:]+):([^:]+?)(?:\\@([^:]+$)){0,1}$");
    public static final String CONFIG_ALL = "all";
    public static final String WILDCARD = "*";
    public String classifier;
    public String configuration;
    public String group;
    public String name;
    public final Map<String, CharSequence> properties;
    public String type;
    public String version;

    public ArtifactSpec() {
        this.properties = new HashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArtifactSpec newSpec(String str) {
        ArtifactSpec artifactSpecBuild;
        String[] strArrSplit = str.split("\\s+", 3);
        if (strArrSplit.length >= 2) {
            Builder builder = builder();
            if (strArrSplit[1].contains(",")) {
                builder.configuration("*");
                builder.artifactNotation(strArrSplit[0]);
                builder.properties(str.substring(str.indexOf(strArrSplit[1])));
                artifactSpecBuild = builder.build();
            } else if (strArrSplit.length == 3) {
                builder.configuration(strArrSplit[0].equalsIgnoreCase("all") ? "*" : strArrSplit[0]);
                builder.artifactNotation(strArrSplit[1]);
                builder.properties(strArrSplit[2]);
                artifactSpecBuild = builder.build();
            } else {
                artifactSpecBuild = null;
            }
        }
        if (artifactSpecBuild != null) {
            return artifactSpecBuild;
        }
        throw new IllegalArgumentException("Artifact spec notation '" + str + "' is wrong.\nExpecting notation in the format of: '[configName] artifactNotation key1:val1, key2:val2, key3:val3 ...'");
    }

    public static Builder builder() {
        return new Builder();
    }

    public boolean matches(ArtifactSpec artifactSpec) {
        return specValueMatch(this.configuration, artifactSpec.configuration) && specValueMatch(this.group, artifactSpec.group) && specValueMatch(this.name, artifactSpec.name) && specValueMatch(this.version, artifactSpec.version) && specValueMatch(this.classifier, artifactSpec.classifier) && specValueMatch(this.type, artifactSpec.type);
    }

    public final boolean specValueMatch(String str, String str2) {
        if (str == null || "*".equals(str)) {
            return true;
        }
        if (str2 == null || "*".equals(str2)) {
            return false;
        }
        return PatternMatcher.match(str, str2, false);
    }

    public String getConfiguration() {
        return this.configuration;
    }

    public String getGroup() {
        return this.group;
    }

    public String getName() {
        return this.name;
    }

    public String getVersion() {
        return this.version;
    }

    public String getClassifier() {
        return this.classifier;
    }

    public String getType() {
        return this.type;
    }

    public Map<String, CharSequence> getProperties() {
        return this.properties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArtifactSpec)) {
            return false;
        }
        ArtifactSpec artifactSpec = (ArtifactSpec) obj;
        String str = this.classifier;
        if (str == null ? artifactSpec.classifier != null : !str.equals(artifactSpec.classifier)) {
            return false;
        }
        String str2 = this.group;
        if (str2 == null ? artifactSpec.group != null : !str2.equals(artifactSpec.group)) {
            return false;
        }
        if (!this.name.equals(artifactSpec.name)) {
            return false;
        }
        String str3 = this.type;
        if (str3 == null ? artifactSpec.type == null : str3.equals(artifactSpec.type)) {
            return this.version.equals(artifactSpec.version);
        }
        return false;
    }

    public int hashCode() {
        String str = this.group;
        int iHashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.name.hashCode()) * 31) + this.version.hashCode()) * 31;
        String str2 = this.classifier;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.type;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public static class Builder {
        public ArtifactSpec spec;

        public Builder() {
            this.spec = new ArtifactSpec();
        }

        public ArtifactSpec build() {
            return this.spec;
        }

        public Builder artifactNotation(String str) {
            Matcher matcher = ArtifactSpec.ARTIFACT_NOTATION.matcher(str);
            int iGroupCount = matcher.groupCount();
            if (!matcher.matches() || iGroupCount != 5) {
                throw new IllegalArgumentException("Invalid module notation: " + str + ". Expected: group:artifact:version:classifier[@ext].");
            }
            group(matcher.group(1));
            name(matcher.group(2));
            version(matcher.group(3));
            classifier(matcher.group(4));
            type(matcher.group(5));
            return this;
        }

        public Builder group(String str) {
            ArtifactSpec artifactSpec = this.spec;
            if (str == null) {
                str = "*";
            }
            artifactSpec.group = str;
            return this;
        }

        public Builder name(String str) {
            ArtifactSpec artifactSpec = this.spec;
            if (str == null) {
                str = "*";
            }
            artifactSpec.name = str;
            return this;
        }

        public Builder version(String str) {
            ArtifactSpec artifactSpec = this.spec;
            if (str == null) {
                str = "*";
            }
            artifactSpec.version = str;
            return this;
        }

        public Builder classifier(String str) {
            ArtifactSpec artifactSpec = this.spec;
            if (str == null) {
                str = "*";
            }
            artifactSpec.classifier = str;
            return this;
        }

        public Builder type(String str) {
            ArtifactSpec artifactSpec = this.spec;
            if (str == null) {
                str = "*";
            }
            artifactSpec.type = str;
            return this;
        }

        public Builder configuration(String str) {
            ArtifactSpec artifactSpec = this.spec;
            if (str == null || str.equalsIgnoreCase("all")) {
                str = "*";
            }
            artifactSpec.configuration = str;
            return this;
        }

        public Builder properties(Map<String, String> map) {
            if (map != null) {
                this.spec.properties.putAll(map);
                return this;
            }
            throw new IllegalArgumentException("Properties cannot be null");
        }

        public void properties(String str) {
            String[] strArrSplit = str.split(",");
            HashMap map = new HashMap(strArrSplit.length);
            for (String str2 : strArrSplit) {
                String[] strArrSplit2 = str2.split(StringUtils.PROCESS_POSTFIX_DELIMITER);
                if (strArrSplit2.length != 2) {
                    throw new IllegalArgumentException("Illegal key-vals format: " + str + "(" + str2 + "). Expected: key1:val1, key2:val2, ...");
                }
                map.put(strArrSplit2[0].trim(), strArrSplit2[1].trim());
            }
            this.spec.properties.putAll(map);
        }
    }
}
