package org.apache.ivy.plugins.resolver;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.ivy.core.IvyPatternHelper;
import org.apache.ivy.core.module.descriptor.Artifact;
import org.apache.ivy.core.module.p062id.ModuleRevisionId;
import org.apache.ivy.core.settings.IvyPattern;
import org.apache.ivy.plugins.parser.p064m2.PomReader;
import org.apache.ivy.plugins.repository.file.FileRepository;
import org.apache.ivy.util.Checks;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class FileSystemResolver extends RepositoryResolver {
    public static final String TRANSACTION_DESTINATION_SUFFIX = ".part";
    public static final Pattern TRANSACTION_PATTERN = Pattern.compile("(.*[/\\\\]\\[revision\\])([/\\\\].+)");
    public String baseTransactionPattern;
    public Boolean supportTransaction;
    public File transactionDestDir;
    public File transactionTempDir;
    public String transactional = "auto";
    public Map<String, String> fullTransactionPatterns = new HashMap();

    public FileSystemResolver() {
        setRepository(new FileRepository());
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return PomReader.PomProfileElement.FILE;
    }

    public boolean isLocal() {
        return getFileRepository().isLocal();
    }

    public void setLocal(boolean z) {
        getFileRepository().setLocal(z);
    }

    public final FileRepository getFileRepository() {
        return (FileRepository) getRepository();
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver
    public String getDestination(String str, Artifact artifact, ModuleRevisionId moduleRevisionId) {
        if (supportTransaction() && isTransactionStarted()) {
            String str2 = this.fullTransactionPatterns.get(str);
            if (str2 == null) {
                throw new IllegalArgumentException("unsupported pattern for publish destination pattern: " + str + ". supported patterns: " + this.fullTransactionPatterns.keySet());
            }
            return IvyPatternHelper.substitute(str2, moduleRevisionId, artifact);
        }
        return super.getDestination(str, artifact, moduleRevisionId);
    }

    public final boolean isTransactionStarted() {
        return this.transactionTempDir != null;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void abortPublishTransaction() throws IOException {
        if (supportTransaction()) {
            if (isTransactionStarted()) {
                try {
                    getFileRepository().delete(this.transactionTempDir);
                    Message.info("\tpublish aborted: deleted " + this.transactionTempDir);
                    return;
                } finally {
                    closeTransaction();
                }
            }
            Message.info("\tpublish aborted: nothing was started");
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void commitPublishTransaction() throws IOException {
        String str;
        if (supportTransaction()) {
            if (!isTransactionStarted()) {
                throw new IllegalStateException("no current transaction!");
            }
            if (this.transactionDestDir.exists()) {
                throw new IOException("impossible to commit transaction: transaction destination directory already exists: " + this.transactionDestDir + "\npossible cause: usage of identifying tokens after the revision token");
            }
            try {
                try {
                    getFileRepository().move(this.transactionTempDir, this.transactionDestDir);
                    Message.info("\tpublish committed: moved " + this.transactionTempDir + " \n\t\tto " + this.transactionDestDir);
                } catch (IOException e) {
                    try {
                        getFileRepository().delete(this.transactionTempDir);
                        str = "publish transaction commit error for " + this.transactionDestDir + ": rolled back";
                    } catch (IOException unused) {
                        str = "publish transaction commit error for " + this.transactionDestDir + ": rollback impossible either, please remove " + this.transactionTempDir + " manually";
                    }
                    throw new IOException(str, e);
                }
            } finally {
                closeTransaction();
            }
        }
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.plugins.resolver.DependencyResolver
    public void beginPublishTransaction(ModuleRevisionId moduleRevisionId, boolean z) throws IOException {
        if (supportTransaction()) {
            if (isTransactionStarted()) {
                throw new IllegalStateException("a transaction is already started and not closed!");
            }
            if (z) {
                unsupportedTransaction("overwrite transaction not supported yet");
                return;
            }
            initTransaction(moduleRevisionId);
            if (this.transactionDestDir.exists()) {
                unsupportedTransaction("transaction destination directory already exists: " + this.transactionDestDir + "\npossible cause: usage of identifying tokens after the revision token");
                closeTransaction();
                return;
            }
            Message.verbose("\tstarting transaction: publish during transaction will be done in \n\t\t" + this.transactionTempDir + "\n\tand on commit moved to \n\t\t" + this.transactionDestDir);
        }
    }

    @Override // org.apache.ivy.plugins.resolver.BasicResolver
    public Collection<String> filterNames(Collection<String> collection) {
        if (supportTransaction()) {
            Collection<String> collectionFilterNames = super.filterNames(collection);
            Iterator<String> it = collectionFilterNames.iterator();
            while (it.hasNext()) {
                if (it.next().endsWith(TRANSACTION_DESTINATION_SUFFIX)) {
                    it.remove();
                }
            }
            return collectionFilterNames;
        }
        return super.filterNames(collection);
    }

    public boolean supportTransaction() {
        if ("false".equals(this.transactional)) {
            return false;
        }
        checkSupportTransaction();
        return this.supportTransaction.booleanValue();
    }

    public final void closeTransaction() {
        this.transactionTempDir = null;
        this.transactionDestDir = null;
    }

    public final void checkSupportTransaction() {
        if (this.supportTransaction == null) {
            this.supportTransaction = Boolean.FALSE;
            List<String> ivyPatterns = getIvyPatterns();
            List<String> artifactPatterns = getArtifactPatterns();
            if (ivyPatterns.size() > 0) {
                String str = ivyPatterns.get(0);
                Matcher matcher = TRANSACTION_PATTERN.matcher(str);
                if (!matcher.matches()) {
                    unsupportedTransaction("ivy pattern does not use revision as a directory");
                    return;
                }
                this.baseTransactionPattern = matcher.group(1);
                this.fullTransactionPatterns.put(str, matcher.group(1) + TRANSACTION_DESTINATION_SUFFIX + matcher.group(2));
            }
            if (artifactPatterns.size() > 0) {
                String str2 = artifactPatterns.get(0);
                Matcher matcher2 = TRANSACTION_PATTERN.matcher(str2);
                if (!matcher2.matches()) {
                    unsupportedTransaction("artifact pattern does not use revision as a directory");
                    return;
                }
                String str3 = this.baseTransactionPattern;
                if (str3 != null) {
                    if (!str3.equals(matcher2.group(1))) {
                        unsupportedTransaction("ivy pattern and artifact pattern do not use the same directory for revision");
                        return;
                    }
                    this.fullTransactionPatterns.put(str2, matcher2.group(1) + TRANSACTION_DESTINATION_SUFFIX + matcher2.group(2));
                } else {
                    this.baseTransactionPattern = matcher2.group(1);
                    this.fullTransactionPatterns.put(str2, matcher2.group(1) + TRANSACTION_DESTINATION_SUFFIX + matcher2.group(2));
                }
            }
            this.supportTransaction = Boolean.TRUE;
        }
    }

    public final void unsupportedTransaction(String str) {
        String str2 = getName() + " do not support transaction. " + str;
        if ("true".equals(this.transactional)) {
            throw new IllegalStateException(str2 + ". Set transactional attribute to 'auto' or 'false' or fix the problem.");
        }
        Message.verbose(str2);
        this.supportTransaction = Boolean.FALSE;
    }

    public final void initTransaction(ModuleRevisionId moduleRevisionId) {
        if (isM2compatible()) {
            moduleRevisionId = convertM2IdForResourceSearch(moduleRevisionId);
        }
        this.transactionTempDir = Checks.checkAbsolute(IvyPatternHelper.substitute(this.baseTransactionPattern, ModuleRevisionId.newInstance(moduleRevisionId, moduleRevisionId.getRevision() + TRANSACTION_DESTINATION_SUFFIX)), "baseTransactionPattern");
        this.transactionDestDir = Checks.checkAbsolute(IvyPatternHelper.substitute(this.baseTransactionPattern, moduleRevisionId), "baseTransactionPattern");
    }

    public String getTransactional() {
        return this.transactional;
    }

    public void setTransactional(String str) {
        this.transactional = str;
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public void addConfiguredIvy(IvyPattern ivyPattern) {
        ivyPattern.setPattern(Checks.checkAbsolute(ivyPattern.getPattern(), "ivy pattern").getAbsolutePath());
        super.addConfiguredIvy(ivyPattern);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public void addIvyPattern(String str) {
        super.addIvyPattern(Checks.checkAbsolute(str, "ivy pattern").getAbsolutePath());
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public void addConfiguredArtifact(IvyPattern ivyPattern) {
        ivyPattern.setPattern(Checks.checkAbsolute(ivyPattern.getPattern(), "artifact pattern").getAbsolutePath());
        super.addConfiguredArtifact(ivyPattern);
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractPatternsBasedResolver
    public void addArtifactPattern(String str) {
        super.addArtifactPattern(Checks.checkAbsolute(str, "artifact pattern").getAbsolutePath());
    }
}
