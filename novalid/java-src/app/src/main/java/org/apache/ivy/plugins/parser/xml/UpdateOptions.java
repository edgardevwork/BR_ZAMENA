package org.apache.ivy.plugins.parser.xml;

import java.util.Collections;
import java.util.Date;
import java.util.Map;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.namespace.Namespace;
import org.apache.ivy.plugins.parser.ParserSettings;

/* loaded from: classes6.dex */
public class UpdateOptions {
    public String branch;
    public ParserSettings settings = null;
    public Namespace namespace = null;
    public Map<ModuleRevisionId, String> resolvedRevisions = Collections.emptyMap();
    public Map<ModuleRevisionId, String> resolvedBranches = Collections.emptyMap();
    public String status = null;
    public String revision = null;
    public Date pubdate = null;
    public boolean replaceInclude = true;
    public boolean merge = true;
    public ModuleDescriptor mergedDescriptor = null;
    public String[] confsToExclude = null;
    public boolean updateBranch = true;
    public boolean generateRevConstraint = true;

    public ParserSettings getSettings() {
        return this.settings;
    }

    public UpdateOptions setSettings(ParserSettings parserSettings) {
        this.settings = parserSettings;
        return this;
    }

    public Namespace getNamespace() {
        return this.namespace;
    }

    public UpdateOptions setNamespace(Namespace namespace) {
        this.namespace = namespace;
        return this;
    }

    public Map<ModuleRevisionId, String> getResolvedRevisions() {
        return this.resolvedRevisions;
    }

    public UpdateOptions setResolvedRevisions(Map<ModuleRevisionId, String> map) {
        this.resolvedRevisions = map;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public UpdateOptions setStatus(String str) {
        this.status = str;
        return this;
    }

    public String getRevision() {
        return this.revision;
    }

    public UpdateOptions setRevision(String str) {
        this.revision = str;
        return this;
    }

    public Date getPubdate() {
        return this.pubdate;
    }

    public UpdateOptions setPubdate(Date date) {
        this.pubdate = date;
        return this;
    }

    public boolean isReplaceInclude() {
        return this.replaceInclude;
    }

    public UpdateOptions setReplaceInclude(boolean z) {
        this.replaceInclude = z;
        return this;
    }

    public boolean isMerge() {
        ModuleDescriptor moduleDescriptor;
        return this.merge && (moduleDescriptor = this.mergedDescriptor) != null && moduleDescriptor.getInheritedDescriptors().length > 0;
    }

    public UpdateOptions setMerge(boolean z) {
        this.merge = z;
        return this;
    }

    public ModuleDescriptor getMergedDescriptor() {
        return this.mergedDescriptor;
    }

    public UpdateOptions setMergedDescriptor(ModuleDescriptor moduleDescriptor) {
        this.mergedDescriptor = moduleDescriptor;
        return this;
    }

    public String[] getConfsToExclude() {
        return this.confsToExclude;
    }

    public UpdateOptions setConfsToExclude(String[] strArr) {
        this.confsToExclude = strArr;
        return this;
    }

    public boolean isUpdateBranch() {
        return this.updateBranch;
    }

    public UpdateOptions setUpdateBranch(boolean z) {
        this.updateBranch = z;
        return this;
    }

    public String getBranch() {
        return this.branch;
    }

    public UpdateOptions setBranch(String str) {
        this.branch = str;
        return this;
    }

    public boolean isGenerateRevConstraint() {
        return this.generateRevConstraint;
    }

    public UpdateOptions setGenerateRevConstraint(boolean z) {
        this.generateRevConstraint = z;
        return this;
    }

    public Map<ModuleRevisionId, String> getResolvedBranches() {
        return this.resolvedBranches;
    }

    public UpdateOptions setResolvedBranches(Map<ModuleRevisionId, String> map) {
        this.resolvedBranches = map;
        return this;
    }
}
