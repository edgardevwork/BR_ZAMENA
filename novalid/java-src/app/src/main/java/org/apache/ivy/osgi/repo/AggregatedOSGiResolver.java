package org.apache.ivy.osgi.repo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class AggregatedOSGiResolver extends AbstractOSGiResolver {
    public List<AbstractOSGiResolver> resolvers = new ArrayList();

    public void add(AbstractOSGiResolver abstractOSGiResolver) {
        this.resolvers.add(abstractOSGiResolver);
    }

    @Override // org.apache.ivy.osgi.repo.AbstractOSGiResolver
    public void init() {
        ArrayList arrayList = new ArrayList();
        Iterator<AbstractOSGiResolver> it = this.resolvers.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getRepoDescriptor());
        }
        setRepoDescriptor(new AggregatedRepoDescriptor(arrayList));
    }
}
