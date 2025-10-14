package org.apache.ivy.plugins.namespace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;

/* loaded from: classes6.dex */
public class Namespace {
    public static final Namespace SYSTEM_NAMESPACE = new Namespace();
    public String name;
    public final List<NamespaceRule> rules = new ArrayList();
    public boolean chainRules = false;
    public NamespaceTransformer fromSystemTransformer = new NamespaceTransformer() { // from class: org.apache.ivy.plugins.namespace.Namespace.1
        @Override // org.apache.ivy.plugins.namespace.NamespaceTransformer
        public ModuleRevisionId transform(ModuleRevisionId moduleRevisionId) {
            if (moduleRevisionId == null) {
                return null;
            }
            Iterator it = Namespace.this.rules.iterator();
            while (it.hasNext()) {
                ModuleRevisionId moduleRevisionIdTransform = ((NamespaceRule) it.next()).getFromSystem().transform(moduleRevisionId);
                if (Namespace.this.chainRules) {
                    moduleRevisionId = moduleRevisionIdTransform;
                } else if (!moduleRevisionIdTransform.equals(moduleRevisionId)) {
                    return moduleRevisionIdTransform;
                }
            }
            return moduleRevisionId;
        }

        @Override // org.apache.ivy.plugins.namespace.NamespaceTransformer
        public boolean isIdentity() {
            return Namespace.this.rules.isEmpty();
        }
    };
    public NamespaceTransformer toSystemTransformer = new NamespaceTransformer() { // from class: org.apache.ivy.plugins.namespace.Namespace.2
        @Override // org.apache.ivy.plugins.namespace.NamespaceTransformer
        public ModuleRevisionId transform(ModuleRevisionId moduleRevisionId) {
            if (moduleRevisionId == null) {
                return null;
            }
            Iterator it = Namespace.this.rules.iterator();
            while (it.hasNext()) {
                ModuleRevisionId moduleRevisionIdTransform = ((NamespaceRule) it.next()).getToSystem().transform(moduleRevisionId);
                if (Namespace.this.chainRules) {
                    moduleRevisionId = moduleRevisionIdTransform;
                } else if (!moduleRevisionIdTransform.equals(moduleRevisionId)) {
                    return moduleRevisionIdTransform;
                }
            }
            return moduleRevisionId;
        }

        @Override // org.apache.ivy.plugins.namespace.NamespaceTransformer
        public boolean isIdentity() {
            return Namespace.this.rules.isEmpty();
        }
    };

    public void addRule(NamespaceRule namespaceRule) {
        this.rules.add(namespaceRule);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public NamespaceTransformer getFromSystemTransformer() {
        return this.fromSystemTransformer;
    }

    public NamespaceTransformer getToSystemTransformer() {
        return this.toSystemTransformer;
    }

    public boolean isChainrules() {
        return this.chainRules;
    }

    public void setChainrules(boolean z) {
        this.chainRules = z;
    }
}
