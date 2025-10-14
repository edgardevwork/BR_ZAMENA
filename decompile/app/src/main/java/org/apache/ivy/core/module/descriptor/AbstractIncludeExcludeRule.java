package org.apache.ivy.core.module.descriptor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.util.extendable.UnmodifiableExtendableItem;

/* loaded from: classes8.dex */
public abstract class AbstractIncludeExcludeRule extends UnmodifiableExtendableItem implements ConfigurationAware {
    public final Collection<String> confs;

    /* renamed from: id */
    public ArtifactId f9959id;
    public PatternMatcher patternMatcher;

    public AbstractIncludeExcludeRule(ArtifactId artifactId, PatternMatcher patternMatcher, Map<String, String> map) {
        super(null, map);
        this.confs = new ArrayList();
        this.f9959id = artifactId;
        this.patternMatcher = patternMatcher;
        initStandardAttributes();
    }

    private void initStandardAttributes() {
        setStandardAttribute(IvyPatternHelper.ORGANISATION_KEY, this.f9959id.getModuleId().getOrganisation());
        setStandardAttribute("module", this.f9959id.getModuleId().getName());
        setStandardAttribute("artifact", this.f9959id.getName());
        setStandardAttribute("type", this.f9959id.getType());
        setStandardAttribute(IvyPatternHelper.EXT_KEY, this.f9959id.getExt());
        setStandardAttribute("matcher", this.patternMatcher.getName());
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractIncludeExcludeRule) {
            return getId().equals(((AbstractIncludeExcludeRule) obj).getId());
        }
        return false;
    }

    public int hashCode() {
        return getId().hashCode();
    }

    @Override // org.apache.ivy.core.module.descriptor.ConfigurationAware
    public void addConfiguration(String str) {
        this.confs.add(str);
    }

    public ArtifactId getId() {
        return this.f9959id;
    }

    @Override // org.apache.ivy.core.module.descriptor.ConfigurationAware
    public String[] getConfigurations() {
        Collection<String> collection = this.confs;
        return (String[]) collection.toArray(new String[collection.size()]);
    }

    public PatternMatcher getMatcher() {
        return this.patternMatcher;
    }

    public String toString() {
        return this.f9959id + "(" + this.confs + ")";
    }
}
