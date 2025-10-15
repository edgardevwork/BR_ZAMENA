package org.jfrog.build.extractor.scan;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.Vector;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import org.apache.commons.lang3.StringUtils;
import org.jfrog.build.api.util.Log;

@JsonFilter("xray-graph-filter")
/* loaded from: classes5.dex */
public class DependencyTree extends DefaultMutableTreeNode {
    public GeneralInfo generalInfo;
    public Set<Issue> issues;
    public Set<License> licenses;
    public boolean metadata;
    public String packagePrefix;
    public Set<Scope> scopes;
    public Issue topIssue;
    public Set<License> violatedLicenses;

    public DependencyTree() {
        this.violatedLicenses = new HashSet();
        this.licenses = new HashSet();
        this.issues = new HashSet();
        this.scopes = new HashSet();
        this.topIssue = new Issue();
        this.packagePrefix = "";
    }

    public DependencyTree(Object obj) {
        super(obj);
        this.violatedLicenses = new HashSet();
        this.licenses = new HashSet();
        this.issues = new HashSet();
        this.scopes = new HashSet();
        this.topIssue = new Issue();
        this.packagePrefix = "";
    }

    public void setViolatedLicenses(Set<License> set) {
        this.violatedLicenses = set;
    }

    public Set<License> getViolatedLicenses() {
        return this.violatedLicenses;
    }

    public void setLicenses(Set<License> set) {
        this.licenses = set;
    }

    public void setIssues(Set<Issue> set) {
        this.issues = set;
    }

    @JsonProperty("component_id")
    public String getComponentId() {
        return this.packagePrefix + this;
    }

    public void setScopes(Set<Scope> set) {
        this.scopes = set;
    }

    public void setGeneralInfo(GeneralInfo generalInfo) {
        this.generalInfo = generalInfo;
    }

    public Set<License> getLicenses() {
        return this.licenses;
    }

    public Set<Issue> getIssues() {
        return this.issues;
    }

    public Set<Scope> getScopes() {
        return this.scopes;
    }

    public GeneralInfo getGeneralInfo() {
        return this.generalInfo;
    }

    public Issue getTopIssue() {
        return this.topIssue;
    }

    public boolean isMetadata() {
        return this.metadata;
    }

    public void setMetadata(boolean z) {
        this.metadata = z;
    }

    public void setPrefix(final String str) {
        this.packagePrefix = str.toLowerCase() + "://";
        getChildren().forEach(new Consumer() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda8
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((DependencyTree) obj).setPrefix(str);
            }
        });
    }

    public int getIssueCount() {
        return this.issues.size();
    }

    public Vector<DependencyTree> getChildren() {
        if (this.children == null) {
            return new Vector<>();
        }
        return this.children;
    }

    @JsonProperty("nodes")
    public List<DependencyTree> getNodes() {
        return getChildren();
    }

    public Set<Issue> processTreeIssues() {
        setIssuesComponent();
        getChildren().forEach(new Consumer() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda12
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$processTreeIssues$1((DependencyTree) obj);
            }
        });
        setTopIssue();
        sortChildren();
        return this.issues;
    }

    public final /* synthetic */ void lambda$processTreeIssues$1(DependencyTree dependencyTree) {
        this.issues.addAll(dependencyTree.processTreeIssues());
    }

    public final void setIssuesComponent() {
        final Object userObject = getUserObject();
        if (userObject != null) {
            this.issues.forEach(new Consumer() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda9
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    DependencyTree.lambda$setIssuesComponent$2(userObject, (Issue) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$setIssuesComponent$2(Object obj, Issue issue) {
        issue.setComponent(obj.toString());
    }

    public final void sortChildren() {
        getChildren().sort(Comparator.comparing(new Function() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DependencyTree) obj).getTopIssue();
            }
        }, Comparator.comparing(new Function() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Issue) obj).getSeverity();
            }
        })).thenComparing(new Function() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda2
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((DependencyTree) obj).getIssueCount());
            }
        }).thenComparing(new Function() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Integer.valueOf(((DependencyTree) obj).getChildCount());
            }
        }).reversed().thenComparing(new Function() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda4
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((DependencyTree) obj).toString();
            }
        }));
    }

    public final void setTopIssue() {
        this.issues.forEach(new Consumer() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$setTopIssue$3((Issue) obj);
            }
        });
    }

    public final /* synthetic */ void lambda$setTopIssue$3(Issue issue) {
        if (!this.topIssue.isTopSeverity() && issue.isHigherSeverityThan(this.topIssue)) {
            this.topIssue = issue;
        }
    }

    public Set<License> processTreeViolatedLicenses() {
        setViolatedLicensesComponent();
        this.violatedLicenses.addAll((Collection) this.licenses.stream().filter(new Predicate() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda10
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ((License) obj).isViolate();
            }
        }).collect(Collectors.toSet()));
        getChildren().forEach(new Consumer() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda11
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f$0.lambda$processTreeViolatedLicenses$4((DependencyTree) obj);
            }
        });
        return this.violatedLicenses;
    }

    public final /* synthetic */ void lambda$processTreeViolatedLicenses$4(DependencyTree dependencyTree) {
        this.violatedLicenses.addAll(dependencyTree.processTreeViolatedLicenses());
    }

    public final void setViolatedLicensesComponent() {
        final Object userObject = getUserObject();
        if (userObject != null) {
            this.licenses.forEach(new Consumer() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda13
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    DependencyTree.lambda$setViolatedLicensesComponent$5(userObject, (License) obj);
                }
            });
        }
    }

    public static /* synthetic */ void lambda$setViolatedLicensesComponent$5(Object obj, License license) {
        license.setComponent(obj.toString());
    }

    public void collectAllScopesAndLicenses(Set<Scope> set, Set<License> set2) {
        Enumeration enumerationBreadthFirstEnumeration = breadthFirstEnumeration();
        while (enumerationBreadthFirstEnumeration.hasMoreElements()) {
            DependencyTree dependencyTree = (DependencyTree) enumerationBreadthFirstEnumeration.nextElement();
            set.addAll(dependencyTree.getScopes());
            set2.addAll(dependencyTree.getLicenses());
        }
    }

    public DependencyTree find(final String str) {
        return StringUtils.equals(toString(), str) ? this : (DependencyTree) getChildren().stream().map(new Function() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda6
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return DependencyTree.lambda$find$6(str, (DependencyTree) obj);
            }
        }).filter(new Predicate() { // from class: org.jfrog.build.extractor.scan.DependencyTree$$ExternalSyntheticLambda7
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return Objects.nonNull((DependencyTree) obj);
            }
        }).findAny().orElse(null);
    }

    public static /* synthetic */ DependencyTree lambda$find$6(String str, DependencyTree dependencyTree) {
        return dependencyTree.find(str);
    }

    public boolean hasLoop(Log log) {
        TreeNode parent = getParent();
        while (true) {
            DependencyTree dependencyTree = (DependencyTree) parent;
            if (dependencyTree == null) {
                return false;
            }
            if (!Objects.equals(getUserObject(), dependencyTree.getUserObject())) {
                parent = dependencyTree.getParent();
            } else {
                log.debug("Loop detected in " + getUserObject());
                return true;
            }
        }
    }
}
