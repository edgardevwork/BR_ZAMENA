package com.thoughtworks.xstream.core.util;

/* loaded from: classes8.dex */
public class ClassLoaderReference extends ClassLoader {
    public transient ClassLoader reference;

    public ClassLoaderReference(ClassLoader classLoader) {
        this.reference = classLoader;
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str) throws ClassNotFoundException {
        return this.reference.loadClass(str);
    }

    public ClassLoader getReference() {
        return this.reference;
    }

    public void setReference(ClassLoader classLoader) {
        this.reference = classLoader;
    }

    public final Object writeReplace() {
        return new Replacement();
    }

    public static class Replacement {
        public final Object readResolve() {
            return new ClassLoaderReference(new CompositeClassLoader());
        }
    }
}
