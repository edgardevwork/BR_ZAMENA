package org.apache.ivy.ant;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.tools.ant.DirectoryScanner;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.FileSet;
import org.apache.tools.ant.types.Resource;

/* loaded from: classes7.dex */
public class EmptyFileSet extends FileSet {

    /* renamed from: ds */
    public DirectoryScanner f9949ds = new EmptyDirectoryScanner();

    public int size() {
        return 0;
    }

    public Iterator<Resource> iterator() {
        return new EmptyIterator();
    }

    public Object clone() {
        return new EmptyFileSet();
    }

    public DirectoryScanner getDirectoryScanner(Project project) {
        return this.f9949ds;
    }

    public static class EmptyIterator<T> implements Iterator<T> {
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        public EmptyIterator() {
        }

        @Override // java.util.Iterator
        public T next() {
            throw new NoSuchElementException("EmptyFileSet Iterator");
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new IllegalStateException("EmptyFileSet Iterator");
        }
    }

    public static class EmptyDirectoryScanner extends DirectoryScanner {
        public EmptyDirectoryScanner() {
        }

        public String[] getIncludedFiles() {
            return new String[0];
        }
    }
}
