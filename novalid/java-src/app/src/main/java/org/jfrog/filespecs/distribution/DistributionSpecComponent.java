package org.jfrog.filespecs.distribution;

import java.util.List;
import java.util.Objects;
import org.jfrog.filespecs.properties.Property;

/* loaded from: classes5.dex */
public class DistributionSpecComponent {
    public List<Property> addedProps;
    public String aql;
    public List<PathMapping> mappings;

    public DistributionSpecComponent(String str, List<PathMapping> list, List<Property> list2) {
        this.aql = str;
        this.mappings = list;
        this.addedProps = list2;
    }

    public String getAql() {
        return this.aql;
    }

    public List<PathMapping> getMappings() {
        return this.mappings;
    }

    public List<Property> getAddedProps() {
        return this.addedProps;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DistributionSpecComponent distributionSpecComponent = (DistributionSpecComponent) obj;
        return this.aql.equals(distributionSpecComponent.aql) && Objects.equals(this.mappings, distributionSpecComponent.mappings) && Objects.equals(this.addedProps, distributionSpecComponent.addedProps);
    }

    public int hashCode() {
        return Objects.hash(this.aql, this.mappings, this.addedProps);
    }
}
