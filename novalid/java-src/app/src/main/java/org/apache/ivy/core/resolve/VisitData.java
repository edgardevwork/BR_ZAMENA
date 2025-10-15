package org.apache.ivy.core.resolve;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public class VisitData {
    public IvyNode node;
    public Map<String, List<VisitNode>> visitNodes = new HashMap();

    public VisitData(IvyNode ivyNode) {
        this.node = ivyNode;
    }

    public void addVisitNode(VisitNode visitNode) {
        getVisitNodes(visitNode.getRootModuleConf()).add(visitNode);
    }

    public List<VisitNode> getVisitNodes(String str) {
        List<VisitNode> list = this.visitNodes.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.visitNodes.put(str, arrayList);
        return arrayList;
    }

    public IvyNode getNode() {
        return this.node;
    }

    public void setNode(IvyNode ivyNode) {
        this.node = ivyNode;
    }

    public void addVisitNodes(String str, List<VisitNode> list) {
        getVisitNodes(str).addAll(list);
    }
}
