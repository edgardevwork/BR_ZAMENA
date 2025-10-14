package org.apache.ivy.core.publish;

import androidx.appcompat.widget.ActivityChooserModel;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.event.publish.EndArtifactPublishEvent;
import org.apache.ivy.core.event.publish.StartArtifactPublishEvent;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.MDArtifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.plugins.parser.xml.UpdateOptions;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorParser;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorUpdater;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.ConfigurationUtils;
import org.apache.ivy.util.Message;
import org.jfrog.build.extractor.clientConfiguration.ClientConfigurationFields;
import org.xml.sax.SAXException;

/* loaded from: classes7.dex */
public class PublishEngine {
    public EventManager eventManager;
    public PublishEngineSettings settings;

    public PublishEngine(PublishEngineSettings publishEngineSettings, EventManager eventManager) {
        this.settings = publishEngineSettings;
        this.eventManager = eventManager;
    }

    public Collection<Artifact> publish(ModuleRevisionId moduleRevisionId, Collection<String> collection, String str, PublishOptions publishOptions) throws IOException {
        ModuleDescriptor resolvedModuleDescriptor;
        Message.info(":: publishing :: " + moduleRevisionId.getModuleId());
        Message.verbose("\tvalidate = " + publishOptions.isValidate());
        long jCurrentTimeMillis = System.currentTimeMillis();
        publishOptions.setSrcIvyPattern(this.settings.substitute(publishOptions.getSrcIvyPattern()));
        if (publishOptions.getPubBranch() == null) {
            publishOptions.setPubbranch(moduleRevisionId.getBranch());
        }
        if (publishOptions.getPubrevision() == null) {
            publishOptions.setPubrevision(moduleRevisionId.getRevision());
        }
        ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(moduleRevisionId, publishOptions.getPubBranch(), publishOptions.getPubrevision());
        if (publishOptions.getSrcIvyPattern() != null) {
            File fileResolveFile = this.settings.resolveFile(IvyPatternHelper.substitute(publishOptions.getSrcIvyPattern(), DefaultArtifact.newIvyArtifact(moduleRevisionIdNewInstance, new Date())));
            if (!fileResolveFile.exists()) {
                throw new IllegalArgumentException("ivy file to publish not found for " + moduleRevisionId + ": call deliver before (" + fileResolveFile + ")");
            }
            URL url = fileResolveFile.toURI().toURL();
            try {
                resolvedModuleDescriptor = XmlModuleDescriptorParser.getInstance().parseDescriptor(this.settings, url, false);
                if (publishOptions.isUpdate()) {
                    File fileCreateTempFile = File.createTempFile(ClientConfigurationFields.IVY, ActivityChooserModel.HISTORY_FILE_EXTENSION);
                    fileCreateTempFile.deleteOnExit();
                    String[] strArrReplaceWildcards = ConfigurationUtils.replaceWildcards(publishOptions.getConfs(), resolvedModuleDescriptor);
                    HashSet hashSet = new HashSet(Arrays.asList(resolvedModuleDescriptor.getConfigurationsNames()));
                    hashSet.removeAll(Arrays.asList(strArrReplaceWildcards));
                    try {
                        XmlModuleDescriptorUpdater.update(url, fileCreateTempFile, new UpdateOptions().setSettings(this.settings).setStatus(publishOptions.getStatus() == null ? resolvedModuleDescriptor.getStatus() : publishOptions.getStatus()).setRevision(publishOptions.getPubrevision()).setBranch(publishOptions.getPubBranch()).setPubdate(publishOptions.getPubdate() == null ? new Date() : publishOptions.getPubdate()).setMerge(publishOptions.isMerge()).setMergedDescriptor(resolvedModuleDescriptor).setConfsToExclude((String[]) hashSet.toArray(new String[hashSet.size()])));
                        try {
                            resolvedModuleDescriptor = XmlModuleDescriptorParser.getInstance().parseDescriptor(this.settings, fileCreateTempFile.toURI().toURL(), false);
                            publishOptions.setSrcIvyPattern(fileCreateTempFile.getAbsolutePath());
                        } catch (ParseException e) {
                            e = e;
                            fileResolveFile = fileCreateTempFile;
                            throw new IllegalStateException("bad ivy file for " + moduleRevisionId + ": " + fileResolveFile + ": " + e);
                        } catch (SAXException e2) {
                            e = e2;
                            fileResolveFile = fileCreateTempFile;
                            throw new IllegalStateException("bad ivy file for " + moduleRevisionId + ": " + fileResolveFile + ": " + e);
                        }
                    } catch (SAXException e3) {
                        e = e3;
                    }
                } else if (!publishOptions.getPubrevision().equals(resolvedModuleDescriptor.getModuleRevisionId().getRevision())) {
                    throw new IllegalArgumentException("cannot publish " + fileResolveFile + " as " + publishOptions.getPubrevision() + ": bad revision found in ivy file (Revision: " + resolvedModuleDescriptor.getModuleRevisionId().getRevision() + "). Use forcedeliver or update.");
                }
            } catch (ParseException e4) {
                e = e4;
            }
        } else {
            try {
                resolvedModuleDescriptor = this.settings.getResolutionCacheManager().getResolvedModuleDescriptor(moduleRevisionId);
                resolvedModuleDescriptor.setResolvedModuleRevisionId(moduleRevisionIdNewInstance);
            } catch (ParseException e5) {
                throw new IllegalStateException("bad ivy file in cache for " + moduleRevisionId + ": " + e5);
            }
        }
        DependencyResolver resolver = this.settings.getResolver(str);
        if (resolver == null) {
            throw new IllegalArgumentException("unknown resolver " + str);
        }
        Collection<Artifact> collectionPublish = publish(resolvedModuleDescriptor, collection, resolver, publishOptions);
        Message.verbose("\tpublish done (" + (System.currentTimeMillis() - jCurrentTimeMillis) + "ms)");
        return collectionPublish;
    }

    public Collection<Artifact> publish(ModuleDescriptor moduleDescriptor, Collection<String> collection, DependencyResolver dependencyResolver, PublishOptions publishOptions) throws IOException {
        ArrayList arrayList = new ArrayList();
        LinkedHashSet<Artifact> linkedHashSet = new LinkedHashSet();
        for (String str : ConfigurationUtils.replaceWildcards(publishOptions.getConfs(), moduleDescriptor)) {
            linkedHashSet.addAll(Arrays.asList(moduleDescriptor.getArtifacts(str)));
        }
        Artifact[] extraArtifacts = publishOptions.getExtraArtifacts();
        if (extraArtifacts != null) {
            for (Artifact artifact : extraArtifacts) {
                linkedHashSet.add(new MDArtifact(moduleDescriptor, artifact.getName(), artifact.getType(), artifact.getExt(), artifact.getUrl(), artifact.getQualifiedExtraAttributes()));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Artifact artifact2 : linkedHashSet) {
            Iterator<String> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                PublishEngineSettings publishEngineSettings = this.settings;
                File fileResolveFile = publishEngineSettings.resolveFile(IvyPatternHelper.substitute(publishEngineSettings.substitute(next), artifact2));
                if (fileResolveFile.exists()) {
                    linkedHashMap.put(artifact2, fileResolveFile);
                    break;
                }
            }
            if (!linkedHashMap.containsKey(artifact2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("missing artifact ");
                sb.append(artifact2);
                sb.append(":\n");
                for (String str2 : collection) {
                    sb.append("\t");
                    sb.append(this.settings.resolveFile(IvyPatternHelper.substitute(str2, artifact2)));
                    sb.append(" file does not exist\n");
                }
                if (publishOptions.isWarnOnMissing() || publishOptions.isHaltOnMissing()) {
                    Message.warn(sb.toString());
                } else {
                    Message.verbose(sb.toString());
                }
                if (publishOptions.isHaltOnMissing()) {
                    throw new IOException("missing artifact " + artifact2);
                }
                arrayList.add(artifact2);
            }
        }
        if (publishOptions.getSrcIvyPattern() != null) {
            Artifact artifactNewIvyArtifact = MDArtifact.newIvyArtifact(moduleDescriptor);
            File fileResolveFile2 = this.settings.resolveFile(IvyPatternHelper.substitute(publishOptions.getSrcIvyPattern(), artifactNewIvyArtifact));
            if (!fileResolveFile2.exists()) {
                String str3 = "missing ivy file for " + moduleDescriptor.getModuleRevisionId() + ": \n" + fileResolveFile2 + " file does not exist";
                if (publishOptions.isWarnOnMissing() || publishOptions.isHaltOnMissing()) {
                    Message.warn(str3);
                } else {
                    Message.verbose(str3);
                }
                if (publishOptions.isHaltOnMissing()) {
                    throw new IOException("missing ivy artifact " + artifactNewIvyArtifact);
                }
                arrayList.add(artifactNewIvyArtifact);
            } else {
                linkedHashMap.put(artifactNewIvyArtifact, fileResolveFile2);
            }
        }
        try {
            dependencyResolver.beginPublishTransaction(moduleDescriptor.getModuleRevisionId(), publishOptions.isOverwrite());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                publish((Artifact) entry.getKey(), (File) entry.getValue(), dependencyResolver, publishOptions.isOverwrite());
            }
            dependencyResolver.commitPublishTransaction();
            return arrayList;
        } catch (Throwable th) {
            dependencyResolver.abortPublishTransaction();
            throw th;
        }
    }

    public final void publish(Artifact artifact, File file, DependencyResolver dependencyResolver, boolean z) throws IOException {
        IvyContext.getContext().checkInterrupted();
        this.eventManager.fireIvyEvent(new StartArtifactPublishEvent(dependencyResolver, artifact, file, z));
        boolean z2 = false;
        try {
            if (file.exists()) {
                dependencyResolver.publish(artifact, file, z);
                z2 = true;
            }
            this.eventManager.fireIvyEvent(new EndArtifactPublishEvent(dependencyResolver, artifact, file, z, z2));
        } catch (Throwable th) {
            this.eventManager.fireIvyEvent(new EndArtifactPublishEvent(dependencyResolver, artifact, file, z, false));
            throw th;
        }
    }
}
