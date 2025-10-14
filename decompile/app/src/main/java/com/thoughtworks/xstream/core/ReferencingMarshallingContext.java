package com.thoughtworks.xstream.core;

import com.thoughtworks.xstream.converters.MarshallingContext;
import com.thoughtworks.xstream.p042io.path.Path;

/* loaded from: classes6.dex */
public interface ReferencingMarshallingContext extends MarshallingContext {
    Path currentPath();

    Object lookupReference(Object obj);

    void registerImplicit(Object obj);

    void replace(Object obj, Object obj2);
}
