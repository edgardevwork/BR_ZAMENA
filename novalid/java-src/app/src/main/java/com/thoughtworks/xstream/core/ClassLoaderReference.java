package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.core.util.CompositeClassLoader;

/* loaded from: classes8.dex */
public final class ClassLoaderReference {
    public transient ClassLoader reference;

    public ClassLoaderReference(ClassLoader classLoader) {
        setReference(classLoader);
    }

    public ClassLoader getReference() {
        return this.reference;
    }

    public void setReference(ClassLoader classLoader) {
        if (classLoader instanceof com.thoughtworks.xstream.core.util.ClassLoaderReference) {
            classLoader = ((com.thoughtworks.xstream.core.util.ClassLoaderReference) classLoader).getReference();
        }
        this.reference = classLoader;
    }

    public final Object readResolve() {
        this.reference = new CompositeClassLoader();
        return this;
    }
}
