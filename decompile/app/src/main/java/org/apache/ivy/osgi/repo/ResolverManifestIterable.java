package org.apache.ivy.osgi.repo;

import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.DefaultDependencyDescriptor;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolveEngine;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.core.sort.SortEngine;
import org.apache.ivy.osgi.core.BundleInfoAdapter;
import org.apache.ivy.plugins.resolver.BasicResolver;
import org.apache.ivy.plugins.resolver.util.ResolvedResource;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class ResolverManifestIterable implements Iterable<ManifestAndLocation> {
    public final BasicResolver resolver;

    public ResolverManifestIterable(BasicResolver basicResolver) {
        this.resolver = basicResolver;
    }

    @Override // java.lang.Iterable
    public Iterator<ManifestAndLocation> iterator() {
        return new ResolverManifestIterator();
    }

    public class ResolverManifestIterator implements Iterator<ManifestAndLocation> {
        public Artifact artifact;
        public Artifact[] artifacts;
        public ResolveData data;
        public int indexArtifact;
        public int indexRevision;
        public ModuleEntry module;
        public ModuleEntry[] modules;
        public ModuleRevisionId mrid;
        public OrganisationEntry organisation;
        public OrganisationEntry[] organisations;
        public RevisionEntry revision;
        public RevisionEntry[] revisions;
        public int indexOrganisation = 0;
        public int indexModule = -1;
        public ManifestAndLocation next = null;

        public ResolverManifestIterator() {
            this.organisations = ResolverManifestIterable.this.resolver.listOrganisations();
            IvySettings ivySettings = new IvySettings();
            this.data = new ResolveData(new ResolveEngine(ivySettings, new EventManager(), new SortEngine(ivySettings)), new ResolveOptions());
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            while (this.next == null) {
                if (this.organisation == null) {
                    int i = this.indexOrganisation;
                    OrganisationEntry[] organisationEntryArr = this.organisations;
                    if (i >= organisationEntryArr.length) {
                        return false;
                    }
                    this.indexOrganisation = i + 1;
                    this.organisation = organisationEntryArr[i];
                    this.modules = ResolverManifestIterable.this.resolver.listModules(this.organisation);
                    this.indexModule = 0;
                    this.module = null;
                }
                if (this.module == null) {
                    int i2 = this.indexModule;
                    ModuleEntry[] moduleEntryArr = this.modules;
                    if (i2 >= moduleEntryArr.length) {
                        this.organisation = null;
                    } else {
                        this.indexModule = i2 + 1;
                        this.module = moduleEntryArr[i2];
                        this.revisions = ResolverManifestIterable.this.resolver.listRevisions(this.module);
                        this.indexRevision = 0;
                        this.revision = null;
                    }
                }
                if (this.revision == null) {
                    int i3 = this.indexRevision;
                    RevisionEntry[] revisionEntryArr = this.revisions;
                    if (i3 >= revisionEntryArr.length) {
                        this.module = null;
                    } else {
                        this.indexRevision = i3 + 1;
                        this.revision = revisionEntryArr[i3];
                        this.mrid = ModuleRevisionId.newInstance(this.organisation.getOrganisation(), this.module.getModule(), this.revision.getRevision());
                        try {
                            ResolvedModuleRevision dependency = ResolverManifestIterable.this.resolver.getDependency(new DefaultDependencyDescriptor(this.mrid, false), this.data);
                            if (dependency == null) {
                                this.revision = null;
                            } else {
                                ModuleDescriptor descriptor = dependency.getDescriptor();
                                this.mrid = descriptor.getModuleRevisionId();
                                this.artifacts = descriptor.getAllArtifacts();
                                this.indexArtifact = 0;
                                this.artifact = null;
                            }
                        } catch (ParseException e) {
                            Message.error("Error while resolving " + this.mrid + " : " + e.getMessage());
                            this.revision = null;
                        }
                    }
                }
                if (this.artifact == null) {
                    int i4 = this.indexArtifact;
                    Artifact[] artifactArr = this.artifacts;
                    if (i4 >= artifactArr.length) {
                        this.revision = null;
                    } else {
                        this.indexArtifact = i4 + 1;
                        this.artifact = artifactArr[i4];
                    }
                }
                ResolvedResource resolvedResourceDoFindArtifactRef = ResolverManifestIterable.this.resolver.doFindArtifactRef(this.artifact, null);
                if (resolvedResourceDoFindArtifactRef == null) {
                    this.artifact = null;
                } else {
                    try {
                        JarInputStream jarInputStream = new JarInputStream(resolvedResourceDoFindArtifactRef.getResource().openStream());
                        try {
                            Manifest manifest = jarInputStream.getManifest();
                            if (manifest == null) {
                                Message.debug("No manifest on " + this.artifact);
                            } else {
                                this.next = new ManifestAndLocation(manifest, BundleInfoAdapter.buildIvyURI(this.artifact), null);
                            }
                            this.artifact = null;
                        } finally {
                            try {
                                jarInputStream.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException e2) {
                        Message.warn("Unreadable jar " + resolvedResourceDoFindArtifactRef.getResource().getName() + " (" + e2.getMessage() + ")");
                        this.artifact = null;
                    }
                }
            }
            return true;
        }

        @Override // java.util.Iterator
        public ManifestAndLocation next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            ManifestAndLocation manifestAndLocation = this.next;
            this.next = null;
            return manifestAndLocation;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}
