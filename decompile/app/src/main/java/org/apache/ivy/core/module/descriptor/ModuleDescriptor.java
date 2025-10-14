package org.apache.ivy.core.module.descriptor;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.ivy.core.module.p062id.ArtifactId;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.module.p062id.ModuleRules;
import org.apache.ivy.plugins.conflict.ConflictManager;
import org.apache.ivy.plugins.latest.ArtifactInfo;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.version.VersionMatcher;
import org.apache.ivy.util.extendable.ExtendableItem;

/* loaded from: classes7.dex */
public interface ModuleDescriptor extends ExtendableItem, ArtifactInfo, DependencyDescriptorMediator {
    public static final String CALLER_ALL_CONFIGURATION = "all";
    public static final String DEFAULT_CONFIGURATION = "default";

    boolean canExclude();

    boolean dependsOn(VersionMatcher versionMatcher, ModuleDescriptor moduleDescriptor);

    boolean doesExclude(String[] strArr, ArtifactId artifactId);

    Artifact[] getAllArtifacts();

    ModuleRules<DependencyDescriptorMediator> getAllDependencyDescriptorMediators();

    ExcludeRule[] getAllExcludeRules();

    Artifact[] getArtifacts(String str);

    Configuration getConfiguration(String str);

    Configuration[] getConfigurations();

    String[] getConfigurationsNames();

    ConflictManager getConflictManager(ModuleId moduleId);

    DependencyDescriptor[] getDependencies();

    String getDescription();

    Map<String, String> getExtraAttributesNamespaces();

    @Deprecated
    Map<String, String> getExtraInfo();

    ExtraInfoHolder getExtraInfoByTagName(String str);

    String getExtraInfoContentByTagName(String str);

    List<ExtraInfoHolder> getExtraInfos();

    String getHomePage();

    ExtendsDescriptor[] getInheritedDescriptors();

    long getLastModified();

    License[] getLicenses();

    Artifact getMetadataArtifact();

    ModuleRevisionId getModuleRevisionId();

    ModuleDescriptorParser getParser();

    String[] getPublicConfigurationsNames();

    Date getPublicationDate();

    ModuleRevisionId getResolvedModuleRevisionId();

    Date getResolvedPublicationDate();

    Resource getResource();

    String getStatus();

    boolean isDefault();

    void setResolvedModuleRevisionId(ModuleRevisionId moduleRevisionId);

    void setResolvedPublicationDate(Date date);

    void toIvyFile(File file) throws IOException, ParseException;
}
