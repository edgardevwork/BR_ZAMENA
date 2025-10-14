package org.apache.ivy.ant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.ivy.core.report.ArtifactDownloadReport;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Location;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.types.Reference;
import org.apache.tools.ant.types.Resource;
import org.apache.tools.ant.types.ResourceCollection;
import org.apache.tools.ant.types.resources.BaseResourceCollectionWrapper;
import org.apache.tools.ant.types.resources.FileResource;

/* loaded from: classes5.dex */
public class IvyResources extends IvyCacheTask implements ResourceCollection {
    public IvyBaseResourceCollectionWrapper wrapper = new IvyBaseResourceCollectionWrapper();

    public boolean isFilesystemOnly() {
        return true;
    }

    /* loaded from: classes7.dex */
    public class IvyBaseResourceCollectionWrapper extends BaseResourceCollectionWrapper {
        public IvyBaseResourceCollectionWrapper() {
        }

        public Collection<Resource> getCollection() {
            return IvyResources.this.resolveResources(null);
        }
    }

    public void setLocation(Location location) {
        super.setLocation(location);
        this.wrapper.setLocation(location);
    }

    public void setProject(Project project) {
        super.setProject(project);
        this.wrapper.setProject(project);
    }

    public void setDescription(String str) {
        super.setDescription(str);
        this.wrapper.setDescription(str);
    }

    public void setRefid(Reference reference) {
        this.wrapper.setRefid(reference);
    }

    public void setCache(boolean z) {
        this.wrapper.setCache(z);
    }

    public Iterator<Resource> iterator() {
        return this.wrapper.iterator();
    }

    public int size() {
        return this.wrapper.size();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    public final Collection<Resource> resolveResources(String str) throws BuildException {
        prepareAndCheck();
        try {
            ArrayList arrayList = new ArrayList();
            if (str != null) {
                getProject().addReference(str, this);
            }
            Iterator<ArtifactDownloadReport> it = getArtifactReports().iterator();
            while (it.hasNext()) {
                arrayList.add(new FileResource(it.next().getLocalFile()));
            }
            return arrayList;
        } catch (Exception e) {
            throw new BuildException("impossible to build ivy resources: " + e, e);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: org.apache.tools.ant.BuildException */
    @Override // org.apache.ivy.ant.IvyTask
    public void doExecute() throws BuildException {
        throw new BuildException("ivy:resources should not be used as a Ant Task");
    }
}
