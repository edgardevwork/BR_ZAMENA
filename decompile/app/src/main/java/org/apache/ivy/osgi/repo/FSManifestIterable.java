package org.apache.ivy.osgi.repo;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class FSManifestIterable extends AbstractFSManifestIterable<File> {
    public static final FilenameFilter DEFAULT_BUNDLE_FILTER;

    @Deprecated
    public static final FilenameFilter DEFAULT_BUNLDE_FILTER;
    public FilenameFilter bundleFilter;
    public FilenameFilter dirFilter;
    public static final Set<String> NON_BUNDLE_DIRS = new HashSet(Arrays.asList("source", "sources", "javadoc", "javadocs", "doc", "docs"));
    public static final FilenameFilter DEFAULT_DIR_FILTER = new FilenameFilter() { // from class: org.apache.ivy.osgi.repo.FSManifestIterable.1
        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return (str.equals(".svn") || FSManifestIterable.NON_BUNDLE_DIRS.contains(str)) ? false : true;
        }
    };

    static {
        FilenameFilter filenameFilter = new FilenameFilter() { // from class: org.apache.ivy.osgi.repo.FSManifestIterable.2
            @Override // java.io.FilenameFilter
            public boolean accept(File file, String str) {
                return str.endsWith(".jar");
            }
        };
        DEFAULT_BUNDLE_FILTER = filenameFilter;
        DEFAULT_BUNLDE_FILTER = filenameFilter;
    }

    public FSManifestIterable(File file) {
        super(file);
        this.dirFilter = DEFAULT_DIR_FILTER;
        this.bundleFilter = DEFAULT_BUNDLE_FILTER;
    }

    public FilenameFilter getDirFilter() {
        return this.dirFilter;
    }

    public void setDirFilter(FilenameFilter filenameFilter) {
        this.dirFilter = filenameFilter;
    }

    public FilenameFilter getBundleFilter() {
        return this.bundleFilter;
    }

    public void setBundleFilter(FilenameFilter filenameFilter) {
        this.bundleFilter = filenameFilter;
    }

    @Override // org.apache.ivy.osgi.repo.AbstractFSManifestIterable
    public URI buildBundleURI(File file) {
        try {
            return new URI(file.toURI().toURL().toExternalForm());
        } catch (MalformedURLException e) {
            throw new RuntimeException("Unexpected file to url conversion error", e);
        } catch (URISyntaxException e2) {
            throw new RuntimeException("Unexpected url to uri conversion error", e2);
        }
    }

    @Override // org.apache.ivy.osgi.repo.AbstractFSManifestIterable
    public InputStream getInputStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @Override // org.apache.ivy.osgi.repo.AbstractFSManifestIterable
    public List<File> listBundleFiles(File file) throws IOException {
        return Arrays.asList(file.listFiles(new FileFilter() { // from class: org.apache.ivy.osgi.repo.FSManifestIterable.3
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return file2.isFile() && FSManifestIterable.this.bundleFilter.accept(file2.getParentFile(), file2.getName());
            }
        }));
    }

    @Override // org.apache.ivy.osgi.repo.AbstractFSManifestIterable
    public List<File> listDirs(File file) throws IOException {
        return Arrays.asList(file.listFiles(new FileFilter() { // from class: org.apache.ivy.osgi.repo.FSManifestIterable.4
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                return file2.isDirectory() && (FSManifestIterable.this.dirFilter == null || FSManifestIterable.this.dirFilter.accept(file2.getParentFile(), file2.getName()));
            }
        }));
    }
}
