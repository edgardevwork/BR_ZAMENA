package org.apache.ivy;

import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import org.apache.ivy.core.IvyContext;
import org.apache.ivy.core.LogOptions;
import org.apache.ivy.core.cache.ResolutionCacheManager;
import org.apache.ivy.core.check.CheckEngine;
import org.apache.ivy.core.deliver.DeliverEngine;
import org.apache.ivy.core.deliver.DeliverOptions;
import org.apache.ivy.core.event.EventManager;
import org.apache.ivy.core.install.InstallEngine;
import org.apache.ivy.core.install.InstallOptions;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.descriptor.ModuleDescriptor;
import org.apache.ivy.core.module.p062id.ModuleId;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.publish.PublishEngine;
import org.apache.ivy.core.publish.PublishOptions;
import org.apache.ivy.core.report.ResolveReport;
import org.apache.ivy.core.repository.RepositoryManagementEngine;
import org.apache.ivy.core.resolve.IvyNode;
import org.apache.ivy.core.resolve.ResolveData;
import org.apache.ivy.core.resolve.ResolveEngine;
import org.apache.ivy.core.resolve.ResolveOptions;
import org.apache.ivy.core.resolve.ResolvedModuleRevision;
import org.apache.ivy.core.retrieve.RetrieveEngine;
import org.apache.ivy.core.retrieve.RetrieveOptions;
import org.apache.ivy.core.retrieve.RetrieveReport;
import org.apache.ivy.core.search.ModuleEntry;
import org.apache.ivy.core.search.OrganisationEntry;
import org.apache.ivy.core.search.RevisionEntry;
import org.apache.ivy.core.search.SearchEngine;
import org.apache.ivy.core.settings.IvySettings;
import org.apache.ivy.core.sort.SortEngine;
import org.apache.ivy.core.sort.SortOptions;
import org.apache.ivy.plugins.matcher.PatternMatcher;
import org.apache.ivy.plugins.repository.TransferEvent;
import org.apache.ivy.plugins.repository.TransferListener;
import org.apache.ivy.plugins.resolver.BasicResolver;
import org.apache.ivy.plugins.resolver.DependencyResolver;
import org.apache.ivy.plugins.trigger.Trigger;
import org.apache.ivy.util.DateUtil;
import org.apache.ivy.util.HostUtil;
import org.apache.ivy.util.Message;
import org.apache.ivy.util.MessageLoggerEngine;

/* loaded from: classes7.dex */
public class Ivy {

    @Deprecated
    public static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat(DateUtil.DATE_FORMAT_PATTERN);
    public static final String IVY_DATE;
    public static final String IVY_VERSION;
    public static final int KILO = 1024;
    public boolean bound;
    public CheckEngine checkEngine;
    public DeliverEngine deliverEngine;
    public EventManager eventManager;
    public InstallEngine installEngine;
    public boolean interrupted;
    public MessageLoggerEngine loggerEngine = new MessageLoggerEngine();
    public PublishEngine publishEngine;
    public RepositoryManagementEngine repositoryEngine;
    public ResolveEngine resolveEngine;
    public RetrieveEngine retrieveEngine;
    public SearchEngine searchEngine;
    public IvySettings settings;
    public SortEngine sortEngine;

    public interface IvyCallback {
        Object doInIvyContext(Ivy ivy, IvyContext ivyContext);
    }

    static {
        Properties properties = new Properties();
        URL resource = Message.class.getResource("/module.properties");
        if (resource != null) {
            try {
                InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(resource);
                properties.load(inputStreamOpenStream);
                inputStreamOpenStream.close();
            } catch (IOException unused) {
            }
        }
        IVY_VERSION = properties.getProperty("version", "non official version");
        IVY_DATE = properties.getProperty("date", "");
    }

    public static String getIvyVersion() {
        return IVY_VERSION;
    }

    public static String getIvyDate() {
        return IVY_DATE;
    }

    public static String getIvyHomeURL() {
        return "https://ant.apache.org/ivy/";
    }

    public static Ivy newInstance() {
        Ivy ivy = new Ivy();
        ivy.bind();
        return ivy;
    }

    public static Ivy newInstance(IvySettings ivySettings) {
        Ivy ivy = new Ivy();
        ivy.setSettings(ivySettings);
        ivy.bind();
        return ivy;
    }

    public void bind() {
        pushContext();
        try {
            if (this.settings == null) {
                this.settings = new IvySettings();
            }
            if (this.eventManager == null) {
                this.eventManager = new EventManager();
            }
            if (this.sortEngine == null) {
                this.sortEngine = new SortEngine(this.settings);
            }
            if (this.searchEngine == null) {
                this.searchEngine = new SearchEngine(this.settings);
            }
            if (this.resolveEngine == null) {
                this.resolveEngine = new ResolveEngine(this.settings, this.eventManager, this.sortEngine);
            }
            if (this.retrieveEngine == null) {
                this.retrieveEngine = new RetrieveEngine(this.settings, this.eventManager);
            }
            if (this.deliverEngine == null) {
                this.deliverEngine = new DeliverEngine(this.settings);
            }
            if (this.publishEngine == null) {
                this.publishEngine = new PublishEngine(this.settings, this.eventManager);
            }
            if (this.installEngine == null) {
                this.installEngine = new InstallEngine(this.settings, this.searchEngine, this.resolveEngine);
            }
            if (this.repositoryEngine == null) {
                this.repositoryEngine = new RepositoryManagementEngine(this.settings, this.searchEngine, this.resolveEngine);
            }
            this.eventManager.addTransferListener(new TransferListener() { // from class: org.apache.ivy.Ivy.1
                public C111521() {
                }

                @Override // org.apache.ivy.plugins.repository.TransferListener
                public void transferProgress(TransferEvent transferEvent) {
                    int eventType = transferEvent.getEventType();
                    if (eventType != 2) {
                        if (eventType != 3) {
                            return;
                        }
                        ResolveData resolveData = IvyContext.getContext().getResolveData();
                        if (resolveData == null || !LogOptions.LOG_QUIET.equals(resolveData.getOptions().getLog())) {
                            Message.progress();
                            return;
                        }
                        return;
                    }
                    ResolveData resolveData2 = IvyContext.getContext().getResolveData();
                    if (resolveData2 == null || !LogOptions.LOG_QUIET.equals(resolveData2.getOptions().getLog())) {
                        Message.endProgress(" (" + (transferEvent.getTotalLength() / 1024) + "kB)");
                    }
                }
            });
            this.bound = true;
            popContext();
        } catch (Throwable th) {
            popContext();
            throw th;
        }
    }

    /* renamed from: org.apache.ivy.Ivy$1 */
    public class C111521 implements TransferListener {
        public C111521() {
        }

        @Override // org.apache.ivy.plugins.repository.TransferListener
        public void transferProgress(TransferEvent transferEvent) {
            int eventType = transferEvent.getEventType();
            if (eventType != 2) {
                if (eventType != 3) {
                    return;
                }
                ResolveData resolveData = IvyContext.getContext().getResolveData();
                if (resolveData == null || !LogOptions.LOG_QUIET.equals(resolveData.getOptions().getLog())) {
                    Message.progress();
                    return;
                }
                return;
            }
            ResolveData resolveData2 = IvyContext.getContext().getResolveData();
            if (resolveData2 == null || !LogOptions.LOG_QUIET.equals(resolveData2.getOptions().getLog())) {
                Message.endProgress(" (" + (transferEvent.getTotalLength() / 1024) + "kB)");
            }
        }
    }

    public Object execute(IvyCallback ivyCallback) {
        pushContext();
        try {
            return ivyCallback.doInIvyContext(this, IvyContext.getContext());
        } finally {
            popContext();
        }
    }

    public void pushContext() {
        if (IvyContext.getContext().peekIvy() != this) {
            IvyContext.pushNewContext();
            IvyContext.getContext().setIvy(this);
        } else {
            IvyContext.pushContext(IvyContext.getContext());
        }
    }

    public void popContext() {
        IvyContext.popContext();
    }

    public void configure(File file) throws IOException, ParseException {
        pushContext();
        try {
            assertBound();
            this.settings.load(file);
            postConfigure();
        } finally {
            popContext();
        }
    }

    public void configure(URL url) throws IOException, ParseException {
        pushContext();
        try {
            assertBound();
            this.settings.load(url);
            postConfigure();
        } finally {
            popContext();
        }
    }

    public void configureDefault() throws IOException, ParseException {
        pushContext();
        try {
            assertBound();
            this.settings.loadDefault();
            postConfigure();
        } finally {
            popContext();
        }
    }

    public void configureDefault14() throws IOException, ParseException {
        pushContext();
        try {
            assertBound();
            this.settings.loadDefault14();
            postConfigure();
        } finally {
            popContext();
        }
    }

    public boolean check(URL url, String str) {
        pushContext();
        try {
            return this.checkEngine.check(url, str);
        } finally {
            popContext();
        }
    }

    public ResolveReport resolve(File file) throws IOException, ParseException {
        pushContext();
        try {
            return this.resolveEngine.resolve(file);
        } finally {
            popContext();
        }
    }

    public ResolveReport resolve(URL url) throws IOException, ParseException {
        pushContext();
        try {
            return this.resolveEngine.resolve(url);
        } finally {
            popContext();
        }
    }

    public ResolveReport resolve(ModuleRevisionId moduleRevisionId, ResolveOptions resolveOptions, boolean z) throws IOException, ParseException {
        pushContext();
        try {
            return this.resolveEngine.resolve(moduleRevisionId, resolveOptions, z);
        } finally {
            popContext();
        }
    }

    public ResolveReport resolve(URL url, ResolveOptions resolveOptions) throws IOException, ParseException {
        pushContext();
        try {
            return this.resolveEngine.resolve(url, resolveOptions);
        } finally {
            popContext();
        }
    }

    public ResolveReport resolve(File file, ResolveOptions resolveOptions) throws IOException, ParseException {
        return resolve(file.toURI().toURL(), resolveOptions);
    }

    public ResolveReport resolve(ModuleDescriptor moduleDescriptor, ResolveOptions resolveOptions) throws IOException, ParseException {
        pushContext();
        try {
            return this.resolveEngine.resolve(moduleDescriptor, resolveOptions);
        } finally {
            popContext();
        }
    }

    public ResolveReport install(ModuleRevisionId moduleRevisionId, String str, String str2, InstallOptions installOptions) throws IOException {
        pushContext();
        try {
            return this.installEngine.install(moduleRevisionId, str, str2, installOptions);
        } finally {
            popContext();
        }
    }

    @Deprecated
    public int retrieve(ModuleRevisionId moduleRevisionId, String str, RetrieveOptions retrieveOptions) throws IOException {
        pushContext();
        try {
            return this.retrieveEngine.retrieve(moduleRevisionId, str, retrieveOptions);
        } finally {
            popContext();
        }
    }

    public RetrieveReport retrieve(ModuleRevisionId moduleRevisionId, RetrieveOptions retrieveOptions) throws IOException {
        pushContext();
        try {
            return this.retrieveEngine.retrieve(moduleRevisionId, retrieveOptions);
        } finally {
            popContext();
        }
    }

    public void deliver(ModuleRevisionId moduleRevisionId, String str, String str2) throws IOException, ParseException {
        pushContext();
        try {
            this.deliverEngine.deliver(moduleRevisionId, str, str2, DeliverOptions.newInstance(this.settings));
        } finally {
            popContext();
        }
    }

    public void deliver(String str, String str2, DeliverOptions deliverOptions) throws IOException, ParseException {
        pushContext();
        try {
            this.deliverEngine.deliver(str, str2, deliverOptions);
        } finally {
            popContext();
        }
    }

    public void deliver(ModuleRevisionId moduleRevisionId, String str, String str2, DeliverOptions deliverOptions) throws IOException, ParseException {
        pushContext();
        try {
            this.deliverEngine.deliver(moduleRevisionId, str, str2, deliverOptions);
        } finally {
            popContext();
        }
    }

    public Collection<Artifact> publish(ModuleRevisionId moduleRevisionId, Collection<String> collection, String str, PublishOptions publishOptions) throws IOException {
        pushContext();
        try {
            return this.publishEngine.publish(moduleRevisionId, collection, str, publishOptions);
        } finally {
            popContext();
        }
    }

    public List<IvyNode> sortNodes(Collection<IvyNode> collection, SortOptions sortOptions) {
        pushContext();
        try {
            return getSortEngine().sortNodes(collection, sortOptions);
        } finally {
            popContext();
        }
    }

    public List<ModuleDescriptor> sortModuleDescriptors(Collection<ModuleDescriptor> collection, SortOptions sortOptions) {
        pushContext();
        try {
            return getSortEngine().sortModuleDescriptors(collection, sortOptions);
        } finally {
            popContext();
        }
    }

    public ResolvedModuleRevision findModule(ModuleRevisionId moduleRevisionId) {
        pushContext();
        try {
            ResolveOptions resolveOptions = new ResolveOptions();
            resolveOptions.setValidate(false);
            return this.resolveEngine.findModule(moduleRevisionId, resolveOptions);
        } finally {
            popContext();
        }
    }

    public ModuleEntry[] listModuleEntries(OrganisationEntry organisationEntry) {
        pushContext();
        try {
            return this.searchEngine.listModuleEntries(organisationEntry);
        } finally {
            popContext();
        }
    }

    public ModuleId[] listModules(ModuleId moduleId, PatternMatcher patternMatcher) {
        pushContext();
        try {
            return this.searchEngine.listModules(moduleId, patternMatcher);
        } finally {
            popContext();
        }
    }

    public ModuleRevisionId[] listModules(ModuleRevisionId moduleRevisionId, PatternMatcher patternMatcher) {
        pushContext();
        try {
            return this.searchEngine.listModules(moduleRevisionId, patternMatcher);
        } finally {
            popContext();
        }
    }

    public String[] listModules(String str) {
        pushContext();
        try {
            return this.searchEngine.listModules(str);
        } finally {
            popContext();
        }
    }

    public OrganisationEntry[] listOrganisationEntries() {
        pushContext();
        try {
            return this.searchEngine.listOrganisationEntries();
        } finally {
            popContext();
        }
    }

    public String[] listOrganisations() {
        pushContext();
        try {
            return this.searchEngine.listOrganisations();
        } finally {
            popContext();
        }
    }

    public RevisionEntry[] listRevisionEntries(ModuleEntry moduleEntry) {
        pushContext();
        try {
            return this.searchEngine.listRevisionEntries(moduleEntry);
        } finally {
            popContext();
        }
    }

    public String[] listRevisions(String str, String str2) {
        pushContext();
        try {
            return this.searchEngine.listRevisions(str, str2);
        } finally {
            popContext();
        }
    }

    public String[] listTokenValues(String str, Map<String, Object> map) {
        pushContext();
        try {
            return this.searchEngine.listTokenValues(str, map);
        } finally {
            popContext();
        }
    }

    public void interrupt() throws InterruptedException {
        interrupt(IvyContext.getContext().getOperatingThread());
    }

    public void interrupt(Thread thread) throws InterruptedException {
        if (thread == null || !thread.isAlive()) {
            return;
        }
        if (thread == Thread.currentThread()) {
            throw new IllegalStateException("cannot call interrupt from ivy operating thread");
        }
        Message.verbose("interrupting operating thread...");
        thread.interrupt();
        synchronized (this) {
            this.interrupted = true;
        }
        try {
            Message.verbose("waiting clean interruption of operating thread");
            thread.join(this.settings.getInterruptTimeout());
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        if (thread.isAlive()) {
            Message.warn("waited clean interruption for too long: stopping operating thread");
            thread.stop();
        }
        synchronized (this) {
            this.interrupted = false;
        }
    }

    public synchronized boolean isInterrupted() {
        return this.interrupted;
    }

    public void checkInterrupted() {
        if (isInterrupted()) {
            Message.info("operation interrupted");
            throw new RuntimeException("operation interrupted");
        }
    }

    public static String getWorkingRevision() {
        return "working@" + HostUtil.getLocalHostName();
    }

    public ResolutionCacheManager getResolutionCacheManager() {
        return this.settings.getResolutionCacheManager();
    }

    public final void assertBound() {
        if (this.bound) {
            return;
        }
        bind();
    }

    public final void postConfigure() {
        for (Trigger trigger : this.settings.getTriggers()) {
            this.eventManager.addIvyListener(trigger, trigger.getEventFilter());
        }
        for (DependencyResolver dependencyResolver : this.settings.getResolvers()) {
            if (dependencyResolver instanceof BasicResolver) {
                ((BasicResolver) dependencyResolver).setEventManager(this.eventManager);
            }
        }
    }

    public String getVariable(String str) {
        pushContext();
        try {
            assertBound();
            return this.settings.getVariable(str);
        } finally {
            popContext();
        }
    }

    public String substitute(String str) {
        pushContext();
        try {
            assertBound();
            return this.settings.substitute(str);
        } finally {
            popContext();
        }
    }

    public void setVariable(String str, String str2) {
        pushContext();
        try {
            assertBound();
            this.settings.setVariable(str, str2);
        } finally {
            popContext();
        }
    }

    public IvySettings getSettings() {
        return this.settings;
    }

    public EventManager getEventManager() {
        return this.eventManager;
    }

    public CheckEngine getCheckEngine() {
        return this.checkEngine;
    }

    public void setCheckEngine(CheckEngine checkEngine) {
        this.checkEngine = checkEngine;
    }

    public DeliverEngine getDeliverEngine() {
        return this.deliverEngine;
    }

    public void setDeliverEngine(DeliverEngine deliverEngine) {
        this.deliverEngine = deliverEngine;
    }

    public InstallEngine getInstallEngine() {
        return this.installEngine;
    }

    public void setInstallEngine(InstallEngine installEngine) {
        this.installEngine = installEngine;
    }

    public PublishEngine getPublishEngine() {
        return this.publishEngine;
    }

    public void setPublishEngine(PublishEngine publishEngine) {
        this.publishEngine = publishEngine;
    }

    public ResolveEngine getResolveEngine() {
        return this.resolveEngine;
    }

    public void setResolveEngine(ResolveEngine resolveEngine) {
        this.resolveEngine = resolveEngine;
    }

    public RetrieveEngine getRetrieveEngine() {
        return this.retrieveEngine;
    }

    public void setRetrieveEngine(RetrieveEngine retrieveEngine) {
        this.retrieveEngine = retrieveEngine;
    }

    public SearchEngine getSearchEngine() {
        return this.searchEngine;
    }

    public void setSearchEngine(SearchEngine searchEngine) {
        this.searchEngine = searchEngine;
    }

    public SortEngine getSortEngine() {
        return this.sortEngine;
    }

    public void setSortEngine(SortEngine sortEngine) {
        this.sortEngine = sortEngine;
    }

    public RepositoryManagementEngine getRepositoryEngine() {
        return this.repositoryEngine;
    }

    public void setRepositoryEngine(RepositoryManagementEngine repositoryManagementEngine) {
        this.repositoryEngine = repositoryManagementEngine;
    }

    public void setEventManager(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void setSettings(IvySettings ivySettings) {
        this.settings = ivySettings;
    }

    public MessageLoggerEngine getLoggerEngine() {
        return this.loggerEngine;
    }
}
