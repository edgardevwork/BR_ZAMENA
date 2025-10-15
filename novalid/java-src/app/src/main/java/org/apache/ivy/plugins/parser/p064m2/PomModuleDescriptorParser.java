package org.apache.ivy.plugins.parser.p064m2;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.Configuration;
import org.apache.ivy.core.module.descriptor.DefaultArtifact;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.module.descriptor.License;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolveEngine;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.osgi.updatesite.xml.FeatureParser;
import org.apache.ivy.plugins.circular.CircularDependencyException;
import org.apache.ivy.plugins.namespace.NameSpaceHelper;
import org.apache.ivy.plugins.parser.ModuleDescriptorParser;
import org.apache.ivy.plugins.parser.ParserSettings;
import org.apache.ivy.plugins.parser.p064m2.PomModuleDescriptorBuilder;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.parser.xml.XmlModuleDescriptorWriter;
import org.apache.ivy.plugins.repository.Resource;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public final class PomModuleDescriptorParser implements ModuleDescriptorParser {
    public static final PomModuleDescriptorParser INSTANCE = new PomModuleDescriptorParser();
    public static final String PARENT_MAP_KEY = PomModuleDescriptorParser.class.getName() + ".parentMap";

    public static PomModuleDescriptorParser getInstance() {
        return INSTANCE;
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public void toIvyFile(InputStream inputStream, Resource resource, File file, ModuleDescriptor moduleDescriptor) throws IOException, ParseException {
        try {
            XmlModuleDescriptorWriter.write(moduleDescriptor, file);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public boolean accept(Resource resource) {
        return resource.getName().endsWith(".pom") || resource.getName().endsWith("pom.xml") || resource.getName().endsWith("project.xml");
    }

    public String toString() {
        return "pom parser";
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public Artifact getMetadataArtifact(ModuleRevisionId moduleRevisionId, Resource resource) {
        return DefaultArtifact.newPomArtifact(moduleRevisionId, new Date(resource.getLastModified()));
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public String getType() {
        return "pom";
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, boolean z) throws IOException, ParseException {
        return parseDescriptor(parserSettings, url, new URLResource(url), z);
    }

    @Override // org.apache.ivy.plugins.parser.ModuleDescriptorParser
    public ModuleDescriptor parseDescriptor(ParserSettings parserSettings, URL url, Resource resource, boolean z) throws IOException, ParseException {
        ModuleDescriptor descriptor;
        PomModuleDescriptorBuilder pomModuleDescriptorBuilder = new PomModuleDescriptorBuilder(this, resource, parserSettings);
        try {
            try {
                IvyContext ivyContextPushNewCopyContext = IvyContext.pushNewCopyContext();
                String str = PARENT_MAP_KEY;
                Set linkedHashSet = (Set) ivyContextPushNewCopyContext.get(str);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    ivyContextPushNewCopyContext.set(str, linkedHashSet);
                }
                PomReader pomReader = new PomReader(url, resource);
                pomReader.setProperty("parent.version", pomReader.getParentVersion());
                pomReader.setProperty("parent.groupId", pomReader.getParentGroupId());
                pomReader.setProperty("project.parent.version", pomReader.getParentVersion());
                pomReader.setProperty("project.parent.groupId", pomReader.getParentGroupId());
                Message.debug("parent.groupId: " + pomReader.getParentGroupId());
                Message.debug("parent.artifactId: " + pomReader.getParentArtifactId());
                Message.debug("parent.version: " + pomReader.getParentVersion());
                for (Map.Entry<String, String> entry : pomReader.getPomProperties().entrySet()) {
                    pomReader.setProperty(entry.getKey(), entry.getValue());
                    pomModuleDescriptorBuilder.addProperty(entry.getKey(), entry.getValue());
                }
                ArrayList<PomReader.PomProfileElement> arrayList = new ArrayList();
                for (PomReader.PomProfileElement pomProfileElement : pomReader.getProfiles()) {
                    if (pomProfileElement.isActive()) {
                        arrayList.add(pomProfileElement);
                        Map<String, String> profileProperties = pomProfileElement.getProfileProperties();
                        if (!profileProperties.isEmpty()) {
                            for (Map.Entry<String, String> entry2 : profileProperties.entrySet()) {
                                pomReader.setProperty(entry2.getKey(), entry2.getValue());
                                pomModuleDescriptorBuilder.addProperty(entry2.getKey(), entry2.getValue());
                            }
                        }
                    }
                }
                if (pomReader.hasParent()) {
                    ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(pomReader.getParentGroupId(), pomReader.getParentArtifactId(), pomReader.getParentVersion());
                    if (linkedHashSet.contains(moduleRevisionIdNewInstance)) {
                        throw new CircularDependencyException(linkedHashSet);
                    }
                    linkedHashSet.add(moduleRevisionIdNewInstance);
                    ResolvedModuleRevision otherPom = parseOtherPom(parserSettings, moduleRevisionIdNewInstance, true);
                    if (otherPom == null) {
                        throw new IOException("Impossible to load parent for " + resource.getName() + ". Parent=" + moduleRevisionIdNewInstance);
                    }
                    descriptor = otherPom.getDescriptor();
                    if (descriptor != null) {
                        for (Map.Entry<String, String> entry3 : PomModuleDescriptorBuilder.extractPomProperties(descriptor.getExtraInfos()).entrySet()) {
                            pomReader.setProperty(entry3.getKey(), entry3.getValue());
                        }
                    }
                } else {
                    descriptor = null;
                }
                String groupId = pomReader.getGroupId();
                String artifactId = pomReader.getArtifactId();
                String version = pomReader.getVersion();
                pomModuleDescriptorBuilder.setModuleRevId(groupId, artifactId, version);
                pomModuleDescriptorBuilder.setHomePage(pomReader.getHomePage());
                pomModuleDescriptorBuilder.setDescription(pomReader.getDescription());
                License[] licenses = pomReader.getLicenses();
                if (licenses != null && licenses.length > 0) {
                    pomModuleDescriptorBuilder.setLicenses(licenses);
                } else if (descriptor != null) {
                    pomModuleDescriptorBuilder.setLicenses(descriptor.getLicenses());
                }
                ModuleRevisionId relocation = pomReader.getRelocation();
                int i = 0;
                if (relocation != null) {
                    if (groupId != null && artifactId != null && artifactId.equals(relocation.getName()) && groupId.equals(relocation.getOrganisation())) {
                        Message.error("Relocation to an other version number not supported in ivy : " + pomModuleDescriptorBuilder.getModuleDescriptor().getModuleRevisionId() + " relocated to " + relocation + ". Please update your dependency to directly use the right version.");
                        Message.warn("Resolution will only pick dependencies of the relocated element.  Artifact and other metadata will be ignored.");
                        ResolvedModuleRevision otherPom2 = parseOtherPom(parserSettings, relocation, false);
                        if (otherPom2 == null) {
                            throw new ParseException("impossible to load module " + relocation + " to which " + pomModuleDescriptorBuilder.getModuleDescriptor().getModuleRevisionId() + " has been relocated", 0);
                        }
                        DependencyDescriptor[] dependencies = otherPom2.getDescriptor().getDependencies();
                        int length = dependencies.length;
                        while (i < length) {
                            pomModuleDescriptorBuilder.addDependency(dependencies[i]);
                            i++;
                        }
                    } else {
                        Message.info(pomModuleDescriptorBuilder.getModuleDescriptor().getModuleRevisionId() + " is relocated to " + relocation + ". Please update your dependencies.");
                        Message.verbose("Relocated module will be considered as a dependency");
                        DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(pomModuleDescriptorBuilder.getModuleDescriptor(), relocation, true, false, true);
                        Configuration[] configurationArr = PomModuleDescriptorBuilder.MAVEN2_CONFIGURATIONS;
                        int length2 = configurationArr.length;
                        while (i < length2) {
                            Configuration configuration = configurationArr[i];
                            if (Configuration.Visibility.PUBLIC.equals(configuration.getVisibility())) {
                                defaultDependencyDescriptor.addDependencyConfiguration(configuration.getName(), configuration.getName());
                            }
                            i++;
                        }
                        pomModuleDescriptorBuilder.addDependency(defaultDependencyDescriptor);
                    }
                } else {
                    pomReader.setProperty("project.groupId", groupId);
                    pomReader.setProperty("pom.groupId", groupId);
                    pomReader.setProperty(PomReader.GROUP_ID, groupId);
                    pomReader.setProperty("project.artifactId", artifactId);
                    pomReader.setProperty("pom.artifactId", artifactId);
                    pomReader.setProperty(PomReader.ARTIFACT_ID, artifactId);
                    pomReader.setProperty("project.version", version);
                    pomReader.setProperty("pom.version", version);
                    pomReader.setProperty("version", version);
                    if (descriptor != null) {
                        pomModuleDescriptorBuilder.addExtraInfos(descriptor.getExtraInfos());
                        for (PomDependencyMgt pomDependencyMgtElement : PomModuleDescriptorBuilder.getDependencyManagements(descriptor)) {
                            if (pomDependencyMgtElement instanceof PomReader.PomDependencyMgtElement) {
                                pomDependencyMgtElement = new PomReader.PomDependencyMgtElement(pomReader, (PomReader.PomDependencyMgtElement) pomDependencyMgtElement);
                            }
                            pomModuleDescriptorBuilder.addDependencyMgt(pomDependencyMgtElement);
                        }
                        Iterator<PomDependencyMgt> it = PomModuleDescriptorBuilder.getPlugins(descriptor).iterator();
                        while (it.hasNext()) {
                            pomModuleDescriptorBuilder.addPlugin(it.next());
                        }
                    }
                    Iterator<PomDependencyMgt> it2 = pomReader.getDependencyMgt().iterator();
                    while (it2.hasNext()) {
                        addTo(pomModuleDescriptorBuilder, it2.next(), parserSettings);
                    }
                    Iterator<PomReader.PomDependencyData> it3 = pomReader.getDependencies().iterator();
                    while (it3.hasNext()) {
                        pomModuleDescriptorBuilder.addDependency(resource, it3.next());
                    }
                    Iterator<PomReader.PomPluginElement> it4 = pomReader.getPlugins().iterator();
                    while (it4.hasNext()) {
                        pomModuleDescriptorBuilder.addPlugin((PomReader.PomPluginElement) it4.next());
                    }
                    for (PomReader.PomProfileElement pomProfileElement2 : arrayList) {
                        Iterator<PomDependencyMgt> it5 = pomProfileElement2.getDependencyMgt().iterator();
                        while (it5.hasNext()) {
                            addTo(pomModuleDescriptorBuilder, it5.next(), parserSettings);
                        }
                        Iterator<PomReader.PomDependencyData> it6 = pomProfileElement2.getDependencies().iterator();
                        while (it6.hasNext()) {
                            pomModuleDescriptorBuilder.addDependency(resource, it6.next());
                        }
                        Iterator<PomReader.PomPluginElement> it7 = pomProfileElement2.getPlugins().iterator();
                        while (it7.hasNext()) {
                            pomModuleDescriptorBuilder.addPlugin((PomReader.PomPluginElement) it7.next());
                        }
                    }
                    if (descriptor != null) {
                        DependencyDescriptor[] dependencies2 = descriptor.getDependencies();
                        int length3 = dependencies2.length;
                        while (i < length3) {
                            DependencyDescriptor dependencyDescriptor = dependencies2[i];
                            if (dependencyDescriptor instanceof PomModuleDescriptorBuilder.PomDependencyDescriptor) {
                                pomModuleDescriptorBuilder.addDependency(resource, new PomReader.PomDependencyData(pomReader, ((PomModuleDescriptorBuilder.PomDependencyDescriptor) dependencyDescriptor).getPomDependencyData()));
                            } else {
                                pomModuleDescriptorBuilder.addDependency(dependencyDescriptor);
                            }
                            i++;
                        }
                    }
                    pomModuleDescriptorBuilder.addMainArtifact(artifactId, pomReader.getPackaging());
                    addSourcesAndJavadocArtifactsIfPresent(pomModuleDescriptorBuilder, parserSettings);
                }
                IvyContext.popContext();
                return pomModuleDescriptorBuilder.getModuleDescriptor();
            } catch (SAXException e) {
                throw newParserException(e);
            }
        } catch (Throwable th) {
            IvyContext.popContext();
            throw th;
        }
    }

    public final void addTo(PomModuleDescriptorBuilder pomModuleDescriptorBuilder, PomDependencyMgt pomDependencyMgt, ParserSettings parserSettings) throws IOException, ParseException {
        if (FeatureParser.ImportHandler.IMPORT.equals(pomDependencyMgt.getScope())) {
            ModuleRevisionId moduleRevisionIdNewInstance = ModuleRevisionId.newInstance(pomDependencyMgt.getGroupId(), pomDependencyMgt.getArtifactId(), pomDependencyMgt.getVersion());
            ResolvedModuleRevision otherPom = parseOtherPom(parserSettings, moduleRevisionIdNewInstance, false);
            if (otherPom == null) {
                throw new IOException("Impossible to import module for " + pomModuleDescriptorBuilder.getModuleDescriptor().getResource().getName() + ". Import=" + moduleRevisionIdNewInstance);
            }
            for (PomDependencyMgt pomDependencyMgt2 : PomModuleDescriptorBuilder.getDependencyManagements(otherPom.getDescriptor())) {
                pomModuleDescriptorBuilder.addDependencyMgt(new DefaultPomDependencyMgt(pomDependencyMgt2.getGroupId(), pomDependencyMgt2.getArtifactId(), pomDependencyMgt2.getVersion(), pomDependencyMgt2.getScope(), pomDependencyMgt2.getExcludedModules()));
            }
            return;
        }
        pomModuleDescriptorBuilder.addDependencyMgt(pomDependencyMgt);
    }

    public final void addSourcesAndJavadocArtifactsIfPresent(PomModuleDescriptorBuilder pomModuleDescriptorBuilder, ParserSettings parserSettings) {
        if (pomModuleDescriptorBuilder.getMainArtifact() == null) {
            return;
        }
        boolean z = !"false".equals(parserSettings.getVariable("ivy.maven.lookup.sources"));
        boolean z2 = !"false".equals(parserSettings.getVariable("ivy.maven.lookup.javadoc"));
        if (!z && !z2) {
            Message.debug("Sources and javadocs lookup disabled");
            return;
        }
        ModuleRevisionId moduleRevisionId = pomModuleDescriptorBuilder.getModuleDescriptor().getModuleRevisionId();
        DependencyResolver resolver = parserSettings.getResolver(moduleRevisionId);
        if (resolver == null) {
            Message.debug("no resolver found for " + moduleRevisionId + ": no source or javadoc artifact lookup");
            return;
        }
        ArtifactOrigin artifactOriginLocate = resolver.locate(pomModuleDescriptorBuilder.getMainArtifact());
        if (ArtifactOrigin.isUnknown(artifactOriginLocate)) {
            return;
        }
        String location = artifactOriginLocate.getLocation();
        if (z) {
            ArtifactOrigin artifactOriginLocate2 = resolver.locate(pomModuleDescriptorBuilder.getSourceArtifact());
            if (!ArtifactOrigin.isUnknown(artifactOriginLocate2) && !artifactOriginLocate2.getLocation().equals(location)) {
                Message.debug("source artifact found for " + moduleRevisionId);
                pomModuleDescriptorBuilder.addSourceArtifact();
            } else {
                ArtifactOrigin artifactOriginLocate3 = resolver.locate(pomModuleDescriptorBuilder.getSrcArtifact());
                if (!ArtifactOrigin.isUnknown(artifactOriginLocate3) && !artifactOriginLocate3.getLocation().equals(location)) {
                    Message.debug("source artifact found for " + moduleRevisionId);
                    pomModuleDescriptorBuilder.addSrcArtifact();
                } else {
                    Message.debug("no source artifact found for " + moduleRevisionId);
                }
            }
        } else {
            Message.debug("sources lookup disabled");
        }
        if (z2) {
            ArtifactOrigin artifactOriginLocate4 = resolver.locate(pomModuleDescriptorBuilder.getJavadocArtifact());
            if (!ArtifactOrigin.isUnknown(artifactOriginLocate4) && !artifactOriginLocate4.getLocation().equals(location)) {
                Message.debug("javadoc artifact found for " + moduleRevisionId);
                pomModuleDescriptorBuilder.addJavadocArtifact();
                return;
            }
            Message.debug("no javadoc artifact found for " + moduleRevisionId);
            return;
        }
        Message.debug("javadocs lookup disabled");
    }

    public final ResolvedModuleRevision parseOtherPom(ParserSettings parserSettings, ModuleRevisionId moduleRevisionId, boolean z) throws ParseException {
        Set set;
        if (z) {
            set = null;
        } else {
            IvyContext context = IvyContext.getContext();
            String str = PARENT_MAP_KEY;
            set = (Set) context.get(str);
            if (set != null) {
                IvyContext.getContext().set(str, null);
            }
        }
        try {
            DefaultDependencyDescriptor defaultDependencyDescriptor = new DefaultDependencyDescriptor(moduleRevisionId, true);
            ResolveData resolveData = IvyContext.getContext().getResolveData();
            if (resolveData == null) {
                ResolveEngine resolveEngine = IvyContext.getContext().getIvy().getResolveEngine();
                ResolveOptions resolveOptions = new ResolveOptions();
                resolveOptions.setDownload(false);
                resolveData = new ResolveData(resolveEngine, resolveOptions);
            }
            DependencyResolver resolver = parserSettings.getResolver(moduleRevisionId);
            if (resolver == null) {
                if (!z) {
                    IvyContext.getContext().set(PARENT_MAP_KEY, set);
                }
                return null;
            }
            ResolvedModuleRevision dependency = resolver.getDependency(NameSpaceHelper.toSystem(defaultDependencyDescriptor, parserSettings.getContextNamespace()), resolveData);
            if (!z) {
                IvyContext.getContext().set(PARENT_MAP_KEY, set);
            }
            return dependency;
        } catch (Throwable th) {
            if (!z) {
                IvyContext.getContext().set(PARENT_MAP_KEY, set);
            }
            throw th;
        }
    }

    public final ParseException newParserException(Exception exc) {
        Message.error(exc.getMessage());
        ParseException parseException = new ParseException(exc.getMessage(), 0);
        parseException.initCause(exc);
        return parseException;
    }
}
