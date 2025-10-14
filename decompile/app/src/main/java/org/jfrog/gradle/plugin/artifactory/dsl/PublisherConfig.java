package org.jfrog.gradle.plugin.artifactory.dsl;

import groovy.lang.Closure;
import org.gradle.api.Action;
import org.gradle.util.ConfigureUtil;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask;

/* loaded from: classes5.dex */
public class PublisherConfig {
    public Action<ArtifactoryTask> defaultsAction;
    public final ArtifactoryClientConfiguration.PublisherHandler publisher;
    public final Repository repository;

    public PublisherConfig(ArtifactoryPluginConvention artifactoryPluginConvention) {
        ArtifactoryClientConfiguration.PublisherHandler publisherHandler = artifactoryPluginConvention.getClientConfig().publisher;
        this.publisher = publisherHandler;
        this.repository = new Repository(publisherHandler);
    }

    public String getContextUrl() {
        return this.publisher.getContextUrl();
    }

    public void setContextUrl(String str) {
        this.publisher.setContextUrl(str);
    }

    public void defaults(Closure<ArtifactoryTask> closure) {
        defaults(ConfigureUtil.configureUsing(closure));
    }

    public void defaults(Action<ArtifactoryTask> action) {
        this.defaultsAction = action;
    }

    public Action<ArtifactoryTask> getDefaultsAction() {
        return this.defaultsAction;
    }

    public boolean isPublishBuildInfo() {
        return this.publisher.isPublishBuildInfo().booleanValue();
    }

    public void publishBuildInfo(boolean z) {
        this.publisher.setPublishBuildInfo(Boolean.valueOf(z));
    }

    public int getForkCount() {
        return this.publisher.getPublishForkCount().intValue();
    }

    public void setForkCount(int i) {
        this.publisher.setPublishForkCount(i);
    }

    public void repository(Closure<Repository> closure) {
        repository(ConfigureUtil.configureUsing(closure));
    }

    public void repository(Action<Repository> action) {
        action.execute(this.repository);
    }

    public Repository getRepository() {
        return this.repository;
    }

    public static class Repository {
        public final IvyPublishInfo ivyPublishInfo;
        public final ArtifactoryClientConfiguration.PublisherHandler publisher;

        public Repository(ArtifactoryClientConfiguration.PublisherHandler publisherHandler) {
            this.publisher = publisherHandler;
            this.ivyPublishInfo = new IvyPublishInfo(publisherHandler);
        }

        public String getRepoKey() {
            return this.publisher.getRepoKey();
        }

        public void setRepoKey(String str) {
            this.publisher.setRepoKey(str);
        }

        public String getUsername() {
            return this.publisher.getUsername();
        }

        public void setUsername(String str) {
            this.publisher.setUsername(str);
        }

        public String getPassword() {
            return this.publisher.getPassword();
        }

        public void setPassword(String str) {
            this.publisher.setPassword(str);
        }

        public void ivy(Closure<IvyPublishInfo> closure) {
            ivy(ConfigureUtil.configureUsing(closure));
        }

        public void ivy(Action<IvyPublishInfo> action) {
            action.execute(this.ivyPublishInfo);
        }

        public IvyPublishInfo getIvy() {
            return this.ivyPublishInfo;
        }
    }

    public static class IvyPublishInfo {
        public final ArtifactoryClientConfiguration.PublisherHandler publisher;

        public IvyPublishInfo(ArtifactoryClientConfiguration.PublisherHandler publisherHandler) {
            this.publisher = publisherHandler;
        }

        public void setIvyLayout(String str) {
            this.publisher.setIvy(Boolean.TRUE);
            this.publisher.setIvyPattern(str);
        }

        public String getIvyLayout() {
            return this.publisher.getIvyPattern();
        }

        public void setArtifactLayout(String str) {
            this.publisher.setIvyArtifactPattern(str);
        }

        public String getArtifactLayout() {
            return this.publisher.getIvyArtifactPattern();
        }

        public boolean getMavenCompatible() {
            return this.publisher.isM2Compatible();
        }

        public void setMavenCompatible(boolean z) {
            this.publisher.setM2Compatible(Boolean.valueOf(z));
        }
    }
}
