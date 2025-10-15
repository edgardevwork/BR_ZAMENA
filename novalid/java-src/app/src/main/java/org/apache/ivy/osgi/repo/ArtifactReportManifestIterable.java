package org.apache.ivy.osgi.repo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public class ArtifactReportManifestIterable implements Iterable<ManifestAndLocation> {
    public final Map<ModuleRevisionId, List<ArtifactDownloadReport>> artifactReports = new HashMap();
    public List<String> sourceTypes;

    public ArtifactReportManifestIterable(List<ArtifactDownloadReport> list, List<String> list2) {
        this.sourceTypes = list2;
        for (ArtifactDownloadReport artifactDownloadReport : list) {
            ModuleRevisionId moduleRevisionId = artifactDownloadReport.getArtifact().getModuleRevisionId();
            List<ArtifactDownloadReport> arrayList = this.artifactReports.get(moduleRevisionId);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.artifactReports.put(moduleRevisionId, arrayList);
            }
            arrayList.add(artifactDownloadReport);
        }
    }

    @Override // java.lang.Iterable
    public Iterator<ManifestAndLocation> iterator() {
        return new ArtifactReportManifestIterator();
    }

    public class ArtifactReportManifestIterator implements Iterator<ManifestAndLocation> {

        /* renamed from: it */
        public Iterator<ModuleRevisionId> f9980it;
        public ManifestAndLocation next = null;

        public ArtifactReportManifestIterator() {
            this.f9980it = ArtifactReportManifestIterable.this.artifactReports.keySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            File localFile;
            while (this.next == null && this.f9980it.hasNext()) {
                URI uri = null;
                ArtifactDownloadReport artifactDownloadReport = null;
                ArtifactDownloadReport artifactDownloadReport2 = null;
                for (ArtifactDownloadReport artifactDownloadReport3 : (List) ArtifactReportManifestIterable.this.artifactReports.get(this.f9980it.next())) {
                    if (ArtifactReportManifestIterable.this.sourceTypes == null || !ArtifactReportManifestIterable.this.sourceTypes.contains(artifactDownloadReport3.getArtifact().getType())) {
                        artifactDownloadReport = artifactDownloadReport3;
                    } else {
                        artifactDownloadReport2 = artifactDownloadReport3;
                    }
                }
                if (artifactDownloadReport != null) {
                    if (artifactDownloadReport2 != null) {
                        if (artifactDownloadReport2.getUnpackedLocalFile() != null) {
                            uri = artifactDownloadReport2.getUnpackedLocalFile().toURI();
                        } else {
                            uri = artifactDownloadReport2.getLocalFile().toURI();
                        }
                    }
                    if (artifactDownloadReport.getUnpackedLocalFile() != null && artifactDownloadReport.getUnpackedLocalFile().isDirectory()) {
                        try {
                            FileInputStream fileInputStream = new FileInputStream(new File(artifactDownloadReport.getUnpackedLocalFile(), "META-INF/MANIFEST.MF"));
                            try {
                                this.next = new ManifestAndLocation(new Manifest(fileInputStream), artifactDownloadReport.getUnpackedLocalFile().toURI(), uri);
                                fileInputStream.close();
                                return true;
                            } finally {
                            }
                        } catch (FileNotFoundException e) {
                            Message.debug("Bundle directory file just removed: " + artifactDownloadReport.getUnpackedLocalFile(), e);
                        } catch (IOException e2) {
                            Message.debug("The Manifest in the bundle directory could not be read: " + artifactDownloadReport.getUnpackedLocalFile(), e2);
                        }
                    } else {
                        if (artifactDownloadReport.getUnpackedLocalFile() != null) {
                            localFile = artifactDownloadReport.getUnpackedLocalFile();
                        } else {
                            localFile = artifactDownloadReport.getLocalFile();
                        }
                        try {
                            JarInputStream jarInputStream = new JarInputStream(new FileInputStream(localFile));
                            try {
                                Manifest manifest = jarInputStream.getManifest();
                                if (manifest != null) {
                                    this.next = new ManifestAndLocation(manifest, localFile.toURI(), uri);
                                    jarInputStream.close();
                                    return true;
                                }
                                Message.debug("No manifest in jar: " + localFile);
                                jarInputStream.close();
                            } finally {
                            }
                        } catch (FileNotFoundException e3) {
                            Message.debug("Jar file just removed: " + localFile, e3);
                        } catch (IOException e4) {
                            Message.warn("Unreadable jar: " + localFile, e4);
                        }
                    }
                }
            }
            return this.next != null;
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
