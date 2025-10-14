package org.jfrog.gradle.plugin.artifactory.dsl;

import groovy.lang.Closure;
import org.gradle.api.Action;
import org.gradle.api.Project;
import org.gradle.util.ConfigureUtil;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.gradle.plugin.artifactory.utils.GradleClientLogger;

/* loaded from: classes5.dex */
public class ArtifactoryPluginConvention {
    public final ArtifactoryClientConfiguration clientConfig;
    public final Project project;
    public PublisherConfig publisherConfig;

    public ArtifactoryPluginConvention(Project project) {
        this.project = project;
        this.clientConfig = new ArtifactoryClientConfiguration(new GradleClientLogger(project.getLogger()));
    }

    public void setContextUrl(String str) {
        this.clientConfig.publisher.setContextUrl(str);
    }

    public void publish(Closure<PublisherConfig> closure) {
        publish(ConfigureUtil.configureUsing(closure));
    }

    public void publish(Action<PublisherConfig> action) {
        PublisherConfig publisherConfig = new PublisherConfig(this);
        this.publisherConfig = publisherConfig;
        action.execute(publisherConfig);
    }

    public void buildInfo(Closure<ArtifactoryClientConfiguration.BuildInfoHandler> closure) {
        buildInfo(ConfigureUtil.configureUsing(closure));
    }

    public void buildInfo(Action<ArtifactoryClientConfiguration.BuildInfoHandler> action) {
        action.execute(this.clientConfig.info);
    }

    public void proxy(Closure<ArtifactoryClientConfiguration.ProxyHandler> closure) {
        proxy(ConfigureUtil.configureUsing(closure));
    }

    public void proxy(Action<ArtifactoryClientConfiguration.ProxyHandler> action) {
        action.execute(this.clientConfig.proxy);
    }

    public Project getProject() {
        return this.project;
    }

    public ArtifactoryClientConfiguration getClientConfig() {
        return this.clientConfig;
    }

    public PublisherConfig getPublisherConfig() {
        return this.publisherConfig;
    }
}
