package org.apache.ivy.ant;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.sax.SAXTransformerFactory;
import javax.xml.transform.sax.TransformerHandler;
import javax.xml.transform.stream.StreamResult;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.retrieve.RetrieveOptions;
import org.apache.ivy.util.StringUtils;
import org.apache.tools.ant.BuildException;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.AttributesImpl;

/* loaded from: classes8.dex */
public class IvyArtifactReport extends IvyPostResolveTask {
    public String pattern;
    public File tofile;

    public File getTofile() {
        return this.tofile;
    }

    public void setTofile(File file) {
        this.tofile = file;
    }

    public String getPattern() {
        return this.pattern;
    }

    public void setPattern(String str) {
        this.pattern = str;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        ModuleDescriptor moduleDescriptor;
        prepareAndCheck();
        if (this.tofile == null) {
            throw new BuildException("no destination file name: please provide it through parameter 'tofile'");
        }
        this.pattern = getProperty(this.pattern, getSettings(), "ivy.retrieve.pattern");
        try {
            String[] strArrSplitToArray = StringUtils.splitToArray(getConf());
            if (getResolveId() == null) {
                moduleDescriptor = (ModuleDescriptor) getResolvedDescriptor(getOrganisation(), getModule(), false);
            } else {
                moduleDescriptor = (ModuleDescriptor) getResolvedDescriptor(getResolveId());
            }
            IvyNode[] dependencies = getIvyInstance().getResolveEngine().getDependencies(moduleDescriptor, ((ResolveOptions) new ResolveOptions().setLog(getLog())).setConfs(strArrSplitToArray).setResolveId(getResolveId()).setValidate(doValidate(getSettings())), null);
            Map<ArtifactDownloadReport, Set<String>> mapDetermineArtifactsToCopy = getIvyInstance().getRetrieveEngine().determineArtifactsToCopy(ModuleRevisionId.newInstance(getOrganisation(), getModule(), getRevision()), this.pattern, ((RetrieveOptions) new RetrieveOptions().setLog(getLog())).setConfs(strArrSplitToArray).setResolveId(getResolveId()));
            HashMap map = new HashMap();
            for (ArtifactDownloadReport artifactDownloadReport : mapDetermineArtifactsToCopy.keySet()) {
                Set<ArtifactDownloadReport> hashSet = map.get(artifactDownloadReport.getArtifact().getModuleRevisionId());
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                    map.put(artifactDownloadReport.getArtifact().getModuleRevisionId(), hashSet);
                }
                hashSet.add(artifactDownloadReport);
            }
            generateXml(dependencies, map, mapDetermineArtifactsToCopy);
        } catch (IOException e) {
            throw new BuildException("impossible to generate report: " + e, e);
        } catch (ParseException e2) {
            log(e2.getMessage(), 0);
            throw new BuildException("syntax errors in ivy file: " + e2, e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final void generateXml(IvyNode[] ivyNodeArr, Map<ModuleRevisionId, Set<ArtifactDownloadReport>> map, Map<ArtifactDownloadReport, Set<String>> map2) throws IOException, BuildException {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.tofile);
            try {
                TransformerHandler transformerHandlerCreateTransformerHandler = createTransformerHandler(fileOutputStream);
                transformerHandlerCreateTransformerHandler.startDocument();
                transformerHandlerCreateTransformerHandler.startElement(null, "modules", "modules", new AttributesImpl());
                for (IvyNode ivyNode : ivyNodeArr) {
                    if (ivyNode.getModuleRevision() != null && !ivyNode.isCompletelyEvicted()) {
                        startModule(transformerHandlerCreateTransformerHandler, ivyNode);
                        Set<ArtifactDownloadReport> set = map.get(ivyNode.getModuleRevision().getId());
                        if (set != null) {
                            for (ArtifactDownloadReport artifactDownloadReport : set) {
                                RepositoryCacheManager repositoryCacheManager = ivyNode.getModuleRevision().getArtifactResolver().getRepositoryCacheManager();
                                startArtifact(transformerHandlerCreateTransformerHandler, artifactDownloadReport.getArtifact());
                                writeOriginLocationIfPresent(repositoryCacheManager, transformerHandlerCreateTransformerHandler, artifactDownloadReport);
                                writeCacheLocationIfPresent(repositoryCacheManager, transformerHandlerCreateTransformerHandler, artifactDownloadReport);
                                Iterator<String> it = map2.get(artifactDownloadReport).iterator();
                                while (it.hasNext()) {
                                    writeRetrieveLocation(transformerHandlerCreateTransformerHandler, it.next());
                                }
                                transformerHandlerCreateTransformerHandler.endElement(null, "artifact", "artifact");
                            }
                        }
                        transformerHandlerCreateTransformerHandler.endElement(null, "module", "module");
                    }
                }
                transformerHandlerCreateTransformerHandler.endElement(null, "modules", "modules");
                transformerHandlerCreateTransformerHandler.endDocument();
                fileOutputStream.close();
            } finally {
            }
        } catch (IOException | TransformerConfigurationException | SAXException e) {
            throw new BuildException("impossible to generate report", e);
        }
    }

    public final TransformerHandler createTransformerHandler(FileOutputStream fileOutputStream) throws TransformerConfigurationException, TransformerFactoryConfigurationError, IllegalArgumentException {
        TransformerHandler transformerHandlerNewTransformerHandler = ((SAXTransformerFactory) TransformerFactory.newInstance()).newTransformerHandler();
        transformerHandlerNewTransformerHandler.getTransformer().setOutputProperty("encoding", "UTF-8");
        transformerHandlerNewTransformerHandler.getTransformer().setOutputProperty("indent", BooleanUtils.YES);
        transformerHandlerNewTransformerHandler.setResult(new StreamResult(fileOutputStream));
        return transformerHandlerNewTransformerHandler;
    }

    public final void startModule(TransformerHandler transformerHandler, IvyNode ivyNode) throws SAXException {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute(null, IvyPatternHelper.ORGANISATION_KEY, IvyPatternHelper.ORGANISATION_KEY, "CDATA", ivyNode.getModuleId().getOrganisation());
        attributesImpl.addAttribute(null, "name", "name", "CDATA", ivyNode.getModuleId().getName());
        ResolvedModuleRevision moduleRevision = ivyNode.getModuleRevision();
        attributesImpl.addAttribute(null, "rev", "rev", "CDATA", moduleRevision.getId().getRevision());
        attributesImpl.addAttribute(null, "status", "status", "CDATA", moduleRevision.getDescriptor().getStatus());
        transformerHandler.startElement(null, "module", "module", attributesImpl);
    }

    public final void startArtifact(TransformerHandler transformerHandler, Artifact artifact) throws SAXException {
        AttributesImpl attributesImpl = new AttributesImpl();
        attributesImpl.addAttribute(null, "name", "name", "CDATA", artifact.getName());
        attributesImpl.addAttribute(null, IvyPatternHelper.EXT_KEY, IvyPatternHelper.EXT_KEY, "CDATA", artifact.getExt());
        attributesImpl.addAttribute(null, "type", "type", "CDATA", artifact.getType());
        transformerHandler.startElement(null, "artifact", "artifact", attributesImpl);
    }

    public final void writeOriginLocationIfPresent(RepositoryCacheManager repositoryCacheManager, TransformerHandler transformerHandler, ArtifactDownloadReport artifactDownloadReport) throws SAXException {
        ArtifactOrigin artifactOrigin = artifactDownloadReport.getArtifactOrigin();
        if (ArtifactOrigin.isUnknown(artifactOrigin)) {
            return;
        }
        String location = artifactOrigin.getLocation();
        boolean zIsLocal = artifactOrigin.isLocal();
        AttributesImpl attributesImpl = new AttributesImpl();
        if (zIsLocal) {
            attributesImpl.addAttribute(null, "is-local", "is-local", "CDATA", "true");
            location = location.replace('\\', '/');
        } else {
            attributesImpl.addAttribute(null, "is-local", "is-local", "CDATA", "false");
        }
        transformerHandler.startElement(null, "origin-location", "origin-location", attributesImpl);
        char[] charArray = location.toCharArray();
        transformerHandler.characters(charArray, 0, charArray.length);
        transformerHandler.endElement(null, "origin-location", "origin-location");
    }

    public final void writeCacheLocationIfPresent(RepositoryCacheManager repositoryCacheManager, TransformerHandler transformerHandler, ArtifactDownloadReport artifactDownloadReport) throws SAXException {
        File localFile = artifactDownloadReport.getLocalFile();
        if (localFile != null) {
            transformerHandler.startElement(null, "cache-location", "cache-location", new AttributesImpl());
            char[] charArray = localFile.getPath().replace('\\', '/').toCharArray();
            transformerHandler.characters(charArray, 0, charArray.length);
            transformerHandler.endElement(null, "cache-location", "cache-location");
        }
    }

    public final void writeRetrieveLocation(TransformerHandler transformerHandler, String str) throws SAXException {
        String strRemoveLeadingPath = removeLeadingPath(getProject().getBaseDir(), new File(str));
        transformerHandler.startElement(null, "retrieve-location", "retrieve-location", new AttributesImpl());
        char[] charArray = strRemoveLeadingPath.replace('\\', '/').toCharArray();
        transformerHandler.characters(charArray, 0, charArray.length);
        transformerHandler.endElement(null, "retrieve-location", "retrieve-location");
    }

    public String removeLeadingPath(File file, File file2) {
        String absolutePath = file.getAbsolutePath();
        String absolutePath2 = file2.getAbsolutePath();
        if (absolutePath.equals(absolutePath2)) {
            return "";
        }
        String str = File.separator;
        if (!absolutePath.endsWith(str)) {
            absolutePath = absolutePath + str;
        }
        return absolutePath2.startsWith(absolutePath) ? absolutePath2.substring(absolutePath.length()) : absolutePath2;
    }
}
