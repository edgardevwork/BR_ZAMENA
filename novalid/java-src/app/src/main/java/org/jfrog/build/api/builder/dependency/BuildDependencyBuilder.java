package org.jfrog.build.api.builder.dependency;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.jfrog.build.api.dependency.BuildDependency;

/* loaded from: classes8.dex */
public class BuildDependencyBuilder {
    public String name;
    public String number;
    public String started;
    public String url;

    public BuildDependency build() {
        if (this.name == null) {
            throw new IllegalArgumentException("BuildDependency must have a name.");
        }
        if (this.number == null) {
            throw new IllegalArgumentException("BuildDependency must have a number.");
        }
        if (this.started == null) {
            throw new IllegalArgumentException("BuildDependency must have a started time.");
        }
        BuildDependency buildDependency = new BuildDependency();
        buildDependency.setName(this.name);
        buildDependency.setNumber(this.number);
        buildDependency.setStarted(this.started);
        buildDependency.setUrl(this.url);
        return buildDependency;
    }

    public BuildDependencyBuilder name(String str) {
        this.name = str;
        return this;
    }

    public BuildDependencyBuilder number(String str) {
        this.number = str;
        return this;
    }

    public BuildDependencyBuilder started(String str) {
        this.started = str;
        return this;
    }

    public BuildDependencyBuilder startedDate(Date date) {
        if (date == null) {
            throw new IllegalArgumentException("Cannot format a null date.");
        }
        this.started = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(date);
        return this;
    }

    public BuildDependencyBuilder url(String str) {
        this.url = str;
        return this;
    }
}
