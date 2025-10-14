package org.jfrog.build.extractor.clientConfiguration.client.distribution.types;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import org.jfrog.filespecs.distribution.PathMapping;
import org.jfrog.filespecs.properties.Property;

/* loaded from: classes7.dex */
public class ReleaseBundleQuery implements Serializable {
    public static final long serialVersionUID = 1;

    @JsonProperty("added_props")
    public List<Property> addedProps;
    public String aql;
    public List<PathMapping> mappings;

    @JsonProperty("query_name")
    public String queryName;

    public List<PathMapping> getMappings() {
        return this.mappings;
    }

    public void setMappings(List<PathMapping> list) {
        this.mappings = list;
    }

    public List<Property> getAddedProps() {
        return this.addedProps;
    }

    public void setAddedProps(List<Property> list) {
        this.addedProps = list;
    }

    public String getQueryName() {
        return this.queryName;
    }

    public void setQueryName(String str) {
        this.queryName = str;
    }

    public String getAql() {
        return this.aql;
    }

    public void setAql(String str) {
        this.aql = str;
    }
}
