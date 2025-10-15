package org.apache.ivy.ant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import javax.xml.transform.TransformerConfigurationException;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.cache.DefaultRepositoryCacheManager;
import org.apache.ivy.core.cache.RepositoryCacheManager;
import org.apache.ivy.osgi.obr.xml.OBRXMLWriter;
import org.apache.ivy.osgi.repo.ArtifactReportManifestIterable;
import org.apache.ivy.osgi.repo.FSManifestIterable;
import org.apache.ivy.osgi.repo.ResolverManifestIterable;
import org.apache.ivy.plugins.resolver.BasicResolver;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.util.Message;
import org.apache.tools.ant.BuildException;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;

/* loaded from: classes5.dex */
public class BuildOBRTask extends IvyCacheTask {
    public File baseDir;
    public boolean quiet;
    public String resolverName = null;
    public File file = null;
    public String cacheName = null;
    public String encoding = "UTF-8";
    public boolean indent = true;
    public List<String> sourceTypes = Arrays.asList("source", "sources", "src");

    public void setResolver(String str) {
        this.resolverName = str;
    }

    public void setCache(String str) {
        this.cacheName = str;
    }

    public void setOut(File file) {
        this.file = file;
    }

    public void setEncoding(String str) {
        this.encoding = str;
    }

    public void setIndent(boolean z) {
        this.indent = z;
    }

    public void setBaseDir(File file) {
        this.baseDir = file;
    }

    public void setQuiet(boolean z) {
        this.quiet = z;
    }

    public void setSourceType(String str) {
        this.sourceTypes = Arrays.asList(str.split(","));
    }

    @Override // org.apache.ivy.ant.IvyTask
    public void prepareTask() {
        List<String> list;
        if (this.baseDir == null) {
            super.prepareTask();
        }
        if (getType() == null || getType().equals("*") || (list = this.sourceTypes) == null || list.isEmpty()) {
            return;
        }
        StringBuilder sb = new StringBuilder(getType());
        for (String str : this.sourceTypes) {
            sb.append(",");
            sb.append(str);
        }
        setType(sb.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws IOException, BuildException, IllegalArgumentException {
        Iterable artifactReportManifestIterable;
        if (this.file == null) {
            throw new BuildException("No output file specified: use the attribute 'out'");
        }
        if (this.resolverName != null) {
            if (this.baseDir != null) {
                throw new BuildException("specify only one of 'resolver' or 'baseDir'");
            }
            if (this.cacheName != null) {
                throw new BuildException("specify only one of 'resolver' or 'cache'");
            }
            DependencyResolver resolver = getIvyInstance().getSettings().getResolver(this.resolverName);
            if (resolver == null) {
                throw new BuildException("the resolver '" + this.resolverName + "' was not found");
            }
            if (!(resolver instanceof BasicResolver)) {
                throw new BuildException("the type of resolver '" + resolver.getClass().getName() + "' is not supported.");
            }
            artifactReportManifestIterable = new ResolverManifestIterable((BasicResolver) resolver);
        } else {
            File file = this.baseDir;
            if (file != null) {
                if (this.cacheName != null) {
                    throw new BuildException("specify only one of 'baseDir' or 'cache'");
                }
                if (!file.isDirectory()) {
                    throw new BuildException(this.baseDir + " is not a directory");
                }
                artifactReportManifestIterable = new FSManifestIterable(this.baseDir);
            } else if (this.cacheName != null) {
                RepositoryCacheManager repositoryCacheManager = getIvyInstance().getSettings().getRepositoryCacheManager(this.cacheName);
                if (!(repositoryCacheManager instanceof DefaultRepositoryCacheManager)) {
                    throw new BuildException("the type of cache '" + repositoryCacheManager.getClass().getName() + "' is not supported.");
                }
                artifactReportManifestIterable = new FSManifestIterable(((DefaultRepositoryCacheManager) repositoryCacheManager).getBasedir());
            } else {
                prepareAndCheck();
                try {
                    artifactReportManifestIterable = new ArtifactReportManifestIterable(getArtifactReports(), this.sourceTypes);
                } catch (ParseException e) {
                    throw new BuildException("Impossible to parse the artifact reports: " + e.getMessage(), e);
                }
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(this.file);
            try {
                ContentHandler contentHandlerNewHandler = OBRXMLWriter.newHandler(fileOutputStream, this.encoding, this.indent);
                IvyContext.getContext().getMessageLogger();
                Message.setDefaultLogger(new AntMessageLogger() { // from class: org.apache.ivy.ant.BuildOBRTask.1AntMessageLogger2
                });
                try {
                    OBRXMLWriter.writeManifests(artifactReportManifestIterable, contentHandlerNewHandler, this.quiet);
                    try {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException unused) {
                    }
                    Message.sumupProblems();
                } catch (SAXException e2) {
                    throw new BuildException("Sax serialisation error: " + e2.getMessage(), e2);
                }
            } catch (TransformerConfigurationException e3) {
                throw new BuildException("Sax configuration error: " + e3.getMessage(), e3);
            }
        } catch (FileNotFoundException e4) {
            throw new BuildException(this.file + " was not found", e4);
        }
    }
}
