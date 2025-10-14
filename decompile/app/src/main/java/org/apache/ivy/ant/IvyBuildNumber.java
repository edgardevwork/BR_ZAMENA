package org.apache.ivy.ant;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.regex.Pattern;
import org.apache.commons.compress.harmony.unpack200.SegmentConstantPool;
import org.apache.ivy.Ivy;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.search.SearchEngine;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.matcher.ExactOrRegexpPatternMatcher;
import org.apache.ivy.plugins.matcher.ExactPatternMatcher;
import org.apache.ivy.plugins.matcher.Matcher;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;

/* loaded from: classes7.dex */
public class IvyBuildNumber extends IvyTask {
    public String branch;
    public String module;
    public String organisation;
    public String revision;
    public String revSep = ".";
    public String prefix = "ivy.";
    public String defaultValue = "0";
    public String defaultBuildNumber = "0";
    public String resolver = null;

    public static class ResolvedModuleRevisionArtifactInfo implements ArtifactInfo {
        public ModuleRevisionId rmr;

        @Override // org.apache.ivy.plugins.latest.ArtifactInfo
        public long getLastModified() {
            return -1L;
        }

        public ResolvedModuleRevisionArtifactInfo(ModuleRevisionId moduleRevisionId) {
            this.rmr = moduleRevisionId;
        }

        @Override // org.apache.ivy.plugins.latest.ArtifactInfo
        public String getRevision() {
            return this.rmr.getRevision();
        }
    }

    public String getModule() {
        return this.module;
    }

    public void setModule(String str) {
        this.module = str;
    }

    public String getOrganisation() {
        return this.organisation;
    }

    public void setOrganisation(String str) {
        this.organisation = str;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String str) {
        this.revision = str;
    }

    public String getBranch() {
        return this.branch;
    }

    public void setBranch(String str) {
        this.branch = str;
    }

    public String getDefault() {
        return this.defaultValue;
    }

    public void setDefault(String str) {
        this.defaultValue = str;
    }

    public String getResolver() {
        return this.resolver;
    }

    public void setResolver(String str) {
        this.resolver = str;
    }

    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String str) {
        this.prefix = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException, NumberFormatException {
        ModuleRevisionId[] moduleRevisionIdArrListModules;
        if (this.organisation == null) {
            throw new BuildException("no organisation provided for ivy buildnumber task");
        }
        if (this.module == null) {
            throw new BuildException("no module name provided for ivy buildnumber task");
        }
        if (this.prefix == null) {
            throw new BuildException("null prefix not allowed");
        }
        Ivy ivyInstance = getIvyInstance();
        IvySettings settings = ivyInstance.getSettings();
        if (this.branch == null) {
            this.branch = settings.getDefaultBranch(new ModuleId(this.organisation, this.module));
        }
        if (StringUtils.isNullOrEmpty(this.revision)) {
            this.revision = "latest.integration";
        } else if (!this.revision.endsWith("+")) {
            this.revision += "+";
        }
        if (!this.prefix.endsWith(".") && !this.prefix.isEmpty()) {
            this.prefix += ".";
        }
        SearchEngine searchEngine = new SearchEngine(settings);
        PatternMatcher patternMatcher = new PatternMatcher() { // from class: org.apache.ivy.ant.IvyBuildNumber.1
            public PatternMatcher exact = new ExactPatternMatcher();
            public PatternMatcher regexp = new ExactOrRegexpPatternMatcher();

            @Override // org.apache.ivy.plugins.matcher.PatternMatcher
            public Matcher getMatcher(String str) {
                if (str.equals(IvyBuildNumber.this.organisation) || str.equals(IvyBuildNumber.this.module) || str.equals(IvyBuildNumber.this.branch)) {
                    return this.exact.getMatcher(str);
                }
                return this.regexp.getMatcher(str);
            }

            @Override // org.apache.ivy.plugins.matcher.PatternMatcher
            public String getName() {
                return "buildnumber-matcher";
            }
        };
        boolean zEndsWith = this.revision.endsWith("+");
        String string = SegmentConstantPool.REGEX_MATCH_ALL;
        if (zEndsWith) {
            StringBuilder sb = new StringBuilder();
            sb.append(Pattern.quote(this.revision.substring(0, r7.length() - 1)));
            sb.append(SegmentConstantPool.REGEX_MATCH_ALL);
            string = sb.toString();
        }
        ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, string);
        String str = this.resolver;
        if (str == null) {
            moduleRevisionIdArrListModules = searchEngine.listModules(moduleRevisionIdNewInstance, patternMatcher);
        } else {
            DependencyResolver resolver = settings.getResolver(str);
            if (resolver == null) {
                throw new BuildException("Unknown resolver: " + this.resolver);
            }
            moduleRevisionIdArrListModules = searchEngine.listModules(resolver, moduleRevisionIdNewInstance, patternMatcher);
        }
        ArrayList arrayList = new ArrayList(moduleRevisionIdArrListModules.length);
        for (ModuleRevisionId moduleRevisionId : moduleRevisionIdArrListModules) {
            arrayList.add(new ResolvedModuleRevisionArtifactInfo(moduleRevisionId));
        }
        VersionMatcher versionMatcher = settings.getVersionMatcher();
        List<ArtifactInfo> listSort = settings.getLatestStrategy("latest-revision").sort((ArtifactInfo[]) arrayList.toArray(new ArtifactInfo[moduleRevisionIdArrListModules.length]));
        ModuleRevisionId moduleRevisionIdNewInstance2 = ModuleRevisionId.newInstance(this.organisation, this.module, this.branch, this.revision);
        ListIterator<ArtifactInfo> listIterator = listSort.listIterator(listSort.size());
        String revision = null;
        while (listIterator.hasPrevious()) {
            ResolvedModuleRevisionArtifactInfo resolvedModuleRevisionArtifactInfo = (ResolvedModuleRevisionArtifactInfo) listIterator.previous();
            if (versionMatcher.accept(moduleRevisionIdNewInstance2, resolvedModuleRevisionArtifactInfo.rmr)) {
                if (!versionMatcher.needModuleDescriptor(moduleRevisionIdNewInstance2, resolvedModuleRevisionArtifactInfo.rmr) || versionMatcher.accept(moduleRevisionIdNewInstance2, ivyInstance.findModule(resolvedModuleRevisionArtifactInfo.rmr).getDescriptor())) {
                    revision = resolvedModuleRevisionArtifactInfo.rmr.getRevision();
                }
                if (revision != null) {
                    break;
                }
            }
        }
        NewRevision newRevisionComputeNewRevision = computeNewRevision(revision);
        setProperty(IvyPatternHelper.REVISION_KEY, newRevisionComputeNewRevision.getRevision());
        setProperty("new.revision", newRevisionComputeNewRevision.getNewRevision());
        setProperty("build.number", newRevisionComputeNewRevision.getBuildNumber());
        setProperty("new.build.number", newRevisionComputeNewRevision.getNewBuildNumber());
    }

    public final void setProperty(String str, String str2) {
        if (str2 != null) {
            getProject().setProperty(this.prefix + str, str2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final NewRevision computeNewRevision(String str) throws BuildException, NumberFormatException {
        String strSubstring;
        Range rangeFindLastNumber;
        String str2;
        String str3;
        String str4;
        if ("latest.integration".equals(this.revision)) {
            strSubstring = "";
        } else {
            strSubstring = this.revision.substring(0, r0.length() - 1);
        }
        if (str != null && !str.startsWith(strSubstring)) {
            throw new BuildException("invalid exception found in repository: '" + str + "' for '" + strSubstring + "'");
        }
        if (str == null) {
            if (strSubstring.length() > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(strSubstring);
                if (strSubstring.endsWith(this.revSep)) {
                    str4 = this.defaultBuildNumber;
                } else {
                    str4 = this.revSep + this.defaultBuildNumber;
                }
                sb.append(str4);
                return new NewRevision(str, sb.toString(), null, this.defaultBuildNumber);
            }
            Range rangeFindLastNumber2 = findLastNumber(this.defaultValue);
            if (rangeFindLastNumber2 == null) {
                return new NewRevision(str, this.defaultValue, null, null);
            }
            return new NewRevision(str, this.defaultValue, null, String.valueOf(Long.parseLong(this.defaultValue.substring(rangeFindLastNumber2.getStartIndex(), rangeFindLastNumber2.getEndIndex()))));
        }
        if (strSubstring.length() == 0) {
            rangeFindLastNumber = findLastNumber(str);
            if (rangeFindLastNumber == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                if (str.endsWith(this.revSep)) {
                    str3 = "1";
                } else {
                    str3 = this.revSep + "1";
                }
                sb2.append(str3);
                return new NewRevision(str, sb2.toString(), null, "1");
            }
        } else {
            Range rangeFindFirstNumber = findFirstNumber(str, strSubstring.length());
            if (rangeFindFirstNumber == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(strSubstring);
                if (strSubstring.endsWith(this.revSep)) {
                    str2 = "1";
                } else {
                    str2 = this.revSep + "1";
                }
                sb3.append(str2);
                return new NewRevision(str, sb3.toString(), null, "1");
            }
            rangeFindLastNumber = rangeFindFirstNumber;
        }
        long j = Long.parseLong(str.substring(rangeFindLastNumber.getStartIndex(), rangeFindLastNumber.getEndIndex()));
        long j2 = 1 + j;
        return new NewRevision(str, str.substring(0, rangeFindLastNumber.getStartIndex()) + j2, String.valueOf(j), String.valueOf(j2));
    }

    public final Range findFirstNumber(String str, int i) {
        while (i < str.length() && !Character.isDigit(str.charAt(i))) {
            i++;
        }
        if (i == str.length()) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < str.length() && Character.isDigit(str.charAt(i2))) {
            i2++;
        }
        return new Range(i, i2);
    }

    public final Range findLastNumber(String str) {
        int length = str.length() - 1;
        while (length >= 0 && !Character.isDigit(str.charAt(length))) {
            length--;
        }
        int i = length != -1 ? length - 1 : -1;
        while (i >= 0 && Character.isDigit(str.charAt(i))) {
            i--;
        }
        int i2 = length + 1;
        int i3 = i + 1;
        if (i3 == i2) {
            return null;
        }
        return new Range(i3, i2);
    }

    public static class Range {
        public int endIndex;
        public int startIndex;

        public Range(int i, int i2) {
            this.startIndex = i;
            this.endIndex = i2;
        }

        public int getStartIndex() {
            return this.startIndex;
        }

        public int getEndIndex() {
            return this.endIndex;
        }
    }

    public static class NewRevision {
        public String buildNumber;
        public String newBuildNumber;
        public String newRevision;
        public String revision;

        public NewRevision(String str, String str2, String str3, String str4) {
            this.revision = str;
            this.newRevision = str2;
            this.buildNumber = str3;
            this.newBuildNumber = str4;
        }

        public String getRevision() {
            return this.revision;
        }

        public String getNewRevision() {
            return this.newRevision;
        }

        public String getBuildNumber() {
            return this.buildNumber;
        }

        public String getNewBuildNumber() {
            return this.newBuildNumber;
        }
    }

    public String getRevSep() {
        return this.revSep;
    }

    public void setRevSep(String str) {
        this.revSep = str;
    }

    public String getDefaultBuildNumber() {
        return this.defaultBuildNumber;
    }

    public void setDefaultBuildNumber(String str) {
        this.defaultBuildNumber = str;
    }
}
