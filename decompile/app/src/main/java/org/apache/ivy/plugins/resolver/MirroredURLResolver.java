package org.apache.ivy.plugins.resolver;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.apache.ivy.core.cache.CacheResourceOptions;
import org.apache.ivy.osgi.repo.RelativeURLRepository;
import org.apache.ivy.plugins.repository.url.ChainedRepository;
import org.apache.ivy.plugins.repository.url.URLRepository;
import org.apache.ivy.plugins.repository.url.URLResource;
import org.apache.ivy.util.Message;

/* loaded from: classes7.dex */
public class MirroredURLResolver extends RepositoryResolver {
    public URL mirrorListUrl;

    public MirroredURLResolver() {
        setRepository(new ChainedRepository());
    }

    public void setMirrorListUrl(URL url) {
        this.mirrorListUrl = url;
    }

    public final void setupMirrors() {
        URL url;
        try {
            List<String> mirrorList = readMirrorList(downloadMirrorList());
            ArrayList arrayList = new ArrayList();
            for (String str : mirrorList) {
                try {
                    url = new URL(str);
                } catch (MalformedURLException unused) {
                    Message.warn("In the mirror list from " + this.mirrorListUrl + ", an incorrect url has been found and will then not be used: " + str);
                    url = null;
                }
                if (url != null) {
                    arrayList.add(new RelativeURLRepository(url, getTimeoutConstraint()));
                }
            }
            ((ChainedRepository) getRepository()).setRepositories(arrayList);
        } catch (IOException e) {
            throw new IllegalStateException("The mirror list could not be read from " + this.mirrorListUrl + " (" + e.getMessage() + ")");
        }
    }

    public final File downloadMirrorList() {
        URLRepository uRLRepository = new URLRepository(getTimeoutConstraint());
        if (getEventManager() != null) {
            uRLRepository.addTransferListener(getEventManager());
        }
        return getRepositoryCacheManager().downloadRepositoryResource(new URLResource(this.mirrorListUrl, getTimeoutConstraint()), "mirrorlist", "text", "txt", new CacheResourceOptions(), uRLRepository).getLocalFile();
    }

    public final List<String> readMirrorList(File file) throws IOException {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                arrayList.add(line);
            }
            bufferedReader.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // org.apache.ivy.plugins.resolver.RepositoryResolver, org.apache.ivy.plugins.resolver.AbstractResolver
    public String getTypeName() {
        return "mirroredurl";
    }

    @Override // org.apache.ivy.plugins.resolver.AbstractResolver, org.apache.ivy.core.settings.Validatable
    public void validate() {
        super.validate();
        setupMirrors();
    }
}
