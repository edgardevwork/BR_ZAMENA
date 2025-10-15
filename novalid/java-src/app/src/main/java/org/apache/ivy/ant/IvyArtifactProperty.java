package org.apache.ivy.ant;

import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.plugins.report.XmlReportParser;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;

/* loaded from: classes8.dex */
public class IvyArtifactProperty extends IvyPostResolveTask {
    public String name;
    public boolean overwrite = false;
    public String value;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setOverwrite(boolean z) {
        this.overwrite = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        prepareAndCheck();
        try {
            ResolutionCacheManager resolutionCacheManager = getIvyInstance().getResolutionCacheManager();
            String resolveId = getResolveId();
            if (resolveId == null) {
                resolveId = ResolveOptions.getDefaultResolveId(getResolvedModuleId());
            }
            XmlReportParser xmlReportParser = new XmlReportParser();
            for (String str : StringUtils.splitToArray(getConf())) {
                xmlReportParser.parse(resolutionCacheManager.getConfigurationResolveReportInCache(resolveId, str));
                for (Artifact artifact : xmlReportParser.getArtifacts()) {
                    setProperty(IvyPatternHelper.substitute(getSettings().substitute(getName()), artifact, str), IvyPatternHelper.substitute(getSettings().substitute(getValue()), artifact, str));
                }
            }
        } catch (Exception e) {
            throw new BuildException("impossible to add artifact properties: " + e, e);
        }
    }

    private void setProperty(String str, String str2) {
        if (this.overwrite) {
            getProject().setProperty(str, str2);
        } else {
            getProject().setNewProperty(str, str2);
        }
    }
}
