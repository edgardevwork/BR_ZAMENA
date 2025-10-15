package com.thoughtworks.xstream.p042io.copy;

import com.thoughtworks.xstream.p042io.HierarchicalStreamReader;
import com.thoughtworks.xstream.p042io.HierarchicalStreamWriter;

/* loaded from: classes5.dex */
public class HierarchicalStreamCopier {
    public void copy(HierarchicalStreamReader hierarchicalStreamReader, HierarchicalStreamWriter hierarchicalStreamWriter) {
        hierarchicalStreamWriter.startNode(hierarchicalStreamReader.getNodeName());
        int attributeCount = hierarchicalStreamReader.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            hierarchicalStreamWriter.addAttribute(hierarchicalStreamReader.getAttributeName(i), hierarchicalStreamReader.getAttribute(i));
        }
        String value = hierarchicalStreamReader.getValue();
        if (value != null && value.length() > 0) {
            hierarchicalStreamWriter.setValue(value);
        }
        while (hierarchicalStreamReader.hasMoreChildren()) {
            hierarchicalStreamReader.moveDown();
            copy(hierarchicalStreamReader, hierarchicalStreamWriter);
            hierarchicalStreamReader.moveUp();
        }
        hierarchicalStreamWriter.endNode();
    }
}
