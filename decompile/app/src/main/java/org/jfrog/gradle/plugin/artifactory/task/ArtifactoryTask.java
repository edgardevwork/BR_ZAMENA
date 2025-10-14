package org.jfrog.gradle.plugin.artifactory.task;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;
import groovy.lang.Closure;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;
import org.gradle.api.Action;
import org.gradle.api.DefaultTask;
import org.gradle.api.Project;
import org.gradle.api.UnknownTaskException;
import org.gradle.api.artifacts.Configuration;
import org.gradle.api.logging.Logger;
import org.gradle.api.logging.Logging;
import org.gradle.api.publish.Publication;
import org.gradle.api.publish.PublicationArtifact;
import org.gradle.api.publish.PublicationContainer;
import org.gradle.api.publish.PublishingExtension;
import org.gradle.api.publish.internal.PublicationInternal;
import org.gradle.api.publish.ivy.IvyPublication;
import org.gradle.api.publish.ivy.internal.publication.IvyPublicationInternal;
import org.gradle.api.publish.maven.MavenPublication;
import org.gradle.api.publish.maven.internal.publication.MavenPublicationInternal;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.Internal;
import org.gradle.api.tasks.Optional;
import org.gradle.api.tasks.TaskAction;
import org.gradle.util.ConfigureUtil;
import org.jfrog.build.extractor.clientConfiguration.ArtifactSpecs;
import org.jfrog.build.extractor.clientConfiguration.ArtifactoryClientConfiguration;
import org.jfrog.gradle.plugin.artifactory.Constant;
import org.jfrog.gradle.plugin.artifactory.dsl.ArtifactoryPluginConvention;
import org.jfrog.gradle.plugin.artifactory.dsl.PropertiesConfig;
import org.jfrog.gradle.plugin.artifactory.dsl.PublisherConfig;
import org.jfrog.gradle.plugin.artifactory.extractor.GradleDeployDetails;
import org.jfrog.gradle.plugin.artifactory.utils.ConventionUtils;
import org.jfrog.gradle.plugin.artifactory.utils.PublicationUtils;

/* loaded from: classes5.dex */
public class ArtifactoryTask extends DefaultTask {
    public static final String ARTIFACTORY_PUBLISH_TASK_NAME = "artifactoryPublish";
    public static final Logger log = Logging.getLogger(ArtifactoryTask.class);

    @Internal
    public Map<String, String> defaultProps;
    public final Set<Object> publications = new HashSet();
    public final Multimap<String, CharSequence> properties = ArrayListMultimap.create();

    @Input
    public final ArtifactSpecs artifactSpecs = new ArtifactSpecs();
    public final Map<String, Boolean> flags = new HashMap();
    public boolean ciServerBuild = false;

    @Input
    public boolean skip = false;
    public Set<IvyPublication> ivyPublications = new HashSet();
    public Set<MavenPublication> mavenPublications = new HashSet();
    public final Set<Configuration> archiveConfigurations = new HashSet();
    public boolean publishPublicationsSpecified = false;
    public boolean evaluated = false;
    public final Set<GradleDeployDetails> deployDetails = new TreeSet();

    public void evaluateTask() {
        Action<ArtifactoryTask> defaultsAction;
        this.evaluated = true;
        Project project = getProject();
        if (isSkip()) {
            log.debug("'{}' skipped for project '{}'.", getPath(), project.getName());
            return;
        }
        Iterator it = project.getSubprojects().iterator();
        while (it.hasNext()) {
            try {
                dependsOn(new Object[]{((Project) it.next()).getTasks().named("artifactoryPublish")});
            } catch (UnknownTaskException unused) {
                log.debug("Can't find sub projects configured for {}", getPath());
            }
        }
        ArtifactoryPluginConvention conventionWithPublisher = ConventionUtils.getConventionWithPublisher(project);
        if (conventionWithPublisher == null) {
            log.debug("Can't find convention configured for {}", getPath());
            return;
        }
        this.artifactSpecs.clear();
        this.artifactSpecs.addAll(conventionWithPublisher.getClientConfig().publisher.getArtifactSpecs());
        PublisherConfig publisherConfig = conventionWithPublisher.getPublisherConfig();
        if (publisherConfig == null || (defaultsAction = publisherConfig.getDefaultsAction()) == null) {
            return;
        }
        defaultsAction.execute(this);
    }

    @TaskAction
    public void collectDeployDetails() {
        Logger logger = log;
        logger.info("Collecting deployment details in task '{}'", getPath());
        if (!hasPublications()) {
            logger.info("No publications to publish for project '{}'", getProject().getPath());
            return;
        }
        try {
            collectDetailsFromIvyPublications();
            collectDetailsFromMavenPublications();
            collectDetailsFromConfigurations();
        } catch (Exception e) {
            throw new RuntimeException("Cannot collect deploy details for " + getPath(), e);
        }
    }

    public final void collectDetailsFromIvyPublications() {
        Iterator<IvyPublication> it = this.ivyPublications.iterator();
        while (it.hasNext()) {
            IvyPublicationInternal ivyPublicationInternal = (IvyPublication) it.next();
            String name = ivyPublicationInternal.getName();
            if (!(ivyPublicationInternal instanceof IvyPublicationInternal)) {
                log.warn("Ivy publication name '{}' is of unsupported type '{}'!", name, ivyPublicationInternal.getClass());
            } else {
                PublicationUtils.extractIvyDeployDetails(ivyPublicationInternal, this);
            }
        }
    }

    public final void collectDetailsFromMavenPublications() {
        Iterator<MavenPublication> it = this.mavenPublications.iterator();
        while (it.hasNext()) {
            MavenPublicationInternal mavenPublicationInternal = (MavenPublication) it.next();
            String name = mavenPublicationInternal.getName();
            if (!(mavenPublicationInternal instanceof MavenPublicationInternal)) {
                log.warn("Maven publication name '{}' is of unsupported type '{}'!", name, mavenPublicationInternal.getClass());
            } else {
                PublicationUtils.extractMavenDeployDetails(mavenPublicationInternal, this);
            }
        }
    }

    public final void collectDetailsFromConfigurations() {
        ArtifactoryClientConfiguration.PublisherHandler publisherHandler = ConventionUtils.getPublisherHandler(getProject());
        if (publisherHandler == null) {
            return;
        }
        Iterator<Configuration> it = this.archiveConfigurations.iterator();
        while (it.hasNext()) {
            PublicationUtils.extractArchivesDeployDetails(it.next(), publisherHandler, this);
        }
    }

    public void publications(Object... objArr) {
        if (objArr != null) {
            this.publications.addAll(Arrays.asList(objArr));
            checkDependsOnArtifactsToPublish();
        }
    }

    public final void checkDependsOnArtifactsToPublish() {
        extractPublications();
        if (!hasPublications()) {
            if (this.publishPublicationsSpecified) {
                log.warn("None of the specified publications matched for project '{}' - nothing to publish.", getProject().getPath());
                return;
            } else {
                log.debug("No publications specified for project '{}'", getProject().getPath());
                return;
            }
        }
        createDependencyOnIvyPublications();
        createDependencyOnMavenPublications();
    }

    public final void extractPublications() {
        if (this.publications.isEmpty()) {
            return;
        }
        for (Object obj : this.publications) {
            if (obj instanceof CharSequence) {
                addPublication((CharSequence) obj);
            } else if (obj instanceof Publication) {
                addPublication((Publication) obj);
            } else {
                log.error("Publication type '{}' not supported in task '{}'", obj, getClass().getName());
            }
        }
        this.publishPublicationsSpecified = true;
    }

    public final void addPublication(CharSequence charSequence) {
        PublicationContainer publications = ((PublishingExtension) getProject().getExtensions().getByType(PublishingExtension.class)).getPublications();
        if (charSequence.toString().equals(Constant.ALL_PUBLICATIONS)) {
            publications.forEach(new Consumer() { // from class: org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f$0.addPublication((Publication) obj);
                }
            });
            return;
        }
        Publication publication = (Publication) publications.findByName(charSequence.toString());
        if (publication != null) {
            addPublication(publication);
        } else {
            log.debug("Publication named '{}' does not exist for project '{}' in task '{}'.", new Object[]{charSequence, getProject().getPath(), getPath()});
        }
    }

    public final void addPublication(Publication publication) {
        if (publication instanceof IvyPublication) {
            this.ivyPublications.add((IvyPublication) publication);
        } else if (publication instanceof MavenPublication) {
            this.mavenPublications.add((MavenPublication) publication);
        } else {
            log.warn("Publication named '{}' in project '{}' is of unknown type '{}'", new Object[]{publication.getName(), getProject().getPath(), publication.getClass()});
        }
    }

    public void addDefaultPublications() {
        if (hasPublications()) {
            if (this.publishPublicationsSpecified) {
                log.warn("None of the specified publications matched for project '{}' - nothing to publish.", getProject().getPath());
                return;
            }
            return;
        }
        PublishingExtension publishingExtension = (PublishingExtension) getProject().getExtensions().findByName(Constant.PUBLISHING);
        if (publishingExtension == null) {
            log.warn("Can't find publishing extensions that is defined for the project {}", getProject().getPath());
            return;
        }
        addPublicationIfExists(publishingExtension, Constant.MAVEN_JAVA);
        addPublicationIfExists(publishingExtension, Constant.MAVEN_JAVA_PLATFORM);
        addPublicationIfExists(publishingExtension, Constant.MAVEN_WEB);
        addPublicationIfExists(publishingExtension, Constant.IVY_JAVA);
        checkDependsOnArtifactsToPublish();
    }

    public void addDefaultArchiveConfigurations() {
        Project project = getProject();
        Configuration configuration = (Configuration) project.getConfigurations().findByName("archives");
        if (configuration == null) {
            log.debug("No publish configurations specified for project '{}' and the default '{}' configuration does not exist.", project.getPath(), "archives");
        } else {
            this.archiveConfigurations.add(configuration);
            dependsOn(new Object[]{configuration.getArtifacts()});
        }
    }

    public final void addPublicationIfExists(PublishingExtension publishingExtension, String str) {
        Publication publication = (Publication) publishingExtension.getPublications().findByName(str);
        if (publication != null) {
            log.info("Publication '{}' exists but not specified for '{}' - adding to task publications.", getPath(), str);
            addPublication(publication);
        }
    }

    public final void createDependencyOnIvyPublications() {
        for (IvyPublication ivyPublication : this.ivyPublications) {
            if (!(ivyPublication instanceof IvyPublicationInternal)) {
                log.warn("Ivy publication name '{}' is of unsupported type '{}'!", ivyPublication.getName(), ivyPublication.getClass());
            } else {
                dependsOnPublishable(ivyPublication);
                dependsOn(new Object[]{String.format("%s:generateDescriptorFileFor%sPublication", getProject().getPath(), ivyPublication.getName().substring(0, 1).toUpperCase() + ivyPublication.getName().substring(1))});
            }
        }
    }

    public final void createDependencyOnMavenPublications() {
        for (MavenPublication mavenPublication : this.mavenPublications) {
            if (!(mavenPublication instanceof MavenPublicationInternal)) {
                log.warn("Maven publication name '{}' is of unsupported type '{}'!", mavenPublication.getName(), mavenPublication.getClass());
            } else {
                dependsOnPublishable(mavenPublication);
                dependsOn(new Object[]{String.format("%s:generatePomFileFor%sPublication", getProject().getPath(), mavenPublication.getName().substring(0, 1).toUpperCase() + mavenPublication.getName().substring(1))});
            }
        }
    }

    public final void dependsOnPublishable(Publication publication) {
        final PublicationInternal publicationInternal = (PublicationInternal) publication;
        Objects.requireNonNull(publicationInternal);
        dependsOn(new Object[]{new Callable() { // from class: org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return publicationInternal.getPublishableArtifacts();
            }
        }});
        publicationInternal.allPublishableArtifacts(new Action() { // from class: org.jfrog.gradle.plugin.artifactory.task.ArtifactoryTask$$ExternalSyntheticLambda2
            public final void execute(Object obj) {
                ArtifactoryTask.lambda$dependsOnPublishable$0(this.f$0, (PublicationArtifact) obj);
            }
        });
    }

    public static /* synthetic */ void lambda$dependsOnPublishable$0(ArtifactoryTask artifactoryTask, Object obj) {
        artifactoryTask.dependsOn(new Object[]{obj});
    }

    public boolean hasPublications() {
        return (this.ivyPublications.isEmpty() && this.mavenPublications.isEmpty() && this.archiveConfigurations.isEmpty()) ? false : true;
    }

    public void finalizeByDeployTask(Project project) {
        try {
            finalizedBy(new Object[]{project.getRootProject().getTasks().named(Constant.DEPLOY_TASK_NAME)});
        } catch (UnknownTaskException e) {
            throw new IllegalStateException(String.format("Could not find %s in the root project", Constant.DEPLOY_TASK_NAME), e);
        }
    }

    public void properties(Closure<PropertiesConfig> closure) {
        properties(ConfigureUtil.configureUsing(closure));
    }

    public void properties(Action<PropertiesConfig> action) {
        PropertiesConfig propertiesConfig = new PropertiesConfig(getProject());
        action.execute(propertiesConfig);
        this.artifactSpecs.clear();
        this.artifactSpecs.addAll(propertiesConfig.getArtifactSpecs());
    }

    @Input
    @Optional
    public Set<GradleDeployDetails> getDeployDetails() {
        return this.deployDetails;
    }

    @Input
    public Set<Publication> getPublications() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(this.ivyPublications);
        hashSet.addAll(this.mavenPublications);
        return hashSet;
    }

    @Input
    public Multimap<String, CharSequence> getProperties() {
        return this.properties;
    }

    @Nullable
    @Input
    @Optional
    public Boolean getPublishArtifacts() {
        return getFlag(Constant.PUBLISH_ARTIFACTS);
    }

    @Nullable
    @Input
    @Optional
    public Boolean getPublishIvy() {
        return getFlag(Constant.PUBLISH_IVY);
    }

    @Nullable
    @Input
    @Optional
    public Boolean getPublishPom() {
        return getFlag(Constant.PUBLISH_POM);
    }

    @Input
    public boolean isCiServerBuild() {
        return this.ciServerBuild;
    }

    public ArtifactSpecs getArtifactSpecs() {
        return this.artifactSpecs;
    }

    public boolean isSkip() {
        return this.skip;
    }

    public Map<String, String> getDefaultProps() {
        if (this.defaultProps == null) {
            HashMap map = new HashMap();
            this.defaultProps = map;
            PublicationUtils.addProps(map, getProperties());
            ArtifactoryClientConfiguration.PublisherHandler publisherHandler = ConventionUtils.getPublisherHandler(getProject().getRootProject());
            if (publisherHandler != null) {
                this.defaultProps.putAll(publisherHandler.getMatrixParams());
            }
        }
        return this.defaultProps;
    }

    public void setCiServerBuild() {
        this.ciServerBuild = true;
    }

    public void setSkip(boolean z) {
        this.skip = z;
    }

    public void setProperties(Map<String, CharSequence> map) {
        CharSequence value;
        if (map == null || map.isEmpty()) {
            return;
        }
        this.properties.clear();
        for (Map.Entry<String, CharSequence> entry : map.entrySet()) {
            String key = entry.getKey();
            if (StringUtils.isNotBlank(key) && (value = entry.getValue()) != null) {
                this.properties.put(key, value);
            }
        }
    }

    public void setPublishArtifacts(Object obj) {
        setFlag(Constant.PUBLISH_ARTIFACTS, toBoolean(obj));
    }

    public void setPublishPom(Object obj) {
        setFlag(Constant.PUBLISH_POM, toBoolean(obj));
    }

    public void setPublishIvy(Object obj) {
        setFlag(Constant.PUBLISH_IVY, toBoolean(obj));
    }

    @Internal
    public boolean isEvaluated() {
        return this.evaluated;
    }

    public final Boolean toBoolean(Object obj) {
        return Boolean.valueOf(obj.toString());
    }

    @Nullable
    public final Boolean getFlag(String str) {
        return this.flags.get(str);
    }

    public final void setFlag(String str, Boolean bool) {
        this.flags.put(str, bool);
    }
}
