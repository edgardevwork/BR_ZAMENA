package com.thoughtworks.xstream.annotations;

import com.thoughtworks.xstream.XStream;

@Deprecated
/* loaded from: classes5.dex */
public class Annotations {
    @Deprecated
    public static synchronized void configureAliases(XStream xStream, Class<?>... clsArr) {
        xStream.processAnnotations(clsArr);
    }
}
