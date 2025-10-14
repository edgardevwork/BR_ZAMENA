package org.jfrog.build.extractor.clientConfiguration.client.distribution.types;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes7.dex */
public class ReleaseBundleSpec implements Serializable {
    public static final long serialVersionUID = 1;
    public List<ReleaseBundleQuery> queries;

    public List<ReleaseBundleQuery> getQueries() {
        return this.queries;
    }

    public void setQueries(List<ReleaseBundleQuery> list) {
        this.queries = list;
    }
}
