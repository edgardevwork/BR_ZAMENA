package org.apache.ivy.plugins.latest;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.version.VersionMatcher;

/* loaded from: classes7.dex */
public class LatestRevisionStrategy extends ComparatorLatestStrategy {
    public static final Map<String, Integer> DEFAULT_SPECIAL_MEANINGS;
    public final Comparator<ArtifactInfo> artifactInfoComparator;
    public final Comparator<ModuleRevisionId> mridComparator = new MridComparator();
    public Map<String, Integer> specialMeanings;
    public boolean usedefaultspecialmeanings;

    /* loaded from: classes6.dex */
    public final class MridComparator implements Comparator<ModuleRevisionId> {
        public MridComparator() {
        }

        @Override // java.util.Comparator
        public int compare(ModuleRevisionId moduleRevisionId, ModuleRevisionId moduleRevisionId2) {
            String revision = moduleRevisionId.getRevision();
            String revision2 = moduleRevisionId2.getRevision();
            String strReplaceAll = revision.replaceAll("([a-zA-Z])(\\d)", "$1.$2").replaceAll("(\\d)([a-zA-Z])", "$1.$2");
            String strReplaceAll2 = revision2.replaceAll("([a-zA-Z])(\\d)", "$1.$2").replaceAll("(\\d)([a-zA-Z])", "$1.$2");
            String[] strArrSplit = strReplaceAll.split("[\\._\\-\\+]");
            String[] strArrSplit2 = strReplaceAll2.split("[\\._\\-\\+]");
            int i = 0;
            while (i < strArrSplit.length && i < strArrSplit2.length) {
                if (!strArrSplit[i].equals(strArrSplit2[i])) {
                    boolean zIsNumber = isNumber(strArrSplit[i]);
                    boolean zIsNumber2 = isNumber(strArrSplit2[i]);
                    if (zIsNumber && !zIsNumber2) {
                        return 1;
                    }
                    if (zIsNumber2 && !zIsNumber) {
                        return -1;
                    }
                    if (zIsNumber && zIsNumber2) {
                        return Long.valueOf(strArrSplit[i]).compareTo(Long.valueOf(strArrSplit2[i]));
                    }
                    Map<String, Integer> specialMeanings = LatestRevisionStrategy.this.getSpecialMeanings();
                    String str = strArrSplit[i];
                    Locale locale = Locale.US;
                    Integer num = specialMeanings.get(str.toLowerCase(locale));
                    Integer num2 = specialMeanings.get(strArrSplit2[i].toLowerCase(locale));
                    if (num != null) {
                        if (num2 == null) {
                            num2 = new Integer(0);
                        }
                        return num.compareTo(num2);
                    }
                    if (num2 != null) {
                        return new Integer(0).compareTo(num2);
                    }
                    return strArrSplit[i].compareTo(strArrSplit2[i]);
                }
                i++;
            }
            if (i < strArrSplit.length) {
                return isNumber(strArrSplit[i]) ? 1 : -1;
            }
            if (i < strArrSplit2.length) {
                return isNumber(strArrSplit2[i]) ? -1 : 1;
            }
            return 0;
        }

        public final boolean isNumber(String str) {
            return str.matches("\\d+");
        }
    }

    /* loaded from: classes6.dex */
    public final class ArtifactInfoComparator implements Comparator<ArtifactInfo> {
        public ArtifactInfoComparator() {
        }

        @Override // java.util.Comparator
        public int compare(ArtifactInfo artifactInfo, ArtifactInfo artifactInfo2) {
            String revision = artifactInfo.getRevision();
            String revision2 = artifactInfo2.getRevision();
            VersionMatcher versionMatcher = IvyContext.getContext().getSettings().getVersionMatcher();
            ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance("", "", revision);
            ModuleRevisionId moduleRevisionIdNewInstance2 = ModuleRevisionId.newInstance("", "", revision2);
            if (versionMatcher.isDynamic(moduleRevisionIdNewInstance)) {
                return versionMatcher.compare(moduleRevisionIdNewInstance, moduleRevisionIdNewInstance2, LatestRevisionStrategy.this.mridComparator) >= 0 ? 1 : -1;
            }
            if (versionMatcher.isDynamic(moduleRevisionIdNewInstance2)) {
                return versionMatcher.compare(moduleRevisionIdNewInstance2, moduleRevisionIdNewInstance, LatestRevisionStrategy.this.mridComparator) >= 0 ? -1 : 1;
            }
            return LatestRevisionStrategy.this.mridComparator.compare(moduleRevisionIdNewInstance, moduleRevisionIdNewInstance2);
        }
    }

    /* loaded from: classes6.dex */
    public static class SpecialMeaning {
        public String name;
        public Integer value;

        public String getName() {
            return this.name;
        }

        public void setName(String str) {
            this.name = str;
        }

        public Integer getValue() {
            return this.value;
        }

        public void setValue(Integer num) {
            this.value = num;
        }

        public void validate() {
            if (this.name == null) {
                throw new IllegalStateException("a special meaning should have a name");
            }
            if (this.value == null) {
                throw new IllegalStateException("a special meaning should have a value");
            }
        }
    }

    static {
        HashMap map = new HashMap();
        DEFAULT_SPECIAL_MEANINGS = map;
        map.put("dev", -1);
        map.put("rc", 1);
        map.put("final", 2);
    }

    public LatestRevisionStrategy() {
        ArtifactInfoComparator artifactInfoComparator = new ArtifactInfoComparator();
        this.artifactInfoComparator = artifactInfoComparator;
        this.specialMeanings = null;
        this.usedefaultspecialmeanings = true;
        setComparator(artifactInfoComparator);
        setName("latest-revision");
    }

    public void addConfiguredSpecialMeaning(SpecialMeaning specialMeaning) {
        specialMeaning.validate();
        getSpecialMeanings().put(specialMeaning.getName().toLowerCase(Locale.US), specialMeaning.getValue());
    }

    public synchronized Map<String, Integer> getSpecialMeanings() {
        try {
            if (this.specialMeanings == null) {
                this.specialMeanings = new HashMap();
                if (isUsedefaultspecialmeanings()) {
                    this.specialMeanings.putAll(DEFAULT_SPECIAL_MEANINGS);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.specialMeanings;
    }

    public boolean isUsedefaultspecialmeanings() {
        return this.usedefaultspecialmeanings;
    }

    public void setUsedefaultspecialmeanings(boolean z) {
        this.usedefaultspecialmeanings = z;
    }
}
