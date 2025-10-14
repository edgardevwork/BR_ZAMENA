package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.cache.ArtifactOrigin;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DependencyDescriptor;
import org.apache.ivy.core.report.DownloadReport;
import org.apache.ivy.core.resolve.DownloadOptions;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.XMLHelper;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

/* loaded from: classes8.dex */
public class IvyRepResolver extends URLResolver {
    public static final String DEFAULT_IVYPATTERN = "[organisation]/[module]/ivy-[revision].xml";
    public String ivyroot = null;
    public String ivypattern = null;
    public String artroot = null;
    public String artpattern = null;

    public final void ensureArtifactConfigured(ResolverSettings resolverSettings) {
        if (resolverSettings != null) {
            String str = this.artroot;
            if (str == null || this.artpattern == null) {
                if (str == null) {
                    String variable = resolverSettings.getVariable("ivy.ivyrep.default.artifact.root");
                    if (variable != null) {
                        this.artroot = variable;
                    } else {
                        resolverSettings.configureRepositories(true);
                        this.artroot = resolverSettings.getVariable("ivy.ivyrep.default.artifact.root");
                    }
                }
                if (this.artpattern == null) {
                    String variable2 = resolverSettings.getVariable("ivy.ivyrep.default.artifact.pattern");
                    if (variable2 != null) {
                        this.artpattern = variable2;
                    } else {
                        resolverSettings.configureRepositories(false);
                        this.artpattern = resolverSettings.getVariable("ivy.ivyrep.default.artifact.pattern");
                    }
                }
                updateWholeArtPattern();
            }
        }
    }

    public final void ensureIvyConfigured(ResolverSettings resolverSettings) {
        if (resolverSettings != null) {
            String str = this.ivyroot;
            if (str == null || this.ivypattern == null) {
                if (str == null) {
                    String variable = resolverSettings.getVariable("ivy.ivyrep.default.ivy.root");
                    if (variable != null) {
                        this.ivyroot = variable;
                    } else {
                        throw new IllegalStateException("ivyroot is mandatory on IvyRepResolver. Make sure to set it in your settings, before setting ivypattern if you wish to set ivypattern too.");
                    }
                }
                if (this.ivypattern == null) {
                    String variable2 = resolverSettings.getVariable("ivy.ivyrep.default.ivy.pattern");
                    if (variable2 != null) {
                        this.ivypattern = variable2;
                    } else {
                        resolverSettings.configureRepositories(false);
                        this.ivypattern = resolverSettings.getVariable("ivy.ivyrep.default.ivy.pattern");
                    }
                }
                updateWholeIvyPattern();
            }
        }
    }

    public final String getWholeIvyPattern() {
        if (this.ivyroot == null || this.ivypattern == null) {
            return null;
        }
        return this.ivyroot + this.ivypattern;
    }

    public final String getWholeArtPattern() {
        return this.artroot + this.artpattern;
    }

    public String getIvypattern() {
        return this.ivypattern;
    }

    public void setIvypattern(String str) {
        if (str == null) {
            throw new NullPointerException("pattern must not be null");
        }
        this.ivypattern = str;
        ensureIvyConfigured(getSettings());
        updateWholeIvyPattern();
    }

    public String getIvyroot() {
        return this.ivyroot;
    }

    public void setIvyroot(String str) {
        if (str == null) {
            throw new NullPointerException("root must not be null");
        }
        if (!str.endsWith("/")) {
            this.ivyroot = str + "/";
        } else {
            this.ivyroot = str;
        }
        ensureIvyConfigured(getSettings());
        updateWholeIvyPattern();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public void setM2compatible(boolean z) {
        if (z) {
            throw new IllegalArgumentException("ivyrep does not support maven2 compatibility. Please use ibiblio resolver instead, or even url or filesystem resolvers for more specific needs.");
        }
    }

    public final void updateWholeIvyPattern() {
        setIvyPatterns(Collections.singletonList(getWholeIvyPattern()));
    }

    public final void updateWholeArtPattern() {
        setArtifactPatterns(Collections.singletonList(getWholeArtPattern()));
    }

    public void publish(Artifact artifact, File file) {
        throw new UnsupportedOperationException("publish not supported by IBiblioResolver");
    }

    public String getArtroot() {
        return this.artroot;
    }

    public String getArtpattern() {
        return this.artpattern;
    }

    public void setArtpattern(String str) {
        if (str == null) {
            throw new NullPointerException("pattern must not be null");
        }
        this.artpattern = str;
        ensureArtifactConfigured(getSettings());
        updateWholeArtPattern();
    }

    public void setArtroot(String str) {
        if (str == null) {
            throw new NullPointerException("root must not be null");
        }
        if (!str.endsWith("/")) {
            this.artroot = str + "/";
        } else {
            this.artroot = str;
        }
        ensureArtifactConfigured(getSettings());
        updateWholeArtPattern();
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public OrganisationEntry[] listOrganisations() {
        ensureIvyConfigured(getSettings());
        try {
            URL url = new URL(this.ivyroot + "content.xml");
            final ArrayList arrayList = new ArrayList();
            XMLHelper.parse(url, null, new DefaultHandler() { // from class: org.apache.ivy.plugins.resolver.IvyRepResolver.1
                @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
                public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
                    String value;
                    if (!IvyPatternHelper.ORGANISATION_KEY.equals(str3) || (value = attributes.getValue("name")) == null) {
                        return;
                    }
                    arrayList.add(new OrganisationEntry(IvyRepResolver.this, value));
                }
            });
            return (OrganisationEntry[]) arrayList.toArray(new OrganisationEntry[arrayList.size()]);
        } catch (MalformedURLException unused) {
            return super.listOrganisations();
        } catch (Exception e) {
            Message.warn("unable to parse content.xml file on ivyrep", e);
            return super.listOrganisations();
        }
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ModuleEntry[] listModules(OrganisationEntry organisationEntry) {
        ensureIvyConfigured(getSettings());
        HashMap map = new HashMap();
        map.put(IvyPatternHelper.ORGANISATION_KEY, organisationEntry.getOrganisation());
        Collection<String> collectionFindIvyNames = findIvyNames(map, "module");
        ArrayList arrayList = new ArrayList(collectionFindIvyNames.size());
        Iterator<String> it = collectionFindIvyNames.iterator();
        while (it.hasNext()) {
            arrayList.add(new ModuleEntry(organisationEntry, it.next()));
        }
        return (ModuleEntry[]) arrayList.toArray(new ModuleEntry[collectionFindIvyNames.size()]);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public RevisionEntry[] listRevisions(ModuleEntry moduleEntry) {
        ensureIvyConfigured(getSettings());
        ensureArtifactConfigured(getSettings());
        return super.listRevisions(moduleEntry);
    }

    @Override // org.apache.ivy.plugins.resolver.URLResolver, org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "ivyrep";
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ResolvedModuleRevision getDependency(DependencyDescriptor dependencyDescriptor, ResolveData resolveData) throws ParseException {
        ensureIvyConfigured(resolveData.getSettings());
        return super.getDependency(dependencyDescriptor, resolveData);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver, org.apache.ivy.plugins.resolver.BasicResolver
    public ResolvedResource findArtifactRef(Artifact artifact, Date date) {
        ensureArtifactConfigured(getSettings());
        return super.findArtifactRef(artifact, date);
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public DownloadReport download(Artifact[] artifactArr, DownloadOptions downloadOptions) {
        ensureArtifactConfigured(getSettings());
        return super.download(artifactArr, downloadOptions);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public boolean exists(Artifact artifact) {
        ensureArtifactConfigured(getSettings());
        return super.exists(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver, org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public ArtifactOrigin locate(Artifact artifact) {
        ensureArtifactConfigured(getSettings());
        return super.locate(artifact);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public List<String> getIvyPatterns() {
        ensureIvyConfigured(getSettings());
        return super.getIvyPatterns();
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public List<String> getArtifactPatterns() {
        ensureArtifactConfigured(getSettings());
        return super.getArtifactPatterns();
    }
}
