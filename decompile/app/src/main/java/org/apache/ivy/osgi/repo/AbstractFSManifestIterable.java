package org.apache.ivy.osgi.repo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Stack;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;
import org.apache.ivy.util.Message;

/* loaded from: classes5.dex */
public abstract class AbstractFSManifestIterable<T> implements Iterable<ManifestAndLocation> {
    public final T root;

    public abstract URI buildBundleURI(T t) throws IOException;

    public abstract InputStream getInputStream(T t) throws IOException;

    public abstract List<T> listBundleFiles(T t) throws IOException;

    public abstract List<T> listDirs(T t) throws IOException;

    public AbstractFSManifestIterable(T t) {
        this.root = t;
    }

    @Override // java.lang.Iterable
    public Iterator<ManifestAndLocation> iterator() {
        return new FSManifestIterator();
    }

    public class FSManifestIterator implements Iterator<ManifestAndLocation> {
        public Iterator<T> bundleCandidates;
        public T currentDir;
        public Stack<Iterator<T>> dirs;
        public ManifestAndLocation next = null;

        public FSManifestIterator() {
            Stack<Iterator<T>> stack = new Stack<>();
            this.dirs = stack;
            this.bundleCandidates = null;
            this.currentDir = null;
            stack.add(Collections.singleton(AbstractFSManifestIterable.this.root).iterator());
        }

        @Override // java.util.Iterator
        public boolean hasNext() throws IOException {
            while (this.next == null) {
                if (this.currentDir == null) {
                    if (this.dirs.peek().hasNext()) {
                        T next = this.dirs.peek().next();
                        this.currentDir = next;
                        try {
                            this.bundleCandidates = AbstractFSManifestIterable.this.listBundleFiles(next).iterator();
                        } catch (IOException e) {
                            Message.warn("Unlistable dir: " + this.currentDir, e);
                            this.currentDir = null;
                        }
                    } else {
                        if (this.dirs.size() <= 1) {
                            return false;
                        }
                        this.dirs.pop();
                    }
                } else if (this.bundleCandidates.hasNext()) {
                    T next2 = this.bundleCandidates.next();
                    try {
                        JarInputStream jarInputStream = new JarInputStream(AbstractFSManifestIterable.this.getInputStream(next2));
                        try {
                            Manifest manifest = jarInputStream.getManifest();
                            if (manifest != null) {
                                this.next = new ManifestAndLocation(manifest, AbstractFSManifestIterable.this.buildBundleURI(next2), null);
                            } else {
                                Message.debug("No manifest in jar: " + next2);
                            }
                            jarInputStream.close();
                        } catch (Throwable th) {
                            try {
                                jarInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (FileNotFoundException e2) {
                        Message.debug("Jar file just removed: " + next2, e2);
                    } catch (IOException e3) {
                        Message.warn("Unreadable jar: " + next2, e3);
                    }
                } else {
                    try {
                        this.dirs.add(AbstractFSManifestIterable.this.listDirs(this.currentDir).iterator());
                    } catch (IOException e4) {
                        Message.warn("Unlistable dir: " + this.currentDir + " (" + e4 + ")");
                        this.dirs.add(Collections.emptyList().iterator());
                    }
                    this.currentDir = null;
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
