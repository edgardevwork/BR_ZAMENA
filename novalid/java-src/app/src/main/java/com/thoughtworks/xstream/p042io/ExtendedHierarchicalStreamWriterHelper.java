package com.thoughtworks.xstream.p042io;

/* loaded from: classes8.dex */
public class ExtendedHierarchicalStreamWriterHelper {
    public static void startNode(HierarchicalStreamWriter hierarchicalStreamWriter, String str, Class cls) {
        if (hierarchicalStreamWriter instanceof ExtendedHierarchicalStreamWriter) {
            ((ExtendedHierarchicalStreamWriter) hierarchicalStreamWriter).startNode(str, cls);
        } else {
            hierarchicalStreamWriter.startNode(str);
        }
    }
}
